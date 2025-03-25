const item = document.querySelector("#item");
const addButton = document.querySelector("#add-btn");
const toDoBox = document.querySelector("#to-do-box");

// Function to add a new to-do
const addToDo = (text) => {
    if (text.trim() === "") return;

    const listItem = document.createElement("li");
    listItem.innerHTML = `
        ${text}
        <i class="fas fa-times"></i>
    `;

    // Mark as done on click
    listItem.addEventListener("click", function () {
        this.classList.toggle("done");
    });

    // Remove item on clicking the "X" icon
    listItem.querySelector("i").addEventListener("click", function () {
        listItem.remove();
    });

    toDoBox.appendChild(listItem);
};

// Event listener for Enter key
item.addEventListener("keyup", function (event) {
    if (event.key === "Enter") {
        addToDo(this.value);
        this.value = "";
    }
});

// Event listener for Add button
addButton.addEventListener("click", function () {
    addToDo(item.value);
    item.value = "";
});
