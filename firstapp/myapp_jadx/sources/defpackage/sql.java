package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class sql extends w32 {
    public t6i0.a w;
    public boolean y = false;
    public boolean z = false;

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.y) {
            return null;
        }
        initializeComponentContext();
        return this.w;
    }

    public final void initializeComponentContext() {
        if (this.w == null) {
            this.w = new t6i0.a(super.getContext(), this);
            this.y = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.gml
    public final void inject() {
        if (this.z) {
            return;
        }
        this.z = true;
        ((l0g) generatedComponent()).N0((i0g) this);
    }

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.w;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.gml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }
}
