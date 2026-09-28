package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$withdrawableStateFlow$1", f = "WithdrawTransferViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fqj0 extends tje0 implements iaj<String, UiText, xhj0, v1b<? super Boolean>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ UiText b;
    public /* synthetic */ xhj0 c;

    @Override // defpackage.iaj
    public final Object d(String str, UiText uiText, xhj0 xhj0Var, v1b<? super Boolean> v1bVar) {
        fqj0 fqj0Var = new fqj0(4, v1bVar);
        fqj0Var.a = str;
        fqj0Var.b = uiText;
        fqj0Var.c = xhj0Var;
        return fqj0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        UiText uiText = this.b;
        xhj0 xhj0Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(!StringsKt.U(str) && uiText == null && Intrinsics.g(xhj0Var, xhj0.i.a));
    }
}
