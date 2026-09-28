package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class mub {
    public static final a d = new a();
    public final iub a;
    public final iub b;
    public final iub c;

    public static final class a {
        public static String a() {
            return Thread.currentThread().getName();
        }
    }

    public mub(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.a = new iub(executorService);
        this.b = new iub(executorService);
        Tasks.forResult(null);
        this.c = new iub(executorService2);
    }

    public static final void a() {
        a aVar = d;
        aVar.getClass();
        if (((Boolean) new jub(0, aVar, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + a.a() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        a aVar = d;
        aVar.getClass();
        if (((Boolean) new kub(0, aVar, a.class, "isBlockingThread", "isBlockingThread()Z", 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + a.a() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
