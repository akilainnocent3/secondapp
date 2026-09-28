package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dol extends m12 {
    public boolean A = false;
    public boolean B = false;
    public final /* synthetic */ int y;
    public t6i0.a z;

    public /* synthetic */ dol(int i) {
        this.y = i;
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final Context getContext() {
        switch (this.y) {
            case 0:
                if (super.getContext() == null && !this.A) {
                    return null;
                }
                o0();
                return this.z;
            case 1:
                if (super.getContext() == null && !this.A) {
                    return null;
                }
                n0();
                return this.z;
            default:
                if (super.getContext() == null && !this.A) {
                    return null;
                }
                m0();
                return this.z;
        }
    }

    @Override // defpackage.bml
    public final void inject() {
        switch (this.y) {
            case 0:
                if (!this.B) {
                    this.B = true;
                    ((f57) generatedComponent()).S((d57) this);
                }
                break;
            case 1:
                if (!this.B) {
                    this.B = true;
                    ((wzy) generatedComponent()).O((vzy) this);
                }
                break;
            default:
                if (!this.B) {
                    this.B = true;
                    ((ei80) generatedComponent()).U((bi80) this);
                }
                break;
        }
    }

    public void m0() {
        if (this.z == null) {
            this.z = new t6i0.a(super.getContext(), this);
            this.A = uvi.a(super.getContext());
        }
    }

    public void n0() {
        if (this.z == null) {
            this.z = new t6i0.a(super.getContext(), this);
            this.A = uvi.a(super.getContext());
        }
    }

    public void o0() {
        if (this.z == null) {
            this.z = new t6i0.a(super.getContext(), this);
            this.A = uvi.a(super.getContext());
        }
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        boolean z = true;
        switch (this.y) {
            case 0:
                super.onAttach(activity);
                t6i0.a aVar = this.z;
                if (aVar != null && dvi.b(aVar) != activity) {
                    z = false;
                }
                z7b.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                o0();
                inject();
                break;
            case 1:
                super.onAttach(activity);
                t6i0.a aVar2 = this.z;
                if (aVar2 != null && dvi.b(aVar2) != activity) {
                    z = false;
                }
                z7b.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                n0();
                inject();
                break;
            default:
                super.onAttach(activity);
                t6i0.a aVar3 = this.z;
                if (aVar3 != null && dvi.b(aVar3) != activity) {
                    z = false;
                }
                z7b.c(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m0();
                inject();
                break;
        }
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        switch (this.y) {
            case 0:
                LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater, this));
            case 1:
                LayoutInflater layoutInflaterOnGetLayoutInflater2 = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater2.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater2, this));
            default:
                LayoutInflater layoutInflaterOnGetLayoutInflater3 = super.onGetLayoutInflater(bundle);
                return layoutInflaterOnGetLayoutInflater3.cloneInContext(new t6i0.a(layoutInflaterOnGetLayoutInflater3, this));
        }
    }

    @Override // defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        switch (this.y) {
            case 0:
                super.onAttach(context);
                o0();
                inject();
                break;
            case 1:
                super.onAttach(context);
                n0();
                inject();
                break;
            default:
                super.onAttach(context);
                m0();
                inject();
                break;
        }
    }
}
