package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class ac {
    public Object a;
    public boolean b;

    public interface a {
        boolean a(ac acVar, f fVar);

        boolean b(ac acVar, MenuItem menuItem);

        void c(ac acVar);

        boolean d(ac acVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract f e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void k(View view);

    public abstract void l(int i);

    public abstract void m(CharSequence charSequence);

    public abstract void n(int i);

    public abstract void o(CharSequence charSequence);

    public abstract void p(boolean z);
}
