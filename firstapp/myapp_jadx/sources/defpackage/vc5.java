package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vc5 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vc5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strA;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                jh10 jh10Var = (jh10) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (Intrinsics.g(jh10Var, jh10.d.a)) {
                        aVar.N(1625298013);
                        strA = cb40.a(R.string.common_functions__loading_with_dot, new Object[0], aVar);
                        aVar.H();
                    } else {
                        aVar.N(1625409830);
                        strA = cb40.a(R.string.common_functions__confirm, new Object[0], aVar);
                        aVar.H();
                    }
                    lkf0.d(strA, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar, 0, 0, 262142);
                } else {
                    aVar.G();
                }
                break;
            default:
                Function1 function1 = (Function1) obj4;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM = aVar2.M(function1);
                    Object objY = aVar2.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new uns(function1, 1);
                        aVar2.r(objY);
                    }
                    n8x.p(false, 0.0f, (Function0) objY, aVar2, 0, 3);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
