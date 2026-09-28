package defpackage;

import com.sporty.android.core.model.config.VersionData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.SportyAppUpdateManager", f = "SportyAppUpdateManager.kt", l = {241}, m = "isSkipped", v = 2)
public final class ahb0 extends x1b {
    public VersionData a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fhb0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahb0(fhb0 fhb0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = fhb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
