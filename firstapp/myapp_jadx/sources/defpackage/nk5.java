package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class nk5 {

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ long a;
        public final /* synthetic */ tmz b;
        public final /* synthetic */ gaj<e160, androidx.compose.runtime.a, Integer, Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, tmz tmzVar, gaj<? super e160, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar) {
            this.a = j;
            this.b = tmzVar;
            this.c = gajVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                i730.a(this.a, ((eah0) aVar2.O(gah0.a)).m, pp8.b(417635459, new mk5(this.b, this.c), aVar2), aVar2, 384);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:132:0x0186  */
    /* JADX WARN: Code duplicated, block: B:133:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:164:0x0202  */
    /* JADX WARN: Code duplicated, block: B:165:0x0205  */
    /* JADX WARN: Code duplicated, block: B:168:0x020d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0222  */
    /* JADX WARN: Code duplicated, block: B:171:0x023c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0252  */
    /* JADX WARN: Code duplicated, block: B:178:0x0268  */
    /* JADX WARN: Code duplicated, block: B:179:0x026b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0274  */
    /* JADX WARN: Code duplicated, block: B:185:0x0277  */
    /* JADX WARN: Code duplicated, block: B:188:0x027c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0284  */
    /* JADX WARN: Code duplicated, block: B:192:0x029d  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:197:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:215:0x0313  */
    /* JADX WARN: Code duplicated, block: B:218:0x0327  */
    /* JADX WARN: Code duplicated, block: B:221:0x036e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0383  */
    /* JADX WARN: Code duplicated, block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x0111  */
    public static final void a(final Function0<Unit> function0, d dVar, boolean z, qx80 qx80Var, ak5 ak5Var, hk5 hk5Var, l35 l35Var, tmz tmzVar, psw pswVar, final gaj<? super e160, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        qx80 qx80Var2;
        ak5 ak5Var2;
        hk5 hk5Var2;
        int i6;
        l35 l35Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        boolean z4;
        b bVar;
        final d dVar2;
        final boolean z5;
        final qx80 qx80Var3;
        final ak5 ak5Var3;
        final tmz tmzVar2;
        final l35 l35Var3;
        final hk5 hk5Var3;
        final psw pswVar2;
        e eVarZ;
        qx80 qx80VarB;
        ak5 ak5VarC;
        hk5 hk5VarB;
        tmz tmzVar3;
        qx80 qx80Var4;
        l35 l35Var4;
        boolean z6;
        psw pswVar3;
        int i14;
        tmz tmzVar4;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        psw pswVar4;
        long j;
        long j2;
        int i15;
        Object objY;
        SnapshotStateList snapshotStateList;
        boolean zM;
        Object objY2;
        xxo xxoVar;
        float f;
        Object objY3;
        wd0 wd0Var;
        boolean zA;
        Object objY4;
        aj0 aj0Var;
        Object objY5;
        Object objY6;
        int i16;
        b bVarI = aVar.i(-1310015664);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 == 0) {
            if ((i & 48) == 0) {
                i3 |= bVarI.M(dVar) ? 32 : 16;
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
                        qx80Var2 = qx80Var;
                        int i18 = bVarI.M(qx80Var2) ? 2048 : 1024;
                        i3 |= i18;
                    } else {
                        qx80Var2 = qx80Var;
                    }
                    i3 |= i18;
                } else {
                    qx80Var2 = qx80Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        ak5Var2 = ak5Var;
                        int i19 = bVarI.M(ak5Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i3 |= i19;
                    } else {
                        ak5Var2 = ak5Var;
                    }
                    i3 |= i19;
                } else {
                    ak5Var2 = ak5Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        hk5Var2 = hk5Var;
                        int i20 = bVarI.M(hk5Var2) ? 131072 : 65536;
                        i3 |= i20;
                    } else {
                        hk5Var2 = hk5Var;
                    }
                    i3 |= i20;
                } else {
                    hk5Var2 = hk5Var;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    l35Var2 = l35Var;
                } else {
                    l35Var2 = l35Var;
                    if ((i & 1572864) == 0) {
                        if (bVarI.M(l35Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    if ((i & 12582912) == 0) {
                        int i21 = i3;
                        if (bVarI.M(tmzVar)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i10 = i21 | i9;
                    }
                    i11 = i2 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            if (bVarI.M(pswVar)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i10 |= i12;
                        }
                        if ((i & 805306368) == 0) {
                            if (bVarI.A(gajVar)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i10 |= i16;
                        }
                        i13 = i10;
                        z3 = true;
                        if ((i13 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (bVarI.q(i13 & 1, z4)) {
                            bVarI.A0();
                            if ((i & 1) != 0 || bVarI.h0()) {
                                if (i17 != 0) {
                                    dVar2 = d.a.b;
                                } else {
                                    dVar2 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i13 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar2 = ek5.a;
                                    ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                    i13 &= -57345;
                                } else {
                                    ak5VarC = ak5Var2;
                                }
                                if ((i2 & 32) != 0) {
                                    hk5VarB = ek5.b(31);
                                    i13 &= -458753;
                                } else {
                                    hk5VarB = hk5Var2;
                                }
                                if (i6 != 0) {
                                    l35Var2 = null;
                                }
                                if (i8 != 0) {
                                    tmzVar3 = ek5.a;
                                } else {
                                    tmzVar3 = tmzVar;
                                }
                                qx80Var4 = qx80VarB;
                                l35Var4 = l35Var2;
                                z6 = z2;
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                i14 = i13;
                                tmzVar4 = tmzVar3;
                            } else {
                                bVarI.G();
                                if ((i2 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                dVar2 = dVar;
                                pswVar3 = pswVar;
                                l35Var4 = l35Var2;
                                z6 = z2;
                                qx80Var4 = qx80Var2;
                                ak5VarC = ak5Var2;
                                hk5VarB = hk5Var2;
                                i14 = i13;
                                tmzVar4 = tmzVar;
                            }
                            bVarI.Y();
                            c0042a = androidx.compose.runtime.a.C0041a.a;
                            if (pswVar3 == null) {
                                bVarI.N(1691738187);
                                objY6 = bVarI.y();
                                if (objY6 == c0042a) {
                                    objY6 = rzk.a(bVarI);
                                }
                                pswVar4 = (psw) objY6;
                                bVarI.X(false);
                            } else {
                                bVarI.N(-499617780);
                                bVarI.X(false);
                                pswVar4 = pswVar3;
                            }
                            if (z6) {
                                j = ak5VarC.a;
                            } else {
                                j = ak5VarC.c;
                            }
                            long j3 = j;
                            if (z6) {
                                j2 = ak5VarC.b;
                            } else {
                                j2 = ak5VarC.d;
                            }
                            pswVar = pswVar3;
                            if (hk5VarB == null) {
                                bVarI.N(1691921830);
                                bVarI.X(false);
                                tmzVar4 = tmzVar4;
                                i14 = i14;
                                pswVar4 = pswVar4;
                                aj0Var = null;
                            } else {
                                bVarI.N(-499611205);
                                i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new SnapshotStateList();
                                    bVarI.r(objY);
                                }
                                snapshotStateList = (SnapshotStateList) objY;
                                zM = bVarI.M(pswVar4);
                                objY2 = bVarI.y();
                                if (zM || objY2 == c0042a) {
                                    objY2 = new fk5(pswVar4, snapshotStateList, null);
                                    bVarI.r(objY2);
                                }
                                xvf.e(bVarI, pswVar4, (Function2) objY2);
                                xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                                if (z6 || (xxoVar instanceof mp20.b)) {
                                    f = 0.0f;
                                } else if (xxoVar instanceof vkm) {
                                    f = hk5VarB.b;
                                } else if (xxoVar instanceof c4i) {
                                    f = 0.0f;
                                } else {
                                    f = hk5VarB.a;
                                }
                                objY3 = bVarI.y();
                                if (objY3 == c0042a) {
                                    objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                                    bVarI.r(objY3);
                                }
                                wd0Var = (wd0) objY3;
                                g7f g7fVar = new g7f(f);
                                boolean zA2 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                                if ((((i15 & 896) ^ 384) > 256 || !bVarI.M(hk5VarB)) && (i15 & 384) != 256) {
                                }
                                zA = zA2 | z3 | bVarI.A(xxoVar);
                                objY4 = bVarI.y();
                                if (zA || objY4 == c0042a) {
                                    objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                    bVarI.r(objY4);
                                }
                                xvf.e(bVarI, g7fVar, (Function2) objY4);
                                aj0Var = wd0Var.c;
                                bVarI.X(false);
                            }
                            float f2 = aj0Var != null ? ((g7f) ((x5a0) aj0Var.b).getValue()).a : 0.0f;
                            objY5 = bVarI.y();
                            if (objY5 == c0042a) {
                                objY5 = new kk5();
                                bVarI.r(objY5);
                            }
                            tmz tmzVar5 = tmzVar4;
                            int i22 = i14;
                            bVar = bVarI;
                            ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j3, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar5, gajVar), bVarI), bVar, (i22 & 8078) | ((i22 << 6) & 234881024), 64);
                            tmzVar2 = tmzVar5;
                            hk5Var3 = hk5VarB;
                            z5 = z6;
                            qx80Var3 = qx80Var4;
                            l35Var3 = l35Var4;
                            ak5Var3 = ak5VarC;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            dVar2 = dVar;
                            z5 = z2;
                            qx80Var3 = qx80Var2;
                            ak5Var3 = ak5Var2;
                            tmzVar2 = tmzVar;
                            l35Var3 = l35Var2;
                            hk5Var3 = hk5Var2;
                        }
                        pswVar2 = pswVar;
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: lk5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i10 |= 100663296;
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i10 |= i16;
                    }
                    i13 = i10;
                    z3 = true;
                    if ((i13 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i13 & 1, z4)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar3 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar4 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        } else {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar5 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar6 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        }
                        bVarI.Y();
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (pswVar3 == null) {
                            bVarI.N(1691738187);
                            objY6 = bVarI.y();
                            if (objY6 == c0042a) {
                                objY6 = rzk.a(bVarI);
                            }
                            pswVar4 = (psw) objY6;
                            bVarI.X(false);
                        } else {
                            bVarI.N(-499617780);
                            bVarI.X(false);
                            pswVar4 = pswVar3;
                        }
                        if (z6) {
                            j = ak5VarC.a;
                        } else {
                            j = ak5VarC.c;
                        }
                        long j4 = j;
                        if (z6) {
                            j2 = ak5VarC.b;
                        } else {
                            j2 = ak5VarC.d;
                        }
                        pswVar = pswVar3;
                        if (hk5VarB == null) {
                            bVarI.N(1691921830);
                            bVarI.X(false);
                            tmzVar4 = tmzVar4;
                            i14 = i14;
                            pswVar4 = pswVar4;
                            aj0Var = null;
                        } else {
                            bVarI.N(-499611205);
                            i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new SnapshotStateList();
                                bVarI.r(objY);
                            }
                            snapshotStateList = (SnapshotStateList) objY;
                            zM = bVarI.M(pswVar4);
                            objY2 = bVarI.y();
                            if (zM) {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            }
                            xvf.e(bVarI, pswVar4, (Function2) objY2);
                            xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                            if (z6) {
                                f = 0.0f;
                            } else if (xxoVar instanceof vkm) {
                                f = hk5VarB.b;
                            } else if (xxoVar instanceof c4i) {
                                f = 0.0f;
                            } else {
                                f = hk5VarB.a;
                            }
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                                bVarI.r(objY3);
                            }
                            wd0Var = (wd0) objY3;
                            g7f g7fVar2 = new g7f(f);
                            boolean zA3 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                            z3 = ((i15 & 896) ^ 384) > 256 ? false : false;
                            zA = zA3 | z3 | bVarI.A(xxoVar);
                            objY4 = bVarI.y();
                            if (zA) {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            } else {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            }
                            xvf.e(bVarI, g7fVar2, (Function2) objY4);
                            aj0Var = wd0Var.c;
                            bVarI.X(false);
                        }
                        if (aj0Var != null) {
                        }
                        objY5 = bVarI.y();
                        if (objY5 == c0042a) {
                            objY5 = new kk5();
                            bVarI.r(objY5);
                        }
                        tmz tmzVar6 = tmzVar4;
                        int i23 = i14;
                        bVar = bVarI;
                        ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j4, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar6, gajVar), bVarI), bVar, (i23 & 8078) | ((i23 << 6) & 234881024), 64);
                        tmzVar2 = tmzVar6;
                        hk5Var3 = hk5VarB;
                        z5 = z6;
                        qx80Var3 = qx80Var4;
                        l35Var3 = l35Var4;
                        ak5Var3 = ak5VarC;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        z5 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        tmzVar2 = tmzVar;
                        l35Var3 = l35Var2;
                        hk5Var3 = hk5Var2;
                    }
                    pswVar2 = pswVar;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: lk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                i10 = i3;
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i10 |= i16;
                    }
                    i13 = i10;
                    z3 = true;
                    if ((i13 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i13 & 1, z4)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar7 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar8 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        } else {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar9 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar10 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        }
                        bVarI.Y();
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (pswVar3 == null) {
                            bVarI.N(1691738187);
                            objY6 = bVarI.y();
                            if (objY6 == c0042a) {
                                objY6 = rzk.a(bVarI);
                            }
                            pswVar4 = (psw) objY6;
                            bVarI.X(false);
                        } else {
                            bVarI.N(-499617780);
                            bVarI.X(false);
                            pswVar4 = pswVar3;
                        }
                        if (z6) {
                            j = ak5VarC.a;
                        } else {
                            j = ak5VarC.c;
                        }
                        long j5 = j;
                        if (z6) {
                            j2 = ak5VarC.b;
                        } else {
                            j2 = ak5VarC.d;
                        }
                        pswVar = pswVar3;
                        if (hk5VarB == null) {
                            bVarI.N(1691921830);
                            bVarI.X(false);
                            tmzVar4 = tmzVar4;
                            i14 = i14;
                            pswVar4 = pswVar4;
                            aj0Var = null;
                        } else {
                            bVarI.N(-499611205);
                            i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new SnapshotStateList();
                                bVarI.r(objY);
                            }
                            snapshotStateList = (SnapshotStateList) objY;
                            zM = bVarI.M(pswVar4);
                            objY2 = bVarI.y();
                            if (zM) {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            }
                            xvf.e(bVarI, pswVar4, (Function2) objY2);
                            xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                            if (z6) {
                                f = 0.0f;
                            } else if (xxoVar instanceof vkm) {
                                f = hk5VarB.b;
                            } else if (xxoVar instanceof c4i) {
                                f = 0.0f;
                            } else {
                                f = hk5VarB.a;
                            }
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                                bVarI.r(objY3);
                            }
                            wd0Var = (wd0) objY3;
                            g7f g7fVar3 = new g7f(f);
                            boolean zA4 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                            if (((i15 & 896) ^ 384) > 256) {
                            }
                            zA = zA4 | z3 | bVarI.A(xxoVar);
                            objY4 = bVarI.y();
                            if (zA) {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            } else {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            }
                            xvf.e(bVarI, g7fVar3, (Function2) objY4);
                            aj0Var = wd0Var.c;
                            bVarI.X(false);
                        }
                        if (aj0Var != null) {
                        }
                        objY5 = bVarI.y();
                        if (objY5 == c0042a) {
                            objY5 = new kk5();
                            bVarI.r(objY5);
                        }
                        tmz tmzVar7 = tmzVar4;
                        int i24 = i14;
                        bVar = bVarI;
                        ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j5, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar7, gajVar), bVarI), bVar, (i24 & 8078) | ((i24 << 6) & 234881024), 64);
                        tmzVar2 = tmzVar7;
                        hk5Var3 = hk5VarB;
                        z5 = z6;
                        qx80Var3 = qx80Var4;
                        l35Var3 = l35Var4;
                        ak5Var3 = ak5VarC;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        z5 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        tmzVar2 = tmzVar;
                        l35Var3 = l35Var2;
                        hk5Var3 = hk5Var2;
                    }
                    pswVar2 = pswVar;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: lk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i10 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i10 |= i16;
                }
                i13 = i10;
                z3 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i13 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar12 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar13 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar14 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    }
                    bVarI.Y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (pswVar3 == null) {
                        bVarI.N(1691738187);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a) {
                            objY6 = rzk.a(bVarI);
                        }
                        pswVar4 = (psw) objY6;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-499617780);
                        bVarI.X(false);
                        pswVar4 = pswVar3;
                    }
                    if (z6) {
                        j = ak5VarC.a;
                    } else {
                        j = ak5VarC.c;
                    }
                    long j6 = j;
                    if (z6) {
                        j2 = ak5VarC.b;
                    } else {
                        j2 = ak5VarC.d;
                    }
                    pswVar = pswVar3;
                    if (hk5VarB == null) {
                        bVarI.N(1691921830);
                        bVarI.X(false);
                        tmzVar4 = tmzVar4;
                        i14 = i14;
                        pswVar4 = pswVar4;
                        aj0Var = null;
                    } else {
                        bVarI.N(-499611205);
                        i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new SnapshotStateList();
                            bVarI.r(objY);
                        }
                        snapshotStateList = (SnapshotStateList) objY;
                        zM = bVarI.M(pswVar4);
                        objY2 = bVarI.y();
                        if (zM) {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        }
                        xvf.e(bVarI, pswVar4, (Function2) objY2);
                        xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (xxoVar instanceof vkm) {
                            f = hk5VarB.b;
                        } else if (xxoVar instanceof c4i) {
                            f = 0.0f;
                        } else {
                            f = hk5VarB.a;
                        }
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                            bVarI.r(objY3);
                        }
                        wd0Var = (wd0) objY3;
                        g7f g7fVar4 = new g7f(f);
                        boolean zA5 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zA = zA5 | z3 | bVarI.A(xxoVar);
                        objY4 = bVarI.y();
                        if (zA) {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        } else {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        }
                        xvf.e(bVarI, g7fVar4, (Function2) objY4);
                        aj0Var = wd0Var.c;
                        bVarI.X(false);
                    }
                    if (aj0Var != null) {
                    }
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        objY5 = new kk5();
                        bVarI.r(objY5);
                    }
                    tmz tmzVar8 = tmzVar4;
                    int i25 = i14;
                    bVar = bVarI;
                    ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j6, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar8, gajVar), bVarI), bVar, (i25 & 8078) | ((i25 << 6) & 234881024), 64);
                    tmzVar2 = tmzVar8;
                    hk5Var3 = hk5VarB;
                    z5 = z6;
                    qx80Var3 = qx80Var4;
                    l35Var3 = l35Var4;
                    ak5Var3 = ak5VarC;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    tmzVar2 = tmzVar;
                    l35Var3 = l35Var2;
                    hk5Var3 = hk5Var2;
                }
                pswVar2 = pswVar;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    qx80Var2 = qx80Var;
                    if (bVarI.M(qx80Var2)) {
                    }
                    i3 |= i18;
                } else {
                    qx80Var2 = qx80Var;
                }
                i3 |= i18;
            } else {
                qx80Var2 = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ak5Var2 = ak5Var;
                    if (bVarI.M(ak5Var2)) {
                    }
                    i3 |= i19;
                } else {
                    ak5Var2 = ak5Var;
                }
                i3 |= i19;
            } else {
                ak5Var2 = ak5Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    hk5Var2 = hk5Var;
                    if (bVarI.M(hk5Var2)) {
                    }
                    i3 |= i20;
                } else {
                    hk5Var2 = hk5Var;
                }
                i3 |= i20;
            } else {
                hk5Var2 = hk5Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                l35Var2 = l35Var;
            } else {
                l35Var2 = l35Var;
                if ((i & 1572864) == 0) {
                    if (bVarI.M(l35Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    int i26 = i3;
                    if (bVarI.M(tmzVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i10 = i26 | i9;
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i10 |= i16;
                    }
                    i13 = i10;
                    z3 = true;
                    if ((i13 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i13 & 1, z4)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar15 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar16 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        } else {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar17 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar18 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        }
                        bVarI.Y();
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (pswVar3 == null) {
                            bVarI.N(1691738187);
                            objY6 = bVarI.y();
                            if (objY6 == c0042a) {
                                objY6 = rzk.a(bVarI);
                            }
                            pswVar4 = (psw) objY6;
                            bVarI.X(false);
                        } else {
                            bVarI.N(-499617780);
                            bVarI.X(false);
                            pswVar4 = pswVar3;
                        }
                        if (z6) {
                            j = ak5VarC.a;
                        } else {
                            j = ak5VarC.c;
                        }
                        long j7 = j;
                        if (z6) {
                            j2 = ak5VarC.b;
                        } else {
                            j2 = ak5VarC.d;
                        }
                        pswVar = pswVar3;
                        if (hk5VarB == null) {
                            bVarI.N(1691921830);
                            bVarI.X(false);
                            tmzVar4 = tmzVar4;
                            i14 = i14;
                            pswVar4 = pswVar4;
                            aj0Var = null;
                        } else {
                            bVarI.N(-499611205);
                            i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new SnapshotStateList();
                                bVarI.r(objY);
                            }
                            snapshotStateList = (SnapshotStateList) objY;
                            zM = bVarI.M(pswVar4);
                            objY2 = bVarI.y();
                            if (zM) {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            }
                            xvf.e(bVarI, pswVar4, (Function2) objY2);
                            xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                            if (z6) {
                                f = 0.0f;
                            } else if (xxoVar instanceof vkm) {
                                f = hk5VarB.b;
                            } else if (xxoVar instanceof c4i) {
                                f = 0.0f;
                            } else {
                                f = hk5VarB.a;
                            }
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                                bVarI.r(objY3);
                            }
                            wd0Var = (wd0) objY3;
                            g7f g7fVar5 = new g7f(f);
                            boolean zA6 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                            if (((i15 & 896) ^ 384) > 256) {
                            }
                            zA = zA6 | z3 | bVarI.A(xxoVar);
                            objY4 = bVarI.y();
                            if (zA) {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            } else {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            }
                            xvf.e(bVarI, g7fVar5, (Function2) objY4);
                            aj0Var = wd0Var.c;
                            bVarI.X(false);
                        }
                        if (aj0Var != null) {
                        }
                        objY5 = bVarI.y();
                        if (objY5 == c0042a) {
                            objY5 = new kk5();
                            bVarI.r(objY5);
                        }
                        tmz tmzVar9 = tmzVar4;
                        int i27 = i14;
                        bVar = bVarI;
                        ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j7, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar9, gajVar), bVarI), bVar, (i27 & 8078) | ((i27 << 6) & 234881024), 64);
                        tmzVar2 = tmzVar9;
                        hk5Var3 = hk5VarB;
                        z5 = z6;
                        qx80Var3 = qx80Var4;
                        l35Var3 = l35Var4;
                        ak5Var3 = ak5VarC;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        z5 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        tmzVar2 = tmzVar;
                        l35Var3 = l35Var2;
                        hk5Var3 = hk5Var2;
                    }
                    pswVar2 = pswVar;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: lk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i10 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i10 |= i16;
                }
                i13 = i10;
                z3 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i13 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar19 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar110 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar112 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    }
                    bVarI.Y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (pswVar3 == null) {
                        bVarI.N(1691738187);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a) {
                            objY6 = rzk.a(bVarI);
                        }
                        pswVar4 = (psw) objY6;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-499617780);
                        bVarI.X(false);
                        pswVar4 = pswVar3;
                    }
                    if (z6) {
                        j = ak5VarC.a;
                    } else {
                        j = ak5VarC.c;
                    }
                    long j8 = j;
                    if (z6) {
                        j2 = ak5VarC.b;
                    } else {
                        j2 = ak5VarC.d;
                    }
                    pswVar = pswVar3;
                    if (hk5VarB == null) {
                        bVarI.N(1691921830);
                        bVarI.X(false);
                        tmzVar4 = tmzVar4;
                        i14 = i14;
                        pswVar4 = pswVar4;
                        aj0Var = null;
                    } else {
                        bVarI.N(-499611205);
                        i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new SnapshotStateList();
                            bVarI.r(objY);
                        }
                        snapshotStateList = (SnapshotStateList) objY;
                        zM = bVarI.M(pswVar4);
                        objY2 = bVarI.y();
                        if (zM) {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        }
                        xvf.e(bVarI, pswVar4, (Function2) objY2);
                        xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (xxoVar instanceof vkm) {
                            f = hk5VarB.b;
                        } else if (xxoVar instanceof c4i) {
                            f = 0.0f;
                        } else {
                            f = hk5VarB.a;
                        }
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                            bVarI.r(objY3);
                        }
                        wd0Var = (wd0) objY3;
                        g7f g7fVar6 = new g7f(f);
                        boolean zA7 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zA = zA7 | z3 | bVarI.A(xxoVar);
                        objY4 = bVarI.y();
                        if (zA) {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        } else {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        }
                        xvf.e(bVarI, g7fVar6, (Function2) objY4);
                        aj0Var = wd0Var.c;
                        bVarI.X(false);
                    }
                    if (aj0Var != null) {
                    }
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        objY5 = new kk5();
                        bVarI.r(objY5);
                    }
                    tmz tmzVar10 = tmzVar4;
                    int i28 = i14;
                    bVar = bVarI;
                    ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j8, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar10, gajVar), bVarI), bVar, (i28 & 8078) | ((i28 << 6) & 234881024), 64);
                    tmzVar2 = tmzVar10;
                    hk5Var3 = hk5VarB;
                    z5 = z6;
                    qx80Var3 = qx80Var4;
                    l35Var3 = l35Var4;
                    ak5Var3 = ak5VarC;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    tmzVar2 = tmzVar;
                    l35Var3 = l35Var2;
                    hk5Var3 = hk5Var2;
                }
                pswVar2 = pswVar;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i10 = i3;
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i10 |= i16;
                }
                i13 = i10;
                z3 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i13 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar113 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar114 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar116 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    }
                    bVarI.Y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (pswVar3 == null) {
                        bVarI.N(1691738187);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a) {
                            objY6 = rzk.a(bVarI);
                        }
                        pswVar4 = (psw) objY6;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-499617780);
                        bVarI.X(false);
                        pswVar4 = pswVar3;
                    }
                    if (z6) {
                        j = ak5VarC.a;
                    } else {
                        j = ak5VarC.c;
                    }
                    long j9 = j;
                    if (z6) {
                        j2 = ak5VarC.b;
                    } else {
                        j2 = ak5VarC.d;
                    }
                    pswVar = pswVar3;
                    if (hk5VarB == null) {
                        bVarI.N(1691921830);
                        bVarI.X(false);
                        tmzVar4 = tmzVar4;
                        i14 = i14;
                        pswVar4 = pswVar4;
                        aj0Var = null;
                    } else {
                        bVarI.N(-499611205);
                        i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new SnapshotStateList();
                            bVarI.r(objY);
                        }
                        snapshotStateList = (SnapshotStateList) objY;
                        zM = bVarI.M(pswVar4);
                        objY2 = bVarI.y();
                        if (zM) {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        }
                        xvf.e(bVarI, pswVar4, (Function2) objY2);
                        xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (xxoVar instanceof vkm) {
                            f = hk5VarB.b;
                        } else if (xxoVar instanceof c4i) {
                            f = 0.0f;
                        } else {
                            f = hk5VarB.a;
                        }
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                            bVarI.r(objY3);
                        }
                        wd0Var = (wd0) objY3;
                        g7f g7fVar7 = new g7f(f);
                        boolean zA8 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zA = zA8 | z3 | bVarI.A(xxoVar);
                        objY4 = bVarI.y();
                        if (zA) {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        } else {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        }
                        xvf.e(bVarI, g7fVar7, (Function2) objY4);
                        aj0Var = wd0Var.c;
                        bVarI.X(false);
                    }
                    if (aj0Var != null) {
                    }
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        objY5 = new kk5();
                        bVarI.r(objY5);
                    }
                    tmz tmzVar11 = tmzVar4;
                    int i29 = i14;
                    bVar = bVarI;
                    ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j9, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar11, gajVar), bVarI), bVar, (i29 & 8078) | ((i29 << 6) & 234881024), 64);
                    tmzVar2 = tmzVar11;
                    hk5Var3 = hk5VarB;
                    z5 = z6;
                    qx80Var3 = qx80Var4;
                    l35Var3 = l35Var4;
                    ak5Var3 = ak5VarC;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    tmzVar2 = tmzVar;
                    l35Var3 = l35Var2;
                    hk5Var3 = hk5Var2;
                }
                pswVar2 = pswVar;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i10 |= 100663296;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i10 |= i16;
            }
            i13 = i10;
            z3 = true;
            if ((i13 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i13 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar117 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar118 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar119 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1110 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                }
                bVarI.Y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (pswVar3 == null) {
                    bVarI.N(1691738187);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a) {
                        objY6 = rzk.a(bVarI);
                    }
                    pswVar4 = (psw) objY6;
                    bVarI.X(false);
                } else {
                    bVarI.N(-499617780);
                    bVarI.X(false);
                    pswVar4 = pswVar3;
                }
                if (z6) {
                    j = ak5VarC.a;
                } else {
                    j = ak5VarC.c;
                }
                long j10 = j;
                if (z6) {
                    j2 = ak5VarC.b;
                } else {
                    j2 = ak5VarC.d;
                }
                pswVar = pswVar3;
                if (hk5VarB == null) {
                    bVarI.N(1691921830);
                    bVarI.X(false);
                    tmzVar4 = tmzVar4;
                    i14 = i14;
                    pswVar4 = pswVar4;
                    aj0Var = null;
                } else {
                    bVarI.N(-499611205);
                    i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new SnapshotStateList();
                        bVarI.r(objY);
                    }
                    snapshotStateList = (SnapshotStateList) objY;
                    zM = bVarI.M(pswVar4);
                    objY2 = bVarI.y();
                    if (zM) {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    }
                    xvf.e(bVarI, pswVar4, (Function2) objY2);
                    xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (xxoVar instanceof vkm) {
                        f = hk5VarB.b;
                    } else if (xxoVar instanceof c4i) {
                        f = 0.0f;
                    } else {
                        f = hk5VarB.a;
                    }
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                        bVarI.r(objY3);
                    }
                    wd0Var = (wd0) objY3;
                    g7f g7fVar8 = new g7f(f);
                    boolean zA9 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zA = zA9 | z3 | bVarI.A(xxoVar);
                    objY4 = bVarI.y();
                    if (zA) {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    } else {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    }
                    xvf.e(bVarI, g7fVar8, (Function2) objY4);
                    aj0Var = wd0Var.c;
                    bVarI.X(false);
                }
                if (aj0Var != null) {
                }
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new kk5();
                    bVarI.r(objY5);
                }
                tmz tmzVar12 = tmzVar4;
                int i210 = i14;
                bVar = bVarI;
                ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j10, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar12, gajVar), bVarI), bVar, (i210 & 8078) | ((i210 << 6) & 234881024), 64);
                tmzVar2 = tmzVar12;
                hk5Var3 = hk5VarB;
                z5 = z6;
                qx80Var3 = qx80Var4;
                l35Var3 = l35Var4;
                ak5Var3 = ak5VarC;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z5 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                tmzVar2 = tmzVar;
                l35Var3 = l35Var2;
                hk5Var3 = hk5Var2;
            }
            pswVar2 = pswVar;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
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
                    qx80Var2 = qx80Var;
                    if (bVarI.M(qx80Var2)) {
                    }
                    i3 |= i18;
                } else {
                    qx80Var2 = qx80Var;
                }
                i3 |= i18;
            } else {
                qx80Var2 = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ak5Var2 = ak5Var;
                    if (bVarI.M(ak5Var2)) {
                    }
                    i3 |= i19;
                } else {
                    ak5Var2 = ak5Var;
                }
                i3 |= i19;
            } else {
                ak5Var2 = ak5Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    hk5Var2 = hk5Var;
                    if (bVarI.M(hk5Var2)) {
                    }
                    i3 |= i20;
                } else {
                    hk5Var2 = hk5Var;
                }
                i3 |= i20;
            } else {
                hk5Var2 = hk5Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                l35Var2 = l35Var;
            } else {
                l35Var2 = l35Var;
                if ((i & 1572864) == 0) {
                    if (bVarI.M(l35Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                if ((i & 12582912) == 0) {
                    int i211 = i3;
                    if (bVarI.M(tmzVar)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i10 = i211 | i9;
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i10 |= i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i10 |= i16;
                    }
                    i13 = i10;
                    z3 = true;
                    if ((i13 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (bVarI.q(i13 & 1, z4)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1111 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1112 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        } else {
                            if (i17 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1113 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i13 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1114 = ek5.a;
                                ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                                i13 &= -57345;
                            } else {
                                ak5VarC = ak5Var2;
                            }
                            if ((i2 & 32) != 0) {
                                hk5VarB = ek5.b(31);
                                i13 &= -458753;
                            } else {
                                hk5VarB = hk5Var2;
                            }
                            if (i6 != 0) {
                                l35Var2 = null;
                            }
                            if (i8 != 0) {
                                tmzVar3 = ek5.a;
                            } else {
                                tmzVar3 = tmzVar;
                            }
                            qx80Var4 = qx80VarB;
                            l35Var4 = l35Var2;
                            z6 = z2;
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            i14 = i13;
                            tmzVar4 = tmzVar3;
                        }
                        bVarI.Y();
                        c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (pswVar3 == null) {
                            bVarI.N(1691738187);
                            objY6 = bVarI.y();
                            if (objY6 == c0042a) {
                                objY6 = rzk.a(bVarI);
                            }
                            pswVar4 = (psw) objY6;
                            bVarI.X(false);
                        } else {
                            bVarI.N(-499617780);
                            bVarI.X(false);
                            pswVar4 = pswVar3;
                        }
                        if (z6) {
                            j = ak5VarC.a;
                        } else {
                            j = ak5VarC.c;
                        }
                        long j11 = j;
                        if (z6) {
                            j2 = ak5VarC.b;
                        } else {
                            j2 = ak5VarC.d;
                        }
                        pswVar = pswVar3;
                        if (hk5VarB == null) {
                            bVarI.N(1691921830);
                            bVarI.X(false);
                            tmzVar4 = tmzVar4;
                            i14 = i14;
                            pswVar4 = pswVar4;
                            aj0Var = null;
                        } else {
                            bVarI.N(-499611205);
                            i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new SnapshotStateList();
                                bVarI.r(objY);
                            }
                            snapshotStateList = (SnapshotStateList) objY;
                            zM = bVarI.M(pswVar4);
                            objY2 = bVarI.y();
                            if (zM) {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            } else {
                                objY2 = new fk5(pswVar4, snapshotStateList, null);
                                bVarI.r(objY2);
                            }
                            xvf.e(bVarI, pswVar4, (Function2) objY2);
                            xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                            if (z6) {
                                f = 0.0f;
                            } else if (xxoVar instanceof vkm) {
                                f = hk5VarB.b;
                            } else if (xxoVar instanceof c4i) {
                                f = 0.0f;
                            } else {
                                f = hk5VarB.a;
                            }
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                                bVarI.r(objY3);
                            }
                            wd0Var = (wd0) objY3;
                            g7f g7fVar9 = new g7f(f);
                            boolean zA10 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                            if (((i15 & 896) ^ 384) > 256) {
                            }
                            zA = zA10 | z3 | bVarI.A(xxoVar);
                            objY4 = bVarI.y();
                            if (zA) {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            } else {
                                objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                                bVarI.r(objY4);
                            }
                            xvf.e(bVarI, g7fVar9, (Function2) objY4);
                            aj0Var = wd0Var.c;
                            bVarI.X(false);
                        }
                        if (aj0Var != null) {
                        }
                        objY5 = bVarI.y();
                        if (objY5 == c0042a) {
                            objY5 = new kk5();
                            bVarI.r(objY5);
                        }
                        tmz tmzVar13 = tmzVar4;
                        int i212 = i14;
                        bVar = bVarI;
                        ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j11, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar13, gajVar), bVarI), bVar, (i212 & 8078) | ((i212 << 6) & 234881024), 64);
                        tmzVar2 = tmzVar13;
                        hk5Var3 = hk5VarB;
                        z5 = z6;
                        qx80Var3 = qx80Var4;
                        l35Var3 = l35Var4;
                        ak5Var3 = ak5VarC;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        z5 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        tmzVar2 = tmzVar;
                        l35Var3 = l35Var2;
                        hk5Var3 = hk5Var2;
                    }
                    pswVar2 = pswVar;
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: lk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i10 |= 100663296;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i10 |= i16;
                }
                i13 = i10;
                z3 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i13 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar1115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar1116 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar1117 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar1118 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    }
                    bVarI.Y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (pswVar3 == null) {
                        bVarI.N(1691738187);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a) {
                            objY6 = rzk.a(bVarI);
                        }
                        pswVar4 = (psw) objY6;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-499617780);
                        bVarI.X(false);
                        pswVar4 = pswVar3;
                    }
                    if (z6) {
                        j = ak5VarC.a;
                    } else {
                        j = ak5VarC.c;
                    }
                    long j12 = j;
                    if (z6) {
                        j2 = ak5VarC.b;
                    } else {
                        j2 = ak5VarC.d;
                    }
                    pswVar = pswVar3;
                    if (hk5VarB == null) {
                        bVarI.N(1691921830);
                        bVarI.X(false);
                        tmzVar4 = tmzVar4;
                        i14 = i14;
                        pswVar4 = pswVar4;
                        aj0Var = null;
                    } else {
                        bVarI.N(-499611205);
                        i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new SnapshotStateList();
                            bVarI.r(objY);
                        }
                        snapshotStateList = (SnapshotStateList) objY;
                        zM = bVarI.M(pswVar4);
                        objY2 = bVarI.y();
                        if (zM) {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        }
                        xvf.e(bVarI, pswVar4, (Function2) objY2);
                        xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (xxoVar instanceof vkm) {
                            f = hk5VarB.b;
                        } else if (xxoVar instanceof c4i) {
                            f = 0.0f;
                        } else {
                            f = hk5VarB.a;
                        }
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                            bVarI.r(objY3);
                        }
                        wd0Var = (wd0) objY3;
                        g7f g7fVar10 = new g7f(f);
                        boolean zA11 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zA = zA11 | z3 | bVarI.A(xxoVar);
                        objY4 = bVarI.y();
                        if (zA) {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        } else {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        }
                        xvf.e(bVarI, g7fVar10, (Function2) objY4);
                        aj0Var = wd0Var.c;
                        bVarI.X(false);
                    }
                    if (aj0Var != null) {
                    }
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        objY5 = new kk5();
                        bVarI.r(objY5);
                    }
                    tmz tmzVar14 = tmzVar4;
                    int i213 = i14;
                    bVar = bVarI;
                    ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j12, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar14, gajVar), bVarI), bVar, (i213 & 8078) | ((i213 << 6) & 234881024), 64);
                    tmzVar2 = tmzVar14;
                    hk5Var3 = hk5VarB;
                    z5 = z6;
                    qx80Var3 = qx80Var4;
                    l35Var3 = l35Var4;
                    ak5Var3 = ak5VarC;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    tmzVar2 = tmzVar;
                    l35Var3 = l35Var2;
                    hk5Var3 = hk5Var2;
                }
                pswVar2 = pswVar;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            i10 = i3;
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i10 |= i16;
                }
                i13 = i10;
                z3 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i13 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar1119 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11110 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11111 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11112 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    }
                    bVarI.Y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (pswVar3 == null) {
                        bVarI.N(1691738187);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a) {
                            objY6 = rzk.a(bVarI);
                        }
                        pswVar4 = (psw) objY6;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-499617780);
                        bVarI.X(false);
                        pswVar4 = pswVar3;
                    }
                    if (z6) {
                        j = ak5VarC.a;
                    } else {
                        j = ak5VarC.c;
                    }
                    long j13 = j;
                    if (z6) {
                        j2 = ak5VarC.b;
                    } else {
                        j2 = ak5VarC.d;
                    }
                    pswVar = pswVar3;
                    if (hk5VarB == null) {
                        bVarI.N(1691921830);
                        bVarI.X(false);
                        tmzVar4 = tmzVar4;
                        i14 = i14;
                        pswVar4 = pswVar4;
                        aj0Var = null;
                    } else {
                        bVarI.N(-499611205);
                        i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new SnapshotStateList();
                            bVarI.r(objY);
                        }
                        snapshotStateList = (SnapshotStateList) objY;
                        zM = bVarI.M(pswVar4);
                        objY2 = bVarI.y();
                        if (zM) {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        }
                        xvf.e(bVarI, pswVar4, (Function2) objY2);
                        xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (xxoVar instanceof vkm) {
                            f = hk5VarB.b;
                        } else if (xxoVar instanceof c4i) {
                            f = 0.0f;
                        } else {
                            f = hk5VarB.a;
                        }
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                            bVarI.r(objY3);
                        }
                        wd0Var = (wd0) objY3;
                        g7f g7fVar11 = new g7f(f);
                        boolean zA12 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zA = zA12 | z3 | bVarI.A(xxoVar);
                        objY4 = bVarI.y();
                        if (zA) {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        } else {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        }
                        xvf.e(bVarI, g7fVar11, (Function2) objY4);
                        aj0Var = wd0Var.c;
                        bVarI.X(false);
                    }
                    if (aj0Var != null) {
                    }
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        objY5 = new kk5();
                        bVarI.r(objY5);
                    }
                    tmz tmzVar15 = tmzVar4;
                    int i214 = i14;
                    bVar = bVarI;
                    ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j13, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar15, gajVar), bVarI), bVar, (i214 & 8078) | ((i214 << 6) & 234881024), 64);
                    tmzVar2 = tmzVar15;
                    hk5Var3 = hk5VarB;
                    z5 = z6;
                    qx80Var3 = qx80Var4;
                    l35Var3 = l35Var4;
                    ak5Var3 = ak5VarC;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    tmzVar2 = tmzVar;
                    l35Var3 = l35Var2;
                    hk5Var3 = hk5Var2;
                }
                pswVar2 = pswVar;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i10 |= 100663296;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i10 |= i16;
            }
            i13 = i10;
            z3 = true;
            if ((i13 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i13 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar11113 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar11114 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar11115 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar11116 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                }
                bVarI.Y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (pswVar3 == null) {
                    bVarI.N(1691738187);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a) {
                        objY6 = rzk.a(bVarI);
                    }
                    pswVar4 = (psw) objY6;
                    bVarI.X(false);
                } else {
                    bVarI.N(-499617780);
                    bVarI.X(false);
                    pswVar4 = pswVar3;
                }
                if (z6) {
                    j = ak5VarC.a;
                } else {
                    j = ak5VarC.c;
                }
                long j14 = j;
                if (z6) {
                    j2 = ak5VarC.b;
                } else {
                    j2 = ak5VarC.d;
                }
                pswVar = pswVar3;
                if (hk5VarB == null) {
                    bVarI.N(1691921830);
                    bVarI.X(false);
                    tmzVar4 = tmzVar4;
                    i14 = i14;
                    pswVar4 = pswVar4;
                    aj0Var = null;
                } else {
                    bVarI.N(-499611205);
                    i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new SnapshotStateList();
                        bVarI.r(objY);
                    }
                    snapshotStateList = (SnapshotStateList) objY;
                    zM = bVarI.M(pswVar4);
                    objY2 = bVarI.y();
                    if (zM) {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    }
                    xvf.e(bVarI, pswVar4, (Function2) objY2);
                    xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (xxoVar instanceof vkm) {
                        f = hk5VarB.b;
                    } else if (xxoVar instanceof c4i) {
                        f = 0.0f;
                    } else {
                        f = hk5VarB.a;
                    }
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                        bVarI.r(objY3);
                    }
                    wd0Var = (wd0) objY3;
                    g7f g7fVar12 = new g7f(f);
                    boolean zA13 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zA = zA13 | z3 | bVarI.A(xxoVar);
                    objY4 = bVarI.y();
                    if (zA) {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    } else {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    }
                    xvf.e(bVarI, g7fVar12, (Function2) objY4);
                    aj0Var = wd0Var.c;
                    bVarI.X(false);
                }
                if (aj0Var != null) {
                }
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new kk5();
                    bVarI.r(objY5);
                }
                tmz tmzVar16 = tmzVar4;
                int i215 = i14;
                bVar = bVarI;
                ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j14, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar16, gajVar), bVarI), bVar, (i215 & 8078) | ((i215 << 6) & 234881024), 64);
                tmzVar2 = tmzVar16;
                hk5Var3 = hk5VarB;
                z5 = z6;
                qx80Var3 = qx80Var4;
                l35Var3 = l35Var4;
                ak5Var3 = ak5VarC;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z5 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                tmzVar2 = tmzVar;
                l35Var3 = l35Var2;
                hk5Var3 = hk5Var2;
            }
            pswVar2 = pswVar;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                qx80Var2 = qx80Var;
                if (bVarI.M(qx80Var2)) {
                }
                i3 |= i18;
            } else {
                qx80Var2 = qx80Var;
            }
            i3 |= i18;
        } else {
            qx80Var2 = qx80Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ak5Var2 = ak5Var;
                if (bVarI.M(ak5Var2)) {
                }
                i3 |= i19;
            } else {
                ak5Var2 = ak5Var;
            }
            i3 |= i19;
        } else {
            ak5Var2 = ak5Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                hk5Var2 = hk5Var;
                if (bVarI.M(hk5Var2)) {
                }
                i3 |= i20;
            } else {
                hk5Var2 = hk5Var;
            }
            i3 |= i20;
        } else {
            hk5Var2 = hk5Var;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            l35Var2 = l35Var;
        } else {
            l35Var2 = l35Var;
            if ((i & 1572864) == 0) {
                if (bVarI.M(l35Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            if ((i & 12582912) == 0) {
                int i216 = i3;
                if (bVarI.M(tmzVar)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i216 | i9;
            }
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i10 |= i16;
                }
                i13 = i10;
                z3 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i13 & 1, z4)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11117 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11118 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    } else {
                        if (i17 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11119 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i13 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111110 = ek5.a;
                            ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                            i13 &= -57345;
                        } else {
                            ak5VarC = ak5Var2;
                        }
                        if ((i2 & 32) != 0) {
                            hk5VarB = ek5.b(31);
                            i13 &= -458753;
                        } else {
                            hk5VarB = hk5Var2;
                        }
                        if (i6 != 0) {
                            l35Var2 = null;
                        }
                        if (i8 != 0) {
                            tmzVar3 = ek5.a;
                        } else {
                            tmzVar3 = tmzVar;
                        }
                        qx80Var4 = qx80VarB;
                        l35Var4 = l35Var2;
                        z6 = z2;
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        i14 = i13;
                        tmzVar4 = tmzVar3;
                    }
                    bVarI.Y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (pswVar3 == null) {
                        bVarI.N(1691738187);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a) {
                            objY6 = rzk.a(bVarI);
                        }
                        pswVar4 = (psw) objY6;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-499617780);
                        bVarI.X(false);
                        pswVar4 = pswVar3;
                    }
                    if (z6) {
                        j = ak5VarC.a;
                    } else {
                        j = ak5VarC.c;
                    }
                    long j15 = j;
                    if (z6) {
                        j2 = ak5VarC.b;
                    } else {
                        j2 = ak5VarC.d;
                    }
                    pswVar = pswVar3;
                    if (hk5VarB == null) {
                        bVarI.N(1691921830);
                        bVarI.X(false);
                        tmzVar4 = tmzVar4;
                        i14 = i14;
                        pswVar4 = pswVar4;
                        aj0Var = null;
                    } else {
                        bVarI.N(-499611205);
                        i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new SnapshotStateList();
                            bVarI.r(objY);
                        }
                        snapshotStateList = (SnapshotStateList) objY;
                        zM = bVarI.M(pswVar4);
                        objY2 = bVarI.y();
                        if (zM) {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        } else {
                            objY2 = new fk5(pswVar4, snapshotStateList, null);
                            bVarI.r(objY2);
                        }
                        xvf.e(bVarI, pswVar4, (Function2) objY2);
                        xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                        if (z6) {
                            f = 0.0f;
                        } else if (xxoVar instanceof vkm) {
                            f = hk5VarB.b;
                        } else if (xxoVar instanceof c4i) {
                            f = 0.0f;
                        } else {
                            f = hk5VarB.a;
                        }
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                            bVarI.r(objY3);
                        }
                        wd0Var = (wd0) objY3;
                        g7f g7fVar13 = new g7f(f);
                        boolean zA14 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                        if (((i15 & 896) ^ 384) > 256) {
                        }
                        zA = zA14 | z3 | bVarI.A(xxoVar);
                        objY4 = bVarI.y();
                        if (zA) {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        } else {
                            objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                            bVarI.r(objY4);
                        }
                        xvf.e(bVarI, g7fVar13, (Function2) objY4);
                        aj0Var = wd0Var.c;
                        bVarI.X(false);
                    }
                    if (aj0Var != null) {
                    }
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        objY5 = new kk5();
                        bVarI.r(objY5);
                    }
                    tmz tmzVar17 = tmzVar4;
                    int i217 = i14;
                    bVar = bVarI;
                    ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j15, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar17, gajVar), bVarI), bVar, (i217 & 8078) | ((i217 << 6) & 234881024), 64);
                    tmzVar2 = tmzVar17;
                    hk5Var3 = hk5VarB;
                    z5 = z6;
                    qx80Var3 = qx80Var4;
                    l35Var3 = l35Var4;
                    ak5Var3 = ak5VarC;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z5 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    tmzVar2 = tmzVar;
                    l35Var3 = l35Var2;
                    hk5Var3 = hk5Var2;
                }
                pswVar2 = pswVar;
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i10 |= 100663296;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i10 |= i16;
            }
            i13 = i10;
            z3 = true;
            if ((i13 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i13 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111111 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111112 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111113 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111114 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                }
                bVarI.Y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (pswVar3 == null) {
                    bVarI.N(1691738187);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a) {
                        objY6 = rzk.a(bVarI);
                    }
                    pswVar4 = (psw) objY6;
                    bVarI.X(false);
                } else {
                    bVarI.N(-499617780);
                    bVarI.X(false);
                    pswVar4 = pswVar3;
                }
                if (z6) {
                    j = ak5VarC.a;
                } else {
                    j = ak5VarC.c;
                }
                long j16 = j;
                if (z6) {
                    j2 = ak5VarC.b;
                } else {
                    j2 = ak5VarC.d;
                }
                pswVar = pswVar3;
                if (hk5VarB == null) {
                    bVarI.N(1691921830);
                    bVarI.X(false);
                    tmzVar4 = tmzVar4;
                    i14 = i14;
                    pswVar4 = pswVar4;
                    aj0Var = null;
                } else {
                    bVarI.N(-499611205);
                    i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new SnapshotStateList();
                        bVarI.r(objY);
                    }
                    snapshotStateList = (SnapshotStateList) objY;
                    zM = bVarI.M(pswVar4);
                    objY2 = bVarI.y();
                    if (zM) {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    }
                    xvf.e(bVarI, pswVar4, (Function2) objY2);
                    xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (xxoVar instanceof vkm) {
                        f = hk5VarB.b;
                    } else if (xxoVar instanceof c4i) {
                        f = 0.0f;
                    } else {
                        f = hk5VarB.a;
                    }
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                        bVarI.r(objY3);
                    }
                    wd0Var = (wd0) objY3;
                    g7f g7fVar14 = new g7f(f);
                    boolean zA15 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zA = zA15 | z3 | bVarI.A(xxoVar);
                    objY4 = bVarI.y();
                    if (zA) {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    } else {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    }
                    xvf.e(bVarI, g7fVar14, (Function2) objY4);
                    aj0Var = wd0Var.c;
                    bVarI.X(false);
                }
                if (aj0Var != null) {
                }
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new kk5();
                    bVarI.r(objY5);
                }
                tmz tmzVar18 = tmzVar4;
                int i218 = i14;
                bVar = bVarI;
                ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j16, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar18, gajVar), bVarI), bVar, (i218 & 8078) | ((i218 << 6) & 234881024), 64);
                tmzVar2 = tmzVar18;
                hk5Var3 = hk5VarB;
                z5 = z6;
                qx80Var3 = qx80Var4;
                l35Var3 = l35Var4;
                ak5Var3 = ak5VarC;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z5 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                tmzVar2 = tmzVar;
                l35Var3 = l35Var2;
                hk5Var3 = hk5Var2;
            }
            pswVar2 = pswVar;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        i10 = i3;
        i11 = i2 & 256;
        if (i11 != 0) {
            if ((i & 100663296) == 0) {
                if (bVarI.M(pswVar)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i10 |= i16;
            }
            i13 = i10;
            z3 = true;
            if ((i13 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i13 & 1, z4)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111115 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111116 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                } else {
                    if (i17 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111117 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i13 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111118 = ek5.a;
                        ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                        i13 &= -57345;
                    } else {
                        ak5VarC = ak5Var2;
                    }
                    if ((i2 & 32) != 0) {
                        hk5VarB = ek5.b(31);
                        i13 &= -458753;
                    } else {
                        hk5VarB = hk5Var2;
                    }
                    if (i6 != 0) {
                        l35Var2 = null;
                    }
                    if (i8 != 0) {
                        tmzVar3 = ek5.a;
                    } else {
                        tmzVar3 = tmzVar;
                    }
                    qx80Var4 = qx80VarB;
                    l35Var4 = l35Var2;
                    z6 = z2;
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    i14 = i13;
                    tmzVar4 = tmzVar3;
                }
                bVarI.Y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (pswVar3 == null) {
                    bVarI.N(1691738187);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a) {
                        objY6 = rzk.a(bVarI);
                    }
                    pswVar4 = (psw) objY6;
                    bVarI.X(false);
                } else {
                    bVarI.N(-499617780);
                    bVarI.X(false);
                    pswVar4 = pswVar3;
                }
                if (z6) {
                    j = ak5VarC.a;
                } else {
                    j = ak5VarC.c;
                }
                long j17 = j;
                if (z6) {
                    j2 = ak5VarC.b;
                } else {
                    j2 = ak5VarC.d;
                }
                pswVar = pswVar3;
                if (hk5VarB == null) {
                    bVarI.N(1691921830);
                    bVarI.X(false);
                    tmzVar4 = tmzVar4;
                    i14 = i14;
                    pswVar4 = pswVar4;
                    aj0Var = null;
                } else {
                    bVarI.N(-499611205);
                    i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new SnapshotStateList();
                        bVarI.r(objY);
                    }
                    snapshotStateList = (SnapshotStateList) objY;
                    zM = bVarI.M(pswVar4);
                    objY2 = bVarI.y();
                    if (zM) {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    } else {
                        objY2 = new fk5(pswVar4, snapshotStateList, null);
                        bVarI.r(objY2);
                    }
                    xvf.e(bVarI, pswVar4, (Function2) objY2);
                    xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                    if (z6) {
                        f = 0.0f;
                    } else if (xxoVar instanceof vkm) {
                        f = hk5VarB.b;
                    } else if (xxoVar instanceof c4i) {
                        f = 0.0f;
                    } else {
                        f = hk5VarB.a;
                    }
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                        bVarI.r(objY3);
                    }
                    wd0Var = (wd0) objY3;
                    g7f g7fVar15 = new g7f(f);
                    boolean zA16 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                    if (((i15 & 896) ^ 384) > 256) {
                    }
                    zA = zA16 | z3 | bVarI.A(xxoVar);
                    objY4 = bVarI.y();
                    if (zA) {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    } else {
                        objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                        bVarI.r(objY4);
                    }
                    xvf.e(bVarI, g7fVar15, (Function2) objY4);
                    aj0Var = wd0Var.c;
                    bVarI.X(false);
                }
                if (aj0Var != null) {
                }
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new kk5();
                    bVarI.r(objY5);
                }
                tmz tmzVar19 = tmzVar4;
                int i219 = i14;
                bVar = bVarI;
                ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j17, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar19, gajVar), bVarI), bVar, (i219 & 8078) | ((i219 << 6) & 234881024), 64);
                tmzVar2 = tmzVar19;
                hk5Var3 = hk5VarB;
                z5 = z6;
                qx80Var3 = qx80Var4;
                l35Var3 = l35Var4;
                ak5Var3 = ak5VarC;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z5 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                tmzVar2 = tmzVar;
                l35Var3 = l35Var2;
                hk5Var3 = hk5Var2;
            }
            pswVar2 = pswVar;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i10 |= 100663296;
        if ((i & 805306368) == 0) {
            if (bVarI.A(gajVar)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i10 |= i16;
        }
        i13 = i10;
        z3 = true;
        if ((i13 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i13 & 1, z4)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    dVar2 = d.a.b;
                } else {
                    dVar2 = dVar;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    umz umzVar111119 = ek5.a;
                    qx80VarB = xy80.b(ok5.a, bVarI);
                    i13 &= -7169;
                } else {
                    qx80VarB = qx80Var2;
                }
                if ((i2 & 16) != 0) {
                    umz umzVar1111110 = ek5.a;
                    ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                    i13 &= -57345;
                } else {
                    ak5VarC = ak5Var2;
                }
                if ((i2 & 32) != 0) {
                    hk5VarB = ek5.b(31);
                    i13 &= -458753;
                } else {
                    hk5VarB = hk5Var2;
                }
                if (i6 != 0) {
                    l35Var2 = null;
                }
                if (i8 != 0) {
                    tmzVar3 = ek5.a;
                } else {
                    tmzVar3 = tmzVar;
                }
                qx80Var4 = qx80VarB;
                l35Var4 = l35Var2;
                z6 = z2;
                if (i11 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                i14 = i13;
                tmzVar4 = tmzVar3;
            } else {
                if (i17 != 0) {
                    dVar2 = d.a.b;
                } else {
                    dVar2 = dVar;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    umz umzVar1111111 = ek5.a;
                    qx80VarB = xy80.b(ok5.a, bVarI);
                    i13 &= -7169;
                } else {
                    qx80VarB = qx80Var2;
                }
                if ((i2 & 16) != 0) {
                    umz umzVar1111112 = ek5.a;
                    ak5VarC = ek5.c((d68) bVarI.O(g68.a));
                    i13 &= -57345;
                } else {
                    ak5VarC = ak5Var2;
                }
                if ((i2 & 32) != 0) {
                    hk5VarB = ek5.b(31);
                    i13 &= -458753;
                } else {
                    hk5VarB = hk5Var2;
                }
                if (i6 != 0) {
                    l35Var2 = null;
                }
                if (i8 != 0) {
                    tmzVar3 = ek5.a;
                } else {
                    tmzVar3 = tmzVar;
                }
                qx80Var4 = qx80VarB;
                l35Var4 = l35Var2;
                z6 = z2;
                if (i11 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                i14 = i13;
                tmzVar4 = tmzVar3;
            }
            bVarI.Y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (pswVar3 == null) {
                bVarI.N(1691738187);
                objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = rzk.a(bVarI);
                }
                pswVar4 = (psw) objY6;
                bVarI.X(false);
            } else {
                bVarI.N(-499617780);
                bVarI.X(false);
                pswVar4 = pswVar3;
            }
            if (z6) {
                j = ak5VarC.a;
            } else {
                j = ak5VarC.c;
            }
            long j18 = j;
            if (z6) {
                j2 = ak5VarC.b;
            } else {
                j2 = ak5VarC.d;
            }
            pswVar = pswVar3;
            if (hk5VarB == null) {
                bVarI.N(1691921830);
                bVarI.X(false);
                tmzVar4 = tmzVar4;
                i14 = i14;
                pswVar4 = pswVar4;
                aj0Var = null;
            } else {
                bVarI.N(-499611205);
                i15 = ((i14 >> 6) & 14) | ((i14 >> 9) & 896);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new SnapshotStateList();
                    bVarI.r(objY);
                }
                snapshotStateList = (SnapshotStateList) objY;
                zM = bVarI.M(pswVar4);
                objY2 = bVarI.y();
                if (zM) {
                    objY2 = new fk5(pswVar4, snapshotStateList, null);
                    bVarI.r(objY2);
                } else {
                    objY2 = new fk5(pswVar4, snapshotStateList, null);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, pswVar4, (Function2) objY2);
                xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                if (z6) {
                    f = 0.0f;
                } else if (xxoVar instanceof vkm) {
                    f = hk5VarB.b;
                } else if (xxoVar instanceof c4i) {
                    f = 0.0f;
                } else {
                    f = hk5VarB.a;
                }
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new wd0(new g7f(f), gjs.d, null, 12);
                    bVarI.r(objY3);
                }
                wd0Var = (wd0) objY3;
                g7f g7fVar16 = new g7f(f);
                boolean zA17 = bVarI.A(wd0Var) | bVarI.c(f) | ((((i15 & 14) ^ 6) <= 4 && bVarI.b(z6)) || (i15 & 6) == 4);
                if (((i15 & 896) ^ 384) > 256) {
                }
                zA = zA17 | z3 | bVarI.A(xxoVar);
                objY4 = bVarI.y();
                if (zA) {
                    objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                    bVarI.r(objY4);
                } else {
                    objY4 = new gk5(wd0Var, f, z6, hk5VarB, xxoVar, null);
                    bVarI.r(objY4);
                }
                xvf.e(bVarI, g7fVar16, (Function2) objY4);
                aj0Var = wd0Var.c;
                bVarI.X(false);
            }
            if (aj0Var != null) {
            }
            objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new kk5();
                bVarI.r(objY5);
            }
            tmz tmzVar110 = tmzVar4;
            int i2110 = i14;
            bVar = bVarI;
            ihe0.c(function0, xa80.b(dVar2, false, (Function1) objY5), z6, qx80Var4, j18, j2, 0.0f, f2, l35Var4, pswVar4, pp8.b(-535639973, new a(j2, tmzVar110, gajVar), bVarI), bVar, (i2110 & 8078) | ((i2110 << 6) & 234881024), 64);
            tmzVar2 = tmzVar110;
            hk5Var3 = hk5VarB;
            z5 = z6;
            qx80Var3 = qx80Var4;
            l35Var3 = l35Var4;
            ak5Var3 = ak5VarC;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            z5 = z2;
            qx80Var3 = qx80Var2;
            ak5Var3 = ak5Var2;
            tmzVar2 = tmzVar;
            l35Var3 = l35Var2;
            hk5Var3 = hk5Var2;
        }
        pswVar2 = pswVar;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lk5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk5.a(function0, dVar2, z5, qx80Var3, ak5Var3, hk5Var3, l35Var3, tmzVar2, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x012d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:110:0x0134  */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x015e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:126:0x019b  */
    /* JADX WARN: Code duplicated, block: B:129:0x01be  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    public static final void b(final Function0 function0, d dVar, boolean z, qx80 qx80Var, ak5 ak5Var, l35 l35Var, tmz tmzVar, final gaj gajVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        qx80 qx80VarB;
        ak5 ak5VarD;
        int i6;
        l35 l35VarA;
        int i7;
        tmz tmzVar2;
        int i8;
        int i9;
        boolean z3;
        b bVar;
        final d dVar2;
        final boolean z4;
        final qx80 qx80Var2;
        final ak5 ak5Var2;
        final l35 l35Var2;
        final tmz tmzVar3;
        e eVarZ;
        d dVar3;
        d dVar4;
        float f;
        long jC;
        float f2;
        int i10;
        b bVarI = aVar.i(399974542);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                i3 |= bVarI.M(dVar) ? 32 : 16;
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
                        qx80VarB = qx80Var;
                        int i12 = bVarI.M(qx80VarB) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        qx80VarB = qx80Var;
                    }
                    i3 |= i12;
                } else {
                    qx80VarB = qx80Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        ak5VarD = ak5Var;
                        int i13 = bVarI.M(ak5VarD) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i3 |= i13;
                    } else {
                        ak5VarD = ak5Var;
                    }
                    i3 |= i13;
                } else {
                    ak5VarD = ak5Var;
                }
                i6 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        l35VarA = l35Var;
                        int i14 = bVarI.M(l35VarA) ? 1048576 : 524288;
                        i6 |= i14;
                    } else {
                        l35VarA = l35Var;
                    }
                    i6 |= i14;
                } else {
                    l35VarA = l35Var;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        tmzVar2 = tmzVar;
                        if (bVarI.M(tmzVar2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i6 |= i8;
                    }
                    i9 = i6 | 100663296;
                    if ((805306368 & i) != 0) {
                        if (bVarI.A(gajVar)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i9 |= i10;
                    }
                    if ((306783379 & i9) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i9 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0 || bVarI.h0()) {
                            if (i11 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar = ek5.a;
                                i9 &= -7169;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar2 = ek5.a;
                                i9 &= -57345;
                                ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                            }
                            if ((i2 & 64) != 0) {
                                umz umzVar3 = ek5.a;
                                f = ok5.c;
                                if (z2) {
                                    bVarI.N(-112346942);
                                    jC = g68.d(h9z.d, bVarI);
                                    bVarI.X(false);
                                    f2 = f;
                                } else {
                                    bVarI.N(-112259336);
                                    jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                    bVarI.X(false);
                                    f2 = f;
                                }
                                i9 &= -3670017;
                                l35VarA = m35.a(f2, jC);
                            }
                            if (i7 != 0) {
                                tmzVar2 = ek5.a;
                            }
                            dVar4 = dVar3;
                        } else {
                            bVarI.G();
                            if ((i2 & 8) != 0) {
                                i9 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i9 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i9 &= -3670017;
                            }
                            dVar4 = dVar;
                        }
                        qx80 qx80Var3 = qx80VarB;
                        ak5 ak5Var3 = ak5VarD;
                        l35 l35Var3 = l35VarA;
                        tmz tmzVar4 = tmzVar2;
                        boolean z5 = z2;
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z5, qx80Var3, ak5Var3, null, l35Var3, tmzVar4, null, gajVar, bVar, i9 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z5;
                        qx80Var2 = qx80Var3;
                        ak5Var2 = ak5Var3;
                        l35Var2 = l35Var3;
                        tmzVar3 = tmzVar4;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        z4 = z2;
                        qx80Var2 = qx80VarB;
                        ak5Var2 = ak5VarD;
                        l35Var2 = l35VarA;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: ik5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                tmzVar2 = tmzVar;
                i9 = i6 | 100663296;
                if ((805306368 & i) != 0) {
                    if (bVarI.A(gajVar)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i9 |= i10;
                }
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar4 = ek5.a;
                            i9 &= -7169;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar5 = ek5.a;
                            i9 &= -57345;
                            ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                        }
                        if ((i2 & 64) != 0) {
                            umz umzVar6 = ek5.a;
                            f = ok5.c;
                            if (z2) {
                                bVarI.N(-112346942);
                                jC = g68.d(h9z.d, bVarI);
                                bVarI.X(false);
                                f2 = f;
                            } else {
                                bVarI.N(-112259336);
                                jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                bVarI.X(false);
                                f2 = f;
                            }
                            i9 &= -3670017;
                            l35VarA = m35.a(f2, jC);
                        }
                        if (i7 != 0) {
                            tmzVar2 = ek5.a;
                        }
                        dVar4 = dVar3;
                    } else {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar7 = ek5.a;
                            i9 &= -7169;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar8 = ek5.a;
                            i9 &= -57345;
                            ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                        }
                        if ((i2 & 64) != 0) {
                            umz umzVar9 = ek5.a;
                            f = ok5.c;
                            if (z2) {
                                bVarI.N(-112346942);
                                jC = g68.d(h9z.d, bVarI);
                                bVarI.X(false);
                                f2 = f;
                            } else {
                                bVarI.N(-112259336);
                                jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                bVarI.X(false);
                                f2 = f;
                            }
                            i9 &= -3670017;
                            l35VarA = m35.a(f2, jC);
                        }
                        if (i7 != 0) {
                            tmzVar2 = ek5.a;
                        }
                        dVar4 = dVar3;
                    }
                    qx80 qx80Var4 = qx80VarB;
                    ak5 ak5Var4 = ak5VarD;
                    l35 l35Var4 = l35VarA;
                    tmz tmzVar5 = tmzVar2;
                    boolean z6 = z2;
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z6, qx80Var4, ak5Var4, null, l35Var4, tmzVar5, null, gajVar, bVar, i9 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z6;
                    qx80Var2 = qx80Var4;
                    ak5Var2 = ak5Var4;
                    l35Var2 = l35Var4;
                    tmzVar3 = tmzVar5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z4 = z2;
                    qx80Var2 = qx80VarB;
                    ak5Var2 = ak5VarD;
                    l35Var2 = l35VarA;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ik5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    qx80VarB = qx80Var;
                    if (bVarI.M(qx80VarB)) {
                    }
                    i3 |= i12;
                } else {
                    qx80VarB = qx80Var;
                }
                i3 |= i12;
            } else {
                qx80VarB = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ak5VarD = ak5Var;
                    if (bVarI.M(ak5VarD)) {
                    }
                    i3 |= i13;
                } else {
                    ak5VarD = ak5Var;
                }
                i3 |= i13;
            } else {
                ak5VarD = ak5Var;
            }
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    l35VarA = l35Var;
                    if (bVarI.M(l35VarA)) {
                    }
                    i6 |= i14;
                } else {
                    l35VarA = l35Var;
                }
                i6 |= i14;
            } else {
                l35VarA = l35Var;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    tmzVar2 = tmzVar;
                    if (bVarI.M(tmzVar2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i6 |= i8;
                }
                i9 = i6 | 100663296;
                if ((805306368 & i) != 0) {
                    if (bVarI.A(gajVar)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i9 |= i10;
                }
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar10 = ek5.a;
                            i9 &= -7169;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11 = ek5.a;
                            i9 &= -57345;
                            ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                        }
                        if ((i2 & 64) != 0) {
                            umz umzVar12 = ek5.a;
                            f = ok5.c;
                            if (z2) {
                                bVarI.N(-112346942);
                                jC = g68.d(h9z.d, bVarI);
                                bVarI.X(false);
                                f2 = f;
                            } else {
                                bVarI.N(-112259336);
                                jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                bVarI.X(false);
                                f2 = f;
                            }
                            i9 &= -3670017;
                            l35VarA = m35.a(f2, jC);
                        }
                        if (i7 != 0) {
                            tmzVar2 = ek5.a;
                        }
                        dVar4 = dVar3;
                    } else {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar13 = ek5.a;
                            i9 &= -7169;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar14 = ek5.a;
                            i9 &= -57345;
                            ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                        }
                        if ((i2 & 64) != 0) {
                            umz umzVar15 = ek5.a;
                            f = ok5.c;
                            if (z2) {
                                bVarI.N(-112346942);
                                jC = g68.d(h9z.d, bVarI);
                                bVarI.X(false);
                                f2 = f;
                            } else {
                                bVarI.N(-112259336);
                                jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                bVarI.X(false);
                                f2 = f;
                            }
                            i9 &= -3670017;
                            l35VarA = m35.a(f2, jC);
                        }
                        if (i7 != 0) {
                            tmzVar2 = ek5.a;
                        }
                        dVar4 = dVar3;
                    }
                    qx80 qx80Var5 = qx80VarB;
                    ak5 ak5Var5 = ak5VarD;
                    l35 l35Var5 = l35VarA;
                    tmz tmzVar6 = tmzVar2;
                    boolean z7 = z2;
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z7, qx80Var5, ak5Var5, null, l35Var5, tmzVar6, null, gajVar, bVar, i9 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z7;
                    qx80Var2 = qx80Var5;
                    ak5Var2 = ak5Var5;
                    l35Var2 = l35Var5;
                    tmzVar3 = tmzVar6;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z4 = z2;
                    qx80Var2 = qx80VarB;
                    ak5Var2 = ak5VarD;
                    l35Var2 = l35VarA;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ik5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 12582912;
            tmzVar2 = tmzVar;
            i9 = i6 | 100663296;
            if ((805306368 & i) != 0) {
                if (bVarI.A(gajVar)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i9 |= i10;
            }
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar16 = ek5.a;
                        i9 &= -7169;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar17 = ek5.a;
                        i9 &= -57345;
                        ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                    }
                    if ((i2 & 64) != 0) {
                        umz umzVar18 = ek5.a;
                        f = ok5.c;
                        if (z2) {
                            bVarI.N(-112346942);
                            jC = g68.d(h9z.d, bVarI);
                            bVarI.X(false);
                            f2 = f;
                        } else {
                            bVarI.N(-112259336);
                            jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                            bVarI.X(false);
                            f2 = f;
                        }
                        i9 &= -3670017;
                        l35VarA = m35.a(f2, jC);
                    }
                    if (i7 != 0) {
                        tmzVar2 = ek5.a;
                    }
                    dVar4 = dVar3;
                } else {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar19 = ek5.a;
                        i9 &= -7169;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar110 = ek5.a;
                        i9 &= -57345;
                        ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                    }
                    if ((i2 & 64) != 0) {
                        umz umzVar111 = ek5.a;
                        f = ok5.c;
                        if (z2) {
                            bVarI.N(-112346942);
                            jC = g68.d(h9z.d, bVarI);
                            bVarI.X(false);
                            f2 = f;
                        } else {
                            bVarI.N(-112259336);
                            jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                            bVarI.X(false);
                            f2 = f;
                        }
                        i9 &= -3670017;
                        l35VarA = m35.a(f2, jC);
                    }
                    if (i7 != 0) {
                        tmzVar2 = ek5.a;
                    }
                    dVar4 = dVar3;
                }
                qx80 qx80Var6 = qx80VarB;
                ak5 ak5Var6 = ak5VarD;
                l35 l35Var6 = l35VarA;
                tmz tmzVar7 = tmzVar2;
                boolean z8 = z2;
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z8, qx80Var6, ak5Var6, null, l35Var6, tmzVar7, null, gajVar, bVar, i9 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z8;
                qx80Var2 = qx80Var6;
                ak5Var2 = ak5Var6;
                l35Var2 = l35Var6;
                tmzVar3 = tmzVar7;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z4 = z2;
                qx80Var2 = qx80VarB;
                ak5Var2 = ak5VarD;
                l35Var2 = l35VarA;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ik5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
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
                    qx80VarB = qx80Var;
                    if (bVarI.M(qx80VarB)) {
                    }
                    i3 |= i12;
                } else {
                    qx80VarB = qx80Var;
                }
                i3 |= i12;
            } else {
                qx80VarB = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ak5VarD = ak5Var;
                    if (bVarI.M(ak5VarD)) {
                    }
                    i3 |= i13;
                } else {
                    ak5VarD = ak5Var;
                }
                i3 |= i13;
            } else {
                ak5VarD = ak5Var;
            }
            i6 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    l35VarA = l35Var;
                    if (bVarI.M(l35VarA)) {
                    }
                    i6 |= i14;
                } else {
                    l35VarA = l35Var;
                }
                i6 |= i14;
            } else {
                l35VarA = l35Var;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    tmzVar2 = tmzVar;
                    if (bVarI.M(tmzVar2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i6 |= i8;
                }
                i9 = i6 | 100663296;
                if ((805306368 & i) != 0) {
                    if (bVarI.A(gajVar)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i9 |= i10;
                }
                if ((306783379 & i9) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i9 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar112 = ek5.a;
                            i9 &= -7169;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar113 = ek5.a;
                            i9 &= -57345;
                            ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                        }
                        if ((i2 & 64) != 0) {
                            umz umzVar114 = ek5.a;
                            f = ok5.c;
                            if (z2) {
                                bVarI.N(-112346942);
                                jC = g68.d(h9z.d, bVarI);
                                bVarI.X(false);
                                f2 = f;
                            } else {
                                bVarI.N(-112259336);
                                jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                bVarI.X(false);
                                f2 = f;
                            }
                            i9 &= -3670017;
                            l35VarA = m35.a(f2, jC);
                        }
                        if (i7 != 0) {
                            tmzVar2 = ek5.a;
                        }
                        dVar4 = dVar3;
                    } else {
                        if (i11 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar115 = ek5.a;
                            i9 &= -7169;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar116 = ek5.a;
                            i9 &= -57345;
                            ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                        }
                        if ((i2 & 64) != 0) {
                            umz umzVar117 = ek5.a;
                            f = ok5.c;
                            if (z2) {
                                bVarI.N(-112346942);
                                jC = g68.d(h9z.d, bVarI);
                                bVarI.X(false);
                                f2 = f;
                            } else {
                                bVarI.N(-112259336);
                                jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                                bVarI.X(false);
                                f2 = f;
                            }
                            i9 &= -3670017;
                            l35VarA = m35.a(f2, jC);
                        }
                        if (i7 != 0) {
                            tmzVar2 = ek5.a;
                        }
                        dVar4 = dVar3;
                    }
                    qx80 qx80Var7 = qx80VarB;
                    ak5 ak5Var7 = ak5VarD;
                    l35 l35Var7 = l35VarA;
                    tmz tmzVar8 = tmzVar2;
                    boolean z9 = z2;
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z9, qx80Var7, ak5Var7, null, l35Var7, tmzVar8, null, gajVar, bVar, i9 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z9;
                    qx80Var2 = qx80Var7;
                    ak5Var2 = ak5Var7;
                    l35Var2 = l35Var7;
                    tmzVar3 = tmzVar8;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    z4 = z2;
                    qx80Var2 = qx80VarB;
                    ak5Var2 = ak5VarD;
                    l35Var2 = l35VarA;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ik5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i6 |= 12582912;
            tmzVar2 = tmzVar;
            i9 = i6 | 100663296;
            if ((805306368 & i) != 0) {
                if (bVarI.A(gajVar)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i9 |= i10;
            }
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar118 = ek5.a;
                        i9 &= -7169;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar119 = ek5.a;
                        i9 &= -57345;
                        ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                    }
                    if ((i2 & 64) != 0) {
                        umz umzVar1110 = ek5.a;
                        f = ok5.c;
                        if (z2) {
                            bVarI.N(-112346942);
                            jC = g68.d(h9z.d, bVarI);
                            bVarI.X(false);
                            f2 = f;
                        } else {
                            bVarI.N(-112259336);
                            jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                            bVarI.X(false);
                            f2 = f;
                        }
                        i9 &= -3670017;
                        l35VarA = m35.a(f2, jC);
                    }
                    if (i7 != 0) {
                        tmzVar2 = ek5.a;
                    }
                    dVar4 = dVar3;
                } else {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1111 = ek5.a;
                        i9 &= -7169;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1112 = ek5.a;
                        i9 &= -57345;
                        ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                    }
                    if ((i2 & 64) != 0) {
                        umz umzVar1113 = ek5.a;
                        f = ok5.c;
                        if (z2) {
                            bVarI.N(-112346942);
                            jC = g68.d(h9z.d, bVarI);
                            bVarI.X(false);
                            f2 = f;
                        } else {
                            bVarI.N(-112259336);
                            jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                            bVarI.X(false);
                            f2 = f;
                        }
                        i9 &= -3670017;
                        l35VarA = m35.a(f2, jC);
                    }
                    if (i7 != 0) {
                        tmzVar2 = ek5.a;
                    }
                    dVar4 = dVar3;
                }
                qx80 qx80Var8 = qx80VarB;
                ak5 ak5Var8 = ak5VarD;
                l35 l35Var8 = l35VarA;
                tmz tmzVar9 = tmzVar2;
                boolean z10 = z2;
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z10, qx80Var8, ak5Var8, null, l35Var8, tmzVar9, null, gajVar, bVar, i9 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z10;
                qx80Var2 = qx80Var8;
                ak5Var2 = ak5Var8;
                l35Var2 = l35Var8;
                tmzVar3 = tmzVar9;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z4 = z2;
                qx80Var2 = qx80VarB;
                ak5Var2 = ak5VarD;
                l35Var2 = l35VarA;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ik5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                qx80VarB = qx80Var;
                if (bVarI.M(qx80VarB)) {
                }
                i3 |= i12;
            } else {
                qx80VarB = qx80Var;
            }
            i3 |= i12;
        } else {
            qx80VarB = qx80Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ak5VarD = ak5Var;
                if (bVarI.M(ak5VarD)) {
                }
                i3 |= i13;
            } else {
                ak5VarD = ak5Var;
            }
            i3 |= i13;
        } else {
            ak5VarD = ak5Var;
        }
        i6 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                l35VarA = l35Var;
                if (bVarI.M(l35VarA)) {
                }
                i6 |= i14;
            } else {
                l35VarA = l35Var;
            }
            i6 |= i14;
        } else {
            l35VarA = l35Var;
        }
        i7 = i2 & 128;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                tmzVar2 = tmzVar;
                if (bVarI.M(tmzVar2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i6 |= i8;
            }
            i9 = i6 | 100663296;
            if ((805306368 & i) != 0) {
                if (bVarI.A(gajVar)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i9 |= i10;
            }
            if ((306783379 & i9) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i9 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1114 = ek5.a;
                        i9 &= -7169;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1115 = ek5.a;
                        i9 &= -57345;
                        ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                    }
                    if ((i2 & 64) != 0) {
                        umz umzVar1116 = ek5.a;
                        f = ok5.c;
                        if (z2) {
                            bVarI.N(-112346942);
                            jC = g68.d(h9z.d, bVarI);
                            bVarI.X(false);
                            f2 = f;
                        } else {
                            bVarI.N(-112259336);
                            jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                            bVarI.X(false);
                            f2 = f;
                        }
                        i9 &= -3670017;
                        l35VarA = m35.a(f2, jC);
                    }
                    if (i7 != 0) {
                        tmzVar2 = ek5.a;
                    }
                    dVar4 = dVar3;
                } else {
                    if (i11 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1117 = ek5.a;
                        i9 &= -7169;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1118 = ek5.a;
                        i9 &= -57345;
                        ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                    }
                    if ((i2 & 64) != 0) {
                        umz umzVar1119 = ek5.a;
                        f = ok5.c;
                        if (z2) {
                            bVarI.N(-112346942);
                            jC = g68.d(h9z.d, bVarI);
                            bVarI.X(false);
                            f2 = f;
                        } else {
                            bVarI.N(-112259336);
                            jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                            bVarI.X(false);
                            f2 = f;
                        }
                        i9 &= -3670017;
                        l35VarA = m35.a(f2, jC);
                    }
                    if (i7 != 0) {
                        tmzVar2 = ek5.a;
                    }
                    dVar4 = dVar3;
                }
                qx80 qx80Var9 = qx80VarB;
                ak5 ak5Var9 = ak5VarD;
                l35 l35Var9 = l35VarA;
                tmz tmzVar10 = tmzVar2;
                boolean z11 = z2;
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z11, qx80Var9, ak5Var9, null, l35Var9, tmzVar10, null, gajVar, bVar, i9 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z11;
                qx80Var2 = qx80Var9;
                ak5Var2 = ak5Var9;
                l35Var2 = l35Var9;
                tmzVar3 = tmzVar10;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                z4 = z2;
                qx80Var2 = qx80VarB;
                ak5Var2 = ak5VarD;
                l35Var2 = l35VarA;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ik5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 12582912;
        tmzVar2 = tmzVar;
        i9 = i6 | 100663296;
        if ((805306368 & i) != 0) {
            if (bVarI.A(gajVar)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i9 |= i10;
        }
        if ((306783379 & i9) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i9 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    umz umzVar11110 = ek5.a;
                    i9 &= -7169;
                    qx80VarB = xy80.b(ok5.a, bVarI);
                }
                if ((i2 & 16) != 0) {
                    umz umzVar11111 = ek5.a;
                    i9 &= -57345;
                    ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                }
                if ((i2 & 64) != 0) {
                    umz umzVar11112 = ek5.a;
                    f = ok5.c;
                    if (z2) {
                        bVarI.N(-112346942);
                        jC = g68.d(h9z.d, bVarI);
                        bVarI.X(false);
                        f2 = f;
                    } else {
                        bVarI.N(-112259336);
                        jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                        bVarI.X(false);
                        f2 = f;
                    }
                    i9 &= -3670017;
                    l35VarA = m35.a(f2, jC);
                }
                if (i7 != 0) {
                    tmzVar2 = ek5.a;
                }
                dVar4 = dVar3;
            } else {
                if (i11 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    umz umzVar11113 = ek5.a;
                    i9 &= -7169;
                    qx80VarB = xy80.b(ok5.a, bVarI);
                }
                if ((i2 & 16) != 0) {
                    umz umzVar11114 = ek5.a;
                    i9 &= -57345;
                    ak5VarD = ek5.d((d68) bVarI.O(g68.a));
                }
                if ((i2 & 64) != 0) {
                    umz umzVar11115 = ek5.a;
                    f = ok5.c;
                    if (z2) {
                        bVarI.N(-112346942);
                        jC = g68.d(h9z.d, bVarI);
                        bVarI.X(false);
                        f2 = f;
                    } else {
                        bVarI.N(-112259336);
                        jC = j58.c(0.1f, g68.d(h9z.d, bVarI));
                        bVarI.X(false);
                        f2 = f;
                    }
                    i9 &= -3670017;
                    l35VarA = m35.a(f2, jC);
                }
                if (i7 != 0) {
                    tmzVar2 = ek5.a;
                }
                dVar4 = dVar3;
            }
            qx80 qx80Var10 = qx80VarB;
            ak5 ak5Var10 = ak5VarD;
            l35 l35Var10 = l35VarA;
            tmz tmzVar11 = tmzVar2;
            boolean z12 = z2;
            bVarI.Y();
            bVar = bVarI;
            a(function0, dVar4, z12, qx80Var10, ak5Var10, null, l35Var10, tmzVar11, null, gajVar, bVar, i9 & 2147483646, 0);
            dVar2 = dVar4;
            z4 = z12;
            qx80Var2 = qx80Var10;
            ak5Var2 = ak5Var10;
            l35Var2 = l35Var10;
            tmzVar3 = tmzVar11;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            z4 = z2;
            qx80Var2 = qx80VarB;
            ak5Var2 = ak5VarD;
            l35Var2 = l35VarA;
            tmzVar3 = tmzVar2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ik5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk5.b(function0, dVar2, z4, qx80Var2, ak5Var2, l35Var2, tmzVar3, gajVar, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x010b  */
    /* JADX WARN: Code duplicated, block: B:102:0x010e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0122  */
    /* JADX WARN: Code duplicated, block: B:107:0x0125  */
    /* JADX WARN: Code duplicated, block: B:110:0x012e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:122:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x015c  */
    /* JADX WARN: Code duplicated, block: B:124:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0163  */
    /* JADX WARN: Code duplicated, block: B:129:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0174  */
    /* JADX WARN: Code duplicated, block: B:133:0x0179  */
    /* JADX WARN: Code duplicated, block: B:134:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x018c  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0194  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0105  */
    public static final void c(final Function0 function0, d dVar, boolean z, qx80 qx80Var, ak5 ak5Var, l35 l35Var, tmz tmzVar, psw pswVar, final gaj gajVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        qx80 qx80Var2;
        ak5 ak5Var2;
        int i6;
        int i7;
        l35 l35Var2;
        int i8;
        int i9;
        tmz tmzVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        b bVar;
        final d dVar2;
        final psw pswVar2;
        final boolean z4;
        final qx80 qx80Var3;
        final ak5 ak5Var3;
        final l35 l35Var3;
        final tmz tmzVar3;
        e eVarZ;
        d dVar3;
        qx80 qx80VarB;
        ak5 ak5VarE;
        psw pswVar3;
        d dVar4;
        qx80 qx80Var4;
        int i15;
        b bVarI = aVar.i(-1061374109);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 48) == 0) {
                i3 |= bVarI.M(dVar) ? 32 : 16;
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
                        qx80Var2 = qx80Var;
                        int i17 = bVarI.M(qx80Var2) ? 2048 : 1024;
                        i3 |= i17;
                    } else {
                        qx80Var2 = qx80Var;
                    }
                    i3 |= i17;
                } else {
                    qx80Var2 = qx80Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        ak5Var2 = ak5Var;
                        int i18 = bVarI.M(ak5Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                        i3 |= i18;
                    } else {
                        ak5Var2 = ak5Var;
                    }
                    i3 |= i18;
                } else {
                    ak5Var2 = ak5Var;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bVarI.M(null)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        l35Var2 = l35Var;
                        if (bVarI.M(l35Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                        if ((12582912 & i) == 0) {
                            tmzVar2 = tmzVar;
                            if (bVarI.M(tmzVar2)) {
                                i10 = 8388608;
                            } else {
                                i10 = 4194304;
                            }
                            i3 |= i10;
                        }
                        i11 = i2 & 256;
                        if (i11 != 0) {
                            if ((i & 100663296) == 0) {
                                int i19 = i3;
                                if (bVarI.M(pswVar)) {
                                    i12 = 67108864;
                                } else {
                                    i12 = 33554432;
                                }
                                i13 = i19 | i12;
                            }
                            if ((i & 805306368) == 0) {
                                if (bVarI.A(gajVar)) {
                                    i15 = 536870912;
                                } else {
                                    i15 = 268435456;
                                }
                                i13 |= i15;
                            }
                            i14 = i13;
                            if ((i14 & 306783379) != 306783378) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bVarI.q(i14 & 1, z3)) {
                                bVarI.A0();
                                if ((i & 1) != 0 || bVarI.h0()) {
                                    if (i16 != 0) {
                                        dVar3 = d.a.b;
                                    } else {
                                        dVar3 = dVar;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        umz umzVar = ek5.a;
                                        qx80VarB = xy80.b(ok5.a, bVarI);
                                        i14 &= -7169;
                                    } else {
                                        qx80VarB = qx80Var2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        umz umzVar2 = ek5.a;
                                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                        i14 &= -57345;
                                    } else {
                                        ak5VarE = ak5Var2;
                                    }
                                    if (i7 != 0) {
                                        l35Var2 = null;
                                    }
                                    if (i9 != 0) {
                                        tmzVar2 = ek5.b;
                                    }
                                    if (i11 != 0) {
                                        pswVar3 = null;
                                    } else {
                                        pswVar3 = pswVar;
                                    }
                                    dVar4 = dVar3;
                                    qx80Var4 = qx80VarB;
                                } else {
                                    bVarI.G();
                                    if ((i2 & 8) != 0) {
                                        i14 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i14 &= -57345;
                                    }
                                    pswVar3 = pswVar;
                                    z2 = z2;
                                    ak5VarE = ak5Var2;
                                    l35Var2 = l35Var2;
                                    tmzVar2 = tmzVar2;
                                    dVar4 = dVar;
                                    qx80Var4 = qx80Var2;
                                }
                                bVarI.Y();
                                bVar = bVarI;
                                a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                                dVar2 = dVar4;
                                z4 = z2;
                                qx80Var3 = qx80Var4;
                                ak5Var3 = ak5VarE;
                                l35Var3 = l35Var2;
                                tmzVar3 = tmzVar2;
                                pswVar2 = pswVar3;
                            } else {
                                bVar = bVarI;
                                bVar.G();
                                dVar2 = dVar;
                                pswVar2 = pswVar;
                                z4 = z2;
                                qx80Var3 = qx80Var2;
                                ak5Var3 = ak5Var2;
                                l35Var3 = l35Var2;
                                tmzVar3 = tmzVar2;
                            }
                            eVarZ = bVar.Z();
                            if (eVarZ != null) {
                                eVarZ.d = new Function2() { // from class: jk5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                        return Unit.a;
                                    }
                                };
                            }
                        }
                        i3 |= 100663296;
                        i13 = i3;
                        if ((i & 805306368) == 0) {
                            if (bVarI.A(gajVar)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i13 |= i15;
                        }
                        i14 = i13;
                        if ((i14 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bVarI.q(i14 & 1, z3)) {
                            bVarI.A0();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar3 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar4 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            } else {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar5 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar6 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            }
                            bVarI.Y();
                            bVar = bVarI;
                            a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                            dVar2 = dVar4;
                            z4 = z2;
                            qx80Var3 = qx80Var4;
                            ak5Var3 = ak5VarE;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                            pswVar2 = pswVar3;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            dVar2 = dVar;
                            pswVar2 = pswVar;
                            z4 = z2;
                            qx80Var3 = qx80Var2;
                            ak5Var3 = ak5Var2;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: jk5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 12582912;
                    tmzVar2 = tmzVar;
                    i11 = i2 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            int i110 = i3;
                            if (bVarI.M(pswVar)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i110 | i12;
                        }
                        if ((i & 805306368) == 0) {
                            if (bVarI.A(gajVar)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i13 |= i15;
                        }
                        i14 = i13;
                        if ((i14 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bVarI.q(i14 & 1, z3)) {
                            bVarI.A0();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar7 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar8 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            } else {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar9 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar10 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            }
                            bVarI.Y();
                            bVar = bVarI;
                            a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                            dVar2 = dVar4;
                            z4 = z2;
                            qx80Var3 = qx80Var4;
                            ak5Var3 = ak5VarE;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                            pswVar2 = pswVar3;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            dVar2 = dVar;
                            pswVar2 = pswVar;
                            z4 = z2;
                            qx80Var3 = qx80Var2;
                            ak5Var3 = ak5Var2;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: jk5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 100663296;
                    i13 = i3;
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar12 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar13 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar14 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                l35Var2 = l35Var;
                i9 = i2 & 128;
                if (i9 != 0) {
                    if ((12582912 & i) == 0) {
                        tmzVar2 = tmzVar;
                        if (bVarI.M(tmzVar2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            int i111 = i3;
                            if (bVarI.M(pswVar)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i111 | i12;
                        }
                        if ((i & 805306368) == 0) {
                            if (bVarI.A(gajVar)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i13 |= i15;
                        }
                        i14 = i13;
                        if ((i14 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bVarI.q(i14 & 1, z3)) {
                            bVarI.A0();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar15 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar16 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            } else {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar17 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar18 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            }
                            bVarI.Y();
                            bVar = bVarI;
                            a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                            dVar2 = dVar4;
                            z4 = z2;
                            qx80Var3 = qx80Var4;
                            ak5Var3 = ak5VarE;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                            pswVar2 = pswVar3;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            dVar2 = dVar;
                            pswVar2 = pswVar;
                            z4 = z2;
                            qx80Var3 = qx80Var2;
                            ak5Var3 = ak5Var2;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: jk5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 100663296;
                    i13 = i3;
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar19 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar110 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar111 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar112 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                tmzVar2 = tmzVar;
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        int i112 = i3;
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i112 | i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar113 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar114 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar115 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar116 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                i13 = i3;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar117 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar118 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar119 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar1110 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    qx80Var2 = qx80Var;
                    if (bVarI.M(qx80Var2)) {
                    }
                    i3 |= i17;
                } else {
                    qx80Var2 = qx80Var;
                }
                i3 |= i17;
            } else {
                qx80Var2 = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ak5Var2 = ak5Var;
                    if (bVarI.M(ak5Var2)) {
                    }
                    i3 |= i18;
                } else {
                    ak5Var2 = ak5Var;
                }
                i3 |= i18;
            } else {
                ak5Var2 = ak5Var;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bVarI.M(null)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    l35Var2 = l35Var;
                    if (bVarI.M(l35Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                    if ((12582912 & i) == 0) {
                        tmzVar2 = tmzVar;
                        if (bVarI.M(tmzVar2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            int i113 = i3;
                            if (bVarI.M(pswVar)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i113 | i12;
                        }
                        if ((i & 805306368) == 0) {
                            if (bVarI.A(gajVar)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i13 |= i15;
                        }
                        i14 = i13;
                        if ((i14 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bVarI.q(i14 & 1, z3)) {
                            bVarI.A0();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar1111 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar1112 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            } else {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar1113 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar1114 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            }
                            bVarI.Y();
                            bVar = bVarI;
                            a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                            dVar2 = dVar4;
                            z4 = z2;
                            qx80Var3 = qx80Var4;
                            ak5Var3 = ak5VarE;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                            pswVar2 = pswVar3;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            dVar2 = dVar;
                            pswVar2 = pswVar;
                            z4 = z2;
                            qx80Var3 = qx80Var2;
                            ak5Var3 = ak5Var2;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: jk5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 100663296;
                    i13 = i3;
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1115 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1116 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1117 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1118 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                tmzVar2 = tmzVar;
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        int i114 = i3;
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i114 | i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1119 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar11110 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11111 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar11112 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                i13 = i3;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11113 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11114 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11116 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            l35Var2 = l35Var;
            i9 = i2 & 128;
            if (i9 != 0) {
                if ((12582912 & i) == 0) {
                    tmzVar2 = tmzVar;
                    if (bVarI.M(tmzVar2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        int i115 = i3;
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i115 | i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11117 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar11118 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11119 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar111110 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                i13 = i3;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111112 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111113 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111114 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            tmzVar2 = tmzVar;
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    int i116 = i3;
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i116 | i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111116 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111117 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111118 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            i13 = i3;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i14 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111119 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1111110 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                } else {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1111111 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1111112 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                }
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z2;
                qx80Var3 = qx80Var4;
                ak5Var3 = ak5VarE;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
                pswVar2 = pswVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                pswVar2 = pswVar;
                z4 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
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
                    qx80Var2 = qx80Var;
                    if (bVarI.M(qx80Var2)) {
                    }
                    i3 |= i17;
                } else {
                    qx80Var2 = qx80Var;
                }
                i3 |= i17;
            } else {
                qx80Var2 = qx80Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    ak5Var2 = ak5Var;
                    if (bVarI.M(ak5Var2)) {
                    }
                    i3 |= i18;
                } else {
                    ak5Var2 = ak5Var;
                }
                i3 |= i18;
            } else {
                ak5Var2 = ak5Var;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bVarI.M(null)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    l35Var2 = l35Var;
                    if (bVarI.M(l35Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                    if ((12582912 & i) == 0) {
                        tmzVar2 = tmzVar;
                        if (bVarI.M(tmzVar2)) {
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i3 |= i10;
                    }
                    i11 = i2 & 256;
                    if (i11 != 0) {
                        if ((i & 100663296) == 0) {
                            int i117 = i3;
                            if (bVarI.M(pswVar)) {
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i117 | i12;
                        }
                        if ((i & 805306368) == 0) {
                            if (bVarI.A(gajVar)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i13 |= i15;
                        }
                        i14 = i13;
                        if ((i14 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (bVarI.q(i14 & 1, z3)) {
                            bVarI.A0();
                            if ((i & 1) != 0) {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar1111113 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar1111114 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            } else {
                                if (i16 != 0) {
                                    dVar3 = d.a.b;
                                } else {
                                    dVar3 = dVar;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    umz umzVar1111115 = ek5.a;
                                    qx80VarB = xy80.b(ok5.a, bVarI);
                                    i14 &= -7169;
                                } else {
                                    qx80VarB = qx80Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    umz umzVar1111116 = ek5.a;
                                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                    i14 &= -57345;
                                } else {
                                    ak5VarE = ak5Var2;
                                }
                                if (i7 != 0) {
                                    l35Var2 = null;
                                }
                                if (i9 != 0) {
                                    tmzVar2 = ek5.b;
                                }
                                if (i11 != 0) {
                                    pswVar3 = null;
                                } else {
                                    pswVar3 = pswVar;
                                }
                                dVar4 = dVar3;
                                qx80Var4 = qx80VarB;
                            }
                            bVarI.Y();
                            bVar = bVarI;
                            a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                            dVar2 = dVar4;
                            z4 = z2;
                            qx80Var3 = qx80Var4;
                            ak5Var3 = ak5VarE;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                            pswVar2 = pswVar3;
                        } else {
                            bVar = bVarI;
                            bVar.G();
                            dVar2 = dVar;
                            pswVar2 = pswVar;
                            z4 = z2;
                            qx80Var3 = qx80Var2;
                            ak5Var3 = ak5Var2;
                            l35Var3 = l35Var2;
                            tmzVar3 = tmzVar2;
                        }
                        eVarZ = bVar.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: jk5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 100663296;
                    i13 = i3;
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1111117 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1111118 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1111119 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar11111110 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 12582912;
                tmzVar2 = tmzVar;
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        int i118 = i3;
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i118 | i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11111111 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar11111112 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11111113 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar11111114 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                i13 = i3;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11111115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11111116 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11111117 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11111118 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            l35Var2 = l35Var;
            i9 = i2 & 128;
            if (i9 != 0) {
                if ((12582912 & i) == 0) {
                    tmzVar2 = tmzVar;
                    if (bVarI.M(tmzVar2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        int i119 = i3;
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i119 | i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar11111119 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar111111110 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar111111111 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar111111112 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                i13 = i3;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111113 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111111114 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111111116 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            tmzVar2 = tmzVar;
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    int i1110 = i3;
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i1110 | i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111117 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111111118 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111119 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar1111111110 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            i13 = i3;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i14 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1111111111 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1111111112 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                } else {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1111111113 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1111111114 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                }
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z2;
                qx80Var3 = qx80Var4;
                ak5Var3 = ak5VarE;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
                pswVar2 = pswVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                pswVar2 = pswVar;
                z4 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                qx80Var2 = qx80Var;
                if (bVarI.M(qx80Var2)) {
                }
                i3 |= i17;
            } else {
                qx80Var2 = qx80Var;
            }
            i3 |= i17;
        } else {
            qx80Var2 = qx80Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                ak5Var2 = ak5Var;
                if (bVarI.M(ak5Var2)) {
                }
                i3 |= i18;
            } else {
                ak5Var2 = ak5Var;
            }
            i3 |= i18;
        } else {
            ak5Var2 = ak5Var;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bVarI.M(null)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        i7 = i2 & 64;
        if (i7 != 0) {
            if ((1572864 & i) == 0) {
                l35Var2 = l35Var;
                if (bVarI.M(l35Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            i9 = i2 & 128;
            if (i9 != 0) {
                if ((12582912 & i) == 0) {
                    tmzVar2 = tmzVar;
                    if (bVarI.M(tmzVar2)) {
                        i10 = 8388608;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                i11 = i2 & 256;
                if (i11 != 0) {
                    if ((i & 100663296) == 0) {
                        int i1111 = i3;
                        if (bVarI.M(pswVar)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i13 = i1111 | i12;
                    }
                    if ((i & 805306368) == 0) {
                        if (bVarI.A(gajVar)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    i14 = i13;
                    if ((i14 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (bVarI.q(i14 & 1, z3)) {
                        bVarI.A0();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1111111115 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1111111116 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        } else {
                            if (i16 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                umz umzVar1111111117 = ek5.a;
                                qx80VarB = xy80.b(ok5.a, bVarI);
                                i14 &= -7169;
                            } else {
                                qx80VarB = qx80Var2;
                            }
                            if ((i2 & 16) != 0) {
                                umz umzVar1111111118 = ek5.a;
                                ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                                i14 &= -57345;
                            } else {
                                ak5VarE = ak5Var2;
                            }
                            if (i7 != 0) {
                                l35Var2 = null;
                            }
                            if (i9 != 0) {
                                tmzVar2 = ek5.b;
                            }
                            if (i11 != 0) {
                                pswVar3 = null;
                            } else {
                                pswVar3 = pswVar;
                            }
                            dVar4 = dVar3;
                            qx80Var4 = qx80VarB;
                        }
                        bVarI.Y();
                        bVar = bVarI;
                        a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                        dVar2 = dVar4;
                        z4 = z2;
                        qx80Var3 = qx80Var4;
                        ak5Var3 = ak5VarE;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                        pswVar2 = pswVar3;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        pswVar2 = pswVar;
                        z4 = z2;
                        qx80Var3 = qx80Var2;
                        ak5Var3 = ak5Var2;
                        l35Var3 = l35Var2;
                        tmzVar3 = tmzVar2;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: jk5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                i13 = i3;
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar1111111119 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11111111110 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11111111111 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11111111112 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 12582912;
            tmzVar2 = tmzVar;
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    int i1112 = i3;
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i1112 | i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11111111113 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11111111114 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar11111111115 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar11111111116 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            i13 = i3;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i14 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar11111111117 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar11111111118 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                } else {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar11111111119 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111111111110 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                }
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z2;
                qx80Var3 = qx80Var4;
                ak5Var3 = ak5VarE;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
                pswVar2 = pswVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                pswVar2 = pswVar;
                z4 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        l35Var2 = l35Var;
        i9 = i2 & 128;
        if (i9 != 0) {
            if ((12582912 & i) == 0) {
                tmzVar2 = tmzVar;
                if (bVarI.M(tmzVar2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            i11 = i2 & 256;
            if (i11 != 0) {
                if ((i & 100663296) == 0) {
                    int i1113 = i3;
                    if (bVarI.M(pswVar)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i13 = i1113 | i12;
                }
                if ((i & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i14 = i13;
                if ((i14 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i14 & 1, z3)) {
                    bVarI.A0();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111111111 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111111111112 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    } else {
                        if (i16 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            umz umzVar111111111113 = ek5.a;
                            qx80VarB = xy80.b(ok5.a, bVarI);
                            i14 &= -7169;
                        } else {
                            qx80VarB = qx80Var2;
                        }
                        if ((i2 & 16) != 0) {
                            umz umzVar111111111114 = ek5.a;
                            ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                            i14 &= -57345;
                        } else {
                            ak5VarE = ak5Var2;
                        }
                        if (i7 != 0) {
                            l35Var2 = null;
                        }
                        if (i9 != 0) {
                            tmzVar2 = ek5.b;
                        }
                        if (i11 != 0) {
                            pswVar3 = null;
                        } else {
                            pswVar3 = pswVar;
                        }
                        dVar4 = dVar3;
                        qx80Var4 = qx80VarB;
                    }
                    bVarI.Y();
                    bVar = bVarI;
                    a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                    dVar2 = dVar4;
                    z4 = z2;
                    qx80Var3 = qx80Var4;
                    ak5Var3 = ak5VarE;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                    pswVar2 = pswVar3;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    pswVar2 = pswVar;
                    z4 = z2;
                    qx80Var3 = qx80Var2;
                    ak5Var3 = ak5Var2;
                    l35Var3 = l35Var2;
                    tmzVar3 = tmzVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: jk5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            i13 = i3;
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i14 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111111111115 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111111111116 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                } else {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111111111117 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar111111111118 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                }
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z2;
                qx80Var3 = qx80Var4;
                ak5Var3 = ak5VarE;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
                pswVar2 = pswVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                pswVar2 = pswVar;
                z4 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        tmzVar2 = tmzVar;
        i11 = i2 & 256;
        if (i11 != 0) {
            if ((i & 100663296) == 0) {
                int i1114 = i3;
                if (bVarI.M(pswVar)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i1114 | i12;
            }
            if ((i & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i14 & 1, z3)) {
                bVarI.A0();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar111111111119 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1111111111110 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                } else {
                    if (i16 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        umz umzVar1111111111111 = ek5.a;
                        qx80VarB = xy80.b(ok5.a, bVarI);
                        i14 &= -7169;
                    } else {
                        qx80VarB = qx80Var2;
                    }
                    if ((i2 & 16) != 0) {
                        umz umzVar1111111111112 = ek5.a;
                        ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                        i14 &= -57345;
                    } else {
                        ak5VarE = ak5Var2;
                    }
                    if (i7 != 0) {
                        l35Var2 = null;
                    }
                    if (i9 != 0) {
                        tmzVar2 = ek5.b;
                    }
                    if (i11 != 0) {
                        pswVar3 = null;
                    } else {
                        pswVar3 = pswVar;
                    }
                    dVar4 = dVar3;
                    qx80Var4 = qx80VarB;
                }
                bVarI.Y();
                bVar = bVarI;
                a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
                dVar2 = dVar4;
                z4 = z2;
                qx80Var3 = qx80Var4;
                ak5Var3 = ak5VarE;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
                pswVar2 = pswVar3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                pswVar2 = pswVar;
                z4 = z2;
                qx80Var3 = qx80Var2;
                ak5Var3 = ak5Var2;
                l35Var3 = l35Var2;
                tmzVar3 = tmzVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: jk5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 100663296;
        i13 = i3;
        if ((i & 805306368) == 0) {
            if (bVarI.A(gajVar)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        i14 = i13;
        if ((i14 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i14 & 1, z3)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    umz umzVar1111111111113 = ek5.a;
                    qx80VarB = xy80.b(ok5.a, bVarI);
                    i14 &= -7169;
                } else {
                    qx80VarB = qx80Var2;
                }
                if ((i2 & 16) != 0) {
                    umz umzVar1111111111114 = ek5.a;
                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                    i14 &= -57345;
                } else {
                    ak5VarE = ak5Var2;
                }
                if (i7 != 0) {
                    l35Var2 = null;
                }
                if (i9 != 0) {
                    tmzVar2 = ek5.b;
                }
                if (i11 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                dVar4 = dVar3;
                qx80Var4 = qx80VarB;
            } else {
                if (i16 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    umz umzVar1111111111115 = ek5.a;
                    qx80VarB = xy80.b(ok5.a, bVarI);
                    i14 &= -7169;
                } else {
                    qx80VarB = qx80Var2;
                }
                if ((i2 & 16) != 0) {
                    umz umzVar1111111111116 = ek5.a;
                    ak5VarE = ek5.e((d68) bVarI.O(g68.a));
                    i14 &= -57345;
                } else {
                    ak5VarE = ak5Var2;
                }
                if (i7 != 0) {
                    l35Var2 = null;
                }
                if (i9 != 0) {
                    tmzVar2 = ek5.b;
                }
                if (i11 != 0) {
                    pswVar3 = null;
                } else {
                    pswVar3 = pswVar;
                }
                dVar4 = dVar3;
                qx80Var4 = qx80VarB;
            }
            bVarI.Y();
            bVar = bVarI;
            a(function0, dVar4, z2, qx80Var4, ak5VarE, null, l35Var2, tmzVar2, pswVar3, gajVar, bVar, i14 & 2147483646, 0);
            dVar2 = dVar4;
            z4 = z2;
            qx80Var3 = qx80Var4;
            ak5Var3 = ak5VarE;
            l35Var3 = l35Var2;
            tmzVar3 = tmzVar2;
            pswVar2 = pswVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            pswVar2 = pswVar;
            z4 = z2;
            qx80Var3 = qx80Var2;
            ak5Var3 = ak5Var2;
            l35Var3 = l35Var2;
            tmzVar3 = tmzVar2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jk5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk5.c(function0, dVar2, z4, qx80Var3, ak5Var3, l35Var3, tmzVar3, pswVar2, gajVar, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
