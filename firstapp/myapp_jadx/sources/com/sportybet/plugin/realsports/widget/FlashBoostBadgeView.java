package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.hwr;
import defpackage.ku1;
import defpackage.mpe0;
import defpackage.s84;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportybet/plugin/realsports/widget/FlashBoostBadgeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Lttr;", "getTextView", "()Landroid/widget/TextView;", "textView", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FlashBoostBadgeView extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final mpe0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashBoostBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = hwr.b(new s84(this, 1));
    }

    private final TextView getTextView() {
        Object value = this.a.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final void a(ku1 ku1Var, boolean z) {
        setBackgroundResource(ku1Var == ku1.a ? R.drawable.bg_flash_boost_badge_top : R.drawable.bg_flash_boost_badge_bottom);
        getTextView().setTextColor(z ? getContext().getColor(R.color.text_inverse_primary) : getContext().getColor(R.color.flash_boost_badge_text));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashBoostBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashBoostBadgeView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ FlashBoostBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
