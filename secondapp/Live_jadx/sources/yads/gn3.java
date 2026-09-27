package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gn3 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jy1 f149707a;

    public /* synthetic */ gn3() {
        this(new jy1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f149707a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R.id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    public gn3(jy1 jy1Var) {
        this.f149707a = jy1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
