import React, { useState } from 'react';
import { registerUser } from '../../api/users.js/users';

function Main(props) {
    const [ userInput, setUserInput ] = useState({
        userId:"",
        username:"",
        name:"",
        phone:""
    });

    const handleUserInputChange = (e) => {
        setUserInput({
            ...userInput,
            [e.target.name]: e.target.value
        });
    }

    const handleRegisterCode = () => {
        registerUser(userInput);
    }

    const handleUpdateCode = () => {

    }

    const handleDeleteCode = () => {

    }
    return (
        <div>
            <div><input type="text" name='userId' placeholder='userId' onChange={handleUserInputChange} /></div>
            <div><input type="text" name='username' placeholder='username' onChange={handleUserInputChange} /></div>
            <div><input type="text" name='name' placeholder='name' onChange={handleUserInputChange} /></div>
            <div><input type="text" name='phone' placeholder='phone' onChange={handleUserInputChange} /></div>
            <button onClick={handleRegisterCode}>추가하기</button>
            <button onClick={handleUpdateCode}>수정하기</button>
            <button onClick={handleDeleteCode}>삭제하기</button>
        </div>
    );
}

export default Main;