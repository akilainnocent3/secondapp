package defpackage;

import androidx.compose.animation.f;
import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class hh0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(dtg0 dtg0Var, Function1 function1, d dVar, s9g s9gVar, g gVar, Function2 function2, op8 op8Var, a aVar, int i) {
        int i2;
        b bVar;
        boolean z;
        b bVarI = aVar.i(1912839215);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dtg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(s9gVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(gVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function2) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (bVarI.q(i4 & 1, (i4 & 4793491) != 4793490)) {
            ytw ytwVar = dtg0Var.d;
            o oVar = dtg0Var.a;
            if (((Boolean) function1.invoke(((x5a0) ytwVar).getValue())).booleanValue() || ((Boolean) function1.invoke(oVar.V())).booleanValue() || dtg0Var.i() || dtg0Var.d()) {
                bVarI.N(-232323267);
                int i5 = i4 & 14;
                int i6 = i5 | 48;
                int i7 = i6 & 14;
                boolean z2 = ((i7 ^ 6) > 4 && bVarI.M(dtg0Var)) || (i6 & 6) == 4;
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z2 || objY == c0042a) {
                    objY = oVar.V();
                    bVarI.r(objY);
                }
                if (dtg0Var.i()) {
                    objY = oVar.V();
                }
                bVarI.N(1844425648);
                w7g w7gVarG = g(dtg0Var, function1, objY, bVarI);
                bVarI.X(false);
                Object value = ((x5a0) dtg0Var.d).getValue();
                bVarI.N(1844425648);
                w7g w7gVarG2 = g(dtg0Var, function1, value, bVarI);
                bVarI.X(false);
                dtg0 dtg0VarB = vtg0.b(dtg0Var, w7gVarG, w7gVarG2, "EnterExitTransition", bVarI, i7 | 3072);
                ytw ytwVarC = m.c(function2, bVarI);
                o oVar2 = dtg0VarB.a;
                ytw ytwVar2 = dtg0VarB.d;
                Object objInvoke = function2.invoke(oVar2.V(), ((x5a0) ytwVar2).getValue());
                boolean zM = bVarI.M(dtg0VarB) | bVarI.M(ytwVarC);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new ug0(dtg0VarB, ytwVarC, null);
                    bVarI.r(objY2);
                }
                Function2 function3 = (Function2) objY2;
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = m.b(objInvoke);
                    bVarI.r(objY3);
                }
                ytw ytwVar3 = (ytw) objY3;
                Unit unit = Unit.a;
                boolean zA = bVarI.A(function3);
                Object objY4 = bVarI.y();
                if (zA || objY4 == c0042a) {
                    objY4 = new b6a0(function3, ytwVar3, null);
                    bVarI.r(objY4);
                }
                xvf.e(bVarI, unit, (Function2) objY4);
                Object objV = dtg0VarB.a.V();
                w7g w7gVar = w7g.c;
                if (objV == w7gVar && ((x5a0) ytwVar2).getValue() == w7gVar && ((Boolean) ytwVar3.getValue()).booleanValue()) {
                    bVarI.N(-230155437);
                    bVarI.X(false);
                    z = false;
                    bVar = bVarI;
                } else {
                    bVarI.N(-231293261);
                    boolean z3 = i5 == 4;
                    Object objY5 = bVarI.y();
                    if (z3 || objY5 == c0042a) {
                        objY5 = new kh0(dtg0VarB);
                        bVarI.r(objY5);
                    }
                    kh0 kh0Var = (kh0) objY5;
                    int i8 = i4 >> 6;
                    z = false;
                    d dVarA = f.a(dtg0VarB, s9gVar, gVar, null, "Built-in", bVarI, (i8 & 112) | 24576 | (i8 & 896), 4);
                    bVar = bVarI;
                    bVar.N(-7429769);
                    bVar.X(false);
                    d dVarN = dVar.n(dVarA.n(d.a.b));
                    Object objY6 = bVar.y();
                    if (objY6 == c0042a) {
                        objY6 = new rf0(kh0Var);
                        bVar.r(objY6);
                    }
                    rf0 rf0Var = (rf0) objY6;
                    int iHashCode = Long.hashCode(bVar.T);
                    ne00 ne00VarS = bVar.S();
                    d dVarC = c.c(bVar, dVarN);
                    yka.k.getClass();
                    tsr.a aVar2 = yka.a.b;
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar2);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, rf0Var, yka.a.f);
                    hlh0.a(bVar, ne00VarS, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVar, iHashCode, c1350a);
                    }
                    hlh0.a(bVar, dVarC, yka.a.d);
                    op8Var.invoke(kh0Var, bVar, Integer.valueOf((i4 >> 18) & 112));
                    bVar.X(true);
                    bVar.X(false);
                }
                bVar.X(z);
            } else {
                bVarI.N(-230149485);
                bVarI.X(false);
                bVar = bVarI;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new tg0(dtg0Var, function1, dVar, s9gVar, gVar, function2, op8Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void b(j78 j78Var, boolean z, d dVar, s9g s9gVar, g gVar, String str, op8 op8Var, a aVar, int i, int i2) {
        int i3;
        d dVar2;
        int i4;
        s9g s9gVar2;
        int i5;
        int i6;
        g gVar2;
        int i7;
        int i8;
        boolean z2;
        String str2;
        s9g s9gVar3;
        g gVar3;
        e eVarZ;
        d dVar3;
        s9g s9gVarB;
        g gVarB;
        Object objY;
        int i9;
        b bVarI = aVar.i(1799879339);
        if ((i & 48) == 0) {
            i3 = (bVarI.b(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    s9gVar2 = s9gVar;
                    if (bVarI.M(s9gVar2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        gVar2 = gVar;
                        if (bVarI.M(gVar2)) {
                            i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    if ((1572864 & i) == 0) {
                        if (bVarI.A(op8Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i8 |= i9;
                    }
                    if ((599185 & i8) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i8 & 1, z2)) {
                        if (i10 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i4 != 0) {
                            s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                        } else {
                            s9gVarB = s9gVar2;
                        }
                        if (i6 != 0) {
                            gVarB = f.g(null, 3).b(f.m(null, null, 15));
                        } else {
                            gVarB = gVar2;
                        }
                        int i11 = i8 >> 3;
                        str2 = "AnimatedVisibility";
                        dtg0 dtg0VarF = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i11 & 14) | ((i8 >> 12) & 112), 0);
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = zg0.a;
                            bVarI.r(objY);
                        }
                        d dVar4 = dVar3;
                        f(dtg0VarF, (Function1) objY, dVar4, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i11));
                        dVar2 = dVar4;
                        s9gVar3 = s9gVarB;
                        gVar3 = gVarB;
                    } else {
                        bVarI.G();
                        str2 = str;
                        s9gVar3 = s9gVar2;
                        gVar3 = gVar2;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
                    }
                }
                i3 |= 24576;
                gVar2 = gVar;
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i8 & 1, z2)) {
                    if (i10 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.g(null, 3).b(f.m(null, null, 15));
                    } else {
                        gVarB = gVar2;
                    }
                    int i12 = i8 >> 3;
                    str2 = "AnimatedVisibility";
                    dtg0 dtg0VarF2 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i12 & 14) | ((i8 >> 12) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = zg0.a;
                        bVarI.r(objY);
                    }
                    d dVar5 = dVar3;
                    f(dtg0VarF2, (Function1) objY, dVar5, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i12));
                    dVar2 = dVar5;
                    s9gVar3 = s9gVarB;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    str2 = str;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 3072;
            s9gVar2 = s9gVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    gVar2 = gVar;
                    if (bVarI.M(gVar2)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i8 & 1, z2)) {
                    if (i10 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.g(null, 3).b(f.m(null, null, 15));
                    } else {
                        gVarB = gVar2;
                    }
                    int i13 = i8 >> 3;
                    str2 = "AnimatedVisibility";
                    dtg0 dtg0VarF3 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i13 & 14) | ((i8 >> 12) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = zg0.a;
                        bVarI.r(objY);
                    }
                    d dVar6 = dVar3;
                    f(dtg0VarF3, (Function1) objY, dVar6, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i13));
                    dVar2 = dVar6;
                    s9gVar3 = s9gVarB;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    str2 = str;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 24576;
            gVar2 = gVar;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i8 & 1, z2)) {
                if (i10 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.g(null, 3).b(f.m(null, null, 15));
                } else {
                    gVarB = gVar2;
                }
                int i14 = i8 >> 3;
                str2 = "AnimatedVisibility";
                dtg0 dtg0VarF4 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i14 & 14) | ((i8 >> 12) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = zg0.a;
                    bVarI.r(objY);
                }
                d dVar7 = dVar3;
                f(dtg0VarF4, (Function1) objY, dVar7, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i14));
                dVar2 = dVar7;
                s9gVar3 = s9gVarB;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                str2 = str;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                s9gVar2 = s9gVar;
                if (bVarI.M(s9gVar2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    gVar2 = gVar;
                    if (bVarI.M(gVar2)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i8 & 1, z2)) {
                    if (i10 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.g(null, 3).b(f.m(null, null, 15));
                    } else {
                        gVarB = gVar2;
                    }
                    int i15 = i8 >> 3;
                    str2 = "AnimatedVisibility";
                    dtg0 dtg0VarF5 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i15 & 14) | ((i8 >> 12) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = zg0.a;
                        bVarI.r(objY);
                    }
                    d dVar8 = dVar3;
                    f(dtg0VarF5, (Function1) objY, dVar8, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i15));
                    dVar2 = dVar8;
                    s9gVar3 = s9gVarB;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    str2 = str;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 24576;
            gVar2 = gVar;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i8 & 1, z2)) {
                if (i10 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.g(null, 3).b(f.m(null, null, 15));
                } else {
                    gVarB = gVar2;
                }
                int i16 = i8 >> 3;
                str2 = "AnimatedVisibility";
                dtg0 dtg0VarF6 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i16 & 14) | ((i8 >> 12) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = zg0.a;
                    bVarI.r(objY);
                }
                d dVar9 = dVar3;
                f(dtg0VarF6, (Function1) objY, dVar9, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i16));
                dVar2 = dVar9;
                s9gVar3 = s9gVarB;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                str2 = str;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 3072;
        s9gVar2 = s9gVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                gVar2 = gVar;
                if (bVarI.M(gVar2)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i8 & 1, z2)) {
                if (i10 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.g(null, 3).b(f.m(null, null, 15));
                } else {
                    gVarB = gVar2;
                }
                int i17 = i8 >> 3;
                str2 = "AnimatedVisibility";
                dtg0 dtg0VarF7 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i17 & 14) | ((i8 >> 12) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = zg0.a;
                    bVarI.r(objY);
                }
                d dVar10 = dVar3;
                f(dtg0VarF7, (Function1) objY, dVar10, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i17));
                dVar2 = dVar10;
                s9gVar3 = s9gVarB;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                str2 = str;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 24576;
        gVar2 = gVar;
        i8 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i8 |= i9;
        }
        if ((599185 & i8) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i8 & 1, z2)) {
            if (i10 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i4 != 0) {
                s9gVarB = f.f(null, 3).b(f.e(null, null, 15));
            } else {
                s9gVarB = s9gVar2;
            }
            if (i6 != 0) {
                gVarB = f.g(null, 3).b(f.m(null, null, 15));
            } else {
                gVarB = gVar2;
            }
            int i18 = i8 >> 3;
            str2 = "AnimatedVisibility";
            dtg0 dtg0VarF8 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i18 & 14) | ((i8 >> 12) & 112), 0);
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = zg0.a;
                bVarI.r(objY);
            }
            d dVar11 = dVar3;
            f(dtg0VarF8, (Function1) objY, dVar11, s9gVarB, gVarB, op8Var, bVarI, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (458752 & i18));
            dVar2 = dVar11;
            s9gVar3 = s9gVarB;
            gVar3 = gVarB;
        } else {
            bVarI.G();
            str2 = str;
            s9gVar3 = s9gVar2;
            gVar3 = gVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ah0(j78Var, z, dVar2, s9gVar3, gVar3, str2, op8Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void c(cuw cuwVar, d dVar, t9g t9gVar, owg owgVar, String str, op8 op8Var, a aVar, int i, int i2) {
        int i3;
        d dVar2;
        int i4;
        boolean z;
        String str2;
        d dVar3;
        e eVarZ;
        d dVar4;
        Object objY;
        int i5;
        int i6;
        int i7;
        b bVarI = aVar.i(657024243);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(cuwVar) : bVarI.A(cuwVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bVarI.M(t9gVar)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
            }
            if ((i & 3072) == 0) {
                if (bVarI.M(owgVar)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i4 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                if (i8 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                dtg0 dtg0VarE = vtg0.e(cuwVar, "AnimatedVisibility", bVarI, (i4 & 14) | ((i4 >> 9) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = bh0.a;
                    bVarI.r(objY);
                }
                Function1 function1 = (Function1) objY;
                int i9 = i4 << 3;
                f(dtg0VarE, function1, dVar4, t9gVar, owgVar, op8Var, bVarI, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i4 & 458752));
                str2 = "AnimatedVisibility";
                dVar3 = dVar4;
            } else {
                bVarI.G();
                str2 = str;
                dVar3 = dVar2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new ch0(cuwVar, dVar3, t9gVar, owgVar, str2, op8Var, i, i2);
            }
        }
        i3 |= 48;
        dVar2 = dVar;
        if ((i & 384) == 0) {
            if (bVarI.M(t9gVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i & 3072) == 0) {
            if (bVarI.M(owgVar)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        i4 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            if (i8 != 0) {
                dVar4 = d.a.b;
            } else {
                dVar4 = dVar2;
            }
            dtg0 dtg0VarE2 = vtg0.e(cuwVar, "AnimatedVisibility", bVarI, (i4 & 14) | ((i4 >> 9) & 112), 0);
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = bh0.a;
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            int i10 = i4 << 3;
            f(dtg0VarE2, function2, dVar4, t9gVar, owgVar, op8Var, bVarI, (i10 & 57344) | (i10 & 896) | 48 | (i10 & 7168) | (i4 & 458752));
            str2 = "AnimatedVisibility";
            dVar3 = dVar4;
        } else {
            bVarI.G();
            str2 = str;
            dVar3 = dVar2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ch0(cuwVar, dVar3, t9gVar, owgVar, str2, op8Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void d(e160 e160Var, boolean z, d dVar, t9g t9gVar, g gVar, String str, op8 op8Var, a aVar, int i, int i2) {
        int i3;
        d dVar2;
        int i4;
        g gVar2;
        int i5;
        int i6;
        boolean z2;
        String str2;
        e eVarZ;
        d dVar3;
        g gVarB;
        Object objY;
        int i7;
        int i8;
        b bVarI = aVar.i(234057107);
        if ((i & 48) == 0) {
            i3 = (bVarI.b(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (bVarI.M(t9gVar)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    gVar2 = gVar;
                    if (bVarI.M(gVar2)) {
                        i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i6 |= i7;
                }
                if ((599185 & i6) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i6 & 1, z2)) {
                    if (i9 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 != 0) {
                        gVarB = f.g(null, 3).b(f.j(null, null, 15));
                    } else {
                        gVarB = gVar2;
                    }
                    int i10 = i6 >> 3;
                    dtg0 dtg0VarF = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i10 & 14) | ((i6 >> 12) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = xg0.a;
                        bVarI.r(objY);
                    }
                    f(dtg0VarF, (Function1) objY, dVar3, t9gVar, gVarB, op8Var, bVarI, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (458752 & i10));
                    str2 = "AnimatedVisibility";
                    dVar2 = dVar3;
                    gVar2 = gVarB;
                } else {
                    bVarI.G();
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new yg0(e160Var, z, dVar2, t9gVar, gVar2, str2, op8Var, i, i2);
                }
            }
            i3 |= 24576;
            gVar2 = gVar;
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i6 |= i7;
            }
            if ((599185 & i6) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i6 & 1, z2)) {
                if (i9 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    gVarB = f.g(null, 3).b(f.j(null, null, 15));
                } else {
                    gVarB = gVar2;
                }
                int i11 = i6 >> 3;
                dtg0 dtg0VarF2 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i11 & 14) | ((i6 >> 12) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = xg0.a;
                    bVarI.r(objY);
                }
                f(dtg0VarF2, (Function1) objY, dVar3, t9gVar, gVarB, op8Var, bVarI, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (458752 & i11));
                str2 = "AnimatedVisibility";
                dVar2 = dVar3;
                gVar2 = gVarB;
            } else {
                bVarI.G();
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new yg0(e160Var, z, dVar2, t9gVar, gVar2, str2, op8Var, i, i2);
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        if ((i & 3072) == 0) {
            if (bVarI.M(t9gVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                gVar2 = gVar;
                if (bVarI.M(gVar2)) {
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i6 |= i7;
            }
            if ((599185 & i6) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i6 & 1, z2)) {
                if (i9 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 != 0) {
                    gVarB = f.g(null, 3).b(f.j(null, null, 15));
                } else {
                    gVarB = gVar2;
                }
                int i12 = i6 >> 3;
                dtg0 dtg0VarF3 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i12 & 14) | ((i6 >> 12) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = xg0.a;
                    bVarI.r(objY);
                }
                f(dtg0VarF3, (Function1) objY, dVar3, t9gVar, gVarB, op8Var, bVarI, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (458752 & i12));
                str2 = "AnimatedVisibility";
                dVar2 = dVar3;
                gVar2 = gVarB;
            } else {
                bVarI.G();
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new yg0(e160Var, z, dVar2, t9gVar, gVar2, str2, op8Var, i, i2);
            }
        }
        i3 |= 24576;
        gVar2 = gVar;
        i6 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i6 |= i7;
        }
        if ((599185 & i6) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i6 & 1, z2)) {
            if (i9 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i4 != 0) {
                gVarB = f.g(null, 3).b(f.j(null, null, 15));
            } else {
                gVarB = gVar2;
            }
            int i13 = i6 >> 3;
            dtg0 dtg0VarF4 = vtg0.f(Boolean.valueOf(z), "AnimatedVisibility", bVarI, (i13 & 14) | ((i6 >> 12) & 112), 0);
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = xg0.a;
                bVarI.r(objY);
            }
            f(dtg0VarF4, (Function1) objY, dVar3, t9gVar, gVarB, op8Var, bVarI, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (458752 & i13));
            str2 = "AnimatedVisibility";
            dVar2 = dVar3;
            gVar2 = gVarB;
        } else {
            bVarI.G();
            str2 = str;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yg0(e160Var, z, dVar2, t9gVar, gVar2, str2, op8Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void e(boolean z, d dVar, s9g s9gVar, g gVar, String str, op8 op8Var, a aVar, int i, int i2) {
        int i3;
        d dVar2;
        int i4;
        s9g s9gVar2;
        int i5;
        int i6;
        g gVar2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        d dVar3;
        s9g s9gVar3;
        g gVar3;
        String str2;
        e eVarZ;
        d dVar4;
        s9g s9gVarB;
        g gVarB;
        String str3;
        Object objY;
        int i10;
        b bVarI = aVar.i(-1448730565);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    s9gVar2 = s9gVar;
                    if (bVarI.M(s9gVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        gVar2 = gVar;
                        if (bVarI.M(gVar2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            if (bVarI.M(str)) {
                                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((196608 & i) == 0) {
                            if (bVarI.A(op8Var)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                        if ((74899 & i3) != 74898) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (bVarI.q(i3 & 1, z2)) {
                            if (i11 != 0) {
                                dVar4 = d.a.b;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i4 != 0) {
                                s9gVarB = f.f(null, 3).b(f.d(null, 15));
                            } else {
                                s9gVarB = s9gVar2;
                            }
                            if (i6 != 0) {
                                gVarB = f.l(null, 15).b(f.g(null, 3));
                            } else {
                                gVarB = gVar2;
                            }
                            if (i8 != 0) {
                                str3 = "AnimatedVisibility";
                            } else {
                                str3 = str;
                            }
                            dtg0 dtg0VarF = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            objY = bVarI.y();
                            if (objY == a.C0041a.a) {
                                objY = vg0.a;
                                bVarI.r(objY);
                            }
                            Function1 function1 = (Function1) objY;
                            int i12 = i3 << 3;
                            s9g s9gVar4 = s9gVarB;
                            f(dtg0VarF, function1, dVar4, s9gVar4, gVarB, op8Var, bVarI, (i12 & 57344) | (i12 & 896) | 48 | (i12 & 7168) | (i3 & 458752));
                            str2 = str3;
                            dVar3 = dVar4;
                            s9gVar3 = s9gVar4;
                            gVar3 = gVarB;
                        } else {
                            bVarI.G();
                            dVar3 = dVar2;
                            s9gVar3 = s9gVar2;
                            gVar3 = gVar2;
                            str2 = str;
                        }
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                        }
                    }
                    i3 |= 24576;
                    if ((196608 & i) == 0) {
                        if (bVarI.A(op8Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i3 & 1, z2)) {
                        if (i11 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            s9gVarB = f.f(null, 3).b(f.d(null, 15));
                        } else {
                            s9gVarB = s9gVar2;
                        }
                        if (i6 != 0) {
                            gVarB = f.l(null, 15).b(f.g(null, 3));
                        } else {
                            gVarB = gVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        dtg0 dtg0VarF2 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = vg0.a;
                            bVarI.r(objY);
                        }
                        Function1 function2 = (Function1) objY;
                        int i13 = i3 << 3;
                        s9g s9gVar5 = s9gVarB;
                        f(dtg0VarF2, function2, dVar4, s9gVar5, gVarB, op8Var, bVarI, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i3 & 458752));
                        str2 = str3;
                        dVar3 = dVar4;
                        s9gVar3 = s9gVar5;
                        gVar3 = gVarB;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        s9gVar3 = s9gVar2;
                        gVar3 = gVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                    }
                }
                i3 |= 3072;
                gVar2 = gVar;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(str)) {
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (bVarI.A(op8Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i3 & 1, z2)) {
                        if (i11 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            s9gVarB = f.f(null, 3).b(f.d(null, 15));
                        } else {
                            s9gVarB = s9gVar2;
                        }
                        if (i6 != 0) {
                            gVarB = f.l(null, 15).b(f.g(null, 3));
                        } else {
                            gVarB = gVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        dtg0 dtg0VarF3 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = vg0.a;
                            bVarI.r(objY);
                        }
                        Function1 function3 = (Function1) objY;
                        int i14 = i3 << 3;
                        s9g s9gVar6 = s9gVarB;
                        f(dtg0VarF3, function3, dVar4, s9gVar6, gVarB, op8Var, bVarI, (i14 & 57344) | (i14 & 896) | 48 | (i14 & 7168) | (i3 & 458752));
                        str2 = str3;
                        dVar3 = dVar4;
                        s9gVar3 = s9gVar6;
                        gVar3 = gVarB;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        s9gVar3 = s9gVar2;
                        gVar3 = gVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i3 & 1, z2)) {
                    if (i11 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.d(null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.l(null, 15).b(f.g(null, 3));
                    } else {
                        gVarB = gVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    dtg0 dtg0VarF4 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = vg0.a;
                        bVarI.r(objY);
                    }
                    Function1 function4 = (Function1) objY;
                    int i15 = i3 << 3;
                    s9g s9gVar7 = s9gVarB;
                    f(dtg0VarF4, function4, dVar4, s9gVar7, gVarB, op8Var, bVarI, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i3 & 458752));
                    str2 = str3;
                    dVar3 = dVar4;
                    s9gVar3 = s9gVar7;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 384;
            s9gVar2 = s9gVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    gVar2 = gVar;
                    if (bVarI.M(gVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(str)) {
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (bVarI.A(op8Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i3 & 1, z2)) {
                        if (i11 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            s9gVarB = f.f(null, 3).b(f.d(null, 15));
                        } else {
                            s9gVarB = s9gVar2;
                        }
                        if (i6 != 0) {
                            gVarB = f.l(null, 15).b(f.g(null, 3));
                        } else {
                            gVarB = gVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        dtg0 dtg0VarF5 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = vg0.a;
                            bVarI.r(objY);
                        }
                        Function1 function5 = (Function1) objY;
                        int i16 = i3 << 3;
                        s9g s9gVar8 = s9gVarB;
                        f(dtg0VarF5, function5, dVar4, s9gVar8, gVarB, op8Var, bVarI, (i16 & 57344) | (i16 & 896) | 48 | (i16 & 7168) | (i3 & 458752));
                        str2 = str3;
                        dVar3 = dVar4;
                        s9gVar3 = s9gVar8;
                        gVar3 = gVarB;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        s9gVar3 = s9gVar2;
                        gVar3 = gVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i3 & 1, z2)) {
                    if (i11 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.d(null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.l(null, 15).b(f.g(null, 3));
                    } else {
                        gVarB = gVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    dtg0 dtg0VarF6 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = vg0.a;
                        bVarI.r(objY);
                    }
                    Function1 function6 = (Function1) objY;
                    int i17 = i3 << 3;
                    s9g s9gVar9 = s9gVarB;
                    f(dtg0VarF6, function6, dVar4, s9gVar9, gVarB, op8Var, bVarI, (i17 & 57344) | (i17 & 896) | 48 | (i17 & 7168) | (i3 & 458752));
                    str2 = str3;
                    dVar3 = dVar4;
                    s9gVar3 = s9gVar9;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 3072;
            gVar2 = gVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(str)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i3 & 1, z2)) {
                    if (i11 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.d(null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.l(null, 15).b(f.g(null, 3));
                    } else {
                        gVarB = gVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    dtg0 dtg0VarF7 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = vg0.a;
                        bVarI.r(objY);
                    }
                    Function1 function7 = (Function1) objY;
                    int i18 = i3 << 3;
                    s9g s9gVar10 = s9gVarB;
                    f(dtg0VarF7, function7, dVar4, s9gVar10, gVarB, op8Var, bVarI, (i18 & 57344) | (i18 & 896) | 48 | (i18 & 7168) | (i3 & 458752));
                    str2 = str3;
                    dVar3 = dVar4;
                    s9gVar3 = s9gVar10;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                if (i11 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.d(null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.l(null, 15).b(f.g(null, 3));
                } else {
                    gVarB = gVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                dtg0 dtg0VarF8 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = vg0.a;
                    bVarI.r(objY);
                }
                Function1 function8 = (Function1) objY;
                int i19 = i3 << 3;
                s9g s9gVar11 = s9gVarB;
                f(dtg0VarF8, function8, dVar4, s9gVar11, gVarB, op8Var, bVarI, (i19 & 57344) | (i19 & 896) | 48 | (i19 & 7168) | (i3 & 458752));
                str2 = str3;
                dVar3 = dVar4;
                s9gVar3 = s9gVar11;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 48;
        dVar2 = dVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                s9gVar2 = s9gVar;
                if (bVarI.M(s9gVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    gVar2 = gVar;
                    if (bVarI.M(gVar2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        if (bVarI.M(str)) {
                            i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if (bVarI.A(op8Var)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                    if ((74899 & i3) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i3 & 1, z2)) {
                        if (i11 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            s9gVarB = f.f(null, 3).b(f.d(null, 15));
                        } else {
                            s9gVarB = s9gVar2;
                        }
                        if (i6 != 0) {
                            gVarB = f.l(null, 15).b(f.g(null, 3));
                        } else {
                            gVarB = gVar2;
                        }
                        if (i8 != 0) {
                            str3 = "AnimatedVisibility";
                        } else {
                            str3 = str;
                        }
                        dtg0 dtg0VarF9 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = vg0.a;
                            bVarI.r(objY);
                        }
                        Function1 function9 = (Function1) objY;
                        int i110 = i3 << 3;
                        s9g s9gVar12 = s9gVarB;
                        f(dtg0VarF9, function9, dVar4, s9gVar12, gVarB, op8Var, bVarI, (i110 & 57344) | (i110 & 896) | 48 | (i110 & 7168) | (i3 & 458752));
                        str2 = str3;
                        dVar3 = dVar4;
                        s9gVar3 = s9gVar12;
                        gVar3 = gVarB;
                    } else {
                        bVarI.G();
                        dVar3 = dVar2;
                        s9gVar3 = s9gVar2;
                        gVar3 = gVar2;
                        str2 = str;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                    }
                }
                i3 |= 24576;
                if ((196608 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i3 & 1, z2)) {
                    if (i11 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.d(null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.l(null, 15).b(f.g(null, 3));
                    } else {
                        gVarB = gVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    dtg0 dtg0VarF10 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = vg0.a;
                        bVarI.r(objY);
                    }
                    Function1 function10 = (Function1) objY;
                    int i111 = i3 << 3;
                    s9g s9gVar13 = s9gVarB;
                    f(dtg0VarF10, function10, dVar4, s9gVar13, gVarB, op8Var, bVarI, (i111 & 57344) | (i111 & 896) | 48 | (i111 & 7168) | (i3 & 458752));
                    str2 = str3;
                    dVar3 = dVar4;
                    s9gVar3 = s9gVar13;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 3072;
            gVar2 = gVar;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(str)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i3 & 1, z2)) {
                    if (i11 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.d(null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.l(null, 15).b(f.g(null, 3));
                    } else {
                        gVarB = gVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    dtg0 dtg0VarF11 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = vg0.a;
                        bVarI.r(objY);
                    }
                    Function1 function11 = (Function1) objY;
                    int i112 = i3 << 3;
                    s9g s9gVar14 = s9gVarB;
                    f(dtg0VarF11, function11, dVar4, s9gVar14, gVarB, op8Var, bVarI, (i112 & 57344) | (i112 & 896) | 48 | (i112 & 7168) | (i3 & 458752));
                    str2 = str3;
                    dVar3 = dVar4;
                    s9gVar3 = s9gVar14;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                if (i11 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.d(null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.l(null, 15).b(f.g(null, 3));
                } else {
                    gVarB = gVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                dtg0 dtg0VarF12 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = vg0.a;
                    bVarI.r(objY);
                }
                Function1 function12 = (Function1) objY;
                int i113 = i3 << 3;
                s9g s9gVar15 = s9gVarB;
                f(dtg0VarF12, function12, dVar4, s9gVar15, gVarB, op8Var, bVarI, (i113 & 57344) | (i113 & 896) | 48 | (i113 & 7168) | (i3 & 458752));
                str2 = str3;
                dVar3 = dVar4;
                s9gVar3 = s9gVar15;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 384;
        s9gVar2 = s9gVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                gVar2 = gVar;
                if (bVarI.M(gVar2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    if (bVarI.M(str)) {
                        i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
                if ((74899 & i3) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i3 & 1, z2)) {
                    if (i11 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        s9gVarB = f.f(null, 3).b(f.d(null, 15));
                    } else {
                        s9gVarB = s9gVar2;
                    }
                    if (i6 != 0) {
                        gVarB = f.l(null, 15).b(f.g(null, 3));
                    } else {
                        gVarB = gVar2;
                    }
                    if (i8 != 0) {
                        str3 = "AnimatedVisibility";
                    } else {
                        str3 = str;
                    }
                    dtg0 dtg0VarF13 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = vg0.a;
                        bVarI.r(objY);
                    }
                    Function1 function13 = (Function1) objY;
                    int i114 = i3 << 3;
                    s9g s9gVar16 = s9gVarB;
                    f(dtg0VarF13, function13, dVar4, s9gVar16, gVarB, op8Var, bVarI, (i114 & 57344) | (i114 & 896) | 48 | (i114 & 7168) | (i3 & 458752));
                    str2 = str3;
                    dVar3 = dVar4;
                    s9gVar3 = s9gVar16;
                    gVar3 = gVarB;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    s9gVar3 = s9gVar2;
                    gVar3 = gVar2;
                    str2 = str;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
                }
            }
            i3 |= 24576;
            if ((196608 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                if (i11 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.d(null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.l(null, 15).b(f.g(null, 3));
                } else {
                    gVarB = gVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                dtg0 dtg0VarF14 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = vg0.a;
                    bVarI.r(objY);
                }
                Function1 function14 = (Function1) objY;
                int i115 = i3 << 3;
                s9g s9gVar17 = s9gVarB;
                f(dtg0VarF14, function14, dVar4, s9gVar17, gVarB, op8Var, bVarI, (i115 & 57344) | (i115 & 896) | 48 | (i115 & 7168) | (i3 & 458752));
                str2 = str3;
                dVar3 = dVar4;
                s9gVar3 = s9gVar17;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 3072;
        gVar2 = gVar;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                if (bVarI.M(str)) {
                    i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                if (i11 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    s9gVarB = f.f(null, 3).b(f.d(null, 15));
                } else {
                    s9gVarB = s9gVar2;
                }
                if (i6 != 0) {
                    gVarB = f.l(null, 15).b(f.g(null, 3));
                } else {
                    gVarB = gVar2;
                }
                if (i8 != 0) {
                    str3 = "AnimatedVisibility";
                } else {
                    str3 = str;
                }
                dtg0 dtg0VarF15 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = vg0.a;
                    bVarI.r(objY);
                }
                Function1 function15 = (Function1) objY;
                int i116 = i3 << 3;
                s9g s9gVar18 = s9gVarB;
                f(dtg0VarF15, function15, dVar4, s9gVar18, gVarB, op8Var, bVarI, (i116 & 57344) | (i116 & 896) | 48 | (i116 & 7168) | (i3 & 458752));
                str2 = str3;
                dVar3 = dVar4;
                s9gVar3 = s9gVar18;
                gVar3 = gVarB;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                s9gVar3 = s9gVar2;
                gVar3 = gVar2;
                str2 = str;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
            }
        }
        i3 |= 24576;
        if ((196608 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i3 & 1, z2)) {
            if (i11 != 0) {
                dVar4 = d.a.b;
            } else {
                dVar4 = dVar2;
            }
            if (i4 != 0) {
                s9gVarB = f.f(null, 3).b(f.d(null, 15));
            } else {
                s9gVarB = s9gVar2;
            }
            if (i6 != 0) {
                gVarB = f.l(null, 15).b(f.g(null, 3));
            } else {
                gVarB = gVar2;
            }
            if (i8 != 0) {
                str3 = "AnimatedVisibility";
            } else {
                str3 = str;
            }
            dtg0 dtg0VarF16 = vtg0.f(Boolean.valueOf(z), str3, bVarI, (i3 & 14) | ((i3 >> 9) & 112), 0);
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = vg0.a;
                bVarI.r(objY);
            }
            Function1 function16 = (Function1) objY;
            int i117 = i3 << 3;
            s9g s9gVar19 = s9gVarB;
            f(dtg0VarF16, function16, dVar4, s9gVar19, gVarB, op8Var, bVarI, (i117 & 57344) | (i117 & 896) | 48 | (i117 & 7168) | (i3 & 458752));
            str2 = str3;
            dVar3 = dVar4;
            s9gVar3 = s9gVar19;
            gVar3 = gVarB;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            s9gVar3 = s9gVar2;
            gVar3 = gVar2;
            str2 = str;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new wg0(z, dVar3, s9gVar3, gVar3, str2, op8Var, i, i2);
        }
    }

    public static final void f(dtg0 dtg0Var, Function1 function1, d dVar, s9g s9gVar, g gVar, op8 op8Var, a aVar, int i) {
        int i2;
        s9g s9gVar2;
        g gVar2;
        op8 op8Var2;
        b bVarI = aVar.i(1706321816);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dtg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            s9gVar2 = s9gVar;
            i2 |= bVarI.M(s9gVar2) ? 2048 : 1024;
        } else {
            s9gVar2 = s9gVar;
        }
        if ((i & 24576) == 0) {
            gVar2 = gVar;
            i2 |= bVarI.M(gVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            gVar2 = gVar;
        }
        if ((i & 196608) == 0) {
            op8Var2 = op8Var;
            i2 |= bVarI.A(op8Var2) ? 131072 : 65536;
        } else {
            op8Var2 = op8Var;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new eh0(function1, dtg0Var);
                bVarI.r(objY);
            }
            d dVarA = j.a(dVar, (gaj) objY);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = fh0.a;
                bVarI.r(objY2);
            }
            a(dtg0Var, function1, dVarA, s9gVar2, gVar2, (Function2) objY2, op8Var2, bVarI, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gh0(dtg0Var, function1, dVar, s9gVar, gVar, op8Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w7g g(dtg0 dtg0Var, Function1 function1, Object obj, a aVar) {
        w7g w7gVar;
        aVar.C(-422486105, dtg0Var);
        boolean zI = dtg0Var.i();
        o oVar = dtg0Var.a;
        if (zI) {
            aVar.N(-212146657);
            aVar.H();
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                w7gVar = w7g.b;
            } else {
                w7gVar = ((Boolean) function1.invoke(oVar.V())).booleanValue() ? w7g.c : w7g.a;
            }
        } else {
            aVar.N(-211872524);
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = m.b(Boolean.FALSE);
                aVar.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            if (((Boolean) function1.invoke(oVar.V())).booleanValue()) {
                ytwVar.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                w7gVar = w7g.b;
            } else {
                w7gVar = ((Boolean) ytwVar.getValue()).booleanValue() ? w7g.c : w7g.a;
            }
            aVar.H();
        }
        aVar.K();
        return w7gVar;
    }
}
