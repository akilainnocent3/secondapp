package com.sportybet.android.account.international.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sporty.android.core.model.patron.LoginResponseKt;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.account.international.INTAuthActivity;
import com.sportybet.android.account.international.data.model.INTCFPNumberResponse;
import com.sportybet.android.account.international.data.model.INTRegisterKt;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import com.sportybet.android.account.international.login.INTLoginFragment;
import com.sportybet.android.auth.AuthActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.country.ChangeRegionActivity;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import defpackage.a1s;
import defpackage.au7;
import defpackage.auf;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.cq40;
import defpackage.cwm;
import defpackage.cyb;
import defpackage.d630;
import defpackage.dvi;
import defpackage.dwm;
import defpackage.dwo;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.evm;
import defpackage.f00;
import defpackage.fcu;
import defpackage.fsl;
import defpackage.g5e;
import defpackage.gaj;
import defpackage.gr0;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.iel;
import defpackage.itf0;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.jvm;
import defpackage.lk50;
import defpackage.lvm;
import defpackage.lyh;
import defpackage.m850;
import defpackage.mgb0;
import defpackage.myh;
import defpackage.n1i;
import defpackage.num;
import defpackage.o2g;
import defpackage.o8i0;
import defpackage.ocu;
import defpackage.ohp;
import defpackage.psm;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qxi;
import defpackage.r5b;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sn5;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.tvm;
import defpackage.u1k;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.uvm;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vj5;
import defpackage.vqm;
import defpackage.vvm;
import defpackage.w8i0;
import defpackage.wie;
import defpackage.wwd0;
import defpackage.xdp;
import defpackage.xvm;
import defpackage.y5b;
import defpackage.yfx;
import defpackage.yi5;
import defpackage.yrh0;
import defpackage.zyf0;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/account/international/login/INTLoginFragment;", "Lhvm;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class INTLoginFragment extends fsl {
    public static final /* synthetic */ ohp<Object>[] E = {new d630(0, INTLoginFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/IntLoginFragmentBinding;")};
    public uqm A;
    public mgb0 B;
    public psm C;
    public yi5 D;
    public final i6i0 i;
    public final q8i0 v;
    public final q8i0 w;
    public final q8i0 y;
    public num z;

    public static final /* synthetic */ class a extends saj implements Function1<View, dwo> {
        public static final a a = new a(1, dwo.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/IntLoginFragmentBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final dwo invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.change_region;
            TextView textView = (TextView) h5e.a(R.id.change_region, view2);
            if (textView != null) {
                i = R.id.close;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.close, view2);
                if (imageButton != null) {
                    i = R.id.create_new_account;
                    TextView textView2 = (TextView) h5e.a(R.id.create_new_account, view2);
                    if (textView2 != null) {
                        i = R.id.email;
                        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.email, view2);
                        if (clearEditText != null) {
                            i = R.id.email_error;
                            TextView textView3 = (TextView) h5e.a(R.id.email_error, view2);
                            if (textView3 != null) {
                                i = R.id.forgot_password;
                                TextView textView4 = (TextView) h5e.a(R.id.forgot_password, view2);
                                if (textView4 != null) {
                                    i = R.id.log_in;
                                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.log_in, view2);
                                    if (progressButton != null) {
                                        i = R.id.login_hint;
                                        TextView textView5 = (TextView) h5e.a(R.id.login_hint, view2);
                                        if (textView5 != null) {
                                            i = R.id.logo;
                                            if (((ImageView) h5e.a(R.id.logo, view2)) != null) {
                                                i = R.id.pwd;
                                                PasswordEditText passwordEditText = (PasswordEditText) h5e.a(R.id.pwd, view2);
                                                if (passwordEditText != null) {
                                                    i = R.id.pwd_error;
                                                    TextView textView6 = (TextView) h5e.a(R.id.pwd_error, view2);
                                                    if (textView6 != null) {
                                                        return new dwo((ConstraintLayout) view2, textView, imageButton, textView2, clearEditText, textView3, textView4, progressButton, textView5, passwordEditText, textView6);
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

    @c0d(c = "com.sportybet.android.account.international.login.INTLoginFragment$enableState$1", f = "INTLoginFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<Boolean, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            b bVar = new b(3, v1bVar);
            bVar.a = zBooleanValue;
            bVar.b = zBooleanValue2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z && z2);
        }
    }

    @c0d(c = "com.sportybet.android.account.international.login.INTLoginFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "INTLoginFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ INTLoginFragment b;
        public final /* synthetic */ INTLoginFragment c;

        @c0d(c = "com.sportybet.android.account.international.login.INTLoginFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "INTLoginFragment.kt", l = {35}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ INTLoginFragment c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, INTLoginFragment iNTLoginFragment) {
                super(2, v1bVar);
                this.c = iNTLoginFragment;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to com.sportybet.android.account.international.login.INTLoginFragment$c$a for r5v2 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L18
                    if (r1 == r2) goto L14
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r3
                L14:
                    defpackage.uj50.b(r6)
                    goto L3b
                L18:
                    defpackage.uj50.b(r6)
                    ohp<java.lang.Object>[] r6 = com.sportybet.android.account.international.login.INTLoginFragment.E
                    com.sportybet.android.account.international.login.INTLoginFragment r6 = r5.c
                    q8i0 r1 = r6.y
                    java.lang.Object r1 = r1.getValue()
                    ocu r1 = (defpackage.ocu) r1
                    t340 r1 = r1.y
                    com.sportybet.android.account.international.login.INTLoginFragment$d r4 = new com.sportybet.android.account.international.login.INTLoginFragment$d
                    r4.<init>()
                    r5.b = r3
                    r5.a = r2
                    a390<T> r6 = r1.a
                    java.lang.Object r5 = r6.collect(r4, r5)
                    if (r5 != r0) goto L3b
                    return r0
                L3b:
                    defpackage.fkd.a()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.account.international.login.INTLoginFragment.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(INTLoginFragment iNTLoginFragment, v1b v1bVar, INTLoginFragment iNTLoginFragment2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = iNTLoginFragment;
            this.c = iNTLoginFragment2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new c(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class d<T> implements myh {
        public d() {
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            fcu fcuVar = (fcu) obj;
            ohp<Object>[] ohpVarArr = INTLoginFragment.E;
            INTLoginFragment iNTLoginFragment = INTLoginFragment.this;
            iNTLoginFragment.n0();
            int iOrdinal = fcuVar.ordinal();
            if (iOrdinal == 0) {
                yfx yfxVarA = NavHostFragment.a.a(iNTLoginFragment);
                o2g.a.getClass();
                Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                yfxVarA.getClass();
                yfxVarA.f(R.id.to_verify_2fa_fragment, bundleA);
            } else if (iOrdinal == 2) {
                androidx.fragment.app.e activity = iNTLoginFragment.getActivity();
                if (activity != null && !activity.isFinishing() && ((wie) activity.getSupportFragmentManager().H("account_limit_dialog")) == null) {
                    String strD = sn5.d(iNTLoginFragment, R.string.page_login__two_fa_rate_limit_exceeded, new Object[0]);
                    String strD2 = sn5.d(iNTLoginFragment, R.string.common_functions__ok, new Object[0]);
                    String strD3 = sn5.d(iNTLoginFragment, R.string.page_withdraw__account_limit, new Object[0]);
                    wie wieVar = new wie();
                    wieVar.a = strD;
                    wieVar.c = "Cancel";
                    wieVar.b = strD2;
                    wieVar.f = false;
                    wieVar.e = true;
                    wieVar.w = null;
                    wieVar.v = null;
                    wieVar.i = true;
                    wieVar.d = strD3;
                    wieVar.z = R.color.text_type1_secondary;
                    wieVar.y = R.color.brand_secondary;
                    wieVar.A = R.color.text_type1_primary;
                    wieVar.B = 0;
                    wieVar.C = 1;
                    wieVar.D = false;
                    wieVar.E = true;
                    wieVar.F = false;
                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    wieVar.show(supportFragmentManager, "int_login_limit_dialog");
                }
            } else if (iOrdinal == 6) {
                iNTLoginFragment.t0();
            } else if (iOrdinal == 7) {
                Context contextRequireContext = iNTLoginFragment.requireContext();
                contextRequireContext.getClass();
                zyf0.c(1, fcuVar.a.g(contextRequireContext));
            }
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return INTLoginFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return INTLoginFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return INTLoginFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return INTLoginFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return INTLoginFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class j extends qlr implements Function0<r8i0.c> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return INTLoginFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class k extends qlr implements Function0<Fragment> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return INTLoginFragment.this;
        }
    }

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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? INTLoginFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class p implements Function1<lk50<? extends BaseResponse<xdp>>, Unit> {
        public final /* synthetic */ r5b a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ INTLoginFragment c;

        public p(r5b r5bVar, ibs ibsVar, INTLoginFragment iNTLoginFragment) {
            this.a = r5bVar;
            this.b = ibsVar;
            this.c = iNTLoginFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk50<? extends BaseResponse<xdp>> lk50Var) {
            lk50<? extends BaseResponse<xdp>> lk50Var2 = lk50Var;
            lk50Var2.getClass();
            INTLoginFragment iNTLoginFragment = this.c;
            iNTLoginFragment.n0();
            if (lk50Var2 instanceof lk50.c) {
                BaseResponse<xdp> baseResponse = (BaseResponse) ((lk50.c) lk50Var2).a;
                ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                iNTLoginFragment.s0(baseResponse);
            } else if (lk50Var2 instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var2).a;
                if (th instanceof CaptchaError) {
                    Context contextRequireContext = iNTLoginFragment.requireContext();
                    contextRequireContext.getClass();
                    zyf0.c(0, ((CaptchaError) th).getErrorString(contextRequireContext));
                } else {
                    zyf0.c(0, sn5.d(iNTLoginFragment, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                }
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_INT);
                aVar.b(th);
            } else {
                if (!(lk50Var2 instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                iNTLoginFragment.o0();
            }
            if (!(lk50Var2 instanceof lk50.b)) {
                this.a.l(this.b);
            }
            return Unit.a;
        }
    }

    public INTLoginFragment() {
        super(R.layout.int_login_fragment);
        this.i = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new l(new k()));
        this.v = new q8i0(jq40.a(dwm.class), new m(ttrVarA), new o(ttrVarA), new n(ttrVarA));
        this.w = new q8i0(jq40.a(au7.class), new e(), new g(), new f());
        this.y = new q8i0(jq40.a(ocu.class), new h(), new j(), new i());
    }

    @Override // defpackage.hvm
    public final lyh<Boolean> j0() {
        return new n1i(r0().f, r0().i, new b(3, null));
    }

    @Override // defpackage.hvm
    public final View m0() {
        return q0().v;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067  */
    @Override // defpackage.hvm, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        final dwo dwoVarQ0 = q0();
        ImageButton imageButton = dwoVarQ0.c;
        TextView textView = dwoVarQ0.b;
        imageButton.setOnClickListener(new lvm(this, 0));
        dwoVarQ0.i.setOnClickListener(new View.OnClickListener() { // from class: mvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                INTLoginFragment iNTLoginFragment = this.a;
                ((au7) iNTLoginFragment.w.getValue()).x1(j6c.INT_RESET_PASSWORD);
                yfx yfxVarA = NavHostFragment.a.a(iNTLoginFragment);
                String strA = auf.a(dwoVarQ0.e);
                strA.getClass();
                yfxVarA.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putString("email", strA);
                yfxVarA.f(R.id.to_reset_pwd_confirm_fragment, bundle2);
            }
        });
        dwoVarQ0.d.setOnClickListener(new View.OnClickListener() { // from class: nvm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                INTLoginFragment iNTLoginFragment = this.a;
                iNTLoginFragment.r0().d.a(new ts40.a(0), k00.d);
                yfx yfxVarA = NavHostFragment.a.a(iNTLoginFragment);
                yfxVarA.getClass();
                Bundle bundle2 = new Bundle();
                if (Parcelable.class.isAssignableFrom(RegistrationStatusResponse.class)) {
                    bundle2.putParcelable(AnalyticsParam.EVENT_STATUS, null);
                } else if (Serializable.class.isAssignableFrom(RegistrationStatusResponse.class)) {
                    bundle2.putSerializable(AnalyticsParam.EVENT_STATUS, null);
                }
                bundle2.putString("email", "");
                bundle2.putString("password", "");
                yfxVarA.f(R.id.to_latam_registration, bundle2);
            }
        });
        dwoVarQ0.w.setText(sn5.d(this, R.string.register_login_int__login_with_email, new Object[0]));
        dwoVarQ0.e.setHint(sn5.d(this, R.string.register_login_int__email, new Object[0]));
        yi5 yi5Var = this.D;
        if (yi5Var == null) {
            Intrinsics.n("buildConfiguration");
            throw null;
        }
        if (yi5Var.b().j()) {
            textView.setVisibility(8);
        } else {
            psm psmVar = this.C;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            if (psmVar.r()) {
                textView.setVisibility(8);
            }
        }
        psm psmVar2 = this.C;
        if (psmVar2 == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        textView.setText(psmVar2.c());
        Context contextRequireContext = requireContext();
        psm psmVar3 = this.C;
        if (psmVar3 == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(gr0.a(contextRequireContext, psmVar3.X()), (Drawable) null, gr0.a(requireContext(), R.drawable.spr_ic_arrow_drop_down_green_24dp), (Drawable) null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: ovm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                INTLoginFragment iNTLoginFragment = this.a;
                yrh0.s(iNTLoginFragment.requireContext(), ChangeRegionActivity.z1(iNTLoginFragment.requireContext()), true);
            }
        });
        PasswordEditText passwordEditText = q0().y;
        passwordEditText.setHint(sn5.c(passwordEditText, R.string.page_login__password, new Object[0]));
        passwordEditText.setErrorView(q0().z);
        EditText passwordView = passwordEditText.getPasswordView();
        passwordView.getClass();
        wwd0 wwd0Var = r0().i;
        wwd0Var.getClass();
        passwordView.addTextChangedListener(new evm(wwd0Var));
        EditText passwordView2 = passwordEditText.getPasswordView();
        passwordView2.getClass();
        passwordView2.addTextChangedListener(new xvm(passwordEditText, this));
        ClearEditText clearEditText = q0().e;
        clearEditText.setCanCopy(false);
        clearEditText.setErrorView(q0().f);
        wwd0 wwd0Var2 = r0().f;
        wwd0Var2.getClass();
        clearEditText.addTextChangedListener(new evm(wwd0Var2));
        clearEditText.addTextChangedListener(new uvm(clearEditText, this));
        mgb0 mgb0Var = this.B;
        if (mgb0Var == null) {
            Intrinsics.n("accountStorage");
            throw null;
        }
        String lastAccount = mgb0Var.getLastAccount();
        if (lastAccount != null) {
            clearEditText.setText(lastAccount);
            clearEditText.requestFocus();
        }
        dwo dwoVarQ1 = q0();
        ProgressButton progressButton = dwoVarQ1.v;
        AlertDialog alertDialog = this.a;
        progressButton.setClickable(!(alertDialog != null && alertDialog.isShowing()));
        dwoVarQ1.v.setOnClickListener(new vvm(new cq40(), this, dwoVarQ1));
        final jvm jvmVar = new jvm(this, 0);
        getParentFragmentManager().n0("RETRY_LOGIN_FROM_VERIFY", this, new qxi() { // from class: bwi
            @Override // defpackage.qxi
            public final void a(String str, Bundle bundle2) {
                jvmVar.invoke(str, bundle2);
            }
        });
        s9s.b bVar = s9s.b.a;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new c(this, null, this), 3);
    }

    public final dwo q0() {
        return (dwo) this.i.a(this, E[0]);
    }

    public final dwm r0() {
        return (dwm) this.v.getValue();
    }

    public final void s0(BaseResponse<xdp> baseResponse) {
        dwo dwoVarQ0 = q0();
        int i2 = baseResponse.bizCode;
        if (i2 == 10000) {
            androidx.fragment.app.e eVarRequireActivity = requireActivity();
            final INTAuthActivity iNTAuthActivity = eVarRequireActivity instanceof INTAuthActivity ? (INTAuthActivity) eVarRequireActivity : null;
            if (iNTAuthActivity == null) {
                return;
            }
            o0();
            xdp xdpVar = baseResponse.data;
            xdpVar.getClass();
            LoginResponse asLoginResponse = INTRegisterKt.getAsLoginResponse(xdpVar);
            if (asLoginResponse == null) {
                return;
            }
            long jResolveLoginTimeOrNow = LoginResponseKt.resolveLoginTimeOrNow(asLoginResponse.getSelfExclusion());
            uqm uqmVar = this.A;
            if (uqmVar == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            uqmVar.saveToken(iNTAuthActivity, vqm.a.a(asLoginResponse, auf.a(dwoVarQ0.e), jResolveLoginTimeOrNow), new uqm.a() { // from class: kvm
                @Override // uqm.a
                public final void a(boolean z) {
                    ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                    iNTAuthActivity.finish();
                }
            });
            dwm dwmVarR0 = r0();
            ej5.c(o8i0.d(dwmVarR0), null, null, new cwm(dwmVarR0, null), 3);
            OrderedSportItemHelper.fetchAll();
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.LOGIN);
            return;
        }
        if (i2 == 11000) {
            dwm.y1(r0(), "incorrect_phone_number_or_code_expired", Integer.valueOf(baseResponse.bizCode), null, 4);
            ClearEditText clearEditText = dwoVarQ0.e;
            clearEditText.setError(baseResponse.message);
            clearEditText.requestFocus();
            clearEditText.setActivated(true);
            return;
        }
        if (i2 == 11613) {
            dwm.y1(r0(), "email_not_verified", Integer.valueOf(baseResponse.bizCode), null, 4);
            yfx yfxVarA = NavHostFragment.a.a(this);
            String strA = auf.a(dwoVarQ0.e);
            xdp xdpVar2 = baseResponse.data;
            xdpVar2.getClass();
            LoginResponse asLoginResponse2 = INTRegisterKt.getAsLoginResponse(xdpVar2);
            String token = asLoginResponse2 != null ? asLoginResponse2.getToken() : null;
            if (token == null) {
                token = "";
            }
            strA.getClass();
            yfxVarA.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("email", strA);
            bundle.putString("verify_token", token);
            bundle.putString("type", "register");
            bundle.putString("token", "");
            bundle.putString("cpf", "");
            yfxVarA.f(R.id.to_int_verify_fragment, bundle);
            return;
        }
        if (i2 == 11623) {
            dwm.y1(r0(), "password_expired", Integer.valueOf(baseResponse.bizCode), null, 4);
            dwoVarQ0.y.setError(baseResponse.message);
            dwoVarQ0.i.setText(sn5.d(this, R.string.page_login__reset_password, new Object[0]));
            return;
        }
        if (i2 == 12003) {
            dwm.y1(r0(), "verify_link_sent_exceed", Integer.valueOf(baseResponse.bizCode), null, 4);
            dwoVarQ0.e.setActivated(true);
            dwoVarQ0.y.setError(sn5.d(this, R.string.register_login_int__error_create_account_12003, new Object[0]));
            return;
        }
        if (i2 != 12005) {
            if (i2 == 12400) {
                dwm.y1(r0(), "need_two_fa_verify", Integer.valueOf(baseResponse.bizCode), null, 4);
                o0();
                xdp xdpVar3 = baseResponse.data;
                INTCFPNumberResponse asINTCpfNumberResponse = xdpVar3 != null ? INTRegisterKt.getAsINTCpfNumberResponse(xdpVar3) : null;
                ((au7) this.w.getValue()).x1(j6c.TWO_FA_LOGIN);
                ocu ocuVar = (ocu) this.y.getValue();
                String strA2 = auf.a(dwoVarQ0.e);
                String cpfNumber = asINTCpfNumberResponse != null ? asINTCpfNumberResponse.getCpfNumber() : null;
                ocu.z1(ocuVar, strA2, cpfNumber != null ? cpfNumber : "", 4);
                return;
            }
            if (i2 == 15202) {
                dwm.y1(r0(), "login_attempt_from_multiple_locations", Integer.valueOf(baseResponse.bizCode), null, 4);
                ClearEditText clearEditText2 = dwoVarQ0.e;
                clearEditText2.setError(sn5.d(this, R.string.register_login_int__error_login_15202, new Object[0]));
                clearEditText2.requestFocus();
                clearEditText2.setActivated(true);
                return;
            }
            if (i2 != 19000) {
                if (i2 == 19411) {
                    dwm.y1(r0(), "too_many_requests", Integer.valueOf(baseResponse.bizCode), null, 4);
                    dwoVarQ0.e.setActivated(true);
                    dwoVarQ0.y.setError(baseResponse.message);
                    return;
                }
                if (i2 == 14004) {
                    dwm.y1(r0(), "login_attempts_exceeded", Integer.valueOf(baseResponse.bizCode), null, 4);
                    Context contextB = dvi.b(requireActivity());
                    contextB.getClass();
                    FragmentManager supportFragmentManager = ((androidx.fragment.app.e) contextB).getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.e activity = getActivity();
                    if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                    u1k.a aVar = u1k.b;
                    u1k.b bVar = new u1k.b() { // from class: pvm
                        @Override // u1k.b
                        public final Dialog a(Context context) {
                            ohp<Object>[] ohpVarArr = INTLoginFragment.E;
                            context.getClass();
                            final Dialog dialog = new Dialog(context, R.style.DialogActivity);
                            final INTLoginFragment iNTLoginFragment = this.a;
                            dialog.setContentView(mla.a(context, new op8(756908635, new Function2() { // from class: qvm
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    a aVar2 = (a) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    ohp<Object>[] ohpVarArr2 = INTLoginFragment.E;
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.6f, j58.b), zk40.a);
                                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                                        int iHashCode = Long.hashCode(aVar2.m());
                                        ne00 ne00VarO = aVar2.o();
                                        d dVarC = c.c(aVar2, dVarB);
                                        yka.k.getClass();
                                        tsr.a aVar3 = yka.a.b;
                                        if (aVar2.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar2.D();
                                        if (aVar2.g()) {
                                            aVar2.F(aVar3);
                                        } else {
                                            aVar2.p();
                                        }
                                        hlh0.a(aVar2, i78VarA, yka.a.f);
                                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a = yka.a.g;
                                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                        }
                                        hlh0.a(aVar2, dVarC, yka.a.d);
                                        final INTLoginFragment iNTLoginFragment2 = iNTLoginFragment;
                                        String strD = sn5.d(iNTLoginFragment2, R.string.register_login_int__failed_login_attempts_exceeded, new Object[0]);
                                        String strD2 = sn5.d(iNTLoginFragment2, R.string.register_login_int__failed_login_attempts_exceeded_content, new Object[0]);
                                        String strD3 = sn5.d(iNTLoginFragment2, R.string.common_functions__ok, new Object[0]);
                                        Integer numValueOf = Integer.valueOf(R.drawable.image_face_id);
                                        final Dialog dialog2 = dialog;
                                        boolean zA = aVar2.A(dialog2);
                                        Object objY = aVar2.y();
                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                        if (zA || objY == c0042a) {
                                            objY = new Function0() { // from class: rvm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    ohp<Object>[] ohpVarArr3 = INTLoginFragment.E;
                                                    dialog2.dismiss();
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY);
                                        }
                                        Function0 function0 = (Function0) objY;
                                        boolean zA2 = aVar2.A(dialog2) | aVar2.A(iNTLoginFragment2);
                                        Object objY2 = aVar2.y();
                                        if (zA2 || objY2 == c0042a) {
                                            objY2 = new Function0() { // from class: svm
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    ohp<Object>[] ohpVarArr3 = INTLoginFragment.E;
                                                    dialog2.dismiss();
                                                    yfx yfxVarA2 = NavHostFragment.a.a(iNTLoginFragment2);
                                                    yfxVarA2.getClass();
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("email", "");
                                                    yfxVarA2.f(R.id.to_reset_pwd_confirm_fragment, bundle2);
                                                    return Unit.a;
                                                }
                                            };
                                            aVar2.r(objY2);
                                        }
                                        ra8.b(strD, strD2, null, numValueOf, null, strD3, null, null, function0, (Function0) objY2, null, aVar2, 12582912, 0, 2356);
                                        aVar2.s();
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true)));
                            return dialog;
                        }
                    };
                    aVar.getClass();
                    u1k.a.a(supportFragmentManager, bVar);
                    Unit unit = Unit.a;
                    return;
                }
                if (i2 == 14005) {
                    dwm.y1(r0(), "user_registration_incomplete", Integer.valueOf(baseResponse.bizCode), null, 4);
                    xdp xdpVar4 = baseResponse.data;
                    RegistrationStatusResponse asRegistrationStatusResponse = xdpVar4 != null ? INTRegisterKt.getAsRegistrationStatusResponse(xdpVar4) : null;
                    Intent intent = new Intent(requireContext(), (Class<?>) INTAuthActivity.class);
                    intent.putExtra(AuthActivity.KEY_IS_SIGN_UP, true);
                    intent.putExtra("key_registration_status", asRegistrationStatusResponse);
                    intent.putExtra("key_email", auf.a(dwoVarQ0.e));
                    EditText passwordView = dwoVarQ0.y.getPasswordView();
                    passwordView.getClass();
                    intent.putExtra("key_password", auf.a(passwordView));
                    requireActivity().finish();
                    yrh0.s(requireContext(), intent, true);
                    return;
                }
                switch (i2) {
                    case 11601:
                    case 11603:
                        break;
                    case 11602:
                        dwm.y1(r0(), "account_frozen", Integer.valueOf(baseResponse.bizCode), null, 4);
                        dwoVarQ0.e.setActivated(true);
                        dwoVarQ0.y.setError(sn5.d(this, R.string.register_login_int__error_login_11602, new Object[0]));
                        return;
                    default:
                        dwm.y1(r0(), "unknown_biz_code", Integer.valueOf(baseResponse.bizCode), null, 4);
                        zyf0.d(baseResponse.message);
                        return;
                }
            }
        }
        dwm.y1(r0(), "invalid_credentials", Integer.valueOf(baseResponse.bizCode), null, 4);
        dwoVarQ0.e.setActivated(true);
        dwoVarQ0.y.setError(sn5.d(this, R.string.register_login_int__error_login_11601_11603, new Object[0]));
    }

    public final void t0() {
        dwo dwoVarQ0 = q0();
        dwm dwmVarR0 = r0();
        String strA = auf.a(dwoVarQ0.e);
        EditText passwordView = dwoVarQ0.y.getPasswordView();
        passwordView.getClass();
        r5b r5bVarX1 = dwmVarR0.x1(strA, auf.a(passwordView));
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        r5bVarX1.f(viewLifecycleOwner, new tvm(new p(r5bVarX1, viewLifecycleOwner, this)));
    }
}
