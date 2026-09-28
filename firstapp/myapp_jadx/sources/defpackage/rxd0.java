package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rxd0 {
    public long a;
    public rxd0 b;

    public rxd0() {
        this(n5a0.g().g());
    }

    public abstract void a(rxd0 rxd0Var);

    public abstract rxd0 b();

    public rxd0 c(long j) {
        rxd0 rxd0VarB = b();
        rxd0VarB.a = j;
        return rxd0VarB;
    }

    public rxd0(long j) {
        this.a = j;
    }
}
