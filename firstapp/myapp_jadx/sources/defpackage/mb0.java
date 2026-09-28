package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class mb0 {
    public final WeakReference<a840> a;
    public final a b;
    public final b c = new b();
    public Context d;
    public boolean e;

    public final class a implements w8d {
        public final double a;

        public a(a840 a840Var) {
            a840.a aVar = a840Var.a;
            p4h.b<Integer> bVar = u9n.a;
            Object obj = aVar.b.n.a.get(u9n.d);
            this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
        }

        public final void a(Context context) {
            double d = this.a;
            if (d == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            mb0 mb0Var = mb0.this;
            a840 a840Var = mb0Var.a.get();
            if (a840Var == null) {
                mb0Var.a();
                return;
            }
            vlv vlvVarD = a840Var.d();
            if (vlvVarD != null) {
                vlvVarD.c((long) (d * vlvVarD.d()));
                kgt kgtVar = a840Var.a.g;
                if (kgtVar != null) {
                    kgt.a aVar = kgt.a.a;
                    if (kgtVar.a().compareTo(aVar) <= 0) {
                        kgtVar.b("AndroidSystemCallbacks", aVar, "Restricting " + vlvVarD + "'s max size to " + vlvVarD.e() + " bytes.", null);
                    }
                }
            }
        }

        public final void b(Context context) {
            if (this.a == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            mb0 mb0Var = mb0.this;
            a840 a840Var = mb0Var.a.get();
            if (a840Var == null) {
                mb0Var.a();
                return;
            }
            vlv vlvVarD = a840Var.d();
            if (vlvVarD != null) {
                vlvVarD.c(vlvVarD.d());
                kgt kgtVar = a840Var.a.g;
                if (kgtVar != null) {
                    kgt.a aVar = kgt.a.a;
                    if (kgtVar.a().compareTo(aVar) <= 0) {
                        kgtVar.b("AndroidSystemCallbacks", aVar, "Restoring " + vlvVarD + "'s max size to " + vlvVarD.e() + " bytes.", null);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            b(activity);
        }
    }

    public final class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
            mb0 mb0Var = mb0.this;
            synchronized (mb0Var) {
                if (mb0Var.a.get() == null) {
                    mb0Var.a();
                }
                Unit unit = Unit.a;
            }
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            vlv vlvVarD;
            mb0 mb0Var = mb0.this;
            synchronized (mb0Var) {
                try {
                    a840 a840Var = mb0Var.a.get();
                    if (a840Var != null) {
                        kgt kgtVar = a840Var.a.g;
                        if (kgtVar != null) {
                            kgt.a aVar = kgt.a.a;
                            if (kgtVar.a().compareTo(aVar) <= 0) {
                                kgtVar.b("AndroidSystemCallbacks", aVar, "trimMemory, level=" + i, null);
                            }
                        }
                        if (i >= 40) {
                            vlv vlvVarD2 = a840Var.d();
                            if (vlvVarD2 != null) {
                                vlvVarD2.clear();
                            }
                        } else if (i >= 20) {
                            mb0Var.b.a(a840Var.a.a);
                        } else if (i >= 10 && (vlvVarD = a840Var.d()) != null) {
                            vlvVarD.g(vlvVarD.a() / 2);
                        }
                    } else {
                        mb0Var.a();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public mb0(a840 a840Var) {
        this.a = new WeakReference<>(a840Var);
        this.b = new a(a840Var);
    }

    public final synchronized void a() {
        try {
            if (this.e) {
                return;
            }
            this.e = true;
            Context context = this.d;
            if (context != null) {
                this.b.b(context);
                context.unregisterComponentCallbacks(this.c);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
