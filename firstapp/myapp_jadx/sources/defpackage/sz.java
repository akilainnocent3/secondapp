package defpackage;

import defpackage.csm;
import java.lang.Enum;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl", f = "AnTestRepositoryImpl.kt", l = {98}, m = "hasFreshCampaignAssignment", v = 2)
public final class sz<E extends Enum<E> & csm<E>> extends x1b {
    public x66 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz(tz tzVar, x1b x1bVar) {
        super(x1bVar);
        this.c = tzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.l(null, this);
    }
}
