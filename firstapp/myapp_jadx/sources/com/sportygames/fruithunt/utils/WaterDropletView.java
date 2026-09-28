package com.sportygames.fruithunt.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportygames/fruithunt/utils/WaterDropletView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaterDropletView extends View {

    public static final class a implements Animation.AnimationListener {
        public final /* synthetic */ Function0<Unit> b;

        public a(Function0<Unit> function0) {
            this.b = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            WaterDropletView.this.setAlpha(0.0f);
            this.b.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaterDropletView(Context context) {
        super(context);
        context.getClass();
    }

    public final void a(Function0<Unit> function0) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fh_water_drop_appear);
        Context context = getContext();
        context.getClass();
        setBackground(context.getDrawable(R.drawable.fh_water_droplet));
        animationLoadAnimation.setAnimationListener(new a(function0));
        animationLoadAnimation.setDuration(4000L);
        startAnimation(animationLoadAnimation);
    }
}
