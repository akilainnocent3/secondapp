package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$3", f = "TxDetailsV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i4h0 extends tje0 implements gaj<Boolean, Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ r4h0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(3, v1bVar);
        this.c = r4h0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Unit> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        i4h0 i4h0Var = new i4h0(v1bVar, this.c);
        i4h0Var.a = zBooleanValue;
        i4h0Var.b = zBooleanValue2;
        return i4h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        r4h0 r4h0Var = this.c;
        r4h0Var.y1().setValue(t3h0.a(r4h0Var.y1().getValue(), null, null, null, null, z2 ? c330.b.a : new c330.a(null, !z), 15));
        return Unit.a;
    }
}
