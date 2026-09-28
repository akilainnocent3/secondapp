package com.sportybet.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.cq40;
import defpackage.h5e;
import defpackage.sn5;
import defpackage.uhc;
import defpackage.vry;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sportybet/android/widget/OneUpTwoUpCheckbox;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/android/widget/OneUpTwoUpCheckbox$a;", "mode", "", "setMode", "(Lcom/sportybet/android/widget/OneUpTwoUpCheckbox$a;)V", "Landroid/view/View$OnClickListener;", "listener", "setCheckBoxListener", "(Landroid/view/View$OnClickListener;)V", "", AnalyticsParam.EVENT_STATUS_CHECKED, "setChecked", "(Z)V", "enable", "setEnable", "isSupported", "setSupported", "flag", "setPaintFlags", "(I)V", "getMode", "()Lcom/sportybet/android/widget/OneUpTwoUpCheckbox$a;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OneUpTwoUpCheckbox extends ConstraintLayout {
    public final vry F;
    public a G;
    public View.OnClickListener H;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("ONE_UP", 0);
            a = aVar;
            a aVar2 = new a("TWO_UP", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ OneUpTwoUpCheckbox b;

        public b(cq40 cq40Var, OneUpTwoUpCheckbox oneUpTwoUpCheckbox) {
            this.a = cq40Var;
            this.b = oneUpTwoUpCheckbox;
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
            View.OnClickListener onClickListener = this.b.H;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.one_two_up_checkbox_view, this);
        int i2 = R.id.check_box;
        CheckBox checkBox = (CheckBox) h5e.a(R.id.check_box, this);
        if (checkBox != null) {
            i2 = R.id.loading_text;
            TextView textView = (TextView) h5e.a(R.id.loading_text, this);
            if (textView != null) {
                i2 = R.id.loading_view;
                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.loading_view, this);
                if (progressBar != null) {
                    this.F = new vry(this, checkBox, textView, progressBar);
                    a aVar = a.a;
                    this.G = aVar;
                    setMode(aVar);
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E() {
        vry vryVar = this.F;
        vryVar.d.setVisibility(8);
        vryVar.c.setVisibility(8);
        CheckBox checkBox = vryVar.b;
        checkBox.setVisibility(0);
        checkBox.setEnabled(true);
    }

    public final void F() {
        vry vryVar = this.F;
        vryVar.d.setVisibility(0);
        vryVar.c.setVisibility(0);
        CheckBox checkBox = vryVar.b;
        checkBox.setVisibility(4);
        checkBox.setEnabled(false);
    }

    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final a getG() {
        return this.G;
    }

    public final void setCheckBoxListener(View.OnClickListener listener) {
        this.H = listener;
        this.F.b.setOnClickListener(new b(new cq40(), this));
    }

    public final void setChecked(boolean checked) {
        this.F.b.setChecked(checked);
    }

    public final void setEnable(boolean enable) {
        this.F.b.setEnabled(enable);
    }

    public final void setMode(a mode) {
        mode.getClass();
        this.G = mode;
        int iOrdinal = mode.ordinal();
        vry vryVar = this.F;
        if (iOrdinal == 0) {
            vryVar.b.setText(sn5.c(this, R.string.common_bet_ways__1up, new Object[0]));
            vryVar.c.setText(sn5.c(this, R.string.common_bet_ways__1up, new Object[0]));
        } else if (iOrdinal != 1) {
            uhc.a();
        } else {
            vryVar.b.setText(sn5.c(this, R.string.common_bet_ways__2up, new Object[0]));
            vryVar.c.setText(sn5.c(this, R.string.common_bet_ways__2up, new Object[0]));
        }
    }

    public final void setPaintFlags(int flag) {
        this.F.b.setPaintFlags(flag);
    }

    public final void setSupported(boolean isSupported) {
        vry vryVar = this.F;
        if (isSupported) {
            vryVar.b.setVisibility(0);
            vryVar.d.setVisibility(8);
        } else {
            vryVar.b.setVisibility(8);
            vryVar.d.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpCheckbox(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OneUpTwoUpCheckbox(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
