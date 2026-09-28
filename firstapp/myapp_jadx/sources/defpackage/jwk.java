package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.SelectedGiftData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljwk;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jwk extends orl {
    public vhd0 A;
    public Function1<? super SelectedGiftData, Unit> i;
    public Function0<Unit> v;
    public iym y;
    public y8j z;
    public final String f = jwk.class.getSimpleName();
    public final double w = 1.0E-4d;

    public static final class a {
        public static jwk a(String str, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2, GiftDetails giftDetails, SelectedGiftData selectedGiftData, Function1 function1, Function0 function0) {
            qn4.b(str, str2, str3, str4, str5);
            giftDetails.getClass();
            jwk jwkVar = new jwk();
            jwkVar.setArguments(vj5.a(new Pair("currency", str), new Pair("total_odd", str2), new Pair("bonus_rate", str3), new Pair("max_potential_win", str4), new Pair("max_bonus", str5), new Pair("is_show_wh_tax", Boolean.valueOf(z)), new Pair("gift_count", Integer.valueOf(i)), new Pair("is_enable_add_to_stake", Boolean.valueOf(z2)), new Pair("gift_details", giftDetails), new Pair("old_selected_gift_data", selectedGiftData)));
            jwkVar.i = function1;
            jwkVar.v = function0;
            return jwkVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    public final void m0() {
        String string;
        BigDecimal bigDecimal;
        try {
            int checkedRadioButtonId = n0().d.getCheckedRadioButtonId();
            String str = "0";
            if (checkedRadioButtonId == R.id.rb_all_free_bet) {
                string = bjb0.W(o0().getCurrentBalance());
            } else if (checkedRadioButtonId == R.id.rb_partial_free_bet) {
                String string2 = n0().c.getText().toString();
                if (TextUtils.isEmpty(string2)) {
                    string = "0";
                } else {
                    string = b6y.a(string2).toString();
                    string.getClass();
                }
            } else {
                string = "0";
            }
            if (string.equals("0")) {
                return;
            }
            BigDecimal bigDecimal2 = new BigDecimal(string);
            String string3 = requireArguments().getString("total_odd");
            String str2 = "";
            if (string3 == null) {
                string3 = "";
            }
            BigDecimal bigDecimalMultiply = bigDecimal2.multiply(new BigDecimal(string3));
            BigDecimal bigDecimal3 = new BigDecimal(string);
            Bundle arguments = getArguments();
            BigDecimal bigDecimal4 = null;
            bigDecimal4 = null;
            String string4 = arguments != null ? arguments.getString("bonus_rate") : null;
            if (string4 != null) {
                str = string4;
            }
            BigDecimal bigDecimalMultiply2 = bigDecimal3.multiply(new BigDecimal(str));
            Bundle arguments2 = getArguments();
            String string5 = arguments2 != null ? arguments2.getString("max_bonus") : null;
            if (string5 == null || string5.length() == 0) {
                bigDecimal = null;
            } else {
                Bundle arguments3 = getArguments();
                bigDecimal = new BigDecimal(arguments3 != null ? arguments3.getString("max_bonus") : null);
            }
            Bundle arguments4 = getArguments();
            String string6 = arguments4 != null ? arguments4.getString("max_potential_win") : null;
            if (string6 != null && string6.length() != 0) {
                Bundle arguments5 = getArguments();
                bigDecimal4 = new BigDecimal(arguments5 != null ? arguments5.getString("max_potential_win") : null);
            }
            if (bigDecimal != null) {
                if (bigDecimalMultiply2.compareTo(bigDecimal) <= 0) {
                    bigDecimal = bigDecimalMultiply2;
                }
            } else if (bigDecimalMultiply2 == null) {
                bigDecimal = BigDecimal.ZERO;
            } else {
                bigDecimal = bigDecimalMultiply2;
            }
            if (bigDecimal4 != null) {
                if (bigDecimalMultiply2.compareTo(bigDecimal4) > 0) {
                    bigDecimalMultiply = bigDecimal4;
                } else if (bigDecimalMultiply == null) {
                    bigDecimalMultiply = BigDecimal.ZERO;
                }
            } else if (bigDecimalMultiply == null) {
                bigDecimalMultiply = BigDecimal.ZERO;
            }
            String strL = bjb0.L(bigDecimalMultiply.add(bigDecimal), Locale.US);
            TextView textView = n0().y;
            String string7 = requireArguments().getString("currency");
            if (string7 != null) {
                str2 = string7;
            }
            textView.setText("+" + str2 + " " + strL);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            String str3 = this.f;
            str3.getClass();
            aVar.q(str3);
            aVar.n("Failed to calculate win, error: %s", e.getMessage());
            n0().y.setText("--");
        }
    }

    public final vhd0 n0() {
        vhd0 vhd0Var = this.A;
        if (vhd0Var != null) {
            return vhd0Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final GiftDetails o0() {
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        Parcelable parcelable = (Parcelable) rj5.a(bundleRequireArguments, "gift_details", GiftDetails.class);
        if (parcelable != null) {
            return (GiftDetails) parcelable;
        }
        hb5.a("Required value was null.");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.spr_free_bet_gift_use_dialog_with_toggle_stake, viewGroup, false);
        int i = R.id.add_to_stake_layout;
        if (((ConstraintLayout) h5e.a(R.id.add_to_stake_layout, viewInflate)) != null) {
            i = R.id.add_to_stake_win_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.add_to_stake_win_layout, viewInflate);
            if (constraintLayout != null) {
                i = R.id.dialog_title;
                if (((TextView) h5e.a(R.id.dialog_title, viewInflate)) != null) {
                    i = R.id.input_value;
                    EditText editText = (EditText) h5e.a(R.id.input_value, viewInflate);
                    if (editText != null) {
                        i = R.id.iv_gift_icon;
                        if (((AppCompatImageView) h5e.a(R.id.iv_gift_icon, viewInflate)) != null) {
                            i = R.id.rb_all_free_bet;
                            if (((RadioButton) h5e.a(R.id.rb_all_free_bet, viewInflate)) != null) {
                                i = R.id.rb_partial_free_bet;
                                if (((RadioButton) h5e.a(R.id.rb_partial_free_bet, viewInflate)) != null) {
                                    i = R.id.rg_free_bet;
                                    RadioGroup radioGroup = (RadioGroup) h5e.a(R.id.rg_free_bet, viewInflate);
                                    if (radioGroup != null) {
                                        i = R.id.select_free_bet;
                                        if (((RelativeLayout) h5e.a(R.id.select_free_bet, viewInflate)) != null) {
                                            i = R.id.switch_add_to_stake;
                                            SwitchCompat switchCompat = (SwitchCompat) h5e.a(R.id.switch_add_to_stake, viewInflate);
                                            if (switchCompat != null) {
                                                i = R.id.tv_add_to_stake;
                                                if (((TextView) h5e.a(R.id.tv_add_to_stake, viewInflate)) != null) {
                                                    i = R.id.tv_cancel;
                                                    TextView textView = (TextView) h5e.a(R.id.tv_cancel, viewInflate);
                                                    if (textView != null) {
                                                        i = R.id.tv_confirm;
                                                        TextView textView2 = (TextView) h5e.a(R.id.tv_confirm, viewInflate);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_error_msg;
                                                            TextView textView3 = (TextView) h5e.a(R.id.tv_error_msg, viewInflate);
                                                            if (textView3 != null) {
                                                                i = R.id.tv_potential_win_label;
                                                                TextView textView4 = (TextView) h5e.a(R.id.tv_potential_win_label, viewInflate);
                                                                if (textView4 != null) {
                                                                    i = R.id.tv_potential_win_value;
                                                                    TextView textView5 = (TextView) h5e.a(R.id.tv_potential_win_value, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tv_use_other;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.tv_use_other, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i = R.id.tv_value;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.tv_value, viewInflate);
                                                                            if (textView7 != null) {
                                                                                this.A = new vhd0((ConstraintLayout) viewInflate, constraintLayout, editText, radioGroup, switchCompat, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                                ConstraintLayout constraintLayout2 = n0().a;
                                                                                constraintLayout2.getClass();
                                                                                return constraintLayout2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Throwable th;
        String strB;
        char c;
        SelectedGiftData selectedGiftDataP0;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.i == null || this.v == null) {
            dismissAllowingStateLoss();
            return;
        }
        final TextView textView = n0().i;
        TextView textView2 = n0().f;
        final EditText editText = n0().c;
        final TextView textView3 = n0().v;
        TextView textView4 = n0().A;
        final RadioGroup radioGroup = n0().d;
        final SwitchCompat switchCompat = n0().e;
        final TextView textView5 = n0().z;
        ConstraintLayout constraintLayout = n0().b;
        radioGroup.check(R.id.rb_all_free_bet);
        textView5.setVisibility(requireArguments().getInt("gift_count") > 1 ? 0 : 8);
        constraintLayout.setVisibility(requireArguments().getBoolean("is_enable_add_to_stake") ? 0 : 8);
        if (textView5.getVisibility() == 0) {
            iym iymVar = this.y;
            th = null;
            if (iymVar == null) {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            iymVar.e(AnalyticsEvent.BETSLIP_CHOOSE_OTHER_GIFT_VIEW, o2gVar);
        } else {
            th = null;
        }
        Map<String, ? extends Object> mapB = jpu.b(new Pair(AnalyticsParam.EVENT_STATUS, requireArguments().getBoolean("is_enable_add_to_stake") ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF));
        vgb0.c(AnalyticsEvent.BETSLIP_ADD_STAKE_TOGGLE_VIEW, mapB, false);
        iym iymVar2 = this.y;
        if (iymVar2 == null) {
            Intrinsics.n("openTelemetryLogger");
            throw th;
        }
        iymVar2.e(AnalyticsEvent.BETSLIP_ADD_STAKE_TOGGLE_VIEW, mapB);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ewk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                compoundButton.getClass();
                Map<String, ? extends Object> mapB2 = jpu.b(new Pair(AnalyticsParam.EVENT_STATUS, z ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF));
                vgb0.c(AnalyticsEvent.BETSLIP_ADD_STAKE_TOGGLE_CLICK, mapB2, false);
                iym iymVar3 = this.a.y;
                if (iymVar3 != null) {
                    iymVar3.e(AnalyticsEvent.BETSLIP_ADD_STAKE_TOGGLE_CLICK, mapB2);
                } else {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
            }
        });
        TextView textView6 = n0().w;
        if (requireArguments().getBoolean("is_show_wh_tax")) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            strB = sn5.b(contextRequireContext, R.string.component_betslip__to_win, new Object[0]);
        } else {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            strB = sn5.b(contextRequireContext2, R.string.component_betslip__potential_win, new Object[0]);
        }
        textView6.setText(strB);
        GiftDetails giftDetailsO0 = o0();
        SelectedGiftData selectedGiftDataP1 = p0();
        boolean zEquals = TextUtils.equals(selectedGiftDataP1 != null ? selectedGiftDataP1.getGiftId() : th, giftDetailsO0.getGiftId());
        String str = this.f;
        double d = this.w;
        if (!zEquals || (selectedGiftDataP0 = p0()) == null) {
            c = 0;
        } else {
            c = 0;
            if (giftDetailsO0.getKind() == selectedGiftDataP0.getGiftKind()) {
                try {
                    double currentBalance = giftDetailsO0.getCurrentBalance() * d;
                    Locale locale = Locale.US;
                    String strA0 = bjb0.a0(currentBalance, locale);
                    SelectedGiftData selectedGiftDataP2 = p0();
                    String strP = bjb0.P(selectedGiftDataP2 != null ? selectedGiftDataP2.getGiftValue() : th, locale);
                    if (TextUtils.equals(strA0, strP)) {
                        radioGroup.check(R.id.rb_all_free_bet);
                    } else {
                        radioGroup.check(R.id.rb_partial_free_bet);
                        editText.setText(strP);
                    }
                } catch (Exception e) {
                    itf0.a aVar = itf0.a;
                    str.getClass();
                    aVar.q(str);
                    aVar.a("e =%s", e.getMessage());
                }
            }
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hwk
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    radioGroup.check(R.id.rb_partial_free_bet);
                }
            }
        });
        editText.setOnClickListener(new hm7(radioGroup, 1));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[c] = new kwk();
        editText.setFilters(inputFilterArr);
        editText.addTextChangedListener(new lwk(editText, giftDetailsO0, this, textView3, radioGroup, textView));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: iwk
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                radioGroup2.getClass();
                EditText editText2 = editText;
                TextView textView7 = textView;
                jwk jwkVar = this;
                if (i != R.id.rb_all_free_bet) {
                    if (i == R.id.rb_partial_free_bet) {
                        editText2.setCursorVisible(true);
                        lop.d(editText2);
                        textView7.setEnabled(false);
                        jwkVar.m0();
                        return;
                    }
                    return;
                }
                lop.b(editText2, Boolean.FALSE);
                TextView textView8 = textView3;
                textView8.setVisibility(4);
                editText2.setBackgroundResource(R.drawable.spr_bg_input_normal);
                textView8.setText("");
                editText2.setText("");
                editText2.setCursorVisible(false);
                textView7.setEnabled(true);
                jwkVar.m0();
            }
        });
        double currentBalance2 = giftDetailsO0.getCurrentBalance() * d;
        Locale locale2 = Locale.US;
        textView4.setText(bjb0.a0(currentBalance2, locale2));
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        editText.setHint(sn5.b(contextRequireContext3, R.string.component_coupon__max_vamount, bjb0.a0(giftDetailsO0.getCurrentBalance() * d, locale2)));
        SelectedGiftData selectedGiftDataP3 = p0();
        if (selectedGiftDataP3 != null) {
            switchCompat.setChecked(selectedGiftDataP3.getAddToStake());
        }
        textView2.setOnClickListener(new dm7(this, 1));
        textView.setOnClickListener(new View.OnClickListener() { // from class: fwk
            /* JADX WARN: Code duplicated, block: B:22:0x008c  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String string;
                jwk jwkVar = this.a;
                GiftDetails giftDetailsO1 = jwkVar.o0();
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                String str2 = yFmFZvuWxAYfEj.iJGm;
                SwitchCompat switchCompat2 = switchCompat;
                if (checkedRadioButtonId == R.id.rb_all_free_bet) {
                    Function1<? super SelectedGiftData, Unit> function1 = jwkVar.i;
                    if (function1 != null) {
                        function1.invoke(new SelectedGiftData(bjb0.W(giftDetailsO1.getCurrentBalance()), giftDetailsO1.getKind(), giftDetailsO1.getGiftId(), bjb0.W(jwkVar.o0().getLeastOrderAmount()), 1, giftDetailsO1, jwkVar.requireArguments().getBoolean(str2) && switchCompat2.isChecked(), false, true, null, 128, null));
                    }
                } else if (checkedRadioButtonId == R.id.rb_partial_free_bet) {
                    String string2 = editText.getText().toString();
                    if (TextUtils.isEmpty(string2)) {
                        string = "";
                    } else {
                        BigDecimal bigDecimalA = b6y.a(string2);
                        if (bigDecimalA.compareTo(BigDecimal.ZERO) != 0) {
                            string = bigDecimalA.toString();
                            string.getClass();
                        } else {
                            string = "";
                        }
                    }
                    String str3 = string;
                    Function1<? super SelectedGiftData, Unit> function2 = jwkVar.i;
                    if (function2 != null) {
                        function2.invoke(new SelectedGiftData(str3, giftDetailsO1.getKind(), giftDetailsO1.getGiftId(), bjb0.W(jwkVar.o0().getLeastOrderAmount()), 1, giftDetailsO1, jwkVar.requireArguments().getBoolean(str2) && switchCompat2.isChecked(), false, true, null, 128, null));
                    }
                }
                jwkVar.dismiss();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() { // from class: gwk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jwk jwkVar = this.a;
                iym iymVar3 = jwkVar.y;
                if (iymVar3 == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                o2g o2gVar2 = o2g.a;
                o2gVar2.getClass();
                iymVar3.e(AnalyticsEvent.BETSLIP_CHOOSE_OTHER_GIFT_CLICK, o2gVar2);
                y8j y8jVar = jwkVar.z;
                if (y8jVar == null) {
                    Intrinsics.n("fullStoryCommonManager");
                    throw null;
                }
                y8jVar.c(textView5, AnalyticsEvent.BETSLIP_CHOOSE_OTHER_GIFT);
                Function0<Unit> function0 = jwkVar.v;
                if (function0 != null) {
                    function0.invoke();
                }
                jwkVar.dismiss();
            }
        });
        try {
            if (new BigDecimal(editText.getText().toString()).compareTo(BigDecimal.ZERO) <= 0) {
                editText.setText(new BigDecimal(o0().getCurrentBalance()).multiply(new BigDecimal(d)).setScale(2, RoundingMode.HALF_UP).toString());
            }
        } catch (Exception e2) {
            itf0.a aVar2 = itf0.a;
            str.getClass();
            aVar2.q(str);
            aVar2.n("Failed to set dialog width, error: %s", e2.getMessage());
        }
        m0();
    }

    public final SelectedGiftData p0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (SelectedGiftData) ((Parcelable) rj5.a(arguments, "old_selected_gift_data", SelectedGiftData.class));
        }
        return null;
    }
}
