package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.selection.c;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class vj7 {
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134  */
    /* JADX WARN: Code duplicated, block: B:89:0x013f  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final Function1 function1, d dVar, boolean z2, final oj7 oj7Var, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        final d dVar3;
        final boolean z5;
        e eVarZ;
        d dVar4;
        d dVar5;
        kzf0 kzf0Var;
        Function0 function0;
        boolean z6;
        boolean z7;
        Object objY;
        int i7;
        b bVarI = aVar.i(-1406741137);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (bVarI.b(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if (bVarI.M(oj7Var)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i6 = i3 | 196608;
                if ((74899 & i6) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i6 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i8 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        dVar5 = dVar4;
                    } else {
                        bVarI.G();
                        dVar5 = dVar2;
                    }
                    bVarI.Y();
                    float fFloor = (float) Math.floor(((mmd) bVarI.O(kna.h)).C1(2.0f));
                    if (z) {
                        kzf0Var = kzf0.a;
                    } else {
                        kzf0Var = kzf0.b;
                    }
                    if (function1 != null) {
                        bVarI.N(2066152950);
                        if ((i6 & 112) == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z6 | ((i6 & 14) == 4);
                        objY = bVarI.y();
                        if (z7 || objY == a.C0041a.a) {
                            objY = new Function0() { // from class: qj7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(Boolean.valueOf(!z));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY);
                        }
                        function0 = (Function0) objY;
                        bVarI.X(false);
                    } else {
                        bVarI.N(2066218639);
                        bVarI.X(false);
                        function0 = null;
                    }
                    boolean z8 = z3;
                    c(kzf0Var, function0, new yae0(fFloor, 0.0f, 2, 0, null, 26), new yae0(fFloor, 0.0f, 0, 0, null, 30), dVar5, z8, oj7Var, bVarI, (i6 << 6) & 33546240);
                    dVar3 = dVar5;
                    z5 = z8;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    z5 = z3;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: rj7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vj7.a(z, function1, dVar3, z5, oj7Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if (bVarI.M(oj7Var)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i6 = i3 | 196608;
            if ((74899 & i6) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i6 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    dVar5 = dVar4;
                } else {
                    if (i8 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    dVar5 = dVar4;
                }
                bVarI.Y();
                float fFloor2 = (float) Math.floor(((mmd) bVarI.O(kna.h)).C1(2.0f));
                if (z) {
                    kzf0Var = kzf0.a;
                } else {
                    kzf0Var = kzf0.b;
                }
                if (function1 != null) {
                    bVarI.N(2066152950);
                    if ((i6 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | ((i6 & 14) == 4);
                    objY = bVarI.y();
                    if (z7) {
                        objY = new Function0() { // from class: qj7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Boolean.valueOf(!z));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    } else {
                        objY = new Function0() { // from class: qj7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Boolean.valueOf(!z));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    function0 = (Function0) objY;
                    bVarI.X(false);
                } else {
                    bVarI.N(2066218639);
                    bVarI.X(false);
                    function0 = null;
                }
                boolean z9 = z3;
                c(kzf0Var, function0, new yae0(fFloor2, 0.0f, 2, 0, null, 26), new yae0(fFloor2, 0.0f, 0, 0, null, 30), dVar5, z9, oj7Var, bVarI, (i6 << 6) & 33546240);
                dVar3 = dVar5;
                z5 = z9;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: rj7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vj7.a(z, function1, dVar3, z5, oj7Var, (a) obj, qj40.a(i | 1), i2);
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
                z3 = z2;
                if (bVarI.b(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (bVarI.M(oj7Var)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i6 = i3 | 196608;
            if ((74899 & i6) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i6 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    dVar5 = dVar4;
                } else {
                    if (i8 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    dVar5 = dVar4;
                }
                bVarI.Y();
                float fFloor3 = (float) Math.floor(((mmd) bVarI.O(kna.h)).C1(2.0f));
                if (z) {
                    kzf0Var = kzf0.a;
                } else {
                    kzf0Var = kzf0.b;
                }
                if (function1 != null) {
                    bVarI.N(2066152950);
                    if ((i6 & 112) == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z6 | ((i6 & 14) == 4);
                    objY = bVarI.y();
                    if (z7) {
                        objY = new Function0() { // from class: qj7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Boolean.valueOf(!z));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    } else {
                        objY = new Function0() { // from class: qj7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Boolean.valueOf(!z));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    function0 = (Function0) objY;
                    bVarI.X(false);
                } else {
                    bVarI.N(2066218639);
                    bVarI.X(false);
                    function0 = null;
                }
                boolean z10 = z3;
                c(kzf0Var, function0, new yae0(fFloor3, 0.0f, 2, 0, null, 26), new yae0(fFloor3, 0.0f, 0, 0, null, 30), dVar5, z10, oj7Var, bVarI, (i6 << 6) & 33546240);
                dVar3 = dVar5;
                z5 = z10;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: rj7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vj7.a(z, function1, dVar3, z5, oj7Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if (bVarI.M(oj7Var)) {
                i7 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        i6 = i3 | 196608;
        if ((74899 & i6) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i6 & 1, z4)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                dVar5 = dVar4;
            } else {
                if (i8 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                dVar5 = dVar4;
            }
            bVarI.Y();
            float fFloor4 = (float) Math.floor(((mmd) bVarI.O(kna.h)).C1(2.0f));
            if (z) {
                kzf0Var = kzf0.a;
            } else {
                kzf0Var = kzf0.b;
            }
            if (function1 != null) {
                bVarI.N(2066152950);
                if ((i6 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | ((i6 & 14) == 4);
                objY = bVarI.y();
                if (z7) {
                    objY = new Function0() { // from class: qj7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(Boolean.valueOf(!z));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                } else {
                    objY = new Function0() { // from class: qj7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(Boolean.valueOf(!z));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                function0 = (Function0) objY;
                bVarI.X(false);
            } else {
                bVarI.N(2066218639);
                bVarI.X(false);
                function0 = null;
            }
            boolean z11 = z3;
            c(kzf0Var, function0, new yae0(fFloor4, 0.0f, 2, 0, null, 26), new yae0(fFloor4, 0.0f, 0, 0, null, 30), dVar5, z11, oj7Var, bVarI, (i6 << 6) & 33546240);
            dVar3 = dVar5;
            z5 = z11;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            z5 = z3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rj7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vj7.a(z, function1, dVar3, z5, oj7Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x0202  */
    /* JADX WARN: Code duplicated, block: B:125:0x0205  */
    /* JADX WARN: Code duplicated, block: B:127:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x020b  */
    /* JADX WARN: Code duplicated, block: B:130:0x020f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0212  */
    /* JADX WARN: Code duplicated, block: B:133:0x0216  */
    /* JADX WARN: Code duplicated, block: B:134:0x0239  */
    /* JADX WARN: Code duplicated, block: B:136:0x024e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0254  */
    /* JADX WARN: Code duplicated, block: B:140:0x0257  */
    /* JADX WARN: Code duplicated, block: B:143:0x025b  */
    /* JADX WARN: Code duplicated, block: B:145:0x025f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0262  */
    /* JADX WARN: Code duplicated, block: B:147:0x0265  */
    /* JADX WARN: Code duplicated, block: B:149:0x026b  */
    /* JADX WARN: Code duplicated, block: B:151:0x026e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0271  */
    /* JADX WARN: Code duplicated, block: B:154:0x0274  */
    /* JADX WARN: Code duplicated, block: B:156:0x0278  */
    /* JADX WARN: Code duplicated, block: B:157:0x027b  */
    /* JADX WARN: Code duplicated, block: B:159:0x027f  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f7  */
    public static final void b(final boolean z, final kzf0 kzf0Var, final d dVar, final oj7 oj7Var, final yae0 yae0Var, final yae0 yae0Var2, a aVar, final int i) {
        int i2;
        b bVar;
        float f;
        float f2;
        float f3;
        goh a5a0Var;
        final dtg0.d dVarD;
        Object objY;
        a.C0041a.C0042a c0042a;
        final mi7 mi7Var;
        long j;
        final twd0 twd0VarA;
        b bVar2;
        int iOrdinal;
        long j2;
        twd0 twd0VarC;
        int iOrdinal2;
        long j3;
        twd0 twd0VarC2;
        boolean zM;
        Object objY2;
        int i3;
        int iOrdinal3;
        int iOrdinal4;
        b bVarI = aVar.i(-891330208);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(kzf0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(oj7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(yae0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(yae0Var2) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            dtg0 dtg0VarF = vtg0.f(kzf0Var, null, bVarI, (i2 >> 3) & 14, 2);
            ytw ytwVar = dtg0VarF.d;
            o oVar = dtg0VarF.a;
            goh gohVarB = a6w.b(z5w.a, bVarI);
            g0h0 g0h0Var = gjs.b;
            kzf0 kzf0Var2 = (kzf0) oVar.V();
            bVarI.N(-768316570);
            int iOrdinal5 = kzf0Var2.ordinal();
            float f4 = 0.0f;
            if (iOrdinal5 == 0) {
                f = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    uhc.a();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            bVarI.X(false);
            Float fValueOf = Float.valueOf(f);
            x5a0 x5a0Var = (x5a0) ytwVar;
            kzf0 kzf0Var3 = (kzf0) x5a0Var.getValue();
            bVarI.N(-768316570);
            int iOrdinal6 = kzf0Var3.ordinal();
            if (iOrdinal6 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    uhc.a();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            bVarI.X(false);
            Float fValueOf2 = Float.valueOf(f2);
            dtg0.b bVarF = dtg0VarF.f();
            bVarI.N(1780794470);
            Object objC = bVarF.c();
            kzf0 kzf0Var4 = kzf0.b;
            goh a5a0Var2 = (objC != kzf0Var4 && bVarF.a() == kzf0Var4) ? new a5a0(100) : gohVarB;
            bVarI.X(false);
            final dtg0.d dVarD2 = vtg0.d(dtg0VarF, fValueOf, fValueOf2, a5a0Var2, g0h0Var, bVarI, 0);
            kzf0 kzf0Var5 = (kzf0) oVar.V();
            bVarI.N(1840054703);
            int iOrdinal7 = kzf0Var5.ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f3 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    uhc.a();
                    return;
                }
                f3 = 1.0f;
            }
            bVarI.X(false);
            Float fValueOf3 = Float.valueOf(f3);
            kzf0 kzf0Var6 = (kzf0) x5a0Var.getValue();
            bVarI.N(1840054703);
            int iOrdinal8 = kzf0Var6.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    uhc.a();
                    return;
                }
                f4 = 1.0f;
            }
            bVarI.X(false);
            Float fValueOf4 = Float.valueOf(f4);
            dtg0.b bVarF2 = dtg0VarF.f();
            bVarI.N(630790831);
            if (bVarF2.c() == kzf0Var4) {
                gohVarB = yi0.c();
            } else {
                if (bVarF2.a() == kzf0Var4) {
                    a5a0Var = new a5a0(100);
                }
                bVarI.X(false);
                dVarD = vtg0.d(dtg0VarF, fValueOf3, fValueOf4, a5a0Var, g0h0Var, bVarI, 0);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new mi7(0);
                    bVarI.r(objY);
                }
                mi7Var = (mi7) objY;
                oj7Var.getClass();
                if (kzf0Var == kzf0Var4) {
                    j = oj7Var.b;
                } else {
                    j = oj7Var.a;
                }
                twd0VarA = hw90.a(j, oj7.a(kzf0Var, bVarI), null, bVarI, 0, 12);
                bVar2 = bVarI;
                if (z) {
                    iOrdinal4 = kzf0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        j2 = oj7Var.c;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            uhc.a();
                            return;
                        }
                        j2 = oj7Var.c;
                    } else {
                        j2 = oj7Var.d;
                    }
                } else {
                    iOrdinal = kzf0Var.ordinal();
                    if (iOrdinal != 0) {
                        j2 = oj7Var.e;
                    } else if (iOrdinal != 1) {
                        j2 = oj7Var.f;
                    } else {
                        if (iOrdinal == 2) {
                            uhc.a();
                            return;
                        }
                        j2 = oj7Var.g;
                    }
                }
                if (z) {
                    bVar2.N(496051715);
                    twd0VarC = hw90.a(j2, oj7.a(kzf0Var, bVar2), null, bVar2, 0, 12);
                    bVar2.X(false);
                } else {
                    bVar2.N(496141925);
                    twd0VarC = m.c(new j58(j2), bVar2);
                    bVar2.X(false);
                }
                if (z) {
                    iOrdinal3 = kzf0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        bVar2 = bVar2;
                        bVar2 = bVar2;
                        j3 = oj7Var.h;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            bVar2 = bVar2;
                            uhc.a();
                            return;
                        }
                        bVar2 = bVar2;
                        bVar2 = bVar2;
                        j3 = oj7Var.h;
                    } else {
                        j3 = oj7Var.i;
                    }
                } else {
                    iOrdinal2 = kzf0Var.ordinal();
                    if (iOrdinal2 != 0) {
                        j3 = oj7Var.j;
                    } else if (iOrdinal2 != 1) {
                        j3 = oj7Var.k;
                    } else {
                        if (iOrdinal2 == 2) {
                            bVar2 = bVar2;
                            uhc.a();
                            return;
                        }
                        j3 = oj7Var.l;
                    }
                }
                if (z) {
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    bVar2.N(633231558);
                    b bVar3 = bVar2;
                    twd0VarC2 = hw90.a(j3, oj7.a(kzf0Var, bVar2), null, bVar3, 0, 12);
                    bVar = bVar3;
                    bVar.X(false);
                } else {
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    long j4 = j3;
                    bVar = bVar2;
                    bVar.N(633321768);
                    twd0VarC2 = m.c(new j58(j4), bVar);
                    bVar.X(false);
                }
                d dVarN = j.n(j.C(dVar, ht.a.e, 2), 20.0f);
                zM = bVar.M(twd0VarC) | bVar.M(twd0VarC2) | bVar.A(yae0Var2) | bVar.M(twd0VarA) | bVar.M(dVarD2) | bVar.M(dVarD) | bVar.A(yae0Var);
                objY2 = bVar.y();
                if (!zM || objY2 == c0042a) {
                    final twd0 twd0Var = twd0VarC;
                    final twd0 twd0Var2 = twd0VarC2;
                    i3 = 0;
                    Function1 function1 = new Function1() { // from class: tj7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f5;
                            tcf tcfVar = (tcf) obj;
                            long j5 = ((j58) twd0Var.getValue()).a;
                            long j6 = ((j58) twd0Var2.getValue()).a;
                            float fC1 = tcfVar.C1(2.0f);
                            yae0 yae0Var3 = yae0Var2;
                            float f6 = yae0Var3.a;
                            float f7 = f6 / 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                            int i4 = j58.n;
                            if (nbh0.a(j5, j6)) {
                                f5 = 0.0f;
                                tcf.d1(tcfVar, j5, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC1)) & 4294967295L), rlh.a, 0.0f, 226);
                            } else {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                                float f8 = fIntBitsToFloat - (2.0f * f6);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                                float fMax = Math.max(0.0f, fC1 - f6);
                                f5 = 0.0f;
                                tcf.d1(tcfVar, j5, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), rlh.a, 0.0f, 224);
                                float f9 = fIntBitsToFloat - f6;
                                float f10 = fC1 - f7;
                                tcf.d1(tcfVar, j6, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), yae0Var3, 0.0f, 224);
                            }
                            long j7 = ((j58) twd0VarA.getValue()).a;
                            float fFloatValue = ((Number) dVarD2.getValue()).floatValue();
                            float fFloatValue2 = ((Number) dVarD.getValue()).floatValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                            float fB = vcv.b(0.4f, 0.5f, fFloatValue2);
                            float fB2 = vcv.b(0.7f, 0.5f, fFloatValue2);
                            float fB3 = vcv.b(0.5f, 0.5f, fFloatValue2);
                            float fB4 = vcv.b(0.3f, 0.5f, fFloatValue2);
                            mi7 mi7Var2 = mi7Var;
                            mi7Var2.a.j();
                            j90 j90Var = mi7Var2.a;
                            j90Var.a(0.2f * fIntBitsToFloat2, fB3 * fIntBitsToFloat2);
                            j90Var.c(fB * fIntBitsToFloat2, fB2 * fIntBitsToFloat2);
                            j90Var.c(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fB4);
                            l90 l90Var = mi7Var2.b;
                            l90Var.a(j90Var);
                            j90 j90Var2 = mi7Var2.c;
                            j90Var2.j();
                            l90Var.b(f5, l90Var.a.getLength() * fFloatValue, j90Var2);
                            tcf.Q1(tcfVar, mi7Var2.c, j7, 0.0f, yae0Var, 52);
                            return Unit.a;
                        }
                    };
                    bVar.r(function1);
                    objY2 = function1;
                } else {
                    i3 = 0;
                }
                rxo.b(dVarN, (Function1) objY2, bVar, i3);
            }
            a5a0Var = gohVarB;
            bVarI.X(false);
            dVarD = vtg0.d(dtg0VarF, fValueOf3, fValueOf4, a5a0Var, g0h0Var, bVarI, 0);
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new mi7(0);
                bVarI.r(objY);
            }
            mi7Var = (mi7) objY;
            oj7Var.getClass();
            if (kzf0Var == kzf0Var4) {
                j = oj7Var.b;
            } else {
                j = oj7Var.a;
            }
            twd0VarA = hw90.a(j, oj7.a(kzf0Var, bVarI), null, bVarI, 0, 12);
            bVar2 = bVarI;
            if (z) {
                iOrdinal4 = kzf0Var.ordinal();
                if (iOrdinal4 == 0) {
                    j2 = oj7Var.c;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        uhc.a();
                        return;
                    }
                    j2 = oj7Var.c;
                } else {
                    j2 = oj7Var.d;
                }
            } else {
                iOrdinal = kzf0Var.ordinal();
                if (iOrdinal != 0) {
                    j2 = oj7Var.e;
                } else if (iOrdinal != 1) {
                    j2 = oj7Var.f;
                } else {
                    if (iOrdinal == 2) {
                        uhc.a();
                        return;
                    }
                    j2 = oj7Var.g;
                }
            }
            if (z) {
                bVar2.N(496051715);
                twd0VarC = hw90.a(j2, oj7.a(kzf0Var, bVar2), null, bVar2, 0, 12);
                bVar2.X(false);
            } else {
                bVar2.N(496141925);
                twd0VarC = m.c(new j58(j2), bVar2);
                bVar2.X(false);
            }
            if (z) {
                iOrdinal3 = kzf0Var.ordinal();
                if (iOrdinal3 == 0) {
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    j3 = oj7Var.h;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        bVar2 = bVar2;
                        uhc.a();
                        return;
                    }
                    bVar2 = bVar2;
                    bVar2 = bVar2;
                    j3 = oj7Var.h;
                } else {
                    j3 = oj7Var.i;
                }
            } else {
                iOrdinal2 = kzf0Var.ordinal();
                if (iOrdinal2 != 0) {
                    j3 = oj7Var.j;
                } else if (iOrdinal2 != 1) {
                    j3 = oj7Var.k;
                } else {
                    if (iOrdinal2 == 2) {
                        bVar2 = bVar2;
                        uhc.a();
                        return;
                    }
                    j3 = oj7Var.l;
                }
            }
            if (z) {
                bVar2 = bVar2;
                bVar2 = bVar2;
                bVar2 = bVar2;
                bVar2 = bVar2;
                bVar2.N(633231558);
                b bVar4 = bVar2;
                twd0VarC2 = hw90.a(j3, oj7.a(kzf0Var, bVar2), null, bVar4, 0, 12);
                bVar = bVar4;
                bVar.X(false);
            } else {
                bVar2 = bVar2;
                bVar2 = bVar2;
                bVar2 = bVar2;
                bVar2 = bVar2;
                long j5 = j3;
                bVar = bVar2;
                bVar.N(633321768);
                twd0VarC2 = m.c(new j58(j5), bVar);
                bVar.X(false);
            }
            d dVarN2 = j.n(j.C(dVar, ht.a.e, 2), 20.0f);
            zM = bVar.M(twd0VarC) | bVar.M(twd0VarC2) | bVar.A(yae0Var2) | bVar.M(twd0VarA) | bVar.M(dVarD2) | bVar.M(dVarD) | bVar.A(yae0Var);
            objY2 = bVar.y();
            if (zM) {
                final twd0 twd0Var3 = twd0VarC;
                final twd0 twd0Var4 = twd0VarC2;
                i3 = 0;
                Function1 function2 = new Function1() { // from class: tj7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f5;
                        tcf tcfVar = (tcf) obj;
                        long j6 = ((j58) twd0Var3.getValue()).a;
                        long j7 = ((j58) twd0Var4.getValue()).a;
                        float fC1 = tcfVar.C1(2.0f);
                        yae0 yae0Var3 = yae0Var2;
                        float f6 = yae0Var3.a;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        int i4 = j58.n;
                        if (nbh0.a(j6, j7)) {
                            f5 = 0.0f;
                            tcf.d1(tcfVar, j6, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC1)) & 4294967295L), rlh.a, 0.0f, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                            float f8 = fIntBitsToFloat - (2.0f * f6);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                            float fMax = Math.max(0.0f, fC1 - f6);
                            f5 = 0.0f;
                            tcf.d1(tcfVar, j6, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), rlh.a, 0.0f, 224);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fC1 - f7;
                            tcf.d1(tcfVar, j7, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), yae0Var3, 0.0f, 224);
                        }
                        long j8 = ((j58) twd0VarA.getValue()).a;
                        float fFloatValue = ((Number) dVarD2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) dVarD.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fB = vcv.b(0.4f, 0.5f, fFloatValue2);
                        float fB2 = vcv.b(0.7f, 0.5f, fFloatValue2);
                        float fB3 = vcv.b(0.5f, 0.5f, fFloatValue2);
                        float fB4 = vcv.b(0.3f, 0.5f, fFloatValue2);
                        mi7 mi7Var2 = mi7Var;
                        mi7Var2.a.j();
                        j90 j90Var = mi7Var2.a;
                        j90Var.a(0.2f * fIntBitsToFloat2, fB3 * fIntBitsToFloat2);
                        j90Var.c(fB * fIntBitsToFloat2, fB2 * fIntBitsToFloat2);
                        j90Var.c(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fB4);
                        l90 l90Var = mi7Var2.b;
                        l90Var.a(j90Var);
                        j90 j90Var2 = mi7Var2.c;
                        j90Var2.j();
                        l90Var.b(f5, l90Var.a.getLength() * fFloatValue, j90Var2);
                        tcf.Q1(tcfVar, mi7Var2.c, j8, 0.0f, yae0Var, 52);
                        return Unit.a;
                    }
                };
                bVar.r(function2);
                objY2 = function2;
            } else {
                final twd0 twd0Var5 = twd0VarC;
                final twd0 twd0Var6 = twd0VarC2;
                i3 = 0;
                Function1 function3 = new Function1() { // from class: tj7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f5;
                        tcf tcfVar = (tcf) obj;
                        long j6 = ((j58) twd0Var5.getValue()).a;
                        long j7 = ((j58) twd0Var6.getValue()).a;
                        float fC1 = tcfVar.C1(2.0f);
                        yae0 yae0Var3 = yae0Var2;
                        float f6 = yae0Var3.a;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        int i4 = j58.n;
                        if (nbh0.a(j6, j7)) {
                            f5 = 0.0f;
                            tcf.d1(tcfVar, j6, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(fC1)) << 32) | (((long) Float.floatToRawIntBits(fC1)) & 4294967295L), rlh.a, 0.0f, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
                            float f8 = fIntBitsToFloat - (2.0f * f6);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                            float fMax = Math.max(0.0f, fC1 - f6);
                            f5 = 0.0f;
                            tcf.d1(tcfVar, j6, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), rlh.a, 0.0f, 224);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fC1 - f7;
                            tcf.d1(tcfVar, j7, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), yae0Var3, 0.0f, 224);
                        }
                        long j8 = ((j58) twd0VarA.getValue()).a;
                        float fFloatValue = ((Number) dVarD2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) dVarD.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fB = vcv.b(0.4f, 0.5f, fFloatValue2);
                        float fB2 = vcv.b(0.7f, 0.5f, fFloatValue2);
                        float fB3 = vcv.b(0.5f, 0.5f, fFloatValue2);
                        float fB4 = vcv.b(0.3f, 0.5f, fFloatValue2);
                        mi7 mi7Var2 = mi7Var;
                        mi7Var2.a.j();
                        j90 j90Var = mi7Var2.a;
                        j90Var.a(0.2f * fIntBitsToFloat2, fB3 * fIntBitsToFloat2);
                        j90Var.c(fB * fIntBitsToFloat2, fB2 * fIntBitsToFloat2);
                        j90Var.c(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fB4);
                        l90 l90Var = mi7Var2.b;
                        l90Var.a(j90Var);
                        j90 j90Var2 = mi7Var2.c;
                        j90Var2.j();
                        l90Var.b(f5, l90Var.a.getLength() * fFloatValue, j90Var2);
                        tcf.Q1(tcfVar, mi7Var2.c, j8, 0.0f, yae0Var, 52);
                        return Unit.a;
                    }
                };
                bVar.r(function3);
                objY2 = function3;
            }
            rxo.b(dVarN2, (Function1) objY2, bVar, i3);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uj7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vj7.b(z, kzf0Var, dVar, oj7Var, yae0Var, yae0Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final kzf0 kzf0Var, final Function0 function0, final yae0 yae0Var, final yae0 yae0Var2, final d dVar, final boolean z, final oj7 oj7Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-406243761);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(kzf0Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(yae0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(yae0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(oj7Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.M(null) ? 8388608 : 4194304;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            d dVar2 = d.a.b;
            d dVarC = function0 != null ? c.c(kzf0Var, ut50.b(wj7.d / 2.0f, 4, 0L, false), z, new su50(1), function0) : dVar2;
            if (function0 != null) {
                mjm mjmVar = zxo.a;
                dVar2 = MinimumInteractiveModifier.b;
            }
            d dVarF = h.f(dVar.n(dVar2).n(dVarC), 2.0f);
            int i3 = ((i2 >> 15) & 14) | ((i2 << 3) & 112) | ((i2 >> 9) & 7168);
            int i4 = i2 << 6;
            b(z, kzf0Var, dVarF, oj7Var, yae0Var, yae0Var2, bVarI, i3 | (57344 & i4) | (i4 & 458752));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sj7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vj7.c(kzf0Var, function0, yae0Var, yae0Var2, dVar, z, oj7Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
