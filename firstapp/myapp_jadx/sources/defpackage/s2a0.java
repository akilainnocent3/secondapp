package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ls2a0;", "Lw32;", "<init>", "()V", "Le6z;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s2a0 extends b3m {
    public final String A = "SmsFragment";
    public odd B;
    public om5 C;
    public final ttr D;
    public Intent E;
    public final ee<Intent> F;
    public final c G;

    public static final /* synthetic */ class a extends pf implements Function2<o2a0, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o2a0 o2a0Var, v1b<? super Unit> v1bVar) {
            o2a0 o2a0Var2 = o2a0Var;
            s2a0 s2a0Var = (s2a0) this.a;
            s2a0Var.getClass();
            if (o2a0Var2 instanceof o2a0.g) {
                Intent intent = s2a0Var.E;
                if (intent != null) {
                    try {
                        zi50.a aVar = zi50.b;
                        s2a0Var.F.b(intent);
                        Unit unit = Unit.a;
                    } catch (Throwable unused) {
                        zi50.a aVar2 = zi50.b;
                    }
                }
                s2a0Var.E = null;
            } else if (o2a0Var2 instanceof o2a0.b) {
                s2a0Var.E = null;
            } else if (o2a0Var2 instanceof o2a0.a) {
                s2a0Var.m0();
            } else if (o2a0Var2 instanceof o2a0.f) {
                s2a0Var.n0(true);
            } else if (o2a0Var2 instanceof o2a0.c) {
                s2a0Var.t0(((o2a0.c) o2a0Var2).a);
            } else if (o2a0Var2 instanceof o2a0.e) {
                o2a0.e eVar = (o2a0.e) o2a0Var2;
                s2a0Var.r0(eVar.a, eVar.b, true, null);
            } else {
                if (!(o2a0Var2 instanceof o2a0.d)) {
                    uhc.a();
                    return null;
                }
                s2a0Var.m0();
                d0n d0nVarQ0 = s2a0Var.q0();
                Context contextRequireContext = s2a0Var.requireContext();
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
            ((x2a0) this.receiver).L1(q5zVar2);
            return Unit.a;
        }
    }

    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object bVar;
            Status status;
            Object bVar2;
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    try {
                        zi50.a aVar = zi50.b;
                        bVar = (Status) rj5.a(extras, "com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class);
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    if (bVar instanceof zi50.b) {
                        bVar = null;
                    }
                    status = (Status) bVar;
                } else {
                    status = null;
                }
                Integer numValueOf = status != null ? Integer.valueOf(status.a) : null;
                s2a0 s2a0Var = s2a0.this;
                if (numValueOf == null || numValueOf.intValue() != 0) {
                    if (numValueOf != null && numValueOf.intValue() == 15) {
                        s2a0Var.w0();
                        return;
                    }
                    return;
                }
                try {
                    zi50.a aVar3 = zi50.b;
                    bVar2 = (Intent) rj5.a(extras, "com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", Intent.class);
                } catch (Throwable th2) {
                    zi50.a aVar4 = zi50.b;
                    bVar2 = new zi50.b(th2);
                }
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                Intent intent2 = (Intent) bVar2;
                if (intent2 != null) {
                    intent2.setFlags(67108864);
                    s2a0Var.E = intent2;
                    if (((e6z) s2a0Var.v0().i.a.getValue()).f instanceof j7z.c) {
                        Intent intent3 = s2a0Var.E;
                        if (intent3 != null) {
                            try {
                                s2a0Var.F.b(intent3);
                                Unit unit = Unit.a;
                            } catch (Throwable unused) {
                                zi50.a aVar5 = zi50.b;
                            }
                        }
                        s2a0Var.E = null;
                    }
                    s2a0Var.w0();
                }
            }
        }
    }

    public static final class d implements Function0<x2a0<? super OtpData>> {
        public final /* synthetic */ s2a0 a;
        public final /* synthetic */ s2a0 b;

        public d(s2a0 s2a0Var, s2a0 s2a0Var2) {
            Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
            this.a = s2a0Var;
            this.b = s2a0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0050  */
        /* JADX WARN: Type inference failed for: r7v3, types: [b42, x2a0<? super com.sporty.android.platform.features.newotp.util.OtpData>] */
        @Override // kotlin.jvm.functions.Function0
        public final x2a0<? super OtpData> invoke() {
            OtpModule otpModule;
            OTPInternalData oTPInternalData;
            Parcelable parcelable;
            Parcelable parcelable2;
            s2a0 s2a0Var = this.a;
            Bundle arguments = s2a0Var.getArguments();
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
            Bundle arguments2 = s2a0Var.getArguments();
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
            dq7 dq7VarD = tgp.d(otpModule.b.b);
            s2a0 s2a0Var2 = this.b;
            q8i0 q8i0VarS0 = w32.s0(s2a0Var2, s2a0Var, dq7VarD);
            ((b42) q8i0VarS0.getValue()).G1(otpModule.a, oTPInternalData, OtpSelection.SMS);
            s2a0Var2.i = new t2a0(otpModule);
            s2a0Var2.v = new u2a0(q8i0VarS0);
            return (b42) q8i0VarS0.getValue();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @c0d(c = "com.sporty.android.platform.features.newotp.channel.sms.SmsFragment$startListenSMS$1", f = "SmsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return s2a0.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            umk0 umk0Var = new umk0(s2a0.this.requireContext(), null, w2a0.k, sl0.d.g, u4l.a.c);
            o5f0.a aVarA = o5f0.a();
            aVarA.a = new zc9();
            aVarA.c = new Feature[]{dnk0.a};
            aVarA.d = 1568;
            umk0Var.c(1, aVarA.a());
            return Unit.a;
        }
    }

    public s2a0() {
        Parcelable.Creator<OtpSelection> creator = OtpSelection.CREATOR;
        this.D = hwr.a(a1s.c, new d(this, this));
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: q2a0
            @Override // defpackage.ud
            public final void a(Object obj) {
                Intent intent;
                String stringExtra;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a != -1) {
                    activityResult = null;
                }
                if (activityResult == null || (intent = activityResult.b) == null || (stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE")) == null) {
                    return;
                }
                x2a0<? super OtpData> x2a0VarV0 = this.a.v0();
                x2a0VarV0.getClass();
                jvd0 jvd0Var = x2a0VarV0.A;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                x2a0VarV0.A = kzh.d(new g1i(bm50.a(ozh.c(new or60(new z2a0(stringExtra, null)), x2a0VarV0.e)), new a3a0(x2a0VarV0, null)), o8i0.d(x2a0VarV0));
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.F = eeVarRegisterForActivityResult;
        this.G = new c();
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getP() {
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final UiText uiText;
        Parcelable parcelable;
        layoutInflater.getClass();
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        int i = Build.VERSION.SDK_INT;
        c cVar = this.G;
        if (i >= 33) {
            requireActivity().registerReceiver(cVar, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
        } else {
            requireActivity().registerReceiver(cVar, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", null);
        }
        w0();
        g1i g1iVar = new g1i(v0().w, new a(2, this, s2a0.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/newotp/channel/sms/SmsAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (i >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("pending_snackbar", UiText.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("pending_snackbar");
                if (!(parcelable2 instanceof UiText)) {
                    parcelable2 = null;
                }
                parcelable = (UiText) parcelable2;
            }
            uiText = (UiText) parcelable;
        } else {
            uiText = null;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1582920108, new Function2() { // from class: p2a0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final s2a0 s2a0Var = this.a;
                    final UiText uiText2 = uiText;
                    or0.a(null, false, false, null, pp8.b(772614493, new Function2() { // from class: r2a0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                s2a0 s2a0Var2 = s2a0Var;
                                e6z e6zVar = (e6z) wyh.c(s2a0Var2.v0().i, aVar2, 0, 7).getValue();
                                OtpData otpDataP0 = s2a0Var2.p0();
                                OtpData.Register register = otpDataP0 instanceof OtpData.Register ? (OtpData.Register) otpDataP0 : null;
                                x2a0<? super OtpData> x2a0VarV0 = s2a0Var2.v0();
                                boolean zA = aVar2.A(x2a0VarV0);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    s2a0.b bVar = new s2a0.b(1, x2a0VarV0, x2a0.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/newotp/channel/OtpCodeVerifyEvent;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                Function1 function1 = (Function1) ((chp) objY);
                                boolean zA2 = aVar2.A(s2a0Var2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new u10(s2a0Var2, i2);
                                    aVar2.r(objY2);
                                }
                                p5z.a(e6zVar, register, function1, (Function0) objY2, uiText2, aVar2, 8, 0);
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
    public final void onDestroyView() {
        super.onDestroyView();
        requireActivity().unregisterReceiver(this.G);
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

    public final x2a0<? super OtpData> v0() {
        return (x2a0) this.D.getValue();
    }

    public final void w0() {
        nas nasVarA = ebs.a(getViewLifecycleOwner().getLifecycle());
        odd oddVar = this.B;
        if (oddVar != null) {
            ej5.c(nasVarA, oddVar, null, new e(null), 2);
        } else {
            Intrinsics.n("ioDispatcher");
            throw null;
        }
    }
}
