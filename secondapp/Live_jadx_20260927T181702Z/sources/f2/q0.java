package f2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f82461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<u0> f82462b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<u0, a> f82463c = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.r f82464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.x f82465b;

        public a(@NonNull androidx.lifecycle.r rVar, @NonNull androidx.lifecycle.x xVar) {
            this.f82464a = rVar;
            this.f82465b = xVar;
            rVar.addObserver(xVar);
        }

        public void a() {
            this.f82464a.removeObserver(this.f82465b);
            this.f82465b = null;
        }
    }

    public q0(@NonNull Runnable runnable) {
        this.f82461a = runnable;
    }

    public static /* synthetic */ void a(q0 q0Var, androidx.lifecycle.r.b bVar, u0 u0Var, androidx.lifecycle.b0 b0Var, androidx.lifecycle.r.a aVar) {
        q0Var.getClass();
        if (aVar == androidx.lifecycle.r.a.i(bVar)) {
            q0Var.c(u0Var);
            return;
        }
        if (aVar == androidx.lifecycle.r.a.ON_DESTROY) {
            q0Var.j(u0Var);
        } else if (aVar == androidx.lifecycle.r.a.e(bVar)) {
            q0Var.f82462b.remove(u0Var);
            q0Var.f82461a.run();
        }
    }

    public static /* synthetic */ void b(q0 q0Var, u0 u0Var, androidx.lifecycle.b0 b0Var, androidx.lifecycle.r.a aVar) {
        q0Var.getClass();
        if (aVar == androidx.lifecycle.r.a.ON_DESTROY) {
            q0Var.j(u0Var);
        }
    }

    public void c(@NonNull u0 u0Var) {
        this.f82462b.add(u0Var);
        this.f82461a.run();
    }

    public void d(@NonNull final u0 u0Var, @NonNull androidx.lifecycle.b0 b0Var) {
        c(u0Var);
        androidx.lifecycle.r lifecycle = b0Var.getLifecycle();
        a aVarRemove = this.f82463c.remove(u0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f82463c.put(u0Var, new a(lifecycle, new androidx.lifecycle.x() { // from class: f2.p0
            @Override // androidx.lifecycle.x
            public final void onStateChanged(androidx.lifecycle.b0 b0Var2, androidx.lifecycle.r.a aVar) {
                q0.b(this.f82454b, u0Var, b0Var2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(@NonNull final u0 u0Var, @NonNull androidx.lifecycle.b0 b0Var, @NonNull final androidx.lifecycle.r.b bVar) {
        androidx.lifecycle.r lifecycle = b0Var.getLifecycle();
        a aVarRemove = this.f82463c.remove(u0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f82463c.put(u0Var, new a(lifecycle, new androidx.lifecycle.x() { // from class: f2.o0
            @Override // androidx.lifecycle.x
            public final void onStateChanged(androidx.lifecycle.b0 b0Var2, androidx.lifecycle.r.a aVar) {
                q0.a(this.f82450b, bVar, u0Var, b0Var2, aVar);
            }
        }));
    }

    public void f(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<u0> it = this.f82462b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void g(@NonNull Menu menu) {
        Iterator<u0> it = this.f82462b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean h(@NonNull MenuItem menuItem) {
        Iterator<u0> it = this.f82462b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(@NonNull Menu menu) {
        Iterator<u0> it = this.f82462b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void j(@NonNull u0 u0Var) {
        this.f82462b.remove(u0Var);
        a aVarRemove = this.f82463c.remove(u0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f82461a.run();
    }
}
