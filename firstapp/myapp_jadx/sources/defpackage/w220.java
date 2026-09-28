package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$checkIfPopoverIsHidden$2", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w220 extends tje0 implements gaj<myh<? super Boolean>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ e320 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w220(e320 e320Var, v1b<? super w220> v1bVar) {
        super(3, v1bVar);
        this.a = e320Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new w220(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.f.m(Boolean.FALSE);
        return Unit.a;
    }
}
