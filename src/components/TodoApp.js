import React, { useState } from "react";
import Todolist from "./Todolist";
import ToDo from "./todo-list";


function TodoApp() {
    const [items, setItems] = useState(['Git Class', 'React Class']);

    const handleAddItem = (newItem) => {
        setItems([...items, newItem]);
    };
    
    return(
        <>
            <h1>Todo</h1>
            <Todolist items={items} onAddItem={handleAddItem} />
            <br></br>
            <ToDo items={items} onAddItem={handleAddItem} />
        </>
    )
}

export default TodoApp;