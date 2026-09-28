package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.esotericsoftware.spine.android.SpineView;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class srw {
    public static final ytw a;
    public static final ytw b;
    public static final ytw c;

    static {
        Boolean bool = Boolean.FALSE;
        a = m.b(bool);
        b = m.b(bool);
        c = m.b(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final File file, final File file2, final String str, final int i, final int i2, Long l, final float f, a aVar, final int i3) {
        Long l2;
        b bVar;
        ytw ytwVar;
        ytw ytwVar2;
        a.C0041a.C0042a c0042a;
        b bVar2;
        ytw ytwVar3;
        yka.a.c cVar;
        b bVar3;
        yka.a.d dVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        str.getClass();
        b bVarI = aVar.i(312633661);
        int i4 = i3 | (bVarI.A(file) ? 4 : 2) | (bVarI.A(file2) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.d(i) ? 2048 : 1024) | (bVarI.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(l) ? 131072 : 65536) | (bVarI.c(f) ? 1048576 : 524288);
        if (bVarI.q(i4 & 1, (599187 & i4) != 599186)) {
            bVarI.A0();
            if ((i3 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY == c0042a2) {
                context.getClass();
                try {
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                    z4 = ((double) memoryInfo.totalMem) / 1.073741824E9d >= 4.0d;
                } catch (Exception unused) {
                }
                objY = Boolean.valueOf(z4);
                bVarI.r(objY);
            }
            boolean zBooleanValue = ((Boolean) objY).booleanValue();
            final dq40 dq40Var = new dq40();
            final yp40 yp40Var = new yp40();
            Object objY2 = bVarI.y();
            if (objY2 == c0042a2) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            final ytw ytwVar4 = (ytw) objY2;
            final dq40 dq40Var2 = new dq40();
            dq40Var2.a = "3_Fly";
            float density = ((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * ((mmd) bVarI.O(kna.h)).getDensity();
            Map mapA = ri8.a(i, density);
            Float f2 = (Float) mapA.get("defaultOffsetX");
            float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
            Float f3 = (Float) mapA.get("defaultOffsetY");
            float fFloatValue2 = f3 != null ? f3.floatValue() : 0.0f;
            Float f4 = (Float) mapA.get("ongoingOffsetX");
            float fFloatValue3 = f4 != null ? f4.floatValue() : 0.0f;
            Float f5 = (Float) mapA.get("endOffsetX");
            float fFloatValue4 = f5 != null ? f5.floatValue() : 0.0f;
            Float f6 = (Float) mapA.get("endOffsetY");
            float fFloatValue5 = f6 != null ? f6.floatValue() : 0.0f;
            Float f7 = (Float) mapA.get("heroScaleX");
            float fFloatValue6 = f7 != null ? f7.floatValue() : 4.0f;
            Float f8 = (Float) mapA.get("heroScaleY");
            float fFloatValue7 = f8 != null ? f8.floatValue() : 4.0f;
            float f9 = fFloatValue * density;
            float f10 = i;
            float f11 = fFloatValue2 * f10;
            float f12 = fFloatValue3 * density;
            float f13 = f * f10;
            float f14 = density * fFloatValue4;
            float f15 = fFloatValue5 * f10;
            int i5 = i4 & 458752;
            boolean z5 = i5 == 131072;
            Object objY3 = bVarI.y();
            if (z5 || objY3 == c0042a2) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar5 = (ytw) objY3;
            boolean z6 = i5 == 131072;
            Object objY4 = bVarI.y();
            if (z6 || objY4 == c0042a2) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar6 = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a2) {
                objY5 = m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar7 = (ytw) objY5;
            boolean z7 = str.equals("ROUND_END_WAIT") && !((Boolean) ytwVar6.getValue()).booleanValue();
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            String str2 = str;
            xvf.e(bVarI, str2, new irw(str, dq40Var2, yp40Var, dq40Var, ytwVar7, null));
            xvf.e(bVarI, str2, new krw(ytwVar4, dq40Var2, yp40Var, null));
            xvf.c(ibsVar, new Function1() { // from class: oqw
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [arw, hbs] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((use) obj).getClass();
                    final ytw ytwVar8 = ytwVar4;
                    final dq40 dq40Var3 = dq40Var2;
                    final yp40 yp40Var2 = yp40Var;
                    ?? r4 = new cbs() { // from class: arw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.cbs
                        public final void F0(ibs ibsVar2, s9s.a aVar2) {
                            com.esotericsoftware.spine.android.b bVar4;
                            if (aVar2 != s9s.a.ON_RESUME || (bVar4 = (com.esotericsoftware.spine.android.b) ytwVar8.getValue()) == null) {
                                return;
                            }
                            bVar4.a().m(0, (String) dq40Var3.a, yp40Var2.a);
                        }
                    };
                    s9s lifecycle = ibsVar.getLifecycle();
                    lifecycle.a(r4);
                    return new prw(lifecycle, r4);
                }
            }, bVarI);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a2) {
                objY6 = m.b(Float.valueOf(f9));
                bVarI.r(objY6);
            }
            ytw ytwVar8 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a2) {
                objY7 = m.b(Float.valueOf(f11));
                bVarI.r(objY7);
            }
            ytw ytwVar9 = (ytw) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a2) {
                objY8 = xvf.i(e.a, bVarI);
                bVarI.r(objY8);
            }
            v5b v5bVar = (v5b) objY8;
            boolean zM = ((i4 & 896) == 256) | bVarI.M(ytwVar5) | bVarI.A(v5bVar) | bVarI.c(f9) | bVarI.c(f11) | bVarI.c(f12) | bVarI.c(f13) | ((i4 & 7168) == 2048) | bVarI.c(f14) | bVarI.c(f15);
            Object objY9 = bVarI.y();
            if (zM || objY9 == c0042a2) {
                ytwVar = ytwVar8;
                ytwVar2 = ytwVar7;
                c0042a = c0042a2;
                bVar2 = bVarI;
                ytwVar3 = ytwVar9;
                objY9 = new lrw(str2, v5bVar, f9, f11, ytwVar5, f12, f13, i, ytwVar, ytwVar3, f14, f15, ytwVar2, null);
                str2 = str2;
                bVar2.r(objY9);
            } else {
                ytwVar = ytwVar8;
                ytwVar2 = ytwVar7;
                c0042a = c0042a2;
                bVar2 = bVarI;
                ytwVar3 = ytwVar9;
            }
            l2 = l;
            xvf.g(str2, l2, (Function2) objY9, bVar2);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.d, false);
            int iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS = bVar2.S();
            d dVarC = c.c(bVar2, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar3);
            } else {
                bVar2.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVar2, aivVarC, bVar4);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVar2, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVar2, dVarC, cVar2);
            if (zBooleanValue) {
                bVar2.N(1134380104);
                int i6 = (i4 << 3) & 7168;
                b bVar5 = bVar2;
                dVar = dVar2;
                cVar = cVar2;
                h54.a(0, str2.equals("ROUND_WAITING"), 5000.0f, str2, bVar5, i6 | 384, 1);
                h54.a(5, str2.equals("ROUND_WAITING"), 9000.0f, str2, bVar5, i6 | 390, 0);
                bVar3 = bVar5;
                z = false;
            } else {
                cVar = cVar2;
                bVar3 = bVar2;
                dVar = dVar2;
                z = false;
                bVar3.N(1123745771);
            }
            bVar3.X(z);
            float f16 = i2 == 0 ? 0.0f : 1.0f;
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                f16 = 0.0f;
            }
            d dVarA = dw.a(androidx.compose.ui.graphics.a.c(androidx.compose.foundation.layout.d.a.b(j.e(aVar2, 1.0f), ht.a.a), 0.0f, 0.0f, 0.0f, ((Number) ytwVar.getValue()).floatValue(), ((Number) ytwVar3.getValue()).floatValue(), 0.0f, 0L, null, 524263), f16);
            final float f17 = fFloatValue7;
            final float f18 = fFloatValue6;
            Function1 function1 = new Function1() { // from class: rqw
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, com.esotericsoftware.spine.android.SpineView, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Context context2 = (Context) obj;
                    context2.getClass();
                    final ytw ytwVar10 = ytwVar4;
                    final float f19 = f18;
                    final float f20 = f17;
                    final dq40 dq40Var3 = dq40Var2;
                    final yp40 yp40Var2 = yp40Var;
                    ?? A = SpineView.a(file, file2, context2, new com.esotericsoftware.spine.android.b(new hcb0() { // from class: wqw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.hcb0
                        public final void b(com.esotericsoftware.spine.android.b bVar6) {
                            ytwVar10.setValue(bVar6);
                            bVar6.b().n = f19;
                            bVar6.b().o = f20;
                            bVar6.a().m(0, (String) dq40Var3.a, yp40Var2.a);
                        }
                    }));
                    A.setBoundsProvider(new my90((String) dq40Var3.a));
                    A.setContentMode(zza.a);
                    dq40Var.a = A;
                    return A;
                }
            };
            Object objY10 = bVar3.y();
            if (objY10 == c0042a) {
                z2 = true;
                objY10 = new m6s(ytwVar4, 1 == true ? 1 : 0);
                bVar3.r(objY10);
            } else {
                z2 = true;
            }
            bVar = bVar3;
            androidx.compose.ui.viewinterop.b.a(function1, dVarA, (Function1) objY10, bVar, 384, 0);
            if (z7) {
                bVar.N(1136770266);
                d dVarC2 = j.c(j.g(aVar2, 0.8f), 0.3f);
                aiv aivVarC2 = g75.c(ht.a.c, false);
                int iHashCode2 = Long.hashCode(bVar.T);
                ne00 ne00VarS2 = bVar.S();
                d dVarC3 = c.c(bVar, dVarC2);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, aivVarC2, bVar4);
                hlh0.a(bVar, ne00VarS2, dVar);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a);
                }
                hlh0.a(bVar, dVarC3, cVar);
                c(48, bVar, j.c(j.g(aVar2, 0.4f), 0.4f), pm5.EFFECT_GIF.a());
                bVar.X(z2);
                z3 = false;
            } else {
                z3 = false;
                bVar.N(1123745771);
            }
            bVar.X(z3);
            bVar.X(z2);
        } else {
            l2 = l;
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Long l3 = l2;
            eVarZ.d = new Function2(file, file2, str, i, i2, l3, f, i3) { // from class: uqw
                public final /* synthetic */ File a;
                public final /* synthetic */ File b;
                public final /* synthetic */ String c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ Long f;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    srw.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(ytw<Boolean> ytwVar, boolean z) {
        ytwVar.setValue(Boolean.valueOf(z));
    }

    public static final void c(final int i, a aVar, final d dVar, final String str) {
        str.getClass();
        b bVarI = aVar.i(-1409027471);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                m9n.a aVar2 = new m9n.a(context);
                ap8.a aVar3 = new ap8.a();
                in80 in80Var = in80.a;
                aVar3.b(omy.a((OkHttpClient) in80.c.getValue()), jq40.a(kmh0.class));
                if (Build.VERSION.SDK_INT >= 28) {
                    aVar3.a(new ig0.a());
                } else {
                    aVar3.a(new qhk.a());
                }
                aVar2.c = aVar3.d();
                objY = aVar2.a();
                bVarI.r(objY);
            }
            m9n m9nVar = (m9n) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                nan.a aVar4 = new nan.a(context);
                aVar4.c = str;
                van.a(aVar4);
                objY2 = aVar4.a();
                bVarI.r(objY2);
            }
            fn80.a((nan) objY2, null, dVar, null, null, 0.0f, null, null, m9nVar, bVarI, 432, 1528);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: yqw
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;

                {
                    this.a = str;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    srw.c(qj40.a(49), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean d() {
        return ((Boolean) ((x5a0) c).getValue()).booleanValue();
    }
}
