package com.sportybet.android.account.international.verify;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.account.international.data.model.INTRegisterResendResponse;
import com.sportybet.android.account.international.data.model.INTResetPwdCheckResponse;
import com.sportybet.android.account.international.data.model.INTVerifyData;
import com.sportybet.android.account.international.verify.INTVerifyFragment;
import com.sportybet.android.account.international.widget.INTOTPInputView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a1s;
import defpackage.axm;
import defpackage.ay1;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.cfx;
import defpackage.cq40;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.d630;
import defpackage.dxm;
import defpackage.exm;
import defpackage.fe6;
import defpackage.fxm;
import defpackage.g5e;
import defpackage.gaj;
import defpackage.gsl;
import defpackage.gvm;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.i2i;
import defpackage.i6i0;
import defpackage.ibs;
import defpackage.iel;
import defpackage.iny;
import defpackage.itf0;
import defpackage.j6c;
import defpackage.jq40;
import defpackage.k00;
import defpackage.k9j;
import defpackage.kxm;
import defpackage.lk50;
import defpackage.lx5;
import defpackage.lxm;
import defpackage.lyh;
import defpackage.mpe0;
import defpackage.mxm;
import defpackage.mxo;
import defpackage.n1i;
import defpackage.nae0;
import defpackage.o32;
import defpackage.o8i0;
import defpackage.ohp;
import defpackage.psm;
import defpackage.pwm;
import defpackage.pxm;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qxm;
import defpackage.r5b;
import defpackage.r8i0;
import defpackage.rxm;
import defpackage.saj;
import defpackage.sn5;
import defpackage.tje0;
import defpackage.ts40;
import defpackage.ttr;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v5;
import defpackage.v8i0;
import defpackage.vxm;
import defpackage.w8i0;
import defpackage.wwd0;
import defpackage.wwm;
import defpackage.xwd0;
import defpackage.xzh;
import defpackage.y5b;
import defpackage.y8j;
import defpackage.yzh;
import defpackage.zi50;
import defpackage.zyf0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/account/international/verify/INTVerifyFragment;", "Lhvm;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class INTVerifyFragment extends gsl implements k9j {
    public static final /* synthetic */ ohp<Object>[] G = {new d630(0, INTVerifyFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/IntVerifyFragmentBinding;")};
    public final i6i0 A;
    public final q8i0 B;
    public final cfx C;
    public final wwd0 D;
    public final wwd0 E;
    public final mpe0 F;
    public uqm i;
    public psm v;
    public d0n w;
    public v5 y;
    public y8j z;

    public static final /* synthetic */ class a extends saj implements Function1<View, mxo> {
        public static final a a = new a(1, mxo.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/IntVerifyFragmentBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final mxo invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.back;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back, view2);
            if (imageButton != null) {
                i = R.id.close;
                ImageButton imageButton2 = (ImageButton) h5e.a(R.id.close, view2);
                if (imageButton2 != null) {
                    i = R.id.contact_support;
                    TextView textView = (TextView) h5e.a(R.id.contact_support, view2);
                    if (textView != null) {
                        i = R.id.email_incorrect;
                        TextView textView2 = (TextView) h5e.a(R.id.email_incorrect, view2);
                        if (textView2 != null) {
                            i = R.id.hint;
                            TextView textView3 = (TextView) h5e.a(R.id.hint, view2);
                            if (textView3 != null) {
                                i = R.id.next;
                                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, view2);
                                if (progressButton != null) {
                                    i = R.id.otp;
                                    INTOTPInputView iNTOTPInputView = (INTOTPInputView) h5e.a(R.id.otp, view2);
                                    if (iNTOTPInputView != null) {
                                        i = R.id.send_again;
                                        TextView textView4 = (TextView) h5e.a(R.id.send_again, view2);
                                        if (textView4 != null) {
                                            i = R.id.title;
                                            TextView textView5 = (TextView) h5e.a(R.id.title, view2);
                                            if (textView5 != null) {
                                                return new mxo((ConstraintLayout) view2, imageButton, imageButton2, textView, textView2, textView3, progressButton, iNTOTPInputView, textView4, textView5);
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

    @c0d(c = "com.sportybet.android.account.international.verify.INTVerifyFragment$enableState$1", f = "INTVerifyFragment.kt", l = {}, m = "invokeSuspend", v = 2)
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
            return Boolean.valueOf(z && !z2);
        }
    }

    public static final class c implements Function1<lk50<? extends BaseResponse<INTRegisterResendResponse>>, Unit> {
        public final /* synthetic */ r5b a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ INTVerifyFragment c;

        public c(r5b r5bVar, ibs ibsVar, INTVerifyFragment iNTVerifyFragment) {
            this.a = r5bVar;
            this.b = ibsVar;
            this.c = iNTVerifyFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk50<? extends BaseResponse<INTRegisterResendResponse>> lk50Var) {
            INTRegisterResendResponse.ResponseData data;
            lk50<? extends BaseResponse<INTRegisterResendResponse>> lk50Var2 = lk50Var;
            lk50Var2.getClass();
            INTVerifyFragment iNTVerifyFragment = this.c;
            iNTVerifyFragment.n0();
            String token = null;
            if (lk50Var2 instanceof lk50.c) {
                BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var2).a;
                int i = baseResponse.bizCode;
                INTRegisterResendResponse iNTRegisterResendResponse = (INTRegisterResendResponse) baseResponse.data;
                if (iNTRegisterResendResponse != null && (data = iNTRegisterResendResponse.getData()) != null) {
                    token = data.getToken();
                }
                String str = baseResponse.message;
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                iNTVerifyFragment.v0(i, token, str);
            } else if (lk50Var2 instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var2).a;
                if (th instanceof CaptchaError) {
                    Context contextRequireContext = iNTVerifyFragment.requireContext();
                    contextRequireContext.getClass();
                    zyf0.c(0, ((CaptchaError) th).getErrorString(contextRequireContext));
                } else {
                    zyf0.c(0, sn5.d(iNTVerifyFragment, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                }
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_INT);
                aVar.b(th);
            } else {
                if (!(lk50Var2 instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                iNTVerifyFragment.o0();
            }
            if (!(lk50Var2 instanceof lk50.b)) {
                this.a.l(this.b);
            }
            return Unit.a;
        }
    }

    public static final class d implements Function1<lk50<? extends BaseResponse<INTResetPwdCheckResponse>>, Unit> {
        public final /* synthetic */ r5b a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ INTVerifyFragment c;

        public d(r5b r5bVar, ibs ibsVar, INTVerifyFragment iNTVerifyFragment) {
            this.a = r5bVar;
            this.b = ibsVar;
            this.c = iNTVerifyFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk50<? extends BaseResponse<INTResetPwdCheckResponse>> lk50Var) {
            lk50<? extends BaseResponse<INTResetPwdCheckResponse>> lk50Var2 = lk50Var;
            lk50Var2.getClass();
            INTVerifyFragment iNTVerifyFragment = this.c;
            iNTVerifyFragment.n0();
            if (lk50Var2 instanceof lk50.c) {
                BaseResponse baseResponse = (BaseResponse) ((lk50.c) lk50Var2).a;
                int i = baseResponse.bizCode;
                INTResetPwdCheckResponse iNTResetPwdCheckResponse = (INTResetPwdCheckResponse) baseResponse.data;
                String token = iNTResetPwdCheckResponse != null ? iNTResetPwdCheckResponse.getToken() : null;
                String str = baseResponse.message;
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                iNTVerifyFragment.v0(i, token, str);
            } else if (lk50Var2 instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var2).a;
                if (th instanceof CaptchaError) {
                    Context contextRequireContext = iNTVerifyFragment.requireContext();
                    contextRequireContext.getClass();
                    zyf0.c(0, ((CaptchaError) th).getErrorString(contextRequireContext));
                } else {
                    zyf0.c(0, sn5.d(iNTVerifyFragment, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                }
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_INT);
                aVar.b(th);
            } else {
                if (!(lk50Var2 instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                iNTVerifyFragment.o0();
            }
            if (!(lk50Var2 instanceof lk50.b)) {
                this.a.l(this.b);
            }
            return Unit.a;
        }
    }

    public static final class e implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ INTVerifyFragment b;

        public e(cq40 cq40Var, INTVerifyFragment iNTVerifyFragment) {
            this.a = cq40Var;
            this.b = iNTVerifyFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
            INTVerifyFragment iNTVerifyFragment = this.b;
            iNTVerifyFragment.s0().w.setVisibility(0);
            iNTVerifyFragment.y0();
            iNTVerifyFragment.q0();
        }
    }

    public static final class f implements Function0<Bundle> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            INTVerifyFragment iNTVerifyFragment = INTVerifyFragment.this;
            Bundle arguments = iNTVerifyFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(iNTVerifyFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return INTVerifyFragment.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? INTVerifyFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public INTVerifyFragment() {
        super(R.layout.int_verify_fragment);
        this.A = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new h(new g()));
        this.B = new q8i0(jq40.a(vxm.class), new i(ttrVarA), new k(ttrVarA), new j(ttrVarA));
        this.C = new cfx(jq40.a(fxm.class), new f());
        Boolean bool = Boolean.FALSE;
        this.D = xwd0.a(bool);
        this.E = xwd0.a(bool);
        this.F = hwr.b(new pwm(this, 0));
    }

    @Override // defpackage.hvm
    public final lyh<Boolean> j0() {
        return new n1i(this.D, this.E, new b(3, null));
    }

    @Override // defpackage.hvm
    public final View m0() {
        return s0().i;
    }

    @Override // defpackage.hvm, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object bVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        boolean zT0 = t0();
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        iny onBackPressedDispatcher = eVarRequireActivity.getOnBackPressedDispatcher();
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.a(viewLifecycleOwner, new gvm(zT0, this, eVarRequireActivity));
        int i2 = 0;
        if (t0()) {
            vxm vxmVarU0 = u0();
            String str = r0().d;
            str.getClass();
            ay1 ay1Var = new ay1();
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            if (bytes != null && bytes.length != 0) {
                o32.a aVar = new o32.a();
                ay1Var.b(bytes, bytes.length, aVar);
                ay1Var.b(bytes, -1, aVar);
                int i3 = aVar.c;
                byte[] bArr = new byte[i3];
                int i4 = aVar.d;
                if (i3 > i4) {
                    int iMin = Math.min(i3 > i4 ? i3 - i4 : 0, i3);
                    System.arraycopy(aVar.b, aVar.d, bArr, 0, iMin);
                    int i5 = aVar.d + iMin;
                    aVar.d = i5;
                    if (aVar.c <= i5) {
                        aVar.d = 0;
                        aVar.c = 0;
                    }
                }
                bytes = bArr;
            }
            bytes.getClass();
            String str2 = new String(bytes, Charsets.UTF_8);
            try {
                zi50.a aVar2 = zi50.b;
                bVar = (INTVerifyData) ((JsonSerializeService) vxmVarU0.d.getValue()).fromJson(str2, INTVerifyData.class);
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object iNTVerifyData = new INTVerifyData(null, null, null, 7, null);
            if (bVar instanceof zi50.b) {
                bVar = iNTVerifyData;
            }
            INTVerifyData iNTVerifyData2 = (INTVerifyData) bVar;
            iNTVerifyData2.getClass();
            vxmVarU0.e = iNTVerifyData2;
        } else {
            u0().e = new INTVerifyData(r0().a, r0().b, null, 4, null);
        }
        mxo mxoVarS0 = s0();
        final ImageButton imageButton = mxoVarS0.b;
        ImageButton imageButton2 = mxoVarS0.c;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: qwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                kjx.a(imageButton).j();
            }
        });
        imageButton.setVisibility(!t0() ? 0 : 8);
        final Function0 function0 = t0() ? new Function0() { // from class: rwm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                yrh0.t(this.a.getContext(), MainActivity.class, true);
                return Unit.a;
            }
        } : new Function0() { // from class: swm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                this.a.requireActivity().finish();
                return Unit.a;
            }
        };
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: twm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                function0.invoke();
            }
        });
        if (Intrinsics.g(r0().c, "register")) {
            imageButton2.setVisibility(4);
        }
        mxoVarS0.y.setText(Intrinsics.g(r0().c, "register") ? sn5.d(this, R.string.register_login_int__verify_email, new Object[0]) : sn5.d(this, R.string.register_login_int__account_confirmation, new Object[0]));
        mxoVarS0.f.setText(nae0.a(sn5.d(this, R.string.register_login_int__verify_email_sent_desc, u0().x1().getEmail())));
        final TextView textView = mxoVarS0.e;
        textView.setOnClickListener(new View.OnClickListener() { // from class: uwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                INTVerifyFragment iNTVerifyFragment = this.a;
                boolean zG = Intrinsics.g(iNTVerifyFragment.r0().c, "register");
                TextView textView2 = textView;
                if (zG) {
                    psm psmVar = iNTVerifyFragment.v;
                    if (psmVar == null) {
                        Intrinsics.n("countryManager");
                        throw null;
                    }
                    if (psmVar.W()) {
                        kjx.a(textView2).b.p(R.id.latam_sign_up_email_fragment, false);
                        return;
                    }
                }
                kjx.a(textView2).j();
            }
        });
        textView.setVisibility(t0() ? 8 : 0);
        mxoVarS0.d.setOnClickListener(new View.OnClickListener() { // from class: vwm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = INTVerifyFragment.G;
                INTVerifyFragment iNTVerifyFragment = this.a;
                iNTVerifyFragment.u0().c.a(new ts40.j(0), k00.d);
                d0n d0nVar = iNTVerifyFragment.w;
                if (d0nVar == null) {
                    Intrinsics.n("utils");
                    throw null;
                }
                Context contextRequireContext = iNTVerifyFragment.requireContext();
                contextRequireContext.getClass();
                d0nVar.b(contextRequireContext, snb0.OTP);
            }
        });
        INTOTPInputView iNTOTPInputView = s0().v;
        Iterator<T> it = iNTOTPInputView.getInputList().iterator();
        while (it.hasNext()) {
            ((EditText) it.next()).addTextChangedListener(new dxm(this, iNTOTPInputView));
        }
        String code = u0().x1().getCode();
        if (!StringsKt.U(code)) {
            for (Object obj : iNTOTPInputView.getInputList()) {
                int i6 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                ((EditText) obj).setText(String.valueOf(code.charAt(i2)));
                i2 = i6;
            }
        }
        ProgressButton progressButton = s0().i;
        progressButton.setUppercasedButtonText(R.string.register_login_int__next);
        progressButton.setOnClickListener(new axm(new cq40(), this, progressButton));
        s0().w.setOnClickListener(new exm(new cq40(), this));
        y8j y8jVar = this.z;
        if (y8jVar == null) {
            Intrinsics.n("fullStoryCommonManager");
            throw null;
        }
        y8jVar.e(s0().i, "register__verify_email_submit_btn");
        y8j y8jVar2 = this.z;
        if (y8jVar2 == null) {
            Intrinsics.n("fullStoryCommonManager");
            throw null;
        }
        y8jVar2.e(s0().w, "register__send_again_btn");
        y8j y8jVar3 = this.z;
        if (y8jVar3 == null) {
            Intrinsics.n("fullStoryCommonManager");
            throw null;
        }
        y8jVar3.e(s0().e, "register__incorrect_email_btn");
    }

    public final void q0() {
        mxo mxoVarS0 = s0();
        sn5.f(mxoVarS0.y, R.string.register_login_int__verification_email_sent, new Object[0]);
        sn5.f(mxoVarS0.f, R.string.register_login_int__verification_email_sent_desc, new Object[0]);
        INTOTPInputView iNTOTPInputView = mxoVarS0.v;
        ArrayList arrayList = iNTOTPInputView.G;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((EditText) obj).setText((CharSequence) null);
            iNTOTPInputView.clearFocus();
        }
        mxoVarS0.d.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final fxm r0() {
        return (fxm) this.C.getValue();
    }

    public final mxo s0() {
        return (mxo) this.A.a(this, G[0]);
    }

    public final boolean t0() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    public final vxm u0() {
        return (vxm) this.B.getValue();
    }

    public final void v0(int i2, String str, String str2) {
        if (i2 == 10000) {
            if (str != null) {
                vxm vxmVarU0 = u0();
                INTVerifyData iNTVerifyDataCopy$default = INTVerifyData.copy$default(u0().x1(), null, str, null, 5, null);
                iNTVerifyDataCopy$default.getClass();
                vxmVarU0.e = iNTVerifyDataCopy$default;
            }
            q0();
            zyf0.c(1, sn5.d(this, R.string.register_login_int__send_again_success, new Object[0]));
            return;
        }
        if (i2 == 12003) {
            s0().v.setErrorState(Integer.valueOf(R.string.register_login_int__error_create_account_12003));
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_INT);
            aVar.a(str2, new Object[0]);
            return;
        }
        if (i2 != 19000) {
            if (str2 != null) {
                zyf0.c(0, str2);
            }
        } else {
            zyf0.c(0, sn5.d(this, R.string.register_login_int__error_register_19002, new Object[0]));
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_INT);
            aVar2.a(str2, new Object[0]);
        }
    }

    public final <T> void w0(lk50<? extends T> lk50Var, Function1<? super T, Unit> function1) {
        boolean z = lk50Var instanceof lk50.b;
        Boolean boolValueOf = Boolean.valueOf(z);
        wwd0 wwd0Var = this.E;
        wwd0Var.getClass();
        wwd0Var.k(null, boolValueOf);
        n0();
        if (lk50Var instanceof lk50.c) {
            function1.invoke(((lk50.c) lk50Var).a);
            return;
        }
        if (!(lk50Var instanceof lk50.a)) {
            if (z) {
                o0();
                return;
            } else {
                uhc.a();
                return;
            }
        }
        Throwable th = ((lk50.a) lk50Var).a;
        if (th instanceof CaptchaError) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            zyf0.c(0, ((CaptchaError) th).getErrorString(contextRequireContext));
        } else {
            zyf0.c(0, sn5.d(this, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_INT);
        aVar.b(th);
    }

    public final void y0() {
        INTOTPInputView iNTOTPInputView = s0().v;
        ArrayList arrayList = iNTOTPInputView.G;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((EditText) obj).setText((CharSequence) null);
            iNTOTPInputView.clearFocus();
        }
        if (!Intrinsics.g(r0().c, "register")) {
            final vxm vxmVarU0 = u0();
            r5b r5bVarC = i2i.c(new yzh(new xzh(new pxm(vxmVarU0.b.a(j6c.INT_RESET_PASSWORD, new CaptchaData.Email(vxmVarU0.x1().getEmail()), o8i0.d(vxmVarU0), new Function1() { // from class: hxm
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CaptchaHeader captchaHeader = (CaptchaHeader) obj2;
                    captchaHeader.getClass();
                    vxm vxmVar = vxmVarU0;
                    return vxmVar.a.h(vxmVar.x1().getEmail(), captchaHeader);
                }
            })), new qxm(2, null)), new rxm(3, null)), o8i0.d(vxmVarU0).a, 2);
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            r5bVarC.f(viewLifecycleOwner, new wwm(new d(r5bVarC, viewLifecycleOwner, this)));
            return;
        }
        final vxm vxmVarU1 = u0();
        fxm fxmVarR0 = r0();
        fxmVarR0.getClass();
        vxmVarU1.c.a(new ts40.k0(0), k00.d);
        fe6 fe6Var = vxmVarU1.b;
        String str = fxmVarR0.c;
        j6c j6cVar = (!Intrinsics.g(str, "register") && Intrinsics.g(str, "reset_pwd")) ? j6c.RESET_PASSWORD : j6c.INT_REGISTER;
        r5b r5bVarC2 = i2i.c(new yzh(new xzh(new kxm(fe6Var.a(j6cVar, new CaptchaData.Email(vxmVarU1.x1().getEmail()), o8i0.d(vxmVarU1), new Function1() { // from class: ixm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CaptchaHeader captchaHeader = (CaptchaHeader) obj2;
                captchaHeader.getClass();
                vxm vxmVar = vxmVarU1;
                return vxmVar.a.a(vxmVar.x1().getEmail(), captchaHeader);
            }
        })), new lxm(2, null)), new mxm(3, null)), o8i0.d(vxmVarU1).a, 2);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        r5bVarC2.f(viewLifecycleOwner2, new wwm(new c(r5bVarC2, viewLifecycleOwner2, this)));
    }

    public final void z0() {
        s0().i.setButtonText(R.string.register_login_int__resend_code);
        s0().w.setVisibility(8);
        s0().i.setOnClickListener(new e(new cq40(), this));
    }
}
