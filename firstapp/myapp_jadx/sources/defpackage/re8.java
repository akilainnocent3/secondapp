package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CustomProgressButton;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.deposit.MedialOtherActivity;
import com.sportybet.android.ugpay.model.BountyHintUiState;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lre8;", "Lm12;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class re8 extends zol {
    public psm B;
    public com.sporty.android.common.uievent.e C;
    public rdd0 D;
    public final i6i0 E;
    public final q8i0 F;
    public final q8i0 G;
    public String H;
    public String I;
    public String J;
    public final mpe0 K;
    public final mpe0 L;
    public final mpe0 M;
    public final mpe0 N;
    public fth O;
    public static final /* synthetic */ ohp<Object>[] Q = {new d630(0, re8.class, "binding", "getBinding()Lcom/sportybet/feature/payment/impl/databinding/FragmentCommonMobileMoneyDepositBinding;")};
    public static final a P = new a();

    public static final class a {
    }

    public static final class b implements QuickInputItemListView.a.InterfaceC0413a {
        public b() {
        }

        @Override // com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView.a.InterfaceC0413a
        public final void a(QuickInputItem quickInputItem) {
            quickInputItem.getClass();
            a aVar = re8.P;
            df8 df8VarO0 = re8.this.o0();
            BigDecimal bigDecimalAdd = p54.b(new BigDecimal(quickInputItem.amount)).add(p54.b(new BigDecimal(quickInputItem.bounty)));
            bigDecimalAdd.getClass();
            String string = bigDecimalAdd.toString();
            string.getClass();
            df8VarO0.x1(string);
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
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

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return re8.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return re8.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return re8.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return re8.this;
        }
    }

    public static final class h extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
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

    public static final class k extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? re8.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public re8() {
        super(R.layout.fragment_common_mobile_money_deposit);
        int i2 = 0;
        this.z = false;
        this.A = false;
        this.E = new i6i0(new zd8());
        ttr ttrVarA = hwr.a(a1s.c, new h(new g()));
        this.F = new q8i0(jq40.a(df8.class), new i(ttrVarA), new k(ttrVarA), new j(ttrVarA));
        this.G = new q8i0(jq40.a(zc8.class), new d(), new f(), new e());
        this.H = "";
        this.I = "";
        this.J = "";
        this.K = hwr.b(new je8(this, i2));
        this.L = hwr.b(new ke8(this, i2));
        this.M = hwr.b(new le8(this, 0));
        this.N = hwr.b(new me8(this, i2));
    }

    public final bvi n0() {
        g6i0 g6i0VarA = this.E.a(this, Q[0]);
        g6i0VarA.getClass();
        return (bvi) g6i0VarA;
    }

    public final df8 o0() {
        return (df8) this.F.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zol, defpackage.bml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof fth) {
            this.O = (fth) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.sporty.android.common.uievent.e eVar = this.C;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.O = null;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        IconTextSelectorButton iconTextSelectorButton = n0().z;
        Boolean bool = Boolean.FALSE;
        lop.b(iconTextSelectorButton, bool);
        lop.b(n0().b, bool);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        bvi bviVarN0 = n0();
        IconTextSelectorButton iconTextSelectorButton = bviVarN0.G;
        CustomProgressButton customProgressButton = bviVarN0.H;
        int i2 = 0;
        iconTextSelectorButton.setEnabled(false);
        bviVarN0.z.setEnabled(false);
        ClearEditText clearEditText = bviVarN0.b;
        mpe0 mpe0Var = this.M;
        String str = s5y.c.format(((Number) mpe0Var.getValue()).longValue());
        str.getClass();
        clearEditText.setHint(sn5.d(this, R.string.page_payment__min_vnum, str));
        clearEditText.setErrorView(bviVarN0.e);
        df8 df8VarO0 = o0();
        PaymentChannel paymentChannel = (PaymentChannel) this.L.getValue();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((Number) mpe0Var.getValue()).longValue());
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(((Number) this.N.getValue()).longValue());
        bigDecimalValueOf2.getClass();
        paymentChannel.getClass();
        df8VarO0.y = bigDecimalValueOf;
        df8VarO0.z = bigDecimalValueOf2;
        df8VarO0.A = s5y.c(bigDecimalValueOf);
        df8VarO0.B = s5y.c(bigDecimalValueOf2);
        v8 accountInfo = df8VarO0.c.getAccountInfo();
        if (accountInfo != null) {
            df8VarO0.J = accountInfo;
            ssw<String> sswVar = df8VarO0.K;
            String strA = accountInfo.a;
            if (TextUtils.isDigitsOnly(strA) && strA.length() > 5) {
                strA = fu5.a("(?<=\\d{2})\\d(?=\\d{3})", strA, "*");
            }
            sswVar.m(strA);
        }
        df8VarO0.C = paymentChannel;
        ej5.c(o8i0.d(df8VarO0), null, null, new ef8(df8VarO0, paymentChannel, null), 3);
        kzh.d(df8VarO0.e.l(pu0.c.a), o8i0.d(df8VarO0));
        df8VarO0.E.f(getViewLifecycleOwner(), new c(new pe8(this, 0)));
        o0().G.f(getViewLifecycleOwner(), new c(new qe8(this, i2)));
        g1i g1iVar = new g1i(df8VarO0.U, new we8(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        df8VarO0.I.f(getViewLifecycleOwner(), new c(new Function1() { // from class: ae8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                cx cxVar = (cx) obj;
                re8.a aVar = re8.P;
                re8 re8Var = this.a;
                ClearEditText clearEditText2 = re8Var.n0().b;
                String str2 = cxVar.a;
                kcg kcgVar = cxVar.c;
                if (!Intrinsics.g(str2, String.valueOf(clearEditText2.getText()))) {
                    clearEditText2.setText(cxVar.a);
                    clearEditText2.setSelection(cxVar.b);
                }
                if (Intrinsics.g(kcgVar, kcg.a.b)) {
                    clearEditText2.setError((String) null);
                } else if (kcgVar instanceof kcg.b) {
                    clearEditText2.setError(sn5.c(clearEditText2, R.string.page_payment__the_maximum_deposit_amount_is_vcurrency_vamount, re8Var.p0().f(), kcgVar.a));
                } else if (kcgVar instanceof kcg.f) {
                    clearEditText2.setError(sn5.c(clearEditText2, R.string.page_payment__the_minimum_deposit_amount_is_vcurrency_vamount, re8Var.p0().f(), kcgVar.a));
                }
                return Unit.a;
            }
        }));
        df8VarO0.L.f(getViewLifecycleOwner(), new c(new be8(this, 0)));
        df8VarO0.O.f(getViewLifecycleOwner(), new c(new ce8(this, 0)));
        df8VarO0.Q.f(getViewLifecycleOwner(), new c(new de8(this, i2)));
        df8VarO0.S.f(getViewLifecycleOwner(), new c(new Function1() { // from class: ee8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BountyHintUiState bountyHintUiState = (BountyHintUiState) obj;
                re8.a aVar = re8.P;
                re8 re8Var = this.a;
                if (bountyHintUiState == null) {
                    re8Var.n0().v.setVisibility(8);
                    re8Var.n0().w.setVisibility(8);
                    return Unit.a;
                }
                if (bountyHintUiState instanceof BountyHintUiState.b) {
                    re8Var.n0().v.setVisibility(8);
                    TextView textView = re8Var.n0().w;
                    UiText uiText = ((BountyHintUiState.b) bountyHintUiState).c;
                    Context contextRequireContext = re8Var.requireContext();
                    contextRequireContext.getClass();
                    textView.setText(uiText.e(contextRequireContext));
                    re8Var.n0().w.setVisibility(0);
                } else {
                    if (!(bountyHintUiState instanceof BountyHintUiState.a)) {
                        uhc.a();
                        return null;
                    }
                    re8Var.n0().w.setVisibility(8);
                    BountyHintUiState.a aVar2 = (BountyHintUiState.a) bountyHintUiState;
                    re8Var.n0().A.setText(aVar2.b);
                    TextView textView2 = re8Var.n0().c;
                    ResourceUiText resourceUiText = aVar2.c;
                    Context contextRequireContext2 = re8Var.requireContext();
                    contextRequireContext2.getClass();
                    textView2.setText(resourceUiText.e(contextRequireContext2));
                    re8Var.n0().v.setVisibility(0);
                }
                return Unit.a;
            }
        }));
        df8VarO0.W.f(getViewLifecycleOwner(), new c(new fe8(this, i2)));
        q8i0 q8i0Var = this.G;
        ((zc8) q8i0Var.getValue()).f.f(getViewLifecycleOwner(), new c(new ge8(this, i2)));
        g1i g1iVar2 = new g1i(df8VarO0.Y, new se8(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(df8VarO0.a0, new te8(this, null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(((zc8) q8i0Var.getValue()).G, new ue8(this, null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(df8VarO0.b0, new ve8(this, null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        clearEditText.setTextChangedListener(new ClearEditText.b() { // from class: ne8
            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
            public final void l(CharSequence charSequence) {
                re8.a aVar = re8.P;
                this.a.o0().x1(StringsKt.t0(charSequence.toString()).toString());
            }
        });
        clearEditText.setFilters(new InputFilter[]{new nqy()});
        customProgressButton.setText(sn5.d(this, R.string.common_functions__top_up_now, new Object[0]));
        customProgressButton.setOnClickListener(new rb3(this, 1));
        PayHintData payHintData = (PayHintData) this.K.getValue();
        if (payHintData != null) {
            if (TextUtils.isEmpty(payHintData.alert)) {
                n0().J.setVisibility(8);
            } else {
                n0().J.setVisibility(0);
                n0().F.setText(payHintData.alert);
            }
            List<String> list = payHintData.descriptionLines;
            if (list != null) {
                for (String str2 : list) {
                    if (str2.length() != 0) {
                        TextView textView = new TextView(n0().E.getContext());
                        textView.setText(str2);
                        textView.setTextColor(Color.parseColor("#9ca0ab"));
                        textView.setTextSize(1, 12.0f);
                        textView.setLineSpacing(0.0f, 1.2f);
                        textView.setPadding(0, 0, 0, zch0.a(textView.getContext(), 2));
                        n0().E.addView(textView);
                    }
                }
            }
        }
        bviVarN0.d.setText(sn5.d(this, R.string.common_functions__amount_label, p0().f()));
        bviVarN0.i.setText(sn5.d(this, R.string.common_functions__balance_label, p0().f()));
        bviVarN0.y.setText(sn5.d(this, R.string.page_payment__select_amount, new Object[0]) + " (" + p0().f() + ")");
        bviVarN0.B.setText(sn5.d(this, R.string.page_payment__charges, new Object[0]) + " (" + p0().f() + ")");
        bviVarN0.K.setText(sn5.d(this, R.string.page_payment__you_will_receive__KE, new Object[0]) + " (" + p0().f() + ")");
        bviVarN0.I.setOnClickListener(new b());
        bviVarN0.C.setupOnClickListener(new Function1() { // from class: oe8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                re8.a aVar = re8.P;
                bigDecimal.getClass();
                re8 re8Var = this.a;
                df8 df8VarO1 = re8Var.o0();
                ej5.c(o8i0.d(df8VarO1), null, null, new ff8(df8VarO1, bigDecimal, new he8(re8Var, 0), null), 3);
                return Unit.a;
            }
        });
        uwd0<String> uwd0VarX0 = o0().a.x0();
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar2 = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new xe8(viewLifecycleOwner, uwd0VarX0, null, this), 3);
    }

    public final psm p0() {
        psm psmVar = this.B;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(androidx.fragment.app.e eVar) {
        o77 o77Var = (o77) o0().E.d();
        String str = this.H;
        String str2 = this.I;
        String str3 = this.J;
        int i2 = o77Var != null ? o77Var.b : -1;
        s9e0 s9e0Var = s9e0.a;
        String str4 = o77Var != null ? o77Var.c : null;
        s9e0Var.getClass();
        String strA = s9e0.a(str4);
        int i3 = MedialOtherActivity.z;
        Intent intent = new Intent(eVar, (Class<?>) MedialOtherActivity.class);
        intent.putExtra("EXTRA_TRADE_ID", str);
        intent.putExtra("EXTRA_MOBILE_NUMBER", str2);
        intent.putExtra("EXTRA_CHANNEL_DISPLAY_NAME", str3);
        intent.putExtra("EXTRA_CHANNEL_ICON_RES_ID", i2);
        intent.putExtra("EXTRA_CHANNEL_ICON_URL", strA);
        eVar.startActivity(intent);
        eVar.finish();
    }
}
