package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import defpackage.ac;
import defpackage.det;
import defpackage.es0;
import defpackage.lq0;
import defpackage.tx0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final ExecutorC0030c a = new ExecutorC0030c(new d());
    public static int b = -100;
    public static det c = null;
    public static det d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final tx0<WeakReference<c>> i = new tx0<>(0);
    public static final Object v = new Object();
    public static final Object w = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.c$c, reason: collision with other inner class name */
    public static class ExecutorC0030c implements Executor {
        public final Object a = new Object();
        public final ArrayDeque b = new ArrayDeque();
        public final d c;
        public Runnable d;

        public ExecutorC0030c(d dVar) {
            this.c = dVar;
        }

        public final void a() {
            synchronized (this.a) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    this.d = runnable;
                    if (runnable != null) {
                        this.c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            synchronized (this.a) {
                try {
                    this.b.add(new lq0(0, this, runnable));
                    if (this.d == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void B(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (b != i2) {
            b = i2;
            synchronized (v) {
                try {
                    tx0<WeakReference<c>> tx0Var = i;
                    tx0Var.getClass();
                    tx0.a aVar = new tx0.a();
                    while (aVar.hasNext()) {
                        c cVar = (c) ((WeakReference) aVar.next()).get();
                        if (cVar != null) {
                            cVar.d();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static boolean o(Context context) {
        if (e == null) {
            try {
                int i2 = es0.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) es0.class), es0.a.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(c cVar) {
        synchronized (v) {
            try {
                tx0<WeakReference<c>> tx0Var = i;
                tx0Var.getClass();
                tx0.a aVar = new tx0.a();
                while (aVar.hasNext()) {
                    c cVar2 = (c) ((WeakReference) aVar.next()).get();
                    if (cVar2 == cVar || cVar2 == null) {
                        aVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void A(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void C(Toolbar toolbar);

    public void D(int i2) {
    }

    public abstract void E(CharSequence charSequence);

    public abstract ac F(ac.a aVar);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public Context e(Context context) {
        return context;
    }

    public abstract View f(String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T g(int i2);

    public Context h() {
        return null;
    }

    public abstract AppCompatDelegateImpl.b i();

    public int j() {
        return -100;
    }

    public abstract MenuInflater k();

    public abstract ActionBar l();

    public abstract void m();

    public abstract void n();

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return f(str, context, attributeSet);
    }

    public abstract void p(Configuration configuration);

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract boolean x(int i2);

    public abstract void y(int i2);

    public abstract void z(View view);
}
