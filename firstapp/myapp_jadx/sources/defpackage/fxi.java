package defpackage;

import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.n;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class fxi extends loz {
    public final FragmentManager b;
    public a c = null;
    public Fragment d = null;
    public boolean e;

    @Deprecated
    public fxi(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // defpackage.loz
    public void a(ViewPager viewPager, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        a aVarA = this.c;
        if (aVarA == null) {
            FragmentManager fragmentManager = this.b;
            aVarA = oke.a(fragmentManager, fragmentManager);
            this.c = aVarA;
        }
        aVarA.m(fragment);
        if (fragment.equals(this.d)) {
            this.d = null;
        }
    }

    @Override // defpackage.loz
    public final void b() {
        a aVar = this.c;
        if (aVar != null) {
            if (!this.e) {
                try {
                    this.e = true;
                    if (aVar.i) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.j = false;
                    aVar.t.D(aVar, true);
                    this.e = false;
                } catch (Throwable th) {
                    this.e = false;
                    throw th;
                }
            }
            this.c = null;
        }
    }

    @Override // defpackage.loz
    public Object f(ViewPager viewPager, int i) {
        a aVar = this.c;
        FragmentManager fragmentManager = this.b;
        if (aVar == null) {
            this.c = oke.a(fragmentManager, fragmentManager);
        }
        long j = i;
        Fragment fragmentH = fragmentManager.H("android:switcher:" + viewPager.getId() + ":" + j);
        if (fragmentH != null) {
            a aVar2 = this.c;
            aVar2.getClass();
            aVar2.b(new n.a(fragmentH, 7));
        } else {
            fragmentH = l(i);
            this.c.e(viewPager.getId(), fragmentH, "android:switcher:" + viewPager.getId() + ":" + j, 1);
        }
        if (fragmentH != this.d) {
            fragmentH.setMenuVisibility(false);
            fragmentH.setUserVisibleHint(false);
        }
        return fragmentH;
    }

    @Override // defpackage.loz
    public final boolean g(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // defpackage.loz
    public final Parcelable i() {
        return null;
    }

    @Override // defpackage.loz
    public void j(ViewPager viewPager, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.d;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.d.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.d = fragment;
        }
    }

    @Override // defpackage.loz
    public final void k(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        lx5.b(this, "ViewPager with adapter ", " requires a view id");
    }

    public abstract Fragment l(int i);

    @Override // defpackage.loz
    public final void h(Parcelable parcelable, ClassLoader classLoader) {
    }
}
