package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class jib0 {
    public static final void a(final d dVar, final UiText uiText, final long j, final iyf0 iyf0Var, final Function0 function0, final zs7 zs7Var, a aVar, final int i) {
        int i2;
        b bVar;
        boolean z;
        Pair pair;
        boolean z2;
        float f;
        b bVarI = aVar.i(645570738);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(uiText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.d(iyf0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(zs7Var) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d dVarG = j.g(dVar, 1.0f);
            iyf0 iyf0Var2 = iyf0.b;
            n54 n54Var = ht.a.e;
            n54 n54Var2 = ht.a.d;
            aiv aivVarC = g75.c(iyf0Var == iyf0Var2 ? n54Var : n54Var2, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int iOrdinal = iyf0Var.ordinal();
            n54 n54Var3 = ht.a.f;
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal == 1) {
                    pair = new Pair(n54Var, n54Var3);
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    pair = new Pair(n54Var3, n54Var2);
                }
            } else {
                z = true;
                pair = new Pair(n54Var2, n54Var3);
            }
            ht htVar = (ht) pair.a;
            final ht htVar2 = (ht) pair.b;
            uiText.getClass();
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).d;
            float f2 = 0.0f;
            if (zs7Var == null || iyf0Var != iyf0Var2) {
                z2 = false;
                bVarI.N(-162023966);
                bVarI.X(false);
                f = 0.0f;
            } else {
                bVarI.N(-162115137);
                float f3 = zs7Var.a + ((cjb0) bVarI.O(ejb0.a)).e;
                z2 = false;
                bVarI.X(false);
                f = f3;
            }
            if (zs7Var != null) {
                bVarI.N(-161918721);
                f2 = ((cjb0) bVarI.O(ejb0.a)).e + zs7Var.a;
                bVarI.X(z2);
            } else {
                bVarI.N(-161827550);
                bVarI.X(z2);
            }
            d dVarJ = h.j(d.a.b, f, 0.0f, f2, 0.0f, 10);
            boolean z3 = z2;
            boolean z4 = z;
            lkf0.d(strG, g3w.h(androidx.compose.foundation.layout.d.a.b(dVarJ, htVar), "bottom_sheet_title"), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, i2 & 896, 0, 131064);
            bVar = bVarI;
            if (zs7Var != null) {
                bVar.N(-161534042);
                hna.a(zxo.d.a(new g7f(Float.NaN)), pp8.b(718378097, new Function2() { // from class: uhb0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            zs7 zs7Var2 = zs7Var;
                            boolean zM = aVar3.M(zs7Var2);
                            Function0 function1 = function0;
                            boolean zM2 = zM | aVar3.M(function1);
                            Object objY = aVar3.y();
                            if (zM2 || objY == a.C0041a.a) {
                                objY = new h470(1, zs7Var2, function1);
                                aVar3.r(objY);
                            }
                            c6n.a((Function0) objY, g3w.h(ls7.a(j.r(androidx.compose.foundation.layout.d.a.b(jib0.h(d.a.b, zs7Var2.b), htVar2), zs7Var2.a), j060.a), AnalyticsParam.STORY_SKIP_REASON_CLOSE), false, null, null, ns9.f, aVar3, 1572864, 60);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVar), bVar, 56);
                bVar.X(z3);
            } else {
                bVar.N(-160688362);
                bVar.X(z3);
            }
            bVar.X(z4);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vhb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jib0.a(dVar, uiText, j, iyf0Var, function0, zs7Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final w45 w45Var, final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(-18454322);
        int i2 = (bVarI.M(w45Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = h(dVar, w45Var.a());
            if (w45Var instanceof w45.b) {
                bVarI.N(-16677052);
                ((w45.b) w45Var).b.invoke(dVarH, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!(w45Var instanceof w45.c)) {
                    throw igf0.a(bVarI, -554728587, false);
                }
                bVarI.N(-16533956);
                w45.c cVar = (w45.c) w45Var;
                UiText uiText = cVar.c;
                uiText.getClass();
                aza.a(dVarH, uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), cVar.d, null, sya.b, null, null, cVar.b, cVar.f, null, bVarI, 0, 616);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: whb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jib0.b(w45Var, dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final w45 w45Var, final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(-141036516);
        int i2 = (bVarI.M(w45Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarH = h(dVar, w45Var.a());
            if (w45Var instanceof w45.b) {
                bVarI.N(-1140614922);
                ((w45.b) w45Var).b.invoke(dVarH, bVarI, 0);
                bVarI.X(false);
            } else {
                if (!(w45Var instanceof w45.c)) {
                    throw igf0.a(bVarI, 1902867330, false);
                }
                bVarI.N(-1140471857);
                w45.c cVar = (w45.c) w45Var;
                UiText uiText = cVar.c;
                uiText.getClass();
                p9z.a(dVarH, uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), cVar.d, null, null, sya.b, cVar.b, cVar.f, null, bVarI, 0, 280);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gib0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jib0.c(w45Var, dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:128:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0201  */
    /* JADX WARN: Code duplicated, block: B:174:0x0213  */
    /* JADX WARN: Code duplicated, block: B:178:0x0221  */
    /* JADX WARN: Code duplicated, block: B:181:0x022a  */
    /* JADX WARN: Code duplicated, block: B:183:0x023d  */
    /* JADX WARN: Code duplicated, block: B:209:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0290  */
    /* JADX WARN: Code duplicated, block: B:211:0x0293  */
    /* JADX WARN: Code duplicated, block: B:213:0x0296  */
    /* JADX WARN: Code duplicated, block: B:214:0x029c  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:218:0x02af  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:227:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:228:0x02df  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:234:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:235:0x031d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0322  */
    /* JADX WARN: Code duplicated, block: B:239:0x033e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0342  */
    /* JADX WARN: Code duplicated, block: B:242:0x0344  */
    /* JADX WARN: Code duplicated, block: B:244:0x0348  */
    /* JADX WARN: Code duplicated, block: B:245:0x034b  */
    /* JADX WARN: Code duplicated, block: B:248:0x0353  */
    /* JADX WARN: Code duplicated, block: B:249:0x035b  */
    /* JADX WARN: Code duplicated, block: B:251:0x035f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0378  */
    /* JADX WARN: Code duplicated, block: B:255:0x03be  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:266:0x0442  */
    /* JADX WARN: Code duplicated, block: B:269:0x0463  */
    /* JADX WARN: Code duplicated, block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:94:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public static final void d(d dVar, final UiText uiText, w1w w1wVar, long j, long j2, long j3, iyf0 iyf0Var, zs7 zs7Var, final z45 z45Var, m65 m65Var, h55 h55Var, Function0 function0, final Function0 function1, Function2 function2, Function2 function3, gaj gajVar, final op8 op8Var, a aVar, final int i, final int i2, final int i3) {
        d dVar2;
        int i4;
        int i5;
        long j4;
        int i6;
        int iOrdinal;
        int i7;
        zs7 zs7Var2;
        m65 m65VarA;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        b bVar;
        final w1w w1wVar2;
        final iyf0 iyf0Var2;
        final h55 h55Var2;
        final Function0 function4;
        Function2 function5;
        final Function2 function6;
        final gaj gajVar2;
        d dVar3;
        final m65 m65Var2;
        final long j5;
        final zs7 zs7Var3;
        final long j6;
        final long j7;
        e eVarZ;
        d dVar4;
        w1w w1wVar3;
        long j8;
        d dVar5;
        long j9;
        iyf0 iyf0Var3;
        long j10;
        b bVar2;
        h55 h55VarA;
        Function0 function7;
        Function2 function8;
        h55 h55Var3;
        Function2 zhb0Var;
        w1w w1wVar4;
        final zs7 zs7Var4;
        long j11;
        final h55 h55Var4;
        Function2 function9;
        final Function0 function10;
        int i16;
        iyf0 iyf0Var4;
        long j12;
        final m65 m65Var3;
        int i17;
        final gaj gajVar3;
        boolean z2;
        boolean z3;
        Object objY;
        boolean zA;
        int i18;
        int i19;
        int i20;
        int i21;
        uiText.getClass();
        z45Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1956766801);
        int i22 = i3 & 1;
        if (i22 != 0) {
            i4 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.M(uiText) ? 32 : 16;
        }
        int i23 = i3 & 4;
        if (i23 == 0) {
            if ((i & 384) == 0) {
                i4 |= bVarI.M(w1wVar) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i3 & 8) == 0 || !bVarI.e(j)) {
                    i21 = 1024;
                } else {
                    i21 = 2048;
                }
                i4 |= i21;
            }
            i5 = 8192;
            if ((i & 24576) != 0) {
                if ((i3 & 16) == 0 || !bVarI.e(j2)) {
                    i20 = 8192;
                } else {
                    i20 = 16384;
                }
                i4 |= i20;
            }
            if ((i & 196608) == 0) {
                j4 = j3;
                if ((i3 & 32) == 0 || !bVarI.e(j4)) {
                    i19 = 65536;
                } else {
                    i19 = 131072;
                }
                i4 |= i19;
            } else {
                j4 = j3;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (iyf0Var == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = iyf0Var.ordinal();
                }
                if (bVarI.d(iOrdinal)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    zs7Var2 = zs7Var;
                    int i24 = bVarI.M(zs7Var2) ? 8388608 : 4194304;
                    i4 |= i24;
                } else {
                    zs7Var2 = zs7Var;
                }
                i4 |= i24;
            } else {
                zs7Var2 = zs7Var;
            }
            if ((i & 100663296) == 0) {
                if ((i & 134217728) == 0) {
                    zA = bVarI.M(z45Var);
                } else {
                    zA = bVarI.A(z45Var);
                }
                if (zA) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i4 |= i18;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    m65VarA = m65Var;
                    int i25 = bVarI.M(m65VarA) ? 536870912 : 268435456;
                    i4 |= i25;
                } else {
                    m65VarA = m65Var;
                }
                i4 |= i25;
            } else {
                m65VarA = m65Var;
            }
            if ((i2 & 6) == 0) {
                i8 = i2 | (((i3 & 1024) == 0 || !bVarI.M(h55Var)) ? 2 : 4);
            } else {
                i8 = i2;
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
                if ((i2 & 48) == 0) {
                    if (bVarI.A(function0)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i8 |= i10;
                }
                if ((i2 & 384) == 0) {
                    i8 |= bVarI.A(function1) ? 256 : 128;
                }
                i11 = i8;
                i12 = i3 & 8192;
                if (i12 != 0) {
                    if ((i2 & 3072) == 0) {
                        i11 |= bVarI.A(function2) ? 2048 : 1024;
                    }
                    i13 = i11;
                    if ((i2 & 24576) == 0) {
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && bVarI.A(function3)) {
                            i5 = 16384;
                        }
                        i14 = i13 | i5;
                    } else {
                        i14 = i13;
                    }
                    i15 = i3 & 32768;
                    if (i15 != 0) {
                        i14 |= 196608;
                    } else if ((i2 & 196608) == 0) {
                        i14 |= bVarI.A(gajVar) ? 131072 : 65536;
                    }
                    if ((i2 & 1572864) == 0) {
                        i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
                    }
                    if ((i4 & 306783379) == 306783378 || (i14 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i4 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i22 != 0) {
                                dVar4 = d.a.b;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i23 != 0) {
                                w1wVar3 = new w1w();
                            } else {
                                w1wVar3 = w1wVar;
                            }
                            if ((i3 & 8) != 0) {
                                j8 = ((lib0) bVarI.O(oib0.a)).i0;
                                i4 &= -7169;
                            } else {
                                j8 = j;
                            }
                            dVar5 = dVar4;
                            if ((i3 & 16) != 0) {
                                j9 = ((lib0) bVarI.O(oib0.a)).a;
                                i4 &= -57345;
                            } else {
                                j9 = j2;
                            }
                            if ((i3 & 32) != 0) {
                                j4 = ((lib0) bVarI.O(oib0.a)).c;
                                i4 &= -458753;
                            }
                            if (i6 != 0) {
                                iyf0Var3 = iyf0.a;
                            } else {
                                iyf0Var3 = iyf0Var;
                            }
                            j10 = j9;
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                                zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                            }
                            if ((i3 & 512) != 0) {
                                bVar2 = bVarI;
                                m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                                i4 &= -1879048193;
                            } else {
                                bVar2 = bVarI;
                            }
                            if ((i3 & 1024) != 0) {
                                h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                                i14 &= -15;
                            } else {
                                h55VarA = h55Var;
                            }
                            if (i9 != 0) {
                                function7 = null;
                            } else {
                                function7 = function0;
                            }
                            if (i12 != 0) {
                                function8 = ns9.a;
                            } else {
                                function8 = function2;
                            }
                            h55Var3 = h55VarA;
                            if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                zhb0Var = new zhb0();
                                i14 &= -57345;
                            } else {
                                zhb0Var = function3;
                            }
                            if (i15 != 0) {
                                w1wVar4 = w1wVar3;
                                zs7Var4 = zs7Var2;
                                j11 = j8;
                                h55Var4 = h55Var3;
                                function9 = zhb0Var;
                                function10 = function7;
                                i16 = i4;
                                function5 = function8;
                                iyf0Var4 = iyf0Var3;
                                j12 = j4;
                                m65Var3 = m65VarA;
                                i17 = i14;
                                gajVar3 = ns9.b;
                                dVar3 = dVar5;
                            } else {
                                dVar3 = dVar5;
                                w1wVar4 = w1wVar3;
                                zs7Var4 = zs7Var2;
                                j11 = j8;
                                h55Var4 = h55Var3;
                                function9 = zhb0Var;
                                function10 = function7;
                                i16 = i4;
                                function5 = function8;
                                iyf0Var4 = iyf0Var3;
                                j12 = j4;
                                m65Var3 = m65VarA;
                                i17 = i14;
                            }
                            bVar2.Y();
                            int i26 = i16;
                            final long j13 = j12;
                            final iyf0 iyf0Var5 = iyf0Var4;
                            j590 j590VarG = v1w.g(true, null, bVar2, 6, 2);
                            qyd0 qyd0Var = ajb0.a;
                            i060 i060VarE = j060.e(((zib0) bVar2.O(qyd0Var)).d, ((zib0) bVar2.O(qyd0Var)).d, 0.0f, 0.0f, 12);
                            if ((i17 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = z2 | ((i17 & 896) == 256);
                            objY = bVar2.y();
                            if (z3 || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: aib0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Function0 function11 = function10;
                                        if (function11 != null) {
                                            function11.invoke();
                                        }
                                        function1.invoke();
                                        return Unit.a;
                                    }
                                };
                                bVar2.r(objY);
                            }
                            Function0 function11 = function10;
                            b bVar3 = bVar2;
                            final Function2 function12 = function5;
                            op8 op8VarB = pp8.b(-1807812207, new gaj() { // from class: bib0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    a aVar2 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    ((j78) obj).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        jib0.e(g3w.a(d.a.b, function12 == null, new fib0(), null, aVar2, 6, 4), uiText, j13, iyf0Var5, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVar3);
                            int i27 = i26 << 9;
                            int i28 = i17 >> 9;
                            v1w.a((Function0) objY, dVar3, j590VarG, 0.0f, false, i060VarE, j11, j10, 0L, function5, function9, w1wVar4, op8VarB, bVar3, ((i26 << 3) & 112) | (3670016 & i27) | (i27 & 29360128), (i28 & 112) | (i28 & 14) | 3072 | (i26 & 896), 792);
                            bVar = bVar3;
                            iyf0Var2 = iyf0Var5;
                            m65Var2 = m65Var3;
                            h55Var2 = h55Var4;
                            gajVar2 = gajVar3;
                            function6 = function9;
                            function4 = function11;
                            j6 = j13;
                            zs7Var3 = zs7Var4;
                            j5 = j11;
                            j7 = j10;
                            w1wVar2 = w1wVar4;
                        } else {
                            bVarI.G();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i14 &= -15;
                            }
                            if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                i14 &= -57345;
                            }
                            w1wVar4 = w1wVar;
                            j11 = j;
                            j10 = j2;
                            function5 = function2;
                            function9 = function3;
                            bVar2 = bVarI;
                            dVar3 = dVar2;
                            i16 = i4;
                            j12 = j4;
                            zs7Var4 = zs7Var2;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            iyf0Var4 = iyf0Var;
                            h55Var4 = h55Var;
                            function10 = function0;
                        }
                        gajVar3 = gajVar;
                        bVar2.Y();
                        int i29 = i16;
                        final long j14 = j12;
                        final iyf0 iyf0Var6 = iyf0Var4;
                        j590 j590VarG2 = v1w.g(true, null, bVar2, 6, 2);
                        qyd0 qyd0Var2 = ajb0.a;
                        i060 i060VarE2 = j060.e(((zib0) bVar2.O(qyd0Var2)).d, ((zib0) bVar2.O(qyd0Var2)).d, 0.0f, 0.0f, 12);
                        if ((i17 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = z2 | ((i17 & 896) == 256);
                        objY = bVar2.y();
                        if (z3) {
                            objY = new Function0() { // from class: aib0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Function0 function13 = function10;
                                    if (function13 != null) {
                                        function13.invoke();
                                    }
                                    function1.invoke();
                                    return Unit.a;
                                }
                            };
                            bVar2.r(objY);
                        } else {
                            objY = new Function0() { // from class: aib0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Function0 function13 = function10;
                                    if (function13 != null) {
                                        function13.invoke();
                                    }
                                    function1.invoke();
                                    return Unit.a;
                                }
                            };
                            bVar2.r(objY);
                        }
                        Function0 function13 = function10;
                        b bVar4 = bVar2;
                        final Function2 function14 = function5;
                        op8 op8VarB2 = pp8.b(-1807812207, new gaj() { // from class: bib0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                a aVar2 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((j78) obj).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    jib0.e(g3w.a(d.a.b, function14 == null, new fib0(), null, aVar2, 6, 4), uiText, j14, iyf0Var6, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVar4);
                        int i210 = i29 << 9;
                        int i211 = i17 >> 9;
                        v1w.a((Function0) objY, dVar3, j590VarG2, 0.0f, false, i060VarE2, j11, j10, 0L, function5, function9, w1wVar4, op8VarB2, bVar4, ((i29 << 3) & 112) | (3670016 & i210) | (i210 & 29360128), (i211 & 112) | (i211 & 14) | 3072 | (i29 & 896), 792);
                        bVar = bVar4;
                        iyf0Var2 = iyf0Var6;
                        m65Var2 = m65Var3;
                        h55Var2 = h55Var4;
                        gajVar2 = gajVar3;
                        function6 = function9;
                        function4 = function13;
                        j6 = j14;
                        zs7Var3 = zs7Var4;
                        j5 = j11;
                        j7 = j10;
                        w1wVar2 = w1wVar4;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        w1wVar2 = w1wVar;
                        iyf0Var2 = iyf0Var;
                        h55Var2 = h55Var;
                        function4 = function0;
                        function5 = function2;
                        function6 = function3;
                        gajVar2 = gajVar;
                        dVar3 = dVar2;
                        m65Var2 = m65VarA;
                        j5 = j;
                        zs7Var3 = zs7Var2;
                        j6 = j4;
                        j7 = j2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        final d dVar6 = dVar3;
                        final Function2 function15 = function5;
                        eVarZ.d = new Function2() { // from class: cib0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                int iA2 = qj40.a(i2);
                                jib0.d(dVar6, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function15, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                                return Unit.a;
                            }
                        };
                    }
                }
                i11 |= 3072;
                i13 = i11;
                if ((i2 & 24576) == 0) {
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        i5 = 16384;
                    }
                    i14 = i13 | i5;
                } else {
                    i14 = i13;
                }
                i15 = i3 & 32768;
                if (i15 != 0) {
                    i14 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i14 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
                }
                if ((i4 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i22 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i23 != 0) {
                            w1wVar3 = new w1w();
                        } else {
                            w1wVar3 = w1wVar;
                        }
                        if ((i3 & 8) != 0) {
                            j8 = ((lib0) bVarI.O(oib0.a)).i0;
                            i4 &= -7169;
                        } else {
                            j8 = j;
                        }
                        dVar5 = dVar4;
                        if ((i3 & 16) != 0) {
                            j9 = ((lib0) bVarI.O(oib0.a)).a;
                            i4 &= -57345;
                        } else {
                            j9 = j2;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).c;
                            i4 &= -458753;
                        }
                        if (i6 != 0) {
                            iyf0Var3 = iyf0.a;
                        } else {
                            iyf0Var3 = iyf0Var;
                        }
                        j10 = j9;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        }
                        if ((i3 & 512) != 0) {
                            bVar2 = bVarI;
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            i4 &= -1879048193;
                        } else {
                            bVar2 = bVarI;
                        }
                        if ((i3 & 1024) != 0) {
                            h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                            i14 &= -15;
                        } else {
                            h55VarA = h55Var;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function0;
                        }
                        if (i12 != 0) {
                            function8 = ns9.a;
                        } else {
                            function8 = function2;
                        }
                        h55Var3 = h55VarA;
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            zhb0Var = new zhb0();
                            i14 &= -57345;
                        } else {
                            zhb0Var = function3;
                        }
                        if (i15 != 0) {
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = ns9.b;
                            dVar3 = dVar5;
                        } else {
                            dVar3 = dVar5;
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = gajVar;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i23 != 0) {
                            w1wVar3 = new w1w();
                        } else {
                            w1wVar3 = w1wVar;
                        }
                        if ((i3 & 8) != 0) {
                            j8 = ((lib0) bVarI.O(oib0.a)).i0;
                            i4 &= -7169;
                        } else {
                            j8 = j;
                        }
                        dVar5 = dVar4;
                        if ((i3 & 16) != 0) {
                            j9 = ((lib0) bVarI.O(oib0.a)).a;
                            i4 &= -57345;
                        } else {
                            j9 = j2;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).c;
                            i4 &= -458753;
                        }
                        if (i6 != 0) {
                            iyf0Var3 = iyf0.a;
                        } else {
                            iyf0Var3 = iyf0Var;
                        }
                        j10 = j9;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        }
                        if ((i3 & 512) != 0) {
                            bVar2 = bVarI;
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            i4 &= -1879048193;
                        } else {
                            bVar2 = bVarI;
                        }
                        if ((i3 & 1024) != 0) {
                            h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                            i14 &= -15;
                        } else {
                            h55VarA = h55Var;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function0;
                        }
                        if (i12 != 0) {
                            function8 = ns9.a;
                        } else {
                            function8 = function2;
                        }
                        h55Var3 = h55VarA;
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            zhb0Var = new zhb0();
                            i14 &= -57345;
                        } else {
                            zhb0Var = function3;
                        }
                        if (i15 != 0) {
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = ns9.b;
                            dVar3 = dVar5;
                        } else {
                            dVar3 = dVar5;
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = gajVar;
                        }
                    }
                    bVar2.Y();
                    int i212 = i16;
                    final long j15 = j12;
                    final iyf0 iyf0Var7 = iyf0Var4;
                    j590 j590VarG3 = v1w.g(true, null, bVar2, 6, 2);
                    qyd0 qyd0Var3 = ajb0.a;
                    i060 i060VarE3 = j060.e(((zib0) bVar2.O(qyd0Var3)).d, ((zib0) bVar2.O(qyd0Var3)).d, 0.0f, 0.0f, 12);
                    if ((i17 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i17 & 896) == 256);
                    objY = bVar2.y();
                    if (z3) {
                        objY = new Function0() { // from class: aib0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function16 = function10;
                                if (function16 != null) {
                                    function16.invoke();
                                }
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY);
                    } else {
                        objY = new Function0() { // from class: aib0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function16 = function10;
                                if (function16 != null) {
                                    function16.invoke();
                                }
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY);
                    }
                    Function0 function16 = function10;
                    b bVar5 = bVar2;
                    final Function2 function17 = function5;
                    op8 op8VarB3 = pp8.b(-1807812207, new gaj() { // from class: bib0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((j78) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                jib0.e(g3w.a(d.a.b, function17 == null, new fib0(), null, aVar2, 6, 4), uiText, j15, iyf0Var7, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVar5);
                    int i213 = i212 << 9;
                    int i214 = i17 >> 9;
                    v1w.a((Function0) objY, dVar3, j590VarG3, 0.0f, false, i060VarE3, j11, j10, 0L, function5, function9, w1wVar4, op8VarB3, bVar5, ((i212 << 3) & 112) | (3670016 & i213) | (i213 & 29360128), (i214 & 112) | (i214 & 14) | 3072 | (i212 & 896), 792);
                    bVar = bVar5;
                    iyf0Var2 = iyf0Var7;
                    m65Var2 = m65Var3;
                    h55Var2 = h55Var4;
                    gajVar2 = gajVar3;
                    function6 = function9;
                    function4 = function16;
                    j6 = j15;
                    zs7Var3 = zs7Var4;
                    j5 = j11;
                    j7 = j10;
                    w1wVar2 = w1wVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    w1wVar2 = w1wVar;
                    iyf0Var2 = iyf0Var;
                    h55Var2 = h55Var;
                    function4 = function0;
                    function5 = function2;
                    function6 = function3;
                    gajVar2 = gajVar;
                    dVar3 = dVar2;
                    m65Var2 = m65VarA;
                    j5 = j;
                    zs7Var3 = zs7Var2;
                    j6 = j4;
                    j7 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    final d dVar7 = dVar3;
                    final Function2 function18 = function5;
                    eVarZ.d = new Function2() { // from class: cib0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            jib0.d(dVar7, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function18, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i8 |= 48;
            if ((i2 & 384) == 0) {
                i8 |= bVarI.A(function1) ? 256 : 128;
            }
            i11 = i8;
            i12 = i3 & 8192;
            if (i12 != 0) {
                if ((i2 & 3072) == 0) {
                    i11 |= bVarI.A(function2) ? 2048 : 1024;
                }
                i13 = i11;
                if ((i2 & 24576) == 0) {
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        i5 = 16384;
                    }
                    i14 = i13 | i5;
                } else {
                    i14 = i13;
                }
                i15 = i3 & 32768;
                if (i15 != 0) {
                    i14 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i14 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
                }
                if ((i4 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i22 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i23 != 0) {
                            w1wVar3 = new w1w();
                        } else {
                            w1wVar3 = w1wVar;
                        }
                        if ((i3 & 8) != 0) {
                            j8 = ((lib0) bVarI.O(oib0.a)).i0;
                            i4 &= -7169;
                        } else {
                            j8 = j;
                        }
                        dVar5 = dVar4;
                        if ((i3 & 16) != 0) {
                            j9 = ((lib0) bVarI.O(oib0.a)).a;
                            i4 &= -57345;
                        } else {
                            j9 = j2;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).c;
                            i4 &= -458753;
                        }
                        if (i6 != 0) {
                            iyf0Var3 = iyf0.a;
                        } else {
                            iyf0Var3 = iyf0Var;
                        }
                        j10 = j9;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        }
                        if ((i3 & 512) != 0) {
                            bVar2 = bVarI;
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            i4 &= -1879048193;
                        } else {
                            bVar2 = bVarI;
                        }
                        if ((i3 & 1024) != 0) {
                            h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                            i14 &= -15;
                        } else {
                            h55VarA = h55Var;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function0;
                        }
                        if (i12 != 0) {
                            function8 = ns9.a;
                        } else {
                            function8 = function2;
                        }
                        h55Var3 = h55VarA;
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            zhb0Var = new zhb0();
                            i14 &= -57345;
                        } else {
                            zhb0Var = function3;
                        }
                        if (i15 != 0) {
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = ns9.b;
                            dVar3 = dVar5;
                        } else {
                            dVar3 = dVar5;
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = gajVar;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i23 != 0) {
                            w1wVar3 = new w1w();
                        } else {
                            w1wVar3 = w1wVar;
                        }
                        if ((i3 & 8) != 0) {
                            j8 = ((lib0) bVarI.O(oib0.a)).i0;
                            i4 &= -7169;
                        } else {
                            j8 = j;
                        }
                        dVar5 = dVar4;
                        if ((i3 & 16) != 0) {
                            j9 = ((lib0) bVarI.O(oib0.a)).a;
                            i4 &= -57345;
                        } else {
                            j9 = j2;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).c;
                            i4 &= -458753;
                        }
                        if (i6 != 0) {
                            iyf0Var3 = iyf0.a;
                        } else {
                            iyf0Var3 = iyf0Var;
                        }
                        j10 = j9;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        }
                        if ((i3 & 512) != 0) {
                            bVar2 = bVarI;
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            i4 &= -1879048193;
                        } else {
                            bVar2 = bVarI;
                        }
                        if ((i3 & 1024) != 0) {
                            h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                            i14 &= -15;
                        } else {
                            h55VarA = h55Var;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function0;
                        }
                        if (i12 != 0) {
                            function8 = ns9.a;
                        } else {
                            function8 = function2;
                        }
                        h55Var3 = h55VarA;
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            zhb0Var = new zhb0();
                            i14 &= -57345;
                        } else {
                            zhb0Var = function3;
                        }
                        if (i15 != 0) {
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = ns9.b;
                            dVar3 = dVar5;
                        } else {
                            dVar3 = dVar5;
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = gajVar;
                        }
                    }
                    bVar2.Y();
                    int i215 = i16;
                    final long j16 = j12;
                    final iyf0 iyf0Var8 = iyf0Var4;
                    j590 j590VarG4 = v1w.g(true, null, bVar2, 6, 2);
                    qyd0 qyd0Var4 = ajb0.a;
                    i060 i060VarE4 = j060.e(((zib0) bVar2.O(qyd0Var4)).d, ((zib0) bVar2.O(qyd0Var4)).d, 0.0f, 0.0f, 12);
                    if ((i17 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i17 & 896) == 256);
                    objY = bVar2.y();
                    if (z3) {
                        objY = new Function0() { // from class: aib0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function19 = function10;
                                if (function19 != null) {
                                    function19.invoke();
                                }
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY);
                    } else {
                        objY = new Function0() { // from class: aib0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function19 = function10;
                                if (function19 != null) {
                                    function19.invoke();
                                }
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY);
                    }
                    Function0 function19 = function10;
                    b bVar6 = bVar2;
                    final Function2 function110 = function5;
                    op8 op8VarB4 = pp8.b(-1807812207, new gaj() { // from class: bib0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((j78) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                jib0.e(g3w.a(d.a.b, function110 == null, new fib0(), null, aVar2, 6, 4), uiText, j16, iyf0Var8, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVar6);
                    int i216 = i215 << 9;
                    int i217 = i17 >> 9;
                    v1w.a((Function0) objY, dVar3, j590VarG4, 0.0f, false, i060VarE4, j11, j10, 0L, function5, function9, w1wVar4, op8VarB4, bVar6, ((i215 << 3) & 112) | (3670016 & i216) | (i216 & 29360128), (i217 & 112) | (i217 & 14) | 3072 | (i215 & 896), 792);
                    bVar = bVar6;
                    iyf0Var2 = iyf0Var8;
                    m65Var2 = m65Var3;
                    h55Var2 = h55Var4;
                    gajVar2 = gajVar3;
                    function6 = function9;
                    function4 = function19;
                    j6 = j16;
                    zs7Var3 = zs7Var4;
                    j5 = j11;
                    j7 = j10;
                    w1wVar2 = w1wVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    w1wVar2 = w1wVar;
                    iyf0Var2 = iyf0Var;
                    h55Var2 = h55Var;
                    function4 = function0;
                    function5 = function2;
                    function6 = function3;
                    gajVar2 = gajVar;
                    dVar3 = dVar2;
                    m65Var2 = m65VarA;
                    j5 = j;
                    zs7Var3 = zs7Var2;
                    j6 = j4;
                    j7 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    final d dVar8 = dVar3;
                    final Function2 function111 = function5;
                    eVarZ.d = new Function2() { // from class: cib0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            jib0.d(dVar8, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function111, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i11 |= 3072;
            i13 = i11;
            if ((i2 & 24576) == 0) {
                if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                    i5 = 16384;
                }
                i14 = i13 | i5;
            } else {
                i14 = i13;
            }
            i15 = i3 & 32768;
            if (i15 != 0) {
                i14 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i14 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
            }
            if ((i4 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i22 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i23 != 0) {
                        w1wVar3 = new w1w();
                    } else {
                        w1wVar3 = w1wVar;
                    }
                    if ((i3 & 8) != 0) {
                        j8 = ((lib0) bVarI.O(oib0.a)).i0;
                        i4 &= -7169;
                    } else {
                        j8 = j;
                    }
                    dVar5 = dVar4;
                    if ((i3 & 16) != 0) {
                        j9 = ((lib0) bVarI.O(oib0.a)).a;
                        i4 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i3 & 32) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -458753;
                    }
                    if (i6 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    j10 = j9;
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    if ((i3 & 512) != 0) {
                        bVar2 = bVarI;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        i4 &= -1879048193;
                    } else {
                        bVar2 = bVarI;
                    }
                    if ((i3 & 1024) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                        i14 &= -15;
                    } else {
                        h55VarA = h55Var;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function0;
                    }
                    if (i12 != 0) {
                        function8 = ns9.a;
                    } else {
                        function8 = function2;
                    }
                    h55Var3 = h55VarA;
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        zhb0Var = new zhb0();
                        i14 &= -57345;
                    } else {
                        zhb0Var = function3;
                    }
                    if (i15 != 0) {
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = ns9.b;
                        dVar3 = dVar5;
                    } else {
                        dVar3 = dVar5;
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = gajVar;
                    }
                } else {
                    if (i22 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i23 != 0) {
                        w1wVar3 = new w1w();
                    } else {
                        w1wVar3 = w1wVar;
                    }
                    if ((i3 & 8) != 0) {
                        j8 = ((lib0) bVarI.O(oib0.a)).i0;
                        i4 &= -7169;
                    } else {
                        j8 = j;
                    }
                    dVar5 = dVar4;
                    if ((i3 & 16) != 0) {
                        j9 = ((lib0) bVarI.O(oib0.a)).a;
                        i4 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i3 & 32) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -458753;
                    }
                    if (i6 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    j10 = j9;
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    if ((i3 & 512) != 0) {
                        bVar2 = bVarI;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        i4 &= -1879048193;
                    } else {
                        bVar2 = bVarI;
                    }
                    if ((i3 & 1024) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                        i14 &= -15;
                    } else {
                        h55VarA = h55Var;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function0;
                    }
                    if (i12 != 0) {
                        function8 = ns9.a;
                    } else {
                        function8 = function2;
                    }
                    h55Var3 = h55VarA;
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        zhb0Var = new zhb0();
                        i14 &= -57345;
                    } else {
                        zhb0Var = function3;
                    }
                    if (i15 != 0) {
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = ns9.b;
                        dVar3 = dVar5;
                    } else {
                        dVar3 = dVar5;
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = gajVar;
                    }
                }
                bVar2.Y();
                int i218 = i16;
                final long j17 = j12;
                final iyf0 iyf0Var9 = iyf0Var4;
                j590 j590VarG5 = v1w.g(true, null, bVar2, 6, 2);
                qyd0 qyd0Var5 = ajb0.a;
                i060 i060VarE5 = j060.e(((zib0) bVar2.O(qyd0Var5)).d, ((zib0) bVar2.O(qyd0Var5)).d, 0.0f, 0.0f, 12);
                if ((i17 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i17 & 896) == 256);
                objY = bVar2.y();
                if (z3) {
                    objY = new Function0() { // from class: aib0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function112 = function10;
                            if (function112 != null) {
                                function112.invoke();
                            }
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                } else {
                    objY = new Function0() { // from class: aib0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function112 = function10;
                            if (function112 != null) {
                                function112.invoke();
                            }
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                }
                Function0 function112 = function10;
                b bVar7 = bVar2;
                final Function2 function113 = function5;
                op8 op8VarB5 = pp8.b(-1807812207, new gaj() { // from class: bib0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            jib0.e(g3w.a(d.a.b, function113 == null, new fib0(), null, aVar2, 6, 4), uiText, j17, iyf0Var9, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVar7);
                int i219 = i218 << 9;
                int i2110 = i17 >> 9;
                v1w.a((Function0) objY, dVar3, j590VarG5, 0.0f, false, i060VarE5, j11, j10, 0L, function5, function9, w1wVar4, op8VarB5, bVar7, ((i218 << 3) & 112) | (3670016 & i219) | (i219 & 29360128), (i2110 & 112) | (i2110 & 14) | 3072 | (i218 & 896), 792);
                bVar = bVar7;
                iyf0Var2 = iyf0Var9;
                m65Var2 = m65Var3;
                h55Var2 = h55Var4;
                gajVar2 = gajVar3;
                function6 = function9;
                function4 = function112;
                j6 = j17;
                zs7Var3 = zs7Var4;
                j5 = j11;
                j7 = j10;
                w1wVar2 = w1wVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                w1wVar2 = w1wVar;
                iyf0Var2 = iyf0Var;
                h55Var2 = h55Var;
                function4 = function0;
                function5 = function2;
                function6 = function3;
                gajVar2 = gajVar;
                dVar3 = dVar2;
                m65Var2 = m65VarA;
                j5 = j;
                zs7Var3 = zs7Var2;
                j6 = j4;
                j7 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final d dVar9 = dVar3;
                final Function2 function114 = function5;
                eVarZ.d = new Function2() { // from class: cib0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        jib0.d(dVar9, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function114, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        if ((i & 3072) != 0) {
            if ((i3 & 8) == 0) {
                i21 = 1024;
            } else {
                i21 = 1024;
            }
            i4 |= i21;
        }
        i5 = 8192;
        if ((i & 24576) != 0) {
            if ((i3 & 16) == 0) {
                i20 = 8192;
            } else {
                i20 = 8192;
            }
            i4 |= i20;
        }
        if ((i & 196608) == 0) {
            j4 = j3;
            if ((i3 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i4 |= i19;
        } else {
            j4 = j3;
        }
        i6 = i3 & 64;
        if (i6 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (iyf0Var == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = iyf0Var.ordinal();
            }
            if (bVarI.d(iOrdinal)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                zs7Var2 = zs7Var;
                if (bVarI.M(zs7Var2)) {
                }
                i4 |= i24;
            } else {
                zs7Var2 = zs7Var;
            }
            i4 |= i24;
        } else {
            zs7Var2 = zs7Var;
        }
        if ((i & 100663296) == 0) {
            if ((i & 134217728) == 0) {
                zA = bVarI.M(z45Var);
            } else {
                zA = bVarI.A(z45Var);
            }
            if (zA) {
                i18 = 67108864;
            } else {
                i18 = 33554432;
            }
            i4 |= i18;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                m65VarA = m65Var;
                if (bVarI.M(m65VarA)) {
                }
                i4 |= i25;
            } else {
                m65VarA = m65Var;
            }
            i4 |= i25;
        } else {
            m65VarA = m65Var;
        }
        if ((i2 & 6) == 0) {
            i8 = i2 | (((i3 & 1024) == 0 || !bVarI.M(h55Var)) ? 2 : 4);
        } else {
            i8 = i2;
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
            if ((i2 & 48) == 0) {
                if (bVarI.A(function0)) {
                    i10 = 32;
                } else {
                    i10 = 16;
                }
                i8 |= i10;
            }
            if ((i2 & 384) == 0) {
                i8 |= bVarI.A(function1) ? 256 : 128;
            }
            i11 = i8;
            i12 = i3 & 8192;
            if (i12 != 0) {
                if ((i2 & 3072) == 0) {
                    i11 |= bVarI.A(function2) ? 2048 : 1024;
                }
                i13 = i11;
                if ((i2 & 24576) == 0) {
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        i5 = 16384;
                    }
                    i14 = i13 | i5;
                } else {
                    i14 = i13;
                }
                i15 = i3 & 32768;
                if (i15 != 0) {
                    i14 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i14 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
                }
                if ((i4 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i22 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i23 != 0) {
                            w1wVar3 = new w1w();
                        } else {
                            w1wVar3 = w1wVar;
                        }
                        if ((i3 & 8) != 0) {
                            j8 = ((lib0) bVarI.O(oib0.a)).i0;
                            i4 &= -7169;
                        } else {
                            j8 = j;
                        }
                        dVar5 = dVar4;
                        if ((i3 & 16) != 0) {
                            j9 = ((lib0) bVarI.O(oib0.a)).a;
                            i4 &= -57345;
                        } else {
                            j9 = j2;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).c;
                            i4 &= -458753;
                        }
                        if (i6 != 0) {
                            iyf0Var3 = iyf0.a;
                        } else {
                            iyf0Var3 = iyf0Var;
                        }
                        j10 = j9;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        }
                        if ((i3 & 512) != 0) {
                            bVar2 = bVarI;
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            i4 &= -1879048193;
                        } else {
                            bVar2 = bVarI;
                        }
                        if ((i3 & 1024) != 0) {
                            h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                            i14 &= -15;
                        } else {
                            h55VarA = h55Var;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function0;
                        }
                        if (i12 != 0) {
                            function8 = ns9.a;
                        } else {
                            function8 = function2;
                        }
                        h55Var3 = h55VarA;
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            zhb0Var = new zhb0();
                            i14 &= -57345;
                        } else {
                            zhb0Var = function3;
                        }
                        if (i15 != 0) {
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = ns9.b;
                            dVar3 = dVar5;
                        } else {
                            dVar3 = dVar5;
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = gajVar;
                        }
                    } else {
                        if (i22 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i23 != 0) {
                            w1wVar3 = new w1w();
                        } else {
                            w1wVar3 = w1wVar;
                        }
                        if ((i3 & 8) != 0) {
                            j8 = ((lib0) bVarI.O(oib0.a)).i0;
                            i4 &= -7169;
                        } else {
                            j8 = j;
                        }
                        dVar5 = dVar4;
                        if ((i3 & 16) != 0) {
                            j9 = ((lib0) bVarI.O(oib0.a)).a;
                            i4 &= -57345;
                        } else {
                            j9 = j2;
                        }
                        if ((i3 & 32) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).c;
                            i4 &= -458753;
                        }
                        if (i6 != 0) {
                            iyf0Var3 = iyf0.a;
                        } else {
                            iyf0Var3 = iyf0Var;
                        }
                        j10 = j9;
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        }
                        if ((i3 & 512) != 0) {
                            bVar2 = bVarI;
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            i4 &= -1879048193;
                        } else {
                            bVar2 = bVarI;
                        }
                        if ((i3 & 1024) != 0) {
                            h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                            i14 &= -15;
                        } else {
                            h55VarA = h55Var;
                        }
                        if (i9 != 0) {
                            function7 = null;
                        } else {
                            function7 = function0;
                        }
                        if (i12 != 0) {
                            function8 = ns9.a;
                        } else {
                            function8 = function2;
                        }
                        h55Var3 = h55VarA;
                        if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            zhb0Var = new zhb0();
                            i14 &= -57345;
                        } else {
                            zhb0Var = function3;
                        }
                        if (i15 != 0) {
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = ns9.b;
                            dVar3 = dVar5;
                        } else {
                            dVar3 = dVar5;
                            w1wVar4 = w1wVar3;
                            zs7Var4 = zs7Var2;
                            j11 = j8;
                            h55Var4 = h55Var3;
                            function9 = zhb0Var;
                            function10 = function7;
                            i16 = i4;
                            function5 = function8;
                            iyf0Var4 = iyf0Var3;
                            j12 = j4;
                            m65Var3 = m65VarA;
                            i17 = i14;
                            gajVar3 = gajVar;
                        }
                    }
                    bVar2.Y();
                    int i2111 = i16;
                    final long j18 = j12;
                    final iyf0 iyf0Var10 = iyf0Var4;
                    j590 j590VarG6 = v1w.g(true, null, bVar2, 6, 2);
                    qyd0 qyd0Var6 = ajb0.a;
                    i060 i060VarE6 = j060.e(((zib0) bVar2.O(qyd0Var6)).d, ((zib0) bVar2.O(qyd0Var6)).d, 0.0f, 0.0f, 12);
                    if ((i17 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z2 | ((i17 & 896) == 256);
                    objY = bVar2.y();
                    if (z3) {
                        objY = new Function0() { // from class: aib0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function115 = function10;
                                if (function115 != null) {
                                    function115.invoke();
                                }
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY);
                    } else {
                        objY = new Function0() { // from class: aib0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Function0 function115 = function10;
                                if (function115 != null) {
                                    function115.invoke();
                                }
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar2.r(objY);
                    }
                    Function0 function115 = function10;
                    b bVar8 = bVar2;
                    final Function2 function116 = function5;
                    op8 op8VarB6 = pp8.b(-1807812207, new gaj() { // from class: bib0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((j78) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                jib0.e(g3w.a(d.a.b, function116 == null, new fib0(), null, aVar2, 6, 4), uiText, j18, iyf0Var10, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVar8);
                    int i2112 = i2111 << 9;
                    int i2113 = i17 >> 9;
                    v1w.a((Function0) objY, dVar3, j590VarG6, 0.0f, false, i060VarE6, j11, j10, 0L, function5, function9, w1wVar4, op8VarB6, bVar8, ((i2111 << 3) & 112) | (3670016 & i2112) | (i2112 & 29360128), (i2113 & 112) | (i2113 & 14) | 3072 | (i2111 & 896), 792);
                    bVar = bVar8;
                    iyf0Var2 = iyf0Var10;
                    m65Var2 = m65Var3;
                    h55Var2 = h55Var4;
                    gajVar2 = gajVar3;
                    function6 = function9;
                    function4 = function115;
                    j6 = j18;
                    zs7Var3 = zs7Var4;
                    j5 = j11;
                    j7 = j10;
                    w1wVar2 = w1wVar4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    w1wVar2 = w1wVar;
                    iyf0Var2 = iyf0Var;
                    h55Var2 = h55Var;
                    function4 = function0;
                    function5 = function2;
                    function6 = function3;
                    gajVar2 = gajVar;
                    dVar3 = dVar2;
                    m65Var2 = m65VarA;
                    j5 = j;
                    zs7Var3 = zs7Var2;
                    j6 = j4;
                    j7 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    final d dVar10 = dVar3;
                    final Function2 function117 = function5;
                    eVarZ.d = new Function2() { // from class: cib0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            jib0.d(dVar10, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function117, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i11 |= 3072;
            i13 = i11;
            if ((i2 & 24576) == 0) {
                if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                    i5 = 16384;
                }
                i14 = i13 | i5;
            } else {
                i14 = i13;
            }
            i15 = i3 & 32768;
            if (i15 != 0) {
                i14 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i14 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
            }
            if ((i4 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i22 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i23 != 0) {
                        w1wVar3 = new w1w();
                    } else {
                        w1wVar3 = w1wVar;
                    }
                    if ((i3 & 8) != 0) {
                        j8 = ((lib0) bVarI.O(oib0.a)).i0;
                        i4 &= -7169;
                    } else {
                        j8 = j;
                    }
                    dVar5 = dVar4;
                    if ((i3 & 16) != 0) {
                        j9 = ((lib0) bVarI.O(oib0.a)).a;
                        i4 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i3 & 32) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -458753;
                    }
                    if (i6 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    j10 = j9;
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    if ((i3 & 512) != 0) {
                        bVar2 = bVarI;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        i4 &= -1879048193;
                    } else {
                        bVar2 = bVarI;
                    }
                    if ((i3 & 1024) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                        i14 &= -15;
                    } else {
                        h55VarA = h55Var;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function0;
                    }
                    if (i12 != 0) {
                        function8 = ns9.a;
                    } else {
                        function8 = function2;
                    }
                    h55Var3 = h55VarA;
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        zhb0Var = new zhb0();
                        i14 &= -57345;
                    } else {
                        zhb0Var = function3;
                    }
                    if (i15 != 0) {
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = ns9.b;
                        dVar3 = dVar5;
                    } else {
                        dVar3 = dVar5;
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = gajVar;
                    }
                } else {
                    if (i22 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i23 != 0) {
                        w1wVar3 = new w1w();
                    } else {
                        w1wVar3 = w1wVar;
                    }
                    if ((i3 & 8) != 0) {
                        j8 = ((lib0) bVarI.O(oib0.a)).i0;
                        i4 &= -7169;
                    } else {
                        j8 = j;
                    }
                    dVar5 = dVar4;
                    if ((i3 & 16) != 0) {
                        j9 = ((lib0) bVarI.O(oib0.a)).a;
                        i4 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i3 & 32) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -458753;
                    }
                    if (i6 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    j10 = j9;
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    if ((i3 & 512) != 0) {
                        bVar2 = bVarI;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        i4 &= -1879048193;
                    } else {
                        bVar2 = bVarI;
                    }
                    if ((i3 & 1024) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                        i14 &= -15;
                    } else {
                        h55VarA = h55Var;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function0;
                    }
                    if (i12 != 0) {
                        function8 = ns9.a;
                    } else {
                        function8 = function2;
                    }
                    h55Var3 = h55VarA;
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        zhb0Var = new zhb0();
                        i14 &= -57345;
                    } else {
                        zhb0Var = function3;
                    }
                    if (i15 != 0) {
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = ns9.b;
                        dVar3 = dVar5;
                    } else {
                        dVar3 = dVar5;
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = gajVar;
                    }
                }
                bVar2.Y();
                int i2114 = i16;
                final long j19 = j12;
                final iyf0 iyf0Var11 = iyf0Var4;
                j590 j590VarG7 = v1w.g(true, null, bVar2, 6, 2);
                qyd0 qyd0Var7 = ajb0.a;
                i060 i060VarE7 = j060.e(((zib0) bVar2.O(qyd0Var7)).d, ((zib0) bVar2.O(qyd0Var7)).d, 0.0f, 0.0f, 12);
                if ((i17 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i17 & 896) == 256);
                objY = bVar2.y();
                if (z3) {
                    objY = new Function0() { // from class: aib0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function118 = function10;
                            if (function118 != null) {
                                function118.invoke();
                            }
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                } else {
                    objY = new Function0() { // from class: aib0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function118 = function10;
                            if (function118 != null) {
                                function118.invoke();
                            }
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                }
                Function0 function118 = function10;
                b bVar9 = bVar2;
                final Function2 function119 = function5;
                op8 op8VarB7 = pp8.b(-1807812207, new gaj() { // from class: bib0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            jib0.e(g3w.a(d.a.b, function119 == null, new fib0(), null, aVar2, 6, 4), uiText, j19, iyf0Var11, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVar9);
                int i2115 = i2114 << 9;
                int i2116 = i17 >> 9;
                v1w.a((Function0) objY, dVar3, j590VarG7, 0.0f, false, i060VarE7, j11, j10, 0L, function5, function9, w1wVar4, op8VarB7, bVar9, ((i2114 << 3) & 112) | (3670016 & i2115) | (i2115 & 29360128), (i2116 & 112) | (i2116 & 14) | 3072 | (i2114 & 896), 792);
                bVar = bVar9;
                iyf0Var2 = iyf0Var11;
                m65Var2 = m65Var3;
                h55Var2 = h55Var4;
                gajVar2 = gajVar3;
                function6 = function9;
                function4 = function118;
                j6 = j19;
                zs7Var3 = zs7Var4;
                j5 = j11;
                j7 = j10;
                w1wVar2 = w1wVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                w1wVar2 = w1wVar;
                iyf0Var2 = iyf0Var;
                h55Var2 = h55Var;
                function4 = function0;
                function5 = function2;
                function6 = function3;
                gajVar2 = gajVar;
                dVar3 = dVar2;
                m65Var2 = m65VarA;
                j5 = j;
                zs7Var3 = zs7Var2;
                j6 = j4;
                j7 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final d dVar11 = dVar3;
                final Function2 function1110 = function5;
                eVarZ.d = new Function2() { // from class: cib0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        jib0.d(dVar11, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function1110, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i8 |= 48;
        if ((i2 & 384) == 0) {
            i8 |= bVarI.A(function1) ? 256 : 128;
        }
        i11 = i8;
        i12 = i3 & 8192;
        if (i12 != 0) {
            if ((i2 & 3072) == 0) {
                i11 |= bVarI.A(function2) ? 2048 : 1024;
            }
            i13 = i11;
            if ((i2 & 24576) == 0) {
                if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                    i5 = 16384;
                }
                i14 = i13 | i5;
            } else {
                i14 = i13;
            }
            i15 = i3 & 32768;
            if (i15 != 0) {
                i14 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i14 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
            }
            if ((i4 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i22 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i23 != 0) {
                        w1wVar3 = new w1w();
                    } else {
                        w1wVar3 = w1wVar;
                    }
                    if ((i3 & 8) != 0) {
                        j8 = ((lib0) bVarI.O(oib0.a)).i0;
                        i4 &= -7169;
                    } else {
                        j8 = j;
                    }
                    dVar5 = dVar4;
                    if ((i3 & 16) != 0) {
                        j9 = ((lib0) bVarI.O(oib0.a)).a;
                        i4 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i3 & 32) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -458753;
                    }
                    if (i6 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    j10 = j9;
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    if ((i3 & 512) != 0) {
                        bVar2 = bVarI;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        i4 &= -1879048193;
                    } else {
                        bVar2 = bVarI;
                    }
                    if ((i3 & 1024) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                        i14 &= -15;
                    } else {
                        h55VarA = h55Var;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function0;
                    }
                    if (i12 != 0) {
                        function8 = ns9.a;
                    } else {
                        function8 = function2;
                    }
                    h55Var3 = h55VarA;
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        zhb0Var = new zhb0();
                        i14 &= -57345;
                    } else {
                        zhb0Var = function3;
                    }
                    if (i15 != 0) {
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = ns9.b;
                        dVar3 = dVar5;
                    } else {
                        dVar3 = dVar5;
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = gajVar;
                    }
                } else {
                    if (i22 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i23 != 0) {
                        w1wVar3 = new w1w();
                    } else {
                        w1wVar3 = w1wVar;
                    }
                    if ((i3 & 8) != 0) {
                        j8 = ((lib0) bVarI.O(oib0.a)).i0;
                        i4 &= -7169;
                    } else {
                        j8 = j;
                    }
                    dVar5 = dVar4;
                    if ((i3 & 16) != 0) {
                        j9 = ((lib0) bVarI.O(oib0.a)).a;
                        i4 &= -57345;
                    } else {
                        j9 = j2;
                    }
                    if ((i3 & 32) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -458753;
                    }
                    if (i6 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    j10 = j9;
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    if ((i3 & 512) != 0) {
                        bVar2 = bVarI;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        i4 &= -1879048193;
                    } else {
                        bVar2 = bVarI;
                    }
                    if ((i3 & 1024) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                        i14 &= -15;
                    } else {
                        h55VarA = h55Var;
                    }
                    if (i9 != 0) {
                        function7 = null;
                    } else {
                        function7 = function0;
                    }
                    if (i12 != 0) {
                        function8 = ns9.a;
                    } else {
                        function8 = function2;
                    }
                    h55Var3 = h55VarA;
                    if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        zhb0Var = new zhb0();
                        i14 &= -57345;
                    } else {
                        zhb0Var = function3;
                    }
                    if (i15 != 0) {
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = ns9.b;
                        dVar3 = dVar5;
                    } else {
                        dVar3 = dVar5;
                        w1wVar4 = w1wVar3;
                        zs7Var4 = zs7Var2;
                        j11 = j8;
                        h55Var4 = h55Var3;
                        function9 = zhb0Var;
                        function10 = function7;
                        i16 = i4;
                        function5 = function8;
                        iyf0Var4 = iyf0Var3;
                        j12 = j4;
                        m65Var3 = m65VarA;
                        i17 = i14;
                        gajVar3 = gajVar;
                    }
                }
                bVar2.Y();
                int i2117 = i16;
                final long j110 = j12;
                final iyf0 iyf0Var12 = iyf0Var4;
                j590 j590VarG8 = v1w.g(true, null, bVar2, 6, 2);
                qyd0 qyd0Var8 = ajb0.a;
                i060 i060VarE8 = j060.e(((zib0) bVar2.O(qyd0Var8)).d, ((zib0) bVar2.O(qyd0Var8)).d, 0.0f, 0.0f, 12);
                if ((i17 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2 | ((i17 & 896) == 256);
                objY = bVar2.y();
                if (z3) {
                    objY = new Function0() { // from class: aib0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function1111 = function10;
                            if (function1111 != null) {
                                function1111.invoke();
                            }
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                } else {
                    objY = new Function0() { // from class: aib0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function1111 = function10;
                            if (function1111 != null) {
                                function1111.invoke();
                            }
                            function1.invoke();
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                }
                Function0 function1111 = function10;
                b bVar10 = bVar2;
                final Function2 function1112 = function5;
                op8 op8VarB8 = pp8.b(-1807812207, new gaj() { // from class: bib0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            jib0.e(g3w.a(d.a.b, function1112 == null, new fib0(), null, aVar2, 6, 4), uiText, j110, iyf0Var12, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVar10);
                int i2118 = i2117 << 9;
                int i2119 = i17 >> 9;
                v1w.a((Function0) objY, dVar3, j590VarG8, 0.0f, false, i060VarE8, j11, j10, 0L, function5, function9, w1wVar4, op8VarB8, bVar10, ((i2117 << 3) & 112) | (3670016 & i2118) | (i2118 & 29360128), (i2119 & 112) | (i2119 & 14) | 3072 | (i2117 & 896), 792);
                bVar = bVar10;
                iyf0Var2 = iyf0Var12;
                m65Var2 = m65Var3;
                h55Var2 = h55Var4;
                gajVar2 = gajVar3;
                function6 = function9;
                function4 = function1111;
                j6 = j110;
                zs7Var3 = zs7Var4;
                j5 = j11;
                j7 = j10;
                w1wVar2 = w1wVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                w1wVar2 = w1wVar;
                iyf0Var2 = iyf0Var;
                h55Var2 = h55Var;
                function4 = function0;
                function5 = function2;
                function6 = function3;
                gajVar2 = gajVar;
                dVar3 = dVar2;
                m65Var2 = m65VarA;
                j5 = j;
                zs7Var3 = zs7Var2;
                j6 = j4;
                j7 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final d dVar12 = dVar3;
                final Function2 function1113 = function5;
                eVarZ.d = new Function2() { // from class: cib0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        jib0.d(dVar12, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function1113, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i11 |= 3072;
        i13 = i11;
        if ((i2 & 24576) == 0) {
            if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                i5 = 16384;
            }
            i14 = i13 | i5;
        } else {
            i14 = i13;
        }
        i15 = i3 & 32768;
        if (i15 != 0) {
            i14 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i14 |= bVarI.A(gajVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i14 |= bVarI.A(op8Var) ? 1048576 : 524288;
        }
        if ((i4 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i22 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i23 != 0) {
                    w1wVar3 = new w1w();
                } else {
                    w1wVar3 = w1wVar;
                }
                if ((i3 & 8) != 0) {
                    j8 = ((lib0) bVarI.O(oib0.a)).i0;
                    i4 &= -7169;
                } else {
                    j8 = j;
                }
                dVar5 = dVar4;
                if ((i3 & 16) != 0) {
                    j9 = ((lib0) bVarI.O(oib0.a)).a;
                    i4 &= -57345;
                } else {
                    j9 = j2;
                }
                if ((i3 & 32) != 0) {
                    j4 = ((lib0) bVarI.O(oib0.a)).c;
                    i4 &= -458753;
                }
                if (i6 != 0) {
                    iyf0Var3 = iyf0.a;
                } else {
                    iyf0Var3 = iyf0Var;
                }
                j10 = j9;
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                }
                if ((i3 & 512) != 0) {
                    bVar2 = bVarI;
                    m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                    i4 &= -1879048193;
                } else {
                    bVar2 = bVarI;
                }
                if ((i3 & 1024) != 0) {
                    h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                    i14 &= -15;
                } else {
                    h55VarA = h55Var;
                }
                if (i9 != 0) {
                    function7 = null;
                } else {
                    function7 = function0;
                }
                if (i12 != 0) {
                    function8 = ns9.a;
                } else {
                    function8 = function2;
                }
                h55Var3 = h55VarA;
                if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    zhb0Var = new zhb0();
                    i14 &= -57345;
                } else {
                    zhb0Var = function3;
                }
                if (i15 != 0) {
                    w1wVar4 = w1wVar3;
                    zs7Var4 = zs7Var2;
                    j11 = j8;
                    h55Var4 = h55Var3;
                    function9 = zhb0Var;
                    function10 = function7;
                    i16 = i4;
                    function5 = function8;
                    iyf0Var4 = iyf0Var3;
                    j12 = j4;
                    m65Var3 = m65VarA;
                    i17 = i14;
                    gajVar3 = ns9.b;
                    dVar3 = dVar5;
                } else {
                    dVar3 = dVar5;
                    w1wVar4 = w1wVar3;
                    zs7Var4 = zs7Var2;
                    j11 = j8;
                    h55Var4 = h55Var3;
                    function9 = zhb0Var;
                    function10 = function7;
                    i16 = i4;
                    function5 = function8;
                    iyf0Var4 = iyf0Var3;
                    j12 = j4;
                    m65Var3 = m65VarA;
                    i17 = i14;
                    gajVar3 = gajVar;
                }
            } else {
                if (i22 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i23 != 0) {
                    w1wVar3 = new w1w();
                } else {
                    w1wVar3 = w1wVar;
                }
                if ((i3 & 8) != 0) {
                    j8 = ((lib0) bVarI.O(oib0.a)).i0;
                    i4 &= -7169;
                } else {
                    j8 = j;
                }
                dVar5 = dVar4;
                if ((i3 & 16) != 0) {
                    j9 = ((lib0) bVarI.O(oib0.a)).a;
                    i4 &= -57345;
                } else {
                    j9 = j2;
                }
                if ((i3 & 32) != 0) {
                    j4 = ((lib0) bVarI.O(oib0.a)).c;
                    i4 &= -458753;
                }
                if (i6 != 0) {
                    iyf0Var3 = iyf0.a;
                } else {
                    iyf0Var3 = iyf0Var;
                }
                j10 = j9;
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    zs7Var2 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                }
                if ((i3 & 512) != 0) {
                    bVar2 = bVarI;
                    m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                    i4 &= -1879048193;
                } else {
                    bVar2 = bVarI;
                }
                if ((i3 & 1024) != 0) {
                    h55VarA = h55.a.a(null, null, null, null, bVar2, 15);
                    i14 &= -15;
                } else {
                    h55VarA = h55Var;
                }
                if (i9 != 0) {
                    function7 = null;
                } else {
                    function7 = function0;
                }
                if (i12 != 0) {
                    function8 = ns9.a;
                } else {
                    function8 = function2;
                }
                h55Var3 = h55VarA;
                if ((i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    zhb0Var = new zhb0();
                    i14 &= -57345;
                } else {
                    zhb0Var = function3;
                }
                if (i15 != 0) {
                    w1wVar4 = w1wVar3;
                    zs7Var4 = zs7Var2;
                    j11 = j8;
                    h55Var4 = h55Var3;
                    function9 = zhb0Var;
                    function10 = function7;
                    i16 = i4;
                    function5 = function8;
                    iyf0Var4 = iyf0Var3;
                    j12 = j4;
                    m65Var3 = m65VarA;
                    i17 = i14;
                    gajVar3 = ns9.b;
                    dVar3 = dVar5;
                } else {
                    dVar3 = dVar5;
                    w1wVar4 = w1wVar3;
                    zs7Var4 = zs7Var2;
                    j11 = j8;
                    h55Var4 = h55Var3;
                    function9 = zhb0Var;
                    function10 = function7;
                    i16 = i4;
                    function5 = function8;
                    iyf0Var4 = iyf0Var3;
                    j12 = j4;
                    m65Var3 = m65VarA;
                    i17 = i14;
                    gajVar3 = gajVar;
                }
            }
            bVar2.Y();
            int i21110 = i16;
            final long j111 = j12;
            final iyf0 iyf0Var13 = iyf0Var4;
            j590 j590VarG9 = v1w.g(true, null, bVar2, 6, 2);
            qyd0 qyd0Var9 = ajb0.a;
            i060 i060VarE9 = j060.e(((zib0) bVar2.O(qyd0Var9)).d, ((zib0) bVar2.O(qyd0Var9)).d, 0.0f, 0.0f, 12);
            if ((i17 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z2 | ((i17 & 896) == 256);
            objY = bVar2.y();
            if (z3) {
                objY = new Function0() { // from class: aib0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function0 function1114 = function10;
                        if (function1114 != null) {
                            function1114.invoke();
                        }
                        function1.invoke();
                        return Unit.a;
                    }
                };
                bVar2.r(objY);
            } else {
                objY = new Function0() { // from class: aib0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function0 function1114 = function10;
                        if (function1114 != null) {
                            function1114.invoke();
                        }
                        function1.invoke();
                        return Unit.a;
                    }
                };
                bVar2.r(objY);
            }
            Function0 function1114 = function10;
            b bVar11 = bVar2;
            final Function2 function1115 = function5;
            op8 op8VarB9 = pp8.b(-1807812207, new gaj() { // from class: bib0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        jib0.e(g3w.a(d.a.b, function1115 == null, new fib0(), null, aVar2, 6, 4), uiText, j111, iyf0Var13, zs7Var4, z45Var, m65Var3, h55Var4, function1, gajVar3, op8Var, aVar2, 0, 0, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar11);
            int i21111 = i21110 << 9;
            int i21112 = i17 >> 9;
            v1w.a((Function0) objY, dVar3, j590VarG9, 0.0f, false, i060VarE9, j11, j10, 0L, function5, function9, w1wVar4, op8VarB9, bVar11, ((i21110 << 3) & 112) | (3670016 & i21111) | (i21111 & 29360128), (i21112 & 112) | (i21112 & 14) | 3072 | (i21110 & 896), 792);
            bVar = bVar11;
            iyf0Var2 = iyf0Var13;
            m65Var2 = m65Var3;
            h55Var2 = h55Var4;
            gajVar2 = gajVar3;
            function6 = function9;
            function4 = function1114;
            j6 = j111;
            zs7Var3 = zs7Var4;
            j5 = j11;
            j7 = j10;
            w1wVar2 = w1wVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            w1wVar2 = w1wVar;
            iyf0Var2 = iyf0Var;
            h55Var2 = h55Var;
            function4 = function0;
            function5 = function2;
            function6 = function3;
            gajVar2 = gajVar;
            dVar3 = dVar2;
            m65Var2 = m65VarA;
            j5 = j;
            zs7Var3 = zs7Var2;
            j6 = j4;
            j7 = j2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final d dVar13 = dVar3;
            final Function2 function1116 = function5;
            eVarZ.d = new Function2() { // from class: cib0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    jib0.d(dVar13, uiText, w1wVar2, j5, j7, j6, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function4, function1, function1116, function6, gajVar2, op8Var, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0155  */
    /* JADX WARN: Code duplicated, block: B:121:0x015e  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0214  */
    /* JADX WARN: Code duplicated, block: B:160:0x0220  */
    /* JADX WARN: Code duplicated, block: B:161:0x0223  */
    /* JADX WARN: Code duplicated, block: B:165:0x0242  */
    /* JADX WARN: Code duplicated, block: B:168:0x0278  */
    /* JADX WARN: Code duplicated, block: B:169:0x027c  */
    /* JADX WARN: Code duplicated, block: B:172:0x028f  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:180:0x0303  */
    /* JADX WARN: Code duplicated, block: B:183:0x0310  */
    /* JADX WARN: Code duplicated, block: B:185:0x031e  */
    /* JADX WARN: Code duplicated, block: B:188:0x036e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0372  */
    /* JADX WARN: Code duplicated, block: B:192:0x037f  */
    /* JADX WARN: Code duplicated, block: B:194:0x038d  */
    /* JADX WARN: Code duplicated, block: B:197:0x039b  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:203:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:207:0x0410  */
    /* JADX WARN: Code duplicated, block: B:208:0x0414  */
    /* JADX WARN: Code duplicated, block: B:211:0x0421  */
    /* JADX WARN: Code duplicated, block: B:213:0x042f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0447  */
    /* JADX WARN: Code duplicated, block: B:220:0x0453  */
    /* JADX WARN: Code duplicated, block: B:224:0x046b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0474  */
    /* JADX WARN: Code duplicated, block: B:229:0x0478  */
    /* JADX WARN: Code duplicated, block: B:231:0x048a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0490  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:236:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:239:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:241:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:245:0x0539  */
    /* JADX WARN: Code duplicated, block: B:246:0x053d  */
    /* JADX WARN: Code duplicated, block: B:249:0x054a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0558  */
    /* JADX WARN: Code duplicated, block: B:253:0x0586  */
    /* JADX WARN: Code duplicated, block: B:255:0x058f  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    public static final void e(d dVar, final UiText uiText, long j, iyf0 iyf0Var, zs7 zs7Var, final z45 z45Var, m65 m65Var, h55 h55Var, final Function0<Unit> function0, gaj<? super j78, ? super a, ? super Integer, Unit> gajVar, final gaj<? super j78, ? super a, ? super Integer, Unit> gajVar2, a aVar, final int i, final int i2, final int i3) {
        d dVar2;
        int i4;
        long j2;
        zs7 zs7Var2;
        m65 m65VarA;
        int i5;
        boolean z;
        final d dVar3;
        final long j3;
        final zs7 zs7Var3;
        final m65 m65Var2;
        final iyf0 iyf0Var2;
        final h55 h55Var2;
        final gaj<? super j78, ? super a, ? super Integer, Unit> gajVar3;
        e eVarZ;
        int i6;
        d.a aVar2;
        d dVar4;
        iyf0 iyf0Var3;
        int i7;
        d.a aVar3;
        boolean z2;
        boolean z3;
        h55 h55VarA;
        gaj<? super j78, ? super a, ? super Integer, Unit> gajVar4;
        long j4;
        zs7 zs7Var4;
        iyf0 iyf0Var4;
        Object objY;
        int iHashCode;
        tsr.a aVar4;
        yka.a.b bVar;
        yka.a.d dVar5;
        yka.a.C1350a c1350a;
        gaj<? super j78, ? super a, ? super Integer, Unit> gajVar5;
        yka.a.c cVar;
        int iHashCode2;
        int iHashCode3;
        m65 m65Var3;
        int iHashCode4;
        float f;
        int i8;
        boolean z4;
        int iHashCode5;
        float f2;
        int iHashCode6;
        int i9;
        uiText.getClass();
        z45Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1720069788);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.M(uiText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i4 |= ((i3 & 4) == 0 && bVarI.e(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= bVarI.d(iyf0Var == null ? -1 : iyf0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                zs7Var2 = zs7Var;
                int i12 = bVarI.M(zs7Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i4 |= i12;
            } else {
                zs7Var2 = zs7Var;
            }
            i4 |= i12;
        } else {
            zs7Var2 = zs7Var;
        }
        if ((196608 & i) == 0) {
            i4 |= (262144 & i) == 0 ? bVarI.M(z45Var) : bVarI.A(z45Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i3 & 64) == 0) {
                m65VarA = m65Var;
                int i13 = bVarI.M(m65VarA) ? 1048576 : 524288;
                i4 |= i13;
            } else {
                m65VarA = m65Var;
            }
            i4 |= i13;
        } else {
            m65VarA = m65Var;
        }
        if ((i & 12582912) == 0) {
            i4 |= ((i3 & 128) == 0 && bVarI.M(h55Var)) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= bVarI.A(function0) ? 67108864 : 33554432;
        }
        int i14 = i3 & 512;
        if (i14 == 0) {
            if ((i & 805306368) == 0) {
                i4 |= bVarI.A(gajVar) ? 536870912 : 268435456;
            }
            if ((i2 & 6) == 0) {
                if (bVarI.A(gajVar2)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i5 = i2 | i9;
            } else {
                i5 = i2;
            }
            if ((i4 & 306783379) == 306783378 || (i5 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                i6 = i & 1;
                aVar2 = d.a.b;
                if (i6 != 0 || bVarI.h0()) {
                    if (i10 != 0) {
                        dVar4 = aVar2;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i3 & 4) != 0) {
                        j2 = ((lib0) bVarI.O(oib0.a)).c;
                        i4 &= -897;
                    }
                    if (i11 != 0) {
                        iyf0Var3 = iyf0.a;
                    } else {
                        iyf0Var3 = iyf0Var;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        zs7Var2 = new zs7(2, ((cjb0) bVarI.O(ejb0.a)).f);
                    }
                    i7 = i4;
                    if ((i3 & 64) != 0) {
                        aVar3 = aVar2;
                        z3 = false;
                        i7 &= -3670017;
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        z2 = true;
                    } else {
                        aVar3 = aVar2;
                        z2 = true;
                        z3 = false;
                    }
                    if ((i3 & 128) != 0) {
                        h55VarA = h55.a.a(null, null, null, null, bVarI, 15);
                        i4 = i7 & (-29360129);
                    } else {
                        h55VarA = h55Var;
                        i4 = i7;
                    }
                    if (i14 != 0) {
                        gajVar4 = ns9.c;
                    } else {
                        gajVar4 = gajVar;
                    }
                    dVar2 = dVar4;
                    j4 = j2;
                    zs7Var4 = zs7Var2;
                    iyf0Var4 = iyf0Var3;
                } else {
                    bVarI.G();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    iyf0Var4 = iyf0Var;
                    gajVar4 = gajVar;
                    aVar3 = aVar2;
                    j4 = j2;
                    zs7Var4 = zs7Var2;
                    z3 = false;
                    h55VarA = h55Var;
                }
                bVarI.Y();
                d dVarC = op70.c(dVar2, op70.a(bVarI), 14);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new dib0();
                    bVarI.r(objY);
                }
                d dVarB = xa80.b(dVarC, z3, (Function1) objY);
                kw0.k kVar = kw0.c;
                n54.a aVar5 = ht.a.n;
                i78 i78VarA = g78.a(kVar, aVar5, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB);
                yka.k.getClass();
                d dVar6 = dVar2;
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                bVar = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar);
                dVar5 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar5);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    gajVar5 = gajVar4;
                } else {
                    gajVar5 = gajVar4;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC2, cVar);
                    ty0.a(bVarI, j.i(aVar3, m65VarA.a));
                    a(h.e(aVar3, h55VarA.a), uiText, j4, iyf0Var4, function0, zs7Var4, bVarI, (i4 & 8176) | ((i4 >> 12) & 57344) | ((i4 << 3) & 458752));
                    d dVarE = h.e(hib0.a(aVar3, m65VarA.b, bVarI, aVar3, 1.0f), h55VarA.b);
                    i78 i78VarA2 = g78.a(kVar, aVar5, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarE);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA2, bVar);
                    hlh0.a(bVarI, ne00VarS2, dVar5);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    Integer numValueOf = Integer.valueOf(((i5 << 3) & 112) | 6);
                    l78 l78Var = l78.a;
                    gajVar2.invoke(l78Var, bVarI, numValueOf);
                    bVarI.X(true);
                    d dVarE2 = h.e(hib0.a(aVar3, m65VarA.c, bVarI, aVar3, 1.0f), h55VarA.c);
                    int i15 = i4;
                    i78 i78VarA3 = g78.a(kVar, aVar5, bVarI, 48);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC4 = c.c(bVarI, dVarE2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA3, bVar);
                    hlh0.a(bVarI, ne00VarS3, dVar5);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                    }
                    hlh0.a(bVarI, dVarC4, cVar);
                    if (z45Var.equals(z45.b.a)) {
                        bVarI.N(442934015);
                        bVarI.X(false);
                        m65Var3 = m65VarA;
                    } else {
                        if (z45Var instanceof z45.c) {
                            bVarI.N(442999921);
                            f = 1.0f;
                            b(((z45.c) z45Var).a, j.g(aVar3, 1.0f), bVarI, 48);
                            bVarI.X(false);
                            m65Var3 = m65VarA;
                            z4 = true;
                            i8 = 48;
                        } else if (z45Var instanceof z45.a) {
                            bVarI.N(443187812);
                            d dVarG = j.g(aVar3, 1.0f);
                            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.j, bVarI, 0);
                            iHashCode5 = Long.hashCode(bVarI.T);
                            ne00 ne00VarS4 = bVarI.S();
                            d dVarC5 = c.c(bVarI, dVarG);
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar4);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, d160VarA, bVar);
                            hlh0.a(bVarI, ne00VarS4, dVar5);
                            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                                n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                            }
                            hlh0.a(bVarI, dVarC5, cVar);
                            z45.a aVar6 = (z45.a) z45Var;
                            w45.c cVar2 = aVar6.b;
                            m65 m65Var4 = m65VarA;
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            m65Var3 = m65Var4;
                            c(cVar2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, 0);
                            w45.c cVar3 = aVar6.a;
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f2 = Float.MAX_VALUE;
                            } else {
                                f2 = 1.0f;
                            }
                            b(cVar3, new LayoutWeightElement(f2, true), bVarI, 0);
                            bVarI.X(true);
                            bVarI.X(false);
                        } else {
                            m65Var3 = m65VarA;
                            if (z45Var instanceof z45.d) {
                                throw igf0.a(bVarI, 1122665737, false);
                            }
                            bVarI.N(443721663);
                            i78 i78VarA4 = g78.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.m, bVarI, 0);
                            iHashCode4 = Long.hashCode(bVarI.T);
                            ne00 ne00VarS5 = bVarI.S();
                            d dVarC6 = c.c(bVarI, aVar3);
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar4);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, i78VarA4, bVar);
                            hlh0.a(bVarI, ne00VarS5, dVar5);
                            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                            }
                            hlh0.a(bVarI, dVarC6, cVar);
                            z45.d dVar7 = (z45.d) z45Var;
                            f = 1.0f;
                            i8 = 48;
                            b(dVar7.a, j.g(aVar3, 1.0f), bVarI, 48);
                            c(dVar7.b, j.g(aVar3, 1.0f), bVarI, 48);
                            z4 = true;
                            bVarI.X(true);
                            bVarI.X(false);
                        }
                        bVarI.X(z4);
                        m65 m65Var5 = m65Var3;
                        d dVarE3 = h.e(hib0.a(aVar3, m65Var5.d, bVarI, aVar3, f), h55VarA.d);
                        i78 i78VarA5 = g78.a(kVar, aVar5, bVarI, i8);
                        iHashCode6 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS6 = bVarI.S();
                        d dVarC7 = c.c(bVarI, dVarE3);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, i78VarA5, bVar);
                        hlh0.a(bVarI, ne00VarS6, dVar5);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                            n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                        }
                        hlh0.a(bVarI, dVarC7, cVar);
                        gaj<? super j78, ? super a, ? super Integer, Unit> gajVar6 = gajVar5;
                        gajVar6.invoke(l78Var, bVarI, Integer.valueOf(6 | ((i15 >> 24) & 112)));
                        bVarI.X(true);
                        iib0.a(aVar3, m65Var5.e, bVarI, true);
                        h55Var2 = h55VarA;
                        m65Var2 = m65Var5;
                        iyf0Var2 = iyf0Var4;
                        zs7Var3 = zs7Var4;
                        dVar3 = dVar6;
                        gajVar3 = gajVar6;
                        j3 = j4;
                    }
                    f = 1.0f;
                    z4 = true;
                    i8 = 48;
                    bVarI.X(z4);
                    m65 m65Var6 = m65Var3;
                    d dVarE4 = h.e(hib0.a(aVar3, m65Var6.d, bVarI, aVar3, f), h55VarA.d);
                    i78 i78VarA6 = g78.a(kVar, aVar5, bVarI, i8);
                    iHashCode6 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS7 = bVarI.S();
                    d dVarC8 = c.c(bVarI, dVarE4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA6, bVar);
                    hlh0.a(bVarI, ne00VarS7, dVar5);
                    if (bVarI.S) {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    } else {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    }
                    hlh0.a(bVarI, dVarC8, cVar);
                    gaj<? super j78, ? super a, ? super Integer, Unit> gajVar7 = gajVar5;
                    gajVar7.invoke(l78Var, bVarI, Integer.valueOf(6 | ((i15 >> 24) & 112)));
                    bVarI.X(true);
                    iib0.a(aVar3, m65Var6.e, bVarI, true);
                    h55Var2 = h55VarA;
                    m65Var2 = m65Var6;
                    iyf0Var2 = iyf0Var4;
                    zs7Var3 = zs7Var4;
                    dVar3 = dVar6;
                    gajVar3 = gajVar7;
                    j3 = j4;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC2, cVar);
                ty0.a(bVarI, j.i(aVar3, m65VarA.a));
                a(h.e(aVar3, h55VarA.a), uiText, j4, iyf0Var4, function0, zs7Var4, bVarI, (i4 & 8176) | ((i4 >> 12) & 57344) | ((i4 << 3) & 458752));
                d dVarE5 = h.e(hib0.a(aVar3, m65VarA.b, bVarI, aVar3, 1.0f), h55VarA.b);
                i78 i78VarA7 = g78.a(kVar, aVar5, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC9 = c.c(bVarI, dVarE5);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA7, bVar);
                hlh0.a(bVarI, ne00VarS8, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC9, cVar);
                Integer numValueOf2 = Integer.valueOf(((i5 << 3) & 112) | 6);
                l78 l78Var2 = l78.a;
                gajVar2.invoke(l78Var2, bVarI, numValueOf2);
                bVarI.X(true);
                d dVarE6 = h.e(hib0.a(aVar3, m65VarA.c, bVarI, aVar3, 1.0f), h55VarA.c);
                int i16 = i4;
                i78 i78VarA8 = g78.a(kVar, aVar5, bVarI, 48);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS9 = bVarI.S();
                d dVarC10 = c.c(bVarI, dVarE6);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA8, bVar);
                hlh0.a(bVarI, ne00VarS9, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC10, cVar);
                if (z45Var.equals(z45.b.a)) {
                    bVarI.N(442934015);
                    bVarI.X(false);
                    m65Var3 = m65VarA;
                } else {
                    if (z45Var instanceof z45.c) {
                        bVarI.N(442999921);
                        f = 1.0f;
                        b(((z45.c) z45Var).a, j.g(aVar3, 1.0f), bVarI, 48);
                        bVarI.X(false);
                        m65Var3 = m65VarA;
                        z4 = true;
                        i8 = 48;
                    } else if (z45Var instanceof z45.a) {
                        bVarI.N(443187812);
                        d dVarG2 = j.g(aVar3, 1.0f);
                        d160 d160VarA2 = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.j, bVarI, 0);
                        iHashCode5 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS10 = bVarI.S();
                        d dVarC11 = c.c(bVarI, dVarG2);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA2, bVar);
                        hlh0.a(bVarI, ne00VarS10, dVar5);
                        if (bVarI.S) {
                            n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                        } else {
                            n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                        }
                        hlh0.a(bVarI, dVarC11, cVar);
                        z45.a aVar7 = (z45.a) z45Var;
                        w45.c cVar4 = aVar7.b;
                        m65 m65Var7 = m65VarA;
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        m65Var3 = m65Var7;
                        c(cVar4, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, 0);
                        w45.c cVar5 = aVar7.a;
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f2 = Float.MAX_VALUE;
                        } else {
                            f2 = 1.0f;
                        }
                        b(cVar5, new LayoutWeightElement(f2, true), bVarI, 0);
                        bVarI.X(true);
                        bVarI.X(false);
                    } else {
                        m65Var3 = m65VarA;
                        if (z45Var instanceof z45.d) {
                            throw igf0.a(bVarI, 1122665737, false);
                        }
                        bVarI.N(443721663);
                        i78 i78VarA9 = g78.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.m, bVarI, 0);
                        iHashCode4 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS11 = bVarI.S();
                        d dVarC12 = c.c(bVarI, aVar3);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, i78VarA9, bVar);
                        hlh0.a(bVarI, ne00VarS11, dVar5);
                        if (bVarI.S) {
                            n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                        } else {
                            n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                        }
                        hlh0.a(bVarI, dVarC12, cVar);
                        z45.d dVar8 = (z45.d) z45Var;
                        f = 1.0f;
                        i8 = 48;
                        b(dVar8.a, j.g(aVar3, 1.0f), bVarI, 48);
                        c(dVar8.b, j.g(aVar3, 1.0f), bVarI, 48);
                        z4 = true;
                        bVarI.X(true);
                        bVarI.X(false);
                    }
                    bVarI.X(z4);
                    m65 m65Var8 = m65Var3;
                    d dVarE7 = h.e(hib0.a(aVar3, m65Var8.d, bVarI, aVar3, f), h55VarA.d);
                    i78 i78VarA10 = g78.a(kVar, aVar5, bVarI, i8);
                    iHashCode6 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS12 = bVarI.S();
                    d dVarC13 = c.c(bVarI, dVarE7);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA10, bVar);
                    hlh0.a(bVarI, ne00VarS12, dVar5);
                    if (bVarI.S) {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    } else {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    }
                    hlh0.a(bVarI, dVarC13, cVar);
                    gaj<? super j78, ? super a, ? super Integer, Unit> gajVar8 = gajVar5;
                    gajVar8.invoke(l78Var2, bVarI, Integer.valueOf(6 | ((i16 >> 24) & 112)));
                    bVarI.X(true);
                    iib0.a(aVar3, m65Var8.e, bVarI, true);
                    h55Var2 = h55VarA;
                    m65Var2 = m65Var8;
                    iyf0Var2 = iyf0Var4;
                    zs7Var3 = zs7Var4;
                    dVar3 = dVar6;
                    gajVar3 = gajVar8;
                    j3 = j4;
                }
                f = 1.0f;
                z4 = true;
                i8 = 48;
                bVarI.X(z4);
                m65 m65Var9 = m65Var3;
                d dVarE8 = h.e(hib0.a(aVar3, m65Var9.d, bVarI, aVar3, f), h55VarA.d);
                i78 i78VarA11 = g78.a(kVar, aVar5, bVarI, i8);
                iHashCode6 = Long.hashCode(bVarI.T);
                ne00 ne00VarS13 = bVarI.S();
                d dVarC14 = c.c(bVarI, dVarE8);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA11, bVar);
                hlh0.a(bVarI, ne00VarS13, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                } else {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                }
                hlh0.a(bVarI, dVarC14, cVar);
                gaj<? super j78, ? super a, ? super Integer, Unit> gajVar9 = gajVar5;
                gajVar9.invoke(l78Var2, bVarI, Integer.valueOf(6 | ((i16 >> 24) & 112)));
                bVarI.X(true);
                iib0.a(aVar3, m65Var9.e, bVarI, true);
                h55Var2 = h55VarA;
                m65Var2 = m65Var9;
                iyf0Var2 = iyf0Var4;
                zs7Var3 = zs7Var4;
                dVar3 = dVar6;
                gajVar3 = gajVar9;
                j3 = j4;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                j3 = j2;
                zs7Var3 = zs7Var2;
                m65Var2 = m65VarA;
                iyf0Var2 = iyf0Var;
                h55Var2 = h55Var;
                gajVar3 = gajVar;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: eib0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        jib0.e(dVar3, uiText, j3, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function0, gajVar3, gajVar2, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 805306368;
        if ((i2 & 6) == 0) {
            if (bVarI.A(gajVar2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i5 = i2 | i9;
        } else {
            i5 = i2;
        }
        if ((i4 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            i6 = i & 1;
            aVar2 = d.a.b;
            if (i6 != 0) {
                if (i10 != 0) {
                    dVar4 = aVar2;
                } else {
                    dVar4 = dVar2;
                }
                if ((i3 & 4) != 0) {
                    j2 = ((lib0) bVarI.O(oib0.a)).c;
                    i4 &= -897;
                }
                if (i11 != 0) {
                    iyf0Var3 = iyf0.a;
                } else {
                    iyf0Var3 = iyf0Var;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    zs7Var2 = new zs7(2, ((cjb0) bVarI.O(ejb0.a)).f);
                }
                i7 = i4;
                if ((i3 & 64) != 0) {
                    aVar3 = aVar2;
                    z3 = false;
                    i7 &= -3670017;
                    m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                    z2 = true;
                } else {
                    aVar3 = aVar2;
                    z2 = true;
                    z3 = false;
                }
                if ((i3 & 128) != 0) {
                    h55VarA = h55.a.a(null, null, null, null, bVarI, 15);
                    i4 = i7 & (-29360129);
                } else {
                    h55VarA = h55Var;
                    i4 = i7;
                }
                if (i14 != 0) {
                    gajVar4 = ns9.c;
                } else {
                    gajVar4 = gajVar;
                }
                dVar2 = dVar4;
                j4 = j2;
                zs7Var4 = zs7Var2;
                iyf0Var4 = iyf0Var3;
            } else {
                if (i10 != 0) {
                    dVar4 = aVar2;
                } else {
                    dVar4 = dVar2;
                }
                if ((i3 & 4) != 0) {
                    j2 = ((lib0) bVarI.O(oib0.a)).c;
                    i4 &= -897;
                }
                if (i11 != 0) {
                    iyf0Var3 = iyf0.a;
                } else {
                    iyf0Var3 = iyf0Var;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    zs7Var2 = new zs7(2, ((cjb0) bVarI.O(ejb0.a)).f);
                }
                i7 = i4;
                if ((i3 & 64) != 0) {
                    aVar3 = aVar2;
                    z3 = false;
                    i7 &= -3670017;
                    m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                    z2 = true;
                } else {
                    aVar3 = aVar2;
                    z2 = true;
                    z3 = false;
                }
                if ((i3 & 128) != 0) {
                    h55VarA = h55.a.a(null, null, null, null, bVarI, 15);
                    i4 = i7 & (-29360129);
                } else {
                    h55VarA = h55Var;
                    i4 = i7;
                }
                if (i14 != 0) {
                    gajVar4 = ns9.c;
                } else {
                    gajVar4 = gajVar;
                }
                dVar2 = dVar4;
                j4 = j2;
                zs7Var4 = zs7Var2;
                iyf0Var4 = iyf0Var3;
            }
            bVarI.Y();
            d dVarC15 = op70.c(dVar2, op70.a(bVarI), 14);
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new dib0();
                bVarI.r(objY);
            }
            d dVarB2 = xa80.b(dVarC15, z3, (Function1) objY);
            kw0.k kVar2 = kw0.c;
            n54.a aVar8 = ht.a.n;
            i78 i78VarA12 = g78.a(kVar2, aVar8, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS14 = bVarI.S();
            d dVarC16 = c.c(bVarI, dVarB2);
            yka.k.getClass();
            d dVar9 = dVar2;
            aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA12, bVar);
            dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS14, dVar5);
            c1350a = yka.a.g;
            if (bVarI.S) {
                gajVar5 = gajVar4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC16, cVar);
                ty0.a(bVarI, j.i(aVar3, m65VarA.a));
                a(h.e(aVar3, h55VarA.a), uiText, j4, iyf0Var4, function0, zs7Var4, bVarI, (i4 & 8176) | ((i4 >> 12) & 57344) | ((i4 << 3) & 458752));
                d dVarE9 = h.e(hib0.a(aVar3, m65VarA.b, bVarI, aVar3, 1.0f), h55VarA.b);
                i78 i78VarA13 = g78.a(kVar2, aVar8, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS15 = bVarI.S();
                d dVarC17 = c.c(bVarI, dVarE9);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA13, bVar);
                hlh0.a(bVarI, ne00VarS15, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC17, cVar);
                Integer numValueOf3 = Integer.valueOf(((i5 << 3) & 112) | 6);
                l78 l78Var3 = l78.a;
                gajVar2.invoke(l78Var3, bVarI, numValueOf3);
                bVarI.X(true);
                d dVarE10 = h.e(hib0.a(aVar3, m65VarA.c, bVarI, aVar3, 1.0f), h55VarA.c);
                int i17 = i4;
                i78 i78VarA14 = g78.a(kVar2, aVar8, bVarI, 48);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS16 = bVarI.S();
                d dVarC18 = c.c(bVarI, dVarE10);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA14, bVar);
                hlh0.a(bVarI, ne00VarS16, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC18, cVar);
                if (z45Var.equals(z45.b.a)) {
                    bVarI.N(442934015);
                    bVarI.X(false);
                    m65Var3 = m65VarA;
                } else {
                    if (z45Var instanceof z45.c) {
                        bVarI.N(442999921);
                        f = 1.0f;
                        b(((z45.c) z45Var).a, j.g(aVar3, 1.0f), bVarI, 48);
                        bVarI.X(false);
                        m65Var3 = m65VarA;
                        z4 = true;
                        i8 = 48;
                    } else if (z45Var instanceof z45.a) {
                        bVarI.N(443187812);
                        d dVarG3 = j.g(aVar3, 1.0f);
                        d160 d160VarA3 = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.j, bVarI, 0);
                        iHashCode5 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS17 = bVarI.S();
                        d dVarC19 = c.c(bVarI, dVarG3);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA3, bVar);
                        hlh0.a(bVarI, ne00VarS17, dVar5);
                        if (bVarI.S) {
                            n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                        } else {
                            n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                        }
                        hlh0.a(bVarI, dVarC19, cVar);
                        z45.a aVar9 = (z45.a) z45Var;
                        w45.c cVar6 = aVar9.b;
                        m65 m65Var10 = m65VarA;
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        m65Var3 = m65Var10;
                        c(cVar6, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, 0);
                        w45.c cVar7 = aVar9.a;
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f2 = Float.MAX_VALUE;
                        } else {
                            f2 = 1.0f;
                        }
                        b(cVar7, new LayoutWeightElement(f2, true), bVarI, 0);
                        bVarI.X(true);
                        bVarI.X(false);
                    } else {
                        m65Var3 = m65VarA;
                        if (z45Var instanceof z45.d) {
                            throw igf0.a(bVarI, 1122665737, false);
                        }
                        bVarI.N(443721663);
                        i78 i78VarA15 = g78.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.m, bVarI, 0);
                        iHashCode4 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS18 = bVarI.S();
                        d dVarC110 = c.c(bVarI, aVar3);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, i78VarA15, bVar);
                        hlh0.a(bVarI, ne00VarS18, dVar5);
                        if (bVarI.S) {
                            n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                        } else {
                            n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                        }
                        hlh0.a(bVarI, dVarC110, cVar);
                        z45.d dVar10 = (z45.d) z45Var;
                        f = 1.0f;
                        i8 = 48;
                        b(dVar10.a, j.g(aVar3, 1.0f), bVarI, 48);
                        c(dVar10.b, j.g(aVar3, 1.0f), bVarI, 48);
                        z4 = true;
                        bVarI.X(true);
                        bVarI.X(false);
                    }
                    bVarI.X(z4);
                    m65 m65Var11 = m65Var3;
                    d dVarE11 = h.e(hib0.a(aVar3, m65Var11.d, bVarI, aVar3, f), h55VarA.d);
                    i78 i78VarA16 = g78.a(kVar2, aVar8, bVarI, i8);
                    iHashCode6 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS19 = bVarI.S();
                    d dVarC111 = c.c(bVarI, dVarE11);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA16, bVar);
                    hlh0.a(bVarI, ne00VarS19, dVar5);
                    if (bVarI.S) {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    } else {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    }
                    hlh0.a(bVarI, dVarC111, cVar);
                    gaj<? super j78, ? super a, ? super Integer, Unit> gajVar10 = gajVar5;
                    gajVar10.invoke(l78Var3, bVarI, Integer.valueOf(6 | ((i17 >> 24) & 112)));
                    bVarI.X(true);
                    iib0.a(aVar3, m65Var11.e, bVarI, true);
                    h55Var2 = h55VarA;
                    m65Var2 = m65Var11;
                    iyf0Var2 = iyf0Var4;
                    zs7Var3 = zs7Var4;
                    dVar3 = dVar9;
                    gajVar3 = gajVar10;
                    j3 = j4;
                }
                f = 1.0f;
                z4 = true;
                i8 = 48;
                bVarI.X(z4);
                m65 m65Var12 = m65Var3;
                d dVarE12 = h.e(hib0.a(aVar3, m65Var12.d, bVarI, aVar3, f), h55VarA.d);
                i78 i78VarA17 = g78.a(kVar2, aVar8, bVarI, i8);
                iHashCode6 = Long.hashCode(bVarI.T);
                ne00 ne00VarS110 = bVarI.S();
                d dVarC112 = c.c(bVarI, dVarE12);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA17, bVar);
                hlh0.a(bVarI, ne00VarS110, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                } else {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                }
                hlh0.a(bVarI, dVarC112, cVar);
                gaj<? super j78, ? super a, ? super Integer, Unit> gajVar11 = gajVar5;
                gajVar11.invoke(l78Var3, bVarI, Integer.valueOf(6 | ((i17 >> 24) & 112)));
                bVarI.X(true);
                iib0.a(aVar3, m65Var12.e, bVarI, true);
                h55Var2 = h55VarA;
                m65Var2 = m65Var12;
                iyf0Var2 = iyf0Var4;
                zs7Var3 = zs7Var4;
                dVar3 = dVar9;
                gajVar3 = gajVar11;
                j3 = j4;
            } else {
                gajVar5 = gajVar4;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC16, cVar);
            ty0.a(bVarI, j.i(aVar3, m65VarA.a));
            a(h.e(aVar3, h55VarA.a), uiText, j4, iyf0Var4, function0, zs7Var4, bVarI, (i4 & 8176) | ((i4 >> 12) & 57344) | ((i4 << 3) & 458752));
            d dVarE13 = h.e(hib0.a(aVar3, m65VarA.b, bVarI, aVar3, 1.0f), h55VarA.b);
            i78 i78VarA18 = g78.a(kVar2, aVar8, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS111 = bVarI.S();
            d dVarC113 = c.c(bVarI, dVarE13);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA18, bVar);
            hlh0.a(bVarI, ne00VarS111, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC113, cVar);
            Integer numValueOf4 = Integer.valueOf(((i5 << 3) & 112) | 6);
            l78 l78Var4 = l78.a;
            gajVar2.invoke(l78Var4, bVarI, numValueOf4);
            bVarI.X(true);
            d dVarE14 = h.e(hib0.a(aVar3, m65VarA.c, bVarI, aVar3, 1.0f), h55VarA.c);
            int i18 = i4;
            i78 i78VarA19 = g78.a(kVar2, aVar8, bVarI, 48);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS112 = bVarI.S();
            d dVarC114 = c.c(bVarI, dVarE14);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA19, bVar);
            hlh0.a(bVarI, ne00VarS112, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC114, cVar);
            if (z45Var.equals(z45.b.a)) {
                bVarI.N(442934015);
                bVarI.X(false);
                m65Var3 = m65VarA;
            } else {
                if (z45Var instanceof z45.c) {
                    bVarI.N(442999921);
                    f = 1.0f;
                    b(((z45.c) z45Var).a, j.g(aVar3, 1.0f), bVarI, 48);
                    bVarI.X(false);
                    m65Var3 = m65VarA;
                    z4 = true;
                    i8 = 48;
                } else if (z45Var instanceof z45.a) {
                    bVarI.N(443187812);
                    d dVarG4 = j.g(aVar3, 1.0f);
                    d160 d160VarA4 = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.j, bVarI, 0);
                    iHashCode5 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS113 = bVarI.S();
                    d dVarC115 = c.c(bVarI, dVarG4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA4, bVar);
                    hlh0.a(bVarI, ne00VarS113, dVar5);
                    if (bVarI.S) {
                        n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                    } else {
                        n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                    }
                    hlh0.a(bVarI, dVarC115, cVar);
                    z45.a aVar10 = (z45.a) z45Var;
                    w45.c cVar8 = aVar10.b;
                    m65 m65Var13 = m65VarA;
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    m65Var3 = m65Var13;
                    c(cVar8, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, 0);
                    w45.c cVar9 = aVar10.a;
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    b(cVar9, new LayoutWeightElement(f2, true), bVarI, 0);
                    bVarI.X(true);
                    bVarI.X(false);
                } else {
                    m65Var3 = m65VarA;
                    if (z45Var instanceof z45.d) {
                        throw igf0.a(bVarI, 1122665737, false);
                    }
                    bVarI.N(443721663);
                    i78 i78VarA110 = g78.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0()), ht.a.m, bVarI, 0);
                    iHashCode4 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS114 = bVarI.S();
                    d dVarC116 = c.c(bVarI, aVar3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA110, bVar);
                    hlh0.a(bVarI, ne00VarS114, dVar5);
                    if (bVarI.S) {
                        n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                    } else {
                        n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                    }
                    hlh0.a(bVarI, dVarC116, cVar);
                    z45.d dVar11 = (z45.d) z45Var;
                    f = 1.0f;
                    i8 = 48;
                    b(dVar11.a, j.g(aVar3, 1.0f), bVarI, 48);
                    c(dVar11.b, j.g(aVar3, 1.0f), bVarI, 48);
                    z4 = true;
                    bVarI.X(true);
                    bVarI.X(false);
                }
                bVarI.X(z4);
                m65 m65Var14 = m65Var3;
                d dVarE15 = h.e(hib0.a(aVar3, m65Var14.d, bVarI, aVar3, f), h55VarA.d);
                i78 i78VarA111 = g78.a(kVar2, aVar8, bVarI, i8);
                iHashCode6 = Long.hashCode(bVarI.T);
                ne00 ne00VarS115 = bVarI.S();
                d dVarC117 = c.c(bVarI, dVarE15);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA111, bVar);
                hlh0.a(bVarI, ne00VarS115, dVar5);
                if (bVarI.S) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                } else {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                }
                hlh0.a(bVarI, dVarC117, cVar);
                gaj<? super j78, ? super a, ? super Integer, Unit> gajVar12 = gajVar5;
                gajVar12.invoke(l78Var4, bVarI, Integer.valueOf(6 | ((i18 >> 24) & 112)));
                bVarI.X(true);
                iib0.a(aVar3, m65Var14.e, bVarI, true);
                h55Var2 = h55VarA;
                m65Var2 = m65Var14;
                iyf0Var2 = iyf0Var4;
                zs7Var3 = zs7Var4;
                dVar3 = dVar9;
                gajVar3 = gajVar12;
                j3 = j4;
            }
            f = 1.0f;
            z4 = true;
            i8 = 48;
            bVarI.X(z4);
            m65 m65Var15 = m65Var3;
            d dVarE16 = h.e(hib0.a(aVar3, m65Var15.d, bVarI, aVar3, f), h55VarA.d);
            i78 i78VarA112 = g78.a(kVar2, aVar8, bVarI, i8);
            iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS116 = bVarI.S();
            d dVarC118 = c.c(bVarI, dVarE16);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA112, bVar);
            hlh0.a(bVarI, ne00VarS116, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            } else {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC118, cVar);
            gaj<? super j78, ? super a, ? super Integer, Unit> gajVar13 = gajVar5;
            gajVar13.invoke(l78Var4, bVarI, Integer.valueOf(6 | ((i18 >> 24) & 112)));
            bVarI.X(true);
            iib0.a(aVar3, m65Var15.e, bVarI, true);
            h55Var2 = h55VarA;
            m65Var2 = m65Var15;
            iyf0Var2 = iyf0Var4;
            zs7Var3 = zs7Var4;
            dVar3 = dVar9;
            gajVar3 = gajVar13;
            j3 = j4;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            j3 = j2;
            zs7Var3 = zs7Var2;
            m65Var2 = m65VarA;
            iyf0Var2 = iyf0Var;
            h55Var2 = h55Var;
            gajVar3 = gajVar;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eib0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    jib0.e(dVar3, uiText, j3, iyf0Var2, zs7Var3, z45Var, m65Var2, h55Var2, function0, gajVar3, gajVar2, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0200  */
    /* JADX WARN: Code duplicated, block: B:134:0x021d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0223  */
    /* JADX WARN: Code duplicated, block: B:138:0x0228  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0110  */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    public static final void f(d dVar, final UiText uiText, w1w w1wVar, final UiText uiText2, String str, final Function0 function0, long j, long j2, long j3, iyf0 iyf0Var, zs7 zs7Var, m65 m65Var, final z45 z45Var, Function2 function2, Function2 function3, gaj gajVar, a aVar, final int i, final int i2, final int i3) {
        int i4;
        long j4;
        long j5;
        int i5;
        int i6;
        long j6;
        int i7;
        m65 m65Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        b bVar;
        final d dVar2;
        final w1w w1wVar2;
        final String str2;
        final Function2 function4;
        final Function2 function5;
        final gaj gajVar2;
        final m65 m65Var3;
        final long j7;
        final long j8;
        final long j9;
        final iyf0 iyf0Var2;
        final zs7 zs7Var2;
        e eVarZ;
        String str3;
        int i15;
        int i16;
        b bVar2;
        int i17;
        m65 m65VarA;
        Function2 function6;
        int i18;
        d dVar3;
        iyf0 iyf0Var3;
        Function2 function7;
        long j10;
        long j11;
        long j12;
        zs7 zs7Var3;
        Function2 function8;
        final String str4;
        gaj gajVar3;
        w1w w1wVar3;
        m65 m65Var4;
        int i19;
        int i20;
        int i21;
        int i22;
        uiText2.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1849823043);
        int i23 = i | 6;
        if ((i & 48) == 0) {
            i23 |= bVarI.M(uiText) ? 32 : 16;
        }
        int i24 = i23 | 384;
        if ((i & 3072) == 0) {
            i24 |= bVarI.M(uiText2) ? 2048 : 1024;
        }
        int i25 = i3 & 16;
        if (i25 == 0) {
            if ((i & 24576) == 0) {
                i24 |= bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i4 = i24 | 196608;
            if ((i & 1572864) != 0) {
                if (bVarI.A(function0)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i4 |= i22;
            }
            if ((i & 12582912) == 0) {
                j4 = j;
                if ((i3 & 128) == 0 || !bVarI.e(j4)) {
                    i21 = 4194304;
                } else {
                    i21 = 8388608;
                }
                i4 |= i21;
            } else {
                j4 = j;
            }
            if ((i & 100663296) == 0) {
                j5 = j2;
                if ((i3 & 256) == 0 || !bVarI.e(j5)) {
                    i20 = 33554432;
                } else {
                    i20 = 67108864;
                }
                i4 |= i20;
            } else {
                j5 = j2;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    i5 = 196608;
                    i6 = 1572864;
                    j6 = j3;
                    int i26 = bVarI.e(j6) ? 536870912 : 268435456;
                    i4 |= i26;
                } else {
                    i5 = 196608;
                    i6 = 1572864;
                    j6 = j3;
                }
                i4 |= i26;
            } else {
                i5 = 196608;
                i6 = 1572864;
                j6 = j3;
            }
            int i27 = i2 | 22;
            i7 = i5;
            if ((i3 & 4096) == 0) {
                m65Var2 = m65Var;
                int i28 = bVarI.M(m65Var2) ? 256 : 128;
                int i29 = i27 | i28;
                if (bVarI.M(z45Var)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i9 = i29 | i8;
                i10 = i4;
                i11 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i11 != 0) {
                    i12 = i9 | 24576;
                } else if ((i2 & 24576) == 0) {
                    if (bVarI.A(function2)) {
                        i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i13 = 8192;
                    }
                    i12 = i9 | i13;
                } else {
                    i12 = i9;
                }
                i14 = i12 | 1638400;
                if ((i10 & 306783379) == 306783378 || (599187 & i14) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        w1w w1wVar4 = new w1w();
                        if (i25 != 0) {
                            str3 = "bottom_sheet_description";
                        } else {
                            str3 = str;
                        }
                        if ((i3 & 128) != 0) {
                            j4 = ((lib0) bVarI.O(oib0.a)).i0;
                            i15 = i10 & (-29360129);
                        } else {
                            i15 = i10;
                        }
                        if ((i3 & 256) != 0) {
                            j5 = ((lib0) bVarI.O(oib0.a)).a;
                            i15 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            j6 = ((lib0) bVarI.O(oib0.a)).c;
                            i15 &= -1879048193;
                        }
                        iyf0 iyf0Var4 = iyf0.a;
                        int i30 = i15;
                        zs7 zs7Var4 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                        i16 = i14 & (-113);
                        if ((i3 & 4096) != 0) {
                            m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                            bVar2 = bVarI;
                            i17 = i14 & (-1009);
                        } else {
                            bVar2 = bVarI;
                            i17 = i16;
                            m65VarA = m65Var2;
                        }
                        if (i11 != 0) {
                            function6 = ns9.d;
                        } else {
                            function6 = function2;
                        }
                        int i31 = i17;
                        w92 w92Var = new w92(1);
                        i18 = i31 & (-458753);
                        dVar3 = d.a.b;
                        iyf0Var3 = iyf0Var4;
                        function7 = function6;
                        j10 = j4;
                        j11 = j5;
                        j12 = j6;
                        zs7Var3 = zs7Var4;
                        function8 = w92Var;
                        str4 = str3;
                        gajVar3 = ns9.e;
                        w1wVar3 = w1wVar4;
                        m65Var4 = m65VarA;
                        i19 = i30;
                    } else {
                        bVarI.G();
                        int i32 = (i3 & 128) != 0 ? i10 & (-29360129) : i10;
                        if ((i3 & 256) != 0) {
                            i32 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i32 &= -1879048193;
                        }
                        int i33 = i14 & (-113);
                        if ((i3 & 4096) != 0) {
                            i33 = i14 & (-1009);
                        }
                        dVar3 = dVar;
                        w1wVar3 = w1wVar;
                        zs7Var3 = zs7Var;
                        function8 = function3;
                        gajVar3 = gajVar;
                        bVar2 = bVarI;
                        m65Var4 = m65Var2;
                        j10 = j4;
                        j11 = j5;
                        j12 = j6;
                        iyf0Var3 = iyf0Var;
                        function7 = function2;
                        i19 = i32;
                        i18 = i33 & (-458753);
                        str4 = str;
                    }
                    bVar2.Y();
                    String str5 = str4;
                    op8 op8VarB = pp8.b(-1493254817, new gaj() { // from class: xhb0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((j78) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                UiText uiText3 = uiText2;
                                uiText3.getClass();
                                lkf0.d(uiText3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), g3w.h(d.a.b, str4), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar2, 0, 0, 131068);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVar2);
                    int i34 = i19 & 1022;
                    int i35 = i19 >> 12;
                    bVar = bVar2;
                    d dVar4 = dVar3;
                    d(dVar4, uiText, w1wVar3, j10, j11, j12, iyf0Var3, zs7Var3, z45Var, m65Var4, null, null, function0, function7, function8, gajVar3, op8VarB, bVar, i34 | (i35 & 7168) | (57344 & i35) | (458752 & i35) | i6 | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192), (i35 & 112) | i6 | (i35 & 896) | ((i18 >> 3) & 7168) | i7, 1024);
                    dVar2 = dVar4;
                    w1wVar2 = w1wVar3;
                    j7 = j10;
                    j8 = j11;
                    j9 = j12;
                    iyf0Var2 = iyf0Var3;
                    zs7Var2 = zs7Var3;
                    m65Var3 = m65Var4;
                    function4 = function7;
                    function5 = function8;
                    gajVar2 = gajVar3;
                    str2 = str5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    w1wVar2 = w1wVar;
                    str2 = str;
                    function4 = function2;
                    function5 = function3;
                    gajVar2 = gajVar;
                    m65Var3 = m65Var2;
                    j7 = j4;
                    j8 = j5;
                    j9 = j6;
                    iyf0Var2 = iyf0Var;
                    zs7Var2 = zs7Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: yhb0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            jib0.f(dVar2, uiText, w1wVar2, uiText2, str2, function0, j7, j8, j9, iyf0Var2, zs7Var2, m65Var3, z45Var, function4, function5, gajVar2, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            m65Var2 = m65Var;
            int i210 = i27 | i28;
            if (bVarI.M(z45Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i9 = i210 | i8;
            i10 = i4;
            i11 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i11 != 0) {
                i12 = i9 | 24576;
            } else if ((i2 & 24576) == 0) {
                if (bVarI.A(function2)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i12 = i9 | i13;
            } else {
                i12 = i9;
            }
            i14 = i12 | 1638400;
            if ((i10 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    w1w w1wVar5 = new w1w();
                    if (i25 != 0) {
                        str3 = "bottom_sheet_description";
                    } else {
                        str3 = str;
                    }
                    if ((i3 & 128) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).i0;
                        i15 = i10 & (-29360129);
                    } else {
                        i15 = i10;
                    }
                    if ((i3 & 256) != 0) {
                        j5 = ((lib0) bVarI.O(oib0.a)).a;
                        i15 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        j6 = ((lib0) bVarI.O(oib0.a)).c;
                        i15 &= -1879048193;
                    }
                    iyf0 iyf0Var5 = iyf0.a;
                    int i36 = i15;
                    zs7 zs7Var5 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    i16 = i14 & (-113);
                    if ((i3 & 4096) != 0) {
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        bVar2 = bVarI;
                        i17 = i14 & (-1009);
                    } else {
                        bVar2 = bVarI;
                        i17 = i16;
                        m65VarA = m65Var2;
                    }
                    if (i11 != 0) {
                        function6 = ns9.d;
                    } else {
                        function6 = function2;
                    }
                    int i37 = i17;
                    w92 w92Var2 = new w92(1);
                    i18 = i37 & (-458753);
                    dVar3 = d.a.b;
                    iyf0Var3 = iyf0Var5;
                    function7 = function6;
                    j10 = j4;
                    j11 = j5;
                    j12 = j6;
                    zs7Var3 = zs7Var5;
                    function8 = w92Var2;
                    str4 = str3;
                    gajVar3 = ns9.e;
                    w1wVar3 = w1wVar5;
                    m65Var4 = m65VarA;
                    i19 = i36;
                } else {
                    w1w w1wVar6 = new w1w();
                    if (i25 != 0) {
                        str3 = "bottom_sheet_description";
                    } else {
                        str3 = str;
                    }
                    if ((i3 & 128) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).i0;
                        i15 = i10 & (-29360129);
                    } else {
                        i15 = i10;
                    }
                    if ((i3 & 256) != 0) {
                        j5 = ((lib0) bVarI.O(oib0.a)).a;
                        i15 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        j6 = ((lib0) bVarI.O(oib0.a)).c;
                        i15 &= -1879048193;
                    }
                    iyf0 iyf0Var6 = iyf0.a;
                    int i38 = i15;
                    zs7 zs7Var6 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    i16 = i14 & (-113);
                    if ((i3 & 4096) != 0) {
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        bVar2 = bVarI;
                        i17 = i14 & (-1009);
                    } else {
                        bVar2 = bVarI;
                        i17 = i16;
                        m65VarA = m65Var2;
                    }
                    if (i11 != 0) {
                        function6 = ns9.d;
                    } else {
                        function6 = function2;
                    }
                    int i39 = i17;
                    w92 w92Var3 = new w92(1);
                    i18 = i39 & (-458753);
                    dVar3 = d.a.b;
                    iyf0Var3 = iyf0Var6;
                    function7 = function6;
                    j10 = j4;
                    j11 = j5;
                    j12 = j6;
                    zs7Var3 = zs7Var6;
                    function8 = w92Var3;
                    str4 = str3;
                    gajVar3 = ns9.e;
                    w1wVar3 = w1wVar6;
                    m65Var4 = m65VarA;
                    i19 = i38;
                }
                bVar2.Y();
                String str6 = str4;
                op8 op8VarB2 = pp8.b(-1493254817, new gaj() { // from class: xhb0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            UiText uiText3 = uiText2;
                            uiText3.getClass();
                            lkf0.d(uiText3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), g3w.h(d.a.b, str4), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar2, 0, 0, 131068);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVar2);
                int i310 = i19 & 1022;
                int i311 = i19 >> 12;
                bVar = bVar2;
                d dVar5 = dVar3;
                d(dVar5, uiText, w1wVar3, j10, j11, j12, iyf0Var3, zs7Var3, z45Var, m65Var4, null, null, function0, function7, function8, gajVar3, op8VarB2, bVar, i310 | (i311 & 7168) | (57344 & i311) | (458752 & i311) | i6 | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192), (i311 & 112) | i6 | (i311 & 896) | ((i18 >> 3) & 7168) | i7, 1024);
                dVar2 = dVar5;
                w1wVar2 = w1wVar3;
                j7 = j10;
                j8 = j11;
                j9 = j12;
                iyf0Var2 = iyf0Var3;
                zs7Var2 = zs7Var3;
                m65Var3 = m65Var4;
                function4 = function7;
                function5 = function8;
                gajVar2 = gajVar3;
                str2 = str6;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                w1wVar2 = w1wVar;
                str2 = str;
                function4 = function2;
                function5 = function3;
                gajVar2 = gajVar;
                m65Var3 = m65Var2;
                j7 = j4;
                j8 = j5;
                j9 = j6;
                iyf0Var2 = iyf0Var;
                zs7Var2 = zs7Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: yhb0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        jib0.f(dVar2, uiText, w1wVar2, uiText2, str2, function0, j7, j8, j9, iyf0Var2, zs7Var2, m65Var3, z45Var, function4, function5, gajVar2, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i24 |= 24576;
        i4 = i24 | 196608;
        if ((i & 1572864) != 0) {
            if (bVarI.A(function0)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i4 |= i22;
        }
        if ((i & 12582912) == 0) {
            j4 = j;
            if ((i3 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i4 |= i21;
        } else {
            j4 = j;
        }
        if ((i & 100663296) == 0) {
            j5 = j2;
            if ((i3 & 256) == 0) {
                i20 = 33554432;
            } else {
                i20 = 33554432;
            }
            i4 |= i20;
        } else {
            j5 = j2;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                i5 = 196608;
                i6 = 1572864;
                j6 = j3;
                if (bVarI.e(j6)) {
                }
                i4 |= i26;
            } else {
                i5 = 196608;
                i6 = 1572864;
                j6 = j3;
            }
            i4 |= i26;
        } else {
            i5 = 196608;
            i6 = 1572864;
            j6 = j3;
        }
        int i211 = i2 | 22;
        i7 = i5;
        if ((i3 & 4096) == 0) {
            m65Var2 = m65Var;
            if (bVarI.M(m65Var2)) {
            }
            int i212 = i211 | i28;
            if (bVarI.M(z45Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i9 = i212 | i8;
            i10 = i4;
            i11 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i11 != 0) {
                i12 = i9 | 24576;
            } else if ((i2 & 24576) == 0) {
                if (bVarI.A(function2)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i12 = i9 | i13;
            } else {
                i12 = i9;
            }
            i14 = i12 | 1638400;
            if ((i10 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    w1w w1wVar7 = new w1w();
                    if (i25 != 0) {
                        str3 = "bottom_sheet_description";
                    } else {
                        str3 = str;
                    }
                    if ((i3 & 128) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).i0;
                        i15 = i10 & (-29360129);
                    } else {
                        i15 = i10;
                    }
                    if ((i3 & 256) != 0) {
                        j5 = ((lib0) bVarI.O(oib0.a)).a;
                        i15 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        j6 = ((lib0) bVarI.O(oib0.a)).c;
                        i15 &= -1879048193;
                    }
                    iyf0 iyf0Var7 = iyf0.a;
                    int i312 = i15;
                    zs7 zs7Var7 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    i16 = i14 & (-113);
                    if ((i3 & 4096) != 0) {
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        bVar2 = bVarI;
                        i17 = i14 & (-1009);
                    } else {
                        bVar2 = bVarI;
                        i17 = i16;
                        m65VarA = m65Var2;
                    }
                    if (i11 != 0) {
                        function6 = ns9.d;
                    } else {
                        function6 = function2;
                    }
                    int i313 = i17;
                    w92 w92Var4 = new w92(1);
                    i18 = i313 & (-458753);
                    dVar3 = d.a.b;
                    iyf0Var3 = iyf0Var7;
                    function7 = function6;
                    j10 = j4;
                    j11 = j5;
                    j12 = j6;
                    zs7Var3 = zs7Var7;
                    function8 = w92Var4;
                    str4 = str3;
                    gajVar3 = ns9.e;
                    w1wVar3 = w1wVar7;
                    m65Var4 = m65VarA;
                    i19 = i312;
                } else {
                    w1w w1wVar8 = new w1w();
                    if (i25 != 0) {
                        str3 = "bottom_sheet_description";
                    } else {
                        str3 = str;
                    }
                    if ((i3 & 128) != 0) {
                        j4 = ((lib0) bVarI.O(oib0.a)).i0;
                        i15 = i10 & (-29360129);
                    } else {
                        i15 = i10;
                    }
                    if ((i3 & 256) != 0) {
                        j5 = ((lib0) bVarI.O(oib0.a)).a;
                        i15 &= -234881025;
                    }
                    if ((i3 & 512) != 0) {
                        j6 = ((lib0) bVarI.O(oib0.a)).c;
                        i15 &= -1879048193;
                    }
                    iyf0 iyf0Var8 = iyf0.a;
                    int i314 = i15;
                    zs7 zs7Var8 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                    i16 = i14 & (-113);
                    if ((i3 & 4096) != 0) {
                        m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                        bVar2 = bVarI;
                        i17 = i14 & (-1009);
                    } else {
                        bVar2 = bVarI;
                        i17 = i16;
                        m65VarA = m65Var2;
                    }
                    if (i11 != 0) {
                        function6 = ns9.d;
                    } else {
                        function6 = function2;
                    }
                    int i315 = i17;
                    w92 w92Var5 = new w92(1);
                    i18 = i315 & (-458753);
                    dVar3 = d.a.b;
                    iyf0Var3 = iyf0Var8;
                    function7 = function6;
                    j10 = j4;
                    j11 = j5;
                    j12 = j6;
                    zs7Var3 = zs7Var8;
                    function8 = w92Var5;
                    str4 = str3;
                    gajVar3 = ns9.e;
                    w1wVar3 = w1wVar8;
                    m65Var4 = m65VarA;
                    i19 = i314;
                }
                bVar2.Y();
                String str7 = str4;
                op8 op8VarB3 = pp8.b(-1493254817, new gaj() { // from class: xhb0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            UiText uiText3 = uiText2;
                            uiText3.getClass();
                            lkf0.d(uiText3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), g3w.h(d.a.b, str4), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar2, 0, 0, 131068);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVar2);
                int i316 = i19 & 1022;
                int i317 = i19 >> 12;
                bVar = bVar2;
                d dVar6 = dVar3;
                d(dVar6, uiText, w1wVar3, j10, j11, j12, iyf0Var3, zs7Var3, z45Var, m65Var4, null, null, function0, function7, function8, gajVar3, op8VarB3, bVar, i316 | (i317 & 7168) | (57344 & i317) | (458752 & i317) | i6 | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192), (i317 & 112) | i6 | (i317 & 896) | ((i18 >> 3) & 7168) | i7, 1024);
                dVar2 = dVar6;
                w1wVar2 = w1wVar3;
                j7 = j10;
                j8 = j11;
                j9 = j12;
                iyf0Var2 = iyf0Var3;
                zs7Var2 = zs7Var3;
                m65Var3 = m65Var4;
                function4 = function7;
                function5 = function8;
                gajVar2 = gajVar3;
                str2 = str7;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                w1wVar2 = w1wVar;
                str2 = str;
                function4 = function2;
                function5 = function3;
                gajVar2 = gajVar;
                m65Var3 = m65Var2;
                j7 = j4;
                j8 = j5;
                j9 = j6;
                iyf0Var2 = iyf0Var;
                zs7Var2 = zs7Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: yhb0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        jib0.f(dVar2, uiText, w1wVar2, uiText2, str2, function0, j7, j8, j9, iyf0Var2, zs7Var2, m65Var3, z45Var, function4, function5, gajVar2, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        m65Var2 = m65Var;
        int i213 = i211 | i28;
        if (bVarI.M(z45Var)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        i9 = i213 | i8;
        i10 = i4;
        i11 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i11 != 0) {
            i12 = i9 | 24576;
        } else if ((i2 & 24576) == 0) {
            if (bVarI.A(function2)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i12 = i9 | i13;
        } else {
            i12 = i9;
        }
        i14 = i12 | 1638400;
        if ((i10 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (bVarI.q(i10 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                w1w w1wVar9 = new w1w();
                if (i25 != 0) {
                    str3 = "bottom_sheet_description";
                } else {
                    str3 = str;
                }
                if ((i3 & 128) != 0) {
                    j4 = ((lib0) bVarI.O(oib0.a)).i0;
                    i15 = i10 & (-29360129);
                } else {
                    i15 = i10;
                }
                if ((i3 & 256) != 0) {
                    j5 = ((lib0) bVarI.O(oib0.a)).a;
                    i15 &= -234881025;
                }
                if ((i3 & 512) != 0) {
                    j6 = ((lib0) bVarI.O(oib0.a)).c;
                    i15 &= -1879048193;
                }
                iyf0 iyf0Var9 = iyf0.a;
                int i318 = i15;
                zs7 zs7Var9 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                i16 = i14 & (-113);
                if ((i3 & 4096) != 0) {
                    m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                    bVar2 = bVarI;
                    i17 = i14 & (-1009);
                } else {
                    bVar2 = bVarI;
                    i17 = i16;
                    m65VarA = m65Var2;
                }
                if (i11 != 0) {
                    function6 = ns9.d;
                } else {
                    function6 = function2;
                }
                int i319 = i17;
                w92 w92Var6 = new w92(1);
                i18 = i319 & (-458753);
                dVar3 = d.a.b;
                iyf0Var3 = iyf0Var9;
                function7 = function6;
                j10 = j4;
                j11 = j5;
                j12 = j6;
                zs7Var3 = zs7Var9;
                function8 = w92Var6;
                str4 = str3;
                gajVar3 = ns9.e;
                w1wVar3 = w1wVar9;
                m65Var4 = m65VarA;
                i19 = i318;
            } else {
                w1w w1wVar10 = new w1w();
                if (i25 != 0) {
                    str3 = "bottom_sheet_description";
                } else {
                    str3 = str;
                }
                if ((i3 & 128) != 0) {
                    j4 = ((lib0) bVarI.O(oib0.a)).i0;
                    i15 = i10 & (-29360129);
                } else {
                    i15 = i10;
                }
                if ((i3 & 256) != 0) {
                    j5 = ((lib0) bVarI.O(oib0.a)).a;
                    i15 &= -234881025;
                }
                if ((i3 & 512) != 0) {
                    j6 = ((lib0) bVarI.O(oib0.a)).c;
                    i15 &= -1879048193;
                }
                iyf0 iyf0Var10 = iyf0.a;
                int i3110 = i15;
                zs7 zs7Var10 = new zs7(6, ((cjb0) bVarI.O(ejb0.a)).f);
                i16 = i14 & (-113);
                if ((i3 & 4096) != 0) {
                    m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 31);
                    bVar2 = bVarI;
                    i17 = i14 & (-1009);
                } else {
                    bVar2 = bVarI;
                    i17 = i16;
                    m65VarA = m65Var2;
                }
                if (i11 != 0) {
                    function6 = ns9.d;
                } else {
                    function6 = function2;
                }
                int i3111 = i17;
                w92 w92Var7 = new w92(1);
                i18 = i3111 & (-458753);
                dVar3 = d.a.b;
                iyf0Var3 = iyf0Var10;
                function7 = function6;
                j10 = j4;
                j11 = j5;
                j12 = j6;
                zs7Var3 = zs7Var10;
                function8 = w92Var7;
                str4 = str3;
                gajVar3 = ns9.e;
                w1wVar3 = w1wVar10;
                m65Var4 = m65VarA;
                i19 = i3110;
            }
            bVar2.Y();
            String str8 = str4;
            op8 op8VarB4 = pp8.b(-1493254817, new gaj() { // from class: xhb0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        UiText uiText3 = uiText2;
                        uiText3.getClass();
                        lkf0.d(uiText3.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), g3w.h(d.a.b, str4), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).l, aVar2, 0, 0, 131068);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar2);
            int i3112 = i19 & 1022;
            int i3113 = i19 >> 12;
            bVar = bVar2;
            d dVar7 = dVar3;
            d(dVar7, uiText, w1wVar3, j10, j11, j12, iyf0Var3, zs7Var3, z45Var, m65Var4, null, null, function0, function7, function8, gajVar3, op8VarB4, bVar, i3112 | (i3113 & 7168) | (57344 & i3113) | (458752 & i3113) | i6 | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192), (i3113 & 112) | i6 | (i3113 & 896) | ((i18 >> 3) & 7168) | i7, 1024);
            dVar2 = dVar7;
            w1wVar2 = w1wVar3;
            j7 = j10;
            j8 = j11;
            j9 = j12;
            iyf0Var2 = iyf0Var3;
            zs7Var2 = zs7Var3;
            m65Var3 = m65Var4;
            function4 = function7;
            function5 = function8;
            gajVar2 = gajVar3;
            str2 = str8;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            w1wVar2 = w1wVar;
            str2 = str;
            function4 = function2;
            function5 = function3;
            gajVar2 = gajVar;
            m65Var3 = m65Var2;
            j7 = j4;
            j8 = j5;
            j9 = j6;
            iyf0Var2 = iyf0Var;
            zs7Var2 = zs7Var;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yhb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    jib0.f(dVar2, uiText, w1wVar2, uiText2, str2, function0, j7, j8, j9, iyf0Var2, zs7Var2, m65Var3, z45Var, function4, function5, gajVar2, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type int to ?? for r8v1 ??
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:139)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.inline(CodeShrinkVisitor.java:212)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:73)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:48)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:39)
        */
    public static final void g(final int r39, androidx.compose.runtime.a r40, final androidx.compose.ui.d r41, final java.lang.String r42) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jib0.g(int, androidx.compose.runtime.a, androidx.compose.ui.d, java.lang.String):void");
    }

    public static final d h(d dVar, List<u8j> list) {
        for (u8j u8jVar : list) {
            dVar = c9j.c(dVar, u8jVar.a, u8jVar.b);
        }
        return dVar;
    }
}
