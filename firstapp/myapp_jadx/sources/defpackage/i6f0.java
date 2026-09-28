package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class i6f0 implements ess {
    public final h6f0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public msr f;
    public AnimatorSet g;

    public i6f0(msr msrVar, h6f0 h6f0Var, String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.a = h6f0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = msrVar;
    }

    @Override // defpackage.ess
    public final void execute() {
        int i;
        String str;
        String str2;
        int i2;
        h6f0 h6f0Var = this.a;
        int i3 = h6f0Var.b;
        msr msrVar = this.f;
        if (msrVar == null) {
            return;
        }
        ConstraintLayout constraintLayout = msrVar.b;
        TextView textView = msrVar.D;
        if (h6f0Var.a.a()) {
            i = R.drawable.iwqk_live_home_goal_bg;
            str = this.b;
            str2 = this.c;
            i2 = R.drawable.ic_default_team_logo_home;
        } else {
            i = R.drawable.iwqk_live_away_goal_bg;
            str = this.d;
            str2 = this.e;
            i2 = R.drawable.ic_default_team_logo_away;
        }
        msrVar.M.setBackgroundResource(i);
        msrVar.F.setText(str);
        ImageView imageView = msrVar.v;
        m9n m9nVarA = qw90.a(imageView.getContext());
        nan.a aVar = new nan.a(imageView.getContext());
        aVar.c = str2;
        abn.f(aVar, imageView);
        Context context = msrVar.a.getContext();
        context.getClass();
        Drawable drawableC = s0b.c(context, i2, null, null, 6);
        if (drawableC != null) {
            u7n u7nVarB = zbn.b(drawableC);
            aVar.d(u7nVarB);
            aVar.b(u7nVarB);
        }
        m9nVarA.a(aVar.a());
        boolean z = i3 > 0;
        textView.setVisibility(z ? 0 : 8);
        textView.setText(z ? hce0.a(i3, AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X) : "");
        textView.setAlpha(z ? 0.0f : 1.0f);
        sn5.f(msrVar.E, z ? R.string.simulate_game__goal : R.string.common_functions__no_goal, new Object[0]);
        ObjectAnimator duration = ObjectAnimator.ofFloat(constraintLayout, "alpha", 0.0f, 1.0f).setDuration(500L);
        duration.getClass();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(500L);
        duration2.getClass();
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.0f).setDuration(0L);
        duration3.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3);
        this.g = animatorSet;
        animatorSet.start();
    }

    @Override // defpackage.ess
    public final void release() {
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f = null;
    }
}
