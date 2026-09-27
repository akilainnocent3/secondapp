package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f45134d = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f45135a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f45136b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f45137c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.f45137c;
            }
            g gVar = (g) this.f45135a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f45135a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.f45137c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.f45136b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.f45136b.put(str, iVar);
        return iVar;
    }
}
