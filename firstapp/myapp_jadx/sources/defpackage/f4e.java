package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.DigitsKeyListener;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.CombText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4e;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f4e extends rpl {
    public final q8i0 f0;
    public ovi g0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$1", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = f4e.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((a) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ovi oviVar = f4e.this.g0;
            if (oviVar != null) {
                b330.a(oviVar.G, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$2", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<ncx, o200, v1b<? super Unit>, Object> {
        public /* synthetic */ ncx a;
        public /* synthetic */ o200 b;

        public static final class a extends ClickableSpan {
            public final /* synthetic */ f4e a;

            public a(f4e f4eVar) {
                this.a = f4eVar;
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                view.getClass();
                f5e f5eVarP0 = this.a.P0();
                ej5.c(o8i0.d(f5eVarP0), null, null, new p02(f5eVarP0, null), 3);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.getClass();
                super.updateDrawState(textPaint);
                textPaint.setColor(this.a.requireContext().getColor(R.color.text_type1_primary));
                textPaint.setUnderlineText(true);
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(ncx ncxVar, o200 o200Var, v1b<? super Unit> v1bVar) {
            b bVar = f4e.this.new b(v1bVar);
            bVar.a = ncxVar;
            bVar.b = o200Var;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ncx ncxVar = this.a;
            o200 o200Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = ncxVar.b;
            f4e f4eVar = f4e.this;
            if (z) {
                f4eVar.D0().setVisibility(0);
                String strD = sn5.d(f4eVar, R.string.common_functions__click_here, new Object[0]);
                SpannableString spannableString = new SpannableString(tug.a(strD, " ", sn5.d(f4eVar, R.string.page_payment__name_confirm_tips, new Object[0])));
                spannableString.setSpan(new a(f4eVar), 0, strD.length(), 17);
                f4eVar.D0().setHint(spannableString);
                f4eVar.D0().getTextView().setMovementMethod(LinkMovementMethod.getInstance());
            } else if (o200Var.a != null) {
                f4eVar.D0().setVisibility(0);
                HintView hintViewD0 = f4eVar.D0();
                UiText uiText = o200Var.a;
                Context contextRequireContext = f4eVar.requireContext();
                contextRequireContext.getClass();
                HintView.setHintInHtml$default(hintViewD0, uiText.e(contextRequireContext), 0, 2, null);
                f4eVar.D0().setTypeColor(o200Var.b);
            } else {
                f4eVar.D0().setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$3", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = f4e.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
            return ((c) create(uiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText = (UiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            f4e f4eVar = f4e.this;
            ovi oviVar = f4eVar.g0;
            if (uiText != null) {
                if (oviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                HintView hintView = oviVar.H;
                Context contextRequireContext = f4eVar.requireContext();
                contextRequireContext.getClass();
                hintView.setHint(Html.fromHtml(uiText.e(contextRequireContext).toString(), 0));
                ovi oviVar2 = f4eVar.g0;
                if (oviVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oviVar2.H.setVisibility(0);
            } else {
                if (oviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oviVar.H.setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$4", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<jw1, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = f4e.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jw1 jw1Var, v1b<? super Unit> v1bVar) {
            return ((d) create(jw1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jw1 jw1Var = (jw1) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            f4e f4eVar = f4e.this;
            ovi oviVar = f4eVar.g0;
            int i = R.color.text_type1_secondary;
            if (jw1Var != null) {
                if (oviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                CombText combText = oviVar.y;
                Context context = combText.getContext();
                if (combText.isEnabled()) {
                    i = R.color.text_type1_primary;
                }
                combText.setLabelTextColor(context.getColor(i));
                String str = jw1Var.c;
                if (str != null) {
                    combText.setLabelText(str);
                }
                String str2 = jw1Var.d;
                if (str2 != null) {
                    gbn gbnVar = f4eVar.i;
                    if (gbnVar == null) {
                        Intrinsics.n("imageService");
                        throw null;
                    }
                    gbnVar.e(str2, combText.getCardView(), R.drawable.icon_default, R.drawable.icon_default);
                } else {
                    combText.getCardView().setImageResource(R.drawable.icon_default);
                }
                combText.setCardIconVisible(true);
            } else {
                if (oviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                CombText combText2 = oviVar.y;
                combText2.setLabelText(sn5.c(combText2, R.string.page_payment__select_a_bank, new Object[0]));
                combText2.setLabelTextColor(combText2.getContext().getColor(R.color.text_type1_secondary));
                combText2.setCardIconVisible(false);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$5", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<AssetData.AccountsBean, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = f4e.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetData.AccountsBean accountsBean, v1b<? super Unit> v1bVar) {
            return ((e) create(accountsBean, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ovi oviVar = f4e.this.g0;
            if (oviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oviVar.b.B = accountsBean != null;
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$6", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = f4e.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((f) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ovi oviVar = f4e.this.g0;
            if (oviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            CombEditText combEditText = oviVar.b;
            if (!Intrinsics.g(combEditText.getText(), str)) {
                combEditText.setText(str);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOtherBanksFragment$initTradingViewModel$1$7", f = "DepositOtherBanksFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<lk50<? extends List<? extends vt60>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = f4e.this.new g(v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends vt60>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((g) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            if (cVar == null || (list = (List) cVar.a) == null) {
                list = m2g.a;
            }
            f4e f4eVar = f4e.this;
            ovi oviVar = f4eVar.g0;
            if (oviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oviVar.y.setEnabled(!list.isEmpty());
            ovi oviVar2 = f4eVar.g0;
            if (oviVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            oviVar2.b.setEnabled(!list.isEmpty());
            boolean zContains = list.contains(vt60.d);
            ovi oviVar3 = f4eVar.g0;
            if (zContains) {
                if (oviVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oviVar3.J.setVisibility(0);
            } else {
                if (oviVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                oviVar3.J.setVisibility(8);
            }
            return Unit.a;
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return f4e.this.requireActivity().getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return f4e.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class j extends qlr implements Function0<r8i0.c> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return f4e.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f4e() {
        super(1);
        this.f0 = new q8i0(jq40.a(f5e.class), new h(), new j(), new i());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.C;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        ovi oviVar = this.g0;
        if (oviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = oviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.I;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        f5e f5eVarP0 = P0();
        g1i g1iVar = new g1i(f5eVarP0.w0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        n1i n1iVar = new n1i(f5eVarP0.Y, f5eVarP0.K0, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(n1iVar, lifecycle2, bVar);
        g1i g1iVar2 = new g1i(f5eVarP0.L0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar2, lifecycle3, bVar);
        g1i g1iVar3 = new g1i(f5eVarP0.B0, new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar3, lifecycle4, bVar);
        g1i g1iVar4 = new g1i(f5eVarP0.z0, new e(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar4, lifecycle5, bVar);
        g1i g1iVar5 = new g1i(f5eVarP0.F0, new f(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar5, lifecycle6, bVar);
        g1i g1iVar6 = new g1i(f5eVarP0.I0, new g(null));
        s9s lifecycle7 = getLifecycle();
        lifecycle7.getClass();
        arr.a(g1iVar6, lifecycle7, bVar);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        ovi oviVar = this.g0;
        if (oviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(oviVar.E);
        ovi oviVar2 = this.g0;
        if (oviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oviVar2.G.setOnClickListener(new View.OnClickListener() { // from class: y3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f4e f4eVar = this.a;
                f5e f5eVarP0 = f4eVar.P0();
                ej5.c(o8i0.d(f5eVarP0), null, null, new l4e(f5eVarP0, null), 3);
                ovi oviVar3 = f4eVar.g0;
                if (oviVar3 != null) {
                    c8i0.g(oviVar3.d);
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
        });
        ovi oviVar3 = this.g0;
        if (oviVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oviVar3.d.setErrorView(oviVar3.f);
        ovi oviVar4 = this.g0;
        if (oviVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(oviVar4.E);
        ovi oviVar5 = this.g0;
        if (oviVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CombText combText = oviVar5.y;
        combText.setLabelImage(R.drawable.bankname);
        combText.setClearIcon(iwh0.a(combText.getContext(), R.drawable.ic_keyboard_arrow_right_black_24dp, combText.getContext().getColor(R.color.text_type1_primary)));
        combText.setCardIconVisible(false);
        ovi oviVar6 = this.g0;
        if (oviVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        combText.setErrorView(oviVar6.z);
        combText.setOnClickListener(new View.OnClickListener() { // from class: z3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<jw1> list;
                view.getClass();
                lop.b(view, Boolean.FALSE);
                f5e f5eVarP0 = this.a.P0();
                Object value = f5eVarP0.x0.a.getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                if (cVar == null || (list = (List) cVar.a) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (jw1 jw1Var : list) {
                    jw1 jw1Var2 = (jw1) f5eVarP0.B0.getValue();
                    arrayList.add(coe0.a(jw1Var, jw1Var2 != null ? Integer.valueOf(jw1Var2.a) : null));
                }
                wwd0 wwd0Var = f5eVarP0.U;
                wne0 wne0Var = new wne0(14, arrayList);
                wwd0Var.getClass();
                wwd0Var.k(null, wne0Var);
                ku90<spg0> ku90Var = f5eVarP0.v;
                int i2 = vpg0.a;
                ku90Var.getClass();
                ku90Var.a(new spg0.m(false));
            }
        });
        ovi oviVar7 = this.g0;
        if (oviVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CombEditText combEditText = oviVar7.b;
        combEditText.setLabelImage(R.drawable.ic_account_box_black_24px);
        combEditText.setLabelText(sn5.c(combEditText, R.string.page_payment__account_number, new Object[0]));
        ovi oviVar8 = this.g0;
        if (oviVar8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        combEditText.setErrorView(oviVar8.c);
        combEditText.setTextChangedListener(new CombEditText.d() { // from class: a4e
            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
            public final void l(CharSequence charSequence) {
                String string = StringsKt.t0(charSequence.toString()).toString();
                f5e f5eVarP0 = this.a.P0();
                string.getClass();
                wwd0 wwd0Var = f5eVarP0.E0;
                wwd0Var.getClass();
                wwd0Var.k(null, string);
            }
        });
        combEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        CountryCodeName countryCodeName = P0().u0.a;
        int[] iArr = a300.g.a.a;
        int i2 = iArr[countryCodeName.ordinal()];
        combEditText.setEditHint(sn5.c(combEditText, R.string.page_payment__vnum_digits, String.valueOf(10)));
        int i3 = iArr[P0().u0.a.ordinal()];
        combEditText.setMaxLength(10);
        combEditText.setClearListener(new CombEditText.c() { // from class: b4e
            @Override // com.sporty.android.common_ui.widgets.CombEditText.c
            public final void a() {
                f5e f5eVarP0 = this.a.P0();
                if (f5eVarP0.y0.getValue() != null) {
                    f5eVarP0.N1();
                }
            }
        });
        ovi oviVar9 = this.g0;
        if (oviVar9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oviVar9.d.setErrorView(oviVar9.f);
        ovi oviVar10 = this.g0;
        if (oviVar10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        oviVar10.G.setOnClickListener(new View.OnClickListener() { // from class: c4e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                f5e f5eVarP0 = this.a.P0();
                ej5.c(o8i0.d(f5eVarP0), null, null, new l4e(f5eVarP0, null), 3);
            }
        });
        oviVar10.J.setOnClickListener(new View.OnClickListener() { // from class: d4e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List list;
                view.getClass();
                lop.b(view, Boolean.FALSE);
                f5e f5eVarP0 = this.a.P0();
                Object value = ((uwd0) f5eVarP0.D0.getValue()).getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                if (cVar == null || (list = (List) cVar.a) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(coe0.b((AssetData.AccountsBean) it.next(), (AssetData.AccountsBean) f5eVarP0.y0.getValue()));
                }
                wwd0 wwd0Var = f5eVarP0.U;
                wne0 wne0Var = new wne0(arrayList, false, true, false);
                wwd0Var.getClass();
                wwd0Var.k(null, wne0Var);
                ku90<spg0> ku90Var = f5eVarP0.v;
                int i4 = vpg0.a;
                ku90Var.getClass();
                ku90Var.a(new spg0.m(false));
            }
        });
    }

    @Override // defpackage.g02
    public final ComposeView O0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.A;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.g02
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final f5e P0() {
        return (f5e) this.f0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return kotlin.collections.a.c(oviVar.d);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return kotlin.collections.a.c(oviVar.e);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.i;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_other_banks, viewGroup, false);
        int i2 = R.id.account;
        CombEditText combEditText = (CombEditText) h5e.a(R.id.account, viewInflate);
        if (combEditText != null) {
            i2 = R.id.account_warning;
            TextView textView = (TextView) h5e.a(R.id.account_warning, viewInflate);
            if (textView != null) {
                i2 = R.id.amount;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
                if (clearEditText != null) {
                    i2 = R.id.amount_container;
                    if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                        i2 = R.id.amount_label;
                        TextView textView2 = (TextView) h5e.a(R.id.amount_label, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.amount_warning;
                            TextView textView3 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                            if (textView3 != null) {
                                i2 = R.id.anti_interaction_mask;
                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
                                if (frameLayout != null) {
                                    i2 = R.id.balance;
                                    TextView textView4 = (TextView) h5e.a(R.id.balance, viewInflate);
                                    if (textView4 != null) {
                                        i2 = R.id.balance_label;
                                        TextView textView5 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                        if (textView5 != null) {
                                            i2 = R.id.bank;
                                            CombText combText = (CombText) h5e.a(R.id.bank, viewInflate);
                                            if (combText != null) {
                                                i2 = R.id.bank_warning;
                                                TextView textView6 = (TextView) h5e.a(R.id.bank_warning, viewInflate);
                                                if (textView6 != null) {
                                                    i2 = R.id.deposit_banner_compose_view;
                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, viewInflate);
                                                    if (composeView != null) {
                                                        i2 = R.id.description_list_view;
                                                        SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                                        if (simpleDescriptionListView != null) {
                                                            i2 = R.id.hint_view;
                                                            HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                                            if (hintView != null) {
                                                                i2 = R.id.init_failed_mask;
                                                                LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                                if (loadingViewNew != null) {
                                                                    i2 = R.id.init_mask;
                                                                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                    if (composeView2 != null) {
                                                                        i2 = R.id.loading_mask;
                                                                        LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                        if (loadingViewNew2 != null) {
                                                                            i2 = R.id.next;
                                                                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                            if (progressButton != null) {
                                                                                i2 = R.id.secondary_hint_view;
                                                                                HintView hintView2 = (HintView) h5e.a(R.id.secondary_hint_view, viewInflate);
                                                                                if (hintView2 != null) {
                                                                                    i2 = R.id.swipe;
                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                    if (swipeRefreshLayout != null) {
                                                                                        i2 = R.id.switch_container;
                                                                                        FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.switch_container, viewInflate);
                                                                                        if (frameLayout2 != null) {
                                                                                            FrameLayout frameLayout3 = (FrameLayout) viewInflate;
                                                                                            this.g0 = new ovi(frameLayout3, combEditText, textView, clearEditText, textView2, textView3, frameLayout, textView4, textView5, combText, textView6, composeView, simpleDescriptionListView, hintView, loadingViewNew, composeView2, loadingViewNew2, progressButton, hintView2, swipeRefreshLayout, frameLayout2);
                                                                                            frameLayout3.getClass();
                                                                                            return frameLayout3;
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
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        g1i g1iVar = new g1i(H0().e, new e4e(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return kotlin.collections.a.c(oviVar.w);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return kotlin.collections.a.c(oviVar.v);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.B;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.D;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.E;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        ovi oviVar = this.g0;
        if (oviVar != null) {
            return oviVar.F;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
