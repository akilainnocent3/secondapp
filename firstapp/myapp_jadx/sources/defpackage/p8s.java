package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.usecase.LiabilityCheckUseCases", f = "LiabilityCheckUseCases.kt", l = {227}, m = "checkCurrentSelectionsLiability", v = 2)
public final class p8s extends x1b {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o8s c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8s(o8s o8sVar, x1b x1bVar) {
        super(x1bVar);
        this.c = o8sVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
