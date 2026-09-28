package com.sportygames.pocketrocket.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.Status;
import defpackage.bmy;
import defpackage.c2g0;
import defpackage.ej5;
import defpackage.fn1;
import defpackage.h5e;
import defpackage.ibs;
import defpackage.nn1;
import defpackage.o8i0;
import defpackage.op5;
import kotlin.Metadata;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/pocketrocket/component/PrTopWin;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lc2g0;", "a", "Lc2g0;", "getBinding", "()Lc2g0;", "setBinding", "(Lc2g0;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrTopWin extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public c2g0 binding;
    public final String b;
    public final String c;
    public ibs d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrTopWin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.top_win_list_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.biggest_coeff;
        if (((ConstraintLayout) h5e.a(R.id.biggest_coeff, viewInflate)) != null) {
            i = R.id.coeff;
            TextView textView = (TextView) h5e.a(R.id.coeff, viewInflate);
            if (textView != null) {
                i = R.id.list;
                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.list, viewInflate);
                if (recyclerView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) h5e.a(R.id.name, viewInflate);
                    if (textView2 != null) {
                        i = R.id.no_record_found;
                        if (((CardView) h5e.a(R.id.no_record_found, viewInflate)) != null) {
                            i = R.id.no_record_text;
                            TextView textView3 = (TextView) h5e.a(R.id.no_record_text, viewInflate);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i = R.id.pr_round_history_list;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.pr_round_history_list, viewInflate);
                                if (constraintLayout2 != null) {
                                    i = R.id.rocket;
                                    TextView textView4 = (TextView) h5e.a(R.id.rocket, viewInflate);
                                    if (textView4 != null) {
                                        i = R.id.spin_kit;
                                        SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewInflate);
                                        if (spinKitView != null) {
                                            i = R.id.stake;
                                            TextView textView5 = (TextView) h5e.a(R.id.stake, viewInflate);
                                            if (textView5 != null) {
                                                i = R.id.time;
                                                TextView textView6 = (TextView) h5e.a(R.id.time, viewInflate);
                                                if (textView6 != null) {
                                                    i = R.id.win;
                                                    TextView textView7 = (TextView) h5e.a(R.id.win, viewInflate);
                                                    if (textView7 != null) {
                                                        this.binding = new c2g0(constraintLayout, textView, recyclerView, textView2, textView3, constraintLayout2, textView4, spinKitView, textView5, textView6, textView7);
                                                        String string = context.getString(R.string.payout_amount);
                                                        string.getClass();
                                                        this.b = string;
                                                        String string2 = context.getString(R.string.daily);
                                                        string2.getClass();
                                                        this.c = string2;
                                                        return;
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
        throw null;
    }

    public final void a(fn1 fn1Var, ibs ibsVar) {
        fn1Var.getClass();
        ibsVar.getClass();
        try {
            this.d = ibsVar;
            String str = this.b;
            String str2 = this.c;
            str.getClass();
            str2.getClass();
            ej5.c(o8i0.d(fn1Var), null, null, new nn1(fn1Var, str, str2, null), 3);
            op5 op5Var = op5.a;
            c2g0 c2g0Var = this.binding;
            op5.r(op5Var, b.f(c2g0Var.d, c2g0Var.y, c2g0Var.w, c2g0Var.z, c2g0Var.i, c2g0Var.b, c2g0Var.e), null, 4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final c2g0 getBinding() {
        return this.binding;
    }

    public final void setBinding(c2g0 c2g0Var) {
        c2g0Var.getClass();
        this.binding = c2g0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrTopWin(Context context) {
        this(context, null);
        context.getClass();
    }
}
