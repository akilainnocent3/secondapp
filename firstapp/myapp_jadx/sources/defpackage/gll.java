package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gll extends jr10 implements j1k {
    public t6i0.a b;
    public volatile dvi d;
    public boolean c = false;
    public final Object e = new Object();
    public boolean f = false;

    @Override // defpackage.j1k
    public final dvi componentManager() {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.d = new dvi(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.c) {
            return null;
        }
        j0();
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment, defpackage.iel
    public final r8i0.c getDefaultViewModelProviderFactory() {
        return ejd.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void j0() {
        if (this.b == null) {
            this.b = new t6i0.a(super.getContext(), this);
            this.c = uvi.a(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.b;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        j0();
        if (this.f) {
            return;
        }
        this.f = true;
        ((w0) generatedComponent()).J0((v0) this);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        j0();
        if (this.f) {
            return;
        }
        this.f = true;
        ((w0) generatedComponent()).J0((v0) this);
    }
}
