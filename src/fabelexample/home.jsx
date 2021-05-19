import { React, ReactDOM, useEffect, useState } from "react.mjs";

function Home() {

  const [count, setCount] = useState(0);

  return (
    <div>
      <div>Hello world in a component.</div>
      <div>You clicked {count} times.</div>
      <button onClick={() => setCount(count + 1)}>Click me.</button>
    </div>
  );
}

ReactDOM.render(<Home />, document.querySelector("[home-app]"));