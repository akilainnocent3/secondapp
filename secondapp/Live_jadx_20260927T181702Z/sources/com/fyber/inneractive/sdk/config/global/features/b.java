package com.fyber.inneractive.sdk.config.global.features;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f44373e = a.OPEN;

    public b() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    public final a c() {
        String strA = a("identifier_click_action", f44373e.mKey);
        for (a aVar : a.values()) {
            if (strA.equalsIgnoreCase(aVar.mKey)) {
                return aVar;
            }
        }
        return a.NONE;
    }
}
