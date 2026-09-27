package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27158d;

    public h(int i10, int i11, int i12, int i13) {
        this.f27155a = i10;
        this.f27156b = i11;
        this.f27157c = i12;
        this.f27158d = i13;
    }

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public int b() {
        return this.f27157c;
    }

    public int c() {
        return this.f27156b;
    }

    public int d() {
        return this.f27155a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f27155a));
        map.put("air_num", Integer.valueOf(this.f27156b));
        map.put("fsr_num", Integer.valueOf(this.f27157c));
        map.put("fir_num", Integer.valueOf(this.f27158d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + gi.j.f86771d;
    }

    public int a() {
        return this.f27158d;
    }
}
