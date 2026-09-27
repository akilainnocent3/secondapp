package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76337a = "Cannot show ad that is not loaded for placement %s";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f76338b = "Missing queryInfoMetadata for ad %s";

    public b(c cVar, Object... objArr) {
        super(cVar, null, objArr);
    }

    public static b a(sp.d dVar) {
        String str = String.format(f76337a, dVar.c());
        return new b(c.AD_NOT_LOADED_ERROR, str, dVar.c(), dVar.d(), str);
    }

    public static b b(String str) {
        return new b(c.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static b c(sp.d dVar, String str) {
        return new b(c.INTERNAL_LOAD_ERROR, str, dVar.c(), dVar.d(), str);
    }

    public static b d(sp.d dVar, String str) {
        return new b(c.INTERNAL_SHOW_ERROR, str, dVar.c(), dVar.d(), str);
    }

    public static b e(String str) {
        return new b(c.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static b f(String str, String str2, String str3) {
        return new b(c.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static b g(sp.d dVar) {
        String str = String.format(f76338b, dVar.c());
        return new b(c.QUERY_NOT_FOUND_ERROR, str, dVar.c(), dVar.d(), str);
    }

    @Override // com.unity3d.scar.adapter.common.n, com.unity3d.scar.adapter.common.j
    public String getDomain() {
        return "GMA";
    }

    public b(c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
