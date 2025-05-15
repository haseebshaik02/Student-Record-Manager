const form = document.getElementById("studentForm");
const table = document.getElementById("studentTable");

form.addEventListener("submit", function (e) {
  e.preventDefault();
  const name = document.getElementById("name").value;
  const roll = document.getElementById("roll").value;

  const newRow = table.insertRow();
  newRow.innerHTML = `<td>${name}</td><td>${roll}</td>`;

  form.reset();
});
