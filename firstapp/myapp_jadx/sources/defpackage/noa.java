package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class noa {
    public static final HashMap d = new HashMap();
    public static final liv e = new liv();
    public final Executor a;
    public final cpa b;
    public Task<b> c = null;

    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch a = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    public noa(Executor executor, cpa cpaVar) {
        this.a = executor;
        this.b = cpaVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        a aVar = new a();
        Executor executor = e;
        task.addOnSuccessListener(executor, aVar);
        task.addOnFailureListener(executor, aVar);
        task.addOnCanceledListener(executor, aVar);
        if (!aVar.a.await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task<b> b() {
        try {
            Task<b> task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                Executor executor = this.a;
                final cpa cpaVar = this.b;
                this.c = Tasks.call(executor, new Callable() { // from class: koa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        FileInputStream fileInputStreamOpenFileInput;
                        Throwable th;
                        cpa cpaVar2 = cpaVar;
                        synchronized (cpaVar2) {
                            try {
                                try {
                                    fileInputStreamOpenFileInput = cpaVar2.a.openFileInput(cpaVar2.b);
                                    try {
                                        int iAvailable = fileInputStreamOpenFileInput.available();
                                        byte[] bArr = new byte[iAvailable];
                                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                        b bVarA = b.a(new JSONObject(new String(bArr, "UTF-8")));
                                        fileInputStreamOpenFileInput.close();
                                        return bVarA;
                                    } catch (FileNotFoundException | JSONException unused) {
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            } catch (FileNotFoundException | JSONException unused2) {
                                fileInputStreamOpenFileInput = null;
                            } catch (Throwable th4) {
                                fileInputStreamOpenFileInput = null;
                                th = th4;
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final b c() {
        synchronized (this) {
            try {
                Task<b> task = this.c;
                if (task != null && task.isSuccessful()) {
                    return this.c.getResult();
                }
                try {
                    return (b) a(b());
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task<b> d(final b bVar) {
        Callable callable = new Callable() { // from class: loa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                noa noaVar = this.a;
                b bVar2 = bVar;
                cpa cpaVar = noaVar.b;
                synchronized (cpaVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = cpaVar.a.openFileOutput(cpaVar.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(bVar2.a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            }
        };
        Executor executor = this.a;
        return Tasks.call(executor, callable).onSuccessTask(executor, new SuccessContinuation() { // from class: moa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                noa noaVar = this.a;
                b bVar2 = bVar;
                synchronized (noaVar) {
                    noaVar.c = Tasks.forResult(bVar2);
                }
                return Tasks.forResult(bVar2);
            }
        });
    }
}
