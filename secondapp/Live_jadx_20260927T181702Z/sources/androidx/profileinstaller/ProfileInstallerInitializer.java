package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallerInitializer implements q9.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f18383a = 5000;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {
    }

    public static void f(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: y8.j
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.j(context);
            }
        });
    }

    @Override // q9.b
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b create(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new b();
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: y8.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f146438b.e(applicationContext);
            }
        });
        return new b();
    }

    @Override // q9.b
    @NonNull
    public List<Class<? extends q9.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    public void e(@NonNull final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: y8.i
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.f(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
