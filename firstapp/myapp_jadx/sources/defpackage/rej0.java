package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$10", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rej0 extends tje0 implements gaj<Integer, Boolean, v1b<? super Boolean>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ Boolean b;

    @Override // defpackage.gaj
    public final Object invoke(Integer num, Boolean bool, v1b<? super Boolean> v1bVar) {
        int iIntValue = num.intValue();
        rej0 rej0Var = new rej0(3, v1bVar);
        rej0Var.a = iIntValue;
        rej0Var.b = bool;
        return rej0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Boolean bool = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(i >= 2 || Intrinsics.g(bool, Boolean.FALSE));
    }
}
