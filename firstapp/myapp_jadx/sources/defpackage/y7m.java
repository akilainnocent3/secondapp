package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y7m extends j82 {
    public t6i0.a X;
    public boolean Y;
    public boolean Z;

    public final void U0() {
        if (this.X == null) {
            this.X = new t6i0.a(super.getContext(), this);
            this.Y = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.kml, defpackage.jml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.Y) {
            return null;
        }
        U0();
        return this.X;
    }

    @Override // defpackage.kml, defpackage.jml
    public final void inject() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        ((umj0) generatedComponent()).f0((tmj0) this);
    }

    @Override // defpackage.kml, defpackage.jml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.X;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        U0();
        inject();
    }

    @Override // defpackage.kml, defpackage.jml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.kml, defpackage.jml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        U0();
        inject();
    }
}
