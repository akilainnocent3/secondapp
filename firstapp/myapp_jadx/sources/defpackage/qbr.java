package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$searchResultState$2", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qbr extends tje0 implements kaj<Pair<? extends String, ? extends pz70>, sx70, sx70.a, sx70.c, sx70.e, v1b<? super sx70>, Object> {
    public /* synthetic */ Pair a;
    public /* synthetic */ sx70 b;
    public /* synthetic */ sx70.a c;
    public /* synthetic */ sx70.c d;
    public /* synthetic */ sx70.e e;

    public qbr(v1b<? super qbr> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(Pair<? extends String, ? extends pz70> pair, sx70 sx70Var, sx70.a aVar, sx70.c cVar, sx70.e eVar, v1b<? super sx70> v1bVar) {
        qbr qbrVar = new qbr(v1bVar);
        qbrVar.a = pair;
        qbrVar.b = sx70Var;
        qbrVar.c = aVar;
        qbrVar.d = cVar;
        qbrVar.e = eVar;
        return qbrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = this.a;
        sx70 sx70Var = this.b;
        sx70.f fVar = this.c;
        sx70.c cVar = this.d;
        sx70.e eVar = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = (String) pair.a;
        pz70 pz70Var = (pz70) pair.b;
        if (StringsKt.U(str)) {
            return sx70Var;
        }
        int iOrdinal = pz70Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                fVar = cVar;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                fVar = eVar;
            }
        }
        sx70.f fVar2 = fVar.a() > 0 ? fVar : null;
        return fVar2 != null ? fVar2 : sx70.b.a;
    }
}
