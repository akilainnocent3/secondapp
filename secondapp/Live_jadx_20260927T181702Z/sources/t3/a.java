package t3;

import android.animation.TimeInterpolator;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class a implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f135997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f135998c;

    public a(int i10, int i11) {
        this.f135996a = i10;
        this.f135997b = i11;
        this.f135998c = 1.0f / a(1.0f, i10, i11);
    }

    public static float a(float f10, int i10, int i11) {
        return ((float) (-Math.pow(i10, -f10))) + 1.0f + (i11 * f10);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - (a(1.0f - f10, this.f135996a, this.f135997b) * this.f135998c);
    }
}
