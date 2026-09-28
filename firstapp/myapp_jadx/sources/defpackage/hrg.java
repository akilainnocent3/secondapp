package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hrg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hrg(int i, d dVar, UiText uiText) {
        this.a = 2;
        this.b = dVar;
        this.c = uiText;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                Set set = (Set) obj4;
                fos fosVar = (fos) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    mrg.a(set, fosVar, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                final m4v m4vVar = (m4v) obj4;
                final dxu dxuVar = (dxu) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    for (final m4v.a aVar3 : m4vVar.b) {
                        final String str = aVar3.a;
                        final boolean zEquals = str.equals(m4vVar.a);
                        boolean zM = aVar2.M(dxuVar) | aVar2.A(m4vVar) | aVar2.M(str) | aVar2.A(aVar3);
                        Object objY = aVar2.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new Function0() { // from class: j4v
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    dxuVar.invoke(m4vVar.a, str, aVar3.b);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY);
                        }
                        w1f0.b(zEquals, (Function0) objY, j.c(d.a.b, 1.0f), false, pp8.b(-25361929, new Function2() { // from class: k4v
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                imf0 imf0Var;
                                a aVar4 = (a) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    String str2 = aVar3.b;
                                    long j = ((lib0) aVar4.O(oib0.a)).o;
                                    gdf0 gdf0Var = new gdf0(3);
                                    if (zEquals) {
                                        aVar4.N(1396999258);
                                        imf0Var = ((ijb0) aVar4.O(kjb0.a)).i;
                                    } else {
                                        aVar4.N(1396999898);
                                        imf0Var = ((ijb0) aVar4.O(kjb0.a)).j;
                                    }
                                    aVar4.H();
                                    lkf0.d(str2, null, j, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, aVar4, 0, 0, 130042);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), 0L, 0L, aVar2, 24960, 488);
                    }
                } else {
                    aVar2.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                r5g0.c(qj40.a(1), (a) obj, (d) obj4, (UiText) obj3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hrg(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = hajVar;
    }
}
