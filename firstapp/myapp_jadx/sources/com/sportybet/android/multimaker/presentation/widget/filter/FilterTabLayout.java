package com.sportybet.android.multimaker.presentation.widget.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.mid0;
import defpackage.rid0;
import defpackage.sn5;
import defpackage.thw;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/widget/filter/FilterTabLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lthw;", "", "listener", "setOnTabClickedListener", "(Lkotlin/jvm/functions/Function1;)V", "getCtx", "()Landroid/content/Context;", "ctx", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FilterTabLayout extends ConstraintLayout {
    public static final /* synthetic */ int I = 0;
    public final mid0 F;
    public final List<TextView> G;
    public Function1<? super thw, Unit> H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_multi_maker_filter_tab_layout, this);
        int i2 = R.id.filter_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.filter_container, this);
        if (constraintLayout != null) {
            i2 = R.id.filter_daily;
            TextView textView = (TextView) h5e.a(R.id.filter_daily, this);
            if (textView != null) {
                i2 = R.id.filter_league;
                TextView textView2 = (TextView) h5e.a(R.id.filter_league, this);
                if (textView2 != null) {
                    i2 = R.id.filter_market;
                    TextView textView3 = (TextView) h5e.a(R.id.filter_market, this);
                    if (textView3 != null) {
                        i2 = R.id.filter_odds;
                        TextView textView4 = (TextView) h5e.a(R.id.filter_odds, this);
                        if (textView4 != null) {
                            i2 = R.id.shimmer_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.shimmer_container, this);
                            if (constraintLayout2 != null) {
                                i2 = R.id.shimmer_daily;
                                View viewA = h5e.a(R.id.shimmer_daily, this);
                                if (viewA != null) {
                                    rid0.a(viewA);
                                    i2 = R.id.shimmer_league;
                                    View viewA2 = h5e.a(R.id.shimmer_league, this);
                                    if (viewA2 != null) {
                                        rid0.a(viewA2);
                                        i2 = R.id.shimmer_market;
                                        View viewA3 = h5e.a(R.id.shimmer_market, this);
                                        if (viewA3 != null) {
                                            rid0.a(viewA3);
                                            i2 = R.id.shimmer_odds;
                                            View viewA4 = h5e.a(R.id.shimmer_odds, this);
                                            if (viewA4 != null) {
                                                rid0.a(viewA4);
                                                final mid0 mid0Var = new mid0(this, constraintLayout, textView, textView2, textView3, textView4, constraintLayout2);
                                                this.F = mid0Var;
                                                this.G = b.k(textView, textView3, textView2, textView4);
                                                textView.setText(sn5.b(getCtx(), R.string.common_functions__time, new Object[0]));
                                                textView.setOnClickListener(new View.OnClickListener() { // from class: zmh
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i3 = FilterTabLayout.I;
                                                        mid0 mid0Var2 = mid0Var;
                                                        mid0Var2.c.setSelected(true);
                                                        mid0Var2.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_triangle_up, 0);
                                                        Function1<? super thw, Unit> function1 = this.H;
                                                        if (function1 != null) {
                                                            function1.invoke(thw.c);
                                                        }
                                                    }
                                                });
                                                textView3.setText(sn5.b(getCtx(), R.string.common_functions__markets, new Object[0]));
                                                textView3.setOnClickListener(new View.OnClickListener() { // from class: anh
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i3 = FilterTabLayout.I;
                                                        mid0 mid0Var2 = mid0Var;
                                                        mid0Var2.e.setSelected(true);
                                                        mid0Var2.e.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_triangle_up, 0);
                                                        Function1<? super thw, Unit> function1 = this.H;
                                                        if (function1 != null) {
                                                            function1.invoke(thw.b);
                                                        }
                                                    }
                                                });
                                                textView2.setText(sn5.b(getCtx(), R.string.common_functions__leagues, new Object[0]));
                                                textView2.setOnClickListener(new View.OnClickListener() { // from class: bnh
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i3 = FilterTabLayout.I;
                                                        mid0 mid0Var2 = mid0Var;
                                                        mid0Var2.d.setSelected(true);
                                                        mid0Var2.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_triangle_up, 0);
                                                        Function1<? super thw, Unit> function1 = this.H;
                                                        if (function1 != null) {
                                                            function1.invoke(thw.a);
                                                        }
                                                    }
                                                });
                                                textView4.setText(sn5.b(getCtx(), R.string.common_functions__odds_txt, new Object[0]));
                                                textView4.setOnClickListener(new View.OnClickListener() { // from class: cnh
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i3 = FilterTabLayout.I;
                                                        mid0 mid0Var2 = mid0Var;
                                                        mid0Var2.f.setSelected(true);
                                                        mid0Var2.f.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_triangle_up, 0);
                                                        Function1<? super thw, Unit> function1 = this.H;
                                                        if (function1 != null) {
                                                            function1.invoke(thw.d);
                                                        }
                                                    }
                                                });
                                                constraintLayout.setVisibility(8);
                                                constraintLayout2.setVisibility(0);
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
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static final CharSequence F(FilterTabLayout filterTabLayout, UiText uiText) {
        uiText.getClass();
        return uiText.e(filterTabLayout.getCtx());
    }

    public static final CharSequence G(FilterTabLayout filterTabLayout, UiText uiText) {
        uiText.getClass();
        return uiText.e(filterTabLayout.getCtx());
    }

    private final Context getCtx() {
        Context context = this.F.a.getContext();
        context.getClass();
        return context;
    }

    public final void E() {
        Object next;
        Iterator<T> it = this.G.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((TextView) next).isSelected());
        TextView textView = (TextView) next;
        if (textView != null) {
            textView.setSelected(false);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_triangle_down, 0);
        }
    }

    public final void H(UiText uiText) {
        this.F.f.setText(uiText.e(getCtx()));
    }

    public final void I(UiText uiText) {
        uiText.getClass();
        this.F.c.setText(uiText.e(getCtx()));
    }

    public final void setOnTabClickedListener(Function1<? super thw, Unit> listener) {
        listener.getClass();
        this.H = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilterTabLayout(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ FilterTabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
