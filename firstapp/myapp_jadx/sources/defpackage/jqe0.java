package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jqe0 implements cdl {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public static final class a implements cdl.a {
        public Message a;

        public final void a() {
            this.a = null;
            ArrayList arrayList = jqe0.b;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            Message message = this.a;
            message.getClass();
            message.sendToTarget();
            a();
        }
    }

    public jqe0(Handler handler) {
        this.a = handler;
    }

    public static a m() {
        a aVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // defpackage.cdl
    public final boolean a() {
        return this.a.hasMessages(1);
    }

    @Override // defpackage.cdl
    public final a b(Object obj, int i, int i2, int i3) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i, i2, i3, obj);
        return aVarM;
    }

    @Override // defpackage.cdl
    public final a c(int i) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i);
        return aVarM;
    }

    @Override // defpackage.cdl
    public final void d() {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.cdl
    public final a e(int i, Object obj) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i, obj);
        return aVarM;
    }

    @Override // defpackage.cdl
    public final Looper f() {
        return this.a.getLooper();
    }

    @Override // defpackage.cdl
    public final a g(int i, int i2, int i3) {
        a aVarM = m();
        aVarM.a = this.a.obtainMessage(i, i2, i3);
        return aVarM;
    }

    @Override // defpackage.cdl
    public final boolean h(cdl.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.a.sendMessageAtFrontOfQueue(message);
        aVar2.a();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // defpackage.cdl
    public final boolean i(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // defpackage.cdl
    public final boolean j(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    @Override // defpackage.cdl
    public final boolean k(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // defpackage.cdl
    public final void l(int i) {
        ly0.b(i != 0);
        this.a.removeMessages(i);
    }
}
