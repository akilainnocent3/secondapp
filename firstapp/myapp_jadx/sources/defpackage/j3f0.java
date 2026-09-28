package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class j3f0 {
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final d dVar, final long j, long j2, final op8 op8Var, final op8 op8Var2, final op8 op8Var3, a aVar, final int i2, final int i3) {
        long jD;
        int i4;
        boolean z;
        final long j3;
        e eVarZ;
        b bVarI = aVar.i(-1012974221);
        int i5 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16);
        if ((i3 & 8) == 0) {
            jD = j2;
            int i6 = bVarI.e(jD) ? 2048 : 1024;
            i4 = i5 | i6;
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) == 0 && !bVarI.h0()) {
                    bVarI.G();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                } else if ((i3 & 8) != 0) {
                    jD = g68.d(ir20.e, bVarI);
                    i4 &= -7169;
                }
                long j4 = jD;
                bVarI.Y();
                h(dVar, j, j4, op8Var, op8Var2, op8Var3, bVarI, (i4 >> 3) & 524286);
                j3 = j4;
            } else {
                bVarI.G();
                j3 = jD;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2(i, dVar, j, j3, op8Var, op8Var2, op8Var3, i2, i3) { // from class: j2f0
                    public final /* synthetic */ int a;
                    public final /* synthetic */ d b;
                    public final /* synthetic */ long c;
                    public final /* synthetic */ long d;
                    public final /* synthetic */ op8 e;
                    public final /* synthetic */ op8 f;
                    public final /* synthetic */ op8 i;
                    public final /* synthetic */ int v;

                    {
                        this.v = i3;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(1794433);
                        j3f0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA, this.v);
                        return Unit.a;
                    }
                };
            }
        }
        jD = j2;
        i4 = i5 | i6;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            if ((i2 & 1) == 0) {
                if ((i3 & 8) != 0) {
                    jD = g68.d(ir20.e, bVarI);
                    i4 &= -7169;
                }
            } else if ((i3 & 8) != 0) {
                jD = g68.d(ir20.e, bVarI);
                i4 &= -7169;
            }
            long j5 = jD;
            bVarI.Y();
            h(dVar, j, j5, op8Var, op8Var2, op8Var3, bVarI, (i4 >> 3) & 524286);
            j3 = j5;
        } else {
            bVarI.G();
            j3 = jD;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, j, j3, op8Var, op8Var2, op8Var3, i2, i3) { // from class: j2f0
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ op8 e;
                public final /* synthetic */ op8 f;
                public final /* synthetic */ op8 i;
                public final /* synthetic */ int v;

                {
                    this.v = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1794433);
                    j3f0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA, this.v);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0153  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee A[PHI: r1 r3 r6
      0x00ee: PHI (r1v18 int) = (r1v14 int), (r1v12 int), (r1v19 int) binds: [B:94:0x0104, B:86:0x00ea, B:87:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r3v7 androidx.compose.ui.d) = (r3v4 androidx.compose.ui.d), (r3v2 androidx.compose.ui.d), (r3v2 androidx.compose.ui.d) binds: [B:94:0x0104, B:86:0x00ea, B:87:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r6v12 long) = (r6v3 long), (r6v2 long), (r6v2 long) binds: [B:94:0x0104, B:86:0x00ea, B:87:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0145  */
    @fae
    public static final void b(final int i, d dVar, final long j, long j2, final float f, final op8 op8Var, Function2 function2, final op8 op8Var2, a aVar, final int i2, final int i3) {
        int i4;
        d dVar2;
        long j3;
        long jD;
        float f2;
        int i5;
        Function2 function3;
        int i6;
        op8 op8Var3;
        boolean z;
        b bVar;
        final d dVar3;
        final long j4;
        final Function2 function4;
        e eVarZ;
        Function2 function5;
        long j5;
        int i7;
        int i8;
        int i9;
        int i10;
        b bVarI = aVar.i(847049916);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                dVar2 = dVar;
                i4 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                j3 = j;
                if (bVarI.e(j3)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    jD = j2;
                    int i12 = bVarI.e(jD) ? 2048 : 1024;
                    i4 |= i12;
                } else {
                    jD = j2;
                }
                i4 |= i12;
            } else {
                jD = j2;
            }
            if ((i2 & 24576) == 0) {
                f2 = f;
                if (bVarI.c(f2)) {
                    i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i9 = 8192;
                }
                i4 |= i9;
            } else {
                f2 = f;
            }
            if ((196608 & i2) == 0) {
                if (bVarI.A(op8Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                if ((1572864 & i2) == 0) {
                    function3 = function2;
                    if (bVarI.A(function3)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((12582912 & i2) == 0) {
                    op8Var3 = op8Var2;
                    if (bVarI.A(op8Var3)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i4 |= i7;
                } else {
                    op8Var3 = op8Var2;
                }
                if ((4793491 & i4) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0 || bVarI.h0()) {
                        if (i11 != 0) {
                            dVar2 = d.a.b;
                        }
                        if ((i3 & 8) != 0) {
                            jD = g68.d(ir20.e, bVarI);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            function5 = jw9.b;
                            j5 = jD;
                        }
                        bVarI.Y();
                        int i13 = i4 << 3;
                        bVar = bVarI;
                        op8 op8Var4 = op8Var3;
                        d dVar4 = dVar2;
                        d(i, op8Var, dVar4, j3, j5, f2, function5, op8Var4, op70.a(bVarI), bVar, (i4 & 14) | ((i4 >> 12) & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752) | (3670016 & i4) | (i4 & 29360128));
                        dVar3 = dVar4;
                        j4 = j5;
                        function4 = function5;
                    } else {
                        bVarI.G();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    j5 = jD;
                    function5 = function3;
                    bVarI.Y();
                    int i14 = i4 << 3;
                    bVar = bVarI;
                    op8 op8Var5 = op8Var3;
                    d dVar5 = dVar2;
                    d(i, op8Var, dVar5, j3, j5, f2, function5, op8Var5, op70.a(bVarI), bVar, (i4 & 14) | ((i4 >> 12) & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (3670016 & i4) | (i4 & 29360128));
                    dVar3 = dVar5;
                    j4 = j5;
                    function4 = function5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar3 = dVar2;
                    j4 = jD;
                    function4 = function3;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: o2f0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j3f0.b(i, dVar3, j, j4, f, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            function3 = function2;
            if ((12582912 & i2) == 0) {
                op8Var3 = op8Var2;
                if (bVarI.A(op8Var3)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            } else {
                op8Var3 = op8Var2;
            }
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function5 = jw9.b;
                        j5 = jD;
                    } else {
                        j5 = jD;
                        function5 = function3;
                    }
                } else {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function5 = jw9.b;
                        j5 = jD;
                    } else {
                        j5 = jD;
                        function5 = function3;
                    }
                }
                bVarI.Y();
                int i15 = i4 << 3;
                bVar = bVarI;
                op8 op8Var6 = op8Var3;
                d dVar6 = dVar2;
                d(i, op8Var, dVar6, j3, j5, f2, function5, op8Var6, op70.a(bVarI), bVar, (i4 & 14) | ((i4 >> 12) & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & 458752) | (3670016 & i4) | (i4 & 29360128));
                dVar3 = dVar6;
                j4 = j5;
                function4 = function5;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                j4 = jD;
                function4 = function3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: o2f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j3f0.b(i, dVar3, j, j4, f, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 48;
        dVar2 = dVar;
        if ((i2 & 384) == 0) {
            j3 = j;
            if (bVarI.e(j3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i4 |= i10;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jD = j2;
                if (bVarI.e(jD)) {
                }
                i4 |= i12;
            } else {
                jD = j2;
            }
            i4 |= i12;
        } else {
            jD = j2;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            if (bVarI.c(f2)) {
                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        } else {
            f2 = f;
        }
        if ((196608 & i2) == 0) {
            if (bVarI.A(op8Var)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            if ((1572864 & i2) == 0) {
                function3 = function2;
                if (bVarI.A(function3)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((12582912 & i2) == 0) {
                op8Var3 = op8Var2;
                if (bVarI.A(op8Var3)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i4 |= i7;
            } else {
                op8Var3 = op8Var2;
            }
            if ((4793491 & i4) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function5 = jw9.b;
                        j5 = jD;
                    } else {
                        j5 = jD;
                        function5 = function3;
                    }
                } else {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        function5 = jw9.b;
                        j5 = jD;
                    } else {
                        j5 = jD;
                        function5 = function3;
                    }
                }
                bVarI.Y();
                int i16 = i4 << 3;
                bVar = bVarI;
                op8 op8Var7 = op8Var3;
                d dVar7 = dVar2;
                d(i, op8Var, dVar7, j3, j5, f2, function5, op8Var7, op70.a(bVarI), bVar, (i4 & 14) | ((i4 >> 12) & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752) | (3670016 & i4) | (i4 & 29360128));
                dVar3 = dVar7;
                j4 = j5;
                function4 = function5;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                j4 = jD;
                function4 = function3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: o2f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j3f0.b(i, dVar3, j, j4, f, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 1572864;
        function3 = function2;
        if ((12582912 & i2) == 0) {
            op8Var3 = op8Var2;
            if (bVarI.A(op8Var3)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i4 |= i7;
        } else {
            op8Var3 = op8Var2;
        }
        if ((4793491 & i4) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    dVar2 = d.a.b;
                }
                if ((i3 & 8) != 0) {
                    jD = g68.d(ir20.e, bVarI);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function5 = jw9.b;
                    j5 = jD;
                } else {
                    j5 = jD;
                    function5 = function3;
                }
            } else {
                if (i11 != 0) {
                    dVar2 = d.a.b;
                }
                if ((i3 & 8) != 0) {
                    jD = g68.d(ir20.e, bVarI);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    function5 = jw9.b;
                    j5 = jD;
                } else {
                    j5 = jD;
                    function5 = function3;
                }
            }
            bVarI.Y();
            int i17 = i4 << 3;
            bVar = bVarI;
            op8 op8Var8 = op8Var3;
            d dVar8 = dVar2;
            d(i, op8Var, dVar8, j3, j5, f2, function5, op8Var8, op70.a(bVarI), bVar, (i4 & 14) | ((i4 >> 12) & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (i17 & 458752) | (3670016 & i4) | (i4 & 29360128));
            dVar3 = dVar8;
            j4 = j5;
            function4 = function5;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
            j4 = jD;
            function4 = function3;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3f0.b(i, dVar3, j, j4, f, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, final d dVar, final long j, final long j2, final float f, final float f2, final zp70 zp70Var, final op8 op8Var, final op8 op8Var2, final op8 op8Var3, a aVar, final int i2) {
        int i3;
        op8 op8Var4;
        op8 op8Var5;
        op8 op8Var6;
        b bVar;
        b bVarI = aVar.i(414860860);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.e(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.c(f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.c(f2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.M(zp70Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            op8Var4 = op8Var;
            i3 |= bVarI.A(op8Var4) ? 8388608 : 4194304;
        } else {
            op8Var4 = op8Var;
        }
        if ((100663296 & i2) == 0) {
            op8Var5 = op8Var2;
            i3 |= bVarI.A(op8Var5) ? 67108864 : 33554432;
        } else {
            op8Var5 = op8Var2;
        }
        if ((805306368 & i2) == 0) {
            op8Var6 = op8Var3;
            i3 |= bVarI.A(op8Var6) ? 536870912 : 268435456;
        } else {
            op8Var6 = op8Var3;
        }
        if (bVarI.q(i3 & 1, (i3 & 306783379) != 306783378)) {
            bVar = bVarI;
            ihe0.a(dVar, null, j, j2, 0.0f, 0.0f, null, pp8.b(1878374785, new w2f0(zp70Var, op8Var5, op8Var6, f, f2, i, op8Var4), bVarI), bVar, ((i3 >> 3) & 14) | 12582912 | (i3 & 896) | (i3 & 7168), 114);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: r2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    j3f0.c(i, dVar, j, j2, f, f2, zp70Var, op8Var, op8Var2, op8Var3, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, final op8 op8Var, final d dVar, final long j, final long j2, final float f, final Function2 function2, final op8 op8Var2, final zp70 zp70Var, a aVar, final int i2) {
        int i3;
        b bVar;
        b bVarI = aVar.i(901781420);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= bVarI.c(f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= bVarI.A(op8Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= bVarI.M(zp70Var) ? 67108864 : 33554432;
        }
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            int i4 = ((i3 >> 6) & 14) | 12582912;
            int i5 = i3 >> 3;
            bVar = bVarI;
            ihe0.a(dVar, null, j, j2, 0.0f, 0.0f, null, pp8.b(2077251399, new a3f0(zp70Var, f, op8Var2, function2, op8Var, i), bVarI), bVar, i4 | (i5 & 896) | (i5 & 7168), 114);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3f0.d(i, op8Var, dVar, j, j2, f, function2, op8Var2, zp70Var, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final int i, final d dVar, zp70 zp70Var, final long j, long j2, final float f, final op8 op8Var, final op8 op8Var2, float f2, final op8 op8Var3, a aVar, final int i2, final int i3) {
        b bVar;
        final zp70 zp70Var2;
        final float f3;
        int i4;
        zp70 zp70Var3;
        long j3;
        float f4;
        int i5;
        b bVarI = aVar.i(519094802);
        int i6 = (bVarI.d(i) ? 4 : 2) | i2 | (bVarI.M(dVar) ? 32 : 16) | 128;
        if ((i2 & 3072) == 0) {
            i6 |= bVarI.e(j) ? 2048 : 1024;
        }
        final long jD = j2;
        int i7 = i6 | (((i3 & 16) == 0 && bVarI.e(jD)) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 100663296;
        if (bVarI.q(i7 & 1, (306783379 & i7) != 306783378)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                zp70 zp70VarA = op70.a(bVarI);
                int i8 = i7 & (-897);
                if ((i3 & 16) != 0) {
                    jD = g68.d(y280.a, bVarI);
                    i4 = i7 & (-58241);
                } else {
                    i4 = i8;
                }
                zp70Var3 = zp70VarA;
                j3 = jD;
                f4 = 90.0f;
                i5 = i4;
            } else {
                bVarI.G();
                i5 = i7 & (-897);
                if ((i3 & 16) != 0) {
                    i5 = i7 & (-58241);
                }
                zp70Var3 = zp70Var;
                f4 = f2;
                j3 = jD;
            }
            bVarI.Y();
            int i9 = i5 & WebSocketProtocol.PAYLOAD_SHORT;
            int i10 = i5 >> 3;
            bVar = bVarI;
            c(i, dVar, j, j3, f, f4, zp70Var3, op8Var, op8Var2, op8Var3, bVar, i9 | (i10 & 896) | (i10 & 7168) | 918773760);
            jD = j3;
            f3 = f4;
            zp70Var2 = zp70Var3;
        } else {
            bVar = bVarI;
            bVar.G();
            zp70Var2 = zp70Var;
            f3 = f2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: q2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    j3f0.e(i, dVar, zp70Var2, j, jD, f, op8Var, op8Var2, f3, op8Var3, (a) obj, iA, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final int i, final d dVar, final long j, final long j2, final op8 op8Var, final op8 op8Var2, final op8 op8Var3, a aVar, final int i2) {
        b bVarI = aVar.i(563434725);
        int i3 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.e(j) ? 256 : 128) | (bVarI.e(j2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            h(dVar, j, j2, op8Var, op8Var2, op8Var3, bVarI, (i3 >> 3) & 524286);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, j, j2, op8Var, op8Var2, op8Var3, i2) { // from class: l2f0
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ op8 e;
                public final /* synthetic */ op8 f;
                public final /* synthetic */ op8 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1794097);
                    j3f0.f(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8 A[PHI: r2 r4 r5
      0x00d8: PHI (r2v17 int) = (r2v12 int), (r2v9 int), (r2v18 int) binds: [B:86:0x00ed, B:78:0x00d4, B:79:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r4v6 androidx.compose.ui.d) = (r4v3 androidx.compose.ui.d), (r4v2 androidx.compose.ui.d), (r4v2 androidx.compose.ui.d) binds: [B:86:0x00ed, B:78:0x00d4, B:79:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r5v12 long) = (r5v9 long), (r5v7 long), (r5v7 long) binds: [B:86:0x00ed, B:78:0x00d4, B:79:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @fae
    public static final void g(int i, d dVar, final long j, long j2, final op8 op8Var, Function2 function2, final op8 op8Var2, a aVar, final int i2, final int i3) {
        final int i4;
        int i5;
        d dVar2;
        final long jD;
        op8 op8Var3;
        int i6;
        Function2 function3;
        int i7;
        op8 op8Var4;
        boolean z;
        b bVar;
        final d dVar3;
        final Function2 function4;
        e eVarZ;
        Function2 function5;
        long j3;
        int i8;
        int i9;
        int i10;
        b bVarI = aVar.i(1445190381);
        if ((i2 & 6) == 0) {
            i4 = i;
            i5 = (bVarI.d(i4) ? 4 : 2) | i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                dVar2 = dVar;
                i5 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (bVarI.e(j)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i5 |= i10;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    jD = j2;
                    int i12 = bVarI.e(jD) ? 2048 : 1024;
                    i5 |= i12;
                } else {
                    jD = j2;
                }
                i5 |= i12;
            } else {
                jD = j2;
            }
            if ((i2 & 24576) == 0) {
                op8Var3 = op8Var;
                if (bVarI.A(op8Var3)) {
                    i9 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i9 = 8192;
                }
                i5 |= i9;
            } else {
                op8Var3 = op8Var;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    function3 = function2;
                    if (bVarI.A(function3)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                if ((1572864 & i2) == 0) {
                    op8Var4 = op8Var2;
                    if (bVarI.A(op8Var4)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i5 |= i8;
                } else {
                    op8Var4 = op8Var2;
                }
                if ((599187 & i5) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i5 & 1, z)) {
                    bVarI.A0();
                    if ((i2 & 1) != 0 || bVarI.h0()) {
                        if (i11 != 0) {
                            dVar2 = d.a.b;
                        }
                        if ((i3 & 8) != 0) {
                            jD = g68.d(ir20.e, bVarI);
                            i5 &= -7169;
                        }
                        if (i6 != 0) {
                            function5 = jw9.a;
                            j3 = jD;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        op8 op8Var5 = op8Var4;
                        d dVar4 = dVar2;
                        i(dVar4, j, j3, op8Var3, function5, op8Var5, bVar, (i5 >> 3) & 524286);
                        dVar3 = dVar4;
                        jD = j3;
                        function4 = function5;
                    } else {
                        bVarI.G();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                    }
                    j3 = jD;
                    function5 = function3;
                    bVarI.Y();
                    bVar = bVarI;
                    op8 op8Var6 = op8Var4;
                    d dVar5 = dVar2;
                    i(dVar5, j, j3, op8Var3, function5, op8Var6, bVar, (i5 >> 3) & 524286);
                    dVar3 = dVar5;
                    jD = j3;
                    function4 = function5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar3 = dVar2;
                    function4 = function3;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: m2f0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j3f0.g(i4, dVar3, j, jD, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            function3 = function2;
            if ((1572864 & i2) == 0) {
                op8Var4 = op8Var2;
                if (bVarI.A(op8Var4)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i5 |= i8;
            } else {
                op8Var4 = op8Var2;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        function5 = jw9.a;
                        j3 = jD;
                    } else {
                        j3 = jD;
                        function5 = function3;
                    }
                } else {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        function5 = jw9.a;
                        j3 = jD;
                    } else {
                        j3 = jD;
                        function5 = function3;
                    }
                }
                bVarI.Y();
                bVar = bVarI;
                op8 op8Var7 = op8Var4;
                d dVar6 = dVar2;
                i(dVar6, j, j3, op8Var3, function5, op8Var7, bVar, (i5 >> 3) & 524286);
                dVar3 = dVar6;
                jD = j3;
                function4 = function5;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                function4 = function3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: m2f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j3f0.g(i4, dVar3, j, jD, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 48;
        dVar2 = dVar;
        if ((i2 & 384) == 0) {
            if (bVarI.e(j)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jD = j2;
                if (bVarI.e(jD)) {
                }
                i5 |= i12;
            } else {
                jD = j2;
            }
            i5 |= i12;
        } else {
            jD = j2;
        }
        if ((i2 & 24576) == 0) {
            op8Var3 = op8Var;
            if (bVarI.A(op8Var3)) {
                i9 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        } else {
            op8Var3 = op8Var;
        }
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i2) == 0) {
                function3 = function2;
                if (bVarI.A(function3)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            if ((1572864 & i2) == 0) {
                op8Var4 = op8Var2;
                if (bVarI.A(op8Var4)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i5 |= i8;
            } else {
                op8Var4 = op8Var2;
            }
            if ((599187 & i5) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        function5 = jw9.a;
                        j3 = jD;
                    } else {
                        j3 = jD;
                        function5 = function3;
                    }
                } else {
                    if (i11 != 0) {
                        dVar2 = d.a.b;
                    }
                    if ((i3 & 8) != 0) {
                        jD = g68.d(ir20.e, bVarI);
                        i5 &= -7169;
                    }
                    if (i6 != 0) {
                        function5 = jw9.a;
                        j3 = jD;
                    } else {
                        j3 = jD;
                        function5 = function3;
                    }
                }
                bVarI.Y();
                bVar = bVarI;
                op8 op8Var8 = op8Var4;
                d dVar7 = dVar2;
                i(dVar7, j, j3, op8Var3, function5, op8Var8, bVar, (i5 >> 3) & 524286);
                dVar3 = dVar7;
                jD = j3;
                function4 = function5;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                function4 = function3;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: m2f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j3f0.g(i4, dVar3, j, jD, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 196608;
        function3 = function2;
        if ((1572864 & i2) == 0) {
            op8Var4 = op8Var2;
            if (bVarI.A(op8Var4)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i5 |= i8;
        } else {
            op8Var4 = op8Var2;
        }
        if ((599187 & i5) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            bVarI.A0();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    dVar2 = d.a.b;
                }
                if ((i3 & 8) != 0) {
                    jD = g68.d(ir20.e, bVarI);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    function5 = jw9.a;
                    j3 = jD;
                } else {
                    j3 = jD;
                    function5 = function3;
                }
            } else {
                if (i11 != 0) {
                    dVar2 = d.a.b;
                }
                if ((i3 & 8) != 0) {
                    jD = g68.d(ir20.e, bVarI);
                    i5 &= -7169;
                }
                if (i6 != 0) {
                    function5 = jw9.a;
                    j3 = jD;
                } else {
                    j3 = jD;
                    function5 = function3;
                }
            }
            bVarI.Y();
            bVar = bVarI;
            op8 op8Var9 = op8Var4;
            d dVar8 = dVar2;
            i(dVar8, j, j3, op8Var3, function5, op8Var9, bVar, (i5 >> 3) & 524286);
            dVar3 = dVar8;
            jD = j3;
            function4 = function5;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
            function4 = function3;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3f0.g(i4, dVar3, j, jD, op8Var, function4, op8Var2, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(d dVar, final long j, final long j2, final op8 op8Var, final op8 op8Var2, final op8 op8Var3, a aVar, final int i) {
        final d dVar2;
        int i2;
        b bVar;
        b bVarI = aVar.i(1955286154);
        if ((i & 6) == 0) {
            dVar2 = dVar;
            i2 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(op8Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(op8Var3) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            bVar = bVarI;
            ihe0.a(i780.a(dVar2), null, j, j2, 0.0f, 0.0f, null, pp8.b(830280655, new f3f0(op8Var3, op8Var2, op8Var), bVarI), bVar, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3f0.h(dVar2, j, j2, op8Var, op8Var2, op8Var3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(d dVar, final long j, final long j2, final op8 op8Var, final Function2 function2, final op8 op8Var2, a aVar, final int i) {
        final d dVar2;
        int i2;
        b bVar;
        b bVarI = aVar.i(148841506);
        if ((i & 6) == 0) {
            dVar2 = dVar;
            i2 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(op8Var2) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            bVar = bVarI;
            ihe0.a(i780.a(dVar2), null, j, j2, 0.0f, 0.0f, null, pp8.b(-1815327065, new i3f0(op8Var2, function2, op8Var), bVarI), bVar, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n2f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j3f0.i(dVar2, j, j2, op8Var, function2, op8Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
