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
import androidx.fragment.app.e;
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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lvqx;", "Lw32;", "<init>", "()V", "Lz6z;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vqx extends wxl {
    public final String A = "NewOtpSelectorFragment";
    public final ttr B = hwr.a(a1s.c, new c(this));

    @c0d(c = "com.sporty.android.platform.features.newotp.otpselector.NewSelectorOTPFragment$onCreateView$1", f = "NewSelectorOTPFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<l6z, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = vqx.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l6z l6zVar, v1b<? super Unit> v1bVar) {
            return ((a) create(l6zVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            l6z l6zVar = (l6z) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = l6zVar instanceof l6z.a;
            vqx vqxVar = vqx.this;
            if (z) {
                vqxVar.m0();
            } else if (l6zVar instanceof l6z.d) {
                OtpData otpDataP0 = vqxVar.p0();
                if (otpDataP0 != null) {
                    vqxVar.t0(otpDataP0);
                }
                vqxVar.requireActivity().getSupportFragmentManager().Y();
            } else if (l6zVar instanceof l6z.c) {
                l6z.c cVar = (l6z.c) l6zVar;
                OtpSelection otpSelection = cVar.a;
                OTPInternalData oTPInternalData = cVar.b;
                vqxVar.r0(otpSelection, oTPInternalData, oTPInternalData.a.size() == 1, cVar.c);
            } else if (Intrinsics.g(l6zVar, l6z.b.a)) {
                d0n d0nVarQ0 = vqxVar.q0();
                Context contextRequireContext = vqxVar.requireContext();
                contextRequireContext.getClass();
                d0nVarQ0.b(contextRequireContext, snb0.OTP);
            } else {
                if (!(l6zVar instanceof l6z.e)) {
                    uhc.a();
                    return null;
                }
                vqxVar.t0(((l6z.e) l6zVar).a);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<o6z, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o6z o6zVar) {
            o6z o6zVar2 = o6zVar;
            o6zVar2.getClass();
            ((c7z) this.receiver).R1(o6zVar2);
            return Unit.a;
        }
    }

    public static final class c implements Function0<c7z<? super OtpData>> {
        public final /* synthetic */ vqx b;

        public c(vqx vqxVar) {
            this.b = vqxVar;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Type inference failed for: r7v3, types: [b42, c7z<? super com.sporty.android.platform.features.newotp.util.OtpData>] */
        @Override // kotlin.jvm.functions.Function0
        public final c7z<? super OtpData> invoke() {
            OtpModule otpModule;
            OTPInternalData oTPInternalData;
            Parcelable parcelable;
            Parcelable parcelable2;
            vqx vqxVar = vqx.this;
            Bundle arguments = vqxVar.getArguments();
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
            Bundle arguments2 = vqxVar.getArguments();
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
            dq7 dq7VarD = tgp.d(otpModule.b.a);
            vqx vqxVar2 = this.b;
            q8i0 q8i0VarS0 = w32.s0(vqxVar2, vqxVar, dq7VarD);
            ((b42) q8i0VarS0.getValue()).G1(otpModule.a, oTPInternalData, null);
            vqxVar2.i = new wqx(otpModule);
            vqxVar2.v = new xqx(q8i0VarS0);
            return (b42) q8i0VarS0.getValue();
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getA() {
        return this.A;
    }

    @Override // defpackage.w32, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        iny onBackPressedDispatcher;
        super.onCreate(bundle);
        e activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        mny.a(onBackPressedDispatcher, this, new Function1() { // from class: tqx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                iny onBackPressedDispatcher2;
                cny cnyVar = (cny) obj;
                cnyVar.getClass();
                vqx vqxVar = this.a;
                OtpData otpDataP0 = vqxVar.p0();
                if (otpDataP0 != null) {
                    vqxVar.t0(otpDataP0);
                }
                cnyVar.f(false);
                e activity2 = vqxVar.getActivity();
                if (activity2 != null && (onBackPressedDispatcher2 = activity2.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher2.d();
                }
                return Unit.a;
            }
        }, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(((c7z) this.B.getValue()).w, new a(null));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(406634436, new Function2() { // from class: sqx
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1470856717, new uqx(this.a, i), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
