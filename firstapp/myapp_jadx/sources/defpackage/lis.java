package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class lis {
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0150  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, final String str, int i, final boolean z, boolean z2, final Function0<Unit> function0, a aVar, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z4;
        final boolean z5;
        final int i12;
        final d dVar2;
        e eVarZ;
        int i13;
        d.a aVar2;
        boolean z6;
        d dVar3;
        int i14;
        boolean z7;
        Object objY;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        t9i t9iVar;
        int i15;
        b bVarI = aVar.i(-1620279658);
        int i16 = i2 | 6 | (bVarI.M(str) ? 32 : 16);
        if ((i3 & 4) == 0) {
            i4 = i;
            int i17 = bVarI.d(i4) ? 256 : 128;
            int i18 = i16 | i17;
            if (bVarI.b(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i6 = i18 | i5;
            i7 = i3 & 16;
            if (i7 != 0) {
                i9 = i6 | 24576;
                z3 = z2;
            } else {
                z3 = z2;
                if (bVarI.b(z3)) {
                    i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i8 = 8192;
                }
                i9 = i6 | i8;
            }
            if (bVarI.A(function0)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i11 = i9 | i10;
            if ((74899 & i11) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i11 & 1, z4)) {
                bVarI.A0();
                i13 = i2 & 1;
                aVar2 = d.a.b;
                if (i13 != 0 || bVarI.h0()) {
                    if ((i3 & 4) != 0) {
                        i11 &= -897;
                        i4 = R.drawable.ic_check;
                    }
                    if (i7 != 0) {
                        z3 = true;
                    }
                    z6 = z3;
                    dVar3 = aVar2;
                } else {
                    bVarI.G();
                    if ((i3 & 4) != 0) {
                        i11 &= -897;
                    }
                    dVar3 = dVar;
                    z6 = z3;
                }
                bVarI.Y();
                if (!z6) {
                    i14 = R.color.text_disable_type1_primary;
                } else if (z) {
                    i14 = R.color.brand_quaternary;
                } else {
                    i14 = R.color.text_type1_primary;
                }
                if ((458752 & i11) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objY = bVarI.y();
                if (z7 || objY == a.C0041a.a) {
                    objY = new wy(function0, 1);
                    bVarI.r(objY);
                }
                d dVarD = androidx.compose.foundation.d.d(dVar3, z6, null, null, (Function0) objY, 14);
                d dVar4 = dVar3;
                z5 = z6;
                d dVarG = h.g(dVarD, 16.0f, 12.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarG);
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
                LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, yka.a.d, 1.0f, true);
                imf0 imf0Var = ((eah0) bVarI.O(gah0.a)).k;
                long jA = c68.a(i14, bVarI);
                if (z) {
                    t9iVar = t9i.C;
                } else {
                    t9iVar = t9i.B;
                }
                i15 = i11;
                lkf0.d(str, layoutWeightElementA, jA, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, (i11 >> 3) & 14, 0, 131000);
                bVarI = bVarI;
                if (z) {
                    bVarI.N(-1702672683);
                    h6n.b(erz.a(i4, (i15 >> 6) & 14, bVarI), str, j.r(aVar2, 16.0f), c68.a(i14, bVarI), bVarI, (i15 & 112) | 384, 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1702452304);
                    bVarI.X(false);
                }
                bVarI.X(true);
                i12 = i4;
                dVar2 = dVar4;
            } else {
                bVarI.G();
                z5 = z3;
                i12 = i4;
                dVar2 = dVar;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2(str, i12, z, z5, function0, i2, i3) { // from class: kis
                    public final /* synthetic */ String b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ boolean d;
                    public final /* synthetic */ boolean e;
                    public final /* synthetic */ Function0 f;
                    public final /* synthetic */ int i;

                    {
                        this.i = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(1);
                        lis.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA, this.i);
                        return Unit.a;
                    }
                };
            }
        }
        i4 = i;
        int i19 = i16 | i17;
        if (bVarI.b(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        i6 = i19 | i5;
        i7 = i3 & 16;
        if (i7 != 0) {
            i9 = i6 | 24576;
            z3 = z2;
        } else {
            z3 = z2;
            if (bVarI.b(z3)) {
                i8 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i8 = 8192;
            }
            i9 = i6 | i8;
        }
        if (bVarI.A(function0)) {
            i10 = 131072;
        } else {
            i10 = 65536;
        }
        i11 = i9 | i10;
        if ((74899 & i11) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i11 & 1, z4)) {
            bVarI.A0();
            i13 = i2 & 1;
            aVar2 = d.a.b;
            if (i13 != 0) {
                if ((i3 & 4) != 0) {
                    i11 &= -897;
                    i4 = R.drawable.ic_check;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                z6 = z3;
                dVar3 = aVar2;
            } else {
                if ((i3 & 4) != 0) {
                    i11 &= -897;
                    i4 = R.drawable.ic_check;
                }
                if (i7 != 0) {
                    z3 = true;
                }
                z6 = z3;
                dVar3 = aVar2;
            }
            bVarI.Y();
            if (!z6) {
                i14 = R.color.text_disable_type1_primary;
            } else if (z) {
                i14 = R.color.brand_quaternary;
            } else {
                i14 = R.color.text_type1_primary;
            }
            if ((458752 & i11) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            objY = bVarI.y();
            if (z7) {
                objY = new wy(function0, 1);
                bVarI.r(objY);
            } else {
                objY = new wy(function0, 1);
                bVarI.r(objY);
            }
            d dVarD2 = androidx.compose.foundation.d.d(dVar3, z6, null, null, (Function0) objY, 14);
            d dVar5 = dVar3;
            z5 = z6;
            d dVarG2 = h.g(dVarD2, 16.0f, 12.0f);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
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
            LayoutWeightElement layoutWeightElementA2 = yy.a(bVarI, dVarC2, yka.a.d, 1.0f, true);
            imf0 imf0Var2 = ((eah0) bVarI.O(gah0.a)).k;
            long jA2 = c68.a(i14, bVarI);
            if (z) {
                t9iVar = t9i.C;
            } else {
                t9iVar = t9i.B;
            }
            i15 = i11;
            lkf0.d(str, layoutWeightElementA2, jA2, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var2, bVarI, (i11 >> 3) & 14, 0, 131000);
            bVarI = bVarI;
            if (z) {
                bVarI.N(-1702672683);
                h6n.b(erz.a(i4, (i15 >> 6) & 14, bVarI), str, j.r(aVar2, 16.0f), c68.a(i14, bVarI), bVarI, (i15 & 112) | 384, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-1702452304);
                bVarI.X(false);
            }
            bVarI.X(true);
            i12 = i4;
            dVar2 = dVar5;
        } else {
            bVarI.G();
            z5 = z3;
            i12 = i4;
            dVar2 = dVar;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i12, z, z5, function0, i2, i3) { // from class: kis
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ int i;

                {
                    this.i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lis.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA, this.i);
                    return Unit.a;
                }
            };
        }
    }
}
