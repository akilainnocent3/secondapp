package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class rg6 {

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ gaj<j78, androidx.compose.runtime.a, Integer, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gaj<? super j78, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar) {
            this.a = gajVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                int I = aVar2.I();
                ne00 ne00VarO = aVar2.o();
                d dVarC = c.c(aVar2, d.a.b);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar3);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, i78VarA, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                    j3c.a(I, aVar2, I, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                this.a.invoke(l78.a, aVar2, 6);
                aVar2.s();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d3 A[PHI: r1 r2 r3 r4
      0x00d3: PHI (r1v20 int) = (r1v13 int), (r1v22 int), (r1v23 int) binds: [B:91:0x00fa, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r2v18 qx80) = (r2v4 qx80), (r2v2 qx80), (r2v2 qx80) binds: [B:91:0x00fa, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r3v7 fg6) = (r3v4 fg6), (r3v2 fg6), (r3v2 fg6) binds: [B:91:0x00fa, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r4v8 jg6) = (r4v4 jg6), (r4v2 jg6), (r4v2 jg6) binds: [B:91:0x00fa, B:79:0x00cf, B:80:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00db  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0146  */
    /* JADX WARN: Code duplicated, block: B:97:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(final d dVar, qx80 qx80Var, fg6 fg6Var, jg6 jg6Var, l35 l35Var, final gaj<? super j78, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final qx80 qx80VarB;
        final fg6 fg6VarA;
        jg6 jg6Var2;
        l35 l35Var2;
        boolean z;
        final l35 l35Var3;
        b bVar;
        final jg6 jg6Var3;
        e eVarZ;
        qx80 qx80Var2;
        l35 l35Var4;
        jg6 jg6VarC;
        jg6 jg6Var4;
        int i4;
        jg6 jg6Var5;
        int i5;
        jg6 jg6Var6;
        jg6 jg6Var7;
        b bVarI = aVar.i(1359693790);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                qx80VarB = qx80Var;
                int i6 = bVarI.M(qx80VarB) ? 32 : 16;
                i3 |= i6;
            } else {
                qx80VarB = qx80Var;
            }
            i3 |= i6;
        } else {
            qx80VarB = qx80Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                fg6VarA = fg6Var;
                int i7 = bVarI.M(fg6VarA) ? 256 : 128;
                i3 |= i7;
            } else {
                fg6VarA = fg6Var;
            }
            i3 |= i7;
        } else {
            fg6VarA = fg6Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jg6Var7 = jg6Var;
                if (bVarI.M(jg6Var7)) {
                    jg6Var5 = jg6Var7;
                    i5 = 2048;
                    jg6Var6 = jg6Var7;
                }
                i3 |= i5;
                jg6Var2 = jg6Var6;
            } else {
                jg6Var5 = jg6Var;
            }
            jg6Var5 = jg6Var7;
            i5 = 1024;
            jg6Var6 = jg6Var5;
            i3 |= i5;
            jg6Var2 = jg6Var6;
        } else {
            jg6Var2 = jg6Var;
        }
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                l35Var2 = l35Var;
                i3 |= bVarI.M(l35Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            if ((196608 & i) == 0) {
                if (bVarI.A(gajVar)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i3 &= -897;
                    }
                    jg6Var2 = jg6Var2;
                    if ((i2 & 8) != 0) {
                        jg6VarC = gg6.c(63, 0.0f);
                        i3 &= -7169;
                    }
                    if (i8 != 0) {
                        jg6Var2 = jg6VarC;
                        qx80Var2 = qx80VarB;
                        l35Var4 = null;
                        jg6Var4 = jg6Var2;
                    }
                    bVarI.Y();
                    b bVar2 = bVarI;
                    ihe0.a(dVar, qx80Var2, fg6VarA.a, fg6VarA.b, 0.0f, ((g7f) jg6Var4.a(true, null, bVarI, ((i3 >> 3) & 896) | 54).getValue()).a, l35Var4, pp8.b(-97109725, new a(gajVar), bVarI), bVar2, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                    qx80VarB = qx80Var2;
                    l35Var3 = l35Var4;
                    jg6Var3 = jg6Var4;
                    bVar = bVar2;
                } else {
                    bVarI.G();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                jg6Var2 = jg6VarC;
                l35Var4 = l35Var2;
                qx80Var2 = qx80VarB;
                jg6Var4 = jg6Var2;
                bVarI.Y();
                b bVar3 = bVarI;
                ihe0.a(dVar, qx80Var2, fg6VarA.a, fg6VarA.b, 0.0f, ((g7f) jg6Var4.a(true, null, bVarI, ((i3 >> 3) & 896) | 54).getValue()).a, l35Var4, pp8.b(-97109725, new a(gajVar), bVarI), bVar3, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                qx80VarB = qx80Var2;
                l35Var3 = l35Var4;
                jg6Var3 = jg6Var4;
                bVar = bVar3;
            } else {
                b bVar4 = bVarI;
                bVar4.G();
                l35Var3 = l35Var2;
                jg6Var3 = jg6Var2;
                bVar = bVar4;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: pg6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.a(dVar, qx80VarB, fg6VarA, jg6Var3, l35Var3, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        l35Var2 = l35Var;
        if ((196608 & i) == 0) {
            if (bVarI.A(gajVar)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    qx80VarB = xy80.b(wlh.b, bVarI);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    fg6VarA = gg6.a(bVarI);
                    i3 &= -897;
                }
                jg6Var2 = jg6Var2;
                if ((i2 & 8) != 0) {
                    jg6VarC = gg6.c(63, 0.0f);
                    i3 &= -7169;
                }
                if (i8 != 0) {
                    jg6Var2 = jg6VarC;
                    qx80Var2 = qx80VarB;
                    l35Var4 = null;
                    jg6Var4 = jg6Var2;
                } else {
                    jg6Var2 = jg6VarC;
                    l35Var4 = l35Var2;
                    qx80Var2 = qx80VarB;
                    jg6Var4 = jg6Var2;
                }
            } else {
                if ((i2 & 2) != 0) {
                    qx80VarB = xy80.b(wlh.b, bVarI);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    fg6VarA = gg6.a(bVarI);
                    i3 &= -897;
                }
                jg6Var2 = jg6Var2;
                if ((i2 & 8) != 0) {
                    jg6VarC = gg6.c(63, 0.0f);
                    i3 &= -7169;
                }
                if (i8 != 0) {
                    jg6Var2 = jg6VarC;
                    qx80Var2 = qx80VarB;
                    l35Var4 = null;
                    jg6Var4 = jg6Var2;
                } else {
                    jg6Var2 = jg6VarC;
                    l35Var4 = l35Var2;
                    qx80Var2 = qx80VarB;
                    jg6Var4 = jg6Var2;
                }
            }
            bVarI.Y();
            b bVar5 = bVarI;
            ihe0.a(dVar, qx80Var2, fg6VarA.a, fg6VarA.b, 0.0f, ((g7f) jg6Var4.a(true, null, bVarI, ((i3 >> 3) & 896) | 54).getValue()).a, l35Var4, pp8.b(-97109725, new a(gajVar), bVarI), bVar5, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
            qx80VarB = qx80Var2;
            l35Var3 = l35Var4;
            jg6Var3 = jg6Var4;
            bVar = bVar5;
        } else {
            b bVar6 = bVarI;
            bVar6.G();
            l35Var3 = l35Var2;
            jg6Var3 = jg6Var2;
            bVar = bVar6;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pg6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rg6.a(dVar, qx80VarB, fg6VarA, jg6Var3, l35Var3, gajVar, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x013a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x0152  */
    /* JADX WARN: Code duplicated, block: B:120:0x0155  */
    /* JADX WARN: Code duplicated, block: B:121:0x015e  */
    /* JADX WARN: Code duplicated, block: B:124:0x016b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:134:0x0199  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:138:0x01df  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    public static final void b(final Function0 function0, d dVar, boolean z, qx80 qx80Var, fg6 fg6Var, jg6 jg6Var, l35 l35Var, psw pswVar, final op8 op8Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        final qx80 qx80VarB;
        final fg6 fg6VarA;
        jg6 jg6Var2;
        int i5;
        l35 l35Var2;
        int i6;
        int i7;
        psw pswVar2;
        int i8;
        boolean z2;
        final d dVar2;
        final boolean z3;
        final l35 l35Var3;
        final psw pswVar3;
        b bVar;
        final jg6 jg6Var3;
        e eVarZ;
        d dVar3;
        jg6 jg6VarC;
        d dVar4;
        qx80 qx80Var2;
        l35 l35Var4;
        int i9;
        psw pswVar4;
        boolean z4;
        jg6 jg6Var4;
        psw pswVar5;
        long j;
        long j2;
        Object objY;
        int i10;
        jg6 jg6Var5;
        int i11;
        jg6 jg6Var6;
        jg6 jg6Var7;
        b bVarI = aVar.i(2136075085);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                i3 |= bVarI.M(dVar) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    qx80VarB = qx80Var;
                    int i13 = bVarI.M(qx80VarB) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    qx80VarB = qx80Var;
                }
                i4 |= i13;
            } else {
                qx80VarB = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    fg6VarA = fg6Var;
                    int i14 = bVarI.M(fg6VarA) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                    i4 |= i14;
                } else {
                    fg6VarA = fg6Var;
                }
                i4 |= i14;
            } else {
                fg6VarA = fg6Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jg6Var7 = jg6Var;
                    if (bVarI.M(jg6Var7)) {
                        jg6Var5 = jg6Var7;
                        i11 = 131072;
                        jg6Var6 = jg6Var7;
                    }
                    i4 |= i11;
                    jg6Var2 = jg6Var6;
                } else {
                    jg6Var5 = jg6Var;
                }
                jg6Var5 = jg6Var7;
                i11 = 65536;
                jg6Var6 = jg6Var5;
                i4 |= i11;
                jg6Var2 = jg6Var6;
            } else {
                jg6Var2 = jg6Var;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    l35Var2 = l35Var;
                    if (bVarI.M(l35Var2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        pswVar2 = pswVar;
                        if (bVarI.M(pswVar2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i4 |= i8;
                    }
                    if ((100663296 & i) == 0) {
                        if (bVarI.A(op8Var)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i4 |= i10;
                    }
                    if ((38347923 & i4) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bVarI.q(i4 & 1, z2)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i12 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if ((i2 & 8) != 0) {
                                qx80VarB = xy80.b(wlh.b, bVarI);
                                i4 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                fg6VarA = gg6.a(bVarI);
                                i4 &= -57345;
                            }
                            jg6VarC = jg6Var2;
                            if ((i2 & 32) != 0) {
                                i4 &= -458753;
                                jg6VarC = gg6.c(63, 0.0f);
                            }
                            if (i5 != 0) {
                                l35Var2 = null;
                            }
                            if (i7 != 0) {
                                dVar4 = dVar3;
                                l35Var4 = l35Var2;
                                z4 = true;
                                i9 = i4;
                                pswVar4 = null;
                                qx80Var2 = qx80VarB;
                                jg6Var4 = jg6VarC;
                            } else {
                                dVar4 = dVar3;
                                qx80Var2 = qx80VarB;
                                l35Var4 = l35Var2;
                                i9 = i4;
                                pswVar4 = pswVar2;
                                z4 = true;
                                jg6Var4 = jg6VarC;
                            }
                        } else {
                            bVarI.G();
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i4 &= -458753;
                            }
                            dVar4 = dVar;
                            i9 = i4;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            pswVar4 = pswVar2;
                            z4 = z;
                            jg6Var4 = jg6Var2;
                        }
                        bVarI.Y();
                        if (pswVar4 == null) {
                            bVarI.N(1577885006);
                            objY = bVarI.y();
                            if (objY == androidx.compose.runtime.a.C0041a.a) {
                                objY = rzk.a(bVarI);
                            }
                            pswVar5 = (psw) objY;
                            bVarI.X(false);
                        } else {
                            bVarI.N(-226195799);
                            bVarI.X(false);
                            pswVar5 = pswVar4;
                        }
                        if (z4) {
                            j = fg6VarA.a;
                        } else {
                            j = fg6VarA.c;
                        }
                        long j3 = j;
                        if (z4) {
                            j2 = fg6VarA.b;
                        } else {
                            j2 = fg6VarA.d;
                        }
                        b bVar2 = bVarI;
                        ihe0.c(function0, dVar4, z4, qx80Var2, j3, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar2, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                        pswVar3 = pswVar4;
                        dVar2 = dVar4;
                        z3 = z4;
                        qx80VarB = qx80Var2;
                        l35Var3 = l35Var4;
                        jg6Var3 = jg6Var4;
                        bVar = bVar2;
                    } else {
                        b bVar3 = bVarI;
                        bVar3.G();
                        dVar2 = dVar;
                        z3 = z;
                        l35Var3 = l35Var2;
                        pswVar3 = pswVar2;
                        jg6Var3 = jg6Var2;
                        bVar = bVar3;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: qg6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i4 |= 12582912;
                pswVar2 = pswVar;
                if ((100663296 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                if ((38347923 & i4) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i4 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if ((i2 & 8) != 0) {
                            qx80VarB = xy80.b(wlh.b, bVarI);
                            i4 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            fg6VarA = gg6.a(bVarI);
                            i4 &= -57345;
                        }
                        jg6VarC = jg6Var2;
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            jg6VarC = gg6.c(63, 0.0f);
                        }
                        if (i5 != 0) {
                            l35Var2 = null;
                        }
                        if (i7 != 0) {
                            dVar4 = dVar3;
                            l35Var4 = l35Var2;
                            z4 = true;
                            i9 = i4;
                            pswVar4 = null;
                            qx80Var2 = qx80VarB;
                            jg6Var4 = jg6VarC;
                        } else {
                            dVar4 = dVar3;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            i9 = i4;
                            pswVar4 = pswVar2;
                            z4 = true;
                            jg6Var4 = jg6VarC;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if ((i2 & 8) != 0) {
                            qx80VarB = xy80.b(wlh.b, bVarI);
                            i4 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            fg6VarA = gg6.a(bVarI);
                            i4 &= -57345;
                        }
                        jg6VarC = jg6Var2;
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            jg6VarC = gg6.c(63, 0.0f);
                        }
                        if (i5 != 0) {
                            l35Var2 = null;
                        }
                        if (i7 != 0) {
                            dVar4 = dVar3;
                            l35Var4 = l35Var2;
                            z4 = true;
                            i9 = i4;
                            pswVar4 = null;
                            qx80Var2 = qx80VarB;
                            jg6Var4 = jg6VarC;
                        } else {
                            dVar4 = dVar3;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            i9 = i4;
                            pswVar4 = pswVar2;
                            z4 = true;
                            jg6Var4 = jg6VarC;
                        }
                    }
                    bVarI.Y();
                    if (pswVar4 == null) {
                        bVarI.N(1577885006);
                        objY = bVarI.y();
                        if (objY == androidx.compose.runtime.a.C0041a.a) {
                            objY = rzk.a(bVarI);
                        }
                        pswVar5 = (psw) objY;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-226195799);
                        bVarI.X(false);
                        pswVar5 = pswVar4;
                    }
                    if (z4) {
                        j = fg6VarA.a;
                    } else {
                        j = fg6VarA.c;
                    }
                    long j4 = j;
                    if (z4) {
                        j2 = fg6VarA.b;
                    } else {
                        j2 = fg6VarA.d;
                    }
                    b bVar4 = bVarI;
                    ihe0.c(function0, dVar4, z4, qx80Var2, j4, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar4, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                    pswVar3 = pswVar4;
                    dVar2 = dVar4;
                    z3 = z4;
                    qx80VarB = qx80Var2;
                    l35Var3 = l35Var4;
                    jg6Var3 = jg6Var4;
                    bVar = bVar4;
                } else {
                    b bVar5 = bVarI;
                    bVar5.G();
                    dVar2 = dVar;
                    z3 = z;
                    l35Var3 = l35Var2;
                    pswVar3 = pswVar2;
                    jg6Var3 = jg6Var2;
                    bVar = bVar5;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: qg6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            l35Var2 = l35Var;
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    pswVar2 = pswVar;
                    if (bVarI.M(pswVar2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((100663296 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                if ((38347923 & i4) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i4 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if ((i2 & 8) != 0) {
                            qx80VarB = xy80.b(wlh.b, bVarI);
                            i4 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            fg6VarA = gg6.a(bVarI);
                            i4 &= -57345;
                        }
                        jg6VarC = jg6Var2;
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            jg6VarC = gg6.c(63, 0.0f);
                        }
                        if (i5 != 0) {
                            l35Var2 = null;
                        }
                        if (i7 != 0) {
                            dVar4 = dVar3;
                            l35Var4 = l35Var2;
                            z4 = true;
                            i9 = i4;
                            pswVar4 = null;
                            qx80Var2 = qx80VarB;
                            jg6Var4 = jg6VarC;
                        } else {
                            dVar4 = dVar3;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            i9 = i4;
                            pswVar4 = pswVar2;
                            z4 = true;
                            jg6Var4 = jg6VarC;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if ((i2 & 8) != 0) {
                            qx80VarB = xy80.b(wlh.b, bVarI);
                            i4 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            fg6VarA = gg6.a(bVarI);
                            i4 &= -57345;
                        }
                        jg6VarC = jg6Var2;
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            jg6VarC = gg6.c(63, 0.0f);
                        }
                        if (i5 != 0) {
                            l35Var2 = null;
                        }
                        if (i7 != 0) {
                            dVar4 = dVar3;
                            l35Var4 = l35Var2;
                            z4 = true;
                            i9 = i4;
                            pswVar4 = null;
                            qx80Var2 = qx80VarB;
                            jg6Var4 = jg6VarC;
                        } else {
                            dVar4 = dVar3;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            i9 = i4;
                            pswVar4 = pswVar2;
                            z4 = true;
                            jg6Var4 = jg6VarC;
                        }
                    }
                    bVarI.Y();
                    if (pswVar4 == null) {
                        bVarI.N(1577885006);
                        objY = bVarI.y();
                        if (objY == androidx.compose.runtime.a.C0041a.a) {
                            objY = rzk.a(bVarI);
                        }
                        pswVar5 = (psw) objY;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-226195799);
                        bVarI.X(false);
                        pswVar5 = pswVar4;
                    }
                    if (z4) {
                        j = fg6VarA.a;
                    } else {
                        j = fg6VarA.c;
                    }
                    long j5 = j;
                    if (z4) {
                        j2 = fg6VarA.b;
                    } else {
                        j2 = fg6VarA.d;
                    }
                    b bVar6 = bVarI;
                    ihe0.c(function0, dVar4, z4, qx80Var2, j5, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar6, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                    pswVar3 = pswVar4;
                    dVar2 = dVar4;
                    z3 = z4;
                    qx80VarB = qx80Var2;
                    l35Var3 = l35Var4;
                    jg6Var3 = jg6Var4;
                    bVar = bVar6;
                } else {
                    b bVar7 = bVarI;
                    bVar7.G();
                    dVar2 = dVar;
                    z3 = z;
                    l35Var3 = l35Var2;
                    pswVar3 = pswVar2;
                    jg6Var3 = jg6Var2;
                    bVar = bVar7;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: qg6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 12582912;
            pswVar2 = pswVar;
            if ((100663296 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i4 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i4 &= -57345;
                    }
                    jg6VarC = jg6Var2;
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        jg6VarC = gg6.c(63, 0.0f);
                    }
                    if (i5 != 0) {
                        l35Var2 = null;
                    }
                    if (i7 != 0) {
                        dVar4 = dVar3;
                        l35Var4 = l35Var2;
                        z4 = true;
                        i9 = i4;
                        pswVar4 = null;
                        qx80Var2 = qx80VarB;
                        jg6Var4 = jg6VarC;
                    } else {
                        dVar4 = dVar3;
                        qx80Var2 = qx80VarB;
                        l35Var4 = l35Var2;
                        i9 = i4;
                        pswVar4 = pswVar2;
                        z4 = true;
                        jg6Var4 = jg6VarC;
                    }
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i4 &= -57345;
                    }
                    jg6VarC = jg6Var2;
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        jg6VarC = gg6.c(63, 0.0f);
                    }
                    if (i5 != 0) {
                        l35Var2 = null;
                    }
                    if (i7 != 0) {
                        dVar4 = dVar3;
                        l35Var4 = l35Var2;
                        z4 = true;
                        i9 = i4;
                        pswVar4 = null;
                        qx80Var2 = qx80VarB;
                        jg6Var4 = jg6VarC;
                    } else {
                        dVar4 = dVar3;
                        qx80Var2 = qx80VarB;
                        l35Var4 = l35Var2;
                        i9 = i4;
                        pswVar4 = pswVar2;
                        z4 = true;
                        jg6Var4 = jg6VarC;
                    }
                }
                bVarI.Y();
                if (pswVar4 == null) {
                    bVarI.N(1577885006);
                    objY = bVarI.y();
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = rzk.a(bVarI);
                    }
                    pswVar5 = (psw) objY;
                    bVarI.X(false);
                } else {
                    bVarI.N(-226195799);
                    bVarI.X(false);
                    pswVar5 = pswVar4;
                }
                if (z4) {
                    j = fg6VarA.a;
                } else {
                    j = fg6VarA.c;
                }
                long j6 = j;
                if (z4) {
                    j2 = fg6VarA.b;
                } else {
                    j2 = fg6VarA.d;
                }
                b bVar8 = bVarI;
                ihe0.c(function0, dVar4, z4, qx80Var2, j6, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar8, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                pswVar3 = pswVar4;
                dVar2 = dVar4;
                z3 = z4;
                qx80VarB = qx80Var2;
                l35Var3 = l35Var4;
                jg6Var3 = jg6Var4;
                bVar = bVar8;
            } else {
                b bVar9 = bVarI;
                bVar9.G();
                dVar2 = dVar;
                z3 = z;
                l35Var3 = l35Var2;
                pswVar3 = pswVar2;
                jg6Var3 = jg6Var2;
                bVar = bVar9;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: qg6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                qx80VarB = qx80Var;
                if (bVarI.M(qx80VarB)) {
                }
                i4 |= i13;
            } else {
                qx80VarB = qx80Var;
            }
            i4 |= i13;
        } else {
            qx80VarB = qx80Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                fg6VarA = fg6Var;
                if (bVarI.M(fg6VarA)) {
                }
                i4 |= i14;
            } else {
                fg6VarA = fg6Var;
            }
            i4 |= i14;
        } else {
            fg6VarA = fg6Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jg6Var7 = jg6Var;
                if (bVarI.M(jg6Var7)) {
                    jg6Var5 = jg6Var7;
                    i11 = 131072;
                    jg6Var6 = jg6Var7;
                }
                i4 |= i11;
                jg6Var2 = jg6Var6;
            } else {
                jg6Var5 = jg6Var;
            }
            jg6Var5 = jg6Var7;
            i11 = 65536;
            jg6Var6 = jg6Var5;
            i4 |= i11;
            jg6Var2 = jg6Var6;
        } else {
            jg6Var2 = jg6Var;
        }
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                l35Var2 = l35Var;
                if (bVarI.M(l35Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    pswVar2 = pswVar;
                    if (bVarI.M(pswVar2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((100663296 & i) == 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i4 |= i10;
                }
                if ((38347923 & i4) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVarI.q(i4 & 1, z2)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if ((i2 & 8) != 0) {
                            qx80VarB = xy80.b(wlh.b, bVarI);
                            i4 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            fg6VarA = gg6.a(bVarI);
                            i4 &= -57345;
                        }
                        jg6VarC = jg6Var2;
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            jg6VarC = gg6.c(63, 0.0f);
                        }
                        if (i5 != 0) {
                            l35Var2 = null;
                        }
                        if (i7 != 0) {
                            dVar4 = dVar3;
                            l35Var4 = l35Var2;
                            z4 = true;
                            i9 = i4;
                            pswVar4 = null;
                            qx80Var2 = qx80VarB;
                            jg6Var4 = jg6VarC;
                        } else {
                            dVar4 = dVar3;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            i9 = i4;
                            pswVar4 = pswVar2;
                            z4 = true;
                            jg6Var4 = jg6VarC;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if ((i2 & 8) != 0) {
                            qx80VarB = xy80.b(wlh.b, bVarI);
                            i4 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            fg6VarA = gg6.a(bVarI);
                            i4 &= -57345;
                        }
                        jg6VarC = jg6Var2;
                        if ((i2 & 32) != 0) {
                            i4 &= -458753;
                            jg6VarC = gg6.c(63, 0.0f);
                        }
                        if (i5 != 0) {
                            l35Var2 = null;
                        }
                        if (i7 != 0) {
                            dVar4 = dVar3;
                            l35Var4 = l35Var2;
                            z4 = true;
                            i9 = i4;
                            pswVar4 = null;
                            qx80Var2 = qx80VarB;
                            jg6Var4 = jg6VarC;
                        } else {
                            dVar4 = dVar3;
                            qx80Var2 = qx80VarB;
                            l35Var4 = l35Var2;
                            i9 = i4;
                            pswVar4 = pswVar2;
                            z4 = true;
                            jg6Var4 = jg6VarC;
                        }
                    }
                    bVarI.Y();
                    if (pswVar4 == null) {
                        bVarI.N(1577885006);
                        objY = bVarI.y();
                        if (objY == androidx.compose.runtime.a.C0041a.a) {
                            objY = rzk.a(bVarI);
                        }
                        pswVar5 = (psw) objY;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-226195799);
                        bVarI.X(false);
                        pswVar5 = pswVar4;
                    }
                    if (z4) {
                        j = fg6VarA.a;
                    } else {
                        j = fg6VarA.c;
                    }
                    long j7 = j;
                    if (z4) {
                        j2 = fg6VarA.b;
                    } else {
                        j2 = fg6VarA.d;
                    }
                    b bVar10 = bVarI;
                    ihe0.c(function0, dVar4, z4, qx80Var2, j7, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar10, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                    pswVar3 = pswVar4;
                    dVar2 = dVar4;
                    z3 = z4;
                    qx80VarB = qx80Var2;
                    l35Var3 = l35Var4;
                    jg6Var3 = jg6Var4;
                    bVar = bVar10;
                } else {
                    b bVar11 = bVarI;
                    bVar11.G();
                    dVar2 = dVar;
                    z3 = z;
                    l35Var3 = l35Var2;
                    pswVar3 = pswVar2;
                    jg6Var3 = jg6Var2;
                    bVar = bVar11;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: qg6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 12582912;
            pswVar2 = pswVar;
            if ((100663296 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i4 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i4 &= -57345;
                    }
                    jg6VarC = jg6Var2;
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        jg6VarC = gg6.c(63, 0.0f);
                    }
                    if (i5 != 0) {
                        l35Var2 = null;
                    }
                    if (i7 != 0) {
                        dVar4 = dVar3;
                        l35Var4 = l35Var2;
                        z4 = true;
                        i9 = i4;
                        pswVar4 = null;
                        qx80Var2 = qx80VarB;
                        jg6Var4 = jg6VarC;
                    } else {
                        dVar4 = dVar3;
                        qx80Var2 = qx80VarB;
                        l35Var4 = l35Var2;
                        i9 = i4;
                        pswVar4 = pswVar2;
                        z4 = true;
                        jg6Var4 = jg6VarC;
                    }
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i4 &= -57345;
                    }
                    jg6VarC = jg6Var2;
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        jg6VarC = gg6.c(63, 0.0f);
                    }
                    if (i5 != 0) {
                        l35Var2 = null;
                    }
                    if (i7 != 0) {
                        dVar4 = dVar3;
                        l35Var4 = l35Var2;
                        z4 = true;
                        i9 = i4;
                        pswVar4 = null;
                        qx80Var2 = qx80VarB;
                        jg6Var4 = jg6VarC;
                    } else {
                        dVar4 = dVar3;
                        qx80Var2 = qx80VarB;
                        l35Var4 = l35Var2;
                        i9 = i4;
                        pswVar4 = pswVar2;
                        z4 = true;
                        jg6Var4 = jg6VarC;
                    }
                }
                bVarI.Y();
                if (pswVar4 == null) {
                    bVarI.N(1577885006);
                    objY = bVarI.y();
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = rzk.a(bVarI);
                    }
                    pswVar5 = (psw) objY;
                    bVarI.X(false);
                } else {
                    bVarI.N(-226195799);
                    bVarI.X(false);
                    pswVar5 = pswVar4;
                }
                if (z4) {
                    j = fg6VarA.a;
                } else {
                    j = fg6VarA.c;
                }
                long j8 = j;
                if (z4) {
                    j2 = fg6VarA.b;
                } else {
                    j2 = fg6VarA.d;
                }
                b bVar12 = bVarI;
                ihe0.c(function0, dVar4, z4, qx80Var2, j8, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar12, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                pswVar3 = pswVar4;
                dVar2 = dVar4;
                z3 = z4;
                qx80VarB = qx80Var2;
                l35Var3 = l35Var4;
                jg6Var3 = jg6Var4;
                bVar = bVar12;
            } else {
                b bVar13 = bVarI;
                bVar13.G();
                dVar2 = dVar;
                z3 = z;
                l35Var3 = l35Var2;
                pswVar3 = pswVar2;
                jg6Var3 = jg6Var2;
                bVar = bVar13;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: qg6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 1572864;
        l35Var2 = l35Var;
        i7 = i2 & 128;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                pswVar2 = pswVar;
                if (bVarI.M(pswVar2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((100663296 & i) == 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i4 |= i10;
            }
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i4 & 1, z2)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i4 &= -57345;
                    }
                    jg6VarC = jg6Var2;
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        jg6VarC = gg6.c(63, 0.0f);
                    }
                    if (i5 != 0) {
                        l35Var2 = null;
                    }
                    if (i7 != 0) {
                        dVar4 = dVar3;
                        l35Var4 = l35Var2;
                        z4 = true;
                        i9 = i4;
                        pswVar4 = null;
                        qx80Var2 = qx80VarB;
                        jg6Var4 = jg6VarC;
                    } else {
                        dVar4 = dVar3;
                        qx80Var2 = qx80VarB;
                        l35Var4 = l35Var2;
                        i9 = i4;
                        pswVar4 = pswVar2;
                        z4 = true;
                        jg6Var4 = jg6VarC;
                    }
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if ((i2 & 8) != 0) {
                        qx80VarB = xy80.b(wlh.b, bVarI);
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        fg6VarA = gg6.a(bVarI);
                        i4 &= -57345;
                    }
                    jg6VarC = jg6Var2;
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                        jg6VarC = gg6.c(63, 0.0f);
                    }
                    if (i5 != 0) {
                        l35Var2 = null;
                    }
                    if (i7 != 0) {
                        dVar4 = dVar3;
                        l35Var4 = l35Var2;
                        z4 = true;
                        i9 = i4;
                        pswVar4 = null;
                        qx80Var2 = qx80VarB;
                        jg6Var4 = jg6VarC;
                    } else {
                        dVar4 = dVar3;
                        qx80Var2 = qx80VarB;
                        l35Var4 = l35Var2;
                        i9 = i4;
                        pswVar4 = pswVar2;
                        z4 = true;
                        jg6Var4 = jg6VarC;
                    }
                }
                bVarI.Y();
                if (pswVar4 == null) {
                    bVarI.N(1577885006);
                    objY = bVarI.y();
                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = rzk.a(bVarI);
                    }
                    pswVar5 = (psw) objY;
                    bVarI.X(false);
                } else {
                    bVarI.N(-226195799);
                    bVarI.X(false);
                    pswVar5 = pswVar4;
                }
                if (z4) {
                    j = fg6VarA.a;
                } else {
                    j = fg6VarA.c;
                }
                long j9 = j;
                if (z4) {
                    j2 = fg6VarA.b;
                } else {
                    j2 = fg6VarA.d;
                }
                b bVar14 = bVarI;
                ihe0.c(function0, dVar4, z4, qx80Var2, j9, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar14, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
                pswVar3 = pswVar4;
                dVar2 = dVar4;
                z3 = z4;
                qx80VarB = qx80Var2;
                l35Var3 = l35Var4;
                jg6Var3 = jg6Var4;
                bVar = bVar14;
            } else {
                b bVar15 = bVarI;
                bVar15.G();
                dVar2 = dVar;
                z3 = z;
                l35Var3 = l35Var2;
                pswVar3 = pswVar2;
                jg6Var3 = jg6Var2;
                bVar = bVar15;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: qg6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        pswVar2 = pswVar;
        if ((100663296 & i) == 0) {
            if (bVarI.A(op8Var)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i4 |= i10;
        }
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i4 & 1, z2)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if ((i2 & 8) != 0) {
                    qx80VarB = xy80.b(wlh.b, bVarI);
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    fg6VarA = gg6.a(bVarI);
                    i4 &= -57345;
                }
                jg6VarC = jg6Var2;
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                    jg6VarC = gg6.c(63, 0.0f);
                }
                if (i5 != 0) {
                    l35Var2 = null;
                }
                if (i7 != 0) {
                    dVar4 = dVar3;
                    l35Var4 = l35Var2;
                    z4 = true;
                    i9 = i4;
                    pswVar4 = null;
                    qx80Var2 = qx80VarB;
                    jg6Var4 = jg6VarC;
                } else {
                    dVar4 = dVar3;
                    qx80Var2 = qx80VarB;
                    l35Var4 = l35Var2;
                    i9 = i4;
                    pswVar4 = pswVar2;
                    z4 = true;
                    jg6Var4 = jg6VarC;
                }
            } else {
                if (i12 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if ((i2 & 8) != 0) {
                    qx80VarB = xy80.b(wlh.b, bVarI);
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    fg6VarA = gg6.a(bVarI);
                    i4 &= -57345;
                }
                jg6VarC = jg6Var2;
                if ((i2 & 32) != 0) {
                    i4 &= -458753;
                    jg6VarC = gg6.c(63, 0.0f);
                }
                if (i5 != 0) {
                    l35Var2 = null;
                }
                if (i7 != 0) {
                    dVar4 = dVar3;
                    l35Var4 = l35Var2;
                    z4 = true;
                    i9 = i4;
                    pswVar4 = null;
                    qx80Var2 = qx80VarB;
                    jg6Var4 = jg6VarC;
                } else {
                    dVar4 = dVar3;
                    qx80Var2 = qx80VarB;
                    l35Var4 = l35Var2;
                    i9 = i4;
                    pswVar4 = pswVar2;
                    z4 = true;
                    jg6Var4 = jg6VarC;
                }
            }
            bVarI.Y();
            if (pswVar4 == null) {
                bVarI.N(1577885006);
                objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = rzk.a(bVarI);
                }
                pswVar5 = (psw) objY;
                bVarI.X(false);
            } else {
                bVarI.N(-226195799);
                bVarI.X(false);
                pswVar5 = pswVar4;
            }
            if (z4) {
                j = fg6VarA.a;
            } else {
                j = fg6VarA.c;
            }
            long j10 = j;
            if (z4) {
                j2 = fg6VarA.b;
            } else {
                j2 = fg6VarA.d;
            }
            b bVar16 = bVarI;
            ihe0.c(function0, dVar4, z4, qx80Var2, j10, j2, 0.0f, ((g7f) jg6Var4.a(z4, pswVar5, bVarI, ((i9 >> 6) & 14) | ((i9 >> 9) & 896)).getValue()).a, l35Var4, pswVar5, pp8.b(-1347531112, new sg6(op8Var), bVarI), bVar16, (i9 & 8190) | ((i9 << 6) & 234881024), 64);
            pswVar3 = pswVar4;
            dVar2 = dVar4;
            z3 = z4;
            qx80VarB = qx80Var2;
            l35Var3 = l35Var4;
            jg6Var3 = jg6Var4;
            bVar = bVar16;
        } else {
            b bVar17 = bVarI;
            bVar17.G();
            dVar2 = dVar;
            z3 = z;
            l35Var3 = l35Var2;
            pswVar3 = pswVar2;
            jg6Var3 = jg6Var2;
            bVar = bVar17;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qg6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rg6.b(function0, dVar2, z3, qx80VarB, fg6VarA, jg6Var3, l35Var3, pswVar3, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0129  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void c(final d dVar, qx80 qx80Var, fg6 fg6Var, jg6 jg6Var, final op8 op8Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        qx80 qx80VarB;
        fg6 fg6Var2;
        jg6 jg6Var2;
        int i4;
        boolean z;
        final qx80 qx80Var2;
        final fg6 fg6Var3;
        final jg6 jg6Var3;
        e eVarZ;
        fg6 fg6Var4;
        qx80 qx80Var3;
        jg6 jg6VarD;
        fg6 fg6Var5;
        d68 d68Var;
        fg6 fg6Var6;
        b bVarI = aVar.i(-1464672362);
        if ((i & 6) == 0) {
            i3 = i | (bVarI.M(dVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            qx80VarB = qx80Var;
            int i5 = bVarI.M(qx80VarB) ? 32 : 16;
            int i6 = i3 | i5;
            if ((i2 & 4) == 0) {
                fg6Var2 = fg6Var;
                int i7 = bVarI.M(fg6Var2) ? 256 : 128;
                int i8 = i6 | i7;
                if ((i2 & 8) == 0) {
                    jg6Var2 = jg6Var;
                    int i9 = bVarI.M(jg6Var2) ? 2048 : 1024;
                    i4 = i8 | i9;
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i4 & 1, z)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if ((i2 & 2) != 0) {
                                qx80VarB = xy80.b(gwf.c, bVarI);
                                i4 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                d68Var = (d68) bVarI.O(g68.a);
                                fg6Var6 = d68Var.a0;
                                if (fg6Var6 == null) {
                                    e68 e68Var = gwf.a;
                                    long jC = g68.c(d68Var, e68Var);
                                    long jA = g68.a(d68Var, g68.c(d68Var, e68Var));
                                    e68 e68Var2 = gwf.d;
                                    fg6Var4 = new fg6(jC, jA, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var2)), g68.c(d68Var, e68Var2)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var))));
                                    d68Var.a0 = fg6Var4;
                                } else {
                                    fg6Var4 = fg6Var6;
                                }
                                i4 &= -897;
                            } else {
                                bVarI = bVarI;
                                fg6Var4 = fg6Var2;
                            }
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                                jg6VarD = gg6.d(63);
                                fg6Var5 = fg6Var4;
                            } else {
                                qx80Var3 = qx80VarB;
                                jg6VarD = jg6Var2;
                                fg6Var5 = fg6Var4;
                            }
                            bVarI.Y();
                            bVarI = bVarI;
                            a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                            qx80Var2 = qx80Var3;
                            fg6Var3 = fg6Var5;
                            jg6Var3 = jg6VarD;
                        } else {
                            bVarI.G();
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i4 &= -7169;
                            }
                            jg6VarD = jg6Var2;
                            bVarI = bVarI;
                            fg6Var5 = fg6Var2;
                        }
                        qx80Var3 = qx80VarB;
                        bVarI.Y();
                        bVarI = bVarI;
                        a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                        qx80Var2 = qx80Var3;
                        fg6Var3 = fg6Var5;
                        jg6Var3 = jg6VarD;
                    } else {
                        bVarI.G();
                        qx80Var2 = qx80VarB;
                        fg6Var3 = fg6Var2;
                        jg6Var3 = jg6Var2;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: og6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                jg6Var2 = jg6Var;
                i4 = i8 | i9;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            qx80VarB = xy80.b(gwf.c, bVarI);
                            i4 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            fg6Var6 = d68Var.a0;
                            if (fg6Var6 == null) {
                                e68 e68Var3 = gwf.a;
                                long jC2 = g68.c(d68Var, e68Var3);
                                long jA2 = g68.a(d68Var, g68.c(d68Var, e68Var3));
                                e68 e68Var4 = gwf.d;
                                fg6Var4 = new fg6(jC2, jA2, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var4)), g68.c(d68Var, e68Var4)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var3))));
                                d68Var.a0 = fg6Var4;
                            } else {
                                fg6Var4 = fg6Var6;
                            }
                            i4 &= -897;
                        } else {
                            bVarI = bVarI;
                            fg6Var4 = fg6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            jg6VarD = gg6.d(63);
                            fg6Var5 = fg6Var4;
                            qx80Var3 = qx80VarB;
                        } else {
                            qx80Var3 = qx80VarB;
                            jg6VarD = jg6Var2;
                            fg6Var5 = fg6Var4;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            qx80VarB = xy80.b(gwf.c, bVarI);
                            i4 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            fg6Var6 = d68Var.a0;
                            if (fg6Var6 == null) {
                                e68 e68Var5 = gwf.a;
                                long jC3 = g68.c(d68Var, e68Var5);
                                long jA3 = g68.a(d68Var, g68.c(d68Var, e68Var5));
                                e68 e68Var6 = gwf.d;
                                fg6Var4 = new fg6(jC3, jA3, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var6)), g68.c(d68Var, e68Var6)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var5))));
                                d68Var.a0 = fg6Var4;
                            } else {
                                fg6Var4 = fg6Var6;
                            }
                            i4 &= -897;
                        } else {
                            bVarI = bVarI;
                            fg6Var4 = fg6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            jg6VarD = gg6.d(63);
                            fg6Var5 = fg6Var4;
                            qx80Var3 = qx80VarB;
                        } else {
                            qx80Var3 = qx80VarB;
                            jg6VarD = jg6Var2;
                            fg6Var5 = fg6Var4;
                        }
                    }
                    bVarI.Y();
                    bVarI = bVarI;
                    a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                    qx80Var2 = qx80Var3;
                    fg6Var3 = fg6Var5;
                    jg6Var3 = jg6VarD;
                } else {
                    bVarI.G();
                    qx80Var2 = qx80VarB;
                    fg6Var3 = fg6Var2;
                    jg6Var3 = jg6Var2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: og6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            fg6Var2 = fg6Var;
            int i10 = i6 | i7;
            if ((i2 & 8) == 0) {
                jg6Var2 = jg6Var;
                if (bVarI.M(jg6Var2)) {
                }
                i4 = i10 | i9;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            qx80VarB = xy80.b(gwf.c, bVarI);
                            i4 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            fg6Var6 = d68Var.a0;
                            if (fg6Var6 == null) {
                                e68 e68Var7 = gwf.a;
                                long jC4 = g68.c(d68Var, e68Var7);
                                long jA4 = g68.a(d68Var, g68.c(d68Var, e68Var7));
                                e68 e68Var8 = gwf.d;
                                fg6Var4 = new fg6(jC4, jA4, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var8)), g68.c(d68Var, e68Var8)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var7))));
                                d68Var.a0 = fg6Var4;
                            } else {
                                fg6Var4 = fg6Var6;
                            }
                            i4 &= -897;
                        } else {
                            bVarI = bVarI;
                            fg6Var4 = fg6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            jg6VarD = gg6.d(63);
                            fg6Var5 = fg6Var4;
                            qx80Var3 = qx80VarB;
                        } else {
                            qx80Var3 = qx80VarB;
                            jg6VarD = jg6Var2;
                            fg6Var5 = fg6Var4;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            qx80VarB = xy80.b(gwf.c, bVarI);
                            i4 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            fg6Var6 = d68Var.a0;
                            if (fg6Var6 == null) {
                                e68 e68Var9 = gwf.a;
                                long jC5 = g68.c(d68Var, e68Var9);
                                long jA5 = g68.a(d68Var, g68.c(d68Var, e68Var9));
                                e68 e68Var10 = gwf.d;
                                fg6Var4 = new fg6(jC5, jA5, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var10)), g68.c(d68Var, e68Var10)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var9))));
                                d68Var.a0 = fg6Var4;
                            } else {
                                fg6Var4 = fg6Var6;
                            }
                            i4 &= -897;
                        } else {
                            bVarI = bVarI;
                            fg6Var4 = fg6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            jg6VarD = gg6.d(63);
                            fg6Var5 = fg6Var4;
                            qx80Var3 = qx80VarB;
                        } else {
                            qx80Var3 = qx80VarB;
                            jg6VarD = jg6Var2;
                            fg6Var5 = fg6Var4;
                        }
                    }
                    bVarI.Y();
                    bVarI = bVarI;
                    a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                    qx80Var2 = qx80Var3;
                    fg6Var3 = fg6Var5;
                    jg6Var3 = jg6VarD;
                } else {
                    bVarI.G();
                    qx80Var2 = qx80VarB;
                    fg6Var3 = fg6Var2;
                    jg6Var3 = jg6Var2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: og6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            jg6Var2 = jg6Var;
            i4 = i10 | i9;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(gwf.c, bVarI);
                        i4 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        fg6Var6 = d68Var.a0;
                        if (fg6Var6 == null) {
                            e68 e68Var11 = gwf.a;
                            long jC6 = g68.c(d68Var, e68Var11);
                            long jA6 = g68.a(d68Var, g68.c(d68Var, e68Var11));
                            e68 e68Var12 = gwf.d;
                            fg6Var4 = new fg6(jC6, jA6, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var12)), g68.c(d68Var, e68Var12)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var11))));
                            d68Var.a0 = fg6Var4;
                        } else {
                            fg6Var4 = fg6Var6;
                        }
                        i4 &= -897;
                    } else {
                        bVarI = bVarI;
                        fg6Var4 = fg6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        jg6VarD = gg6.d(63);
                        fg6Var5 = fg6Var4;
                        qx80Var3 = qx80VarB;
                    } else {
                        qx80Var3 = qx80VarB;
                        jg6VarD = jg6Var2;
                        fg6Var5 = fg6Var4;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(gwf.c, bVarI);
                        i4 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        fg6Var6 = d68Var.a0;
                        if (fg6Var6 == null) {
                            e68 e68Var13 = gwf.a;
                            long jC7 = g68.c(d68Var, e68Var13);
                            long jA7 = g68.a(d68Var, g68.c(d68Var, e68Var13));
                            e68 e68Var14 = gwf.d;
                            fg6Var4 = new fg6(jC7, jA7, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var14)), g68.c(d68Var, e68Var14)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var13))));
                            d68Var.a0 = fg6Var4;
                        } else {
                            fg6Var4 = fg6Var6;
                        }
                        i4 &= -897;
                    } else {
                        bVarI = bVarI;
                        fg6Var4 = fg6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        jg6VarD = gg6.d(63);
                        fg6Var5 = fg6Var4;
                        qx80Var3 = qx80VarB;
                    } else {
                        qx80Var3 = qx80VarB;
                        jg6VarD = jg6Var2;
                        fg6Var5 = fg6Var4;
                    }
                }
                bVarI.Y();
                bVarI = bVarI;
                a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                qx80Var2 = qx80Var3;
                fg6Var3 = fg6Var5;
                jg6Var3 = jg6VarD;
            } else {
                bVarI.G();
                qx80Var2 = qx80VarB;
                fg6Var3 = fg6Var2;
                jg6Var3 = jg6Var2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: og6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        qx80VarB = qx80Var;
        int i11 = i3 | i5;
        if ((i2 & 4) == 0) {
            fg6Var2 = fg6Var;
            if (bVarI.M(fg6Var2)) {
            }
            int i12 = i11 | i7;
            if ((i2 & 8) == 0) {
                jg6Var2 = jg6Var;
                if (bVarI.M(jg6Var2)) {
                }
                i4 = i12 | i9;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i4 & 1, z)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            qx80VarB = xy80.b(gwf.c, bVarI);
                            i4 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            fg6Var6 = d68Var.a0;
                            if (fg6Var6 == null) {
                                e68 e68Var15 = gwf.a;
                                long jC8 = g68.c(d68Var, e68Var15);
                                long jA8 = g68.a(d68Var, g68.c(d68Var, e68Var15));
                                e68 e68Var16 = gwf.d;
                                fg6Var4 = new fg6(jC8, jA8, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var16)), g68.c(d68Var, e68Var16)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var15))));
                                d68Var.a0 = fg6Var4;
                            } else {
                                fg6Var4 = fg6Var6;
                            }
                            i4 &= -897;
                        } else {
                            bVarI = bVarI;
                            fg6Var4 = fg6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            jg6VarD = gg6.d(63);
                            fg6Var5 = fg6Var4;
                            qx80Var3 = qx80VarB;
                        } else {
                            qx80Var3 = qx80VarB;
                            jg6VarD = jg6Var2;
                            fg6Var5 = fg6Var4;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            qx80VarB = xy80.b(gwf.c, bVarI);
                            i4 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            d68Var = (d68) bVarI.O(g68.a);
                            fg6Var6 = d68Var.a0;
                            if (fg6Var6 == null) {
                                e68 e68Var17 = gwf.a;
                                long jC9 = g68.c(d68Var, e68Var17);
                                long jA9 = g68.a(d68Var, g68.c(d68Var, e68Var17));
                                e68 e68Var18 = gwf.d;
                                fg6Var4 = new fg6(jC9, jA9, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var18)), g68.c(d68Var, e68Var18)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var17))));
                                d68Var.a0 = fg6Var4;
                            } else {
                                fg6Var4 = fg6Var6;
                            }
                            i4 &= -897;
                        } else {
                            bVarI = bVarI;
                            fg6Var4 = fg6Var2;
                        }
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                            jg6VarD = gg6.d(63);
                            fg6Var5 = fg6Var4;
                            qx80Var3 = qx80VarB;
                        } else {
                            qx80Var3 = qx80VarB;
                            jg6VarD = jg6Var2;
                            fg6Var5 = fg6Var4;
                        }
                    }
                    bVarI.Y();
                    bVarI = bVarI;
                    a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                    qx80Var2 = qx80Var3;
                    fg6Var3 = fg6Var5;
                    jg6Var3 = jg6VarD;
                } else {
                    bVarI.G();
                    qx80Var2 = qx80VarB;
                    fg6Var3 = fg6Var2;
                    jg6Var3 = jg6Var2;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: og6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            jg6Var2 = jg6Var;
            i4 = i12 | i9;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(gwf.c, bVarI);
                        i4 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        fg6Var6 = d68Var.a0;
                        if (fg6Var6 == null) {
                            e68 e68Var19 = gwf.a;
                            long jC10 = g68.c(d68Var, e68Var19);
                            long jA10 = g68.a(d68Var, g68.c(d68Var, e68Var19));
                            e68 e68Var110 = gwf.d;
                            fg6Var4 = new fg6(jC10, jA10, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var110)), g68.c(d68Var, e68Var110)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var19))));
                            d68Var.a0 = fg6Var4;
                        } else {
                            fg6Var4 = fg6Var6;
                        }
                        i4 &= -897;
                    } else {
                        bVarI = bVarI;
                        fg6Var4 = fg6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        jg6VarD = gg6.d(63);
                        fg6Var5 = fg6Var4;
                        qx80Var3 = qx80VarB;
                    } else {
                        qx80Var3 = qx80VarB;
                        jg6VarD = jg6Var2;
                        fg6Var5 = fg6Var4;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(gwf.c, bVarI);
                        i4 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        fg6Var6 = d68Var.a0;
                        if (fg6Var6 == null) {
                            e68 e68Var111 = gwf.a;
                            long jC11 = g68.c(d68Var, e68Var111);
                            long jA11 = g68.a(d68Var, g68.c(d68Var, e68Var111));
                            e68 e68Var112 = gwf.d;
                            fg6Var4 = new fg6(jC11, jA11, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var112)), g68.c(d68Var, e68Var112)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var111))));
                            d68Var.a0 = fg6Var4;
                        } else {
                            fg6Var4 = fg6Var6;
                        }
                        i4 &= -897;
                    } else {
                        bVarI = bVarI;
                        fg6Var4 = fg6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        jg6VarD = gg6.d(63);
                        fg6Var5 = fg6Var4;
                        qx80Var3 = qx80VarB;
                    } else {
                        qx80Var3 = qx80VarB;
                        jg6VarD = jg6Var2;
                        fg6Var5 = fg6Var4;
                    }
                }
                bVarI.Y();
                bVarI = bVarI;
                a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                qx80Var2 = qx80Var3;
                fg6Var3 = fg6Var5;
                jg6Var3 = jg6VarD;
            } else {
                bVarI.G();
                qx80Var2 = qx80VarB;
                fg6Var3 = fg6Var2;
                jg6Var3 = jg6Var2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: og6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        fg6Var2 = fg6Var;
        int i13 = i11 | i7;
        if ((i2 & 8) == 0) {
            jg6Var2 = jg6Var;
            if (bVarI.M(jg6Var2)) {
            }
            i4 = i13 | i9;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(gwf.c, bVarI);
                        i4 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        fg6Var6 = d68Var.a0;
                        if (fg6Var6 == null) {
                            e68 e68Var113 = gwf.a;
                            long jC12 = g68.c(d68Var, e68Var113);
                            long jA12 = g68.a(d68Var, g68.c(d68Var, e68Var113));
                            e68 e68Var114 = gwf.d;
                            fg6Var4 = new fg6(jC12, jA12, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var114)), g68.c(d68Var, e68Var114)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var113))));
                            d68Var.a0 = fg6Var4;
                        } else {
                            fg6Var4 = fg6Var6;
                        }
                        i4 &= -897;
                    } else {
                        bVarI = bVarI;
                        fg6Var4 = fg6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        jg6VarD = gg6.d(63);
                        fg6Var5 = fg6Var4;
                        qx80Var3 = qx80VarB;
                    } else {
                        qx80Var3 = qx80VarB;
                        jg6VarD = jg6Var2;
                        fg6Var5 = fg6Var4;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        qx80VarB = xy80.b(gwf.c, bVarI);
                        i4 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        d68Var = (d68) bVarI.O(g68.a);
                        fg6Var6 = d68Var.a0;
                        if (fg6Var6 == null) {
                            e68 e68Var115 = gwf.a;
                            long jC13 = g68.c(d68Var, e68Var115);
                            long jA13 = g68.a(d68Var, g68.c(d68Var, e68Var115));
                            e68 e68Var116 = gwf.d;
                            fg6Var4 = new fg6(jC13, jA13, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var116)), g68.c(d68Var, e68Var116)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var115))));
                            d68Var.a0 = fg6Var4;
                        } else {
                            fg6Var4 = fg6Var6;
                        }
                        i4 &= -897;
                    } else {
                        bVarI = bVarI;
                        fg6Var4 = fg6Var2;
                    }
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                        jg6VarD = gg6.d(63);
                        fg6Var5 = fg6Var4;
                        qx80Var3 = qx80VarB;
                    } else {
                        qx80Var3 = qx80VarB;
                        jg6VarD = jg6Var2;
                        fg6Var5 = fg6Var4;
                    }
                }
                bVarI.Y();
                bVarI = bVarI;
                a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
                qx80Var2 = qx80Var3;
                fg6Var3 = fg6Var5;
                jg6Var3 = jg6VarD;
            } else {
                bVarI.G();
                qx80Var2 = qx80VarB;
                fg6Var3 = fg6Var2;
                jg6Var3 = jg6Var2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: og6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        jg6Var2 = jg6Var;
        i4 = i13 | i9;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    qx80VarB = xy80.b(gwf.c, bVarI);
                    i4 &= -113;
                }
                if ((i2 & 4) != 0) {
                    d68Var = (d68) bVarI.O(g68.a);
                    fg6Var6 = d68Var.a0;
                    if (fg6Var6 == null) {
                        e68 e68Var117 = gwf.a;
                        long jC14 = g68.c(d68Var, e68Var117);
                        long jA14 = g68.a(d68Var, g68.c(d68Var, e68Var117));
                        e68 e68Var118 = gwf.d;
                        fg6Var4 = new fg6(jC14, jA14, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var118)), g68.c(d68Var, e68Var118)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var117))));
                        d68Var.a0 = fg6Var4;
                    } else {
                        fg6Var4 = fg6Var6;
                    }
                    i4 &= -897;
                } else {
                    bVarI = bVarI;
                    fg6Var4 = fg6Var2;
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    jg6VarD = gg6.d(63);
                    fg6Var5 = fg6Var4;
                    qx80Var3 = qx80VarB;
                } else {
                    qx80Var3 = qx80VarB;
                    jg6VarD = jg6Var2;
                    fg6Var5 = fg6Var4;
                }
            } else {
                if ((i2 & 2) != 0) {
                    qx80VarB = xy80.b(gwf.c, bVarI);
                    i4 &= -113;
                }
                if ((i2 & 4) != 0) {
                    d68Var = (d68) bVarI.O(g68.a);
                    fg6Var6 = d68Var.a0;
                    if (fg6Var6 == null) {
                        e68 e68Var119 = gwf.a;
                        long jC15 = g68.c(d68Var, e68Var119);
                        long jA15 = g68.a(d68Var, g68.c(d68Var, e68Var119));
                        e68 e68Var1110 = gwf.d;
                        fg6Var4 = new fg6(jC15, jA15, r58.h(j58.c(gwf.f, g68.c(d68Var, e68Var1110)), g68.c(d68Var, e68Var1110)), j58.c(0.38f, g68.a(d68Var, g68.c(d68Var, e68Var119))));
                        d68Var.a0 = fg6Var4;
                    } else {
                        fg6Var4 = fg6Var6;
                    }
                    i4 &= -897;
                } else {
                    bVarI = bVarI;
                    fg6Var4 = fg6Var2;
                }
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                    jg6VarD = gg6.d(63);
                    fg6Var5 = fg6Var4;
                    qx80Var3 = qx80VarB;
                } else {
                    qx80Var3 = qx80VarB;
                    jg6VarD = jg6Var2;
                    fg6Var5 = fg6Var4;
                }
            }
            bVarI.Y();
            bVarI = bVarI;
            a(dVar, qx80Var3, fg6Var5, jg6VarD, null, op8Var, bVarI, (i4 & 7168) | (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896) | 196608, 0);
            qx80Var2 = qx80Var3;
            fg6Var3 = fg6Var5;
            jg6Var3 = jg6VarD;
        } else {
            bVarI.G();
            qx80Var2 = qx80VarB;
            fg6Var3 = fg6Var2;
            jg6Var3 = jg6Var2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: og6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rg6.c(dVar, qx80Var2, fg6Var3, jg6Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final d dVar, final qx80 qx80Var, final fg6 fg6Var, jg6 jg6Var, final l35 l35Var, final op8 op8Var, androidx.compose.runtime.a aVar, final int i) {
        final jg6 jg6Var2;
        int i2;
        jg6 jg6Var3;
        b bVarI = aVar.i(-1945643296);
        int i3 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(qx80Var) ? 32 : 16) | (bVarI.M(fg6Var) ? 256 : 128) | 1024 | (bVarI.M(l35Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i2 = i3 & (-7169);
                jg6Var3 = new jg6(0.0f, 0.0f, 0.0f, 0.0f, i9z.a, 0.0f);
            } else {
                bVarI.G();
                i2 = i3 & (-7169);
                jg6Var3 = jg6Var;
            }
            bVarI.Y();
            a(dVar, qx80Var, fg6Var, jg6Var3, l35Var, op8Var, bVarI, i2 & 524286, 0);
            jg6Var2 = jg6Var3;
        } else {
            bVarI.G();
            jg6Var2 = jg6Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qx80Var, fg6Var, jg6Var2, l35Var, op8Var, i) { // from class: ng6
                public final /* synthetic */ qx80 b;
                public final /* synthetic */ fg6 c;
                public final /* synthetic */ jg6 d;
                public final /* synthetic */ l35 e;
                public final /* synthetic */ op8 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(196609);
                    rg6.d(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
