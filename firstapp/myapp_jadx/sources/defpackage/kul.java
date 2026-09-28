package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sportybet.android.account.latam.signup.presentation.LatamSignUpEmailFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class kul<StateCompose> extends zuw<StateCompose> {
    public t6i0.a y;
    public boolean z = false;
    public boolean A = false;

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.z) {
            return null;
        }
        p0();
        return this.y;
    }

    @Override // defpackage.bml
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((bpr) generatedComponent()).d0((LatamSignUpEmailFragment) this);
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.y;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p0();
        inject();
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public final void p0() {
        if (this.y == null) {
            this.y = new t6i0.a(super.getContext(), this);
            this.z = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p0();
        inject();
    }
}
