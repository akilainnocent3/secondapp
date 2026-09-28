package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$tagState$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vbr extends tje0 implements gaj<pz70, sx70, v1b<? super ux70>, Object> {
    public /* synthetic */ pz70 a;
    public /* synthetic */ sx70 b;

    @Override // defpackage.gaj
    public final Object invoke(pz70 pz70Var, sx70 sx70Var, v1b<? super ux70> v1bVar) {
        vbr vbrVar = new vbr(3, v1bVar);
        vbrVar.a = pz70Var;
        vbrVar.b = sx70Var;
        return vbrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pz70 pz70Var = this.a;
        sx70 sx70Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (sx70Var instanceof sx70.d) {
            return ux70.a.a;
        }
        uag uagVar = pz70.e;
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        q3.b bVar = new q3.b();
        while (bVar.hasNext()) {
            pz70 pz70Var2 = (pz70) bVar.next();
            arrayList.add(new tx70(pz70Var2, pz70Var2 == pz70Var));
        }
        return new ux70.b(a4h.f(arrayList));
    }
}
