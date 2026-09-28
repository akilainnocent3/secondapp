package com.sportybet.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.sn5;
import defpackage.uhc;
import defpackage.yry;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0014J%\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/widget/OneUpTwoUpItemControl;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/android/widget/OneUpTwoUpSwitch;", "getSwitchView", "()Lcom/sportybet/android/widget/OneUpTwoUpSwitch;", "Lcom/sportybet/android/widget/OneUpTwoUpCheckbox;", "getCheckBoxView", "()Lcom/sportybet/android/widget/OneUpTwoUpCheckbox;", "", "visible", "", "setDashViewVisible", "(Z)V", "setSwitchVisible", "setCheckBoxVisible", "isSupported", "Lcom/sportybet/android/widget/OneUpTwoUpSwitch$c;", "mode", "showUnsupportedDescription", "setSupported", "(ZLcom/sportybet/android/widget/OneUpTwoUpSwitch$c;Z)V", "Lcom/sportybet/android/widget/OneUpTwoUpCheckbox$a;", "(ZLcom/sportybet/android/widget/OneUpTwoUpCheckbox$a;Z)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OneUpTwoUpItemControl extends ConstraintLayout {
    public final yry F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpItemControl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.one_two_up_item_control_view, this);
        int i2 = R.id.barrier_right;
        if (((Barrier) h5e.a(R.id.barrier_right, this)) != null) {
            i2 = R.id.dash;
            TextView textView = (TextView) h5e.a(R.id.dash, this);
            if (textView != null) {
                i2 = R.id.description;
                TextView textView2 = (TextView) h5e.a(R.id.description, this);
                if (textView2 != null) {
                    i2 = R.id.one_two_up_checkbox;
                    OneUpTwoUpCheckbox oneUpTwoUpCheckbox = (OneUpTwoUpCheckbox) h5e.a(R.id.one_two_up_checkbox, this);
                    if (oneUpTwoUpCheckbox != null) {
                        i2 = R.id.one_two_up_switch;
                        OneUpTwoUpSwitch oneUpTwoUpSwitch = (OneUpTwoUpSwitch) h5e.a(R.id.one_two_up_switch, this);
                        if (oneUpTwoUpSwitch != null) {
                            this.F = new yry(this, textView, textView2, oneUpTwoUpCheckbox, oneUpTwoUpSwitch);
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final OneUpTwoUpCheckbox getCheckBoxView() {
        return this.F.d;
    }

    public final OneUpTwoUpSwitch getSwitchView() {
        return this.F.e;
    }

    public final void setCheckBoxVisible(boolean visible) {
        this.F.d.setVisibility(visible ? 0 : 8);
    }

    public final void setDashViewVisible(boolean visible) {
        this.F.b.setVisibility(visible ? 0 : 8);
    }

    public final void setSupported(boolean isSupported, OneUpTwoUpSwitch.c mode, boolean showUnsupportedDescription) {
        String strC;
        mode.getClass();
        yry yryVar = this.F;
        yryVar.c.setVisibility((isSupported || !showUnsupportedDescription) ? 8 : 0);
        if (isSupported || !showUnsupportedDescription) {
            return;
        }
        TextView textView = yryVar.c;
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            strC = sn5.c(this, R.string.component_betslip__1up_and_2up_not_supported, new Object[0]);
        } else if (iOrdinal == 1) {
            strC = sn5.c(this, R.string.component_betslip__1up_not_supported, new Object[0]);
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            strC = sn5.c(this, R.string.component_betslip__2up_not_supported, new Object[0]);
        }
        textView.setText(strC);
    }

    public final void setSwitchVisible(boolean visible) {
        this.F.e.setVisibility(visible ? 0 : 8);
    }

    public final void setSupported(boolean isSupported, OneUpTwoUpCheckbox.a mode, boolean showUnsupportedDescription) {
        String strC;
        mode.getClass();
        yry yryVar = this.F;
        yryVar.c.setVisibility((isSupported || !showUnsupportedDescription) ? 8 : 0);
        yryVar.d.setSupported(isSupported);
        if (isSupported || !showUnsupportedDescription) {
            return;
        }
        TextView textView = yryVar.c;
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            strC = sn5.c(this, R.string.component_betslip__1up_not_supported, new Object[0]);
        } else if (iOrdinal == 1) {
            strC = sn5.c(this, R.string.component_betslip__2up_not_supported, new Object[0]);
        } else {
            uhc.a();
            return;
        }
        textView.setText(strC);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpItemControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpItemControl(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OneUpTwoUpItemControl(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
