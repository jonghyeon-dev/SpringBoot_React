import {Link} from "react-router-dom";
// import 'bootstrap/dist/css/bootstrap.min.css';
import '../App.css';


function List() {
    return (
      <div className="App">
        <header className="App-header">
          <h1>List</h1>
          <ul>
            <li>1</li>
            <li>2</li>
            <li>3</li>
            <li>4</li>
          </ul>
          <Link to={`${process.env.PUBLIC_URL}/User`}>사용자</Link>
          <Link to={`${process.env.PUBLIC_URL}/`}>뒤로가기</Link>
        </header>
      </div>
    );
  }

  export default List;