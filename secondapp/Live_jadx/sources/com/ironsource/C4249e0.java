package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4249e0 implements InterfaceC4267f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f61595b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private static final String f61596c = "ext_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Map<String, String> f61597a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.e0$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4267f0
    @oy.l
    public Map<String, String> a() {
        return this.f61597a;
    }

    @Override // com.ironsource.InterfaceC4267f0
    public void b(@oy.l String key, @oy.l String value) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        this.f61597a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC4267f0
    public void a(@oy.l HashMap<String, String> params) {
        kotlin.jvm.internal.m0.p(params, "params");
        this.f61597a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC4267f0
    public void a(@oy.l String key, @oy.l String value) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        this.f61597a.put(key, value);
    }
}
