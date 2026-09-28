package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import defpackage.akd0;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.sn5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/widget/EPLStreamingMentionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "showInDotCom", "", "setEPLWatchText", "(Z)V", "Lcom/sportybet/plugin/realsports/widget/EPLStreamingMentionView$a;", "G", "Lcom/sportybet/plugin/realsports/widget/EPLStreamingMentionView$a;", "getListener", "()Lcom/sportybet/plugin/realsports/widget/EPLStreamingMentionView$a;", "setListener", "(Lcom/sportybet/plugin/realsports/widget/EPLStreamingMentionView$a;)V", "listener", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EPLStreamingMentionView extends ConstraintLayout implements View.OnClickListener {
    public final akd0 F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public a listener;

    /* JADX INFO: loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPLStreamingMentionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_view_epl_mention, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.epl_desc;
        TextView textView = (TextView) h5e.a(R.id.epl_desc, viewInflate);
        if (textView != null) {
            i2 = R.id.epl_watch_text;
            TextView textView2 = (TextView) h5e.a(R.id.epl_watch_text, viewInflate);
            if (textView2 != null) {
                this.F = new akd0((ConstraintLayout) viewInflate, textView, textView2);
                textView2.setOnClickListener(this);
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final a getListener() {
        return this.listener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.epl_watch_text || (aVar = this.listener) == null) {
            return;
        }
        aVar.a();
    }

    public final void setEPLWatchText(boolean showInDotCom) {
        akd0 akd0Var = this.F;
        if (!showInDotCom) {
            sn5.f(akd0Var.c, R.string.live__watch_now, new Object[0]);
            sn5.f(akd0Var.b, R.string.live__provide_by_sporty_com_epl, new Object[0]);
            return;
        }
        sn5.f(akd0Var.c, R.string.live__watch_via_sporty_com, new Object[0]);
        TextView textView = akd0Var.b;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(sn5.c(this, R.string.live__enjoy_matches_simulcast_on_sporty_com_epl, new Object[0])).append((CharSequence) lTGEJfVytU.Iep).append((CharSequence) "im");
        spannableStringBuilderAppend.setSpan(new ImageSpan(getContext(), R.drawable.sporty_com_logo, 0), spannableStringBuilderAppend.length() - 2, spannableStringBuilderAppend.length(), 17);
        textView.setText(spannableStringBuilderAppend.append((CharSequence) sn5.c(this, R.string.live__epl_exclamation, new Object[0])));
    }

    public final void setListener(a aVar) {
        this.listener = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EPLStreamingMentionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EPLStreamingMentionView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ EPLStreamingMentionView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
