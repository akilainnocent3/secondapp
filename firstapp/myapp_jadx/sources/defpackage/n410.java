package defpackage;

import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.sportygames.commons.SportyGamesManager;
import java.text.DecimalFormat;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.views.PingPongFragment$cashAddRemoveAnimation$2", f = "PingPongFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class n410 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ double a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ String c;
    public final /* synthetic */ m410 d;

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$cashAddRemoveAnimation$2$1", f = "PingPongFragment.kt", l = {6170}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextView textView, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = textView;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate;
            ViewPropertyAnimator viewPropertyAnimatorAlpha;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            TextView textView = this.b;
            if (textView != null && (viewPropertyAnimatorAnimate = textView.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
                viewPropertyAnimatorAlpha.setDuration(900L);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n410(double d, TextView textView, String str, m410 m410Var, v1b<? super n410> v1bVar) {
        super(2, v1bVar);
        this.a = d;
        this.b = textView;
        this.c = str;
        this.d = m410Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n410(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n410) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        TranslateAnimation translateAnimation;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        double d = this.a;
        if (d > 0.0d) {
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setAlpha(1.0f);
            }
            if (this.c.equals("up")) {
                translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.8f);
                str = "+ ";
            } else {
                str = "- ";
                translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.5f);
            }
            if (textView != null) {
                TreeMap treeMap = pw.a;
                textView.setText(str.concat(pw.g(new Double(d))));
            }
            if (d < 1.0d) {
                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                str2.getClass();
                if (textView != null) {
                    textView.setText(str2);
                }
            }
            AnimationSet animationSet = new AnimationSet(true);
            translateAnimation.setDuration(1800L);
            animationSet.addAnimation(translateAnimation);
            if (textView != null) {
                textView.startAnimation(translateAnimation);
            }
            nas nasVarB = lrn.b(this.d);
            pfd pfdVar = fse.a;
            ej5.c(nasVarB, gku.a, null, new a(textView, null), 2);
        }
        return Unit.a;
    }
}
