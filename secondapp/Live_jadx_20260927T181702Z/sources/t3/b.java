package t3;

import android.animation.TimeInterpolator;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class b implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f136000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f136001c;

    public b(int i10, int i11) {
        this.f135999a = i10;
        this.f136000b = i11;
        this.f136001c = 1.0f / a(1.0f, i10, i11);
    }

    public static float a(float f10, int i10, int i11) {
        return ((float) (-Math.pow(i10, -f10))) + 1.0f + (i11 * f10);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return a(f10, this.f135999a, this.f136000b) * this.f136001c;
    }
}
