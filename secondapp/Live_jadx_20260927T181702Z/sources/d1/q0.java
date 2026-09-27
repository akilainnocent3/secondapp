package d1;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(23)
    public static class a {
        @k.t
        public static void a(@NonNull PendingIntent pendingIntent, @NonNull Context context, int i10, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i10, intent, onFinished, handler, str, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class b {
        @k.t
        public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
            return PendingIntent.getForegroundService(context, i10, intent, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d implements Closeable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public PendingIntent.OnFinished f77635c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f77634b = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f77636d = false;

        public d(@Nullable PendingIntent.OnFinished onFinished) {
            this.f77635c = onFinished;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f77636d) {
                this.f77635c = null;
            }
            this.f77634b.countDown();
        }

        public void d() {
            this.f77636d = true;
        }

        @Nullable
        public PendingIntent.OnFinished h() {
            if (this.f77635c == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: d1.r0
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
                    this.f77637a.i(pendingIntent, intent, i10, str, bundle);
                }
            };
        }

        public final void i(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
            boolean z10 = false;
            while (true) {
                try {
                    this.f77634b.await();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i10 = i10;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th2) {
                    if (!z10) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.f77635c;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i10, str, bundle);
                this.f77635c = null;
            }
        }
    }

    public static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i11 | i10;
    }

    @NonNull
    public static PendingIntent b(@NonNull Context context, int i10, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, @Nullable Bundle bundle, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11), bundle);
    }

    @NonNull
    public static PendingIntent c(@NonNull Context context, int i10, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i11, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11));
    }

    @Nullable
    public static PendingIntent d(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @Nullable Bundle bundle, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11), bundle);
    }

    @Nullable
    public static PendingIntent e(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }

    @Nullable
    public static PendingIntent f(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getBroadcast(context, i10, intent, a(z10, i11));
    }

    @NonNull
    @k.t0(26)
    public static PendingIntent g(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return b.a(context, i10, intent, a(z10, i11));
    }

    @Nullable
    public static PendingIntent h(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getService(context, i10, intent, a(z10, i11));
    }

    @SuppressLint({"LambdaLast"})
    public static void i(@NonNull PendingIntent pendingIntent, int i10, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(i10, dVar.h(), handler);
            dVar.d();
            dVar.close();
        } catch (Throwable th2) {
            try {
                dVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void j(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i10, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        k(pendingIntent, context, i10, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void k(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i10, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            a.a(pendingIntent, context, i10, intent, onFinished, handler, str, bundle);
            dVar.d();
            dVar.close();
        } catch (Throwable th2) {
            try {
                dVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
