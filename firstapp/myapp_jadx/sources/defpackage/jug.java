package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jug implements n730 {
    @Override // defpackage.n730
    public final Object get() {
        utr<ScheduledExecutorService> utrVar = ExecutorsRegistrar.a;
        return Executors.newSingleThreadScheduledExecutor(new wjc("Firebase Scheduler", 0, null));
    }
}
