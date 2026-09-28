package com.sportybet.android.cashoutphase3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.ns6;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/cashoutphase3/CashOutTeamInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Pair;", "", "data", "", "setData", "(Lkotlin/Pair;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CashOutTeamInfoView extends ConstraintLayout {
    public final ns6 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashOutTeamInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.cashout_team_info_item, this);
        int i2 = R.id.cashout_teams;
        TextView textView = (TextView) h5e.a(R.id.cashout_teams, this);
        if (textView != null) {
            i2 = R.id.time_score;
            TextView textView2 = (TextView) h5e.a(R.id.time_score, this);
            if (textView2 != null) {
                this.F = new ns6(this, textView, textView2);
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setData(Pair<? extends CharSequence, ? extends CharSequence> data) {
        data.getClass();
        CharSequence charSequence = (CharSequence) data.a;
        CharSequence charSequence2 = (CharSequence) data.b;
        ns6 ns6Var = this.F;
        ns6Var.b.setText(charSequence);
        ns6Var.c.setText(charSequence2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashOutTeamInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashOutTeamInfoView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CashOutTeamInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
