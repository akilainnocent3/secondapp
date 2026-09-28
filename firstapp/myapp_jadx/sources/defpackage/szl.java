package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class szl extends c000 {
    public t6i0.a Q;
    public boolean R;
    public boolean S;

    public final void a1() {
        if (this.Q == null) {
            this.Q = new t6i0.a(super.getContext(), this);
            this.R = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.R) {
            return null;
        }
        a1();
        return this.Q;
    }

    @Override // defpackage.dzl, defpackage.bml
    public final void inject() {
        if (this.S) {
            return;
        }
        this.S = true;
        ((rc10) generatedComponent()).V1((PixBtgWithdrawFragment) this);
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.Q;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a1();
        inject();
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // defpackage.dzl, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        a1();
        inject();
    }
}
