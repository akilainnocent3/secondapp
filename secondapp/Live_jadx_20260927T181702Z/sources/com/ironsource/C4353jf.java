package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.jf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4353jf implements H3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f62151d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f62152e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f62153f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Context f62154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f62155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final N8 f62156c;

    /* JADX INFO: renamed from: com.ironsource.jf$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    public C4353jf(@oy.l Context context, @oy.l String baseName, @oy.l N8 sdkSharedPref) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(baseName, "baseName");
        kotlin.jvm.internal.m0.p(sdkSharedPref, "sdkSharedPref");
        this.f62154a = context;
        this.f62155b = baseName;
        this.f62156c = sdkSharedPref;
    }

    @Override // com.ironsource.H3
    public void a(@oy.l String identifier, int i10) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        this.f62156c.a(this.f62154a, new C4371kf(identifier, this.f62155b + ".show_count_show_counter").a(), i10);
    }

    @Override // com.ironsource.H3
    @oy.m
    public Long b(@oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        return a(Long.valueOf(this.f62156c.b(this.f62154a, new C4371kf(identifier, this.f62155b + ".pacing_last_show_time").a(), -1L)));
    }

    @Override // com.ironsource.H3
    @oy.m
    public Integer c(@oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        return a(Integer.valueOf(this.f62156c.b(this.f62154a, new C4371kf(identifier, this.f62155b + ".show_count_show_counter").a(), -1)));
    }

    @Override // com.ironsource.H3
    public void a(@oy.l String identifier, long j10) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        this.f62156c.a(this.f62154a, new C4371kf(identifier, this.f62155b + ".pacing_last_show_time").a(), j10);
    }

    @Override // com.ironsource.H3
    public void b(@oy.l String identifier, long j10) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        this.f62156c.a(this.f62154a, new C4371kf(identifier, this.f62155b + ".show_count_threshold").a(), j10);
    }

    public /* synthetic */ C4353jf(Context context, String str, N8 n10, int i10, kotlin.jvm.internal.x xVar) {
        this(context, str, (i10 & 4) != 0 ? new Ie() : n10);
    }

    @Override // com.ironsource.H3
    @oy.m
    public Long a(@oy.l String identifier) {
        kotlin.jvm.internal.m0.p(identifier, "identifier");
        return a(Long.valueOf(this.f62156c.b(this.f62154a, new C4371kf(identifier, this.f62155b + ".show_count_threshold").a(), -1L)));
    }

    private final Long a(Long l10) {
        if (l10 != null && l10.longValue() == -1) {
            return null;
        }
        return l10;
    }

    private final Integer a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
