package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f44390a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer a(String str) {
        n nVar = this.f44390a;
        if (nVar == null || nVar.a() == null || this.f44390a.a().size() <= 0) {
            return null;
        }
        return this.f44390a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String b(String str) {
        n nVar = this.f44390a;
        if (nVar == null || nVar.a() == null || this.f44390a.a().size() <= 0) {
            return null;
        }
        return this.f44390a.b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean c(String str) {
        n nVar = this.f44390a;
        if (nVar == null || nVar.a() == null || this.f44390a.a().size() <= 0) {
            return null;
        }
        return this.f44390a.c(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        n nVar = this.f44390a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        n nVar = this.f44390a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
