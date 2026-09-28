package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class zxi extends FragmentManager.l {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;

    public zxi(yxi yxiVar, Fragment fragment, FrameLayout frameLayout) {
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void e(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.a) {
            fragmentManager.t0(this);
            yxi.i(view, this.b);
        }
    }
}
