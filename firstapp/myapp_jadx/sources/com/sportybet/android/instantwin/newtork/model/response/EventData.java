package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EventData {

    @SerializedName("events")
    public List<Event> events;

    @SerializedName("openBetsCount")
    public int openBetsCount;

    @SerializedName("roundId")
    public String roundId;

    @SerializedName("roundNumber")
    public long roundNumber;

    public EventData(String str, long j, int i, List<Event> list) {
        this.roundId = str;
        this.roundNumber = j;
        this.openBetsCount = i;
        this.events = list;
    }
}
