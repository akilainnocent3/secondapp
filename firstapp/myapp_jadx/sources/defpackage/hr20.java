package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class hr20 {
    /* JADX WARN: Code duplicated, block: B:101:0x0186  */
    /* JADX WARN: Code duplicated, block: B:104:0x0194  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    public static final void a(d dVar, tmz tmzVar, final String str, boolean z, boolean z2, boolean z3, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        tmz tmzVar2;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        boolean z7;
        final d dVar3;
        final tmz tmzVar3;
        final boolean z8;
        final boolean z9;
        final boolean z10;
        e eVarZ;
        d dVar4;
        tmz tmzVar4;
        int i9;
        boolean z11;
        final boolean z12;
        int i10;
        int i11;
        str.getClass();
        b bVarI = aVar.i(1778516186);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                tmzVar2 = tmzVar;
                int i13 = bVarI.M(tmzVar2) ? 32 : 16;
                i3 |= i13;
            } else {
                tmzVar2 = tmzVar;
            }
            i3 |= i13;
        } else {
            tmzVar2 = tmzVar;
        }
        int i14 = i3 | (bVarI.M(str) ? 256 : 128);
        int i15 = i2 & 8;
        if (i15 != 0) {
            i4 = i14 | 3072;
            z4 = z;
        } else {
            z4 = z;
            i4 = i14 | (bVarI.b(z4) ? 2048 : 1024);
        }
        int i16 = i2 & 16;
        if (i16 == 0) {
            if ((i & 24576) == 0) {
                z5 = z2;
                i4 |= bVarI.b(z5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    z6 = z3;
                    if (bVarI.b(z6)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if (bVarI.A(function0)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i8 = i4 | i7;
                if ((599187 & i8) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (bVarI.q(i8 & 1, z7)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i12 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if ((i2 & 2) != 0) {
                            tmzVar4 = ek5.a;
                            i8 &= -113;
                        } else {
                            tmzVar4 = tmzVar2;
                        }
                        if (i15 != 0) {
                            z4 = true;
                        }
                        if (i16 != 0) {
                            z5 = false;
                        }
                        if (i5 != 0) {
                            z6 = false;
                        }
                        tmzVar2 = tmzVar4;
                        i9 = i8;
                        z11 = z6;
                        dVar2 = dVar4;
                        z12 = z5;
                    } else {
                        bVarI.G();
                        if ((i2 & 2) != 0) {
                            i8 &= -113;
                        }
                        i9 = i8;
                        z12 = z5;
                        z11 = z6;
                    }
                    bVarI.Y();
                    i060 i060VarC = j060.c(2.0f);
                    umz umzVar = ek5.a;
                    if (z11) {
                        i10 = R.color.brand_secondary;
                    } else {
                        i10 = R.color.brand_quaternary;
                    }
                    long jA = c68.a(i10, bVarI);
                    long jA2 = c68.a(R.color.brand_tertiary, bVarI);
                    if (z11) {
                        i11 = R.color.background_disable_type1_primary;
                    } else {
                        i11 = R.color.brand_secondary_disable;
                    }
                    d dVar5 = dVar2;
                    tmz tmzVar5 = tmzVar2;
                    boolean z13 = z4;
                    nk5.a(function0, dVar5, z13, i060VarC, ek5.a(jA, jA2, c68.a(i11, bVarI), c68.a(R.color.text_disable_type1_primary, bVarI), bVarI, 0), null, null, tmzVar5, null, pp8.b(1281929962, new gaj() { // from class: fr20
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            imf0 imf0Var;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((e160) obj).getClass();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                if (z12) {
                                    aVar2.N(-720917163);
                                    imf0Var = ((eah0) aVar2.O(gah0.a)).n;
                                    aVar2.H();
                                } else {
                                    aVar2.N(-720915308);
                                    imf0Var = ((eah0) aVar2.O(gah0.a)).m;
                                    aVar2.H();
                                }
                                lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 130046);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, ((i9 >> 18) & 14) | 805306368 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | ((i9 << 18) & 29360128), 352);
                    z9 = z12;
                    z10 = z11;
                    dVar3 = dVar5;
                    z8 = z13;
                    tmzVar3 = tmzVar5;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    tmzVar3 = tmzVar2;
                    z8 = z4;
                    z9 = z5;
                    z10 = z6;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: gr20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            hr20.a(dVar3, tmzVar3, str, z8, z9, z10, function0, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 196608;
            z6 = z3;
            if (bVarI.A(function0)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i8 = i4 | i7;
            if ((599187 & i8) != 599186) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (bVarI.q(i8 & 1, z7)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i2 & 2) != 0) {
                        tmzVar4 = ek5.a;
                        i8 &= -113;
                    } else {
                        tmzVar4 = tmzVar2;
                    }
                    if (i15 != 0) {
                        z4 = true;
                    }
                    if (i16 != 0) {
                        z5 = false;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    }
                    tmzVar2 = tmzVar4;
                    i9 = i8;
                    z11 = z6;
                    dVar2 = dVar4;
                    z12 = z5;
                } else {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i2 & 2) != 0) {
                        tmzVar4 = ek5.a;
                        i8 &= -113;
                    } else {
                        tmzVar4 = tmzVar2;
                    }
                    if (i15 != 0) {
                        z4 = true;
                    }
                    if (i16 != 0) {
                        z5 = false;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    }
                    tmzVar2 = tmzVar4;
                    i9 = i8;
                    z11 = z6;
                    dVar2 = dVar4;
                    z12 = z5;
                }
                bVarI.Y();
                i060 i060VarC2 = j060.c(2.0f);
                umz umzVar2 = ek5.a;
                if (z11) {
                    i10 = R.color.brand_secondary;
                } else {
                    i10 = R.color.brand_quaternary;
                }
                long jA3 = c68.a(i10, bVarI);
                long jA4 = c68.a(R.color.brand_tertiary, bVarI);
                if (z11) {
                    i11 = R.color.background_disable_type1_primary;
                } else {
                    i11 = R.color.brand_secondary_disable;
                }
                d dVar6 = dVar2;
                tmz tmzVar6 = tmzVar2;
                boolean z14 = z4;
                nk5.a(function0, dVar6, z14, i060VarC2, ek5.a(jA3, jA4, c68.a(i11, bVarI), c68.a(R.color.text_disable_type1_primary, bVarI), bVarI, 0), null, null, tmzVar6, null, pp8.b(1281929962, new gaj() { // from class: fr20
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        imf0 imf0Var;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            if (z12) {
                                aVar2.N(-720917163);
                                imf0Var = ((eah0) aVar2.O(gah0.a)).n;
                                aVar2.H();
                            } else {
                                aVar2.N(-720915308);
                                imf0Var = ((eah0) aVar2.O(gah0.a)).m;
                                aVar2.H();
                            }
                            lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 130046);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i9 >> 18) & 14) | 805306368 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | ((i9 << 18) & 29360128), 352);
                z9 = z12;
                z10 = z11;
                dVar3 = dVar6;
                z8 = z14;
                tmzVar3 = tmzVar6;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                tmzVar3 = tmzVar2;
                z8 = z4;
                z9 = z5;
                z10 = z6;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gr20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hr20.a(dVar3, tmzVar3, str, z8, z9, z10, function0, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 24576;
        z5 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                z6 = z3;
                if (bVarI.b(z6)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if (bVarI.A(function0)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i8 = i4 | i7;
            if ((599187 & i8) != 599186) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (bVarI.q(i8 & 1, z7)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i2 & 2) != 0) {
                        tmzVar4 = ek5.a;
                        i8 &= -113;
                    } else {
                        tmzVar4 = tmzVar2;
                    }
                    if (i15 != 0) {
                        z4 = true;
                    }
                    if (i16 != 0) {
                        z5 = false;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    }
                    tmzVar2 = tmzVar4;
                    i9 = i8;
                    z11 = z6;
                    dVar2 = dVar4;
                    z12 = z5;
                } else {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i2 & 2) != 0) {
                        tmzVar4 = ek5.a;
                        i8 &= -113;
                    } else {
                        tmzVar4 = tmzVar2;
                    }
                    if (i15 != 0) {
                        z4 = true;
                    }
                    if (i16 != 0) {
                        z5 = false;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    }
                    tmzVar2 = tmzVar4;
                    i9 = i8;
                    z11 = z6;
                    dVar2 = dVar4;
                    z12 = z5;
                }
                bVarI.Y();
                i060 i060VarC3 = j060.c(2.0f);
                umz umzVar3 = ek5.a;
                if (z11) {
                    i10 = R.color.brand_secondary;
                } else {
                    i10 = R.color.brand_quaternary;
                }
                long jA5 = c68.a(i10, bVarI);
                long jA6 = c68.a(R.color.brand_tertiary, bVarI);
                if (z11) {
                    i11 = R.color.background_disable_type1_primary;
                } else {
                    i11 = R.color.brand_secondary_disable;
                }
                d dVar7 = dVar2;
                tmz tmzVar7 = tmzVar2;
                boolean z15 = z4;
                nk5.a(function0, dVar7, z15, i060VarC3, ek5.a(jA5, jA6, c68.a(i11, bVarI), c68.a(R.color.text_disable_type1_primary, bVarI), bVarI, 0), null, null, tmzVar7, null, pp8.b(1281929962, new gaj() { // from class: fr20
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        imf0 imf0Var;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            if (z12) {
                                aVar2.N(-720917163);
                                imf0Var = ((eah0) aVar2.O(gah0.a)).n;
                                aVar2.H();
                            } else {
                                aVar2.N(-720915308);
                                imf0Var = ((eah0) aVar2.O(gah0.a)).m;
                                aVar2.H();
                            }
                            lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 130046);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i9 >> 18) & 14) | 805306368 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | ((i9 << 18) & 29360128), 352);
                z9 = z12;
                z10 = z11;
                dVar3 = dVar7;
                z8 = z15;
                tmzVar3 = tmzVar7;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                tmzVar3 = tmzVar2;
                z8 = z4;
                z9 = z5;
                z10 = z6;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gr20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hr20.a(dVar3, tmzVar3, str, z8, z9, z10, function0, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 196608;
        z6 = z3;
        if (bVarI.A(function0)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        i8 = i4 | i7;
        if ((599187 & i8) != 599186) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (bVarI.q(i8 & 1, z7)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if ((i2 & 2) != 0) {
                    tmzVar4 = ek5.a;
                    i8 &= -113;
                } else {
                    tmzVar4 = tmzVar2;
                }
                if (i15 != 0) {
                    z4 = true;
                }
                if (i16 != 0) {
                    z5 = false;
                }
                if (i5 != 0) {
                    z6 = false;
                }
                tmzVar2 = tmzVar4;
                i9 = i8;
                z11 = z6;
                dVar2 = dVar4;
                z12 = z5;
            } else {
                if (i12 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if ((i2 & 2) != 0) {
                    tmzVar4 = ek5.a;
                    i8 &= -113;
                } else {
                    tmzVar4 = tmzVar2;
                }
                if (i15 != 0) {
                    z4 = true;
                }
                if (i16 != 0) {
                    z5 = false;
                }
                if (i5 != 0) {
                    z6 = false;
                }
                tmzVar2 = tmzVar4;
                i9 = i8;
                z11 = z6;
                dVar2 = dVar4;
                z12 = z5;
            }
            bVarI.Y();
            i060 i060VarC4 = j060.c(2.0f);
            umz umzVar4 = ek5.a;
            if (z11) {
                i10 = R.color.brand_secondary;
            } else {
                i10 = R.color.brand_quaternary;
            }
            long jA7 = c68.a(i10, bVarI);
            long jA8 = c68.a(R.color.brand_tertiary, bVarI);
            if (z11) {
                i11 = R.color.background_disable_type1_primary;
            } else {
                i11 = R.color.brand_secondary_disable;
            }
            d dVar8 = dVar2;
            tmz tmzVar8 = tmzVar2;
            boolean z16 = z4;
            nk5.a(function0, dVar8, z16, i060VarC4, ek5.a(jA7, jA8, c68.a(i11, bVarI), c68.a(R.color.text_disable_type1_primary, bVarI), bVarI, 0), null, null, tmzVar8, null, pp8.b(1281929962, new gaj() { // from class: fr20
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    imf0 imf0Var;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        if (z12) {
                            aVar2.N(-720917163);
                            imf0Var = ((eah0) aVar2.O(gah0.a)).n;
                            aVar2.H();
                        } else {
                            aVar2.N(-720915308);
                            imf0Var = ((eah0) aVar2.O(gah0.a)).m;
                            aVar2.H();
                        }
                        lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 130046);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i9 >> 18) & 14) | 805306368 | ((i9 << 3) & 112) | ((i9 >> 3) & 896) | ((i9 << 18) & 29360128), 352);
            z9 = z12;
            z10 = z11;
            dVar3 = dVar8;
            z8 = z16;
            tmzVar3 = tmzVar8;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            tmzVar3 = tmzVar2;
            z8 = z4;
            z9 = z5;
            z10 = z6;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gr20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hr20.a(dVar3, tmzVar3, str, z8, z9, z10, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
