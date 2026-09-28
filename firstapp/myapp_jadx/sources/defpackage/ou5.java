package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.calendar.viewmodel.CalendarViewModel$apply$1", f = "CalendarViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class ou5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pu5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou5(pu5 pu5Var, v1b<? super ou5> v1bVar) {
        super(2, v1bVar);
        this.b = pu5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ou5(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ou5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pu5 pu5Var = this.b;
            b390 b390Var = pu5Var.c;
            pyc pycVarA1 = pu5Var.A1((pyc) pu5Var.a.getValue());
            this.a = 1;
            if (b390Var.emit(pycVarA1, this) == y5bVar) {
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
