package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
public interface l5d {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g(int i);

    Context getContext();

    CharSequence getTitle();

    g9i0 h(int i, long j);

    void i();

    void j(boolean z);

    void k();

    void l();

    void m(int i);

    int n();

    void o();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setMenu(Menu menu, j.a aVar);

    void setMenuPrepared();

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
