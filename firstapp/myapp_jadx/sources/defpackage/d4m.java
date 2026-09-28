package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d4m extends Fragment implements j1k {
    public t6i0.a a;
    public boolean b;
    public volatile dvi c;
    public final Object d;
    public boolean e;

    public d4m() {
        this.b = false;
        this.d = new Object();
        this.e = false;
    }

    @Override // defpackage.j1k
    public final dvi componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = new dvi(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.b) {
            return null;
        }
        j0();
        return this.a;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.iel
    public final r8i0.c getDefaultViewModelProviderFactory() {
        return ejd.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void j0() {
        if (this.a == null) {
            this.a = new t6i0.a(super.getContext(), this);
            this.b = uvi.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.a;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j0();
        if (this.e) {
            return;
        }
        this.e = true;
        ((qsc0) generatedComponent()).r2((SportyNewsListFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public d4m(int i) {
        super(i);
        this.b = false;
        this.d = new Object();
        this.e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        j0();
        if (this.e) {
            return;
        }
        this.e = true;
        ((qsc0) generatedComponent()).r2((SportyNewsListFragment) this);
    }
}
