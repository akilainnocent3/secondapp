package com.bytedance.sdk.component.hv.sd;

import com.bytedance.sdk.component.hv.vhb;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy<T> implements vhb {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f34753hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34754hv;
    private String hww;
    private com.bytedance.sdk.component.hv.vgm nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f34755ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private boolean f34756rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private T f34757sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f34758tq;
    private Map<String, String> vgm;
    private int vhb;
    private T vy;

    @Override // com.bytedance.sdk.component.hv.vhb
    public boolean hu() {
        return this.f34756rs;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public boolean hv() {
        return this.f34755ok;
    }

    public vy hww(sd sdVar, T t10) {
        this.f34757sd = t10;
        this.hww = sdVar.nod();
        this.f34758tq = sdVar.hww();
        this.f34754hv = sdVar.tq();
        this.f34753hu = sdVar.sd();
        this.f34756rs = sdVar.weu();
        this.nod = sdVar.wgt();
        this.vhb = sdVar.bs();
        return this;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public T sd() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public T tq() {
        return this.f34757sd;
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
        this.f34755ok = z10;
        return hww(sdVar, t10);
    }

    @Override // com.bytedance.sdk.component.hv.vhb
    public String hww() {
        return this.f34758tq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.hv.vhb
    public void hww(Object obj) {
        this.vy = this.f34757sd;
        this.f34757sd = obj;
    }
}
