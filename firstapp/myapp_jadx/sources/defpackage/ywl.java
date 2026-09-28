package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ywl extends lsj0 {
    public t6i0.a Z;
    public boolean a0;
    public boolean b0;

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.a0) {
            return null;
        }
        v1();
        return this.Z;
    }

    @Override // defpackage.dzl, defpackage.bml
    public final void inject() {
        if (this.b0) {
            return;
        }
        this.b0 = true;
        ((b0w) generatedComponent()).L1((a0w) this);
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.Z;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        v1();
        inject();
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void v1() {
        if (this.Z == null) {
            this.Z = new t6i0.a(super.getContext(), this);
            this.a0 = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        v1();
        inject();
    }
}
