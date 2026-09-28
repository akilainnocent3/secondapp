package com.sportybet.plugin.realsports.betslip.simulate;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.simulate.SimulateAutoBetPanel;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.h5e;
import defpackage.jtr;
import defpackage.zk90;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sportybet/plugin/realsports/betslip/simulate/SimulateAutoBetPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/plugin/realsports/betslip/simulate/SimulateAutoBetPanel$a;", "listener", "", "setAutoBetTimesListener", "(Lcom/sportybet/plugin/realsports/betslip/simulate/SimulateAutoBetPanel$a;)V", "getCurrentTimes", "()I", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SimulateAutoBetPanel extends ConstraintLayout {
    public static final /* synthetic */ int K = 0;
    public int F;
    public int G;
    public final int H;
    public a I;
    public final jtr J;

    public interface a {
        void a(int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimulateAutoBetPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.F = 1;
        this.G = 10;
        this.H = 1;
        LayoutInflater.from(context).inflate(R.layout.layout_simulate_times_panel, this);
        int i2 = R.id.btn_minus;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) h5e.a(R.id.btn_minus, this);
        if (appCompatImageButton != null) {
            i2 = R.id.btn_plus;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) h5e.a(R.id.btn_plus, this);
            if (appCompatImageButton2 != null) {
                i2 = R.id.btn_tips_mark;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.btn_tips_mark, this);
                if (appCompatImageView != null) {
                    i2 = R.id.label_times_simulate;
                    if (((TextView) h5e.a(R.id.label_times_simulate, this)) != null) {
                        i2 = R.id.simulate_times;
                        TextView textView = (TextView) h5e.a(R.id.simulate_times, this);
                        if (textView != null) {
                            this.J = new jtr(this, appCompatImageButton, appCompatImageButton2, appCompatImageView, textView);
                            setPadding(bqe.a(16.0f), 0, bqe.a(16.0f), 0);
                            appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: xk90
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    SimulateAutoBetPanel simulateAutoBetPanel = this.a;
                                    simulateAutoBetPanel.E(simulateAutoBetPanel.F - 1);
                                }
                            });
                            TypedValue typedValue = new TypedValue();
                            appCompatImageButton.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
                            appCompatImageButton.setBackgroundResource(typedValue.resourceId);
                            appCompatImageButton2.setOnClickListener(new View.OnClickListener() { // from class: yk90
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    SimulateAutoBetPanel simulateAutoBetPanel = this.a;
                                    simulateAutoBetPanel.E(simulateAutoBetPanel.F + 1);
                                }
                            });
                            TypedValue typedValue2 = new TypedValue();
                            appCompatImageButton2.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue2, true);
                            appCompatImageButton2.setBackgroundResource(typedValue2.resourceId);
                            appCompatImageView.setOnClickListener(new zk90());
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E(int i) {
        this.F = i;
        int i2 = this.G;
        int i3 = this.H;
        if (i > i2) {
            this.F = i2;
            i = i2;
        } else if (i < i3) {
            this.F = i3;
            i = i3;
        }
        a aVar = this.I;
        if (aVar != null) {
            aVar.a(i);
        }
        jtr jtrVar = this.J;
        jtrVar.c.setEnabled(this.F != this.G);
        jtrVar.b.setEnabled(this.F != i3);
        jtrVar.d.setText(String.valueOf(this.F));
    }

    /* JADX INFO: renamed from: getCurrentTimes, reason: from getter */
    public final int getF() {
        return this.F;
    }

    public final void setAutoBetTimesListener(a listener) {
        listener.getClass();
        this.I = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimulateAutoBetPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimulateAutoBetPanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SimulateAutoBetPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
