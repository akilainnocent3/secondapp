package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.ShareWinViewModel$emitError$1", f = "ShareWinViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h290 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ f290 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h290(v1b v1bVar, f290 f290Var) {
        super(2, v1bVar);
        this.a = f290Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h290(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h290) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.E.a(y190.a.a);
        return Unit.a;
    }
}
