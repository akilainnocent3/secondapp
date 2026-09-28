package androidx.compose.material3;

import androidx.compose.foundation.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.selection.c;
import androidx.compose.material3.b;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import defpackage.a5a0;
import defpackage.a6w;
import defpackage.aiv;
import defpackage.d35;
import defpackage.d68;
import defpackage.ene0;
import defpackage.g68;
import defpackage.g75;
import defpackage.hlh0;
import defpackage.ht;
import defpackage.j58;
import defpackage.mjm;
import defpackage.n30;
import defpackage.ne00;
import defpackage.psw;
import defpackage.qx80;
import defpackage.r58;
import defpackage.rzk;
import defpackage.soe0;
import defpackage.su50;
import defpackage.tsr;
import defpackage.ut50;
import defpackage.xy80;
import defpackage.yka;
import defpackage.z5w;
import defpackage.zxo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final a5a0<Float> f;

    static {
        float f2 = soe0.p;
        a = f2;
        b = soe0.z;
        c = soe0.w;
        float f3 = soe0.t;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new a5a0<>(0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01db  */
    /* JADX WARN: Code duplicated, block: B:107:0x0212  */
    /* JADX WARN: Code duplicated, block: B:110:0x021d  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a7  */
    public static final void a(final boolean z, final Function1 function1, d dVar, boolean z2, ene0 ene0Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        ene0 ene0Var2;
        int i7;
        boolean z4;
        final d dVar3;
        final boolean z5;
        final ene0 ene0Var3;
        e eVarZ;
        int i8;
        d dVarA;
        int i9;
        d dVar4;
        d68 d68Var;
        ene0 ene0Var4;
        long j;
        Object objY;
        psw pswVar;
        psw pswVar2;
        int i10;
        androidx.compose.runtime.b bVarI = aVar.i(-263339167);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bVarI.A(null)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (bVarI.b(z3)) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        ene0Var2 = ene0Var;
                        int i12 = bVarI.M(ene0Var2) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        ene0Var2 = ene0Var;
                    }
                    i3 |= i12;
                } else {
                    ene0Var2 = ene0Var;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (bVarI.M(null)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i3 & 1, z4)) {
                    bVarI.A0();
                    i8 = i & 1;
                    dVarA = d.a.b;
                    if (i8 != 0 || bVarI.h0()) {
                        if (i11 != 0) {
                            dVar2 = dVarA;
                        }
                        if (i5 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 32) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            ene0Var4 = d68Var.j0;
                            j = d68Var.p;
                            if (ene0Var4 == null) {
                                long jC = g68.c(d68Var, soe0.o);
                                long jC2 = g68.c(d68Var, soe0.r);
                                long j2 = j58.l;
                                long jC3 = g68.c(d68Var, soe0.q);
                                long jC4 = g68.c(d68Var, soe0.y);
                                long jC5 = g68.c(d68Var, soe0.B);
                                long jC6 = g68.c(d68Var, soe0.x);
                                long jC7 = g68.c(d68Var, soe0.A);
                                long jH = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                                long jC8 = g68.c(d68Var, soe0.e);
                                float f2 = soe0.f;
                                ene0Var4 = new ene0(jC, jC2, j2, jC3, jC4, jC5, jC6, jC7, jH, r58.h(j58.c(f2, jC8), j), j2, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f2, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f2, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                                d68Var.j0 = ene0Var4;
                            }
                            i3 &= -458753;
                            ene0Var2 = ene0Var4;
                        } else {
                            bVarI = bVarI;
                        }
                        i9 = i3;
                        dVar4 = dVar2;
                    } else {
                        bVarI.G();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        i9 = i3;
                        dVar4 = dVar2;
                        bVarI = bVarI;
                    }
                    bVarI.Y();
                    bVarI = bVarI;
                    bVarI.N(1768604058);
                    objY = bVarI.y();
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = rzk.a(bVarI);
                    }
                    pswVar = (psw) objY;
                    bVarI.X(false);
                    if (function1 != null) {
                        mjm mjmVar = zxo.a;
                        i10 = 2;
                        pswVar2 = pswVar;
                        dVarA = c.a(MinimumInteractiveModifier.b, z, pswVar2, z3, new su50(2), function1);
                    } else {
                        pswVar2 = pswVar;
                        i10 = 2;
                    }
                    int i13 = i9 << 3;
                    int i14 = i9 >> 6;
                    b(j.o(j.C(dVar4.n(dVarA), ht.a.e, i10), c, d), z, z3, ene0Var2, pswVar2, xy80.b(soe0.m, bVarI), bVarI, (i13 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 57344));
                    dVar3 = dVar4;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                }
                z5 = z3;
                ene0Var3 = ene0Var2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lne0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b.a(z, function1, dVar3, z5, ene0Var3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            z3 = z2;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    ene0Var2 = ene0Var;
                    if (bVarI.M(ene0Var2)) {
                    }
                    i3 |= i12;
                } else {
                    ene0Var2 = ene0Var;
                }
                i3 |= i12;
            } else {
                ene0Var2 = ene0Var;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bVarI.M(null)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i3 & 1, z4)) {
                bVarI.A0();
                i8 = i & 1;
                dVarA = d.a.b;
                if (i8 != 0) {
                    if (i11 != 0) {
                        dVar2 = dVarA;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 32) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        ene0Var4 = d68Var.j0;
                        j = d68Var.p;
                        if (ene0Var4 == null) {
                            long jC9 = g68.c(d68Var, soe0.o);
                            long jC10 = g68.c(d68Var, soe0.r);
                            long j3 = j58.l;
                            long jC11 = g68.c(d68Var, soe0.q);
                            long jC12 = g68.c(d68Var, soe0.y);
                            long jC13 = g68.c(d68Var, soe0.B);
                            long jC14 = g68.c(d68Var, soe0.x);
                            long jC15 = g68.c(d68Var, soe0.A);
                            long jH2 = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                            long jC16 = g68.c(d68Var, soe0.e);
                            float f3 = soe0.f;
                            ene0Var4 = new ene0(jC9, jC10, j3, jC11, jC12, jC13, jC14, jC15, jH2, r58.h(j58.c(f3, jC16), j), j3, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f3, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f3, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                            d68Var.j0 = ene0Var4;
                        }
                        i3 &= -458753;
                        ene0Var2 = ene0Var4;
                    } else {
                        bVarI = bVarI;
                    }
                    i9 = i3;
                    dVar4 = dVar2;
                } else {
                    if (i11 != 0) {
                        dVar2 = dVarA;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 32) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        ene0Var4 = d68Var.j0;
                        j = d68Var.p;
                        if (ene0Var4 == null) {
                            long jC17 = g68.c(d68Var, soe0.o);
                            long jC18 = g68.c(d68Var, soe0.r);
                            long j4 = j58.l;
                            long jC19 = g68.c(d68Var, soe0.q);
                            long jC110 = g68.c(d68Var, soe0.y);
                            long jC111 = g68.c(d68Var, soe0.B);
                            long jC112 = g68.c(d68Var, soe0.x);
                            long jC113 = g68.c(d68Var, soe0.A);
                            long jH3 = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                            long jC114 = g68.c(d68Var, soe0.e);
                            float f4 = soe0.f;
                            ene0Var4 = new ene0(jC17, jC18, j4, jC19, jC110, jC111, jC112, jC113, jH3, r58.h(j58.c(f4, jC114), j), j4, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f4, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f4, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                            d68Var.j0 = ene0Var4;
                        }
                        i3 &= -458753;
                        ene0Var2 = ene0Var4;
                    } else {
                        bVarI = bVarI;
                    }
                    i9 = i3;
                    dVar4 = dVar2;
                }
                bVarI.Y();
                bVarI = bVarI;
                bVarI.N(1768604058);
                objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = rzk.a(bVarI);
                }
                pswVar = (psw) objY;
                bVarI.X(false);
                if (function1 != null) {
                    mjm mjmVar2 = zxo.a;
                    i10 = 2;
                    pswVar2 = pswVar;
                    dVarA = c.a(MinimumInteractiveModifier.b, z, pswVar2, z3, new su50(2), function1);
                } else {
                    pswVar2 = pswVar;
                    i10 = 2;
                }
                int i15 = i9 << 3;
                int i16 = i9 >> 6;
                b(j.o(j.C(dVar4.n(dVarA), ht.a.e, i10), c, d), z, z3, ene0Var2, pswVar2, xy80.b(soe0.m, bVarI), bVarI, (i15 & 112) | (i16 & 896) | (i16 & 7168) | (i15 & 57344));
                dVar3 = dVar4;
            } else {
                bVarI.G();
                dVar3 = dVar2;
            }
            z5 = z3;
            ene0Var3 = ene0Var2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lne0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b.a(z, function1, dVar3, z5, ene0Var3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bVarI.A(null)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (bVarI.b(z3)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    ene0Var2 = ene0Var;
                    if (bVarI.M(ene0Var2)) {
                    }
                    i3 |= i12;
                } else {
                    ene0Var2 = ene0Var;
                }
                i3 |= i12;
            } else {
                ene0Var2 = ene0Var;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (bVarI.M(null)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i3 & 1, z4)) {
                bVarI.A0();
                i8 = i & 1;
                dVarA = d.a.b;
                if (i8 != 0) {
                    if (i11 != 0) {
                        dVar2 = dVarA;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 32) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        ene0Var4 = d68Var.j0;
                        j = d68Var.p;
                        if (ene0Var4 == null) {
                            long jC115 = g68.c(d68Var, soe0.o);
                            long jC116 = g68.c(d68Var, soe0.r);
                            long j5 = j58.l;
                            long jC117 = g68.c(d68Var, soe0.q);
                            long jC118 = g68.c(d68Var, soe0.y);
                            long jC119 = g68.c(d68Var, soe0.B);
                            long jC1110 = g68.c(d68Var, soe0.x);
                            long jC1111 = g68.c(d68Var, soe0.A);
                            long jH4 = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                            long jC1112 = g68.c(d68Var, soe0.e);
                            float f5 = soe0.f;
                            ene0Var4 = new ene0(jC115, jC116, j5, jC117, jC118, jC119, jC1110, jC1111, jH4, r58.h(j58.c(f5, jC1112), j), j5, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f5, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f5, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                            d68Var.j0 = ene0Var4;
                        }
                        i3 &= -458753;
                        ene0Var2 = ene0Var4;
                    } else {
                        bVarI = bVarI;
                    }
                    i9 = i3;
                    dVar4 = dVar2;
                } else {
                    if (i11 != 0) {
                        dVar2 = dVarA;
                    }
                    if (i5 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 32) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        ene0Var4 = d68Var.j0;
                        j = d68Var.p;
                        if (ene0Var4 == null) {
                            long jC1113 = g68.c(d68Var, soe0.o);
                            long jC1114 = g68.c(d68Var, soe0.r);
                            long j6 = j58.l;
                            long jC1115 = g68.c(d68Var, soe0.q);
                            long jC1116 = g68.c(d68Var, soe0.y);
                            long jC1117 = g68.c(d68Var, soe0.B);
                            long jC1118 = g68.c(d68Var, soe0.x);
                            long jC1119 = g68.c(d68Var, soe0.A);
                            long jH5 = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                            long jC11110 = g68.c(d68Var, soe0.e);
                            float f6 = soe0.f;
                            ene0Var4 = new ene0(jC1113, jC1114, j6, jC1115, jC1116, jC1117, jC1118, jC1119, jH5, r58.h(j58.c(f6, jC11110), j), j6, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f6, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f6, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                            d68Var.j0 = ene0Var4;
                        }
                        i3 &= -458753;
                        ene0Var2 = ene0Var4;
                    } else {
                        bVarI = bVarI;
                    }
                    i9 = i3;
                    dVar4 = dVar2;
                }
                bVarI.Y();
                bVarI = bVarI;
                bVarI.N(1768604058);
                objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = rzk.a(bVarI);
                }
                pswVar = (psw) objY;
                bVarI.X(false);
                if (function1 != null) {
                    mjm mjmVar3 = zxo.a;
                    i10 = 2;
                    pswVar2 = pswVar;
                    dVarA = c.a(MinimumInteractiveModifier.b, z, pswVar2, z3, new su50(2), function1);
                } else {
                    pswVar2 = pswVar;
                    i10 = 2;
                }
                int i17 = i9 << 3;
                int i18 = i9 >> 6;
                b(j.o(j.C(dVar4.n(dVarA), ht.a.e, i10), c, d), z, z3, ene0Var2, pswVar2, xy80.b(soe0.m, bVarI), bVarI, (i17 & 112) | (i18 & 896) | (i18 & 7168) | (i17 & 57344));
                dVar3 = dVar4;
            } else {
                bVarI.G();
                dVar3 = dVar2;
            }
            z5 = z3;
            ene0Var3 = ene0Var2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lne0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b.a(z, function1, dVar3, z5, ene0Var3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        z3 = z2;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                ene0Var2 = ene0Var;
                if (bVarI.M(ene0Var2)) {
                }
                i3 |= i12;
            } else {
                ene0Var2 = ene0Var;
            }
            i3 |= i12;
        } else {
            ene0Var2 = ene0Var;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (bVarI.M(null)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((599187 & i3) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i3 & 1, z4)) {
            bVarI.A0();
            i8 = i & 1;
            dVarA = d.a.b;
            if (i8 != 0) {
                if (i11 != 0) {
                    dVar2 = dVarA;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i2 & 32) != 0) {
                    d68Var = (d68) bVarI.O(g68.a);
                    ene0Var4 = d68Var.j0;
                    j = d68Var.p;
                    if (ene0Var4 == null) {
                        long jC11111 = g68.c(d68Var, soe0.o);
                        long jC11112 = g68.c(d68Var, soe0.r);
                        long j7 = j58.l;
                        long jC11113 = g68.c(d68Var, soe0.q);
                        long jC11114 = g68.c(d68Var, soe0.y);
                        long jC11115 = g68.c(d68Var, soe0.B);
                        long jC11116 = g68.c(d68Var, soe0.x);
                        long jC11117 = g68.c(d68Var, soe0.A);
                        long jH6 = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                        long jC11118 = g68.c(d68Var, soe0.e);
                        float f7 = soe0.f;
                        ene0Var4 = new ene0(jC11111, jC11112, j7, jC11113, jC11114, jC11115, jC11116, jC11117, jH6, r58.h(j58.c(f7, jC11118), j), j7, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f7, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f7, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                        d68Var.j0 = ene0Var4;
                    }
                    i3 &= -458753;
                    ene0Var2 = ene0Var4;
                } else {
                    bVarI = bVarI;
                }
                i9 = i3;
                dVar4 = dVar2;
            } else {
                if (i11 != 0) {
                    dVar2 = dVarA;
                }
                if (i5 != 0) {
                    z3 = true;
                }
                if ((i2 & 32) != 0) {
                    d68Var = (d68) bVarI.O(g68.a);
                    ene0Var4 = d68Var.j0;
                    j = d68Var.p;
                    if (ene0Var4 == null) {
                        long jC11119 = g68.c(d68Var, soe0.o);
                        long jC111110 = g68.c(d68Var, soe0.r);
                        long j8 = j58.l;
                        long jC111111 = g68.c(d68Var, soe0.q);
                        long jC111112 = g68.c(d68Var, soe0.y);
                        long jC111113 = g68.c(d68Var, soe0.B);
                        long jC111114 = g68.c(d68Var, soe0.x);
                        long jC111115 = g68.c(d68Var, soe0.A);
                        long jH7 = r58.h(j58.c(soe0.b, g68.c(d68Var, soe0.a)), j);
                        long jC111116 = g68.c(d68Var, soe0.e);
                        float f8 = soe0.f;
                        ene0Var4 = new ene0(jC11119, jC111110, j8, jC111111, jC111112, jC111113, jC111114, jC111115, jH7, r58.h(j58.c(f8, jC111116), j), j8, r58.h(j58.c(soe0.d, g68.c(d68Var, soe0.c)), j), r58.h(j58.c(soe0.h, g68.c(d68Var, soe0.g)), j), r58.h(j58.c(f8, g68.c(d68Var, soe0.k)), j), r58.h(j58.c(f8, g68.c(d68Var, soe0.l)), j), r58.h(j58.c(soe0.j, g68.c(d68Var, soe0.i)), j));
                        d68Var.j0 = ene0Var4;
                    }
                    i3 &= -458753;
                    ene0Var2 = ene0Var4;
                } else {
                    bVarI = bVarI;
                }
                i9 = i3;
                dVar4 = dVar2;
            }
            bVarI.Y();
            bVarI = bVarI;
            bVarI.N(1768604058);
            objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            pswVar = (psw) objY;
            bVarI.X(false);
            if (function1 != null) {
                mjm mjmVar4 = zxo.a;
                i10 = 2;
                pswVar2 = pswVar;
                dVarA = c.a(MinimumInteractiveModifier.b, z, pswVar2, z3, new su50(2), function1);
            } else {
                pswVar2 = pswVar;
                i10 = 2;
            }
            int i19 = i9 << 3;
            int i110 = i9 >> 6;
            b(j.o(j.C(dVar4.n(dVarA), ht.a.e, i10), c, d), z, z3, ene0Var2, pswVar2, xy80.b(soe0.m, bVarI), bVarI, (i19 & 112) | (i110 & 896) | (i110 & 7168) | (i19 & 57344));
            dVar3 = dVar4;
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        z5 = z3;
        ene0Var3 = ene0Var2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lne0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.a(z, function1, dVar3, z5, ene0Var3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final boolean z, final boolean z2, final ene0 ene0Var, final psw pswVar, final qx80 qx80Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        androidx.compose.runtime.b bVarI = aVar.i(-670917213);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(ene0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(pswVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(qx80Var) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? ene0Var.b : ene0Var.f;
            } else {
                j = z ? ene0Var.j : ene0Var.n;
            }
            if (z2) {
                j2 = z ? ene0Var.a : ene0Var.e;
            } else {
                j2 = z ? ene0Var.i : ene0Var.m;
            }
            qx80 qx80VarB = xy80.b(soe0.v, bVarI);
            float f2 = soe0.u;
            if (z2) {
                j3 = j2;
                j4 = z ? ene0Var.c : ene0Var.g;
            } else {
                j3 = j2;
                j4 = z ? ene0Var.k : ene0Var.o;
            }
            d dVarB = androidx.compose.foundation.a.b(d35.a(dVar, f2, j4, qx80VarB), j, qx80VarB);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarB2 = androidx.compose.foundation.a.b(g.a(androidx.compose.foundation.layout.d.a.b(d.a.b, ht.a.d).n(new ThumbElement(pswVar, z, a6w.b(z5w.b, bVarI))), pswVar, ut50.b(soe0.s / 2.0f, 4, 0L, false)), j3, qx80Var);
            aiv aivVarC2 = g75.c(ht.a.e, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(1236071411);
            bVarI.X(false);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mne0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.b(dVar, z, z2, ene0Var, pswVar, qx80Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
