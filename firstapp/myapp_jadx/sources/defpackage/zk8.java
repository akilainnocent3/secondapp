package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzk8;", "Landroidx/fragment/app/d;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zk8 extends dpl {
    public String A;
    public String B;
    public int C;
    public String D;
    public Integer E;
    public String F;
    public WithdrawAlertHintStatus G;
    public final q8i0 H;
    public a I;
    public final ak8 J;
    public psm f;
    public rdd0 i;
    public d0n v;
    public fme w;
    public String y;
    public String z;

    public static final class b implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return zk8.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? zk8.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public zk8() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.H = new q8i0(jq40.a(el8.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.J = new ak8(this, 0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("ARG_AMOUNT");
            string.getClass();
            this.y = string;
            String string2 = arguments.getString("ARG_REMAIN_AMOUNT");
            string2.getClass();
            this.z = string2;
            String string3 = arguments.getString("ARG_WITHDRAW_TO");
            string3.getClass();
            this.A = string3;
            String string4 = arguments.getString("ARG_MOBILE_NUMBER");
            string4.getClass();
            this.B = string4;
            this.C = arguments.getInt("ARG_PAY_CH_ID");
            this.D = arguments.getString("ARG_CHANNEL_SEND_NAME");
            this.E = Integer.valueOf(arguments.getInt("ARG_CHANNEL_ICON_RES_ID"));
            this.F = arguments.getString("ARG_CHANNEL_ICON_URL");
            WithdrawAlertHintStatus withdrawAlertHintStatus = (WithdrawAlertHintStatus) ((Parcelable) rj5.a(arguments, "ARG_DROP_ALERT", WithdrawAlertHintStatus.class));
            if (withdrawAlertHintStatus == null) {
                withdrawAlertHintStatus = WithdrawAlertHintStatus.Gone.a;
            }
            this.G = withdrawAlertHintStatus;
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        this.w = fme.a(getLayoutInflater());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        bo8 bo8Var = new bo8(contextRequireContext, R.style.BottomDialog);
        int i = 1;
        bo8Var.requestWindowFeature(1);
        fme fmeVar = this.w;
        fmeVar.getClass();
        ConstraintLayout constraintLayout = fmeVar.a;
        constraintLayout.getClass();
        bo8Var.setContentView(constraintLayout);
        bo8Var.setCanceledOnTouchOutside(true);
        int i2 = 0;
        bo8Var.setCancelable(false);
        Window window = bo8Var.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(R.style.AnimBottom);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        a aVar = new a(false);
        this.I = aVar;
        bo8Var.c.a(bo8Var, aVar);
        fme fmeVar2 = this.w;
        fmeVar2.getClass();
        CommonButton commonButton = fmeVar2.d;
        ak8 ak8Var = this.J;
        commonButton.setOnClickListener(ak8Var);
        ProgressButton progressButton = fmeVar2.e;
        progressButton.setOnClickListener(ak8Var);
        TextView textView = fmeVar2.y;
        textView.setVisibility(0);
        TextView textView2 = fmeVar2.i;
        textView2.setVisibility(0);
        TextView textView3 = fmeVar2.z;
        textView3.setVisibility(0);
        fmeVar2.v.setVisibility(0);
        textView.setText(getString(R.string.page_withdraw__withdraw_to));
        textView3.setText(getString(R.string.my_account__mobile_number));
        TextView textView4 = fmeVar2.c;
        psm psmVar = this.f;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        textView4.setText(sn5.d(this, R.string.common_functions__amount_label, psmVar.f()));
        String str = this.A;
        if (str == null) {
            Intrinsics.n("withdrawTo");
            throw null;
        }
        textView2.setText(str);
        progressButton.setButtonText(sn5.d(this, R.string.common_functions__confirm, new Object[0]));
        mla.i(fmeVar2.H, new op8(360630533, new Function2() { // from class: vk8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar2 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    WithdrawAlertHintStatus withdrawAlertHintStatus = this.a.G;
                    if (withdrawAlertHintStatus == null) {
                        Intrinsics.n("withdrawAlertHintStatus");
                        throw null;
                    }
                    ihj0.a(withdrawAlertHintStatus, true, null, aVar2, 48, 4);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
        AppCompatImageView appCompatImageView = fmeVar2.f;
        WithdrawAlertHintStatus withdrawAlertHintStatus = this.G;
        if (withdrawAlertHintStatus == null) {
            Intrinsics.n("withdrawAlertHintStatus");
            throw null;
        }
        c8i0.o(appCompatImageView, withdrawAlertHintStatus.isVisible());
        el8 el8Var = (el8) this.H.getValue();
        String str2 = this.y;
        if (str2 == null) {
            Intrinsics.n("amountText");
            throw null;
        }
        String str3 = this.z;
        if (str3 == null) {
            Intrinsics.n("remainText");
            throw null;
        }
        String str4 = this.A;
        if (str4 == null) {
            Intrinsics.n("withdrawTo");
            throw null;
        }
        String str5 = this.B;
        if (str5 == null) {
            Intrinsics.n("phone");
            throw null;
        }
        int i3 = this.C;
        String str6 = this.D;
        el8Var.c = str4;
        el8Var.d = str5;
        el8Var.e = i3;
        el8Var.f = str6;
        BigDecimal bigDecimal = new BigDecimal(str2);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10000L);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        bigDecimalMultiply.getClass();
        el8Var.b = bigDecimalMultiply;
        ssw<String> sswVar = el8Var.w;
        long jLongValue = bigDecimalMultiply.longValue();
        Locale locale = Locale.US;
        sswVar.m(bjb0.U(jLongValue, locale));
        BigDecimal bigDecimal2 = new BigDecimal(str3);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
        bigDecimalValueOf2.getClass();
        el8Var.z.m(bjb0.U(bigDecimal2.multiply(bigDecimalValueOf2).longValue(), locale));
        String strA = el8Var.d;
        if (strA == null) {
            Intrinsics.n("phone");
            throw null;
        }
        ssw<String> sswVar2 = el8Var.i;
        if (TextUtils.isDigitsOnly(strA) && strA.length() > 5) {
            strA = fu5.a("(?<=\\d{2})\\d(?=\\d{3})", strA, "*");
        }
        sswVar2.m(strA);
        el8Var.y.f(this, new b(new lk8(this, i2)));
        el8Var.A.f(this, new b(new rk8(this, 0)));
        el8Var.v.f(this, new b(new sk8(this, i2)));
        el8Var.C.f(this, new b(new oh3(this, i)));
        el8Var.E.f(this, new b(new Function1() { // from class: tk8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                zk8 zk8Var = this.a;
                fme fmeVar3 = zk8Var.w;
                fmeVar3.getClass();
                CommonButton commonButton2 = fmeVar3.d;
                bool.getClass();
                commonButton2.setEnabled(bool.booleanValue());
                Dialog dialog = zk8Var.getDialog();
                if (dialog != null) {
                    dialog.setCanceledOnTouchOutside(bool.booleanValue());
                }
                zk8.a aVar2 = zk8Var.I;
                if (aVar2 != null) {
                    aVar2.f(!bool.booleanValue());
                }
                return Unit.a;
            }
        }));
        el8Var.G.f(this, new b(new uk8(this, i2)));
        g1i g1iVar = new g1i(el8Var.I, new yk8(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        return bo8Var;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.w = null;
    }

    public static final class a extends cny {
        @Override // defpackage.cny
        public final void b() {
        }
    }
}
