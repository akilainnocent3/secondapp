package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h42 extends ir10 {
    public boolean b;
    public boolean c;

    public abstract void j0();

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = true;
        if (this.c) {
            j0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.c = z;
        if (z && this.b) {
            j0();
        }
    }
}
