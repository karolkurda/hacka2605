import "./App.css";
import React, { useState, useEffect } from "react";
import axios from "axios";

function App() {
  const [ticketData, setTicketData] = useState(null);

  useEffect(() => {
    handleSummonerSearch();
  }, []);

  const handleSummonerSearch = async () => {
    try {
      const response = await axios.get("http://localhost:8080/SOS/all");
      setTicketData(response.data);
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div className="App">
      <div className="table-container">
        {ticketData && (
          <table>
            <thead>
              <tr>
                <th>ID</th>
                <th>Message</th>
                <th>Type</th>
                <th>Destination</th>
                <th>Prio</th>
              </tr>
            </thead>
            <tbody>
              {ticketData.map((ticket) => (
                <tr key={ticket.id}>
                  <td>{ticket.id}</td>
                  <td>{ticket.message}</td>
                  <td>{ticket.type}</td>
                  <td>{ticket.destination}</td>
                  <td>{ticket.prio}</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}
      </div>
    </div>
  );
}

export default App;
