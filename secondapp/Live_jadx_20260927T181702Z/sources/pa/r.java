package pa;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public class r implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable command) {
        command.run();
    }
}
