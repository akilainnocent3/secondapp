package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lqo50;", "Lw32;", "<init>", "()V", "Lsq50;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qo50 extends w32 {
    public final String w = "ReversOTPFragment";
    public final ttr y;
    public final zo50 z;

    public static final /* synthetic */ class a extends pf implements Function2<vo50, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vo50 vo50Var, v1b<? super Unit> v1bVar) {
            vo50 vo50Var2 = vo50Var;
            qo50 qo50Var = (qo50) this.a;
            if (vo50Var2 instanceof vo50.e) {
                vo50.e eVar = (vo50.e) vo50Var2;
                qo50Var.q0().a(qo50Var.requireContext(), eVar.a, eVar.b);
            } else {
                qo50Var.getClass();
                if (Intrinsics.g(vo50Var2, vo50.a.a)) {
                    qo50Var.m0();
                } else if (vo50Var2 instanceof vo50.d) {
                    vo50.d dVar = (vo50.d) vo50Var2;
                    qo50Var.r0(dVar.a, dVar.b, true, null);
                } else if (vo50Var2 instanceof vo50.b) {
                    qo50Var.t0(((vo50.b) vo50Var2).a);
                } else {
                    if (!Intrinsics.g(vo50Var2, vo50.c.a)) {
                        uhc.a();
                        return null;
                    }
                    qo50Var.m0();
                    d0n d0nVarQ0 = qo50Var.q0();
                    Context contextRequireContext = qo50Var.requireContext();
                    contextRequireContext.getClass();
                    d0nVarQ0.b(contextRequireContext, snb0.OTP);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversOTPFragment$onCreateView$2", f = "ReversOTPFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = qo50.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
            return ((b) create(uiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText = (UiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            qo50 qo50Var = qo50.this;
            zo50 zo50Var = qo50Var.z;
            Context contextRequireContext = qo50Var.requireContext();
            contextRequireContext.getClass();
            String strD = sn5.d(qo50Var, R.string.common_otp_verify__otp_verified, new Object[0]);
            Context contextRequireContext2 = qo50Var.requireContext();
            contextRequireContext2.getClass();
            uiText.getClass();
            zo50Var.a(contextRequireContext, strD, uiText.e(contextRequireContext2).toString());
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<cp50, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(cp50 cp50Var) {
            cp50 cp50Var2 = cp50Var;
            cp50Var2.getClass();
            ((nq50) this.receiver).P1(cp50Var2);
            return Unit.a;
        }
    }

    public static final class d implements Function0<nq50<? super OtpData>> {
        public final /* synthetic */ qo50 a;
        public final /* synthetic */ qo50 b;

        public d(qo50 qo50Var, qo50 qo50Var2) {
            Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
            this.a = qo50Var;
            this.b = qo50Var2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Type inference failed for: r7v3, types: [b42, nq50<? super com.sporty.android.platform.features.newotp.util.OtpData>] */
        @Override // kotlin.jvm.functions.Function0
        public final nq50<? super OtpData> invoke() {
            OtpModule otpModule;
            OTPInternalData oTPInternalData;
            Parcelable parcelable;
            Parcelable parcelable2;
            qo50 qo50Var = this.a;
            Bundle arguments = qo50Var.getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = (Parcelable) arguments.getParcelable("key - module", OtpModule.class);
                } else {
                    Parcelable parcelable3 = arguments.getParcelable("key - module");
                    if (!(parcelable3 instanceof OtpModule)) {
                        parcelable3 = null;
                    }
                    parcelable2 = (OtpModule) parcelable3;
                }
                otpModule = (OtpModule) parcelable2;
            } else {
                otpModule = null;
            }
            otpModule.getClass();
            Bundle arguments2 = qo50Var.getArguments();
            if (arguments2 == null) {
                oTPInternalData = new OTPInternalData(null, 7);
            } else {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) arguments2.getParcelable("key - otp internal data", OTPInternalData.class);
                } else {
                    Parcelable parcelable4 = arguments2.getParcelable("key - otp internal data");
                    if (!(parcelable4 instanceof OTPInternalData)) {
                        parcelable4 = null;
                    }
                    parcelable = (OTPInternalData) parcelable4;
                }
                oTPInternalData = (OTPInternalData) parcelable;
                if (oTPInternalData == null) {
                    oTPInternalData = new OTPInternalData(null, 7);
                }
            }
            dq7 dq7VarD = tgp.d(otpModule.b.d);
            qo50 qo50Var2 = this.b;
            q8i0 q8i0VarS0 = w32.s0(qo50Var2, qo50Var, dq7VarD);
            ((b42) q8i0VarS0.getValue()).G1(otpModule.a, oTPInternalData, OtpSelection.REVERSED_SMS);
            qo50Var2.i = new ro50(otpModule);
            qo50Var2.v = new so50(q8i0VarS0);
            return (b42) q8i0VarS0.getValue();
        }
    }

    public qo50() {
        Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
        this.y = hwr.a(a1s.c, new d(this, this));
        this.z = new zo50();
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getA() {
        return this.w;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(u0().w, new a(2, this, qo50.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/newotp/channel/reverse/ReverseAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        g1i g1iVar2 = new g1i(u0().z, new b(null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, s9s.b.c);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1657668157, new q2o(this, 1), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        zo50 zo50Var = this.z;
        zo50Var.getClass();
        if (o0b.a(contextRequireContext, "android.permission.POST_NOTIFICATIONS") == 0) {
            t2y t2yVar = new t2y(contextRequireContext);
            t2yVar.b.cancel(null, zo50Var.a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        u0().P1(cp50.n.a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        u0().P1(cp50.o.a);
    }

    public final nq50<? super OtpData> u0() {
        return (nq50) this.y.getValue();
    }
}
