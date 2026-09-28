package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.country.ChangeRegionActivity;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class za extends nll implements View.OnClickListener, TextWatcher, TextView.OnEditorActionListener, k9j, j9j {
    public ClearEditText B;
    public ProgressButton C;
    public int D;
    public CheckBox E;
    public CheckBox F;
    public nsm G;
    public xxz H;
    public y8j I;
    public psm J;
    public rx40 K;
    public bnh0 L;
    public avz M;
    public fi80 N;
    public yi5 O;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            za zaVar = za.this;
            if (zaVar.B.getText() != null) {
                zaVar.t0(zaVar.B.getText().toString());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            Context context = za.this.getContext();
            if (context != null) {
                textPaint.setColor(context.getColor(R.color.other002));
            }
        }
    }

    public za() {
        this.z = false;
        this.A = false;
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "enter_mobile")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) == null) {
            vgb0.c(AnalyticsEvent.SIGN_UP, Collections.unmodifiableMap(map), true);
        } else {
            hb5.a(wga.a(key, "duplicate key: "));
            throw null;
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getA() {
        return "AccountRegisterFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.login) {
            t0(this.i.getLastAccount());
            return;
        }
        if (view.getId() == R.id.fragment_root) {
            lop.b(view, Boolean.FALSE);
            return;
        }
        if (view.getId() == R.id.close) {
            requireActivity().finish();
        } else if (view.getId() == R.id.next) {
            s0();
        } else if (view.getId() == R.id.change_region) {
            yrh0.s(requireActivity(), ChangeRegionActivity.z1(requireActivity()), true);
        }
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D = R.string.common_feedback__please_enter_a_valid_mobile_number;
        getLifecycle().a(this.K);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_enter_mobile, viewGroup, false);
        ((ImageButton) viewInflate.findViewById(R.id.close)).setOnClickListener(this);
        TextView textView = (TextView) viewInflate.findViewById(R.id.flag);
        textView.setText(getString(this.J.Z()));
        textView.setCompoundDrawablesWithIntrinsicBounds(a8b.c().j(), 0, 0, 0);
        viewInflate.findViewById(R.id.login).setOnClickListener(this);
        ((TextView) viewInflate.findViewById(R.id.prefix)).setText(a8b.b());
        ((AspectRatioImageView) viewInflate.findViewById(R.id.top_ad)).setAspectRatio(0.23888889f);
        ProgressButton progressButton = (ProgressButton) viewInflate.findViewById(R.id.next);
        this.C = progressButton;
        progressButton.setEnabled(false);
        this.C.setOnClickListener(this);
        ClearEditText clearEditText = (ClearEditText) viewInflate.findViewById(R.id.mobile);
        this.B = clearEditText;
        clearEditText.setMaxLength(this.J.l());
        this.I.d(this.B, "fs-mask");
        this.B.setOnEditorActionListener(this);
        this.B.setErrorView((TextView) viewInflate.findViewById(R.id.error));
        viewInflate.setOnClickListener(this);
        f00 f00Var = vgb0.a;
        vgb0.a("Reg_1");
        z8j.a(this.I, new ts40.f0(this.J.getCountryCode().getCode()));
        this.I.e(viewInflate.findViewById(R.id.next), "button-submit");
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.change_region);
        Drawable drawableA = gr0.a(context, R.drawable.ic_keyboard_arrow_right_black_18dp);
        drawableA.setTint(Color.parseColor("#0d9737"));
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableA, (Drawable) null);
        textView2.setOnClickListener(this);
        textView2.setVisibility(this.J.i(context) ? 0 : 4);
        if (this.B.getText() != null && TextUtils.isEmpty(this.B.getText().toString())) {
            this.B.requestFocus();
        }
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.hint);
        String strG = a8b.c().o().g(context);
        if (TextUtils.isEmpty(strG)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(strG);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.gp_policy_container);
        if (!this.O.b().j()) {
            viewFindViewById.setVisibility(8);
            return viewInflate;
        }
        viewFindViewById.setVisibility(0);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: xa
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                za zaVar = this.a;
                zaVar.u0(zaVar.B.getText());
            }
        };
        this.E = (CheckBox) viewFindViewById.findViewById(R.id.check_box_gp_privacy_policy);
        bnh0 bnh0Var = this.L;
        String[] strArr = {"help"};
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("source", "gp")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
            return null;
        }
        this.E.setText(yrh0.q(Html.fromHtml(sn5.d(this, R.string.component_register__check_box_privacy_policy, tug.a("<a href=\"", bnh0Var.c(strArr, Collections.unmodifiableMap(map), "/about/privacy-policy"), "\" target=\"_blank\">"), "</a>"))));
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.E.setOnCheckedChangeListener(onCheckedChangeListener);
        this.F = (CheckBox) viewFindViewById.findViewById(R.id.check_box_gp_terms_conditions_and_age);
        bnh0 bnh0Var2 = this.L;
        String[] strArr2 = {"help"};
        Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("source", "gp")};
        HashMap map2 = new HashMap(1);
        Map.Entry entry2 = entryArr2[0];
        Object key2 = entry2.getKey();
        if (w1k.a(key2, entry2, map2, key2) != null) {
            hb5.a(wga.a(key2, "duplicate key: "));
            return null;
        }
        this.F.setText(yrh0.q(Html.fromHtml(sn5.d(this, R.string.component_register__check_box_terms_conditions_and_age, tug.a("<a href=\"", bnh0Var2.c(strArr2, Collections.unmodifiableMap(map2), "/about/terms-and-conditions"), "\" target=\"_blank\">"), "</a>"))));
        this.F.setMovementMethod(LinkMovementMethod.getInstance());
        this.F.setOnCheckedChangeListener(onCheckedChangeListener);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().d(this.K);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        s0();
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.B.setError((String) null);
        u0(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.B.addTextChangedListener(this);
    }

    public final void r0(String str) {
        if (TextUtils.isEmpty(str)) {
            str = sn5.d(this, R.string.app_common__the_mobile_number_is_already_registered, new Object[0]);
        }
        a aVar = new a();
        SpannableString spannableString = new SpannableString(sn5.d(this, R.string.common_functions__log_in, new Object[0]));
        spannableString.setSpan(aVar, 0, spannableString.length(), 33);
        this.B.setErrorWithClickableText(TextUtils.expandTemplate(yk10.a(str, "   ^1"), spannableString));
    }

    public final void s0() {
        f00 f00Var = vgb0.a;
        vgb0.a("Reg_1_1");
        String string = this.B.getText() != null ? this.B.getText().toString() : "";
        if (string.isEmpty()) {
            return;
        }
        if (this.J.E() && !string.startsWith("0") && string.length() < this.J.l()) {
            string = "0".concat(string);
            int selectionStart = this.B.getSelectionStart();
            this.B.setText(string);
            if (selectionStart >= 0) {
                this.B.setSelection(selectionStart + 1);
            }
        }
        if (!a8b.c().C(string)) {
            this.B.setError(sn5.d(this, this.D, new Object[0]));
            return;
        }
        vgb0.a("Reg_1_2");
        if (!this.G.isConnected()) {
            p0();
        } else {
            this.C.setLoading(true);
            this.H.a(string).G(new ya(this, string));
        }
    }

    public final void t0(String str) {
        if (getActivity() == null) {
            return;
        }
        lop.a(this.B);
        m12.w = true;
        getActivity().getSupportFragmentManager().b0(-1, 1, null);
        m12.w = false;
        s9 s9Var = new s9();
        Bundle bundle = new Bundle();
        bundle.putString("mobile", str);
        s9Var.setArguments(bundle);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(android.R.id.content, s9Var, null);
        aVar.k(true, true);
    }

    public final void u0(CharSequence charSequence) {
        if (this.C.isLoading) {
            return;
        }
        boolean zJ = this.O.b().j();
        ProgressButton progressButton = this.C;
        if (zJ) {
            progressButton.setEnabled(!TextUtils.isEmpty(charSequence) && this.E.isChecked() && this.F.isChecked());
        } else {
            progressButton.setEnabled(!TextUtils.isEmpty(charSequence));
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
