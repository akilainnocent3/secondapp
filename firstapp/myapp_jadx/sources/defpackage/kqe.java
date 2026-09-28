package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kqe implements Executor {
    public static final kqe a;
    public static final /* synthetic */ kqe[] b;

    static {
        kqe kqeVar = new kqe("INSTANCE", 0);
        a = kqeVar;
        b = new kqe[]{kqeVar};
    }

    public kqe() {
        throw null;
    }

    public static kqe valueOf(String str) {
        return (kqe) Enum.valueOf(kqe.class, str);
    }

    public static kqe[] values() {
        return (kqe[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
