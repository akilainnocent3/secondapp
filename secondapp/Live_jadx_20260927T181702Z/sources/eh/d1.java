package eh;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d1 implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f80929b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("messagePool")
    public static final List<b> f80930c = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f80931a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements c0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Message f80932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public d1 f80933b;

        public b() {
        }

        @Override // eh.c0.a
        public void a() {
            ((Message) eh.a.g(this.f80932a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f80932a = null;
            this.f80933b = null;
            d1.g(this);
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) eh.a.g(this.f80932a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        @qj.a
        public b d(Message message, d1 d1Var) {
            this.f80932a = message;
            this.f80933b = d1Var;
            return this;
        }

        @Override // eh.c0.a
        public c0 getTarget() {
            return (c0) eh.a.g(this.f80933b);
        }
    }

    public d1(Handler handler) {
        this.f80931a = handler;
    }

    public static b f() {
        b bVar;
        List<b> list = f80930c;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static void g(b bVar) {
        List<b> list = f80930c;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // eh.c0
    public boolean a(int i10, int i11) {
        return this.f80931a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // eh.c0
    public boolean b(Runnable runnable) {
        return this.f80931a.postAtFrontOfQueue(runnable);
    }

    @Override // eh.c0
    public boolean c(int i10) {
        return this.f80931a.hasMessages(i10);
    }

    @Override // eh.c0
    public boolean d(c0.a aVar) {
        return ((b) aVar).c(this.f80931a);
    }

    @Override // eh.c0
    public Looper getLooper() {
        return this.f80931a.getLooper();
    }

    @Override // eh.c0
    public c0.a obtainMessage(int i10) {
        return f().d(this.f80931a.obtainMessage(i10), this);
    }

    @Override // eh.c0
    public boolean post(Runnable runnable) {
        return this.f80931a.post(runnable);
    }

    @Override // eh.c0
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.f80931a.postDelayed(runnable, j10);
    }

    @Override // eh.c0
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.f80931a.removeCallbacksAndMessages(obj);
    }

    @Override // eh.c0
    public void removeMessages(int i10) {
        this.f80931a.removeMessages(i10);
    }

    @Override // eh.c0
    public boolean sendEmptyMessage(int i10) {
        return this.f80931a.sendEmptyMessage(i10);
    }

    @Override // eh.c0
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f80931a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // eh.c0
    public c0.a obtainMessage(int i10, @Nullable Object obj) {
        return f().d(this.f80931a.obtainMessage(i10, obj), this);
    }

    @Override // eh.c0
    public c0.a obtainMessage(int i10, int i11, int i12) {
        return f().d(this.f80931a.obtainMessage(i10, i11, i12), this);
    }

    @Override // eh.c0
    public c0.a obtainMessage(int i10, int i11, int i12, @Nullable Object obj) {
        return f().d(this.f80931a.obtainMessage(i10, i11, i12, obj), this);
    }
}
