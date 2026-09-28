package defpackage;

import android.content.Context;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qsh0 {
    public static final long a = oxa.b(0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final class a implements aiv {
        public static final a a = new a();

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            return t.z1(tVar, kxa.k(j), kxa.j(j), new jsh0());
        }
    }

    public static final f01 a(androidx.compose.runtime.a aVar) {
        if (!((Boolean) aVar.O(hnn.a)).booleanValue()) {
            aVar.N(2019129125);
            aVar.H();
            return null;
        }
        aVar.N(2019071620);
        f01 f01Var = (f01) aVar.O(edt.a);
        aVar.H();
        return f01Var;
    }

    public static final hx90 b(d0b d0bVar, androidx.compose.runtime.a aVar) {
        boolean zG = Intrinsics.g(d0bVar, d0b.a.f);
        boolean zB = aVar.b(zG);
        Object objY = aVar.y();
        if (zB || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = zG ? hx90.a : new qxa();
            aVar.r(objY);
        }
        return (hx90) objY;
    }

    public static final nan c(Object obj, androidx.compose.runtime.a aVar) {
        aVar.N(1319639034);
        if (obj instanceof nan) {
            aVar.N(1530922508);
            nan nanVar = (nan) obj;
            aVar.H();
            aVar.H();
            return nanVar;
        }
        aVar.N(1530961754);
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        boolean zM = aVar.M(context) | aVar.M(obj);
        Object objY = aVar.y();
        if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
            nan.a aVar2 = new nan.a(context);
            aVar2.c = obj;
            objY = aVar2.a();
            aVar.r(objY);
        }
        nan nanVar2 = (nan) objY;
        aVar.H();
        aVar.H();
        return nanVar2;
    }

    public static final nan d(Object obj, d0b d0bVar, androidx.compose.runtime.a aVar, int i) {
        aVar.N(-329318062);
        boolean z = obj instanceof nan;
        Object obj2 = androidx.compose.runtime.a.C0041a.a;
        if (!z) {
            aVar.N(-1008549326);
            Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
            hx90 hx90VarB = b(d0bVar, aVar);
            boolean zM = aVar.M(context) | aVar.M(obj) | aVar.M(hx90VarB);
            Object objY = aVar.y();
            if (zM || objY == obj2) {
                nan.a aVar2 = new nan.a(context);
                aVar2.c = obj;
                aVar2.q = hx90VarB;
                objY = aVar2.a();
                aVar.r(objY);
            }
            nan nanVar = (nan) objY;
            aVar.H();
            aVar.H();
            return nanVar;
        }
        aVar.N(-1008895720);
        nan nanVar2 = (nan) obj;
        if (nanVar2.u.i != null) {
            aVar.N(-1008855668);
            aVar.H();
            aVar.H();
            aVar.H();
            return nanVar2;
        }
        aVar.N(-1008807494);
        hx90 hx90VarB2 = b(d0bVar, aVar);
        boolean zM2 = aVar.M(nanVar2) | aVar.M(hx90VarB2);
        Object objY2 = aVar.y();
        if (zM2 || objY2 == obj2) {
            nan.a aVarA = nan.a(nanVar2);
            aVarA.q = hx90VarB2;
            objY2 = aVarA.a();
            aVar.r(objY2);
        }
        nan nanVar3 = (nan) objY2;
        aVar.H();
        aVar.H();
        aVar.H();
        return nanVar3;
    }

    public static final long e(long j) {
        int iB = ycv.b(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) ycv.b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iB) << 32);
    }

    public static void f(String str) {
        throw new IllegalArgumentException(lx5.a("Unsupported type: ", str, ". ", tug.a("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void g(nan nanVar) {
        Object obj = nanVar.b;
        if (obj instanceof nan.a) {
            hb5.a("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return;
        }
        if (obj instanceof c8n) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof rbn) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof crz) {
            f("Painter");
            throw null;
        }
        if (nanVar.c != null) {
            hb5.a("request.target must be null.");
        } else {
            if (((s9s) q4h.a(nanVar, abn.e)) == null) {
                return;
            }
            hb5.a("request.lifecycle must be null.");
        }
    }
}
