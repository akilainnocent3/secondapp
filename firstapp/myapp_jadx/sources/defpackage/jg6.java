package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jg6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public jg6(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final twd0 a(boolean z, psw pswVar, a aVar, int i) {
        wd0 wd0Var;
        aVar.N(-1763481333);
        float f = this.a;
        Object obj = a.C0041a.a;
        if (pswVar == null) {
            aVar.N(167751211);
            Object objY = aVar.y();
            if (objY == obj) {
                objY = m.b(new g7f(f));
                aVar.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            aVar.H();
            aVar.H();
            return ytwVar;
        }
        aVar.N(167824247);
        aVar.H();
        Object objY2 = aVar.y();
        if (objY2 == obj) {
            objY2 = new SnapshotStateList();
            aVar.r(objY2);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objY2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && aVar.M(pswVar)) || (i & 48) == 32;
        Object objY3 = aVar.y();
        if (z3 || objY3 == obj) {
            objY3 = new hg6(pswVar, snapshotStateList, null);
            aVar.r(objY3);
        }
        xvf.e(aVar, pswVar, (Function2) objY3);
        xxo xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
        if (!z) {
            f = this.f;
        } else if (xxoVar instanceof mp20.b) {
            f = this.b;
        } else if (xxoVar instanceof vkm) {
            f = this.d;
        } else if (xxoVar instanceof c4i) {
            f = this.c;
        } else if (xxoVar instanceof i9f.b) {
            f = this.e;
        }
        Object objY4 = aVar.y();
        if (objY4 == obj) {
            objY4 = new wd0(new g7f(f), gjs.d, null, 12);
            aVar.r(objY4);
        }
        wd0 wd0Var2 = (wd0) objY4;
        g7f g7fVar = new g7f(f);
        boolean zA = aVar.A(wd0Var2) | aVar.c(f) | ((((i & 14) ^ 6) > 4 && aVar.b(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !aVar.M(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zA2 = zA | z2 | aVar.A(xxoVar);
        Object objY5 = aVar.y();
        if (zA2 || objY5 == obj) {
            wd0Var = wd0Var2;
            Object ig6Var = new ig6(wd0Var, f, z, this, xxoVar, null);
            aVar.r(ig6Var);
            objY5 = ig6Var;
        } else {
            wd0Var = wd0Var2;
        }
        xvf.e(aVar, g7fVar, (Function2) objY5);
        twd0 twd0Var = wd0Var.c;
        aVar.H();
        return twd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jg6)) {
            return false;
        }
        jg6 jg6Var = (jg6) obj;
        return g7f.b(this.a, jg6Var.a) && g7f.b(this.b, jg6Var.b) && g7f.b(this.c, jg6Var.c) && g7f.b(this.d, jg6Var.d) && g7f.b(this.f, jg6Var.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
