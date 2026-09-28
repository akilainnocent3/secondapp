package defpackage;

import com.sporty.android.core.model.config.VersionData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.SportyAppUpdateManager", f = "SportyAppUpdateManager.kt", l = {65, 66, 77, 82, 93, 93}, m = "refreshVersion", v = 2)
public final class bhb0 extends x1b {
    public boolean a;
    public VersionData b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fhb0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhb0(fhb0 fhb0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = fhb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.e(false, this);
    }
}
