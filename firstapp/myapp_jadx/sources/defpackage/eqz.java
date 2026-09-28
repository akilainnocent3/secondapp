package defpackage;

import java.util.Map;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class eqz {
    public static final npz a;
    public static final b b;

    public static final class b implements mmd {
        @Override // defpackage.mmd
        public final float getDensity() {
            return 1.0f;
        }

        @Override // defpackage.mmd
        public final float y1() {
            return 1.0f;
        }
    }

    static {
        m2g m2gVar = m2g.a;
        i3z i3zVar = i3z.a;
        a = new npz(m2gVar, 0, 0, 0, 0, 0, 0, z4a0.b.a, new a(), w5b.a(e.a));
        b = new b();
    }

    public static final long a(epz epzVar, int i) {
        long j = (((((long) i) * ((long) (epzVar.j() + epzVar.n()))) + ((long) epzVar.g())) + ((long) epzVar.e())) - ((long) epzVar.n());
        int iD = (int) (epzVar.a() == i3z.b ? epzVar.d() >> 32 : epzVar.d() & 4294967295L);
        long jE = j - ((long) (iD - f.e(epzVar.p().d(iD, epzVar.j(), epzVar.g(), epzVar.e()), 0, iD)));
        if (jE < 0) {
            return 0L;
        }
        return jE;
    }

    public static final ved b(final int i, final Function0 function0, androidx.compose.runtime.a aVar, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        uv60 uv60Var = ved.J;
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && aVar.d(i)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && aVar.c(0.0f)) || (i2 & 48) == 32);
        if ((((i2 & 896) ^ 384) <= 256 || !aVar.M(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objY = aVar.y();
        if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = new Function0() { // from class: cqz
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new ved(0.0f, i, function0);
                }
            };
            aVar.r(objY);
        }
        ved vedVar = (ved) o350.c(objArr, uv60Var, (Function0) objY, aVar, 0);
        ((x5a0) vedVar.I).setValue(function0);
        return vedVar;
    }

    public static final class a implements biv {
        public final o2g a;

        public a() {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            this.a = o2gVar;
        }

        @Override // defpackage.biv
        public final int b() {
            return 0;
        }

        @Override // defpackage.biv
        public final int c() {
            return 0;
        }

        @Override // defpackage.biv
        public final Map<kt, Integer> s() {
            return this.a;
        }

        @Override // defpackage.biv
        public final void l() {
        }
    }
}
