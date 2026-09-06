import "./App.css";

const words = ["시작", "주저", "용기", "학습"];

const randomIndex = Math.floor(Math.random() * words.length);
const word = words[randomIndex];

function App() {
  return (
    <main className="writing-page">
      <h1>{word}</h1>
      <textarea placeholder="떠오른 생각을 적어보세요." />
      <button>제출</button>
    </main>
  );
}

export default App;
