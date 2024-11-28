import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import React, {useEffect,useState} from 'react';

function App() {
  const [first, setFirst] = useState([]);
  const [second, setSecond] = useState('');

  useEffect(()=>{
    axios.get('/showMe')
    .then((res)=>{
      console.log(res.data);
      setFirst(res.data);
    }).catch((err)=>{
      console.log(err);
    })
  },[]);

  useEffect(()=>{
    axios.get('/getData').then((res)=>{
      console.log(res.data);
      setSecond(res.data);
      console.log("출력");
      console.log(second.succeed);
    }).catch((err)=>{
      console.log(err);
    })
  },[])

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <ul>
        {first.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
        </ul>
        {second.succeed === true?<span>ID:&nbsp;{second.data.id}</span>:null}
        {second.succeed === true?<span>Name:&nbsp;{second.data.name}</span>:null}
        {second.succeed === true?<span>message:&nbsp;{second.message}</span>:null}
      </header>
    </div>
  );
}

export default App;
