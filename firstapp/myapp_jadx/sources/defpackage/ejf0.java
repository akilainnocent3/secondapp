package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.j;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class ejf0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ imf0 a;

    public ejf0(imf0 imf0Var) {
        this.a = imf0Var;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(1582736677);
        mmd mmdVar = (mmd) aVar2.O(kna.h);
        f8i.a aVar3 = (f8i.a) aVar2.O(kna.k);
        asr asrVar = (asr) aVar2.O(kna.n);
        imf0 imf0Var = this.a;
        boolean zM = aVar2.M(imf0Var) | aVar2.d(asrVar.ordinal());
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zM || objY == c0042a) {
            objY = ib30.c(imf0Var, asrVar);
            aVar2.r(objY);
        }
        imf0 imf0Var2 = (imf0) objY;
        boolean zM2 = aVar2.M(aVar3) | aVar2.M(imf0Var2);
        Object objY2 = aVar2.y();
        if (zM2 || objY2 == c0042a) {
            ora0 ora0Var = imf0Var2.a;
            f8i f8iVar = ora0Var.f;
            t9i t9iVar = ora0Var.c;
            if (t9iVar == null) {
                t9iVar = t9i.B;
            }
            n9i n9iVar = ora0Var.d;
            int i = n9iVar != null ? n9iVar.a : 0;
            o9i o9iVar = ora0Var.e;
            objY2 = aVar3.b(f8iVar, t9iVar, i, o9iVar != null ? o9iVar.a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            aVar2.r(objY2);
        }
        twd0 twd0Var = (twd0) objY2;
        Object objY3 = aVar2.y();
        Object obj = objY3;
        if (objY3 == c0042a) {
            Object value = twd0Var.getValue();
            cjf0 cjf0Var = new cjf0();
            cjf0Var.a = asrVar;
            cjf0Var.b = mmdVar;
            cjf0Var.c = aVar3;
            cjf0Var.d = imf0Var;
            cjf0Var.e = value;
            cjf0Var.f = yff0.a(imf0Var, mmdVar, aVar3, yff0.a, 1);
            aVar2.r(cjf0Var);
            obj = cjf0Var;
        }
        cjf0 cjf0Var2 = (cjf0) obj;
        Object value2 = twd0Var.getValue();
        if (asrVar != cjf0Var2.a || !Intrinsics.g(mmdVar, cjf0Var2.b) || !Intrinsics.g(aVar3, cjf0Var2.c) || !Intrinsics.g(imf0Var2, cjf0Var2.d) || !Intrinsics.g(value2, cjf0Var2.e)) {
            cjf0Var2.a = asrVar;
            cjf0Var2.b = mmdVar;
            cjf0Var2.c = aVar3;
            cjf0Var2.d = imf0Var2;
            cjf0Var2.e = value2;
            cjf0Var2.f = yff0.a(imf0Var2, mmdVar, aVar3, yff0.a, 1);
        }
        boolean zA = aVar2.A(cjf0Var2);
        Object objY4 = aVar2.y();
        if (zA || objY4 == c0042a) {
            objY4 = new b530(cjf0Var2, 1);
            aVar2.r(objY4);
        }
        d dVarA = j.a(d.a.b, (gaj) objY4);
        aVar2.H();
        return dVarA;
    }
}
