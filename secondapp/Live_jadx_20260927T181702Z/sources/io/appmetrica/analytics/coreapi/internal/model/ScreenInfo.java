package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ScreenInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f95247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f95248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f95249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f95250d;

    public ScreenInfo(int i10, int i11, int i12, float f10) {
        this.f95247a = i10;
        this.f95248b = i11;
        this.f95249c = i12;
        this.f95250d = f10;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i10, int i11, int i12, float f10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = screenInfo.f95247a;
        }
        if ((i13 & 2) != 0) {
            i11 = screenInfo.f95248b;
        }
        if ((i13 & 4) != 0) {
            i12 = screenInfo.f95249c;
        }
        if ((i13 & 8) != 0) {
            f10 = screenInfo.f95250d;
        }
        return screenInfo.copy(i10, i11, i12, f10);
    }

    public final int component1() {
        return this.f95247a;
    }

    public final int component2() {
        return this.f95248b;
    }

    public final int component3() {
        return this.f95249c;
    }

    public final float component4() {
        return this.f95250d;
    }

    @l
    public final ScreenInfo copy(int i10, int i11, int i12, float f10) {
        return new ScreenInfo(i10, i11, i12, f10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f95247a == screenInfo.f95247a && this.f95248b == screenInfo.f95248b && this.f95249c == screenInfo.f95249c && m0.g(Float.valueOf(this.f95250d), Float.valueOf(screenInfo.f95250d));
    }

    public final int getDpi() {
        return this.f95249c;
    }

    public final int getHeight() {
        return this.f95248b;
    }

    public final float getScaleFactor() {
        return this.f95250d;
    }

    public final int getWidth() {
        return this.f95247a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f95250d) + ((this.f95249c + ((this.f95248b + (this.f95247a * 31)) * 31)) * 31);
    }

    @l
    public String toString() {
        return "ScreenInfo(width=" + this.f95247a + ", height=" + this.f95248b + ", dpi=" + this.f95249c + ", scaleFactor=" + this.f95250d + ')';
    }
}
