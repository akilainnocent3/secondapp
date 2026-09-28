package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a5m extends w32 {
    public t6i0.a w;
    public boolean y = false;
    public boolean z = false;

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.y) {
            return null;
        }
        u0();
        return this.w;
    }

    @Override // defpackage.gml
    public final void inject() {
        if (this.z) {
            return;
        }
        this.z = true;
        ((cbf0) generatedComponent()).G((zaf0) this);
    }

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.w;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        u0();
        inject();
    }

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void u0() {
        if (this.w == null) {
            this.w = new t6i0.a(super.getContext(), this);
            this.y = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        u0();
        inject();
    }
}
