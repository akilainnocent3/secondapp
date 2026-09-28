package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lzaf0;", "Lw32;", "<init>", "()V", "Le6z;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zaf0 extends a5m {
    public final String A = "TelegramFragment";
    public final ttr B;
    public om5 C;

    public static final /* synthetic */ class a extends pf implements Function2<maf0, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(maf0 maf0Var, v1b<? super Unit> v1bVar) {
            maf0 maf0Var2 = maf0Var;
            zaf0 zaf0Var = (zaf0) this.a;
            zaf0Var.getClass();
            if (Intrinsics.g(maf0Var2, maf0.a.a)) {
                zaf0Var.m0();
            } else if (Intrinsics.g(maf0Var2, maf0.e.a)) {
                zaf0Var.n0(true);
            } else if (maf0Var2 instanceof maf0.b) {
                zaf0Var.t0(((maf0.b) maf0Var2).a);
            } else if (maf0Var2 instanceof maf0.d) {
                maf0.d dVar = (maf0.d) maf0Var2;
                zaf0Var.r0(dVar.a, dVar.b, true, null);
            } else {
                if (!(maf0Var2 instanceof maf0.c)) {
                    uhc.a();
                    return null;
                }
                zaf0Var.m0();
                d0n d0nVarQ0 = zaf0Var.q0();
                Context contextRequireContext = zaf0Var.requireContext();
                contextRequireContext.getClass();
                d0nVarQ0.b(contextRequireContext, snb0.OTP);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<q5z, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(q5z q5zVar) {
            q5z q5zVar2 = q5zVar;
            q5zVar2.getClass();
            ((ecf0) this.receiver).L1(q5zVar2);
            return Unit.a;
        }
    }

    public static final class c implements Function0<ecf0<? super OtpData>> {
        public final /* synthetic */ zaf0 a;
        public final /* synthetic */ zaf0 b;

        public c(zaf0 zaf0Var, zaf0 zaf0Var2) {
            Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
            this.a = zaf0Var;
            this.b = zaf0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Type inference failed for: r7v3, types: [b42, ecf0<? super com.sporty.android.platform.features.newotp.util.OtpData>] */
        @Override // kotlin.jvm.functions.Function0
        public final ecf0<? super OtpData> invoke() {
            OtpModule otpModule;
            OTPInternalData oTPInternalData;
            Parcelable parcelable;
            Parcelable parcelable2;
            zaf0 zaf0Var = this.a;
            Bundle arguments = zaf0Var.getArguments();
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
            Bundle arguments2 = zaf0Var.getArguments();
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
            dq7 dq7VarD = tgp.d(otpModule.b.e);
            zaf0 zaf0Var2 = this.b;
            q8i0 q8i0VarS0 = w32.s0(zaf0Var2, zaf0Var, dq7VarD);
            ((b42) q8i0VarS0.getValue()).G1(otpModule.a, oTPInternalData, OtpSelection.TELEGRAM);
            zaf0Var2.i = new abf0(otpModule);
            zaf0Var2.v = new bbf0(q8i0VarS0);
            return (b42) q8i0VarS0.getValue();
        }
    }

    public zaf0() {
        Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
        this.B = hwr.a(a1s.c, new c(this, this));
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getA() {
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(v0().v, new a(2, this, zaf0.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/newotp/channel/telegram/TelegramAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-857561384, new we7(this, 1), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        v0().L1(q5z.n.a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v0().L1(q5z.p.a);
    }

    public final ecf0<? super OtpData> v0() {
        return (ecf0) this.B.getValue();
    }
}
