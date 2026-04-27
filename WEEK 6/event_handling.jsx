import React from "react";

function EventExample() {

  function handleClick() {
    alert("Button clicked");
  }

  return (
    <div>
      <h2>Simple Event Handling Example</h2>
      <button onClick={handleClick}>Click Me</button>
    </div>
  );
}

export default EventExample;
