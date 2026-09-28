package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmEditCode$2", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mcc extends tje0 implements Function2<myh<? super f8c>, v1b<? super Unit>, Object> {
    public final /* synthetic */ bdc a;
    public final /* synthetic */ f8c.b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcc(bdc bdcVar, f8c.b bVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = bdcVar;
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mcc(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super f8c> myhVar, v1b<? super Unit> v1bVar) {
        return ((mcc) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.E;
        f8c.b bVarA = f8c.b.a(this.b, false, false, 15);
        wwd0Var.getClass();
        wwd0Var.k(null, bVarA);
        return Unit.a;
    }
}
