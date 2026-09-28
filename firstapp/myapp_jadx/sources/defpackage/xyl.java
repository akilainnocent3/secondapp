package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xyl extends uzz {
    public t6i0.a D;
    public boolean E = false;
    public boolean F = false;

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.E) {
            return null;
        }
        o0();
        return this.D;
    }

    @Override // defpackage.czl, defpackage.bml
    public final void inject() {
        if (this.F) {
            return;
        }
        this.F = true;
        ((lhz) generatedComponent()).K1((khz) this);
    }

    public final void o0() {
        if (this.D == null) {
            this.D = new t6i0.a(super.getContext(), this);
            this.E = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.D;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        inject();
    }

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        o0();
        inject();
    }
}
