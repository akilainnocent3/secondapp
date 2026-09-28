package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import com.sportybet.android.gp.tz.R;
import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qxe implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ qxe(DobVerificationReminderData dobVerificationReminderData, Function0 function0, Function0 function1) {
        this.b = dobVerificationReminderData;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                DobVerificationReminderData dobVerificationReminderData = (DobVerificationReminderData) obj4;
                Function0 function0 = (Function0) obj3;
                Function0 function1 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long jA = c68.a(R.color.bg_primary_d_base, aVar);
                    zk40.a aVar2 = zk40.a;
                    d.a aVar3 = d.a.b;
                    d dVarI = h.i(androidx.compose.foundation.a.b(aVar3, jA, aVar2), 20.0f, 32.0f, 20.0f, 16.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar, 48);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarI);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar4);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    mw90.a("https://s.sporty.net/cms/img_gift_box_closed_54d9c23723.png", "Birthday Verification", j.r(aVar3, 120.0f), null, null, null, null, aVar, 438, 2040);
                    d dVarJ = h.j(aVar3, 0.0f, 24.0f, 0.0f, 20.0f, 5);
                    String title = dobVerificationReminderData.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    lkf0.d(title, dVarJ, c68.a(R.color.text_primary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar), aVar, 48, 0, 130040);
                    String message = dobVerificationReminderData.getMessage();
                    String str = message != null ? message : "";
                    lkf0.d(str, null, c68.a(R.color.text_primary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 0, 0, 130042);
                    ty0.a(aVar, j.i(aVar3, 24.0f));
                    l9z.a(null, cb40.a(R.string.common_functions__skip, new Object[0], aVar), cb40.a(R.string.common_functions__verify, new Object[0], aVar), uxs.ENABLE, null, null, function0, function1, aVar, 3072, 49);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                jui0.g((WDUserInfoModel) obj4, (sg90) obj3, (Function1) hajVar, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }

    public /* synthetic */ qxe(WDUserInfoModel wDUserInfoModel, sg90 sg90Var, Function1 function1, int i) {
        this.b = wDUserInfoModel;
        this.c = sg90Var;
        this.d = function1;
    }
}
