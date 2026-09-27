package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fd2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f149060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy1 f149061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jy1 f149062c;

    public /* synthetic */ fd2(y00 y00Var) {
        this(y00Var, new gy1(), new jy1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f149061b.getClass();
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.icon_placeholder);
        y00 y00Var = this.f149060a;
        a10 a10Var = y00Var.f158073c;
        a10 a10Var2 = y00Var.f158072b;
        if (imageView != null && a10Var == null && a10Var2 == null) {
            this.f149062c.getClass();
            yk3 yk3Var = new yk3((TextView) viewGroup.findViewById(R.id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(yk3Var);
        }
    }

    public fd2(y00 y00Var, gy1 gy1Var, jy1 jy1Var) {
        this.f149060a = y00Var;
        this.f149061b = gy1Var;
        this.f149062c = jy1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
