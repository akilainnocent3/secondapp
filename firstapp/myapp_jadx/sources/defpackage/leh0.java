package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.uniquecode.bottomDialog.viewmodel.UniqueBookingCodeInfoViewModel$onDoNotShowAgainChanged$1", f = "UniqueBookingCodeInfoViewModel.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class leh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ meh0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leh0(meh0 meh0Var, boolean z, v1b<? super leh0> v1bVar) {
        super(2, v1bVar);
        this.b = meh0Var;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new leh0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((leh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            meh0 meh0Var = this.b;
            wwd0 wwd0Var = meh0Var.a;
            ((keh0) wwd0Var.getValue()).getClass();
            boolean z = this.c;
            keh0 keh0Var = new keh0(z);
            wwd0Var.getClass();
            wwd0Var.k(null, keh0Var);
            j990 j990Var = meh0Var.e;
            this.a = 1;
            m2l m2lVar = j990Var.b;
            if (m2lVar.a.putBoolean("show_unique_code_bottom_dialog", Boolean.valueOf(z), this) == y5bVar) {
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
