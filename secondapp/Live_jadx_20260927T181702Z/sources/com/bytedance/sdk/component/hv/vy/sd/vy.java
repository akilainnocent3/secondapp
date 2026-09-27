package com.bytedance.sdk.component.hv.vy.sd;

import com.bytedance.sdk.component.hv.vhb;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy<T> implements vhb {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34839hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34840hv;
    private String hww;
    private com.bytedance.sdk.component.hv.vgm nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f34841ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private boolean f34842rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private T f34843sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34844tq;
    private Map<String, String> vgm;
    private int vhb;
    private T vy;

    @Override // com.bytedance.sdk.component.hv.vhb
    public boolean hu() {
        return this.f34842rs;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public boolean hv() {
        return this.f34841ok;
    }

    public vy hww(sd sdVar, T t10) {
        this.f34843sd = t10;
        this.hww = sdVar.nod();
        this.f34844tq = sdVar.hww();
        this.f34840hv = sdVar.tq();
        this.f34839hu = sdVar.sd();
        this.f34842rs = sdVar.ed();
        this.nod = sdVar.weu();
        this.vhb = sdVar.wgt();
        return this;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public T sd() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public T tq() {
        return this.f34843sd;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public int vgm() {
        return this.vhb;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public Map<String, String> vy() {
        return this.vgm;
    }

    public vy hww(sd sdVar, T t10, Map<String, String> map, boolean z10) {
        this.vgm = map;
        this.f34841ok = z10;
        return hww(sdVar, t10);
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public String hww() {
        return this.f34844tq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.hv.vhb
    public void hww(Object obj) {
        this.vy = this.f34843sd;
        this.f34843sd = obj;
    }
}
