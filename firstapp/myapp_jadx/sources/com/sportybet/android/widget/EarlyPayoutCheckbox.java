package com.sportybet.android.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.cq40;
import defpackage.h5e;
import defpackage.ljf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u000eJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/sportybet/android/widget/EarlyPayoutCheckbox;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "", "setCheckBoxListener", "(Landroid/view/View$OnClickListener;)V", "", "text", "setDescription", "(Ljava/lang/String;)V", "", AnalyticsParam.EVENT_PARAM_IS_CHECKED, "setChecked", "(Z)V", "isVisible", "setCheckBoxVisible", "setDashViewVisible", "setVerticalDividerVisible", "setInfoVisible", "setInfoClickListener", "isLoading", "isQuickBet", "setLoading", "(ZZ)V", "Landroid/widget/CheckBox;", "getCheckBox", "()Landroid/widget/CheckBox;", "checkBox", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EarlyPayoutCheckbox extends FrameLayout {
    public final ljf a;
    public View.OnClickListener b;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ EarlyPayoutCheckbox b;

        public a(cq40 cq40Var, EarlyPayoutCheckbox earlyPayoutCheckbox) {
            this.a = cq40Var;
            this.b = earlyPayoutCheckbox;
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
            View.OnClickListener onClickListener = this.b.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ View.OnClickListener b;

        public b(cq40 cq40Var, View.OnClickListener onClickListener) {
            this.a = cq40Var;
            this.b = onClickListener;
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
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarlyPayoutCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.early_payout_checkbox_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.check_box;
        CheckBox checkBox = (CheckBox) h5e.a(R.id.check_box, viewInflate);
        if (checkBox != null) {
            i2 = R.id.container;
            if (((LinearLayout) h5e.a(R.id.container, viewInflate)) != null) {
                i2 = R.id.dash;
                TextView textView = (TextView) h5e.a(R.id.dash, viewInflate);
                if (textView != null) {
                    i2 = R.id.description;
                    TextView textView2 = (TextView) h5e.a(R.id.description, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.info;
                        ImageView imageView = (ImageView) h5e.a(R.id.info, viewInflate);
                        if (imageView != null) {
                            i2 = R.id.loading_view;
                            View viewA = h5e.a(R.id.loading_view, viewInflate);
                            if (viewA != null) {
                                i2 = R.id.vertical_divider;
                                View viewA2 = h5e.a(R.id.vertical_divider, viewInflate);
                                if (viewA2 != null) {
                                    this.a = new ljf((ConstraintLayout) viewInflate, checkBox, textView, textView2, imageView, viewA, viewA2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static /* synthetic */ void setLoading$default(EarlyPayoutCheckbox earlyPayoutCheckbox, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        earlyPayoutCheckbox.setLoading(z, z2);
    }

    public final CheckBox getCheckBox() {
        return this.a.b;
    }

    public final void setCheckBoxListener(View.OnClickListener listener) {
        this.b = listener;
        this.a.b.setOnClickListener(new a(new cq40(), this));
    }

    public final void setCheckBoxVisible(boolean isVisible) {
        ljf ljfVar = this.a;
        if (isVisible) {
            ljfVar.b.setVisibility(0);
        } else {
            ljfVar.b.setVisibility(8);
        }
    }

    public final void setChecked(boolean isChecked) {
        this.a.b.setChecked(isChecked);
    }

    public final void setDashViewVisible(boolean isVisible) {
        ljf ljfVar = this.a;
        ljfVar.c.setVisibility(isVisible ? 0 : 8);
        if (isVisible) {
            ljfVar.i.setVisibility(8);
        }
    }

    public final void setDescription(String text) {
        text.getClass();
        this.a.d.setText(text);
    }

    public final void setInfoClickListener(View.OnClickListener listener) {
        this.a.e.setOnClickListener(new b(new cq40(), listener));
    }

    public final void setInfoVisible(boolean isVisible) {
        this.a.e.setVisibility(isVisible ? 0 : 8);
    }

    public final void setLoading(boolean isLoading, boolean isQuickBet) {
        ljf ljfVar = this.a;
        ljfVar.f.setVisibility(isLoading ? 0 : 8);
        if (isLoading) {
            ColorDrawable colorDrawable = new ColorDrawable(getContext().getColor(isQuickBet ? R.color.custom_brand_tertiary_type2 : R.color.background_general_primary));
            colorDrawable.setAlpha(128);
            ljfVar.f.setBackground(colorDrawable);
        }
    }

    public final void setVerticalDividerVisible(boolean isVisible) {
        ljf ljfVar = this.a;
        ljfVar.i.setVisibility(isVisible ? 0 : 8);
        if (isVisible) {
            ljfVar.c.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EarlyPayoutCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EarlyPayoutCheckbox(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ EarlyPayoutCheckbox(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
