package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class ac8 {
    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void a(d dVar, final bt btVar, final nk0 nk0Var, imf0 imf0Var, int i, a aVar, final int i2, final int i3) {
        d dVar2;
        int i4;
        nk0 nk0Var2;
        imf0 imf0Var2;
        int i5;
        final imf0 imf0Var3;
        final int i6;
        imf0 imf0VarL;
        imf0 imf0Var4;
        int i7;
        int i8;
        boolean z;
        Object objY;
        int iOrdinal;
        int i9;
        boolean z2;
        Object objY2;
        int iOrdinal2;
        int i10;
        boolean z3;
        Object objY3;
        int iOrdinal3;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        b bVarI = aVar.i(91828702);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            dVar2 = dVar;
        } else if ((i2 & 6) == 0) {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i2;
        } else {
            dVar2 = dVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.d(btVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            nk0Var2 = nk0Var;
            i4 |= bVarI.M(nk0Var2) ? 256 : 128;
        } else {
            nk0Var2 = nk0Var;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                imf0Var2 = imf0Var;
                int i12 = bVarI.M(imf0Var2) ? 2048 : 1024;
                i4 |= i12;
            } else {
                imf0Var2 = imf0Var;
            }
            i4 |= i12;
        } else {
            imf0Var2 = imf0Var;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                int i13 = bVarI.d(i5) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i4 |= i13;
            } else {
                i5 = i;
            }
            i4 |= i13;
        } else {
            i5 = i;
        }
        boolean z4 = false;
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            bVarI.A0();
            int i14 = i2 & 1;
            d.a aVar3 = d.a.b;
            if (i14 == 0 || bVarI.h0()) {
                if (i11 != 0) {
                    dVar2 = aVar3;
                }
                if ((i3 & 8) != 0) {
                    imf0VarL = mla.l(R.style.B2_M, bVarI);
                    i4 &= -7169;
                } else {
                    imf0VarL = imf0Var2;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    imf0Var4 = imf0VarL;
                    i7 = R.drawable.ic_tips_fill;
                } else {
                    imf0Var4 = imf0VarL;
                }
                bVarI.Y();
                i8 = i4 & 112;
                if (i8 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z || objY == c0042a) {
                    iOrdinal = btVar.ordinal();
                    if (iOrdinal == 0) {
                        i9 = R.color.bg_info_secondary_v2;
                    } else if (iOrdinal == 1) {
                        i9 = R.color.bg_warning_secondary;
                    } else {
                        if (iOrdinal != 2) {
                            uhc.a();
                            return;
                        }
                        i9 = R.color.bg_danger_secondary;
                    }
                    objY = Integer.valueOf(i9);
                    bVarI.r(objY);
                }
                int iIntValue = ((Number) objY).intValue();
                if (i8 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    iOrdinal2 = btVar.ordinal();
                    if (iOrdinal2 == 0) {
                        i10 = R.color.icon_info_primary;
                    } else if (iOrdinal2 == 1) {
                        i10 = R.color.icon_highlight;
                    } else {
                        if (iOrdinal2 != 2) {
                            uhc.a();
                            return;
                        }
                        i10 = R.color.bg_brand_main_primary;
                    }
                    objY2 = Integer.valueOf(i10);
                    bVarI.r(objY2);
                }
                int iIntValue2 = ((Number) objY2).intValue();
                if (i8 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    iOrdinal3 = btVar.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 == 1 && iOrdinal3 != 2) {
                            uhc.a();
                            return;
                        }
                        z4 = true;
                    }
                    objY3 = Boolean.valueOf(z4);
                    bVarI.r(objY3);
                }
                boolean zBooleanValue = ((Boolean) objY3).booleanValue();
                d dVarG = h.g(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), c68.a(iIntValue, bVarI), zk40.a), 16.0f, 12.0f);
                d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, bVarI, 54);
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
                h6n.b(erz.a(i7, (i4 >> 12) & 14, bVarI), null, g3w.b(j.r(aVar3, 20.0f), zBooleanValue, new qb8(), bVarI, 6), c68.a(iIntValue2, bVarI), bVarI, 48, 0);
                lkf0.e(nk0Var2, null, c68.a(R.color.text_tertiary, bVarI), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0Var4, bVarI, (i4 >> 6) & 14, (i4 << 15) & 234881024, 262138);
                bVarI = bVarI;
                bVarI.X(true);
                i6 = i7;
                imf0Var3 = imf0Var4;
            } else {
                bVarI.G();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                imf0Var4 = imf0Var2;
            }
            i7 = i5;
            bVarI.Y();
            i8 = i4 & 112;
            if (i8 == 32) {
                z = true;
            } else {
                z = false;
            }
            objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z) {
                iOrdinal = btVar.ordinal();
                if (iOrdinal == 0) {
                    i9 = R.color.bg_info_secondary_v2;
                } else if (iOrdinal == 1) {
                    i9 = R.color.bg_warning_secondary;
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    i9 = R.color.bg_danger_secondary;
                }
                objY = Integer.valueOf(i9);
                bVarI.r(objY);
            } else {
                iOrdinal = btVar.ordinal();
                if (iOrdinal == 0) {
                    i9 = R.color.bg_info_secondary_v2;
                } else if (iOrdinal == 1) {
                    i9 = R.color.bg_warning_secondary;
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    i9 = R.color.bg_danger_secondary;
                }
                objY = Integer.valueOf(i9);
                bVarI.r(objY);
            }
            int iIntValue3 = ((Number) objY).intValue();
            if (i8 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objY2 = bVarI.y();
            if (z2) {
                iOrdinal2 = btVar.ordinal();
                if (iOrdinal2 == 0) {
                    i10 = R.color.icon_info_primary;
                } else if (iOrdinal2 == 1) {
                    i10 = R.color.icon_highlight;
                } else {
                    if (iOrdinal2 != 2) {
                        uhc.a();
                        return;
                    }
                    i10 = R.color.bg_brand_main_primary;
                }
                objY2 = Integer.valueOf(i10);
                bVarI.r(objY2);
            } else {
                iOrdinal2 = btVar.ordinal();
                if (iOrdinal2 == 0) {
                    i10 = R.color.icon_info_primary;
                } else if (iOrdinal2 == 1) {
                    i10 = R.color.icon_highlight;
                } else {
                    if (iOrdinal2 != 2) {
                        uhc.a();
                        return;
                    }
                    i10 = R.color.bg_brand_main_primary;
                }
                objY2 = Integer.valueOf(i10);
                bVarI.r(objY2);
            }
            int iIntValue4 = ((Number) objY2).intValue();
            if (i8 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objY3 = bVarI.y();
            if (z3) {
                iOrdinal3 = btVar.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                    }
                    z4 = true;
                }
                objY3 = Boolean.valueOf(z4);
                bVarI.r(objY3);
            } else {
                iOrdinal3 = btVar.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                    }
                    z4 = true;
                }
                objY3 = Boolean.valueOf(z4);
                bVarI.r(objY3);
            }
            boolean zBooleanValue2 = ((Boolean) objY3).booleanValue();
            d dVarG2 = h.g(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), c68.a(iIntValue3, bVarI), zk40.a), 16.0f, 12.0f);
            d160 d160VarA2 = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.k, bVarI, 54);
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
            h6n.b(erz.a(i7, (i4 >> 12) & 14, bVarI), null, g3w.b(j.r(aVar3, 20.0f), zBooleanValue2, new qb8(), bVarI, 6), c68.a(iIntValue4, bVarI), bVarI, 48, 0);
            lkf0.e(nk0Var2, null, c68.a(R.color.text_tertiary, bVarI), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0Var4, bVarI, (i4 >> 6) & 14, (i4 << 15) & 234881024, 262138);
            bVarI = bVarI;
            bVarI.X(true);
            i6 = i7;
            imf0Var3 = imf0Var4;
        } else {
            bVarI.G();
            imf0Var3 = imf0Var2;
            i6 = i5;
        }
        final d dVar3 = dVar2;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ac8.a(dVar3, btVar, nk0Var, imf0Var3, i6, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, bt btVar, final String str, a aVar, final int i) {
        final bt btVar2;
        str.getClass();
        b bVarI = aVar.i(662733327);
        int i2 = i | 6;
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            nk0 nk0Var = new nk0(str);
            d.a aVar2 = d.a.b;
            btVar2 = btVar;
            a(aVar2, btVar2, nk0Var, null, 0, bVarI, 54, 24);
            dVar = aVar2;
        } else {
            btVar2 = btVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ac8.b(dVar, btVar2, str, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, final int i2, final op8 op8Var, a aVar, boolean z) {
        boolean z2;
        int i3;
        final boolean z3;
        l35 l35VarA;
        b bVarI = aVar.i(-1383312625);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (bVarI.b(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            z3 = i4 != 0 ? false : z2;
            i060 i060VarC = j060.c(8.0f);
            long jA = c68.a(R.color.bg_secondary_d_lighter, bVarI);
            if (z3) {
                bVarI.N(2076437819);
                l35VarA = m35.a(1.0f, c68.a(R.color.border_primary, bVarI));
                bVarI.X(false);
            } else {
                bVarI.N(-54827186);
                bVarI.X(false);
                l35VarA = null;
            }
            ihe0.a(null, i060VarC, jA, 0L, 0.0f, 0.0f, l35VarA, op8Var, bVarI, 12582912, 57);
        } else {
            bVarI.G();
            z3 = z2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ac8.c(qj40.a(i | 1), i2, op8Var, (a) obj, z3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:103:0x011b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0168  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x017f  */
    /* JADX WARN: Code duplicated, block: B:112:0x018d  */
    /* JADX WARN: Code duplicated, block: B:115:0x019a  */
    /* JADX WARN: Code duplicated, block: B:116:0x01df  */
    /* JADX WARN: Code duplicated, block: B:119:0x0237  */
    /* JADX WARN: Code duplicated, block: B:120:0x0267  */
    /* JADX WARN: Code duplicated, block: B:123:0x0275  */
    /* JADX WARN: Code duplicated, block: B:124:0x0289  */
    /* JADX WARN: Code duplicated, block: B:126:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    public static final void d(d dVar, final String str, Function0<Unit> function0, Function0<Unit> function1, boolean z, boolean z2, boolean z3, a aVar, final int i, final int i2) {
        int i3;
        String str2;
        Function0<Unit> function2;
        int i4;
        Function0<Unit> function3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        boolean z5;
        final d dVar2;
        final Function0<Unit> function4;
        final Function0<Unit> function5;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        b bVar;
        e eVarZ;
        d.a aVar2;
        d dVar3;
        Object obj;
        Function0<Unit> function6;
        boolean z9;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        ?? r1;
        boolean z10;
        b bVar2;
        Object objY;
        Object objY2;
        b bVarI = aVar.i(-402029069);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= bVarI.M(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i14 = i2 & 4;
        if (i14 == 0) {
            if ((i & 384) == 0) {
                function2 = function0;
                i3 |= bVarI.A(function2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                i6 = i3 | 3072;
                function3 = function1;
            } else {
                function3 = function1;
                if (bVarI.A(function3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i6 = i3 | i5;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.b(z)) {
                        i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((196608 & i) == 0) {
                        z4 = z2;
                        if (bVarI.b(z4)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i6 |= i10;
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        if ((1572864 & i) == 0) {
                            if (bVarI.b(z3)) {
                                i12 = 1048576;
                            } else {
                                i12 = 524288;
                            }
                            i6 |= i12;
                        }
                        if ((i6 & 599187) != 599186) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (bVarI.q(i6 & 1, z5)) {
                            aVar2 = d.a.b;
                            if (i13 != 0) {
                                dVar3 = aVar2;
                            } else {
                                dVar3 = dVar;
                            }
                            obj = a.C0041a.a;
                            if (i14 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == obj) {
                                    objY2 = new lb8();
                                    bVarI.r(objY2);
                                }
                                function6 = (Function0) objY2;
                            } else {
                                function6 = function2;
                            }
                            if (i4 != 0) {
                                objY = bVarI.y();
                                if (objY == obj) {
                                    objY = new mb8(0);
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            }
                            if (i7 != 0) {
                                z7 = false;
                            } else {
                                z7 = z;
                            }
                            if (i9 != 0) {
                                z6 = false;
                            } else {
                                z6 = z4;
                            }
                            if (i11 != 0) {
                                z9 = false;
                            } else {
                                z9 = z3;
                            }
                            d dVarH = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                            d160 d160VarA = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                            iHashCode = Long.hashCode(bVarI.T);
                            ne00 ne00VarS = bVarI.S();
                            d dVarC = c.c(bVarI, dVarH);
                            yka.k.getClass();
                            aVar3 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar3);
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
                            if (z7) {
                                bVarI.N(923812456);
                                z10 = true;
                                r1 = 0;
                                h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                                bVarI.X(false);
                            } else {
                                r1 = 0;
                                z10 = true;
                                bVarI.N(924255787);
                                bVarI.X(false);
                            }
                            lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                            bVar2 = bVarI;
                            if (z6) {
                                bVar2.N(924592974);
                                h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                                bVar2.X(r1);
                            } else {
                                bVar2.N(925030539);
                                bVar2.X(r1);
                            }
                            bVar2.X(z10);
                            if (z9) {
                                bVar2.N(1817740860);
                                f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                                bVar2.X(r1);
                            } else {
                                bVar2.N(1817820623);
                                bVar2.X(r1);
                            }
                            dVar2 = dVar3;
                            function4 = function6;
                            function5 = function3;
                            z8 = z9;
                            bVar = bVar2;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            function4 = function2;
                            function5 = function3;
                            z6 = z4;
                            z7 = z;
                            z8 = z3;
                            bVar = bVarI;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: nb8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i6 |= 1572864;
                    if ((i6 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (bVarI.q(i6 & 1, z5)) {
                        aVar2 = d.a.b;
                        if (i13 != 0) {
                            dVar3 = aVar2;
                        } else {
                            dVar3 = dVar;
                        }
                        obj = a.C0041a.a;
                        if (i14 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == obj) {
                                objY2 = new lb8();
                                bVarI.r(objY2);
                            }
                            function6 = (Function0) objY2;
                        } else {
                            function6 = function2;
                        }
                        if (i4 != 0) {
                            objY = bVarI.y();
                            if (objY == obj) {
                                objY = new mb8(0);
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        }
                        if (i7 != 0) {
                            z7 = false;
                        } else {
                            z7 = z;
                        }
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i11 != 0) {
                            z9 = false;
                        } else {
                            z9 = z3;
                        }
                        d dVarH2 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                        d160 d160VarA2 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        d dVarC2 = c.c(bVarI, dVarH2);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar3);
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
                        if (z7) {
                            bVarI.N(923812456);
                            z10 = true;
                            r1 = 0;
                            h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                            bVarI.X(false);
                        } else {
                            r1 = 0;
                            z10 = true;
                            bVarI.N(924255787);
                            bVarI.X(false);
                        }
                        lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                        bVar2 = bVarI;
                        if (z6) {
                            bVar2.N(924592974);
                            h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            bVar2.X(r1);
                        } else {
                            bVar2.N(925030539);
                            bVar2.X(r1);
                        }
                        bVar2.X(z10);
                        if (z9) {
                            bVar2.N(1817740860);
                            f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                            bVar2.X(r1);
                        } else {
                            bVar2.N(1817820623);
                            bVar2.X(r1);
                        }
                        dVar2 = dVar3;
                        function4 = function6;
                        function5 = function3;
                        z8 = z9;
                        bVar = bVar2;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        z6 = z4;
                        z7 = z;
                        z8 = z3;
                        bVar = bVarI;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: nb8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 196608;
                z4 = z2;
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.b(z3)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i6 |= i12;
                    }
                    if ((i6 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (bVarI.q(i6 & 1, z5)) {
                        aVar2 = d.a.b;
                        if (i13 != 0) {
                            dVar3 = aVar2;
                        } else {
                            dVar3 = dVar;
                        }
                        obj = a.C0041a.a;
                        if (i14 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == obj) {
                                objY2 = new lb8();
                                bVarI.r(objY2);
                            }
                            function6 = (Function0) objY2;
                        } else {
                            function6 = function2;
                        }
                        if (i4 != 0) {
                            objY = bVarI.y();
                            if (objY == obj) {
                                objY = new mb8(0);
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        }
                        if (i7 != 0) {
                            z7 = false;
                        } else {
                            z7 = z;
                        }
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i11 != 0) {
                            z9 = false;
                        } else {
                            z9 = z3;
                        }
                        d dVarH3 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                        d160 d160VarA3 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS3 = bVarI.S();
                        d dVarC3 = c.c(bVarI, dVarH3);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar3);
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
                        if (z7) {
                            bVarI.N(923812456);
                            z10 = true;
                            r1 = 0;
                            h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                            bVarI.X(false);
                        } else {
                            r1 = 0;
                            z10 = true;
                            bVarI.N(924255787);
                            bVarI.X(false);
                        }
                        lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                        bVar2 = bVarI;
                        if (z6) {
                            bVar2.N(924592974);
                            h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            bVar2.X(r1);
                        } else {
                            bVar2.N(925030539);
                            bVar2.X(r1);
                        }
                        bVar2.X(z10);
                        if (z9) {
                            bVar2.N(1817740860);
                            f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                            bVar2.X(r1);
                        } else {
                            bVar2.N(1817820623);
                            bVar2.X(r1);
                        }
                        dVar2 = dVar3;
                        function4 = function6;
                        function5 = function3;
                        z8 = z9;
                        bVar = bVar2;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        z6 = z4;
                        z7 = z;
                        z8 = z3;
                        bVar = bVarI;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: nb8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                if ((i6 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i6 & 1, z5)) {
                    aVar2 = d.a.b;
                    if (i13 != 0) {
                        dVar3 = aVar2;
                    } else {
                        dVar3 = dVar;
                    }
                    obj = a.C0041a.a;
                    if (i14 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == obj) {
                            objY2 = new lb8();
                            bVarI.r(objY2);
                        }
                        function6 = (Function0) objY2;
                    } else {
                        function6 = function2;
                    }
                    if (i4 != 0) {
                        objY = bVarI.y();
                        if (objY == obj) {
                            objY = new mb8(0);
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    }
                    if (i7 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    d dVarH4 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                    d160 d160VarA4 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = c.c(bVarI, dVarH4);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
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
                    if (z7) {
                        bVarI.N(923812456);
                        z10 = true;
                        r1 = 0;
                        h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    } else {
                        r1 = 0;
                        z10 = true;
                        bVarI.N(924255787);
                        bVarI.X(false);
                    }
                    lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                    bVar2 = bVarI;
                    if (z6) {
                        bVar2.N(924592974);
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        bVar2.X(r1);
                    } else {
                        bVar2.N(925030539);
                        bVar2.X(r1);
                    }
                    bVar2.X(z10);
                    if (z9) {
                        bVar2.N(1817740860);
                        f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                        bVar2.X(r1);
                    } else {
                        bVar2.N(1817820623);
                        bVar2.X(r1);
                    }
                    dVar2 = dVar3;
                    function4 = function6;
                    function5 = function3;
                    z8 = z9;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    z6 = z4;
                    z7 = z;
                    z8 = z3;
                    bVar = bVarI;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nb8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    z4 = z2;
                    if (bVarI.b(z4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i6 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.b(z3)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i6 |= i12;
                    }
                    if ((i6 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (bVarI.q(i6 & 1, z5)) {
                        aVar2 = d.a.b;
                        if (i13 != 0) {
                            dVar3 = aVar2;
                        } else {
                            dVar3 = dVar;
                        }
                        obj = a.C0041a.a;
                        if (i14 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == obj) {
                                objY2 = new lb8();
                                bVarI.r(objY2);
                            }
                            function6 = (Function0) objY2;
                        } else {
                            function6 = function2;
                        }
                        if (i4 != 0) {
                            objY = bVarI.y();
                            if (objY == obj) {
                                objY = new mb8(0);
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        }
                        if (i7 != 0) {
                            z7 = false;
                        } else {
                            z7 = z;
                        }
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i11 != 0) {
                            z9 = false;
                        } else {
                            z9 = z3;
                        }
                        d dVarH5 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                        d160 d160VarA5 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS5 = bVarI.S();
                        d dVarC5 = c.c(bVarI, dVarH5);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar3);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA5, yka.a.f);
                        hlh0.a(bVarI, ne00VarS5, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        hlh0.a(bVarI, dVarC5, yka.a.d);
                        if (z7) {
                            bVarI.N(923812456);
                            z10 = true;
                            r1 = 0;
                            h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                            bVarI.X(false);
                        } else {
                            r1 = 0;
                            z10 = true;
                            bVarI.N(924255787);
                            bVarI.X(false);
                        }
                        lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                        bVar2 = bVarI;
                        if (z6) {
                            bVar2.N(924592974);
                            h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            bVar2.X(r1);
                        } else {
                            bVar2.N(925030539);
                            bVar2.X(r1);
                        }
                        bVar2.X(z10);
                        if (z9) {
                            bVar2.N(1817740860);
                            f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                            bVar2.X(r1);
                        } else {
                            bVar2.N(1817820623);
                            bVar2.X(r1);
                        }
                        dVar2 = dVar3;
                        function4 = function6;
                        function5 = function3;
                        z8 = z9;
                        bVar = bVar2;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        z6 = z4;
                        z7 = z;
                        z8 = z3;
                        bVar = bVarI;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: nb8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                if ((i6 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i6 & 1, z5)) {
                    aVar2 = d.a.b;
                    if (i13 != 0) {
                        dVar3 = aVar2;
                    } else {
                        dVar3 = dVar;
                    }
                    obj = a.C0041a.a;
                    if (i14 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == obj) {
                            objY2 = new lb8();
                            bVarI.r(objY2);
                        }
                        function6 = (Function0) objY2;
                    } else {
                        function6 = function2;
                    }
                    if (i4 != 0) {
                        objY = bVarI.y();
                        if (objY == obj) {
                            objY = new mb8(0);
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    }
                    if (i7 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    d dVarH6 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                    d160 d160VarA6 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS6 = bVarI.S();
                    d dVarC6 = c.c(bVarI, dVarH6);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA6, yka.a.f);
                    hlh0.a(bVarI, ne00VarS6, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC6, yka.a.d);
                    if (z7) {
                        bVarI.N(923812456);
                        z10 = true;
                        r1 = 0;
                        h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    } else {
                        r1 = 0;
                        z10 = true;
                        bVarI.N(924255787);
                        bVarI.X(false);
                    }
                    lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                    bVar2 = bVarI;
                    if (z6) {
                        bVar2.N(924592974);
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        bVar2.X(r1);
                    } else {
                        bVar2.N(925030539);
                        bVar2.X(r1);
                    }
                    bVar2.X(z10);
                    if (z9) {
                        bVar2.N(1817740860);
                        f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                        bVar2.X(r1);
                    } else {
                        bVar2.N(1817820623);
                        bVar2.X(r1);
                    }
                    dVar2 = dVar3;
                    function4 = function6;
                    function5 = function3;
                    z8 = z9;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    z6 = z4;
                    z7 = z;
                    z8 = z3;
                    bVar = bVarI;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nb8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z4 = z2;
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.b(z3)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i6 |= i12;
                }
                if ((i6 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i6 & 1, z5)) {
                    aVar2 = d.a.b;
                    if (i13 != 0) {
                        dVar3 = aVar2;
                    } else {
                        dVar3 = dVar;
                    }
                    obj = a.C0041a.a;
                    if (i14 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == obj) {
                            objY2 = new lb8();
                            bVarI.r(objY2);
                        }
                        function6 = (Function0) objY2;
                    } else {
                        function6 = function2;
                    }
                    if (i4 != 0) {
                        objY = bVarI.y();
                        if (objY == obj) {
                            objY = new mb8(0);
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    }
                    if (i7 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    d dVarH7 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                    d160 d160VarA7 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS7 = bVarI.S();
                    d dVarC7 = c.c(bVarI, dVarH7);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA7, yka.a.f);
                    hlh0.a(bVarI, ne00VarS7, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC7, yka.a.d);
                    if (z7) {
                        bVarI.N(923812456);
                        z10 = true;
                        r1 = 0;
                        h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    } else {
                        r1 = 0;
                        z10 = true;
                        bVarI.N(924255787);
                        bVarI.X(false);
                    }
                    lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                    bVar2 = bVarI;
                    if (z6) {
                        bVar2.N(924592974);
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        bVar2.X(r1);
                    } else {
                        bVar2.N(925030539);
                        bVar2.X(r1);
                    }
                    bVar2.X(z10);
                    if (z9) {
                        bVar2.N(1817740860);
                        f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                        bVar2.X(r1);
                    } else {
                        bVar2.N(1817820623);
                        bVar2.X(r1);
                    }
                    dVar2 = dVar3;
                    function4 = function6;
                    function5 = function3;
                    z8 = z9;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    z6 = z4;
                    z7 = z;
                    z8 = z3;
                    bVar = bVarI;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nb8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 1572864;
            if ((i6 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i6 & 1, z5)) {
                aVar2 = d.a.b;
                if (i13 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar;
                }
                obj = a.C0041a.a;
                if (i14 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == obj) {
                        objY2 = new lb8();
                        bVarI.r(objY2);
                    }
                    function6 = (Function0) objY2;
                } else {
                    function6 = function2;
                }
                if (i4 != 0) {
                    objY = bVarI.y();
                    if (objY == obj) {
                        objY = new mb8(0);
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                }
                if (i7 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i11 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                d dVarH8 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                d160 d160VarA8 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC8 = c.c(bVarI, dVarH8);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA8, yka.a.f);
                hlh0.a(bVarI, ne00VarS8, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC8, yka.a.d);
                if (z7) {
                    bVarI.N(923812456);
                    z10 = true;
                    r1 = 0;
                    h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                    bVarI.X(false);
                } else {
                    r1 = 0;
                    z10 = true;
                    bVarI.N(924255787);
                    bVarI.X(false);
                }
                lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                bVar2 = bVarI;
                if (z6) {
                    bVar2.N(924592974);
                    h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    bVar2.X(r1);
                } else {
                    bVar2.N(925030539);
                    bVar2.X(r1);
                }
                bVar2.X(z10);
                if (z9) {
                    bVar2.N(1817740860);
                    f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                    bVar2.X(r1);
                } else {
                    bVar2.N(1817820623);
                    bVar2.X(r1);
                }
                dVar2 = dVar3;
                function4 = function6;
                function5 = function3;
                z8 = z9;
                bVar = bVar2;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                z6 = z4;
                z7 = z;
                z8 = z3;
                bVar = bVarI;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nb8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        function2 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
            i6 = i3 | 3072;
            function3 = function1;
        } else {
            function3 = function1;
            if (bVarI.A(function3)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i6 = i3 | i5;
        }
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 24576) == 0) {
                if (bVarI.b(z)) {
                    i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((196608 & i) == 0) {
                    z4 = z2;
                    if (bVarI.b(z4)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i6 |= i10;
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    if ((1572864 & i) == 0) {
                        if (bVarI.b(z3)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i6 |= i12;
                    }
                    if ((i6 & 599187) != 599186) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (bVarI.q(i6 & 1, z5)) {
                        aVar2 = d.a.b;
                        if (i13 != 0) {
                            dVar3 = aVar2;
                        } else {
                            dVar3 = dVar;
                        }
                        obj = a.C0041a.a;
                        if (i14 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == obj) {
                                objY2 = new lb8();
                                bVarI.r(objY2);
                            }
                            function6 = (Function0) objY2;
                        } else {
                            function6 = function2;
                        }
                        if (i4 != 0) {
                            objY = bVarI.y();
                            if (objY == obj) {
                                objY = new mb8(0);
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        }
                        if (i7 != 0) {
                            z7 = false;
                        } else {
                            z7 = z;
                        }
                        if (i9 != 0) {
                            z6 = false;
                        } else {
                            z6 = z4;
                        }
                        if (i11 != 0) {
                            z9 = false;
                        } else {
                            z9 = z3;
                        }
                        d dVarH9 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                        d160 d160VarA9 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS9 = bVarI.S();
                        d dVarC9 = c.c(bVarI, dVarH9);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar3);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA9, yka.a.f);
                        hlh0.a(bVarI, ne00VarS9, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        hlh0.a(bVarI, dVarC9, yka.a.d);
                        if (z7) {
                            bVarI.N(923812456);
                            z10 = true;
                            r1 = 0;
                            h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                            bVarI.X(false);
                        } else {
                            r1 = 0;
                            z10 = true;
                            bVarI.N(924255787);
                            bVarI.X(false);
                        }
                        lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                        bVar2 = bVarI;
                        if (z6) {
                            bVar2.N(924592974);
                            h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                            bVar2.X(r1);
                        } else {
                            bVar2.N(925030539);
                            bVar2.X(r1);
                        }
                        bVar2.X(z10);
                        if (z9) {
                            bVar2.N(1817740860);
                            f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                            bVar2.X(r1);
                        } else {
                            bVar2.N(1817820623);
                            bVar2.X(r1);
                        }
                        dVar2 = dVar3;
                        function4 = function6;
                        function5 = function3;
                        z8 = z9;
                        bVar = bVar2;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        function4 = function2;
                        function5 = function3;
                        z6 = z4;
                        z7 = z;
                        z8 = z3;
                        bVar = bVarI;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: nb8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                if ((i6 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i6 & 1, z5)) {
                    aVar2 = d.a.b;
                    if (i13 != 0) {
                        dVar3 = aVar2;
                    } else {
                        dVar3 = dVar;
                    }
                    obj = a.C0041a.a;
                    if (i14 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == obj) {
                            objY2 = new lb8();
                            bVarI.r(objY2);
                        }
                        function6 = (Function0) objY2;
                    } else {
                        function6 = function2;
                    }
                    if (i4 != 0) {
                        objY = bVarI.y();
                        if (objY == obj) {
                            objY = new mb8(0);
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    }
                    if (i7 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    d dVarH10 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                    d160 d160VarA10 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS10 = bVarI.S();
                    d dVarC10 = c.c(bVarI, dVarH10);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA10, yka.a.f);
                    hlh0.a(bVarI, ne00VarS10, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC10, yka.a.d);
                    if (z7) {
                        bVarI.N(923812456);
                        z10 = true;
                        r1 = 0;
                        h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    } else {
                        r1 = 0;
                        z10 = true;
                        bVarI.N(924255787);
                        bVarI.X(false);
                    }
                    lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                    bVar2 = bVarI;
                    if (z6) {
                        bVar2.N(924592974);
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        bVar2.X(r1);
                    } else {
                        bVar2.N(925030539);
                        bVar2.X(r1);
                    }
                    bVar2.X(z10);
                    if (z9) {
                        bVar2.N(1817740860);
                        f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                        bVar2.X(r1);
                    } else {
                        bVar2.N(1817820623);
                        bVar2.X(r1);
                    }
                    dVar2 = dVar3;
                    function4 = function6;
                    function5 = function3;
                    z8 = z9;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    z6 = z4;
                    z7 = z;
                    z8 = z3;
                    bVar = bVarI;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nb8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z4 = z2;
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.b(z3)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i6 |= i12;
                }
                if ((i6 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i6 & 1, z5)) {
                    aVar2 = d.a.b;
                    if (i13 != 0) {
                        dVar3 = aVar2;
                    } else {
                        dVar3 = dVar;
                    }
                    obj = a.C0041a.a;
                    if (i14 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == obj) {
                            objY2 = new lb8();
                            bVarI.r(objY2);
                        }
                        function6 = (Function0) objY2;
                    } else {
                        function6 = function2;
                    }
                    if (i4 != 0) {
                        objY = bVarI.y();
                        if (objY == obj) {
                            objY = new mb8(0);
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    }
                    if (i7 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    d dVarH11 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                    d160 d160VarA11 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS11 = bVarI.S();
                    d dVarC11 = c.c(bVarI, dVarH11);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA11, yka.a.f);
                    hlh0.a(bVarI, ne00VarS11, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC11, yka.a.d);
                    if (z7) {
                        bVarI.N(923812456);
                        z10 = true;
                        r1 = 0;
                        h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    } else {
                        r1 = 0;
                        z10 = true;
                        bVarI.N(924255787);
                        bVarI.X(false);
                    }
                    lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                    bVar2 = bVarI;
                    if (z6) {
                        bVar2.N(924592974);
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        bVar2.X(r1);
                    } else {
                        bVar2.N(925030539);
                        bVar2.X(r1);
                    }
                    bVar2.X(z10);
                    if (z9) {
                        bVar2.N(1817740860);
                        f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                        bVar2.X(r1);
                    } else {
                        bVar2.N(1817820623);
                        bVar2.X(r1);
                    }
                    dVar2 = dVar3;
                    function4 = function6;
                    function5 = function3;
                    z8 = z9;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    z6 = z4;
                    z7 = z;
                    z8 = z3;
                    bVar = bVarI;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nb8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 1572864;
            if ((i6 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i6 & 1, z5)) {
                aVar2 = d.a.b;
                if (i13 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar;
                }
                obj = a.C0041a.a;
                if (i14 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == obj) {
                        objY2 = new lb8();
                        bVarI.r(objY2);
                    }
                    function6 = (Function0) objY2;
                } else {
                    function6 = function2;
                }
                if (i4 != 0) {
                    objY = bVarI.y();
                    if (objY == obj) {
                        objY = new mb8(0);
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                }
                if (i7 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i11 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                d dVarH12 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                d160 d160VarA12 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS12 = bVarI.S();
                d dVarC12 = c.c(bVarI, dVarH12);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA12, yka.a.f);
                hlh0.a(bVarI, ne00VarS12, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC12, yka.a.d);
                if (z7) {
                    bVarI.N(923812456);
                    z10 = true;
                    r1 = 0;
                    h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                    bVarI.X(false);
                } else {
                    r1 = 0;
                    z10 = true;
                    bVarI.N(924255787);
                    bVarI.X(false);
                }
                lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                bVar2 = bVarI;
                if (z6) {
                    bVar2.N(924592974);
                    h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    bVar2.X(r1);
                } else {
                    bVar2.N(925030539);
                    bVar2.X(r1);
                }
                bVar2.X(z10);
                if (z9) {
                    bVar2.N(1817740860);
                    f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                    bVar2.X(r1);
                } else {
                    bVar2.N(1817820623);
                    bVar2.X(r1);
                }
                dVar2 = dVar3;
                function4 = function6;
                function5 = function3;
                z8 = z9;
                bVar = bVar2;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                z6 = z4;
                z7 = z;
                z8 = z3;
                bVar = bVarI;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nb8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 24576;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((196608 & i) == 0) {
                z4 = z2;
                if (bVarI.b(z4)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i6 |= i10;
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                if ((1572864 & i) == 0) {
                    if (bVarI.b(z3)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i6 |= i12;
                }
                if ((i6 & 599187) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i6 & 1, z5)) {
                    aVar2 = d.a.b;
                    if (i13 != 0) {
                        dVar3 = aVar2;
                    } else {
                        dVar3 = dVar;
                    }
                    obj = a.C0041a.a;
                    if (i14 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == obj) {
                            objY2 = new lb8();
                            bVarI.r(objY2);
                        }
                        function6 = (Function0) objY2;
                    } else {
                        function6 = function2;
                    }
                    if (i4 != 0) {
                        objY = bVarI.y();
                        if (objY == obj) {
                            objY = new mb8(0);
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    }
                    if (i7 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i9 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    d dVarH13 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                    d160 d160VarA13 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS13 = bVarI.S();
                    d dVarC13 = c.c(bVarI, dVarH13);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA13, yka.a.f);
                    hlh0.a(bVarI, ne00VarS13, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC13, yka.a.d);
                    if (z7) {
                        bVarI.N(923812456);
                        z10 = true;
                        r1 = 0;
                        h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    } else {
                        r1 = 0;
                        z10 = true;
                        bVarI.N(924255787);
                        bVarI.X(false);
                    }
                    lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                    bVar2 = bVarI;
                    if (z6) {
                        bVar2.N(924592974);
                        h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                        bVar2.X(r1);
                    } else {
                        bVar2.N(925030539);
                        bVar2.X(r1);
                    }
                    bVar2.X(z10);
                    if (z9) {
                        bVar2.N(1817740860);
                        f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                        bVar2.X(r1);
                    } else {
                        bVar2.N(1817820623);
                        bVar2.X(r1);
                    }
                    dVar2 = dVar3;
                    function4 = function6;
                    function5 = function3;
                    z8 = z9;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    function4 = function2;
                    function5 = function3;
                    z6 = z4;
                    z7 = z;
                    z8 = z3;
                    bVar = bVarI;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: nb8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 1572864;
            if ((i6 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i6 & 1, z5)) {
                aVar2 = d.a.b;
                if (i13 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar;
                }
                obj = a.C0041a.a;
                if (i14 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == obj) {
                        objY2 = new lb8();
                        bVarI.r(objY2);
                    }
                    function6 = (Function0) objY2;
                } else {
                    function6 = function2;
                }
                if (i4 != 0) {
                    objY = bVarI.y();
                    if (objY == obj) {
                        objY = new mb8(0);
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                }
                if (i7 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i11 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                d dVarH14 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                d160 d160VarA14 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS14 = bVarI.S();
                d dVarC14 = c.c(bVarI, dVarH14);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA14, yka.a.f);
                hlh0.a(bVarI, ne00VarS14, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC14, yka.a.d);
                if (z7) {
                    bVarI.N(923812456);
                    z10 = true;
                    r1 = 0;
                    h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                    bVarI.X(false);
                } else {
                    r1 = 0;
                    z10 = true;
                    bVarI.N(924255787);
                    bVarI.X(false);
                }
                lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                bVar2 = bVarI;
                if (z6) {
                    bVar2.N(924592974);
                    h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    bVar2.X(r1);
                } else {
                    bVar2.N(925030539);
                    bVar2.X(r1);
                }
                bVar2.X(z10);
                if (z9) {
                    bVar2.N(1817740860);
                    f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                    bVar2.X(r1);
                } else {
                    bVar2.N(1817820623);
                    bVar2.X(r1);
                }
                dVar2 = dVar3;
                function4 = function6;
                function5 = function3;
                z8 = z9;
                bVar = bVar2;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                z6 = z4;
                z7 = z;
                z8 = z3;
                bVar = bVarI;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nb8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 196608;
        z4 = z2;
        i11 = i2 & 64;
        if (i11 != 0) {
            if ((1572864 & i) == 0) {
                if (bVarI.b(z3)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i6 |= i12;
            }
            if ((i6 & 599187) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i6 & 1, z5)) {
                aVar2 = d.a.b;
                if (i13 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar;
                }
                obj = a.C0041a.a;
                if (i14 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == obj) {
                        objY2 = new lb8();
                        bVarI.r(objY2);
                    }
                    function6 = (Function0) objY2;
                } else {
                    function6 = function2;
                }
                if (i4 != 0) {
                    objY = bVarI.y();
                    if (objY == obj) {
                        objY = new mb8(0);
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                }
                if (i7 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (i11 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                d dVarH15 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
                d160 d160VarA15 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS15 = bVarI.S();
                d dVarC15 = c.c(bVarI, dVarH15);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA15, yka.a.f);
                hlh0.a(bVarI, ne00VarS15, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC15, yka.a.d);
                if (z7) {
                    bVarI.N(923812456);
                    z10 = true;
                    r1 = 0;
                    h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                    bVarI.X(false);
                } else {
                    r1 = 0;
                    z10 = true;
                    bVarI.N(924255787);
                    bVarI.X(false);
                }
                lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
                bVar2 = bVarI;
                if (z6) {
                    bVar2.N(924592974);
                    h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                    bVar2.X(r1);
                } else {
                    bVar2.N(925030539);
                    bVar2.X(r1);
                }
                bVar2.X(z10);
                if (z9) {
                    bVar2.N(1817740860);
                    f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                    bVar2.X(r1);
                } else {
                    bVar2.N(1817820623);
                    bVar2.X(r1);
                }
                dVar2 = dVar3;
                function4 = function6;
                function5 = function3;
                z8 = z9;
                bVar = bVar2;
            } else {
                bVarI.G();
                dVar2 = dVar;
                function4 = function2;
                function5 = function3;
                z6 = z4;
                z7 = z;
                z8 = z3;
                bVar = bVarI;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: nb8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 1572864;
        if ((i6 & 599187) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVarI.q(i6 & 1, z5)) {
            aVar2 = d.a.b;
            if (i13 != 0) {
                dVar3 = aVar2;
            } else {
                dVar3 = dVar;
            }
            obj = a.C0041a.a;
            if (i14 != 0) {
                objY2 = bVarI.y();
                if (objY2 == obj) {
                    objY2 = new lb8();
                    bVarI.r(objY2);
                }
                function6 = (Function0) objY2;
            } else {
                function6 = function2;
            }
            if (i4 != 0) {
                objY = bVarI.y();
                if (objY == obj) {
                    objY = new mb8(0);
                    bVarI.r(objY);
                }
                function3 = (Function0) objY;
            }
            if (i7 != 0) {
                z7 = false;
            } else {
                z7 = z;
            }
            if (i9 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (i11 != 0) {
                z9 = false;
            } else {
                z9 = z3;
            }
            d dVarH16 = g3w.h(h.i(androidx.compose.foundation.a.b(dVar3, c68.a(R.color.bg_primary_d_base, bVarI), zk40.a), 20.0f, 16.0f, 20.0f, 12.0f), "common_title_bar");
            d160 d160VarA16 = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.j, bVarI, 6);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS16 = bVarI.S();
            d dVarC16 = c.c(bVarI, dVarH16);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA16, yka.a.f);
            hlh0.a(bVarI, ne00VarS16, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC16, yka.a.d);
            if (z7) {
                bVarI.N(923812456);
                z10 = true;
                r1 = 0;
                h6n.b(erz.a(R.drawable.ic_arrow_chevron_left, 0, bVarI), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), true, function6), "common_title_bar_icon_arrow_left"), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
                bVarI.X(false);
            } else {
                r1 = 0;
                z10 = true;
                bVarI.N(924255787);
                bVarI.X(false);
            }
            lkf0.d(str2, g3w.h(new LayoutWeightElement(1.0f, z10), "common_title_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, (i6 >> 3) & 14, 0, 131064);
            bVar2 = bVarI;
            if (z6) {
                bVar2.N(924592974);
                h6n.b(erz.a(R.drawable.ic_icon_cancel, r1, bVar2), null, g3w.h(g3w.f(j.r(aVar2, 20.0f), z10, function3), "common_title_bar_icon_close"), c68.a(R.color.icon_secondary, bVar2), bVar2, 48, 0);
                bVar2.X(r1);
            } else {
                bVar2.N(925030539);
                bVar2.X(r1);
            }
            bVar2.X(z10);
            if (z9) {
                bVar2.N(1817740860);
                f(6, r1, bVar2, g3w.h(aVar2, "common_title_bar_divider"));
                bVar2.X(r1);
            } else {
                bVar2.N(1817820623);
                bVar2.X(r1);
            }
            dVar2 = dVar3;
            function4 = function6;
            function5 = function3;
            z8 = z9;
            bVar = bVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
            function4 = function2;
            function5 = function3;
            z6 = z4;
            z7 = z;
            z8 = z3;
            bVar = bVarI;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ac8.d(dVar2, str, function4, function5, z7, z6, z8, (a) obj2, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(903183114);
        if (bVarI.q(i & 1, i != 0)) {
            long jA = c68.a(R.color.bg_surface_secondary, bVarI);
            i060 i060VarC = j060.c(2.0f);
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(h.g(androidx.compose.foundation.a.b(aVar2, jA, i060VarC), 4.0f, 2.0f), "default_label");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            lkf0.d(cb40.a(R.string.common_functions__default, new Object[0], bVarI), g3w.h(aVar2, "default_label_text"), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new pb8();
        }
    }

    public static final void f(final int i, final int i2, a aVar, final d dVar) {
        int i3;
        b bVarI = aVar.i(1704342333);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                dVar = d.a.b;
            }
            ute.b(j.g(dVar, 1.0f), 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ob8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ac8.f(qj40.a(i | 1), i2, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(50021036);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarB = androidx.compose.foundation.a.b(dVar, j58.c(0.7f, c68.a(R.color.background_type1_quaternary, bVarI)), zk40.a);
            Unit unit = Unit.a;
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = zb8.a;
                bVarI.r(objY);
            }
            d dVarA = wje0.a(dVarB, unit, (PointerInputEventHandler) objY);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            q330.a(null, c68.a(R.color.colorPrimary, bVarI), 4.0f, 0L, 0, 0.0f, bVarI, 384, 57);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: kb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ac8.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final float f, yle yleVar, final Function0 function0, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        final yle yleVar2;
        b bVarI = aVar.i(32970583);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        if ((i & 384) == 0) {
            i5 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                f = 0.9f;
            }
            yle yleVar3 = new yle(true, false, false);
            u60.a(function0, yleVar3, pp8.b(-187895520, new Function2() { // from class: sb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ac8.i(f, op8Var, (a) obj, iIntValue);
                }
            }, bVarI), bVarI, ((i5 >> 6) & 14) | 384 | (i5 & 112), 0);
            yleVar2 = yleVar3;
        } else {
            bVarI.G();
            yleVar2 = yleVar;
        }
        final float f2 = f;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ac8.h(f2, yleVar2, function0, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final Unit i(float f, op8 op8Var, a aVar, int i) {
        if (aVar.q(i & 1, (i & 3) != 2)) {
            ViewParent parent = ((View) aVar.O(AndroidCompositionLocals_androidKt.f)).getParent();
            parent.getClass();
            eme emeVar = (eme) parent;
            emeVar.getWindow().setGravity(80);
            if (Build.VERSION.SDK_INT >= 30) {
                emeVar.getWindow().setDecorFitsSystemWindows(false);
            }
            float f2 = ((Configuration) aVar.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
            Object objY = aVar.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new g7f(f2 * f);
                aVar.r(objY);
            }
            final float f3 = ((g7f) objY).a;
            d dVarB = g3w.b(j.g(d.a.b, 1.0f), f < 1.0f, new gaj() { // from class: ub8
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    d dVar = (d) obj;
                    a aVar2 = (a) obj2;
                    e3w.a((Integer) obj3, dVar, aVar2, -687421793);
                    d dVarI = j.i(dVar, f3);
                    aVar2.H();
                    return dVarI;
                }
            }, aVar, 6);
            Object objY2 = aVar.y();
            if (objY2 == c0042a) {
                objY2 = new vb8(0);
                aVar.r(objY2);
            }
            d dVarB2 = xa80.b(dVarB, false, (Function1) objY2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarB2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar2);
            } else {
                aVar.p();
            }
            hlh0.a(aVar, aivVarC, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            fc0.a(0, op8Var, aVar);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    public static final void j(final Function0 function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1911710515);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic_delete_bucket, 0, bVarI), "delete icon", g3w.h(g3w.f(j.r(d.a.b, 20.0f), true, function0), "saved_asset_delete_button_icon"), c68.a(R.color.text_secondary, bVarI), bVarI, 48, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ib8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ac8.j(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void k(d dVar, long j, final op8 op8Var, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        long jA;
        int i4;
        boolean z;
        final d dVar3;
        final long j2;
        e eVarZ;
        d dVar4;
        b bVarI = aVar.i(343438147);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            jA = j;
            int i6 = bVarI.e(jA) ? 32 : 16;
            i4 = i3 | i6;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if (i5 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if ((i2 & 2) != 0) {
                        jA = c68.a(R.color.bg_primary_d_base, bVarI);
                        i4 &= -113;
                    }
                    dVar2 = dVar4;
                } else {
                    bVarI.G();
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                    }
                }
                bVarI.Y();
                ihe0.a(dVar2, j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), jA, 0L, 0.0f, 0.0f, null, op8Var, bVarI, ((i4 << 3) & 896) | (i4 & 14) | 12582912, 120);
            } else {
                bVarI.G();
            }
            dVar3 = dVar2;
            j2 = jA;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: xb8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ac8.k(dVar3, j2, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        jA = j;
        i4 = i3 | i6;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if ((i2 & 2) != 0) {
                    jA = c68.a(R.color.bg_primary_d_base, bVarI);
                    i4 &= -113;
                }
                dVar2 = dVar4;
            } else {
                if (i5 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if ((i2 & 2) != 0) {
                    jA = c68.a(R.color.bg_primary_d_base, bVarI);
                    i4 &= -113;
                }
                dVar2 = dVar4;
            }
            bVarI.Y();
            ihe0.a(dVar2, j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), jA, 0L, 0.0f, 0.0f, null, op8Var, bVarI, ((i4 << 3) & 896) | (i4 & 14) | 12582912, 120);
        } else {
            bVarI.G();
        }
        dVar3 = dVar2;
        j2 = jA;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ac8.k(dVar3, j2, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
