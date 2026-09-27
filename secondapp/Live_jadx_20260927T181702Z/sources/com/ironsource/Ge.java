package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ge implements Fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final N8 f59116a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f59117a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f59118b = "sessionNumber";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.l
        public static final String f59119c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ge() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.He
    public void a(@oy.l Context context, int i10) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f59116a.a(context, a.f59118b, i10);
    }

    @Override // com.ironsource.He
    public int b(@oy.l Context context, int i10) {
        kotlin.jvm.internal.m0.p(context, "context");
        return this.f59116a.b(context, a.f59118b, i10);
    }

    public Ge(@oy.l N8 sdkSharedPref) {
        kotlin.jvm.internal.m0.p(sdkSharedPref, "sdkSharedPref");
        this.f59116a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC4444oe
    public long a(@oy.l Context context, long j10) {
        kotlin.jvm.internal.m0.p(context, "context");
        return this.f59116a.b(context, "firstSessionTimestamp", j10);
    }

    @Override // com.ironsource.InterfaceC4444oe
    public void b(@oy.l Context context, long j10) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f59116a.a(context, "firstSessionTimestamp", j10);
    }

    public /* synthetic */ Ge(N8 n10, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? new Ie() : n10);
    }
}
