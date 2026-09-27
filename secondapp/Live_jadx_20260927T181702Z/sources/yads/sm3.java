package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xx1 f155492a;

    public sm3(xx1 xx1Var) {
        this.f155492a = xx1Var;
    }

    public final void a(View view, boolean z10) {
        int i10;
        int i11 = z10 ? this.f155492a.f158040a : this.f155492a.f158041b;
        if (z10) {
            i10 = this.f155492a.f158042c;
        } else {
            if (z10) {
                throw new dr.o0();
            }
            i10 = this.f155492a.f158043d;
        }
        view.setBackground(f1.d.getDrawable(view.getContext(), i11));
        view.setContentDescription(f1.d.getString(view.getContext(), i10));
    }
}
