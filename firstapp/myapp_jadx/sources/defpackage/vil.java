package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class vil implements gaj<d, a, Integer, d> {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ imf0 c;

    public vil(int i, int i2, imf0 imf0Var) {
        this.a = i;
        this.b = i2;
        this.c = imf0Var;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(408240218);
        int i = this.a;
        int i2 = this.b;
        pyb.a(i, i2);
        d.a aVar3 = d.a.b;
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            aVar2.H();
            return aVar3;
        }
        mmd mmdVar = (mmd) aVar2.O(kna.h);
        f8i.a aVar4 = (f8i.a) aVar2.O(kna.k);
        asr asrVar = (asr) aVar2.O(kna.n);
        imf0 imf0Var = this.c;
        boolean zM = aVar2.M(imf0Var) | aVar2.d(asrVar.ordinal());
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zM || objY == c0042a) {
            objY = ib30.c(imf0Var, asrVar);
            aVar2.r(objY);
        }
        imf0 imf0Var2 = (imf0) objY;
        boolean zM2 = aVar2.M(aVar4) | aVar2.M(imf0Var2);
        Object objY2 = aVar2.y();
        if (zM2 || objY2 == c0042a) {
            ora0 ora0Var = imf0Var2.a;
            f8i f8iVar = ora0Var.f;
            t9i t9iVar = ora0Var.c;
            if (t9iVar == null) {
                t9iVar = t9i.B;
            }
            n9i n9iVar = ora0Var.d;
            int i3 = n9iVar != null ? n9iVar.a : 0;
            o9i o9iVar = ora0Var.e;
            objY2 = aVar4.b(f8iVar, t9iVar, i3, o9iVar != null ? o9iVar.a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            aVar2.r(objY2);
        }
        twd0 twd0Var = (twd0) objY2;
        boolean zM3 = aVar2.M(twd0Var.getValue()) | aVar2.M(mmdVar) | aVar2.M(aVar4) | aVar2.M(imf0Var) | aVar2.d(asrVar.ordinal());
        Object objY3 = aVar2.y();
        if (zM3 || objY3 == c0042a) {
            objY3 = Integer.valueOf((int) (yff0.a(imf0Var2, mmdVar, aVar4, yff0.a, 1) & 4294967295L));
            aVar2.r(objY3);
        }
        int iIntValue = ((Number) objY3).intValue();
        boolean zM4 = aVar2.M(imf0Var) | aVar2.M(mmdVar) | aVar2.M(aVar4) | aVar2.d(asrVar.ordinal()) | aVar2.M(twd0Var.getValue());
        Object objY4 = aVar2.y();
        if (zM4 || objY4 == c0042a) {
            StringBuilder sb = new StringBuilder();
            String str = yff0.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objY4 = Integer.valueOf((int) (yff0.a(imf0Var2, mmdVar, aVar4, sb.toString(), 2) & 4294967295L));
            aVar2.r(objY4);
        }
        int iIntValue2 = ((Number) objY4).intValue() - iIntValue;
        Integer numValueOf = i == 1 ? null : Integer.valueOf(((i - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue) : null;
        d dVarJ = j.j(aVar3, numValueOf != null ? mmdVar.u1(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? mmdVar.u1(numValueOf2.intValue()) : Float.NaN);
        aVar2.H();
        return dVarJ;
    }
}
