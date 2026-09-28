package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iny {
    public final Runnable a;
    public final gx0<cny> b;
    public cny c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public static final class a {
        public static void a(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
        }

        public static void b(Object obj, Object obj2) {
            obj.getClass();
            obj2.getClass();
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class b {
    }

    public final class c implements cbs, yb6 {
        public final s9s a;
        public final cny b;
        public d c;
        public final /* synthetic */ iny d;

        public c(iny inyVar, s9s s9sVar, cny cnyVar) {
            cnyVar.getClass();
            this.d = inyVar;
            this.a = s9sVar;
            this.b = cnyVar;
            s9sVar.a(this);
        }

        @Override // defpackage.cbs
        public final void F0(ibs ibsVar, s9s.a aVar) {
            if (aVar == s9s.a.ON_START) {
                this.c = this.d.b(this.b);
                return;
            }
            if (aVar != s9s.a.ON_STOP) {
                if (aVar == s9s.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.c;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }

        @Override // defpackage.yb6
        public final void cancel() {
            this.a.d(this);
            cny cnyVar = this.b;
            cnyVar.getClass();
            cnyVar.b.remove(this);
            d dVar = this.c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.c = null;
        }
    }

    public final class d implements yb6 {
        public final cny a;
        public final /* synthetic */ iny b;

        public d(iny inyVar, cny cnyVar) {
            cnyVar.getClass();
            this.b = inyVar;
            this.a = cnyVar;
        }

        @Override // defpackage.yb6
        public final void cancel() {
            iny inyVar = this.b;
            gx0<cny> gx0Var = inyVar.b;
            cny cnyVar = this.a;
            gx0Var.remove(cnyVar);
            if (Intrinsics.g(inyVar.c, cnyVar)) {
                cnyVar.a();
                inyVar.c = null;
            }
            cnyVar.getClass();
            cnyVar.b.remove(this);
            Function0<Unit> function0 = cnyVar.c;
            if (function0 != null) {
                function0.invoke();
            }
            cnyVar.c = null;
        }
    }

    public /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((iny) this.receiver).f();
            return Unit.a;
        }
    }

    public iny(Runnable runnable) {
        OnBackInvokedCallback jnyVar;
        this.a = runnable;
        this.b = new gx0<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                jnyVar = new jny(new trp(this, 1), new dny(this), new eny(this), new fny(this));
            } else {
                final gny gnyVar = new gny(this);
                jnyVar = new OnBackInvokedCallback() { // from class: hny
                    public final void onBackInvoked() {
                        gnyVar.invoke();
                    }
                };
            }
            this.d = jnyVar;
        }
    }

    public final void a(ibs ibsVar, cny cnyVar) {
        ibsVar.getClass();
        cnyVar.getClass();
        s9s lifecycle = ibsVar.getLifecycle();
        if (lifecycle.b() == s9s.b.a) {
            return;
        }
        cnyVar.b.add(new c(this, lifecycle, cnyVar));
        f();
        cnyVar.c = new e(0, this, iny.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    public final d b(cny cnyVar) {
        cnyVar.getClass();
        this.b.addLast(cnyVar);
        d dVar = new d(this, cnyVar);
        cnyVar.b.add(dVar);
        f();
        cnyVar.c = new kny(0, this, iny.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        return dVar;
    }

    public final void c() {
        cny cnyVarPrevious;
        cny cnyVar = this.c;
        if (cnyVar == null) {
            gx0<cny> gx0Var = this.b;
            ListIterator<cny> listIterator = gx0Var.listIterator(gx0Var.size());
            do {
                if (!listIterator.hasPrevious()) {
                    cnyVarPrevious = null;
                    break;
                }
                cnyVarPrevious = listIterator.previous();
            } while (!cnyVarPrevious.a);
            cnyVar = cnyVarPrevious;
        }
        this.c = null;
        if (cnyVar != null) {
            cnyVar.a();
        }
    }

    public final void d() {
        cny cnyVarPrevious;
        cny cnyVar = this.c;
        if (cnyVar == null) {
            gx0<cny> gx0Var = this.b;
            ListIterator<cny> listIterator = gx0Var.listIterator(gx0Var.getB());
            do {
                if (!listIterator.hasPrevious()) {
                    cnyVarPrevious = null;
                    break;
                }
                cnyVarPrevious = listIterator.previous();
            } while (!cnyVarPrevious.a);
            cnyVar = cnyVarPrevious;
        }
        this.c = null;
        if (cnyVar != null) {
            cnyVar.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        if (z && !this.f) {
            a.a(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            a.b(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void f() {
        boolean z = this.g;
        boolean z2 = false;
        gx0<cny> gx0Var = this.b;
        if (gx0Var == null || !gx0Var.isEmpty()) {
            Iterator<cny> it = gx0Var.iterator();
            while (it.hasNext()) {
                if (it.next().a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        e(z2);
    }

    public iny() {
        this(null);
    }
}
