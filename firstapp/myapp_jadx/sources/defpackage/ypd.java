package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$nextProgressButtonUiStateFlow$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ypd extends tje0 implements gaj<c330, jw1, v1b<? super c330>, Object> {
    public /* synthetic */ c330 a;
    public /* synthetic */ jw1 b;

    @Override // defpackage.gaj
    public final Object invoke(c330 c330Var, jw1 jw1Var, v1b<? super c330> v1bVar) {
        ypd ypdVar = new ypd(3, v1bVar);
        ypdVar.a = c330Var;
        ypdVar.b = jw1Var;
        return ypdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        c330 c330Var = this.a;
        jw1 jw1Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (c330Var instanceof c330.a) {
            c330.a aVar = (c330.a) c330Var;
            int i = (jw1Var == null || (str = jw1Var.c) == null || !StringsKt.M(str, "tenn", true)) ? R.string.common_functions__top_up_now : R.string.common_functions__top_up_and_boost_now;
            StringUiText stringUiText = vch0.a;
            return c330.a.a(aVar, false, new ResourceUiText(i), 1);
        }
        if (Intrinsics.g(c330Var, c330.b.a)) {
            return c330Var;
        }
        uhc.a();
        return null;
    }
}
