package com.project.fsociety.registrationhelper;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SaveUserDetails {
    SaveUserDetails(FirebaseUser user) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference();

        UserDetails userDetails = new UserDetails(user.getEmail(), user.getDisplayName());

        databaseReference.child(user.getUid()).setValue(userDetails);
    }
}
