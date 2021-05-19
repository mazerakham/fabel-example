import { React, ReactDOM, useEffect, useState } from "ender-react.mjs";

function Home() {

  [count, setCount] = useState(0);
  return (
    <Home>
      <div>Hello world in a component.</div>
      <div>You clicked {count} times.</div>
      <button onClick={() => setCount(count + 1)}>Click me.</button>
    </Home>
  );
}

ReactDOM.render(<Home />, document.querySelector("[home-app]"));