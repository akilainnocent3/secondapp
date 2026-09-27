package com.cleveradssolutions.adapters.exchange.rendering.models.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a f42238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c f42239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42241d;

    public f(com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar, com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVar, boolean z10, boolean z11) {
        this.f42238a = aVar;
        this.f42239b = cVar;
        this.f42240c = z10;
        this.f42241d = z11;
    }

    public boolean a() {
        return this.f42240c;
    }

    public boolean b() {
        return this.f42241d;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c c() {
        return this.f42239b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f42240c != fVar.f42240c || this.f42241d != fVar.f42241d || this.f42238a != fVar.f42238a) {
                return false;
            }
            com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVar = this.f42239b;
            com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVar2 = fVar.f42239b;
            if (cVar != null) {
                return cVar.equals(cVar2);
            }
            if (cVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.cleveradssolutions.adapters.exchange.rendering.models.ntv.a aVar = this.f42238a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        com.cleveradssolutions.adapters.exchange.rendering.utils.exposure.c cVar = this.f42239b;
        return ((((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + (this.f42240c ? 1 : 0)) * 31) + (this.f42241d ? 1 : 0);
    }
}
