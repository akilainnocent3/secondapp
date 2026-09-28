package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;
import defpackage.lop;
import defpackage.rk30;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ClearEditText extends SecureEditText implements View.OnFocusChangeListener, TextWatcher {
    public b A;
    public final Drawable y;
    public TextView z;

    public class a implements Runnable {
        public final /* synthetic */ MotionEvent a;

        public a(MotionEvent motionEvent) {
            this.a = motionEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ClearEditText clearEditText = ClearEditText.this;
            MotionEvent motionEvent = this.a;
            clearEditText.dispatchTouchEvent(motionEvent);
            motionEvent.recycle();
        }
    }

    public interface b {
        void l(CharSequence charSequence);
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable = getCompoundDrawables()[2];
        this.y = drawable;
        if (drawable == null) {
            Drawable drawableA = gr0.a(getContext(), R.drawable.ic_cancel_black_24dp);
            this.y = drawableA;
            drawableA.setTint(getContext().getColor(R.color.text_type1_secondary));
        }
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
        c(context, attributeSet);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.h);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = this.y;
        if (layoutDimension == 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable.setBounds(0, 0, layoutDimension, layoutDimension);
        }
    }

    public TextView getErrorView() {
        return this.z;
    }

    public String getTextValue() {
        Editable text = getText();
        Objects.requireNonNull(text);
        return text.toString();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            setClearIconVisible(getText().length() > 0);
            lop.d(this);
        } else {
            setClearIconVisible(false);
            lop.b(this, Boolean.FALSE);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (isFocused()) {
            setClearIconVisible(charSequence.length() > 0);
        }
        b bVar = this.A;
        if (bVar != null) {
            bVar.l(charSequence);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || getCompoundDrawables()[2] == null || motionEvent.getX() <= getWidth() - getTotalPaddingRight() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
            return super.onTouchEvent(motionEvent);
        }
        setText("");
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        post(new a(motionEventObtain));
        return true;
    }

    public void setClearIconVisible(boolean z) {
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], z ? this.y : null, getCompoundDrawables()[3]);
    }

    public void setEditable(boolean z) {
        setFocusable(z);
        setFocusableInTouchMode(z);
        setClickable(z);
        setEnabled(z);
    }

    public void setError(String str) {
        if (str == null) {
            setActivated(false);
            this.z.setVisibility(8);
            return;
        }
        setActivated(true);
        TextView textView = this.z;
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        textView.setText(spannedFromHtml);
        this.z.setVisibility(0);
    }

    public void setErrorView(TextView textView) {
        this.z = textView;
    }

    public void setErrorWithClickableText(CharSequence charSequence) {
        if (charSequence == null) {
            setActivated(false);
            this.z.setVisibility(8);
        } else {
            setActivated(true);
            this.z.setText(charSequence);
            this.z.setMovementMethod(LinkMovementMethod.getInstance());
            this.z.setVisibility(0);
        }
    }

    public void setMaxLength(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setTextChangedListener(b bVar) {
        this.A = bVar;
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
        c(context, attributeSet);
    }

    public ClearEditText(Context context) {
        this(context, null);
    }
}
