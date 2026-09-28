package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltn80;", "Ll12;", "Lc760;", "Lwn80;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class tn80 extends l12<c760, wn80> {
    public String c = "";

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_crash_initiated_chat_layout, (ViewGroup) null, false);
        int i = R.id.auto_bet_red_btn_chat;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.auto_bet_red_btn_chat, viewInflate);
        if (constraintLayout != null) {
            i = R.id.image1;
            if (((ImageView) h5e.a(R.id.image1, viewInflate)) != null) {
                i = R.id.image2;
                if (((ImageView) h5e.a(R.id.image2, viewInflate)) != null) {
                    i = R.id.rounds_played_count;
                    TextView textView = (TextView) h5e.a(R.id.rounds_played_count, viewInflate);
                    if (textView != null) {
                        i = R.id.sg_at;
                        if (((TextView) h5e.a(R.id.sg_at, viewInflate)) != null) {
                            i = R.id.sg_coeff;
                            if (((TextView) h5e.a(R.id.sg_coeff, viewInflate)) != null) {
                                i = R.id.sg_currency;
                                if (((TextView) h5e.a(R.id.sg_currency, viewInflate)) != null) {
                                    i = R.id.sg_layout_text;
                                    if (((LinearLayout) h5e.a(R.id.sg_layout_text, viewInflate)) != null) {
                                        i = R.id.sg_message;
                                        if (((TextView) h5e.a(R.id.sg_message, viewInflate)) != null) {
                                            i = R.id.toast_container;
                                            if (((ConstraintLayout) h5e.a(R.id.toast_container, viewInflate)) != null) {
                                                i = R.id.tv_house_coefficient;
                                                TextView textView2 = (TextView) h5e.a(R.id.tv_house_coefficient, viewInflate);
                                                if (textView2 != null) {
                                                    i = R.id.tv_rounds_played;
                                                    TextView textView3 = (TextView) h5e.a(R.id.tv_rounds_played, viewInflate);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_stop_bet;
                                                        TextView textView4 = (TextView) h5e.a(R.id.tv_stop_bet, viewInflate);
                                                        if (textView4 != null) {
                                                            return new wn80(textView, textView2, textView3, textView4, (ConstraintLayout) viewInflate, constraintLayout);
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("currency");
            String string = arguments.getString("autobetCount", "");
            string.getClass();
            this.c = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        wn80 wn80Var = (wn80) this.b;
        if (wn80Var != null) {
            wn80Var.b.setVisibility(4);
        }
        wn80 wn80Var2 = (wn80) this.b;
        if (wn80Var2 != null) {
            wn80Var2.d.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        v91.a.f(getViewLifecycleOwner(), new b(new qn3(this, 2)));
        v91.b.f(getViewLifecycleOwner(), new b(new q440(this, 1)));
        wn80 wn80Var = (wn80) this.b;
        if (wn80Var != null) {
            wn80Var.b.setOnClickListener(new View.OnClickListener() { // from class: qn80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    v91.c.j(Boolean.TRUE);
                    tn80 tn80Var = this.a;
                    wn80 wn80Var2 = (wn80) tn80Var.b;
                    if (wn80Var2 != null) {
                        wn80Var2.b.setVisibility(4);
                    }
                    wn80 wn80Var3 = (wn80) tn80Var.b;
                    if (wn80Var3 != null) {
                        wn80Var3.d.setVisibility(4);
                    }
                }
            });
        }
        op5 op5Var = op5.a;
        wn80 wn80Var2 = (wn80) this.b;
        op5.r(op5Var, kotlin.collections.b.f(wn80Var2 != null ? wn80Var2.f : null), null, 6);
        wn80 wn80Var3 = (wn80) this.b;
        if (wn80Var3 != null) {
            TextView textView = wn80Var3.e;
            String strValueOf = String.valueOf(wn80Var3 != null ? textView.getTag() : null);
            wn80 wn80Var4 = (wn80) this.b;
            textView.setText(op5.c(op5Var, strValueOf, String.valueOf(wn80Var4 != null ? wn80Var4.e.getText() : null)).concat(" "));
        }
    }

    public final void p0(String str) {
        if (getContext() != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setAnimationListener(new a(str, scaleAnimation));
            wn80 wn80Var = (wn80) this.b;
            if (wn80Var != null) {
                wn80Var.c.startAnimation(scaleAnimation);
            }
        }
    }

    public static final class a implements Animation.AnimationListener {
        public final /* synthetic */ String b;
        public final /* synthetic */ ScaleAnimation c;

        public a(String str, ScaleAnimation scaleAnimation) {
            this.b = str;
            this.c = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.c.setDuration(500L);
            wn80 wn80Var = (wn80) tn80.this.b;
            if (wn80Var != null) {
                wn80Var.c.startAnimation(scaleAnimation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            wn80 wn80Var = (wn80) tn80.this.b;
            if (wn80Var != null) {
                wn80Var.c.setText(this.b);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
