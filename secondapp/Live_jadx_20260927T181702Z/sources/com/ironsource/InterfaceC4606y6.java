package com.ironsource;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4606y6 {

    /* JADX INFO: renamed from: com.ironsource.y6$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final c f64478a;

        public a(@oy.l c strategyType) {
            kotlin.jvm.internal.m0.p(strategyType, "strategyType");
            this.f64478a = strategyType;
        }

        @oy.l
        public final c a() {
            return this.f64478a;
        }

        @oy.l
        public final c b() {
            return this.f64478a;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f64478a == ((a) obj).f64478a;
        }

        public int hashCode() {
            return this.f64478a.hashCode();
        }

        @oy.l
        public String toString() {
            return "Config(strategyType=" + this.f64478a + gi.j.f86771d;
        }

        @oy.l
        public final a a(@oy.l c strategyType) {
            kotlin.jvm.internal.m0.p(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f64478a;
            }
            return aVar.a(cVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.y6$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.y6$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64479a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f64479a = iArr;
            }
        }

        @oy.l
        public final InterfaceC4606y6 a(@oy.l C4430o0 adTools, @oy.l a config, @oy.l InterfaceC4538u6 fullscreenAdUnitFactory, @oy.l InterfaceC4572w6 fullscreenAdUnitListener, @oy.l InterfaceC4589x6 listener) {
            kotlin.jvm.internal.m0.p(adTools, "adTools");
            kotlin.jvm.internal.m0.p(config, "config");
            kotlin.jvm.internal.m0.p(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            kotlin.jvm.internal.m0.p(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            kotlin.jvm.internal.m0.p(listener, "listener");
            int i10 = a.f64479a[config.b().ordinal()];
            if (i10 == 1) {
                return new M6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 2) {
                return new F6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i10 == 3) {
                return new C4623z6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new dr.o0();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.y6$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f64484a;

        c(String str) {
            this.f64484a = str;
        }

        @oy.l
        public final String b() {
            return this.f64484a;
        }
    }

    void a(@oy.l Activity activity);

    void loadAd();
}
