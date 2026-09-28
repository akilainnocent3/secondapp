package defpackage;

import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$collectSocketMessages$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zn6 extends tje0 implements Function2<im6, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn6(h hVar, v1b<? super zn6> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zn6 zn6Var = new zn6(this.b, v1bVar);
        zn6Var.a = obj;
        return zn6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(im6 im6Var, v1b<? super Unit> v1bVar) {
        return ((zn6) create(im6Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        im6 im6Var = (im6) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h hVar = this.b;
        b390 b390Var = hVar.t0;
        if (((Number) ((cee0) b390Var.b()).getValue()).intValue() == 0) {
            hVar.v0 = true;
        }
        b390Var.a(im6Var);
        return Unit.a;
    }
}
