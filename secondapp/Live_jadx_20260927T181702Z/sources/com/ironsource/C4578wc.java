package com.ironsource;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4578wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final C4340j2 f64392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f64393b;

    /* JADX INFO: renamed from: com.ironsource.wc$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f64394a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f64395b = "adm";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f64396c = "isOneFlow";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static final String f64397d = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public static final String f64398e = "adsInternalInfo";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.l
        public static final String f64399f = "success";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oy.l
        public static final String f64400g = "error";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @oy.l
        public static final String f64401h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4578wc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @oy.l
    public final HashMap<String, String> a() {
        C4432o2 c4432o2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f64393b));
        map.put("isMultipleAdObjects", "true");
        List<O> listA = Lb.f59407s.d().G().a();
        String string = listA != null ? new JSONObject().put("success", true).put("data", listA).toString() : new JSONObject().put("success", false).put("error", "Failed to get ad internal info").toString();
        kotlin.jvm.internal.m0.o(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f64398e, string);
        C4340j2 c4340j2 = this.f64392a;
        if (c4340j2 != null && (c4432o2G = c4340j2.g()) != null) {
            map.put("adm", c4432o2G.a());
            map.putAll(c4432o2G.b());
        }
        return map;
    }

    public C4578wc(@oy.m C4340j2 c4340j2, boolean z10) {
        this.f64392a = c4340j2;
        this.f64393b = z10;
    }

    public /* synthetic */ C4578wc(C4340j2 c4340j2, boolean z10, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? null : c4340j2, (i10 & 2) != 0 ? false : z10);
    }
}
