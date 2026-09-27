package com.cleveradssolutions.adapters.exchange.rendering.session.manager;

import com.cleveradssolutions.adapters.exchange.rendering.models.internal.g;
import com.iab.omid.library.prebidorg.adsession.media.zs;
import com.iab.omid.library.prebidorg.adsession.zx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.cleveradssolutions.adapters.exchange.rendering.session.manager.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class C0426a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f42496b;

        static {
            int[] iArr = new int[g.a.values().length];
            f42496b = iArr;
            try {
                iArr[g.a.CLOSE_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42496b[g.a.VIDEO_CONTROLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42496b[g.a.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.cleveradssolutions.adapters.exchange.rendering.models.internal.a.values().length];
            f42495a = iArr2;
            try {
                iArr2[com.cleveradssolutions.adapters.exchange.rendering.models.internal.a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42495a[com.cleveradssolutions.adapters.exchange.rendering.models.internal.a.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42495a[com.cleveradssolutions.adapters.exchange.rendering.models.internal.a.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static zs a(com.cleveradssolutions.adapters.exchange.rendering.models.internal.a aVar) {
        int i10 = C0426a.f42495a[aVar.ordinal()];
        if (i10 == 1) {
            return zs.NORMAL;
        }
        if (i10 == 2) {
            return zs.EXPANDED;
        }
        if (i10 == 3) {
            return zs.FULLSCREEN;
        }
        throw new IllegalArgumentException("Case is not defined!");
    }

    public static zx b(g.a aVar) {
        int i10 = C0426a.f42496b[aVar.ordinal()];
        if (i10 == 1) {
            return zx.CLOSE_AD;
        }
        if (i10 == 2) {
            return zx.VIDEO_CONTROLS;
        }
        if (i10 == 3) {
            return zx.OTHER;
        }
        throw new IllegalArgumentException("Case is not defined!");
    }
}
