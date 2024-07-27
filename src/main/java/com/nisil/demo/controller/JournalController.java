package com.nisil.demo.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.nisil.demo.JournalEntry.JournalEntry;


@RestController
@RequestMapping("/journal")
public class JournalController {
    

    private Map<Integer,JournalEntry> journalEntry=new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAllEntries(){
        return new ArrayList<>(journalEntry.values());
    }


    @PostMapping
    public boolean addJournalEntries(@RequestBody JournalEntry entries){
        journalEntry.put(entries.getId(), entries);
        return true;
    }

    @DeleteMapping("/id/{myid}")
    public boolean deleteEntries(@PathVariable int myid){
        journalEntry.remove(myid);
        return true;
    }

    @PutMapping("/id/{myid}")
    public boolean updateEntries(@RequestBody JournalEntry entry,@PathVariable int myid){
        journalEntry.put(myid,entry);
        return true;
    }





}
