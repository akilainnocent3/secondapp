package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$5", f = "FootballFamilySettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vfi extends tje0 implements Function2<xro, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfi(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vfi vfiVar = new vfi(v1bVar, this.b);
        vfiVar.a = obj;
        return vfiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xro xroVar, v1b<? super Unit> v1bVar) {
        return ((vfi) create(xroVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        xro xroVar = (xro) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.H;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, xroVar));
        return Unit.a;
    }
}
