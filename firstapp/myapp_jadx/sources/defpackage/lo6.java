package defpackage;

import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$refreshCodeChatEnabled$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lo6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo6(h hVar, v1b<? super lo6> v1bVar) {
        super(2, v1bVar);
        this.a = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lo6(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lo6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h hVar = this.a;
        hVar.P = Boolean.valueOf(hVar.E.a());
        return Unit.a;
    }
}
