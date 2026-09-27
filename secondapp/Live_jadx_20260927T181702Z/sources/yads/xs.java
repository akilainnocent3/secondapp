package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xs implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f157977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy1 f157978b;

    public /* synthetic */ xs(w02 w02Var) {
        this(w02Var, new jy1());
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f157978b.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R.id.call_to_action);
        cq2 adType = this.f157977a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == cq2.f147872d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    public xs(w02 w02Var, jy1 jy1Var) {
        this.f157977a = w02Var;
        this.f157978b = jy1Var;
    }

    @Override // yads.zf0
    public final void c() {
    }
}
