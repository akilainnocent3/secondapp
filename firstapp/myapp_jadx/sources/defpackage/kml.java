package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kml extends s62 {
    public t6i0.a T;
    public boolean U;
    public boolean V;

    public final void M0() {
        if (this.T == null) {
            this.T = new t6i0.a(super.getContext(), this);
            this.U = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.U) {
            return null;
        }
        M0();
        return this.T;
    }

    @Override // defpackage.jml
    public void inject() {
        if (this.V) {
            return;
        }
        this.V = true;
        ((k82) generatedComponent()).r((j82) this);
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.T;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        M0();
        inject();
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        M0();
        inject();
    }
}
