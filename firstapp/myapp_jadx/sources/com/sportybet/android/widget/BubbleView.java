package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.eb5;
import defpackage.h5e;
import defpackage.j6i0;
import defpackage.rk30;
import defpackage.sn5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/widget/BubbleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setTitle", "(Ljava/lang/CharSequence;)V", "resId", "(I)V", "setDescription", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "getDescriptionView", "Lkotlin/Function0;", "G", "Lkotlin/jvm/functions/Function0;", "getOnClickedClose", "()Lkotlin/jvm/functions/Function0;", "setOnClickedClose", "(Lkotlin/jvm/functions/Function0;)V", "onClickedClose", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BubbleView extends ConstraintLayout {
    public static final /* synthetic */ int H = 0;
    public final j6i0 F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Function0<Unit> onClickedClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_bubble, this);
        int i2 = R.id.bottom_guideline;
        if (((Guideline) h5e.a(R.id.bottom_guideline, this)) != null) {
            i2 = R.id.bubble_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.bubble_close, this);
            if (appCompatImageView != null) {
                i2 = R.id.description;
                TextView textView = (TextView) h5e.a(R.id.description, this);
                if (textView != null) {
                    i2 = R.id.end_guideline;
                    if (((Guideline) h5e.a(R.id.end_guideline, this)) != null) {
                        i2 = R.id.start_guideline;
                        if (((Guideline) h5e.a(R.id.start_guideline, this)) != null) {
                            i2 = R.id.title;
                            TextView textView2 = (TextView) h5e.a(R.id.title, this);
                            if (textView2 != null) {
                                i2 = R.id.top_guideline;
                                if (((Guideline) h5e.a(R.id.top_guideline, this)) != null) {
                                    this.F = new j6i0(this, appCompatImageView, textView, textView2);
                                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.e, i, 0);
                                    typedArrayObtainStyledAttributes.getClass();
                                    appCompatImageView.setVisibility(typedArrayObtainStyledAttributes.getBoolean(2, false) ? 0 : 8);
                                    textView2.setText(sn5.a(5, context, typedArrayObtainStyledAttributes));
                                    textView.setText(sn5.a(3, context, typedArrayObtainStyledAttributes));
                                    appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: db5
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Function0<Unit> function0 = this.a.onClickedClose;
                                            if (function0 != null) {
                                                function0.invoke();
                                            }
                                        }
                                    });
                                    setOnClickListener(new eb5());
                                    textView2.setVisibility(typedArrayObtainStyledAttributes.getBoolean(6, true) ? 0 : 8);
                                    textView.setVisibility(typedArrayObtainStyledAttributes.getBoolean(4, true) ? 0 : 8);
                                    int i3 = typedArrayObtainStyledAttributes.getInt(7, 0);
                                    if (i3 == 0) {
                                        setBackgroundResource(R.drawable.mm_hint);
                                    } else if (i3 == 1) {
                                        setBackgroundResource(R.drawable.hint_top_left);
                                    } else if (i3 == 2) {
                                        setBackgroundResource(R.drawable.hint_bottom_left);
                                    } else if (i3 == 3) {
                                        setBackgroundResource(R.drawable.center);
                                    }
                                    if (typedArrayObtainStyledAttributes.hasValue(1)) {
                                        setBackgroundTintList(typedArrayObtainStyledAttributes.getColorStateList(1));
                                    }
                                    if (typedArrayObtainStyledAttributes.hasValue(0) && (colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0)) != null) {
                                        textView2.setTextColor(colorStateList);
                                        textView.setTextColor(colorStateList);
                                        appCompatImageView.setImageTintList(colorStateList);
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final TextView getDescriptionView() {
        return this.F.b;
    }

    public final Function0<Unit> getOnClickedClose() {
        return this.onClickedClose;
    }

    public final TextView getTitleView() {
        return this.F.c;
    }

    public final void setDescription(CharSequence text) {
        text.getClass();
        this.F.b.setText(text);
    }

    public final void setOnClickedClose(Function0<Unit> function0) {
        this.onClickedClose = function0;
    }

    public final void setTitle(CharSequence text) {
        text.getClass();
        this.F.c.setText(text);
    }

    public final void setDescription(int resId) {
        this.F.b.setText(resId);
    }

    public final void setTitle(int resId) {
        this.F.c.setText(resId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BubbleView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ BubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
