package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ann extends h8j0.b implements Runnable, zmy, View.OnAttachStateChangeListener {
    public final q8j0 c;
    public boolean d;
    public boolean e;
    public l8j0 f;

    public ann(q8j0 q8j0Var) {
        super(!q8j0Var.s ? 1 : 0);
        this.c = q8j0Var;
    }

    @Override // h8j0.b
    public final void a(h8j0 h8j0Var) {
        this.d = false;
        this.e = false;
        l8j0 l8j0Var = this.f;
        if (h8j0Var.a.b() > 0 && l8j0Var != null) {
            l8j0.l lVar = l8j0Var.a;
            q8j0 q8j0Var = this.c;
            q8j0Var.r.f(z8j0.a(lVar.g(8)));
            q8j0Var.q.f(z8j0.a(lVar.g(8)));
            q8j0.a(q8j0Var, l8j0Var);
        }
        this.f = null;
    }

    @Override // defpackage.zmy
    public final l8j0 b(View view, l8j0 l8j0Var) {
        this.f = l8j0Var;
        q8j0 q8j0Var = this.c;
        bvh0 bvh0Var = q8j0Var.q;
        l8j0.l lVar = l8j0Var.a;
        bvh0Var.f(z8j0.a(lVar.g(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            q8j0Var.r.f(z8j0.a(lVar.g(8)));
            q8j0.a(q8j0Var, l8j0Var);
        }
        return q8j0Var.s ? l8j0.b : l8j0Var;
    }

    @Override // h8j0.b
    public final void c(h8j0 h8j0Var) {
        this.d = true;
        this.e = true;
    }

    @Override // h8j0.b
    public final l8j0 d(l8j0 l8j0Var, List<h8j0> list) {
        q8j0 q8j0Var = this.c;
        q8j0.a(q8j0Var, l8j0Var);
        return q8j0Var.s ? l8j0.b : l8j0Var;
    }

    @Override // h8j0.b
    public final h8j0.a e(h8j0 h8j0Var, h8j0.a aVar) {
        this.d = false;
        return aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            l8j0 l8j0Var = this.f;
            if (l8j0Var != null) {
                q8j0 q8j0Var = this.c;
                q8j0Var.r.f(z8j0.a(l8j0Var.a.g(8)));
                q8j0.a(q8j0Var, l8j0Var);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
