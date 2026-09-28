package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.bookingcode.presentation.smartremix.SmartRemixConfirmationUiState;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j9s implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j9s(SmartRemixConfirmationUiState smartRemixConfirmationUiState, ComposeView composeView, l9s l9sVar) {
        this.b = smartRemixConfirmationUiState;
        this.c = composeView;
        this.d = l9sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                SmartRemixConfirmationUiState smartRemixConfirmationUiState = (SmartRemixConfirmationUiState) obj5;
                ComposeView composeView = (ComposeView) obj4;
                l9s l9sVar = (l9s) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), c68.a(R.color.black_50, aVar), zk40.a);
                    aiv aivVarC = g75.c(ht.a.h, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarB);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar2);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    if (smartRemixConfirmationUiState != null) {
                        aVar.N(147827592);
                        String strC = sn5.c(composeView, R.string.component_betslip__smart_remix, new Object[0]);
                        String strC2 = sn5.c(composeView, R.string.component_betslip__smart_remix_removing, String.valueOf(smartRemixConfirmationUiState.d.size()));
                        String strC3 = sn5.c(composeView, R.string.component_betslip__smart_remix_adding, String.valueOf(smartRemixConfirmationUiState.e.size()));
                        String strC4 = sn5.c(composeView, R.string.component_betslip__smart_remix_confirm_btn, new Object[0]);
                        boolean zA = aVar.A(l9sVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new uji(l9sVar, 2);
                            aVar.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar.A(l9sVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new rpn(l9sVar, 1);
                            aVar.r(objY2);
                        }
                        Function0 function1 = (Function0) objY2;
                        boolean zA3 = aVar.A(l9sVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new k9s(l9sVar, 0);
                            aVar.r(objY3);
                        }
                        b2a0.c(strC, strC2, strC3, strC4, smartRemixConfirmationUiState, function0, function1, (Function0) objY3, aVar, 0);
                        aVar.H();
                    } else {
                        aVar.N(149243145);
                        aVar.H();
                    }
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                qr90.a((String) obj5, (String) obj4, (String) obj3, (a) obj, qj40.a(385));
                return Unit.a;
        }
    }

    public /* synthetic */ j9s(String str, String str2, String str3, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
