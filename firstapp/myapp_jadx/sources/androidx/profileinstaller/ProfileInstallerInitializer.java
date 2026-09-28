package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import defpackage.zhn;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements zhn<b> {

    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    @Override // defpackage.zhn
    public final b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: d130
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler handlerA = Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
                int iNextInt = new Random().nextInt(Math.max(1000, 1));
                final Context context2 = applicationContext;
                handlerA.postDelayed(new Runnable() { // from class: e130
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f130(context2, 0));
                    }
                }, iNextInt + 5000);
            }
        });
        return new b();
    }

    @Override // defpackage.zhn
    public final List<Class<? extends zhn<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
