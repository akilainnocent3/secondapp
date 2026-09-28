package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r1l0 implements Executor {
    public static final r1l0 a;
    public static final /* synthetic */ r1l0[] b;

    static {
        r1l0 r1l0Var = new r1l0("INSTANCE", 0);
        a = r1l0Var;
        b = new r1l0[]{r1l0Var};
    }

    public static r1l0[] values() {
        return (r1l0[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
