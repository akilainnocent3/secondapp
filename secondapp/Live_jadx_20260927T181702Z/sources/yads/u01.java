package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u01 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f156176a;

    public u01(View view) {
        super(view);
        this.f156176a = (TextView) view.findViewById(R.id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        this.f156176a.setText(((w90) ba0Var).f157246a);
    }
}
