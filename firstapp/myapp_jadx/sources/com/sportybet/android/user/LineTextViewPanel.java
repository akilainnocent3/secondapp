package com.sportybet.android.user;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import defpackage.cfs;
import defpackage.gr0;
import defpackage.itf0;
import defpackage.nul;
import defpackage.o0b;
import defpackage.rk30;
import defpackage.sn5;
import defpackage.y8j;
import defpackage.zch0;

/* JADX INFO: loaded from: classes6.dex */
public class LineTextViewPanel extends nul {
    public TextView c;
    public TextView d;
    public TextView e;
    public y8j f;

    public LineTextViewPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.t);
        String strA = sn5.a(2, context, typedArrayObtainStyledAttributes);
        String strA2 = sn5.a(4, context, typedArrayObtainStyledAttributes);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(strA)) {
            this.c.setText(strA);
        }
        if (!TextUtils.isEmpty(strA2)) {
            this.d.setText(strA2);
        }
        if (!z) {
            this.d.setText("");
        }
        if (drawable != null) {
            this.c.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.g(" leftTextSize = %d", Integer.valueOf(dimensionPixelSize));
        if (dimensionPixelSize > 0) {
            this.c.setTextSize(1, dimensionPixelSize);
        }
    }

    public final void a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.line_text_layout, (ViewGroup) this, true);
        this.c = (TextView) viewInflate.findViewById(R.id.left_text);
        this.d = (TextView) viewInflate.findViewById(R.id.right_text);
        this.e = (TextView) viewInflate.findViewById(R.id.status);
        Drawable drawableA = gr0.a(context, R.drawable.ic_keyboard_arrow_right_black_24dp);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTintList(o0b.b(getContext(), R.color.list_item_arrow_color));
        }
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
    }

    public String getRightText() {
        return this.d.getText().toString();
    }

    public void setLeftText(int i) {
        this.c.setText(sn5.c(this, i, new Object[0]));
    }

    public void setLineTextEditable(String str, boolean z, int i) {
        this.e.setVisibility(i);
        if (z) {
            setRightColor(getContext().getColor(R.color.brand_quaternary));
            setRightText(str);
            return;
        }
        setRightColor(getContext().getColor(R.color.text_type1_secondary));
        if (this.e.getVisibility() == 8) {
            setRightTextWithPadding(str, zch0.a(getContext(), 16));
        }
        setRightTextIndicatorVisible(false);
        setOnClickListener(null);
    }

    public void setRightColor(int i) {
        this.d.setTextColor(i);
    }

    public void setRightText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.d;
        if (zIsEmpty) {
            textView.setText(sn5.c(this, R.string.common_functions__edit, new Object[0]));
        } else {
            textView.setText(charSequence);
        }
    }

    public void setRightTextCheckedIndicator() {
        Drawable drawableA = gr0.a(getContext(), R.drawable.ic__successful);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTint(getContext().getColor(R.color.brand_quaternary));
        }
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
        this.d.setCompoundDrawablePadding(zch0.a(getContext(), 10));
    }

    public void setRightTextColor(int i) {
        this.d.setTextColor(getContext().getColor(i));
    }

    public void setRightTextFsPrivacyRule(String str) {
        this.f.d(this.d, str);
    }

    public void setRightTextIndicatorVisible(boolean z) {
        if (!z) {
            this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawableA = gr0.a(getContext(), R.drawable.ic_keyboard_arrow_right_black_24dp);
        if (drawableA != null) {
            drawableA.mutate();
            drawableA.setTintList(o0b.b(getContext(), R.color.list_item_arrow_color));
        }
        this.d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
    }

    public void setRightTextVisibility(int i) {
        this.d.setVisibility(i);
        TextView textView = this.e;
        if (i != 0) {
            textView.setVisibility(i);
        } else {
            if (TextUtils.isEmpty(textView.getText())) {
                return;
            }
            this.e.setVisibility(i);
        }
    }

    public void setRightTextWithPadding(String str, int i) {
        this.d.setText(str);
        this.d.setPadding(0, 0, i, 0);
    }

    public void setLeftText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setRightText(int i) {
        this.d.setText(sn5.c(this, i, new Object[0]));
    }

    public LineTextViewPanel(Context context) {
        super(context);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((cfs) generatedComponent()).I(this);
        }
        a(context);
    }
}
