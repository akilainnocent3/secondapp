package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.CircleImageView;
import com.sportybet.plugin.realsports.event.comment.ReplyPanel;
import com.sportybet.plugin.realsports.event.comment.prematch.view.PostSocialPanel;

/* JADX INFO: loaded from: classes7.dex */
public final class jgd0 implements g6i0 {
    public final ConstraintLayout a;
    public final TextView b;
    public final igd0 c;
    public final CircleImageView d;
    public final CircleImageView e;
    public final TextView f;
    public final ReplyPanel i;
    public final TextView v;
    public final TextView w;
    public final PostSocialPanel y;

    public jgd0(ConstraintLayout constraintLayout, TextView textView, igd0 igd0Var, CircleImageView circleImageView, CircleImageView circleImageView2, TextView textView2, ReplyPanel replyPanel, TextView textView3, TextView textView4, PostSocialPanel postSocialPanel) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = igd0Var;
        this.d = circleImageView;
        this.e = circleImageView2;
        this.f = textView2;
        this.i = replyPanel;
        this.v = textView3;
        this.w = textView4;
        this.y = postSocialPanel;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
