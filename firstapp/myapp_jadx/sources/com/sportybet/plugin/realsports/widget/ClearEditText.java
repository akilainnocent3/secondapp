package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.android.bookingcode.presentation.widget.BookingCodePanel;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;
import defpackage.k05;

/* JADX INFO: loaded from: classes7.dex */
public class ClearEditText extends AppCompatEditText implements View.OnFocusChangeListener, TextWatcher {
    public boolean i;
    public Drawable v;
    public b w;
    public TextView y;

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
    }

    public ClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable = getCompoundDrawables()[2];
        this.v = drawable;
        if (drawable == null) {
            Drawable drawableA = gr0.a(getContext(), R.drawable.ic_cancel_black_24dp);
            this.v = drawableA;
            drawableA.setTint(getContext().getColor(R.color.text_type1_secondary));
        }
        Drawable drawable2 = this.v;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.v.getIntrinsicHeight());
        setClearIconVisible(false);
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.i = z;
        if (z) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.i) {
            setClearIconVisible(charSequence.length() > 0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && getCompoundDrawables()[2] != null && motionEvent.getX() > getWidth() - getTotalPaddingRight() && motionEvent.getX() < getWidth() - getPaddingRight()) {
            setText("");
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            post(new a(motionEventObtain));
            return true;
        }
        b bVar = this.w;
        if (bVar != null) {
            BookingCodePanel bookingCodePanel = ((k05) bVar).a;
            int i = BookingCodePanel.e0;
            if (motionEvent.getAction() == 1) {
                if (System.currentTimeMillis() - bookingCodePanel.T.longValue() < ViewConfiguration.getLongPressTimeout()) {
                    bookingCodePanel.M.b.setVisibility(8);
                }
            } else if (motionEvent.getAction() == 0) {
                bookingCodePanel.T = Long.valueOf(System.currentTimeMillis());
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClearDrawable(Drawable drawable) {
        if (drawable != null) {
            this.v = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.v.getIntrinsicHeight());
        }
    }

    public void setClearIconVisible(boolean z) {
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], z ? this.v : null, getCompoundDrawables()[3]);
    }

    public void setError(String str) {
        if (str == null) {
            setActivated(false);
            this.y.setVisibility(8);
        } else {
            setActivated(true);
            this.y.setText(str);
            this.y.setVisibility(0);
        }
    }

    public void setErrorView(TextView textView) {
        this.y = textView;
    }

    public void setMaxLength(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setOnTouchCallBack(b bVar) {
        this.w = bVar;
    }

    public ClearEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.editTextStyle);
    }

    public ClearEditText(Context context) {
        this(context, null);
    }
}
