package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fyl extends nkj0 {
    public t6i0.a E;
    public boolean F = false;
    public boolean G = false;

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.F) {
            return null;
        }
        p0();
        return this.E;
    }

    @Override // defpackage.czl, defpackage.bml
    public final void inject() {
        if (this.G) {
            return;
        }
        this.G = true;
        ((i8y) generatedComponent()).y1((h8y) this);
    }

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.E;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p0();
        inject();
    }

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p0() {
        if (this.E == null) {
            this.E = new t6i0.a(super.getContext(), this);
            this.F = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.czl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p0();
        inject();
    }
}
