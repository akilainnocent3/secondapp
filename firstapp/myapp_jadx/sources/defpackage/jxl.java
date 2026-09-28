package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.sportybet.plugin.myfavorite.fragment.MyStakeFragment;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jxl extends m12 {
    public boolean A;
    public t6i0.a y;
    public boolean z;

    public jxl() {
        this.z = false;
        this.A = false;
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        if (super.getContext() == null && !this.z) {
            return null;
        }
        m0();
        return this.y;
    }

    @Override // defpackage.bml
    public final void inject() {
        if (this.A) {
            return;
        }
        this.A = true;
        ((y1x) generatedComponent()).H1((MyStakeFragment) this);
    }

    public final void m0() {
        if (this.y == null) {
            this.y = new t6i0.a(super.getContext(), this);
            this.z = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        t6i0.a aVar = this.y;
        z7b.c(aVar == null || dvi.b(aVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        m0();
        inject();
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
    }

    public jxl(int i) {
        super(i);
        this.z = false;
        this.A = false;
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        m0();
        inject();
    }
}
