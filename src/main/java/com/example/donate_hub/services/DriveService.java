package com.example.donate_hub.services;

import com.example.donate_hub.models.Drive;
import com.example.donate_hub.repository.DriveRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriveService {

    private final DriveRepository driveRepository;

    public DriveService(DriveRepository driveRepository) {
        this.driveRepository = driveRepository;
    }

    public Drive createDrive(Drive drive) {
        return driveRepository.save(drive);
    }

    public List<Drive> getAllDrives() {
        return driveRepository.findAll();
    }

    public Optional<Drive> getDriveById(Long id) {
        return driveRepository.findById(id);
    }

    public void deleteDrive(Long id) {
        driveRepository.deleteById(id);
    }
}