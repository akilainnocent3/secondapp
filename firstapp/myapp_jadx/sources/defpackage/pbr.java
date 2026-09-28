package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$searchResultState$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pbr extends tje0 implements gaj<String, pz70, v1b<? super Pair<? extends String, ? extends pz70>>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ pz70 b;

    @Override // defpackage.gaj
    public final Object invoke(String str, pz70 pz70Var, v1b<? super Pair<? extends String, ? extends pz70>> v1bVar) {
        pbr pbrVar = new pbr(3, v1bVar);
        pbrVar.a = str;
        pbrVar.b = pz70Var;
        return pbrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        pz70 pz70Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(str, pz70Var);
    }
}
