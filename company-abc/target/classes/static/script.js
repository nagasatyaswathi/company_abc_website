document.addEventListener('DOMContentLoaded', () => {
    fetch('/api/heading')
      .then(response => response.json())
      .then(data => {
        document.getElementById('dynamic-heading').innerText = data.headingText;
      });
  });
  