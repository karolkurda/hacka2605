import React, { useState } from 'react';
import axios from 'axios';

import './App.css';

const Nav = () => {
  return (
    <nav className="wrapper">
      <button className="burger-icon"><i className="fas fa-bars"></i></button>
      <div className="nav-items">
        <a href="#"></a>
      </div>
    </nav>
  );
};

const Header = () => {
  return (
    <header className="hdr">
      <div className="img-big"></div>
      <div className="img-txt">
        <h1>J-<span>Sok</span></h1>
        <p>Jednolity System Obsługi Konfidentów</p>
      </div>
    </header>
  );
};

const Main = () => {
  const [expandedOption, setExpandedOption] = useState(null);
  const [message, setMessage] = useState('');
  const [inputValue1, setInputValue1] = useState('');
  const [inputValue2, setInputValue2] = useState('');
  const [inputValue3, setInputValue3] = useState('');

  const handleOptionClick = (option) => {
    if (expandedOption === option) {
      setExpandedOption(null);
      sendMessage();
    } else {
      setExpandedOption(option);
      setMessage('');
    }
  };

  const handleInputChange1 = (event) => {
    setInputValue1(event.target.value);
  };

  const handleInputChange2 = (event) => {
    setInputValue2(event.target.value);
  };

  const handleInputChange3 = (event) => {
    setInputValue3(event.target.value);
  };

//  const sendMessage = () => {
//    // Wyślij żądanie HTTP POST z wartościami inputValue1, inputValue2 i inputValue3
//    // Tutaj można użyć biblioteki axios lub wbudowanych funkcji przeglądarki, takich jak fetch
//
//    // Przykład użycia biblioteki axios:
//    axios.post('localhost:8080/SOS/ticket', {
//      value1: inputValue1,
//      value2: inputValue2,
//      value3: inputValue3
//    })
//    .then(response => {
//      setMessage('Wysłano zgłoszenie!');
//    })
//    .catch(error => {
//      console.error(error);
//    });
//  };
    const sendMessage = async () => {
      try {
        const params = new URLSearchParams();
        params.append('message', inputValue1);
        params.append('type', inputValue2);
        params.append('Destination', inputValue3);


        const response = await axios.post('http://localhost:8080/SOS/ticket', params);
        setMessage('Wysłano zgłoszenie!');
        // Handle the response data if needed
        console.log(response.data);
      } catch (error) {
        console.error(error);
      }
    };


  return (
    <main>
      <div className="button-row">
        <button onClick={() => handleOptionClick('policja')}>Policja</button>
        <button onClick={() => handleOptionClick('straż')}>Straż</button>
        <button onClick={() => handleOptionClick('pogotowie')}>Pogotowie</button>
        <button onClick={() => handleOptionClick('ogólny')}>Ogólny</button>
      </div>

      {expandedOption && (
        <div className="button-row">
          <div className="input-wrapper">
            <input
              type="text"
              placeholder="Wpisz wiadomość 1"
              value={inputValue1}
              onChange={handleInputChange1}
            />
          </div>
          <div className="input-wrapper">
            <input
              type="text"
              placeholder="Wpisz wiadomość 2"
              value={inputValue2}
              onChange={handleInputChange2}
            />
          </div>
          <div className="input-wrapper">
            <input
              type="text"
              placeholder="Wpisz wiadomość 3"
              value={inputValue3}
              onChange={handleInputChange3}
            />
          </div>
          <button onClick={sendMessage}>Wyślij</button>
        </div>
      )}

      {message && (
        <div>
          <p>{message}</p>
        </div>
      )}
    </main>
  );
};

const Footer = () => {
  return (
    <footer>
      <p>&copy; 2023 Telekoxy</p>
    </footer>
  );
};

const App = () => {
  return (
    <div>
      <Nav />
      <Header />
      <Main />
      <Footer />
    </div>
  );
};

export default App;
