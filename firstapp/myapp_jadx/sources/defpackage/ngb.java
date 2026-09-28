package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$handleUserValidate$2$1$1$1", f = "CrashFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ngb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ fgb a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngb(fgb fgbVar, String str, v1b<? super ngb> v1bVar) {
        super(2, v1bVar);
        this.a = fgbVar;
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ngb(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ngb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        fgb fgbVar = this.a;
        fgb.K0(fgbVar, this.b, fgbVar.b1().J0(), fgbVar.b1().M0(), ((Number) ((x5a0) fgbVar.c1().M).getValue()).intValue(), 24);
        return Unit.a;
    }
}
