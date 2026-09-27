package yads;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class me implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f152418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz1 f152419b;

    public me(y00 y00Var, rz1 rz1Var) {
        this.f152418a = y00Var;
        this.f152419b = rz1Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f152419b.getClass();
        View viewFindViewById = viewGroup.findViewById(R.id.age_divider);
        if (viewFindViewById == null || this.f152418a.f158076f != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // yads.zf0
    public final void c() {
    }
}
