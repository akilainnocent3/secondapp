package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hug implements n730 {
    @Override // defpackage.n730
    public final Object get() {
        utr<ScheduledExecutorService> utrVar = ExecutorsRegistrar.a;
        return new hld(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new wjc("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.d.get());
    }
}
