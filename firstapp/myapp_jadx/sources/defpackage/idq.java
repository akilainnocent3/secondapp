package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftdialog.LNGiftDialogViewModel$state$1", f = "LNGiftDialogViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class idq extends tje0 implements kaj<ijf0, Boolean, ocq, ResourceUiText, Boolean, v1b<? super cdq>, Object> {
    public /* synthetic */ ijf0 a;
    public /* synthetic */ boolean b;
    public /* synthetic */ ocq c;
    public /* synthetic */ ResourceUiText d;
    public /* synthetic */ boolean e;

    public idq(v1b<? super idq> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(ijf0 ijf0Var, Boolean bool, ocq ocqVar, ResourceUiText resourceUiText, Boolean bool2, v1b<? super cdq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        idq idqVar = new idq(v1bVar);
        idqVar.a = ijf0Var;
        idqVar.b = zBooleanValue;
        idqVar.c = ocqVar;
        idqVar.d = resourceUiText;
        idqVar.e = zBooleanValue2;
        return idqVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ijf0 ijf0Var = this.a;
        boolean z = this.b;
        ocq ocqVar = this.c;
        ResourceUiText resourceUiText = this.d;
        boolean z2 = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z3 = true;
        String strA = ukd0.a(2, ocqVar.e, true, true);
        ResourceUiText resourceUiText2 = z ? null : resourceUiText;
        if (!z) {
            if (resourceUiText == null) {
                BigDecimal bigDecimalB = ukd0.b(ijf0Var.a.b);
                rkd0.Companion.getClass();
                if (bigDecimalB.compareTo(rkd0.b) <= 0) {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
        }
        return new cdq(z, strA, ijf0Var, resourceUiText2, z2, z3);
    }
}
