package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class bdl extends qm70 {
    public final Handler c;

    public static final class a extends qm70.c {
        public final Handler a;
        public volatile boolean b;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // qm70.c
        public final pse a(Runnable runnable, long j, TimeUnit timeUnit) {
            f2g f2gVar = f2g.a;
            if (timeUnit == null) {
                bmy.a("unit == null");
                return null;
            }
            if (this.b) {
                return f2gVar;
            }
            Handler handler = this.a;
            b bVar = new b(handler, runnable);
            Message messageObtain = Message.obtain(handler, bVar);
            messageObtain.obj = this;
            this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.b) {
                return bVar;
            }
            this.a.removeCallbacks(bVar);
            return f2gVar;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.b = true;
            this.a.removeCallbacksAndMessages(this);
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b;
        }
    }

    public static final class b implements Runnable, pse {
        public final Handler a;
        public final Runnable b;
        public volatile boolean c;

        public b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                o760.b(th);
            }
        }
    }

    public bdl(Handler handler) {
        this.c = handler;
    }

    @Override // defpackage.qm70
    public final qm70.c b() {
        return new a(this.c);
    }

    @Override // defpackage.qm70
    public final pse d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            bmy.a("unit == null");
            return null;
        }
        Handler handler = this.c;
        b bVar = new b(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, bVar), timeUnit.toMillis(j));
        return bVar;
    }
}
