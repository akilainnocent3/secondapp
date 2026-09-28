package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class bss extends RecyclerView.d0 {
    public static final /* synthetic */ int y = 0;
    public final w4p a;
    public final rss b;
    public final boolean c;
    public AnimatorSet d;
    public AnimatorSet e;
    public AnimatorSet f;
    public AnimatorSet i;
    public final c v;
    public nss.c w;

    public static final class a {
        public static bss a(ViewGroup viewGroup, rss rssVar, boolean z) {
            viewGroup.getClass();
            rssVar.getClass();
            View viewA = dzc.a(viewGroup, R.layout.iwqk_layout_live_score_event_item, viewGroup, false);
            int i = R.id.arrow;
            ImageView imageView = (ImageView) h5e.a(R.id.arrow, viewA);
            if (imageView != null) {
                i = R.id.away_team_logo;
                ImageView imageView2 = (ImageView) h5e.a(R.id.away_team_logo, viewA);
                if (imageView2 != null) {
                    i = R.id.away_team_name;
                    TextView textView = (TextView) h5e.a(R.id.away_team_name, viewA);
                    if (textView != null) {
                        i = R.id.away_team_score_current;
                        TextView textView2 = (TextView) h5e.a(R.id.away_team_score_current, viewA);
                        if (textView2 != null) {
                            i = R.id.away_team_score_next;
                            TextView textView3 = (TextView) h5e.a(R.id.away_team_score_next, viewA);
                            if (textView3 != null) {
                                i = R.id.divider_line;
                                View viewA2 = h5e.a(R.id.divider_line, viewA);
                                if (viewA2 != null) {
                                    i = R.id.home_team_logo;
                                    ImageView imageView3 = (ImageView) h5e.a(R.id.home_team_logo, viewA);
                                    if (imageView3 != null) {
                                        i = R.id.home_team_name;
                                        TextView textView4 = (TextView) h5e.a(R.id.home_team_name, viewA);
                                        if (textView4 != null) {
                                            i = R.id.home_team_score_current;
                                            TextView textView5 = (TextView) h5e.a(R.id.home_team_score_current, viewA);
                                            if (textView5 != null) {
                                                i = R.id.home_team_score_next;
                                                TextView textView6 = (TextView) h5e.a(R.id.home_team_score_next, viewA);
                                                if (textView6 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) viewA;
                                                    i = R.id.user_selected_mark;
                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.user_selected_mark, viewA);
                                                    if (appCompatImageView != null) {
                                                        return new bss(new w4p(relativeLayout, imageView, imageView2, textView, textView2, textView3, viewA2, imageView3, textView4, textView5, textView6, relativeLayout, appCompatImageView), rssVar, z);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ Function2 b;
        public final /* synthetic */ nss.c c;

        public b(cq40 cq40Var, Function2 function2, nss.c cVar) {
            this.a = cq40Var;
            this.b = function2;
            this.c = cVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            nss.c cVar = this.c;
            this.b.invoke(cVar.a, Boolean.valueOf(!cVar.j));
        }
    }

    public static final class c implements rss.a {
        public c() {
        }

        @Override // rss.a
        public final void a(int i) {
            Map<Integer, ho70> map;
            ho70 ho70Var;
            bss bssVar = bss.this;
            w4p w4pVar = bssVar.a;
            nss.c cVar = bssVar.w;
            if (cVar == null || (map = cVar.g) == null || (ho70Var = map.get(Integer.valueOf(i))) == null) {
                return;
            }
            int i2 = ho70Var.c;
            b4l b4lVar = ho70Var.a;
            if (b4lVar.a()) {
                String strValueOf = String.valueOf(i2);
                TextView textView = w4pVar.z;
                TextView textView2 = w4pVar.y;
                if (textView.getAlpha() == 1.0f) {
                    textView2.setText(strValueOf);
                    AnimatorSet animatorSet = bssVar.d;
                    if (animatorSet != null) {
                        animatorSet.setTarget(textView);
                    }
                    AnimatorSet animatorSet2 = bssVar.e;
                    if (animatorSet2 != null) {
                        animatorSet2.setTarget(textView2);
                    }
                } else {
                    textView.setText(strValueOf);
                    textView2.setText(strValueOf);
                    AnimatorSet animatorSet3 = bssVar.d;
                    if (animatorSet3 != null) {
                        animatorSet3.setTarget(textView2);
                    }
                    AnimatorSet animatorSet4 = bssVar.e;
                    if (animatorSet4 != null) {
                        animatorSet4.setTarget(textView);
                    }
                }
                AnimatorSet animatorSet5 = bssVar.d;
                if (animatorSet5 != null) {
                    animatorSet5.start();
                }
                AnimatorSet animatorSet6 = bssVar.e;
                if (animatorSet6 != null) {
                    animatorSet6.start();
                    Unit unit = Unit.a;
                }
            }
            if (b4lVar.a()) {
                return;
            }
            String strValueOf2 = String.valueOf(i2);
            TextView textView3 = w4pVar.f;
            TextView textView4 = w4pVar.e;
            if (textView3.getAlpha() == 1.0f) {
                textView4.setText(strValueOf2);
                AnimatorSet animatorSet7 = bssVar.f;
                if (animatorSet7 != null) {
                    animatorSet7.setTarget(textView3);
                }
                AnimatorSet animatorSet8 = bssVar.i;
                if (animatorSet8 != null) {
                    animatorSet8.setTarget(textView4);
                }
            } else {
                textView3.setText(strValueOf2);
                AnimatorSet animatorSet9 = bssVar.f;
                if (animatorSet9 != null) {
                    animatorSet9.setTarget(textView4);
                }
                AnimatorSet animatorSet10 = bssVar.i;
                if (animatorSet10 != null) {
                    animatorSet10.setTarget(textView3);
                }
            }
            AnimatorSet animatorSet11 = bssVar.f;
            if (animatorSet11 != null) {
                animatorSet11.start();
            }
            AnimatorSet animatorSet12 = bssVar.i;
            if (animatorSet12 != null) {
                animatorSet12.start();
                Unit unit2 = Unit.a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bss(w4p w4pVar, rss rssVar, boolean z) {
        super(w4pVar.A);
        rssVar.getClass();
        this.a = w4pVar;
        this.b = rssVar;
        this.c = z;
        this.v = new c();
        w4pVar.z.setAlpha(0.0f);
        w4pVar.f.setAlpha(0.0f);
    }

    public static int b(Map map, b4l b4lVar, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((ho70) entry.getValue()).a == b4lVar) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = CollectionsKt.q0(linkedHashMap.keySet()).iterator();
        while (true) {
            int i2 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                ho70 ho70Var = (ho70) linkedHashMap.get(Integer.valueOf(iIntValue));
                if (iIntValue > i) {
                    ho70 ho70Var2 = (ho70) linkedHashMap.get(Integer.valueOf(iIntValue));
                    if (ho70Var2 != null) {
                        return ho70Var2.b;
                    }
                    return 0;
                }
                if (ho70Var != null) {
                    i2 = ho70Var.c;
                }
            }
            return i2;
        }
    }

    public final Context a() {
        Context context = this.a.A.getContext();
        context.getClass();
        return context;
    }

    public final void c(nss.c cVar, Function2<? super String, ? super Boolean, Unit> function2) {
        this.w = cVar;
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(a(), R.animator.iwqk_score_out);
        animatorLoadAnimator.getClass();
        this.d = (AnimatorSet) animatorLoadAnimator;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(a(), R.animator.iwqk_score_in);
        animatorLoadAnimator2.getClass();
        AnimatorSet animatorSet = (AnimatorSet) animatorLoadAnimator2;
        this.e = animatorSet;
        w4p w4pVar = this.a;
        animatorSet.addListener(new dss(w4pVar));
        Unit unit = Unit.a;
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(a(), R.animator.iwqk_score_out);
        animatorLoadAnimator3.getClass();
        this.f = (AnimatorSet) animatorLoadAnimator3;
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(a(), R.animator.iwqk_score_in);
        animatorLoadAnimator4.getClass();
        AnimatorSet animatorSet2 = (AnimatorSet) animatorLoadAnimator4;
        this.i = animatorSet2;
        animatorSet2.addListener(new css(w4pVar));
        rss rssVar = this.b;
        rssVar.getClass();
        c cVar2 = this.v;
        cVar2.getClass();
        rssVar.b.add(cVar2);
        TextView textView = w4pVar.w;
        View view = w4pVar.i;
        RelativeLayout relativeLayout = w4pVar.A;
        ImageView imageView = w4pVar.b;
        AppCompatImageView appCompatImageView = w4pVar.B;
        String str = cVar.b;
        boolean z = cVar.i;
        Map<Integer, ho70> map = cVar.g;
        boolean z2 = cVar.k;
        textView.setText(str);
        ImageView imageView2 = w4pVar.v;
        String str2 = cVar.c;
        m9n m9nVarA = qw90.a(imageView2.getContext());
        nan.a aVar = new nan.a(imageView2.getContext());
        aVar.c = str2;
        abn.f(aVar, imageView2);
        Drawable drawableC = s0b.c(a(), R.drawable.ic_default_team_logo_home, null, null, 6);
        if (drawableC != null) {
            u7n u7nVarB = zbn.b(drawableC);
            aVar.d(u7nVarB);
            aVar.b(u7nVarB);
        }
        m9nVarA.a(aVar.a());
        w4pVar.d.setText(cVar.d);
        ImageView imageView3 = w4pVar.c;
        String str3 = cVar.e;
        m9n m9nVarA2 = qw90.a(imageView3.getContext());
        nan.a aVar2 = new nan.a(imageView3.getContext());
        aVar2.c = str3;
        abn.f(aVar2, imageView3);
        Drawable drawableC2 = s0b.c(a(), R.drawable.ic_default_team_logo_away, null, null, 6);
        if (drawableC2 != null) {
            u7n u7nVarB2 = zbn.b(drawableC2);
            aVar2.d(u7nVarB2);
            aVar2.b(u7nVarB2);
        }
        m9nVarA2.a(aVar2.a());
        boolean z3 = cVar.h;
        boolean z4 = this.c;
        appCompatImageView.setVisibility((!z3 || z4) ? 8 : 0);
        appCompatImageView.setImageDrawable(s0b.c(a(), R.drawable.iwqk_live_score_soccer, new a78.c(z2 ? R.color.brand_secondary : R.color.absolute_type2), null, 4));
        if (z2) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setRepeatCount(-1);
            appCompatImageView.startAnimation(rotateAnimation);
        }
        int i = rssVar.c;
        int iB = b(map, b4l.HOME, i);
        w4pVar.y.setText(String.valueOf(iB));
        w4pVar.z.setText(String.valueOf(iB));
        int iB2 = b(map, b4l.AWAY, i);
        w4pVar.e.setText(String.valueOf(iB2));
        w4pVar.f.setText(String.valueOf(iB2));
        imageView.setVisibility((!z || z4) ? 8 : 0);
        imageView.setImageDrawable(s0b.c(a(), cVar.j ? R.drawable.up_arrow : R.drawable.down_arrow, null, null, 6));
        relativeLayout.setClickable(z);
        relativeLayout.setOnClickListener(new b(new cq40(), function2, cVar));
        if (z4) {
            c8i0.l(view, 0, 0, 0, 0);
        } else {
            int iA = bqe.a(10.0f);
            c8i0.l(view, Integer.valueOf(iA), 0, Integer.valueOf(iA), 0);
        }
    }

    public final void onViewRecycled() {
        rss rssVar = this.b;
        rssVar.getClass();
        c cVar = this.v;
        cVar.getClass();
        rssVar.b.remove(cVar);
        this.a.B.clearAnimation();
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.e;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.i;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }
}
