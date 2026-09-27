package yads;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ej0 implements f91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oi f148725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final si f148726b;

    public ej0(oi oiVar, si siVar) {
        this.f148725a = oiVar;
        this.f148726b = siVar;
    }

    @Override // yads.f91
    public final void a(wd3 wd3Var) {
        TextView textView = wd3Var.f157320j;
        oi oiVar = this.f148725a;
        Object obj = oiVar != null ? oiVar.f153503c : null;
        if (textView != null) {
            if (!(obj instanceof String)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText((CharSequence) obj);
            textView.setVisibility(0);
            this.f148726b.a(textView, this.f148725a);
        }
    }
}
