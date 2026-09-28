package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class bg0 {
    public static final long a = n09.a(0.615f, 0.63f);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Code duplicated, block: B:125:0x024a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x0273  */
    /* JADX WARN: Code duplicated, block: B:132:0x027c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0318  */
    /* JADX WARN: Code duplicated, block: B:150:0x031a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0327  */
    /* JADX WARN: Code duplicated, block: B:160:0x0361  */
    /* JADX WARN: Code duplicated, block: B:166:0x037e  */
    /* JADX WARN: Code duplicated, block: B:169:0x039b  */
    /* JADX WARN: Code duplicated, block: B:170:0x039d  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d1  */
    public static final void a(final d dVar, final n54 n54Var, final String str, boolean z, final float f, final long j, final float f2, final boolean z2, float f3, Function1 function1, final boolean z3, final long j2, a aVar, final int i) {
        int i2;
        b bVar;
        final boolean z4;
        m7n m7nVar;
        boolean z5;
        float f4;
        d.a aVar2;
        n54 n54Var2;
        d0b.a.e eVar;
        androidx.compose.foundation.layout.d dVar2;
        boolean z6;
        int iHashCode;
        boolean z7;
        Object objY;
        final m7n m7nVar2;
        boolean zM;
        Object objY2;
        boolean zM2;
        Object objY3;
        boolean z8;
        final float f5;
        boolean z9;
        boolean z10;
        Object objY4;
        boolean z11;
        Object objY5;
        boolean z12;
        Object objY6;
        final float f6 = f3;
        final Function1 function2 = function1;
        function2.getClass();
        b bVarI = aVar.i(-407597170);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(n54Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.e(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= bVarI.c(f2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= bVarI.b(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.c(f6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= bVarI.A(function2) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = (bVarI.b(z3) ? (char) 4 : (char) 2) | (bVarI.e(j2) ? ' ' : (char) 16);
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            float f7 = z ? 30.0f : -30.0f;
            bVarI.N(-578996926);
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z3) {
                boolean z13 = (((i4 & 112) ^ 48) > 32 && bVarI.e(j2)) || (i4 & 48) == 32;
                Object objY7 = bVarI.y();
                if (z13 || objY7 == c0042a) {
                    objY7 = Integer.valueOf((int) (Math.abs(j2) % 2800));
                    bVarI.r(objY7);
                }
                int iIntValue = ((Number) objY7).intValue();
                egn egnVarB = kgn.b("idleHammerFloat", bVarI, 0);
                long j3 = iIntValue;
                egn.a aVarA = kgn.a(egnVarB, 0.0f, 1.0f, new cgn(yi0.e(1400, 0, vkf.a, 2), l850.b, j3), "idleHammerFloatY", bVarI, 29112, 0);
                bVar = bVarI;
                Object objY8 = bVar.y();
                if (objY8 == c0042a) {
                    objY8 = new zf0();
                    bVar.r(objY8);
                }
                m7nVar = new m7n(((Number) aVarA.getValue()).floatValue(), ((Number) kgn.a(egnVarB, 0.0f, 0.0f, new cgn(yi0.b((Function1) objY8), l850.a, j3), "idleHammerFloatRotate", bVar, 29112, 0).getValue()).floatValue());
                z5 = false;
                bVar.X(false);
            } else {
                m7nVar = new m7n(0.0f, 0.0f);
                bVarI.X(false);
                z5 = false;
                bVar = bVarI;
            }
            float f8 = (f7 * f2) + f;
            n54 n54Var3 = ht.a.a;
            aiv aivVarC = g75.c(n54Var3, z5);
            int iHashCode2 = Long.hashCode(bVar.T);
            ne00 ne00VarS = bVar.S();
            d dVarC = c.c(bVar, dVar);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVar, aivVarC, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVar, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar.S) {
                f4 = f8;
            } else {
                f4 = f8;
                if (!Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVar, dVarC, cVar);
                aVar2 = d.a.b;
                n54Var2 = ht.a.e;
                eVar = d0b.a.b;
                dVar2 = androidx.compose.foundation.layout.d.a;
                if (z2) {
                    bVar.N(-932831043);
                    String strC = com.sportygames.newcms.c.c(lu00.b2.s0, new String[0], bVar);
                    d dVarC2 = j.c(dVar2.b(aVar2, n54Var2), 0.75f);
                    if ((i3 & 458752) == 131072) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY6 = bVar.y();
                    if (z12 || objY6 == c0042a) {
                        objY6 = new Function1() { // from class: sf0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                a7l a7lVar = (a7l) obj;
                                a7lVar.getClass();
                                long j4 = j;
                                a7lVar.B(Float.intBitsToFloat((int) (j4 >> 32)));
                                a7lVar.f(Float.intBitsToFloat((int) (j4 & 4294967295L)));
                                return Unit.a;
                            }
                        };
                        bVar.r(objY6);
                    }
                    mw90.a(strC, "Piggy Crack", androidx.compose.ui.graphics.a.a(dVarC2, (Function1) objY6), null, null, eVar, null, bVar, 1572912, 1976);
                    z6 = false;
                } else {
                    z6 = false;
                    bVar.N(-939189670);
                }
                bVar.X(z6);
                d dVarC3 = j.c(dVar2.b(aVar2, n54Var), 1.0f);
                aiv aivVarC2 = g75.c(n54Var3, z6);
                iHashCode = Long.hashCode(bVar.T);
                ne00 ne00VarS2 = bVar.S();
                d dVarC4 = c.c(bVar, dVarC3);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, aivVarC2, bVar2);
                hlh0.a(bVar, ne00VarS2, dVar3);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar, iHashCode, c1350a);
                }
                hlh0.a(bVar, dVarC4, cVar);
                String strC2 = com.sportygames.newcms.c.c(lu00.b2.D0, new String[0], bVar);
                d dVarC5 = j.c(dVar2.b(aVar2, n54Var2), 0.9f);
                if ((i3 & 234881024) == 67108864) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objY = bVar.y();
                if (!z7 || objY == c0042a) {
                    f6 = f3;
                    objY = new Function1() { // from class: tf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.b(f6);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY);
                } else {
                    f6 = f3;
                }
                mw90.a(strC2, "Hammer glow", androidx.compose.ui.graphics.a.a(dVarC5, (Function1) objY), null, null, eVar, null, bVar, 1572912, 1976);
                d dVarC6 = j.c(dVar2.b(aVar2, n54Var2), 1.0f);
                m7nVar2 = m7nVar;
                zM = bVar.M(m7nVar2);
                objY2 = bVar.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: uf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.u(m7nVar2.b);
                            a7lVar.z0(bg0.a);
                            return Unit.a;
                        }
                    };
                    bVar.r(objY2);
                }
                d dVarA = androidx.compose.ui.graphics.a.a(dVarC6, (Function1) objY2);
                zM2 = bVar.M(m7nVar2);
                objY3 = bVar.y();
                if (!zM2 || objY3 == c0042a) {
                    z8 = false;
                    objY3 = new vf0(m7nVar2, 0);
                    bVar.r(objY3);
                } else {
                    z8 = false;
                }
                d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY3);
                f5 = f4;
                boolean zC = bVar.c(f5);
                if ((i3 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
                z10 = zC | z9;
                objY4 = bVar.y();
                if (!z10 || objY4 == c0042a) {
                    z4 = z;
                    objY4 = new Function1() { // from class: wf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.u(f5);
                            if (z4) {
                                a7lVar.k(-1.0f);
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(objY4);
                } else {
                    z4 = z;
                }
                d dVarA3 = androidx.compose.ui.graphics.a.a(dVarA2, (Function1) objY4);
                if ((1879048192 & i3) == 536870912) {
                    z11 = true;
                } else {
                    z11 = z8;
                }
                objY5 = bVar.y();
                if (!z11 || objY5 == c0042a) {
                    function2 = function1;
                    objY5 = new Function1() { // from class: xf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            urr urrVar = (urr) obj;
                            urrVar.getClass();
                            function2.invoke(new gly(eb9.c(urrVar).P(urrVar, true).c()));
                            return Unit.a;
                        }
                    };
                    bVar.r(objY5);
                } else {
                    function2 = function1;
                }
                mw90.a(str, "Hammer", v.a(dVarA3, (Function1) objY5), null, null, null, null, bVar, ((i3 >> 6) & 14) | 48, 2040);
                bVar.X(true);
                bVar.X(true);
            }
            n30.a(iHashCode2, bVar, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVar, dVarC, cVar2);
            aVar2 = d.a.b;
            n54Var2 = ht.a.e;
            eVar = d0b.a.b;
            dVar2 = androidx.compose.foundation.layout.d.a;
            if (z2) {
                bVar.N(-932831043);
                String strC3 = com.sportygames.newcms.c.c(lu00.b2.s0, new String[0], bVar);
                d dVarC7 = j.c(dVar2.b(aVar2, n54Var2), 0.75f);
                if ((i3 & 458752) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objY6 = bVar.y();
                if (z12) {
                    objY6 = new Function1() { // from class: sf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            long j4 = j;
                            a7lVar.B(Float.intBitsToFloat((int) (j4 >> 32)));
                            a7lVar.f(Float.intBitsToFloat((int) (j4 & 4294967295L)));
                            return Unit.a;
                        }
                    };
                    bVar.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: sf0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            long j4 = j;
                            a7lVar.B(Float.intBitsToFloat((int) (j4 >> 32)));
                            a7lVar.f(Float.intBitsToFloat((int) (j4 & 4294967295L)));
                            return Unit.a;
                        }
                    };
                    bVar.r(objY6);
                }
                mw90.a(strC3, "Piggy Crack", androidx.compose.ui.graphics.a.a(dVarC7, (Function1) objY6), null, null, eVar, null, bVar, 1572912, 1976);
                z6 = false;
            } else {
                z6 = false;
                bVar.N(-939189670);
            }
            bVar.X(z6);
            d dVarC8 = j.c(dVar2.b(aVar2, n54Var), 1.0f);
            aiv aivVarC3 = g75.c(n54Var3, z6);
            iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS3 = bVar.S();
            d dVarC9 = c.c(bVar, dVarC8);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, aivVarC3, bVar2);
            hlh0.a(bVar, ne00VarS3, dVar3);
            if (bVar.S) {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            }
            hlh0.a(bVar, dVarC9, cVar2);
            String strC4 = com.sportygames.newcms.c.c(lu00.b2.D0, new String[0], bVar);
            d dVarC10 = j.c(dVar2.b(aVar2, n54Var2), 0.9f);
            if ((i3 & 234881024) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            objY = bVar.y();
            if (z7) {
                f6 = f3;
                objY = new Function1() { // from class: tf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(f6);
                        return Unit.a;
                    }
                };
                bVar.r(objY);
            } else {
                f6 = f3;
                objY = new Function1() { // from class: tf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(f6);
                        return Unit.a;
                    }
                };
                bVar.r(objY);
            }
            mw90.a(strC4, "Hammer glow", androidx.compose.ui.graphics.a.a(dVarC10, (Function1) objY), null, null, eVar, null, bVar, 1572912, 1976);
            d dVarC11 = j.c(dVar2.b(aVar2, n54Var2), 1.0f);
            m7nVar2 = m7nVar;
            zM = bVar.M(m7nVar2);
            objY2 = bVar.y();
            if (zM) {
                objY2 = new Function1() { // from class: uf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(m7nVar2.b);
                        a7lVar.z0(bg0.a);
                        return Unit.a;
                    }
                };
                bVar.r(objY2);
            } else {
                objY2 = new Function1() { // from class: uf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(m7nVar2.b);
                        a7lVar.z0(bg0.a);
                        return Unit.a;
                    }
                };
                bVar.r(objY2);
            }
            d dVarA4 = androidx.compose.ui.graphics.a.a(dVarC11, (Function1) objY2);
            zM2 = bVar.M(m7nVar2);
            objY3 = bVar.y();
            if (zM2) {
                z8 = false;
                objY3 = new vf0(m7nVar2, 0);
                bVar.r(objY3);
            } else {
                z8 = false;
                objY3 = new vf0(m7nVar2, 0);
                bVar.r(objY3);
            }
            d dVarA5 = androidx.compose.ui.graphics.a.a(dVarA4, (Function1) objY3);
            f5 = f4;
            boolean zC2 = bVar.c(f5);
            if ((i3 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = z8;
            }
            z10 = zC2 | z9;
            objY4 = bVar.y();
            if (z10) {
                z4 = z;
                objY4 = new Function1() { // from class: wf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(f5);
                        if (z4) {
                            a7lVar.k(-1.0f);
                        }
                        return Unit.a;
                    }
                };
                bVar.r(objY4);
            } else {
                z4 = z;
                objY4 = new Function1() { // from class: wf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(f5);
                        if (z4) {
                            a7lVar.k(-1.0f);
                        }
                        return Unit.a;
                    }
                };
                bVar.r(objY4);
            }
            d dVarA6 = androidx.compose.ui.graphics.a.a(dVarA5, (Function1) objY4);
            if ((1879048192 & i3) == 536870912) {
                z11 = true;
            } else {
                z11 = z8;
            }
            objY5 = bVar.y();
            if (z11) {
                function2 = function1;
                objY5 = new Function1() { // from class: xf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        function2.invoke(new gly(eb9.c(urrVar).P(urrVar, true).c()));
                        return Unit.a;
                    }
                };
                bVar.r(objY5);
            } else {
                function2 = function1;
                objY5 = new Function1() { // from class: xf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        function2.invoke(new gly(eb9.c(urrVar).P(urrVar, true).c()));
                        return Unit.a;
                    }
                };
                bVar.r(objY5);
            }
            mw90.a(str, "Hammer", v.a(dVarA6, (Function1) objY5), null, null, null, null, bVar, ((i3 >> 6) & 14) | 48, 2040);
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            z4 = z;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final boolean z14 = z4;
            eVarZ.d = new Function2() { // from class: yf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    bg0.a(dVar, n54Var, str, z14, f, j, f2, z2, f6, function2, z3, j2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
