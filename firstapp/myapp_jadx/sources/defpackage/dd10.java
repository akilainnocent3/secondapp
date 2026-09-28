package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.g;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$1", f = "PixBtgWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dd10 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd10(h hVar, v1b<? super dd10> v1bVar) {
        super(2, v1bVar);
        this.a = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dd10(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        return ((dd10) create(bool, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        z600.a().b();
        final h hVar = this.a;
        g.a(hVar.D, o8i0.d(hVar), new zyn(hVar, 1));
        final z600 z600VarA = z600.a();
        hVar.E1(new Function1() { // from class: yc10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                shl shlVar = (shl) obj2;
                shlVar.getClass();
                z600 z600Var = z600VarA;
                double d = z600Var.c.c;
                s9e0 s9e0Var = s9e0.a;
                xsm xsmVar = hVar.f;
                String strI = xsmVar.i(d, true);
                s9e0Var.getClass();
                String strP = c.p(strI, " ", "", false);
                String strI2 = xsmVar.i(z600Var.c.d, true);
                s9e0Var.getClass();
                return shl.a(shlVar, null, strP, c.p(strI2, " ", "", false), null, 57);
            }
        });
        return Unit.a;
    }
}
