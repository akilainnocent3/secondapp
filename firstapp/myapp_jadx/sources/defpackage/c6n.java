package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class c6n {
    /* JADX WARN: Code duplicated, block: B:102:0x0108  */
    /* JADX WARN: Code duplicated, block: B:103:0x0114  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0103  */
    public static final void a(final Function0 function0, d dVar, boolean z, u5n u5nVar, qx80 qx80Var, final Function2 function2, a aVar, final int i, final int i2) {
        int i3;
        final d dVar2;
        int i4;
        boolean z2;
        int i5;
        u5n u5nVar2;
        int i6;
        qx80 qx80Var2;
        boolean z3;
        final boolean z4;
        final u5n u5nVar3;
        final qx80 qx80Var3;
        e eVarZ;
        d dVar3;
        boolean z5;
        u5n u5nVarB;
        d dVar4;
        u5n u5nVar4;
        boolean z6;
        qx80 qx80VarB;
        int i7;
        b bVarI = aVar.i(1413012038);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (bVarI.b(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        u5nVar2 = u5nVar;
                        int i9 = bVarI.M(u5nVar2) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        u5nVar2 = u5nVar;
                    }
                    i3 |= i9;
                } else {
                    u5nVar2 = u5nVar;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if (bVarI.M(null)) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        qx80Var2 = qx80Var;
                        int i10 = bVarI.M(qx80Var2) ? 131072 : 65536;
                        i3 |= i10;
                    } else {
                        qx80Var2 = qx80Var;
                    }
                    i3 |= i10;
                } else {
                    qx80Var2 = qx80Var;
                }
                if ((1572864 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i3 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        z5 = i4 == 0 ? z2 : true;
                        if ((i2 & 8) != 0) {
                            u5nVarB = r4.b(bVarI);
                            i3 &= -7169;
                        } else {
                            u5nVarB = u5nVar2;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            dVar4 = dVar3;
                            u5nVar4 = u5nVarB;
                            z6 = z5;
                            qx80VarB = xy80.b(m1a0.a, bVarI);
                        } else {
                            dVar4 = dVar3;
                            u5nVar4 = u5nVarB;
                            z6 = z5;
                        }
                        bVarI.Y();
                        int i11 = i3 << 3;
                        c(dVar4, function0, z6, qx80VarB, u5nVar4, function2, bVarI, ((i3 >> 3) & 14) | (i11 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i11) | (i11 & 458752) | (i3 & 3670016));
                        dVar2 = dVar4;
                        z4 = z6;
                        qx80Var3 = qx80VarB;
                        u5nVar3 = u5nVar4;
                    } else {
                        bVarI.G();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        dVar4 = dVar2;
                        z6 = z2;
                        u5nVar4 = u5nVar2;
                    }
                    qx80VarB = qx80Var2;
                    bVarI.Y();
                    int i12 = i3 << 3;
                    c(dVar4, function0, z6, qx80VarB, u5nVar4, function2, bVarI, ((i3 >> 3) & 14) | (i12 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i12) | (i12 & 458752) | (i3 & 3670016));
                    dVar2 = dVar4;
                    z4 = z6;
                    qx80Var3 = qx80VarB;
                    u5nVar3 = u5nVar4;
                } else {
                    bVarI.G();
                    z4 = z2;
                    u5nVar3 = u5nVar2;
                    qx80Var3 = qx80Var2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: v5n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c6n.a(function0, dVar2, z4, u5nVar3, qx80Var3, function2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    u5nVar2 = u5nVar;
                    if (bVarI.M(u5nVar2)) {
                    }
                    i3 |= i9;
                } else {
                    u5nVar2 = u5nVar;
                }
                i3 |= i9;
            } else {
                u5nVar2 = u5nVar;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bVarI.M(null)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    qx80Var2 = qx80Var;
                    if (bVarI.M(qx80Var2)) {
                    }
                    i3 |= i10;
                } else {
                    qx80Var2 = qx80Var;
                }
                i3 |= i10;
            } else {
                qx80Var2 = qx80Var;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.A(function2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        u5nVarB = r4.b(bVarI);
                        i3 &= -7169;
                    } else {
                        u5nVarB = u5nVar2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = xy80.b(m1a0.a, bVarI);
                    } else {
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = qx80Var2;
                    }
                } else {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        u5nVarB = r4.b(bVarI);
                        i3 &= -7169;
                    } else {
                        u5nVarB = u5nVar2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = xy80.b(m1a0.a, bVarI);
                    } else {
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = qx80Var2;
                    }
                }
                bVarI.Y();
                int i13 = i3 << 3;
                c(dVar4, function0, z6, qx80VarB, u5nVar4, function2, bVarI, ((i3 >> 3) & 14) | (i13 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i13) | (i13 & 458752) | (i3 & 3670016));
                dVar2 = dVar4;
                z4 = z6;
                qx80Var3 = qx80VarB;
                u5nVar3 = u5nVar4;
            } else {
                bVarI.G();
                z4 = z2;
                u5nVar3 = u5nVar2;
                qx80Var3 = qx80Var2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: v5n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c6n.a(function0, dVar2, z4, u5nVar3, qx80Var3, function2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        dVar2 = dVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (bVarI.b(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    u5nVar2 = u5nVar;
                    if (bVarI.M(u5nVar2)) {
                    }
                    i3 |= i9;
                } else {
                    u5nVar2 = u5nVar;
                }
                i3 |= i9;
            } else {
                u5nVar2 = u5nVar;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (bVarI.M(null)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    qx80Var2 = qx80Var;
                    if (bVarI.M(qx80Var2)) {
                    }
                    i3 |= i10;
                } else {
                    qx80Var2 = qx80Var;
                }
                i3 |= i10;
            } else {
                qx80Var2 = qx80Var;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.A(function2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        u5nVarB = r4.b(bVarI);
                        i3 &= -7169;
                    } else {
                        u5nVarB = u5nVar2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = xy80.b(m1a0.a, bVarI);
                    } else {
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = qx80Var2;
                    }
                } else {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        u5nVarB = r4.b(bVarI);
                        i3 &= -7169;
                    } else {
                        u5nVarB = u5nVar2;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = xy80.b(m1a0.a, bVarI);
                    } else {
                        dVar4 = dVar3;
                        u5nVar4 = u5nVarB;
                        z6 = z5;
                        qx80VarB = qx80Var2;
                    }
                }
                bVarI.Y();
                int i14 = i3 << 3;
                c(dVar4, function0, z6, qx80VarB, u5nVar4, function2, bVarI, ((i3 >> 3) & 14) | (i14 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i14) | (i14 & 458752) | (i3 & 3670016));
                dVar2 = dVar4;
                z4 = z6;
                qx80Var3 = qx80VarB;
                u5nVar3 = u5nVar4;
            } else {
                bVarI.G();
                z4 = z2;
                u5nVar3 = u5nVar2;
                qx80Var3 = qx80Var2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: v5n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c6n.a(function0, dVar2, z4, u5nVar3, qx80Var3, function2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                u5nVar2 = u5nVar;
                if (bVarI.M(u5nVar2)) {
                }
                i3 |= i9;
            } else {
                u5nVar2 = u5nVar;
            }
            i3 |= i9;
        } else {
            u5nVar2 = u5nVar;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (bVarI.M(null)) {
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                qx80Var2 = qx80Var;
                if (bVarI.M(qx80Var2)) {
                }
                i3 |= i10;
            } else {
                qx80Var2 = qx80Var;
            }
            i3 |= i10;
        } else {
            qx80Var2 = qx80Var;
        }
        if ((1572864 & i) == 0) {
            if (bVarI.A(function2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                    u5nVarB = r4.b(bVarI);
                    i3 &= -7169;
                } else {
                    u5nVarB = u5nVar2;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    dVar4 = dVar3;
                    u5nVar4 = u5nVarB;
                    z6 = z5;
                    qx80VarB = xy80.b(m1a0.a, bVarI);
                } else {
                    dVar4 = dVar3;
                    u5nVar4 = u5nVarB;
                    z6 = z5;
                    qx80VarB = qx80Var2;
                }
            } else {
                if (i8 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                    u5nVarB = r4.b(bVarI);
                    i3 &= -7169;
                } else {
                    u5nVarB = u5nVar2;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    dVar4 = dVar3;
                    u5nVar4 = u5nVarB;
                    z6 = z5;
                    qx80VarB = xy80.b(m1a0.a, bVarI);
                } else {
                    dVar4 = dVar3;
                    u5nVar4 = u5nVarB;
                    z6 = z5;
                    qx80VarB = qx80Var2;
                }
            }
            bVarI.Y();
            int i15 = i3 << 3;
            c(dVar4, function0, z6, qx80VarB, u5nVar4, function2, bVarI, ((i3 >> 3) & 14) | (i15 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i15) | (i15 & 458752) | (i3 & 3670016));
            dVar2 = dVar4;
            z4 = z6;
            qx80Var3 = qx80VarB;
            u5nVar3 = u5nVar4;
        } else {
            bVarI.G();
            z4 = z2;
            u5nVar3 = u5nVar2;
            qx80Var3 = qx80Var2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v5n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6n.a(function0, dVar2, z4, u5nVar3, qx80Var3, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    @fae
    public static final void b(final Function0 function0, final d dVar, boolean z, u5n u5nVar, final Function2 function2, a aVar, final int i, final int i2) {
        int i3;
        u5n u5nVarB;
        final boolean z2;
        final u5n u5nVar2;
        u5n u5nVar3;
        boolean z3;
        b bVarI = aVar.i(-2096213317);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                u5nVarB = u5nVar;
                int i5 = bVarI.M(u5nVarB) ? 2048 : 1024;
                i4 |= i5;
            } else {
                u5nVarB = u5nVar;
            }
            i4 |= i5;
        } else {
            u5nVarB = u5nVar;
        }
        int i6 = i4 | 24576;
        if ((196608 & i) == 0) {
            i6 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if (bVarI.q(i6 & 1, (74899 & i6) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if ((i2 & 8) != 0) {
                    u5nVarB = r4.b(bVarI);
                    i6 &= -7169;
                }
                u5nVar3 = u5nVarB;
                z3 = true;
            } else {
                bVarI.G();
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                z3 = z;
                u5nVar3 = u5nVarB;
            }
            bVarI.Y();
            a(function0, dVar, z3, u5nVar3, xy80.b(m1a0.a, bVarI), function2, bVarI, (65534 & i6) | ((i6 << 3) & 3670016), 0);
            z2 = z3;
            u5nVar2 = u5nVar3;
        } else {
            bVarI.G();
            z2 = z;
            u5nVar2 = u5nVarB;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: x5n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6n.b(function0, dVar, z2, u5nVar2, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final Function0 function0, final boolean z, final qx80 qx80Var, final u5n u5nVar, final Function2 function2, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1134296466);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(qx80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(u5nVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            bVarI.N(977045485);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            bVarI.X(false);
            mjm mjmVar = zxo.a;
            d dVarN = dVar.n(MinimumInteractiveModifier.b);
            float f = m1a0.b;
            d dVarA = fk7.a(androidx.compose.foundation.d.b(androidx.compose.foundation.a.b(ls7.a(j.s(jc1.a(m1a0.c + f + f, 40.0f), dVarN), qx80Var), z ? u5nVar.a : u5nVar.c, qx80Var), pswVar, ut50.b(0.0f, 7, 0L, false), z, new su50(0), function0, 8));
            aiv aivVarC = g75.c(ht.a.e, false);
            int I = bVarI.I();
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            hna.a(tp0.a(z ? u5nVar.b : u5nVar.d, iza.a), function2, bVarI, ((i3 >> 15) & 112) | 8);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w5n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6n.c(dVar, function0, z, qx80Var, u5nVar, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final Function0 function0, final d dVar, boolean z, final qx80 qx80Var, u5n u5nVar, final l35 l35Var, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVar;
        final boolean z2;
        final u5n u5nVar2;
        u5n u5nVar3;
        int i3;
        u5n u5nVar4;
        boolean z3;
        b bVarI = aVar.i(-1481353380);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= bVarI.M(qx80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= bVarI.M(l35Var) ? 131072 : 65536;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        if (bVarI.q(i5 & 1, (4793491 & i5) != 4793490)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                bVarI.N(1591384183);
                long j = ((j58) bVarI.O(iza.a)).a;
                d68 d68Var = (d68) bVarI.O(g68.a);
                u5n u5nVar5 = d68Var.g0;
                if (u5nVar5 == null) {
                    long j2 = j58.l;
                    u5nVar3 = new u5n(j2, j, j2, j58.c(m9z.a, j));
                    d68Var.g0 = u5nVar3;
                } else {
                    u5nVar3 = u5nVar5;
                }
                if (nbh0.a(u5nVar3.b, j)) {
                    bVarI.X(false);
                } else {
                    u5n u5nVarA = u5nVar3.a(u5nVar3.a, j, u5nVar3.c, j58.c(m9z.a, j));
                    bVarI.X(false);
                    u5nVar3 = u5nVarA;
                }
                i3 = i5 & (-57345);
                u5nVar4 = u5nVar3;
                z3 = true;
            } else {
                bVarI.G();
                i3 = i5 & (-57345);
                z3 = z;
                u5nVar4 = u5nVar;
            }
            bVarI.Y();
            bVar = bVarI;
            e(function0, dVar, z3, qx80Var, u5nVar4, l35Var, op8Var, bVar, i3 & 33554430);
            z2 = z3;
            u5nVar2 = u5nVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            z2 = z;
            u5nVar2 = u5nVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y5n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6n.d(function0, dVar, z2, qx80Var, u5nVar2, l35Var, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(Function0 function0, d dVar, boolean z, qx80 qx80Var, u5n u5nVar, l35 l35Var, op8 op8Var, a aVar, int i) {
        Function0 function1;
        int i2;
        b bVar;
        b bVarI = aVar.i(-171935091);
        if ((i & 6) == 0) {
            function1 = function0;
            i2 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(qx80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(u5nVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(l35Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new z5n();
                bVarI.r(objY);
            }
            int i3 = i2 & 8078;
            int i4 = i2 << 9;
            bVar = bVarI;
            ihe0.c(function1, xa80.b(dVar, false, (Function1) objY), z, qx80Var, z ? u5nVar.a : u5nVar.c, z ? u5nVar.b : u5nVar.d, 0.0f, 0.0f, l35Var, null, pp8.b(669231714, new b6n(op8Var), bVarI), bVar, i3 | (i4 & 234881024) | (i4 & 1879048192), 192);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new a6n(function0, dVar, z, qx80Var, u5nVar, l35Var, op8Var, i);
        }
    }
}
