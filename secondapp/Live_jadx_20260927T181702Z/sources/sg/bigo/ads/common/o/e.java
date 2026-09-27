package sg.bigo.ads.common.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
class e implements ServiceConnection, IBinder.DeathRecipient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile e f133198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f133199d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f133202e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f133201b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BlockingQueue<IBinder> f133200a = new LinkedBlockingQueue(1);

    private e(Context context) {
        this.f133202e = context;
    }

    public static e a(Context context) {
        if (f133198c == null) {
            synchronized (e.class) {
                try {
                    if (f133198c == null) {
                        f133198c = new e(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f133198c;
    }

    private void b() {
        try {
            synchronized (f133199d) {
                this.f133200a.clear();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        b();
    }

    public final f a(long j10, TimeUnit timeUnit) {
        try {
            IBinder iBinderPoll = this.f133200a.poll(j10, timeUnit);
            if (iBinderPoll == null) {
                return null;
            }
            a(iBinderPoll);
            return f.a.a(iBinderPoll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final synchronized void a() {
        if (this.f133201b) {
            try {
                this.f133201b = false;
                b();
                this.f133202e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    private void a(IBinder iBinder) {
        try {
            synchronized (f133199d) {
                this.f133200a.clear();
                this.f133200a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }
}
