package defpackage;

import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qq0 extends j9i0 {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public qq0(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // defpackage.i9i0
    public final void a() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.K.setAlpha(1.0f);
        appCompatDelegateImpl.N.d(null);
        appCompatDelegateImpl.N = null;
    }

    @Override // defpackage.j9i0, defpackage.i9i0
    public final void c() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.K.setVisibility(0);
        if (appCompatDelegateImpl.K.getParent() instanceof View) {
            View view = (View) appCompatDelegateImpl.K.getParent();
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.c.c(view);
        }
    }
}
