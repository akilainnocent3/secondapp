package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4220c7 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final JSONObject f61188a;

    /* JADX INFO: renamed from: com.ironsource.c7$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f61190b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f61192d = 24;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f61189a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f61191c = EnumC4238d7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f61191c;
        }
    }

    public C4220c7(@oy.m JSONObject jSONObject) {
        this.f61188a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.Y6
    public long a() {
        return ((long) this.f61188a.optInt("timeout", 24)) * 1000;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f61188a.optBoolean(com.ironsource.mediationsdk.metadata.a.f62749j, false);
    }

    @Override // com.ironsource.Y6
    @oy.l
    public EnumC4238d7 c() {
        return EnumC4238d7.f61529b.a(this.f61188a.optInt(C4235d4.f.f61360e, a.f61189a.a()));
    }
}
