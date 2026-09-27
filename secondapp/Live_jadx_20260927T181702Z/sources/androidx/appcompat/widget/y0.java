package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
public interface y0 {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    void e(Menu menu, androidx.appcompat.view.menu.j.a aVar);

    void f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    boolean hasIcon();

    void i(SparseArray<Parcelable> sparseArray);

    void l(SparseArray<Parcelable> sparseArray);

    void n(int i10);

    void p();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setLogo(int i10);

    void setUiOptions(int i10);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
