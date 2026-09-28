package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class h9n {

    public static final class a implements aiv {
        public static final a a = new a();

        @Override // defpackage.aiv
        public final biv c(t tVar, List<? extends vhv> list, long j) {
            return t.z1(tVar, kxa.k(j), kxa.j(j), new g9n());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0112  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x0164  */
    /* JADX WARN: Code duplicated, block: B:110:0x0168  */
    /* JADX WARN: Code duplicated, block: B:113:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:0x018e  */
    /* JADX WARN: Code duplicated, block: B:118:0x019a  */
    /* JADX WARN: Code duplicated, block: B:121:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    public static final void a(final crz crzVar, final String str, d dVar, ht htVar, d0b d0bVar, float f, l58 l58Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        ht htVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        final d dVar3;
        final ht htVar3;
        final d0b d0bVar2;
        final l58 l58Var2;
        final float f3;
        e eVarZ;
        d dVarB;
        ht htVar4;
        int i14;
        d0b d0bVar3;
        l58 l58Var3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z2;
        Object objY2;
        b bVarI = aVar.i(1142754848);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(crzVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    htVar2 = htVar;
                    if (bVarI.M(htVar2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(d0bVar)) {
                            i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (bVarI.c(f2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            if ((1572864 & i) == 0) {
                                if (bVarI.M(l58Var)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                            i12 = i3;
                            i13 = 0;
                            if ((i3 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (bVarI.q(i12 & 1, z)) {
                                dVarB = d.a.b;
                                if (i15 != 0) {
                                    dVar2 = dVarB;
                                }
                                if (i4 != 0) {
                                    htVar4 = ht.a.e;
                                } else {
                                    htVar4 = htVar2;
                                }
                                if (i6 != 0) {
                                    d0bVar3 = d0b.a.b;
                                    i14 = i8;
                                } else {
                                    i14 = i8;
                                    d0bVar3 = d0bVar;
                                }
                                if (i14 != 0) {
                                    f2 = 1.0f;
                                }
                                if (i10 != 0) {
                                    l58Var3 = null;
                                } else {
                                    l58Var3 = l58Var;
                                }
                                c0042a = androidx.compose.runtime.a.C0041a.a;
                                if (str != null) {
                                    bVarI.N(1899234820);
                                    if ((i12 & 112) == 32) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    objY2 = bVarI.y();
                                    if (z2 || objY2 == c0042a) {
                                        objY2 = new e9n(str, i13);
                                        bVarI.r(objY2);
                                    }
                                    dVarB = xa80.b(dVarB, false, (Function1) objY2);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(1899393602);
                                    bVarI.X(false);
                                }
                                d dVarA = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = a.a;
                                    bVarI.r(objY);
                                }
                                aiv aivVar = (aiv) objY;
                                iHashCode = Long.hashCode(bVarI.T);
                                d dVarC = c.c(bVarI, dVarA);
                                ne00 ne00VarS = bVarI.S();
                                yka.k.getClass();
                                aVar2 = yka.a.b;
                                bVarI.D();
                                if (bVarI.S) {
                                    bVarI.F(aVar2);
                                } else {
                                    bVarI.p();
                                }
                                hlh0.a(bVarI, aivVar, yka.a.f);
                                hlh0.a(bVarI, ne00VarS, yka.a.e);
                                hlh0.a(bVarI, dVarC, yka.a.d);
                                c1350a = yka.a.g;
                                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                                }
                                bVarI.X(true);
                                dVar3 = dVar2;
                                htVar3 = htVar4;
                                d0bVar2 = d0bVar3;
                                l58Var2 = l58Var3;
                            } else {
                                bVarI.G();
                                dVar3 = dVar2;
                                htVar3 = htVar2;
                                d0bVar2 = d0bVar;
                                l58Var2 = l58Var;
                            }
                            f3 = f2;
                            eVarZ = bVarI.Z();
                            if (eVarZ != null) {
                                eVarZ.d = new Function2() { // from class: f9n
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                        return Unit.a;
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        i12 = i3;
                        i13 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i12 & 1, z)) {
                            dVarB = d.a.b;
                            if (i15 != 0) {
                                dVar2 = dVarB;
                            }
                            if (i4 != 0) {
                                htVar4 = ht.a.e;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i6 != 0) {
                                d0bVar3 = d0b.a.b;
                                i14 = i8;
                            } else {
                                i14 = i8;
                                d0bVar3 = d0bVar;
                            }
                            if (i14 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                l58Var3 = null;
                            } else {
                                l58Var3 = l58Var;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (str != null) {
                                bVarI.N(1899234820);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objY2 = bVarI.y();
                                if (z2) {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                } else {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                }
                                dVarB = xa80.b(dVarB, false, (Function1) objY2);
                                bVarI.X(false);
                            } else {
                                bVarI.N(1899393602);
                                bVarI.X(false);
                            }
                            d dVarA2 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = a.a;
                                bVarI.r(objY);
                            }
                            aiv aivVar2 = (aiv) objY;
                            iHashCode = Long.hashCode(bVarI.T);
                            d dVarC2 = c.c(bVarI, dVarA2);
                            ne00 ne00VarS2 = bVarI.S();
                            yka.k.getClass();
                            aVar2 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar2);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, aivVar2, yka.a.f);
                            hlh0.a(bVarI, ne00VarS2, yka.a.e);
                            hlh0.a(bVarI, dVarC2, yka.a.d);
                            c1350a = yka.a.g;
                            if (bVarI.S) {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            } else {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            }
                            bVarI.X(true);
                            dVar3 = dVar2;
                            htVar3 = htVar4;
                            d0bVar2 = d0bVar3;
                            l58Var2 = l58Var3;
                        } else {
                            bVarI.G();
                            dVar3 = dVar2;
                            htVar3 = htVar2;
                            d0bVar2 = d0bVar;
                            l58Var2 = l58Var;
                        }
                        f3 = f2;
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: f9n
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (bVarI.M(l58Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        i13 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i12 & 1, z)) {
                            dVarB = d.a.b;
                            if (i15 != 0) {
                                dVar2 = dVarB;
                            }
                            if (i4 != 0) {
                                htVar4 = ht.a.e;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i6 != 0) {
                                d0bVar3 = d0b.a.b;
                                i14 = i8;
                            } else {
                                i14 = i8;
                                d0bVar3 = d0bVar;
                            }
                            if (i14 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                l58Var3 = null;
                            } else {
                                l58Var3 = l58Var;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (str != null) {
                                bVarI.N(1899234820);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objY2 = bVarI.y();
                                if (z2) {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                } else {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                }
                                dVarB = xa80.b(dVarB, false, (Function1) objY2);
                                bVarI.X(false);
                            } else {
                                bVarI.N(1899393602);
                                bVarI.X(false);
                            }
                            d dVarA3 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = a.a;
                                bVarI.r(objY);
                            }
                            aiv aivVar3 = (aiv) objY;
                            iHashCode = Long.hashCode(bVarI.T);
                            d dVarC3 = c.c(bVarI, dVarA3);
                            ne00 ne00VarS3 = bVarI.S();
                            yka.k.getClass();
                            aVar2 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar2);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, aivVar3, yka.a.f);
                            hlh0.a(bVarI, ne00VarS3, yka.a.e);
                            hlh0.a(bVarI, dVarC3, yka.a.d);
                            c1350a = yka.a.g;
                            if (bVarI.S) {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            } else {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            }
                            bVarI.X(true);
                            dVar3 = dVar2;
                            htVar3 = htVar4;
                            d0bVar2 = d0bVar3;
                            l58Var2 = l58Var3;
                        } else {
                            bVarI.G();
                            dVar3 = dVar2;
                            htVar3 = htVar2;
                            d0bVar2 = d0bVar;
                            l58Var2 = l58Var;
                        }
                        f3 = f2;
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: f9n
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA4 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar4 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC4 = c.c(bVarI, dVarA4);
                        ne00 ne00VarS4 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar4, yka.a.f);
                        hlh0.a(bVarI, ne00VarS4, yka.a.e);
                        hlh0.a(bVarI, dVarC4, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (bVarI.c(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (bVarI.M(l58Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        i13 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i12 & 1, z)) {
                            dVarB = d.a.b;
                            if (i15 != 0) {
                                dVar2 = dVarB;
                            }
                            if (i4 != 0) {
                                htVar4 = ht.a.e;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i6 != 0) {
                                d0bVar3 = d0b.a.b;
                                i14 = i8;
                            } else {
                                i14 = i8;
                                d0bVar3 = d0bVar;
                            }
                            if (i14 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                l58Var3 = null;
                            } else {
                                l58Var3 = l58Var;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (str != null) {
                                bVarI.N(1899234820);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objY2 = bVarI.y();
                                if (z2) {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                } else {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                }
                                dVarB = xa80.b(dVarB, false, (Function1) objY2);
                                bVarI.X(false);
                            } else {
                                bVarI.N(1899393602);
                                bVarI.X(false);
                            }
                            d dVarA5 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = a.a;
                                bVarI.r(objY);
                            }
                            aiv aivVar5 = (aiv) objY;
                            iHashCode = Long.hashCode(bVarI.T);
                            d dVarC5 = c.c(bVarI, dVarA5);
                            ne00 ne00VarS5 = bVarI.S();
                            yka.k.getClass();
                            aVar2 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar2);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, aivVar5, yka.a.f);
                            hlh0.a(bVarI, ne00VarS5, yka.a.e);
                            hlh0.a(bVarI, dVarC5, yka.a.d);
                            c1350a = yka.a.g;
                            if (bVarI.S) {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            } else {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            }
                            bVarI.X(true);
                            dVar3 = dVar2;
                            htVar3 = htVar4;
                            d0bVar2 = d0bVar3;
                            l58Var2 = l58Var3;
                        } else {
                            bVarI.G();
                            dVar3 = dVar2;
                            htVar3 = htVar2;
                            d0bVar2 = d0bVar;
                            l58Var2 = l58Var;
                        }
                        f3 = f2;
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: f9n
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA6 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar6 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC6 = c.c(bVarI, dVarA6);
                        ne00 ne00VarS6 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar6, yka.a.f);
                        hlh0.a(bVarI, ne00VarS6, yka.a.e);
                        hlh0.a(bVarI, dVarC6, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.M(l58Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA7 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar7 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC7 = c.c(bVarI, dVarA7);
                        ne00 ne00VarS7 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar7, yka.a.f);
                        hlh0.a(bVarI, ne00VarS7, yka.a.e);
                        hlh0.a(bVarI, dVarC7, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA8 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar8 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC8 = c.c(bVarI, dVarA8);
                    ne00 ne00VarS8 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar8, yka.a.f);
                    hlh0.a(bVarI, ne00VarS8, yka.a.e);
                    hlh0.a(bVarI, dVarC8, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            htVar2 = htVar;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(d0bVar)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (bVarI.c(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (bVarI.M(l58Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        i13 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i12 & 1, z)) {
                            dVarB = d.a.b;
                            if (i15 != 0) {
                                dVar2 = dVarB;
                            }
                            if (i4 != 0) {
                                htVar4 = ht.a.e;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i6 != 0) {
                                d0bVar3 = d0b.a.b;
                                i14 = i8;
                            } else {
                                i14 = i8;
                                d0bVar3 = d0bVar;
                            }
                            if (i14 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                l58Var3 = null;
                            } else {
                                l58Var3 = l58Var;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (str != null) {
                                bVarI.N(1899234820);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objY2 = bVarI.y();
                                if (z2) {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                } else {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                }
                                dVarB = xa80.b(dVarB, false, (Function1) objY2);
                                bVarI.X(false);
                            } else {
                                bVarI.N(1899393602);
                                bVarI.X(false);
                            }
                            d dVarA9 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = a.a;
                                bVarI.r(objY);
                            }
                            aiv aivVar9 = (aiv) objY;
                            iHashCode = Long.hashCode(bVarI.T);
                            d dVarC9 = c.c(bVarI, dVarA9);
                            ne00 ne00VarS9 = bVarI.S();
                            yka.k.getClass();
                            aVar2 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar2);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, aivVar9, yka.a.f);
                            hlh0.a(bVarI, ne00VarS9, yka.a.e);
                            hlh0.a(bVarI, dVarC9, yka.a.d);
                            c1350a = yka.a.g;
                            if (bVarI.S) {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            } else {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            }
                            bVarI.X(true);
                            dVar3 = dVar2;
                            htVar3 = htVar4;
                            d0bVar2 = d0bVar3;
                            l58Var2 = l58Var3;
                        } else {
                            bVarI.G();
                            dVar3 = dVar2;
                            htVar3 = htVar2;
                            d0bVar2 = d0bVar;
                            l58Var2 = l58Var;
                        }
                        f3 = f2;
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: f9n
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA10 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar10 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC10 = c.c(bVarI, dVarA10);
                        ne00 ne00VarS10 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar10, yka.a.f);
                        hlh0.a(bVarI, ne00VarS10, yka.a.e);
                        hlh0.a(bVarI, dVarC10, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.M(l58Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA11 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar11 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC11 = c.c(bVarI, dVarA11);
                        ne00 ne00VarS11 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar11, yka.a.f);
                        hlh0.a(bVarI, ne00VarS11, yka.a.e);
                        hlh0.a(bVarI, dVarC11, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA12 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar12 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC12 = c.c(bVarI, dVarA12);
                    ne00 ne00VarS12 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar12, yka.a.f);
                    hlh0.a(bVarI, ne00VarS12, yka.a.e);
                    hlh0.a(bVarI, dVarC12, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (bVarI.c(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.M(l58Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA13 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar13 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC13 = c.c(bVarI, dVarA13);
                        ne00 ne00VarS13 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar13, yka.a.f);
                        hlh0.a(bVarI, ne00VarS13, yka.a.e);
                        hlh0.a(bVarI, dVarC13, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA14 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar14 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC14 = c.c(bVarI, dVarA14);
                    ne00 ne00VarS14 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar14, yka.a.f);
                    hlh0.a(bVarI, ne00VarS14, yka.a.e);
                    hlh0.a(bVarI, dVarC14, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.M(l58Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA15 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar15 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC15 = c.c(bVarI, dVarA15);
                    ne00 ne00VarS15 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar15, yka.a.f);
                    hlh0.a(bVarI, ne00VarS15, yka.a.e);
                    hlh0.a(bVarI, dVarC15, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            i12 = i3;
            i13 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i12 & 1, z)) {
                dVarB = d.a.b;
                if (i15 != 0) {
                    dVar2 = dVarB;
                }
                if (i4 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i6 != 0) {
                    d0bVar3 = d0b.a.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    d0bVar3 = d0bVar;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    l58Var3 = null;
                } else {
                    l58Var3 = l58Var;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (str != null) {
                    bVarI.N(1899234820);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2) {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    }
                    dVarB = xa80.b(dVarB, false, (Function1) objY2);
                    bVarI.X(false);
                } else {
                    bVarI.N(1899393602);
                    bVarI.X(false);
                }
                d dVarA16 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = a.a;
                    bVarI.r(objY);
                }
                aiv aivVar16 = (aiv) objY;
                iHashCode = Long.hashCode(bVarI.T);
                d dVarC16 = c.c(bVarI, dVarA16);
                ne00 ne00VarS16 = bVarI.S();
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVar16, yka.a.f);
                hlh0.a(bVarI, ne00VarS16, yka.a.e);
                hlh0.a(bVarI, dVarC16, yka.a.d);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                bVarI.X(true);
                dVar3 = dVar2;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                l58Var2 = l58Var3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                htVar3 = htVar2;
                d0bVar2 = d0bVar;
                l58Var2 = l58Var;
            }
            f3 = f2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f9n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                htVar2 = htVar;
                if (bVarI.M(htVar2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(d0bVar)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (bVarI.c(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            if (bVarI.M(l58Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        i13 = 0;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i12 & 1, z)) {
                            dVarB = d.a.b;
                            if (i15 != 0) {
                                dVar2 = dVarB;
                            }
                            if (i4 != 0) {
                                htVar4 = ht.a.e;
                            } else {
                                htVar4 = htVar2;
                            }
                            if (i6 != 0) {
                                d0bVar3 = d0b.a.b;
                                i14 = i8;
                            } else {
                                i14 = i8;
                                d0bVar3 = d0bVar;
                            }
                            if (i14 != 0) {
                                f2 = 1.0f;
                            }
                            if (i10 != 0) {
                                l58Var3 = null;
                            } else {
                                l58Var3 = l58Var;
                            }
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (str != null) {
                                bVarI.N(1899234820);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objY2 = bVarI.y();
                                if (z2) {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                } else {
                                    objY2 = new e9n(str, i13);
                                    bVarI.r(objY2);
                                }
                                dVarB = xa80.b(dVarB, false, (Function1) objY2);
                                bVarI.X(false);
                            } else {
                                bVarI.N(1899393602);
                                bVarI.X(false);
                            }
                            d dVarA17 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = a.a;
                                bVarI.r(objY);
                            }
                            aiv aivVar17 = (aiv) objY;
                            iHashCode = Long.hashCode(bVarI.T);
                            d dVarC17 = c.c(bVarI, dVarA17);
                            ne00 ne00VarS17 = bVarI.S();
                            yka.k.getClass();
                            aVar2 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar2);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, aivVar17, yka.a.f);
                            hlh0.a(bVarI, ne00VarS17, yka.a.e);
                            hlh0.a(bVarI, dVarC17, yka.a.d);
                            c1350a = yka.a.g;
                            if (bVarI.S) {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            } else {
                                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                            }
                            bVarI.X(true);
                            dVar3 = dVar2;
                            htVar3 = htVar4;
                            d0bVar2 = d0bVar3;
                            l58Var2 = l58Var3;
                        } else {
                            bVarI.G();
                            dVar3 = dVar2;
                            htVar3 = htVar2;
                            d0bVar2 = d0bVar;
                            l58Var2 = l58Var;
                        }
                        f3 = f2;
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: f9n
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA18 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar18 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC18 = c.c(bVarI, dVarA18);
                        ne00 ne00VarS18 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar18, yka.a.f);
                        hlh0.a(bVarI, ne00VarS18, yka.a.e);
                        hlh0.a(bVarI, dVarC18, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.M(l58Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA19 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar19 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC19 = c.c(bVarI, dVarA19);
                        ne00 ne00VarS19 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar19, yka.a.f);
                        hlh0.a(bVarI, ne00VarS19, yka.a.e);
                        hlh0.a(bVarI, dVarC19, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA110 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar110 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC110 = c.c(bVarI, dVarA110);
                    ne00 ne00VarS110 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar110, yka.a.f);
                    hlh0.a(bVarI, ne00VarS110, yka.a.e);
                    hlh0.a(bVarI, dVarC110, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (bVarI.c(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.M(l58Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA111 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar111 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC111 = c.c(bVarI, dVarA111);
                        ne00 ne00VarS111 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar111, yka.a.f);
                        hlh0.a(bVarI, ne00VarS111, yka.a.e);
                        hlh0.a(bVarI, dVarC111, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA112 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar112 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC112 = c.c(bVarI, dVarA112);
                    ne00 ne00VarS112 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar112, yka.a.f);
                    hlh0.a(bVarI, ne00VarS112, yka.a.e);
                    hlh0.a(bVarI, dVarC112, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.M(l58Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA113 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar113 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC113 = c.c(bVarI, dVarA113);
                    ne00 ne00VarS113 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar113, yka.a.f);
                    hlh0.a(bVarI, ne00VarS113, yka.a.e);
                    hlh0.a(bVarI, dVarC113, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            i12 = i3;
            i13 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i12 & 1, z)) {
                dVarB = d.a.b;
                if (i15 != 0) {
                    dVar2 = dVarB;
                }
                if (i4 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i6 != 0) {
                    d0bVar3 = d0b.a.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    d0bVar3 = d0bVar;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    l58Var3 = null;
                } else {
                    l58Var3 = l58Var;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (str != null) {
                    bVarI.N(1899234820);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2) {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    }
                    dVarB = xa80.b(dVarB, false, (Function1) objY2);
                    bVarI.X(false);
                } else {
                    bVarI.N(1899393602);
                    bVarI.X(false);
                }
                d dVarA114 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = a.a;
                    bVarI.r(objY);
                }
                aiv aivVar114 = (aiv) objY;
                iHashCode = Long.hashCode(bVarI.T);
                d dVarC114 = c.c(bVarI, dVarA114);
                ne00 ne00VarS114 = bVarI.S();
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVar114, yka.a.f);
                hlh0.a(bVarI, ne00VarS114, yka.a.e);
                hlh0.a(bVarI, dVarC114, yka.a.d);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                bVarI.X(true);
                dVar3 = dVar2;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                l58Var2 = l58Var3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                htVar3 = htVar2;
                d0bVar2 = d0bVar;
                l58Var2 = l58Var;
            }
            f3 = f2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f9n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        htVar2 = htVar;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (bVarI.M(d0bVar)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (bVarI.c(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.M(l58Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    i13 = 0;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i12 & 1, z)) {
                        dVarB = d.a.b;
                        if (i15 != 0) {
                            dVar2 = dVarB;
                        }
                        if (i4 != 0) {
                            htVar4 = ht.a.e;
                        } else {
                            htVar4 = htVar2;
                        }
                        if (i6 != 0) {
                            d0bVar3 = d0b.a.b;
                            i14 = i8;
                        } else {
                            i14 = i8;
                            d0bVar3 = d0bVar;
                        }
                        if (i14 != 0) {
                            f2 = 1.0f;
                        }
                        if (i10 != 0) {
                            l58Var3 = null;
                        } else {
                            l58Var3 = l58Var;
                        }
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (str != null) {
                            bVarI.N(1899234820);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objY2 = bVarI.y();
                            if (z2) {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new e9n(str, i13);
                                bVarI.r(objY2);
                            }
                            dVarB = xa80.b(dVarB, false, (Function1) objY2);
                            bVarI.X(false);
                        } else {
                            bVarI.N(1899393602);
                            bVarI.X(false);
                        }
                        d dVarA115 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = a.a;
                            bVarI.r(objY);
                        }
                        aiv aivVar115 = (aiv) objY;
                        iHashCode = Long.hashCode(bVarI.T);
                        d dVarC115 = c.c(bVarI, dVarA115);
                        ne00 ne00VarS115 = bVarI.S();
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVar115, yka.a.f);
                        hlh0.a(bVarI, ne00VarS115, yka.a.e);
                        hlh0.a(bVarI, dVarC115, yka.a.d);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        bVarI.X(true);
                        dVar3 = dVar2;
                        htVar3 = htVar4;
                        d0bVar2 = d0bVar3;
                        l58Var2 = l58Var3;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        htVar3 = htVar2;
                        d0bVar2 = d0bVar;
                        l58Var2 = l58Var;
                    }
                    f3 = f2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: f9n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA116 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar116 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC116 = c.c(bVarI, dVarA116);
                    ne00 ne00VarS116 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar116, yka.a.f);
                    hlh0.a(bVarI, ne00VarS116, yka.a.e);
                    hlh0.a(bVarI, dVarC116, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.M(l58Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA117 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar117 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC117 = c.c(bVarI, dVarA117);
                    ne00 ne00VarS117 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar117, yka.a.f);
                    hlh0.a(bVarI, ne00VarS117, yka.a.e);
                    hlh0.a(bVarI, dVarC117, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            i12 = i3;
            i13 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i12 & 1, z)) {
                dVarB = d.a.b;
                if (i15 != 0) {
                    dVar2 = dVarB;
                }
                if (i4 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i6 != 0) {
                    d0bVar3 = d0b.a.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    d0bVar3 = d0bVar;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    l58Var3 = null;
                } else {
                    l58Var3 = l58Var;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (str != null) {
                    bVarI.N(1899234820);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2) {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    }
                    dVarB = xa80.b(dVarB, false, (Function1) objY2);
                    bVarI.X(false);
                } else {
                    bVarI.N(1899393602);
                    bVarI.X(false);
                }
                d dVarA118 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = a.a;
                    bVarI.r(objY);
                }
                aiv aivVar118 = (aiv) objY;
                iHashCode = Long.hashCode(bVarI.T);
                d dVarC118 = c.c(bVarI, dVarA118);
                ne00 ne00VarS118 = bVarI.S();
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVar118, yka.a.f);
                hlh0.a(bVarI, ne00VarS118, yka.a.e);
                hlh0.a(bVarI, dVarC118, yka.a.d);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                bVarI.X(true);
                dVar3 = dVar2;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                l58Var2 = l58Var3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                htVar3 = htVar2;
                d0bVar2 = d0bVar;
                l58Var2 = l58Var;
            }
            f3 = f2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f9n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (bVarI.c(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.M(l58Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                i13 = 0;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i12 & 1, z)) {
                    dVarB = d.a.b;
                    if (i15 != 0) {
                        dVar2 = dVarB;
                    }
                    if (i4 != 0) {
                        htVar4 = ht.a.e;
                    } else {
                        htVar4 = htVar2;
                    }
                    if (i6 != 0) {
                        d0bVar3 = d0b.a.b;
                        i14 = i8;
                    } else {
                        i14 = i8;
                        d0bVar3 = d0bVar;
                    }
                    if (i14 != 0) {
                        f2 = 1.0f;
                    }
                    if (i10 != 0) {
                        l58Var3 = null;
                    } else {
                        l58Var3 = l58Var;
                    }
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (str != null) {
                        bVarI.N(1899234820);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY2 = bVarI.y();
                        if (z2) {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new e9n(str, i13);
                            bVarI.r(objY2);
                        }
                        dVarB = xa80.b(dVarB, false, (Function1) objY2);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1899393602);
                        bVarI.X(false);
                    }
                    d dVarA119 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = a.a;
                        bVarI.r(objY);
                    }
                    aiv aivVar119 = (aiv) objY;
                    iHashCode = Long.hashCode(bVarI.T);
                    d dVarC119 = c.c(bVarI, dVarA119);
                    ne00 ne00VarS119 = bVarI.S();
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVar119, yka.a.f);
                    hlh0.a(bVarI, ne00VarS119, yka.a.e);
                    hlh0.a(bVarI, dVarC119, yka.a.d);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    bVarI.X(true);
                    dVar3 = dVar2;
                    htVar3 = htVar4;
                    d0bVar2 = d0bVar3;
                    l58Var2 = l58Var3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    htVar3 = htVar2;
                    d0bVar2 = d0bVar;
                    l58Var2 = l58Var;
                }
                f3 = f2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: f9n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            i12 = i3;
            i13 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i12 & 1, z)) {
                dVarB = d.a.b;
                if (i15 != 0) {
                    dVar2 = dVarB;
                }
                if (i4 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i6 != 0) {
                    d0bVar3 = d0b.a.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    d0bVar3 = d0bVar;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    l58Var3 = null;
                } else {
                    l58Var3 = l58Var;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (str != null) {
                    bVarI.N(1899234820);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2) {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    }
                    dVarB = xa80.b(dVarB, false, (Function1) objY2);
                    bVarI.X(false);
                } else {
                    bVarI.N(1899393602);
                    bVarI.X(false);
                }
                d dVarA1110 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = a.a;
                    bVarI.r(objY);
                }
                aiv aivVar1110 = (aiv) objY;
                iHashCode = Long.hashCode(bVarI.T);
                d dVarC1110 = c.c(bVarI, dVarA1110);
                ne00 ne00VarS1110 = bVarI.S();
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVar1110, yka.a.f);
                hlh0.a(bVarI, ne00VarS1110, yka.a.e);
                hlh0.a(bVarI, dVarC1110, yka.a.d);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                bVarI.X(true);
                dVar3 = dVar2;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                l58Var2 = l58Var3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                htVar3 = htVar2;
                d0bVar2 = d0bVar;
                l58Var2 = l58Var;
            }
            f3 = f2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f9n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 196608;
        f2 = f;
        i10 = i2 & 64;
        if (i10 != 0) {
            if ((1572864 & i) == 0) {
                if (bVarI.M(l58Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            i13 = 0;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i12 & 1, z)) {
                dVarB = d.a.b;
                if (i15 != 0) {
                    dVar2 = dVarB;
                }
                if (i4 != 0) {
                    htVar4 = ht.a.e;
                } else {
                    htVar4 = htVar2;
                }
                if (i6 != 0) {
                    d0bVar3 = d0b.a.b;
                    i14 = i8;
                } else {
                    i14 = i8;
                    d0bVar3 = d0bVar;
                }
                if (i14 != 0) {
                    f2 = 1.0f;
                }
                if (i10 != 0) {
                    l58Var3 = null;
                } else {
                    l58Var3 = l58Var;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (str != null) {
                    bVarI.N(1899234820);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY2 = bVarI.y();
                    if (z2) {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new e9n(str, i13);
                        bVarI.r(objY2);
                    }
                    dVarB = xa80.b(dVarB, false, (Function1) objY2);
                    bVarI.X(false);
                } else {
                    bVarI.N(1899393602);
                    bVarI.X(false);
                }
                d dVarA1111 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = a.a;
                    bVarI.r(objY);
                }
                aiv aivVar1111 = (aiv) objY;
                iHashCode = Long.hashCode(bVarI.T);
                d dVarC1111 = c.c(bVarI, dVarA1111);
                ne00 ne00VarS1111 = bVarI.S();
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVar1111, yka.a.f);
                hlh0.a(bVarI, ne00VarS1111, yka.a.e);
                hlh0.a(bVarI, dVarC1111, yka.a.d);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                bVarI.X(true);
                dVar3 = dVar2;
                htVar3 = htVar4;
                d0bVar2 = d0bVar3;
                l58Var2 = l58Var3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                htVar3 = htVar2;
                d0bVar2 = d0bVar;
                l58Var2 = l58Var;
            }
            f3 = f2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f9n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        i12 = i3;
        i13 = 0;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i12 & 1, z)) {
            dVarB = d.a.b;
            if (i15 != 0) {
                dVar2 = dVarB;
            }
            if (i4 != 0) {
                htVar4 = ht.a.e;
            } else {
                htVar4 = htVar2;
            }
            if (i6 != 0) {
                d0bVar3 = d0b.a.b;
                i14 = i8;
            } else {
                i14 = i8;
                d0bVar3 = d0bVar;
            }
            if (i14 != 0) {
                f2 = 1.0f;
            }
            if (i10 != 0) {
                l58Var3 = null;
            } else {
                l58Var3 = l58Var;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (str != null) {
                bVarI.N(1899234820);
                if ((i12 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY2 = bVarI.y();
                if (z2) {
                    objY2 = new e9n(str, i13);
                    bVarI.r(objY2);
                } else {
                    objY2 = new e9n(str, i13);
                    bVarI.r(objY2);
                }
                dVarB = xa80.b(dVarB, false, (Function1) objY2);
                bVarI.X(false);
            } else {
                bVarI.N(1899393602);
                bVarI.X(false);
            }
            d dVarA1112 = androidx.compose.ui.draw.b.a(ls7.b(dVar2.n(dVarB)), crzVar, htVar4, d0bVar3, f2, l58Var3, 2);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = a.a;
                bVarI.r(objY);
            }
            aiv aivVar1112 = (aiv) objY;
            iHashCode = Long.hashCode(bVarI.T);
            d dVarC1112 = c.c(bVarI, dVarA1112);
            ne00 ne00VarS1112 = bVarI.S();
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVar1112, yka.a.f);
            hlh0.a(bVarI, ne00VarS1112, yka.a.e);
            hlh0.a(bVarI, dVarC1112, yka.a.d);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            bVarI.X(true);
            dVar3 = dVar2;
            htVar3 = htVar4;
            d0bVar2 = d0bVar3;
            l58Var2 = l58Var3;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            htVar3 = htVar2;
            d0bVar2 = d0bVar;
            l58Var2 = l58Var;
        }
        f3 = f2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: f9n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h9n.a(crzVar, str, dVar3, htVar3, d0bVar2, f3, l58Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(c8n c8nVar, String str, d dVar, androidx.compose.runtime.a aVar, int i, int i2) {
        d0b d0bVar = (i2 & 16) != 0 ? d0b.a.b : d0b.a.a;
        float f = (i2 & 32) != 0 ? 1.0f : 0.05f;
        boolean zM = aVar.M(c8nVar);
        Object objY = aVar.y();
        if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = te4.a(c8nVar, 1);
            aVar.r(objY);
        }
        a((se4) objY, str, dVar, ht.a.e, d0bVar, f, null, aVar, i & 4194288, 0);
    }
}
