package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes6.dex */
public class LiveEventChange {
    public boolean add;
    public int currentCount;
    public Event event;

    public LiveEventChange(Event event, boolean z, int i) {
        this.event = event;
        this.add = z;
        this.currentCount = i;
    }
}
