package v1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import k.a0;
import k.h1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f139919i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f139920j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0("mLock")
    public HandlerThread f139922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a0("mLock")
    public Handler f139923c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f139926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f139927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f139928h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f139921a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler.Callback f139925e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a0("mLock")
    public int f139924d = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                n.this.c();
                return true;
            }
            if (i10 != 1) {
                return true;
            }
            n.this.d((Runnable) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callable f139930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Handler f139931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f139932d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f139934b;

            public a(Object obj) {
                this.f139934b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f139932d.a(this.f139934b);
            }
        }

        public b(Callable callable, Handler handler, d dVar) {
            this.f139930b = callable;
            this.f139931c = handler;
            this.f139932d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f139930b.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f139931c.post(new a(objCall));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f139936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callable f139937c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f139938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f139939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Condition f139940f;

        public c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f139936b = atomicReference;
            this.f139937c = callable;
            this.f139938d = reentrantLock;
            this.f139939e = atomicBoolean;
            this.f139940f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f139936b.set(this.f139937c.call());
            } catch (Exception unused) {
            }
            this.f139938d.lock();
            try {
                this.f139939e.set(false);
                this.f139940f.signal();
            } finally {
                this.f139938d.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d<T> {
        void a(T t10);
    }

    public n(String str, int i10, int i11) {
        this.f139928h = str;
        this.f139927g = i10;
        this.f139926f = i11;
    }

    @h1
    public int a() {
        int i10;
        synchronized (this.f139921a) {
            i10 = this.f139924d;
        }
        return i10;
    }

    @h1
    public boolean b() {
        boolean z10;
        synchronized (this.f139921a) {
            z10 = this.f139922b != null;
        }
        return z10;
    }

    public void c() {
        synchronized (this.f139921a) {
            try {
                if (this.f139923c.hasMessages(1)) {
                    return;
                }
                this.f139922b.quit();
                this.f139922b = null;
                this.f139923c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(Runnable runnable) {
        runnable.run();
        synchronized (this.f139921a) {
            this.f139923c.removeMessages(0);
            Handler handler = this.f139923c;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f139926f);
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this.f139921a) {
            try {
                if (this.f139922b == null) {
                    HandlerThread handlerThread = new HandlerThread(this.f139928h, this.f139927g);
                    this.f139922b = handlerThread;
                    handlerThread.start();
                    this.f139923c = new Handler(this.f139922b.getLooper(), this.f139925e);
                    this.f139924d++;
                }
                this.f139923c.removeMessages(0);
                Handler handler = this.f139923c;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <T> void f(Callable<T> callable, d<T> dVar) {
        e(new b(callable, v1.b.a(), dVar));
    }

    public <T> T g(Callable<T> callable, int i10) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        e(new c(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                T t10 = (T) atomicReference.get();
                reentrantLock.unlock();
                return t10;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t11 = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t11;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
