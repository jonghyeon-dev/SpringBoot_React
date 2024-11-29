import { useState, useEffect } from "react";
import axios from 'axios';
import {Link} from "react-router-dom";
// import 'bootstrap/dist/css/bootstrap.min.css';
import logo from '../logo.svg';
import '../App.css';


function Home() {
    const  [loading,setLoading] = useState(true);
    const [first, setFirst] = useState([]);
    const [second, setSecond] = useState('');
    const getFirstApi = async()=>{
      await axios.get('/showMe').then((res)=>{
        console.log(res.data)
        setFirst(res.data);
      }).catch((err)=>{
        console.log(err);
      })
    }
    const getData = async()=>{
      await axios.get('/getData').then((res)=>{
        console.log(res.data);
        setSecond(res.data);
        setLoading(false);
      }).catch((err)=>{
        console.log(err);
      })
    }
  
    useEffect(()=>{
      getFirstApi();
      getData();
    },[]);
  
    return (
      <div className="App">
        <header className="App-header">
          <h1>Welcome React App</h1>
          { !loading ?
            (second.succeed === true ?
              <div className="container">
                <ul>
                  {first.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
                </ul>
                <span>ID:&nbsp;{second.data.id}</span><br/>
                <span>Name:&nbsp;{second.data.name}</span><br/>
                <span>message:&nbsp;{second.message}</span><br/>
              </div>:null

            ):
            <div>
              <span>Loading...</span>
            </div>
          }
          <br/><Link to={`${process.env.PUBLIC_URL}/List`}>리스트</Link>
        </header>
      </div>
    );
  }

  export default Home;