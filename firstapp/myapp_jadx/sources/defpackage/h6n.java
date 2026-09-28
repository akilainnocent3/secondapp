package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h6n {
    public static final d a = j.r(d.a.b, m1a0.c);

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void a(final rbn rbnVar, final String str, d dVar, long j, a aVar, final int i, final int i2) {
        d dVar2;
        long j2;
        boolean z;
        final long j3;
        final d dVar3;
        e eVarZ;
        d dVar4;
        d dVar5;
        long j4;
        b bVarI = aVar.i(-126890956);
        int i3 = (bVarI.M(rbnVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    int i5 = bVarI.e(j2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if (i4 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dVar5 = dVar4;
                        j4 = ((j58) bVarI.O(iza.a)).a;
                    } else {
                        dVar5 = dVar4;
                    }
                    bVarI.Y();
                    b(ci50.c(rbnVar, bVarI), str, dVar5, j4, bVarI, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                    dVar3 = dVar5;
                    j3 = j4;
                } else {
                    bVarI.G();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    dVar5 = dVar2;
                }
                j4 = j2;
                bVarI.Y();
                b(ci50.c(rbnVar, bVarI), str, dVar5, j4, bVarI, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
                dVar3 = dVar5;
                j3 = j4;
            } else {
                bVarI.G();
                j3 = j2;
                dVar3 = dVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: e6n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h6n.a(rbnVar, str, dVar3, j3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j2 = j;
                if (bVarI.e(j2)) {
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i4 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dVar5 = dVar4;
                    j4 = ((j58) bVarI.O(iza.a)).a;
                } else {
                    dVar5 = dVar4;
                    j4 = j2;
                }
            } else {
                if (i4 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    dVar5 = dVar4;
                    j4 = ((j58) bVarI.O(iza.a)).a;
                } else {
                    dVar5 = dVar4;
                    j4 = j2;
                }
            }
            bVarI.Y();
            b(ci50.c(rbnVar, bVarI), str, dVar5, j4, bVarI, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168), 0);
            dVar3 = dVar5;
            j3 = j4;
        } else {
            bVarI.G();
            j3 = j2;
            dVar3 = dVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e6n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h6n.a(rbnVar, str, dVar3, j3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    public static final void b(final crz crzVar, final String str, d dVar, long j, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        long j2;
        boolean z;
        final d dVar3;
        final long j3;
        e eVarZ;
        int i4;
        d dVar4;
        boolean z2;
        Object objY;
        d dVarB;
        long jI;
        boolean z3;
        Object objY2;
        int i5;
        b bVarI = aVar.i(-2142239481);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(crzVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !bVarI.e(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                bVarI.A0();
                i4 = i & 1;
                dVar4 = d.a.b;
                if (i4 != 0 || bVarI.h0()) {
                    if (i6 != 0) {
                        dVar2 = dVar4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((j58) bVarI.O(iza.a)).a;
                        i3 &= -7169;
                    }
                } else {
                    bVarI.G();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                bVarI.Y();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && bVarI.e(j2)) || (i3 & 3072) == 2048;
                objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z2 || objY == c0042a) {
                    if (nbh0.a(j2, j58.m)) {
                        objY = null;
                    } else {
                        objY = new gf4(j2, 5);
                    }
                    bVarI.r(objY);
                }
                l58 l58Var = (l58) objY;
                if (str != null) {
                    bVarI.N(-536990979);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objY2 = bVarI.y();
                    if (z3 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: f6n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                pb80 pb80Var = (pb80) obj;
                                lb80.c(pb80Var, str);
                                lb80.h(pb80Var, 5);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    dVarB = xa80.b(dVar4, false, (Function1) objY2);
                    bVarI.X(false);
                } else {
                    bVarI.N(-536832197);
                    bVarI.X(false);
                    dVarB = dVar4;
                }
                gnn.a aVar2 = gnn.a;
                d dVar5 = dVar2;
                if (yw90.a(crzVar.i(), 9205357640488583168L)) {
                    dVar4 = a;
                } else {
                    jI = crzVar.i();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jI & 4294967295L)))) {
                        dVar4 = a;
                    }
                }
                g75.a(androidx.compose.ui.draw.b.a(dVar5.n(dVar4), crzVar, null, d0b.a.b, 0.0f, l58Var, 22).n(dVarB), bVarI, 0);
                dVar3 = dVar5;
                j3 = j2;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                j3 = j2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: g6n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h6n.b(crzVar, str, dVar3, j3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            bVarI.A0();
            i4 = i & 1;
            dVar4 = d.a.b;
            if (i4 != 0) {
                if (i6 != 0) {
                    dVar2 = dVar4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((j58) bVarI.O(iza.a)).a;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    dVar2 = dVar4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((j58) bVarI.O(iza.a)).a;
                    i3 &= -7169;
                }
            }
            bVarI.Y();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z2) {
                if (nbh0.a(j2, j58.m)) {
                    objY = null;
                } else {
                    objY = new gf4(j2, 5);
                }
                bVarI.r(objY);
            } else {
                if (nbh0.a(j2, j58.m)) {
                    objY = null;
                } else {
                    objY = new gf4(j2, 5);
                }
                bVarI.r(objY);
            }
            l58 l58Var2 = (l58) objY;
            if (str != null) {
                bVarI.N(-536990979);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objY2 = bVarI.y();
                if (z3) {
                    objY2 = new Function1() { // from class: f6n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            pb80 pb80Var = (pb80) obj;
                            lb80.c(pb80Var, str);
                            lb80.h(pb80Var, 5);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function1() { // from class: f6n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            pb80 pb80Var = (pb80) obj;
                            lb80.c(pb80Var, str);
                            lb80.h(pb80Var, 5);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                dVarB = xa80.b(dVar4, false, (Function1) objY2);
                bVarI.X(false);
            } else {
                bVarI.N(-536832197);
                bVarI.X(false);
                dVarB = dVar4;
            }
            gnn.a aVar3 = gnn.a;
            d dVar6 = dVar2;
            if (yw90.a(crzVar.i(), 9205357640488583168L)) {
                jI = crzVar.i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jI >> 32)))) {
                    dVar4 = a;
                }
            } else {
                dVar4 = a;
            }
            g75.a(androidx.compose.ui.draw.b.a(dVar6.n(dVar4), crzVar, null, d0b.a.b, 0.0f, l58Var2, 22).n(dVarB), bVarI, 0);
            dVar3 = dVar6;
            j3 = j2;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            j3 = j2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: g6n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h6n.b(crzVar, str, dVar3, j3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
