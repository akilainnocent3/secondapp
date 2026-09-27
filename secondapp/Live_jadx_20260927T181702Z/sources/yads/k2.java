package yads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f151362b = new j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k2 f151363c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f151364a = new LinkedHashMap();

    public k2() {
        a("window_type_browser", new u1());
        a("window_type_activity_result", new n2());
    }

    public final synchronized void a(String str, i2 i2Var) {
        if (!this.f151364a.containsKey(str)) {
            this.f151364a.put(str, i2Var);
        }
    }
}
