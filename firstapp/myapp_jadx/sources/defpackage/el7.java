package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class el7 extends RecyclerView.d0 {
    public final cl7 a;
    public final ConstraintLayout b;
    public final TextView c;
    public final RelativeLayout d;
    public final Animation e;
    public final Animation f;
    public double i;
    public boolean v;

    public el7(View view, cl7 cl7Var) {
        super(view);
        this.a = cl7Var;
        View viewFindViewById = view.findViewById(R.id.chip_image);
        viewFindViewById.getClass();
        this.b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.number);
        viewFindViewById2.getClass();
        this.c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.layout);
        viewFindViewById3.getClass();
        this.d = (RelativeLayout) viewFindViewById3;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.sg_chip_press);
        animationLoadAnimation.getClass();
        this.e = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.sg_chip_release);
        animationLoadAnimation2.getClass();
        this.f = animationLoadAnimation2;
    }
}
