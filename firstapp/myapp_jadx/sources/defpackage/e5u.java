package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class e5u {
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:92:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, ya5 ya5Var, final String str, final Function0<Unit> function0, gaj<? super e160, ? super a, ? super Integer, Unit> gajVar, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        ya5 hfsVar;
        boolean z;
        final gaj<? super e160, ? super a, ? super Integer, Unit> gajVar2;
        final d dVar3;
        final ya5 ya5Var2;
        e eVarZ;
        int i4;
        d.a aVar2;
        gaj<? super e160, ? super a, ? super Integer, Unit> gajVar3;
        d dVar4;
        int i5;
        ya5 ya5Var3;
        float f;
        int i6;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        Object objY;
        b bVarA = mzj.a(-181247071, aVar, str, function0);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = (bVarA.M(dVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                hfsVar = ya5Var;
                int i8 = bVarA.M(hfsVar) ? 32 : 16;
                i3 |= i8;
            } else {
                hfsVar = ya5Var;
            }
            i3 |= i8;
        } else {
            hfsVar = ya5Var;
        }
        if ((i & 384) == 0) {
            i3 |= bVarA.M(str) ? 256 : 128;
        }
        int i9 = i3 | (bVarA.A(function0) ? 2048 : 1024);
        int i10 = i2 & 16;
        if (i10 == 0) {
            if ((i & 24576) == 0) {
                i9 |= bVarA.A(gajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            if ((i9 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarA.q(i9 & 1, z)) {
                bVarA.A0();
                i4 = i & 1;
                aVar2 = d.a.b;
                if (i4 != 0 || bVarA.h0()) {
                    if (i7 != 0) {
                        dVar2 = aVar2;
                    }
                    if ((i2 & 2) != 0) {
                        qyd0 qyd0Var = oib0.a;
                        List listK = kotlin.collections.b.k(new j58(((lib0) bVarA.O(qyd0Var)).I0), new j58(((lib0) bVarA.O(qyd0Var)).J0));
                        if ((14 & 4) != 0) {
                            f = Float.POSITIVE_INFINITY;
                        } else {
                            f = 0.0f;
                        }
                        if ((14 & 8) != 0) {
                            i6 = 0;
                        } else {
                            i6 = 2;
                        }
                        i9 &= -113;
                        hfsVar = new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), i6);
                    }
                    if (i10 != 0) {
                        gajVar3 = od9.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    dVar4 = dVar2;
                    i5 = i9;
                    ya5Var3 = hfsVar;
                } else {
                    bVarA.G();
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                    }
                    dVar4 = dVar2;
                    i5 = i9;
                    ya5Var3 = hfsVar;
                    aVar2 = aVar2;
                    gajVar3 = gajVar;
                }
                bVarA.Y();
                d dVarK = j.k(v8j0.c(androidx.compose.foundation.a.a(j.g(dVar4, 1.0f), ya5Var3, null, 0.0f, 6)), 48.0f, 0.0f, 2);
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarA, 48);
                iHashCode = Long.hashCode(bVarA.T);
                ne00 ne00VarS = bVarA.S();
                d dVarC = c.c(bVarA, dVarK);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarA.D();
                if (bVarA.S) {
                    bVarA.F(aVar3);
                } else {
                    bVarA.p();
                }
                hlh0.a(bVarA, d160VarA, yka.a.f);
                hlh0.a(bVarA, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarA, iHashCode, c1350a);
                }
                hlh0.a(bVarA, dVarC, yka.a.d);
                d.a aVar4 = aVar2;
                d dVarA = ls7.a(j.r(aVar4, 36.0f), j060.a);
                objY = bVarA.y();
                if (objY == a.C0041a.a) {
                    objY = rzk.a(bVarA);
                }
                int i11 = i5 >> 6;
                d dVarB = androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j58.f, false), false, null, mla.d(function0, bVarA, i11 & 112), 28);
                qyd0 qyd0Var2 = ejb0.a;
                d dVarF = h.f(dVarB, ((cjb0) bVarA.O(qyd0Var2)).d);
                crz crzVarA = erz.a(R.drawable.ic_action_bar_back, 0, bVarA);
                qyd0 qyd0Var3 = oib0.a;
                h6n.b(crzVarA, null, dVarF, ((lib0) bVarA.O(qyd0Var3)).a0, bVarA, 48, 0);
                d dVarH = h.h(h.j(aVar4, 0.0f, 0.0f, ((cjb0) bVarA.O(qyd0Var2)).d, 0.0f, 11), 0.0f, 2.0f, 1);
                f160 f160Var = f160.a;
                gaj<? super e160, ? super a, ? super Integer, Unit> gajVar4 = gajVar3;
                lkf0.d(str, f160Var.a(1.0f, dVarH, true), ((lib0) bVarA.O(qyd0Var3)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ijb0) bVarA.O(kjb0.a)).e, bVarA, i11 & 14, 24960, 110584);
                bVarA = bVarA;
                gajVar4.invoke(f160Var, bVarA, Integer.valueOf(6 | ((i5 >> 9) & 112)));
                bVarA.X(true);
                gajVar2 = gajVar4;
                dVar3 = dVar4;
                ya5Var2 = ya5Var3;
            } else {
                bVarA.G();
                gajVar2 = gajVar;
                dVar3 = dVar2;
                ya5Var2 = hfsVar;
            }
            eVarZ = bVarA.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: d5u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        e5u.a(dVar3, ya5Var2, str, function0, gajVar2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i9 |= 24576;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarA.q(i9 & 1, z)) {
            bVarA.A0();
            i4 = i & 1;
            aVar2 = d.a.b;
            if (i4 != 0) {
                if (i7 != 0) {
                    dVar2 = aVar2;
                }
                if ((i2 & 2) != 0) {
                    qyd0 qyd0Var4 = oib0.a;
                    List listK2 = kotlin.collections.b.k(new j58(((lib0) bVarA.O(qyd0Var4)).I0), new j58(((lib0) bVarA.O(qyd0Var4)).J0));
                    if ((14 & 4) != 0) {
                        f = Float.POSITIVE_INFINITY;
                    } else {
                        f = 0.0f;
                    }
                    if ((14 & 8) != 0) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    i9 &= -113;
                    hfsVar = new hfs(listK2, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), i6);
                }
                if (i10 != 0) {
                    gajVar3 = od9.a;
                } else {
                    gajVar3 = gajVar;
                }
                dVar4 = dVar2;
                i5 = i9;
                ya5Var3 = hfsVar;
            } else {
                if (i7 != 0) {
                    dVar2 = aVar2;
                }
                if ((i2 & 2) != 0) {
                    qyd0 qyd0Var5 = oib0.a;
                    List listK3 = kotlin.collections.b.k(new j58(((lib0) bVarA.O(qyd0Var5)).I0), new j58(((lib0) bVarA.O(qyd0Var5)).J0));
                    if ((14 & 4) != 0) {
                        f = Float.POSITIVE_INFINITY;
                    } else {
                        f = 0.0f;
                    }
                    if ((14 & 8) != 0) {
                        i6 = 0;
                    } else {
                        i6 = 2;
                    }
                    i9 &= -113;
                    hfsVar = new hfs(listK3, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), i6);
                }
                if (i10 != 0) {
                    gajVar3 = od9.a;
                } else {
                    gajVar3 = gajVar;
                }
                dVar4 = dVar2;
                i5 = i9;
                ya5Var3 = hfsVar;
            }
            bVarA.Y();
            d dVarK2 = j.k(v8j0.c(androidx.compose.foundation.a.a(j.g(dVar4, 1.0f), ya5Var3, null, 0.0f, 6)), 48.0f, 0.0f, 2);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarA, 48);
            iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS2 = bVarA.S();
            d dVarC2 = c.c(bVarA, dVarK2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA2, yka.a.f);
            hlh0.a(bVarA, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarA.S) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC2, yka.a.d);
            d.a aVar5 = aVar2;
            d dVarA2 = ls7.a(j.r(aVar5, 36.0f), j060.a);
            objY = bVarA.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarA);
            }
            int i12 = i5 >> 6;
            d dVarB2 = androidx.compose.foundation.d.b(dVarA2, (psw) objY, ut50.b(0.0f, 3, j58.f, false), false, null, mla.d(function0, bVarA, i12 & 112), 28);
            qyd0 qyd0Var6 = ejb0.a;
            d dVarF2 = h.f(dVarB2, ((cjb0) bVarA.O(qyd0Var6)).d);
            crz crzVarA2 = erz.a(R.drawable.ic_action_bar_back, 0, bVarA);
            qyd0 qyd0Var7 = oib0.a;
            h6n.b(crzVarA2, null, dVarF2, ((lib0) bVarA.O(qyd0Var7)).a0, bVarA, 48, 0);
            d dVarH2 = h.h(h.j(aVar5, 0.0f, 0.0f, ((cjb0) bVarA.O(qyd0Var6)).d, 0.0f, 11), 0.0f, 2.0f, 1);
            f160 f160Var2 = f160.a;
            gaj<? super e160, ? super a, ? super Integer, Unit> gajVar5 = gajVar3;
            lkf0.d(str, f160Var2.a(1.0f, dVarH2, true), ((lib0) bVarA.O(qyd0Var7)).o, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ijb0) bVarA.O(kjb0.a)).e, bVarA, i12 & 14, 24960, 110584);
            bVarA = bVarA;
            gajVar5.invoke(f160Var2, bVarA, Integer.valueOf(6 | ((i5 >> 9) & 112)));
            bVarA.X(true);
            gajVar2 = gajVar5;
            dVar3 = dVar4;
            ya5Var2 = ya5Var3;
        } else {
            bVarA.G();
            gajVar2 = gajVar;
            dVar3 = dVar2;
            ya5Var2 = hfsVar;
        }
        eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d5u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e5u.a(dVar3, ya5Var2, str, function0, gajVar2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
