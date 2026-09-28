package com.sporty.android.core.model.pocket.withdraw.tradeadditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class AdditionalType {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Code {
        public static final int AFBET_SMS = 1;
        public static final int AFBET_SMS_UPSTREAM = 2;
        public static final int BANK_GATEWAY = 7;
        public static final int BIRTHDAY = 6;
        public static final int BVN = 13;
        public static final int CHECK_HOLDING = 11;
        public static final int CONFIRM_NAME = 14;
        public static final int DIAL_OTP = 9;
        public static final int OTP = 4;
        public static final int PIN = 3;
        public static final int RESERVED_PHONE = 5;
        public static final int SECOND_OTP = 8;
        public static final int USSD = 12;
    }
}
