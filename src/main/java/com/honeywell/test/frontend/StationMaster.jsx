import React, { Component } from 'react';
import axios from 'axios';

class StationMaster extends Component {
  constructor() {
    super();
    this.state = {
      trainName: '',
      platformNumber: '',
      arrivalTime: '',
    };
  }

  handleInputChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  }

  handleSubmit = (event) => {
    event.preventDefault();
    axios.post('http://localhost:8080/api/addTrainDetails', this.state)
      .then((response) => {
        console.log('Form submitted successfully:', response.data);
      })
      .catch((error) => {
        console.error('Form submission error:', error);
      });

    this.setState({
      trainName: '',
      platformNumber: '',
      arrivalTime: '',
    });
  }

  render() {
    return (
      <div>
        <h2>Station Master</h2>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Train Name:</label>
            <input
              type="text"
              name="trainName"
              value={this.state.trainName}
              onChange={this.handleInputChange}
            />
          </div>
          <div>
            <label>Platform Number:</label>
            <input
              type="text"
              name="platformNumber"
              value={this.state.platformNumber}
              onChange={this.handleInputChange}
            />
          </div>
          <div>
            <label>Arrival Time:</label>
            <input
              type="text"
              name="arrivalTime"
              value={this.state.arrivalTime}
              onChange={this.handleInputChange}
            />
          </div>
          <div>
            <button type="submit">Submit</button>
          </div>
        </form>
      </div>
    );
  }
}

export default StationMaster;
