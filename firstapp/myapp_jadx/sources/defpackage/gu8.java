package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gu8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            final b1g0 b1g0VarD = r0g0.d(48, 5, aVar, true);
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = xvf.i(e.a, aVar);
                aVar.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            r0g0.b(i0g0.a(2, 20.0f, aVar, 432, 0), ju8.b, b1g0VarD, null, null, false, pp8.b(-971532780, new Function2() { // from class: hu8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    a aVar2 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        crz crzVarA = pib0.a(R.drawable.ic__question_circle, 0, aVar2);
                        d dVarR = j.r(d.a.b, 12.0f);
                        v5b v5bVar2 = v5bVar;
                        boolean zA = aVar2.A(v5bVar2);
                        b1g0 b1g0Var = b1g0VarD;
                        boolean zA2 = zA | aVar2.A(b1g0Var);
                        Object objY2 = aVar2.y();
                        if (zA2 || objY2 == a.C0041a.a) {
                            objY2 = new iu8(0, v5bVar2, b1g0Var);
                            aVar2.r(objY2);
                        }
                        h6n.b(crzVarA, null, androidx.compose.foundation.d.d(dVarR, false, null, null, (Function0) objY2, 15), ((lib0) aVar2.O(oib0.a)).c0, aVar2, 48, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, aVar), aVar, 100663344, 248);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
