package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ypl extends g02 {
    public t6i0.a b0;
    public boolean c0;
    public boolean d0;

    public final void Q0() {
        if (this.b0 == null) {
            this.b0 = new t6i0.a(super.getContext(), this);
            this.c0 = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.c0) {
            return null;
        }
        Q0();
        return this.b0;
    }

    @Override // defpackage.jml
    public final void inject() {
        if (this.d0) {
            return;
        }
        this.d0 = true;
        ((n1e) generatedComponent()).P1((m1e) this);
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.b0;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Q0();
        inject();
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Q0();
        inject();
    }
}
