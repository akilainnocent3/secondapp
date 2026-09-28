package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class fkx extends e6 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ekx.c f;

    public fkx(ekx.c cVar, int i, boolean z) {
        this.f = cVar;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.e6
    public final void d(View view, c7 c7Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
        ekx ekxVar = ekx.this;
        int i = this.d;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (ekxVar.e.getItemViewType(i3) == 2 || ekxVar.e.getItemViewType(i3) == 3) {
                i2--;
            }
        }
        c7Var.n(c7.f.a(i2, 1, 1, 1, this.e, view.isSelected()));
    }
}
