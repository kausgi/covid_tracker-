package com.example.cv_tracker.models;
//
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationStats {
    private String state;
    private String country;
    private int latest_total_cases;
    private int diff_from_prev_day;
    private int total_new_cases;
}
