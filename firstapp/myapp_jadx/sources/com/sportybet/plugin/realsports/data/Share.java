package com.sportybet.plugin.realsports.data;

import com.sportybet.android.bookingcode.data.dto.UnavailableOutcome;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Share {
    public List<Event> outcomes;
    public String shareCode;
    public String shareURL;
    public List<UnavailableOutcome> unavailableOutcomes;

    public Share(String str, String str2) {
        this.shareCode = str;
        this.shareURL = str2;
    }
}
