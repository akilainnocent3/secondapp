package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.google.protobuf.Reader;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class ab2 {
    static {
        jc1.a(40.0f, 40.0f);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x016c  */
    /* JADX WARN: Code duplicated, block: B:121:0x016f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:125:0x017d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180  */
    /* JADX WARN: Code duplicated, block: B:129:0x0187  */
    /* JADX WARN: Code duplicated, block: B:132:0x0190  */
    /* JADX WARN: Code duplicated, block: B:133:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01da  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:166:0x0203  */
    /* JADX WARN: Code duplicated, block: B:168:0x020f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x024b  */
    /* JADX WARN: Code duplicated, block: B:179:0x024f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0252  */
    /* JADX WARN: Code duplicated, block: B:183:0x0257  */
    /* JADX WARN: Code duplicated, block: B:184:0x025a  */
    /* JADX WARN: Code duplicated, block: B:186:0x025d  */
    /* JADX WARN: Code duplicated, block: B:187:0x025f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0265 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0267  */
    /* JADX WARN: Code duplicated, block: B:192:0x026a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0270  */
    /* JADX WARN: Code duplicated, block: B:196:0x0276  */
    /* JADX WARN: Code duplicated, block: B:197:0x0279  */
    /* JADX WARN: Code duplicated, block: B:199:0x027d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0280  */
    /* JADX WARN: Code duplicated, block: B:202:0x0284  */
    /* JADX WARN: Code duplicated, block: B:204:0x028a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0296  */
    /* JADX WARN: Code duplicated, block: B:207:0x029c  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:212:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:216:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:223:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:224:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:228:0x0305  */
    /* JADX WARN: Code duplicated, block: B:231:0x030f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0311  */
    /* JADX WARN: Code duplicated, block: B:234:0x0379  */
    /* JADX WARN: Code duplicated, block: B:237:0x0398  */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    public static final void a(final ijf0 ijf0Var, final Function1 function1, final d dVar, boolean z, boolean z2, final imf0 imf0Var, gop gopVar, tnp tnpVar, boolean z3, int i, int i2, uni0 uni0Var, Function1 function2, psw pswVar, final soa0 soa0Var, gaj gajVar, a aVar, final int i3, final int i4, final int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        gop gopVar2;
        int i10;
        int i11;
        tnp tnpVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z6;
        final boolean z7;
        final uni0 uni0Var2;
        final psw pswVar2;
        final boolean z8;
        final boolean z9;
        final tnp tnpVar3;
        final gop gopVar3;
        b bVar;
        final int i30;
        final int i31;
        final Function1 function3;
        final gaj gajVar2;
        e eVarZ;
        int i32;
        a.C0041a.C0042a c0042a;
        tnp tnpVar4;
        boolean z10;
        int i33;
        int i34;
        int i35;
        uni0 uni0Var3;
        Function1 function4;
        psw pswVar3;
        boolean z11;
        int i36;
        Object objY;
        int i37;
        int i38;
        boolean z12;
        boolean z13;
        Object objY2;
        int i39;
        b bVarI = aVar.i(-971111025);
        if ((i3 & 6) == 0) {
            i6 = (bVarI.M(ijf0Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= bVarI.M(dVar) ? 256 : 128;
        }
        int i40 = i5 & 8;
        if (i40 == 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                i6 |= bVarI.b(z4) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (bVarI.b(z5)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                if ((i3 & 196608) == 0) {
                    if (bVarI.M(imf0Var)) {
                        i39 = 131072;
                    } else {
                        i39 = 65536;
                    }
                    i6 |= i39;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                    gopVar2 = gopVar;
                } else {
                    gopVar2 = gopVar;
                    if ((i3 & 1572864) == 0) {
                        if (bVarI.M(gopVar2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i6 |= i10;
                    }
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                    tnpVar2 = tnpVar;
                } else {
                    tnpVar2 = tnpVar;
                    if ((i3 & 12582912) == 0) {
                        if (bVarI.M(tnpVar2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    if (bVarI.b(z3)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i6 |= i14;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                    i16 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (bVarI.d(i2)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i4 | i17;
                } else {
                    i16 = i4;
                }
                i18 = i5 & 2048;
                if (i18 != 0) {
                    i16 |= 48;
                } else if ((i4 & 48) != 0) {
                    if (bVarI.M(uni0Var)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i16 |= i19;
                }
                i20 = i16;
                i21 = i6;
                i22 = i5 & 4096;
                if (i22 != 0) {
                    i24 = i20 | 384;
                } else {
                    i23 = i20;
                    if ((i4 & 384) != 0) {
                        if (bVarI.A(function2)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    i24 = i23;
                }
                i26 = i5 & 8192;
                if (i26 != 0) {
                    i28 = i24 | 3072;
                } else {
                    i27 = i24;
                    if ((i4 & 3072) == 0) {
                        i28 = i27 | (bVarI.M(pswVar) ? 2048 : 1024);
                    } else {
                        i28 = i27;
                    }
                }
                if ((i4 & 24576) != 0) {
                    i28 |= bVarI.M(soa0Var) ? 16384 : 8192;
                }
                i29 = i5 & 32768;
                if (i29 != 0) {
                    i28 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i28 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i21 & 306783379) == 306783378 || (i28 & 74899) != 74898) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (bVarI.q(i21 & 1, z6)) {
                    bVarI.A0();
                    i32 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i32 != 0 || bVarI.h0()) {
                        if (i40 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            z5 = false;
                        }
                        if (i9 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i11 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i13 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i33 = 1;
                            } else {
                                i33 = Reader.READ_DONE;
                            }
                            i34 = i21 & (-1879048193);
                        } else {
                            i33 = i;
                            i34 = i21;
                        }
                        if (i15 != 0) {
                            i35 = 1;
                        } else {
                            i35 = i2;
                        }
                        if (i18 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        if (i22 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new xa2(0);
                                bVarI.r(objY);
                            }
                            function4 = (Function1) objY;
                        } else {
                            tnpVar4 = tnpVar4;
                            function4 = function2;
                        }
                        if (i26 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        if (i29 != 0) {
                            boolean z14 = z10;
                            function2 = function4;
                            gopVar2 = gopVar2;
                            z4 = z4;
                            z11 = z14;
                            int i41 = i34;
                            z5 = z5;
                            pswVar = pswVar3;
                            i = i33;
                            i36 = i41;
                            tnpVar2 = tnpVar4;
                            i2 = i35;
                            uni0Var = uni0Var3;
                            gajVar = sr8.b;
                        } else {
                            boolean z15 = z10;
                            function2 = function4;
                            gopVar2 = gopVar2;
                            z4 = z4;
                            z11 = z15;
                            int i42 = i34;
                            z5 = z5;
                            pswVar = pswVar3;
                            i = i33;
                            i36 = i42;
                            tnpVar2 = tnpVar4;
                            i2 = i35;
                            uni0Var = uni0Var3;
                            gajVar = gajVar;
                        }
                    } else {
                        bVarI.G();
                        i36 = (i5 & 512) != 0 ? i21 & (-1879048193) : i21;
                        z11 = z3;
                    }
                    bVarI.Y();
                    bcn bcnVarB = gopVar2.b(z11);
                    Function1 function5 = function2;
                    boolean z16 = !z11;
                    gop gopVar4 = gopVar2;
                    psw pswVar4 = pswVar;
                    if (z11) {
                        i37 = 1;
                    } else {
                        i37 = i2;
                    }
                    if (z11) {
                        i38 = 1;
                    } else {
                        i38 = i;
                    }
                    uni0 uni0Var4 = uni0Var;
                    if ((i36 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z12 | ((i36 & 112) == 32);
                    objY2 = bVarI.y();
                    if (z13 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: ya2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var2 = (ijf0) obj;
                                if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                                    function1.invoke(ijf0Var2);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    int i43 = i28 << 9;
                    j4b.a(ijf0Var, (Function1) objY2, dVar, imf0Var, uni0Var4, function5, pswVar4, soa0Var, z16, i38, i37, bcnVarB, tnpVar2, z4, z5, gajVar, bVarI, (i36 & 910) | ((i36 >> 6) & 7168) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128), (i36 & 7168) | ((i36 >> 15) & 896) | (i36 & 57344) | (i28 & 458752));
                    tnpVar3 = tnpVar2;
                    z9 = z5;
                    bVar = bVarI;
                    i30 = i;
                    i31 = i2;
                    z7 = z11;
                    gopVar3 = gopVar4;
                    uni0Var2 = uni0Var4;
                    pswVar2 = pswVar4;
                    z8 = z4;
                    gajVar2 = gajVar;
                    function3 = function5;
                } else {
                    bVarI.G();
                    z7 = z3;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    z8 = z4;
                    z9 = z5;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    bVar = bVarI;
                    i30 = i;
                    i31 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: za2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.a(ijf0Var, function1, dVar, z8, z9, imf0Var, gopVar3, tnpVar3, z7, i30, i31, uni0Var2, function3, pswVar2, soa0Var, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            z5 = z2;
            if ((i3 & 196608) == 0) {
                if (bVarI.M(imf0Var)) {
                    i39 = 131072;
                } else {
                    i39 = 65536;
                }
                i6 |= i39;
            }
            i9 = i5 & 64;
            if (i9 != 0) {
                i6 |= 1572864;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i3 & 1572864) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
                tnpVar2 = tnpVar;
            } else {
                tnpVar2 = tnpVar;
                if ((i3 & 12582912) == 0) {
                    if (bVarI.M(tnpVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 256;
            if (i13 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (bVarI.b(z3)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i6 |= i14;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
                i16 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (bVarI.d(i2)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i4 | i17;
            } else {
                i16 = i4;
            }
            i18 = i5 & 2048;
            if (i18 != 0) {
                i16 |= 48;
            } else if ((i4 & 48) != 0) {
                if (bVarI.M(uni0Var)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i16 |= i19;
            }
            i20 = i16;
            i21 = i6;
            i22 = i5 & 4096;
            if (i22 != 0) {
                i24 = i20 | 384;
            } else {
                i23 = i20;
                if ((i4 & 384) != 0) {
                    if (bVarI.A(function2)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i24 = i23;
            }
            i26 = i5 & 8192;
            if (i26 != 0) {
                i28 = i24 | 3072;
            } else {
                i27 = i24;
                if ((i4 & 3072) == 0) {
                    i28 = i27 | (bVarI.M(pswVar) ? 2048 : 1024);
                } else {
                    i28 = i27;
                }
            }
            if ((i4 & 24576) != 0) {
                i28 |= bVarI.M(soa0Var) ? 16384 : 8192;
            }
            i29 = i5 & 32768;
            if (i29 != 0) {
                i28 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i28 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i21 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bVarI.q(i21 & 1, z6)) {
                bVarI.A0();
                i32 = i3 & 1;
                c0042a = a.C0041a.a;
                if (i32 != 0) {
                    if (i40 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if (i9 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i11 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i33 = 1;
                        } else {
                            i33 = Reader.READ_DONE;
                        }
                        i34 = i21 & (-1879048193);
                    } else {
                        i33 = i;
                        i34 = i21;
                    }
                    if (i15 != 0) {
                        i35 = 1;
                    } else {
                        i35 = i2;
                    }
                    if (i18 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    if (i22 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new xa2(0);
                            bVarI.r(objY);
                        }
                        function4 = (Function1) objY;
                    } else {
                        tnpVar4 = tnpVar4;
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    if (i29 != 0) {
                        boolean z17 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z17;
                        int i44 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i44;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = sr8.b;
                    } else {
                        boolean z18 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z18;
                        int i45 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i45;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = gajVar;
                    }
                } else {
                    if (i40 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if (i9 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i11 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i33 = 1;
                        } else {
                            i33 = Reader.READ_DONE;
                        }
                        i34 = i21 & (-1879048193);
                    } else {
                        i33 = i;
                        i34 = i21;
                    }
                    if (i15 != 0) {
                        i35 = 1;
                    } else {
                        i35 = i2;
                    }
                    if (i18 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    if (i22 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new xa2(0);
                            bVarI.r(objY);
                        }
                        function4 = (Function1) objY;
                    } else {
                        tnpVar4 = tnpVar4;
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    if (i29 != 0) {
                        boolean z19 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z19;
                        int i46 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i46;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = sr8.b;
                    } else {
                        boolean z110 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z110;
                        int i47 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i47;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = gajVar;
                    }
                }
                bVarI.Y();
                bcn bcnVarB2 = gopVar2.b(z11);
                Function1 function6 = function2;
                boolean z111 = !z11;
                gop gopVar5 = gopVar2;
                psw pswVar5 = pswVar;
                if (z11) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (z11) {
                    i38 = 1;
                } else {
                    i38 = i;
                }
                uni0 uni0Var5 = uni0Var;
                if ((i36 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | ((i36 & 112) == 32);
                objY2 = bVarI.y();
                if (z13) {
                    objY2 = new Function1() { // from class: ya2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var2 = (ijf0) obj;
                            if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                                function1.invoke(ijf0Var2);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function1() { // from class: ya2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var2 = (ijf0) obj;
                            if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                                function1.invoke(ijf0Var2);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                int i48 = i28 << 9;
                j4b.a(ijf0Var, (Function1) objY2, dVar, imf0Var, uni0Var5, function6, pswVar5, soa0Var, z111, i38, i37, bcnVarB2, tnpVar2, z4, z5, gajVar, bVarI, (i36 & 910) | ((i36 >> 6) & 7168) | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016) | (i48 & 29360128), (i36 & 7168) | ((i36 >> 15) & 896) | (i36 & 57344) | (i28 & 458752));
                tnpVar3 = tnpVar2;
                z9 = z5;
                bVar = bVarI;
                i30 = i;
                i31 = i2;
                z7 = z11;
                gopVar3 = gopVar5;
                uni0Var2 = uni0Var5;
                pswVar2 = pswVar5;
                z8 = z4;
                gajVar2 = gajVar;
                function3 = function6;
            } else {
                bVarI.G();
                z7 = z3;
                uni0Var2 = uni0Var;
                pswVar2 = pswVar;
                z8 = z4;
                z9 = z5;
                tnpVar3 = tnpVar2;
                gopVar3 = gopVar2;
                bVar = bVarI;
                i30 = i;
                i31 = i2;
                function3 = function2;
                gajVar2 = gajVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: za2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        ab2.a(ijf0Var, function1, dVar, z8, z9, imf0Var, gopVar3, tnpVar3, z7, i30, i31, uni0Var2, function3, pswVar2, soa0Var, gajVar2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 3072;
        z4 = z;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (bVarI.b(z5)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            if ((i3 & 196608) == 0) {
                if (bVarI.M(imf0Var)) {
                    i39 = 131072;
                } else {
                    i39 = 65536;
                }
                i6 |= i39;
            }
            i9 = i5 & 64;
            if (i9 != 0) {
                i6 |= 1572864;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i3 & 1572864) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
                tnpVar2 = tnpVar;
            } else {
                tnpVar2 = tnpVar;
                if ((i3 & 12582912) == 0) {
                    if (bVarI.M(tnpVar2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 256;
            if (i13 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                if (bVarI.b(z3)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i6 |= i14;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
                i16 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (bVarI.d(i2)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i4 | i17;
            } else {
                i16 = i4;
            }
            i18 = i5 & 2048;
            if (i18 != 0) {
                i16 |= 48;
            } else if ((i4 & 48) != 0) {
                if (bVarI.M(uni0Var)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i16 |= i19;
            }
            i20 = i16;
            i21 = i6;
            i22 = i5 & 4096;
            if (i22 != 0) {
                i24 = i20 | 384;
            } else {
                i23 = i20;
                if ((i4 & 384) != 0) {
                    if (bVarI.A(function2)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i24 = i23;
            }
            i26 = i5 & 8192;
            if (i26 != 0) {
                i28 = i24 | 3072;
            } else {
                i27 = i24;
                if ((i4 & 3072) == 0) {
                    i28 = i27 | (bVarI.M(pswVar) ? 2048 : 1024);
                } else {
                    i28 = i27;
                }
            }
            if ((i4 & 24576) != 0) {
                i28 |= bVarI.M(soa0Var) ? 16384 : 8192;
            }
            i29 = i5 & 32768;
            if (i29 != 0) {
                i28 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i28 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i21 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bVarI.q(i21 & 1, z6)) {
                bVarI.A0();
                i32 = i3 & 1;
                c0042a = a.C0041a.a;
                if (i32 != 0) {
                    if (i40 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if (i9 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i11 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i33 = 1;
                        } else {
                            i33 = Reader.READ_DONE;
                        }
                        i34 = i21 & (-1879048193);
                    } else {
                        i33 = i;
                        i34 = i21;
                    }
                    if (i15 != 0) {
                        i35 = 1;
                    } else {
                        i35 = i2;
                    }
                    if (i18 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    if (i22 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new xa2(0);
                            bVarI.r(objY);
                        }
                        function4 = (Function1) objY;
                    } else {
                        tnpVar4 = tnpVar4;
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    if (i29 != 0) {
                        boolean z112 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z112;
                        int i49 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i49;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = sr8.b;
                    } else {
                        boolean z113 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z113;
                        int i410 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i410;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = gajVar;
                    }
                } else {
                    if (i40 != 0) {
                        z4 = true;
                    }
                    if (i7 != 0) {
                        z5 = false;
                    }
                    if (i9 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i11 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i13 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i33 = 1;
                        } else {
                            i33 = Reader.READ_DONE;
                        }
                        i34 = i21 & (-1879048193);
                    } else {
                        i33 = i;
                        i34 = i21;
                    }
                    if (i15 != 0) {
                        i35 = 1;
                    } else {
                        i35 = i2;
                    }
                    if (i18 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    if (i22 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new xa2(0);
                            bVarI.r(objY);
                        }
                        function4 = (Function1) objY;
                    } else {
                        tnpVar4 = tnpVar4;
                        function4 = function2;
                    }
                    if (i26 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    if (i29 != 0) {
                        boolean z114 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z114;
                        int i411 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i411;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = sr8.b;
                    } else {
                        boolean z115 = z10;
                        function2 = function4;
                        gopVar2 = gopVar2;
                        z4 = z4;
                        z11 = z115;
                        int i412 = i34;
                        z5 = z5;
                        pswVar = pswVar3;
                        i = i33;
                        i36 = i412;
                        tnpVar2 = tnpVar4;
                        i2 = i35;
                        uni0Var = uni0Var3;
                        gajVar = gajVar;
                    }
                }
                bVarI.Y();
                bcn bcnVarB3 = gopVar2.b(z11);
                Function1 function7 = function2;
                boolean z116 = !z11;
                gop gopVar6 = gopVar2;
                psw pswVar6 = pswVar;
                if (z11) {
                    i37 = 1;
                } else {
                    i37 = i2;
                }
                if (z11) {
                    i38 = 1;
                } else {
                    i38 = i;
                }
                uni0 uni0Var6 = uni0Var;
                if ((i36 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | ((i36 & 112) == 32);
                objY2 = bVarI.y();
                if (z13) {
                    objY2 = new Function1() { // from class: ya2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var2 = (ijf0) obj;
                            if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                                function1.invoke(ijf0Var2);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function1() { // from class: ya2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var2 = (ijf0) obj;
                            if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                                function1.invoke(ijf0Var2);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                int i413 = i28 << 9;
                j4b.a(ijf0Var, (Function1) objY2, dVar, imf0Var, uni0Var6, function7, pswVar6, soa0Var, z116, i38, i37, bcnVarB3, tnpVar2, z4, z5, gajVar, bVarI, (i36 & 910) | ((i36 >> 6) & 7168) | (i413 & 57344) | (i413 & 458752) | (i413 & 3670016) | (i413 & 29360128), (i36 & 7168) | ((i36 >> 15) & 896) | (i36 & 57344) | (i28 & 458752));
                tnpVar3 = tnpVar2;
                z9 = z5;
                bVar = bVarI;
                i30 = i;
                i31 = i2;
                z7 = z11;
                gopVar3 = gopVar6;
                uni0Var2 = uni0Var6;
                pswVar2 = pswVar6;
                z8 = z4;
                gajVar2 = gajVar;
                function3 = function7;
            } else {
                bVarI.G();
                z7 = z3;
                uni0Var2 = uni0Var;
                pswVar2 = pswVar;
                z8 = z4;
                z9 = z5;
                tnpVar3 = tnpVar2;
                gopVar3 = gopVar2;
                bVar = bVarI;
                i30 = i;
                i31 = i2;
                function3 = function2;
                gajVar2 = gajVar;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: za2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        ab2.a(ijf0Var, function1, dVar, z8, z9, imf0Var, gopVar3, tnpVar3, z7, i30, i31, uni0Var2, function3, pswVar2, soa0Var, gajVar2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 24576;
        z5 = z2;
        if ((i3 & 196608) == 0) {
            if (bVarI.M(imf0Var)) {
                i39 = 131072;
            } else {
                i39 = 65536;
            }
            i6 |= i39;
        }
        i9 = i5 & 64;
        if (i9 != 0) {
            i6 |= 1572864;
            gopVar2 = gopVar;
        } else {
            gopVar2 = gopVar;
            if ((i3 & 1572864) == 0) {
                if (bVarI.M(gopVar2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i6 |= i10;
            }
        }
        i11 = i5 & 128;
        if (i11 != 0) {
            i6 |= 12582912;
            tnpVar2 = tnpVar;
        } else {
            tnpVar2 = tnpVar;
            if ((i3 & 12582912) == 0) {
                if (bVarI.M(tnpVar2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
        }
        i13 = i5 & 256;
        if (i13 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (bVarI.b(z3)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i6 |= i14;
        }
        if ((i3 & 805306368) != 0) {
            i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
            i16 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (bVarI.d(i2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i16 = i4 | i17;
        } else {
            i16 = i4;
        }
        i18 = i5 & 2048;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i4 & 48) != 0) {
            if (bVarI.M(uni0Var)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i16 |= i19;
        }
        i20 = i16;
        i21 = i6;
        i22 = i5 & 4096;
        if (i22 != 0) {
            i24 = i20 | 384;
        } else {
            i23 = i20;
            if ((i4 & 384) != 0) {
                if (bVarI.A(function2)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i23 |= i25;
            }
            i24 = i23;
        }
        i26 = i5 & 8192;
        if (i26 != 0) {
            i28 = i24 | 3072;
        } else {
            i27 = i24;
            if ((i4 & 3072) == 0) {
                i28 = i27 | (bVarI.M(pswVar) ? 2048 : 1024);
            } else {
                i28 = i27;
            }
        }
        if ((i4 & 24576) != 0) {
            i28 |= bVarI.M(soa0Var) ? 16384 : 8192;
        }
        i29 = i5 & 32768;
        if (i29 != 0) {
            i28 |= 196608;
        } else if ((i4 & 196608) == 0) {
            i28 |= bVarI.A(gajVar) ? 131072 : 65536;
        }
        if ((i21 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (bVarI.q(i21 & 1, z6)) {
            bVarI.A0();
            i32 = i3 & 1;
            c0042a = a.C0041a.a;
            if (i32 != 0) {
                if (i40 != 0) {
                    z4 = true;
                }
                if (i7 != 0) {
                    z5 = false;
                }
                if (i9 != 0) {
                    gopVar2 = gop.e;
                }
                if (i11 != 0) {
                    tnpVar4 = tnp.d;
                } else {
                    tnpVar4 = tnpVar2;
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i33 = 1;
                    } else {
                        i33 = Reader.READ_DONE;
                    }
                    i34 = i21 & (-1879048193);
                } else {
                    i33 = i;
                    i34 = i21;
                }
                if (i15 != 0) {
                    i35 = 1;
                } else {
                    i35 = i2;
                }
                if (i18 != 0) {
                    uni0Var3 = uni0.a.a;
                } else {
                    uni0Var3 = uni0Var;
                }
                if (i22 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new xa2(0);
                        bVarI.r(objY);
                    }
                    function4 = (Function1) objY;
                } else {
                    tnpVar4 = tnpVar4;
                    function4 = function2;
                }
                if (i26 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                if (i29 != 0) {
                    boolean z117 = z10;
                    function2 = function4;
                    gopVar2 = gopVar2;
                    z4 = z4;
                    z11 = z117;
                    int i414 = i34;
                    z5 = z5;
                    pswVar = pswVar3;
                    i = i33;
                    i36 = i414;
                    tnpVar2 = tnpVar4;
                    i2 = i35;
                    uni0Var = uni0Var3;
                    gajVar = sr8.b;
                } else {
                    boolean z118 = z10;
                    function2 = function4;
                    gopVar2 = gopVar2;
                    z4 = z4;
                    z11 = z118;
                    int i415 = i34;
                    z5 = z5;
                    pswVar = pswVar3;
                    i = i33;
                    i36 = i415;
                    tnpVar2 = tnpVar4;
                    i2 = i35;
                    uni0Var = uni0Var3;
                    gajVar = gajVar;
                }
            } else {
                if (i40 != 0) {
                    z4 = true;
                }
                if (i7 != 0) {
                    z5 = false;
                }
                if (i9 != 0) {
                    gopVar2 = gop.e;
                }
                if (i11 != 0) {
                    tnpVar4 = tnp.d;
                } else {
                    tnpVar4 = tnpVar2;
                }
                if (i13 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i33 = 1;
                    } else {
                        i33 = Reader.READ_DONE;
                    }
                    i34 = i21 & (-1879048193);
                } else {
                    i33 = i;
                    i34 = i21;
                }
                if (i15 != 0) {
                    i35 = 1;
                } else {
                    i35 = i2;
                }
                if (i18 != 0) {
                    uni0Var3 = uni0.a.a;
                } else {
                    uni0Var3 = uni0Var;
                }
                if (i22 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new xa2(0);
                        bVarI.r(objY);
                    }
                    function4 = (Function1) objY;
                } else {
                    tnpVar4 = tnpVar4;
                    function4 = function2;
                }
                if (i26 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                if (i29 != 0) {
                    boolean z119 = z10;
                    function2 = function4;
                    gopVar2 = gopVar2;
                    z4 = z4;
                    z11 = z119;
                    int i416 = i34;
                    z5 = z5;
                    pswVar = pswVar3;
                    i = i33;
                    i36 = i416;
                    tnpVar2 = tnpVar4;
                    i2 = i35;
                    uni0Var = uni0Var3;
                    gajVar = sr8.b;
                } else {
                    boolean z1110 = z10;
                    function2 = function4;
                    gopVar2 = gopVar2;
                    z4 = z4;
                    z11 = z1110;
                    int i417 = i34;
                    z5 = z5;
                    pswVar = pswVar3;
                    i = i33;
                    i36 = i417;
                    tnpVar2 = tnpVar4;
                    i2 = i35;
                    uni0Var = uni0Var3;
                    gajVar = gajVar;
                }
            }
            bVarI.Y();
            bcn bcnVarB4 = gopVar2.b(z11);
            Function1 function8 = function2;
            boolean z1111 = !z11;
            gop gopVar7 = gopVar2;
            psw pswVar7 = pswVar;
            if (z11) {
                i37 = 1;
            } else {
                i37 = i2;
            }
            if (z11) {
                i38 = 1;
            } else {
                i38 = i;
            }
            uni0 uni0Var7 = uni0Var;
            if ((i36 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z12 | ((i36 & 112) == 32);
            objY2 = bVarI.y();
            if (z13) {
                objY2 = new Function1() { // from class: ya2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var2 = (ijf0) obj;
                        if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                            function1.invoke(ijf0Var2);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                objY2 = new Function1() { // from class: ya2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var2 = (ijf0) obj;
                        if (!Intrinsics.g(ijf0Var, ijf0Var2)) {
                            function1.invoke(ijf0Var2);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            int i418 = i28 << 9;
            j4b.a(ijf0Var, (Function1) objY2, dVar, imf0Var, uni0Var7, function8, pswVar7, soa0Var, z1111, i38, i37, bcnVarB4, tnpVar2, z4, z5, gajVar, bVarI, (i36 & 910) | ((i36 >> 6) & 7168) | (i418 & 57344) | (i418 & 458752) | (i418 & 3670016) | (i418 & 29360128), (i36 & 7168) | ((i36 >> 15) & 896) | (i36 & 57344) | (i28 & 458752));
            tnpVar3 = tnpVar2;
            z9 = z5;
            bVar = bVarI;
            i30 = i;
            i31 = i2;
            z7 = z11;
            gopVar3 = gopVar7;
            uni0Var2 = uni0Var7;
            pswVar2 = pswVar7;
            z8 = z4;
            gajVar2 = gajVar;
            function3 = function8;
        } else {
            bVarI.G();
            z7 = z3;
            uni0Var2 = uni0Var;
            pswVar2 = pswVar;
            z8 = z4;
            z9 = z5;
            tnpVar3 = tnpVar2;
            gopVar3 = gopVar2;
            bVar = bVarI;
            i30 = i;
            i31 = i2;
            function3 = function2;
            gajVar2 = gajVar;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: za2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    int iA2 = qj40.a(i4);
                    ab2.a(ijf0Var, function1, dVar, z8, z9, imf0Var, gopVar3, tnpVar3, z7, i30, i31, uni0Var2, function3, pswVar2, soa0Var, gajVar2, (a) obj, iA, iA2, i5);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:121:0x016b  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:126:0x017a  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:135:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01be  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0244  */
    /* JADX WARN: Code duplicated, block: B:170:0x0249  */
    /* JADX WARN: Code duplicated, block: B:172:0x024d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0250  */
    /* JADX WARN: Code duplicated, block: B:176:0x0255  */
    /* JADX WARN: Code duplicated, block: B:178:0x025a  */
    /* JADX WARN: Code duplicated, block: B:179:0x025d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0260  */
    /* JADX WARN: Code duplicated, block: B:182:0x0262  */
    /* JADX WARN: Code duplicated, block: B:185:0x0268 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x026a  */
    /* JADX WARN: Code duplicated, block: B:187:0x026d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0275  */
    /* JADX WARN: Code duplicated, block: B:191:0x0279  */
    /* JADX WARN: Code duplicated, block: B:192:0x027c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0280  */
    /* JADX WARN: Code duplicated, block: B:195:0x0283  */
    /* JADX WARN: Code duplicated, block: B:198:0x028b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0297  */
    /* JADX WARN: Code duplicated, block: B:202:0x029e  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:211:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:214:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:217:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x0322  */
    /* JADX WARN: Code duplicated, block: B:223:0x0337  */
    /* JADX WARN: Code duplicated, block: B:224:0x033a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0343  */
    /* JADX WARN: Code duplicated, block: B:231:0x0358  */
    /* JADX WARN: Code duplicated, block: B:232:0x035b  */
    /* JADX WARN: Code duplicated, block: B:234:0x035f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0362  */
    /* JADX WARN: Code duplicated, block: B:239:0x0371  */
    /* JADX WARN: Code duplicated, block: B:242:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x037d  */
    /* JADX WARN: Code duplicated, block: B:245:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final Function1<? super String, Unit> function1, d dVar, boolean z, boolean z2, imf0 imf0Var, gop gopVar, tnp tnpVar, boolean z3, int i, int i2, uni0 uni0Var, Function1<? super ukf0, Unit> function2, psw pswVar, ya5 ya5Var, gaj<? super Function2<? super a, ? super Integer, Unit>, ? super a, ? super Integer, Unit> gajVar, a aVar, final int i3, final int i4, final int i5) {
        int i6;
        d dVar2;
        int i7;
        boolean z4;
        int i8;
        int i9;
        boolean z5;
        int i10;
        int i11;
        imf0 imf0Var2;
        int i12;
        int i13;
        gop gopVar2;
        int i14;
        int i15;
        tnp tnpVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z6;
        b bVar;
        final boolean z7;
        final int i35;
        final Function1<? super ukf0, Unit> function3;
        final gaj<? super Function2<? super a, ? super Integer, Unit>, ? super a, ? super Integer, Unit> gajVar2;
        final boolean z8;
        final boolean z9;
        final d dVar3;
        final imf0 imf0Var3;
        final int i36;
        final uni0 uni0Var2;
        final psw pswVar2;
        final tnp tnpVar3;
        final gop gopVar3;
        final ya5 ya5Var2;
        e eVarZ;
        int i37;
        a.C0041a.C0042a c0042a;
        tnp tnpVar4;
        boolean z10;
        int i38;
        int i39;
        uni0 uni0Var3;
        Object objY;
        psw pswVar3;
        Function1<? super ukf0, Unit> function4;
        ya5 soa0Var;
        gaj<? super Function2<? super a, ? super Integer, Unit>, ? super a, ? super Integer, Unit> gajVar3;
        ya5 ya5Var3;
        boolean z11;
        d dVar4;
        gop gopVar4;
        psw pswVar4;
        Object objY2;
        final ytw ytwVar;
        ijf0 ijf0VarB;
        boolean zM;
        Object objY3;
        boolean z12;
        boolean z13;
        Object objY4;
        final ytw ytwVar2;
        int i40;
        int i41;
        boolean zM2;
        Object objY5;
        b bVarI = aVar.i(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (bVarI.M(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarI.A(function1) ? 32 : 16;
        }
        int i42 = i5 & 4;
        if (i42 == 0) {
            if ((i3 & 384) == 0) {
                dVar2 = dVar;
                i6 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    if (bVarI.b(z4)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        if (bVarI.b(z5)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i6 |= i10;
                    }
                    i11 = i5 & 32;
                    if (i11 != 0) {
                        i6 |= 196608;
                        imf0Var2 = imf0Var;
                    } else {
                        imf0Var2 = imf0Var;
                        if ((i3 & 196608) == 0) {
                            if (bVarI.M(imf0Var2)) {
                                i12 = 131072;
                            } else {
                                i12 = 65536;
                            }
                            i6 |= i12;
                        }
                    }
                    i13 = i5 & 64;
                    if (i13 != 0) {
                        i6 |= 1572864;
                        gopVar2 = gopVar;
                    } else {
                        gopVar2 = gopVar;
                        if ((i3 & 1572864) == 0) {
                            if (bVarI.M(gopVar2)) {
                                i14 = 1048576;
                            } else {
                                i14 = 524288;
                            }
                            i6 |= i14;
                        }
                    }
                    i15 = i5 & 128;
                    if (i15 != 0) {
                        i6 |= 12582912;
                        tnpVar2 = tnpVar;
                    } else {
                        tnpVar2 = tnpVar;
                        if ((i3 & 12582912) == 0) {
                            if (bVarI.M(tnpVar2)) {
                                i16 = 8388608;
                            } else {
                                i16 = 4194304;
                            }
                            i6 |= i16;
                        }
                    }
                    i17 = i5 & 256;
                    if (i17 != 0) {
                        if ((i3 & 100663296) == 0) {
                            if (bVarI.b(z3)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                            i6 |= i18;
                        }
                        if ((i3 & 805306368) != 0) {
                            i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                        }
                        i19 = i5 & 1024;
                        if (i19 != 0) {
                            i21 = i4 | 6;
                        } else {
                            if (bVarI.d(i2)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                            i21 = i4 | i20;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i24 = i21 | 48;
                        } else {
                            if (bVarI.M(uni0Var)) {
                                i23 = 32;
                            } else {
                                i23 = 16;
                            }
                            i24 = i21 | i23;
                        }
                        i25 = i24;
                        i26 = i6;
                        i27 = i25 | 384;
                        i28 = i5 & 8192;
                        if (i28 != 0) {
                            i29 = i25 | 3456;
                        } else if ((i4 & 3072) == 0) {
                            if (bVarI.M(pswVar)) {
                                i30 = 2048;
                            } else {
                                i30 = 1024;
                            }
                            i29 = i27 | i30;
                        } else {
                            i29 = i27;
                        }
                        i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                        if (i31 != 0) {
                            i33 = i29 | 24576;
                        } else {
                            i32 = i29;
                            if ((i4 & 24576) == 0) {
                                i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                            } else {
                                i33 = i32;
                            }
                        }
                        i34 = i5 & 32768;
                        if (i34 != 0) {
                            i33 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                        }
                        if ((i26 & 306783379) == 306783378 || (i33 & 74899) != 74898) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (bVarI.q(i26 & 1, z6)) {
                            bVarI.A0();
                            i37 = i3 & 1;
                            c0042a = a.C0041a.a;
                            if (i37 != 0 || bVarI.h0()) {
                                if (i42 != 0) {
                                    dVar2 = d.a.b;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i9 != 0) {
                                    z5 = false;
                                }
                                if (i11 != 0) {
                                    imf0Var2 = imf0.d;
                                }
                                if (i13 != 0) {
                                    gopVar2 = gop.e;
                                }
                                if (i15 != 0) {
                                    tnpVar4 = tnp.d;
                                } else {
                                    tnpVar4 = tnpVar2;
                                }
                                if (i17 != 0) {
                                    z10 = false;
                                } else {
                                    z10 = z3;
                                }
                                if ((i5 & 512) != 0) {
                                    if (z10) {
                                        i38 = 1;
                                    } else {
                                        i38 = Reader.READ_DONE;
                                    }
                                    i26 &= -1879048193;
                                } else {
                                    i38 = i;
                                }
                                if (i19 != 0) {
                                    i39 = 1;
                                } else {
                                    i39 = i2;
                                }
                                if (i22 != 0) {
                                    uni0Var3 = uni0.a.a;
                                } else {
                                    uni0Var3 = uni0Var;
                                }
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new ta2(0);
                                    bVarI.r(objY);
                                }
                                Function1<? super ukf0, Unit> function5 = (Function1) objY;
                                if (i28 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                function4 = function5;
                                if (i31 != 0) {
                                    soa0Var = new soa0(j58.b);
                                } else {
                                    soa0Var = ya5Var;
                                }
                                if (i34 != 0) {
                                    gajVar3 = sr8.a;
                                } else {
                                    gajVar3 = gajVar;
                                }
                                ya5Var3 = soa0Var;
                                z11 = z4;
                                dVar4 = dVar2;
                                gopVar4 = gopVar2;
                                pswVar4 = pswVar3;
                            } else {
                                bVarI.G();
                                if ((i5 & 512) != 0) {
                                    int i43 = i26 & (-1879048193);
                                    z10 = z3;
                                    i38 = i;
                                    i39 = i2;
                                    function4 = function2;
                                    ya5Var3 = ya5Var;
                                    gajVar3 = gajVar;
                                    tnpVar4 = tnpVar2;
                                    z11 = z4;
                                    z5 = z5;
                                    dVar4 = dVar2;
                                    imf0Var2 = imf0Var2;
                                    uni0Var3 = uni0Var;
                                    pswVar4 = pswVar;
                                    i26 = i43;
                                    gopVar4 = gopVar2;
                                } else {
                                    z10 = z3;
                                    i38 = i;
                                    i39 = i2;
                                    function4 = function2;
                                    ya5Var3 = ya5Var;
                                    gajVar3 = gajVar;
                                    tnpVar4 = tnpVar2;
                                    z5 = z5;
                                    imf0Var2 = imf0Var2;
                                    gopVar4 = gopVar2;
                                    i26 = i26;
                                    uni0Var3 = uni0Var;
                                    z11 = z4;
                                    dVar4 = dVar2;
                                    pswVar4 = pswVar;
                                }
                            }
                            bVarI.Y();
                            objY2 = bVarI.y();
                            d dVar5 = dVar4;
                            imf0 imf0Var4 = imf0Var2;
                            if (objY2 == c0042a) {
                                objY2 = m.b(new ijf0(str, 0L, 6));
                                bVarI.r(objY2);
                            }
                            ytwVar = (ytw) objY2;
                            ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                            zM = bVarI.M(ijf0VarB);
                            objY3 = bVarI.y();
                            if (!zM || objY3 == c0042a) {
                                z12 = false;
                                objY3 = new ua2(0, ijf0VarB, ytwVar);
                                bVarI.r(objY3);
                            } else {
                                z12 = false;
                            }
                            use useVar = xvf.a;
                            bVarI.t((Function0) objY3);
                            if ((i26 & 14) == 4) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            objY4 = bVarI.y();
                            if (z13 || objY4 == c0042a) {
                                objY4 = m.b(str);
                                bVarI.r(objY4);
                            }
                            ytwVar2 = (ytw) objY4;
                            int i44 = i33;
                            bcn bcnVarB = gopVar4.b(z10);
                            boolean z14 = !z10;
                            if (z10) {
                                i40 = 1;
                            } else {
                                i40 = i39;
                            }
                            if (z10) {
                                i41 = 1;
                            } else {
                                i41 = i38;
                            }
                            gop gopVar5 = gopVar4;
                            zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                            objY5 = bVarI.y();
                            if (zM2 || objY5 == c0042a) {
                                objY5 = new Function1() { // from class: va2
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        ijf0 ijf0Var = (ijf0) obj;
                                        ytwVar.setValue(ijf0Var);
                                        ytw ytwVar3 = ytwVar2;
                                        boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                        nk0 nk0Var = ijf0Var.a;
                                        ytwVar3.setValue(nk0Var.b);
                                        if (!zG) {
                                            function1.invoke(nk0Var.b);
                                        }
                                        return Unit.a;
                                    }
                                };
                                bVarI.r(objY5);
                            }
                            int i45 = i44 << 9;
                            bVar = bVarI;
                            boolean z15 = z10;
                            j4b.a(ijf0VarB, (Function1) objY5, dVar5, imf0Var4, uni0Var3, function4, pswVar4, ya5Var3, z14, i41, i40, bcnVarB, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i45 & 57344) | 196608 | (3670016 & i45) | (i45 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i44));
                            dVar3 = dVar5;
                            imf0Var3 = imf0Var4;
                            pswVar2 = pswVar4;
                            ya5Var2 = ya5Var3;
                            tnpVar3 = tnpVar4;
                            z8 = z11;
                            z9 = z5;
                            gajVar2 = gajVar3;
                            gopVar3 = gopVar5;
                            z7 = z15;
                            uni0Var2 = uni0Var3;
                            function3 = function4;
                            i36 = i38;
                            i35 = i39;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            z7 = z3;
                            i35 = i2;
                            function3 = function2;
                            gajVar2 = gajVar;
                            z8 = z4;
                            z9 = z5;
                            dVar3 = dVar2;
                            imf0Var3 = imf0Var2;
                            i36 = i;
                            uni0Var2 = uni0Var;
                            pswVar2 = pswVar;
                            tnpVar3 = tnpVar2;
                            gopVar3 = gopVar2;
                            ya5Var2 = ya5Var;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: wa2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = qj40.a(i3 | 1);
                                    int iA2 = qj40.a(i4);
                                    ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i6 |= 100663296;
                    if ((i3 & 805306368) != 0) {
                        i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                    }
                    i19 = i5 & 1024;
                    if (i19 != 0) {
                        i21 = i4 | 6;
                    } else {
                        if (bVarI.d(i2)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i21 = i4 | i20;
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                        i24 = i21 | 48;
                    } else {
                        if (bVarI.M(uni0Var)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i24 = i21 | i23;
                    }
                    i25 = i24;
                    i26 = i6;
                    i27 = i25 | 384;
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i29 = i25 | 3456;
                    } else if ((i4 & 3072) == 0) {
                        if (bVarI.M(pswVar)) {
                            i30 = 2048;
                        } else {
                            i30 = 1024;
                        }
                        i29 = i27 | i30;
                    } else {
                        i29 = i27;
                    }
                    i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i31 != 0) {
                        i33 = i29 | 24576;
                    } else {
                        i32 = i29;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (bVarI.q(i26 & 1, z6)) {
                        bVarI.A0();
                        i37 = i3 & 1;
                        c0042a = a.C0041a.a;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function6 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function6;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        } else {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function7 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function7;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        }
                        bVarI.Y();
                        objY2 = bVarI.y();
                        d dVar6 = dVar4;
                        imf0 imf0Var5 = imf0Var2;
                        if (objY2 == c0042a) {
                            objY2 = m.b(new ijf0(str, 0L, 6));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                        zM = bVarI.M(ijf0VarB);
                        objY3 = bVarI.y();
                        if (zM) {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        } else {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        }
                        use useVar2 = xvf.a;
                        bVarI.t((Function0) objY3);
                        if ((i26 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        objY4 = bVarI.y();
                        if (z13) {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        } else {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        }
                        ytwVar2 = (ytw) objY4;
                        int i46 = i33;
                        bcn bcnVarB2 = gopVar4.b(z10);
                        boolean z16 = !z10;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i39;
                        }
                        if (z10) {
                            i41 = 1;
                        } else {
                            i41 = i38;
                        }
                        gop gopVar6 = gopVar4;
                        zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                        objY5 = bVarI.y();
                        if (zM2) {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        int i47 = i46 << 9;
                        bVar = bVarI;
                        boolean z17 = z10;
                        j4b.a(ijf0VarB, (Function1) objY5, dVar6, imf0Var5, uni0Var3, function4, pswVar4, ya5Var3, z16, i41, i40, bcnVarB2, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i47 & 57344) | 196608 | (3670016 & i47) | (i47 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i46));
                        dVar3 = dVar6;
                        imf0Var3 = imf0Var5;
                        pswVar2 = pswVar4;
                        ya5Var2 = ya5Var3;
                        tnpVar3 = tnpVar4;
                        z8 = z11;
                        z9 = z5;
                        gajVar2 = gajVar3;
                        gopVar3 = gopVar6;
                        z7 = z17;
                        uni0Var2 = uni0Var3;
                        function3 = function4;
                        i36 = i38;
                        i35 = i39;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        z7 = z3;
                        i35 = i2;
                        function3 = function2;
                        gajVar2 = gajVar;
                        z8 = z4;
                        z9 = z5;
                        dVar3 = dVar2;
                        imf0Var3 = imf0Var2;
                        i36 = i;
                        uni0Var2 = uni0Var;
                        pswVar2 = pswVar;
                        tnpVar3 = tnpVar2;
                        gopVar3 = gopVar2;
                        ya5Var2 = ya5Var;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: wa2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i3 | 1);
                                int iA2 = qj40.a(i4);
                                ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 24576;
                z5 = z2;
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    imf0Var2 = imf0Var;
                } else {
                    imf0Var2 = imf0Var;
                    if ((i3 & 196608) == 0) {
                        if (bVarI.M(imf0Var2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    gopVar2 = gopVar;
                } else {
                    gopVar2 = gopVar;
                    if ((i3 & 1572864) == 0) {
                        if (bVarI.M(gopVar2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    tnpVar2 = tnpVar;
                } else {
                    tnpVar2 = tnpVar;
                    if ((i3 & 12582912) == 0) {
                        if (bVarI.M(tnpVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bVarI.b(z3)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    if ((i3 & 805306368) != 0) {
                        i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                    }
                    i19 = i5 & 1024;
                    if (i19 != 0) {
                        i21 = i4 | 6;
                    } else {
                        if (bVarI.d(i2)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i21 = i4 | i20;
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                        i24 = i21 | 48;
                    } else {
                        if (bVarI.M(uni0Var)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i24 = i21 | i23;
                    }
                    i25 = i24;
                    i26 = i6;
                    i27 = i25 | 384;
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i29 = i25 | 3456;
                    } else if ((i4 & 3072) == 0) {
                        if (bVarI.M(pswVar)) {
                            i30 = 2048;
                        } else {
                            i30 = 1024;
                        }
                        i29 = i27 | i30;
                    } else {
                        i29 = i27;
                    }
                    i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i31 != 0) {
                        i33 = i29 | 24576;
                    } else {
                        i32 = i29;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (bVarI.q(i26 & 1, z6)) {
                        bVarI.A0();
                        i37 = i3 & 1;
                        c0042a = a.C0041a.a;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function8 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function8;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        } else {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function9 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function9;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        }
                        bVarI.Y();
                        objY2 = bVarI.y();
                        d dVar7 = dVar4;
                        imf0 imf0Var6 = imf0Var2;
                        if (objY2 == c0042a) {
                            objY2 = m.b(new ijf0(str, 0L, 6));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                        zM = bVarI.M(ijf0VarB);
                        objY3 = bVarI.y();
                        if (zM) {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        } else {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        }
                        use useVar3 = xvf.a;
                        bVarI.t((Function0) objY3);
                        if ((i26 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        objY4 = bVarI.y();
                        if (z13) {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        } else {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        }
                        ytwVar2 = (ytw) objY4;
                        int i48 = i33;
                        bcn bcnVarB3 = gopVar4.b(z10);
                        boolean z18 = !z10;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i39;
                        }
                        if (z10) {
                            i41 = 1;
                        } else {
                            i41 = i38;
                        }
                        gop gopVar7 = gopVar4;
                        zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                        objY5 = bVarI.y();
                        if (zM2) {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        int i49 = i48 << 9;
                        bVar = bVarI;
                        boolean z19 = z10;
                        j4b.a(ijf0VarB, (Function1) objY5, dVar7, imf0Var6, uni0Var3, function4, pswVar4, ya5Var3, z18, i41, i40, bcnVarB3, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i49 & 57344) | 196608 | (3670016 & i49) | (i49 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i48));
                        dVar3 = dVar7;
                        imf0Var3 = imf0Var6;
                        pswVar2 = pswVar4;
                        ya5Var2 = ya5Var3;
                        tnpVar3 = tnpVar4;
                        z8 = z11;
                        z9 = z5;
                        gajVar2 = gajVar3;
                        gopVar3 = gopVar7;
                        z7 = z19;
                        uni0Var2 = uni0Var3;
                        function3 = function4;
                        i36 = i38;
                        i35 = i39;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        z7 = z3;
                        i35 = i2;
                        function3 = function2;
                        gajVar2 = gajVar;
                        z8 = z4;
                        z9 = z5;
                        dVar3 = dVar2;
                        imf0Var3 = imf0Var2;
                        i36 = i;
                        uni0Var2 = uni0Var;
                        pswVar2 = pswVar;
                        tnpVar3 = tnpVar2;
                        gopVar3 = gopVar2;
                        ya5Var2 = ya5Var;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: wa2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i3 | 1);
                                int iA2 = qj40.a(i4);
                                ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 100663296;
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i21 = i4 | 6;
                } else {
                    if (bVarI.d(i2)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i24 = i21 | 48;
                } else {
                    if (bVarI.M(uni0Var)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i24 = i21 | i23;
                }
                i25 = i24;
                i26 = i6;
                i27 = i25 | 384;
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i29 = i25 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (bVarI.M(pswVar)) {
                        i30 = 2048;
                    } else {
                        i30 = 1024;
                    }
                    i29 = i27 | i30;
                } else {
                    i29 = i27;
                }
                i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i31 != 0) {
                    i33 = i29 | 24576;
                } else {
                    i32 = i29;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i26 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bVarI.q(i26 & 1, z6)) {
                    bVarI.A0();
                    i37 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function10 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function10;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    } else {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function11 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function11;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    }
                    bVarI.Y();
                    objY2 = bVarI.y();
                    d dVar8 = dVar4;
                    imf0 imf0Var7 = imf0Var2;
                    if (objY2 == c0042a) {
                        objY2 = m.b(new ijf0(str, 0L, 6));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                    zM = bVarI.M(ijf0VarB);
                    objY3 = bVarI.y();
                    if (zM) {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    } else {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    }
                    use useVar4 = xvf.a;
                    bVarI.t((Function0) objY3);
                    if ((i26 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    objY4 = bVarI.y();
                    if (z13) {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    } else {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    }
                    ytwVar2 = (ytw) objY4;
                    int i410 = i33;
                    bcn bcnVarB4 = gopVar4.b(z10);
                    boolean z110 = !z10;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i39;
                    }
                    if (z10) {
                        i41 = 1;
                    } else {
                        i41 = i38;
                    }
                    gop gopVar8 = gopVar4;
                    zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                    objY5 = bVarI.y();
                    if (zM2) {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    int i411 = i410 << 9;
                    bVar = bVarI;
                    boolean z111 = z10;
                    j4b.a(ijf0VarB, (Function1) objY5, dVar8, imf0Var7, uni0Var3, function4, pswVar4, ya5Var3, z110, i41, i40, bcnVarB4, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i411 & 57344) | 196608 | (3670016 & i411) | (i411 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i410));
                    dVar3 = dVar8;
                    imf0Var3 = imf0Var7;
                    pswVar2 = pswVar4;
                    ya5Var2 = ya5Var3;
                    tnpVar3 = tnpVar4;
                    z8 = z11;
                    z9 = z5;
                    gajVar2 = gajVar3;
                    gopVar3 = gopVar8;
                    z7 = z111;
                    uni0Var2 = uni0Var3;
                    function3 = function4;
                    i36 = i38;
                    i35 = i39;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z7 = z3;
                    i35 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                    z8 = z4;
                    z9 = z5;
                    dVar3 = dVar2;
                    imf0Var3 = imf0Var2;
                    i36 = i;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    ya5Var2 = ya5Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wa2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 3072;
            z4 = z;
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (bVarI.b(z5)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    imf0Var2 = imf0Var;
                } else {
                    imf0Var2 = imf0Var;
                    if ((i3 & 196608) == 0) {
                        if (bVarI.M(imf0Var2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    gopVar2 = gopVar;
                } else {
                    gopVar2 = gopVar;
                    if ((i3 & 1572864) == 0) {
                        if (bVarI.M(gopVar2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    tnpVar2 = tnpVar;
                } else {
                    tnpVar2 = tnpVar;
                    if ((i3 & 12582912) == 0) {
                        if (bVarI.M(tnpVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bVarI.b(z3)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    if ((i3 & 805306368) != 0) {
                        i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                    }
                    i19 = i5 & 1024;
                    if (i19 != 0) {
                        i21 = i4 | 6;
                    } else {
                        if (bVarI.d(i2)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i21 = i4 | i20;
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                        i24 = i21 | 48;
                    } else {
                        if (bVarI.M(uni0Var)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i24 = i21 | i23;
                    }
                    i25 = i24;
                    i26 = i6;
                    i27 = i25 | 384;
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i29 = i25 | 3456;
                    } else if ((i4 & 3072) == 0) {
                        if (bVarI.M(pswVar)) {
                            i30 = 2048;
                        } else {
                            i30 = 1024;
                        }
                        i29 = i27 | i30;
                    } else {
                        i29 = i27;
                    }
                    i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i31 != 0) {
                        i33 = i29 | 24576;
                    } else {
                        i32 = i29;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (bVarI.q(i26 & 1, z6)) {
                        bVarI.A0();
                        i37 = i3 & 1;
                        c0042a = a.C0041a.a;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function12 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function12;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        } else {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function13 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function13;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        }
                        bVarI.Y();
                        objY2 = bVarI.y();
                        d dVar9 = dVar4;
                        imf0 imf0Var8 = imf0Var2;
                        if (objY2 == c0042a) {
                            objY2 = m.b(new ijf0(str, 0L, 6));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                        zM = bVarI.M(ijf0VarB);
                        objY3 = bVarI.y();
                        if (zM) {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        } else {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        }
                        use useVar5 = xvf.a;
                        bVarI.t((Function0) objY3);
                        if ((i26 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        objY4 = bVarI.y();
                        if (z13) {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        } else {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        }
                        ytwVar2 = (ytw) objY4;
                        int i412 = i33;
                        bcn bcnVarB5 = gopVar4.b(z10);
                        boolean z112 = !z10;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i39;
                        }
                        if (z10) {
                            i41 = 1;
                        } else {
                            i41 = i38;
                        }
                        gop gopVar9 = gopVar4;
                        zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                        objY5 = bVarI.y();
                        if (zM2) {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        int i413 = i412 << 9;
                        bVar = bVarI;
                        boolean z113 = z10;
                        j4b.a(ijf0VarB, (Function1) objY5, dVar9, imf0Var8, uni0Var3, function4, pswVar4, ya5Var3, z112, i41, i40, bcnVarB5, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i413 & 57344) | 196608 | (3670016 & i413) | (i413 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i412));
                        dVar3 = dVar9;
                        imf0Var3 = imf0Var8;
                        pswVar2 = pswVar4;
                        ya5Var2 = ya5Var3;
                        tnpVar3 = tnpVar4;
                        z8 = z11;
                        z9 = z5;
                        gajVar2 = gajVar3;
                        gopVar3 = gopVar9;
                        z7 = z113;
                        uni0Var2 = uni0Var3;
                        function3 = function4;
                        i36 = i38;
                        i35 = i39;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        z7 = z3;
                        i35 = i2;
                        function3 = function2;
                        gajVar2 = gajVar;
                        z8 = z4;
                        z9 = z5;
                        dVar3 = dVar2;
                        imf0Var3 = imf0Var2;
                        i36 = i;
                        uni0Var2 = uni0Var;
                        pswVar2 = pswVar;
                        tnpVar3 = tnpVar2;
                        gopVar3 = gopVar2;
                        ya5Var2 = ya5Var;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: wa2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i3 | 1);
                                int iA2 = qj40.a(i4);
                                ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 100663296;
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i21 = i4 | 6;
                } else {
                    if (bVarI.d(i2)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i24 = i21 | 48;
                } else {
                    if (bVarI.M(uni0Var)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i24 = i21 | i23;
                }
                i25 = i24;
                i26 = i6;
                i27 = i25 | 384;
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i29 = i25 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (bVarI.M(pswVar)) {
                        i30 = 2048;
                    } else {
                        i30 = 1024;
                    }
                    i29 = i27 | i30;
                } else {
                    i29 = i27;
                }
                i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i31 != 0) {
                    i33 = i29 | 24576;
                } else {
                    i32 = i29;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i26 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bVarI.q(i26 & 1, z6)) {
                    bVarI.A0();
                    i37 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function14 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function14;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    } else {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function15 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function15;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    }
                    bVarI.Y();
                    objY2 = bVarI.y();
                    d dVar10 = dVar4;
                    imf0 imf0Var9 = imf0Var2;
                    if (objY2 == c0042a) {
                        objY2 = m.b(new ijf0(str, 0L, 6));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                    zM = bVarI.M(ijf0VarB);
                    objY3 = bVarI.y();
                    if (zM) {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    } else {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    }
                    use useVar6 = xvf.a;
                    bVarI.t((Function0) objY3);
                    if ((i26 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    objY4 = bVarI.y();
                    if (z13) {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    } else {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    }
                    ytwVar2 = (ytw) objY4;
                    int i414 = i33;
                    bcn bcnVarB6 = gopVar4.b(z10);
                    boolean z114 = !z10;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i39;
                    }
                    if (z10) {
                        i41 = 1;
                    } else {
                        i41 = i38;
                    }
                    gop gopVar10 = gopVar4;
                    zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                    objY5 = bVarI.y();
                    if (zM2) {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    int i415 = i414 << 9;
                    bVar = bVarI;
                    boolean z115 = z10;
                    j4b.a(ijf0VarB, (Function1) objY5, dVar10, imf0Var9, uni0Var3, function4, pswVar4, ya5Var3, z114, i41, i40, bcnVarB6, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i415 & 57344) | 196608 | (3670016 & i415) | (i415 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i414));
                    dVar3 = dVar10;
                    imf0Var3 = imf0Var9;
                    pswVar2 = pswVar4;
                    ya5Var2 = ya5Var3;
                    tnpVar3 = tnpVar4;
                    z8 = z11;
                    z9 = z5;
                    gajVar2 = gajVar3;
                    gopVar3 = gopVar10;
                    z7 = z115;
                    uni0Var2 = uni0Var3;
                    function3 = function4;
                    i36 = i38;
                    i35 = i39;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z7 = z3;
                    i35 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                    z8 = z4;
                    z9 = z5;
                    dVar3 = dVar2;
                    imf0Var3 = imf0Var2;
                    i36 = i;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    ya5Var2 = ya5Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wa2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            z5 = z2;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                imf0Var2 = imf0Var;
            } else {
                imf0Var2 = imf0Var;
                if ((i3 & 196608) == 0) {
                    if (bVarI.M(imf0Var2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i3 & 1572864) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                tnpVar2 = tnpVar;
            } else {
                tnpVar2 = tnpVar;
                if ((i3 & 12582912) == 0) {
                    if (bVarI.M(tnpVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bVarI.b(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i21 = i4 | 6;
                } else {
                    if (bVarI.d(i2)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i24 = i21 | 48;
                } else {
                    if (bVarI.M(uni0Var)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i24 = i21 | i23;
                }
                i25 = i24;
                i26 = i6;
                i27 = i25 | 384;
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i29 = i25 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (bVarI.M(pswVar)) {
                        i30 = 2048;
                    } else {
                        i30 = 1024;
                    }
                    i29 = i27 | i30;
                } else {
                    i29 = i27;
                }
                i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i31 != 0) {
                    i33 = i29 | 24576;
                } else {
                    i32 = i29;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i26 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bVarI.q(i26 & 1, z6)) {
                    bVarI.A0();
                    i37 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function16 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function16;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    } else {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function17 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function17;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    }
                    bVarI.Y();
                    objY2 = bVarI.y();
                    d dVar11 = dVar4;
                    imf0 imf0Var10 = imf0Var2;
                    if (objY2 == c0042a) {
                        objY2 = m.b(new ijf0(str, 0L, 6));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                    zM = bVarI.M(ijf0VarB);
                    objY3 = bVarI.y();
                    if (zM) {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    } else {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    }
                    use useVar7 = xvf.a;
                    bVarI.t((Function0) objY3);
                    if ((i26 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    objY4 = bVarI.y();
                    if (z13) {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    } else {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    }
                    ytwVar2 = (ytw) objY4;
                    int i416 = i33;
                    bcn bcnVarB7 = gopVar4.b(z10);
                    boolean z116 = !z10;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i39;
                    }
                    if (z10) {
                        i41 = 1;
                    } else {
                        i41 = i38;
                    }
                    gop gopVar11 = gopVar4;
                    zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                    objY5 = bVarI.y();
                    if (zM2) {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    int i417 = i416 << 9;
                    bVar = bVarI;
                    boolean z117 = z10;
                    j4b.a(ijf0VarB, (Function1) objY5, dVar11, imf0Var10, uni0Var3, function4, pswVar4, ya5Var3, z116, i41, i40, bcnVarB7, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i417 & 57344) | 196608 | (3670016 & i417) | (i417 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i416));
                    dVar3 = dVar11;
                    imf0Var3 = imf0Var10;
                    pswVar2 = pswVar4;
                    ya5Var2 = ya5Var3;
                    tnpVar3 = tnpVar4;
                    z8 = z11;
                    z9 = z5;
                    gajVar2 = gajVar3;
                    gopVar3 = gopVar11;
                    z7 = z117;
                    uni0Var2 = uni0Var3;
                    function3 = function4;
                    i36 = i38;
                    i35 = i39;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z7 = z3;
                    i35 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                    z8 = z4;
                    z9 = z5;
                    dVar3 = dVar2;
                    imf0Var3 = imf0Var2;
                    i36 = i;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    ya5Var2 = ya5Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wa2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 100663296;
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i21 = i4 | 6;
            } else {
                if (bVarI.d(i2)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i21 = i4 | i20;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i24 = i21 | 48;
            } else {
                if (bVarI.M(uni0Var)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i24 = i21 | i23;
            }
            i25 = i24;
            i26 = i6;
            i27 = i25 | 384;
            i28 = i5 & 8192;
            if (i28 != 0) {
                i29 = i25 | 3456;
            } else if ((i4 & 3072) == 0) {
                if (bVarI.M(pswVar)) {
                    i30 = 2048;
                } else {
                    i30 = 1024;
                }
                i29 = i27 | i30;
            } else {
                i29 = i27;
            }
            i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i31 != 0) {
                i33 = i29 | 24576;
            } else {
                i32 = i29;
                if ((i4 & 24576) == 0) {
                    i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                } else {
                    i33 = i32;
                }
            }
            i34 = i5 & 32768;
            if (i34 != 0) {
                i33 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i33 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i26 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bVarI.q(i26 & 1, z6)) {
                bVarI.A0();
                i37 = i3 & 1;
                c0042a = a.C0041a.a;
                if (i37 != 0) {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function18 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function18;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                } else {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function19 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function19;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                }
                bVarI.Y();
                objY2 = bVarI.y();
                d dVar12 = dVar4;
                imf0 imf0Var11 = imf0Var2;
                if (objY2 == c0042a) {
                    objY2 = m.b(new ijf0(str, 0L, 6));
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                zM = bVarI.M(ijf0VarB);
                objY3 = bVarI.y();
                if (zM) {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                } else {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                }
                use useVar8 = xvf.a;
                bVarI.t((Function0) objY3);
                if ((i26 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                objY4 = bVarI.y();
                if (z13) {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                } else {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                }
                ytwVar2 = (ytw) objY4;
                int i418 = i33;
                bcn bcnVarB8 = gopVar4.b(z10);
                boolean z118 = !z10;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i39;
                }
                if (z10) {
                    i41 = 1;
                } else {
                    i41 = i38;
                }
                gop gopVar12 = gopVar4;
                zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                objY5 = bVarI.y();
                if (zM2) {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                int i419 = i418 << 9;
                bVar = bVarI;
                boolean z119 = z10;
                j4b.a(ijf0VarB, (Function1) objY5, dVar12, imf0Var11, uni0Var3, function4, pswVar4, ya5Var3, z118, i41, i40, bcnVarB8, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i419 & 57344) | 196608 | (3670016 & i419) | (i419 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i418));
                dVar3 = dVar12;
                imf0Var3 = imf0Var11;
                pswVar2 = pswVar4;
                ya5Var2 = ya5Var3;
                tnpVar3 = tnpVar4;
                z8 = z11;
                z9 = z5;
                gajVar2 = gajVar3;
                gopVar3 = gopVar12;
                z7 = z119;
                uni0Var2 = uni0Var3;
                function3 = function4;
                i36 = i38;
                i35 = i39;
            } else {
                bVar = bVarI;
                bVar.G();
                z7 = z3;
                i35 = i2;
                function3 = function2;
                gajVar2 = gajVar;
                z8 = z4;
                z9 = z5;
                dVar3 = dVar2;
                imf0Var3 = imf0Var2;
                i36 = i;
                uni0Var2 = uni0Var;
                pswVar2 = pswVar;
                tnpVar3 = tnpVar2;
                gopVar3 = gopVar2;
                ya5Var2 = ya5Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wa2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 384;
        dVar2 = dVar;
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i3 & 3072) == 0) {
                z4 = z;
                if (bVarI.b(z4)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    z5 = z2;
                    if (bVarI.b(z5)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i6 |= 196608;
                    imf0Var2 = imf0Var;
                } else {
                    imf0Var2 = imf0Var;
                    if ((i3 & 196608) == 0) {
                        if (bVarI.M(imf0Var2)) {
                            i12 = 131072;
                        } else {
                            i12 = 65536;
                        }
                        i6 |= i12;
                    }
                }
                i13 = i5 & 64;
                if (i13 != 0) {
                    i6 |= 1572864;
                    gopVar2 = gopVar;
                } else {
                    gopVar2 = gopVar;
                    if ((i3 & 1572864) == 0) {
                        if (bVarI.M(gopVar2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                        i6 |= i14;
                    }
                }
                i15 = i5 & 128;
                if (i15 != 0) {
                    i6 |= 12582912;
                    tnpVar2 = tnpVar;
                } else {
                    tnpVar2 = tnpVar;
                    if ((i3 & 12582912) == 0) {
                        if (bVarI.M(tnpVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i6 |= i16;
                    }
                }
                i17 = i5 & 256;
                if (i17 != 0) {
                    if ((i3 & 100663296) == 0) {
                        if (bVarI.b(z3)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i6 |= i18;
                    }
                    if ((i3 & 805306368) != 0) {
                        i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                    }
                    i19 = i5 & 1024;
                    if (i19 != 0) {
                        i21 = i4 | 6;
                    } else {
                        if (bVarI.d(i2)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i21 = i4 | i20;
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                        i24 = i21 | 48;
                    } else {
                        if (bVarI.M(uni0Var)) {
                            i23 = 32;
                        } else {
                            i23 = 16;
                        }
                        i24 = i21 | i23;
                    }
                    i25 = i24;
                    i26 = i6;
                    i27 = i25 | 384;
                    i28 = i5 & 8192;
                    if (i28 != 0) {
                        i29 = i25 | 3456;
                    } else if ((i4 & 3072) == 0) {
                        if (bVarI.M(pswVar)) {
                            i30 = 2048;
                        } else {
                            i30 = 1024;
                        }
                        i29 = i27 | i30;
                    } else {
                        i29 = i27;
                    }
                    i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                    if (i31 != 0) {
                        i33 = i29 | 24576;
                    } else {
                        i32 = i29;
                        if ((i4 & 24576) == 0) {
                            i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                        } else {
                            i33 = i32;
                        }
                    }
                    i34 = i5 & 32768;
                    if (i34 != 0) {
                        i33 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                    }
                    if ((i26 & 306783379) == 306783378) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (bVarI.q(i26 & 1, z6)) {
                        bVarI.A0();
                        i37 = i3 & 1;
                        c0042a = a.C0041a.a;
                        if (i37 != 0) {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function110 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function110;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        } else {
                            if (i42 != 0) {
                                dVar2 = d.a.b;
                            }
                            if (i7 != 0) {
                                z4 = true;
                            }
                            if (i9 != 0) {
                                z5 = false;
                            }
                            if (i11 != 0) {
                                imf0Var2 = imf0.d;
                            }
                            if (i13 != 0) {
                                gopVar2 = gop.e;
                            }
                            if (i15 != 0) {
                                tnpVar4 = tnp.d;
                            } else {
                                tnpVar4 = tnpVar2;
                            }
                            if (i17 != 0) {
                                z10 = false;
                            } else {
                                z10 = z3;
                            }
                            if ((i5 & 512) != 0) {
                                if (z10) {
                                    i38 = 1;
                                } else {
                                    i38 = Reader.READ_DONE;
                                }
                                i26 &= -1879048193;
                            } else {
                                i38 = i;
                            }
                            if (i19 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i2;
                            }
                            if (i22 != 0) {
                                uni0Var3 = uni0.a.a;
                            } else {
                                uni0Var3 = uni0Var;
                            }
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new ta2(0);
                                bVarI.r(objY);
                            }
                            Function1<? super ukf0, Unit> function111 = (Function1) objY;
                            if (i28 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            function4 = function111;
                            if (i31 != 0) {
                                soa0Var = new soa0(j58.b);
                            } else {
                                soa0Var = ya5Var;
                            }
                            if (i34 != 0) {
                                gajVar3 = sr8.a;
                            } else {
                                gajVar3 = gajVar;
                            }
                            ya5Var3 = soa0Var;
                            z11 = z4;
                            dVar4 = dVar2;
                            gopVar4 = gopVar2;
                            pswVar4 = pswVar3;
                        }
                        bVarI.Y();
                        objY2 = bVarI.y();
                        d dVar13 = dVar4;
                        imf0 imf0Var12 = imf0Var2;
                        if (objY2 == c0042a) {
                            objY2 = m.b(new ijf0(str, 0L, 6));
                            bVarI.r(objY2);
                        }
                        ytwVar = (ytw) objY2;
                        ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                        zM = bVarI.M(ijf0VarB);
                        objY3 = bVarI.y();
                        if (zM) {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        } else {
                            z12 = false;
                            objY3 = new ua2(0, ijf0VarB, ytwVar);
                            bVarI.r(objY3);
                        }
                        use useVar9 = xvf.a;
                        bVarI.t((Function0) objY3);
                        if ((i26 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        objY4 = bVarI.y();
                        if (z13) {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        } else {
                            objY4 = m.b(str);
                            bVarI.r(objY4);
                        }
                        ytwVar2 = (ytw) objY4;
                        int i4110 = i33;
                        bcn bcnVarB9 = gopVar4.b(z10);
                        boolean z1110 = !z10;
                        if (z10) {
                            i40 = 1;
                        } else {
                            i40 = i39;
                        }
                        if (z10) {
                            i41 = 1;
                        } else {
                            i41 = i38;
                        }
                        gop gopVar13 = gopVar4;
                        zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                        objY5 = bVarI.y();
                        if (zM2) {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            objY5 = new Function1() { // from class: va2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ijf0 ijf0Var = (ijf0) obj;
                                    ytwVar.setValue(ijf0Var);
                                    ytw ytwVar3 = ytwVar2;
                                    boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                    nk0 nk0Var = ijf0Var.a;
                                    ytwVar3.setValue(nk0Var.b);
                                    if (!zG) {
                                        function1.invoke(nk0Var.b);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        }
                        int i4111 = i4110 << 9;
                        bVar = bVarI;
                        boolean z1111 = z10;
                        j4b.a(ijf0VarB, (Function1) objY5, dVar13, imf0Var12, uni0Var3, function4, pswVar4, ya5Var3, z1110, i41, i40, bcnVarB9, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i4111 & 57344) | 196608 | (3670016 & i4111) | (i4111 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i4110));
                        dVar3 = dVar13;
                        imf0Var3 = imf0Var12;
                        pswVar2 = pswVar4;
                        ya5Var2 = ya5Var3;
                        tnpVar3 = tnpVar4;
                        z8 = z11;
                        z9 = z5;
                        gajVar2 = gajVar3;
                        gopVar3 = gopVar13;
                        z7 = z1111;
                        uni0Var2 = uni0Var3;
                        function3 = function4;
                        i36 = i38;
                        i35 = i39;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        z7 = z3;
                        i35 = i2;
                        function3 = function2;
                        gajVar2 = gajVar;
                        z8 = z4;
                        z9 = z5;
                        dVar3 = dVar2;
                        imf0Var3 = imf0Var2;
                        i36 = i;
                        uni0Var2 = uni0Var;
                        pswVar2 = pswVar;
                        tnpVar3 = tnpVar2;
                        gopVar3 = gopVar2;
                        ya5Var2 = ya5Var;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: wa2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i3 | 1);
                                int iA2 = qj40.a(i4);
                                ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 100663296;
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i21 = i4 | 6;
                } else {
                    if (bVarI.d(i2)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i24 = i21 | 48;
                } else {
                    if (bVarI.M(uni0Var)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i24 = i21 | i23;
                }
                i25 = i24;
                i26 = i6;
                i27 = i25 | 384;
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i29 = i25 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (bVarI.M(pswVar)) {
                        i30 = 2048;
                    } else {
                        i30 = 1024;
                    }
                    i29 = i27 | i30;
                } else {
                    i29 = i27;
                }
                i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i31 != 0) {
                    i33 = i29 | 24576;
                } else {
                    i32 = i29;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i26 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bVarI.q(i26 & 1, z6)) {
                    bVarI.A0();
                    i37 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function112 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function112;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    } else {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function113 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function113;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    }
                    bVarI.Y();
                    objY2 = bVarI.y();
                    d dVar14 = dVar4;
                    imf0 imf0Var13 = imf0Var2;
                    if (objY2 == c0042a) {
                        objY2 = m.b(new ijf0(str, 0L, 6));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                    zM = bVarI.M(ijf0VarB);
                    objY3 = bVarI.y();
                    if (zM) {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    } else {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    }
                    use useVar10 = xvf.a;
                    bVarI.t((Function0) objY3);
                    if ((i26 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    objY4 = bVarI.y();
                    if (z13) {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    } else {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    }
                    ytwVar2 = (ytw) objY4;
                    int i4112 = i33;
                    bcn bcnVarB10 = gopVar4.b(z10);
                    boolean z1112 = !z10;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i39;
                    }
                    if (z10) {
                        i41 = 1;
                    } else {
                        i41 = i38;
                    }
                    gop gopVar14 = gopVar4;
                    zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                    objY5 = bVarI.y();
                    if (zM2) {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    int i4113 = i4112 << 9;
                    bVar = bVarI;
                    boolean z1113 = z10;
                    j4b.a(ijf0VarB, (Function1) objY5, dVar14, imf0Var13, uni0Var3, function4, pswVar4, ya5Var3, z1112, i41, i40, bcnVarB10, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i4113 & 57344) | 196608 | (3670016 & i4113) | (i4113 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i4112));
                    dVar3 = dVar14;
                    imf0Var3 = imf0Var13;
                    pswVar2 = pswVar4;
                    ya5Var2 = ya5Var3;
                    tnpVar3 = tnpVar4;
                    z8 = z11;
                    z9 = z5;
                    gajVar2 = gajVar3;
                    gopVar3 = gopVar14;
                    z7 = z1113;
                    uni0Var2 = uni0Var3;
                    function3 = function4;
                    i36 = i38;
                    i35 = i39;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z7 = z3;
                    i35 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                    z8 = z4;
                    z9 = z5;
                    dVar3 = dVar2;
                    imf0Var3 = imf0Var2;
                    i36 = i;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    ya5Var2 = ya5Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wa2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            z5 = z2;
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                imf0Var2 = imf0Var;
            } else {
                imf0Var2 = imf0Var;
                if ((i3 & 196608) == 0) {
                    if (bVarI.M(imf0Var2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i3 & 1572864) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                tnpVar2 = tnpVar;
            } else {
                tnpVar2 = tnpVar;
                if ((i3 & 12582912) == 0) {
                    if (bVarI.M(tnpVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bVarI.b(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i21 = i4 | 6;
                } else {
                    if (bVarI.d(i2)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i24 = i21 | 48;
                } else {
                    if (bVarI.M(uni0Var)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i24 = i21 | i23;
                }
                i25 = i24;
                i26 = i6;
                i27 = i25 | 384;
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i29 = i25 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (bVarI.M(pswVar)) {
                        i30 = 2048;
                    } else {
                        i30 = 1024;
                    }
                    i29 = i27 | i30;
                } else {
                    i29 = i27;
                }
                i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i31 != 0) {
                    i33 = i29 | 24576;
                } else {
                    i32 = i29;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i26 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bVarI.q(i26 & 1, z6)) {
                    bVarI.A0();
                    i37 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function114 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function114;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    } else {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function115 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function115;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    }
                    bVarI.Y();
                    objY2 = bVarI.y();
                    d dVar15 = dVar4;
                    imf0 imf0Var14 = imf0Var2;
                    if (objY2 == c0042a) {
                        objY2 = m.b(new ijf0(str, 0L, 6));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                    zM = bVarI.M(ijf0VarB);
                    objY3 = bVarI.y();
                    if (zM) {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    } else {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    }
                    use useVar11 = xvf.a;
                    bVarI.t((Function0) objY3);
                    if ((i26 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    objY4 = bVarI.y();
                    if (z13) {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    } else {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    }
                    ytwVar2 = (ytw) objY4;
                    int i4114 = i33;
                    bcn bcnVarB11 = gopVar4.b(z10);
                    boolean z1114 = !z10;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i39;
                    }
                    if (z10) {
                        i41 = 1;
                    } else {
                        i41 = i38;
                    }
                    gop gopVar15 = gopVar4;
                    zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                    objY5 = bVarI.y();
                    if (zM2) {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    int i4115 = i4114 << 9;
                    bVar = bVarI;
                    boolean z1115 = z10;
                    j4b.a(ijf0VarB, (Function1) objY5, dVar15, imf0Var14, uni0Var3, function4, pswVar4, ya5Var3, z1114, i41, i40, bcnVarB11, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i4115 & 57344) | 196608 | (3670016 & i4115) | (i4115 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i4114));
                    dVar3 = dVar15;
                    imf0Var3 = imf0Var14;
                    pswVar2 = pswVar4;
                    ya5Var2 = ya5Var3;
                    tnpVar3 = tnpVar4;
                    z8 = z11;
                    z9 = z5;
                    gajVar2 = gajVar3;
                    gopVar3 = gopVar15;
                    z7 = z1115;
                    uni0Var2 = uni0Var3;
                    function3 = function4;
                    i36 = i38;
                    i35 = i39;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z7 = z3;
                    i35 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                    z8 = z4;
                    z9 = z5;
                    dVar3 = dVar2;
                    imf0Var3 = imf0Var2;
                    i36 = i;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    ya5Var2 = ya5Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wa2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 100663296;
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i21 = i4 | 6;
            } else {
                if (bVarI.d(i2)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i21 = i4 | i20;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i24 = i21 | 48;
            } else {
                if (bVarI.M(uni0Var)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i24 = i21 | i23;
            }
            i25 = i24;
            i26 = i6;
            i27 = i25 | 384;
            i28 = i5 & 8192;
            if (i28 != 0) {
                i29 = i25 | 3456;
            } else if ((i4 & 3072) == 0) {
                if (bVarI.M(pswVar)) {
                    i30 = 2048;
                } else {
                    i30 = 1024;
                }
                i29 = i27 | i30;
            } else {
                i29 = i27;
            }
            i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i31 != 0) {
                i33 = i29 | 24576;
            } else {
                i32 = i29;
                if ((i4 & 24576) == 0) {
                    i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                } else {
                    i33 = i32;
                }
            }
            i34 = i5 & 32768;
            if (i34 != 0) {
                i33 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i33 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i26 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bVarI.q(i26 & 1, z6)) {
                bVarI.A0();
                i37 = i3 & 1;
                c0042a = a.C0041a.a;
                if (i37 != 0) {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function116 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function116;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                } else {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function117 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function117;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                }
                bVarI.Y();
                objY2 = bVarI.y();
                d dVar16 = dVar4;
                imf0 imf0Var15 = imf0Var2;
                if (objY2 == c0042a) {
                    objY2 = m.b(new ijf0(str, 0L, 6));
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                zM = bVarI.M(ijf0VarB);
                objY3 = bVarI.y();
                if (zM) {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                } else {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                }
                use useVar12 = xvf.a;
                bVarI.t((Function0) objY3);
                if ((i26 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                objY4 = bVarI.y();
                if (z13) {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                } else {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                }
                ytwVar2 = (ytw) objY4;
                int i4116 = i33;
                bcn bcnVarB12 = gopVar4.b(z10);
                boolean z1116 = !z10;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i39;
                }
                if (z10) {
                    i41 = 1;
                } else {
                    i41 = i38;
                }
                gop gopVar16 = gopVar4;
                zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                objY5 = bVarI.y();
                if (zM2) {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                int i4117 = i4116 << 9;
                bVar = bVarI;
                boolean z1117 = z10;
                j4b.a(ijf0VarB, (Function1) objY5, dVar16, imf0Var15, uni0Var3, function4, pswVar4, ya5Var3, z1116, i41, i40, bcnVarB12, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i4117 & 57344) | 196608 | (3670016 & i4117) | (i4117 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i4116));
                dVar3 = dVar16;
                imf0Var3 = imf0Var15;
                pswVar2 = pswVar4;
                ya5Var2 = ya5Var3;
                tnpVar3 = tnpVar4;
                z8 = z11;
                z9 = z5;
                gajVar2 = gajVar3;
                gopVar3 = gopVar16;
                z7 = z1117;
                uni0Var2 = uni0Var3;
                function3 = function4;
                i36 = i38;
                i35 = i39;
            } else {
                bVar = bVarI;
                bVar.G();
                z7 = z3;
                i35 = i2;
                function3 = function2;
                gajVar2 = gajVar;
                z8 = z4;
                z9 = z5;
                dVar3 = dVar2;
                imf0Var3 = imf0Var2;
                i36 = i;
                uni0Var2 = uni0Var;
                pswVar2 = pswVar;
                tnpVar3 = tnpVar2;
                gopVar3 = gopVar2;
                ya5Var2 = ya5Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wa2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 3072;
        z4 = z;
        i9 = i5 & 16;
        if (i9 != 0) {
            if ((i3 & 24576) == 0) {
                z5 = z2;
                if (bVarI.b(z5)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i6 |= i10;
            }
            i11 = i5 & 32;
            if (i11 != 0) {
                i6 |= 196608;
                imf0Var2 = imf0Var;
            } else {
                imf0Var2 = imf0Var;
                if ((i3 & 196608) == 0) {
                    if (bVarI.M(imf0Var2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i6 |= i12;
                }
            }
            i13 = i5 & 64;
            if (i13 != 0) {
                i6 |= 1572864;
                gopVar2 = gopVar;
            } else {
                gopVar2 = gopVar;
                if ((i3 & 1572864) == 0) {
                    if (bVarI.M(gopVar2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i6 |= i14;
                }
            }
            i15 = i5 & 128;
            if (i15 != 0) {
                i6 |= 12582912;
                tnpVar2 = tnpVar;
            } else {
                tnpVar2 = tnpVar;
                if ((i3 & 12582912) == 0) {
                    if (bVarI.M(tnpVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i6 |= i16;
                }
            }
            i17 = i5 & 256;
            if (i17 != 0) {
                if ((i3 & 100663296) == 0) {
                    if (bVarI.b(z3)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i6 |= i18;
                }
                if ((i3 & 805306368) != 0) {
                    i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
                }
                i19 = i5 & 1024;
                if (i19 != 0) {
                    i21 = i4 | 6;
                } else {
                    if (bVarI.d(i2)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                    i24 = i21 | 48;
                } else {
                    if (bVarI.M(uni0Var)) {
                        i23 = 32;
                    } else {
                        i23 = 16;
                    }
                    i24 = i21 | i23;
                }
                i25 = i24;
                i26 = i6;
                i27 = i25 | 384;
                i28 = i5 & 8192;
                if (i28 != 0) {
                    i29 = i25 | 3456;
                } else if ((i4 & 3072) == 0) {
                    if (bVarI.M(pswVar)) {
                        i30 = 2048;
                    } else {
                        i30 = 1024;
                    }
                    i29 = i27 | i30;
                } else {
                    i29 = i27;
                }
                i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
                if (i31 != 0) {
                    i33 = i29 | 24576;
                } else {
                    i32 = i29;
                    if ((i4 & 24576) == 0) {
                        i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                    } else {
                        i33 = i32;
                    }
                }
                i34 = i5 & 32768;
                if (i34 != 0) {
                    i33 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i33 |= bVarI.A(gajVar) ? 131072 : 65536;
                }
                if ((i26 & 306783379) == 306783378) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (bVarI.q(i26 & 1, z6)) {
                    bVarI.A0();
                    i37 = i3 & 1;
                    c0042a = a.C0041a.a;
                    if (i37 != 0) {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function118 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function118;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    } else {
                        if (i42 != 0) {
                            dVar2 = d.a.b;
                        }
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i9 != 0) {
                            z5 = false;
                        }
                        if (i11 != 0) {
                            imf0Var2 = imf0.d;
                        }
                        if (i13 != 0) {
                            gopVar2 = gop.e;
                        }
                        if (i15 != 0) {
                            tnpVar4 = tnp.d;
                        } else {
                            tnpVar4 = tnpVar2;
                        }
                        if (i17 != 0) {
                            z10 = false;
                        } else {
                            z10 = z3;
                        }
                        if ((i5 & 512) != 0) {
                            if (z10) {
                                i38 = 1;
                            } else {
                                i38 = Reader.READ_DONE;
                            }
                            i26 &= -1879048193;
                        } else {
                            i38 = i;
                        }
                        if (i19 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i2;
                        }
                        if (i22 != 0) {
                            uni0Var3 = uni0.a.a;
                        } else {
                            uni0Var3 = uni0Var;
                        }
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new ta2(0);
                            bVarI.r(objY);
                        }
                        Function1<? super ukf0, Unit> function119 = (Function1) objY;
                        if (i28 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        function4 = function119;
                        if (i31 != 0) {
                            soa0Var = new soa0(j58.b);
                        } else {
                            soa0Var = ya5Var;
                        }
                        if (i34 != 0) {
                            gajVar3 = sr8.a;
                        } else {
                            gajVar3 = gajVar;
                        }
                        ya5Var3 = soa0Var;
                        z11 = z4;
                        dVar4 = dVar2;
                        gopVar4 = gopVar2;
                        pswVar4 = pswVar3;
                    }
                    bVarI.Y();
                    objY2 = bVarI.y();
                    d dVar17 = dVar4;
                    imf0 imf0Var16 = imf0Var2;
                    if (objY2 == c0042a) {
                        objY2 = m.b(new ijf0(str, 0L, 6));
                        bVarI.r(objY2);
                    }
                    ytwVar = (ytw) objY2;
                    ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                    zM = bVarI.M(ijf0VarB);
                    objY3 = bVarI.y();
                    if (zM) {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    } else {
                        z12 = false;
                        objY3 = new ua2(0, ijf0VarB, ytwVar);
                        bVarI.r(objY3);
                    }
                    use useVar13 = xvf.a;
                    bVarI.t((Function0) objY3);
                    if ((i26 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    objY4 = bVarI.y();
                    if (z13) {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    } else {
                        objY4 = m.b(str);
                        bVarI.r(objY4);
                    }
                    ytwVar2 = (ytw) objY4;
                    int i4118 = i33;
                    bcn bcnVarB13 = gopVar4.b(z10);
                    boolean z1118 = !z10;
                    if (z10) {
                        i40 = 1;
                    } else {
                        i40 = i39;
                    }
                    if (z10) {
                        i41 = 1;
                    } else {
                        i41 = i38;
                    }
                    gop gopVar17 = gopVar4;
                    zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                    objY5 = bVarI.y();
                    if (zM2) {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        objY5 = new Function1() { // from class: va2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ijf0 ijf0Var = (ijf0) obj;
                                ytwVar.setValue(ijf0Var);
                                ytw ytwVar3 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                                nk0 nk0Var = ijf0Var.a;
                                ytwVar3.setValue(nk0Var.b);
                                if (!zG) {
                                    function1.invoke(nk0Var.b);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    int i4119 = i4118 << 9;
                    bVar = bVarI;
                    boolean z1119 = z10;
                    j4b.a(ijf0VarB, (Function1) objY5, dVar17, imf0Var16, uni0Var3, function4, pswVar4, ya5Var3, z1118, i41, i40, bcnVarB13, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i4119 & 57344) | 196608 | (3670016 & i4119) | (i4119 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i4118));
                    dVar3 = dVar17;
                    imf0Var3 = imf0Var16;
                    pswVar2 = pswVar4;
                    ya5Var2 = ya5Var3;
                    tnpVar3 = tnpVar4;
                    z8 = z11;
                    z9 = z5;
                    gajVar2 = gajVar3;
                    gopVar3 = gopVar17;
                    z7 = z1119;
                    uni0Var2 = uni0Var3;
                    function3 = function4;
                    i36 = i38;
                    i35 = i39;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    z7 = z3;
                    i35 = i2;
                    function3 = function2;
                    gajVar2 = gajVar;
                    z8 = z4;
                    z9 = z5;
                    dVar3 = dVar2;
                    imf0Var3 = imf0Var2;
                    i36 = i;
                    uni0Var2 = uni0Var;
                    pswVar2 = pswVar;
                    tnpVar3 = tnpVar2;
                    gopVar3 = gopVar2;
                    ya5Var2 = ya5Var;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: wa2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i3 | 1);
                            int iA2 = qj40.a(i4);
                            ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 100663296;
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i21 = i4 | 6;
            } else {
                if (bVarI.d(i2)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i21 = i4 | i20;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i24 = i21 | 48;
            } else {
                if (bVarI.M(uni0Var)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i24 = i21 | i23;
            }
            i25 = i24;
            i26 = i6;
            i27 = i25 | 384;
            i28 = i5 & 8192;
            if (i28 != 0) {
                i29 = i25 | 3456;
            } else if ((i4 & 3072) == 0) {
                if (bVarI.M(pswVar)) {
                    i30 = 2048;
                } else {
                    i30 = 1024;
                }
                i29 = i27 | i30;
            } else {
                i29 = i27;
            }
            i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i31 != 0) {
                i33 = i29 | 24576;
            } else {
                i32 = i29;
                if ((i4 & 24576) == 0) {
                    i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                } else {
                    i33 = i32;
                }
            }
            i34 = i5 & 32768;
            if (i34 != 0) {
                i33 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i33 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i26 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bVarI.q(i26 & 1, z6)) {
                bVarI.A0();
                i37 = i3 & 1;
                c0042a = a.C0041a.a;
                if (i37 != 0) {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function1110 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function1110;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                } else {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function1111 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function1111;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                }
                bVarI.Y();
                objY2 = bVarI.y();
                d dVar18 = dVar4;
                imf0 imf0Var17 = imf0Var2;
                if (objY2 == c0042a) {
                    objY2 = m.b(new ijf0(str, 0L, 6));
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                zM = bVarI.M(ijf0VarB);
                objY3 = bVarI.y();
                if (zM) {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                } else {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                }
                use useVar14 = xvf.a;
                bVarI.t((Function0) objY3);
                if ((i26 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                objY4 = bVarI.y();
                if (z13) {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                } else {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                }
                ytwVar2 = (ytw) objY4;
                int i41110 = i33;
                bcn bcnVarB14 = gopVar4.b(z10);
                boolean z11110 = !z10;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i39;
                }
                if (z10) {
                    i41 = 1;
                } else {
                    i41 = i38;
                }
                gop gopVar18 = gopVar4;
                zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                objY5 = bVarI.y();
                if (zM2) {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                int i41111 = i41110 << 9;
                bVar = bVarI;
                boolean z11111 = z10;
                j4b.a(ijf0VarB, (Function1) objY5, dVar18, imf0Var17, uni0Var3, function4, pswVar4, ya5Var3, z11110, i41, i40, bcnVarB14, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i41111 & 57344) | 196608 | (3670016 & i41111) | (i41111 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i41110));
                dVar3 = dVar18;
                imf0Var3 = imf0Var17;
                pswVar2 = pswVar4;
                ya5Var2 = ya5Var3;
                tnpVar3 = tnpVar4;
                z8 = z11;
                z9 = z5;
                gajVar2 = gajVar3;
                gopVar3 = gopVar18;
                z7 = z11111;
                uni0Var2 = uni0Var3;
                function3 = function4;
                i36 = i38;
                i35 = i39;
            } else {
                bVar = bVarI;
                bVar.G();
                z7 = z3;
                i35 = i2;
                function3 = function2;
                gajVar2 = gajVar;
                z8 = z4;
                z9 = z5;
                dVar3 = dVar2;
                imf0Var3 = imf0Var2;
                i36 = i;
                uni0Var2 = uni0Var;
                pswVar2 = pswVar;
                tnpVar3 = tnpVar2;
                gopVar3 = gopVar2;
                ya5Var2 = ya5Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wa2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 24576;
        z5 = z2;
        i11 = i5 & 32;
        if (i11 != 0) {
            i6 |= 196608;
            imf0Var2 = imf0Var;
        } else {
            imf0Var2 = imf0Var;
            if ((i3 & 196608) == 0) {
                if (bVarI.M(imf0Var2)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i6 |= i12;
            }
        }
        i13 = i5 & 64;
        if (i13 != 0) {
            i6 |= 1572864;
            gopVar2 = gopVar;
        } else {
            gopVar2 = gopVar;
            if ((i3 & 1572864) == 0) {
                if (bVarI.M(gopVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i6 |= i14;
            }
        }
        i15 = i5 & 128;
        if (i15 != 0) {
            i6 |= 12582912;
            tnpVar2 = tnpVar;
        } else {
            tnpVar2 = tnpVar;
            if ((i3 & 12582912) == 0) {
                if (bVarI.M(tnpVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i6 |= i16;
            }
        }
        i17 = i5 & 256;
        if (i17 != 0) {
            if ((i3 & 100663296) == 0) {
                if (bVarI.b(z3)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i6 |= i18;
            }
            if ((i3 & 805306368) != 0) {
                i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
            }
            i19 = i5 & 1024;
            if (i19 != 0) {
                i21 = i4 | 6;
            } else {
                if (bVarI.d(i2)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i21 = i4 | i20;
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
                i24 = i21 | 48;
            } else {
                if (bVarI.M(uni0Var)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i24 = i21 | i23;
            }
            i25 = i24;
            i26 = i6;
            i27 = i25 | 384;
            i28 = i5 & 8192;
            if (i28 != 0) {
                i29 = i25 | 3456;
            } else if ((i4 & 3072) == 0) {
                if (bVarI.M(pswVar)) {
                    i30 = 2048;
                } else {
                    i30 = 1024;
                }
                i29 = i27 | i30;
            } else {
                i29 = i27;
            }
            i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i31 != 0) {
                i33 = i29 | 24576;
            } else {
                i32 = i29;
                if ((i4 & 24576) == 0) {
                    i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
                } else {
                    i33 = i32;
                }
            }
            i34 = i5 & 32768;
            if (i34 != 0) {
                i33 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i33 |= bVarI.A(gajVar) ? 131072 : 65536;
            }
            if ((i26 & 306783379) == 306783378) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (bVarI.q(i26 & 1, z6)) {
                bVarI.A0();
                i37 = i3 & 1;
                c0042a = a.C0041a.a;
                if (i37 != 0) {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function1112 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function1112;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                } else {
                    if (i42 != 0) {
                        dVar2 = d.a.b;
                    }
                    if (i7 != 0) {
                        z4 = true;
                    }
                    if (i9 != 0) {
                        z5 = false;
                    }
                    if (i11 != 0) {
                        imf0Var2 = imf0.d;
                    }
                    if (i13 != 0) {
                        gopVar2 = gop.e;
                    }
                    if (i15 != 0) {
                        tnpVar4 = tnp.d;
                    } else {
                        tnpVar4 = tnpVar2;
                    }
                    if (i17 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if ((i5 & 512) != 0) {
                        if (z10) {
                            i38 = 1;
                        } else {
                            i38 = Reader.READ_DONE;
                        }
                        i26 &= -1879048193;
                    } else {
                        i38 = i;
                    }
                    if (i19 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i2;
                    }
                    if (i22 != 0) {
                        uni0Var3 = uni0.a.a;
                    } else {
                        uni0Var3 = uni0Var;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new ta2(0);
                        bVarI.r(objY);
                    }
                    Function1<? super ukf0, Unit> function1113 = (Function1) objY;
                    if (i28 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    function4 = function1113;
                    if (i31 != 0) {
                        soa0Var = new soa0(j58.b);
                    } else {
                        soa0Var = ya5Var;
                    }
                    if (i34 != 0) {
                        gajVar3 = sr8.a;
                    } else {
                        gajVar3 = gajVar;
                    }
                    ya5Var3 = soa0Var;
                    z11 = z4;
                    dVar4 = dVar2;
                    gopVar4 = gopVar2;
                    pswVar4 = pswVar3;
                }
                bVarI.Y();
                objY2 = bVarI.y();
                d dVar19 = dVar4;
                imf0 imf0Var18 = imf0Var2;
                if (objY2 == c0042a) {
                    objY2 = m.b(new ijf0(str, 0L, 6));
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
                zM = bVarI.M(ijf0VarB);
                objY3 = bVarI.y();
                if (zM) {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                } else {
                    z12 = false;
                    objY3 = new ua2(0, ijf0VarB, ytwVar);
                    bVarI.r(objY3);
                }
                use useVar15 = xvf.a;
                bVarI.t((Function0) objY3);
                if ((i26 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                objY4 = bVarI.y();
                if (z13) {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                } else {
                    objY4 = m.b(str);
                    bVarI.r(objY4);
                }
                ytwVar2 = (ytw) objY4;
                int i41112 = i33;
                bcn bcnVarB15 = gopVar4.b(z10);
                boolean z11112 = !z10;
                if (z10) {
                    i40 = 1;
                } else {
                    i40 = i39;
                }
                if (z10) {
                    i41 = 1;
                } else {
                    i41 = i38;
                }
                gop gopVar19 = gopVar4;
                zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
                objY5 = bVarI.y();
                if (zM2) {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    objY5 = new Function1() { // from class: va2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ijf0 ijf0Var = (ijf0) obj;
                            ytwVar.setValue(ijf0Var);
                            ytw ytwVar3 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                            nk0 nk0Var = ijf0Var.a;
                            ytwVar3.setValue(nk0Var.b);
                            if (!zG) {
                                function1.invoke(nk0Var.b);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                int i41113 = i41112 << 9;
                bVar = bVarI;
                boolean z11113 = z10;
                j4b.a(ijf0VarB, (Function1) objY5, dVar19, imf0Var18, uni0Var3, function4, pswVar4, ya5Var3, z11112, i41, i40, bcnVarB15, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i41113 & 57344) | 196608 | (3670016 & i41113) | (i41113 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i41112));
                dVar3 = dVar19;
                imf0Var3 = imf0Var18;
                pswVar2 = pswVar4;
                ya5Var2 = ya5Var3;
                tnpVar3 = tnpVar4;
                z8 = z11;
                z9 = z5;
                gajVar2 = gajVar3;
                gopVar3 = gopVar19;
                z7 = z11113;
                uni0Var2 = uni0Var3;
                function3 = function4;
                i36 = i38;
                i35 = i39;
            } else {
                bVar = bVarI;
                bVar.G();
                z7 = z3;
                i35 = i2;
                function3 = function2;
                gajVar2 = gajVar;
                z8 = z4;
                z9 = z5;
                dVar3 = dVar2;
                imf0Var3 = imf0Var2;
                i36 = i;
                uni0Var2 = uni0Var;
                pswVar2 = pswVar;
                tnpVar3 = tnpVar2;
                gopVar3 = gopVar2;
                ya5Var2 = ya5Var;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wa2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i3 | 1);
                        int iA2 = qj40.a(i4);
                        ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 100663296;
        if ((i3 & 805306368) != 0) {
            i6 |= ((i5 & 512) == 0 || !bVarI.d(i)) ? 268435456 : 536870912;
        }
        i19 = i5 & 1024;
        if (i19 != 0) {
            i21 = i4 | 6;
        } else {
            if (bVarI.d(i2)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i21 = i4 | i20;
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
            i24 = i21 | 48;
        } else {
            if (bVarI.M(uni0Var)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i24 = i21 | i23;
        }
        i25 = i24;
        i26 = i6;
        i27 = i25 | 384;
        i28 = i5 & 8192;
        if (i28 != 0) {
            i29 = i25 | 3456;
        } else if ((i4 & 3072) == 0) {
            if (bVarI.M(pswVar)) {
                i30 = 2048;
            } else {
                i30 = 1024;
            }
            i29 = i27 | i30;
        } else {
            i29 = i27;
        }
        i31 = i5 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i31 != 0) {
            i33 = i29 | 24576;
        } else {
            i32 = i29;
            if ((i4 & 24576) == 0) {
                i33 = i32 | (bVarI.M(ya5Var) ? 16384 : 8192);
            } else {
                i33 = i32;
            }
        }
        i34 = i5 & 32768;
        if (i34 != 0) {
            i33 |= 196608;
        } else if ((i4 & 196608) == 0) {
            i33 |= bVarI.A(gajVar) ? 131072 : 65536;
        }
        if ((i26 & 306783379) == 306783378) {
            z6 = true;
        } else {
            z6 = true;
        }
        if (bVarI.q(i26 & 1, z6)) {
            bVarI.A0();
            i37 = i3 & 1;
            c0042a = a.C0041a.a;
            if (i37 != 0) {
                if (i42 != 0) {
                    dVar2 = d.a.b;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    imf0Var2 = imf0.d;
                }
                if (i13 != 0) {
                    gopVar2 = gop.e;
                }
                if (i15 != 0) {
                    tnpVar4 = tnp.d;
                } else {
                    tnpVar4 = tnpVar2;
                }
                if (i17 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i38 = 1;
                    } else {
                        i38 = Reader.READ_DONE;
                    }
                    i26 &= -1879048193;
                } else {
                    i38 = i;
                }
                if (i19 != 0) {
                    i39 = 1;
                } else {
                    i39 = i2;
                }
                if (i22 != 0) {
                    uni0Var3 = uni0.a.a;
                } else {
                    uni0Var3 = uni0Var;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new ta2(0);
                    bVarI.r(objY);
                }
                Function1<? super ukf0, Unit> function1114 = (Function1) objY;
                if (i28 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                function4 = function1114;
                if (i31 != 0) {
                    soa0Var = new soa0(j58.b);
                } else {
                    soa0Var = ya5Var;
                }
                if (i34 != 0) {
                    gajVar3 = sr8.a;
                } else {
                    gajVar3 = gajVar;
                }
                ya5Var3 = soa0Var;
                z11 = z4;
                dVar4 = dVar2;
                gopVar4 = gopVar2;
                pswVar4 = pswVar3;
            } else {
                if (i42 != 0) {
                    dVar2 = d.a.b;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if (i9 != 0) {
                    z5 = false;
                }
                if (i11 != 0) {
                    imf0Var2 = imf0.d;
                }
                if (i13 != 0) {
                    gopVar2 = gop.e;
                }
                if (i15 != 0) {
                    tnpVar4 = tnp.d;
                } else {
                    tnpVar4 = tnpVar2;
                }
                if (i17 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if ((i5 & 512) != 0) {
                    if (z10) {
                        i38 = 1;
                    } else {
                        i38 = Reader.READ_DONE;
                    }
                    i26 &= -1879048193;
                } else {
                    i38 = i;
                }
                if (i19 != 0) {
                    i39 = 1;
                } else {
                    i39 = i2;
                }
                if (i22 != 0) {
                    uni0Var3 = uni0.a.a;
                } else {
                    uni0Var3 = uni0Var;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new ta2(0);
                    bVarI.r(objY);
                }
                Function1<? super ukf0, Unit> function1115 = (Function1) objY;
                if (i28 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                function4 = function1115;
                if (i31 != 0) {
                    soa0Var = new soa0(j58.b);
                } else {
                    soa0Var = ya5Var;
                }
                if (i34 != 0) {
                    gajVar3 = sr8.a;
                } else {
                    gajVar3 = gajVar;
                }
                ya5Var3 = soa0Var;
                z11 = z4;
                dVar4 = dVar2;
                gopVar4 = gopVar2;
                pswVar4 = pswVar3;
            }
            bVarI.Y();
            objY2 = bVarI.y();
            d dVar110 = dVar4;
            imf0 imf0Var19 = imf0Var2;
            if (objY2 == c0042a) {
                objY2 = m.b(new ijf0(str, 0L, 6));
                bVarI.r(objY2);
            }
            ytwVar = (ytw) objY2;
            ijf0VarB = ijf0.b((ijf0) ytwVar.getValue(), str, 0L, 6);
            zM = bVarI.M(ijf0VarB);
            objY3 = bVarI.y();
            if (zM) {
                z12 = false;
                objY3 = new ua2(0, ijf0VarB, ytwVar);
                bVarI.r(objY3);
            } else {
                z12 = false;
                objY3 = new ua2(0, ijf0VarB, ytwVar);
                bVarI.r(objY3);
            }
            use useVar16 = xvf.a;
            bVarI.t((Function0) objY3);
            if ((i26 & 14) == 4) {
                z13 = true;
            } else {
                z13 = z12;
            }
            objY4 = bVarI.y();
            if (z13) {
                objY4 = m.b(str);
                bVarI.r(objY4);
            } else {
                objY4 = m.b(str);
                bVarI.r(objY4);
            }
            ytwVar2 = (ytw) objY4;
            int i41114 = i33;
            bcn bcnVarB16 = gopVar4.b(z10);
            boolean z11114 = !z10;
            if (z10) {
                i40 = 1;
            } else {
                i40 = i39;
            }
            if (z10) {
                i41 = 1;
            } else {
                i41 = i38;
            }
            gop gopVar110 = gopVar4;
            zM2 = bVarI.M(ytwVar2) | ((i26 & 112) == 32);
            objY5 = bVarI.y();
            if (zM2) {
                objY5 = new Function1() { // from class: va2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var = (ijf0) obj;
                        ytwVar.setValue(ijf0Var);
                        ytw ytwVar3 = ytwVar2;
                        boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                        nk0 nk0Var = ijf0Var.a;
                        ytwVar3.setValue(nk0Var.b);
                        if (!zG) {
                            function1.invoke(nk0Var.b);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            } else {
                objY5 = new Function1() { // from class: va2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var = (ijf0) obj;
                        ytwVar.setValue(ijf0Var);
                        ytw ytwVar3 = ytwVar2;
                        boolean zG = Intrinsics.g((String) ytwVar3.getValue(), ijf0Var.a.b);
                        nk0 nk0Var = ijf0Var.a;
                        ytwVar3.setValue(nk0Var.b);
                        if (!zG) {
                            function1.invoke(nk0Var.b);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            int i41115 = i41114 << 9;
            bVar = bVarI;
            boolean z11115 = z10;
            j4b.a(ijf0VarB, (Function1) objY5, dVar110, imf0Var19, uni0Var3, function4, pswVar4, ya5Var3, z11114, i41, i40, bcnVarB16, tnpVar4, z11, z5, gajVar3, bVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i41115 & 57344) | 196608 | (3670016 & i41115) | (i41115 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & 57344) | (458752 & i41114));
            dVar3 = dVar110;
            imf0Var3 = imf0Var19;
            pswVar2 = pswVar4;
            ya5Var2 = ya5Var3;
            tnpVar3 = tnpVar4;
            z8 = z11;
            z9 = z5;
            gajVar2 = gajVar3;
            gopVar3 = gopVar110;
            z7 = z11115;
            uni0Var2 = uni0Var3;
            function3 = function4;
            i36 = i38;
            i35 = i39;
        } else {
            bVar = bVarI;
            bVar.G();
            z7 = z3;
            i35 = i2;
            function3 = function2;
            gajVar2 = gajVar;
            z8 = z4;
            z9 = z5;
            dVar3 = dVar2;
            imf0Var3 = imf0Var2;
            i36 = i;
            uni0Var2 = uni0Var;
            pswVar2 = pswVar;
            tnpVar3 = tnpVar2;
            gopVar3 = gopVar2;
            ya5Var2 = ya5Var;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wa2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    int iA2 = qj40.a(i4);
                    ab2.b(str, function1, dVar3, z8, z9, imf0Var3, gopVar3, tnpVar3, z7, i36, i35, uni0Var2, function3, pswVar2, ya5Var2, gajVar2, (a) obj, iA, iA2, i5);
                    return Unit.a;
                }
            };
        }
    }
}
