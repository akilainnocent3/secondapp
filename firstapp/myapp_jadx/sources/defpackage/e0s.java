package defpackage;

import java.util.Map;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class e0s {
    public static final nzr a = new nzr(null, 0, false, 0.0f, new a(), 0.0f, false, w5b.a(e.a), omd.a(), oxa.b(0, 0, 0, 15), m2g.a, 0, 0, 0, false, i3z.a, 0, 0);

    public static final zzr a(final int i, int i2, androidx.compose.runtime.a aVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        uv60 uv60Var = zzr.x;
        boolean zD = aVar.d(i) | aVar.d(0);
        Object objY = aVar.y();
        if (zD || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = new Function0() { // from class: d0s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new zzr(i, 0);
                }
            };
            aVar.r(objY);
        }
        return (zzr) o350.c(objArr, uv60Var, (Function0) objY, aVar, 0);
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
