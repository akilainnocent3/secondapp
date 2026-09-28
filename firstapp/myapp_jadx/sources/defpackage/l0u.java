package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class l0u {
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, boolean z, op8 op8Var, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        boolean z2;
        boolean z3;
        final op8 op8Var2;
        final d dVar3;
        final boolean z4;
        e eVarZ;
        d.a aVar2;
        d dVarG;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        b bVarI = aVar.i(-1114124461);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                aVar2 = d.a.b;
                if (i4 != 0) {
                    dVar2 = aVar2;
                }
                if (i5 != 0) {
                    z2 = false;
                }
                if (z2) {
                    dVarG = j.e(aVar2, 1.0f);
                } else {
                    dVarG = j.g(aVar2, 1.0f);
                }
                d dVarA = androidx.compose.foundation.a.a(dVar2.n(dVarG), ya5.a.a(0.0f, 0.0f, 14, cst.a), null, 0.0f, 6);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                op8Var2 = op8Var;
                w1i.a(6, op8Var2, bVarI, true);
            } else {
                op8Var2 = op8Var;
                bVarI.G();
            }
            dVar3 = dVar2;
            z4 = z2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: j0u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        l0u.a(dVar3, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            aVar2 = d.a.b;
            if (i4 != 0) {
                dVar2 = aVar2;
            }
            if (i5 != 0) {
                z2 = false;
            }
            if (z2) {
                dVarG = j.e(aVar2, 1.0f);
            } else {
                dVarG = j.g(aVar2, 1.0f);
            }
            d dVarA2 = androidx.compose.foundation.a.a(dVar2.n(dVarG), ya5.a.a(0.0f, 0.0f, 14, cst.a), null, 0.0f, 6);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            op8Var2 = op8Var;
            w1i.a(6, op8Var2, bVarI, true);
        } else {
            op8Var2 = op8Var;
            bVarI.G();
        }
        dVar3 = dVar2;
        z4 = z2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j0u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l0u.a(dVar3, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final op8 op8Var, a aVar) {
        int i2;
        b bVarI = aVar.i(1032605782);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(op8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            List<j58> list = cst.a;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            boolean zM = bVarI.M(context) | bVarI.M(configuration);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                Configuration configuration2 = new Configuration(configuration);
                configuration2.uiMode = (configuration2.uiMode & (-49)) | 16;
                objY = context.createConfigurationContext(configuration2);
                bVarI.r(objY);
            }
            Context context2 = (Context) objY;
            context2.getClass();
            hna.a(qyd0Var.a(oib0.a(new bst(context2), bVarI, 0)), op8Var, bVarI, ((i2 << 3) & 112) | 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k0u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l0u.b(qj40.a(i | 1), op8Var, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0130  */
    /* JADX WARN: Code duplicated, block: B:45:0x0155  */
    /* JADX WARN: Code duplicated, block: B:48:0x0165  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void c(ast astVar, z0u z0uVar, v0u v0uVar, boolean z, final op8 op8Var, a aVar, final int i, final int i2) {
        boolean z2;
        boolean z3;
        final ast astVar2;
        final z0u z0uVar2;
        final v0u v0uVar2;
        final boolean z4;
        e eVarZ;
        ast astVar3;
        z0u z0uVar3;
        v0u.b bVar;
        final boolean z5;
        final ast astVar4;
        final z0u z0uVar4;
        final v0u v0uVar3;
        int i3;
        b bVarI = aVar.i(-1356171561);
        int i4 = (i & 6) == 0 ? i | 2 : i;
        if ((i & 48) == 0) {
            i4 |= 16;
        }
        int i5 = i4 | 384;
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i5 |= bVarI.b(z2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (bVarI.A(op8Var)) {
                    i3 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i3 = 8192;
                }
                i5 |= i3;
            }
            if ((i5 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i5 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    astVar3 = cst.g;
                    qyd0 qyd0Var = b1u.a;
                    long jM = mla.m(12.0f, bVarI);
                    t9i t9iVar = t9i.y;
                    long jM2 = mla.m(18.4f, bVarI);
                    long j = j58.b;
                    z0uVar3 = new z0u(new imf0(0L, jM, t9iVar, null, null, 0L, null, new ix80(mla.b(4.0f, bVarI), j58.c(0.5f, j), (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), 0, jM2, null, null, 16637945), new imf0(0L, mla.m(12.0f, bVarI), t9i.v, new n9i(1), null, 0L, null, new ix80(mla.b(4.0f, bVarI), j58.c(0.8f, j), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), 0, 0L, null, null, 16769009));
                    bVar = v0u.b.d;
                    if (i6 != 0) {
                        astVar4 = astVar3;
                        z0uVar4 = z0uVar3;
                        v0uVar3 = bVar;
                        z5 = false;
                    } else {
                        z5 = z2;
                        astVar4 = astVar3;
                        z0uVar4 = z0uVar3;
                        v0uVar3 = bVar;
                    }
                } else {
                    bVarI.G();
                    astVar4 = astVar;
                    z0uVar4 = z0uVar;
                    v0uVar3 = v0uVar;
                    z5 = z2;
                }
                bVarI.Y();
                astVar2 = astVar4;
                z2 = z5;
                o0z.a(null, null, null, null, null, pp8.b(963145670, new Function2() { // from class: g0u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            j730[] j730VarArr = {cst.e.a(astVar4), b1u.a.a(z0uVar4), cst.f.a(v0uVar3)};
                            final op8 op8Var2 = op8Var;
                            final boolean z6 = z5;
                            hna.b(j730VarArr, pp8.b(-455674746, new Function2() { // from class: i0u
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar3 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        boolean z7 = z6;
                                        op8 op8Var3 = op8Var2;
                                        if (z7) {
                                            aVar3.N(1385309491);
                                            op8Var3.invoke(aVar3, 0);
                                            aVar3.H();
                                        } else {
                                            aVar3.N(1385357200);
                                            l0u.b(0, op8Var3, aVar3);
                                            aVar3.H();
                                        }
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), aVar2, 48);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 196608);
                z0uVar2 = z0uVar4;
                v0uVar2 = v0uVar3;
            } else {
                bVarI.G();
                astVar2 = astVar;
                z0uVar2 = z0uVar;
                v0uVar2 = v0uVar;
            }
            z4 = z2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: h0u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        l0u.c(astVar2, z0uVar2, v0uVar2, z4, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i5 = i4 | 3456;
        z2 = z;
        if ((i & 24576) == 0) {
            if (bVarI.A(op8Var)) {
                i3 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i3 = 8192;
            }
            i5 |= i3;
        }
        if ((i5 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i5 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                astVar3 = cst.g;
                qyd0 qyd0Var2 = b1u.a;
                long jM3 = mla.m(12.0f, bVarI);
                t9i t9iVar2 = t9i.y;
                long jM4 = mla.m(18.4f, bVarI);
                long j2 = j58.b;
                z0uVar3 = new z0u(new imf0(0L, jM3, t9iVar2, null, null, 0L, null, new ix80(mla.b(4.0f, bVarI), j58.c(0.5f, j2), (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), 0, jM4, null, null, 16637945), new imf0(0L, mla.m(12.0f, bVarI), t9i.v, new n9i(1), null, 0L, null, new ix80(mla.b(4.0f, bVarI), j58.c(0.8f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), 0, 0L, null, null, 16769009));
                bVar = v0u.b.d;
                if (i6 != 0) {
                    astVar4 = astVar3;
                    z0uVar4 = z0uVar3;
                    v0uVar3 = bVar;
                    z5 = false;
                } else {
                    z5 = z2;
                    astVar4 = astVar3;
                    z0uVar4 = z0uVar3;
                    v0uVar3 = bVar;
                }
            } else {
                astVar3 = cst.g;
                qyd0 qyd0Var3 = b1u.a;
                long jM5 = mla.m(12.0f, bVarI);
                t9i t9iVar3 = t9i.y;
                long jM6 = mla.m(18.4f, bVarI);
                long j3 = j58.b;
                z0uVar3 = new z0u(new imf0(0L, jM5, t9iVar3, null, null, 0L, null, new ix80(mla.b(4.0f, bVarI), j58.c(0.5f, j3), (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), 0, jM6, null, null, 16637945), new imf0(0L, mla.m(12.0f, bVarI), t9i.v, new n9i(1), null, 0L, null, new ix80(mla.b(4.0f, bVarI), j58.c(0.8f, j3), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L)), 0, 0L, null, null, 16769009));
                bVar = v0u.b.d;
                if (i6 != 0) {
                    astVar4 = astVar3;
                    z0uVar4 = z0uVar3;
                    v0uVar3 = bVar;
                    z5 = false;
                } else {
                    z5 = z2;
                    astVar4 = astVar3;
                    z0uVar4 = z0uVar3;
                    v0uVar3 = bVar;
                }
            }
            bVarI.Y();
            astVar2 = astVar4;
            z2 = z5;
            o0z.a(null, null, null, null, null, pp8.b(963145670, new Function2() { // from class: g0u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j730[] j730VarArr = {cst.e.a(astVar4), b1u.a.a(z0uVar4), cst.f.a(v0uVar3)};
                        final op8 op8Var2 = op8Var;
                        final boolean z6 = z5;
                        hna.b(j730VarArr, pp8.b(-455674746, new Function2() { // from class: i0u
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z7 = z6;
                                    op8 op8Var3 = op8Var2;
                                    if (z7) {
                                        aVar3.N(1385309491);
                                        op8Var3.invoke(aVar3, 0);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(1385357200);
                                        l0u.b(0, op8Var3, aVar3);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 48);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196608);
            z0uVar2 = z0uVar4;
            v0uVar2 = v0uVar3;
        } else {
            bVarI.G();
            astVar2 = astVar;
            z0uVar2 = z0uVar;
            v0uVar2 = v0uVar;
        }
        z4 = z2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h0u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l0u.c(astVar2, z0uVar2, v0uVar2, z4, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
