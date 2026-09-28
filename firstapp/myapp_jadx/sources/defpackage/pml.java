package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pml extends k12 {
    public t6i0.a y;
    public boolean z = false;
    public boolean A = false;

    @Override // defpackage.aml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.z) {
            return null;
        }
        o0();
        return this.y;
    }

    @Override // defpackage.aml
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((fe3) generatedComponent()).c0((yd3) this);
    }

    public final void o0() {
        if (this.y == null) {
            this.y = new t6i0.a(super.getContext(), this);
            this.z = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.aml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.y;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        inject();
    }

    @Override // defpackage.aml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.aml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        o0();
        inject();
    }
}
