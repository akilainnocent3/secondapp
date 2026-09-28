package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iug implements n730 {
    @Override // defpackage.n730
    public final Object get() {
        utr<ScheduledExecutorService> utrVar = ExecutorsRegistrar.a;
        return new hld(Executors.newCachedThreadPool(new wjc("Firebase Blocking", 11, null)), ExecutorsRegistrar.d.get());
    }
}
