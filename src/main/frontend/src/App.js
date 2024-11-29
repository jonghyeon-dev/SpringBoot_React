
import React from 'react';
import Home from './routes/Home';
import List from './routes/List';
import User from './routes/User';
import {
  BrowserRouter as Router,
  Routes,
  Route,
} from "react-router-dom";

function App() {
  return (
    <Router>
      <Routes basename={process.env.PUBLIC_URL}>
      <Route path={process.env.PUBLIC_URL+"/"} element={<Home />} />
      <Route path={process.env.PUBLIC_URL+"/List"} element={<List/>}/>
      <Route path={process.env.PUBLIC_URL+"/User"} element={<User/>}/>
    </Routes>
    </Router>
  );
}

export default App;
