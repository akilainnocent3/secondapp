package defpackage;

import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$observeSocketCollectorState$2", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ho6 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho6(h hVar, v1b<? super ho6> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ho6 ho6Var = new ho6(this.b, v1bVar);
        ho6Var.a = ((Boolean) obj).booleanValue();
        return ho6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ho6) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h hVar = this.b;
        if (hVar.w0 && !z) {
            hVar.v0 = true;
        }
        hVar.w0 = z;
        return Unit.a;
    }
}
