package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.gr0;
import defpackage.lop;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class CombEditText extends FrameLayout implements View.OnFocusChangeListener, TextWatcher {
    public View.OnFocusChangeListener A;
    public boolean B;
    public boolean C;
    public String D;
    public Boolean E;
    public TextView a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView i;
    public final SecureEditText v;
    public CharSequence w;
    public c y;
    public d z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CombEditText combEditText = CombEditText.this;
            combEditText.v.setText("");
            c cVar = combEditText.y;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CombEditText combEditText = CombEditText.this;
            String str = combEditText.D;
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    e eVar = new e(combEditText.getContext());
                    eVar.c = com.sporty.android.common_ui.widgets.d.a.C0204a.b;
                    String str2 = combEditText.D;
                    str2.getClass();
                    eVar.e = str2;
                    eVar.b(combEditText.i);
                    return;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
    }

    public interface c {
        void a();
    }

    public interface d {
        void l(CharSequence charSequence);
    }

    public CombEditText(Context context) {
        super(context);
        this.C = false;
        this.D = "";
        this.E = Boolean.FALSE;
        LayoutInflater.from(getContext()).inflate(R.layout.comb_edit_text, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (TextView) findViewById(R.id.card_name);
        this.d = (ImageView) findViewById(R.id.image);
        ImageView imageView = (ImageView) findViewById(R.id.clear);
        this.e = imageView;
        this.f = (ImageView) findViewById(R.id.card_icon);
        SecureEditText secureEditText = (SecureEditText) findViewById(R.id.edit_text);
        this.v = secureEditText;
        ImageView imageView2 = (ImageView) findViewById(R.id.tooltip);
        this.i = imageView2;
        imageView.setOnClickListener(new a());
        imageView2.setOnClickListener(new b());
        setClearIconVisible(false);
        setCardIconVisible(false);
        setLabelVisible(false);
        secureEditText.setOnFocusChangeListener(this);
        secureEditText.addTextChangedListener(this);
    }

    public final void a() {
        boolean z = this.C;
        SecureEditText secureEditText = this.v;
        if (z) {
            secureEditText.setHint(this.w);
        } else {
            TextView textView = this.b;
            secureEditText.setHint(textView.isShown() ? this.w : textView.getText());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    public final void b() {
        int color = getContext().getColor(R.color.text_type1_secondary);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public Boolean getCanCopy() {
        return Boolean.valueOf(this.v.getCanCopy());
    }

    public ImageView getCardIconView() {
        return this.f;
    }

    public EditText getEditView() {
        return this.v;
    }

    public int getLength() {
        return this.v.getText().length();
    }

    public int getSelectionStart() {
        return this.v.getSelectionStart();
    }

    public String getText() {
        Editable text = this.v.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2;
        c cVar;
        View.OnFocusChangeListener onFocusChangeListener = this.A;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        SecureEditText secureEditText = this.v;
        if (z) {
            Editable text = secureEditText.getText();
            Objects.requireNonNull(text);
            if (text.length() <= 0 || this.B || !isEnabled()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        setClearIconVisible(z2);
        if (!z) {
            if (this.C) {
                setLabelVisible(false);
            } else {
                Editable text2 = secureEditText.getText();
                Objects.requireNonNull(text2);
                setLabelVisible(text2.length() > 0);
            }
            Editable text3 = secureEditText.getText();
            Objects.requireNonNull(text3);
            if (text3.length() == 0) {
                a();
            }
            b();
            lop.b(secureEditText, Boolean.FALSE);
            if (this.a.getVisibility() != 0) {
                setBackgroundResource(R.drawable.comb_edit_text_bg);
                return;
            } else if (this.E.booleanValue()) {
                setBackgroundResource(R.drawable.comb_edit_text_bg_warning);
                return;
            } else {
                setBackgroundResource(R.drawable.comb_edit_text_bg_activated);
                return;
            }
        }
        if (this.B && (cVar = this.y) != null) {
            cVar.a();
        }
        setLabelVisible(!this.C);
        if (secureEditText.getText().length() == 0) {
            a();
        }
        if (this.a.getVisibility() != 0) {
            setBackgroundResource(R.drawable.comb_edit_focus_bg);
            int color = getContext().getColor(R.color.brand_secondary);
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(color);
            }
        } else if (this.E.booleanValue()) {
            setBackgroundResource(R.drawable.comb_edit_text_bg_warning);
        } else {
            setBackgroundResource(R.drawable.comb_edit_text_bg_activated);
        }
        lop.d(secureEditText);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        setClearIconVisible(charSequence.length() > 0 && !this.B && isEnabled());
        d dVar = this.z;
        if (dVar != null) {
            dVar.l(charSequence);
        }
    }

    public void setCanCopy(Boolean bool) {
        this.v.setCanCopy(bool.booleanValue());
    }

    public void setCardIconView(int i) {
        this.f.setImageDrawable(gr0.a(getContext(), i));
    }

    public void setCardIconVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
        this.c.setVisibility(z ? 0 : 8);
    }

    public void setCardName(String str) {
        this.c.setText(str);
    }

    public void setClearIconVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 8);
    }

    public void setClearListener(c cVar) {
        this.y = cVar;
    }

    public void setEditHint(CharSequence charSequence) {
        this.w = charSequence;
    }

    public void setEditHintOnly(String str) {
        this.v.setHint(str);
        this.w = str;
    }

    public void setEditTextColor(int i) {
        this.v.setTextColor(i);
    }

    public void setEditType(int i) {
        this.v.setInputType(i);
    }

    public void setEditable(boolean z) {
        SecureEditText secureEditText = this.v;
        if (z) {
            secureEditText.setFocusable(true);
            secureEditText.setFocusableInTouchMode(true);
            secureEditText.setClickable(true);
        } else {
            secureEditText.setFocusable(false);
            secureEditText.setFocusableInTouchMode(false);
            secureEditText.setClickable(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.v.setEnabled(z);
        if (!z) {
            setClearIconVisible(false);
        }
        super.setEnabled(z);
    }

    public void setError(String str) {
        this.E = Boolean.FALSE;
        if (str != null) {
            setBackgroundResource(R.drawable.comb_edit_text_bg_activated);
            this.a.setText(str);
            this.a.setVisibility(0);
            b();
            return;
        }
        if (hasFocus()) {
            setBackgroundResource(R.drawable.comb_edit_focus_bg);
            int color = getContext().getColor(R.color.brand_secondary);
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(color);
            }
        } else {
            setBackgroundResource(R.drawable.comb_edit_text_bg);
            b();
        }
        this.a.setVisibility(8);
    }

    public void setErrorView(TextView textView) {
        this.a = textView;
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        this.v.setFilters(inputFilterArr);
    }

    public void setHintVisibleOnly(boolean z) {
        this.C = z;
    }

    public void setInputType(int i) {
        this.v.setInputType(i);
    }

    public void setKeyListener(KeyListener keyListener) {
        this.v.setKeyListener(keyListener);
    }

    public void setLabelImage(int i) {
        this.d.setImageDrawable(gr0.a(getContext(), i));
    }

    public void setLabelText(String str) {
        this.b.setText(str);
        this.v.setHint(str);
    }

    public void setLabelVisible(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    public void setMaxLength(int i) {
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A = onFocusChangeListener;
    }

    public void setSelection(int i) {
        this.v.setSelection(i);
    }

    public void setText(String str) {
        if (!this.C) {
            setLabelVisible(str != null && str.length() > 0);
        }
        this.v.setText(str);
        if (TextUtils.isEmpty(str)) {
            setCardIconVisible(false);
            a();
        }
    }

    public void setTextChangedListener(d dVar) {
        this.z = dVar;
    }

    public void setTooltipContent(String str) {
        this.D = str;
    }

    public void setTooltipVisible(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    public void setTransformationMethod(TransformationMethod transformationMethod) {
        this.v.setTransformationMethod(transformationMethod);
    }

    public void setWarning(String str) {
        this.E = Boolean.TRUE;
        setBackgroundResource(R.drawable.comb_edit_text_bg_warning);
        this.a.setText(str);
        this.a.setVisibility(0);
        b();
    }

    public CombEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = "";
        this.E = Boolean.FALSE;
        LayoutInflater.from(getContext()).inflate(R.layout.comb_edit_text, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (TextView) findViewById(R.id.card_name);
        this.d = (ImageView) findViewById(R.id.image);
        ImageView imageView = (ImageView) findViewById(R.id.clear);
        this.e = imageView;
        this.f = (ImageView) findViewById(R.id.card_icon);
        SecureEditText secureEditText = (SecureEditText) findViewById(R.id.edit_text);
        this.v = secureEditText;
        ImageView imageView2 = (ImageView) findViewById(R.id.tooltip);
        this.i = imageView2;
        imageView.setOnClickListener(new a());
        imageView2.setOnClickListener(new b());
        setClearIconVisible(false);
        setCardIconVisible(false);
        setLabelVisible(false);
        secureEditText.setOnFocusChangeListener(this);
        secureEditText.addTextChangedListener(this);
    }

    public CombEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = false;
        this.D = "";
        this.E = Boolean.FALSE;
        LayoutInflater.from(getContext()).inflate(R.layout.comb_edit_text, this);
        this.b = (TextView) findViewById(R.id.label);
        this.c = (TextView) findViewById(R.id.card_name);
        this.d = (ImageView) findViewById(R.id.image);
        ImageView imageView = (ImageView) findViewById(R.id.clear);
        this.e = imageView;
        this.f = (ImageView) findViewById(R.id.card_icon);
        SecureEditText secureEditText = (SecureEditText) findViewById(R.id.edit_text);
        this.v = secureEditText;
        ImageView imageView2 = (ImageView) findViewById(R.id.tooltip);
        this.i = imageView2;
        imageView.setOnClickListener(new a());
        imageView2.setOnClickListener(new b());
        setClearIconVisible(false);
        setCardIconVisible(false);
        setLabelVisible(false);
        secureEditText.setOnFocusChangeListener(this);
        secureEditText.addTextChangedListener(this);
    }
}
