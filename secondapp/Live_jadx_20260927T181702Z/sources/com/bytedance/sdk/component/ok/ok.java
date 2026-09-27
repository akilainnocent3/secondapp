package com.bytedance.sdk.component.ok;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ok implements Comparable<ok>, Runnable {
    private int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34927tq;

    public ok(String str, int i10) {
        this.hww = 0;
        this.hww = i10 == 0 ? 5 : i10;
        this.f34927tq = str;
    }

    public String getName() {
        return this.f34927tq;
    }

    public int getPriority() {
        return this.hww;
    }

    public void setPriority(int i10) {
        this.hww = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(ok okVar) {
        if (getPriority() < okVar.getPriority()) {
            return 1;
        }
        return getPriority() >= okVar.getPriority() ? -1 : 0;
    }

    public ok(String str) {
        this.hww = 5;
        this.f34927tq = str;
    }
}
