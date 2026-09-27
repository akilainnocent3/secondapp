package wa;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f142597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f142598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f142599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f142600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public hb.j<Float> f142601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public hb.j<Float> f142602n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f142597i = new PointF();
        this.f142598j = new PointF();
        this.f142599k = aVar;
        this.f142600l = aVar2;
        n(f());
    }

    @Override // wa.a
    public void n(float f10) {
        this.f142599k.n(f10);
        this.f142600l.n(f10);
        this.f142597i.set(this.f142599k.h().floatValue(), this.f142600l.h().floatValue());
        for (int i10 = 0; i10 < this.f142553a.size(); i10++) {
            this.f142553a.get(i10).e();
        }
    }

    @Override // wa.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // wa.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(hb.a<PointF> aVar, float f10) {
        Float fB;
        hb.a<Float> aVarB;
        hb.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f142601m == null || (aVarB2 = this.f142599k.b()) == null) {
            fB = null;
        } else {
            Float f11 = aVarB2.f88086h;
            hb.j<Float> jVar = this.f142601m;
            float f12 = aVarB2.f88085g;
            fB = jVar.b(f12, f11 == null ? f12 : f11.floatValue(), aVarB2.f88080b, aVarB2.f88081c, this.f142599k.d(), this.f142599k.e(), this.f142599k.f());
        }
        if (this.f142602n != null && (aVarB = this.f142600l.b()) != null) {
            Float f13 = aVarB.f88086h;
            hb.j<Float> jVar2 = this.f142602n;
            float f14 = aVarB.f88085g;
            fB2 = jVar2.b(f14, f13 == null ? f14 : f13.floatValue(), aVarB.f88080b, aVarB.f88081c, this.f142600l.d(), this.f142600l.e(), this.f142600l.f());
        }
        if (fB == null) {
            this.f142598j.set(this.f142597i.x, 0.0f);
        } else {
            this.f142598j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f142598j;
            pointF.set(pointF.x, this.f142597i.y);
        } else {
            PointF pointF2 = this.f142598j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f142598j;
    }

    public void t(@Nullable hb.j<Float> jVar) {
        hb.j<Float> jVar2 = this.f142601m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f142601m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void u(@Nullable hb.j<Float> jVar) {
        hb.j<Float> jVar2 = this.f142602n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f142602n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
