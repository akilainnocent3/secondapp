package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public static h e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new a());
    public c c;
    public c d;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            h hVar = h.this;
            c cVar = (c) message.obj;
            synchronized (hVar.a) {
                try {
                    if (hVar.c == cVar || hVar.d == cVar) {
                        hVar.a(cVar, 2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    public interface b {
        void a();

        void b(int i);
    }

    public static class c {
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public c(int i, BaseTransientBottomBar.e eVar) {
            this.a = new WeakReference<>(eVar);
            this.b = i;
        }
    }

    public static h b() {
        h hVar = e;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        e = hVar2;
        return hVar2;
    }

    public final boolean a(c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.b(i);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.c;
        return (cVar == null || bVar == null || cVar.a.get() != bVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.e eVar) {
        synchronized (this.a) {
            try {
                if (c(eVar)) {
                    c cVar = this.c;
                    if (!cVar.c) {
                        cVar.c = true;
                        this.b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(BaseTransientBottomBar.e eVar) {
        synchronized (this.a) {
            try {
                if (c(eVar)) {
                    c cVar = this.c;
                    if (cVar.c) {
                        cVar.c = false;
                        f(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }
}
