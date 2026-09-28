package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import defpackage.g6i0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b4m<VB extends g6i0> extends wfd0<VB> implements j1k {
    public t6i0.a e;
    public boolean f;
    public volatile dvi i;
    public final Object v;
    public boolean w;

    public b4m(gaj<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> gajVar) {
        super(gajVar);
        this.f = false;
        this.v = new Object();
        this.w = false;
    }

    @Override // defpackage.j1k
    public final dvi componentManager() {
        if (this.i == null) {
            synchronized (this.v) {
                try {
                    if (this.i == null) {
                        this.i = new dvi(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.f) {
            return null;
        }
        o0();
        return this.e;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.iel
    public final r8i0.c getDefaultViewModelProviderFactory() {
        return ejd.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void o0() {
        if (this.e == null) {
            this.e = new t6i0.a(super.getContext(), this);
            this.f = uvi.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.e;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        if (this.w) {
            return;
        }
        this.w = true;
        ((irc0) generatedComponent()).T1((SportyMediaHostFragment) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        o0();
        if (this.w) {
            return;
        }
        this.w = true;
        ((irc0) generatedComponent()).T1((SportyMediaHostFragment) this);
    }
}
