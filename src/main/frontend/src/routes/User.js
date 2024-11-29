import { useState, useEffect } from "react";
import axios from 'axios';
import {Link} from "react-router-dom";
// import 'bootstrap/dist/css/bootstrap.min.css';
import '../App.css';


function User() {
  const [loading,setLoading] = useState(true);
  const [data, setData] = useState('');

  const getUser = async()=>{
    await axios.get('/getUser').then((res)=>{
      console.log(res.data);
      setData(res.data);
      console.log(data);
      setLoading(false);
    }).catch((err)=>{
      console.log(err);
    })
  }
  
  useEffect(()=>{
    getUser();
  },[]);

    return (
      <div className="App">
        <header className="App-header">
          <h1>List</h1>
          
            {loading?
              <div>
                <span>Loading...</span>
              </div>
              :
              <ul>
                <li><span>ID: </span>{data.userId}</li>
                <li><span>닉네임: </span>{data.userNm}</li>
                <li><span>휴대폰번호: </span>{data.celph}</li>
                <li><span>Email: </span>{data.email}</li>
              </ul>
            }
          
          <Link to={`${process.env.PUBLIC_URL}/List`}>뒤로가기</Link>
        </header>
      </div>
    );
  }

  export default User;