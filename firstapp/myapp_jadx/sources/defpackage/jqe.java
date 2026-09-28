package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jqe implements Executor {
    public static final jqe a;
    public static final /* synthetic */ jqe[] b;

    static {
        jqe jqeVar = new jqe("INSTANCE", 0);
        a = jqeVar;
        b = new jqe[]{jqeVar};
    }

    public jqe() {
        throw null;
    }

    public static jqe valueOf(String str) {
        return (jqe) Enum.valueOf(jqe.class, str);
    }

    public static jqe[] values() {
        return (jqe[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return QWvyvNzGsBpRT.AmOFaaYbj;
    }
}
