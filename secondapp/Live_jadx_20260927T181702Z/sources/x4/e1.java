package x4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f144270b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("messagePool")
    public static final List<b> f144271c = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f144272a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements y.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Message f144273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public e1 f144274b;

        public b() {
        }

        @Override // x4.y.a
        public void a() {
            ((Message) zi.l0.E(this.f144273a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f144273a = null;
            this.f144274b = null;
            e1.h(this);
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) zi.l0.E(this.f144273a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        @qj.a
        public b d(Message message, e1 e1Var) {
            this.f144273a = message;
            this.f144274b = e1Var;
            return this;
        }

        @Override // x4.y.a
        public y getTarget() {
            return (y) zi.l0.E(this.f144274b);
        }
    }

    public e1(Handler handler) {
        this.f144272a = handler;
    }

    public static b g() {
        b bVar;
        List<b> list = f144271c;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static void h(b bVar) {
        List<b> list = f144271c;
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

    @Override // x4.y
    public boolean a(int i10, int i11) {
        return this.f144272a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // x4.y
    public boolean b(Runnable runnable) {
        return this.f144272a.postAtFrontOfQueue(runnable);
    }

    @Override // x4.y
    public boolean c(int i10) {
        zi.l0.d(i10 != 0);
        return this.f144272a.hasMessages(i10);
    }

    @Override // x4.y
    public boolean d(y.a aVar) {
        return ((b) aVar).c(this.f144272a);
    }

    @Override // x4.y
    public void e(Runnable runnable) {
        this.f144272a.removeCallbacks(runnable);
    }

    @Override // x4.y
    public Looper getLooper() {
        return this.f144272a.getLooper();
    }

    @Override // x4.y
    public y.a obtainMessage(int i10) {
        return g().d(this.f144272a.obtainMessage(i10), this);
    }

    @Override // x4.y
    public boolean post(Runnable runnable) {
        return this.f144272a.post(runnable);
    }

    @Override // x4.y
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.f144272a.postDelayed(runnable, j10);
    }

    @Override // x4.y
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.f144272a.removeCallbacksAndMessages(obj);
    }

    @Override // x4.y
    public void removeMessages(int i10) {
        zi.l0.d(i10 != 0);
        this.f144272a.removeMessages(i10);
    }

    @Override // x4.y
    public boolean sendEmptyMessage(int i10) {
        return this.f144272a.sendEmptyMessage(i10);
    }

    @Override // x4.y
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f144272a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // x4.y
    public y.a obtainMessage(int i10, @Nullable Object obj) {
        return g().d(this.f144272a.obtainMessage(i10, obj), this);
    }

    @Override // x4.y
    public y.a obtainMessage(int i10, int i11, int i12) {
        return g().d(this.f144272a.obtainMessage(i10, i11, i12), this);
    }

    @Override // x4.y
    public y.a obtainMessage(int i10, int i11, int i12, @Nullable Object obj) {
        return g().d(this.f144272a.obtainMessage(i10, i11, i12, obj), this);
    }
}
