package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jph implements Executor {
    public static final jph a;
    public static final /* synthetic */ jph[] b;

    static {
        jph jphVar = new jph("INSTANCE", 0);
        a = jphVar;
        b = new jph[]{jphVar};
    }

    public jph() {
        throw null;
    }

    public static jph valueOf(String str) {
        return (jph) Enum.valueOf(jph.class, str);
    }

    public static jph[] values() {
        return (jph[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
