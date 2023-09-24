package com.Geekster.Job_Search_portal.Service;

import com.Geekster.Job_Search_portal.Model.Job;
import com.Geekster.Job_Search_portal.Model.JobType;
import com.Geekster.Job_Search_portal.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepo jobRepo;

    @Autowired
    public JobService(JobRepo jobRepo){
        this.jobRepo=jobRepo;
    }

    public String CreateJob(Job job){
        Job savedjob=jobRepo.save(job);
        return "Job created with Id: "+savedjob.getId();
    }

    public String GetJobById(Long id){
        Optional<Job> jobOptional=jobRepo.findById(id);
        return jobOptional.map(job -> "job found: "+job.toString()).orElse("Job not found");
    }

    public String UpdateJob(Long id,Job job){
        Optional<Job> existingjobOptional=jobRepo.findById(id);
        if(existingjobOptional.isPresent()){
             Job existingJob= existingjobOptional.get();
             existingJob.setTitle(job.getTitle());
             existingJob.setDescription(job.getDescription());
             existingJob.setLocation(job.getLocation());
             existingJob.setSalary(job.getSalary());
             existingJob.setCompanyEmail(job.getCompanyEmail());
             existingJob.setCompanyName(job.getCompanyName());
             existingJob.setEmployerName(job.getEmployerName());
             existingJob.setJobType(job.getJobType());
             existingJob.setAppliedDate(job.getAppliedDate());
             jobRepo.save(existingJob);
             return "Job updated with Id: "+existingJob.getId();
        }
        else {
             return "Job not found";
        }
    }

    public String Deletejob(Long id){
        jobRepo.deleteById(id);
        return "Job by id: "+id+" is deleted";
    }

    public String SearchJobsByTitleAndDescription(String title,String description ){
        List<Job> jobs=jobRepo.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(title,description);
        return "Search result: "+jobs.toString();
    }

    public String SearchJobByTitle(String title){
        List<Job> jobs=jobRepo.findByTitleContainingIgnoreCase(title);
        return  "Serach result: "+jobs.toString();
    }

    public String SerchJobByDescription(String description){
        List<Job> jobs=jobRepo.findByDescriptionContainingIgnoreCase(description);
        return "Search result: "+jobs.toString();
    }

    public String SearchJobBySalaryAbove(double salary){
        List<Job> jobs=jobRepo.findJobsWithSalaryAbove(salary);
        return "Search result: "+jobs.toString();
    }

    public String SearchjobByCompanyName(String CompanyName){
        List<Job> jobs=jobRepo.findJobsByCompanyName(CompanyName);
        return "Search result: "+jobs.toString();
    }

    public String SearchJobByEmpolyerName(String EmployerName){
        List<Job> jobs=jobRepo.findJobsByEmployerName(EmployerName);
        return "Search result: "+jobs.toString();
    }

    public String SearchJobByType(JobType jobType){
        List<Job> jobs=jobRepo.findByJobType(jobType);
        return "Search result: "+jobs.toString();
    }

    public String SearchJobByLocation(String Location){
        List<Job> jobs=jobRepo.findJobsByLocation(Location);
        return "Search result: "+jobs.toString();
    }
}
