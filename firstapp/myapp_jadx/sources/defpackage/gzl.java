package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gzl extends lrd {
    public t6i0.a d0;
    public boolean e0;
    public boolean f0;

    public final void C1() {
        if (this.d0 == null) {
            this.d0 = new t6i0.a(super.getContext(), this);
            this.e0 = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.e0) {
            return null;
        }
        C1();
        return this.d0;
    }

    @Override // defpackage.dzl, defpackage.bml
    public final void inject() {
        if (this.f0) {
            return;
        }
        this.f0 = true;
        ((ab00) generatedComponent()).Y0((za00) this);
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.d0;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        C1();
        inject();
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.lrd
    public void u1() {
        a1();
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C1();
        inject();
    }
}
