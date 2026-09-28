package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.BetslipCustomizationStateHandler$section$1", f = "BetslipCustomizationStateHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class io3 extends tje0 implements iaj<oo3, nz3, UiText, v1b<? super st3>, Object> {
    public /* synthetic */ oo3 a;
    public /* synthetic */ nz3 b;
    public /* synthetic */ UiText c;

    @Override // defpackage.iaj
    public final Object d(oo3 oo3Var, nz3 nz3Var, UiText uiText, v1b<? super st3> v1bVar) {
        io3 io3Var = new io3(4, v1bVar);
        io3Var.a = oo3Var;
        io3Var.b = nz3Var;
        io3Var.c = uiText;
        return io3Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        oo3 oo3Var = this.a;
        nz3 nz3Var = this.b;
        UiText uiText = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new st3(oo3Var, (oo3Var.f.isEmpty() && oo3Var.g == null) ? false : true, nz3Var, uiText);
    }
}
