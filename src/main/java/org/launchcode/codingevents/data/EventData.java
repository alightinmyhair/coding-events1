package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    //everything will be static as we do not want to instantitize anything
    //need a place to put events
        // its static so it means there is only going to be one of these
        // using final adds additional security
    private static final Map<Integer, Event> events = new HashMap<>();


    //Behaviors/methods: get all events
        //we are returning everything so we dont need parameters
        //we are also using the interface Collection because it extends the iterable interface
        //which in turn means it has behaviours to loop or iterate over collections
    public static Collection<Event> getAll(){
        return events.values();
    }

    //get a single event
    public static Event getById(int id){
        return events.get(id);
    }

    //add an event
    //it takes a single parameter
    public static void add(Event event){
        events.put(event.getId(), event);
    }

    //remove an event
    public static void remove(int id){
        events.remove(id);
    }

}
