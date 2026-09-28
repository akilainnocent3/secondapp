package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lwk implements TextWatcher {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ GiftDetails b;
    public final /* synthetic */ jwk c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ RadioGroup e;
    public final /* synthetic */ TextView f;

    public lwk(EditText editText, GiftDetails giftDetails, jwk jwkVar, TextView textView, RadioGroup radioGroup, TextView textView2) {
        this.a = editText;
        this.b = giftDetails;
        this.c = jwkVar;
        this.d = textView;
        this.e = radioGroup;
        this.f = textView2;
    }

    public final void a(String str, boolean z) {
        int checkedRadioButtonId;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.d;
        if (zIsEmpty) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        EditText editText = this.a;
        if (z || (checkedRadioButtonId = this.e.getCheckedRadioButtonId()) == R.id.rb_all_free_bet || checkedRadioButtonId != R.id.rb_partial_free_bet) {
            editText.setBackgroundResource(R.drawable.spr_bg_input_normal);
        } else {
            editText.setBackgroundResource(R.drawable.spr_bg_input_invalid);
        }
        this.f.setEnabled(z);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        GiftDetails giftDetails = this.b;
        EditText editText = this.a;
        jwk jwkVar = this.c;
        double d = jwkVar.w;
        try {
            if (new BigDecimal(giftDetails.getCurrentBalance() * d).compareTo(new BigDecimal(editText.getText().toString())) < 0) {
                Context contextRequireContext = jwkVar.requireContext();
                contextRequireContext.getClass();
                a(sn5.b(contextRequireContext, R.string.component_coupon__value_cannot_exceed_max_vamount, bjb0.a0(giftDetails.getCurrentBalance() * d, Locale.US)), false);
            } else {
                a(null, new BigDecimal(editText.getText().toString()).compareTo(BigDecimal.ZERO) > 0);
            }
            jwkVar.m0();
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            String str = jwkVar.f;
            str.getClass();
            aVar.q(str);
            aVar.n("Failed to check input amount, error: %s", e.getMessage());
            a(null, false);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
