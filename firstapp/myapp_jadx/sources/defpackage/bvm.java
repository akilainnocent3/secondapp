package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.login.INTAuthLoadingViewModel$processDestination$1", f = "INTAuthLoadingViewModel.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class bvm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cvm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvm(boolean z, boolean z2, boolean z3, cvm cvmVar, v1b<? super bvm> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = cvmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bvm(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bvm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ivm cVar;
        cvm cvmVar = this.e;
        psm psmVar = cvmVar.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (this.b || this.c) {
                cVar = ivm.d.a;
            } else if (this.d && (psmVar.W() || psmVar.F())) {
                cVar = new ivm.c(psmVar.W() ? nor.a.a : nor.c.a);
            } else {
                cVar = ivm.b.a;
            }
            b390 b390Var = cvmVar.b;
            this.a = 1;
            if (b390Var.emit(cVar, this) == y5bVar) {
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
