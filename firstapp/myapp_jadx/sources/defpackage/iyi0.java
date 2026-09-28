package defpackage;

import android.os.Handler;
import android.os.Message;
import com.sportybet.plugin.realsports.widget.banner.Banner;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public final class iyi0 {
    public final b a;
    public final ReentrantLock b;
    public final a c;

    public static class a {
        public a a;
        public a b;
        public final Runnable c;
        public final c d;
        public final ReentrantLock e;

        public a(ReentrantLock reentrantLock, Runnable runnable) {
            this.c = runnable;
            this.e = reentrantLock;
            this.d = new c(new WeakReference(runnable), new WeakReference(this));
        }

        public final c a() {
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            try {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a = this.a;
                }
                a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.b = aVar;
                }
                this.b = null;
                this.a = null;
                return this.d;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static class c implements Runnable {
        public final WeakReference<Runnable> a;
        public final WeakReference<a> b;

        public c(WeakReference<Runnable> weakReference, WeakReference<a> weakReference2) {
            this.a = weakReference;
            this.b = weakReference2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = this.a.get();
            a aVar = this.b.get();
            if (aVar != null) {
                aVar.a();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public iyi0() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = new a(reentrantLock, null);
        this.a = new b();
    }

    public final void a(Banner.a aVar) {
        c cVarA;
        a aVar2 = this.c;
        ReentrantLock reentrantLock = aVar2.e;
        reentrantLock.lock();
        try {
            a aVar3 = aVar2.a;
            while (true) {
                if (aVar3 == null) {
                    reentrantLock.unlock();
                    cVarA = null;
                    break;
                } else {
                    if (aVar3.c == aVar) {
                        cVarA = aVar3.a();
                        reentrantLock.unlock();
                        break;
                    }
                    aVar3 = aVar3.a;
                }
            }
            if (cVarA != null) {
                this.a.removeCallbacks(cVarA);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static class b extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
        }
    }
}
