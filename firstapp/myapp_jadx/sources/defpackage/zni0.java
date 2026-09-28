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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lzni0;", "Lw32;", "<init>", "()V", "Le6z;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zni0 extends l7m {
    public final String A = "VoiceFragment";
    public final ttr B;
    public om5 C;

    public static final /* synthetic */ class a extends pf implements Function2<wni0, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wni0 wni0Var, v1b<? super Unit> v1bVar) {
            wni0 wni0Var2 = wni0Var;
            zni0 zni0Var = (zni0) this.a;
            zni0Var.getClass();
            if (Intrinsics.g(wni0Var2, wni0.a.a)) {
                zni0Var.m0();
            } else if (Intrinsics.g(wni0Var2, wni0.e.a)) {
                zni0Var.n0(true);
            } else if (wni0Var2 instanceof wni0.b) {
                zni0Var.t0(((wni0.b) wni0Var2).a);
            } else if (wni0Var2 instanceof wni0.d) {
                wni0.d dVar = (wni0.d) wni0Var2;
                zni0Var.r0(dVar.a, dVar.b, true, null);
            } else {
                if (!(wni0Var2 instanceof wni0.c)) {
                    uhc.a();
                    return null;
                }
                zni0Var.m0();
                d0n d0nVarQ0 = zni0Var.q0();
                Context contextRequireContext = zni0Var.requireContext();
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
            ((goi0) this.receiver).L1(q5zVar2);
            return Unit.a;
        }
    }

    public static final class c implements Function0<goi0<? super OtpData>> {
        public final /* synthetic */ zni0 a;
        public final /* synthetic */ zni0 b;

        public c(zni0 zni0Var, zni0 zni0Var2) {
            Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
            this.a = zni0Var;
            this.b = zni0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Type inference failed for: r7v3, types: [b42, goi0<? super com.sporty.android.platform.features.newotp.util.OtpData>] */
        @Override // kotlin.jvm.functions.Function0
        public final goi0<? super OtpData> invoke() {
            OtpModule otpModule;
            OTPInternalData oTPInternalData;
            Parcelable parcelable;
            Parcelable parcelable2;
            zni0 zni0Var = this.a;
            Bundle arguments = zni0Var.getArguments();
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
            Bundle arguments2 = zni0Var.getArguments();
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
            dq7 dq7VarD = tgp.d(otpModule.b.c);
            zni0 zni0Var2 = this.b;
            q8i0 q8i0VarS0 = w32.s0(zni0Var2, zni0Var, dq7VarD);
            ((b42) q8i0VarS0.getValue()).G1(otpModule.a, oTPInternalData, OtpSelection.VOICE);
            zni0Var2.i = new aoi0(otpModule);
            zni0Var2.v = new boi0(q8i0VarS0);
            return (b42) q8i0VarS0.getValue();
        }
    }

    public zni0() {
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
        g1i g1iVar = new g1i(v0().v, new a(2, this, zni0.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/newotp/channel/voice/VoiceAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(64045133, new Function2() { // from class: xni0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final zni0 zni0Var = this.a;
                    or0.a(null, false, false, null, pp8.b(1840230550, new Function2() { // from class: yni0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                zni0 zni0Var2 = zni0Var;
                                e6z e6zVar = (e6z) wyh.c(zni0Var2.v0().f, aVar2, 0, 7).getValue();
                                OtpData otpDataP0 = zni0Var2.p0();
                                OtpData.Register register = otpDataP0 instanceof OtpData.Register ? (OtpData.Register) otpDataP0 : null;
                                goi0<? super OtpData> goi0VarV0 = zni0Var2.v0();
                                boolean zA = aVar2.A(goi0VarV0);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    zni0.b bVar = new zni0.b(1, goi0VarV0, goi0.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/newotp/channel/OtpCodeVerifyEvent;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                Function1 function1 = (Function1) ((chp) objY);
                                boolean zA2 = aVar2.A(zni0Var2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new wpo(zni0Var2, i);
                                    aVar2.r(objY2);
                                }
                                p5z.a(e6zVar, register, function1, (Function0) objY2, null, aVar2, 8, 16);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
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

    public final goi0<? super OtpData> v0() {
        return (goi0) this.B.getValue();
    }
}
