import React, { Component } from 'react';

class Passengers extends Component {
  constructor() {
    super();
    this.state = {
      passengers: []
    };
  }

  componentDidMount() {
    fetch('http://localhost:8080/api/trainsList')
      .then((response) => response.json())
      .then((data) => this.setState({ passengers: data }));
  }

  render() {
    return (
      <div>
        <h2>Passengers</h2>
        <table>
          <thead>
            <tr>
              <th>Train Name</th>
              <th>Platform Number</th>
              <th>Arrival Time</th>
            </tr>
          </thead>
          <tbody>
            {this.state.passengers.map((passenger, index) => (
              <tr key={index}>
                <td>{passenger.trainName}</td>
                <td>{passenger.platformNumber}</td>
                <td>{passenger.arrivalTime}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default Passengers;