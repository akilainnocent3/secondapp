package com.bytedance.sdk.component.ok.sd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tq implements Comparable<tq>, Runnable {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long f34943hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f34944hv;
    private int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Runnable f34945sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34946tq;
    private long vy;

    public tq(String str) {
        this.hww = 5;
        this.f34946tq = str;
    }

    public Runnable hu() {
        return this.f34945sd;
    }

    public long hv() {
        return this.f34943hu;
    }

    public void hww(int i10) {
        this.hww = i10;
    }

    public long sd() {
        return this.vy;
    }

    public String tq() {
        return this.f34946tq;
    }

    public long vy() {
        return this.f34944hv;
    }

    public int hww() {
        return this.hww;
    }

    public void sd(long j10) {
        this.f34943hu = j10;
    }

    public void tq(long j10) {
        this.f34944hv = j10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(tq tqVar) {
        if (hww() < tqVar.hww()) {
            return 1;
        }
        return hww() >= tqVar.hww() ? -1 : 0;
    }

    public tq(int i10, String str) {
        this.hww = i10;
        this.f34946tq = str;
    }

    public void hww(long j10) {
        this.vy = j10;
    }

    public tq(String str, Runnable runnable) {
        this.hww = 5;
        this.f34946tq = str;
        this.f34945sd = runnable;
    }
}
