package com.sportybet.feature.facialrecognition.presentation;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import com.twilio.voice.EventGroupType;
import defpackage.q7h;
import defpackage.uhc;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final String a(q7h q7hVar) {
        switch (q7hVar.ordinal()) {
            case 0:
                return EventGroupType.REGISTRATION_EVENT_GROUP;
            case 1:
                return "seven_days_login";
            case 2:
                return "bank_account";
            case 3:
                return "password_reset";
            case 4:
                return "withdraw";
            case 5:
                return "self_exclusion";
            case 6:
                return dLRYz.ofXCkIySoAUPsoJ;
            default:
                uhc.a();
                return null;
        }
    }
}
