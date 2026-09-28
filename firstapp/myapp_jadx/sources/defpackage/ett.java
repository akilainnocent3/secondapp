package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class ett {
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void a(final d dVar, float f, qx80 qx80Var, float f2, float f3, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        float f4;
        int i4;
        int i5;
        float f5;
        int i6;
        boolean z;
        final float f6;
        final float f7;
        final qx80 qx80VarC;
        final float f8;
        e eVarZ;
        int i7;
        float f9;
        b bVarI = aVar.i(-1943332470);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                f4 = f;
                i3 |= bVarI.c(f4) ? 32 : 16;
            }
            i4 = i3 | 3200;
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    f5 = f3;
                    if (bVarI.c(f5)) {
                        i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((74899 & i4) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0 || bVarI.h0()) {
                        if (i8 != 0) {
                            f7 = 0.5f;
                        } else {
                            f7 = f4;
                        }
                        qx80VarC = j060.c(8.0f);
                        i7 = i4 & (-897);
                        f9 = 1.0f;
                        if (i5 != 0) {
                            f5 = 0.25f;
                        }
                    } else {
                        bVarI.G();
                        f9 = f2;
                        i7 = i4 & (-897);
                        f7 = f4;
                        qx80VarC = qx80Var;
                    }
                    bVarI.Y();
                    rg6.a(dVar, qx80VarC, gg6.b(j58.c(f7, r58.d(4278190337L)), 0L, bVarI, 24576, 14), null, m35.a(f9, j58.c(f5, j58.f)), op8Var, bVarI, (i7 & 14) | 196608, 8);
                    bVarI = bVarI;
                    f6 = f9;
                } else {
                    bVarI.G();
                    f6 = f2;
                    f7 = f4;
                    qx80VarC = qx80Var;
                }
                f8 = f5;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: dtt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ett.a(dVar, f7, qx80VarC, f6, f8, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 = i3 | 27776;
            f5 = f3;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        f7 = 0.5f;
                    } else {
                        f7 = f4;
                    }
                    qx80VarC = j060.c(8.0f);
                    i7 = i4 & (-897);
                    f9 = 1.0f;
                    if (i5 != 0) {
                        f5 = 0.25f;
                    }
                } else {
                    if (i8 != 0) {
                        f7 = 0.5f;
                    } else {
                        f7 = f4;
                    }
                    qx80VarC = j060.c(8.0f);
                    i7 = i4 & (-897);
                    f9 = 1.0f;
                    if (i5 != 0) {
                        f5 = 0.25f;
                    }
                }
                bVarI.Y();
                rg6.a(dVar, qx80VarC, gg6.b(j58.c(f7, r58.d(4278190337L)), 0L, bVarI, 24576, 14), null, m35.a(f9, j58.c(f5, j58.f)), op8Var, bVarI, (i7 & 14) | 196608, 8);
                bVarI = bVarI;
                f6 = f9;
            } else {
                bVarI.G();
                f6 = f2;
                f7 = f4;
                qx80VarC = qx80Var;
            }
            f8 = f5;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: dtt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ett.a(dVar, f7, qx80VarC, f6, f8, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        f4 = f;
        i4 = i3 | 3200;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                f5 = f3;
                if (bVarI.c(f5)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        f7 = 0.5f;
                    } else {
                        f7 = f4;
                    }
                    qx80VarC = j060.c(8.0f);
                    i7 = i4 & (-897);
                    f9 = 1.0f;
                    if (i5 != 0) {
                        f5 = 0.25f;
                    }
                } else {
                    if (i8 != 0) {
                        f7 = 0.5f;
                    } else {
                        f7 = f4;
                    }
                    qx80VarC = j060.c(8.0f);
                    i7 = i4 & (-897);
                    f9 = 1.0f;
                    if (i5 != 0) {
                        f5 = 0.25f;
                    }
                }
                bVarI.Y();
                rg6.a(dVar, qx80VarC, gg6.b(j58.c(f7, r58.d(4278190337L)), 0L, bVarI, 24576, 14), null, m35.a(f9, j58.c(f5, j58.f)), op8Var, bVarI, (i7 & 14) | 196608, 8);
                bVarI = bVarI;
                f6 = f9;
            } else {
                bVarI.G();
                f6 = f2;
                f7 = f4;
                qx80VarC = qx80Var;
            }
            f8 = f5;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: dtt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ett.a(dVar, f7, qx80VarC, f6, f8, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 = i3 | 27776;
        f5 = f3;
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    f7 = 0.5f;
                } else {
                    f7 = f4;
                }
                qx80VarC = j060.c(8.0f);
                i7 = i4 & (-897);
                f9 = 1.0f;
                if (i5 != 0) {
                    f5 = 0.25f;
                }
            } else {
                if (i8 != 0) {
                    f7 = 0.5f;
                } else {
                    f7 = f4;
                }
                qx80VarC = j060.c(8.0f);
                i7 = i4 & (-897);
                f9 = 1.0f;
                if (i5 != 0) {
                    f5 = 0.25f;
                }
            }
            bVarI.Y();
            rg6.a(dVar, qx80VarC, gg6.b(j58.c(f7, r58.d(4278190337L)), 0L, bVarI, 24576, 14), null, m35.a(f9, j58.c(f5, j58.f)), op8Var, bVarI, (i7 & 14) | 196608, 8);
            bVarI = bVarI;
            f6 = f9;
        } else {
            bVarI.G();
            f6 = f2;
            f7 = f4;
            qx80VarC = qx80Var;
        }
        f8 = f5;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dtt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ett.a(dVar, f7, qx80VarC, f6, f8, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
