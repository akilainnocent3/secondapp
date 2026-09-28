package com.sportybet.android.bvn.widget;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.e5;
import defpackage.gr0;
import defpackage.sn5;

/* JADX INFO: loaded from: classes5.dex */
public class InputInfoLayout extends ConstraintLayout {
    public static final /* synthetic */ int K = 0;
    public ConstraintLayout F;
    public TextView G;
    public EditText H;
    public ImageView I;
    public e5 J;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InputInfoLayout inputInfoLayout = InputInfoLayout.this;
            inputInfoLayout.H.setText("");
            inputInfoLayout.H.setError(null);
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i = InputInfoLayout.K;
            InputInfoLayout inputInfoLayout = InputInfoLayout.this;
            if (inputInfoLayout.H.getText() == null || inputInfoLayout.H.getText().length() <= 0) {
                inputInfoLayout.I.setVisibility(8);
            } else {
                inputInfoLayout.I.setVisibility(0);
            }
            e5 e5Var = inputInfoLayout.J;
            if (e5Var != null) {
                e5Var.z1();
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            InputInfoLayout inputInfoLayout;
            e5 e5Var;
            if (i != 6 || (e5Var = (inputInfoLayout = InputInfoLayout.this).J) == null) {
                return false;
            }
            inputInfoLayout.H.getText();
            e5Var.z1();
            return false;
        }
    }

    public InputInfoLayout(Context context) {
        super(context);
    }

    private void setHint(String str) {
        str.getClass();
        if (str.equals("E_MAIL")) {
            this.H.setHint(Html.fromHtml(sn5.c(this, R.string.component_bvn__email_optional, new Object[0])));
        }
    }

    private void setInputType(String str) {
        str.getClass();
        switch (str) {
            case "BVN":
                this.H.setInputType(2);
                break;
            case "FIRST_NAME":
            case "LAST_NAME":
                this.H.setInputType(1);
                break;
            case "E_MAIL":
                this.H.setInputType(32);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.H.setImportantForAutofill(2);
                    break;
                }
                break;
        }
    }

    private void setTitle(String str) {
        int i;
        str.getClass();
        switch (str) {
            case "FIRST_NAME":
                i = R.string.component_bvn__first_name;
                break;
            case "LAST_NAME":
                i = R.string.component_bvn__last_name;
                break;
            case "E_MAIL":
                i = R.string.common_functions__email;
                break;
            default:
                i = R.string.page_withdraw__bvn;
                break;
        }
        this.G.setText(Html.fromHtml(sn5.c(this, i, new Object[0])));
    }

    public final void E(e5 e5Var) {
        this.J = e5Var;
        this.F.setBackground(gr0.a(getContext(), R.drawable.comb_edit_text_bg));
        setTitle("BVN");
        setInputType("BVN");
        setHint("BVN");
    }

    public EditText getContent() {
        return this.H;
    }

    public Editable getInputData() {
        return this.H.getText();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.F = (ConstraintLayout) findViewById(R.id.input_info_container);
        this.G = (TextView) findViewById(R.id.input_info_label);
        this.H = (EditText) findViewById(R.id.input_info_etv);
        ImageView imageView = (ImageView) findViewById(R.id.bvn_edit_cleaner);
        this.I = imageView;
        imageView.setOnClickListener(new a());
        this.H.addTextChangedListener(new b());
        this.H.setOnEditorActionListener(new c());
    }

    public void setContent(String str) {
        this.H.setText(str);
    }

    public void setContentEnabled(boolean z) {
        this.H.setEnabled(z);
        this.H.setTextColor(getContext().getColor(z ? R.color.text_type1_primary : R.color.text_type1_secondary));
        if (z) {
            return;
        }
        this.I.setVisibility(8);
    }

    public void setError(CharSequence charSequence) {
        this.H.setError(charSequence);
    }

    public InputInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InputInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
