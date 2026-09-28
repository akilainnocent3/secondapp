package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import defpackage.hce0;
import defpackage.loz;
import defpackage.lx5;
import defpackage.oke;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class l extends loz {
    public final FragmentManager b;
    public a c = null;
    public final ArrayList<Fragment.SavedState> d = new ArrayList<>();
    public final ArrayList<Fragment> e = new ArrayList<>();
    public Fragment f = null;
    public boolean g;

    @Deprecated
    public l(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // defpackage.loz
    public final void a(ViewPager viewPager, int i, Object obj) {
        ArrayList<Fragment.SavedState> arrayList;
        Fragment fragment = (Fragment) obj;
        a aVar = this.c;
        FragmentManager fragmentManager = this.b;
        if (aVar == null) {
            this.c = oke.a(fragmentManager, fragmentManager);
        }
        while (true) {
            arrayList = this.d;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, fragment.isAdded() ? fragmentManager.j0(fragment) : null);
        this.e.set(i, null);
        this.c.p(fragment);
        if (fragment.equals(this.f)) {
            this.f = null;
        }
    }

    @Override // defpackage.loz
    public final void b() {
        a aVar = this.c;
        if (aVar != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    if (aVar.i) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.j = false;
                    aVar.t.D(aVar, true);
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            }
            this.c = null;
        }
    }

    @Override // defpackage.loz
    public final Object f(ViewPager viewPager, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList.size() > i && (fragment = arrayList.get(i)) != null) {
            return fragment;
        }
        if (this.c == null) {
            FragmentManager fragmentManager = this.b;
            this.c = oke.a(fragmentManager, fragmentManager);
        }
        Fragment fragmentL = l(i);
        ArrayList<Fragment.SavedState> arrayList2 = this.d;
        if (arrayList2.size() > i && (savedState = arrayList2.get(i)) != null) {
            fragmentL.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i) {
            arrayList.add(null);
        }
        fragmentL.setMenuVisibility(false);
        fragmentL.setUserVisibleHint(false);
        arrayList.set(i, fragmentL);
        this.c.e(viewPager.getId(), fragmentL, null, 1);
        return fragmentL;
    }

    @Override // defpackage.loz
    public final boolean g(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // defpackage.loz
    public final void h(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<Fragment.SavedState> arrayList = this.d;
            arrayList.clear();
            ArrayList<Fragment> arrayList2 = this.e;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = Integer.parseInt(str.substring(1));
                    Fragment fragmentM = this.b.M(str, bundle);
                    if (fragmentM != null) {
                        while (arrayList2.size() <= i) {
                            arrayList2.add(null);
                        }
                        fragmentM.setMenuVisibility(false);
                        arrayList2.set(i, fragmentM);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key ".concat(str));
                    }
                }
            }
        }
    }

    @Override // defpackage.loz
    public final Parcelable i() {
        Bundle bundle;
        ArrayList<Fragment.SavedState> arrayList = this.d;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList<Fragment> arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = arrayList2.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.b.d0(bundle, hce0.a(i, "f"), fragment);
            }
            i++;
        }
    }

    @Override // defpackage.loz
    public final void j(ViewPager viewPager, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f = fragment;
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
}
