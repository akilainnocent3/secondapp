package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$togglePopoverCategory$2", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d320 extends tje0 implements gaj<myh<? super Unit>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Unit> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        d320 d320Var = new d320(3, v1bVar);
        d320Var.a = th;
        return d320Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.a(a320.a("Error toggling popover category: ", th), new Object[0]);
        return Unit.a;
    }
}
