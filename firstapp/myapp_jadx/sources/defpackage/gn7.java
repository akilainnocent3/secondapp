package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gn7 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gn7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object jn7Var;
        wd0 wd0Var;
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                r75 r75Var = (r75) obj;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                r75Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                }
                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mmd mmdVar = (mmd) aVar2.O(kna.h);
                    float fC1 = mmdVar.C1(r75Var.d());
                    float fC2 = mmdVar.C1(r75Var.e());
                    float fC3 = mmdVar.C1(110.0f);
                    Object objY = aVar2.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = ee0.a(0.0f);
                        aVar2.r(objY);
                    }
                    wd0 wd0Var2 = (wd0) objY;
                    Object objY2 = aVar2.y();
                    if (objY2 == c0042a) {
                        objY2 = ee0.a(1.4f);
                        aVar2.r(objY2);
                    }
                    wd0 wd0Var3 = (wd0) objY2;
                    Object objY3 = aVar2.y();
                    if (objY3 == c0042a) {
                        objY3 = ee0.a(1.0f);
                        aVar2.r(objY3);
                    }
                    final wd0 wd0Var4 = (wd0) objY3;
                    Object objY4 = aVar2.y();
                    if (objY4 == c0042a) {
                        objY4 = m.b(Boolean.TRUE);
                        aVar2.r(objY4);
                    }
                    final ytw ytwVar = (ytw) objY4;
                    Unit unit = Unit.a;
                    boolean zA = aVar2.A(wd0Var2) | aVar2.A(wd0Var3) | aVar2.A(wd0Var4);
                    Object objY5 = aVar2.y();
                    if (zA || objY5 == c0042a) {
                        wd0Var = wd0Var3;
                        jn7Var = new jn7(wd0Var2, wd0Var, wd0Var4, ytwVar, null);
                        aVar2.r(jn7Var);
                    } else {
                        jn7Var = objY5;
                        wd0Var = wd0Var3;
                    }
                    xvf.e(aVar2, unit, (Function2) jn7Var);
                    float f = 0.5f * fC1;
                    float f2 = 0.2f * fC2;
                    float f3 = ((Boolean) ytwVar.getValue()).booleanValue() ? fC1 + fC3 : -fC3;
                    float f4 = fC2 * 0.22f;
                    final float fA = hxa.a(f - (fC3 / 2.0f), f3, ((Number) wd0Var2.d()).floatValue(), f3);
                    final float fA2 = hxa.a(f2, f4, ((Number) wd0Var2.d()).floatValue(), f4);
                    d dVarR = j.r(aVar, 110.0f);
                    boolean zC = aVar2.c(fA) | aVar2.c(fA2) | aVar2.A(wd0Var) | aVar2.A(wd0Var4);
                    Object objY6 = aVar2.y();
                    if (zC || objY6 == c0042a) {
                        final wd0 wd0Var5 = wd0Var;
                        Function1 function1 = new Function1() { // from class: in7
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                a7l a7lVar = (a7l) obj5;
                                a7lVar.getClass();
                                a7lVar.B(fA);
                                a7lVar.f(fA2);
                                wd0 wd0Var6 = wd0Var5;
                                a7lVar.k(((Number) wd0Var6.d()).floatValue());
                                a7lVar.v(((Number) wd0Var6.d()).floatValue());
                                a7lVar.r(((Boolean) ytwVar.getValue()).booleanValue() ? 0.0f : 180.0f);
                                a7lVar.b(((Number) wd0Var4.d()).floatValue());
                                return Unit.a;
                            }
                        };
                        aVar2.r(function1);
                        objY6 = function1;
                    }
                    mw90.a(str, null, androidx.compose.ui.graphics.a.a(dVarR, (Function1) objY6), null, null, null, null, aVar2, 48, 2040);
                } else {
                    aVar2.G();
                }
                break;
            default:
                zpz zpzVar = (zpz) obj4;
                List list = (List) obj;
                a aVar3 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                list.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar3.M(list) : aVar3.A(list) ? 4 : 2;
                }
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    long jA = c68.a(R.color.border_brand_sub, aVar3);
                    y1f0 y1f0Var = (y1f0) list.get(zpzVar.k());
                    y1f0Var.getClass();
                    i2f0.a.c(c.a(aVar, gnn.a, new c2f0(y1f0Var)), 2.0f, jA, aVar3, 3120, 0);
                } else {
                    aVar3.G();
                }
                break;
        }
        return Unit.a;
    }
}
