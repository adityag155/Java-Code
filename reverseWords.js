function reverseWords{
  
  let words = sentence.split(' ');

  for (let i = 0; i < words.length; i++) {
    words[i] = words[i].split('').reverse().join('');
  }

  return words.join(' ');
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsBruteForce(inputSentence);
console.log("Reversed Words:", reversedSentence);