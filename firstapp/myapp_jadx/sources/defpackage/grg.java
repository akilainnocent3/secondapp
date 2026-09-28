package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class grg implements m730 {

    public static final class a {
        public static final grg a = new grg();
    }

    @Override // defpackage.m730
    public final Object get() {
        gi1 gi1Var = gi1.f;
        if (gi1Var != null) {
            return gi1Var;
        }
        bmy.a("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }
}
