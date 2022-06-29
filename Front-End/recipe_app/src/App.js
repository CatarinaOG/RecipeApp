
import { FcGoogle } from 'react-icons/fc';
import React from 'react'
import './App.css';

function App() {
  return (
    <div>
      
      <div className='LeftSide'>
          <div className='PositionText'>
            <div className='Title'>Welcome Back</div>
            <div className='Subtitle'>Welcome back! Please enter your details.</div><br/>

            <label className='Label'>Email</label><br/>
            <input className='Input' type="text" placeholder='Enter your email'></input><br/><br/>
            <label className='Label'>Password</label><br/>
            <input className='Input' type="password" placeholder='Enter your password'></input><br/>
            
            <input className='checkbox' type="checkbox"></input>
            <label className='Check'>Remember for 30 days</label>

            <label className='ForgotPass'>Forgot password</label><br/>
            
            <button className='BlackButton'>Sign In</button><br/>
            
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
