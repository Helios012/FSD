import React from "react";

class Vote extends React.Component {
  state = { a: 0, b: 0 };

  render() {
    return (
      <div>
        <h2>Voting System</h2>

        <button onClick={() => this.setState({ a: this.state.a + 1 })}>
          Vote A ({this.state.a})
        </button>

        <button onClick={() => this.setState({ b: this.state.b + 1 })}>
          Vote B ({this.state.b})
        </button>

        <br /><br />

        <button onClick={() => this.setState({ a: 0, b: 0 })}>
          Reset
        </button>
      </div>
    );
  }
}

export default Vote;
