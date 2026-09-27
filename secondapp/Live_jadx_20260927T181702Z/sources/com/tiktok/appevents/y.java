package com.tiktok.appevents;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class y implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f76169c = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<c> f76170b = new ArrayList();

    public void a(List<c> appEventList) {
        if (appEventList == null || appEventList.isEmpty()) {
            return;
        }
        this.f76170b.addAll(appEventList);
    }

    public List<c> d() {
        return this.f76170b;
    }

    public boolean g() {
        return this.f76170b.isEmpty();
    }

    public void h(List<c> appEvents) {
        this.f76170b = appEvents;
    }

    public String toString() {
        return "TTAppEventPersist{appEvents=" + this.f76170b + fw.b.f85383j;
    }
}
