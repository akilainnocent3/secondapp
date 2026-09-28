package com.sportybet.plugin.realsports.event.comment.prematch.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.vo20;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/view/PostSocialPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/plugin/realsports/event/comment/prematch/view/PostSocialPanel$a;", "listener", "Lcom/sportybet/plugin/realsports/event/comment/prematch/view/PostSocialPanel$a;", "getListener", "()Lcom/sportybet/plugin/realsports/event/comment/prematch/view/PostSocialPanel$a;", "setListener", "(Lcom/sportybet/plugin/realsports/event/comment/prematch/view/PostSocialPanel$a;)V", "Landroid/widget/TextView;", "getReply", "()Landroid/widget/TextView;", "reply", "getCount", "count", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PostSocialPanel extends ConstraintLayout implements View.OnClickListener {
    public final vo20 F;

    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSocialPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.prematch_comment_social_panel, this);
        int i2 = R.id.comments_count;
        TextView textView = (TextView) h5e.a(R.id.comments_count, this);
        if (textView != null) {
            i2 = R.id.comments_reply;
            TextView textView2 = (TextView) h5e.a(R.id.comments_reply, this);
            if (textView2 != null) {
                this.F = new vo20(this, textView, textView2);
                textView2.setOnClickListener(this);
                textView.setOnClickListener(this);
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final TextView getCount() {
        return this.F.b;
    }

    public final a getListener() {
        return null;
    }

    public final TextView getReply() {
        return this.F.c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            view.getId();
        }
    }

    public final void setListener(a aVar) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostSocialPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostSocialPanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ PostSocialPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
