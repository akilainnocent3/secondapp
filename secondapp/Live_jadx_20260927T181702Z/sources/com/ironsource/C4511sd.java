package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4511sd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f63579b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final String f63580c = "type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f63581d = "single";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f63582e = "onShowSuccess";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final String f63583f = "onLoadSuccess";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final InterfaceC4606y6.c f63584a;

    /* JADX INFO: renamed from: com.ironsource.sd$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public C4511sd(@oy.l JSONObject features) {
        InterfaceC4606y6.c cVar;
        kotlin.jvm.internal.m0.p(features, "features");
        String strOptString = features.optString("type");
        if (strOptString == null) {
            cVar = null;
        } else {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals(f63581d)) {
                        cVar = InterfaceC4606y6.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(f63582e)) {
                    cVar = InterfaceC4606y6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f63583f)) {
                cVar = InterfaceC4606y6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        }
        this.f63584a = cVar;
    }

    @oy.m
    public final InterfaceC4606y6.c a() {
        return this.f63584a;
    }
}
