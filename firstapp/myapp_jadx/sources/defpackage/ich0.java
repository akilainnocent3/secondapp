package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ich0 implements Executor {
    public static final ich0 a;
    public static final Handler b;
    public static final /* synthetic */ ich0[] c;

    static {
        ich0 ich0Var = new ich0("INSTANCE", 0);
        a = ich0Var;
        c = new ich0[]{ich0Var};
        b = new Handler(Looper.getMainLooper());
    }

    public ich0() {
        throw null;
    }

    public static ich0 valueOf(String str) {
        return (ich0) Enum.valueOf(ich0.class, str);
    }

    public static ich0[] values() {
        return (ich0[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
