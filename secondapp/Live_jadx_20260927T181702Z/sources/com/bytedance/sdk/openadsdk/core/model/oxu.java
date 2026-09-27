package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.rpd;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class oxu {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private long f36418hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private long f36419hv;
    public boolean hww;
    private long nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private long f36420ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private long f36421rs;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public long f36423tq;
    private long vgm;
    private int vhb;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private rpd f36422sd = rpd.sd();
    private rpd vy = rpd.sd();

    public long hu() {
        return this.f36421rs;
    }

    public long hv() {
        return this.f36420ok;
    }

    public void hww(rpd rpdVar, rpd rpdVar2, int i10, rpd rpdVar3) {
        this.f36419hv = rpdVar.hww(this.f36422sd);
        this.f36418hu = rpdVar2.hww(rpdVar);
        this.vgm = i10;
        this.f36420ok = rpdVar3.hww(rpdVar2);
    }

    public int ok() {
        return this.vhb;
    }

    public long sd() {
        return this.f36418hu;
    }

    public void tq(rpd rpdVar) {
        this.vy = rpdVar;
        this.f36421rs = rpdVar.hww(this.f36422sd);
    }

    public long vgm() {
        return this.nod;
    }

    public long vy() {
        return this.vgm;
    }

    public long tq() {
        return this.f36419hv;
    }

    public void hww(rpd rpdVar) {
        this.f36422sd = rpdVar;
    }

    public rpd hww() {
        return this.f36422sd;
    }

    public void hww(long j10) {
        this.nod = j10;
    }

    public void hww(int i10) {
        this.vhb = i10;
    }
}
