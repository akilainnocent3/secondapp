package defpackage;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vmu implements Function0 {
    public final /* synthetic */ xmu a;

    public /* synthetic */ vmu(xmu xmuVar) {
        this.a = xmuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xmu xmuVar = this.a;
        xmu.c cVar = new xmu.c(new lyh[]{xmuVar.k, (uwd0) xmuVar.l.getValue()}, xmuVar);
        et7 et7Var = xmuVar.h;
        if (et7Var == null) {
            Intrinsics.n("scope");
            throw null;
        }
        kzh.d(cVar, et7Var);
        wwd0 wwd0Var = xmuVar.d;
        if (wwd0Var == null) {
            Intrinsics.n(jbkEboCkTqmGf.jsnuPeyFlgbO);
            throw null;
        }
        g1i g1iVar = new g1i(wwd0Var, new xmu.a(null, xmuVar));
        et7 et7Var2 = xmuVar.h;
        if (et7Var2 == null) {
            Intrinsics.n("scope");
            throw null;
        }
        kzh.d(g1iVar, et7Var2);
        v340 v340Var = xmuVar.c;
        if (v340Var == null) {
            Intrinsics.n("savedAssetsListUiStateFlow");
            throw null;
        }
        g1i g1iVar2 = new g1i(v340Var, new xmu.b(null, xmuVar));
        et7 et7Var3 = xmuVar.h;
        if (et7Var3 != null) {
            return kzh.d(g1iVar2, et7Var3);
        }
        Intrinsics.n("scope");
        throw null;
    }
}
