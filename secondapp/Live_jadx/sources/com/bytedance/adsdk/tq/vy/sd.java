package com.bytedance.adsdk.tq.vy;

import s7.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public enum sd {
    JSON(".json"),
    ZIP(d.f129681l);


    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public final String f32356sd;

    sd(String str) {
        this.f32356sd = str;
    }

    public String hww() {
        return ".temp" + this.f32356sd;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f32356sd;
    }
}
