package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.c;
import com.sportybet.android.instantwin.presentation.buildandgo.f;
import com.sportybet.feature.luckynumber.placebet.presentation.HowToPlayPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fd5 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                f fVar = (f) obj4;
                ld5.a aVar = (ld5.a) obj;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                aVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar2.M(aVar) ? 4 : 2;
                }
                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c.e(aVar.a, aVar.b, fVar, aVar2, Sports.$stable | (cf5.d << 3) | 512);
                } else {
                    aVar2.G();
                }
                break;
            default:
                Function1 function1 = (Function1) obj4;
                ifx ifxVar = (ifx) obj;
                a aVar3 = (a) obj2;
                ((Integer) obj3).getClass();
                ifxVar.getClass();
                vu60 vu60VarA = ifxVar.a();
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                com.sportybet.feature.luckynumber.placebet.presentation.a aVar4 = (com.sportybet.feature.luckynumber.placebet.presentation.a) fnf.a(vu60VarA, jq40.a(com.sportybet.feature.luckynumber.placebet.presentation.a.class), o2gVar);
                v0r.a(0, 0, aVar3, aVar4.a, function1, aVar4.b == HowToPlayPresentation.MAIN_DRAW_DIALOG);
                break;
        }
        return Unit.a;
    }
}
