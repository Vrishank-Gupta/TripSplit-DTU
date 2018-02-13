package com.vrishankgupta.chatting;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by aryam on 2/12/2018.
 */

public class Split {
    private FirebaseUsers user;
    private Float owedAmount;
    private Float payedAmount;

    public Split(FirebaseUsers user, Float owedAmount, Float payedAmount) {
        this.user = user;
        this.owedAmount = owedAmount;
        this.payedAmount = payedAmount;
            }

    public Float getOwedAmount() {
        return owedAmount;
    }

    public void setOwedAmount(Float owedAmount) {
        this.owedAmount = owedAmount;
    }


    public FirebaseUsers getUser() {

        return user;
    }

    public void setUser(FirebaseUsers user) {
        this.user = user;
    }

    public Float getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(Float payedAmount) {
        this.payedAmount = payedAmount;
    }
}
