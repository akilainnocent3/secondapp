package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.xc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4595xc implements InterfaceC4562vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f64449a;

    /* JADX INFO: renamed from: com.ironsource.xc$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f64450a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f64451b = "IronSource";

        private a() {
        }
    }

    public C4595xc(@oy.l String networkInstanceId) {
        kotlin.jvm.internal.m0.p(networkInstanceId, "networkInstanceId");
        this.f64449a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC4562vd
    @oy.l
    public String value() {
        if (this.f64449a.length() == 0) {
            return "";
        }
        if (kotlin.jvm.internal.m0.g(this.f64449a, "0") || kotlin.jvm.internal.m0.g(this.f64449a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.f64449a;
    }
}
