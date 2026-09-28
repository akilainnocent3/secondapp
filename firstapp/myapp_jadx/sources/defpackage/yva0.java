package defpackage;

import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lyva0;", "Lc000;", "<init>", "()V", "a", "Lwwa0;", "headerState", "Lyf40;", "bottomSheetState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yva0 extends k3m {
    public final String T;
    public final String U;
    public final ga00 V;
    public final Integer W;
    public final i6i0 X;
    public final q8i0 Y;
    public od9 Z;
    public azm a0;
    public final ee<s8d0> b0;
    public static final /* synthetic */ ohp<Object>[] d0 = {new d630(0, yva0.class, LxHElgWAiSeM.AYsDbF, "getBinding()Lcom/sportybet/android/databinding/FragmentSpeiByStpWithdrawBinding;")};
    public static final a c0 = new a();

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class b extends saj implements Function1<View, vxi> {
        public static final b a = new b(1, vxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentSpeiByStpWithdrawBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final vxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.amount;
            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, view2);
            if (clearEditText != null) {
                i = R.id.amount_container;
                if (((FrameLayout) h5e.a(R.id.amount_container, view2)) != null) {
                    i = R.id.amount_label;
                    TextView textView = (TextView) h5e.a(R.id.amount_label, view2);
                    if (textView != null) {
                        i = R.id.amount_warning;
                        TextView textView2 = (TextView) h5e.a(R.id.amount_warning, view2);
                        if (textView2 != null) {
                            i = R.id.balance;
                            TextView textView3 = (TextView) h5e.a(R.id.balance, view2);
                            if (textView3 != null) {
                                i = R.id.balance_label;
                                TextView textView4 = (TextView) h5e.a(R.id.balance_label, view2);
                                if (textView4 != null) {
                                    i = R.id.description_container;
                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.description_container, view2);
                                    if (linearLayout != null) {
                                        i = R.id.dialogs_compose_view;
                                        ComposeView composeView = (ComposeView) h5e.a(R.id.dialogs_compose_view, view2);
                                        if (composeView != null) {
                                            i = R.id.header_and_accounts_compose_view;
                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.header_and_accounts_compose_view, view2);
                                            if (composeView2 != null) {
                                                i = R.id.kyc_hint;
                                                TextView textView5 = (TextView) h5e.a(R.id.kyc_hint, view2);
                                                if (textView5 != null) {
                                                    i = R.id.scrollable_content;
                                                    if (((ScrollView) h5e.a(R.id.scrollable_content, view2)) != null) {
                                                        i = R.id.withdraw_button;
                                                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.withdraw_button, view2);
                                                        if (progressButton != null) {
                                                            i = R.id.withdrawable_balance;
                                                            TextView textView6 = (TextView) h5e.a(R.id.withdrawable_balance, view2);
                                                            if (textView6 != null) {
                                                                i = R.id.withdrawable_balance_hint;
                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.withdrawable_balance_hint, view2);
                                                                if (appCompatImageView != null) {
                                                                    i = R.id.withdrawable_balance_label;
                                                                    TextView textView7 = (TextView) h5e.a(R.id.withdrawable_balance_label, view2);
                                                                    if (textView7 != null) {
                                                                        return new vxi((ConstraintLayout) view2, clearEditText, textView, textView2, textView3, textView4, linearLayout, composeView, composeView2, textView5, progressButton, textView6, appCompatImageView, textView7);
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
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return yva0.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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

    /* JADX INFO: loaded from: classes5.dex */
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? yva0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public yva0() {
        super(R.layout.fragment_spei_by_stp_withdraw);
        this.R = false;
        this.S = false;
        this.T = String.valueOf(340);
        c100 c100Var = c100.e;
        this.U = String.valueOf(34002);
        this.V = ga00.WITHDRAW;
        this.W = 2;
        this.X = g5e.a(b.a);
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.Y = new q8i0(jq40.a(zwa0.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        ee<s8d0> eeVarRegisterForActivityResult = registerForActivityResult(new s1i0(), new ud() { // from class: wva0
            @Override // defpackage.ud
            public final void a(Object obj) {
                v1i0 v1i0Var = (v1i0) obj;
                yva0.a aVar = yva0.c0;
                v1i0Var.getClass();
                zwa0 zwa0VarC1 = this.a.c1();
                if (v1i0Var instanceof v1i0.c) {
                    bmj0 bmj0Var = zwa0VarC1.y;
                    v1i0.c cVar = (v1i0.c) v1i0Var;
                    String str = cVar.a;
                    String str2 = cVar.b;
                    bmj0Var.c = str;
                    bmj0Var.d = str2;
                    zwa0VarC1.A1();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.b0 = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return b1().y;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final Integer getW() {
        return this.W;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final ga00 getI0() {
        return this.V;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getG0() {
        return this.T;
    }

    @Override // defpackage.c000
    public final View J0() {
        return b1().B;
    }

    @Override // defpackage.c000
    public final TextView K0() {
        return b1().C;
    }

    @Override // defpackage.c000
    public final TextView L0() {
        return b1().A;
    }

    @Override // defpackage.c000
    public final void O0() {
        c1().A1();
    }

    public final vxi b1() {
        return (vxi) this.X.a(this, d0[0]);
    }

    public final zwa0 c1() {
        return (zwa0) this.Y.getValue();
    }

    public final void d1(int i) {
        ble.e(getContext(), getChildFragmentManager(), String.valueOf(o1l.a(this.K, this.L, this.T, this.U, 10000.0d * Double.parseDouble(String.valueOf(b1().b.getText())), this.V)), i);
    }

    public final void e1(String str, String str2, Function0<Unit> function0) {
        String strD = sn5.d(this, R.string.page_withdraw__withdrawals_blocked, new Object[0]);
        if (str == null) {
            str = sn5.d(this, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
        }
        o0(strD, str, sn5.d(this, R.string.common_functions__home, new Object[0]), new bf60(this, 1), str2, function0, false);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c1().y.e = tj5.b(this);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        zwa0 zwa0VarC1 = c1();
        ej5.c(o8i0.d(zwa0VarC1), null, null, new gxa0(zwa0VarC1, null), 3);
    }

    @Override // defpackage.c000, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ku90 ku90Var = c1().N;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new zva0(this, ku90Var, null, this), 3);
        vxi vxiVarB1 = b1();
        mla.h(this, vxiVarB1.w, new op8(-1919658005, new yet(this), true));
        mla.h(this, vxiVarB1.v, new op8(2009219988, new Function2() { // from class: xva0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                yva0.a aVar2 = yva0.c0;
                int i = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yva0 yva0Var = this.a;
                    yf40 yf40Var = (yf40) wyh.c(yva0Var.c1().R, aVar, 0, 7).getValue();
                    zwa0 zwa0VarC1 = yva0Var.c1();
                    boolean zA = aVar.A(zwa0VarC1);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        jwa0 jwa0Var = new jwa0(0, zwa0VarC1, zwa0.class, "onRecentAccountModalDismissed", "onRecentAccountModalDismissed()V", 0);
                        aVar.r(jwa0Var);
                        objY = jwa0Var;
                    }
                    chp chpVar = (chp) objY;
                    boolean zA2 = aVar.A(yva0Var);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new qzo(yva0Var, i);
                        aVar.r(objY2);
                    }
                    ig40.d(8, yf40Var, aVar, (Function0) chpVar, (Function1) objY2);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        ClearEditText clearEditText = vxiVarB1.b;
        clearEditText.clearFocus();
        f0l f0lVar = this.O;
        clearEditText.setHint(sn5.c(clearEditText, R.string.page_payment__min_vnum, f0lVar != null ? f0lVar.c() : null));
        clearEditText.setErrorView(b1().d);
        b1().b.setTextChangedListener(new nwa0(new kwa0(1, c1(), zwa0.class, "onAmountValidated", "onAmountValidated(Z)V", 0), this));
        clearEditText.addTextChangedListener(new mwa0(this, clearEditText));
        clearEditText.setKeyListener(DigitsKeyListener.getInstance(v4c.a.a() + "0123456789"));
        clearEditText.setRawInputType(8194);
        clearEditText.setFilters(new mw[]{new mw()});
        vxiVarB1.z.setOnClickListener(new lwa0(new cq40(), this));
        X0("0", ga00.WITHDRAW);
        ej5.c(ebs.a(getLifecycle()), null, null, new cwa0(this, c1().J, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new dwa0(this, c1().I, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new ewa0(this, c1().G, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new fwa0(this, c1().L, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new gwa0(this, c1().P, null, this), 3);
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getH0() {
        return this.U;
    }

    @Override // defpackage.c000
    public final View w0() {
        return b1().z;
    }

    @Override // defpackage.c000
    public final View y0() {
        return b1().i;
    }
}
