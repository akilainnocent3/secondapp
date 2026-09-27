package u4;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public interface o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f138726a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pair<Float, Float> f138727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pair<Float, Float> f138728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pair<Float, Float> f138729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f138730e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f138731f = 1.0f;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        f138727b = Pair.create(fValueOf, fValueOf);
        f138728c = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        f138729d = Pair.create(fValueOf2, fValueOf2);
    }

    float a();

    Pair<Float, Float> b();

    float c();

    Pair<Float, Float> d();

    float e();

    Pair<Float, Float> getScale();
}
