package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class nse {
    public final ExecutorService a;
    public final FirebaseMessagingService b;
    public final u2y c;

    public nse(FirebaseMessagingService firebaseMessagingService, u2y u2yVar, ExecutorService executorService) {
        this.a = executorService;
        this.b = firebaseMessagingService;
        this.c = u2yVar;
    }

    public final boolean a() {
        final v8n v8nVar;
        IconCompat iconCompat;
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strI = this.c.i("gcm.n.image");
        if (TextUtils.isEmpty(strI)) {
            v8nVar = null;
        } else {
            try {
                v8nVar = new v8n(new URL(strI));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strI);
                v8nVar = null;
            }
        }
        if (v8nVar != null) {
            ExecutorService executorService = this.a;
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            v8nVar.b = executorService.submit(new Runnable() { // from class: u8n
                @Override // java.lang.Runnable
                public final void run() {
                    v8n v8nVar2 = v8nVar;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        taskCompletionSource2.setResult(v8nVar2.d());
                    } catch (Exception e) {
                        taskCompletionSource2.setException(e);
                    }
                }
            });
            v8nVar.c = taskCompletionSource.getTask();
        }
        ug8.a aVarA = ug8.a(this.b, this.c);
        g1y g1yVar = aVarA.a;
        if (v8nVar != null) {
            try {
                Task<Bitmap> task = v8nVar.c;
                hm20.h(task);
                Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                g1yVar.e(bitmap);
                e1y e1yVar = new e1y();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                e1yVar.e = iconCompat;
                e1yVar.f = null;
                e1yVar.g = true;
                g1yVar.f(e1yVar);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                v8nVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                v8nVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVarA.b, 0, aVarA.a.a());
        return true;
    }
}
