package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$targetIdsFlow$2", f = "GetSearchLotteryResultMapUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ldk extends tje0 implements iaj<pz70, scn<String, ? extends Boolean>, uf00<? extends String>, v1b<? super List<? extends String>>, Object> {
    public /* synthetic */ pz70 a;
    public /* synthetic */ scn b;
    public /* synthetic */ uf00 c;

    @Override // defpackage.iaj
    public final Object d(pz70 pz70Var, scn<String, ? extends Boolean> scnVar, uf00<? extends String> uf00Var, v1b<? super List<? extends String>> v1bVar) {
        ldk ldkVar = new ldk(4, v1bVar);
        ldkVar.a = pz70Var;
        ldkVar.b = scnVar;
        ldkVar.c = uf00Var;
        return ldkVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pz70 pz70Var = this.a;
        scn scnVar = this.b;
        uf00 uf00Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (pz70Var != pz70.c) {
            return n1a0.c;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : uf00Var) {
            Boolean bool = (Boolean) scnVar.get((String) obj2);
            if (bool != null ? bool.booleanValue() : false) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
