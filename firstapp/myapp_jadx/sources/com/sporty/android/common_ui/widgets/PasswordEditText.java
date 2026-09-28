package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.uuz;

/* JADX INFO: loaded from: classes6.dex */
public class PasswordEditText extends FrameLayout implements TextWatcher, View.OnClickListener {
    public static final /* synthetic */ int e = 0;
    public boolean a;
    public final SecureEditText b;
    public final ImageButton c;
    public TextView d;

    public class a implements View.OnLayoutChangeListener {
        public int a = 0;

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PasswordEditText passwordEditText = PasswordEditText.this;
            SecureEditText secureEditText = passwordEditText.b;
            if (this.a != view.getWidth()) {
                this.a = passwordEditText.getWidth();
                secureEditText.setPadding(secureEditText.getPaddingLeft(), 0, Integer.max(secureEditText.getPaddingLeft(), view.getWidth()), 0);
            }
        }
    }

    public PasswordEditText(Context context) {
        super(context);
        this.a = true;
        View.inflate(getContext(), R.layout.password_edit_text, this);
        SecureEditText secureEditText = (SecureEditText) findViewById(R.id.password);
        this.b = secureEditText;
        secureEditText.setCanCopy(false);
        ImageButton imageButton = (ImageButton) findViewById(R.id.password_toggle);
        this.c = imageButton;
        secureEditText.addTextChangedListener(this);
        secureEditText.setOnFocusChangeListener(new uuz());
        imageButton.setOnClickListener(this);
        a();
        imageButton.addOnLayoutChangeListener(new a());
    }

    public final void a() {
        SecureEditText secureEditText = this.b;
        int selectionEnd = secureEditText.getSelectionEnd();
        boolean z = this.a;
        ImageButton imageButton = this.c;
        if (z) {
            imageButton.setImageResource(R.drawable.icon_eyes_hide);
            secureEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            imageButton.setImageResource(R.drawable.icon_eyes_show);
            secureEditText.setTransformationMethod(null);
        }
        secureEditText.setSelection(selectionEnd);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public EditText getPasswordView() {
        return this.b;
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a = !this.a;
        a();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.setError(null);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ImageButton imageButton = this.c;
        if (zIsEmpty) {
            imageButton.setVisibility(8);
        } else {
            imageButton.setVisibility(0);
        }
    }

    public void setCanCopy(Boolean bool) {
        this.b.setCanCopy(bool.booleanValue());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
        TextView textView = this.d;
        if (textView != null) {
            textView.setEnabled(z);
        }
    }

    public void setError(String str) {
        if (str == null) {
            setActivated(false);
            this.d.setVisibility(8);
        } else {
            setActivated(true);
            this.d.setText(str);
            this.d.setVisibility(0);
        }
    }

    public void setErrorView(TextView textView) {
        this.d = textView;
    }

    public void setHint(String str) {
        this.b.setHint(str);
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.b.setOnEditorActionListener(onEditorActionListener);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        View.inflate(getContext(), R.layout.password_edit_text, this);
        SecureEditText secureEditText = (SecureEditText) findViewById(R.id.password);
        this.b = secureEditText;
        secureEditText.setCanCopy(false);
        ImageButton imageButton = (ImageButton) findViewById(R.id.password_toggle);
        this.c = imageButton;
        secureEditText.addTextChangedListener(this);
        secureEditText.setOnFocusChangeListener(new uuz());
        imageButton.setOnClickListener(this);
        a();
        imageButton.addOnLayoutChangeListener(new a());
    }
}
