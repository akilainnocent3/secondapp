package com.bytedance.sdk.component.hv.tq;

import com.bytedance.sdk.component.hv.hu;
import com.bytedance.sdk.component.hv.vgm;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd<T> implements hu {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private vgm f34759hv;
    Map<String, String> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private T f34760sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34761tq;
    private String vy;

    public sd(int i10, T t10, String str) {
        this.f34761tq = i10;
        this.f34760sd = t10;
        this.vy = str;
    }

    @Override // com.bytedance.sdk.component.hv.hu
    public Map<String, String> hv() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.hv.hu
    public vgm hww() {
        return this.f34759hv;
    }

    @Override // com.bytedance.sdk.component.hv.hu
    public T sd() {
        return this.f34760sd;
    }

    @Override // com.bytedance.sdk.component.hv.hu
    public int tq() {
        return this.f34761tq;
    }

    @Override // com.bytedance.sdk.component.hv.hu
    public String vy() {
        return this.vy;
    }

    public void hww(vgm vgmVar) {
        this.f34759hv = vgmVar;
    }

    public sd(int i10, T t10, String str, Map<String, String> map) {
        this(i10, t10, str);
        this.hww = map;
    }
}
