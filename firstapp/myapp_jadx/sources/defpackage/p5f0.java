package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface p5f0 {
    vvj0.a a();

    default k5b b() {
        return gf8.a(c());
    }

    xd80 c();

    default void d(Runnable runnable) {
        c().execute(runnable);
    }
}
