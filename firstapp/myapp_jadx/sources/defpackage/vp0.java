package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class vp0 {
    public static final chf a = new chf(new mp0());
    public static final float b;
    public static final float c;

    static {
        new b1s(new np0());
        new f4c(0.8f, 0.0f, 0.8f, 0.15f);
        b = 4.0f;
        c = 12.0f;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x013d  */
    /* JADX WARN: Code duplicated, block: B:95:0x014c  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(final op8 op8Var, d dVar, final op8 op8Var2, gaj gajVar, float f, g8j0 g8j0Var, final c1g0 c1g0Var, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        gaj gajVar2;
        int i5;
        int i6;
        final g8j0 g8j0VarB;
        c1g0 c1g0Var2;
        int i7;
        boolean z;
        b bVar;
        final d dVar3;
        final gaj gajVar3;
        final float f2;
        e eVarZ;
        d dVar4;
        gaj gajVar4;
        float f3;
        d dVar5;
        gaj gajVar5;
        float f4;
        int i8;
        int i9;
        b bVarI = aVar.i(-302230691);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(op8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bVarI.A(op8Var2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    gajVar2 = gajVar;
                    if (bVarI.A(gajVar2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        g8j0VarB = g8j0Var;
                        int i11 = bVarI.M(g8j0VarB) ? 131072 : 65536;
                        i6 |= i11;
                    } else {
                        g8j0VarB = g8j0Var;
                    }
                    i6 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                if ((1572864 & i) == 0) {
                    c1g0Var2 = c1g0Var;
                    if (bVarI.M(c1g0Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i6 |= i8;
                } else {
                    c1g0Var2 = c1g0Var;
                }
                i7 = i6 | 12582912;
                if ((4793491 & i7) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i7 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i10 != 0) {
                            dVar4 = d.a.b;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.c;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        f3 = d1g0.a;
                        if ((i2 & 32) != 0) {
                            i7 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        dVar5 = dVar4;
                        gajVar5 = gajVar4;
                    } else {
                        bVarI.G();
                        if ((i2 & 32) != 0) {
                            i7 &= -458753;
                        }
                        f3 = f;
                        dVar5 = dVar2;
                        gajVar5 = gajVar2;
                    }
                    g8j0 g8j0Var2 = g8j0VarB;
                    bVarI.Y();
                    imf0 imf0VarA = gah0.a(cq0.a, bVarI);
                    imf0 imf0Var = imf0.d;
                    if (!g7f.b(f3, Float.NaN) || g7f.b(f3, Float.POSITIVE_INFINITY)) {
                        f4 = d1g0.a;
                    } else {
                        f4 = f3;
                    }
                    int i12 = i7 << 12;
                    int i13 = (i7 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                    bVar = bVarI;
                    b(dVar5, op8Var, imf0VarA, imf0Var, ht.a.n, op8Var2, gajVar5, f4, g8j0Var2, c1g0Var2, bVar, ((i7 >> 3) & 14) | 224256 | ((i7 << 3) & 112) | (3670016 & i12) | (29360128 & i12) | (i12 & 1879048192), i13);
                    f2 = f3;
                    dVar3 = dVar5;
                    gajVar3 = gajVar5;
                    g8j0VarB = g8j0Var2;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar3 = dVar2;
                    gajVar3 = gajVar2;
                    f2 = f;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lp0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vp0.a(op8Var, dVar3, op8Var2, gajVar3, f2, g8j0VarB, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            gajVar2 = gajVar;
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    g8j0VarB = g8j0Var;
                    if (bVarI.M(g8j0VarB)) {
                    }
                    i6 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                i6 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            if ((1572864 & i) == 0) {
                c1g0Var2 = c1g0Var;
                if (bVarI.M(c1g0Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            } else {
                c1g0Var2 = c1g0Var;
            }
            i7 = i6 | 12582912;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.c;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    f3 = d1g0.a;
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    dVar5 = dVar4;
                    gajVar5 = gajVar4;
                } else {
                    if (i10 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.c;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    f3 = d1g0.a;
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    dVar5 = dVar4;
                    gajVar5 = gajVar4;
                }
                g8j0 g8j0Var3 = g8j0VarB;
                bVarI.Y();
                imf0 imf0VarA2 = gah0.a(cq0.a, bVarI);
                imf0 imf0Var2 = imf0.d;
                if (g7f.b(f3, Float.NaN)) {
                    f4 = d1g0.a;
                } else {
                    f4 = d1g0.a;
                }
                int i14 = i7 << 12;
                int i15 = (i7 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                bVar = bVarI;
                b(dVar5, op8Var, imf0VarA2, imf0Var2, ht.a.n, op8Var2, gajVar5, f4, g8j0Var3, c1g0Var2, bVar, ((i7 >> 3) & 14) | 224256 | ((i7 << 3) & 112) | (3670016 & i14) | (29360128 & i14) | (i14 & 1879048192), i15);
                f2 = f3;
                dVar3 = dVar5;
                gajVar3 = gajVar5;
                g8j0VarB = g8j0Var3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                gajVar3 = gajVar2;
                f2 = f;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lp0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vp0.a(op8Var, dVar3, op8Var2, gajVar3, f2, g8j0VarB, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        dVar2 = dVar;
        if ((i & 384) == 0) {
            if (bVarI.A(op8Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                gajVar2 = gajVar;
                if (bVarI.A(gajVar2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    g8j0VarB = g8j0Var;
                    if (bVarI.M(g8j0VarB)) {
                    }
                    i6 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                i6 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            if ((1572864 & i) == 0) {
                c1g0Var2 = c1g0Var;
                if (bVarI.M(c1g0Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i6 |= i8;
            } else {
                c1g0Var2 = c1g0Var;
            }
            i7 = i6 | 12582912;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i7 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.c;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    f3 = d1g0.a;
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    dVar5 = dVar4;
                    gajVar5 = gajVar4;
                } else {
                    if (i10 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.c;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    f3 = d1g0.a;
                    if ((i2 & 32) != 0) {
                        i7 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    dVar5 = dVar4;
                    gajVar5 = gajVar4;
                }
                g8j0 g8j0Var4 = g8j0VarB;
                bVarI.Y();
                imf0 imf0VarA3 = gah0.a(cq0.a, bVarI);
                imf0 imf0Var3 = imf0.d;
                if (g7f.b(f3, Float.NaN)) {
                    f4 = d1g0.a;
                } else {
                    f4 = d1g0.a;
                }
                int i16 = i7 << 12;
                int i17 = (i7 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                bVar = bVarI;
                b(dVar5, op8Var, imf0VarA3, imf0Var3, ht.a.n, op8Var2, gajVar5, f4, g8j0Var4, c1g0Var2, bVar, ((i7 >> 3) & 14) | 224256 | ((i7 << 3) & 112) | (3670016 & i16) | (29360128 & i16) | (i16 & 1879048192), i17);
                f2 = f3;
                dVar3 = dVar5;
                gajVar3 = gajVar5;
                g8j0VarB = g8j0Var4;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                gajVar3 = gajVar2;
                f2 = f;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lp0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vp0.a(op8Var, dVar3, op8Var2, gajVar3, f2, g8j0VarB, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        gajVar2 = gajVar;
        i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                g8j0VarB = g8j0Var;
                if (bVarI.M(g8j0VarB)) {
                }
                i6 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            i6 |= i11;
        } else {
            g8j0VarB = g8j0Var;
        }
        if ((1572864 & i) == 0) {
            c1g0Var2 = c1g0Var;
            if (bVarI.M(c1g0Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        } else {
            c1g0Var2 = c1g0Var;
        }
        i7 = i6 | 12582912;
        if ((4793491 & i7) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i7 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    gajVar4 = vq8.c;
                } else {
                    gajVar4 = gajVar2;
                }
                f3 = d1g0.a;
                if ((i2 & 32) != 0) {
                    i7 &= -458753;
                    g8j0VarB = d1g0.b(bVarI);
                }
                dVar5 = dVar4;
                gajVar5 = gajVar4;
            } else {
                if (i10 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    gajVar4 = vq8.c;
                } else {
                    gajVar4 = gajVar2;
                }
                f3 = d1g0.a;
                if ((i2 & 32) != 0) {
                    i7 &= -458753;
                    g8j0VarB = d1g0.b(bVarI);
                }
                dVar5 = dVar4;
                gajVar5 = gajVar4;
            }
            g8j0 g8j0Var5 = g8j0VarB;
            bVarI.Y();
            imf0 imf0VarA4 = gah0.a(cq0.a, bVarI);
            imf0 imf0Var4 = imf0.d;
            if (g7f.b(f3, Float.NaN)) {
                f4 = d1g0.a;
            } else {
                f4 = d1g0.a;
            }
            int i18 = i7 << 12;
            int i19 = (i7 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
            bVar = bVarI;
            b(dVar5, op8Var, imf0VarA4, imf0Var4, ht.a.n, op8Var2, gajVar5, f4, g8j0Var5, c1g0Var2, bVar, ((i7 >> 3) & 14) | 224256 | ((i7 << 3) & 112) | (3670016 & i18) | (29360128 & i18) | (i18 & 1879048192), i19);
            f2 = f3;
            dVar3 = dVar5;
            gajVar3 = gajVar5;
            g8j0VarB = g8j0Var5;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
            gajVar3 = gajVar2;
            f2 = f;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lp0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vp0.a(op8Var, dVar3, op8Var2, gajVar3, f2, g8j0VarB, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final op8 op8Var, final imf0 imf0Var, final imf0 imf0Var2, final n54.a aVar, final Function2 function2, final gaj gajVar, final float f, final g8j0 g8j0Var, final c1g0 c1g0Var, a aVar2, final int i, final int i2) {
        int i3;
        imf0 imf0Var3;
        n54.a aVar3;
        Function2 function3;
        gaj gajVar2;
        int i4;
        b bVarI = aVar2.i(-2033800111);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(imf0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            imf0Var3 = imf0Var2;
            i3 |= bVarI.M(imf0Var3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            imf0Var3 = imf0Var2;
        }
        if ((196608 & i) == 0) {
            aVar3 = aVar;
            i3 |= bVarI.M(aVar3) ? 131072 : 65536;
        } else {
            aVar3 = aVar;
        }
        if ((1572864 & i) == 0) {
            function3 = function2;
            i3 |= bVarI.A(function3) ? 1048576 : 524288;
        } else {
            function3 = function2;
        }
        if ((12582912 & i) == 0) {
            gajVar2 = gajVar;
            i3 |= bVarI.A(gajVar2) ? 8388608 : 4194304;
        } else {
            gajVar2 = gajVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= bVarI.c(f) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.M(g8j0Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.M(c1g0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(null) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            ((sv90) bVarI.O(a)).a(new tv90(dVar, op8Var, imf0Var, imf0Var3, aVar3, function3, gajVar2, f, g8j0Var, c1g0Var), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pp0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vp0.b(dVar, op8Var, imf0Var, imf0Var2, aVar, function2, gajVar, f, g8j0Var, c1g0Var, (a) obj, qj40.a(i | 1), qj40.a(i2));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void c(final op8 op8Var, final d dVar, Function2 function2, gaj gajVar, float f, g8j0 g8j0Var, final c1g0 c1g0Var, a aVar, final int i, final int i2) {
        int i3;
        final Function2 function3;
        int i4;
        gaj gajVar2;
        int i5;
        int i6;
        float f2;
        int i7;
        g8j0 g8j0VarB;
        int i8;
        boolean z;
        b bVar;
        final gaj gajVar3;
        final g8j0 g8j0Var2;
        final float f3;
        e eVarZ;
        Function2 function4;
        gaj gajVar4;
        Function2 function5;
        gaj gajVar5;
        float f4;
        int i9;
        b bVarI = aVar.i(1784421840);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(op8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                function3 = function2;
                i3 |= bVarI.A(function3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    gajVar2 = gajVar;
                    if (bVarI.A(gajVar2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        f2 = f;
                        if (bVarI.c(f2)) {
                            i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            g8j0VarB = g8j0Var;
                            int i11 = bVarI.M(g8j0VarB) ? 131072 : 65536;
                            i3 |= i11;
                        } else {
                            g8j0VarB = g8j0Var;
                        }
                        i3 |= i11;
                    } else {
                        g8j0VarB = g8j0Var;
                    }
                    if ((1572864 & i) != 0) {
                        if (bVarI.M(c1g0Var)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i8 = i3 | 12582912;
                    if ((4793491 & i8) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i8 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i10 != 0) {
                                function4 = vq8.a;
                            } else {
                                function4 = function3;
                            }
                            if (i4 != 0) {
                                gajVar4 = vq8.b;
                            } else {
                                gajVar4 = gajVar2;
                            }
                            if (i6 != 0) {
                                f2 = d1g0.a;
                            }
                            if ((i2 & 32) != 0) {
                                i8 &= -458753;
                                g8j0VarB = d1g0.b(bVarI);
                            }
                            function5 = function4;
                            gajVar5 = gajVar4;
                        } else {
                            bVarI.G();
                            if ((i2 & 32) != 0) {
                                i8 &= -458753;
                            }
                            function5 = function3;
                            gajVar5 = gajVar2;
                        }
                        g8j0 g8j0Var3 = g8j0VarB;
                        bVarI.Y();
                        imf0 imf0VarA = gah0.a(cq0.a, bVarI);
                        imf0 imf0Var = imf0.d;
                        if (!g7f.b(f2, Float.NaN) || g7f.b(f2, Float.POSITIVE_INFINITY)) {
                            f4 = d1g0.a;
                        } else {
                            f4 = f2;
                        }
                        int i12 = i8 << 12;
                        int i13 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                        bVar = bVarI;
                        b(dVar, op8Var, imf0VarA, imf0Var, ht.a.m, function5, gajVar5, f4, g8j0Var3, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i12) | (29360128 & i12) | (i12 & 1879048192), i13);
                        function3 = function5;
                        gajVar3 = gajVar5;
                        g8j0Var2 = g8j0Var3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        gajVar3 = gajVar2;
                        g8j0Var2 = g8j0VarB;
                    }
                    f3 = f2;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: op0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                f2 = f;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        g8j0VarB = g8j0Var;
                        if (bVarI.M(g8j0VarB)) {
                        }
                        i3 |= i11;
                    } else {
                        g8j0VarB = g8j0Var;
                    }
                    i3 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                if ((1572864 & i) != 0) {
                    if (bVarI.M(c1g0Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i8 = i3 | 12582912;
                if ((4793491 & i8) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i8 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            function4 = vq8.a;
                        } else {
                            function4 = function3;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.b;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        if (i6 != 0) {
                            f2 = d1g0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        function5 = function4;
                        gajVar5 = gajVar4;
                    } else {
                        if (i10 != 0) {
                            function4 = vq8.a;
                        } else {
                            function4 = function3;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.b;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        if (i6 != 0) {
                            f2 = d1g0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        function5 = function4;
                        gajVar5 = gajVar4;
                    }
                    g8j0 g8j0Var4 = g8j0VarB;
                    bVarI.Y();
                    imf0 imf0VarA2 = gah0.a(cq0.a, bVarI);
                    imf0 imf0Var2 = imf0.d;
                    if (g7f.b(f2, Float.NaN)) {
                        f4 = d1g0.a;
                    } else {
                        f4 = d1g0.a;
                    }
                    int i14 = i8 << 12;
                    int i15 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                    bVar = bVarI;
                    b(dVar, op8Var, imf0VarA2, imf0Var2, ht.a.m, function5, gajVar5, f4, g8j0Var4, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i14) | (29360128 & i14) | (i14 & 1879048192), i15);
                    function3 = function5;
                    gajVar3 = gajVar5;
                    g8j0Var2 = g8j0Var4;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    gajVar3 = gajVar2;
                    g8j0Var2 = g8j0VarB;
                }
                f3 = f2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: op0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            gajVar2 = gajVar;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (bVarI.c(f2)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        g8j0VarB = g8j0Var;
                        if (bVarI.M(g8j0VarB)) {
                        }
                        i3 |= i11;
                    } else {
                        g8j0VarB = g8j0Var;
                    }
                    i3 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                if ((1572864 & i) != 0) {
                    if (bVarI.M(c1g0Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i8 = i3 | 12582912;
                if ((4793491 & i8) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i8 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            function4 = vq8.a;
                        } else {
                            function4 = function3;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.b;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        if (i6 != 0) {
                            f2 = d1g0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        function5 = function4;
                        gajVar5 = gajVar4;
                    } else {
                        if (i10 != 0) {
                            function4 = vq8.a;
                        } else {
                            function4 = function3;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.b;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        if (i6 != 0) {
                            f2 = d1g0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        function5 = function4;
                        gajVar5 = gajVar4;
                    }
                    g8j0 g8j0Var5 = g8j0VarB;
                    bVarI.Y();
                    imf0 imf0VarA3 = gah0.a(cq0.a, bVarI);
                    imf0 imf0Var3 = imf0.d;
                    if (g7f.b(f2, Float.NaN)) {
                        f4 = d1g0.a;
                    } else {
                        f4 = d1g0.a;
                    }
                    int i16 = i8 << 12;
                    int i17 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                    bVar = bVarI;
                    b(dVar, op8Var, imf0VarA3, imf0Var3, ht.a.m, function5, gajVar5, f4, g8j0Var5, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i16) | (29360128 & i16) | (i16 & 1879048192), i17);
                    function3 = function5;
                    gajVar3 = gajVar5;
                    g8j0Var2 = g8j0Var5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    gajVar3 = gajVar2;
                    g8j0Var2 = g8j0VarB;
                }
                f3 = f2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: op0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    g8j0VarB = g8j0Var;
                    if (bVarI.M(g8j0VarB)) {
                    }
                    i3 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                i3 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            if ((1572864 & i) != 0) {
                if (bVarI.M(c1g0Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i8 = i3 | 12582912;
            if ((4793491 & i8) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i8 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        function4 = vq8.a;
                    } else {
                        function4 = function3;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.b;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    if (i6 != 0) {
                        f2 = d1g0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    function5 = function4;
                    gajVar5 = gajVar4;
                } else {
                    if (i10 != 0) {
                        function4 = vq8.a;
                    } else {
                        function4 = function3;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.b;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    if (i6 != 0) {
                        f2 = d1g0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    function5 = function4;
                    gajVar5 = gajVar4;
                }
                g8j0 g8j0Var6 = g8j0VarB;
                bVarI.Y();
                imf0 imf0VarA4 = gah0.a(cq0.a, bVarI);
                imf0 imf0Var4 = imf0.d;
                if (g7f.b(f2, Float.NaN)) {
                    f4 = d1g0.a;
                } else {
                    f4 = d1g0.a;
                }
                int i18 = i8 << 12;
                int i19 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                bVar = bVarI;
                b(dVar, op8Var, imf0VarA4, imf0Var4, ht.a.m, function5, gajVar5, f4, g8j0Var6, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i18) | (29360128 & i18) | (i18 & 1879048192), i19);
                function3 = function5;
                gajVar3 = gajVar5;
                g8j0Var2 = g8j0Var6;
            } else {
                bVar = bVarI;
                bVar.G();
                gajVar3 = gajVar2;
                g8j0Var2 = g8j0VarB;
            }
            f3 = f2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: op0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        function3 = function2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                gajVar2 = gajVar;
                if (bVarI.A(gajVar2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    f2 = f;
                    if (bVarI.c(f2)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        g8j0VarB = g8j0Var;
                        if (bVarI.M(g8j0VarB)) {
                        }
                        i3 |= i11;
                    } else {
                        g8j0VarB = g8j0Var;
                    }
                    i3 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                if ((1572864 & i) != 0) {
                    if (bVarI.M(c1g0Var)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i8 = i3 | 12582912;
                if ((4793491 & i8) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i8 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            function4 = vq8.a;
                        } else {
                            function4 = function3;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.b;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        if (i6 != 0) {
                            f2 = d1g0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        function5 = function4;
                        gajVar5 = gajVar4;
                    } else {
                        if (i10 != 0) {
                            function4 = vq8.a;
                        } else {
                            function4 = function3;
                        }
                        if (i4 != 0) {
                            gajVar4 = vq8.b;
                        } else {
                            gajVar4 = gajVar2;
                        }
                        if (i6 != 0) {
                            f2 = d1g0.a;
                        }
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                            g8j0VarB = d1g0.b(bVarI);
                        }
                        function5 = function4;
                        gajVar5 = gajVar4;
                    }
                    g8j0 g8j0Var7 = g8j0VarB;
                    bVarI.Y();
                    imf0 imf0VarA5 = gah0.a(cq0.a, bVarI);
                    imf0 imf0Var5 = imf0.d;
                    if (g7f.b(f2, Float.NaN)) {
                        f4 = d1g0.a;
                    } else {
                        f4 = d1g0.a;
                    }
                    int i110 = i8 << 12;
                    int i111 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                    bVar = bVarI;
                    b(dVar, op8Var, imf0VarA5, imf0Var5, ht.a.m, function5, gajVar5, f4, g8j0Var7, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i110) | (29360128 & i110) | (i110 & 1879048192), i111);
                    function3 = function5;
                    gajVar3 = gajVar5;
                    g8j0Var2 = g8j0Var7;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    gajVar3 = gajVar2;
                    g8j0Var2 = g8j0VarB;
                }
                f3 = f2;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: op0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            f2 = f;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    g8j0VarB = g8j0Var;
                    if (bVarI.M(g8j0VarB)) {
                    }
                    i3 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                i3 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            if ((1572864 & i) != 0) {
                if (bVarI.M(c1g0Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i8 = i3 | 12582912;
            if ((4793491 & i8) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i8 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        function4 = vq8.a;
                    } else {
                        function4 = function3;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.b;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    if (i6 != 0) {
                        f2 = d1g0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    function5 = function4;
                    gajVar5 = gajVar4;
                } else {
                    if (i10 != 0) {
                        function4 = vq8.a;
                    } else {
                        function4 = function3;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.b;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    if (i6 != 0) {
                        f2 = d1g0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    function5 = function4;
                    gajVar5 = gajVar4;
                }
                g8j0 g8j0Var8 = g8j0VarB;
                bVarI.Y();
                imf0 imf0VarA6 = gah0.a(cq0.a, bVarI);
                imf0 imf0Var6 = imf0.d;
                if (g7f.b(f2, Float.NaN)) {
                    f4 = d1g0.a;
                } else {
                    f4 = d1g0.a;
                }
                int i112 = i8 << 12;
                int i113 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                bVar = bVarI;
                b(dVar, op8Var, imf0VarA6, imf0Var6, ht.a.m, function5, gajVar5, f4, g8j0Var8, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i112) | (29360128 & i112) | (i112 & 1879048192), i113);
                function3 = function5;
                gajVar3 = gajVar5;
                g8j0Var2 = g8j0Var8;
            } else {
                bVar = bVarI;
                bVar.G();
                gajVar3 = gajVar2;
                g8j0Var2 = g8j0VarB;
            }
            f3 = f2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: op0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        gajVar2 = gajVar;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                f2 = f;
                if (bVarI.c(f2)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    g8j0VarB = g8j0Var;
                    if (bVarI.M(g8j0VarB)) {
                    }
                    i3 |= i11;
                } else {
                    g8j0VarB = g8j0Var;
                }
                i3 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            if ((1572864 & i) != 0) {
                if (bVarI.M(c1g0Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i8 = i3 | 12582912;
            if ((4793491 & i8) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i8 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        function4 = vq8.a;
                    } else {
                        function4 = function3;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.b;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    if (i6 != 0) {
                        f2 = d1g0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    function5 = function4;
                    gajVar5 = gajVar4;
                } else {
                    if (i10 != 0) {
                        function4 = vq8.a;
                    } else {
                        function4 = function3;
                    }
                    if (i4 != 0) {
                        gajVar4 = vq8.b;
                    } else {
                        gajVar4 = gajVar2;
                    }
                    if (i6 != 0) {
                        f2 = d1g0.a;
                    }
                    if ((i2 & 32) != 0) {
                        i8 &= -458753;
                        g8j0VarB = d1g0.b(bVarI);
                    }
                    function5 = function4;
                    gajVar5 = gajVar4;
                }
                g8j0 g8j0Var9 = g8j0VarB;
                bVarI.Y();
                imf0 imf0VarA7 = gah0.a(cq0.a, bVarI);
                imf0 imf0Var7 = imf0.d;
                if (g7f.b(f2, Float.NaN)) {
                    f4 = d1g0.a;
                } else {
                    f4 = d1g0.a;
                }
                int i114 = i8 << 12;
                int i115 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
                bVar = bVarI;
                b(dVar, op8Var, imf0VarA7, imf0Var7, ht.a.m, function5, gajVar5, f4, g8j0Var9, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i114) | (29360128 & i114) | (i114 & 1879048192), i115);
                function3 = function5;
                gajVar3 = gajVar5;
                g8j0Var2 = g8j0Var9;
            } else {
                bVar = bVarI;
                bVar.G();
                gajVar3 = gajVar2;
                g8j0Var2 = g8j0VarB;
            }
            f3 = f2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: op0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        f2 = f;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                g8j0VarB = g8j0Var;
                if (bVarI.M(g8j0VarB)) {
                }
                i3 |= i11;
            } else {
                g8j0VarB = g8j0Var;
            }
            i3 |= i11;
        } else {
            g8j0VarB = g8j0Var;
        }
        if ((1572864 & i) != 0) {
            if (bVarI.M(c1g0Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i8 = i3 | 12582912;
        if ((4793491 & i8) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i8 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    function4 = vq8.a;
                } else {
                    function4 = function3;
                }
                if (i4 != 0) {
                    gajVar4 = vq8.b;
                } else {
                    gajVar4 = gajVar2;
                }
                if (i6 != 0) {
                    f2 = d1g0.a;
                }
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                    g8j0VarB = d1g0.b(bVarI);
                }
                function5 = function4;
                gajVar5 = gajVar4;
            } else {
                if (i10 != 0) {
                    function4 = vq8.a;
                } else {
                    function4 = function3;
                }
                if (i4 != 0) {
                    gajVar4 = vq8.b;
                } else {
                    gajVar4 = gajVar2;
                }
                if (i6 != 0) {
                    f2 = d1g0.a;
                }
                if ((i2 & 32) != 0) {
                    i8 &= -458753;
                    g8j0VarB = d1g0.b(bVarI);
                }
                function5 = function4;
                gajVar5 = gajVar4;
            }
            g8j0 g8j0Var10 = g8j0VarB;
            bVarI.Y();
            imf0 imf0VarA8 = gah0.a(cq0.a, bVarI);
            imf0 imf0Var8 = imf0.d;
            if (g7f.b(f2, Float.NaN)) {
                f4 = d1g0.a;
            } else {
                f4 = d1g0.a;
            }
            int i116 = i8 << 12;
            int i117 = (i8 >> 18) & WebSocketProtocol.PAYLOAD_SHORT;
            bVar = bVarI;
            b(dVar, op8Var, imf0VarA8, imf0Var8, ht.a.m, function5, gajVar5, f4, g8j0Var10, c1g0Var, bVar, ((i8 >> 3) & 14) | 224256 | ((i8 << 3) & 112) | (3670016 & i116) | (29360128 & i116) | (i116 & 1879048192), i117);
            function3 = function5;
            gajVar3 = gajVar5;
            g8j0Var2 = g8j0Var10;
        } else {
            bVar = bVarI;
            bVar.G();
            gajVar3 = gajVar2;
            g8j0Var2 = g8j0VarB;
        }
        f3 = f2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: op0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vp0.c(op8Var, dVar, function3, gajVar3, f3, g8j0Var2, c1g0Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d dVar, final fxh fxhVar, final long j, final long j2, final long j3, long j4, final op8 op8Var, final imf0 imf0Var, final imf0 imf0Var2, Function0 function0, final n54.a aVar, final Function2 function2, op8 op8Var2, final float f, a aVar2, final int i) {
        Function0 function1;
        op8 op8Var3;
        b bVar;
        final long j5 = j4;
        b bVarI = aVar2.i(126395868);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(fxhVar) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.e(j2) ? 2048 : 1024) | (bVarI.e(j3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.e(j5) ? 131072 : 65536) | (bVarI.A(op8Var) ? 1048576 : 524288) | (bVarI.M(imf0Var) ? 8388608 : 4194304) | (bVarI.A(null) ? 67108864 : 33554432) | (bVarI.M(imf0Var2) ? 536870912 : 268435456);
        int i3 = 1600566 | (bVarI.M(aVar) ? 256 : 128) | (bVarI.A(function2) ? 131072 : 65536) | (bVarI.c(f) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i3) == 4793490) ? false : true)) {
            boolean z = ((i2 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new f1g0(fxhVar, aVar, f);
                bVarI.r(objY);
            }
            f1g0 f1g0Var = (f1g0) objY;
            int I = bVarI.I();
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
            hlh0.a(bVarI, f1g0Var, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar4 = d.a.b;
            d dVarB = i.b(aVar4, "navigationIcon");
            float f2 = b;
            d dVarJ = h.j(dVarB, f2, 0.0f, 0.0f, 0.0f, 14);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            chf chfVar = iza.a;
            hna.a(tp0.a(j, chfVar), function2, bVarI, ((i3 >> 12) & 112) | 8);
            bVarI.X(true);
            bVarI.N(-1359701523);
            d dVarH = h.h(i.b(aVar4, "title"), f2, 0.0f, 2);
            bVarI.N(510340109);
            int i4 = 0;
            bVarI.X(false);
            d dVarN = dVarH.n(aVar4);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                function1 = function0;
                objY2 = new qp0(function1, i4);
                bVarI.r(objY2);
            } else {
                function1 = function0;
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarN, (Function1) objY2);
            aiv aivVarC2 = g75.c(n54Var, false);
            int I3 = bVarI.I();
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                n30.a(I3, bVarI, I3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            i730.a(j2, imf0Var, op8Var, bVarI, ((i2 >> 9) & 14) | ((i2 >> 18) & 112) | ((i2 >> 12) & 896));
            bVar = bVarI;
            bVar.X(true);
            bVar.X(false);
            d dVarJ2 = h.j(i.b(aVar4, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11);
            aiv aivVarC3 = g75.c(n54Var, false);
            int I4 = bVar.I();
            ne00 ne00VarS4 = bVar.S();
            d dVarC4 = c.c(bVar, dVarJ2);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, aivVarC3, bVar2);
            hlh0.a(bVar, ne00VarS4, dVar2);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(I4))) {
                n30.a(I4, bVar, I4, c1350a);
            }
            hlh0.a(bVar, dVarC4, cVar);
            j5 = j4;
            op8Var3 = op8Var2;
            hna.a(chfVar.a(new j58(j5)), op8Var3, bVar, 56);
            bVar.X(true);
            bVar.X(true);
        } else {
            function1 = function0;
            op8Var3 = op8Var2;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final op8 op8Var4 = op8Var3;
            final Function0 function3 = function1;
            eVarZ.d = new Function2(fxhVar, j, j2, j3, j5, op8Var, imf0Var, imf0Var2, function3, aVar, function2, op8Var4, f, i) { // from class: rp0
                public final /* synthetic */ Function2 A;
                public final /* synthetic */ op8 B;
                public final /* synthetic */ float C;
                public final /* synthetic */ fxh b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ op8 i;
                public final /* synthetic */ imf0 v;
                public final /* synthetic */ imf0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ n54.a z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vp0.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object e(final i1g0 i1g0Var, float f, h4d h4dVar, xi0 xi0Var, x1b x1bVar) {
        up0 up0Var;
        final aq40 aq40Var;
        aq40 aq40Var2;
        if (x1bVar instanceof up0) {
            up0Var = (up0) x1bVar;
            int i = up0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                up0Var.e = i - Integer.MIN_VALUE;
            } else {
                up0Var = new up0(x1bVar);
            }
        } else {
            up0Var = new up0(x1bVar);
        }
        up0 up0Var2 = up0Var;
        Object obj = up0Var2.d;
        y5b y5bVar = y5b.a;
        int i2 = up0Var2.e;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                aq40 aq40Var3 = up0Var2.c;
                xi0Var = up0Var2.b;
                i1g0 i1g0Var2 = (i1g0) up0Var2.a;
                uj50.b(obj);
                aq40Var = aq40Var3;
                i1g0Var = i1g0Var2;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aq40Var2 = (aq40) up0Var2.a;
                uj50.b(obj);
            }
            aq40Var = aq40Var2;
            return new exh0(fxh0.a(0.0f, aq40Var.a));
        }
        uj50.b(obj);
        if (i1g0Var.a() < 0.01f || i1g0Var.a() == 1.0f) {
            return new exh0(0L);
        }
        aq40Var = new aq40();
        aq40Var.a = f;
        if (h4dVar != null && Math.abs(f) > 1.0f) {
            final aq40 aq40Var4 = new aq40();
            aj0 aj0VarA = cj0.a(28, 0.0f, f);
            Function1 function1 = new Function1() { // from class: sp0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    vi0 vi0Var = (vi0) obj2;
                    float fFloatValue = ((Number) ((x5a0) vi0Var.e).getValue()).floatValue();
                    aq40 aq40Var5 = aq40Var4;
                    float f2 = fFloatValue - aq40Var5.a;
                    i1g0 i1g0Var3 = i1g0Var;
                    float fB = i1g0Var3.b();
                    i1g0Var3.c(fB + f2);
                    float fAbs = Math.abs(fB - i1g0Var3.b());
                    aq40Var5.a = ((Number) ((x5a0) vi0Var.e).getValue()).floatValue();
                    aq40Var.a = ((Number) vi0Var.b()).floatValue();
                    if (Math.abs(f2 - fAbs) > 0.5f) {
                        vi0Var.a();
                    }
                    return Unit.a;
                }
            };
            up0Var2.a = i1g0Var;
            up0Var2.b = xi0Var;
            up0Var2.c = aq40Var;
            up0Var2.e = 1;
            if (sje0.d(aj0VarA, h4dVar, false, function1, up0Var2) != y5bVar) {
            }
            return y5bVar;
        }
        return new exh0(fxh0.a(0.0f, aq40Var.a));
        if (xi0Var != null && i1g0Var.b() < 0.0f && i1g0Var.b() > i1g0Var.a) {
            aj0 aj0VarA2 = cj0.a(30, i1g0Var.b(), 0.0f);
            Float f2 = new Float(i1g0Var.a() < 0.5f ? 0.0f : i1g0Var.a);
            jp0 jp0Var = new jp0(i1g0Var, i3);
            up0Var2.a = aq40Var;
            up0Var2.b = null;
            up0Var2.c = null;
            up0Var2.e = 2;
            if (sje0.f(aj0VarA2, f2, xi0Var, false, jp0Var, up0Var2, 4) != y5bVar) {
                aq40Var2 = aq40Var;
                aq40Var = aq40Var2;
            }
            return y5bVar;
        }
        return new exh0(fxh0.a(0.0f, aq40Var.a));
    }
}
