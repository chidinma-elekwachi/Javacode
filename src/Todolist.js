import React from "react";
import './Style/Todolist.css';

// https://github.com/chidinma-elekwachi/giggle.git
function Todolist({items, onAddItem}) {
    let input;

    const handleAddClick = () => {
        // trim remove whitespaces around
        if (input.value.trim()) {
            onAddItem(input.value);
            input.value = '';
        }
    };

    return(
        <>
            <h2>Todo List</h2>
            <ul>
                {items.map((items,index) => (
                        <li key={index}>{items}</li>
                    ))}
            </ul>
            <input type="text" ref={(node) => (input = node)} />
            <button onClick={handleAddClick}>+</button>
        </>
    )
}

export default Todolist;