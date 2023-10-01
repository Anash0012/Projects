package com.geekster.Event_Management.Controller;
import com.geekster.Event_Management.Model.Event;
import com.geekster.Event_Management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public String addEvent(@Valid @RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @PutMapping("/{id}")
    public String updateEvent(@PathVariable Long id, @Valid @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public String deleteEvent(@PathVariable Long id) {
        return eventService.deleteEvent(id);
    }

}