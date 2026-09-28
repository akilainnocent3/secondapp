package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class hf10 {
    public static final void a(d dVar, a aVar, int i) {
        b bVar;
        int i2;
        b bVarI = aVar.i(-2078659789);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            d dVarH = h.h(androidx.compose.foundation.a.b(j.i(dVar, 16.0f), c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), j060.c(10.0f)), 6.0f, 0.0f, 2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            String strA = cb40.a(R.string.event_label__hot, new Object[0], bVarI);
            imf0 imf0VarL = mla.l(R.style.C1_R, bVarI);
            long jA = c68.a(R.color.text_inverse_primary, bVarI);
            i2 = 1;
            lkf0.d(strA, null, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, imf0VarL, bVarI, 0, 24576, 114682);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            i2 = 1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new xwd(i, i2, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x017d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    public static final void b(final af10 af10Var, final boolean z, final bf10 bf10Var, final Function0 function0, final d dVar, a aVar, final int i) {
        b bVar;
        yka.a.d dVar2;
        d.a aVar2;
        int iHashCode;
        androidx.compose.foundation.layout.d dVar3;
        b bVarI = aVar.i(-935194569);
        int i2 = i | (bVarI.M(af10Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.M(bf10Var) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            long j = z ? bf10Var.c : bf10Var.b;
            long j2 = z ? bf10Var.e : bf10Var.d;
            n54 n54Var = ht.a.b;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar4);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                dVar2 = dVar4;
            } else {
                dVar2 = dVar4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                aVar2 = d.a.b;
                yka.a.d dVar5 = dVar2;
                d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(d35.a(j.i(j.g(aVar2, 1.0f), 36.0f), 1.0f, bf10Var.a, j060.c(2.0f)), j, zk40.a), false, null, null, function0, 15);
                aiv aivVarC2 = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarD);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar5);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                n54 n54Var2 = ht.a.e;
                dVar3 = androidx.compose.foundation.layout.d.a;
                lkf0.d(af10Var.b, dVar3.b(aVar2, n54Var2), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 131064);
                bVar = bVarI;
                bVar.X(true);
                if (af10Var.c) {
                    bVar.N(862577370);
                    a(g.d(dVar3.b(aVar2, n54Var), 0.0f, -8.0f, 1), bVar, 0);
                    bVar.X(false);
                } else {
                    bVar.N(862741701);
                    bVar.X(false);
                }
                bVar.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            aVar2 = d.a.b;
            yka.a.d dVar6 = dVar2;
            d dVarD2 = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(d35.a(j.i(j.g(aVar2, 1.0f), 36.0f), 1.0f, bf10Var.a, j060.c(2.0f)), j, zk40.a), false, null, null, function0, 15);
            aiv aivVarC3 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarD2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar6);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            n54 n54Var3 = ht.a.e;
            dVar3 = androidx.compose.foundation.layout.d.a;
            lkf0.d(af10Var.b, dVar3.b(aVar2, n54Var3), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
            if (af10Var.c) {
                bVar.N(862577370);
                a(g.d(dVar3.b(aVar2, n54Var), 0.0f, -8.0f, 1), bVar, 0);
                bVar.X(false);
            } else {
                bVar.N(862741701);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, bf10Var, function0, dVar, i) { // from class: gf10
                public final /* synthetic */ boolean b;
                public final /* synthetic */ bf10 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hf10.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final uf00 uf00Var, final Integer num, final bf10 bf10Var, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1921011958);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(uf00Var) : bVarI.A(uf00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(bf10Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            y1i.b(h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), new kw0.i(8.0f, true, new hw0()), null, null, 5, 0, pp8.b(-1398602149, new gaj() { // from class: df10
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    o2i o2iVar = (o2i) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    o2iVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(o2iVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int i4 = 0;
                        for (Object obj4 : uf00Var) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            final af10 af10Var = (af10) obj4;
                            int i6 = af10Var.a;
                            Integer num2 = num;
                            boolean z = num2 != null && i6 == num2.intValue();
                            final Function1 function2 = function1;
                            boolean zM = aVar3.M(function2) | aVar3.A(af10Var);
                            Object objY = aVar3.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: ff10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(af10Var);
                                        return Unit.a;
                                    }
                                };
                                aVar3.r(objY);
                            }
                            hf10.b(af10Var, z, bf10Var, (Function0) objY, c9j.c(o2iVar.a(1.0f, d.a.b, true), AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, "preset-input-" + i5), aVar3, 0);
                            i4 = i5;
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1597488, 44);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ef10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hf10.c(uf00Var, num, bf10Var, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final uf00 uf00Var, final Integer num, final bf10 bf10Var, d dVar, final Function1 function1, a aVar, final int i) {
        int i2;
        d dVar2;
        uf00Var.getClass();
        b bVarI = aVar.i(-1761840310);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(uf00Var) : bVarI.A(uf00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(bf10Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            if (uf00Var.isEmpty()) {
                bVarI.N(1811130328);
                bVarI.X(false);
            } else {
                bVarI.N(1810916025);
                int i4 = i3 << 3;
                c(uf00Var, num, bf10Var, function1, bVarI, (i3 & 57344) | ((i3 >> 9) & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168));
                bVarI.X(false);
            }
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2() { // from class: cf10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hf10.d(uf00Var, num, bf10Var, dVar3, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
