package ql;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i0 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f122438e = 1048576;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f122439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public volatile Future<?> f122440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Task<Bitmap> f122441d;

    public i0(URL url) {
        this.f122439b = url;
    }

    public static /* synthetic */ void a(i0 i0Var, TaskCompletionSource taskCompletionSource) {
        i0Var.getClass();
        try {
            taskCompletionSource.setResult(i0Var.d());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    @Nullable
    public static i0 i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new i0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f122440c.cancel(true);
    }

    public Bitmap d() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f122439b);
        }
        byte[] bArrH = h();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f122439b);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f122439b);
        }
        return bitmapDecodeByteArray;
    }

    public final byte[] h() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f122439b.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrE = c.e(c.c(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrE.length + " bytes from " + this.f122439b);
            }
            if (bArrE.length <= 1048576) {
                return bArrE;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Task<Bitmap> k() {
        return (Task) Preconditions.checkNotNull(this.f122441d);
    }

    public void l(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f122440c = executorService.submit(new Runnable() { // from class: ql.h0
            @Override // java.lang.Runnable
            public final void run() {
                i0.a(this.f122433b, taskCompletionSource);
            }
        });
        this.f122441d = taskCompletionSource.getTask();
    }
}
