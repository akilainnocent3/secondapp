package defpackage;

import com.sportybet.android.globalpay.pixBtg.deposit.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$1", f = "PixBtgDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z810 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public final /* synthetic */ g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z810(g gVar, v1b<? super z810> v1bVar) {
        super(2, v1bVar);
        this.a = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z810(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        return ((z810) create(bool, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        z600.a().b();
        g gVar = this.a;
        gVar.I1(new vy4(gVar, 1));
        return Unit.a;
    }
}
