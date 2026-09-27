package androidx.work;

import java.util.concurrent.Executor;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public enum h implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(@oy.l Runnable command) {
        m0.p(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    @oy.l
    public String toString() {
        return "DirectExecutor";
    }
}
