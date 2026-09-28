package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import com.sportybet.feature.payment.impl.deposit.presentation.adapter.DepositOthersAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp5e;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class p5e extends spl {
    public lyi f0;
    public final q8i0 g0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositOthersFragment$initTradingViewModel$1$1", f = "DepositOthersFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<List<? extends r5e>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ s5e c;

        /* JADX INFO: renamed from: p5e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0963a extends pf implements Function1<String, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                String str2 = str;
                str2.getClass();
                azm.c((azm) this.a, str2, null, null, 6);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s5e s5eVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = s5eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = p5e.this.new a(this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends r5e> list, v1b<? super Unit> v1bVar) {
            return ((a) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            g4z g4zVar;
            g4z g4zVar2;
            g4z g4zVar3;
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            uqm uqmVar = this.c.l0;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                int i = 0;
                p5e p5eVar = p5e.this;
                if (!zHasNext) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    lyi lyiVar = p5eVar.f0;
                    if (lyiVar != null) {
                        lyiVar.v.setAdapter(new DepositOthersAdapter(arrayList2, new o5e(p5eVar, i), new cc0(p5eVar, 2), new C0963a(1, p5eVar.F0(), azm.class, "open", "open(Ljava/lang/String;Landroid/os/Bundle;Lcom/sportybet/android/router/Sender;)Z", 8)));
                        return Unit.a;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
                int i2 = 1;
                switch (((r5e) it.next()).ordinal()) {
                    case 0:
                        Context contextRequireContext = p5eVar.requireContext();
                        contextRequireContext.getClass();
                        StringUiText stringUiText = vch0.a;
                        g4zVar = new g4z(new ResourceUiText(R.string.common_payment_providers__opay), "https://s.sporty.net/cms/ic_opay_circle_light_95917dd165.png");
                        f4z f4zVar = new f4z(new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_opay_sub_title__NG));
                        f4zVar.b.add(z3z.a(contextRequireContext));
                        g4zVar.c.add(f4zVar);
                        g4zVar3 = g4zVar;
                        arrayList.add(g4zVar3);
                        break;
                    case 1:
                        Context contextRequireContext2 = p5eVar.requireContext();
                        contextRequireContext2.getClass();
                        StringUiText stringUiText2 = vch0.a;
                        g4zVar = new g4z(new ResourceUiText(R.string.common_payment_providers__palmpay__NG), "https://s.sporty.net/cms/ic_palmpay_circle_light_6d5b9d61fe.png");
                        f4z f4zVar2 = new f4z(new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_palmpay_sub_title__NG));
                        f4zVar2.b.add(a4z.a(contextRequireContext2));
                        g4zVar.c.add(f4zVar2);
                        g4zVar3 = g4zVar;
                        arrayList.add(g4zVar3);
                        break;
                    case 2:
                        Context contextRequireContext3 = p5eVar.requireContext();
                        contextRequireContext3.getClass();
                        StringUiText stringUiText3 = vch0.a;
                        g4zVar = new g4z(new ResourceUiText(R.string.common_payment_providers__kuda_bank_title_long__NG), "https://s.sporty.net/cms/ic_kuda_circle_light_3a61e21116.png");
                        f4z f4zVarA = y3z.a(contextRequireContext3, false);
                        ArrayList arrayList3 = g4zVar.c;
                        arrayList3.add(f4zVarA);
                        arrayList3.add(y3z.a(contextRequireContext3, true));
                        g4zVar3 = g4zVar;
                        arrayList.add(g4zVar3);
                        break;
                    case 3:
                        Context contextRequireContext4 = p5eVar.requireContext();
                        contextRequireContext4.getClass();
                        Account account = uqmVar.getAccount();
                        String str = account != null ? account.name : null;
                        jh5 jh5Var = new jh5(p5eVar, i2);
                        StringUiText stringUiText4 = vch0.a;
                        g4zVar2 = new g4z(new ResourceUiText(R.string.common_payment_providers__gtbank), "https://s.sporty.net/cms/ic_gt_circle_light_d5ceec7cbf.png");
                        f4z f4zVarB = w3z.b(contextRequireContext4, mal.a, str, jh5Var);
                        ArrayList arrayList4 = g4zVar2.c;
                        arrayList4.add(f4zVarB);
                        arrayList4.add(w3z.b(contextRequireContext4, mal.b, str, jh5Var));
                        arrayList4.add(w3z.b(contextRequireContext4, mal.c, str, jh5Var));
                        g4zVar3 = g4zVar2;
                        arrayList.add(g4zVar3);
                        break;
                    case 4:
                        Context contextRequireContext5 = p5eVar.requireContext();
                        contextRequireContext5.getClass();
                        kh5 kh5Var = new kh5(p5eVar, i2);
                        StringUiText stringUiText5 = vch0.a;
                        g4z g4zVar4 = new g4z(new ResourceUiText(R.string.common_payment_providers__zenith_bank), "https://s.sporty.net/cms/ic_zenith_circle_light_a222110be9.png");
                        f4z f4zVarB2 = j4z.b(contextRequireContext5, ack0.a, kh5Var);
                        ArrayList arrayList5 = g4zVar4.c;
                        arrayList5.add(f4zVarB2);
                        arrayList5.add(j4z.b(contextRequireContext5, ack0.b, kh5Var));
                        arrayList5.add(j4z.b(contextRequireContext5, ack0.c, kh5Var));
                        g4zVar3 = g4zVar4;
                        arrayList.add(g4zVar3);
                        break;
                    case 5:
                        Context contextRequireContext6 = p5eVar.requireContext();
                        contextRequireContext6.getClass();
                        StringUiText stringUiText6 = vch0.a;
                        g4zVar = new g4z(new ResourceUiText(R.string.common_payment_providers__access_bank), "https://s.sporty.net/cms/ic_accessbank_circle_light_90692723e7.png");
                        f4z f4zVarA2 = p3z.a(contextRequireContext6, false);
                        ArrayList arrayList6 = g4zVar.c;
                        arrayList6.add(f4zVarA2);
                        arrayList6.add(p3z.a(contextRequireContext6, true));
                        g4zVar3 = g4zVar;
                        arrayList.add(g4zVar3);
                        break;
                    case 6:
                        Context contextRequireContext7 = p5eVar.requireContext();
                        contextRequireContext7.getClass();
                        StringUiText stringUiText7 = vch0.a;
                        g4zVar = new g4z(new ResourceUiText(R.string.common_payment_providers__moniepoint), "https://s.sporty.net/cms/ic_moniepoint_circle_light_fc27fb6d08.png");
                        f4z f4zVar3 = new f4z(new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_moniepoint_sub_title__NG));
                        j7g j7gVar = new j7g();
                        j7gVar.m(new String[]{sn5.b(contextRequireContext7, R.string.common_payment_providers__deposit_with_moniepoint_content_1__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext7.getResources(), 15));
                        j7gVar.m(new String[]{sn5.b(contextRequireContext7, R.string.common_payment_providers__deposit_with_moniepoint_content_2__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext7.getResources(), 15));
                        j7gVar.m(new String[]{sn5.b(contextRequireContext7, R.string.common_payment_providers__deposit_with_moniepoint_content_3__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext7.getResources(), 15));
                        j7gVar.m(new String[]{sn5.b(contextRequireContext7, R.string.common_payment_providers__deposit_with_moniepoint_content_4__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext7.getResources(), 15));
                        j7gVar.m(new String[]{sn5.b(contextRequireContext7, R.string.common_payment_providers__deposit_with_moniepoint_content_5__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext7.getResources(), 15));
                        f4zVar3.b.add(new q3z(j7gVar, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                        g4zVar.c.add(f4zVar3);
                        g4zVar3 = g4zVar;
                        arrayList.add(g4zVar3);
                        break;
                    case 7:
                        Context contextRequireContext8 = p5eVar.requireContext();
                        contextRequireContext8.getClass();
                        StringUiText stringUiText8 = vch0.a;
                        g4zVar2 = new g4z(new ResourceUiText(R.string.common_payment_providers__fairmoney), "https://s.sporty.net/cms/ic_fairmoney_circle_light_e776b0259a.png");
                        f4z f4zVar4 = new f4z(new ResourceUiText(R.string.common_payment_providers__deposit_with_fairmoney_sub_title__NG));
                        j7g j7gVar2 = new j7g();
                        j7gVar2.m(new String[]{sn5.b(contextRequireContext8, R.string.common_payment_providers__deposit_with_fairmoney_content_v2_1__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext8.getResources(), 15));
                        j7gVar2.a("\n");
                        j7gVar2.m(new String[]{sn5.b(contextRequireContext8, R.string.common_payment_providers__deposit_with_fairmoney_content_v2_2__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext8.getResources(), 15));
                        j7gVar2.a("\n");
                        j7gVar2.m(new String[]{sn5.b(contextRequireContext8, R.string.common_payment_providers__deposit_with_fairmoney_content_v2_3__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext8.getResources(), 15));
                        j7gVar2.a("\n");
                        f4zVar4.b.add(new q3z(j7gVar2, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                        g4zVar2.c.add(f4zVar4);
                        g4zVar3 = g4zVar2;
                        arrayList.add(g4zVar3);
                        break;
                    case 8:
                        Context contextRequireContext9 = p5eVar.requireContext();
                        contextRequireContext9.getClass();
                        StringUiText stringUiText9 = vch0.a;
                        g4zVar2 = new g4z(new ResourceUiText(R.string.common_payment_providers__coralpay), "https://s.sporty.net/cms/ic_coralpay_circle_light_e0443fb8b6.png");
                        f4z f4zVar5 = new f4z(new ResourceUiText(R.string.common_payment_providers__ng_deposit_with_coralpay_sub_title__NG));
                        j7g j7gVar3 = new j7g();
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_1__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_2__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_3__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_4__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_5__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_6__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        j7gVar3.m(new String[]{sn5.b(contextRequireContext9, R.string.common_payment_providers__deposit_with_coralpay_content_7__NG, new Object[0])}, new boolean[]{false}, zch0.b(contextRequireContext9.getResources(), 15));
                        f4zVar5.b.add(new q3z(j7gVar3, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                        g4zVar2.c.add(f4zVar5);
                        g4zVar3 = g4zVar2;
                        arrayList.add(g4zVar3);
                        break;
                    case 9:
                        Account account2 = uqmVar.getAccount();
                        String str2 = account2 != null ? account2.name : null;
                        StringUiText stringUiText10 = vch0.a;
                        g4zVar3 = new g4z(new ResourceUiText(R.string.page_payment__quickteller), "https://s.sporty.net/cms/ic_quickteller_circle_light_4e1d63a0d4.png");
                        g4zVar3.c.add(new r3z(str2));
                        arrayList.add(g4zVar3);
                        break;
                    default:
                        uhc.a();
                        return null;
                }
            }
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return p5e.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return p5e.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return p5e.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public p5e() {
        super(1);
        this.g0 = new q8i0(jq40.a(s5e.class), new b(), new d(), new c());
    }

    @Override // defpackage.s62
    public final HintView D0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.d;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        lyi lyiVar = this.f0;
        if (lyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = lyiVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        return null;
    }

    @Override // defpackage.s62
    /* JADX INFO: renamed from: J0 */
    public final k72 P0() {
        return (s5e) this.g0.getValue();
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        s5e s5eVar = (s5e) this.g0.getValue();
        g1i g1iVar = new g1i(s5eVar.o0, new a(s5eVar, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.c);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        lyi lyiVar = this.f0;
        if (lyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView recyclerView = lyiVar.v;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    @Override // defpackage.g02
    public final m02 P0() {
        return (s5e) this.g0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.b;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        lyi lyiVarA = lyi.a(layoutInflater, viewGroup);
        this.f0 = lyiVarA;
        FrameLayout frameLayout = lyiVarA.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.c;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.f;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        lyi lyiVar = this.f0;
        if (lyiVar != null) {
            return lyiVar.i;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
