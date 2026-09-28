package com.sportybet.plugin.realsports.event.comment.prematch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sportybet.android.gp.tz.R;
import defpackage.bkd0;
import defpackage.bmy;
import defpackage.h5e;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/view/VoteCircleView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "teamName", "color", "", "setTeamName", "(Ljava/lang/String;I)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VoteCircleView extends RelativeLayout {
    public final bkd0 a;

    public VoteCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_vote_circle_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.percent;
        TextView textView = (TextView) h5e.a(R.id.percent, viewInflate);
        if (textView != null) {
            i2 = R.id.progressBar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) h5e.a(R.id.progressBar, viewInflate);
            if (circularProgressIndicator != null) {
                i2 = R.id.vote_team;
                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.vote_team, viewInflate);
                if (appCompatTextView != null) {
                    this.a = new bkd0((RelativeLayout) viewInflate, textView, circularProgressIndicator, appCompatTextView);
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(int i, int i2, boolean z) {
        bkd0 bkd0Var = this.a;
        if (!z) {
            bkd0Var.b.setVisibility(8);
            return;
        }
        AppCompatTextView appCompatTextView = bkd0Var.d;
        CircularProgressIndicator circularProgressIndicator = bkd0Var.c;
        TextView textView = bkd0Var.b;
        appCompatTextView.setTextSize(10.0f);
        textView.setVisibility(0);
        textView.setText(i + "%");
        circularProgressIndicator.setProgress(i);
        circularProgressIndicator.setIndicatorColor(bkd0Var.a.getContext().getColor(i2));
    }

    public final void setTeamName(String teamName, int color) {
        bkd0 bkd0Var = this.a;
        bkd0Var.d.setText(teamName);
        bkd0Var.d.setTextColor(color);
    }

    public VoteCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public VoteCircleView(Context context) {
        this(context, null, 6, 0);
    }

    public /* synthetic */ VoteCircleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
