import logo from "./logo.svg";
import "./App.css";
import { Route, Routes } from "react-router-dom";
import Main from "./pages/Main/Main";

function App() {
	return
    <>
      <Routes>
        <Route path="/" element={<Main/>} />
        <Route path="/list" element={<List />} />
        <Route path="/modification" element={<Modification />} />
        <Route path="/register" element={< />} />
        <Route path="/remove" element={< />}  />
      </Routes>
    </>;
}

export default App;
