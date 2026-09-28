package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class c55 {
    public static final c55 a = new c55();
    public static final float b;
    public static final float c;
    public static final float d;

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                g75.a(j.t(d.a.b, this.a, this.b), aVar2, 0);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    static {
        e68 e68Var = s490.a;
        float f = s490.f;
        b = 640.0f;
        c = 56.0f;
        d = 125.0f;
    }

    public static vbs b(androidx.compose.runtime.a aVar) {
        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
        return new vbs(q8j0.a.a(aVar).k, 48);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb A[PHI: r1 r2 r3 r7 r9
      0x00bb: PHI (r1v7 androidx.compose.ui.d) = (r1v4 androidx.compose.ui.d), (r1v10 androidx.compose.ui.d) binds: [B:81:0x00e2, B:66:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r2v10 float) = (r2v6 float), (r2v11 float) binds: [B:81:0x00e2, B:66:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r3v22 int) = (r3v15 int), (r3v24 int) binds: [B:81:0x00e2, B:66:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r7v6 float) = (r7v3 float), (r7v2 float) binds: [B:81:0x00e2, B:66:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r9v17 qx80) = (r9v9 qx80), (r9v7 qx80) binds: [B:81:0x00e2, B:66:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public final void a(float f, float f2, final int i, final int i2, long j, qx80 qx80Var, androidx.compose.runtime.a aVar, d dVar) {
        final d dVar2;
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        qx80 qx80Var2;
        long j2;
        int i6;
        int i7;
        boolean z;
        b bVar;
        final float f5;
        final float f6;
        final qx80 qx80Var3;
        final long j3;
        e eVarZ;
        d dVar3;
        float f7;
        long jD;
        String strA;
        boolean zM;
        Object objY;
        b bVarI = aVar.i(-1364277227);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                f3 = f;
                i3 |= bVarI.c(f3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f4 = f2;
                    if (bVarI.c(f4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) == 0) {
                    qx80Var2 = qx80Var;
                    int i10 = bVarI.M(qx80Var2) ? 2048 : 1024;
                    int i11 = i3 | i10;
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        int i12 = bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i6 = i11 | i12;
                        i7 = 0;
                        if ((i6 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i6 & 1, z)) {
                            bVarI.A0();
                            if ((i & 1) != 0 || bVarI.h0()) {
                                if (i8 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (i9 != 0) {
                                    f7 = s490.e;
                                } else {
                                    f7 = f3;
                                }
                                if (i4 != 0) {
                                    f4 = s490.d;
                                }
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                    qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                    jD = g68.d(s490.c, bVarI);
                                }
                                qx80 qx80Var4 = qx80Var2;
                                bVarI.Y();
                                strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                                gzg0 gzg0Var = b590.a;
                                d dVarH = h.h(dVar3, 0.0f, 22.0f, 1);
                                zM = bVarI.M(strA);
                                objY = bVarI.y();
                                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                                    objY = new a55(strA, i7);
                                    bVarI.r(objY);
                                }
                                int i13 = i6 >> 6;
                                bVar = bVarI;
                                ihe0.a(xa80.b(dVarH, false, (Function1) objY), qx80Var4, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i13 & 112) | 12582912 | (i13 & 896), 120);
                                f5 = f7;
                                f6 = f4;
                                qx80Var3 = qx80Var4;
                                j3 = jD;
                                dVar2 = dVar3;
                            } else {
                                bVarI.G();
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                }
                                dVar3 = dVar2;
                                f7 = f3;
                            }
                            jD = j2;
                            qx80 qx80Var5 = qx80Var2;
                            bVarI.Y();
                            strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                            gzg0 gzg0Var2 = b590.a;
                            d dVarH2 = h.h(dVar3, 0.0f, 22.0f, 1);
                            zM = bVarI.M(strA);
                            objY = bVarI.y();
                            if (zM) {
                                objY = new a55(strA, i7);
                                bVarI.r(objY);
                            } else {
                                objY = new a55(strA, i7);
                                bVarI.r(objY);
                            }
                            int i14 = i6 >> 6;
                            bVar = bVarI;
                            ihe0.a(xa80.b(dVarH2, false, (Function1) objY), qx80Var5, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i14 & 112) | 12582912 | (i14 & 896), 120);
                            f5 = f7;
                            f6 = f4;
                            qx80Var3 = qx80Var5;
                            j3 = jD;
                            dVar2 = dVar3;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            f5 = f3;
                            f6 = f4;
                            qx80Var3 = qx80Var2;
                            j3 = j2;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: b55
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = qj40.a(i | 1);
                                    this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    j2 = j;
                    i6 = i11 | i12;
                    i7 = 0;
                    if ((i6 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i6 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        } else {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        }
                        qx80 qx80Var6 = qx80Var2;
                        bVarI.Y();
                        strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                        gzg0 gzg0Var3 = b590.a;
                        d dVarH3 = h.h(dVar3, 0.0f, 22.0f, 1);
                        zM = bVarI.M(strA);
                        objY = bVarI.y();
                        if (zM) {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        } else {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        }
                        int i15 = i6 >> 6;
                        bVar = bVarI;
                        ihe0.a(xa80.b(dVarH3, false, (Function1) objY), qx80Var6, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i15 & 112) | 12582912 | (i15 & 896), 120);
                        f5 = f7;
                        f6 = f4;
                        qx80Var3 = qx80Var6;
                        j3 = jD;
                        dVar2 = dVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        f5 = f3;
                        f6 = f4;
                        qx80Var3 = qx80Var2;
                        j3 = j2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: b55
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                                return Unit.a;
                            }
                        };
                    }
                }
                qx80Var2 = qx80Var;
                int i16 = i3 | i10;
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (bVarI.e(j2)) {
                    }
                    i6 = i16 | i12;
                    i7 = 0;
                    if ((i6 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i6 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        } else {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        }
                        qx80 qx80Var7 = qx80Var2;
                        bVarI.Y();
                        strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                        gzg0 gzg0Var4 = b590.a;
                        d dVarH4 = h.h(dVar3, 0.0f, 22.0f, 1);
                        zM = bVarI.M(strA);
                        objY = bVarI.y();
                        if (zM) {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        } else {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        }
                        int i17 = i6 >> 6;
                        bVar = bVarI;
                        ihe0.a(xa80.b(dVarH4, false, (Function1) objY), qx80Var7, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i17 & 112) | 12582912 | (i17 & 896), 120);
                        f5 = f7;
                        f6 = f4;
                        qx80Var3 = qx80Var7;
                        j3 = jD;
                        dVar2 = dVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        f5 = f3;
                        f6 = f4;
                        qx80Var3 = qx80Var2;
                        j3 = j2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: b55
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                                return Unit.a;
                            }
                        };
                    }
                }
                j2 = j;
                i6 = i16 | i12;
                i7 = 0;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    } else {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    }
                    qx80 qx80Var8 = qx80Var2;
                    bVarI.Y();
                    strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                    gzg0 gzg0Var5 = b590.a;
                    d dVarH5 = h.h(dVar3, 0.0f, 22.0f, 1);
                    zM = bVarI.M(strA);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    } else {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    }
                    int i18 = i6 >> 6;
                    bVar = bVarI;
                    ihe0.a(xa80.b(dVarH5, false, (Function1) objY), qx80Var8, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i18 & 112) | 12582912 | (i18 & 896), 120);
                    f5 = f7;
                    f6 = f4;
                    qx80Var3 = qx80Var8;
                    j3 = jD;
                    dVar2 = dVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    f5 = f3;
                    f6 = f4;
                    qx80Var3 = qx80Var2;
                    j3 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b55
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            f4 = f2;
            if ((i2 & 8) == 0) {
                qx80Var2 = qx80Var;
                if (bVarI.M(qx80Var2)) {
                }
                int i19 = i3 | i10;
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (bVarI.e(j2)) {
                    }
                    i6 = i19 | i12;
                    i7 = 0;
                    if ((i6 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i6 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        } else {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        }
                        qx80 qx80Var9 = qx80Var2;
                        bVarI.Y();
                        strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                        gzg0 gzg0Var6 = b590.a;
                        d dVarH6 = h.h(dVar3, 0.0f, 22.0f, 1);
                        zM = bVarI.M(strA);
                        objY = bVarI.y();
                        if (zM) {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        } else {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        }
                        int i110 = i6 >> 6;
                        bVar = bVarI;
                        ihe0.a(xa80.b(dVarH6, false, (Function1) objY), qx80Var9, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i110 & 112) | 12582912 | (i110 & 896), 120);
                        f5 = f7;
                        f6 = f4;
                        qx80Var3 = qx80Var9;
                        j3 = jD;
                        dVar2 = dVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        f5 = f3;
                        f6 = f4;
                        qx80Var3 = qx80Var2;
                        j3 = j2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: b55
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                                return Unit.a;
                            }
                        };
                    }
                }
                j2 = j;
                i6 = i19 | i12;
                i7 = 0;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    } else {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    }
                    qx80 qx80Var10 = qx80Var2;
                    bVarI.Y();
                    strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                    gzg0 gzg0Var7 = b590.a;
                    d dVarH7 = h.h(dVar3, 0.0f, 22.0f, 1);
                    zM = bVarI.M(strA);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    } else {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    }
                    int i111 = i6 >> 6;
                    bVar = bVarI;
                    ihe0.a(xa80.b(dVarH7, false, (Function1) objY), qx80Var10, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i111 & 112) | 12582912 | (i111 & 896), 120);
                    f5 = f7;
                    f6 = f4;
                    qx80Var3 = qx80Var10;
                    j3 = jD;
                    dVar2 = dVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    f5 = f3;
                    f6 = f4;
                    qx80Var3 = qx80Var2;
                    j3 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b55
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                            return Unit.a;
                        }
                    };
                }
            }
            qx80Var2 = qx80Var;
            int i112 = i3 | i10;
            if ((i2 & 16) == 0) {
                j2 = j;
                if (bVarI.e(j2)) {
                }
                i6 = i112 | i12;
                i7 = 0;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    } else {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    }
                    qx80 qx80Var11 = qx80Var2;
                    bVarI.Y();
                    strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                    gzg0 gzg0Var8 = b590.a;
                    d dVarH8 = h.h(dVar3, 0.0f, 22.0f, 1);
                    zM = bVarI.M(strA);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    } else {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    }
                    int i113 = i6 >> 6;
                    bVar = bVarI;
                    ihe0.a(xa80.b(dVarH8, false, (Function1) objY), qx80Var11, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i113 & 112) | 12582912 | (i113 & 896), 120);
                    f5 = f7;
                    f6 = f4;
                    qx80Var3 = qx80Var11;
                    j3 = jD;
                    dVar2 = dVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    f5 = f3;
                    f6 = f4;
                    qx80Var3 = qx80Var2;
                    j3 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b55
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                            return Unit.a;
                        }
                    };
                }
            }
            j2 = j;
            i6 = i112 | i12;
            i7 = 0;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                } else {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                }
                qx80 qx80Var12 = qx80Var2;
                bVarI.Y();
                strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                gzg0 gzg0Var9 = b590.a;
                d dVarH9 = h.h(dVar3, 0.0f, 22.0f, 1);
                zM = bVarI.M(strA);
                objY = bVarI.y();
                if (zM) {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                } else {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                }
                int i114 = i6 >> 6;
                bVar = bVarI;
                ihe0.a(xa80.b(dVarH9, false, (Function1) objY), qx80Var12, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i114 & 112) | 12582912 | (i114 & 896), 120);
                f5 = f7;
                f6 = f4;
                qx80Var3 = qx80Var12;
                j3 = jD;
                dVar2 = dVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                f5 = f3;
                f6 = f4;
                qx80Var3 = qx80Var2;
                j3 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b55
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        f3 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f4 = f2;
                if (bVarI.c(f4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) == 0) {
                qx80Var2 = qx80Var;
                if (bVarI.M(qx80Var2)) {
                }
                int i115 = i3 | i10;
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (bVarI.e(j2)) {
                    }
                    i6 = i115 | i12;
                    i7 = 0;
                    if ((i6 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i6 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        } else {
                            if (i8 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i9 != 0) {
                                f7 = s490.e;
                            } else {
                                f7 = f3;
                            }
                            if (i4 != 0) {
                                f4 = s490.d;
                            }
                            if ((i2 & 8) != 0) {
                                i6 &= -7169;
                                qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                            }
                            if ((i2 & 16) != 0) {
                                i6 &= -57345;
                                jD = g68.d(s490.c, bVarI);
                            } else {
                                jD = j2;
                            }
                        }
                        qx80 qx80Var13 = qx80Var2;
                        bVarI.Y();
                        strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                        gzg0 gzg0Var10 = b590.a;
                        d dVarH10 = h.h(dVar3, 0.0f, 22.0f, 1);
                        zM = bVarI.M(strA);
                        objY = bVarI.y();
                        if (zM) {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        } else {
                            objY = new a55(strA, i7);
                            bVarI.r(objY);
                        }
                        int i116 = i6 >> 6;
                        bVar = bVarI;
                        ihe0.a(xa80.b(dVarH10, false, (Function1) objY), qx80Var13, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i116 & 112) | 12582912 | (i116 & 896), 120);
                        f5 = f7;
                        f6 = f4;
                        qx80Var3 = qx80Var13;
                        j3 = jD;
                        dVar2 = dVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        f5 = f3;
                        f6 = f4;
                        qx80Var3 = qx80Var2;
                        j3 = j2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: b55
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                                return Unit.a;
                            }
                        };
                    }
                }
                j2 = j;
                i6 = i115 | i12;
                i7 = 0;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    } else {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    }
                    qx80 qx80Var14 = qx80Var2;
                    bVarI.Y();
                    strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                    gzg0 gzg0Var11 = b590.a;
                    d dVarH11 = h.h(dVar3, 0.0f, 22.0f, 1);
                    zM = bVarI.M(strA);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    } else {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    }
                    int i117 = i6 >> 6;
                    bVar = bVarI;
                    ihe0.a(xa80.b(dVarH11, false, (Function1) objY), qx80Var14, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i117 & 112) | 12582912 | (i117 & 896), 120);
                    f5 = f7;
                    f6 = f4;
                    qx80Var3 = qx80Var14;
                    j3 = jD;
                    dVar2 = dVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    f5 = f3;
                    f6 = f4;
                    qx80Var3 = qx80Var2;
                    j3 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b55
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                            return Unit.a;
                        }
                    };
                }
            }
            qx80Var2 = qx80Var;
            int i118 = i3 | i10;
            if ((i2 & 16) == 0) {
                j2 = j;
                if (bVarI.e(j2)) {
                }
                i6 = i118 | i12;
                i7 = 0;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    } else {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    }
                    qx80 qx80Var15 = qx80Var2;
                    bVarI.Y();
                    strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                    gzg0 gzg0Var12 = b590.a;
                    d dVarH12 = h.h(dVar3, 0.0f, 22.0f, 1);
                    zM = bVarI.M(strA);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    } else {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    }
                    int i119 = i6 >> 6;
                    bVar = bVarI;
                    ihe0.a(xa80.b(dVarH12, false, (Function1) objY), qx80Var15, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i119 & 112) | 12582912 | (i119 & 896), 120);
                    f5 = f7;
                    f6 = f4;
                    qx80Var3 = qx80Var15;
                    j3 = jD;
                    dVar2 = dVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    f5 = f3;
                    f6 = f4;
                    qx80Var3 = qx80Var2;
                    j3 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b55
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                            return Unit.a;
                        }
                    };
                }
            }
            j2 = j;
            i6 = i118 | i12;
            i7 = 0;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                } else {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                }
                qx80 qx80Var16 = qx80Var2;
                bVarI.Y();
                strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                gzg0 gzg0Var13 = b590.a;
                d dVarH13 = h.h(dVar3, 0.0f, 22.0f, 1);
                zM = bVarI.M(strA);
                objY = bVarI.y();
                if (zM) {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                } else {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                }
                int i1110 = i6 >> 6;
                bVar = bVarI;
                ihe0.a(xa80.b(dVarH13, false, (Function1) objY), qx80Var16, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i1110 & 112) | 12582912 | (i1110 & 896), 120);
                f5 = f7;
                f6 = f4;
                qx80Var3 = qx80Var16;
                j3 = jD;
                dVar2 = dVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                f5 = f3;
                f6 = f4;
                qx80Var3 = qx80Var2;
                j3 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b55
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        f4 = f2;
        if ((i2 & 8) == 0) {
            qx80Var2 = qx80Var;
            if (bVarI.M(qx80Var2)) {
            }
            int i1111 = i3 | i10;
            if ((i2 & 16) == 0) {
                j2 = j;
                if (bVarI.e(j2)) {
                }
                i6 = i1111 | i12;
                i7 = 0;
                if ((i6 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i6 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    } else {
                        if (i8 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i9 != 0) {
                            f7 = s490.e;
                        } else {
                            f7 = f3;
                        }
                        if (i4 != 0) {
                            f4 = s490.d;
                        }
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                            qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                        }
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                            jD = g68.d(s490.c, bVarI);
                        } else {
                            jD = j2;
                        }
                    }
                    qx80 qx80Var17 = qx80Var2;
                    bVarI.Y();
                    strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                    gzg0 gzg0Var14 = b590.a;
                    d dVarH14 = h.h(dVar3, 0.0f, 22.0f, 1);
                    zM = bVarI.M(strA);
                    objY = bVarI.y();
                    if (zM) {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    } else {
                        objY = new a55(strA, i7);
                        bVarI.r(objY);
                    }
                    int i1112 = i6 >> 6;
                    bVar = bVarI;
                    ihe0.a(xa80.b(dVarH14, false, (Function1) objY), qx80Var17, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i1112 & 112) | 12582912 | (i1112 & 896), 120);
                    f5 = f7;
                    f6 = f4;
                    qx80Var3 = qx80Var17;
                    j3 = jD;
                    dVar2 = dVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    f5 = f3;
                    f6 = f4;
                    qx80Var3 = qx80Var2;
                    j3 = j2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: b55
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                            return Unit.a;
                        }
                    };
                }
            }
            j2 = j;
            i6 = i1111 | i12;
            i7 = 0;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                } else {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                }
                qx80 qx80Var18 = qx80Var2;
                bVarI.Y();
                strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                gzg0 gzg0Var15 = b590.a;
                d dVarH15 = h.h(dVar3, 0.0f, 22.0f, 1);
                zM = bVarI.M(strA);
                objY = bVarI.y();
                if (zM) {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                } else {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                }
                int i1113 = i6 >> 6;
                bVar = bVarI;
                ihe0.a(xa80.b(dVarH15, false, (Function1) objY), qx80Var18, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i1113 & 112) | 12582912 | (i1113 & 896), 120);
                f5 = f7;
                f6 = f4;
                qx80Var3 = qx80Var18;
                j3 = jD;
                dVar2 = dVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                f5 = f3;
                f6 = f4;
                qx80Var3 = qx80Var2;
                j3 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b55
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                        return Unit.a;
                    }
                };
            }
        }
        qx80Var2 = qx80Var;
        int i1114 = i3 | i10;
        if ((i2 & 16) == 0) {
            j2 = j;
            if (bVarI.e(j2)) {
            }
            i6 = i1114 | i12;
            i7 = 0;
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                } else {
                    if (i8 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i9 != 0) {
                        f7 = s490.e;
                    } else {
                        f7 = f3;
                    }
                    if (i4 != 0) {
                        f4 = s490.d;
                    }
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                        qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                        jD = g68.d(s490.c, bVarI);
                    } else {
                        jD = j2;
                    }
                }
                qx80 qx80Var19 = qx80Var2;
                bVarI.Y();
                strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
                gzg0 gzg0Var16 = b590.a;
                d dVarH16 = h.h(dVar3, 0.0f, 22.0f, 1);
                zM = bVarI.M(strA);
                objY = bVarI.y();
                if (zM) {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                } else {
                    objY = new a55(strA, i7);
                    bVarI.r(objY);
                }
                int i1115 = i6 >> 6;
                bVar = bVarI;
                ihe0.a(xa80.b(dVarH16, false, (Function1) objY), qx80Var19, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i1115 & 112) | 12582912 | (i1115 & 896), 120);
                f5 = f7;
                f6 = f4;
                qx80Var3 = qx80Var19;
                j3 = jD;
                dVar2 = dVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                f5 = f3;
                f6 = f4;
                qx80Var3 = qx80Var2;
                j3 = j2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: b55
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                        return Unit.a;
                    }
                };
            }
        }
        j2 = j;
        i6 = i1114 | i12;
        i7 = 0;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i6 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i9 != 0) {
                    f7 = s490.e;
                } else {
                    f7 = f3;
                }
                if (i4 != 0) {
                    f4 = s490.d;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                    qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                    jD = g68.d(s490.c, bVarI);
                } else {
                    jD = j2;
                }
            } else {
                if (i8 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i9 != 0) {
                    f7 = s490.e;
                } else {
                    f7 = f3;
                }
                if (i4 != 0) {
                    f4 = s490.d;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                    qx80Var2 = ((uy80) bVarI.O(xy80.a)).e;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                    jD = g68.d(s490.c, bVarI);
                } else {
                    jD = j2;
                }
            }
            qx80 qx80Var110 = qx80Var2;
            bVarI.Y();
            strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
            gzg0 gzg0Var17 = b590.a;
            d dVarH17 = h.h(dVar3, 0.0f, 22.0f, 1);
            zM = bVarI.M(strA);
            objY = bVarI.y();
            if (zM) {
                objY = new a55(strA, i7);
                bVarI.r(objY);
            } else {
                objY = new a55(strA, i7);
                bVarI.r(objY);
            }
            int i1116 = i6 >> 6;
            bVar = bVarI;
            ihe0.a(xa80.b(dVarH17, false, (Function1) objY), qx80Var110, jD, 0L, 0.0f, 0.0f, null, pp8.b(-1039573072, new a(f7, f4), bVarI), bVar, (i1116 & 112) | 12582912 | (i1116 & 896), 120);
            f5 = f7;
            f6 = f4;
            qx80Var3 = qx80Var110;
            j3 = jD;
            dVar2 = dVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            f5 = f3;
            f6 = f4;
            qx80Var3 = qx80Var2;
            j3 = j2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.a(f5, f6, iA, i2, j3, qx80Var3, (a) obj, dVar2);
                    return Unit.a;
                }
            };
        }
    }
}
