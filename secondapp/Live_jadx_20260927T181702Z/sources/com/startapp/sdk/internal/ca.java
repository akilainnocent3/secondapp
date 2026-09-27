package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ca implements re {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ca f74635b = new ca();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f74636a;

    public ca(Set languages) {
        kotlin.jvm.internal.m0.p(languages, "languages");
        this.f74636a = languages;
    }

    @Override // com.startapp.sdk.internal.re
    public final JSONArray a() {
        if (this.f74636a != null) {
            return new JSONArray((Collection) this.f74636a);
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.re
    public final String b() {
        Set set = this.f74636a;
        if (set == null) {
            return null;
        }
        WeakHashMap weakHashMap = si.f75514a;
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (Object obj : set) {
            if (z10) {
                sb2.append(";");
            }
            sb2.append(obj);
            z10 = true;
        }
        return sb2.toString();
    }

    public ca() {
        this.f74636a = null;
    }
}
