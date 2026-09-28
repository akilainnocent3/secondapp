package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wpl extends qyd {
    public t6i0.a c0;
    public boolean d0 = false;
    public boolean e0 = false;

    public final void R0() {
        if (this.c0 == null) {
            this.c0 = new t6i0.a(super.getContext(), this);
            this.d0 = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.d0) {
            return null;
        }
        R0();
        return this.c0;
    }

    @Override // defpackage.jml
    public final void inject() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ((wyd) generatedComponent()).j2((vyd) this);
    }

    @Override // defpackage.jml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.c0;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        R0();
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
        R0();
        inject();
    }
}
