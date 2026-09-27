package yads;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yk3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f158381a;

    public yk3(TextView textView) {
        this.f158381a = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f158381a;
        if (view2 != null) {
            view2.performClick();
        }
    }
}
