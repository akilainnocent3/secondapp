package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vs implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jy1 f157074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us f157075b;

    public vs(jy1 jy1Var, us usVar) {
        this.f157074a = jy1Var;
        this.f157075b = usVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f157074a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R.id.call_to_action);
        if (textView != null) {
            us usVar = this.f157075b;
            usVar.f156564a.postDelayed(new l33(textView, usVar.f156565b), 2000L);
        }
    }

    @Override // yads.zf0
    public final void c() {
        us usVar = this.f157075b;
        usVar.f156564a.removeCallbacksAndMessages(null);
        usVar.f156565b.cancel();
    }
}
