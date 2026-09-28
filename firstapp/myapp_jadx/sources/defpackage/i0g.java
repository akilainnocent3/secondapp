package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.window.layout.oKr.TEFcJcMqR;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Li0g;", "Lw32;", "<init>", "()V", "Le6z;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i0g extends sql {
    public final String A = "EmailFragment";
    public final ttr B;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a extends pf implements Function2<lwf, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lwf lwfVar, v1b<? super Unit> v1bVar) {
            lwf lwfVar2 = lwfVar;
            i0g i0gVar = (i0g) this.a;
            i0gVar.getClass();
            if (Intrinsics.g(lwfVar2, lwf.a.a)) {
                i0gVar.m0();
            } else if (Intrinsics.g(lwfVar2, lwf.e.a)) {
                i0gVar.n0(true);
            } else if (lwfVar2 instanceof lwf.b) {
                i0gVar.t0(((lwf.b) lwfVar2).a);
            } else if (lwfVar2 instanceof lwf.d) {
                lwf.d dVar = (lwf.d) lwfVar2;
                i0gVar.r0(dVar.a, dVar.b, true, null);
            } else {
                if (!(lwfVar2 instanceof lwf.c)) {
                    uhc.a();
                    return null;
                }
                i0gVar.m0();
                d0n d0nVarQ0 = i0gVar.q0();
                Context contextRequireContext = i0gVar.requireContext();
                contextRequireContext.getClass();
                d0nVarQ0.b(contextRequireContext, snb0.OTP);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class b extends saj implements Function1<q5z, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(q5z q5zVar) {
            q5z q5zVar2 = q5zVar;
            q5zVar2.getClass();
            ((p0g) this.receiver).L1(q5zVar2);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c implements Function0<p0g<? super OtpData>> {
        public final /* synthetic */ i0g a;
        public final /* synthetic */ i0g b;

        public c(i0g i0gVar, i0g i0gVar2) {
            Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
            this.a = i0gVar;
            this.b = i0gVar2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Type inference failed for: r7v3, types: [b42, p0g<? super com.sporty.android.platform.features.newotp.util.OtpData>] */
        @Override // kotlin.jvm.functions.Function0
        public final p0g<? super OtpData> invoke() {
            OtpModule otpModule;
            OTPInternalData oTPInternalData;
            Parcelable parcelable;
            Parcelable parcelable2;
            i0g i0gVar = this.a;
            Bundle arguments = i0gVar.getArguments();
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
            Bundle arguments2 = i0gVar.getArguments();
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
            dq7 dq7VarD = tgp.d(otpModule.b.f);
            i0g i0gVar2 = this.b;
            q8i0 q8i0VarS0 = w32.s0(i0gVar2, i0gVar, dq7VarD);
            ((b42) q8i0VarS0.getValue()).G1(otpModule.a, oTPInternalData, OtpSelection.EMAIL);
            i0gVar2.i = new j0g(otpModule);
            i0gVar2.v = new k0g(q8i0VarS0);
            return (b42) q8i0VarS0.getValue();
        }
    }

    public i0g() {
        Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
        this.B = hwr.a(a1s.c, new c(this, this));
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getA() {
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((p0g) this.B.getValue()).L1(q5z.n.a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((p0g) this.B.getValue()).L1(q5z.p.a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(((p0g) this.B.getValue()).f, new a(2, this, i0g.class, TEFcJcMqR.xWfrD, "handleAction(Lcom/sporty/android/platform/features/newotp/channel/email/EmailAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(117974519, new Function2() { // from class: g0g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1894159936, new h0g(this.a, i), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
