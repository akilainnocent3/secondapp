package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.DigitsKeyListener;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.common_ui.widgets.CombText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyhf;", "Lj82;", "Ljsa$b;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yhf extends j82 implements jsa.b {
    public pvi X;
    public final q8i0 Y;

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$10", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = yhf.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yhf yhfVar = yhf.this;
            pvi pviVar = yhfVar.X;
            if (pviVar != null) {
                pviVar.i.setHint(sn5.d(yhfVar, R.string.page_payment__min_vnum, str));
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$1", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<jw1, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = yhf.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jw1 jw1Var, v1b<? super Unit> v1bVar) {
            return ((b) create(jw1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jw1 jw1Var = (jw1) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yhf yhfVar = yhf.this;
            pvi pviVar = yhfVar.X;
            if (jw1Var != null) {
                if (pviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                CombText combText = pviVar.B;
                combText.setLabelTextColor(combText.getContext().getColor(R.color.text_type1_primary));
                String str = jw1Var.c;
                if (str != null) {
                    combText.setLabelText(str);
                }
                String str2 = jw1Var.d;
                if (str2 != null) {
                    gbn gbnVar = yhfVar.i;
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
                if (pviVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                CombText combText2 = pviVar.B;
                combText2.setLabelText(sn5.c(combText2, R.string.page_payment__select_a_bank, new Object[0]));
                combText2.setLabelTextColor(combText2.getContext().getColor(R.color.text_type1_secondary));
                combText2.setCardIconVisible(false);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$2", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<AssetData.AccountsBean, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = yhf.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetData.AccountsBean accountsBean, v1b<? super Unit> v1bVar) {
            return ((c) create(accountsBean, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AssetData.AccountsBean accountsBean = (AssetData.AccountsBean) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            pvi pviVar = yhf.this.X;
            if (pviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            pviVar.b.B = accountsBean != null;
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$3", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = yhf.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((d) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            pvi pviVar = yhf.this.X;
            if (pviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            CombEditText combEditText = pviVar.b;
            if (!Intrinsics.g(combEditText.getText(), str)) {
                combEditText.setText(str);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$4", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<lk50<? extends List<? extends AssetData.AccountsBean>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = yhf.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends AssetData.AccountsBean>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
            boolean z = (cVar == null || (list = (List) cVar.a) == null) ? false : !list.isEmpty();
            pvi pviVar = yhf.this.X;
            if (pviVar != null) {
                pviVar.K.setVisibility(z ? 0 : 8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$5", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = yhf.this.new f(v1bVar);
            fVar.a = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((f) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yhf yhfVar = yhf.this;
            pvi pviVar = yhfVar.X;
            if (pviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            c8i0.o(pviVar.c, z);
            pvi pviVar2 = yhfVar.X;
            if (pviVar2 != null) {
                c8i0.o(pviVar2.d, z);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$6", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = yhf.this.new g(v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
            return ((g) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c330 c330Var = (c330) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            pvi pviVar = yhf.this.X;
            if (pviVar != null) {
                b330.a(pviVar.I, c330Var);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$7", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = yhf.this.new h(v1bVar);
            hVar.a = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
            return ((h) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            tzs tzsVar = (tzs) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            pvi pviVar = yhf.this.X;
            if (pviVar != null) {
                pviVar.I.setLoading(tzsVar instanceof tzs.b);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$8", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            i iVar = yhf.this.new i(v1bVar);
            iVar.a = ((Boolean) obj).booleanValue();
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((i) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yhf yhfVar = yhf.this;
            pvi pviVar = yhfVar.X;
            if (pviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            pviVar.B.setEnabled(z);
            pvi pviVar2 = yhfVar.X;
            if (pviVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            pviVar2.B.setClearIconVisible(z);
            pvi pviVar3 = yhfVar.X;
            if (pviVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            pviVar3.b.setEnabled(z);
            pvi pviVar4 = yhfVar.X;
            if (pviVar4 != null) {
                pviVar4.b.setClearIconVisible(z);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.ozow.withdraw.EFTWithdrawFragment$initTradingViewModel$1$9", f = "EFTWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends tje0 implements Function2<jo50, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public j(v1b<? super j> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            j jVar = yhf.this.new j(v1bVar);
            jVar.a = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jo50 jo50Var, v1b<? super Unit> v1bVar) {
            return ((j) create(jo50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jo50 jo50Var = (jo50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yhf yhfVar = yhf.this;
            pvi pviVar = yhfVar.X;
            if (pviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = pviVar.e;
            CombEditText combEditText = pviVar.b;
            pviVar.B.setEnabled(!jo50Var.a);
            combEditText.setEnabled(true);
            if (jo50Var.a) {
                combEditText.setClearIconVisible(true);
                combEditText.setWarning(sn5.d(yhfVar, R.string.page_withdraw__ensure_account_number_is_correct, new Object[0]));
                textView.setTextColor(yhfVar.requireContext().getColor(R.color.bg_warning_primary));
            } else {
                combEditText.setError(null);
                textView.setTextColor(yhfVar.requireContext().getColor(R.color.text_danger));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class k extends qlr implements Function0<Fragment> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return yhf.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class l extends qlr implements Function0<w8i0> {
        public final /* synthetic */ k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class m extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class n extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class o extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? yhf.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public yhf() {
        super(R.layout.fragment_eft_withdraw);
        ttr ttrVarA = hwr.a(a1s.c, new l(new k()));
        this.Y = new q8i0(jq40.a(sif.class), new m(ttrVarA), new o(ttrVarA), new n(ttrVarA));
    }

    @Override // defpackage.s62
    public final HintView D0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.f;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        pvi pviVar = this.X;
        if (pviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = pviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.J;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82, defpackage.s62
    public final void L0() {
        super.L0();
        pvi pviVar = this.X;
        if (pviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(pviVar.F);
        pvi pviVar2 = this.X;
        if (pviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CombText combText = pviVar2.B;
        combText.setLabelImage(R.drawable.bankname);
        combText.setClearIcon(iwh0.a(combText.getContext(), R.drawable.ic_keyboard_arrow_right_black_24dp, combText.getContext().getColor(R.color.text_type1_primary)));
        combText.setCardIconVisible(false);
        pvi pviVar3 = this.X;
        if (pviVar3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        combText.setErrorView(pviVar3.C);
        combText.setOnClickListener(new View.OnClickListener() { // from class: rhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<jw1> list;
                view.getClass();
                lop.b(view, Boolean.FALSE);
                sif sifVarP0 = this.a.P0();
                Object value = sifVarP0.u0.a.getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                if (cVar == null || (list = (List) cVar.a) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (jw1 jw1Var : list) {
                    jw1 jw1Var2 = (jw1) sifVarP0.y0.a.getValue();
                    arrayList.add(coe0.a(jw1Var, jw1Var2 != null ? Integer.valueOf(jw1Var2.a) : null));
                }
                ArrayList arrayList2 = new ArrayList();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        if (Intrinsics.g(((aoe0.a) obj).d, Boolean.TRUE)) {
                            StringUiText stringUiText = vch0.a;
                            arrayList2.add(new aoe0.f("mostPopularLabel", false, false, new ResourceUiText(R.string.live__most_popular)));
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj2 = arrayList.get(i4);
                                i4++;
                                if (Intrinsics.g(((aoe0.a) obj2).d, Boolean.TRUE)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList2.addAll(arrayList3);
                            arrayList2.add(new aoe0.f("allBanksLabel", false, false, new StringUiText("All Banks")));
                            ArrayList arrayList4 = new ArrayList();
                            int size3 = arrayList.size();
                            while (i2 < size3) {
                                Object obj3 = arrayList.get(i2);
                                i2++;
                                if (Intrinsics.g(((aoe0.a) obj3).d, Boolean.FALSE)) {
                                    arrayList4.add(obj3);
                                }
                            }
                            arrayList2.addAll(arrayList4);
                            arrayList = arrayList2;
                            break;
                        }
                    }
                }
                wwd0 wwd0Var = sifVarP0.U;
                wne0 wne0Var = new wne0(14, arrayList);
                wwd0Var.getClass();
                wwd0Var.k(null, wne0Var);
                ku90<spg0> ku90Var = sifVarP0.v;
                int i5 = vpg0.a;
                ku90Var.getClass();
                ku90Var.a(new spg0.m(true));
            }
        });
        pvi pviVar4 = this.X;
        if (pviVar4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        CombEditText combEditText = pviVar4.b;
        combEditText.setLabelImage(R.drawable.ic_account_box_black_24px);
        int i2 = 1;
        combEditText.setHintVisibleOnly(true);
        combEditText.setEditHint(sn5.c(combEditText, R.string.page_withdraw__enter_bank_account_number, new Object[0]));
        combEditText.getEditView().setTypeface(Typeface.DEFAULT);
        pvi pviVar5 = this.X;
        if (pviVar5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        combEditText.setErrorView(pviVar5.e);
        combEditText.setTextChangedListener(new CombEditText.d() { // from class: shf
            @Override // com.sporty.android.common_ui.widgets.CombEditText.d
            public final void l(CharSequence charSequence) {
                String string = StringsKt.t0(charSequence.toString()).toString();
                sif sifVarP0 = this.a.P0();
                string.getClass();
                wwd0 wwd0Var = sifVarP0.F0;
                wwd0Var.getClass();
                wwd0Var.k(null, string);
            }
        });
        combEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        combEditText.setMaxLength(P0().r0.n());
        combEditText.setClearListener(new thf(this));
        pvi pviVar6 = this.X;
        if (pviVar6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        pviVar6.i.setErrorView(pviVar6.w);
        final pvi pviVar7 = this.X;
        if (pviVar7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        pviVar7.c.setContent(new op8(-2013978035, new px6(this, i2), true));
        pviVar7.I.setOnClickListener(new View.OnClickListener() { // from class: uhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                view.getClass();
                lop.b(view, Boolean.FALSE);
                pvi pviVar8 = pviVar7;
                pviVar8.b.setError(null);
                pviVar8.b.clearFocus();
                sif sifVarP0 = this.P0();
                ej5.c(o8i0.d(sifVarP0), null, null, new ckj0(sifVarP0, null), 3);
            }
        });
        pviVar7.K.setOnClickListener(new View.OnClickListener() { // from class: vhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List list;
                view.getClass();
                lop.b(view, Boolean.FALSE);
                sif sifVarP0 = this.a.P0();
                wwd0 wwd0Var = sifVarP0.K0;
                lk50<List<AssetData.AccountsBean>> value = sifVarP0.O1().getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                if (cVar == null || (list = (List) cVar.a) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(coe0.b((AssetData.AccountsBean) it.next(), (AssetData.AccountsBean) sifVarP0.v0.getValue()));
                }
                boolean z = ((rij0) wwd0Var.getValue()).g;
                wwd0 wwd0Var2 = sifVarP0.U;
                wne0 wne0Var = new wne0(arrayList, false, z, false);
                wwd0Var2.getClass();
                wwd0Var2.k(null, wne0Var);
                ku90<spg0> ku90Var = sifVarP0.v;
                StringUiText stringUiText = vch0.a;
                ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__choose_bank_account);
                ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__add_a_new_account);
                hqx hqxVar = new hqx(new ResourceUiText(R.string.page_payment__default_function_available_now), new ResourceUiText(R.string.page_payment__set_default_account_feature_hint_content));
                boolean z2 = ((rij0) wwd0Var.getValue()).f;
                int i3 = vpg0.a;
                ku90Var.getClass();
                ku90Var.a(new spg0.n(resourceUiText, resourceUiText2, z2, hqxVar));
            }
        });
    }

    @Override // defpackage.j82
    public final TextView O0() {
        return null;
    }

    @Override // defpackage.j82
    public final TextView P0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.M;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final TextView Q0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.N;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final View R0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.O;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.j82
    public final void S0() {
        String str;
        String strA;
        jw1 jw1Var = (jw1) P0().y0.a.getValue();
        if (jw1Var == null || (str = jw1Var.c) == null) {
            str = "";
        }
        String str2 = str;
        String str3 = (String) P0().G0.getValue();
        if (str3 == null || (strA = fu5.a("\\d(?=\\d{4})", str3, "*")) == null) {
            strA = "--";
        }
        String str4 = strA;
        pvi pviVar = this.X;
        if (pviVar != null) {
            jsa.a.a(r700.b, str2, String.valueOf(pviVar.i.getText()), str4, (String) P0().g1.getValue(), h400.OZOW, this).show(getChildFragmentManager(), "ConfirmAmountDialogFragment");
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.j82
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public final sif P0() {
        return (sif) this.Y.getValue();
    }

    public final void V0(final HintView hintView, final KYCReminder kYCReminder, String str, String str2, HintView.a aVar, View.OnClickListener onClickListener) {
        hintView.setVisibility(0);
        String str3 = str + " " + str2;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new UnderlineSpan(), str.length() + 1, str3.length(), 0);
        hintView.setHint(spannableString);
        hintView.setTypeColor(aVar);
        hintView.setOnClickListener(onClickListener);
        hintView.setOnCloseCLickListener(new View.OnClickListener() { // from class: whf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yhf yhfVar = this.a;
                sif sifVarP0 = yhfVar.P0();
                Context contextRequireContext = yhfVar.requireContext();
                contextRequireContext.getClass();
                cup cupVar = sifVarP0.X0;
                cupVar.getClass();
                vn20.f(contextRequireContext, "kyc_reminder", cupVar.a(kYCReminder), true, true);
                hintView.setVisibility(8);
            }
        });
    }

    @Override // jsa.b
    public final void h() {
        ((xlj0) this.W.getValue()).i.a(Unit.a);
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return kotlin.collections.a.c(pviVar.i);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return kotlin.collections.a.c(pviVar.v);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.y;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        h400 h400Var;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i2 = arguments.getInt("CHANNEL_ID");
            sif sifVarP0 = P0();
            sifVarP0.h1 = i2;
            c100 c100Var = c100.e;
            if (i2 == 27003) {
                h400Var = h400.PEACH;
            } else {
                h400Var = i2 == 29007 ? h400.WALLET_DOC : h400.OZOW;
            }
            sifVarP0.i1 = h400Var;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_eft_withdraw, viewGroup, false);
        int i2 = R.id.account;
        CombEditText combEditText = (CombEditText) h5e.a(R.id.account, viewInflate);
        if (combEditText != null) {
            i2 = R.id.account_label;
            if (((TextView) h5e.a(R.id.account_label, viewInflate)) != null) {
                i2 = R.id.account_type_compose_view;
                ComposeView composeView = (ComposeView) h5e.a(R.id.account_type_compose_view, viewInflate);
                if (composeView != null) {
                    i2 = R.id.account_type_label;
                    TextView textView = (TextView) h5e.a(R.id.account_type_label, viewInflate);
                    if (textView != null) {
                        i2 = R.id.account_warning;
                        TextView textView2 = (TextView) h5e.a(R.id.account_warning, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.alert_hint_view;
                            HintView hintView = (HintView) h5e.a(R.id.alert_hint_view, viewInflate);
                            if (hintView != null) {
                                i2 = R.id.amount;
                                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
                                if (clearEditText != null) {
                                    i2 = R.id.amount_container;
                                    if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                                        i2 = R.id.amount_label;
                                        TextView textView3 = (TextView) h5e.a(R.id.amount_label, viewInflate);
                                        if (textView3 != null) {
                                            i2 = R.id.amount_warning;
                                            TextView textView4 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                                            if (textView4 != null) {
                                                i2 = R.id.anti_interaction_mask;
                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
                                                if (frameLayout != null) {
                                                    i2 = R.id.balance;
                                                    TextView textView5 = (TextView) h5e.a(R.id.balance, viewInflate);
                                                    if (textView5 != null) {
                                                        i2 = R.id.balance_label;
                                                        TextView textView6 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                                        if (textView6 != null) {
                                                            i2 = R.id.bank;
                                                            CombText combText = (CombText) h5e.a(R.id.bank, viewInflate);
                                                            if (combText != null) {
                                                                i2 = R.id.bank_label;
                                                                if (((TextView) h5e.a(R.id.bank_label, viewInflate)) != null) {
                                                                    i2 = R.id.bank_warning;
                                                                    TextView textView7 = (TextView) h5e.a(R.id.bank_warning, viewInflate);
                                                                    if (textView7 != null) {
                                                                        i2 = R.id.description_list_view;
                                                                        SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                                                                        if (simpleDescriptionListView != null) {
                                                                            i2 = R.id.init_failed_mask;
                                                                            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                                            if (loadingViewNew != null) {
                                                                                i2 = R.id.init_mask;
                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                                if (composeView2 != null) {
                                                                                    i2 = R.id.kyc_reminder_hint_view;
                                                                                    HintView hintView2 = (HintView) h5e.a(R.id.kyc_reminder_hint_view, viewInflate);
                                                                                    if (hintView2 != null) {
                                                                                        i2 = R.id.loading_mask;
                                                                                        LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                                                        if (loadingViewNew2 != null) {
                                                                                            i2 = R.id.next;
                                                                                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                            if (progressButton != null) {
                                                                                                i2 = R.id.swipe;
                                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                                if (swipeRefreshLayout != null) {
                                                                                                    i2 = R.id.switch_container;
                                                                                                    FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.switch_container, viewInflate);
                                                                                                    if (frameLayout2 != null) {
                                                                                                        i2 = R.id.withdraw_hint_view;
                                                                                                        HintView hintView3 = (HintView) h5e.a(R.id.withdraw_hint_view, viewInflate);
                                                                                                        if (hintView3 != null) {
                                                                                                            i2 = R.id.withdrawable_balance;
                                                                                                            TextView textView8 = (TextView) h5e.a(R.id.withdrawable_balance, viewInflate);
                                                                                                            if (textView8 != null) {
                                                                                                                i2 = R.id.withdrawable_balance_label;
                                                                                                                TextView textView9 = (TextView) h5e.a(R.id.withdrawable_balance_label, viewInflate);
                                                                                                                if (textView9 != null) {
                                                                                                                    i2 = R.id.withdrawable_help;
                                                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.withdrawable_help, viewInflate);
                                                                                                                    if (appCompatImageView != null) {
                                                                                                                        FrameLayout frameLayout3 = (FrameLayout) viewInflate;
                                                                                                                        this.X = new pvi(frameLayout3, combEditText, composeView, textView, textView2, hintView, clearEditText, textView3, textView4, frameLayout, textView5, textView6, combText, textView7, simpleDescriptionListView, loadingViewNew, composeView2, hintView2, loadingViewNew2, progressButton, swipeRefreshLayout, frameLayout2, hintView3, textView8, textView9, appCompatImageView);
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

    @Override // defpackage.j82, defpackage.s62, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        g1i g1iVar = new g1i(H0().e, new xhf(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        L0();
        P0().D1();
        qpg0 qpg0VarI0 = I0();
        qpg0VarI0.f = log0.b;
        qpg0VarI0.x1();
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return kotlin.collections.a.c(pviVar.A);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return kotlin.collections.a.c(pviVar.z);
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.E;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.F;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.H;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        pvi pviVar = this.X;
        if (pviVar != null) {
            return pviVar.D;
        }
        Intrinsics.n(ACKxwYRsuWyGz.ergzLEgtXh);
        throw null;
    }

    @Override // defpackage.j82, defpackage.s62
    public final void K0() {
        super.K0();
        sif sifVarP0 = P0();
        g1i g1iVar = new g1i(sifVarP0.y0, new b(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(sifVarP0.w0, new c(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(sifVarP0.G0, new d(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(sifVarP0.O1(), new e(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(sifVarP0.C0, new f(null));
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        g1i g1iVar6 = new g1i(sifVarP0.t0, new g(null));
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        arr.a(g1iVar6, lifecycle6, bVar);
        g1i g1iVar7 = new g1i(sifVarP0.H, new h(null));
        s9s lifecycle7 = getLifecycle();
        lifecycle7.getClass();
        arr.a(g1iVar7, lifecycle7, bVar);
        g1i g1iVar8 = new g1i(sifVarP0.Z0, new i(null));
        s9s lifecycle8 = getLifecycle();
        lifecycle8.getClass();
        arr.a(g1iVar8, lifecycle8, bVar);
        g1i g1iVar9 = new g1i(sifVarP0.b1, new j(null));
        s9s lifecycle9 = getLifecycle();
        lifecycle9.getClass();
        arr.a(g1iVar9, lifecycle9, bVar);
        pvi pviVar = this.X;
        if (pviVar != null) {
            TextView textView = pviVar.L.getTextView();
            hu1.b(sn5.d(this, R.string.page_withdraw__can_only_withdraw_to_account_with_same_name, new Object[0]), vZBMKENANSz.eBRDnsmSLZgCxM, (String) sifVarP0.g1.getValue(), textView);
            g1i g1iVar10 = new g1i(new f1i(sifVarP0.f1), new a(null));
            s9s lifecycle10 = getLifecycle();
            lifecycle10.getClass();
            arr.a(g1iVar10, lifecycle10, bVar);
            g1i g1iVar11 = new g1i(new zhf(P0().d1), new eif(this, null));
            s9s lifecycle11 = getLifecycle();
            lifecycle11.getClass();
            arr.a(g1iVar11, lifecycle11, bVar);
            return;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
