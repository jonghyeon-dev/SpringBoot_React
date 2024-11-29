
import React from 'react';
import Home from './routes/Home';
import List from './routes/List';
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
    </Routes>
    </Router>
  );
}

export default App;
