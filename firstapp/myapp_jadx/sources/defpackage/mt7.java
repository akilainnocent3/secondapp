package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mt7 extends BroadcastReceiver {
    public static SoftReference a;
    public static SoftReference b;

    public abstract int a(Context context, CloudMessage cloudMessage);

    public void b(Bundle bundle) {
    }

    public final int c(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (mt7.class) {
            try {
                SoftReference softReference = a;
                ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new tex(rarBonoqWB.jyffxXBboHcpOV)));
                    a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(new Runnable() { // from class: u5l0
            @Override // java.lang.Runnable
            public final void run() {
                Executor executorUnconfigurableExecutorService;
                int iC;
                mt7 mt7Var = this.a;
                Intent intent2 = intent;
                final Context context2 = context;
                boolean z = zIsOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        iC = mt7Var.c(context2, intent3);
                    } else if (intent2.getExtras() == null) {
                        iC = 500;
                    } else {
                        final CloudMessage cloudMessage = new CloudMessage(intent2);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        synchronized (mt7.class) {
                            try {
                                SoftReference softReference2 = mt7.b;
                                executorUnconfigurableExecutorService = softReference2 != null ? (Executor) softReference2.get() : null;
                                if (executorUnconfigurableExecutorService == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new tex("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    mt7.b = new SoftReference(executorUnconfigurableExecutorService);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        executorUnconfigurableExecutorService.execute(new Runnable() { // from class: l3l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i;
                                Task taskB;
                                CloudMessage cloudMessage2 = cloudMessage;
                                Intent intent4 = cloudMessage2.a;
                                String stringExtra = intent4.getStringExtra("google.message_id");
                                if (stringExtra == null) {
                                    stringExtra = intent4.getStringExtra("message_id");
                                }
                                if (TextUtils.isEmpty(stringExtra)) {
                                    taskB = Tasks.forResult(null);
                                } else {
                                    Bundle bundle = new Bundle();
                                    Intent intent5 = cloudMessage2.a;
                                    String stringExtra2 = intent5.getStringExtra("google.message_id");
                                    if (stringExtra2 == null) {
                                        stringExtra2 = intent5.getStringExtra("message_id");
                                    }
                                    bundle.putString("google.message_id", stringExtra2);
                                    Intent intent6 = cloudMessage2.a;
                                    Integer numValueOf = intent6.hasExtra("google.product_id") ? Integer.valueOf(intent6.getIntExtra("google.product_id", 0)) : null;
                                    if (numValueOf != null) {
                                        bundle.putInt("google.product_id", numValueOf.intValue());
                                    }
                                    Context context3 = context2;
                                    bundle.putBoolean("supports_message_handled", true);
                                    zsl0 zsl0VarA = zsl0.a(context3);
                                    synchronized (zsl0VarA) {
                                        i = zsl0VarA.d;
                                        zsl0VarA.d = i + 1;
                                    }
                                    taskB = zsl0VarA.b(new crl0(i, 2, bundle));
                                }
                                final CountDownLatch countDownLatch2 = countDownLatch;
                                taskB.addOnCompleteListener(mzk0.a, new OnCompleteListener() { // from class: n1l0
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task) {
                                        countDownLatch2.countDown();
                                    }
                                });
                            }
                        });
                        int iA = mt7Var.a(context2, cloudMessage);
                        try {
                            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                Log.w("CloudMessagingReceiver", "Message ack timed out");
                            }
                        } catch (InterruptedException e) {
                            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                        }
                        iC = iA;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iC);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
            }
        });
    }
}
