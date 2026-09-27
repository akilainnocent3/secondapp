package com.bytedance.sdk.component.sd.hww;

import android.os.SystemClock;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    long f35010hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    long f35011hv;
    long hww = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    long f35012ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    long f35013sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    long f35014tq;
    long vgm;
    long vy;

    public void ed() {
        this.f35012ok = SystemClock.elapsedRealtime();
    }

    public long hu() {
        return this.f35010hu;
    }

    public void hv() {
        this.f35010hu = SystemClock.elapsedRealtime();
    }

    public void hww() {
        this.f35013sd = SystemClock.elapsedRealtime();
    }

    public long khx() {
        return this.f35014tq;
    }

    public long nod() {
        return this.vgm;
    }

    public long ny() {
        return this.f35012ok;
    }

    public long ok() {
        return this.vy;
    }

    public long rs() {
        return this.f35011hv;
    }

    public void sd() {
        this.f35011hv = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.hww + ", asyncCallExecTs=" + this.f35014tq + ", requestStartExecTs=" + this.f35013sd + ", requestConnectStartTs=" + this.vy + ", requestConnectFinishTs=" + this.f35011hv + ", reqCallServerStartTs=" + this.vgm + ", reqCallServerFinishTs=" + this.f35012ok + b.f85383j;
    }

    public void tq() {
        this.vy = SystemClock.elapsedRealtime();
    }

    public long vgm() {
        return this.f35013sd;
    }

    public void vhb() {
        this.vgm = SystemClock.elapsedRealtime();
    }

    public long vy() {
        return this.hww;
    }

    public void weu() {
        this.f35014tq = SystemClock.elapsedRealtime();
    }
}
