package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$2", f = "FootballFamilySettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tfi extends tje0 implements Function2<nbi, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfi(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tfi tfiVar = new tfi(v1bVar, this.b);
        tfiVar.a = obj;
        return tfiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(nbi nbiVar, v1b<? super Unit> v1bVar) {
        return ((tfi) create(nbiVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        nbi nbiVar;
        nbi nbiVar2 = (nbi) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.i;
        do {
            value = wwd0Var.getValue();
            nbiVar = (nbi) value;
            if (nbiVar == null) {
                nbiVar = nbiVar2;
            }
        } while (!wwd0Var.g(value, nbiVar));
        return Unit.a;
    }
}
