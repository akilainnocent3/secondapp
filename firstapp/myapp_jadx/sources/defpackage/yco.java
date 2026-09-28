package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryViewModel$5", f = "InstantWinBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yco extends tje0 implements Function2<rco, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yco(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yco ycoVar = new yco(v1bVar, this.b);
        ycoVar.a = obj;
        return ycoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rco rcoVar, v1b<? super Unit> v1bVar) {
        return ((yco) create(rcoVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        rco rcoVar = (rco) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.B;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, rcoVar));
        return Unit.a;
    }
}
