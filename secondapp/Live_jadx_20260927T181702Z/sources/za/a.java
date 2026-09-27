package za;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f160903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f160904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f160905c;

    public a() {
        this.f160903a = new PointF();
        this.f160904b = new PointF();
        this.f160905c = new PointF();
    }

    public PointF a() {
        return this.f160903a;
    }

    public PointF b() {
        return this.f160904b;
    }

    public PointF c() {
        return this.f160905c;
    }

    public void d(float f10, float f11) {
        this.f160903a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f160904b.set(f10, f11);
    }

    public void f(a aVar) {
        PointF pointF = aVar.f160905c;
        g(pointF.x, pointF.y);
        PointF pointF2 = aVar.f160903a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f160904b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f10, float f11) {
        this.f160905c.set(f10, f11);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f160905c.x), Float.valueOf(this.f160905c.y), Float.valueOf(this.f160903a.x), Float.valueOf(this.f160903a.y), Float.valueOf(this.f160904b.x), Float.valueOf(this.f160904b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f160903a = pointF;
        this.f160904b = pointF2;
        this.f160905c = pointF3;
    }
}
