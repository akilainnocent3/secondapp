package yads;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dl1 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f148260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz1 f148261b;

    public dl1(y00 y00Var, bz1 bz1Var) {
        this.f148260a = y00Var;
        this.f148261b = bz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f148261b.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R.id.media_container);
        if (extendedViewContainer != null) {
            y00 y00Var = this.f148260a;
            if (y00Var.f158074d == null && y00Var.f158071a == null) {
                extendedViewContainer.setVisibility(8);
            }
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
