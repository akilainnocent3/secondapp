package com.sportybet.android.bethistory.presentation.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.h5e;
import defpackage.sn5;
import defpackage.xjd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/viewholder/EditBetHistoryItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "betType", "", "time", "", "setupInfo", "(ILjava/lang/String;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EditBetHistoryItemView extends ConstraintLayout {
    public final xjd0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditBetHistoryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_ticket_detail_edit_history_item, this);
        int i2 = R.id.bet_type;
        TextView textView = (TextView) h5e.a(R.id.bet_type, this);
        if (textView != null) {
            i2 = R.id.time;
            TextView textView2 = (TextView) h5e.a(R.id.time, this);
            if (textView2 != null) {
                this.F = new xjd0(this, textView, textView2);
                int iB = bqe.b(12.0f, context);
                setPadding(0, iB, 0, iB);
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setupInfo(int betType, String time) {
        time.getClass();
        xjd0 xjd0Var = this.F;
        xjd0Var.b.setText(sn5.c(this, betType, new Object[0]));
        xjd0Var.c.setText(time);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditBetHistoryItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditBetHistoryItemView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ EditBetHistoryItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
