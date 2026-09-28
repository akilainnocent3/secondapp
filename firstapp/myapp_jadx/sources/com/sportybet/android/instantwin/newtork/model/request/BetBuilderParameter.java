package com.sportybet.android.instantwin.newtork.model.request;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BetBuilderParameter {
    public String eventId;
    public String roundId;
    public List<BetBuilderRequest> selection;
    public String sportId;

    public BetBuilderParameter(String str, String str2, String str3, List<BetBuilderRequest> list) {
        this.sportId = str;
        this.roundId = str2;
        this.eventId = str3;
        this.selection = list;
    }
}
