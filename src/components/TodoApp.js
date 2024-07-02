import React, { useState } from "react";

import ToDo from "./todo-list";


function TodoApp() {
    const [items, setItems] = useState(['Git Class', 'React Class']);

    const handleAddItem = (newItem) => {
        setItems([...items, newItem]);
    };
    
    return(
        <>
            <h1>Todo</h1>
            <ToDo items={items} onAddItem={handleAddItem} />
        </>
    )
}

export default TodoApp;