package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class jr70 {
    public final zp70 a;
    public final v5b b;
    public final goh<Float> c;
    public Integer d;

    public jr70(zp70 zp70Var, v5b v5bVar, goh<Float> gohVar) {
        this.a = zp70Var;
        this.b = v5bVar;
        this.c = gohVar;
    }

    public final void a(mmd mmdVar, int i, ArrayList arrayList, int i2) {
        Integer num = this.d;
        if (num != null && num.intValue() == i2) {
            return;
        }
        this.d = Integer.valueOf(i2);
        z1f0 z1f0Var = (z1f0) CollectionsKt.V(i2, arrayList);
        if (z1f0Var != null) {
            z1f0 z1f0Var2 = (z1f0) CollectionsKt.b0(arrayList);
            int iY0 = mmdVar.y0(z1f0Var2.a + z1f0Var2.b) + i;
            zp70 zp70Var = this.a;
            int iH = iY0 - zp70Var.h();
            int iY1 = mmdVar.y0(z1f0Var.a) - ((iH / 2) - (mmdVar.y0(z1f0Var.b) / 2));
            int i3 = iY0 - iH;
            if (i3 < 0) {
                i3 = 0;
            }
            int iE = f.e(iY1, 0, i3);
            if (((u5a0) zp70Var.a).D() != iE) {
                ej5.c(this.b, null, null, new hr70(this, iE, null), 3);
            }
        }
    }
}
