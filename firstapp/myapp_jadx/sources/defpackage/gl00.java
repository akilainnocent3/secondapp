package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$startPreviewCodeState$2", f = "PersonalCodeViewModel.kt", l = {205}, m = "invokeSuspend", v = 2)
public final class gl00 extends tje0 implements Function2<qm00, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ el00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl00(v1b v1bVar, el00 el00Var) {
        super(2, v1bVar);
        this.c = el00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gl00 gl00Var = new gl00(v1bVar, this.c);
        gl00Var.b = obj;
        return gl00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qm00 qm00Var, v1b<? super Unit> v1bVar) {
        return ((gl00) create(qm00Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qm00 qm00Var = (qm00) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.E;
            this.b = null;
            this.a = 1;
            wwd0Var.setValue(qm00Var);
            if (Unit.a == y5bVar) {
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
