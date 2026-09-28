package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class okf0 {
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x022b  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void a(final d dVar, final String str, String str2, int i, int i2, Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i3, final int i4) {
        int i5;
        String str3;
        final int i6;
        int i7;
        Function2<? super a, ? super Integer, Unit> function3;
        int i8;
        boolean z;
        b bVar;
        final String str4;
        final Function2<? super a, ? super Integer, Unit> function4;
        final int i9;
        e eVarZ;
        int i10;
        int i11;
        Function2<? super a, ? super Integer, Unit> function5;
        int i12;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z2;
        b bVarI = aVar.i(1704426493);
        if ((i3 & 6) == 0) {
            i5 = (bVarI.M(dVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.M(str) ? 32 : 16;
        }
        int i13 = i4 & 4;
        if (i13 == 0) {
            if ((i3 & 384) == 0) {
                str3 = str2;
                i5 |= bVarI.M(str3) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i5 |= 1024;
            }
            if ((i3 & 24576) == 0) {
                if ((i4 & 16) == 0) {
                    i6 = i2;
                    int i14 = bVarI.d(i6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                    i5 |= i14;
                } else {
                    i6 = i2;
                }
                i5 |= i14;
            } else {
                i6 = i2;
            }
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((196608 & i3) == 0) {
                    function3 = function2;
                    if (bVarI.A(function3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                if ((74899 & i5) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i5 & 1, z)) {
                    bVarI.A0();
                    if ((i3 & 1) != 0 || bVarI.h0()) {
                        if (i13 != 0) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        i10 = i5 & (-7169);
                        if ((i4 & 16) != 0) {
                            i11 = i5 & (-64513);
                            i6 = R.style.B1_R;
                        } else {
                            i11 = i10;
                        }
                        if (i7 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        i12 = R.style.B1_R;
                    } else {
                        bVarI.G();
                        int i15 = i5 & (-7169);
                        if ((i4 & 16) != 0) {
                            i15 = i5 & (-64513);
                        }
                        i12 = i;
                        i11 = i15;
                        str4 = str3;
                        function5 = function3;
                    }
                    bVarI.Y();
                    d dVarG = j.g(dVar, 1.0f);
                    d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarG);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    imf0 imf0VarL = mla.l(i12, bVarI);
                    long jA = c68.a(R.color.text_primary, bVarI);
                    d.a aVar3 = d.a.b;
                    lkf0.d(str, g3w.h(aVar3, "auto_bet_label_text"), jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, ((i11 >> 3) & 14) | 48, 0, 131064);
                    bVar = bVarI;
                    ty0.a(bVar, j.w(aVar3, 20.0f));
                    if (function5 != null) {
                        bVar.N(877597696);
                        function5.invoke(bVar, Integer.valueOf((i11 >> 15) & 14));
                        bVar.X(false);
                        z2 = true;
                    } else {
                        bVar.N(877670236);
                        z2 = true;
                        lkf0.d(str4, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, mla.l(i6, bVar), bVar, (i11 >> 6) & 14, 24960, 109560);
                        bVar = bVar;
                        bVar.X(false);
                    }
                    bVar.X(z2);
                    function4 = function5;
                    i9 = i12;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    str4 = str3;
                    function4 = function3;
                    i9 = i;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nkf0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            okf0.a(dVar, str, str4, i9, i6, function4, (a) obj, qj40.a(i3 | 1), i4);
                            return Unit.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            function3 = function2;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    i10 = i5 & (-7169);
                    if ((i4 & 16) != 0) {
                        i11 = i5 & (-64513);
                        i6 = R.style.B1_R;
                    } else {
                        i11 = i10;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    i12 = R.style.B1_R;
                } else {
                    if (i13 != 0) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    i10 = i5 & (-7169);
                    if ((i4 & 16) != 0) {
                        i11 = i5 & (-64513);
                        i6 = R.style.B1_R;
                    } else {
                        i11 = i10;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    i12 = R.style.B1_R;
                }
                bVarI.Y();
                d dVarG2 = j.g(dVar, 1.0f);
                d160 d160VarA2 = b160.a(kw0.g, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                imf0 imf0VarL2 = mla.l(i12, bVarI);
                long jA2 = c68.a(R.color.text_primary, bVarI);
                d.a aVar4 = d.a.b;
                lkf0.d(str, g3w.h(aVar4, "auto_bet_label_text"), jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL2, bVarI, ((i11 >> 3) & 14) | 48, 0, 131064);
                bVar = bVarI;
                ty0.a(bVar, j.w(aVar4, 20.0f));
                if (function5 != null) {
                    bVar.N(877597696);
                    function5.invoke(bVar, Integer.valueOf((i11 >> 15) & 14));
                    bVar.X(false);
                    z2 = true;
                } else {
                    bVar.N(877670236);
                    z2 = true;
                    lkf0.d(str4, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, mla.l(i6, bVar), bVar, (i11 >> 6) & 14, 24960, 109560);
                    bVar = bVar;
                    bVar.X(false);
                }
                bVar.X(z2);
                function4 = function5;
                i9 = i12;
            } else {
                bVar = bVarI;
                bVar.G();
                str4 = str3;
                function4 = function3;
                i9 = i;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nkf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        okf0.a(dVar, str, str4, i9, i6, function4, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 384;
        str3 = str2;
        if ((i3 & 3072) == 0) {
            i5 |= 1024;
        }
        if ((i3 & 24576) == 0) {
            if ((i4 & 16) == 0) {
                i6 = i2;
                if (bVarI.d(i6)) {
                }
                i5 |= i14;
            } else {
                i6 = i2;
            }
            i5 |= i14;
        } else {
            i6 = i2;
        }
        i7 = i4 & 32;
        if (i7 != 0) {
            if ((196608 & i3) == 0) {
                function3 = function2;
                if (bVarI.A(function3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i13 != 0) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    i10 = i5 & (-7169);
                    if ((i4 & 16) != 0) {
                        i11 = i5 & (-64513);
                        i6 = R.style.B1_R;
                    } else {
                        i11 = i10;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    i12 = R.style.B1_R;
                } else {
                    if (i13 != 0) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    i10 = i5 & (-7169);
                    if ((i4 & 16) != 0) {
                        i11 = i5 & (-64513);
                        i6 = R.style.B1_R;
                    } else {
                        i11 = i10;
                    }
                    if (i7 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    i12 = R.style.B1_R;
                }
                bVarI.Y();
                d dVarG3 = j.g(dVar, 1.0f);
                d160 d160VarA3 = b160.a(kw0.g, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG3);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                imf0 imf0VarL3 = mla.l(i12, bVarI);
                long jA3 = c68.a(R.color.text_primary, bVarI);
                d.a aVar5 = d.a.b;
                lkf0.d(str, g3w.h(aVar5, "auto_bet_label_text"), jA3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL3, bVarI, ((i11 >> 3) & 14) | 48, 0, 131064);
                bVar = bVarI;
                ty0.a(bVar, j.w(aVar5, 20.0f));
                if (function5 != null) {
                    bVar.N(877597696);
                    function5.invoke(bVar, Integer.valueOf((i11 >> 15) & 14));
                    bVar.X(false);
                    z2 = true;
                } else {
                    bVar.N(877670236);
                    z2 = true;
                    lkf0.d(str4, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, mla.l(i6, bVar), bVar, (i11 >> 6) & 14, 24960, 109560);
                    bVar = bVar;
                    bVar.X(false);
                }
                bVar.X(z2);
                function4 = function5;
                i9 = i12;
            } else {
                bVar = bVarI;
                bVar.G();
                str4 = str3;
                function4 = function3;
                i9 = i;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nkf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        okf0.a(dVar, str, str4, i9, i6, function4, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 196608;
        function3 = function2;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            bVarI.A0();
            if ((i3 & 1) != 0) {
                if (i13 != 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                i10 = i5 & (-7169);
                if ((i4 & 16) != 0) {
                    i11 = i5 & (-64513);
                    i6 = R.style.B1_R;
                } else {
                    i11 = i10;
                }
                if (i7 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                i12 = R.style.B1_R;
            } else {
                if (i13 != 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                i10 = i5 & (-7169);
                if ((i4 & 16) != 0) {
                    i11 = i5 & (-64513);
                    i6 = R.style.B1_R;
                } else {
                    i11 = i10;
                }
                if (i7 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                i12 = R.style.B1_R;
            }
            bVarI.Y();
            d dVarG4 = j.g(dVar, 1.0f);
            d160 d160VarA4 = b160.a(kw0.g, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            imf0 imf0VarL4 = mla.l(i12, bVarI);
            long jA4 = c68.a(R.color.text_primary, bVarI);
            d.a aVar6 = d.a.b;
            lkf0.d(str, g3w.h(aVar6, "auto_bet_label_text"), jA4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL4, bVarI, ((i11 >> 3) & 14) | 48, 0, 131064);
            bVar = bVarI;
            ty0.a(bVar, j.w(aVar6, 20.0f));
            if (function5 != null) {
                bVar.N(877597696);
                function5.invoke(bVar, Integer.valueOf((i11 >> 15) & 14));
                bVar.X(false);
                z2 = true;
            } else {
                bVar.N(877670236);
                z2 = true;
                lkf0.d(str4, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), c68.a(R.color.text_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, mla.l(i6, bVar), bVar, (i11 >> 6) & 14, 24960, 109560);
                bVar = bVar;
                bVar.X(false);
            }
            bVar.X(z2);
            function4 = function5;
            i9 = i12;
        } else {
            bVar = bVarI;
            bVar.G();
            str4 = str3;
            function4 = function3;
            i9 = i;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nkf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    okf0.a(dVar, str, str4, i9, i6, function4, (a) obj, qj40.a(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:75:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x021d  */
    /* JADX WARN: Code duplicated, block: B:80:0x022c  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void b(final d dVar, final String str, String str2, int i, int i2, Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i3, final int i4) {
        String str3;
        int i5;
        String str4;
        int i6;
        int i7;
        int i8;
        int i9;
        Function2<? super a, ? super Integer, Unit> function3;
        int i10;
        boolean z;
        b bVar;
        final int i11;
        final Function2<? super a, ? super Integer, Unit> function4;
        final int i12;
        final String str5;
        e eVarZ;
        String str6;
        int i13;
        int i14;
        int i15;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int i16;
        Function2<? super a, ? super Integer, Unit> function5;
        int i17;
        Function2<? super a, ? super Integer, Unit> function6;
        String str7;
        b bVarI = aVar.i(-1707072618);
        if ((i3 & 48) == 0) {
            str3 = str;
            i5 = i3 | (bVarI.M(str3) ? 32 : 16);
        } else {
            str3 = str;
            i5 = i3;
        }
        int i18 = i4 & 4;
        if (i18 != 0) {
            i6 = i5 | 384;
            str4 = str2;
        } else {
            str4 = str2;
            i6 = i5 | (bVarI.M(str4) ? 256 : 128);
        }
        int i19 = i6 | 1024;
        if ((i4 & 16) == 0) {
            i7 = i2;
            int i20 = bVarI.d(i7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            i8 = i19 | i20;
            i9 = i4 & 32;
            if (i9 != 0) {
                if ((i3 & 196608) == 0) {
                    function3 = function2;
                    if (bVarI.A(function3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i8 |= i10;
                }
                if ((74899 & i8) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i8 & 1, z)) {
                    bVarI.A0();
                    if ((i3 & 1) != 0 || bVarI.h0()) {
                        if (i18 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        i13 = i8 & (-7169);
                        if ((i4 & 16) != 0) {
                            i14 = i8 & (-64513);
                            i7 = R.style.B1_R;
                        } else {
                            i14 = i13;
                        }
                        if (i9 != 0) {
                            function3 = null;
                        }
                        i15 = R.style.B1_R;
                    } else {
                        bVarI.G();
                        int i21 = i8 & (-7169);
                        if ((i4 & 16) != 0) {
                            i21 = i8 & (-64513);
                        }
                        i15 = i;
                        i14 = i21;
                        str6 = str4;
                    }
                    bVarI.Y();
                    d dVarG = j.g(dVar, 1.0f);
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 54);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarG);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    imf0 imf0VarL = mla.l(i15, bVarI);
                    long jA = c68.a(R.color.text_primary, bVarI);
                    d.a aVar3 = d.a.b;
                    i16 = i7;
                    function5 = function3;
                    int i22 = i15;
                    lkf0.d(str3, g3w.h(aVar3, "auto_bet_label_text"), jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, ((i14 >> 3) & 14) | 48, 0, 131064);
                    bVar = bVarI;
                    ty0.a(bVar, j.w(aVar3, 8.0f));
                    if (function5 != null) {
                        bVar.N(-2090742553);
                        function5.invoke(bVar, Integer.valueOf((i14 >> 15) & 14));
                        bVar.X(false);
                        str7 = str6;
                        i17 = i16;
                        function6 = function5;
                    } else {
                        bVar.N(-2090669951);
                        imf0 imf0VarL2 = mla.l(i16, bVar);
                        long jA2 = c68.a(R.color.text_primary, bVar);
                        i17 = i16;
                        String str8 = str6;
                        function6 = function5;
                        lkf0.d(str8, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), jA2, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 2, false, 1, 0, null, imf0VarL2, bVar, (i14 >> 6) & 14, 24960, 109560);
                        str7 = str8;
                        bVar = bVar;
                        bVar.X(false);
                    }
                    bVar.X(true);
                    str5 = str7;
                    function4 = function6;
                    i11 = i22;
                    i12 = i17;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    i11 = i;
                    function4 = function3;
                    i12 = i7;
                    str5 = str4;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mkf0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            okf0.b(dVar, str, str5, i11, i12, function4, (a) obj, qj40.a(i3 | 1), i4);
                            return Unit.a;
                        }
                    };
                }
            }
            i8 |= 196608;
            function3 = function2;
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i8 & 1, z)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    i13 = i8 & (-7169);
                    if ((i4 & 16) != 0) {
                        i14 = i8 & (-64513);
                        i7 = R.style.B1_R;
                    } else {
                        i14 = i13;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    }
                    i15 = R.style.B1_R;
                } else {
                    if (i18 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    i13 = i8 & (-7169);
                    if ((i4 & 16) != 0) {
                        i14 = i8 & (-64513);
                        i7 = R.style.B1_R;
                    } else {
                        i14 = i13;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    }
                    i15 = R.style.B1_R;
                }
                bVarI.Y();
                d dVarG2 = j.g(dVar, 1.0f);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                imf0 imf0VarL3 = mla.l(i15, bVarI);
                long jA3 = c68.a(R.color.text_primary, bVarI);
                d.a aVar4 = d.a.b;
                i16 = i7;
                function5 = function3;
                int i23 = i15;
                lkf0.d(str3, g3w.h(aVar4, "auto_bet_label_text"), jA3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL3, bVarI, ((i14 >> 3) & 14) | 48, 0, 131064);
                bVar = bVarI;
                ty0.a(bVar, j.w(aVar4, 8.0f));
                if (function5 != null) {
                    bVar.N(-2090742553);
                    function5.invoke(bVar, Integer.valueOf((i14 >> 15) & 14));
                    bVar.X(false);
                    str7 = str6;
                    i17 = i16;
                    function6 = function5;
                } else {
                    bVar.N(-2090669951);
                    imf0 imf0VarL4 = mla.l(i16, bVar);
                    long jA4 = c68.a(R.color.text_primary, bVar);
                    i17 = i16;
                    String str9 = str6;
                    function6 = function5;
                    lkf0.d(str9, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), jA4, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 2, false, 1, 0, null, imf0VarL4, bVar, (i14 >> 6) & 14, 24960, 109560);
                    str7 = str9;
                    bVar = bVar;
                    bVar.X(false);
                }
                bVar.X(true);
                str5 = str7;
                function4 = function6;
                i11 = i23;
                i12 = i17;
            } else {
                bVar = bVarI;
                bVar.G();
                i11 = i;
                function4 = function3;
                i12 = i7;
                str5 = str4;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: mkf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        okf0.b(dVar, str, str5, i11, i12, function4, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i7 = i2;
        i8 = i19 | i20;
        i9 = i4 & 32;
        if (i9 != 0) {
            if ((i3 & 196608) == 0) {
                function3 = function2;
                if (bVarI.A(function3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i8 |= i10;
            }
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i8 & 1, z)) {
                bVarI.A0();
                if ((i3 & 1) != 0) {
                    if (i18 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    i13 = i8 & (-7169);
                    if ((i4 & 16) != 0) {
                        i14 = i8 & (-64513);
                        i7 = R.style.B1_R;
                    } else {
                        i14 = i13;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    }
                    i15 = R.style.B1_R;
                } else {
                    if (i18 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    i13 = i8 & (-7169);
                    if ((i4 & 16) != 0) {
                        i14 = i8 & (-64513);
                        i7 = R.style.B1_R;
                    } else {
                        i14 = i13;
                    }
                    if (i9 != 0) {
                        function3 = null;
                    }
                    i15 = R.style.B1_R;
                }
                bVarI.Y();
                d dVarG3 = j.g(dVar, 1.0f);
                d160 d160VarA3 = b160.a(kw0.a, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG3);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                imf0 imf0VarL5 = mla.l(i15, bVarI);
                long jA5 = c68.a(R.color.text_primary, bVarI);
                d.a aVar5 = d.a.b;
                i16 = i7;
                function5 = function3;
                int i24 = i15;
                lkf0.d(str3, g3w.h(aVar5, "auto_bet_label_text"), jA5, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL5, bVarI, ((i14 >> 3) & 14) | 48, 0, 131064);
                bVar = bVarI;
                ty0.a(bVar, j.w(aVar5, 8.0f));
                if (function5 != null) {
                    bVar.N(-2090742553);
                    function5.invoke(bVar, Integer.valueOf((i14 >> 15) & 14));
                    bVar.X(false);
                    str7 = str6;
                    i17 = i16;
                    function6 = function5;
                } else {
                    bVar.N(-2090669951);
                    imf0 imf0VarL6 = mla.l(i16, bVar);
                    long jA6 = c68.a(R.color.text_primary, bVar);
                    i17 = i16;
                    String str10 = str6;
                    function6 = function5;
                    lkf0.d(str10, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), jA6, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 2, false, 1, 0, null, imf0VarL6, bVar, (i14 >> 6) & 14, 24960, 109560);
                    str7 = str10;
                    bVar = bVar;
                    bVar.X(false);
                }
                bVar.X(true);
                str5 = str7;
                function4 = function6;
                i11 = i24;
                i12 = i17;
            } else {
                bVar = bVarI;
                bVar.G();
                i11 = i;
                function4 = function3;
                i12 = i7;
                str5 = str4;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: mkf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        okf0.b(dVar, str, str5, i11, i12, function4, (a) obj, qj40.a(i3 | 1), i4);
                        return Unit.a;
                    }
                };
            }
        }
        i8 |= 196608;
        function3 = function2;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i8 & 1, z)) {
            bVarI.A0();
            if ((i3 & 1) != 0) {
                if (i18 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                i13 = i8 & (-7169);
                if ((i4 & 16) != 0) {
                    i14 = i8 & (-64513);
                    i7 = R.style.B1_R;
                } else {
                    i14 = i13;
                }
                if (i9 != 0) {
                    function3 = null;
                }
                i15 = R.style.B1_R;
            } else {
                if (i18 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                i13 = i8 & (-7169);
                if ((i4 & 16) != 0) {
                    i14 = i8 & (-64513);
                    i7 = R.style.B1_R;
                } else {
                    i14 = i13;
                }
                if (i9 != 0) {
                    function3 = null;
                }
                i15 = R.style.B1_R;
            }
            bVarI.Y();
            d dVarG4 = j.g(dVar, 1.0f);
            d160 d160VarA4 = b160.a(kw0.a, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            imf0 imf0VarL7 = mla.l(i15, bVarI);
            long jA7 = c68.a(R.color.text_primary, bVarI);
            d.a aVar6 = d.a.b;
            i16 = i7;
            function5 = function3;
            int i25 = i15;
            lkf0.d(str3, g3w.h(aVar6, "auto_bet_label_text"), jA7, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL7, bVarI, ((i14 >> 3) & 14) | 48, 0, 131064);
            bVar = bVarI;
            ty0.a(bVar, j.w(aVar6, 8.0f));
            if (function5 != null) {
                bVar.N(-2090742553);
                function5.invoke(bVar, Integer.valueOf((i14 >> 15) & 14));
                bVar.X(false);
                str7 = str6;
                i17 = i16;
                function6 = function5;
            } else {
                bVar.N(-2090669951);
                imf0 imf0VarL8 = mla.l(i16, bVar);
                long jA8 = c68.a(R.color.text_primary, bVar);
                i17 = i16;
                String str11 = str6;
                function6 = function5;
                lkf0.d(str11, g3w.h(new LayoutWeightElement(1.0f, true), "auto_bet_value_text"), jA8, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 2, false, 1, 0, null, imf0VarL8, bVar, (i14 >> 6) & 14, 24960, 109560);
                str7 = str11;
                bVar = bVar;
                bVar.X(false);
            }
            bVar.X(true);
            str5 = str7;
            function4 = function6;
            i11 = i25;
            i12 = i17;
        } else {
            bVar = bVarI;
            bVar.G();
            i11 = i;
            function4 = function3;
            i12 = i7;
            str5 = str4;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mkf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    okf0.b(dVar, str, str5, i11, i12, function4, (a) obj, qj40.a(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }
}
