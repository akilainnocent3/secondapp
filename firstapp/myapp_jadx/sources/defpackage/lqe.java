package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lqe implements Executor {
    public static final lqe a;
    public static final /* synthetic */ lqe[] b;

    static {
        lqe lqeVar = new lqe("INSTANCE", 0);
        a = lqeVar;
        b = new lqe[]{lqeVar};
    }

    public lqe() {
        throw null;
    }

    public static lqe valueOf(String str) {
        return (lqe) Enum.valueOf(lqe.class, str);
    }

    public static lqe[] values() {
        return (lqe[]) b.clone();
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
