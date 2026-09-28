package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lc000;", "Lm12;", "La92$a;", "", "layout", "<init>", "(I)V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public abstract class c000 extends dzl implements a92.a {
    public psm B;
    public uy0 C;
    public d0n D;
    public final q8i0 E;
    public final boolean F;
    public AlertDialog G;
    public a92 H;
    public double I;
    public double J;
    public KycLimitData K;
    public FullSummaryData L;
    public BankTradeResponse M;
    public int N;
    public f0l O;
    public boolean P;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("TRANSACTIONS", 0);
            a = aVar;
            a aVar2 = new a("CONTACT_US", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return c000.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? c000.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class g implements Function1<lk50<? extends BaseResponse<KycLimitData>>, Unit> {
        public final /* synthetic */ r5b a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ c000 c;

        public g(r5b r5bVar, ibs ibsVar, c000 c000Var) {
            this.a = r5bVar;
            this.b = ibsVar;
            this.c = c000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk50<? extends BaseResponse<KycLimitData>> lk50Var) {
            lk50<? extends BaseResponse<KycLimitData>> lk50Var2 = lk50Var;
            lk50Var2.getClass();
            c000 c000Var = this.c;
            c000.M0(c000Var, lk50Var2, c000Var.new i());
            if (!(lk50Var2 instanceof lk50.b)) {
                this.a.l(this.b);
            }
            return Unit.a;
        }
    }

    public static final class h implements Function1<lk50<? extends BaseResponse<FullSummaryData>>, Unit> {
        public final /* synthetic */ r5b a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ c000 c;

        public h(r5b r5bVar, ibs ibsVar, c000 c000Var) {
            this.a = r5bVar;
            this.b = ibsVar;
            this.c = c000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk50<? extends BaseResponse<FullSummaryData>> lk50Var) {
            lk50<? extends BaseResponse<FullSummaryData>> lk50Var2 = lk50Var;
            lk50Var2.getClass();
            c000 c000Var = this.c;
            c000.M0(c000Var, lk50Var2, c000Var.new j());
            if (!(lk50Var2 instanceof lk50.b)) {
                this.a.l(this.b);
            }
            return Unit.a;
        }
    }

    public static final class i implements Function1<BaseResponse<KycLimitData>, Unit> {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResponse<KycLimitData> baseResponse) {
            BaseResponse<KycLimitData> baseResponse2 = baseResponse;
            baseResponse2.getClass();
            c000.this.K = baseResponse2.data;
            return Unit.a;
        }
    }

    public static final class j implements Function1<BaseResponse<FullSummaryData>, Unit> {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResponse<FullSummaryData> baseResponse) {
            ClearEditText clearEditTextR0;
            BaseResponse<FullSummaryData> baseResponse2 = baseResponse;
            baseResponse2.getClass();
            FullSummaryData fullSummaryData = baseResponse2.data;
            c000 c000Var = c000.this;
            c000Var.L = fullSummaryData;
            c000Var.J = o1l.b(c000Var.K, fullSummaryData, c000Var.getW(), c000Var.getJ0(), c000Var.t0().O() ? 0.0d : z600.a().c.b, c000Var.getX().a);
            double dB = o1l.b(c000Var.K, c000Var.L, c000Var.getW(), c000Var.getJ0(), c000Var.t0().O() ? 0.0d : z600.a().c.d, c000Var.getX().a);
            f0l f0lVar = c000Var.O;
            if (f0lVar != null) {
                f0lVar.c = c000Var.J;
            }
            if (f0lVar != null) {
                f0lVar.d = dB;
            }
            if (f0lVar != null) {
                f0lVar.a(c000Var.getX(), c000Var.L, c000Var.K, c000Var.getJ0(), c000Var.getW(), c000Var.i.getUserCertStatus());
            }
            f0l f0lVar2 = c000Var.O;
            String strC = f0lVar2 != null ? f0lVar2.c() : null;
            if (strC != null && (clearEditTextR0 = c000Var.r0()) != null) {
                clearEditTextR0.setHint(sn5.d(c000Var, R.string.page_payment__min_vnum, strC));
            }
            c000Var.P = false;
            c000Var.N0();
            return Unit.a;
        }
    }

    public c000(int i2) {
        super(i2);
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.E = new q8i0(jq40.a(c2l.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.F = true;
    }

    public static void M0(c000 c000Var, lk50 lk50Var, Function1 function1) {
        c000Var.getClass();
        c000Var.N0();
        if (lk50Var instanceof lk50.c) {
            function1.invoke(((lk50.c) lk50Var).a);
            return;
        }
        if (lk50Var instanceof lk50.a) {
            zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_INT);
            aVar.b(((lk50.a) lk50Var).a);
            return;
        }
        if (lk50Var instanceof lk50.b) {
            c000Var.T0();
        } else {
            uhc.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p0(c000 c000Var, String str, String str2, String str3, Function0 function0, String str4, Function0 function1, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            function0 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        c000Var.o0(str, str2, str3, function0, str4, function1, true);
    }

    public TextView C0() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public Integer getW() {
        return null;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public boolean getF() {
        return this.F;
    }

    /* JADX INFO: renamed from: F0 */
    public abstract ga00 getX();

    public final String G0() {
        String phoneNumber = this.i.getPhoneNumber();
        phoneNumber.getClass();
        return vtu.a(phoneNumber);
    }

    /* JADX INFO: renamed from: H0 */
    public abstract String getW();

    public HintView I0() {
        return null;
    }

    public View J0() {
        return null;
    }

    public TextView K0() {
        return null;
    }

    public TextView L0() {
        return null;
    }

    public void N0() {
        AlertDialog alertDialog;
        if (this.P || (alertDialog = this.G) == null) {
            return;
        }
        alertDialog.dismiss();
    }

    public final void P0(List<String> list) {
        list.getClass();
        View viewY0 = y0();
        ViewGroup viewGroup = viewY0 != null ? (ViewGroup) viewY0 : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            for (String str : list) {
                TextView textView = new TextView(getContext());
                textView.setTextSize(12.0f);
                textView.setTextColor(textView.getContext().getColor(R.color.text_type1_secondary));
                textView.setText(str);
                viewGroup.addView(textView);
            }
        }
    }

    public final void Q0(ImageView imageView, int i2, Integer num) {
        imageView.setImageResource(i2);
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                bmy.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            layoutParams.width = r0b.a(contextRequireContext, iIntValue);
            imageView.setLayoutParams(layoutParams);
        }
    }

    public final void R0(UiText uiText) {
        if (uiText == null) {
            HintView hintViewI0 = I0();
            if (hintViewI0 != null) {
                hintViewI0.setVisibility(8);
                return;
            }
            return;
        }
        HintView hintViewI1 = I0();
        if (hintViewI1 != null) {
            hintViewI1.setVisibility(0);
        }
        HintView hintViewI2 = I0();
        if (hintViewI2 != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            hintViewI2.setHint(uiText.e(contextRequireContext).toString());
        }
    }

    public final void S0(r700 r700Var, String str) {
        String strD = sn5.d(this, R.string.page_payment__retry_with, new Object[0]);
        String strS0 = getJ0();
        strS0.getClass();
        c100 c100VarA = sg8.a(Integer.parseInt(strS0));
        String strA = tug.a(strD, " ", c100VarA != null ? c100VarA.b : null);
        String strD2 = sn5.d(this, R.string.common_functions__transactions, new Object[0]);
        int i2 = 1;
        hc3 hc3Var = new hc3(this, i2);
        wzz wzzVar = new wzz();
        kc3 kc3Var = new kc3(this, i2);
        kqg0 kqg0Var = new kqg0();
        Bundle bundle = new Bundle();
        kqg0Var.a = hc3Var;
        kqg0Var.b = wzzVar;
        kqg0Var.c = kc3Var;
        bundle.putString("ARGS_PRIMARY_TEXT", strA);
        bundle.putString("ARGS_SECONDARY_TEXT", strD2);
        bundle.putString("ARGS_DIALOG_TYPE", r700Var.toString());
        bundle.putString("ARGS_DESCRIPTION", str);
        kqg0Var.setArguments(bundle);
        kqg0Var.show(getParentFragmentManager(), "ErrorDialog");
    }

    public final void T0() {
        AlertDialog alertDialog = this.G;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog alertDialog2 = this.G;
        if (alertDialog2 != null) {
            alertDialog2.show();
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        AlertDialog alertDialogShow = new AlertDialog.Builder(contextRequireContext).setView(new ProgressBar(contextRequireContext)).setCancelable(false).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.clearFlags(2);
        }
        this.G = alertDialogShow;
    }

    public final void U0(int i2) {
        ClearEditText clearEditTextR0 = r0();
        ble.e(getContext(), getParentFragmentManager(), String.valueOf(o1l.a(this.K, this.L, getW(), getJ0(), v4c.a.c(String.valueOf(clearEditTextR0 != null ? clearEditTextR0.getText() : null)) * 10000.0d, getX())), i2);
    }

    public final void V0() {
        this.P = true;
        boolean f2 = getF();
        q8i0 q8i0Var = this.E;
        if (f2) {
            c2l c2lVar = (c2l) q8i0Var.getValue();
            r5b r5bVarC = i2i.c(new xzh(c2lVar.a.a(new String[]{getW()}, new String[]{getJ0()}, new String[]{String.valueOf(getX().a)}), new a2l(2, null)), o8i0.d(c2lVar).a, 2);
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            r5bVarC.f(viewLifecycleOwner, new e000(new g(r5bVarC, viewLifecycleOwner, this)));
        }
        c2l c2lVar2 = (c2l) q8i0Var.getValue();
        String userId = this.i.getUserId();
        if (userId == null) {
            userId = "";
        }
        String strB = t0().B();
        boolean z = getX() == ga00.WITHDRAW;
        strB.getClass();
        r5b r5bVarC2 = i2i.c(new xzh(c2lVar2.a.c(userId, strB, z), new z1l(2, null)), o8i0.d(c2lVar2).a, 2);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        r5bVarC2.f(viewLifecycleOwner2, new e000(new h(r5bVarC2, viewLifecycleOwner2, this)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0156  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public final void X0(String str, ga00 ga00Var) {
        g0l g0lVarE;
        KycLimitData kycLimitData;
        TextView textViewC0;
        j7g j7gVar;
        Integer numD0;
        int iIntValue;
        int iOrdinal;
        int i2;
        TextView textViewC1;
        TextView textViewC2;
        TextView textViewC3;
        TextView textViewC4;
        int iOrdinal2;
        Integer num;
        if (t0().O()) {
            return;
        }
        z0(str, ga00Var);
        c2l c2lVar = (c2l) this.E.getValue();
        ej5.c(o8i0.d(c2lVar), null, null, new b2l(c2lVar, this.N, null), 3);
        int iOrdinal3 = ga00Var.ordinal();
        if (iOrdinal3 == 0) {
            f0l f0lVar = this.O;
            if (f0lVar != null) {
                g0lVarE = f0lVar.e(str);
            } else {
                g0lVarE = null;
            }
        } else {
            if (iOrdinal3 != 1) {
                uhc.a();
                return;
            }
            f0l f0lVar2 = this.O;
            if (f0lVar2 != null) {
                g0lVarE = f0lVar2.f(str);
            } else {
                g0lVarE = null;
            }
        }
        if (C0() != null && (kycLimitData = this.K) != null) {
            int i3 = this.N;
            if ((kycLimitData != null ? Integer.valueOf(kycLimitData.getCurrentLevel()) : null) != null) {
                KycLimitData kycLimitData2 = this.K;
                kycLimitData2.getClass();
                if (kycLimitData2.getCurrentLevel() < i3 || !q0()) {
                    if (!StringsKt.U(str) && !(g0lVarE instanceof g0l.b)) {
                        textViewC0 = C0();
                        if (textViewC0 != null) {
                            textViewC0.setClickable(false);
                        }
                        j7gVar = new j7g();
                        numD0 = getW();
                        if (numD0 == null) {
                            iIntValue = this.N;
                        } else {
                            num = q0() ? null : numD0;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = this.N;
                            }
                        }
                        if (iIntValue == 0) {
                            iOrdinal2 = ga00Var.ordinal();
                            if (iOrdinal2 != 0) {
                                j7gVar.a(sn5.d(this, R.string.page_payment__you_will_need_kyc_verification_for_this_deposit_to_credit, new Object[0]));
                            } else {
                                if (iOrdinal2 == 1) {
                                    uhc.a();
                                    return;
                                }
                                j7gVar.a(sn5.d(this, R.string.page_payment__you_will_need_kyc_verification_for_this_withdraw_to_credit, new Object[0]));
                            }
                        } else {
                            iOrdinal = ga00Var.ordinal();
                            if (iOrdinal != 0) {
                                if (q0()) {
                                    i2 = R.string.page_payment__you_will_need_tier_vnum_verification_for_this_deposit_to_credit;
                                } else {
                                    textViewC1 = C0();
                                    if (textViewC1 != null) {
                                        textViewC1.setClickable(true);
                                    }
                                    i2 = R.string.page_payment__you_will_need_tier_vnum_verification_to_make_deposits_please_click_here_to_confirm_your_account_details;
                                }
                                j7gVar.a(nae0.a(sn5.d(this, i2, String.valueOf(iIntValue))));
                            } else {
                                if (iOrdinal == 1) {
                                    uhc.a();
                                    return;
                                }
                                textViewC2 = C0();
                                if (textViewC2 != null) {
                                    textViewC2.setClickable(true);
                                }
                                j7gVar.a(nae0.a(sn5.d(this, R.string.page_payment__you_will_need_tier_vnum_verification_to_make_withdrawals_please_click_here_to_confirm_your_account_details, String.valueOf(iIntValue))));
                            }
                            String strValueOf = String.valueOf(iIntValue);
                            j7gVar.setSpan(new ForegroundColorSpan(requireContext().getColor(R.color.brand_secondary)), StringsKt.T(j7gVar, strValueOf, 0, false, 6), strValueOf.length() + StringsKt.T(j7gVar, strValueOf, 0, false, 6), 17);
                        }
                        textViewC3 = C0();
                        if (textViewC3 != null) {
                            textViewC3.setText(j7gVar);
                        }
                        textViewC4 = C0();
                        if (textViewC4 != null) {
                            textViewC4.setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
            } else if (!StringsKt.U(str)) {
                textViewC0 = C0();
                if (textViewC0 != null) {
                    textViewC0.setClickable(false);
                }
                j7gVar = new j7g();
                numD0 = getW();
                if (numD0 == null) {
                    iIntValue = this.N;
                } else {
                    if (q0()) {
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = this.N;
                    }
                }
                if (iIntValue == 0) {
                    iOrdinal2 = ga00Var.ordinal();
                    if (iOrdinal2 != 0) {
                        j7gVar.a(sn5.d(this, R.string.page_payment__you_will_need_kyc_verification_for_this_deposit_to_credit, new Object[0]));
                    } else {
                        if (iOrdinal2 == 1) {
                            uhc.a();
                            return;
                        }
                        j7gVar.a(sn5.d(this, R.string.page_payment__you_will_need_kyc_verification_for_this_withdraw_to_credit, new Object[0]));
                    }
                } else {
                    iOrdinal = ga00Var.ordinal();
                    if (iOrdinal != 0) {
                        if (q0()) {
                            textViewC1 = C0();
                            if (textViewC1 != null) {
                                textViewC1.setClickable(true);
                            }
                            i2 = R.string.page_payment__you_will_need_tier_vnum_verification_to_make_deposits_please_click_here_to_confirm_your_account_details;
                        } else {
                            i2 = R.string.page_payment__you_will_need_tier_vnum_verification_for_this_deposit_to_credit;
                        }
                        j7gVar.a(nae0.a(sn5.d(this, i2, String.valueOf(iIntValue))));
                    } else {
                        if (iOrdinal == 1) {
                            uhc.a();
                            return;
                        }
                        textViewC2 = C0();
                        if (textViewC2 != null) {
                            textViewC2.setClickable(true);
                        }
                        j7gVar.a(nae0.a(sn5.d(this, R.string.page_payment__you_will_need_tier_vnum_verification_to_make_withdrawals_please_click_here_to_confirm_your_account_details, String.valueOf(iIntValue))));
                    }
                    String strValueOf2 = String.valueOf(iIntValue);
                    j7gVar.setSpan(new ForegroundColorSpan(requireContext().getColor(R.color.brand_secondary)), StringsKt.T(j7gVar, strValueOf2, 0, false, 6), strValueOf2.length() + StringsKt.T(j7gVar, strValueOf2, 0, false, 6), 17);
                }
                textViewC3 = C0();
                if (textViewC3 != null) {
                    textViewC3.setText(j7gVar);
                }
                textViewC4 = C0();
                if (textViewC4 != null) {
                    textViewC4.setVisibility(0);
                    return;
                }
                return;
            }
        }
        TextView textViewC5 = C0();
        if (textViewC5 != null) {
            textViewC5.setVisibility(8);
        }
    }

    public final void Y0(final WithDrawInfo withDrawInfo) {
        if (!Intrinsics.g(withDrawInfo != null ? Boolean.valueOf(withDrawInfo.hasInfo) : null, Boolean.TRUE)) {
            View viewJ0 = J0();
            if (viewJ0 != null) {
                viewJ0.setVisibility(8);
            }
            TextView textViewL0 = L0();
            if (textViewL0 != null) {
                textViewL0.setVisibility(8);
            }
            TextView textViewK0 = K0();
            if (textViewK0 != null) {
                textViewK0.setVisibility(8);
            }
            TextView textViewL1 = L0();
            if (textViewL1 != null) {
                textViewL1.setText(sn5.d(this, R.string.app_common__no_cash, new Object[0]));
                return;
            }
            return;
        }
        View viewJ1 = J0();
        if (viewJ1 != null) {
            viewJ1.setVisibility(0);
        }
        TextView textViewL2 = L0();
        if (textViewL2 != null) {
            textViewL2.setVisibility(0);
        }
        TextView textViewK1 = K0();
        if (textViewK1 != null) {
            textViewK1.setVisibility(0);
        }
        BigDecimal bigDecimalB = p54.b(new BigDecimal(withDrawInfo.maxWithdrawAmount));
        f0l f0lVar = this.O;
        if (f0lVar != null) {
            bigDecimalB.getClass();
            f0lVar.e = bigDecimalB;
        }
        TextView textViewL3 = L0();
        if (textViewL3 != null) {
            textViewL3.setText(bjb0.Y(bigDecimalB));
        }
        View viewJ2 = J0();
        if (viewJ2 != null) {
            viewJ2.setOnClickListener(new View.OnClickListener() { // from class: vzz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = withDrawInfo.message;
                    str.getClass();
                    c000 c000Var = this.a;
                    if (c000Var.getActivity() == null || c000Var.requireActivity().isFinishing() || TextUtils.isEmpty(str)) {
                        return;
                    }
                    ua00.a(c000Var.getChildFragmentManager(), str);
                }
            });
        }
    }

    public boolean Z0(ClearEditText clearEditText) {
        TextView errorView;
        String strValueOf = String.valueOf(clearEditText.getText());
        TextView errorView2 = clearEditText.getErrorView();
        if (errorView2 != null) {
            errorView2.setOnClickListener(null);
        }
        if (getF()) {
            X0(strValueOf, ga00.WITHDRAW);
        }
        f0l f0lVar = this.O;
        g0l g0lVarF = f0lVar != null ? f0lVar.f(strValueOf) : null;
        if (Intrinsics.g(g0lVarF, g0l.a.a)) {
            clearEditText.setError((String) null);
            return false;
        }
        int i2 = 1;
        if (!(g0lVarF instanceof g0l.b)) {
            if (Intrinsics.g(g0lVarF, g0l.c.a)) {
                clearEditText.setError((String) null);
                return true;
            }
            clearEditText.setError((String) null);
            return true;
        }
        UiText uiText = ((g0l.b) g0lVarF).a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        uiText.getClass();
        clearEditText.setError(uiText.e(contextRequireContext).toString());
        wae waeVar = ((g0l.b) g0lVarF).b;
        if (waeVar != null && (errorView = clearEditText.getErrorView()) != null) {
            errorView.setOnClickListener(new qc3(waeVar, i2));
        }
        return false;
    }

    @fae
    public final void n0(String str, String str2, final a aVar) {
        String strD;
        aVar.getClass();
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(requireActivity(), R.style.Widget_Payment_PendingRequest_AlertDialog).setMessage(str2).setCancelable(false).setTitle(str).setPositiveButton(sn5.d(this, R.string.common_functions__home, new Object[0]), new DialogInterface.OnClickListener() { // from class: a000
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                sh8.c().e(o7d.a(wae.HOME));
                e activity = this.a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            strD = sn5.d(this, R.string.common_functions__transactions, new Object[0]);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            strD = sn5.d(this, R.string.common_functions__contact_us, new Object[0]);
        }
        positiveButton.setNegativeButton(strD, new DialogInterface.OnClickListener() { // from class: b000
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                int iOrdinal2 = aVar.ordinal();
                c000 c000Var = this;
                if (iOrdinal2 == 0) {
                    Bundle bundleA = x6.a(AnalyticsEvent.DEPOSIT, false);
                    bundleA.putInt("key_param_tx_category", aqg0.j.c.a);
                    sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundleA);
                    e activity = c000Var.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                d0n d0nVar = c000Var.D;
                if (d0nVar == null) {
                    Intrinsics.n("utils");
                    throw null;
                }
                e eVarRequireActivity = c000Var.requireActivity();
                eVarRequireActivity.getClass();
                d0nVar.b(eVarRequireActivity, snb0.ME);
            }
        }).show();
    }

    @fae
    public final void o0(String str, String str2, String str3, final Function0<Unit> function0, String str4, final Function0<Unit> function1, boolean z) {
        str2.getClass();
        if (getActivity() != null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || !activity.isFinishing()) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                if (str3 == null) {
                    str3 = sn5.d(this, R.string.common_functions__ok, new Object[0]);
                }
                js.a(contextRequireContext, str, str2, z, str3, str4, new Function0() { // from class: xzz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function0 function2 = function0;
                        if (function2 != null) {
                            function2.invoke();
                        } else {
                            this.requireActivity().finish();
                        }
                        return Unit.a;
                    }
                }, new Function0() { // from class: yzz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function0 function2 = function1;
                        if (function2 != null) {
                            function2.invoke();
                        } else {
                            this.requireActivity().finish();
                        }
                        return Unit.a;
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AlertDialog alertDialog = this.G;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.G = null;
        super.onDestroyView();
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        a92 a92Var = this.H;
        if (a92Var != null) {
            a92Var.dismissAllowingStateLoss();
        }
        this.H = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        lyh<Boolean> lyhVarV0 = v0();
        if (lyhVarV0 != null) {
            g1i g1iVar = new g1i(lyhVarV0, new d000(this, null));
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            kzh.d(g1iVar, ebs.a(viewLifecycleOwner.getLifecycle()));
        }
        zzz zzzVar = new zzz(this, 0 == true ? 1 : 0);
        CountryCodeName countryCode = t0().getCountryCode();
        ga00 ga00VarF0 = getX();
        String strU0 = u0();
        countryCode.getClass();
        ga00VarF0.getClass();
        strU0.getClass();
        boolean z = ga00VarF0 == ga00.DEPOSIT;
        this.O = e0l.a[countryCode.ordinal()] == 1 ? new l9k0(strU0, zzzVar, z) : new vum(countryCode, strU0, z);
        TextView textViewC0 = C0();
        if (textViewC0 != null) {
            textViewC0.setOnClickListener(new sc3(this, 2));
        }
    }

    public final boolean q0() {
        Integer numD0 = getW();
        if (numD0 == null) {
            return true;
        }
        int iIntValue = numD0.intValue();
        KycLimitData kycLimitData = this.K;
        if ((kycLimitData != null ? Integer.valueOf(kycLimitData.getCurrentLevel()) : null) == null) {
            return false;
        }
        KycLimitData kycLimitData2 = this.K;
        kycLimitData2.getClass();
        return kycLimitData2.getCurrentLevel() >= iIntValue;
    }

    public ClearEditText r0() {
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public abstract String getJ0();

    public final psm t0() {
        psm psmVar = this.B;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final String u0() {
        return t0().f();
    }

    public lyh<Boolean> v0() {
        return null;
    }

    public View w0() {
        return null;
    }

    public View y0() {
        return null;
    }

    public final void z0(String str, ga00 ga00Var) {
        str.getClass();
        this.N = !TextUtils.isEmpty(str) ? o1l.a(this.K, this.L, getW(), getJ0(), v4c.a.c(str) * 10000.0d, ga00Var) : 0;
    }

    public void L() {
    }

    public void O0() {
    }

    @Override // a92.a
    public final void p() {
    }
}
