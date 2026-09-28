package defpackage;

import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
public final class aqw {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final int i, final long j, final int i2, final boolean z, final ytw ytwVar, a aVar, final int i3) {
        int i4;
        boolean z2;
        int i5;
        ytwVar.getClass();
        b bVarI = aVar.i(-472488218);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.M(dVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.d(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            z2 = z;
            i4 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i3) == 0) {
            i4 |= bVarI.M(ytwVar) ? 131072 : 65536;
        }
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new yw90(0L));
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(0.0f);
                bVarI.r(objY2);
            }
            final wd0 wd0Var = (wd0) objY2;
            String messageType = ((MultiplierResponse) ytwVar.getValue()).getMessageType();
            int i6 = i4 & 458752;
            boolean zA = (i6 == 131072) | bVarI.A(wd0Var) | ((i4 & 7168) == 2048);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new rpw(i2, wd0Var, null, ytwVar);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, messageType, (Function2) objY3);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new rq4(ytwVar2, 1);
                bVarI.r(objY4);
            }
            d dVarA = w.a(dVar, (Function1) objY4);
            boolean zA2 = ((i4 & 112) == 32) | ((57344 & i4) == 16384) | bVarI.A(wd0Var) | ((i4 & 896) == 256) | (i6 == 131072);
            Object objY5 = bVarI.y();
            if (zA2 || objY5 == c0042a) {
                final boolean z3 = z2;
                i5 = 0;
                Function1 function1 = new Function1() { // from class: wow
                    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float fIntBitsToFloat;
                        float f;
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        long jFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        boolean z4 = z3;
                        int i7 = i;
                        ytw ytwVar3 = ytwVar2;
                        char c = ' ';
                        if (z4) {
                            if (Float.intBitsToFloat((int) (((yw90) ytwVar3.getValue()).a & 4294967295L)) > 0.0f) {
                                fIntBitsToFloat = Float.intBitsToFloat((int) (((yw90) ytwVar3.getValue()).a & 4294967295L));
                                f = fIntBitsToFloat / i7;
                            } else {
                                f = 0.0f;
                            }
                        } else if (Float.intBitsToFloat((int) (((yw90) ytwVar3.getValue()).a >> 32)) > 0.0f) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (((yw90) ytwVar3.getValue()).a >> 32));
                            f = fIntBitsToFloat / i7;
                        } else {
                            f = 0.0f;
                        }
                        if (i7 <= 0 || f <= 0.0f) {
                            return Unit.a;
                        }
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        if (z4) {
                            f2 = f > fIntBitsToFloat2 ? fIntBitsToFloat2 : f;
                            f3 = 11.25f;
                        } else {
                            f2 = f > fIntBitsToFloat3 ? fIntBitsToFloat3 : f;
                            f3 = 13.25f;
                        }
                        float f6 = f2 / f3;
                        float fFloatValue = ((Number) wd0Var.d()).floatValue() * f;
                        if (i7 >= 0) {
                            int i8 = 0;
                            while (true) {
                                float f7 = i8 * f;
                                if (z4) {
                                    f4 = f7 + fFloatValue;
                                    f5 = fIntBitsToFloat3 + f;
                                } else {
                                    f4 = (f7 - fFloatValue) + fIntBitsToFloat2 + f;
                                    f5 = fIntBitsToFloat2 + f;
                                }
                                float f8 = f4 % f5;
                                if (z4) {
                                    jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fIntBitsToFloat2 / 40.0f)) << c;
                                    jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f8)) & 4294967295L;
                                } else {
                                    jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f8)) << c;
                                    jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat3 / 2.0f)) & 4294967295L;
                                }
                                int i9 = i8;
                                tcf.n0(tcfVar, j, f6, jFloatToRawIntBits | jFloatToRawIntBits2, Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") ? 0.8f : 0.5f, null, 112);
                                if (i9 == i7) {
                                    break;
                                }
                                i8 = i9 + 1;
                                c = ' ';
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY5 = function1;
            } else {
                i5 = 0;
            }
            rxo.b(dVarA, (Function1) objY5, bVarI, i5);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yow
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aqw.a(dVar, i, j, i2, z, ytwVar, (a) obj, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:107:0x044c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0450  */
    /* JADX WARN: Code duplicated, block: B:111:0x045f  */
    /* JADX WARN: Code duplicated, block: B:113:0x046d  */
    /* JADX WARN: Code duplicated, block: B:116:0x048a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x048c  */
    /* JADX WARN: Code duplicated, block: B:120:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:124:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:126:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0513  */
    /* JADX WARN: Code duplicated, block: B:134:0x0523  */
    /* JADX WARN: Code duplicated, block: B:141:0x056c  */
    /* JADX WARN: Code duplicated, block: B:144:0x057e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0595 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x059b  */
    /* JADX WARN: Code duplicated, block: B:153:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:158:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:161:0x05ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:165:0x0621  */
    /* JADX WARN: Code duplicated, block: B:166:0x062b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0648 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x064e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0679  */
    /* JADX WARN: Code duplicated, block: B:179:0x068d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:185:0x06dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:191:0x070b  */
    /* JADX WARN: Code duplicated, block: B:192:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:201:0x097b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0983  */
    /* JADX WARN: Code duplicated, block: B:206:0x0997  */
    /* JADX WARN: Code duplicated, block: B:208:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:214:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:215:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:218:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:220:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:223:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:233:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:236:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:239:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:242:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:245:0x0b5c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:275:0x0d14  */
    /* JADX WARN: Code duplicated, block: B:278:0x0d49  */
    /* JADX WARN: Code duplicated, block: B:279:0x0d4f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0d60  */
    /* JADX WARN: Code duplicated, block: B:283:0x0d63  */
    /* JADX WARN: Code duplicated, block: B:286:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0d94  */
    /* JADX WARN: Code duplicated, block: B:291:0x0da8  */
    /* JADX WARN: Code duplicated, block: B:293:0x0db6  */
    /* JADX WARN: Code duplicated, block: B:299:0x0de6  */
    /* JADX WARN: Code duplicated, block: B:300:0x0dea  */
    /* JADX WARN: Code duplicated, block: B:303:0x0df9  */
    /* JADX WARN: Code duplicated, block: B:305:0x0e07  */
    /* JADX WARN: Code duplicated, block: B:308:0x0e22  */
    /* JADX WARN: Code duplicated, block: B:311:0x0e51  */
    /* JADX WARN: Code duplicated, block: B:312:0x0e54  */
    /* JADX WARN: Code duplicated, block: B:315:0x0e94  */
    /* JADX WARN: Code duplicated, block: B:317:0x0e99  */
    /* JADX WARN: Code duplicated, block: B:320:0x0eba  */
    /* JADX WARN: Code duplicated, block: B:323:0x0ed9  */
    /* JADX WARN: Code duplicated, block: B:325:0x0eeb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:330:0x0f17  */
    /* JADX WARN: Code duplicated, block: B:331:0x0f1b  */
    /* JADX WARN: Code duplicated, block: B:334:0x0f2a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0f38  */
    /* JADX WARN: Code duplicated, block: B:342:0x0f6a  */
    /* JADX WARN: Code duplicated, block: B:343:0x0f6e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0f7d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0f8b  */
    /* JADX WARN: Code duplicated, block: B:351:0x102b  */
    /* JADX WARN: Code duplicated, block: B:354:0x1068  */
    /* JADX WARN: Code duplicated, block: B:357:0x107e  */
    /* JADX WARN: Code duplicated, block: B:358:0x1083  */
    /* JADX WARN: Code duplicated, block: B:361:0x1089  */
    /* JADX WARN: Code duplicated, block: B:362:0x108d  */
    /* JADX WARN: Code duplicated, block: B:364:0x1099  */
    /* JADX WARN: Code duplicated, block: B:365:0x109e  */
    /* JADX WARN: Code duplicated, block: B:368:0x10a3  */
    /* JADX WARN: Code duplicated, block: B:369:0x10a7  */
    /* JADX WARN: Code duplicated, block: B:372:0x10be  */
    /* JADX WARN: Code duplicated, block: B:374:0x10c9  */
    /* JADX WARN: Code duplicated, block: B:377:0x10dc  */
    /* JADX WARN: Code duplicated, block: B:379:0x10f7  */
    /* JADX WARN: Code duplicated, block: B:382:0x1161  */
    /* JADX WARN: Code duplicated, block: B:385:0x1183  */
    /* JADX WARN: Code duplicated, block: B:387:0x1187  */
    /* JADX WARN: Code duplicated, block: B:78:0x027c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0280  */
    /* JADX WARN: Code duplicated, block: B:84:0x029d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0305  */
    /* JADX WARN: Code duplicated, block: B:91:0x037a  */
    /* JADX WARN: Code duplicated, block: B:92:0x037e  */
    /* JADX WARN: Code duplicated, block: B:97:0x039b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r3v12, types: [T, j90] */
    /* JADX WARN: Type inference failed for: r3v58, types: [T, j90] */
    /* JADX WARN: Type inference failed for: r4v130, types: [T, j90] */
    /* JADX WARN: Type inference failed for: r4v131, types: [T, j90] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, j90] */
    /* JADX WARN: Type inference failed for: r8v19, types: [T, j90] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [boolean, int] */
    public static final void b(final ytw ytwVar, final File file, final File file2, final File file3, final goj gojVar, final Function0 function0, final int i, final boolean z, a aVar, final int i2) {
        b bVar;
        float f;
        b bVar2;
        ytw ytwVar2;
        int i3;
        int iHashCode;
        ytw<Boolean> ytwVar3;
        b bVar3;
        boolean zC;
        Object objY;
        qyd0 qyd0Var;
        ytw ytwVar4;
        int i4;
        int iHashCode2;
        boolean zC2;
        Object objY2;
        a.C0041a.C0042a c0042a;
        b bVar4;
        int iHashCode3;
        boolean zC3;
        Object objY3;
        a.C0041a.C0042a c0042a2;
        Object obj;
        ytw ytwVar5;
        Object obj2;
        ytw ytwVar6;
        Object obj3;
        Object obj4;
        final goj gojVar2;
        Object objY4;
        final ytw ytwVar7;
        Object objY5;
        wd0 wd0Var;
        boolean zA;
        Object objY6;
        Object objY7;
        isw iswVar;
        final ibs ibsVar;
        boolean zA2;
        Object objY8;
        final float fC1;
        Object objY9;
        float f2;
        final wd0 wd0Var2;
        ytw ytwVar8;
        boolean zA3;
        ytw ytwVar9;
        Object objY10;
        boolean zC4;
        Object objY11;
        final ytw ytwVar10;
        float f3;
        final ytw ytwVar11;
        boolean zA4;
        Object objY12;
        float f4;
        float f5;
        yka.a.C1350a c1350a;
        final dq40 dq40Var;
        final dq40 dq40Var2;
        ytw ytwVar12;
        int iHashCode4;
        tsr.a aVar2;
        yka.a.b bVar5;
        yka.a.C1350a c1350a2;
        kw0.k kVar;
        int iHashCode5;
        b bVar6;
        yp40 yp40Var;
        Object objY13;
        a.C0041a.C0042a c0042a3;
        ytw ytwVar13;
        Object objY14;
        wd0 wd0Var3;
        Object objY15;
        String str;
        boolean zG;
        n54.a aVar3;
        a.C0041a.C0042a c0042a4;
        wd0 wd0Var4;
        n54.a aVar4;
        d.a aVar5;
        float f6;
        yka.a.b bVar7;
        yka.a.d dVar;
        yka.a.C1350a c1350a3;
        yka.a.c cVar;
        kw0.k kVar2;
        ?? r9;
        float f7;
        int iHashCode6;
        tsr.a aVar6;
        yka.a.C1350a c1350a4;
        int iHashCode7;
        Object objY16;
        ytw ytwVar14;
        float f8;
        yka.a.C1350a c1350a5;
        b bVar8;
        float f9;
        Object objY17;
        int iHashCode8;
        yka.a.C1350a c1350a6;
        int iHashCode9;
        long j;
        qyd0 qyd0Var2;
        ?? r28;
        d.a aVar7;
        wd0 wd0Var5;
        boolean zA5;
        Object objY18;
        String currentMultiplier;
        int length;
        String currentMultiplier2;
        int length2;
        int i5;
        long jD;
        float fD0;
        yka.a.C1350a c1350a7;
        ytwVar.getClass();
        gojVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(2041051617);
        int i6 = i2 | (bVarI.M(ytwVar) ? 4 : 2) | (bVarI.A(file) ? 32 : 16) | (bVarI.A(file2) ? 256 : 128) | (bVarI.A(file3) ? 2048 : 1024) | (bVarI.A(gojVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.d(i) ? 1048576 : 524288) | (bVarI.b(z) ? 8388608 : 4194304);
        if (bVarI.q(i6 & 1, (4793491 & i6) != 4793490)) {
            dq40 dq40Var3 = new dq40();
            dq40Var3.a = m90.a();
            dq40 dq40Var4 = new dq40();
            dq40Var4.a = m90.a();
            m90.a();
            ytw<cj5> ytwVar15 = gojVar.f0;
            ytw<Boolean> ytwVar16 = gojVar.a0;
            ytw<Boolean> ytwVar17 = gojVar.k0;
            Object value = ((x5a0) ytwVar15).getValue();
            Object objY19 = bVarI.y();
            a.C0041a.C0042a c0042a5 = a.C0041a.a;
            if (objY19 == c0042a5) {
                objY19 = m.b("Sporty_Jet_static");
                bVarI.r(objY19);
            }
            final ytw ytwVar18 = (ytw) objY19;
            x5a0 x5a0Var = (x5a0) ytwVar17;
            if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                ytwVar18.setValue("Sporty_Santa_Jet_static");
            } else {
                ytwVar18.setValue("Sporty_Jet_static");
            }
            androidx.compose.runtime.d<ibs> dVar2 = ndt.a;
            final ibs ibsVar2 = (ibs) bVarI.O(dVar2);
            boolean zA6 = bVarI.A(gojVar) | bVarI.A(ibsVar2);
            Object objY20 = bVarI.y();
            if (zA6 || objY20 == c0042a5) {
                objY20 = new Function1() { // from class: apw
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [hbs, zow] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        ((use) obj5).getClass();
                        final goj gojVar3 = gojVar;
                        final ytw ytwVar19 = ytwVar18;
                        ?? r3 = new cbs() { // from class: zow
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar3, s9s.a aVar8) {
                                if (aVar8 == s9s.a.ON_PAUSE) {
                                    boolean zBooleanValue = ((Boolean) ((x5a0) gojVar3.k0).getValue()).booleanValue();
                                    ytw ytwVar20 = ytwVar19;
                                    if (zBooleanValue) {
                                        ytwVar20.setValue("Sporty_Santa_Jet_static");
                                    } else {
                                        ytwVar20.setValue("Sporty_Jet_static");
                                    }
                                }
                            }
                        };
                        ibs ibsVar3 = ibsVar2;
                        ibsVar3.getLifecycle().a(r3);
                        return new ypw(ibsVar3, r3);
                    }
                };
                bVarI.r(objY20);
            }
            xvf.c(ibsVar2, (Function1) objY20, bVarI);
            if (((Boolean) ((x5a0) gojVar.Y).getValue()).booleanValue()) {
                dq40Var3.a = m90.a();
                dq40Var4.a = m90.a();
                m90.a();
            }
            Object objY21 = bVarI.y();
            if (objY21 == c0042a5) {
                f = 0.0f;
                objY21 = m.b(gly.a((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)));
                bVar2 = bVarI;
                bVar2.r(objY21);
            } else {
                f = 0.0f;
                bVar2 = bVarI;
            }
            ytw ytwVar19 = (ytw) objY21;
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            int i7 = ((Configuration) bVar2.O(chfVar)).screenWidthDp;
            Object objY22 = bVar2.y();
            if (objY22 == c0042a5) {
                objY22 = m.b(Boolean.FALSE);
                bVar2.r(objY22);
            }
            ytw ytwVar20 = (ytw) objY22;
            qyd0 qyd0Var3 = kna.h;
            float f10 = i7;
            final float density = f10 * ((mmd) bVar2.O(qyd0Var3)).getDensity();
            final float f11 = i;
            Object objY23 = bVar2.y();
            if (objY23 == c0042a5) {
                objY23 = m.b(gly.a((((long) Float.floatToRawIntBits(density - (density / 1.11f))) << 32) | (((long) Float.floatToRawIntBits(f11 / 2.29f)) & 4294967295L)));
                bVar2.r(objY23);
            }
            ytw ytwVar21 = (ytw) objY23;
            d.a aVar8 = d.a.b;
            d dVarE = j.e(aVar8, 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode10 = Long.hashCode(l2a.a(bVar2));
            ne00 ne00VarO = bVar2.o();
            d dVarC = c.c(bVar2, dVarE);
            yka.k.getClass();
            tsr.a aVar9 = yka.a.b;
            bVar2.D();
            if (bVar2.g()) {
                bVar2.F(aVar9);
            } else {
                bVar2.p();
            }
            yka.a.b bVar9 = yka.a.f;
            hlh0.a(bVar2, aivVarC, bVar9);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVar2, ne00VarO, dVar3);
            yka.a.C1350a c1350a8 = yka.a.g;
            if (bVar2.g()) {
                ytwVar2 = ytwVar19;
                i3 = i6;
            } else {
                ytwVar2 = ytwVar19;
                i3 = i6;
                if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode10))) {
                }
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVar2, dVarC, cVar2);
                float f12 = density - (density / 1.11f);
                d dVarC2 = g.c(aVar8, lla.b(f12, bVar2) + 8.0f, lla.b(f11 / 50.0f, bVar2));
                aiv aivVarC2 = g75.c(n54Var, false);
                iHashCode = Long.hashCode(l2a.a(bVar2));
                ne00 ne00VarO2 = bVar2.o();
                d dVarC3 = c.c(bVar2, dVarC2);
                bVar2.D();
                if (bVar2.g()) {
                    bVar2.F(aVar9);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, aivVarC2, bVar9);
                hlh0.a(bVar2, ne00VarO2, dVar3);
                if (bVar2.g() || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar2, iHashCode, c1350a8);
                }
                hlh0.a(bVar2, dVarC3, cVar2);
                ytwVar3 = ytwVar16;
                bVar3 = bVar2;
                hv30.a(gojVar, function0, false, bVar3, (i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, 4);
                bVar3.s();
                float f13 = f;
                d dVarA = ls7.a(g.c(j.c(j.g(aVar8, 1.0f), 0.83f), lla.b(density - (density / 1.04f), bVar3), 18.0f), j060.e(15.0f, f13, f13, f13, 14));
                zC = bVar3.c(density) | bVar3.c(f11);
                objY = bVar3.y();
                if (zC || objY == c0042a5) {
                    objY = new cpw();
                    bVar3.r(objY);
                }
                d dVarA2 = s3w.a(w.a(dVarA, (Function1) objY), "sj_moving_circles");
                int i8 = ((i3 << 15) & 458752) | 27696;
                qyd0Var = qyd0Var3;
                ytwVar4 = ytwVar2;
                i4 = i3;
                a(dVarA2, 10, new yn60().E1, 1000, true, ytwVar, bVar3, i8);
                bVar3.s();
                d dVarE2 = j.e(aVar8, 1.0f);
                aiv aivVarC3 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(l2a.a(bVar3));
                ne00 ne00VarO3 = bVar3.o();
                d dVarC4 = c.c(bVar3, dVarE2);
                bVar3.D();
                if (bVar3.g()) {
                    bVar3.F(aVar9);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC3, bVar9);
                hlh0.a(bVar3, ne00VarO3, dVar3);
                if (bVar3.g() || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a8);
                }
                hlh0.a(bVar3, dVarC4, cVar2);
                d dVarA3 = ls7.a(g.c(h.j(j.g(j.c(aVar8, 1.0f), 0.92f), 0.0f, 0.0f, lla.b(density / 20.0f, bVar3), 0.0f, 11), lla.b(density / 10.0f, bVar3), lla.b(f11 / 4.7f, bVar3)), j060.e(0.0f, 0.0f, 15.0f, 0.0f, 11));
                zC2 = bVar3.c(density) | bVar3.c(f11);
                objY2 = bVar3.y();
                if (zC2) {
                    c0042a = c0042a5;
                } else {
                    if (objY2 == c0042a) {
                    }
                    c0042a = c0042a5;
                    a.C0041a.C0042a c0042a6 = c0042a;
                    bVar4 = bVar3;
                    a(w.a(dVarA3, (Function1) objY2), 8, new yn60().E1, 1000, false, ytwVar, bVar4, i8);
                    bVar4.s();
                    d dVarE3 = j.e(aVar8, 1.0f);
                    aiv aivVarC4 = g75.c(n54Var, false);
                    iHashCode3 = Long.hashCode(l2a.a(bVar4));
                    ne00 ne00VarO4 = bVar4.o();
                    d dVarC5 = c.c(bVar4, dVarE3);
                    bVar4.D();
                    if (bVar4.g()) {
                        bVar4.F(aVar9);
                    } else {
                        bVar4.p();
                    }
                    hlh0.a(bVar4, aivVarC4, bVar9);
                    hlh0.a(bVar4, ne00VarO4, dVar3);
                    if (bVar4.g() || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
                    }
                    hlh0.a(bVar4, dVarC5, cVar2);
                    d dVarE4 = j.e(aVar8, 1.0f);
                    zC3 = bVar4.c(density) | bVar4.c(f11);
                    objY3 = bVar4.y();
                    c0042a2 = c0042a6;
                    if (zC3 || objY3 == c0042a2) {
                        objY3 = new Function1() { // from class: fpw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                tcf tcfVar = (tcf) obj5;
                                tcfVar.getClass();
                                float f14 = density;
                                float f15 = f14 / 40.0f;
                                float f16 = f11;
                                float f17 = (f16 / 2.4f) * 1.05f;
                                float f18 = f14 / 10.0f;
                                float f19 = (f16 / 2.2f) * 1.05f;
                                float f20 = f14 - f18;
                                float f21 = f14 - f15;
                                float f22 = f16 / 50.0f;
                                float f23 = f14 - (f14 / 1.11f);
                                float f24 = f16 / 16.0f;
                                j90 j90VarA = m90.a();
                                float f25 = (f16 / 60.0f) + f22;
                                Path path = j90VarA.a;
                                j90VarA.a(f15, f25);
                                j90VarA.c(f15, ((f16 / 2.0f) - (f16 / 17.0f)) * 1.05f);
                                RectF rectF = j90VarA.b;
                                if (rectF == null) {
                                    rectF = new RectF();
                                    j90VarA.b = rectF;
                                }
                                rectF.set(f15, f17, f18, f19);
                                RectF rectF2 = j90VarA.b;
                                rectF2.getClass();
                                path.arcTo(rectF2, 90.0f, 90.0f, true);
                                j90VarA.a(f14 / 16.0f, f19);
                                float f26 = f14 - (f14 / 18.0f);
                                j90VarA.c(f26, f19);
                                RectF rectF3 = j90VarA.b;
                                if (rectF3 == null) {
                                    rectF3 = new RectF();
                                    j90VarA.b = rectF3;
                                }
                                rectF3.set(f20, f17, f21, f19);
                                RectF rectF4 = j90VarA.b;
                                rectF4.getClass();
                                path.arcTo(rectF4, 0.0f, 90.0f, true);
                                RectF rectF5 = j90VarA.b;
                                if (rectF5 == null) {
                                    rectF5 = new RectF();
                                    j90VarA.b = rectF5;
                                }
                                rectF5.set(f20, f17, f21, f19);
                                RectF rectF6 = j90VarA.b;
                                rectF6.getClass();
                                path.arcTo(rectF6, 270.0f, 90.0f, true);
                                j90VarA.a(f26, f17);
                                j90VarA.c(f23, f17);
                                j90VarA.a(f23, f17);
                                j90VarA.c(f23, f25);
                                RectF rectF7 = j90VarA.b;
                                if (rectF7 == null) {
                                    rectF7 = new RectF();
                                    j90VarA.b = rectF7;
                                }
                                rectF7.set(f15, f22, f23, f24);
                                RectF rectF8 = j90VarA.b;
                                rectF8.getClass();
                                path.arcTo(rectF8, 270.0f, 90.0f, true);
                                RectF rectF9 = j90VarA.b;
                                if (rectF9 == null) {
                                    rectF9 = new RectF();
                                    j90VarA.b = rectF9;
                                }
                                rectF9.set(f15, f22, f23, f24);
                                RectF rectF10 = j90VarA.b;
                                rectF10.getClass();
                                path.arcTo(rectF10, 180.0f, 90.0f, true);
                                tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                                return Unit.a;
                            }
                        };
                        bVar4.r(objY3);
                    }
                    rxo.b(dVarE4, (Function1) objY3, bVar4, 6);
                    String str2 = "ROUND_WAITING";
                    if (!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_WAITING") || Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_PRE_START")) {
                        Boolean bool = Boolean.FALSE;
                        ((x5a0) ytwVar3).setValue(bool);
                        if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                            Object obj5 = "Sporty_Santa_Jet_static";
                            ytwVar5 = ytwVar18;
                            ytwVar5.setValue(obj5);
                            obj2 = "Sporty_Jet_static";
                            obj = obj5;
                        } else {
                            Object obj6 = "Sporty_Jet_static";
                            obj = "Sporty_Santa_Jet_static";
                            ytwVar5 = ytwVar18;
                            ytwVar5.setValue(obj6);
                            obj2 = obj6;
                        }
                        ytwVar6 = ytwVar20;
                        ytwVar6.setValue(bool);
                        obj4 = obj;
                        obj3 = obj2;
                    } else {
                        obj3 = "Sporty_Jet_static";
                        obj4 = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar6 = ytwVar20;
                    }
                    bVar4.s();
                    String str3 = "ROUND_END_WAIT";
                    if ((!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_END_WAIT")) && ((Boolean) ((x5a0) gojVar.Z).getValue()).booleanValue()) {
                        bVar4.N(1124857951);
                        objY4 = bVar4.y();
                        if (objY4 == c0042a2) {
                            objY4 = m.b(Boolean.FALSE);
                            bVar4.r(objY4);
                        }
                        ytwVar7 = (ytw) objY4;
                        objY5 = bVar4.y();
                        if (objY5 == c0042a2) {
                            objY5 = ee0.a(0.0f);
                            bVar4.r(objY5);
                        }
                        wd0Var = (wd0) objY5;
                        Unit unit = Unit.a;
                        zA = bVar4.A(wd0Var);
                        objY6 = bVar4.y();
                        if (zA || objY6 == c0042a2) {
                            objY6 = new vpw(wd0Var, null);
                            bVar4.r(objY6);
                        }
                        xvf.e(bVar4, unit, (Function2) objY6);
                        objY7 = bVar4.y();
                        if (objY7 == c0042a2) {
                            objY7 = androidx.compose.runtime.j.a(0.0f);
                            bVar4.r(objY7);
                        }
                        iswVar = (isw) objY7;
                        if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                            ytwVar5.setValue("Sporty_Santa_Jet");
                        } else {
                            ytwVar5.setValue("Sporty_Jet");
                        }
                        ibsVar = (ibs) bVar4.O(dVar2);
                        ytwVar6.setValue(Boolean.TRUE);
                        zA2 = bVar4.A(ibsVar);
                        objY8 = bVar4.y();
                        if (zA2 || objY8 == c0042a2) {
                            objY8 = new Function1() { // from class: hpw
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    ((use) obj7).getClass();
                                    final ytw ytwVar22 = ytwVar7;
                                    ?? r2 = new cbs() { // from class: tow
                                        @Override // defpackage.cbs
                                        public final void F0(ibs ibsVar3, s9s.a aVar10) {
                                            if (aVar10 == s9s.a.ON_RESUME) {
                                                ytwVar22.setValue(Boolean.TRUE);
                                            }
                                        }
                                    };
                                    ibs ibsVar3 = ibsVar;
                                    ibsVar3.getLifecycle().a(r2);
                                    return new zpw(ibsVar3, r2);
                                }
                            };
                            bVar4.r(objY8);
                        }
                        xvf.c(ibsVar, (Function1) objY8, bVar4);
                        mmd mmdVar = (mmd) bVar4.O(qyd0Var);
                        bVar4.N(-1349151355);
                        fC1 = mmdVar.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                        bVar4.H();
                        objY9 = bVar4.y();
                        if (objY9 == c0042a2) {
                            f2 = 0.0f;
                            objY9 = ee0.a(0.0f);
                            bVar4.r(objY9);
                        } else {
                            f2 = 0.0f;
                        }
                        wd0Var2 = (wd0) objY9;
                        ytwVar8 = ytwVar5;
                        Boolean bool2 = (Boolean) ytwVar7.getValue();
                        bool2.getClass();
                        zA3 = bVar4.A(wd0Var2);
                        ytwVar9 = ytwVar6;
                        objY10 = bVar4.y();
                        if (zA3 || objY10 == c0042a2) {
                            objY10 = new wpw(wd0Var2, ytwVar7, null);
                            bVar4.r(objY10);
                        }
                        xvf.e(bVar4, bool2, (Function2) objY10);
                        d dVarI = j.i(j.g(aVar8, 1.0f), mmdVar.v1(f11));
                        zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                        objY11 = bVar4.y();
                        if (!zC4 || objY11 == c0042a2) {
                            ytwVar10 = ytwVar21;
                            Function1 function1 = new Function1() { // from class: jpw
                                /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                Caused by: java.lang.NullPointerException
                                 */
                                /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                                Caused by: java.lang.NullPointerException
                                 */
                                /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                                Caused by: java.lang.NullPointerException
                                 */
                                /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                                Caused by: java.lang.NullPointerException
                                 */
                                /*  JADX ERROR: Types fix failed
                                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                    Caused by: java.lang.NullPointerException
                                    */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object r18) {
                                    /*
                                        Method dump skipped, instruction units count: 361
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                                }
                            };
                            f3 = fC1;
                            gojVar2 = gojVar;
                            ytwVar11 = ytwVar;
                            bVar4.r(function1);
                            objY11 = function1;
                        } else {
                            ytwVar11 = ytwVar;
                            f3 = fC1;
                            ytwVar10 = ytwVar21;
                            gojVar2 = gojVar;
                        }
                        rxo.b(dVarI, (Function1) objY11, bVar4, 0);
                        Boolean bool3 = (Boolean) ytwVar7.getValue();
                        bool3.getClass();
                        zA4 = bVar4.A(gojVar2);
                        objY12 = bVar4.y();
                        if (zA4 || objY12 == c0042a2) {
                            objY12 = new xpw(gojVar2, iswVar, null);
                            bVar4.r(objY12);
                        }
                        xvf.e(bVar4, bool3, (Function2) objY12);
                        f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                        f5 = f11 / 2.29f;
                        if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                            bVar4.N(1129739397);
                            egn egnVarB = kgn.b("Path infinite transition", bVar4, 0);
                            float f14 = 0.398958f * f4;
                            float f15 = 0.4625f * f4 * 1.127f;
                            wkf wkfVar = xkf.d;
                            float f16 = f3;
                            gzg0 gzg0VarE = yi0.e(2350, 0, wkfVar, 2);
                            l850 l850Var = l850.b;
                            egn.a aVarA = kgn.a(egnVarB, f14, f15, yi0.a(gzg0VarE, l850Var, 0L, 4), "Path animation", bVar4, 28680, 0);
                            c1350a = c1350a8;
                            egn.a aVarA2 = kgn.a(egnVarB, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar, 2), l850Var, 0L, 4), "Path animation", bVar4, 28680, 0);
                            egn.a aVarA3 = kgn.a(egnVarB, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar, 2), l850Var, 0L, 4), "Path animation", bVar4, 28680, 0);
                            egn.a aVarA4 = kgn.a(egnVarB, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar, 2), l850Var, 0L, 4), "Path animation", bVar4, 28680, 0);
                            bVar4 = bVar4;
                            ?? A = m90.a();
                            float f17 = f16 - (f16 / 1.11f);
                            A.a(f17, f5);
                            A.f(Math.abs(((Number) aVarA3.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA4.getValue()).floatValue()), Math.abs(((Number) aVarA.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA2.getValue()).floatValue()));
                            A.c(Math.abs(((Number) aVarA.getValue()).floatValue()) * 1.127f, f5);
                            dq40Var = dq40Var3;
                            dq40Var.a = A;
                            ytwVar12 = ytwVar4;
                            e(l((((long) Float.floatToRawIntBits((f16 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA3.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA4.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA2.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                            ?? A2 = m90.a();
                            A2.a(f17, f5);
                            A2.f(Math.abs(((Number) aVarA3.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA4.getValue()).floatValue()), Math.abs(((Number) aVarA.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA2.getValue()).floatValue()));
                            dq40Var2 = dq40Var4;
                            dq40Var2.a = A2;
                            bVar4.H();
                        } else {
                            c1350a = r15;
                            dq40Var = dq40Var3;
                            dq40Var2 = dq40Var4;
                            ytwVar12 = ytwVar4;
                            bVar4.N(1108100033);
                            bVar4.H();
                        }
                        rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                tcf tcfVar = (tcf) obj7;
                                tcfVar.getClass();
                                ytw ytwVar22 = ytwVar11;
                                if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                                    tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                                    tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                                }
                                return Unit.a;
                            }
                        }, bVar4, 6);
                        bVar4.H();
                    } else {
                        gojVar2 = gojVar;
                        str2 = "ROUND_WAITING";
                        ytwVar9 = ytwVar6;
                        c0042a2 = c0042a2;
                        aVar9 = aVar9;
                        bVar9 = bVar9;
                        c1350a = c1350a8;
                        ytwVar3 = ytwVar3;
                        ytwVar10 = ytwVar21;
                        qyd0Var = qyd0Var;
                        f2 = 0.0f;
                        ytwVar11 = ytwVar;
                        str3 = "ROUND_END_WAIT";
                        ytwVar8 = ytwVar5;
                        ytwVar12 = ytwVar4;
                        bVar4.N(1133591705);
                        bVar4.H();
                        ytwVar10.setValue(new gly((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f11 / 2.29f)) & 4294967295L)));
                        if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                            ytwVar8.setValue(obj4);
                        } else {
                            ytwVar8.setValue(obj3);
                        }
                    }
                    d dVarE5 = j.e(aVar8, 1.0f);
                    aiv aivVarC5 = g75.c(n54Var, false);
                    iHashCode4 = Long.hashCode(l2a.a(bVar4));
                    ne00 ne00VarO5 = bVar4.o();
                    d dVarC6 = c.c(bVar4, dVarE5);
                    bVar4.D();
                    if (bVar4.g()) {
                        aVar2 = aVar9;
                        bVar4.F(aVar2);
                    } else {
                        aVar2 = aVar9;
                        bVar4.p();
                    }
                    bVar5 = bVar9;
                    hlh0.a(bVar4, aivVarC5, bVar5);
                    hlh0.a(bVar4, ne00VarO5, dVar3);
                    if (bVar4.g() && Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode4))) {
                        c1350a2 = c1350a;
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar4, dVarC6, cVar2);
                    d dVarB = androidx.compose.foundation.layout.d.a.b(j.e(aVar8, 1.0f), n54Var);
                    n54.a aVar10 = ht.a.m;
                    kVar = kw0.c;
                    i78 i78VarA = g78.a(kVar, aVar10, bVar4, 0);
                    iHashCode5 = Long.hashCode(l2a.a(bVar4));
                    ne00 ne00VarO6 = bVar4.o();
                    d dVarC7 = c.c(bVar4, dVarB);
                    bVar4.D();
                    if (bVar4.g()) {
                        bVar4.F(aVar2);
                    } else {
                        bVar4.p();
                    }
                    hlh0.a(bVar4, i78VarA, bVar5);
                    hlh0.a(bVar4, ne00VarO6, dVar3);
                    if (bVar4.g() || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode5))) {
                        n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
                    }
                    hlh0.a(bVar4, dVarC7, cVar2);
                    if (file == null && file.exists() && file2 != null && file2.exists() && file3 != null && file3.exists()) {
                        bVar4.N(81729142);
                        b bVar10 = bVar4;
                        a9p.a(file, file2, (String) ytwVar8.getValue(), file3, ((Boolean) ytwVar9.getValue()).booleanValue(), c(ytwVar12), ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue(), ((MultiplierResponse) ytwVar11.getValue()).getMessageType().equals(str3), i(ytwVar10), ((MultiplierResponse) ytwVar11.getValue()).getCurrentMultiplier(), ((Boolean) ((x5a0) gojVar2.b0).getValue()).booleanValue(), ytwVar17, null, ((Boolean) ((x5a0) gojVar2.m0).getValue()).booleanValue(), bVar10, ((i4 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | (i4 & 7168));
                        bVar6 = bVar10;
                    } else {
                        bVar6 = bVar4;
                        bVar6.N(55164684);
                    }
                    bVar6.H();
                    bVar6.s();
                    bVar6.s();
                    yp40Var = new yp40();
                    objY13 = bVar6.y();
                    c0042a3 = c0042a2;
                    if (objY13 == c0042a3) {
                        objY13 = m.b(Boolean.FALSE);
                        bVar6.r(objY13);
                    }
                    ytwVar13 = (ytw) objY13;
                    objY14 = bVar6.y();
                    if (objY14 == c0042a3) {
                        objY14 = ee0.a(f2);
                        bVar6.r(objY14);
                    }
                    wd0Var3 = (wd0) objY14;
                    objY15 = bVar6.y();
                    if (objY15 == c0042a3) {
                        objY15 = m.b(Boolean.TRUE);
                        bVar6.r(objY15);
                    }
                    ((ytw) objY15).setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")));
                    d(ytwVar13, Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING"));
                    str = str2;
                    zG = Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str);
                    aVar3 = ht.a.n;
                    if (zG || z) {
                        c0042a4 = c0042a3;
                        wd0Var4 = wd0Var3;
                        aVar4 = aVar3;
                        aVar5 = aVar8;
                        f6 = f2;
                        bVar7 = bVar5;
                        dVar = r4;
                        c1350a3 = c1350a2;
                        cVar = r5;
                        kVar2 = kVar;
                        bVar6.N(1108100033);
                    } else {
                        bVar6.N(1135865803);
                        Object objY24 = bVar6.y();
                        if (objY24 == c0042a3) {
                            objY24 = androidx.compose.runtime.j.a(((MultiplierResponse) ytwVar.getValue()).getMillisLeft());
                            bVar6.r(objY24);
                        }
                        isw iswVar2 = (isw) objY24;
                        float f18 = f(iswVar2);
                        xvf.e(bVar6, Unit.a, new spw(yp40Var, iswVar2, null));
                        d dVarG = j.g(aVar8, 1.0f);
                        i78 i78VarA2 = g78.a(kVar, aVar3, bVar6, 48);
                        int iHashCode11 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO7 = bVar6.o();
                        d dVarC8 = c.c(bVar6, dVarG);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar2);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, i78VarA2, bVar5);
                        hlh0.a(bVar6, ne00VarO7, dVar3);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode11))) {
                            c1350a7 = c1350a2;
                            n30.a(iHashCode11, bVar6, iHashCode11, c1350a7);
                        } else {
                            c1350a7 = c1350a2;
                        }
                        hlh0.a(bVar6, dVarC8, cVar2);
                        float f19 = f2;
                        d dVarA4 = s3w.a(h.i(aVar8, 3.0f, f19, f19, 16.0f), "sj_powering_up");
                        b bVar11 = bVar6;
                        wd0Var4 = wd0Var3;
                        c0042a4 = c0042a3;
                        dVar = dVar3;
                        aVar5 = aVar8;
                        f6 = 0.0f;
                        bVar7 = bVar5;
                        c1350a3 = c1350a7;
                        cVar = cVar2;
                        kVar2 = kVar;
                        lkf0.b(op5.c(op5.a, pwo.e(R.string.power_up_next_round_cms, bVar6), pwo.e(R.string.powering_up_for_next_round, bVar6)), dVarA4, j58.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVar6.O(ni60.b)).d, R.dimen._12ssp, bVar6), bVar11, 384, 0, 65528);
                        float f20 = 0.55f * f10;
                        float totalMillis = Float.isNaN(f18 / ((float) ((MultiplierResponse) ytwVar.getValue()).getTotalMillis())) ? 0.0f : f18 / ((MultiplierResponse) ytwVar.getValue()).getTotalMillis();
                        boolean zC5 = bVar11.c(totalMillis);
                        Object objY25 = bVar11.y();
                        if (zC5 || objY25 == c0042a4) {
                            objY25 = new mhc0(totalMillis);
                            bVar11.r(objY25);
                        }
                        Function0 function2 = (Function0) objY25;
                        aVar4 = aVar3;
                        d dVarA5 = s3w.a(j.i(j.w(aVar5, f20), 8.0f).n(new HorizontalAlignElement(aVar4)), "sj_powering_up_progress");
                        long jQ = ((cj5) value).q();
                        long j2 = j58.l;
                        Object objY26 = bVar11.y();
                        if (objY26 == c0042a4) {
                            objY26 = new npw();
                            bVar11.r(objY26);
                        }
                        q330.c(function2, dVarA5, jQ, j2, 0, 0.0f, (Function1) objY26, bVar11, 1575936, 48);
                        bVar6 = bVar11;
                        bVar6.s();
                    }
                    bVar6.H();
                    if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                        r9 = 0;
                    } else {
                        r9 = 0;
                        yp40Var.a = false;
                    }
                    if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                        f7 = 1.0f;
                    } else {
                        f7 = f6;
                    }
                    d dVarE6 = j.e(dw.a(aVar5, f7), 1.0f);
                    n54 n54Var2 = ht.a.e;
                    aiv aivVarC6 = g75.c(n54Var2, r9);
                    iHashCode6 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO8 = bVar6.o();
                    d dVarC9 = c.c(bVar6, dVarE6);
                    bVar6.D();
                    if (bVar6.g()) {
                        aVar6 = aVar2;
                        bVar6.F(aVar6);
                    } else {
                        aVar6 = aVar2;
                        bVar6.p();
                    }
                    yka.a.b bVar12 = bVar7;
                    hlh0.a(bVar6, aivVarC6, bVar12);
                    yka.a.d dVar4 = dVar;
                    hlh0.a(bVar6, ne00VarO8, dVar4);
                    if (bVar6.g() && Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode6))) {
                        c1350a4 = c1350a3;
                    } else {
                        c1350a4 = c1350a3;
                        n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
                    }
                    yka.a.c cVar3 = cVar;
                    hlh0.a(bVar6, dVarC9, cVar3);
                    kw0.k kVar3 = kVar2;
                    i78 i78VarA3 = g78.a(kVar3, aVar4, bVar6, 48);
                    iHashCode7 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO9 = bVar6.o();
                    d dVarC10 = c.c(bVar6, aVar5);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar6);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, i78VarA3, bVar12);
                    hlh0.a(bVar6, ne00VarO9, dVar4);
                    if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode7))) {
                        n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
                    }
                    hlh0.a(bVar6, dVarC10, cVar3);
                    ty0.a(bVar6, j.i(aVar5, 16.0f));
                    bVar6.s();
                    bVar6.s();
                    objY16 = bVar6.y();
                    if (objY16 == c0042a4) {
                        objY16 = m.b(Boolean.FALSE);
                        bVar6.r(objY16);
                    }
                    ytwVar14 = (ytw) objY16;
                    String str4 = str3;
                    ytwVar14.setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str4)));
                    if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                        f8 = 1.0f;
                    } else {
                        f8 = 0.2f;
                    }
                    n54.a aVar11 = aVar4;
                    c1350a5 = c1350a4;
                    twd0 twd0VarB = xe0.b(f8, yi0.e(100, r9, xkf.a, 2), "scaleAnimation", null, bVar6, 3072, 20);
                    bVar8 = bVar6;
                    if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                        f9 = 1.0f;
                    } else {
                        f9 = f6;
                    }
                    twd0 twd0VarB2 = xe0.b(f9, yi0.e(100, r9, null, 6), "alphaAnimation", null, bVar8, 3120, 20);
                    Unit unit2 = Unit.a;
                    objY17 = bVar8.y();
                    if (objY17 == c0042a4) {
                        objY17 = new tpw(ytwVar14, null);
                        bVar8.r(objY17);
                    }
                    xvf.e(bVar8, unit2, (Function2) objY17);
                    d dVarE7 = j.e(dw.a(aVar5, ((!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str4)) && !z) ? 1.0f : f6), 1.0f);
                    aiv aivVarC7 = g75.c(n54Var2, r9);
                    iHashCode8 = Long.hashCode(l2a.a(bVar8));
                    ne00 ne00VarO10 = bVar8.o();
                    d dVarC11 = c.c(bVar8, dVarE7);
                    bVar8.D();
                    if (bVar8.g()) {
                        bVar8.F(aVar6);
                    } else {
                        bVar8.p();
                    }
                    hlh0.a(bVar8, aivVarC7, bVar12);
                    hlh0.a(bVar8, ne00VarO10, dVar4);
                    if (bVar8.g() && Intrinsics.g(bVar8.y(), Integer.valueOf(iHashCode8))) {
                        c1350a6 = c1350a5;
                    } else {
                        c1350a6 = c1350a5;
                        n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
                    }
                    hlh0.a(bVar8, dVarC11, cVar3);
                    i78 i78VarA4 = g78.a(kVar3, aVar11, bVar8, 48);
                    iHashCode9 = Long.hashCode(l2a.a(bVar8));
                    ne00 ne00VarO11 = bVar8.o();
                    d dVarC12 = c.c(bVar8, aVar5);
                    bVar8.D();
                    if (bVar8.g()) {
                        bVar8.F(aVar6);
                    } else {
                        bVar8.p();
                    }
                    hlh0.a(bVar8, i78VarA4, bVar12);
                    hlh0.a(bVar8, ne00VarO11, dVar4);
                    if (bVar8.g() || !Intrinsics.g(bVar8.y(), Integer.valueOf(iHashCode9))) {
                        n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
                    }
                    hlh0.a(bVar8, dVarC12, cVar3);
                    String strC = op5.c(op5.a, pwo.e(R.string.flew_away_cms, bVar8), "FLEW AWAY!");
                    j = j58.f;
                    qyd0Var2 = ni60.b;
                    imf0 imf0VarG = ni60.g(((sfd0) bVar8.O(qyd0Var2)).d, R.dimen._16ssp, bVar8);
                    float fG = g(twd0VarB);
                    r28 = r9;
                    a.C0041a.C0042a c0042a7 = c0042a4;
                    aVar7 = aVar5;
                    lkf0.b(strC, h.j(dw.a(bz60.a(aVar5, fG, fG), h(twd0VarB2)), 3.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, bVar8, 384, 0, 65528);
                    bVar = bVar8;
                    if (((Boolean) ((x5a0) gojVar.j0).getValue()).booleanValue()) {
                        bVar.N(-607701549);
                        String strA = yk10.a(((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier(), "x");
                        d dVarA6 = s3w.a(h.j(aVar7, 3.0f, 0.0f, 0.0f, 0.0f, 14), "sj_current_multiplier");
                        if (!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                            j = j58.g;
                        }
                        imf0 imf0Var = ((sfd0) bVar.O(qyd0Var2)).e;
                        currentMultiplier = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                        if (currentMultiplier != null) {
                            length = currentMultiplier.length();
                        } else {
                            length = r28 == true ? 1 : 0;
                        }
                        if (length >= 9) {
                            i5 = R.dimen._40ssp;
                        } else {
                            currentMultiplier2 = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                            if (currentMultiplier2 != null) {
                                length2 = currentMultiplier2.length();
                            } else {
                                length2 = r28 == true ? 1 : 0;
                            }
                            if (length2 >= 7) {
                                i5 = R.dimen._50ssp;
                            } else {
                                i5 = R.dimen._60ssp;
                            }
                        }
                        imf0 imf0VarG2 = ni60.g(imf0Var, i5, bVar);
                        if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                            jD = r58.d(2348810239L);
                        } else {
                            jD = j58.g;
                        }
                        long j3 = jD;
                        if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                            bVar.N(-1266493405);
                            fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(11));
                            bVar.H();
                        } else {
                            bVar.N(-606511552);
                            fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(r28 == true ? 1 : 0));
                            bVar.H();
                        }
                        lkf0.b(strA, dVarA6, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0VarG2, 0L, 0L, null, null, null, 0L, null, new ix80(fD0, j3, 0L), null, 0, 0L, null, null, 16769023), bVar, 0, 0, 65528);
                        bVar = bVar;
                    } else {
                        bVar.N(-639667478);
                    }
                    bVar.H();
                    bVar.s();
                    bVar.s();
                    Boolean bool4 = (Boolean) ytwVar13.getValue();
                    bool4.getClass();
                    wd0Var5 = wd0Var4;
                    zA5 = bVar.A(wd0Var5);
                    objY18 = bVar.y();
                    if (zA5 || objY18 == c0042a7) {
                        objY18 = new upw(wd0Var5, ytwVar13, null);
                        bVar.r(objY18);
                    }
                    xvf.e(bVar, bool4, (Function2) objY18);
                }
                c0042a = c0042a5;
                objY2 = new dpw();
                bVar3.r(objY2);
                c0042a = c0042a5;
                a.C0041a.C0042a c0042a8 = c0042a;
                bVar4 = bVar3;
                a(w.a(dVarA3, (Function1) objY2), 8, new yn60().E1, 1000, false, ytwVar, bVar4, i8);
                bVar4.s();
                d dVarE8 = j.e(aVar8, 1.0f);
                aiv aivVarC8 = g75.c(n54Var, false);
                iHashCode3 = Long.hashCode(l2a.a(bVar4));
                ne00 ne00VarO12 = bVar4.o();
                d dVarC13 = c.c(bVar4, dVarE8);
                bVar4.D();
                if (bVar4.g()) {
                    bVar4.F(aVar9);
                } else {
                    bVar4.p();
                }
                hlh0.a(bVar4, aivVarC8, bVar9);
                hlh0.a(bVar4, ne00VarO12, dVar3);
                if (bVar4.g()) {
                    n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
                } else {
                    n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
                }
                hlh0.a(bVar4, dVarC13, cVar2);
                d dVarE9 = j.e(aVar8, 1.0f);
                zC3 = bVar4.c(density) | bVar4.c(f11);
                objY3 = bVar4.y();
                c0042a2 = c0042a8;
                if (zC3) {
                    objY3 = new Function1() { // from class: fpw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            tcf tcfVar = (tcf) obj7;
                            tcfVar.getClass();
                            float f110 = density;
                            float f111 = f110 / 40.0f;
                            float f112 = f11;
                            float f113 = (f112 / 2.4f) * 1.05f;
                            float f114 = f110 / 10.0f;
                            float f115 = (f112 / 2.2f) * 1.05f;
                            float f21 = f110 - f114;
                            float f22 = f110 - f111;
                            float f23 = f112 / 50.0f;
                            float f24 = f110 - (f110 / 1.11f);
                            float f25 = f112 / 16.0f;
                            j90 j90VarA = m90.a();
                            float f26 = (f112 / 60.0f) + f23;
                            Path path = j90VarA.a;
                            j90VarA.a(f111, f26);
                            j90VarA.c(f111, ((f112 / 2.0f) - (f112 / 17.0f)) * 1.05f);
                            RectF rectF = j90VarA.b;
                            if (rectF == null) {
                                rectF = new RectF();
                                j90VarA.b = rectF;
                            }
                            rectF.set(f111, f113, f114, f115);
                            RectF rectF2 = j90VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, 90.0f, 90.0f, true);
                            j90VarA.a(f110 / 16.0f, f115);
                            float f27 = f110 - (f110 / 18.0f);
                            j90VarA.c(f27, f115);
                            RectF rectF3 = j90VarA.b;
                            if (rectF3 == null) {
                                rectF3 = new RectF();
                                j90VarA.b = rectF3;
                            }
                            rectF3.set(f21, f113, f22, f115);
                            RectF rectF4 = j90VarA.b;
                            rectF4.getClass();
                            path.arcTo(rectF4, 0.0f, 90.0f, true);
                            RectF rectF5 = j90VarA.b;
                            if (rectF5 == null) {
                                rectF5 = new RectF();
                                j90VarA.b = rectF5;
                            }
                            rectF5.set(f21, f113, f22, f115);
                            RectF rectF6 = j90VarA.b;
                            rectF6.getClass();
                            path.arcTo(rectF6, 270.0f, 90.0f, true);
                            j90VarA.a(f27, f113);
                            j90VarA.c(f24, f113);
                            j90VarA.a(f24, f113);
                            j90VarA.c(f24, f26);
                            RectF rectF7 = j90VarA.b;
                            if (rectF7 == null) {
                                rectF7 = new RectF();
                                j90VarA.b = rectF7;
                            }
                            rectF7.set(f111, f23, f24, f25);
                            RectF rectF8 = j90VarA.b;
                            rectF8.getClass();
                            path.arcTo(rectF8, 270.0f, 90.0f, true);
                            RectF rectF9 = j90VarA.b;
                            if (rectF9 == null) {
                                rectF9 = new RectF();
                                j90VarA.b = rectF9;
                            }
                            rectF9.set(f111, f23, f24, f25);
                            RectF rectF10 = j90VarA.b;
                            rectF10.getClass();
                            path.arcTo(rectF10, 180.0f, 90.0f, true);
                            tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                            return Unit.a;
                        }
                    };
                    bVar4.r(objY3);
                } else {
                    objY3 = new Function1() { // from class: fpw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            tcf tcfVar = (tcf) obj7;
                            tcfVar.getClass();
                            float f110 = density;
                            float f111 = f110 / 40.0f;
                            float f112 = f11;
                            float f113 = (f112 / 2.4f) * 1.05f;
                            float f114 = f110 / 10.0f;
                            float f115 = (f112 / 2.2f) * 1.05f;
                            float f21 = f110 - f114;
                            float f22 = f110 - f111;
                            float f23 = f112 / 50.0f;
                            float f24 = f110 - (f110 / 1.11f);
                            float f25 = f112 / 16.0f;
                            j90 j90VarA = m90.a();
                            float f26 = (f112 / 60.0f) + f23;
                            Path path = j90VarA.a;
                            j90VarA.a(f111, f26);
                            j90VarA.c(f111, ((f112 / 2.0f) - (f112 / 17.0f)) * 1.05f);
                            RectF rectF = j90VarA.b;
                            if (rectF == null) {
                                rectF = new RectF();
                                j90VarA.b = rectF;
                            }
                            rectF.set(f111, f113, f114, f115);
                            RectF rectF2 = j90VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, 90.0f, 90.0f, true);
                            j90VarA.a(f110 / 16.0f, f115);
                            float f27 = f110 - (f110 / 18.0f);
                            j90VarA.c(f27, f115);
                            RectF rectF3 = j90VarA.b;
                            if (rectF3 == null) {
                                rectF3 = new RectF();
                                j90VarA.b = rectF3;
                            }
                            rectF3.set(f21, f113, f22, f115);
                            RectF rectF4 = j90VarA.b;
                            rectF4.getClass();
                            path.arcTo(rectF4, 0.0f, 90.0f, true);
                            RectF rectF5 = j90VarA.b;
                            if (rectF5 == null) {
                                rectF5 = new RectF();
                                j90VarA.b = rectF5;
                            }
                            rectF5.set(f21, f113, f22, f115);
                            RectF rectF6 = j90VarA.b;
                            rectF6.getClass();
                            path.arcTo(rectF6, 270.0f, 90.0f, true);
                            j90VarA.a(f27, f113);
                            j90VarA.c(f24, f113);
                            j90VarA.a(f24, f113);
                            j90VarA.c(f24, f26);
                            RectF rectF7 = j90VarA.b;
                            if (rectF7 == null) {
                                rectF7 = new RectF();
                                j90VarA.b = rectF7;
                            }
                            rectF7.set(f111, f23, f24, f25);
                            RectF rectF8 = j90VarA.b;
                            rectF8.getClass();
                            path.arcTo(rectF8, 270.0f, 90.0f, true);
                            RectF rectF9 = j90VarA.b;
                            if (rectF9 == null) {
                                rectF9 = new RectF();
                                j90VarA.b = rectF9;
                            }
                            rectF9.set(f111, f23, f24, f25);
                            RectF rectF10 = j90VarA.b;
                            rectF10.getClass();
                            path.arcTo(rectF10, 180.0f, 90.0f, true);
                            tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                            return Unit.a;
                        }
                    };
                    bVar4.r(objY3);
                }
                rxo.b(dVarE9, (Function1) objY3, bVar4, 6);
                String str5 = "ROUND_WAITING";
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_WAITING")) {
                    Boolean bool5 = Boolean.FALSE;
                    ((x5a0) ytwVar3).setValue(bool5);
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        Object obj7 = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj7);
                        obj2 = "Sporty_Jet_static";
                        obj = obj7;
                    } else {
                        Object obj8 = "Sporty_Jet_static";
                        obj = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj8);
                        obj2 = obj8;
                    }
                    ytwVar6 = ytwVar20;
                    ytwVar6.setValue(bool5);
                    obj4 = obj;
                    obj3 = obj2;
                } else {
                    Boolean bool6 = Boolean.FALSE;
                    ((x5a0) ytwVar3).setValue(bool6);
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        Object obj9 = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj9);
                        obj2 = "Sporty_Jet_static";
                        obj = obj9;
                    } else {
                        Object obj10 = "Sporty_Jet_static";
                        obj = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj10);
                        obj2 = obj10;
                    }
                    ytwVar6 = ytwVar20;
                    ytwVar6.setValue(bool6);
                    obj4 = obj;
                    obj3 = obj2;
                }
                bVar4.s();
                String str6 = "ROUND_END_WAIT";
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                    bVar4.N(1124857951);
                    objY4 = bVar4.y();
                    if (objY4 == c0042a2) {
                        objY4 = m.b(Boolean.FALSE);
                        bVar4.r(objY4);
                    }
                    ytwVar7 = (ytw) objY4;
                    objY5 = bVar4.y();
                    if (objY5 == c0042a2) {
                        objY5 = ee0.a(0.0f);
                        bVar4.r(objY5);
                    }
                    wd0Var = (wd0) objY5;
                    Unit unit3 = Unit.a;
                    zA = bVar4.A(wd0Var);
                    objY6 = bVar4.y();
                    if (zA) {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    } else {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    }
                    xvf.e(bVar4, unit3, (Function2) objY6);
                    objY7 = bVar4.y();
                    if (objY7 == c0042a2) {
                        objY7 = androidx.compose.runtime.j.a(0.0f);
                        bVar4.r(objY7);
                    }
                    iswVar = (isw) objY7;
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        ytwVar5.setValue("Sporty_Santa_Jet");
                    } else {
                        ytwVar5.setValue("Sporty_Jet");
                    }
                    ibsVar = (ibs) bVar4.O(dVar2);
                    ytwVar6.setValue(Boolean.TRUE);
                    zA2 = bVar4.A(ibsVar);
                    objY8 = bVar4.y();
                    if (zA2) {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                ((use) obj11).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar12) {
                                        if (aVar12 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                ((use) obj11).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar12) {
                                        if (aVar12 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    }
                    xvf.c(ibsVar, (Function1) objY8, bVar4);
                    mmd mmdVar2 = (mmd) bVar4.O(qyd0Var);
                    bVar4.N(-1349151355);
                    fC1 = mmdVar2.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                    bVar4.H();
                    objY9 = bVar4.y();
                    if (objY9 == c0042a2) {
                        f2 = 0.0f;
                        objY9 = ee0.a(0.0f);
                        bVar4.r(objY9);
                    } else {
                        f2 = 0.0f;
                    }
                    wd0Var2 = (wd0) objY9;
                    ytwVar8 = ytwVar5;
                    Boolean bool7 = (Boolean) ytwVar7.getValue();
                    bool7.getClass();
                    zA3 = bVar4.A(wd0Var2);
                    ytwVar9 = ytwVar6;
                    objY10 = bVar4.y();
                    if (zA3) {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    } else {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    }
                    xvf.e(bVar4, bool7, (Function2) objY10);
                    d dVarI2 = j.i(j.g(aVar8, 1.0f), mmdVar2.v1(f11));
                    zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                    objY11 = bVar4.y();
                    if (zC4) {
                        ytwVar10 = ytwVar21;
                        Function1 function3 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function3);
                        objY11 = function3;
                    } else {
                        ytwVar10 = ytwVar21;
                        Function1 function4 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function4);
                        objY11 = function4;
                    }
                    rxo.b(dVarI2, (Function1) objY11, bVar4, 0);
                    Boolean bool8 = (Boolean) ytwVar7.getValue();
                    bool8.getClass();
                    zA4 = bVar4.A(gojVar2);
                    objY12 = bVar4.y();
                    if (zA4) {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    } else {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    }
                    xvf.e(bVar4, bool8, (Function2) objY12);
                    f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                    f5 = f11 / 2.29f;
                    if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                        bVar4.N(1129739397);
                        egn egnVarB2 = kgn.b("Path infinite transition", bVar4, 0);
                        float f110 = 0.398958f * f4;
                        float f111 = 0.4625f * f4 * 1.127f;
                        wkf wkfVar2 = xkf.d;
                        float f112 = f3;
                        gzg0 gzg0VarE2 = yi0.e(2350, 0, wkfVar2, 2);
                        l850 l850Var2 = l850.b;
                        egn.a aVarA5 = kgn.a(egnVarB2, f110, f111, yi0.a(gzg0VarE2, l850Var2, 0L, 4), "Path animation", bVar4, 28680, 0);
                        c1350a = c1350a8;
                        egn.a aVarA6 = kgn.a(egnVarB2, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar2, 2), l850Var2, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA7 = kgn.a(egnVarB2, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar2, 2), l850Var2, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA8 = kgn.a(egnVarB2, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar2, 2), l850Var2, 0L, 4), "Path animation", bVar4, 28680, 0);
                        bVar4 = bVar4;
                        ?? A3 = m90.a();
                        float f113 = f112 - (f112 / 1.11f);
                        A3.a(f113, f5);
                        A3.f(Math.abs(((Number) aVarA7.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA8.getValue()).floatValue()), Math.abs(((Number) aVarA5.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA6.getValue()).floatValue()));
                        A3.c(Math.abs(((Number) aVarA5.getValue()).floatValue()) * 1.127f, f5);
                        dq40Var = dq40Var3;
                        dq40Var.a = A3;
                        ytwVar12 = ytwVar4;
                        e(l((((long) Float.floatToRawIntBits((f112 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA7.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA8.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA5.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA6.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                        ?? A4 = m90.a();
                        A4.a(f113, f5);
                        A4.f(Math.abs(((Number) aVarA7.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA8.getValue()).floatValue()), Math.abs(((Number) aVarA5.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA6.getValue()).floatValue()));
                        dq40Var2 = dq40Var4;
                        dq40Var2.a = A4;
                        bVar4.H();
                    } else {
                        c1350a = r15;
                        dq40Var = dq40Var3;
                        dq40Var2 = dq40Var4;
                        ytwVar12 = ytwVar4;
                        bVar4.N(1108100033);
                        bVar4.H();
                    }
                    rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            tcf tcfVar = (tcf) obj11;
                            tcfVar.getClass();
                            ytw ytwVar22 = ytwVar11;
                            if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                                tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                                tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                            }
                            return Unit.a;
                        }
                    }, bVar4, 6);
                    bVar4.H();
                } else {
                    bVar4.N(1124857951);
                    objY4 = bVar4.y();
                    if (objY4 == c0042a2) {
                        objY4 = m.b(Boolean.FALSE);
                        bVar4.r(objY4);
                    }
                    ytwVar7 = (ytw) objY4;
                    objY5 = bVar4.y();
                    if (objY5 == c0042a2) {
                        objY5 = ee0.a(0.0f);
                        bVar4.r(objY5);
                    }
                    wd0Var = (wd0) objY5;
                    Unit unit4 = Unit.a;
                    zA = bVar4.A(wd0Var);
                    objY6 = bVar4.y();
                    if (zA) {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    } else {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    }
                    xvf.e(bVar4, unit4, (Function2) objY6);
                    objY7 = bVar4.y();
                    if (objY7 == c0042a2) {
                        objY7 = androidx.compose.runtime.j.a(0.0f);
                        bVar4.r(objY7);
                    }
                    iswVar = (isw) objY7;
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        ytwVar5.setValue("Sporty_Santa_Jet");
                    } else {
                        ytwVar5.setValue("Sporty_Jet");
                    }
                    ibsVar = (ibs) bVar4.O(dVar2);
                    ytwVar6.setValue(Boolean.TRUE);
                    zA2 = bVar4.A(ibsVar);
                    objY8 = bVar4.y();
                    if (zA2) {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                ((use) obj11).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar12) {
                                        if (aVar12 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                ((use) obj11).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar12) {
                                        if (aVar12 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    }
                    xvf.c(ibsVar, (Function1) objY8, bVar4);
                    mmd mmdVar3 = (mmd) bVar4.O(qyd0Var);
                    bVar4.N(-1349151355);
                    fC1 = mmdVar3.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                    bVar4.H();
                    objY9 = bVar4.y();
                    if (objY9 == c0042a2) {
                        f2 = 0.0f;
                        objY9 = ee0.a(0.0f);
                        bVar4.r(objY9);
                    } else {
                        f2 = 0.0f;
                    }
                    wd0Var2 = (wd0) objY9;
                    ytwVar8 = ytwVar5;
                    Boolean bool9 = (Boolean) ytwVar7.getValue();
                    bool9.getClass();
                    zA3 = bVar4.A(wd0Var2);
                    ytwVar9 = ytwVar6;
                    objY10 = bVar4.y();
                    if (zA3) {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    } else {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    }
                    xvf.e(bVar4, bool9, (Function2) objY10);
                    d dVarI3 = j.i(j.g(aVar8, 1.0f), mmdVar3.v1(f11));
                    zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                    objY11 = bVar4.y();
                    if (zC4) {
                        ytwVar10 = ytwVar21;
                        Function1 function5 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function5);
                        objY11 = function5;
                    } else {
                        ytwVar10 = ytwVar21;
                        Function1 function6 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function6);
                        objY11 = function6;
                    }
                    rxo.b(dVarI3, (Function1) objY11, bVar4, 0);
                    Boolean bool10 = (Boolean) ytwVar7.getValue();
                    bool10.getClass();
                    zA4 = bVar4.A(gojVar2);
                    objY12 = bVar4.y();
                    if (zA4) {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    } else {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    }
                    xvf.e(bVar4, bool10, (Function2) objY12);
                    f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                    f5 = f11 / 2.29f;
                    if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                        bVar4.N(1129739397);
                        egn egnVarB3 = kgn.b("Path infinite transition", bVar4, 0);
                        float f114 = 0.398958f * f4;
                        float f115 = 0.4625f * f4 * 1.127f;
                        wkf wkfVar3 = xkf.d;
                        float f116 = f3;
                        gzg0 gzg0VarE3 = yi0.e(2350, 0, wkfVar3, 2);
                        l850 l850Var3 = l850.b;
                        egn.a aVarA9 = kgn.a(egnVarB3, f114, f115, yi0.a(gzg0VarE3, l850Var3, 0L, 4), "Path animation", bVar4, 28680, 0);
                        c1350a = c1350a8;
                        egn.a aVarA10 = kgn.a(egnVarB3, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar3, 2), l850Var3, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA11 = kgn.a(egnVarB3, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar3, 2), l850Var3, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA12 = kgn.a(egnVarB3, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar3, 2), l850Var3, 0L, 4), "Path animation", bVar4, 28680, 0);
                        bVar4 = bVar4;
                        ?? A5 = m90.a();
                        float f117 = f116 - (f116 / 1.11f);
                        A5.a(f117, f5);
                        A5.f(Math.abs(((Number) aVarA11.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA12.getValue()).floatValue()), Math.abs(((Number) aVarA9.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA10.getValue()).floatValue()));
                        A5.c(Math.abs(((Number) aVarA9.getValue()).floatValue()) * 1.127f, f5);
                        dq40Var = dq40Var3;
                        dq40Var.a = A5;
                        ytwVar12 = ytwVar4;
                        e(l((((long) Float.floatToRawIntBits((f116 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA11.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA12.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA9.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA10.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                        ?? A6 = m90.a();
                        A6.a(f117, f5);
                        A6.f(Math.abs(((Number) aVarA11.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA12.getValue()).floatValue()), Math.abs(((Number) aVarA9.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA10.getValue()).floatValue()));
                        dq40Var2 = dq40Var4;
                        dq40Var2.a = A6;
                        bVar4.H();
                    } else {
                        c1350a = r15;
                        dq40Var = dq40Var3;
                        dq40Var2 = dq40Var4;
                        ytwVar12 = ytwVar4;
                        bVar4.N(1108100033);
                        bVar4.H();
                    }
                    rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            tcf tcfVar = (tcf) obj11;
                            tcfVar.getClass();
                            ytw ytwVar22 = ytwVar11;
                            if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                                tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                                tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                            }
                            return Unit.a;
                        }
                    }, bVar4, 6);
                    bVar4.H();
                }
                d dVarE10 = j.e(aVar8, 1.0f);
                aiv aivVarC9 = g75.c(n54Var, false);
                iHashCode4 = Long.hashCode(l2a.a(bVar4));
                ne00 ne00VarO13 = bVar4.o();
                d dVarC14 = c.c(bVar4, dVarE10);
                bVar4.D();
                if (bVar4.g()) {
                    aVar2 = aVar9;
                    bVar4.F(aVar2);
                } else {
                    aVar2 = aVar9;
                    bVar4.p();
                }
                bVar5 = bVar9;
                hlh0.a(bVar4, aivVarC9, bVar5);
                hlh0.a(bVar4, ne00VarO13, dVar3);
                if (bVar4.g()) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
                }
                hlh0.a(bVar4, dVarC14, cVar2);
                d dVarB2 = androidx.compose.foundation.layout.d.a.b(j.e(aVar8, 1.0f), n54Var);
                n54.a aVar12 = ht.a.m;
                kVar = kw0.c;
                i78 i78VarA5 = g78.a(kVar, aVar12, bVar4, 0);
                iHashCode5 = Long.hashCode(l2a.a(bVar4));
                ne00 ne00VarO14 = bVar4.o();
                d dVarC15 = c.c(bVar4, dVarB2);
                bVar4.D();
                if (bVar4.g()) {
                    bVar4.F(aVar2);
                } else {
                    bVar4.p();
                }
                hlh0.a(bVar4, i78VarA5, bVar5);
                hlh0.a(bVar4, ne00VarO14, dVar3);
                if (bVar4.g()) {
                    n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
                } else {
                    n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
                }
                hlh0.a(bVar4, dVarC15, cVar2);
                if (file == null) {
                    bVar6 = bVar4;
                    bVar6.N(55164684);
                } else {
                    bVar6 = bVar4;
                    bVar6.N(55164684);
                }
                bVar6.H();
                bVar6.s();
                bVar6.s();
                yp40Var = new yp40();
                objY13 = bVar6.y();
                c0042a3 = c0042a2;
                if (objY13 == c0042a3) {
                    objY13 = m.b(Boolean.FALSE);
                    bVar6.r(objY13);
                }
                ytwVar13 = (ytw) objY13;
                objY14 = bVar6.y();
                if (objY14 == c0042a3) {
                    objY14 = ee0.a(f2);
                    bVar6.r(objY14);
                }
                wd0Var3 = (wd0) objY14;
                objY15 = bVar6.y();
                if (objY15 == c0042a3) {
                    objY15 = m.b(Boolean.TRUE);
                    bVar6.r(objY15);
                }
                ((ytw) objY15).setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")));
                d(ytwVar13, Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING"));
                str = str5;
                zG = Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str);
                aVar3 = ht.a.n;
                if (zG) {
                    c0042a4 = c0042a3;
                    wd0Var4 = wd0Var3;
                    aVar4 = aVar3;
                    aVar5 = aVar8;
                    f6 = f2;
                    bVar7 = bVar5;
                    dVar = r4;
                    c1350a3 = c1350a2;
                    cVar = r5;
                    kVar2 = kVar;
                    bVar6.N(1108100033);
                } else {
                    c0042a4 = c0042a3;
                    wd0Var4 = wd0Var3;
                    aVar4 = aVar3;
                    aVar5 = aVar8;
                    f6 = f2;
                    bVar7 = bVar5;
                    dVar = r4;
                    c1350a3 = c1350a2;
                    cVar = r5;
                    kVar2 = kVar;
                    bVar6.N(1108100033);
                }
                bVar6.H();
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                    r9 = 0;
                    yp40Var.a = false;
                } else {
                    r9 = 0;
                }
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                    f7 = 1.0f;
                } else {
                    f7 = f6;
                }
                d dVarE11 = j.e(dw.a(aVar5, f7), 1.0f);
                n54 n54Var3 = ht.a.e;
                aiv aivVarC10 = g75.c(n54Var3, r9);
                iHashCode6 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO15 = bVar6.o();
                d dVarC16 = c.c(bVar6, dVarE11);
                bVar6.D();
                if (bVar6.g()) {
                    aVar6 = aVar2;
                    bVar6.F(aVar6);
                } else {
                    aVar6 = aVar2;
                    bVar6.p();
                }
                yka.a.b bVar13 = bVar7;
                hlh0.a(bVar6, aivVarC10, bVar13);
                yka.a.d dVar5 = dVar;
                hlh0.a(bVar6, ne00VarO15, dVar5);
                if (bVar6.g()) {
                    c1350a4 = c1350a3;
                    n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
                } else {
                    c1350a4 = c1350a3;
                    n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
                }
                yka.a.c cVar4 = cVar;
                hlh0.a(bVar6, dVarC16, cVar4);
                kw0.k kVar4 = kVar2;
                i78 i78VarA6 = g78.a(kVar4, aVar4, bVar6, 48);
                iHashCode7 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO16 = bVar6.o();
                d dVarC17 = c.c(bVar6, aVar5);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar6);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, i78VarA6, bVar13);
                hlh0.a(bVar6, ne00VarO16, dVar5);
                if (bVar6.g()) {
                    n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
                } else {
                    n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
                }
                hlh0.a(bVar6, dVarC17, cVar4);
                ty0.a(bVar6, j.i(aVar5, 16.0f));
                bVar6.s();
                bVar6.s();
                objY16 = bVar6.y();
                if (objY16 == c0042a4) {
                    objY16 = m.b(Boolean.FALSE);
                    bVar6.r(objY16);
                }
                ytwVar14 = (ytw) objY16;
                String str7 = str6;
                ytwVar14.setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str7)));
                if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.2f;
                }
                n54.a aVar13 = aVar4;
                c1350a5 = c1350a4;
                twd0 twd0VarB3 = xe0.b(f8, yi0.e(100, r9, xkf.a, 2), "scaleAnimation", null, bVar6, 3072, 20);
                bVar8 = bVar6;
                if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                    f9 = 1.0f;
                } else {
                    f9 = f6;
                }
                twd0 twd0VarB4 = xe0.b(f9, yi0.e(100, r9, null, 6), "alphaAnimation", null, bVar8, 3120, 20);
                Unit unit5 = Unit.a;
                objY17 = bVar8.y();
                if (objY17 == c0042a4) {
                    objY17 = new tpw(ytwVar14, null);
                    bVar8.r(objY17);
                }
                xvf.e(bVar8, unit5, (Function2) objY17);
                d dVarE12 = j.e(dw.a(aVar5, ((!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str7)) && !z) ? 1.0f : f6), 1.0f);
                aiv aivVarC11 = g75.c(n54Var3, r9);
                iHashCode8 = Long.hashCode(l2a.a(bVar8));
                ne00 ne00VarO17 = bVar8.o();
                d dVarC18 = c.c(bVar8, dVarE12);
                bVar8.D();
                if (bVar8.g()) {
                    bVar8.F(aVar6);
                } else {
                    bVar8.p();
                }
                hlh0.a(bVar8, aivVarC11, bVar13);
                hlh0.a(bVar8, ne00VarO17, dVar5);
                if (bVar8.g()) {
                    c1350a6 = c1350a5;
                    n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
                } else {
                    c1350a6 = c1350a5;
                    n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
                }
                hlh0.a(bVar8, dVarC18, cVar4);
                i78 i78VarA7 = g78.a(kVar4, aVar13, bVar8, 48);
                iHashCode9 = Long.hashCode(l2a.a(bVar8));
                ne00 ne00VarO18 = bVar8.o();
                d dVarC19 = c.c(bVar8, aVar5);
                bVar8.D();
                if (bVar8.g()) {
                    bVar8.F(aVar6);
                } else {
                    bVar8.p();
                }
                hlh0.a(bVar8, i78VarA7, bVar13);
                hlh0.a(bVar8, ne00VarO18, dVar5);
                if (bVar8.g()) {
                    n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
                } else {
                    n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
                }
                hlh0.a(bVar8, dVarC19, cVar4);
                String strC2 = op5.c(op5.a, pwo.e(R.string.flew_away_cms, bVar8), "FLEW AWAY!");
                j = j58.f;
                qyd0Var2 = ni60.b;
                imf0 imf0VarG3 = ni60.g(((sfd0) bVar8.O(qyd0Var2)).d, R.dimen._16ssp, bVar8);
                float fG2 = g(twd0VarB3);
                r28 = r9;
                a.C0041a.C0042a c0042a9 = c0042a4;
                aVar7 = aVar5;
                lkf0.b(strC2, h.j(dw.a(bz60.a(aVar5, fG2, fG2), h(twd0VarB4)), 3.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG3, bVar8, 384, 0, 65528);
                bVar = bVar8;
                if (((Boolean) ((x5a0) gojVar.j0).getValue()).booleanValue()) {
                    bVar.N(-607701549);
                    String strA2 = yk10.a(((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier(), "x");
                    d dVarA7 = s3w.a(h.j(aVar7, 3.0f, 0.0f, 0.0f, 0.0f, 14), "sj_current_multiplier");
                    if (!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                        j = j58.g;
                    }
                    imf0 imf0Var2 = ((sfd0) bVar.O(qyd0Var2)).e;
                    currentMultiplier = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                    if (currentMultiplier != null) {
                        length = currentMultiplier.length();
                    } else {
                        length = r28 == true ? 1 : 0;
                    }
                    if (length >= 9) {
                        i5 = R.dimen._40ssp;
                    } else {
                        currentMultiplier2 = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                        if (currentMultiplier2 != null) {
                            length2 = currentMultiplier2.length();
                        } else {
                            length2 = r28 == true ? 1 : 0;
                        }
                        if (length2 >= 7) {
                            i5 = R.dimen._50ssp;
                        } else {
                            i5 = R.dimen._60ssp;
                        }
                    }
                    imf0 imf0VarG4 = ni60.g(imf0Var2, i5, bVar);
                    if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                        jD = r58.d(2348810239L);
                    } else {
                        jD = j58.g;
                    }
                    long j4 = jD;
                    if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                        bVar.N(-1266493405);
                        fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(11));
                        bVar.H();
                    } else {
                        bVar.N(-606511552);
                        fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(r28 == true ? 1 : 0));
                        bVar.H();
                    }
                    lkf0.b(strA2, dVarA7, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0VarG4, 0L, 0L, null, null, null, 0L, null, new ix80(fD0, j4, 0L), null, 0, 0L, null, null, 16769023), bVar, 0, 0, 65528);
                    bVar = bVar;
                } else {
                    bVar.N(-639667478);
                }
                bVar.H();
                bVar.s();
                bVar.s();
                Boolean bool11 = (Boolean) ytwVar13.getValue();
                bool11.getClass();
                wd0Var5 = wd0Var4;
                zA5 = bVar.A(wd0Var5);
                objY18 = bVar.y();
                if (zA5) {
                    objY18 = new upw(wd0Var5, ytwVar13, null);
                    bVar.r(objY18);
                } else {
                    objY18 = new upw(wd0Var5, ytwVar13, null);
                    bVar.r(objY18);
                }
                xvf.e(bVar, bool11, (Function2) objY18);
            }
            n30.a(iHashCode10, bVar2, iHashCode10, c1350a8);
            yka.a.c cVar5 = yka.a.d;
            hlh0.a(bVar2, dVarC, cVar5);
            float f118 = density - (density / 1.11f);
            d dVarC20 = g.c(aVar8, lla.b(f118, bVar2) + 8.0f, lla.b(f11 / 50.0f, bVar2));
            aiv aivVarC12 = g75.c(n54Var, false);
            iHashCode = Long.hashCode(l2a.a(bVar2));
            ne00 ne00VarO19 = bVar2.o();
            d dVarC21 = c.c(bVar2, dVarC20);
            bVar2.D();
            if (bVar2.g()) {
                bVar2.F(aVar9);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, aivVarC12, bVar9);
            hlh0.a(bVar2, ne00VarO19, dVar3);
            if (bVar2.g()) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a8);
            } else {
                n30.a(iHashCode, bVar2, iHashCode, c1350a8);
            }
            hlh0.a(bVar2, dVarC21, cVar5);
            ytwVar3 = ytwVar16;
            bVar3 = bVar2;
            hv30.a(gojVar, function0, false, bVar3, (i3 >> 12) & WebSocketProtocol.PAYLOAD_SHORT, 4);
            bVar3.s();
            float f119 = f;
            d dVarA8 = ls7.a(g.c(j.c(j.g(aVar8, 1.0f), 0.83f), lla.b(density - (density / 1.04f), bVar3), 18.0f), j060.e(15.0f, f119, f119, f119, 14));
            zC = bVar3.c(density) | bVar3.c(f11);
            objY = bVar3.y();
            if (zC) {
                objY = new cpw();
                bVar3.r(objY);
            } else {
                objY = new cpw();
                bVar3.r(objY);
            }
            d dVarA9 = s3w.a(w.a(dVarA8, (Function1) objY), "sj_moving_circles");
            int i9 = ((i3 << 15) & 458752) | 27696;
            qyd0Var = qyd0Var3;
            ytwVar4 = ytwVar2;
            i4 = i3;
            a(dVarA9, 10, new yn60().E1, 1000, true, ytwVar, bVar3, i9);
            bVar3.s();
            d dVarE13 = j.e(aVar8, 1.0f);
            aiv aivVarC13 = g75.c(n54Var, false);
            iHashCode2 = Long.hashCode(l2a.a(bVar3));
            ne00 ne00VarO20 = bVar3.o();
            d dVarC22 = c.c(bVar3, dVarE13);
            bVar3.D();
            if (bVar3.g()) {
                bVar3.F(aVar9);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, aivVarC13, bVar9);
            hlh0.a(bVar3, ne00VarO20, dVar3);
            if (bVar3.g()) {
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a8);
            } else {
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a8);
            }
            hlh0.a(bVar3, dVarC22, cVar5);
            d dVarA10 = ls7.a(g.c(h.j(j.g(j.c(aVar8, 1.0f), 0.92f), 0.0f, 0.0f, lla.b(density / 20.0f, bVar3), 0.0f, 11), lla.b(density / 10.0f, bVar3), lla.b(f11 / 4.7f, bVar3)), j060.e(0.0f, 0.0f, 15.0f, 0.0f, 11));
            zC2 = bVar3.c(density) | bVar3.c(f11);
            objY2 = bVar3.y();
            if (zC2) {
                if (objY2 == c0042a) {
                }
                c0042a = c0042a5;
                a.C0041a.C0042a c0042a10 = c0042a;
                bVar4 = bVar3;
                a(w.a(dVarA10, (Function1) objY2), 8, new yn60().E1, 1000, false, ytwVar, bVar4, i9);
                bVar4.s();
                d dVarE14 = j.e(aVar8, 1.0f);
                aiv aivVarC14 = g75.c(n54Var, false);
                iHashCode3 = Long.hashCode(l2a.a(bVar4));
                ne00 ne00VarO110 = bVar4.o();
                d dVarC110 = c.c(bVar4, dVarE14);
                bVar4.D();
                if (bVar4.g()) {
                    bVar4.F(aVar9);
                } else {
                    bVar4.p();
                }
                hlh0.a(bVar4, aivVarC14, bVar9);
                hlh0.a(bVar4, ne00VarO110, dVar3);
                if (bVar4.g()) {
                    n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
                } else {
                    n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
                }
                hlh0.a(bVar4, dVarC110, cVar5);
                d dVarE15 = j.e(aVar8, 1.0f);
                zC3 = bVar4.c(density) | bVar4.c(f11);
                objY3 = bVar4.y();
                c0042a2 = c0042a10;
                if (zC3) {
                    objY3 = new Function1() { // from class: fpw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            tcf tcfVar = (tcf) obj11;
                            tcfVar.getClass();
                            float f1110 = density;
                            float f1111 = f1110 / 40.0f;
                            float f1112 = f11;
                            float f1113 = (f1112 / 2.4f) * 1.05f;
                            float f1114 = f1110 / 10.0f;
                            float f1115 = (f1112 / 2.2f) * 1.05f;
                            float f21 = f1110 - f1114;
                            float f22 = f1110 - f1111;
                            float f23 = f1112 / 50.0f;
                            float f24 = f1110 - (f1110 / 1.11f);
                            float f25 = f1112 / 16.0f;
                            j90 j90VarA = m90.a();
                            float f26 = (f1112 / 60.0f) + f23;
                            Path path = j90VarA.a;
                            j90VarA.a(f1111, f26);
                            j90VarA.c(f1111, ((f1112 / 2.0f) - (f1112 / 17.0f)) * 1.05f);
                            RectF rectF = j90VarA.b;
                            if (rectF == null) {
                                rectF = new RectF();
                                j90VarA.b = rectF;
                            }
                            rectF.set(f1111, f1113, f1114, f1115);
                            RectF rectF2 = j90VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, 90.0f, 90.0f, true);
                            j90VarA.a(f1110 / 16.0f, f1115);
                            float f27 = f1110 - (f1110 / 18.0f);
                            j90VarA.c(f27, f1115);
                            RectF rectF3 = j90VarA.b;
                            if (rectF3 == null) {
                                rectF3 = new RectF();
                                j90VarA.b = rectF3;
                            }
                            rectF3.set(f21, f1113, f22, f1115);
                            RectF rectF4 = j90VarA.b;
                            rectF4.getClass();
                            path.arcTo(rectF4, 0.0f, 90.0f, true);
                            RectF rectF5 = j90VarA.b;
                            if (rectF5 == null) {
                                rectF5 = new RectF();
                                j90VarA.b = rectF5;
                            }
                            rectF5.set(f21, f1113, f22, f1115);
                            RectF rectF6 = j90VarA.b;
                            rectF6.getClass();
                            path.arcTo(rectF6, 270.0f, 90.0f, true);
                            j90VarA.a(f27, f1113);
                            j90VarA.c(f24, f1113);
                            j90VarA.a(f24, f1113);
                            j90VarA.c(f24, f26);
                            RectF rectF7 = j90VarA.b;
                            if (rectF7 == null) {
                                rectF7 = new RectF();
                                j90VarA.b = rectF7;
                            }
                            rectF7.set(f1111, f23, f24, f25);
                            RectF rectF8 = j90VarA.b;
                            rectF8.getClass();
                            path.arcTo(rectF8, 270.0f, 90.0f, true);
                            RectF rectF9 = j90VarA.b;
                            if (rectF9 == null) {
                                rectF9 = new RectF();
                                j90VarA.b = rectF9;
                            }
                            rectF9.set(f1111, f23, f24, f25);
                            RectF rectF10 = j90VarA.b;
                            rectF10.getClass();
                            path.arcTo(rectF10, 180.0f, 90.0f, true);
                            tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                            return Unit.a;
                        }
                    };
                    bVar4.r(objY3);
                } else {
                    objY3 = new Function1() { // from class: fpw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            tcf tcfVar = (tcf) obj11;
                            tcfVar.getClass();
                            float f1110 = density;
                            float f1111 = f1110 / 40.0f;
                            float f1112 = f11;
                            float f1113 = (f1112 / 2.4f) * 1.05f;
                            float f1114 = f1110 / 10.0f;
                            float f1115 = (f1112 / 2.2f) * 1.05f;
                            float f21 = f1110 - f1114;
                            float f22 = f1110 - f1111;
                            float f23 = f1112 / 50.0f;
                            float f24 = f1110 - (f1110 / 1.11f);
                            float f25 = f1112 / 16.0f;
                            j90 j90VarA = m90.a();
                            float f26 = (f1112 / 60.0f) + f23;
                            Path path = j90VarA.a;
                            j90VarA.a(f1111, f26);
                            j90VarA.c(f1111, ((f1112 / 2.0f) - (f1112 / 17.0f)) * 1.05f);
                            RectF rectF = j90VarA.b;
                            if (rectF == null) {
                                rectF = new RectF();
                                j90VarA.b = rectF;
                            }
                            rectF.set(f1111, f1113, f1114, f1115);
                            RectF rectF2 = j90VarA.b;
                            rectF2.getClass();
                            path.arcTo(rectF2, 90.0f, 90.0f, true);
                            j90VarA.a(f1110 / 16.0f, f1115);
                            float f27 = f1110 - (f1110 / 18.0f);
                            j90VarA.c(f27, f1115);
                            RectF rectF3 = j90VarA.b;
                            if (rectF3 == null) {
                                rectF3 = new RectF();
                                j90VarA.b = rectF3;
                            }
                            rectF3.set(f21, f1113, f22, f1115);
                            RectF rectF4 = j90VarA.b;
                            rectF4.getClass();
                            path.arcTo(rectF4, 0.0f, 90.0f, true);
                            RectF rectF5 = j90VarA.b;
                            if (rectF5 == null) {
                                rectF5 = new RectF();
                                j90VarA.b = rectF5;
                            }
                            rectF5.set(f21, f1113, f22, f1115);
                            RectF rectF6 = j90VarA.b;
                            rectF6.getClass();
                            path.arcTo(rectF6, 270.0f, 90.0f, true);
                            j90VarA.a(f27, f1113);
                            j90VarA.c(f24, f1113);
                            j90VarA.a(f24, f1113);
                            j90VarA.c(f24, f26);
                            RectF rectF7 = j90VarA.b;
                            if (rectF7 == null) {
                                rectF7 = new RectF();
                                j90VarA.b = rectF7;
                            }
                            rectF7.set(f1111, f23, f24, f25);
                            RectF rectF8 = j90VarA.b;
                            rectF8.getClass();
                            path.arcTo(rectF8, 270.0f, 90.0f, true);
                            RectF rectF9 = j90VarA.b;
                            if (rectF9 == null) {
                                rectF9 = new RectF();
                                j90VarA.b = rectF9;
                            }
                            rectF9.set(f1111, f23, f24, f25);
                            RectF rectF10 = j90VarA.b;
                            rectF10.getClass();
                            path.arcTo(rectF10, 180.0f, 90.0f, true);
                            tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                            return Unit.a;
                        }
                    };
                    bVar4.r(objY3);
                }
                rxo.b(dVarE15, (Function1) objY3, bVar4, 6);
                String str8 = "ROUND_WAITING";
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_WAITING")) {
                    Boolean bool12 = Boolean.FALSE;
                    ((x5a0) ytwVar3).setValue(bool12);
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        Object obj11 = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj11);
                        obj2 = "Sporty_Jet_static";
                        obj = obj11;
                    } else {
                        Object obj12 = "Sporty_Jet_static";
                        obj = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj12);
                        obj2 = obj12;
                    }
                    ytwVar6 = ytwVar20;
                    ytwVar6.setValue(bool12);
                    obj4 = obj;
                    obj3 = obj2;
                } else {
                    Boolean bool13 = Boolean.FALSE;
                    ((x5a0) ytwVar3).setValue(bool13);
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        Object obj13 = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj13);
                        obj2 = "Sporty_Jet_static";
                        obj = obj13;
                    } else {
                        Object obj14 = "Sporty_Jet_static";
                        obj = "Sporty_Santa_Jet_static";
                        ytwVar5 = ytwVar18;
                        ytwVar5.setValue(obj14);
                        obj2 = obj14;
                    }
                    ytwVar6 = ytwVar20;
                    ytwVar6.setValue(bool13);
                    obj4 = obj;
                    obj3 = obj2;
                }
                bVar4.s();
                String str9 = "ROUND_END_WAIT";
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                    bVar4.N(1124857951);
                    objY4 = bVar4.y();
                    if (objY4 == c0042a2) {
                        objY4 = m.b(Boolean.FALSE);
                        bVar4.r(objY4);
                    }
                    ytwVar7 = (ytw) objY4;
                    objY5 = bVar4.y();
                    if (objY5 == c0042a2) {
                        objY5 = ee0.a(0.0f);
                        bVar4.r(objY5);
                    }
                    wd0Var = (wd0) objY5;
                    Unit unit6 = Unit.a;
                    zA = bVar4.A(wd0Var);
                    objY6 = bVar4.y();
                    if (zA) {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    } else {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    }
                    xvf.e(bVar4, unit6, (Function2) objY6);
                    objY7 = bVar4.y();
                    if (objY7 == c0042a2) {
                        objY7 = androidx.compose.runtime.j.a(0.0f);
                        bVar4.r(objY7);
                    }
                    iswVar = (isw) objY7;
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        ytwVar5.setValue("Sporty_Santa_Jet");
                    } else {
                        ytwVar5.setValue("Sporty_Jet");
                    }
                    ibsVar = (ibs) bVar4.O(dVar2);
                    ytwVar6.setValue(Boolean.TRUE);
                    zA2 = bVar4.A(ibsVar);
                    objY8 = bVar4.y();
                    if (zA2) {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj15) {
                                ((use) obj15).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar14) {
                                        if (aVar14 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj15) {
                                ((use) obj15).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar14) {
                                        if (aVar14 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    }
                    xvf.c(ibsVar, (Function1) objY8, bVar4);
                    mmd mmdVar4 = (mmd) bVar4.O(qyd0Var);
                    bVar4.N(-1349151355);
                    fC1 = mmdVar4.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                    bVar4.H();
                    objY9 = bVar4.y();
                    if (objY9 == c0042a2) {
                        f2 = 0.0f;
                        objY9 = ee0.a(0.0f);
                        bVar4.r(objY9);
                    } else {
                        f2 = 0.0f;
                    }
                    wd0Var2 = (wd0) objY9;
                    ytwVar8 = ytwVar5;
                    Boolean bool14 = (Boolean) ytwVar7.getValue();
                    bool14.getClass();
                    zA3 = bVar4.A(wd0Var2);
                    ytwVar9 = ytwVar6;
                    objY10 = bVar4.y();
                    if (zA3) {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    } else {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    }
                    xvf.e(bVar4, bool14, (Function2) objY10);
                    d dVarI4 = j.i(j.g(aVar8, 1.0f), mmdVar4.v1(f11));
                    zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                    objY11 = bVar4.y();
                    if (zC4) {
                        ytwVar10 = ytwVar21;
                        Function1 function7 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function7);
                        objY11 = function7;
                    } else {
                        ytwVar10 = ytwVar21;
                        Function1 function8 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function8);
                        objY11 = function8;
                    }
                    rxo.b(dVarI4, (Function1) objY11, bVar4, 0);
                    Boolean bool15 = (Boolean) ytwVar7.getValue();
                    bool15.getClass();
                    zA4 = bVar4.A(gojVar2);
                    objY12 = bVar4.y();
                    if (zA4) {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    } else {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    }
                    xvf.e(bVar4, bool15, (Function2) objY12);
                    f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                    f5 = f11 / 2.29f;
                    if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                        bVar4.N(1129739397);
                        egn egnVarB4 = kgn.b("Path infinite transition", bVar4, 0);
                        float f1110 = 0.398958f * f4;
                        float f1111 = 0.4625f * f4 * 1.127f;
                        wkf wkfVar4 = xkf.d;
                        float f1112 = f3;
                        gzg0 gzg0VarE4 = yi0.e(2350, 0, wkfVar4, 2);
                        l850 l850Var4 = l850.b;
                        egn.a aVarA13 = kgn.a(egnVarB4, f1110, f1111, yi0.a(gzg0VarE4, l850Var4, 0L, 4), "Path animation", bVar4, 28680, 0);
                        c1350a = c1350a8;
                        egn.a aVarA14 = kgn.a(egnVarB4, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar4, 2), l850Var4, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA15 = kgn.a(egnVarB4, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar4, 2), l850Var4, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA16 = kgn.a(egnVarB4, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar4, 2), l850Var4, 0L, 4), "Path animation", bVar4, 28680, 0);
                        bVar4 = bVar4;
                        ?? A7 = m90.a();
                        float f1113 = f1112 - (f1112 / 1.11f);
                        A7.a(f1113, f5);
                        A7.f(Math.abs(((Number) aVarA15.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA16.getValue()).floatValue()), Math.abs(((Number) aVarA13.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA14.getValue()).floatValue()));
                        A7.c(Math.abs(((Number) aVarA13.getValue()).floatValue()) * 1.127f, f5);
                        dq40Var = dq40Var3;
                        dq40Var.a = A7;
                        ytwVar12 = ytwVar4;
                        e(l((((long) Float.floatToRawIntBits((f1112 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA15.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA16.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA13.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA14.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                        ?? A8 = m90.a();
                        A8.a(f1113, f5);
                        A8.f(Math.abs(((Number) aVarA15.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA16.getValue()).floatValue()), Math.abs(((Number) aVarA13.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA14.getValue()).floatValue()));
                        dq40Var2 = dq40Var4;
                        dq40Var2.a = A8;
                        bVar4.H();
                    } else {
                        c1350a = r15;
                        dq40Var = dq40Var3;
                        dq40Var2 = dq40Var4;
                        ytwVar12 = ytwVar4;
                        bVar4.N(1108100033);
                        bVar4.H();
                    }
                    rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj15) {
                            tcf tcfVar = (tcf) obj15;
                            tcfVar.getClass();
                            ytw ytwVar22 = ytwVar11;
                            if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                                tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                                tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                            }
                            return Unit.a;
                        }
                    }, bVar4, 6);
                    bVar4.H();
                } else {
                    bVar4.N(1124857951);
                    objY4 = bVar4.y();
                    if (objY4 == c0042a2) {
                        objY4 = m.b(Boolean.FALSE);
                        bVar4.r(objY4);
                    }
                    ytwVar7 = (ytw) objY4;
                    objY5 = bVar4.y();
                    if (objY5 == c0042a2) {
                        objY5 = ee0.a(0.0f);
                        bVar4.r(objY5);
                    }
                    wd0Var = (wd0) objY5;
                    Unit unit7 = Unit.a;
                    zA = bVar4.A(wd0Var);
                    objY6 = bVar4.y();
                    if (zA) {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    } else {
                        objY6 = new vpw(wd0Var, null);
                        bVar4.r(objY6);
                    }
                    xvf.e(bVar4, unit7, (Function2) objY6);
                    objY7 = bVar4.y();
                    if (objY7 == c0042a2) {
                        objY7 = androidx.compose.runtime.j.a(0.0f);
                        bVar4.r(objY7);
                    }
                    iswVar = (isw) objY7;
                    if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                        ytwVar5.setValue("Sporty_Santa_Jet");
                    } else {
                        ytwVar5.setValue("Sporty_Jet");
                    }
                    ibsVar = (ibs) bVar4.O(dVar2);
                    ytwVar6.setValue(Boolean.TRUE);
                    zA2 = bVar4.A(ibsVar);
                    objY8 = bVar4.y();
                    if (zA2) {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj15) {
                                ((use) obj15).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar14) {
                                        if (aVar14 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    } else {
                        objY8 = new Function1() { // from class: hpw
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj15) {
                                ((use) obj15).getClass();
                                final ytw ytwVar22 = ytwVar7;
                                ?? r2 = new cbs() { // from class: tow
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar14) {
                                        if (aVar14 == s9s.a.ON_RESUME) {
                                            ytwVar22.setValue(Boolean.TRUE);
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar;
                                ibsVar3.getLifecycle().a(r2);
                                return new zpw(ibsVar3, r2);
                            }
                        };
                        bVar4.r(objY8);
                    }
                    xvf.c(ibsVar, (Function1) objY8, bVar4);
                    mmd mmdVar5 = (mmd) bVar4.O(qyd0Var);
                    bVar4.N(-1349151355);
                    fC1 = mmdVar5.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                    bVar4.H();
                    objY9 = bVar4.y();
                    if (objY9 == c0042a2) {
                        f2 = 0.0f;
                        objY9 = ee0.a(0.0f);
                        bVar4.r(objY9);
                    } else {
                        f2 = 0.0f;
                    }
                    wd0Var2 = (wd0) objY9;
                    ytwVar8 = ytwVar5;
                    Boolean bool16 = (Boolean) ytwVar7.getValue();
                    bool16.getClass();
                    zA3 = bVar4.A(wd0Var2);
                    ytwVar9 = ytwVar6;
                    objY10 = bVar4.y();
                    if (zA3) {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    } else {
                        objY10 = new wpw(wd0Var2, ytwVar7, null);
                        bVar4.r(objY10);
                    }
                    xvf.e(bVar4, bool16, (Function2) objY10);
                    d dVarI5 = j.i(j.g(aVar8, 1.0f), mmdVar5.v1(f11));
                    zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                    objY11 = bVar4.y();
                    if (zC4) {
                        ytwVar10 = ytwVar21;
                        Function1 function9 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function9);
                        objY11 = function9;
                    } else {
                        ytwVar10 = ytwVar21;
                        Function1 function10 = new Function1() { // from class: jpw
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                            Caused by: java.lang.NullPointerException
                             */
                            /*  JADX ERROR: Types fix failed
                                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                                Caused by: java.lang.NullPointerException
                                */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object r18) {
                                /*
                                    Method dump skipped, instruction units count: 361
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        f3 = fC1;
                        gojVar2 = gojVar;
                        ytwVar11 = ytwVar;
                        bVar4.r(function10);
                        objY11 = function10;
                    }
                    rxo.b(dVarI5, (Function1) objY11, bVar4, 0);
                    Boolean bool17 = (Boolean) ytwVar7.getValue();
                    bool17.getClass();
                    zA4 = bVar4.A(gojVar2);
                    objY12 = bVar4.y();
                    if (zA4) {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    } else {
                        objY12 = new xpw(gojVar2, iswVar, null);
                        bVar4.r(objY12);
                    }
                    xvf.e(bVar4, bool17, (Function2) objY12);
                    f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                    f5 = f11 / 2.29f;
                    if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                        bVar4.N(1129739397);
                        egn egnVarB5 = kgn.b("Path infinite transition", bVar4, 0);
                        float f1114 = 0.398958f * f4;
                        float f1115 = 0.4625f * f4 * 1.127f;
                        wkf wkfVar5 = xkf.d;
                        float f1116 = f3;
                        gzg0 gzg0VarE5 = yi0.e(2350, 0, wkfVar5, 2);
                        l850 l850Var5 = l850.b;
                        egn.a aVarA17 = kgn.a(egnVarB5, f1114, f1115, yi0.a(gzg0VarE5, l850Var5, 0L, 4), "Path animation", bVar4, 28680, 0);
                        c1350a = c1350a8;
                        egn.a aVarA18 = kgn.a(egnVarB5, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar5, 2), l850Var5, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA19 = kgn.a(egnVarB5, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar5, 2), l850Var5, 0L, 4), "Path animation", bVar4, 28680, 0);
                        egn.a aVarA110 = kgn.a(egnVarB5, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar5, 2), l850Var5, 0L, 4), "Path animation", bVar4, 28680, 0);
                        bVar4 = bVar4;
                        ?? A9 = m90.a();
                        float f1117 = f1116 - (f1116 / 1.11f);
                        A9.a(f1117, f5);
                        A9.f(Math.abs(((Number) aVarA19.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA110.getValue()).floatValue()), Math.abs(((Number) aVarA17.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA18.getValue()).floatValue()));
                        A9.c(Math.abs(((Number) aVarA17.getValue()).floatValue()) * 1.127f, f5);
                        dq40Var = dq40Var3;
                        dq40Var.a = A9;
                        ytwVar12 = ytwVar4;
                        e(l((((long) Float.floatToRawIntBits((f1116 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA19.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA110.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA17.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA18.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                        ?? A10 = m90.a();
                        A10.a(f1117, f5);
                        A10.f(Math.abs(((Number) aVarA19.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA110.getValue()).floatValue()), Math.abs(((Number) aVarA17.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA18.getValue()).floatValue()));
                        dq40Var2 = dq40Var4;
                        dq40Var2.a = A10;
                        bVar4.H();
                    } else {
                        c1350a = r15;
                        dq40Var = dq40Var3;
                        dq40Var2 = dq40Var4;
                        ytwVar12 = ytwVar4;
                        bVar4.N(1108100033);
                        bVar4.H();
                    }
                    rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj15) {
                            tcf tcfVar = (tcf) obj15;
                            tcfVar.getClass();
                            ytw ytwVar22 = ytwVar11;
                            if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                                tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                                tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                            }
                            return Unit.a;
                        }
                    }, bVar4, 6);
                    bVar4.H();
                }
                d dVarE16 = j.e(aVar8, 1.0f);
                aiv aivVarC15 = g75.c(n54Var, false);
                iHashCode4 = Long.hashCode(l2a.a(bVar4));
                ne00 ne00VarO111 = bVar4.o();
                d dVarC111 = c.c(bVar4, dVarE16);
                bVar4.D();
                if (bVar4.g()) {
                    aVar2 = aVar9;
                    bVar4.F(aVar2);
                } else {
                    aVar2 = aVar9;
                    bVar4.p();
                }
                bVar5 = bVar9;
                hlh0.a(bVar4, aivVarC15, bVar5);
                hlh0.a(bVar4, ne00VarO111, dVar3);
                if (bVar4.g()) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
                }
                hlh0.a(bVar4, dVarC111, cVar5);
                d dVarB3 = androidx.compose.foundation.layout.d.a.b(j.e(aVar8, 1.0f), n54Var);
                n54.a aVar14 = ht.a.m;
                kVar = kw0.c;
                i78 i78VarA8 = g78.a(kVar, aVar14, bVar4, 0);
                iHashCode5 = Long.hashCode(l2a.a(bVar4));
                ne00 ne00VarO112 = bVar4.o();
                d dVarC112 = c.c(bVar4, dVarB3);
                bVar4.D();
                if (bVar4.g()) {
                    bVar4.F(aVar2);
                } else {
                    bVar4.p();
                }
                hlh0.a(bVar4, i78VarA8, bVar5);
                hlh0.a(bVar4, ne00VarO112, dVar3);
                if (bVar4.g()) {
                    n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
                } else {
                    n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
                }
                hlh0.a(bVar4, dVarC112, cVar5);
                if (file == null) {
                    bVar6 = bVar4;
                    bVar6.N(55164684);
                } else {
                    bVar6 = bVar4;
                    bVar6.N(55164684);
                }
                bVar6.H();
                bVar6.s();
                bVar6.s();
                yp40Var = new yp40();
                objY13 = bVar6.y();
                c0042a3 = c0042a2;
                if (objY13 == c0042a3) {
                    objY13 = m.b(Boolean.FALSE);
                    bVar6.r(objY13);
                }
                ytwVar13 = (ytw) objY13;
                objY14 = bVar6.y();
                if (objY14 == c0042a3) {
                    objY14 = ee0.a(f2);
                    bVar6.r(objY14);
                }
                wd0Var3 = (wd0) objY14;
                objY15 = bVar6.y();
                if (objY15 == c0042a3) {
                    objY15 = m.b(Boolean.TRUE);
                    bVar6.r(objY15);
                }
                ((ytw) objY15).setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")));
                d(ytwVar13, Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING"));
                str = str8;
                zG = Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str);
                aVar3 = ht.a.n;
                if (zG) {
                    c0042a4 = c0042a3;
                    wd0Var4 = wd0Var3;
                    aVar4 = aVar3;
                    aVar5 = aVar8;
                    f6 = f2;
                    bVar7 = bVar5;
                    dVar = r4;
                    c1350a3 = c1350a2;
                    cVar = r5;
                    kVar2 = kVar;
                    bVar6.N(1108100033);
                } else {
                    c0042a4 = c0042a3;
                    wd0Var4 = wd0Var3;
                    aVar4 = aVar3;
                    aVar5 = aVar8;
                    f6 = f2;
                    bVar7 = bVar5;
                    dVar = r4;
                    c1350a3 = c1350a2;
                    cVar = r5;
                    kVar2 = kVar;
                    bVar6.N(1108100033);
                }
                bVar6.H();
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                    r9 = 0;
                    yp40Var.a = false;
                } else {
                    r9 = 0;
                }
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                    f7 = 1.0f;
                } else {
                    f7 = f6;
                }
                d dVarE17 = j.e(dw.a(aVar5, f7), 1.0f);
                n54 n54Var4 = ht.a.e;
                aiv aivVarC16 = g75.c(n54Var4, r9);
                iHashCode6 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO113 = bVar6.o();
                d dVarC113 = c.c(bVar6, dVarE17);
                bVar6.D();
                if (bVar6.g()) {
                    aVar6 = aVar2;
                    bVar6.F(aVar6);
                } else {
                    aVar6 = aVar2;
                    bVar6.p();
                }
                yka.a.b bVar14 = bVar7;
                hlh0.a(bVar6, aivVarC16, bVar14);
                yka.a.d dVar6 = dVar;
                hlh0.a(bVar6, ne00VarO113, dVar6);
                if (bVar6.g()) {
                    c1350a4 = c1350a3;
                    n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
                } else {
                    c1350a4 = c1350a3;
                    n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
                }
                yka.a.c cVar6 = cVar;
                hlh0.a(bVar6, dVarC113, cVar6);
                kw0.k kVar5 = kVar2;
                i78 i78VarA9 = g78.a(kVar5, aVar4, bVar6, 48);
                iHashCode7 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO114 = bVar6.o();
                d dVarC114 = c.c(bVar6, aVar5);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar6);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, i78VarA9, bVar14);
                hlh0.a(bVar6, ne00VarO114, dVar6);
                if (bVar6.g()) {
                    n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
                } else {
                    n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
                }
                hlh0.a(bVar6, dVarC114, cVar6);
                ty0.a(bVar6, j.i(aVar5, 16.0f));
                bVar6.s();
                bVar6.s();
                objY16 = bVar6.y();
                if (objY16 == c0042a4) {
                    objY16 = m.b(Boolean.FALSE);
                    bVar6.r(objY16);
                }
                ytwVar14 = (ytw) objY16;
                String str10 = str9;
                ytwVar14.setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str10)));
                if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.2f;
                }
                n54.a aVar15 = aVar4;
                c1350a5 = c1350a4;
                twd0 twd0VarB5 = xe0.b(f8, yi0.e(100, r9, xkf.a, 2), "scaleAnimation", null, bVar6, 3072, 20);
                bVar8 = bVar6;
                if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                    f9 = 1.0f;
                } else {
                    f9 = f6;
                }
                twd0 twd0VarB6 = xe0.b(f9, yi0.e(100, r9, null, 6), "alphaAnimation", null, bVar8, 3120, 20);
                Unit unit8 = Unit.a;
                objY17 = bVar8.y();
                if (objY17 == c0042a4) {
                    objY17 = new tpw(ytwVar14, null);
                    bVar8.r(objY17);
                }
                xvf.e(bVar8, unit8, (Function2) objY17);
                d dVarE18 = j.e(dw.a(aVar5, ((!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str10)) && !z) ? 1.0f : f6), 1.0f);
                aiv aivVarC17 = g75.c(n54Var4, r9);
                iHashCode8 = Long.hashCode(l2a.a(bVar8));
                ne00 ne00VarO115 = bVar8.o();
                d dVarC115 = c.c(bVar8, dVarE18);
                bVar8.D();
                if (bVar8.g()) {
                    bVar8.F(aVar6);
                } else {
                    bVar8.p();
                }
                hlh0.a(bVar8, aivVarC17, bVar14);
                hlh0.a(bVar8, ne00VarO115, dVar6);
                if (bVar8.g()) {
                    c1350a6 = c1350a5;
                    n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
                } else {
                    c1350a6 = c1350a5;
                    n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
                }
                hlh0.a(bVar8, dVarC115, cVar6);
                i78 i78VarA10 = g78.a(kVar5, aVar15, bVar8, 48);
                iHashCode9 = Long.hashCode(l2a.a(bVar8));
                ne00 ne00VarO116 = bVar8.o();
                d dVarC116 = c.c(bVar8, aVar5);
                bVar8.D();
                if (bVar8.g()) {
                    bVar8.F(aVar6);
                } else {
                    bVar8.p();
                }
                hlh0.a(bVar8, i78VarA10, bVar14);
                hlh0.a(bVar8, ne00VarO116, dVar6);
                if (bVar8.g()) {
                    n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
                } else {
                    n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
                }
                hlh0.a(bVar8, dVarC116, cVar6);
                String strC3 = op5.c(op5.a, pwo.e(R.string.flew_away_cms, bVar8), "FLEW AWAY!");
                j = j58.f;
                qyd0Var2 = ni60.b;
                imf0 imf0VarG5 = ni60.g(((sfd0) bVar8.O(qyd0Var2)).d, R.dimen._16ssp, bVar8);
                float fG3 = g(twd0VarB5);
                r28 = r9;
                a.C0041a.C0042a c0042a11 = c0042a4;
                aVar7 = aVar5;
                lkf0.b(strC3, h.j(dw.a(bz60.a(aVar5, fG3, fG3), h(twd0VarB6)), 3.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG5, bVar8, 384, 0, 65528);
                bVar = bVar8;
                if (((Boolean) ((x5a0) gojVar.j0).getValue()).booleanValue()) {
                    bVar.N(-607701549);
                    String strA3 = yk10.a(((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier(), "x");
                    d dVarA11 = s3w.a(h.j(aVar7, 3.0f, 0.0f, 0.0f, 0.0f, 14), "sj_current_multiplier");
                    if (!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                        j = j58.g;
                    }
                    imf0 imf0Var3 = ((sfd0) bVar.O(qyd0Var2)).e;
                    currentMultiplier = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                    if (currentMultiplier != null) {
                        length = currentMultiplier.length();
                    } else {
                        length = r28 == true ? 1 : 0;
                    }
                    if (length >= 9) {
                        i5 = R.dimen._40ssp;
                    } else {
                        currentMultiplier2 = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                        if (currentMultiplier2 != null) {
                            length2 = currentMultiplier2.length();
                        } else {
                            length2 = r28 == true ? 1 : 0;
                        }
                        if (length2 >= 7) {
                            i5 = R.dimen._50ssp;
                        } else {
                            i5 = R.dimen._60ssp;
                        }
                    }
                    imf0 imf0VarG6 = ni60.g(imf0Var3, i5, bVar);
                    if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                        jD = r58.d(2348810239L);
                    } else {
                        jD = j58.g;
                    }
                    long j5 = jD;
                    if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                        bVar.N(-1266493405);
                        fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(11));
                        bVar.H();
                    } else {
                        bVar.N(-606511552);
                        fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(r28 == true ? 1 : 0));
                        bVar.H();
                    }
                    lkf0.b(strA3, dVarA11, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0VarG6, 0L, 0L, null, null, null, 0L, null, new ix80(fD0, j5, 0L), null, 0, 0L, null, null, 16769023), bVar, 0, 0, 65528);
                    bVar = bVar;
                } else {
                    bVar.N(-639667478);
                }
                bVar.H();
                bVar.s();
                bVar.s();
                Boolean bool18 = (Boolean) ytwVar13.getValue();
                bool18.getClass();
                wd0Var5 = wd0Var4;
                zA5 = bVar.A(wd0Var5);
                objY18 = bVar.y();
                if (zA5) {
                    objY18 = new upw(wd0Var5, ytwVar13, null);
                    bVar.r(objY18);
                } else {
                    objY18 = new upw(wd0Var5, ytwVar13, null);
                    bVar.r(objY18);
                }
                xvf.e(bVar, bool18, (Function2) objY18);
            } else {
                c0042a = c0042a5;
            }
            c0042a = c0042a5;
            objY2 = new dpw();
            bVar3.r(objY2);
            c0042a = c0042a5;
            a.C0041a.C0042a c0042a12 = c0042a;
            bVar4 = bVar3;
            a(w.a(dVarA10, (Function1) objY2), 8, new yn60().E1, 1000, false, ytwVar, bVar4, i9);
            bVar4.s();
            d dVarE19 = j.e(aVar8, 1.0f);
            aiv aivVarC18 = g75.c(n54Var, false);
            iHashCode3 = Long.hashCode(l2a.a(bVar4));
            ne00 ne00VarO117 = bVar4.o();
            d dVarC117 = c.c(bVar4, dVarE19);
            bVar4.D();
            if (bVar4.g()) {
                bVar4.F(aVar9);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, aivVarC18, bVar9);
            hlh0.a(bVar4, ne00VarO117, dVar3);
            if (bVar4.g()) {
                n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
            } else {
                n30.a(iHashCode3, bVar4, iHashCode3, c1350a8);
            }
            hlh0.a(bVar4, dVarC117, cVar5);
            d dVarE110 = j.e(aVar8, 1.0f);
            zC3 = bVar4.c(density) | bVar4.c(f11);
            objY3 = bVar4.y();
            c0042a2 = c0042a12;
            if (zC3) {
                objY3 = new Function1() { // from class: fpw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        tcf tcfVar = (tcf) obj15;
                        tcfVar.getClass();
                        float f1118 = density;
                        float f1119 = f1118 / 40.0f;
                        float f11110 = f11;
                        float f11111 = (f11110 / 2.4f) * 1.05f;
                        float f11112 = f1118 / 10.0f;
                        float f11113 = (f11110 / 2.2f) * 1.05f;
                        float f21 = f1118 - f11112;
                        float f22 = f1118 - f1119;
                        float f23 = f11110 / 50.0f;
                        float f24 = f1118 - (f1118 / 1.11f);
                        float f25 = f11110 / 16.0f;
                        j90 j90VarA = m90.a();
                        float f26 = (f11110 / 60.0f) + f23;
                        Path path = j90VarA.a;
                        j90VarA.a(f1119, f26);
                        j90VarA.c(f1119, ((f11110 / 2.0f) - (f11110 / 17.0f)) * 1.05f);
                        RectF rectF = j90VarA.b;
                        if (rectF == null) {
                            rectF = new RectF();
                            j90VarA.b = rectF;
                        }
                        rectF.set(f1119, f11111, f11112, f11113);
                        RectF rectF2 = j90VarA.b;
                        rectF2.getClass();
                        path.arcTo(rectF2, 90.0f, 90.0f, true);
                        j90VarA.a(f1118 / 16.0f, f11113);
                        float f27 = f1118 - (f1118 / 18.0f);
                        j90VarA.c(f27, f11113);
                        RectF rectF3 = j90VarA.b;
                        if (rectF3 == null) {
                            rectF3 = new RectF();
                            j90VarA.b = rectF3;
                        }
                        rectF3.set(f21, f11111, f22, f11113);
                        RectF rectF4 = j90VarA.b;
                        rectF4.getClass();
                        path.arcTo(rectF4, 0.0f, 90.0f, true);
                        RectF rectF5 = j90VarA.b;
                        if (rectF5 == null) {
                            rectF5 = new RectF();
                            j90VarA.b = rectF5;
                        }
                        rectF5.set(f21, f11111, f22, f11113);
                        RectF rectF6 = j90VarA.b;
                        rectF6.getClass();
                        path.arcTo(rectF6, 270.0f, 90.0f, true);
                        j90VarA.a(f27, f11111);
                        j90VarA.c(f24, f11111);
                        j90VarA.a(f24, f11111);
                        j90VarA.c(f24, f26);
                        RectF rectF7 = j90VarA.b;
                        if (rectF7 == null) {
                            rectF7 = new RectF();
                            j90VarA.b = rectF7;
                        }
                        rectF7.set(f1119, f23, f24, f25);
                        RectF rectF8 = j90VarA.b;
                        rectF8.getClass();
                        path.arcTo(rectF8, 270.0f, 90.0f, true);
                        RectF rectF9 = j90VarA.b;
                        if (rectF9 == null) {
                            rectF9 = new RectF();
                            j90VarA.b = rectF9;
                        }
                        rectF9.set(f1119, f23, f24, f25);
                        RectF rectF10 = j90VarA.b;
                        rectF10.getClass();
                        path.arcTo(rectF10, 180.0f, 90.0f, true);
                        tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                        return Unit.a;
                    }
                };
                bVar4.r(objY3);
            } else {
                objY3 = new Function1() { // from class: fpw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        tcf tcfVar = (tcf) obj15;
                        tcfVar.getClass();
                        float f1118 = density;
                        float f1119 = f1118 / 40.0f;
                        float f11110 = f11;
                        float f11111 = (f11110 / 2.4f) * 1.05f;
                        float f11112 = f1118 / 10.0f;
                        float f11113 = (f11110 / 2.2f) * 1.05f;
                        float f21 = f1118 - f11112;
                        float f22 = f1118 - f1119;
                        float f23 = f11110 / 50.0f;
                        float f24 = f1118 - (f1118 / 1.11f);
                        float f25 = f11110 / 16.0f;
                        j90 j90VarA = m90.a();
                        float f26 = (f11110 / 60.0f) + f23;
                        Path path = j90VarA.a;
                        j90VarA.a(f1119, f26);
                        j90VarA.c(f1119, ((f11110 / 2.0f) - (f11110 / 17.0f)) * 1.05f);
                        RectF rectF = j90VarA.b;
                        if (rectF == null) {
                            rectF = new RectF();
                            j90VarA.b = rectF;
                        }
                        rectF.set(f1119, f11111, f11112, f11113);
                        RectF rectF2 = j90VarA.b;
                        rectF2.getClass();
                        path.arcTo(rectF2, 90.0f, 90.0f, true);
                        j90VarA.a(f1118 / 16.0f, f11113);
                        float f27 = f1118 - (f1118 / 18.0f);
                        j90VarA.c(f27, f11113);
                        RectF rectF3 = j90VarA.b;
                        if (rectF3 == null) {
                            rectF3 = new RectF();
                            j90VarA.b = rectF3;
                        }
                        rectF3.set(f21, f11111, f22, f11113);
                        RectF rectF4 = j90VarA.b;
                        rectF4.getClass();
                        path.arcTo(rectF4, 0.0f, 90.0f, true);
                        RectF rectF5 = j90VarA.b;
                        if (rectF5 == null) {
                            rectF5 = new RectF();
                            j90VarA.b = rectF5;
                        }
                        rectF5.set(f21, f11111, f22, f11113);
                        RectF rectF6 = j90VarA.b;
                        rectF6.getClass();
                        path.arcTo(rectF6, 270.0f, 90.0f, true);
                        j90VarA.a(f27, f11111);
                        j90VarA.c(f24, f11111);
                        j90VarA.a(f24, f11111);
                        j90VarA.c(f24, f26);
                        RectF rectF7 = j90VarA.b;
                        if (rectF7 == null) {
                            rectF7 = new RectF();
                            j90VarA.b = rectF7;
                        }
                        rectF7.set(f1119, f23, f24, f25);
                        RectF rectF8 = j90VarA.b;
                        rectF8.getClass();
                        path.arcTo(rectF8, 270.0f, 90.0f, true);
                        RectF rectF9 = j90VarA.b;
                        if (rectF9 == null) {
                            rectF9 = new RectF();
                            j90VarA.b = rectF9;
                        }
                        rectF9.set(f1119, f23, f24, f25);
                        RectF rectF10 = j90VarA.b;
                        rectF10.getClass();
                        path.arcTo(rectF10, 180.0f, 90.0f, true);
                        tcf.Q1(tcfVar, j90VarA, r58.d(4281808695L), 0.0f, new yae0(3.0f, 0.0f, 1, 1, null, 18), 52);
                        return Unit.a;
                    }
                };
                bVar4.r(objY3);
            }
            rxo.b(dVarE110, (Function1) objY3, bVar4, 6);
            String str11 = "ROUND_WAITING";
            if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_WAITING")) {
                Boolean bool19 = Boolean.FALSE;
                ((x5a0) ytwVar3).setValue(bool19);
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    Object obj15 = "Sporty_Santa_Jet_static";
                    ytwVar5 = ytwVar18;
                    ytwVar5.setValue(obj15);
                    obj2 = "Sporty_Jet_static";
                    obj = obj15;
                } else {
                    Object obj16 = "Sporty_Jet_static";
                    obj = "Sporty_Santa_Jet_static";
                    ytwVar5 = ytwVar18;
                    ytwVar5.setValue(obj16);
                    obj2 = obj16;
                }
                ytwVar6 = ytwVar20;
                ytwVar6.setValue(bool19);
                obj4 = obj;
                obj3 = obj2;
            } else {
                Boolean bool110 = Boolean.FALSE;
                ((x5a0) ytwVar3).setValue(bool110);
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    Object obj17 = "Sporty_Santa_Jet_static";
                    ytwVar5 = ytwVar18;
                    ytwVar5.setValue(obj17);
                    obj2 = "Sporty_Jet_static";
                    obj = obj17;
                } else {
                    Object obj18 = "Sporty_Jet_static";
                    obj = "Sporty_Santa_Jet_static";
                    ytwVar5 = ytwVar18;
                    ytwVar5.setValue(obj18);
                    obj2 = obj18;
                }
                ytwVar6 = ytwVar20;
                ytwVar6.setValue(bool110);
                obj4 = obj;
                obj3 = obj2;
            }
            bVar4.s();
            String str12 = "ROUND_END_WAIT";
            if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                bVar4.N(1124857951);
                objY4 = bVar4.y();
                if (objY4 == c0042a2) {
                    objY4 = m.b(Boolean.FALSE);
                    bVar4.r(objY4);
                }
                ytwVar7 = (ytw) objY4;
                objY5 = bVar4.y();
                if (objY5 == c0042a2) {
                    objY5 = ee0.a(0.0f);
                    bVar4.r(objY5);
                }
                wd0Var = (wd0) objY5;
                Unit unit9 = Unit.a;
                zA = bVar4.A(wd0Var);
                objY6 = bVar4.y();
                if (zA) {
                    objY6 = new vpw(wd0Var, null);
                    bVar4.r(objY6);
                } else {
                    objY6 = new vpw(wd0Var, null);
                    bVar4.r(objY6);
                }
                xvf.e(bVar4, unit9, (Function2) objY6);
                objY7 = bVar4.y();
                if (objY7 == c0042a2) {
                    objY7 = androidx.compose.runtime.j.a(0.0f);
                    bVar4.r(objY7);
                }
                iswVar = (isw) objY7;
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    ytwVar5.setValue("Sporty_Santa_Jet");
                } else {
                    ytwVar5.setValue("Sporty_Jet");
                }
                ibsVar = (ibs) bVar4.O(dVar2);
                ytwVar6.setValue(Boolean.TRUE);
                zA2 = bVar4.A(ibsVar);
                objY8 = bVar4.y();
                if (zA2) {
                    objY8 = new Function1() { // from class: hpw
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj19) {
                            ((use) obj19).getClass();
                            final ytw ytwVar22 = ytwVar7;
                            ?? r2 = new cbs() { // from class: tow
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar3, s9s.a aVar16) {
                                    if (aVar16 == s9s.a.ON_RESUME) {
                                        ytwVar22.setValue(Boolean.TRUE);
                                    }
                                }
                            };
                            ibs ibsVar3 = ibsVar;
                            ibsVar3.getLifecycle().a(r2);
                            return new zpw(ibsVar3, r2);
                        }
                    };
                    bVar4.r(objY8);
                } else {
                    objY8 = new Function1() { // from class: hpw
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj19) {
                            ((use) obj19).getClass();
                            final ytw ytwVar22 = ytwVar7;
                            ?? r2 = new cbs() { // from class: tow
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar3, s9s.a aVar16) {
                                    if (aVar16 == s9s.a.ON_RESUME) {
                                        ytwVar22.setValue(Boolean.TRUE);
                                    }
                                }
                            };
                            ibs ibsVar3 = ibsVar;
                            ibsVar3.getLifecycle().a(r2);
                            return new zpw(ibsVar3, r2);
                        }
                    };
                    bVar4.r(objY8);
                }
                xvf.c(ibsVar, (Function1) objY8, bVar4);
                mmd mmdVar6 = (mmd) bVar4.O(qyd0Var);
                bVar4.N(-1349151355);
                fC1 = mmdVar6.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                bVar4.H();
                objY9 = bVar4.y();
                if (objY9 == c0042a2) {
                    f2 = 0.0f;
                    objY9 = ee0.a(0.0f);
                    bVar4.r(objY9);
                } else {
                    f2 = 0.0f;
                }
                wd0Var2 = (wd0) objY9;
                ytwVar8 = ytwVar5;
                Boolean bool111 = (Boolean) ytwVar7.getValue();
                bool111.getClass();
                zA3 = bVar4.A(wd0Var2);
                ytwVar9 = ytwVar6;
                objY10 = bVar4.y();
                if (zA3) {
                    objY10 = new wpw(wd0Var2, ytwVar7, null);
                    bVar4.r(objY10);
                } else {
                    objY10 = new wpw(wd0Var2, ytwVar7, null);
                    bVar4.r(objY10);
                }
                xvf.e(bVar4, bool111, (Function2) objY10);
                d dVarI6 = j.i(j.g(aVar8, 1.0f), mmdVar6.v1(f11));
                zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                objY11 = bVar4.y();
                if (zC4) {
                    ytwVar10 = ytwVar21;
                    Function1 function11 = new Function1() { // from class: jpw
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /*  JADX ERROR: Types fix failed
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                            Caused by: java.lang.NullPointerException
                            */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object r18) {
                            /*
                                Method dump skipped, instruction units count: 361
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    f3 = fC1;
                    gojVar2 = gojVar;
                    ytwVar11 = ytwVar;
                    bVar4.r(function11);
                    objY11 = function11;
                } else {
                    ytwVar10 = ytwVar21;
                    Function1 function12 = new Function1() { // from class: jpw
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /*  JADX ERROR: Types fix failed
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                            Caused by: java.lang.NullPointerException
                            */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object r18) {
                            /*
                                Method dump skipped, instruction units count: 361
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    f3 = fC1;
                    gojVar2 = gojVar;
                    ytwVar11 = ytwVar;
                    bVar4.r(function12);
                    objY11 = function12;
                }
                rxo.b(dVarI6, (Function1) objY11, bVar4, 0);
                Boolean bool112 = (Boolean) ytwVar7.getValue();
                bool112.getClass();
                zA4 = bVar4.A(gojVar2);
                objY12 = bVar4.y();
                if (zA4) {
                    objY12 = new xpw(gojVar2, iswVar, null);
                    bVar4.r(objY12);
                } else {
                    objY12 = new xpw(gojVar2, iswVar, null);
                    bVar4.r(objY12);
                }
                xvf.e(bVar4, bool112, (Function2) objY12);
                f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                f5 = f11 / 2.29f;
                if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                    bVar4.N(1129739397);
                    egn egnVarB6 = kgn.b("Path infinite transition", bVar4, 0);
                    float f1118 = 0.398958f * f4;
                    float f1119 = 0.4625f * f4 * 1.127f;
                    wkf wkfVar6 = xkf.d;
                    float f11110 = f3;
                    gzg0 gzg0VarE6 = yi0.e(2350, 0, wkfVar6, 2);
                    l850 l850Var6 = l850.b;
                    egn.a aVarA111 = kgn.a(egnVarB6, f1118, f1119, yi0.a(gzg0VarE6, l850Var6, 0L, 4), "Path animation", bVar4, 28680, 0);
                    c1350a = c1350a8;
                    egn.a aVarA112 = kgn.a(egnVarB6, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar6, 2), l850Var6, 0L, 4), "Path animation", bVar4, 28680, 0);
                    egn.a aVarA113 = kgn.a(egnVarB6, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar6, 2), l850Var6, 0L, 4), "Path animation", bVar4, 28680, 0);
                    egn.a aVarA114 = kgn.a(egnVarB6, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar6, 2), l850Var6, 0L, 4), "Path animation", bVar4, 28680, 0);
                    bVar4 = bVar4;
                    ?? A11 = m90.a();
                    float f11111 = f11110 - (f11110 / 1.11f);
                    A11.a(f11111, f5);
                    A11.f(Math.abs(((Number) aVarA113.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA114.getValue()).floatValue()), Math.abs(((Number) aVarA111.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA112.getValue()).floatValue()));
                    A11.c(Math.abs(((Number) aVarA111.getValue()).floatValue()) * 1.127f, f5);
                    dq40Var = dq40Var3;
                    dq40Var.a = A11;
                    ytwVar12 = ytwVar4;
                    e(l((((long) Float.floatToRawIntBits((f11110 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA113.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA114.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA111.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA112.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                    ?? A12 = m90.a();
                    A12.a(f11111, f5);
                    A12.f(Math.abs(((Number) aVarA113.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA114.getValue()).floatValue()), Math.abs(((Number) aVarA111.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA112.getValue()).floatValue()));
                    dq40Var2 = dq40Var4;
                    dq40Var2.a = A12;
                    bVar4.H();
                } else {
                    c1350a = r15;
                    dq40Var = dq40Var3;
                    dq40Var2 = dq40Var4;
                    ytwVar12 = ytwVar4;
                    bVar4.N(1108100033);
                    bVar4.H();
                }
                rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj19) {
                        tcf tcfVar = (tcf) obj19;
                        tcfVar.getClass();
                        ytw ytwVar22 = ytwVar11;
                        if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                            tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                            tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                        }
                        return Unit.a;
                    }
                }, bVar4, 6);
                bVar4.H();
            } else {
                bVar4.N(1124857951);
                objY4 = bVar4.y();
                if (objY4 == c0042a2) {
                    objY4 = m.b(Boolean.FALSE);
                    bVar4.r(objY4);
                }
                ytwVar7 = (ytw) objY4;
                objY5 = bVar4.y();
                if (objY5 == c0042a2) {
                    objY5 = ee0.a(0.0f);
                    bVar4.r(objY5);
                }
                wd0Var = (wd0) objY5;
                Unit unit10 = Unit.a;
                zA = bVar4.A(wd0Var);
                objY6 = bVar4.y();
                if (zA) {
                    objY6 = new vpw(wd0Var, null);
                    bVar4.r(objY6);
                } else {
                    objY6 = new vpw(wd0Var, null);
                    bVar4.r(objY6);
                }
                xvf.e(bVar4, unit10, (Function2) objY6);
                objY7 = bVar4.y();
                if (objY7 == c0042a2) {
                    objY7 = androidx.compose.runtime.j.a(0.0f);
                    bVar4.r(objY7);
                }
                iswVar = (isw) objY7;
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    ytwVar5.setValue("Sporty_Santa_Jet");
                } else {
                    ytwVar5.setValue("Sporty_Jet");
                }
                ibsVar = (ibs) bVar4.O(dVar2);
                ytwVar6.setValue(Boolean.TRUE);
                zA2 = bVar4.A(ibsVar);
                objY8 = bVar4.y();
                if (zA2) {
                    objY8 = new Function1() { // from class: hpw
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj19) {
                            ((use) obj19).getClass();
                            final ytw ytwVar22 = ytwVar7;
                            ?? r2 = new cbs() { // from class: tow
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar3, s9s.a aVar16) {
                                    if (aVar16 == s9s.a.ON_RESUME) {
                                        ytwVar22.setValue(Boolean.TRUE);
                                    }
                                }
                            };
                            ibs ibsVar3 = ibsVar;
                            ibsVar3.getLifecycle().a(r2);
                            return new zpw(ibsVar3, r2);
                        }
                    };
                    bVar4.r(objY8);
                } else {
                    objY8 = new Function1() { // from class: hpw
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tow] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj19) {
                            ((use) obj19).getClass();
                            final ytw ytwVar22 = ytwVar7;
                            ?? r2 = new cbs() { // from class: tow
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar3, s9s.a aVar16) {
                                    if (aVar16 == s9s.a.ON_RESUME) {
                                        ytwVar22.setValue(Boolean.TRUE);
                                    }
                                }
                            };
                            ibs ibsVar3 = ibsVar;
                            ibsVar3.getLifecycle().a(r2);
                            return new zpw(ibsVar3, r2);
                        }
                    };
                    bVar4.r(objY8);
                }
                xvf.c(ibsVar, (Function1) objY8, bVar4);
                mmd mmdVar7 = (mmd) bVar4.O(qyd0Var);
                bVar4.N(-1349151355);
                fC1 = mmdVar7.C1(((Configuration) bVar4.O(chfVar)).screenWidthDp);
                bVar4.H();
                objY9 = bVar4.y();
                if (objY9 == c0042a2) {
                    f2 = 0.0f;
                    objY9 = ee0.a(0.0f);
                    bVar4.r(objY9);
                } else {
                    f2 = 0.0f;
                }
                wd0Var2 = (wd0) objY9;
                ytwVar8 = ytwVar5;
                Boolean bool113 = (Boolean) ytwVar7.getValue();
                bool113.getClass();
                zA3 = bVar4.A(wd0Var2);
                ytwVar9 = ytwVar6;
                objY10 = bVar4.y();
                if (zA3) {
                    objY10 = new wpw(wd0Var2, ytwVar7, null);
                    bVar4.r(objY10);
                } else {
                    objY10 = new wpw(wd0Var2, ytwVar7, null);
                    bVar4.r(objY10);
                }
                xvf.e(bVar4, bool113, (Function2) objY10);
                d dVarI7 = j.i(j.g(aVar8, 1.0f), mmdVar7.v1(f11));
                zC4 = bVar4.c(fC1) | bVar4.c(f11) | ((i4 & 14) == 4) | bVar4.A(wd0Var2) | bVar4.A(gojVar);
                objY11 = bVar4.y();
                if (zC4) {
                    ytwVar10 = ytwVar21;
                    Function1 function13 = new Function1() { // from class: jpw
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /*  JADX ERROR: Types fix failed
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                            Caused by: java.lang.NullPointerException
                            */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object r18) {
                            /*
                                Method dump skipped, instruction units count: 361
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    f3 = fC1;
                    gojVar2 = gojVar;
                    ytwVar11 = ytwVar;
                    bVar4.r(function13);
                    objY11 = function13;
                } else {
                    ytwVar10 = ytwVar21;
                    Function1 function14 = new Function1() { // from class: jpw
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v20 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v21 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r4v22 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v22 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /*  JADX ERROR: Types fix failed
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: char
                            Caused by: java.lang.NullPointerException
                            */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object r18) {
                            /*
                                Method dump skipped, instruction units count: 361
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.jpw.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    f3 = fC1;
                    gojVar2 = gojVar;
                    ytwVar11 = ytwVar;
                    bVar4.r(function14);
                    objY11 = function14;
                }
                rxo.b(dVarI7, (Function1) objY11, bVar4, 0);
                Boolean bool114 = (Boolean) ytwVar7.getValue();
                bool114.getClass();
                zA4 = bVar4.A(gojVar2);
                objY12 = bVar4.y();
                if (zA4) {
                    objY12 = new xpw(gojVar2, iswVar, null);
                    bVar4.r(objY12);
                } else {
                    objY12 = new xpw(gojVar2, iswVar, null);
                    bVar4.r(objY12);
                }
                xvf.e(bVar4, bool114, (Function2) objY12);
                f4 = (f3 - (f3 / 9.0f)) * 1.127f;
                f5 = f11 / 2.29f;
                if (((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                    bVar4.N(1129739397);
                    egn egnVarB7 = kgn.b("Path infinite transition", bVar4, 0);
                    float f11112 = 0.398958f * f4;
                    float f11113 = 0.4625f * f4 * 1.127f;
                    wkf wkfVar7 = xkf.d;
                    float f11114 = f3;
                    gzg0 gzg0VarE7 = yi0.e(2350, 0, wkfVar7, 2);
                    l850 l850Var7 = l850.b;
                    egn.a aVarA115 = kgn.a(egnVarB7, f11112, f11113, yi0.a(gzg0VarE7, l850Var7, 0L, 4), "Path animation", bVar4, 28680, 0);
                    c1350a = c1350a8;
                    egn.a aVarA116 = kgn.a(egnVarB7, 0.43f * f5, 0.5f * f5, yi0.a(yi0.e(2350, 0, wkfVar7, 2), l850Var7, 0L, 4), "Path animation", bVar4, 28680, 0);
                    egn.a aVarA117 = kgn.a(egnVarB7, 0.375291f * f4, 0.4415f * f4 * 1.127f, yi0.a(yi0.e(2350, 0, wkfVar7, 2), l850Var7, 0L, 4), "Path animation", bVar4, 28680, 0);
                    egn.a aVarA118 = kgn.a(egnVarB7, 0.75f * f5, 0.9f * f5, yi0.a(yi0.e(2350, 0, wkfVar7, 2), l850Var7, 0L, 4), "Path animation", bVar4, 28680, 0);
                    bVar4 = bVar4;
                    ?? A13 = m90.a();
                    float f11115 = f11114 - (f11114 / 1.11f);
                    A13.a(f11115, f5);
                    A13.f(Math.abs(((Number) aVarA117.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA118.getValue()).floatValue()), Math.abs(((Number) aVarA115.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA116.getValue()).floatValue()));
                    A13.c(Math.abs(((Number) aVarA115.getValue()).floatValue()) * 1.127f, f5);
                    dq40Var = dq40Var3;
                    dq40Var.a = A13;
                    ytwVar12 = ytwVar4;
                    e(l((((long) Float.floatToRawIntBits((f11114 * 1.127f) / 10.0f)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA117.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA118.getValue()).floatValue()))) & 4294967295L), (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA115.getValue()).floatValue()) * 1.127f)) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((Number) aVarA116.getValue()).floatValue()))) & 4294967295L)), ytwVar12);
                    ?? A14 = m90.a();
                    A14.a(f11115, f5);
                    A14.f(Math.abs(((Number) aVarA117.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA118.getValue()).floatValue()), Math.abs(((Number) aVarA115.getValue()).floatValue()) * 1.127f, Math.abs(((Number) aVarA116.getValue()).floatValue()));
                    dq40Var2 = dq40Var4;
                    dq40Var2.a = A14;
                    bVar4.H();
                } else {
                    c1350a = r15;
                    dq40Var = dq40Var3;
                    dq40Var2 = dq40Var4;
                    ytwVar12 = ytwVar4;
                    bVar4.N(1108100033);
                    bVar4.H();
                }
                rxo.b(j.e(aVar8, 1.0f), new Function1() { // from class: lpw
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj19) {
                        tcf tcfVar = (tcf) obj19;
                        tcfVar.getClass();
                        ytw ytwVar22 = ytwVar11;
                        if (Intrinsics.g(((MultiplierResponse) ytwVar22.getValue()).getMessageType(), "ROUND_ONGOING") && ((Boolean) ((x5a0) gojVar2.a0).getValue()).booleanValue()) {
                            tcf.Q1(tcfVar, (bxz) dq40Var2.a, aqw.k(ytwVar22), 0.0f, new yae0(6.0f, 0.0f, 0, 0, null, 30), 52);
                            tcf.Q1(tcfVar, (bxz) dq40Var.a, aqw.k(ytwVar22), 0.2f, rlh.a, 48);
                        }
                        return Unit.a;
                    }
                }, bVar4, 6);
                bVar4.H();
            }
            d dVarE111 = j.e(aVar8, 1.0f);
            aiv aivVarC19 = g75.c(n54Var, false);
            iHashCode4 = Long.hashCode(l2a.a(bVar4));
            ne00 ne00VarO118 = bVar4.o();
            d dVarC118 = c.c(bVar4, dVarE111);
            bVar4.D();
            if (bVar4.g()) {
                aVar2 = aVar9;
                bVar4.F(aVar2);
            } else {
                aVar2 = aVar9;
                bVar4.p();
            }
            bVar5 = bVar9;
            hlh0.a(bVar4, aivVarC19, bVar5);
            hlh0.a(bVar4, ne00VarO118, dVar3);
            if (bVar4.g()) {
                c1350a2 = c1350a;
                n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
            } else {
                c1350a2 = c1350a;
                n30.a(iHashCode4, bVar4, iHashCode4, c1350a2);
            }
            hlh0.a(bVar4, dVarC118, cVar5);
            d dVarB4 = androidx.compose.foundation.layout.d.a.b(j.e(aVar8, 1.0f), n54Var);
            n54.a aVar16 = ht.a.m;
            kVar = kw0.c;
            i78 i78VarA11 = g78.a(kVar, aVar16, bVar4, 0);
            iHashCode5 = Long.hashCode(l2a.a(bVar4));
            ne00 ne00VarO119 = bVar4.o();
            d dVarC119 = c.c(bVar4, dVarB4);
            bVar4.D();
            if (bVar4.g()) {
                bVar4.F(aVar2);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, i78VarA11, bVar5);
            hlh0.a(bVar4, ne00VarO119, dVar3);
            if (bVar4.g()) {
                n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
            } else {
                n30.a(iHashCode5, bVar4, iHashCode5, c1350a2);
            }
            hlh0.a(bVar4, dVarC119, cVar5);
            if (file == null) {
                bVar6 = bVar4;
                bVar6.N(55164684);
            } else {
                bVar6 = bVar4;
                bVar6.N(55164684);
            }
            bVar6.H();
            bVar6.s();
            bVar6.s();
            yp40Var = new yp40();
            objY13 = bVar6.y();
            c0042a3 = c0042a2;
            if (objY13 == c0042a3) {
                objY13 = m.b(Boolean.FALSE);
                bVar6.r(objY13);
            }
            ytwVar13 = (ytw) objY13;
            objY14 = bVar6.y();
            if (objY14 == c0042a3) {
                objY14 = ee0.a(f2);
                bVar6.r(objY14);
            }
            wd0Var3 = (wd0) objY14;
            objY15 = bVar6.y();
            if (objY15 == c0042a3) {
                objY15 = m.b(Boolean.TRUE);
                bVar6.r(objY15);
            }
            ((ytw) objY15).setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")));
            d(ytwVar13, Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING"));
            str = str11;
            zG = Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str);
            aVar3 = ht.a.n;
            if (zG) {
                c0042a4 = c0042a3;
                wd0Var4 = wd0Var3;
                aVar4 = aVar3;
                aVar5 = aVar8;
                f6 = f2;
                bVar7 = bVar5;
                dVar = r4;
                c1350a3 = c1350a2;
                cVar = r5;
                kVar2 = kVar;
                bVar6.N(1108100033);
            } else {
                c0042a4 = c0042a3;
                wd0Var4 = wd0Var3;
                aVar4 = aVar3;
                aVar5 = aVar8;
                f6 = f2;
                bVar7 = bVar5;
                dVar = r4;
                c1350a3 = c1350a2;
                cVar = r5;
                kVar2 = kVar;
                bVar6.N(1108100033);
            }
            bVar6.H();
            if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                r9 = 0;
                yp40Var.a = false;
            } else {
                r9 = 0;
            }
            if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str)) {
                f7 = 1.0f;
            } else {
                f7 = f6;
            }
            d dVarE112 = j.e(dw.a(aVar5, f7), 1.0f);
            n54 n54Var5 = ht.a.e;
            aiv aivVarC110 = g75.c(n54Var5, r9);
            iHashCode6 = Long.hashCode(l2a.a(bVar6));
            ne00 ne00VarO1110 = bVar6.o();
            d dVarC1110 = c.c(bVar6, dVarE112);
            bVar6.D();
            if (bVar6.g()) {
                aVar6 = aVar2;
                bVar6.F(aVar6);
            } else {
                aVar6 = aVar2;
                bVar6.p();
            }
            yka.a.b bVar15 = bVar7;
            hlh0.a(bVar6, aivVarC110, bVar15);
            yka.a.d dVar7 = dVar;
            hlh0.a(bVar6, ne00VarO1110, dVar7);
            if (bVar6.g()) {
                c1350a4 = c1350a3;
                n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
            } else {
                c1350a4 = c1350a3;
                n30.a(iHashCode6, bVar6, iHashCode6, c1350a4);
            }
            yka.a.c cVar7 = cVar;
            hlh0.a(bVar6, dVarC1110, cVar7);
            kw0.k kVar6 = kVar2;
            i78 i78VarA12 = g78.a(kVar6, aVar4, bVar6, 48);
            iHashCode7 = Long.hashCode(l2a.a(bVar6));
            ne00 ne00VarO1111 = bVar6.o();
            d dVarC1111 = c.c(bVar6, aVar5);
            bVar6.D();
            if (bVar6.g()) {
                bVar6.F(aVar6);
            } else {
                bVar6.p();
            }
            hlh0.a(bVar6, i78VarA12, bVar15);
            hlh0.a(bVar6, ne00VarO1111, dVar7);
            if (bVar6.g()) {
                n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
            } else {
                n30.a(iHashCode7, bVar6, iHashCode7, c1350a4);
            }
            hlh0.a(bVar6, dVarC1111, cVar7);
            ty0.a(bVar6, j.i(aVar5, 16.0f));
            bVar6.s();
            bVar6.s();
            objY16 = bVar6.y();
            if (objY16 == c0042a4) {
                objY16 = m.b(Boolean.FALSE);
                bVar6.r(objY16);
            }
            ytwVar14 = (ytw) objY16;
            String str13 = str12;
            ytwVar14.setValue(Boolean.valueOf(Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str13)));
            if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                f8 = 1.0f;
            } else {
                f8 = 0.2f;
            }
            n54.a aVar17 = aVar4;
            c1350a5 = c1350a4;
            twd0 twd0VarB7 = xe0.b(f8, yi0.e(100, r9, xkf.a, 2), "scaleAnimation", null, bVar6, 3072, 20);
            bVar8 = bVar6;
            if (((Boolean) ytwVar14.getValue()).booleanValue()) {
                f9 = 1.0f;
            } else {
                f9 = f6;
            }
            twd0 twd0VarB8 = xe0.b(f9, yi0.e(100, r9, null, 6), "alphaAnimation", null, bVar8, 3120, 20);
            Unit unit11 = Unit.a;
            objY17 = bVar8.y();
            if (objY17 == c0042a4) {
                objY17 = new tpw(ytwVar14, null);
                bVar8.r(objY17);
            }
            xvf.e(bVar8, unit11, (Function2) objY17);
            d dVarE113 = j.e(dw.a(aVar5, ((!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), str13)) && !z) ? 1.0f : f6), 1.0f);
            aiv aivVarC111 = g75.c(n54Var5, r9);
            iHashCode8 = Long.hashCode(l2a.a(bVar8));
            ne00 ne00VarO1112 = bVar8.o();
            d dVarC1112 = c.c(bVar8, dVarE113);
            bVar8.D();
            if (bVar8.g()) {
                bVar8.F(aVar6);
            } else {
                bVar8.p();
            }
            hlh0.a(bVar8, aivVarC111, bVar15);
            hlh0.a(bVar8, ne00VarO1112, dVar7);
            if (bVar8.g()) {
                c1350a6 = c1350a5;
                n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
            } else {
                c1350a6 = c1350a5;
                n30.a(iHashCode8, bVar8, iHashCode8, c1350a6);
            }
            hlh0.a(bVar8, dVarC1112, cVar7);
            i78 i78VarA13 = g78.a(kVar6, aVar17, bVar8, 48);
            iHashCode9 = Long.hashCode(l2a.a(bVar8));
            ne00 ne00VarO1113 = bVar8.o();
            d dVarC1113 = c.c(bVar8, aVar5);
            bVar8.D();
            if (bVar8.g()) {
                bVar8.F(aVar6);
            } else {
                bVar8.p();
            }
            hlh0.a(bVar8, i78VarA13, bVar15);
            hlh0.a(bVar8, ne00VarO1113, dVar7);
            if (bVar8.g()) {
                n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
            } else {
                n30.a(iHashCode9, bVar8, iHashCode9, c1350a6);
            }
            hlh0.a(bVar8, dVarC1113, cVar7);
            String strC4 = op5.c(op5.a, pwo.e(R.string.flew_away_cms, bVar8), "FLEW AWAY!");
            j = j58.f;
            qyd0Var2 = ni60.b;
            imf0 imf0VarG7 = ni60.g(((sfd0) bVar8.O(qyd0Var2)).d, R.dimen._16ssp, bVar8);
            float fG4 = g(twd0VarB7);
            r28 = r9;
            a.C0041a.C0042a c0042a13 = c0042a4;
            aVar7 = aVar5;
            lkf0.b(strC4, h.j(dw.a(bz60.a(aVar5, fG4, fG4), h(twd0VarB8)), 3.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG7, bVar8, 384, 0, 65528);
            bVar = bVar8;
            if (((Boolean) ((x5a0) gojVar.j0).getValue()).booleanValue()) {
                bVar.N(-607701549);
                String strA4 = yk10.a(((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier(), "x");
                d dVarA12 = s3w.a(h.j(aVar7, 3.0f, 0.0f, 0.0f, 0.0f, 14), "sj_current_multiplier");
                if (!Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                    j = j58.g;
                }
                imf0 imf0Var4 = ((sfd0) bVar.O(qyd0Var2)).e;
                currentMultiplier = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                if (currentMultiplier != null) {
                    length = currentMultiplier.length();
                } else {
                    length = r28 == true ? 1 : 0;
                }
                if (length >= 9) {
                    i5 = R.dimen._40ssp;
                } else {
                    currentMultiplier2 = ((MultiplierResponse) ytwVar.getValue()).getCurrentMultiplier();
                    if (currentMultiplier2 != null) {
                        length2 = currentMultiplier2.length();
                    } else {
                        length2 = r28 == true ? 1 : 0;
                    }
                    if (length2 >= 7) {
                        i5 = R.dimen._50ssp;
                    } else {
                        i5 = R.dimen._60ssp;
                    }
                }
                imf0 imf0VarG8 = ni60.g(imf0Var4, i5, bVar);
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                    jD = r58.d(2348810239L);
                } else {
                    jD = j58.g;
                }
                long j6 = jD;
                if (Intrinsics.g(((MultiplierResponse) ytwVar.getValue()).getMessageType(), "ROUND_ONGOING")) {
                    bVar.N(-1266493405);
                    fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(11));
                    bVar.H();
                } else {
                    bVar.N(-606511552);
                    fD0 = ((mmd) bVar.O(qyd0Var)).D0(d2l.f(r28 == true ? 1 : 0));
                    bVar.H();
                }
                lkf0.b(strA4, dVarA12, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0VarG8, 0L, 0L, null, null, null, 0L, null, new ix80(fD0, j6, 0L), null, 0, 0L, null, null, 16769023), bVar, 0, 0, 65528);
                bVar = bVar;
            } else {
                bVar.N(-639667478);
            }
            bVar.H();
            bVar.s();
            bVar.s();
            Boolean bool115 = (Boolean) ytwVar13.getValue();
            bool115.getClass();
            wd0Var5 = wd0Var4;
            zA5 = bVar.A(wd0Var5);
            objY18 = bVar.y();
            if (zA5) {
                objY18 = new upw(wd0Var5, ytwVar13, null);
                bVar.r(objY18);
            } else {
                objY18 = new upw(wd0Var5, ytwVar13, null);
                bVar.r(objY18);
            }
            xvf.e(bVar, bool115, (Function2) objY18);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.e(new Function2(file, file2, file3, gojVar, function0, i, z, i2) { // from class: ppw
                public final /* synthetic */ File b;
                public final /* synthetic */ File c;
                public final /* synthetic */ File d;
                public final /* synthetic */ goj e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ int i;
                public final /* synthetic */ boolean v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj19, Object obj20) {
                    ((Integer) obj20).getClass();
                    int iA = qj40.a(1);
                    aqw.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj19, iA);
                    return Unit.a;
                }
            });
        }
    }

    public static final long c(ytw<gly> ytwVar) {
        return ytwVar.getValue().a;
    }

    public static final void d(ytw<Boolean> ytwVar, boolean z) {
        ytwVar.setValue(Boolean.valueOf(z));
    }

    public static final void e(long j, ytw ytwVar) {
        ytwVar.setValue(new gly(j));
    }

    public static final float f(isw iswVar) {
        return iswVar.j();
    }

    public static final float g(twd0<Float> twd0Var) {
        return twd0Var.getValue().floatValue();
    }

    public static final float h(twd0<Float> twd0Var) {
        return twd0Var.getValue().floatValue();
    }

    public static final long i(ytw<gly> ytwVar) {
        return ytwVar.getValue().a;
    }

    public static final void j(ytw<MultiplierResponse> ytwVar, goj gojVar, a aVar, int i) {
        b bVar;
        int i2;
        boolean z;
        int i3;
        float fD0;
        ytwVar.getClass();
        gojVar.getClass();
        b bVarI = aVar.i(263840755);
        int i4 = (bVarI.M(ytwVar) ? 4 : 2) | i | (bVarI.A(gojVar) ? 32 : 16);
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            float f = (Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_ONGOING") || Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_END_WAIT")) ? 1.0f : 0.0f;
            d.a aVar2 = d.a.b;
            d dVarE = j.e(dw.a(aVar2, f), 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            qyd0 qyd0Var = ni60.b;
            lkf0.b("", dw.a(aVar2, 0.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(qyd0Var)).d, R.dimen._16ssp, bVarI), bVarI, 54, 0, 65532);
            bVar = bVarI;
            if (((Boolean) ((x5a0) gojVar.j0).getValue()).booleanValue()) {
                bVar.N(1193767978);
                String strA = yk10.a(ytwVar.getValue().getCurrentMultiplier(), "x");
                long j = Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_ONGOING") ? j58.f : j58.g;
                imf0 imf0Var = ((sfd0) bVar.O(qyd0Var)).e;
                String currentMultiplier = ytwVar.getValue().getCurrentMultiplier();
                if ((currentMultiplier != null ? currentMultiplier.length() : 0) >= 9) {
                    i3 = R.dimen._40ssp;
                } else {
                    String currentMultiplier2 = ytwVar.getValue().getCurrentMultiplier();
                    i3 = (currentMultiplier2 != null ? currentMultiplier2.length() : 0) >= 7 ? R.dimen._50ssp : R.dimen._60ssp;
                }
                imf0 imf0VarG = ni60.g(imf0Var, i3, bVar);
                long jD = Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_ONGOING") ? r58.d(2348810239L) : j58.g;
                if (Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_ONGOING")) {
                    bVar.N(-377101630);
                    fD0 = ((mmd) bVar.O(kna.h)).D0(d2l.f(11));
                    bVar.X(false);
                } else {
                    bVar.N(1194829697);
                    fD0 = ((mmd) bVar.O(kna.h)).D0(d2l.f(0));
                    bVar.X(false);
                }
                lkf0.b(strA, null, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(imf0VarG, 0L, 0L, null, null, null, 0L, null, new ix80(fD0, jD, 0L), null, 0, 0L, null, null, 16769023), bVar, 0, 0, 65530);
                bVar = bVar;
                z = false;
            } else {
                z = false;
                bVar.N(1186531307);
            }
            bVar.X(z);
            i2 = 1;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            i2 = 1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new hei(ytwVar, i, i2, gojVar);
        }
    }

    public static final long k(ytw<MultiplierResponse> ytwVar) {
        ytwVar.getClass();
        if (!Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_ONGOING") && !Intrinsics.g(ytwVar.getValue().getMessageType(), "ROUND_END_WAIT")) {
            return j58.g;
        }
        String currentMultiplier = ytwVar.getValue().getCurrentMultiplier();
        if ((currentMultiplier != null ? Double.parseDouble(currentMultiplier) : 0.0d) <= 1.5d) {
            return new yn60().n1;
        }
        String currentMultiplier2 = ytwVar.getValue().getCurrentMultiplier();
        if ((currentMultiplier2 != null ? Double.parseDouble(currentMultiplier2) : 0.0d) <= 4.9d) {
            return new yn60().o1;
        }
        String currentMultiplier3 = ytwVar.getValue().getCurrentMultiplier();
        if ((currentMultiplier3 != null ? Double.parseDouble(currentMultiplier3) : 0.0d) <= 9.9d) {
            return new yn60().p1;
        }
        String currentMultiplier4 = ytwVar.getValue().getCurrentMultiplier();
        return (currentMultiplier4 != null ? Double.parseDouble(currentMultiplier4) : 0.0d) <= 18.9d ? new yn60().q1 : new yn60().r1;
    }

    public static final long l(long j, long j2, long j3) {
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j3 >> 32)) * 1.0f) + (Float.intBitsToFloat((int) (j2 >> 32)) * 0.0f) + (Float.intBitsToFloat((int) (j >> 32)) * 0.0f);
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j3 & 4294967295L)) * 1.0f) + (Float.intBitsToFloat((int) (j2 & 4294967295L)) * 0.0f) + (Float.intBitsToFloat((int) (j & 4294967295L)) * 0.0f);
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }
}
