package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
public final class n390 extends x1b {
    public m390 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m390<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n390(m390 m390Var, x1b x1bVar) {
        super(x1bVar);
        this.c = m390Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(null, this);
    }
}
