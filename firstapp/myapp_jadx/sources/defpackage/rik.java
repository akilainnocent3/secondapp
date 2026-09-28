package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class rik implements TextWatcher {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ GiftDetails b;
    public final /* synthetic */ View c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ TextView e;

    public rik(EditText editText, GiftDetails giftDetails, View view, TextView textView, TextView textView2) {
        this.a = editText;
        this.b = giftDetails;
        this.c = view;
        this.d = textView;
        this.e = textView2;
    }

    public final void a(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.d;
        if (zIsEmpty) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        EditText editText = this.a;
        if (z) {
            editText.setBackgroundResource(R.drawable.spr_bg_input_normal);
        } else {
            editText.setBackgroundResource(R.drawable.spr_bg_input_invalid);
        }
        this.e.setEnabled(z);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        GiftDetails giftDetails = this.b;
        EditText editText = this.a;
        try {
            if (new BigDecimal(giftDetails.getCurrentBalance() * 1.0E-4d).compareTo(new BigDecimal(editText.getText().toString())) < 0) {
                a(sn5.c(this.c, R.string.component_coupon__value_cannot_exceed_max_vamount, bjb0.a0(giftDetails.getCurrentBalance() * 1.0E-4d, Locale.US)), false);
            } else {
                a(null, new BigDecimal(editText.getText().toString()).compareTo(BigDecimal.ZERO) > 0);
            }
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
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
