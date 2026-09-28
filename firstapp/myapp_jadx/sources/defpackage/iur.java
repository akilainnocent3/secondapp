package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iur {
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x016a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x0209  */
    /* JADX WARN: Code duplicated, block: B:147:0x021a  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    public static final void a(final p7l.a aVar, final d dVar, zvr zvrVar, tmz tmzVar, kw0.l lVar, final kw0.e eVar, svh svhVar, boolean z, sfz sfzVar, final Function1 function1, a aVar2, final int i, final int i2, final int i3) {
        int i4;
        zvr zvrVarA;
        tmz tmzVar2;
        int i5;
        kw0.l lVar2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        final svh svhVar2;
        final sfz sfzVar2;
        final zvr zvrVar2;
        final tmz tmzVar3;
        final boolean z4;
        final kw0.l lVar3;
        e eVarZ;
        int i10;
        boolean z5;
        tmz umzVar;
        kw0.l lVar4;
        h4d h4dVarA;
        boolean zM;
        Object objY;
        svh svhVar3;
        sfz sfzVarA;
        int i11;
        tmz tmzVar4;
        kw0.l lVar5;
        boolean z6;
        Object objY2;
        int i12;
        int i13;
        b bVarI = aVar2.i(-2072102870);
        if ((i & 6) == 0) {
            i4 = (bVarI.M(aVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                zvrVarA = zvrVar;
                int i14 = bVarI.M(zvrVarA) ? 256 : 128;
                i4 |= i14;
            } else {
                zvrVarA = zvrVar;
            }
            i4 |= i14;
        } else {
            zvrVarA = zvrVar;
        }
        int i15 = i3 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                tmzVar2 = tmzVar;
                i4 |= bVarI.M(tmzVar2) ? 2048 : 1024;
            }
            i5 = i4 | 24576;
            if ((i & 196608) == 0) {
                if ((i3 & 32) == 0) {
                    lVar2 = lVar;
                    int i16 = bVarI.M(lVar2) ? 131072 : 65536;
                    i5 |= i16;
                } else {
                    lVar2 = lVar;
                }
                i5 |= i16;
            } else {
                lVar2 = lVar;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.M(eVar)) {
                    i13 = 1048576;
                } else {
                    i13 = 524288;
                }
                i5 |= i13;
            }
            if ((12582912 & i) == 0) {
                i5 |= 4194304;
            }
            i6 = i3 & 256;
            if (i6 != 0) {
                i5 |= 100663296;
                i7 = 196608;
                z2 = z;
            } else {
                i7 = 196608;
                z2 = z;
                if ((i & 100663296) == 0) {
                    if (bVarI.b(z2)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i5 |= i8;
                }
            }
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                if (bVarI.A(function1)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i9 = i2 | i12;
            } else {
                i9 = i2;
            }
            if ((i5 & 306783379) == 306783378 || (i9 & 3) != 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i5 & 1, z3)) {
                bVarI.A0();
                i10 = i & 1;
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (i10 != 0 || bVarI.h0()) {
                    if ((i3 & 4) != 0) {
                        z5 = false;
                        zvrVarA = dwr.a(0, 3, bVarI);
                        i5 &= -897;
                    } else {
                        z5 = false;
                    }
                    if (i15 != 0) {
                        umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        umzVar = tmzVar2;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                        lVar4 = kw0.c;
                    } else {
                        lVar4 = lVar2;
                    }
                    h4dVarA = zdb0.a(bVarI);
                    zM = bVarI.M(h4dVarA);
                    objY = bVarI.y();
                    if (zM || objY == c0042a) {
                        objY = new pcd(h4dVarA);
                        bVarI.r(objY);
                    }
                    svhVar3 = (pcd) objY;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    sfzVarA = ufz.a(bVarI);
                    i11 = i5 & (-1908408321);
                    tmzVar4 = umzVar;
                    lVar5 = lVar4;
                } else {
                    bVarI.G();
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 32) != 0) {
                        i5 &= -458753;
                    }
                    i11 = i5 & (-1908408321);
                    tmzVar4 = tmzVar2;
                    lVar5 = lVar2;
                    z5 = false;
                    svhVar3 = svhVar;
                    sfzVarA = sfzVar;
                }
                boolean z7 = z2;
                bVarI.Y();
                int i17 = (i11 & 14) | ((i11 >> 15) & 112);
                z6 = (((((i17 & 14) ^ 6) > 4 || !bVarI.M(aVar)) && (i17 & 6) != 4) ? z5 : true) | ((((i17 & 112) ^ 48) <= 32 && bVarI.M(eVar)) || (i17 & 48) == 32);
                objY2 = bVarI.y();
                if (z6 || objY2 == c0042a) {
                    objY2 = new v7l(new hur(aVar, eVar));
                    bVarI.r(objY2);
                }
                int i18 = i11 >> 3;
                int i19 = (i18 & 29360128) | (i18 & 14) | i7 | (i18 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192);
                int i20 = ((i11 >> 18) & 14) | ((i9 << 3) & 112);
                sfz sfzVar3 = sfzVarA;
                zvrVar2 = zvrVarA;
                svh svhVar4 = svhVar3;
                bvr.a(dVar, zvrVar2, (ovr) objY2, tmzVar4, svhVar4, z7, sfzVar3, lVar5, eVar, function1, bVarI, i19, i20);
                tmzVar3 = tmzVar4;
                lVar3 = lVar5;
                sfzVar2 = sfzVar3;
                z4 = z7;
                svhVar2 = svhVar4;
            } else {
                bVarI.G();
                svhVar2 = svhVar;
                sfzVar2 = sfzVar;
                zvrVar2 = zvrVarA;
                tmzVar3 = tmzVar2;
                z4 = z2;
                lVar3 = lVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: gur
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        iur.a(aVar, dVar, zvrVar2, tmzVar3, lVar3, eVar, svhVar2, z4, sfzVar2, function1, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 3072;
        tmzVar2 = tmzVar;
        i5 = i4 | 24576;
        if ((i & 196608) == 0) {
            if ((i3 & 32) == 0) {
                lVar2 = lVar;
                if (bVarI.M(lVar2)) {
                }
                i5 |= i16;
            } else {
                lVar2 = lVar;
            }
            i5 |= i16;
        } else {
            lVar2 = lVar;
        }
        if ((1572864 & i) == 0) {
            if (bVarI.M(eVar)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i5 |= i13;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        i6 = i3 & 256;
        if (i6 != 0) {
            i5 |= 100663296;
            i7 = 196608;
            z2 = z;
        } else {
            i7 = 196608;
            z2 = z;
            if ((i & 100663296) == 0) {
                if (bVarI.b(z2)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i5 |= i8;
            }
        }
        if ((i & 805306368) == 0) {
            i5 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            if (bVarI.A(function1)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i2 | i12;
        } else {
            i9 = i2;
        }
        if ((i5 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (bVarI.q(i5 & 1, z3)) {
            bVarI.A0();
            i10 = i & 1;
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (i10 != 0) {
                if ((i3 & 4) != 0) {
                    z5 = false;
                    zvrVarA = dwr.a(0, 3, bVarI);
                    i5 &= -897;
                } else {
                    z5 = false;
                }
                if (i15 != 0) {
                    umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    umzVar = tmzVar2;
                }
                if ((i3 & 32) != 0) {
                    i5 &= -458753;
                    lVar4 = kw0.c;
                } else {
                    lVar4 = lVar2;
                }
                h4dVarA = zdb0.a(bVarI);
                zM = bVarI.M(h4dVarA);
                objY = bVarI.y();
                if (zM) {
                    objY = new pcd(h4dVarA);
                    bVarI.r(objY);
                } else {
                    objY = new pcd(h4dVarA);
                    bVarI.r(objY);
                }
                svhVar3 = (pcd) objY;
                if (i6 != 0) {
                    z2 = true;
                }
                sfzVarA = ufz.a(bVarI);
                i11 = i5 & (-1908408321);
                tmzVar4 = umzVar;
                lVar5 = lVar4;
            } else {
                if ((i3 & 4) != 0) {
                    z5 = false;
                    zvrVarA = dwr.a(0, 3, bVarI);
                    i5 &= -897;
                } else {
                    z5 = false;
                }
                if (i15 != 0) {
                    umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    umzVar = tmzVar2;
                }
                if ((i3 & 32) != 0) {
                    i5 &= -458753;
                    lVar4 = kw0.c;
                } else {
                    lVar4 = lVar2;
                }
                h4dVarA = zdb0.a(bVarI);
                zM = bVarI.M(h4dVarA);
                objY = bVarI.y();
                if (zM) {
                    objY = new pcd(h4dVarA);
                    bVarI.r(objY);
                } else {
                    objY = new pcd(h4dVarA);
                    bVarI.r(objY);
                }
                svhVar3 = (pcd) objY;
                if (i6 != 0) {
                    z2 = true;
                }
                sfzVarA = ufz.a(bVarI);
                i11 = i5 & (-1908408321);
                tmzVar4 = umzVar;
                lVar5 = lVar4;
            }
            boolean z8 = z2;
            bVarI.Y();
            int i110 = (i11 & 14) | ((i11 >> 15) & 112);
            z6 = (((((i110 & 14) ^ 6) > 4 || !bVarI.M(aVar)) && (i110 & 6) != 4) ? z5 : true) | ((((i110 & 112) ^ 48) <= 32 && bVarI.M(eVar)) || (i110 & 48) == 32);
            objY2 = bVarI.y();
            if (z6) {
                objY2 = new v7l(new hur(aVar, eVar));
                bVarI.r(objY2);
            } else {
                objY2 = new v7l(new hur(aVar, eVar));
                bVarI.r(objY2);
            }
            int i111 = i11 >> 3;
            int i112 = (i111 & 29360128) | (i111 & 14) | i7 | (i111 & 112) | (i11 & 7168) | (57344 & i11) | ((i11 << 12) & 1879048192);
            int i21 = ((i11 >> 18) & 14) | ((i9 << 3) & 112);
            sfz sfzVar4 = sfzVarA;
            zvrVar2 = zvrVarA;
            svh svhVar5 = svhVar3;
            bvr.a(dVar, zvrVar2, (ovr) objY2, tmzVar4, svhVar5, z8, sfzVar4, lVar5, eVar, function1, bVarI, i112, i21);
            tmzVar3 = tmzVar4;
            lVar3 = lVar5;
            sfzVar2 = sfzVar4;
            z4 = z8;
            svhVar2 = svhVar5;
        } else {
            bVarI.G();
            svhVar2 = svhVar;
            sfzVar2 = sfzVar;
            zvrVar2 = zvrVarA;
            tmzVar3 = tmzVar2;
            z4 = z2;
            lVar3 = lVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gur
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    iur.a(aVar, dVar, zvrVar2, tmzVar3, lVar3, eVar, svhVar2, z4, sfzVar2, function1, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}
