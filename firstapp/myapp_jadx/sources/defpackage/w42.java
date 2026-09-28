package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class w42 {
    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:104:0x0247  */
    /* JADX WARN: Code duplicated, block: B:106:0x0277  */
    /* JADX WARN: Code duplicated, block: B:108:0x0287  */
    /* JADX WARN: Code duplicated, block: B:111:0x0293  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x014b  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fe  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(boolean z, final float f, kw0.l lVar, zp70 zp70Var, final Function0 function0, final op8 op8Var, a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        kw0.l lVar2;
        zp70 zp70VarA;
        boolean z3;
        final boolean z4;
        final kw0.l lVar3;
        final zp70 zp70Var2;
        e eVarZ;
        int i4;
        Object objY;
        a.C0041a.C0042a c0042a;
        ytw ytwVar;
        int i5;
        boolean z5;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        l78 l78Var;
        Object objY2;
        int i6;
        int i7;
        Object objY3;
        int i8;
        int i9;
        b bVarI = aVar.i(895844335);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (bVarI.b(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.c(f) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                lVar2 = lVar;
                i3 |= bVarI.M(lVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    zp70VarA = zp70Var;
                    int i12 = bVarI.M(zp70VarA) ? 2048 : 1024;
                    i3 |= i12;
                } else {
                    zp70VarA = zp70Var;
                }
                i3 |= i12;
            } else {
                zp70VarA = zp70Var;
            }
            if ((i & 24576) != 0) {
                if (bVarI.A(function0)) {
                    i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if (i10 != 0) {
                        z2 = true;
                    }
                    if (i11 != 0) {
                        lVar2 = kw0.c;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        zp70VarA = op70.a(bVarI);
                    }
                } else {
                    bVarI.G();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                i4 = i3;
                kw0.l lVar4 = lVar2;
                zp70 zp70Var3 = zp70VarA;
                bVarI.Y();
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                long jA = c68.a(R.color.background_type1_quaternary, bVarI);
                zk40.a aVar3 = zk40.a;
                d.a aVar4 = d.a.b;
                d dVarC = op70.c(j.c(j.g(h.h(androidx.compose.foundation.a.b(aVar4, jA, aVar3), f, 0.0f, 2), 1.0f), 1.0f), zp70Var3, 14);
                i5 = i4 >> 3;
                i78 i78VarA = g78.a(lVar4, ht.a.n, bVarI, ((((i5 & 112) | 384) >> 3) & 14) | 48);
                z5 = z2;
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarC);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                d dVarJ = h.j(aVar4, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                n54.a aVar5 = ht.a.o;
                l78Var = l78.a;
                d dVarD = g.d(l78Var.c(aVar5, dVarJ), f - 12.0f, 0.0f, 2);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    i6 = 0;
                    objY2 = new t42(ytwVar, 0);
                    bVarI.r(objY2);
                } else {
                    i6 = 0;
                }
                i7 = i6;
                h6n.b(erz.a(R.drawable.close_icon, i6, bVarI), null, androidx.compose.foundation.d.d(dVarD, false, null, null, (Function0) objY2, 15), c68.a(R.color.text_type1_primary, bVarI), bVarI, 48, 0);
                if (z5) {
                    bVarI.N(144294440);
                    op8Var.invoke(l78Var, bVarI, Integer.valueOf(((i4 >> 12) & 112) | 6));
                    bVarI.X(i7);
                } else {
                    bVarI.N(144326153);
                    bVarI.X(i7);
                }
                bVarI.X(true);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVarI.N(-826813206);
                    String strA = cb40.a(R.string.common_functions__attention, new Object[i7], bVarI);
                    String strA2 = cb40.a(R.string.common_functions__stay, new Object[i7], bVarI);
                    String strA3 = cb40.a(R.string.common_functions__exit, new Object[i7], bVarI);
                    String strA4 = cb40.a(R.string.register_login_int__do_you_wish_to_exit_the_registration_process_content, new Object[i7], bVarI);
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new u42(ytwVar, i7);
                        bVarI.r(objY3);
                    }
                    nzj.d(strA, strA4, null, null, strA2, strA3, null, null, null, null, null, (Function0) objY3, function0, null, bVarI, 0, (i5 & 7168) | 384, 20380);
                    bVarI = bVarI;
                    bVarI.X(i7);
                } else {
                    bVarI.N(-826245069);
                    bVarI.X(i7);
                }
                z4 = z5;
                lVar3 = lVar4;
                zp70Var2 = zp70Var3;
            } else {
                bVarI.G();
                z4 = z2;
                lVar3 = lVar2;
                zp70Var2 = zp70VarA;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: v42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w42.a(z4, f, lVar3, zp70Var2, function0, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        lVar2 = lVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                zp70VarA = zp70Var;
                if (bVarI.M(zp70VarA)) {
                }
                i3 |= i12;
            } else {
                zp70VarA = zp70Var;
            }
            i3 |= i12;
        } else {
            zp70VarA = zp70Var;
        }
        if ((i & 24576) != 0) {
            if (bVarI.A(function0)) {
                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    lVar2 = kw0.c;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    zp70VarA = op70.a(bVarI);
                }
            } else {
                if (i10 != 0) {
                    z2 = true;
                }
                if (i11 != 0) {
                    lVar2 = kw0.c;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    zp70VarA = op70.a(bVarI);
                }
            }
            i4 = i3;
            kw0.l lVar5 = lVar2;
            zp70 zp70Var4 = zp70VarA;
            bVarI.Y();
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            long jA2 = c68.a(R.color.background_type1_quaternary, bVarI);
            zk40.a aVar6 = zk40.a;
            d.a aVar7 = d.a.b;
            d dVarC3 = op70.c(j.c(j.g(h.h(androidx.compose.foundation.a.b(aVar7, jA2, aVar6), f, 0.0f, 2), 1.0f), 1.0f), zp70Var4, 14);
            i5 = i4 >> 3;
            i78 i78VarA2 = g78.a(lVar5, ht.a.n, bVarI, ((((i5 & 112) | 384) >> 3) & 14) | 48);
            z5 = z2;
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarC3);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            d dVarJ2 = h.j(aVar7, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            n54.a aVar8 = ht.a.o;
            l78Var = l78.a;
            d dVarD2 = g.d(l78Var.c(aVar8, dVarJ2), f - 12.0f, 0.0f, 2);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                i6 = 0;
                objY2 = new t42(ytwVar, 0);
                bVarI.r(objY2);
            } else {
                i6 = 0;
            }
            i7 = i6;
            h6n.b(erz.a(R.drawable.close_icon, i6, bVarI), null, androidx.compose.foundation.d.d(dVarD2, false, null, null, (Function0) objY2, 15), c68.a(R.color.text_type1_primary, bVarI), bVarI, 48, 0);
            if (z5) {
                bVarI.N(144294440);
                op8Var.invoke(l78Var, bVarI, Integer.valueOf(((i4 >> 12) & 112) | 6));
                bVarI.X(i7);
            } else {
                bVarI.N(144326153);
                bVarI.X(i7);
            }
            bVarI.X(true);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(-826813206);
                String strA5 = cb40.a(R.string.common_functions__attention, new Object[i7], bVarI);
                String strA6 = cb40.a(R.string.common_functions__stay, new Object[i7], bVarI);
                String strA7 = cb40.a(R.string.common_functions__exit, new Object[i7], bVarI);
                String strA8 = cb40.a(R.string.register_login_int__do_you_wish_to_exit_the_registration_process_content, new Object[i7], bVarI);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new u42(ytwVar, i7);
                    bVarI.r(objY3);
                }
                nzj.d(strA5, strA8, null, null, strA6, strA7, null, null, null, null, null, (Function0) objY3, function0, null, bVarI, 0, (i5 & 7168) | 384, 20380);
                bVarI = bVarI;
                bVarI.X(i7);
            } else {
                bVarI.N(-826245069);
                bVarI.X(i7);
            }
            z4 = z5;
            lVar3 = lVar5;
            zp70Var2 = zp70Var4;
        } else {
            bVarI.G();
            z4 = z2;
            lVar3 = lVar2;
            zp70Var2 = zp70VarA;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w42.a(z4, f, lVar3, zp70Var2, function0, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
