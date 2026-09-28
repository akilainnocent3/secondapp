package defpackage;

import defpackage.csm;
import java.lang.Enum;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl", f = "AnTestRepositoryImpl.kt", l = {132, 137}, m = "fetchAssignedCampaignVariant", v = 2)
public final class mz<E extends Enum<E> & csm<E>> extends x1b {
    public x66 a;
    public String b;
    public Class c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tz f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(tz tzVar, x1b x1bVar) {
        super(x1bVar);
        this.f = tzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.i(null, false, this);
    }
}
