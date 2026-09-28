package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class d480 {

    public static final /* synthetic */ class a extends saj implements Function0<OtpModule<OtpData.RestPassword>> {
        @Override // kotlin.jvm.functions.Function0
        public final OtpModule<OtpData.RestPassword> invoke() {
            h480 h480Var = (h480) this.receiver;
            com.sporty.android.platform.features.newotp.util.a aVar = h480Var.d;
            String phoneNumber = h480Var.b.getPhoneNumber();
            phoneNumber.getClass();
            String strP = h480Var.c.P();
            aVar.getClass();
            return com.sporty.android.platform.features.newotp.util.a.d(phoneNumber, strP);
        }
    }

    public static final /* synthetic */ class b extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h480 h480Var = (h480) this.a;
            h480Var.getClass();
            ej5.c(o8i0.d(h480Var), null, null, new g480(h480Var, null), 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            h480 h480Var = (h480) this.a;
            h480Var.getClass();
            ej5.c(o8i0.d(h480Var), null, null, new f480(h480Var, null), 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((h480) this.receiver).f.setValue(wa.b.b);
            return Unit.a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, final LastLoginDeviceInfo lastLoginDeviceInfo, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-293510694);
        int i2 = i | 6 | (bVarI.A(lastLoginDeviceInfo) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarF = h.f(d35.a(j.g(aVar2, 1.0f), 2.0f, c68.a(R.color.line_type1_primary, bVarI), j060.c(2.0f)), 16.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.account_protection__device_information, new Object[0], bVarI), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 131066);
            androidx.compose.ui.d dVarH = g3w.h(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), LastLoginDeviceInfo.KEY_DEVICE);
            String device = lastLoginDeviceInfo.getDevice();
            if (device == null) {
                device = "";
            }
            lkf0.d(cb40.a(R.string.account_protection__device, new Object[]{device}, bVarI), dVarH, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
            androidx.compose.ui.d dVarH2 = g3w.h(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), "platform");
            String platform = lastLoginDeviceInfo.getPlatform();
            if (platform == null) {
                platform = "";
            }
            lkf0.d(cb40.a(R.string.account_protection__platform, new Object[]{platform}, bVarI), dVarH2, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
            androidx.compose.ui.d dVarH3 = g3w.h(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), "ip");
            String ip = lastLoginDeviceInfo.getIp();
            if (ip == null) {
                ip = "";
            }
            lkf0.d(cb40.a(R.string.account_protection__ip, new Object[]{ip}, bVarI), dVarH3, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
            androidx.compose.ui.d dVarH4 = g3w.h(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), LastLoginDeviceInfo.KEY_LOCATION);
            String location = lastLoginDeviceInfo.getLocation();
            lkf0.d(cb40.a(R.string.account_protection__location, new Object[]{location != null ? location : ""}, bVarI), dVarH4, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(lastLoginDeviceInfo, i) { // from class: c480
                public final /* synthetic */ LastLoginDeviceInfo b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    d480.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final Function0<Unit> function0, final Function2<? super String, ? super String, Unit> function2, h480 h480Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        t340 t340Var;
        int i2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a3;
        boolean z;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a4;
        androidx.compose.runtime.a.C0041a.C0042a c0042a5;
        boolean z2;
        Object objY2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a6;
        final h480 h480Var2 = h480Var;
        function0.getClass();
        function2.getClass();
        h480Var2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1997365081);
        int i3 = (bVarI.A(function0) ? 4 : 2) | i | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(h480Var2) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            ytw ytwVarC = wyh.c(h480Var2.i, bVarI, 0, 7);
            s380 s380Var = (s380) ((x5a0) h480Var2.e).getValue();
            wa waVar = (wa) ytwVarC.getValue();
            t340 t340Var2 = h480Var2.w;
            int i4 = i3 & 896;
            boolean z3 = i4 == 256 || bVarI.A(h480Var2);
            Object objY3 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a7 = androidx.compose.runtime.a.C0041a.a;
            if (z3 || objY3 == c0042a7) {
                t340Var = t340Var2;
                i2 = i4;
                c0042a = c0042a7;
                a aVar2 = new a(0, h480Var2, h480.class, "generateResetPasswordModule", "generateResetPasswordModule()Lcom/sporty/android/platform/features/newotp/util/OtpModule;", 0);
                bVarI.r(aVar2);
                objY3 = aVar2;
            } else {
                t340Var = t340Var2;
                i2 = i4;
                c0042a = c0042a7;
            }
            Function0 function1 = (Function0) ((chp) objY3);
            boolean z4 = i2 == 256 || bVarI.A(h480Var2);
            Object objY4 = bVarI.y();
            if (z4) {
                c0042a2 = c0042a;
            } else {
                androidx.compose.runtime.a.C0041a.C0042a c0042a8 = c0042a;
                if (objY4 == c0042a8) {
                    c0042a2 = c0042a8;
                } else {
                    c0042a3 = c0042a8;
                }
                Function0 function3 = (Function0) objY4;
                if (i2 != 256 || bVarI.A(h480Var2)) {
                    z = true;
                } else {
                    z = false;
                }
                objY = bVarI.y();
                if (z) {
                    c0042a4 = c0042a3;
                } else {
                    c0042a6 = c0042a3;
                    if (objY == c0042a6) {
                        c0042a4 = c0042a6;
                    } else {
                        c0042a5 = c0042a6;
                    }
                    Function0 function4 = (Function0) objY;
                    if (i2 != 256 || bVarI.A(h480Var2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2 || objY2 == c0042a5) {
                        d dVar = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                        bVarI.r(dVar);
                        objY2 = dVar;
                    }
                    bVar = bVarI;
                    c(null, s380Var, waVar, t340Var, function1, function0, function3, function2, function4, (Function0) ((chp) objY2), bVar, ((i3 << 15) & 458752) | 576 | ((i3 << 18) & 29360128));
                }
                c0042a5 = c0042a4;
                c cVar = new c(0, h480Var2, h480.class, "launchResetPasswordEvent", "launchResetPasswordEvent()Lkotlinx/coroutines/Job;", 8);
                bVarI.r(cVar);
                objY = cVar;
                Function0 function5 = (Function0) objY;
                if (i2 != 256) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objY2 = bVarI.y();
                if (z2) {
                    d dVar2 = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                    bVarI.r(dVar2);
                    objY2 = dVar2;
                } else {
                    d dVar3 = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                    bVarI.r(dVar3);
                    objY2 = dVar3;
                }
                bVar = bVarI;
                c(null, s380Var, waVar, t340Var, function1, function0, function3, function2, function5, (Function0) ((chp) objY2), bVar, ((i3 << 15) & 458752) | 576 | ((i3 << 18) & 29360128));
            }
            c0042a3 = c0042a2;
            b bVar2 = new b(0, h480Var2, h480.class, "logoutAllDevices", "logoutAllDevices()Lkotlinx/coroutines/Job;", 8);
            bVarI.r(bVar2);
            objY4 = bVar2;
            Function0 function6 = (Function0) objY4;
            if (i2 != 256) {
                z = true;
            } else {
                z = true;
            }
            objY = bVarI.y();
            if (z) {
                c0042a6 = c0042a3;
                if (objY == c0042a6) {
                    c0042a4 = c0042a6;
                } else {
                    c0042a5 = c0042a6;
                }
                Function0 function7 = (Function0) objY;
                if (i2 != 256) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objY2 = bVarI.y();
                if (z2) {
                    d dVar4 = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                    bVarI.r(dVar4);
                    objY2 = dVar4;
                } else {
                    d dVar5 = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                    bVarI.r(dVar5);
                    objY2 = dVar5;
                }
                bVar = bVarI;
                c(null, s380Var, waVar, t340Var, function1, function0, function6, function2, function7, (Function0) ((chp) objY2), bVar, ((i3 << 15) & 458752) | 576 | ((i3 << 18) & 29360128));
            } else {
                c0042a4 = c0042a3;
            }
            c0042a5 = c0042a4;
            c cVar2 = new c(0, h480Var2, h480.class, "launchResetPasswordEvent", "launchResetPasswordEvent()Lkotlinx/coroutines/Job;", 8);
            bVarI.r(cVar2);
            objY = cVar2;
            Function0 function8 = (Function0) objY;
            if (i2 != 256) {
                z2 = true;
            } else {
                z2 = true;
            }
            objY2 = bVarI.y();
            if (z2) {
                d dVar6 = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                bVarI.r(dVar6);
                objY2 = dVar6;
            } else {
                d dVar7 = new d(0, h480Var2, h480.class, "consumeState", "consumeState()V", 0);
                bVarI.r(dVar7);
                objY2 = dVar7;
            }
            bVar = bVarI;
            c(null, s380Var, waVar, t340Var, function1, function0, function6, function2, function8, (Function0) ((chp) objY2), bVar, ((i3 << 15) & 458752) | 576 | ((i3 << 18) & 29360128));
        } else {
            h480Var2 = h480Var2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, h480Var2, i) { // from class: t380
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ h480 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(513);
                    d480.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(androidx.compose.ui.d dVar, final s380 s380Var, final wa waVar, final a390 a390Var, final Function0 function0, final Function0 function1, final Function0 function2, final Function2 function3, final Function0 function4, final Function0 function5, androidx.compose.runtime.a aVar, final int i) {
        final androidx.compose.ui.d dVar2;
        boolean z;
        s380Var.getClass();
        waVar.getClass();
        a390Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1948380968);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(s380Var) : bVarI.A(s380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(waVar) : bVarI.A(waVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(a390Var) : bVarI.A(a390Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(function4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= bVarI.A(function5) ? 536870912 : 268435456;
        }
        boolean z2 = true;
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            int i3 = 29360128 & i2;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 8388608) | (i4 == 32 || ((i2 & 64) != 0 && bVarI.A(s380Var)));
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z3 || objY == c0042a) {
                objY = new Function1() { // from class: u380
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        OtpData.RestPassword restPassword = (OtpData.RestPassword) obj;
                        restPassword.getClass();
                        OTPResult<OTPGeneralResult> oTPResult = restPassword.d;
                        if (oTPResult instanceof OTPResult.Success) {
                            function3.invoke(s380Var.d, ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken());
                            f00 f00Var = vgb0.a;
                            Bundle bundleA = mll0.a("data", AnalyticsParam.FORCE_LOGOUT);
                            Unit unit = Unit.a;
                            vgb0.b(AnalyticsEvent.REQUEST_RESET_PASSWORD, bundleA);
                        } else if (oTPResult instanceof OTPResult.Failed) {
                            itf0.a.a("OTPResult.Failed", new Object[0]);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            final tnu tnuVarC = com.sporty.android.platform.features.newotp.agent.b.c((Function1) objY, bVarI);
            int i5 = i2;
            boolean zA = bVarI.A(tnuVarC) | ((i2 & 57344) == 16384) | (i3 == 8388608);
            if (i4 != 32 && ((i5 & 64) == 0 || !bVarI.A(s380Var))) {
                z2 = false;
            }
            boolean z4 = zA | z2;
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: v380
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ja jaVar = (ja) obj;
                        jaVar.getClass();
                        if (jaVar instanceof ja.b) {
                            tnuVarC.b(function0.invoke());
                        } else {
                            if (!(jaVar instanceof ja.a)) {
                                uhc.a();
                                return null;
                            }
                            function3.invoke(s380Var.d, "");
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            abs.a(a390Var, null, null, (Function1) objY2, bVarI, (i5 >> 9) & 14);
            if (waVar instanceof wa.a) {
                bVarI.N(2030938071);
                z = false;
                nzj.b(null, "", ((wa.a) waVar).b.g(context), null, null, null, null, null, null, null, null, null, function5, null, bVarI, 48, (i5 >> 21) & 896, 12281);
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(2031125466);
                bVarI.X(false);
            }
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new w380();
                bVarI.r(objY3);
            }
            hy60.a(xa80.b(dVarE, z, (Function1) objY3), pp8.b(1272363236, new Function2() { // from class: x380
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strA = cb40.a(R.string.account_protection__account_protection, new Object[0], aVar3);
                        final Function0 function6 = function1;
                        odd0.d(null, strA, 0L, null, null, null, pp8.b(-1061861061, new gaj() { // from class: b480
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                a aVar4 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((e160) obj3).getClass();
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    c6n.a(function6, g3w.h(d.a.b, AnalyticsParam.STORY_SKIP_REASON_CLOSE), false, null, null, qo9.a, aVar4, 1572912, 60);
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, aVar3), aVar3, 1572864, 61);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, 0, c68.a(R.color.background_general_primary, bVarI), 0L, new pth(32.0f, 44.0f, 32.0f, 32.0f), pp8.b(1186802681, new gaj() { // from class: y380
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar4 = d.a.b;
                        d dVarE2 = h.e(j.e(aVar4, 1.0f), tmzVar);
                        kw0.k kVar = kw0.c;
                        n54.a aVar5 = ht.a.n;
                        i78 i78VarA = g78.a(kVar, aVar5, aVar3, 48);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarE2);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar6);
                        } else {
                            aVar3.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar3, i78VarA, bVar);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        d dVarC2 = op70.c(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), op70.a(aVar3), 14);
                        i78 i78VarA2 = g78.a(kVar, aVar5, aVar3, 48);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC3 = c.c(aVar3, dVarC2);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar6);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, i78VarA2, bVar);
                        hlh0.a(aVar3, ne00VarO2, dVar3);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar3, dVarC3, cVar);
                        h9n.a(erz.a(R.drawable.account_activation_failed, 0, aVar3), "fail", g3w.h(h.j(aVar4, 0.0f, 44.0f, 0.0f, 0.0f, 13), oAudzpbdOhCI.ahlQhyut), null, null, 0.0f, null, aVar3, 432, 120);
                        d dVarH = g3w.h(h.h(aVar4, 0.0f, 28.0f, 1), "title2");
                        final s380 s380Var2 = s380Var;
                        lkf0.d(s380Var2.b.g(context), dVarH, c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar3), aVar3, 48, 0, 130040);
                        d480.a(null, s380Var2.c, aVar3, 0);
                        lkf0.d(cb40.a(R.string.account_protection__account_protection_description, new Object[0], aVar3), g3w.h(h.j(aVar4, 0.0f, 16.0f, 0.0f, 0.0f, 13), "account_protection_description"), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar3), aVar3, 48, 0, 130040);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        ty0.a(aVar3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        d dVarG = j.g(aVar4, 1.0f);
                        String strA = cb40.a(R.string.common_functions__verify, new Object[0], aVar3);
                        uxs uxsVar = waVar.a;
                        boolean zA2 = aVar3.A(s380Var2);
                        final Function0 function6 = function4;
                        boolean zM = zA2 | aVar3.M(function6);
                        final Function0 function7 = function2;
                        boolean zM2 = zM | aVar3.M(function7);
                        Object objY4 = aVar3.y();
                        if (zM2 || objY4 == a.C0041a.a) {
                            objY4 = new Function0() { // from class: a480
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    if (s380Var2.a == e480.a) {
                                        function6.invoke();
                                    } else {
                                        function7.invoke();
                                    }
                                    f00 f00Var = vgb0.a;
                                    vgb0.a(AnalyticsEvent.FORCE_LOGOUT_VERIFY);
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY4);
                        }
                        aza.a(dVarG, strA, uxsVar, null, null, null, null, "verify_button", (Function0) objY4, null, aVar3, 12582918, 632);
                        aVar3.s();
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 805306416, 188);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z380
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d480.c(dVar2, s380Var, waVar, a390Var, function0, function1, function2, function3, function4, function5, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
