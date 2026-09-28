package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class jst {
    public static final void a(final Function0 function0, final d dVar, final boolean z, final alb0 alb0Var, long j, final long j2, final long j3, final long j4, final i060 i060Var, String str, a aVar, final int i) {
        int i2;
        d dVar2;
        final long j5;
        final String str2;
        long j6;
        int i3;
        String str3;
        function0.getClass();
        b bVarI = aVar.i(1203222672);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            dVar2 = dVar;
            i2 |= bVarI.M(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(alb0Var) : bVarI.A(alb0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.e(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.e(j3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.e(j4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.M(i060Var) ? 67108864 : 33554432;
        }
        int i4 = i2 | 805306368;
        if (bVarI.q(i4 & 1, (306783379 & i4) != 306783378)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                j6 = ((v0u) bVarI.O(cst.f)).a;
                i3 = i4 & (-57345);
                str3 = "loyalty_contained_button";
            } else {
                bVarI.G();
                j6 = j;
                i3 = i4 & (-57345);
                str3 = str;
            }
            bVarI.Y();
            long j7 = j6;
            int i5 = i3 >> 12;
            String str4 = str3;
            int i6 = i3;
            ak5 ak5VarA = sya.a(j7, j2, j3, j4, bVarI, (i5 & 896) | 24576 | (i5 & 112) | (i5 & 7168), 0);
            bVarI = bVarI;
            xya.b(dVar2, z, ak5VarA, alb0Var, i060Var, 0.0f, str4, function0, gv9.c, bVarI, ((i6 << 21) & 29360128) | ((i6 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | (i6 & 7168) | (57344 & i5) | ((i6 >> 9) & 3670016) | 100663296, 32);
            str2 = str4;
            j5 = j7;
        } else {
            bVarI.G();
            j5 = j;
            str2 = str;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gst
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jst.a(function0, dVar, z, alb0Var, j5, j2, j3, j4, i060Var, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01de  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:89:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0143  */
    /* JADX WARN: Code duplicated, block: B:99:0x014d  */
    public static final void b(final String str, final Function0 function0, final d dVar, boolean z, alb0 alb0Var, long j, long j2, long j3, long j4, qx80 qx80Var, String str2, a aVar, final int i, final int i2) {
        int i3;
        Function0 function1;
        d dVar2;
        boolean z2;
        long j5;
        long j6;
        boolean z3;
        b bVar;
        final alb0 alb0Var2;
        final long j7;
        final qx80 qx80Var2;
        final String str3;
        final boolean z4;
        final long j8;
        final long j9;
        final long j10;
        e eVarZ;
        alb0 alb0Var3;
        long j11;
        int i4;
        long j12;
        int i5;
        int i6;
        long jA;
        long jA2;
        String str4;
        int i7;
        qx80 qx80VarC;
        function0.getClass();
        b bVarI = aVar.i(375528555);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i3 |= bVarI.A(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            dVar2 = dVar;
            i3 |= bVarI.M(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= 524288;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    j5 = j3;
                    int i9 = bVarI.e(j5) ? 8388608 : 4194304;
                    i3 |= i9;
                } else {
                    j5 = j3;
                }
                i3 |= i9;
            } else {
                j5 = j3;
            }
            if ((100663296 & i) == 0) {
                if ((i2 & 256) == 0) {
                    j6 = j4;
                    int i10 = bVarI.e(j6) ? 67108864 : 33554432;
                    i3 |= i10;
                } else {
                    j6 = j4;
                }
                i3 |= i10;
            } else {
                j6 = j4;
            }
            if ((805306368 & i) == 0) {
                i3 |= 268435456;
            }
            if ((306783379 & i3) == 306783378) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (bVarI.q(i3 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    boolean z5 = i8 == 0 ? z2 : true;
                    alb0Var3 = sya.e;
                    boolean z6 = z5;
                    j11 = ((v0u) bVarI.O(cst.f)).a;
                    i4 = i3;
                    j12 = ((lib0) bVarI.O(oib0.a)).a;
                    i5 = i4 & (-4186113);
                    if ((i2 & 128) != 0) {
                        jA = c68.a(R.color.brand_secondary_disable, bVarI);
                        i6 = i4 & (-33546241);
                    } else {
                        i6 = i5;
                        jA = j5;
                    }
                    if ((i2 & 256) != 0) {
                        jA2 = c68.a(R.color.text_disable_type1_primary, bVarI);
                        i6 &= -234881025;
                    } else {
                        jA2 = j6;
                    }
                    str4 = "loyalty_contained_button";
                    i7 = i6 & (-1879048193);
                    qx80VarC = j060.c(2.0f);
                    j6 = jA2;
                    j5 = jA;
                    z2 = z6;
                } else {
                    bVarI.G();
                    int i11 = i3 & (-4186113);
                    if ((i2 & 128) != 0) {
                        i11 = i3 & (-33546241);
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                    }
                    int i12 = i11 & (-1879048193);
                    alb0Var3 = alb0Var;
                    j11 = j;
                    qx80VarC = qx80Var;
                    str4 = str2;
                    i7 = i12;
                    j12 = j2;
                }
                bVarI.Y();
                qx80 qx80Var3 = qx80VarC;
                int i13 = i7 >> 15;
                bVar = bVarI;
                xya.a(dVar2, z2, str, str4, alb0Var3, sya.a(j11, j12, j5, j6, bVarI, (i13 & 7168) | 24576 | (i13 & 896), 0), qx80Var3, null, null, function1, bVar, ((i7 << 6) & 896) | ((i7 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | ((i7 << 24) & 1879048192), 384);
                alb0Var2 = alb0Var3;
                j7 = j11;
                qx80Var2 = qx80Var3;
                str3 = str4;
                j8 = j6;
                j9 = j5;
                z4 = z2;
                j10 = j12;
            } else {
                bVar = bVarI;
                bVar.G();
                alb0Var2 = alb0Var;
                j7 = j;
                qx80Var2 = qx80Var;
                str3 = str2;
                z4 = z2;
                j8 = j6;
                j9 = j5;
                j10 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ist
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        jst.b(str, function0, dVar, z4, alb0Var2, j7, j10, j9, j8, qx80Var2, str3, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                j5 = j3;
                if (bVarI.e(j5)) {
                }
                i3 |= i9;
            } else {
                j5 = j3;
            }
            i3 |= i9;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0) {
                j6 = j4;
                if (bVarI.e(j6)) {
                }
                i3 |= i10;
            } else {
                j6 = j4;
            }
            i3 |= i10;
        } else {
            j6 = j4;
        }
        if ((805306368 & i) == 0) {
            i3 |= 268435456;
        }
        if ((306783379 & i3) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (bVarI.q(i3 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                alb0Var3 = sya.e;
                boolean z7 = z5;
                j11 = ((v0u) bVarI.O(cst.f)).a;
                i4 = i3;
                j12 = ((lib0) bVarI.O(oib0.a)).a;
                i5 = i4 & (-4186113);
                if ((i2 & 128) != 0) {
                    jA = c68.a(R.color.brand_secondary_disable, bVarI);
                    i6 = i4 & (-33546241);
                } else {
                    i6 = i5;
                    jA = j5;
                }
                if ((i2 & 256) != 0) {
                    jA2 = c68.a(R.color.text_disable_type1_primary, bVarI);
                    i6 &= -234881025;
                } else {
                    jA2 = j6;
                }
                str4 = "loyalty_contained_button";
                i7 = i6 & (-1879048193);
                qx80VarC = j060.c(2.0f);
                j6 = jA2;
                j5 = jA;
                z2 = z7;
            } else {
                if (i8 == 0) {
                }
                alb0Var3 = sya.e;
                boolean z8 = z5;
                j11 = ((v0u) bVarI.O(cst.f)).a;
                i4 = i3;
                j12 = ((lib0) bVarI.O(oib0.a)).a;
                i5 = i4 & (-4186113);
                if ((i2 & 128) != 0) {
                    jA = c68.a(R.color.brand_secondary_disable, bVarI);
                    i6 = i4 & (-33546241);
                } else {
                    i6 = i5;
                    jA = j5;
                }
                if ((i2 & 256) != 0) {
                    jA2 = c68.a(R.color.text_disable_type1_primary, bVarI);
                    i6 &= -234881025;
                } else {
                    jA2 = j6;
                }
                str4 = "loyalty_contained_button";
                i7 = i6 & (-1879048193);
                qx80VarC = j060.c(2.0f);
                j6 = jA2;
                j5 = jA;
                z2 = z8;
            }
            bVarI.Y();
            qx80 qx80Var4 = qx80VarC;
            int i14 = i7 >> 15;
            bVar = bVarI;
            xya.a(dVar2, z2, str, str4, alb0Var3, sya.a(j11, j12, j5, j6, bVarI, (i14 & 7168) | 24576 | (i14 & 896), 0), qx80Var4, null, null, function1, bVar, ((i7 << 6) & 896) | ((i7 >> 6) & WebSocketProtocol.PAYLOAD_SHORT) | 3072 | ((i7 << 24) & 1879048192), 384);
            alb0Var2 = alb0Var3;
            j7 = j11;
            qx80Var2 = qx80Var4;
            str3 = str4;
            j8 = j6;
            j9 = j5;
            z4 = z2;
            j10 = j12;
        } else {
            bVar = bVarI;
            bVar.G();
            alb0Var2 = alb0Var;
            j7 = j;
            qx80Var2 = qx80Var;
            str3 = str2;
            z4 = z2;
            j8 = j6;
            j9 = j5;
            j10 = j2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ist
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jst.b(str, function0, dVar, z4, alb0Var2, j7, j10, j9, j8, qx80Var2, str3, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final Function0 function0, final d dVar, final uxs uxsVar, final alb0 alb0Var, long j, long j2, final long j3, long j4, long j5, long j6, final i060 i060Var, String str, a aVar, final int i) {
        int i2;
        b bVar;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        final long j11;
        final String str2;
        int i3;
        String str3;
        long j12;
        long j13;
        long jA;
        long j14;
        long j15;
        function0.getClass();
        b bVarI = aVar.i(1907163084);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.d(uxsVar == null ? -1 : uxsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(alb0Var) : bVarI.A(alb0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.e(j3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= 268435456;
        }
        int i4 = (bVarI.M(i060Var) ? 4 : 2) | 432;
        if (bVarI.q(i2 & 1, ((306783379 & i2) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                qyd0 qyd0Var = cst.f;
                long j16 = ((v0u) bVarI.O(qyd0Var)).a;
                long j17 = ((lib0) bVarI.O(oib0.a)).a;
                long jA2 = c68.a(R.color.text_disable_type1_primary, bVarI);
                long j18 = ((v0u) bVarI.O(qyd0Var)).a;
                i3 = i2 & (-2143805441);
                str3 = "loyalty_contained_button";
                j12 = j18;
                j13 = jA2;
                jA = c68.a(R.color.text_inverse_primary, bVarI);
                j14 = j17;
                j15 = j16;
            } else {
                bVarI.G();
                i3 = i2 & (-2143805441);
                j15 = j;
                j14 = j2;
                j13 = j4;
                j12 = j5;
                jA = j6;
                str3 = str;
            }
            bVarI.Y();
            bVar = bVarI;
            long j19 = j12;
            long j20 = jA;
            String str4 = str3;
            aza.a(dVar, null, uxsVar, i060Var, alb0Var, sya.a(j15, j14, j3, j13, bVar, 24576 | ((i3 >> 12) & 896), 0), sya.c(j12, jA, bVarI, 384, 0), str4, function0, gv9.e, bVar, ((i3 << 24) & 234881024) | ((i3 >> 3) & 14) | (i3 & 896) | ((i4 << 9) & 7168) | (57344 & (i3 << 3)) | 12582912 | 805306368, 2);
            j7 = j15;
            j10 = j19;
            j9 = j13;
            str2 = str4;
            j8 = j14;
            j11 = j20;
        } else {
            bVar = bVarI;
            bVar.G();
            j7 = j;
            j8 = j2;
            j9 = j4;
            j10 = j5;
            j11 = j6;
            str2 = str;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hst
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jst.c(function0, dVar, uxsVar, alb0Var, j7, j8, j3, j9, j10, j11, i060Var, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
