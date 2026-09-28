package defpackage;

import java.util.Map;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class dwr {
    public static final gvr a;

    static {
        a aVar = new a();
        m2g m2gVar = m2g.a;
        i3z i3zVar = i3z.a;
        a = new gvr(null, 0, false, 0.0f, aVar, 0.0f, false, w5b.a(e.a), omd.a(), 0, new idn(1), new cwr(), m2gVar, 0, 0, 0, i3zVar, 0, 0);
    }

    public static final zvr a(final int i, int i2, androidx.compose.runtime.a aVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        uv60 uv60Var = zvr.w;
        boolean zD = aVar.d(i) | aVar.d(0);
        Object objY = aVar.y();
        if (zD || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = new Function0() { // from class: bwr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new zvr(i, 0);
                }
            };
            aVar.r(objY);
        }
        return (zvr) o350.c(objArr, uv60Var, (Function0) objY, aVar, 0);
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
