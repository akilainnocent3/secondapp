package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4202b7 {

    /* JADX INFO: renamed from: com.ironsource.b7$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements InterfaceC4202b7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final EnumC4238d7 f61077a;

        public a(@oy.l EnumC4238d7 strategy) {
            kotlin.jvm.internal.m0.p(strategy, "strategy");
            this.f61077a = strategy;
        }

        @Override // com.ironsource.InterfaceC4202b7
        @oy.l
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC4202b7
        @oy.l
        public EnumC4238d7 b() {
            return this.f61077a;
        }

        @oy.l
        public final EnumC4238d7 c() {
            return this.f61077a;
        }
    }

    @oy.l
    String a();

    @oy.l
    EnumC4238d7 b();
}
