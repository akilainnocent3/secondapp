package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12335a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12336b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12337c = 6;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        b3 getTitleViewAdapter();
    }

    public Drawable a() {
        return null;
    }

    public SearchOrbView.a b() {
        return null;
    }

    public abstract View c();

    public CharSequence d() {
        return null;
    }

    public void g(View.OnClickListener onClickListener) {
        View viewC = c();
        if (viewC != null) {
            viewC.setOnClickListener(onClickListener);
        }
    }

    public void e(boolean z10) {
    }

    public void f(Drawable drawable) {
    }

    public void h(SearchOrbView.a aVar) {
    }

    public void i(CharSequence charSequence) {
    }

    public void j(int i10) {
    }
}
