package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnp80;", "Ll12;", "Lc760;", "Lqp80;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class np80 extends l12<c760, qp80> {
    public String c = "";
    public String d = "0";

    @c0d(c = "com.sportygames.rush.view.SgRushChatComponentFragment$onViewCreated$1", f = "SgRushChatComponentFragment.kt", l = {66}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ConstraintLayout a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return np80.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ConstraintLayout constraintLayout;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                np80 np80Var = np80.this;
                qp80 qp80Var = (qp80) np80Var.b;
                if (qp80Var != null) {
                    ConstraintLayout constraintLayout2 = qp80Var.b;
                    s4u<String, Bitmap> s4uVar = r9n.a;
                    Context context = np80Var.getContext();
                    String string = np80Var.getString(R.string.key_stop_auto_bet_png);
                    string.getClass();
                    this.a = constraintLayout2;
                    this.b = 1;
                    obj = r9n.b(context, string, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                    constraintLayout = constraintLayout2;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            constraintLayout = this.a;
            uj50.b(obj);
            constraintLayout.setBackground((Drawable) obj);
            return Unit.a;
        }
    }

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
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_rush_chat_layout, (ViewGroup) null, false);
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
                            TextView textView2 = (TextView) h5e.a(R.id.sg_coeff, viewInflate);
                            if (textView2 != null) {
                                i = R.id.sg_currency;
                                TextView textView3 = (TextView) h5e.a(R.id.sg_currency, viewInflate);
                                if (textView3 != null) {
                                    i = R.id.sg_layout_text;
                                    if (((LinearLayout) h5e.a(R.id.sg_layout_text, viewInflate)) != null) {
                                        i = R.id.sg_message;
                                        TextView textView4 = (TextView) h5e.a(R.id.sg_message, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.toast_container;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.toast_container, viewInflate);
                                            if (constraintLayout2 != null) {
                                                i = R.id.tv_house_coefficient;
                                                TextView textView5 = (TextView) h5e.a(R.id.tv_house_coefficient, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.tv_rounds_played;
                                                    TextView textView6 = (TextView) h5e.a(R.id.tv_rounds_played, viewInflate);
                                                    if (textView6 != null) {
                                                        i = R.id.tv_stop_bet;
                                                        TextView textView7 = (TextView) h5e.a(R.id.tv_stop_bet, viewInflate);
                                                        if (textView7 != null) {
                                                            return new qp80((ConstraintLayout) viewInflate, constraintLayout, textView, textView2, textView3, textView4, constraintLayout2, textView5, textView6, textView7);
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
            this.c = arguments.getString("currency");
            String string = arguments.getString("autobetCount", "0");
            string.getClass();
            this.d = string;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        qp80 qp80Var = (qp80) this.b;
        if (qp80Var != null) {
            qp80Var.b.setVisibility(4);
        }
        qp80 qp80Var2 = (qp80) this.b;
        if (qp80Var2 != null) {
            qp80Var2.v.setVisibility(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        qp80 qp80Var;
        qp80 qp80Var2;
        view.getClass();
        super.onViewCreated(view, bundle);
        u91.a.f(getViewLifecycleOwner(), new b(new yah(this, 2)));
        u91.b.f(getViewLifecycleOwner(), new b(new Function1() { // from class: hp80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                boolean zA = yju.a("br");
                np80 np80Var = this.a;
                int i = zA ? Integer.parseInt(np80Var.d) : 100;
                if (str == null || str.length() == 0 || Integer.parseInt(str) > i - 1) {
                    str.getClass();
                    np80Var.p0(str);
                    ej5.c(ebs.a(np80Var.getLifecycle()), null, null, new mp80(np80Var, null), 3);
                } else {
                    np80Var.p0(str);
                }
                return Unit.a;
            }
        }));
        qp80 qp80Var3 = (qp80) this.b;
        if (qp80Var3 != null) {
            qp80Var3.b.setOnClickListener(new View.OnClickListener() { // from class: ip80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    u91.c.j(Boolean.TRUE);
                    np80 np80Var = this.a;
                    qp80 qp80Var4 = (qp80) np80Var.b;
                    if (qp80Var4 != null) {
                        qp80Var4.b.setVisibility(4);
                    }
                    qp80 qp80Var5 = (qp80) np80Var.b;
                    if (qp80Var5 != null) {
                        qp80Var5.v.setVisibility(4);
                    }
                }
            });
        }
        op5 op5Var = op5.a;
        qp80 qp80Var4 = (qp80) this.b;
        op5.r(op5Var, kotlin.collections.b.f(qp80Var4 != null ? qp80Var4.y : null), null, 6);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(null), 3);
        qp80 qp80Var5 = (qp80) this.b;
        if (qp80Var5 != null) {
            TextView textView = qp80Var5.w;
            String strValueOf = String.valueOf(qp80Var5 != null ? textView.getTag() : null);
            qp80 qp80Var6 = (qp80) this.b;
            textView.setText(op5.c(op5Var, strValueOf, String.valueOf(qp80Var6 != null ? qp80Var6.w.getText() : null)).concat(" "));
        }
        qp80 qp80Var7 = (qp80) this.b;
        String strValueOf2 = String.valueOf(qp80Var7 != null ? qp80Var7.y.getTag() : null);
        qp80 qp80Var8 = (qp80) this.b;
        String strC = op5.c(op5Var, strValueOf2, String.valueOf(qp80Var8 != null ? qp80Var8.y.getText() : null));
        if (strC.length() > 20 && (qp80Var2 = (qp80) this.b) != null) {
            qp80Var2.y.setTextSize(12.0f);
        }
        if (strC.length() <= 15 || (qp80Var = (qp80) this.b) == null) {
            return;
        }
        qp80Var.y.setTextSize(13.0f);
    }

    public final void p0(String str) {
        if (getContext() != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setAnimationListener(new lp80(this, str, scaleAnimation));
            qp80 qp80Var = (qp80) this.b;
            if (qp80Var != null) {
                qp80Var.c.startAnimation(scaleAnimation);
            }
        }
    }
}
