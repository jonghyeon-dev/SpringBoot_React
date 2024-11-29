import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // StrictMode 는 application 내의 잠재적 문제들을 파악하기 위해 자식 컴포넌트를 검사하고
  // 잘 못 사용된 부분을 우리에게 알려줌으로서 application에 잠재된 문제를 미리 해결할 수 있습니다.
  // console.log 2번 찍히는 것이 싫다면 StrictMode(엄격 모드) 주석 
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
