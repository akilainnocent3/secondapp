package com.sporty.android.common_ui.widgets;

import android.R;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.lop;
import defpackage.rk30;
import defpackage.zch0;
import defpackage.zen;

/* JADX INFO: loaded from: classes4.dex */
public class SmsInputView extends AppCompatEditText {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final int H;
    public int I;
    public c J;
    public boolean K;
    public float L;
    public float M;
    public final GradientDrawable N;
    public boolean O;
    public final StringBuilder i;
    public final Paint v;
    public final TextPaint w;
    public final int y;
    public int z;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SmsInputView.this.getText().clear();
        }
    }

    public class b extends InputConnectionWrapper {
        public b(BaseInputConnection baseInputConnection) {
            super(baseInputConnection, true);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean deleteSurroundingText(int i, int i2) {
            if (i <= 0 || i2 != 0) {
                return super.deleteSurroundingText(i, i2);
            }
            SmsInputView smsInputView = SmsInputView.this;
            StringBuilder sb = smsInputView.i;
            sb.setLength(Math.max(sb.length() - i, 0));
            smsInputView.invalidate();
            return true;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean performEditorAction(int i) {
            if (i == 6) {
                SmsInputView smsInputView = SmsInputView.this;
                if (smsInputView.i.length() < smsInputView.y) {
                    return false;
                }
                c cVar = smsInputView.J;
                if (cVar != null) {
                    cVar.W0();
                }
            }
            return super.performEditorAction(i);
        }
    }

    public interface c {
        void O(CharSequence charSequence);

        void W0();

        void b0(CharSequence charSequence);
    }

    public SmsInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new StringBuilder();
        this.v = new Paint(1);
        this.w = new TextPaint(1);
        this.y = 6;
        this.z = 0;
        this.K = false;
        this.M = 0.0f;
        this.N = new GradientDrawable();
        this.O = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.x);
            this.y = typedArrayObtainStyledAttributes.getInteger(2, 4);
            this.D = typedArrayObtainStyledAttributes.getColor(8, context.getColor(R.color.primary_text_dark));
            this.E = typedArrayObtainStyledAttributes.getColor(0, context.getColor(R.color.primary_text_dark));
            this.I = typedArrayObtainStyledAttributes.getColor(1, context.getColor(R.color.primary_text_dark));
            this.F = typedArrayObtainStyledAttributes.getInteger(3, 0);
            this.H = typedArrayObtainStyledAttributes.getInteger(4, 0);
            this.G = typedArrayObtainStyledAttributes.getBoolean(5, true);
            this.z = typedArrayObtainStyledAttributes.getInteger(6, this.z);
            typedArrayObtainStyledAttributes.recycle();
        }
        c();
    }

    private int getDefaultHeight() {
        return this.B;
    }

    private int getDefaultWidth() {
        return this.y * this.A;
    }

    public final void b() {
        this.i.setLength(0);
        invalidate();
    }

    public final void c() {
        this.A = zch0.a(getContext(), 50);
        this.B = zch0.a(getContext(), 50);
        this.C = zch0.a(getContext(), 16);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.v;
        paint.setStyle(style);
        paint.setColor(this.E);
        paint.setStrokeWidth(zch0.a(getContext(), 1));
        float f = this.C;
        TextPaint textPaint = this.w;
        textPaint.setTextSize(f);
        textPaint.setColor(this.D);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, this.F));
        this.L = zch0.a(getContext(), 5);
        int iA = zch0.a(getContext(), 24);
        setFocusableInTouchMode(true);
        setBackground(null);
        setCursorVisible(this.G);
        setLongClickable(this.G);
        setPadding(iA, 0, iA, 0);
        addTextChangedListener(new a());
    }

    public CharSequence getCurrentNumber() {
        return this.i;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestFocus();
        if (this.O) {
            lop.d(this);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i = this.z;
        if (i == 0) {
            editorInfo.inputType = 2;
        } else if (i == 1) {
            editorInfo.inputType = 524288;
        }
        editorInfo.imeOptions = 6;
        return new b(new BaseInputConnection(this, false));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        StringBuilder sb;
        int i2 = 0;
        while (true) {
            i = this.y;
            sb = this.i;
            if (i2 >= i) {
                break;
            }
            GradientDrawable gradientDrawable = this.N;
            gradientDrawable.setShape(0);
            float fA = zch0.a(getContext(), 2);
            gradientDrawable.setCornerRadii(new float[]{fA, fA, fA, fA, fA, fA, fA, fA});
            int i3 = this.A;
            float f = i3 * i2;
            float f2 = i3;
            gradientDrawable.setBounds((int) ((0.1f * f2) + f), 0, (int) ((f2 * 0.9f) + f), this.B);
            gradientDrawable.setStroke(zch0.a(getContext(), 1), i2 > sb.length() ? this.E : this.I);
            if (this.H == 1) {
                gradientDrawable.setColor(getContext().getColor(com.sportybet.android.gp.tz.R.color.line_type1_primary));
            } else {
                gradientDrawable.setColor(0);
            }
            gradientDrawable.draw(canvas);
            i2++;
        }
        TextPaint textPaint = this.w;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f3 = fontMetrics.bottom - fontMetrics.top;
        int height = getHeight();
        float fA2 = this.M;
        if (fA2 == 0.0f) {
            float f4 = height;
            fA2 = zen.a(f4, f3, 2.0f, f4) - fontMetrics.bottom;
            this.M = fA2;
        }
        int i4 = this.K ? height / 2 : (int) fA2;
        if (TextUtils.isEmpty(sb)) {
            return;
        }
        if (sb.length() > i) {
            sb.delete(i, sb.length() - 1);
        }
        for (int i5 = 0; i5 < sb.length(); i5++) {
            if (this.K) {
                int i6 = this.A;
                canvas.drawCircle((i6 / 2) + (i6 * i5), i4, this.L, textPaint);
            } else {
                String str = "" + sb.charAt(i5);
                int i7 = this.A;
                canvas.drawText(str, (i7 / 2) + (i7 * i5), i4, textPaint);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        c cVar;
        if (keyEvent != null && keyEvent.getMetaState() != 0) {
            return super.onKeyUp(i, keyEvent);
        }
        int i2 = this.z;
        StringBuilder sb = this.i;
        if (i2 == 0 ? !(i < 7 || i > 16) : !(i2 != 1 || ((i < 7 || i > 16) && (i < 29 || i > 54)))) {
            int length = sb.length();
            int i3 = this.y;
            if (length < i3) {
                char unicodeChar = (char) keyEvent.getUnicodeChar();
                int i4 = this.z;
                if (i4 == 0) {
                    sb.append(unicodeChar);
                } else if (i4 == 1) {
                    sb.append(Character.toUpperCase(unicodeChar));
                }
                c cVar2 = this.J;
                if (cVar2 != null) {
                    cVar2.b0(sb);
                }
                if (sb.length() == i3 && (cVar = this.J) != null) {
                    cVar.O(sb);
                }
                invalidate();
                return true;
            }
        }
        if (i != 67) {
            return super.onKeyUp(i, keyEvent);
        }
        sb.setLength(Math.max(sb.length() - 1, 0));
        c cVar3 = this.J;
        if (cVar3 != null) {
            cVar3.b0(sb);
        }
        invalidate();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.B = zch0.a(getContext(), 50);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int defaultWidth = getDefaultWidth();
        int defaultHeight = getDefaultHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            size = getDefaultWidth();
        } else if (mode != 1073741824) {
            size = defaultWidth;
        } else {
            this.A = size / this.y;
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            size2 = getDefaultHeight();
        } else if (mode2 != 1073741824) {
            size2 = defaultHeight;
        } else {
            this.B = size2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (!this.G) {
            return super.onTextContextMenuItem(i);
        }
        if (i == 16908322) {
            try {
                String strTrim = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).getText().toString().trim();
                int i2 = this.z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        for (int i3 = 0; i3 < strTrim.length(); i3++) {
                            char cCharAt = strTrim.charAt(i3);
                            if (!Character.isDigit(cCharAt) && !Character.isLetter(cCharAt)) {
                            }
                        }
                        setCurrentNumber(strTrim);
                    }
                } else if (TextUtils.isDigitsOnly(strTrim)) {
                    setCurrentNumber(strTrim);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        getText().clear();
        return false;
    }

    public void setBoxColor(int i) {
        this.E = i;
        invalidate();
    }

    public void setBoxColorFill(int i) {
        this.I = i;
        invalidate();
    }

    public void setBoxFillColor(int i) {
        this.I = i;
    }

    public void setCurrentNumber(String str) {
        StringBuilder sb = this.i;
        sb.setLength(0);
        sb.append(str);
        if (this.J != null) {
            int length = sb.length();
            c cVar = this.J;
            if (length == this.y) {
                cVar.O(sb);
            } else {
                cVar.b0(sb);
            }
        }
        invalidate();
    }

    public void setCustomInputType(int i) {
        this.z = i;
    }

    public void setDefaultKeyBoardVisible(boolean z) {
        this.O = z;
    }

    public void setEnablePaste(boolean z) {
        this.G = z;
        invalidate();
    }

    public void setFontType(int i) {
        this.F = i;
        invalidate();
    }

    public void setInputListener(c cVar) {
        this.J = cVar;
    }

    public void setInputTextColor(int i) {
        this.D = i;
        invalidate();
    }

    public SmsInputView(Context context) {
        super(context);
        this.i = new StringBuilder();
        this.v = new Paint(1);
        this.w = new TextPaint(1);
        this.y = 6;
        this.z = 0;
        this.K = false;
        this.M = 0.0f;
        this.N = new GradientDrawable();
        this.O = true;
        c();
    }
}
