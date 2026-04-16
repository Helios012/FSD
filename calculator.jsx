import React from "react";

class Calculator extends React.Component {
  constructor() {
    super();
    this.state = {
      a: "",
      b: "",
      res: 0
    };
  }

  handle = (e) => {
    this.setState({ [e.target.name]: e.target.value });
  };

  add = () => this.setState({ res: Number(this.state.a) + Number(this.state.b) });
  sub = () => this.setState({ res: this.state.a - this.state.b });
  mul = () => this.setState({ res: this.state.a * this.state.b });
  div = () => this.setState({ res: this.state.a / this.state.b });

  render() {
    return (
      <div>
        <h2>Calculator</h2>

        <input name="a" onChange={this.handle} placeholder="A" />
        <input name="b" onChange={this.handle} placeholder="B" />

        <br /><br />

        <button onClick={this.add}>+</button>
        <button onClick={this.sub}>-</button>
        <button onClick={this.mul}>*</button>
        <button onClick={this.div}>/</button>

        <h3>Result: {this.state.res}</h3>
      </div>
    );
  }
}

export default Calculator;
