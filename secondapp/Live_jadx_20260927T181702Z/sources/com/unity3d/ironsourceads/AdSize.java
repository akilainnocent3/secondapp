package com.unity3d.ironsourceads;

import cs.o;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AdSize {

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f76199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    private final String f76201c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final AdSize banner() {
            return new AdSize(320, 50, "BANNER", null);
        }

        @l
        @o
        public final AdSize large() {
            return new AdSize(320, 90, com.ironsource.mediationsdk.l.f62700b, null);
        }

        @l
        @o
        public final AdSize leaderboard() {
            return new AdSize(728, 90, com.ironsource.mediationsdk.l.f62702d, null);
        }

        @l
        @o
        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, com.ironsource.mediationsdk.l.f62705g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i10, int i11, String str, x xVar) {
        this(i10, i11, str);
    }

    @l
    @o
    public static final AdSize banner() {
        return Companion.banner();
    }

    @l
    @o
    public static final AdSize large() {
        return Companion.large();
    }

    @l
    @o
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @l
    @o
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.f76200b;
    }

    @l
    public final String getSizeDescription() {
        return this.f76201c;
    }

    public final int getWidth() {
        return this.f76199a;
    }

    private AdSize(int i10, int i11, String str) {
        this.f76199a = i10;
        this.f76200b = i11;
        this.f76201c = str;
    }
}
