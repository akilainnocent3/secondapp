package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g42 extends jr10 {
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
