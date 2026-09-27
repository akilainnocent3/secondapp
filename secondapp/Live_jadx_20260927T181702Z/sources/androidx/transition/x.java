package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class x<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Property<T, PointF> f19696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PathMeasure f19697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f19699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PointF f19700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19701f;

    public x(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f19699d = new float[2];
        this.f19700e = new PointF();
        this.f19696a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f19697b = pathMeasure;
        this.f19698c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t10) {
        return Float.valueOf(this.f19701f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t10, Float f10) {
        this.f19701f = f10.floatValue();
        this.f19697b.getPosTan(this.f19698c * f10.floatValue(), this.f19699d, null);
        PointF pointF = this.f19700e;
        float[] fArr = this.f19699d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f19696a.set(t10, pointF);
    }
}
