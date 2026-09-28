package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.edit.viewmodel.EditTimeOutViewModel$onContinueClicked$1", f = "EditTimeOutViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class ruf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ suf b;
    public final /* synthetic */ i2z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ruf(suf sufVar, i2z i2zVar, v1b<? super ruf> v1bVar) {
        super(2, v1bVar);
        this.b = sufVar;
        this.c = i2zVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ruf(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ruf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            suf sufVar = this.b;
            b390 b390Var = sufVar.c;
            lsf lsfVar = sufVar.e;
            if (lsfVar == null) {
                Intrinsics.n("originalOption");
                throw null;
            }
            jsf.a aVar = new jsf.a(lsfVar.a, this.c.c);
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
