package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gky;
import defpackage.r0b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0013¨\u0006!"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/OutcomeButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "description", "", "setOutcomeDesc", "(Ljava/lang/String;)V", "value", "setOutcomeValue", "color", "setOutcomeDescColor", "(I)V", "setOutcomeColor", "visibility", "setOutcomeDescVisibility", "setOutcomeVisibility", "setLockVisibility", "", "enabled", "setOutcomeDescEnabled", "(Z)V", "setOutcomeEnabled", "setLockEnabled", "gravity", "setOutcomeGravity", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OutcomeButton extends LinearLayout {
    public final TextView a;
    public final ImageView b;
    public final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.iwqk_layout_outcome_button, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.outcome_desc);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.outcome_lock);
        viewFindViewById2.getClass();
        ImageView imageView = (ImageView) viewFindViewById2;
        this.b = imageView;
        View viewFindViewById3 = findViewById(R.id.outcome_value);
        viewFindViewById3.getClass();
        this.c = (TextView) viewFindViewById3;
        if (r0b.d(context)) {
            imageView.setColorFilter(getContext().getColor(R.color.text_disable_type2_primary));
        } else {
            imageView.clearColorFilter();
        }
    }

    public final void setLockEnabled(boolean enabled) {
        this.b.setEnabled(enabled);
    }

    public final void setLockVisibility(int visibility) {
        this.b.setVisibility(visibility);
    }

    public final void setOutcomeColor(int color) {
        this.c.setTextColor(color);
    }

    public final void setOutcomeDesc(String description) {
        description.getClass();
        if (TextUtils.isEmpty(description)) {
            return;
        }
        this.a.setText(description);
    }

    public final void setOutcomeDescColor(int color) {
        this.a.setTextColor(color);
    }

    public final void setOutcomeDescEnabled(boolean enabled) {
        this.a.setEnabled(enabled);
    }

    public final void setOutcomeDescVisibility(int visibility) {
        this.a.setVisibility(visibility);
    }

    public final void setOutcomeEnabled(boolean enabled) {
        this.c.setEnabled(enabled);
    }

    public final void setOutcomeGravity(int gravity) {
        this.c.setGravity(gravity);
    }

    public final void setOutcomeValue(String value) {
        value.getClass();
        if (TextUtils.isEmpty(value)) {
            return;
        }
        this.c.setText(gky.a(value));
    }

    public final void setOutcomeVisibility(int visibility) {
        this.c.setVisibility(visibility);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutcomeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutcomeButton(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OutcomeButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
