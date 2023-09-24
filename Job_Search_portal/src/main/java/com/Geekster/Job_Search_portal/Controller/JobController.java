package com.Geekster.Job_Search_portal.Controller;

import com.Geekster.Job_Search_portal.Model.Job;
import com.Geekster.Job_Search_portal.Model.JobType;
import com.Geekster.Job_Search_portal.Service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobController {

    JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public String CreateJob(@Valid @RequestBody Job job){
        return jobService.CreateJob(job);
    }

    @GetMapping("/{id}")
    public String GetJobById(@PathVariable Long id){
        return jobService.GetJobById(id);
    }

    @PutMapping("/{id}")
    public String UpdateJob(@PathVariable Long id,@Valid @RequestBody Job job){
        return jobService.UpdateJob(id, job);
    }

    @DeleteMapping("/{id}")
    public String DeleteJob(@PathVariable Long id){
        return jobService.Deletejob(id);
    }

    @GetMapping("/Search")
    public String SearchJobs(@RequestParam(required = false) String title,@RequestParam(required = false) String description){
        if (title != null&&description!=null) {
            return jobService.SearchJobsByTitleAndDescription(title, description);
        } else if (title!=null) {
            return jobService.SearchJobByTitle(title);
        } else if (description!=null) {
            return jobService.SerchJobByDescription(description);
        }else {
            return "Invalid Search criteria";
        }
    }

    @GetMapping("/Search/Salary")
    public String SearchJobBySalaryAbove(@RequestParam Double salary){
        return jobService.SearchJobBySalaryAbove(salary);
    }

    @GetMapping("/Search/CompanyName")
    public String SearchJobByCompanyName(@RequestParam String CompanyName){
        return jobService.SearchjobByCompanyName(CompanyName);
    }
    @GetMapping("/Search/EmployerName")
    public String SearchJobByEmployerName(@RequestParam String EmployerName){
        return jobService.SearchJobByEmpolyerName(EmployerName);
    }
    @GetMapping("/Search/JobType")
    public String SearchJobByType(@RequestParam JobType jobType){
        return jobService.SearchJobByType(jobType);
    }
    @GetMapping("/Search/Location")
    public String SearchJobByLocation(@RequestParam String Location){
        return jobService.SearchJobByLocation(Location);
    }
}
