package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.viewmodel.ChooseBetViewModel$isShareButtonEnabled$1", f = "ChooseBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wm7 extends tje0 implements gaj<cm2, String, v1b<? super Boolean>, Object> {
    public /* synthetic */ cm2 a;
    public /* synthetic */ String b;

    @Override // defpackage.gaj
    public final Object invoke(cm2 cm2Var, String str, v1b<? super Boolean> v1bVar) {
        wm7 wm7Var = new wm7(3, v1bVar);
        wm7Var.a = cm2Var;
        wm7Var.b = str;
        return wm7Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        cm2 cm2Var = this.a;
        String str = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(str != null && ((cm2Var instanceof cm2.b) || (cm2Var instanceof cm2.a)));
    }
}
