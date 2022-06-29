
import { FcGoogle } from 'react-icons/fc';
import React, { useState } from 'react'
import './App.css';

function App() {

  const [user,setUser] = useState({username: '', password: ''});
  
  function handleUser(e){

    const name = e.target.name;
    const value = e.target.value;
    setUser({...user,[name]:value});

  }




  return (
    <div>
      
      <div className='LeftSide'> 
          <div className='PositionText'>
            <div className='Title'>Welcome Back</div>
            <div className='Subtitle'>Welcome back! Please enter your details.</div><br/>

            <label className='Label' >Username</label><br/>
            <input className='Input' type="text"      placeholder='Enter your username' name="username" onChange={handleUser}></input><br/><br/>
            <label className='Label' >Password</label><br/>
            <input className='Input' type="password"  placeholder='Enter your password' name="password" onChange={handleUser}></input><br/>
            
            <input className='checkbox' type="checkbox"></input>
            <label className='Check'>Remember for 30 days</label>

            <label className='ForgotPass'>Forgot password</label><br/>
            
            <button className='BlackButton' >Sign In</button><br/>
            
            <FcGoogle className='iconGoogle'/>
            <button className='GoogleButton'>Sign In With Google</button><br/>
            
            <label className='Last'>Dont't have an account?</label>
            <label className='SignUp'>Sign up for free</label>

          </div>
      </div>

      <div className='RightSide'>
          <img className='Capa' src="1.jpg" alt=""/>
      </div>
    </div>

  );
}

export default App;
