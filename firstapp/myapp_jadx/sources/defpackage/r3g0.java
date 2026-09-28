package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.transition.nfj.CaBJCMnsV;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class r3g0 {
    public final Context a;
    public final vov b;
    public final a4l c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final p3g0 h;
    public final ox0 e = new ox0();
    public boolean g = false;

    public r3g0(FirebaseMessaging firebaseMessaging, vov vovVar, p3g0 p3g0Var, a4l a4lVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = vovVar;
        this.h = p3g0Var;
        this.c = a4lVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/".concat(str));
        bundle.putString("delete", "1");
        String strConcat = "/topics/".concat(str);
        a4l a4lVar = this.c;
        a(a4lVar.a(a4lVar.c(strA, strConcat, bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Task<Void> c(j3g0 j3g0Var) {
        ArrayDeque arrayDeque;
        p3g0 p3g0Var = this.h;
        synchronized (p3g0Var) {
            t390 t390Var = p3g0Var.a;
            String str = j3g0Var.c;
            t390Var.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains(",")) {
                synchronized (t390Var.b) {
                    if (t390Var.b.add(str)) {
                        t390Var.c.execute(new s390(t390Var));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.e) {
            try {
                String str2 = j3g0Var.c;
                if (this.e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    public final void e() {
        boolean z;
        if (this.h.a() != null) {
            synchronized (this) {
                z = this.g;
            }
            if (z) {
                return;
            }
            g(0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00af A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x00af, B:34:0x00b7, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x009c), top: B:88:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x00af, B:34:0x00b7, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x009c), top: B:88:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00b7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() throws IOException {
        j3g0 j3g0VarA;
        while (true) {
            synchronized (this) {
                try {
                    j3g0VarA = this.h.a();
                    if (j3g0VarA == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = j3g0VarA.b;
                String str2 = j3g0VarA.a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b(str2);
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + j3g0VarA + ".");
                    }
                } else if (str.equals("S")) {
                    a4l a4lVar = this.c;
                    String strA = this.d.a();
                    Bundle bundle = new Bundle();
                    bundle.putString("gcm.topic", "/topics/".concat(str2));
                    a(a4lVar.a(a4lVar.c(strA, "/topics/".concat(str2), bundle)));
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + j3g0VarA + ".");
                }
                p3g0 p3g0Var = this.h;
                synchronized (p3g0Var) {
                    try {
                        t390 t390Var = p3g0Var.a;
                        String str3 = j3g0VarA.c;
                        synchronized (t390Var.b) {
                            try {
                                if (t390Var.b.remove(str3)) {
                                    t390Var.c.execute(new s390(t390Var));
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                synchronized (this.e) {
                    try {
                        String str4 = j3g0VarA.c;
                        if (this.e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                            if (taskCompletionSource != null) {
                                taskCompletionSource.setResult(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.e.remove(str4);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            } catch (IOException e) {
                if (!CaBJCMnsV.LZLMM.equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void g(long j) {
        this.f.schedule(new s3g0(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        d(true);
    }
}
