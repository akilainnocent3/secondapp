package wa;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import gb.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i extends hb.a<PointF> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Path f142583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hb.a<PointF> f142584t;

    public i(com.airbnb.lottie.k kVar, hb.a<PointF> aVar) {
        super(kVar, aVar.f88080b, aVar.f88081c, aVar.f88082d, aVar.f88083e, aVar.f88084f, aVar.f88085g, aVar.f88086h);
        this.f142584t = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t10;
        T t11;
        T t12 = this.f88081c;
        boolean z10 = (t12 == 0 || (t11 = this.f88080b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f88080b;
        if (t13 == 0 || (t10 = this.f88081c) == 0 || z10) {
            return;
        }
        hb.a<PointF> aVar = this.f142584t;
        this.f142583s = z.d((PointF) t13, (PointF) t10, aVar.f88093o, aVar.f88094p);
    }

    @Nullable
    public Path k() {
        return this.f142583s;
    }
}
