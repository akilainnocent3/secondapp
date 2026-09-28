package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.cnm;
import defpackage.h5e;
import defpackage.rk30;
import defpackage.sn5;
import defpackage.uhc;
import defpackage.x7i0;
import defpackage.zch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/sportybet/android/widget/HintView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hint", "", "setHint", "(Ljava/lang/CharSequence;)V", "htmlHint", "flags", "setHintInHtml", "(Ljava/lang/CharSequence;I)V", "", "getHint", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "listener", "setOnCloseCLickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/sportybet/android/widget/HintView$a;", "typeColor", "setTypeColor", "(Lcom/sportybet/android/widget/HintView$a;)V", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "a", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HintView extends LinearLayout {
    public final x7i0 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TextView textView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("YELLOW", 0);
            a = aVar;
            a aVar2 = new a("RED", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2, new a("BLUE", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_hint, this);
        int i2 = R.id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.icon, this);
        if (appCompatImageView != null) {
            i2 = R.id.icon_close;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.icon_close, this);
            if (appCompatImageView2 != null) {
                i2 = R.id.textView;
                TextView textView = (TextView) h5e.a(R.id.textView, this);
                if (textView != null) {
                    this.a = new x7i0(this, appCompatImageView, appCompatImageView2, textView);
                    this.textView = textView;
                    int iB = zch0.b(context.getResources(), 11);
                    setPadding(0, iB, 0, iB);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.p, i, 0);
                    typedArrayObtainStyledAttributes.getClass();
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        setBackground(typedArrayObtainStyledAttributes.getDrawable(0));
                    } else {
                        setBackgroundResource(R.color.background_hint_type1);
                    }
                    textView.setText(sn5.a(3, context, typedArrayObtainStyledAttributes));
                    textView.setTextColor(typedArrayObtainStyledAttributes.getColor(4, context.getColor(R.color.text_type1_primary)));
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(1, context.getColor(R.color.hint_icon_tint))));
                    appCompatImageView2.setVisibility(typedArrayObtainStyledAttributes.getBoolean(2, false) ? 0 : 8);
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public static /* synthetic */ void setHintInHtml$default(HintView hintView, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 63;
        }
        hintView.setHintInHtml(charSequence, i);
    }

    public final String getHint() {
        CharSequence text = this.a.d.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final void setHint(CharSequence hint) {
        this.a.d.setText(hint);
    }

    public final void setHintInHtml(CharSequence htmlHint, int flags) {
        htmlHint.getClass();
        this.a.d.setText(cnm.a(flags, 6, htmlHint.toString()));
    }

    public final void setOnCloseCLickListener(View.OnClickListener listener) {
        listener.getClass();
        this.a.c.setOnClickListener(listener);
    }

    public final void setTypeColor(a typeColor) {
        typeColor.getClass();
        int iOrdinal = typeColor.ordinal();
        x7i0 x7i0Var = this.a;
        if (iOrdinal == 0) {
            setBackgroundResource(R.color.background_hint_type1);
            x7i0Var.b.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.hint_icon_tint)));
        } else if (iOrdinal == 1) {
            setBackgroundResource(R.color.background_hint_type2);
            x7i0Var.b.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.hint_icon_tint_red)));
        } else if (iOrdinal != 2) {
            uhc.a();
        } else {
            setBackgroundResource(R.color.background_hint_type3);
            x7i0Var.b.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.hint_icon_tint_blue)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HintView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ HintView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.hintViewStyle);
    }
}
