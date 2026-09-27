package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51611e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f51612f = 1500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51613g = 2750;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f51614h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Object f51615a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Handler f51616b = new Handler(Looper.getMainLooper(), new C0476a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public c f51617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public c f51618d;

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0476a implements Handler.Callback {
        public C0476a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(int i10);

        void show();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<b> f51620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f51622c;

        public c(int i10, b bVar) {
            this.f51620a = new WeakReference<>(bVar);
            this.f51621b = i10;
        }

        public boolean a(@Nullable b bVar) {
            return bVar != null && this.f51620a.get() == bVar;
        }
    }

    public static a c() {
        if (f51614h == null) {
            f51614h = new a();
        }
        return f51614h;
    }

    public final boolean a(@NonNull c cVar, int i10) {
        b bVar = cVar.f51620a.get();
        if (bVar == null) {
            return false;
        }
        this.f51616b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    public void b(b bVar, int i10) {
        synchronized (this.f51615a) {
            try {
                if (g(bVar)) {
                    a(this.f51617c, i10);
                } else if (h(bVar)) {
                    a(this.f51618d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(@NonNull c cVar) {
        synchronized (this.f51615a) {
            try {
                if (this.f51617c == cVar || this.f51618d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean zG;
        synchronized (this.f51615a) {
            zG = g(bVar);
        }
        return zG;
    }

    public boolean f(b bVar) {
        boolean z10;
        synchronized (this.f51615a) {
            try {
                z10 = g(bVar) || h(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final boolean g(b bVar) {
        c cVar = this.f51617c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean h(b bVar) {
        c cVar = this.f51618d;
        return cVar != null && cVar.a(bVar);
    }

    public void i(b bVar) {
        synchronized (this.f51615a) {
            try {
                if (g(bVar)) {
                    this.f51617c = null;
                    if (this.f51618d != null) {
                        o();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f51615a) {
            try {
                if (g(bVar)) {
                    m(this.f51617c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f51615a) {
            try {
                if (g(bVar)) {
                    c cVar = this.f51617c;
                    if (!cVar.f51622c) {
                        cVar.f51622c = true;
                        this.f51616b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f51615a) {
            try {
                if (g(bVar)) {
                    c cVar = this.f51617c;
                    if (cVar.f51622c) {
                        cVar.f51622c = false;
                        m(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(@NonNull c cVar) {
        int i10 = cVar.f51621b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : f51613g;
        }
        this.f51616b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f51616b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    public void n(int i10, b bVar) {
        synchronized (this.f51615a) {
            try {
                if (g(bVar)) {
                    c cVar = this.f51617c;
                    cVar.f51621b = i10;
                    this.f51616b.removeCallbacksAndMessages(cVar);
                    m(this.f51617c);
                    return;
                }
                if (h(bVar)) {
                    this.f51618d.f51621b = i10;
                } else {
                    this.f51618d = new c(i10, bVar);
                }
                c cVar2 = this.f51617c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f51617c = null;
                    o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o() {
        c cVar = this.f51618d;
        if (cVar != null) {
            this.f51617c = cVar;
            this.f51618d = null;
            b bVar = cVar.f51620a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f51617c = null;
            }
        }
    }
}
