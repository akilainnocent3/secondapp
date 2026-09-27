package bb;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import k.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<za.a> f21116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PointF f21117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21118c;

    public o(PointF pointF, boolean z10, List<za.a> list) {
        this.f21117b = pointF;
        this.f21118c = z10;
        this.f21116a = new ArrayList(list);
    }

    public List<za.a> a() {
        return this.f21116a;
    }

    public PointF b() {
        return this.f21117b;
    }

    public void c(o oVar, o oVar2, @w(from = 0.0d, to = 1.0d) float f10) {
        if (this.f21117b == null) {
            this.f21117b = new PointF();
        }
        this.f21118c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            gb.g.e("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f21116a.size() < iMin) {
            for (int size = this.f21116a.size(); size < iMin; size++) {
                this.f21116a.add(new za.a());
            }
        } else if (this.f21116a.size() > iMin) {
            for (int size2 = this.f21116a.size() - 1; size2 >= iMin; size2--) {
                List<za.a> list = this.f21116a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(gb.l.k(pointFB.x, pointFB2.x, f10), gb.l.k(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f21116a.size() - 1; size3 >= 0; size3--) {
            za.a aVar = oVar.a().get(size3);
            za.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f21116a.get(size3).d(gb.l.k(pointFA.x, pointFA2.x, f10), gb.l.k(pointFA.y, pointFA2.y, f10));
            this.f21116a.get(size3).e(gb.l.k(pointFB3.x, pointFB4.x, f10), gb.l.k(pointFB3.y, pointFB4.y, f10));
            this.f21116a.get(size3).g(gb.l.k(pointFC.x, pointFC2.x, f10), gb.l.k(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f21118c;
    }

    public void e(boolean z10) {
        this.f21118c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f21117b == null) {
            this.f21117b = new PointF();
        }
        this.f21117b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f21116a.size() + "closed=" + this.f21118c + fw.b.f85383j;
    }

    public o() {
        this.f21116a = new ArrayList();
    }
}
