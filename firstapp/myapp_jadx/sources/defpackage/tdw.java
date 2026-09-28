package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class tdw {
    public static final long a = r58.d(2147483648L);
    public static final long b = r58.d(4294963774L);
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f8s.values().length];
            try {
                f8s f8sVar = f8s.a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8s f8sVar2 = f8s.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8s f8sVar3 = f8s.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final int i, final int i2, final mz1 mz1Var, final boolean z, final Function0<Unit> function0, final String str, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        b bVarI = aVar.i(1364021529);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.d(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.A(mz1Var) ? 256 : 128;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= bVarI.M(str) ? 131072 : 65536;
        }
        if (bVarI.q(i4 & 1, (73875 & i4) != 73874)) {
            qyd0 qyd0Var = wdw.a;
            float f = ((vdw) bVarI.O(qyd0Var)).a * 4.0f;
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(androidx.compose.foundation.a.b(j.D(aVar2, null, 3), r58.b(1291845632), j060.c(((vdw) bVarI.O(qyd0Var)).a * 999.0f)), ((vdw) bVarI.O(qyd0Var)).a * 8.0f, 0.0f, 0.0f, 0.0f, 14);
            d160 d160VarA = b160.a(new kw0.i(f, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g(i, (i4 & 14) | ((i4 >> 9) & 896), bVarI, h.j(aVar2, 0.0f, 0.0f, ((vdw) bVarI.O(qyd0Var)).a * 2.0f, 0.0f, 11), str);
            int i5 = i4 >> 3;
            b(i2, f8s.c, mz1Var, function0, null, 0.0f, false, false, bVarI, (i4 & 896) | 48 | (i5 & 14) | (i5 & 7168), 496);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: edw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    tdw.a(i, i2, mz1Var, z, function0, str, (a) obj, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0149  */
    /* JADX WARN: Code duplicated, block: B:102:0x014c  */
    /* JADX WARN: Code duplicated, block: B:104:0x014f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x0161  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0177  */
    /* JADX WARN: Code duplicated, block: B:109:0x0182  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0206 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0208  */
    /* JADX WARN: Code duplicated, block: B:124:0x021c  */
    /* JADX WARN: Code duplicated, block: B:125:0x021e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x022a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0266  */
    /* JADX WARN: Code duplicated, block: B:135:0x026a  */
    /* JADX WARN: Code duplicated, block: B:138:0x027d  */
    /* JADX WARN: Code duplicated, block: B:141:0x028e  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x031a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0338 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x033a  */
    /* JADX WARN: Code duplicated, block: B:162:0x033d  */
    /* JADX WARN: Code duplicated, block: B:164:0x036d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0371  */
    /* JADX WARN: Code duplicated, block: B:168:0x037e  */
    /* JADX WARN: Code duplicated, block: B:170:0x038c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0396  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:178:0x0402  */
    /* JADX WARN: Code duplicated, block: B:179:0x0411  */
    /* JADX WARN: Code duplicated, block: B:181:0x0460  */
    /* JADX WARN: Code duplicated, block: B:182:0x0464  */
    /* JADX WARN: Code duplicated, block: B:185:0x0471  */
    /* JADX WARN: Code duplicated, block: B:187:0x047f  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:98:0x0146  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static final void b(final int i, final f8s f8sVar, final mz1 mz1Var, final Function0 function0, d dVar, float f, boolean z, boolean z2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        final float f2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        final d dVar2;
        final float f3;
        final boolean z6;
        final boolean z7;
        b bVar;
        e eVarZ;
        boolean z8;
        float f4;
        boolean z9;
        float f5;
        float f6;
        int iE;
        op5 op5Var;
        String strC;
        String strC2;
        d.a aVar2;
        String str;
        i060 i060Var;
        boolean z10;
        zk40.a aVar3;
        d dVarB;
        boolean z11;
        d dVarA;
        boolean z12;
        Object objY;
        boolean z13;
        Object objY2;
        n54 n54Var;
        int iHashCode;
        tsr.a aVar4;
        yka.a.b bVar2;
        yka.a.d dVar3;
        yka.a.C1350a c1350a;
        float f7;
        yka.a.c cVar;
        int iHashCode2;
        yka.a.d dVar4;
        d.a aVar5;
        yka.a.C1350a c1350a2;
        boolean z14;
        ?? r10;
        b bVar3;
        int iOrdinal;
        n54 n54Var2;
        androidx.compose.foundation.layout.d dVar5;
        int iHashCode3;
        b bVar4;
        d.a aVar6;
        int iHashCode4;
        d0b.a.e eVar;
        b bVar5;
        b bVarI = aVar.i(-1899770285);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.d(f8sVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(mz1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.A(function0) ? 2048 : 1024;
        }
        int i10 = i4 | 24576;
        int i11 = i3 & 32;
        if (i11 == 0) {
            if ((196608 & i2) == 0) {
                f2 = f;
                i10 |= bVarI.c(f2) ? 131072 : 65536;
            }
            i5 = 1572864 | i10;
            i6 = i3 & 128;
            if (i6 != 0) {
                if ((12582912 & i2) == 0) {
                    z3 = z;
                    if (bVarI.b(z3)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i5 |= i7;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i5 |= 100663296;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 100663296) == 0) {
                        if (bVarI.b(z4)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i5 |= i9;
                    }
                }
                if ((i5 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i5 & 1, z5)) {
                    if (i11 != 0) {
                        f2 = 1.0f;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (a.a[f8sVar.ordinal()] == 1) {
                        bVarI.N(-318131028);
                        f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                        bVarI.X(false);
                    } else {
                        bVarI.N(-318129492);
                        f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                        bVarI.X(false);
                    }
                    if (f8sVar != f8s.b) {
                        f8s f8sVar2 = f8s.a;
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (z3) {
                        f5 = 1.0f;
                        f6 = 1.0f;
                    } else {
                        f5 = 1.0f;
                        if (f8sVar != f8s.c || f8sVar == f8s.a) {
                            f6 = 0.55f;
                        } else {
                            f6 = 1.0f;
                        }
                    }
                    iE = f.e(i, 1, 5);
                    if (iE != 1) {
                        op5Var = op5.a;
                        strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
                    } else if (iE != 2) {
                        op5Var = op5.a;
                        strC = op5.c(op5Var, "car_icon_level_2:sg_game_name", "https://s.sporty.net/cms/2_029b5c1047.png");
                    } else if (iE != 3) {
                        op5Var = op5.a;
                        strC = op5.c(op5Var, "car_icon_level_3:sg_game_name", "https://s.sporty.net/cms/4_1fa42abc2f.png");
                    } else if (iE != 4) {
                        op5Var = op5.a;
                        strC = op5.c(op5Var, "car_icon_level_4:sg_game_name", "https://s.sporty.net/cms/3_c7bb906957.png");
                    } else if (iE != 5) {
                        op5Var = op5.a;
                        strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
                    } else {
                        op5Var = op5.a;
                        strC = op5.c(op5Var, "car_icon_level_5:sg_game_name", "https://s.sporty.net/cms/5_0e8b1b229d.png");
                    }
                    strC2 = op5.c(op5Var, "unlock_gif:sg_game_name", "https://s.sporty.net/cms/lock_5370a51df8.gif");
                    bVarI.N(-318108297);
                    aVar2 = d.a.b;
                    d dVarN = j.n(aVar2, f4);
                    str = strC;
                    i060Var = j060.a;
                    d dVarA2 = ls7.a(dVarN, i060Var);
                    z10 = z8;
                    long j = a;
                    aVar3 = zk40.a;
                    dVarB = androidx.compose.foundation.a.b(dVarA2, j, aVar3);
                    if (z9) {
                        bVarI.N(1371702559);
                        dVarA = d35.a(dVarB, wdw.a(bVarI) * 3.0f, mz1Var.M0(), i060Var);
                        z11 = false;
                        bVarI.X(false);
                    } else {
                        z11 = false;
                        bVarI.N(1371802906);
                        dVarA = d35.a(dVarB, wdw.a(bVarI) * f5, r58.d(2164260863L), i060Var);
                        bVarI.X(false);
                    }
                    bVarI.X(z11);
                    d dVarN2 = j.n(aVar2, f4);
                    if ((458752 & i5) == 131072) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY = bVarI.y();
                    Object obj = androidx.compose.runtime.a.C0041a.a;
                    if (z12 || objY == obj) {
                        objY = new Function1() { // from class: bdw
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                a7l a7lVar = (a7l) obj2;
                                a7lVar.getClass();
                                float f8 = f2;
                                a7lVar.k(f8);
                                a7lVar.v(f8);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    d dVarA3 = androidx.compose.ui.graphics.a.a(dVarN2, (Function1) objY);
                    if ((i5 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objY2 = bVarI.y();
                    if (z13 || objY2 == obj) {
                        objY2 = new g1d(function0, 1);
                        bVarI.r(objY2);
                    }
                    d dVarD = androidx.compose.foundation.d.d(dVarA3, false, null, null, (Function0) objY2, 15);
                    n54Var = ht.a.e;
                    aiv aivVarC = g75.c(n54Var, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarD);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    bVar2 = yka.a.f;
                    hlh0.a(bVarI, aivVarC, bVar2);
                    dVar3 = yka.a.e;
                    hlh0.a(bVarI, ne00VarS, dVar3);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        f7 = f2;
                    } else {
                        f7 = f2;
                        if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        }
                        cVar = yka.a.d;
                        hlh0.a(bVarI, dVarC, cVar);
                        d dVarA4 = dw.a(dVarA, f6);
                        aiv aivVarC2 = g75.c(n54Var, false);
                        iHashCode2 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        d dVarC2 = c.c(bVarI, dVarA4);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVarC2, bVar2);
                        hlh0.a(bVarI, ne00VarS2, dVar3);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                        }
                        hlh0.a(bVarI, dVarC2, cVar);
                        if (StringsKt.U(str)) {
                            b bVar6 = bVarI;
                            dVar4 = dVar3;
                            aVar5 = aVar2;
                            c1350a2 = c1350a;
                            z14 = true;
                            r10 = 0;
                            bVar6.N(-1536819709);
                            bVar3 = bVar6;
                        } else {
                            bVarI.N(-1502358590);
                            r10 = 0;
                            c1350a2 = c1350a;
                            aVar5 = aVar2;
                            z14 = true;
                            dVar4 = dVar3;
                            fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                            bVar3 = bVarI;
                        }
                        bVar3.X(r10);
                        bVar3.X(z14);
                        iOrdinal = f8sVar.ordinal();
                        n54Var2 = ht.a.c;
                        dVar5 = androidx.compose.foundation.layout.d.a;
                        if (iOrdinal != 0) {
                            d.a aVar7 = aVar5;
                            bVar3.N(368691233);
                            d dVarB2 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar7, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                            aiv aivVarC3 = g75.c(n54Var, r10);
                            iHashCode3 = Long.hashCode(bVar3.T);
                            ne00 ne00VarS3 = bVar3.S();
                            d dVarC3 = c.c(bVar3, dVarB2);
                            bVar3.D();
                            if (bVar3.S) {
                                bVar3.F(aVar4);
                            } else {
                                bVar3.p();
                            }
                            hlh0.a(bVar3, aivVarC3, bVar2);
                            hlh0.a(bVar3, ne00VarS3, dVar4);
                            if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode3))) {
                                n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                            }
                            hlh0.a(bVar3, dVarC3, cVar);
                            aVar5 = aVar7;
                            b bVar7 = bVar3;
                            h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar7, 48, 124);
                            b bVar8 = bVar7;
                            bVar8.X(z14);
                            bVar8.X(r10);
                            Unit unit = Unit.a;
                            bVar4 = bVar8;
                        } else if (iOrdinal != z14) {
                            bVar3.N(-542241699);
                            bVar3.X(r10);
                            Unit unit2 = Unit.a;
                            bVar4 = bVar3;
                        } else {
                            if (iOrdinal == 2) {
                                throw igf0.a(bVar3, -542296714, r10);
                            }
                            bVar3.N(369355501);
                            aVar6 = aVar5;
                            d dVarR = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                            aiv aivVarC4 = g75.c(n54Var, r10);
                            iHashCode4 = Long.hashCode(bVar3.T);
                            ne00 ne00VarS4 = bVar3.S();
                            d dVarC4 = c.c(bVar3, dVarR);
                            bVar3.D();
                            if (bVar3.S) {
                                bVar3.F(aVar4);
                            } else {
                                bVar3.p();
                            }
                            hlh0.a(bVar3, aivVarC4, bVar2);
                            hlh0.a(bVar3, ne00VarS4, dVar4);
                            if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode4))) {
                                n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                            }
                            hlh0.a(bVar3, dVarC4, cVar);
                            eVar = d0b.a.b;
                            if (z10) {
                                bVar3.N(473164183);
                                b bVar9 = bVar3;
                                fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar9, 3120, 2032);
                                b bVar10 = bVar9;
                                bVar10.X(r10);
                                bVar5 = bVar10;
                            } else {
                                bVar3.N(473499324);
                                b bVar11 = bVar3;
                                h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar11, 24624, 104);
                                b bVar12 = bVar11;
                                bVar12.X(r10);
                                bVar5 = bVar12;
                            }
                            bVar5.X(z14);
                            bVar5.X(r10);
                            Unit unit3 = Unit.a;
                            aVar5 = aVar6;
                            bVar4 = bVar5;
                        }
                        bVar4.X(z14);
                        z7 = z10;
                        z6 = z3;
                        f3 = f7;
                        dVar2 = aVar5;
                        bVar = bVar4;
                    }
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    d dVarA5 = dw.a(dVarA, f6);
                    aiv aivVarC5 = g75.c(n54Var, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS5 = bVarI.S();
                    d dVarC5 = c.c(bVarI, dVarA5);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC5, bVar2);
                    hlh0.a(bVarI, ne00VarS5, dVar3);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC5, cVar);
                    if (StringsKt.U(str)) {
                        bVarI.N(-1502358590);
                        r10 = 0;
                        c1350a2 = c1350a;
                        aVar5 = aVar2;
                        z14 = true;
                        dVar4 = dVar3;
                        fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                        bVar3 = bVarI;
                    } else {
                        b bVar13 = bVarI;
                        dVar4 = dVar3;
                        aVar5 = aVar2;
                        c1350a2 = c1350a;
                        z14 = true;
                        r10 = 0;
                        bVar13.N(-1536819709);
                        bVar3 = bVar13;
                    }
                    bVar3.X(r10);
                    bVar3.X(z14);
                    iOrdinal = f8sVar.ordinal();
                    n54Var2 = ht.a.c;
                    dVar5 = androidx.compose.foundation.layout.d.a;
                    if (iOrdinal != 0) {
                        d.a aVar8 = aVar5;
                        bVar3.N(368691233);
                        d dVarB3 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar8, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                        aiv aivVarC6 = g75.c(n54Var, r10);
                        iHashCode3 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS6 = bVar3.S();
                        d dVarC6 = c.c(bVar3, dVarB3);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar4);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC6, bVar2);
                        hlh0.a(bVar3, ne00VarS6, dVar4);
                        if (bVar3.S) {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        } else {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC6, cVar);
                        aVar5 = aVar8;
                        b bVar14 = bVar3;
                        h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar14, 48, 124);
                        b bVar15 = bVar14;
                        bVar15.X(z14);
                        bVar15.X(r10);
                        Unit unit4 = Unit.a;
                        bVar4 = bVar15;
                    } else if (iOrdinal != z14) {
                        bVar3.N(-542241699);
                        bVar3.X(r10);
                        Unit unit5 = Unit.a;
                        bVar4 = bVar3;
                    } else {
                        if (iOrdinal == 2) {
                            throw igf0.a(bVar3, -542296714, r10);
                        }
                        bVar3.N(369355501);
                        aVar6 = aVar5;
                        d dVarR2 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                        aiv aivVarC7 = g75.c(n54Var, r10);
                        iHashCode4 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS7 = bVar3.S();
                        d dVarC7 = c.c(bVar3, dVarR2);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar4);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC7, bVar2);
                        hlh0.a(bVar3, ne00VarS7, dVar4);
                        if (bVar3.S) {
                            n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                        } else {
                            n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC7, cVar);
                        eVar = d0b.a.b;
                        if (z10) {
                            bVar3.N(473164183);
                            b bVar16 = bVar3;
                            fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar16, 3120, 2032);
                            b bVar17 = bVar16;
                            bVar17.X(r10);
                            bVar5 = bVar17;
                        } else {
                            bVar3.N(473499324);
                            b bVar18 = bVar3;
                            h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar18, 24624, 104);
                            b bVar19 = bVar18;
                            bVar19.X(r10);
                            bVar5 = bVar19;
                        }
                        bVar5.X(z14);
                        bVar5.X(r10);
                        Unit unit6 = Unit.a;
                        aVar5 = aVar6;
                        bVar4 = bVar5;
                    }
                    bVar4.X(z14);
                    z7 = z10;
                    z6 = z3;
                    f3 = f7;
                    dVar2 = aVar5;
                    bVar = bVar4;
                } else {
                    b bVar20 = bVarI;
                    bVar20.G();
                    dVar2 = dVar;
                    f3 = f2;
                    z6 = z3;
                    z7 = z4;
                    bVar = bVar20;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ddw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            tdw.b(i, f8sVar, mz1Var, function0, dVar2, f3, z6, z7, (a) obj2, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i5 = 14155776 | i10;
            z3 = z;
            i8 = i3 & 256;
            if (i8 != 0) {
                i5 |= 100663296;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i2 & 100663296) == 0) {
                    if (bVarI.b(z4)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i5 |= i9;
                }
            }
            if ((i5 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i5 & 1, z5)) {
                if (i11 != 0) {
                    f2 = 1.0f;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (a.a[f8sVar.ordinal()] == 1) {
                    bVarI.N(-318131028);
                    f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                    bVarI.X(false);
                } else {
                    bVarI.N(-318129492);
                    f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                    bVarI.X(false);
                }
                if (f8sVar != f8s.b) {
                    f8s f8sVar3 = f8s.a;
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z3) {
                    f5 = 1.0f;
                    f6 = 1.0f;
                } else {
                    f5 = 1.0f;
                    if (f8sVar != f8s.c) {
                        f6 = 0.55f;
                    } else {
                        f6 = 0.55f;
                    }
                }
                iE = f.e(i, 1, 5);
                if (iE != 1) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
                } else if (iE != 2) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_2:sg_game_name", "https://s.sporty.net/cms/2_029b5c1047.png");
                } else if (iE != 3) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_3:sg_game_name", "https://s.sporty.net/cms/4_1fa42abc2f.png");
                } else if (iE != 4) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_4:sg_game_name", "https://s.sporty.net/cms/3_c7bb906957.png");
                } else if (iE != 5) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
                } else {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_5:sg_game_name", "https://s.sporty.net/cms/5_0e8b1b229d.png");
                }
                strC2 = op5.c(op5Var, "unlock_gif:sg_game_name", "https://s.sporty.net/cms/lock_5370a51df8.gif");
                bVarI.N(-318108297);
                aVar2 = d.a.b;
                d dVarN3 = j.n(aVar2, f4);
                str = strC;
                i060Var = j060.a;
                d dVarA6 = ls7.a(dVarN3, i060Var);
                z10 = z8;
                long j2 = a;
                aVar3 = zk40.a;
                dVarB = androidx.compose.foundation.a.b(dVarA6, j2, aVar3);
                if (z9) {
                    bVarI.N(1371702559);
                    dVarA = d35.a(dVarB, wdw.a(bVarI) * 3.0f, mz1Var.M0(), i060Var);
                    z11 = false;
                    bVarI.X(false);
                } else {
                    z11 = false;
                    bVarI.N(1371802906);
                    dVarA = d35.a(dVarB, wdw.a(bVarI) * f5, r58.d(2164260863L), i060Var);
                    bVarI.X(false);
                }
                bVarI.X(z11);
                d dVarN4 = j.n(aVar2, f4);
                if ((458752 & i5) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objY = bVarI.y();
                Object obj2 = androidx.compose.runtime.a.C0041a.a;
                if (z12) {
                    objY = new Function1() { // from class: bdw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            a7l a7lVar = (a7l) obj3;
                            a7lVar.getClass();
                            float f8 = f2;
                            a7lVar.k(f8);
                            a7lVar.v(f8);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                } else {
                    objY = new Function1() { // from class: bdw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            a7l a7lVar = (a7l) obj3;
                            a7lVar.getClass();
                            float f8 = f2;
                            a7lVar.k(f8);
                            a7lVar.v(f8);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarA7 = androidx.compose.ui.graphics.a.a(dVarN4, (Function1) objY);
                if ((i5 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objY2 = bVarI.y();
                if (z13) {
                    objY2 = new g1d(function0, 1);
                    bVarI.r(objY2);
                } else {
                    objY2 = new g1d(function0, 1);
                    bVarI.r(objY2);
                }
                d dVarD2 = androidx.compose.foundation.d.d(dVarA7, false, null, null, (Function0) objY2, 15);
                n54Var = ht.a.e;
                aiv aivVarC8 = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC8 = c.c(bVarI, dVarD2);
                yka.k.getClass();
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                bVar2 = yka.a.f;
                hlh0.a(bVarI, aivVarC8, bVar2);
                dVar3 = yka.a.e;
                hlh0.a(bVarI, ne00VarS8, dVar3);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    f7 = f2;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC8, cVar);
                    d dVarA8 = dw.a(dVarA, f6);
                    aiv aivVarC9 = g75.c(n54Var, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS9 = bVarI.S();
                    d dVarC9 = c.c(bVarI, dVarA8);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC9, bVar2);
                    hlh0.a(bVarI, ne00VarS9, dVar3);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC9, cVar);
                    if (StringsKt.U(str)) {
                        bVarI.N(-1502358590);
                        r10 = 0;
                        c1350a2 = c1350a;
                        aVar5 = aVar2;
                        z14 = true;
                        dVar4 = dVar3;
                        fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                        bVar3 = bVarI;
                    } else {
                        b bVar110 = bVarI;
                        dVar4 = dVar3;
                        aVar5 = aVar2;
                        c1350a2 = c1350a;
                        z14 = true;
                        r10 = 0;
                        bVar110.N(-1536819709);
                        bVar3 = bVar110;
                    }
                    bVar3.X(r10);
                    bVar3.X(z14);
                    iOrdinal = f8sVar.ordinal();
                    n54Var2 = ht.a.c;
                    dVar5 = androidx.compose.foundation.layout.d.a;
                    if (iOrdinal != 0) {
                        d.a aVar9 = aVar5;
                        bVar3.N(368691233);
                        d dVarB4 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar9, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                        aiv aivVarC10 = g75.c(n54Var, r10);
                        iHashCode3 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS10 = bVar3.S();
                        d dVarC10 = c.c(bVar3, dVarB4);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar4);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC10, bVar2);
                        hlh0.a(bVar3, ne00VarS10, dVar4);
                        if (bVar3.S) {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        } else {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC10, cVar);
                        aVar5 = aVar9;
                        b bVar111 = bVar3;
                        h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar111, 48, 124);
                        b bVar112 = bVar111;
                        bVar112.X(z14);
                        bVar112.X(r10);
                        Unit unit7 = Unit.a;
                        bVar4 = bVar112;
                    } else if (iOrdinal != z14) {
                        bVar3.N(-542241699);
                        bVar3.X(r10);
                        Unit unit8 = Unit.a;
                        bVar4 = bVar3;
                    } else {
                        if (iOrdinal == 2) {
                            throw igf0.a(bVar3, -542296714, r10);
                        }
                        bVar3.N(369355501);
                        aVar6 = aVar5;
                        d dVarR3 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                        aiv aivVarC11 = g75.c(n54Var, r10);
                        iHashCode4 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS11 = bVar3.S();
                        d dVarC11 = c.c(bVar3, dVarR3);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar4);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC11, bVar2);
                        hlh0.a(bVar3, ne00VarS11, dVar4);
                        if (bVar3.S) {
                            n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                        } else {
                            n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC11, cVar);
                        eVar = d0b.a.b;
                        if (z10) {
                            bVar3.N(473164183);
                            b bVar113 = bVar3;
                            fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar113, 3120, 2032);
                            b bVar114 = bVar113;
                            bVar114.X(r10);
                            bVar5 = bVar114;
                        } else {
                            bVar3.N(473499324);
                            b bVar115 = bVar3;
                            h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar115, 24624, 104);
                            b bVar116 = bVar115;
                            bVar116.X(r10);
                            bVar5 = bVar116;
                        }
                        bVar5.X(z14);
                        bVar5.X(r10);
                        Unit unit9 = Unit.a;
                        aVar5 = aVar6;
                        bVar4 = bVar5;
                    }
                    bVar4.X(z14);
                    z7 = z10;
                    z6 = z3;
                    f3 = f7;
                    dVar2 = aVar5;
                    bVar = bVar4;
                } else {
                    f7 = f2;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC8, cVar);
                d dVarA9 = dw.a(dVarA, f6);
                aiv aivVarC12 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS12 = bVarI.S();
                d dVarC12 = c.c(bVarI, dVarA9);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC12, bVar2);
                hlh0.a(bVarI, ne00VarS12, dVar3);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC12, cVar);
                if (StringsKt.U(str)) {
                    bVarI.N(-1502358590);
                    r10 = 0;
                    c1350a2 = c1350a;
                    aVar5 = aVar2;
                    z14 = true;
                    dVar4 = dVar3;
                    fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                    bVar3 = bVarI;
                } else {
                    b bVar117 = bVarI;
                    dVar4 = dVar3;
                    aVar5 = aVar2;
                    c1350a2 = c1350a;
                    z14 = true;
                    r10 = 0;
                    bVar117.N(-1536819709);
                    bVar3 = bVar117;
                }
                bVar3.X(r10);
                bVar3.X(z14);
                iOrdinal = f8sVar.ordinal();
                n54Var2 = ht.a.c;
                dVar5 = androidx.compose.foundation.layout.d.a;
                if (iOrdinal != 0) {
                    d.a aVar10 = aVar5;
                    bVar3.N(368691233);
                    d dVarB5 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar10, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                    aiv aivVarC13 = g75.c(n54Var, r10);
                    iHashCode3 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS13 = bVar3.S();
                    d dVarC13 = c.c(bVar3, dVarB5);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar4);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC13, bVar2);
                    hlh0.a(bVar3, ne00VarS13, dVar4);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC13, cVar);
                    aVar5 = aVar10;
                    b bVar118 = bVar3;
                    h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar118, 48, 124);
                    b bVar119 = bVar118;
                    bVar119.X(z14);
                    bVar119.X(r10);
                    Unit unit10 = Unit.a;
                    bVar4 = bVar119;
                } else if (iOrdinal != z14) {
                    bVar3.N(-542241699);
                    bVar3.X(r10);
                    Unit unit11 = Unit.a;
                    bVar4 = bVar3;
                } else {
                    if (iOrdinal == 2) {
                        throw igf0.a(bVar3, -542296714, r10);
                    }
                    bVar3.N(369355501);
                    aVar6 = aVar5;
                    d dVarR4 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                    aiv aivVarC14 = g75.c(n54Var, r10);
                    iHashCode4 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS14 = bVar3.S();
                    d dVarC14 = c.c(bVar3, dVarR4);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar4);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC14, bVar2);
                    hlh0.a(bVar3, ne00VarS14, dVar4);
                    if (bVar3.S) {
                        n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                    } else {
                        n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC14, cVar);
                    eVar = d0b.a.b;
                    if (z10) {
                        bVar3.N(473164183);
                        b bVar1110 = bVar3;
                        fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar1110, 3120, 2032);
                        b bVar1111 = bVar1110;
                        bVar1111.X(r10);
                        bVar5 = bVar1111;
                    } else {
                        bVar3.N(473499324);
                        b bVar1112 = bVar3;
                        h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar1112, 24624, 104);
                        b bVar1113 = bVar1112;
                        bVar1113.X(r10);
                        bVar5 = bVar1113;
                    }
                    bVar5.X(z14);
                    bVar5.X(r10);
                    Unit unit12 = Unit.a;
                    aVar5 = aVar6;
                    bVar4 = bVar5;
                }
                bVar4.X(z14);
                z7 = z10;
                z6 = z3;
                f3 = f7;
                dVar2 = aVar5;
                bVar = bVar4;
            } else {
                b bVar21 = bVarI;
                bVar21.G();
                dVar2 = dVar;
                f3 = f2;
                z6 = z3;
                z7 = z4;
                bVar = bVar21;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ddw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        tdw.b(i, f8sVar, mz1Var, function0, dVar2, f3, z6, z7, (a) obj3, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i10 = 221184 | i4;
        f2 = f;
        i5 = 1572864 | i10;
        i6 = i3 & 128;
        if (i6 != 0) {
            if ((12582912 & i2) == 0) {
                z3 = z;
                if (bVarI.b(z3)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i5 |= i7;
            }
            i8 = i3 & 256;
            if (i8 != 0) {
                i5 |= 100663296;
                z4 = z2;
            } else {
                z4 = z2;
                if ((i2 & 100663296) == 0) {
                    if (bVarI.b(z4)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i5 |= i9;
                }
            }
            if ((i5 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i5 & 1, z5)) {
                if (i11 != 0) {
                    f2 = 1.0f;
                }
                if (i6 != 0) {
                    z3 = false;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (a.a[f8sVar.ordinal()] == 1) {
                    bVarI.N(-318131028);
                    f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                    bVarI.X(false);
                } else {
                    bVarI.N(-318129492);
                    f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                    bVarI.X(false);
                }
                if (f8sVar != f8s.b) {
                    f8s f8sVar4 = f8s.a;
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z3) {
                    f5 = 1.0f;
                    f6 = 1.0f;
                } else {
                    f5 = 1.0f;
                    if (f8sVar != f8s.c) {
                        f6 = 0.55f;
                    } else {
                        f6 = 0.55f;
                    }
                }
                iE = f.e(i, 1, 5);
                if (iE != 1) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
                } else if (iE != 2) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_2:sg_game_name", "https://s.sporty.net/cms/2_029b5c1047.png");
                } else if (iE != 3) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_3:sg_game_name", "https://s.sporty.net/cms/4_1fa42abc2f.png");
                } else if (iE != 4) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_4:sg_game_name", "https://s.sporty.net/cms/3_c7bb906957.png");
                } else if (iE != 5) {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
                } else {
                    op5Var = op5.a;
                    strC = op5.c(op5Var, "car_icon_level_5:sg_game_name", "https://s.sporty.net/cms/5_0e8b1b229d.png");
                }
                strC2 = op5.c(op5Var, "unlock_gif:sg_game_name", "https://s.sporty.net/cms/lock_5370a51df8.gif");
                bVarI.N(-318108297);
                aVar2 = d.a.b;
                d dVarN5 = j.n(aVar2, f4);
                str = strC;
                i060Var = j060.a;
                d dVarA10 = ls7.a(dVarN5, i060Var);
                z10 = z8;
                long j3 = a;
                aVar3 = zk40.a;
                dVarB = androidx.compose.foundation.a.b(dVarA10, j3, aVar3);
                if (z9) {
                    bVarI.N(1371702559);
                    dVarA = d35.a(dVarB, wdw.a(bVarI) * 3.0f, mz1Var.M0(), i060Var);
                    z11 = false;
                    bVarI.X(false);
                } else {
                    z11 = false;
                    bVarI.N(1371802906);
                    dVarA = d35.a(dVarB, wdw.a(bVarI) * f5, r58.d(2164260863L), i060Var);
                    bVarI.X(false);
                }
                bVarI.X(z11);
                d dVarN6 = j.n(aVar2, f4);
                if ((458752 & i5) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objY = bVarI.y();
                Object obj3 = androidx.compose.runtime.a.C0041a.a;
                if (z12) {
                    objY = new Function1() { // from class: bdw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            a7l a7lVar = (a7l) obj4;
                            a7lVar.getClass();
                            float f8 = f2;
                            a7lVar.k(f8);
                            a7lVar.v(f8);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                } else {
                    objY = new Function1() { // from class: bdw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            a7l a7lVar = (a7l) obj4;
                            a7lVar.getClass();
                            float f8 = f2;
                            a7lVar.k(f8);
                            a7lVar.v(f8);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarA11 = androidx.compose.ui.graphics.a.a(dVarN6, (Function1) objY);
                if ((i5 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objY2 = bVarI.y();
                if (z13) {
                    objY2 = new g1d(function0, 1);
                    bVarI.r(objY2);
                } else {
                    objY2 = new g1d(function0, 1);
                    bVarI.r(objY2);
                }
                d dVarD3 = androidx.compose.foundation.d.d(dVarA11, false, null, null, (Function0) objY2, 15);
                n54Var = ht.a.e;
                aiv aivVarC15 = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS15 = bVarI.S();
                d dVarC15 = c.c(bVarI, dVarD3);
                yka.k.getClass();
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                bVar2 = yka.a.f;
                hlh0.a(bVarI, aivVarC15, bVar2);
                dVar3 = yka.a.e;
                hlh0.a(bVarI, ne00VarS15, dVar3);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    f7 = f2;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC15, cVar);
                    d dVarA12 = dw.a(dVarA, f6);
                    aiv aivVarC16 = g75.c(n54Var, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS16 = bVarI.S();
                    d dVarC16 = c.c(bVarI, dVarA12);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC16, bVar2);
                    hlh0.a(bVarI, ne00VarS16, dVar3);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC16, cVar);
                    if (StringsKt.U(str)) {
                        bVarI.N(-1502358590);
                        r10 = 0;
                        c1350a2 = c1350a;
                        aVar5 = aVar2;
                        z14 = true;
                        dVar4 = dVar3;
                        fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                        bVar3 = bVarI;
                    } else {
                        b bVar1114 = bVarI;
                        dVar4 = dVar3;
                        aVar5 = aVar2;
                        c1350a2 = c1350a;
                        z14 = true;
                        r10 = 0;
                        bVar1114.N(-1536819709);
                        bVar3 = bVar1114;
                    }
                    bVar3.X(r10);
                    bVar3.X(z14);
                    iOrdinal = f8sVar.ordinal();
                    n54Var2 = ht.a.c;
                    dVar5 = androidx.compose.foundation.layout.d.a;
                    if (iOrdinal != 0) {
                        d.a aVar11 = aVar5;
                        bVar3.N(368691233);
                        d dVarB6 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar11, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                        aiv aivVarC17 = g75.c(n54Var, r10);
                        iHashCode3 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS17 = bVar3.S();
                        d dVarC17 = c.c(bVar3, dVarB6);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar4);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC17, bVar2);
                        hlh0.a(bVar3, ne00VarS17, dVar4);
                        if (bVar3.S) {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        } else {
                            n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC17, cVar);
                        aVar5 = aVar11;
                        b bVar1115 = bVar3;
                        h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar1115, 48, 124);
                        b bVar1116 = bVar1115;
                        bVar1116.X(z14);
                        bVar1116.X(r10);
                        Unit unit13 = Unit.a;
                        bVar4 = bVar1116;
                    } else if (iOrdinal != z14) {
                        bVar3.N(-542241699);
                        bVar3.X(r10);
                        Unit unit14 = Unit.a;
                        bVar4 = bVar3;
                    } else {
                        if (iOrdinal == 2) {
                            throw igf0.a(bVar3, -542296714, r10);
                        }
                        bVar3.N(369355501);
                        aVar6 = aVar5;
                        d dVarR5 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                        aiv aivVarC18 = g75.c(n54Var, r10);
                        iHashCode4 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS18 = bVar3.S();
                        d dVarC18 = c.c(bVar3, dVarR5);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar4);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, aivVarC18, bVar2);
                        hlh0.a(bVar3, ne00VarS18, dVar4);
                        if (bVar3.S) {
                            n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                        } else {
                            n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                        }
                        hlh0.a(bVar3, dVarC18, cVar);
                        eVar = d0b.a.b;
                        if (z10) {
                            bVar3.N(473164183);
                            b bVar1117 = bVar3;
                            fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar1117, 3120, 2032);
                            b bVar1118 = bVar1117;
                            bVar1118.X(r10);
                            bVar5 = bVar1118;
                        } else {
                            bVar3.N(473499324);
                            b bVar1119 = bVar3;
                            h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar1119, 24624, 104);
                            b bVar11110 = bVar1119;
                            bVar11110.X(r10);
                            bVar5 = bVar11110;
                        }
                        bVar5.X(z14);
                        bVar5.X(r10);
                        Unit unit15 = Unit.a;
                        aVar5 = aVar6;
                        bVar4 = bVar5;
                    }
                    bVar4.X(z14);
                    z7 = z10;
                    z6 = z3;
                    f3 = f7;
                    dVar2 = aVar5;
                    bVar = bVar4;
                } else {
                    f7 = f2;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC15, cVar);
                d dVarA13 = dw.a(dVarA, f6);
                aiv aivVarC19 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS19 = bVarI.S();
                d dVarC19 = c.c(bVarI, dVarA13);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC19, bVar2);
                hlh0.a(bVarI, ne00VarS19, dVar3);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC19, cVar);
                if (StringsKt.U(str)) {
                    bVarI.N(-1502358590);
                    r10 = 0;
                    c1350a2 = c1350a;
                    aVar5 = aVar2;
                    z14 = true;
                    dVar4 = dVar3;
                    fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                    bVar3 = bVarI;
                } else {
                    b bVar11111 = bVarI;
                    dVar4 = dVar3;
                    aVar5 = aVar2;
                    c1350a2 = c1350a;
                    z14 = true;
                    r10 = 0;
                    bVar11111.N(-1536819709);
                    bVar3 = bVar11111;
                }
                bVar3.X(r10);
                bVar3.X(z14);
                iOrdinal = f8sVar.ordinal();
                n54Var2 = ht.a.c;
                dVar5 = androidx.compose.foundation.layout.d.a;
                if (iOrdinal != 0) {
                    d.a aVar12 = aVar5;
                    bVar3.N(368691233);
                    d dVarB7 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar12, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                    aiv aivVarC110 = g75.c(n54Var, r10);
                    iHashCode3 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS110 = bVar3.S();
                    d dVarC110 = c.c(bVar3, dVarB7);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar4);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC110, bVar2);
                    hlh0.a(bVar3, ne00VarS110, dVar4);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC110, cVar);
                    aVar5 = aVar12;
                    b bVar11112 = bVar3;
                    h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar11112, 48, 124);
                    b bVar11113 = bVar11112;
                    bVar11113.X(z14);
                    bVar11113.X(r10);
                    Unit unit16 = Unit.a;
                    bVar4 = bVar11113;
                } else if (iOrdinal != z14) {
                    bVar3.N(-542241699);
                    bVar3.X(r10);
                    Unit unit17 = Unit.a;
                    bVar4 = bVar3;
                } else {
                    if (iOrdinal == 2) {
                        throw igf0.a(bVar3, -542296714, r10);
                    }
                    bVar3.N(369355501);
                    aVar6 = aVar5;
                    d dVarR6 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                    aiv aivVarC111 = g75.c(n54Var, r10);
                    iHashCode4 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS111 = bVar3.S();
                    d dVarC111 = c.c(bVar3, dVarR6);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar4);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC111, bVar2);
                    hlh0.a(bVar3, ne00VarS111, dVar4);
                    if (bVar3.S) {
                        n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                    } else {
                        n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC111, cVar);
                    eVar = d0b.a.b;
                    if (z10) {
                        bVar3.N(473164183);
                        b bVar11114 = bVar3;
                        fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar11114, 3120, 2032);
                        b bVar11115 = bVar11114;
                        bVar11115.X(r10);
                        bVar5 = bVar11115;
                    } else {
                        bVar3.N(473499324);
                        b bVar11116 = bVar3;
                        h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar11116, 24624, 104);
                        b bVar11117 = bVar11116;
                        bVar11117.X(r10);
                        bVar5 = bVar11117;
                    }
                    bVar5.X(z14);
                    bVar5.X(r10);
                    Unit unit18 = Unit.a;
                    aVar5 = aVar6;
                    bVar4 = bVar5;
                }
                bVar4.X(z14);
                z7 = z10;
                z6 = z3;
                f3 = f7;
                dVar2 = aVar5;
                bVar = bVar4;
            } else {
                b bVar22 = bVarI;
                bVar22.G();
                dVar2 = dVar;
                f3 = f2;
                z6 = z3;
                z7 = z4;
                bVar = bVar22;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ddw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        tdw.b(i, f8sVar, mz1Var, function0, dVar2, f3, z6, z7, (a) obj4, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i5 = 14155776 | i10;
        z3 = z;
        i8 = i3 & 256;
        if (i8 != 0) {
            i5 |= 100663296;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 100663296) == 0) {
                if (bVarI.b(z4)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i5 |= i9;
            }
        }
        if ((i5 & 38347923) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVarI.q(i5 & 1, z5)) {
            if (i11 != 0) {
                f2 = 1.0f;
            }
            if (i6 != 0) {
                z3 = false;
            }
            if (i8 != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if (a.a[f8sVar.ordinal()] == 1) {
                bVarI.N(-318131028);
                f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                bVarI.X(false);
            } else {
                bVarI.N(-318129492);
                f4 = ((vdw) bVarI.O(wdw.a)).a * 36.0f;
                bVarI.X(false);
            }
            if (f8sVar != f8s.b) {
                f8s f8sVar5 = f8s.a;
                z9 = false;
            } else {
                z9 = true;
            }
            if (z3) {
                f5 = 1.0f;
                f6 = 1.0f;
            } else {
                f5 = 1.0f;
                if (f8sVar != f8s.c) {
                    f6 = 0.55f;
                } else {
                    f6 = 0.55f;
                }
            }
            iE = f.e(i, 1, 5);
            if (iE != 1) {
                op5Var = op5.a;
                strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
            } else if (iE != 2) {
                op5Var = op5.a;
                strC = op5.c(op5Var, "car_icon_level_2:sg_game_name", "https://s.sporty.net/cms/2_029b5c1047.png");
            } else if (iE != 3) {
                op5Var = op5.a;
                strC = op5.c(op5Var, "car_icon_level_3:sg_game_name", "https://s.sporty.net/cms/4_1fa42abc2f.png");
            } else if (iE != 4) {
                op5Var = op5.a;
                strC = op5.c(op5Var, "car_icon_level_4:sg_game_name", "https://s.sporty.net/cms/3_c7bb906957.png");
            } else if (iE != 5) {
                op5Var = op5.a;
                strC = op5.c(op5Var, "car_icon_level_1:sg_game_name", "https://s.sporty.net/cms/1_fd5697dc8f.png");
            } else {
                op5Var = op5.a;
                strC = op5.c(op5Var, "car_icon_level_5:sg_game_name", "https://s.sporty.net/cms/5_0e8b1b229d.png");
            }
            strC2 = op5.c(op5Var, "unlock_gif:sg_game_name", "https://s.sporty.net/cms/lock_5370a51df8.gif");
            bVarI.N(-318108297);
            aVar2 = d.a.b;
            d dVarN7 = j.n(aVar2, f4);
            str = strC;
            i060Var = j060.a;
            d dVarA14 = ls7.a(dVarN7, i060Var);
            z10 = z8;
            long j4 = a;
            aVar3 = zk40.a;
            dVarB = androidx.compose.foundation.a.b(dVarA14, j4, aVar3);
            if (z9) {
                bVarI.N(1371702559);
                dVarA = d35.a(dVarB, wdw.a(bVarI) * 3.0f, mz1Var.M0(), i060Var);
                z11 = false;
                bVarI.X(false);
            } else {
                z11 = false;
                bVarI.N(1371802906);
                dVarA = d35.a(dVarB, wdw.a(bVarI) * f5, r58.d(2164260863L), i060Var);
                bVarI.X(false);
            }
            bVarI.X(z11);
            d dVarN8 = j.n(aVar2, f4);
            if ((458752 & i5) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            objY = bVarI.y();
            Object obj4 = androidx.compose.runtime.a.C0041a.a;
            if (z12) {
                objY = new Function1() { // from class: bdw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        a7l a7lVar = (a7l) obj5;
                        a7lVar.getClass();
                        float f8 = f2;
                        a7lVar.k(f8);
                        a7lVar.v(f8);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function1() { // from class: bdw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        a7l a7lVar = (a7l) obj5;
                        a7lVar.getClass();
                        float f8 = f2;
                        a7lVar.k(f8);
                        a7lVar.v(f8);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA15 = androidx.compose.ui.graphics.a.a(dVarN8, (Function1) objY);
            if ((i5 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            objY2 = bVarI.y();
            if (z13) {
                objY2 = new g1d(function0, 1);
                bVarI.r(objY2);
            } else {
                objY2 = new g1d(function0, 1);
                bVarI.r(objY2);
            }
            d dVarD4 = androidx.compose.foundation.d.d(dVarA15, false, null, null, (Function0) objY2, 15);
            n54Var = ht.a.e;
            aiv aivVarC112 = g75.c(n54Var, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS112 = bVarI.S();
            d dVarC112 = c.c(bVarI, dVarD4);
            yka.k.getClass();
            aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC112, bVar2);
            dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS112, dVar3);
            c1350a = yka.a.g;
            if (bVarI.S) {
                f7 = f2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC112, cVar);
                d dVarA16 = dw.a(dVarA, f6);
                aiv aivVarC113 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS113 = bVarI.S();
                d dVarC113 = c.c(bVarI, dVarA16);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC113, bVar2);
                hlh0.a(bVarI, ne00VarS113, dVar3);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC113, cVar);
                if (StringsKt.U(str)) {
                    bVarI.N(-1502358590);
                    r10 = 0;
                    c1350a2 = c1350a;
                    aVar5 = aVar2;
                    z14 = true;
                    dVar4 = dVar3;
                    fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                    bVar3 = bVarI;
                } else {
                    b bVar11118 = bVarI;
                    dVar4 = dVar3;
                    aVar5 = aVar2;
                    c1350a2 = c1350a;
                    z14 = true;
                    r10 = 0;
                    bVar11118.N(-1536819709);
                    bVar3 = bVar11118;
                }
                bVar3.X(r10);
                bVar3.X(z14);
                iOrdinal = f8sVar.ordinal();
                n54Var2 = ht.a.c;
                dVar5 = androidx.compose.foundation.layout.d.a;
                if (iOrdinal != 0) {
                    d.a aVar13 = aVar5;
                    bVar3.N(368691233);
                    d dVarB8 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar13, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                    aiv aivVarC114 = g75.c(n54Var, r10);
                    iHashCode3 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS114 = bVar3.S();
                    d dVarC114 = c.c(bVar3, dVarB8);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar4);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC114, bVar2);
                    hlh0.a(bVar3, ne00VarS114, dVar4);
                    if (bVar3.S) {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC114, cVar);
                    aVar5 = aVar13;
                    b bVar11119 = bVar3;
                    h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar11119, 48, 124);
                    b bVar111110 = bVar11119;
                    bVar111110.X(z14);
                    bVar111110.X(r10);
                    Unit unit19 = Unit.a;
                    bVar4 = bVar111110;
                } else if (iOrdinal != z14) {
                    bVar3.N(-542241699);
                    bVar3.X(r10);
                    Unit unit110 = Unit.a;
                    bVar4 = bVar3;
                } else {
                    if (iOrdinal == 2) {
                        throw igf0.a(bVar3, -542296714, r10);
                    }
                    bVar3.N(369355501);
                    aVar6 = aVar5;
                    d dVarR7 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                    aiv aivVarC115 = g75.c(n54Var, r10);
                    iHashCode4 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS115 = bVar3.S();
                    d dVarC115 = c.c(bVar3, dVarR7);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar4);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, aivVarC115, bVar2);
                    hlh0.a(bVar3, ne00VarS115, dVar4);
                    if (bVar3.S) {
                        n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                    } else {
                        n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar3, dVarC115, cVar);
                    eVar = d0b.a.b;
                    if (z10) {
                        bVar3.N(473164183);
                        b bVar111111 = bVar3;
                        fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar111111, 3120, 2032);
                        b bVar111112 = bVar111111;
                        bVar111112.X(r10);
                        bVar5 = bVar111112;
                    } else {
                        bVar3.N(473499324);
                        b bVar111113 = bVar3;
                        h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar111113, 24624, 104);
                        b bVar111114 = bVar111113;
                        bVar111114.X(r10);
                        bVar5 = bVar111114;
                    }
                    bVar5.X(z14);
                    bVar5.X(r10);
                    Unit unit111 = Unit.a;
                    aVar5 = aVar6;
                    bVar4 = bVar5;
                }
                bVar4.X(z14);
                z7 = z10;
                z6 = z3;
                f3 = f7;
                dVar2 = aVar5;
                bVar = bVar4;
            } else {
                f7 = f2;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC112, cVar);
            d dVarA17 = dw.a(dVarA, f6);
            aiv aivVarC116 = g75.c(n54Var, false);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS116 = bVarI.S();
            d dVarC116 = c.c(bVarI, dVarA17);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC116, bVar2);
            hlh0.a(bVarI, ne00VarS116, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC116, cVar);
            if (StringsKt.U(str)) {
                bVarI.N(-1502358590);
                r10 = 0;
                c1350a2 = c1350a;
                aVar5 = aVar2;
                z14 = true;
                dVar4 = dVar3;
                fn80.a(str, null, j.e(aVar2, f5), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3504, 2032);
                bVar3 = bVarI;
            } else {
                b bVar111115 = bVarI;
                dVar4 = dVar3;
                aVar5 = aVar2;
                c1350a2 = c1350a;
                z14 = true;
                r10 = 0;
                bVar111115.N(-1536819709);
                bVar3 = bVar111115;
            }
            bVar3.X(r10);
            bVar3.X(z14);
            iOrdinal = f8sVar.ordinal();
            n54Var2 = ht.a.c;
            dVar5 = androidx.compose.foundation.layout.d.a;
            if (iOrdinal != 0) {
                d.a aVar14 = aVar5;
                bVar3.N(368691233);
                d dVarB9 = androidx.compose.foundation.a.b(ls7.a(j.r(h.j(dVar5.b(aVar14, n54Var2), 0.0f, 0.0f, 0.0f, 0.0f, 9), wdw.a(bVar3) * 12.0f), i060Var), r58.d(4278241092L), aVar3);
                aiv aivVarC117 = g75.c(n54Var, r10);
                iHashCode3 = Long.hashCode(bVar3.T);
                ne00 ne00VarS117 = bVar3.S();
                d dVarC117 = c.c(bVar3, dVarB9);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar4);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC117, bVar2);
                hlh0.a(bVar3, ne00VarS117, dVar4);
                if (bVar3.S) {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar3, iHashCode3, c1350a2);
                }
                hlh0.a(bVar3, dVarC117, cVar);
                aVar5 = aVar14;
                b bVar111116 = bVar3;
                h9n.a(erz.a(R.drawable.ic_sg_level_completed, r10, bVar3), null, null, null, null, 0.0f, null, bVar111116, 48, 124);
                b bVar111117 = bVar111116;
                bVar111117.X(z14);
                bVar111117.X(r10);
                Unit unit112 = Unit.a;
                bVar4 = bVar111117;
            } else if (iOrdinal != z14) {
                bVar3.N(-542241699);
                bVar3.X(r10);
                Unit unit113 = Unit.a;
                bVar4 = bVar3;
            } else {
                if (iOrdinal == 2) {
                    throw igf0.a(bVar3, -542296714, r10);
                }
                bVar3.N(369355501);
                aVar6 = aVar5;
                d dVarR8 = j.r(dVar5.b(aVar6, n54Var2), wdw.a(bVar3) * 16.0f);
                aiv aivVarC118 = g75.c(n54Var, r10);
                iHashCode4 = Long.hashCode(bVar3.T);
                ne00 ne00VarS118 = bVar3.S();
                d dVarC118 = c.c(bVar3, dVarR8);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar4);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, aivVarC118, bVar2);
                hlh0.a(bVar3, ne00VarS118, dVar4);
                if (bVar3.S) {
                    n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                } else {
                    n30.a(iHashCode4, bVar3, iHashCode4, c1350a2);
                }
                hlh0.a(bVar3, dVarC118, cVar);
                eVar = d0b.a.b;
                if (z10) {
                    bVar3.N(473164183);
                    b bVar111118 = bVar3;
                    fn80.a(strC2, null, j.r(aVar6, wdw.a(bVar3) * 16.0f), eVar, null, 0.0f, null, null, null, bVar111118, 3120, 2032);
                    b bVar111119 = bVar111118;
                    bVar111119.X(r10);
                    bVar5 = bVar111119;
                } else {
                    bVar3.N(473499324);
                    b bVar1111110 = bVar3;
                    h9n.a(erz.a(R.drawable.ic_round_lock, r10, bVar3), null, j.r(aVar6, wdw.a(bVar3) * 11.0f), null, eVar, 0.0f, null, bVar1111110, 24624, 104);
                    b bVar1111111 = bVar1111110;
                    bVar1111111.X(r10);
                    bVar5 = bVar1111111;
                }
                bVar5.X(z14);
                bVar5.X(r10);
                Unit unit114 = Unit.a;
                aVar5 = aVar6;
                bVar4 = bVar5;
            }
            bVar4.X(z14);
            z7 = z10;
            z6 = z3;
            f3 = f7;
            dVar2 = aVar5;
            bVar = bVar4;
        } else {
            b bVar23 = bVarI;
            bVar23.G();
            dVar2 = dVar;
            f3 = f2;
            z6 = z3;
            z7 = z4;
            bVar = bVar23;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ddw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    tdw.b(i, f8sVar, mz1Var, function0, dVar2, f3, z6, z7, (a) obj5, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final y6s y6sVar, final jph0 jph0Var, final mz1 mz1Var, final boolean z, final boolean z2, final d dVar, final Function1 function1, final int i, final int i2, final String str, final Function0 function0, final String str2, final Function1 function2, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        b bVar;
        String strC;
        List list;
        boolean z3;
        Integer numValueOf;
        boolean z4;
        y6sVar.getClass();
        jph0Var.getClass();
        mz1Var.getClass();
        b bVarI = aVar.i(-419289735);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? bVarI.M(y6sVar) : bVarI.A(y6sVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? bVarI.M(jph0Var) : bVarI.A(jph0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.A(mz1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= bVarI.M(dVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= bVarI.d(i) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= bVarI.d(i2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= bVarI.M(str) ? 536870912 : 268435456;
        }
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (((bVarI.A(function0) ? (char) 4 : (char) 2) | (bVarI.A(function2) ? (char) 256 : (char) 128)) & 131) == 130) ? false : true)) {
            List listR0 = y6sVar instanceof y6s.d ? CollectionsKt.r0(((y6s.d) y6sVar).a, new qdw()) : m2g.a;
            UserLevelProgressDto userLevelProgressDto = jph0Var instanceof jph0.d ? ((jph0.d) jph0Var).a : null;
            final long jB = r58.b(855638016);
            final long jM0 = mz1Var.M0();
            final long jD = r58.d(3439329279L);
            int normalRounds = (userLevelProgressDto != null ? userLevelProgressDto.getNormalRounds() : 0) - (userLevelProgressDto != null ? userLevelProgressDto.getCompletedNormalRounds() : 0);
            if ((normalRounds < 0 ? 0 : normalRounds) == 1) {
                bVarI.N(-1294390607);
                strC = op5.c(op5.a, "round_to_unlock:sg_crash_games", pwo.e(R.string.round_to_unlock_string, bVarI));
                bVarI.X(false);
            } else {
                bVarI.N(-1294233809);
                strC = op5.c(op5.a, "rounds_to_unlock:sg_crash_games", pwo.e(R.string.rounds_to_unlock_string, bVarI));
                bVarI.X(false);
            }
            final boolean z5 = listR0.isEmpty() && ((y6sVar instanceof y6s.c) || (jph0Var instanceof jph0.c) || (y6sVar instanceof y6s.b) || (jph0Var instanceof jph0.b));
            final boolean z6 = !listR0.isEmpty() && userLevelProgressDto == null && ((jph0Var instanceof jph0.c) || (jph0Var instanceof jph0.b));
            final float f = ((vdw) bVarI.O(wdw.a)).a;
            boolean zM = ((i4 & 7168) == 2048) | bVarI.M(listR0) | bVarI.M(userLevelProgressDto);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                if (userLevelProgressDto == null || listR0.isEmpty()) {
                    list = listR0;
                    z3 = false;
                    objY = new xx50(0, false);
                } else {
                    int level = userLevelProgressDto.getLevel();
                    if (level < 1) {
                        level = 1;
                    }
                    int i5 = level + 1;
                    int normalRounds2 = userLevelProgressDto.getNormalRounds() - userLevelProgressDto.getCompletedNormalRounds();
                    if (normalRounds2 < 0) {
                        normalRounds2 = 0;
                    }
                    Iterator it = listR0.iterator();
                    if (it.hasNext()) {
                        numValueOf = Integer.valueOf(((LevelConfigDetailDto) it.next()).getLevel());
                        while (it.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((LevelConfigDetailDto) it.next()).getLevel());
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : level;
                    boolean z7 = normalRounds2 > 0 || level < iIntValue;
                    List listH = z ? h(level, iIntValue, listR0) : listR0;
                    if (!listH.isEmpty()) {
                        Iterator it2 = listH.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                list = listR0;
                                z4 = false;
                                break;
                            }
                            list = listR0;
                            if (((LevelConfigDetailDto) it2.next()).getLevel() == i5 && z7) {
                                z4 = true;
                                break;
                            }
                            listR0 = list;
                        }
                    } else {
                        list = listR0;
                        z4 = false;
                        break;
                    }
                    objY = new xx50(listH.size(), z4);
                    z3 = false;
                }
                bVarI.r(objY);
            } else {
                list = listR0;
                z3 = false;
            }
            final xx50 xx50Var = (xx50) objY;
            d.a aVar2 = d.a.b;
            final d dVarN = dVar.n((!z2 || z) ? j.C(aVar2, null, 3) : j.D(aVar2, null, 3));
            if (!z2 || z || userLevelProgressDto == null) {
                final UserLevelProgressDto userLevelProgressDto2 = userLevelProgressDto;
                final String str3 = strC;
                bVar = bVarI;
                final boolean z8 = z6;
                bVar.N(-1290867147);
                final List list2 = list;
                hna.a(wdw.b.a(Float.valueOf(1.0f)), pp8.b(-1791878179, new Function2() { // from class: hdw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar3 = (a) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            int i6 = i;
                            int i7 = i2;
                            String str4 = str;
                            tdw.d(jB, jM0, jD, z5, z8, list2, userLevelProgressDto2, z, mz1Var, i6 > 0 && i7 > 1 && !StringsKt.U(str4), i6, i7, str4, function1, function0, str3, dVarN, function2, aVar3, 805306758, 0);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVar), bVar, 56);
                bVar.X(false);
            } else {
                bVarI.N(-1292819961);
                boolean z9 = z3;
                final UserLevelProgressDto userLevelProgressDto3 = userLevelProgressDto;
                bVar = bVarI;
                final boolean z10 = z5;
                final String str4 = strC;
                final List list3 = list;
                q75.a(dVarN, null, false, pp8.b(-1984172566, new gaj() { // from class: gdw
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        r75 r75Var = (r75) obj;
                        a aVar3 = (a) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        r75Var.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= aVar3.M(r75Var) ? 4 : 2;
                        }
                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            xx50 xx50Var2 = xx50Var;
                            int i6 = xx50Var2.a;
                            boolean z11 = xx50Var2.b;
                            float f2 = f;
                            final boolean z12 = z;
                            float fB = wdw.b(i6, f2, z11, z12);
                            boolean zC = aVar3.c(r75Var.d()) | aVar3.c(fB);
                            Object objY2 = aVar3.y();
                            if (zC || objY2 == a.C0041a.a) {
                                float fD = 1.0f;
                                if (Float.compare(fB, 0.0f) > 0 && Float.compare(r75Var.d(), 0.0f) > 0) {
                                    fD = f.d(r75Var.d() / fB, 0.58f, 1.0f);
                                }
                                objY2 = Float.valueOf(fD);
                                aVar3.r(objY2);
                            }
                            j730 j730VarA = wdw.b.a(Float.valueOf(((Number) objY2).floatValue()));
                            final long j = jB;
                            final long j2 = jM0;
                            final long j3 = jD;
                            final boolean z13 = z10;
                            final boolean z14 = z6;
                            final List list4 = list3;
                            final UserLevelProgressDto userLevelProgressDto4 = userLevelProgressDto3;
                            final mz1 mz1Var2 = mz1Var;
                            final int i7 = i;
                            final int i8 = i2;
                            final String str5 = str;
                            final Function1 function3 = function1;
                            final Function0 function4 = function0;
                            final String str6 = str4;
                            final Function1 function5 = function2;
                            hna.a(j730VarA, pp8.b(-1879432534, new Function2() { // from class: jdw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar4 = (a) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (aVar4.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        int i9 = i7;
                                        int i10 = i8;
                                        String str7 = str5;
                                        tdw.d(j, j2, j3, z13, z14, list4, userLevelProgressDto4, z12, mz1Var2, i9 > 0 && i10 > 1 && !StringsKt.U(str7), i9, i10, str7, function3, function4, str6, null, function5, aVar4, 805306758, 131072);
                                    } else {
                                        aVar4.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar3), aVar3, 56);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVar), bVar, 3072, 6);
                bVar.X(z9);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: idw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    tdw.c(y6sVar, jph0Var, mz1Var, z, z2, dVar, function1, i, i2, str, function0, str2, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final long j, final long j2, final long j3, final boolean z, final boolean z2, final List list, final UserLevelProgressDto userLevelProgressDto, final boolean z3, final mz1 mz1Var, final boolean z4, final int i, final int i2, final String str, final Function1 function1, final Function0 function0, final String str2, d dVar, final Function1 function2, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        b bVar;
        final d dVar2;
        boolean z5;
        boolean z6;
        b bVarI = aVar.i(-1722390924);
        int i6 = i3 | (bVarI.e(j2) ? 32 : 16) | (bVarI.b(z) ? 2048 : 1024);
        boolean zB = bVarI.b(z2);
        int i7 = Http2.INITIAL_MAX_FRAME_SIZE;
        int i8 = i6 | (zB ? 16384 : 8192) | (bVarI.A(list) ? 131072 : 65536) | (bVarI.M(userLevelProgressDto) ? 1048576 : 524288) | (bVarI.b(z3) ? 8388608 : 4194304) | (bVarI.A(mz1Var) ? 67108864 : 33554432);
        int i9 = (bVarI.b(z4) ? 4 : 2) | (bVarI.d(i) ? 32 : 16) | (bVarI.d(i2) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024);
        if (!bVarI.A(function1)) {
            i7 = 8192;
        }
        int i10 = i9 | i7 | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.M(str2) ? 1048576 : 524288);
        int i11 = i4 & 131072;
        if (i11 != 0) {
            i5 = i10 | 12582912;
        } else {
            i5 = i10 | (bVarI.M(dVar) ? 8388608 : 4194304);
        }
        int i12 = i5 | (bVarI.A(function2) ? 67108864 : 33554432);
        if (bVarI.q(i8 & 1, ((306783379 & i8) == 306783378 && (i12 & 38347923) == 38347922) ? false : true)) {
            d.a aVar2 = d.a.b;
            d dVar3 = i11 != 0 ? aVar2 : dVar;
            i060 i060VarC = j060.c(wdw.a(bVarI) * 999.0f);
            d dVarN = dVar3.n(j.C(aVar2, null, 3));
            qyd0 qyd0Var = wdw.a;
            d dVarJ = h.j(d35.a(androidx.compose.foundation.a.b(ls7.a(j.i(dVarN, ((vdw) bVarI.O(qyd0Var)).a * 52.0f), i060VarC), j, i060VarC), wdw.a(bVarI) * 1.0f, j2, i060VarC), ((vdw) bVarI.O(qyd0Var)).a * 6.0f, 0.0f, ((vdw) bVarI.O(qyd0Var)).a * 6.0f, 0.0f, 10);
            boolean z7 = (i12 & 234881024) == 67108864;
            Object objY = bVarI.y();
            if (z7 || objY == androidx.compose.runtime.a.C0041a.a) {
                z5 = false;
                objY = new tcw(function2, 0);
                bVarI.r(objY);
            } else {
                z5 = false;
            }
            d dVarA = v.a(dVarJ, (Function1) objY);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, z5);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar4);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (z || z2) {
                bVar = bVarI;
                bVar.N(-1054315893);
                lkf0.b(pwo.e(R.string.sporty_cars_levels_loading, bVar), h.h(j.g(aVar2, 1.0f), 0.0f, 4.0f, 1), j3, d2l.f(12), null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVar, 3504, 0, 130544);
                bVar.X(false);
            } else {
                if (list.isEmpty()) {
                    bVarI.N(1212928530);
                    bVarI.X(false);
                } else if (userLevelProgressDto == null) {
                    bVarI.N(1212929714);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1053809508);
                    d dVarC2 = j.c(j.D(aVar2, null, 3), 1.0f);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    int iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarC2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC2, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar4);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    androidx.compose.foundation.layout.d dVar5 = androidx.compose.foundation.layout.d.a;
                    n54 n54Var2 = ht.a.d;
                    e(list, userLevelProgressDto, z3, mz1Var, function1, dw.a(dVar5.b(aVar2, n54Var2), z4 ? 0.0f : 1.0f), str2, bVarI, ((i8 >> 15) & 8190) | (i12 & 57344) | (i12 & 3670016));
                    bVar = bVarI;
                    if (z4) {
                        bVar.N(1564348642);
                        d dVarB = dVar5.b(aVar2, n54Var2);
                        int i13 = i8 >> 6;
                        int i14 = ((i12 >> 3) & 1022) | (i13 & 7168) | (i13 & 57344) | (458752 & i13) | (i13 & 3670016);
                        int i15 = i12 << 9;
                        f(i, i2, str, list, userLevelProgressDto, z3, mz1Var, function1, function0, str2, dVarB, bVar, i14 | (29360128 & i15) | (i15 & 234881024) | (i15 & 1879048192));
                        z6 = false;
                    } else {
                        z6 = false;
                        bVar.N(1549492667);
                    }
                    bVar.X(z6);
                    bVar.X(true);
                    bVar.X(z6);
                }
                bVar = bVarI;
            }
            bVar.X(true);
            dVar2 = dVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, j2, j3, z, z2, list, userLevelProgressDto, z3, mz1Var, z4, i, i2, str, function1, function0, str2, dVar2, function2, i3, i4) { // from class: cdw
                public final /* synthetic */ int A;
                public final /* synthetic */ String B;
                public final /* synthetic */ Function1 C;
                public final /* synthetic */ Function0 D;
                public final /* synthetic */ String E;
                public final /* synthetic */ d F;
                public final /* synthetic */ Function1 G;
                public final /* synthetic */ int H;
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ List f;
                public final /* synthetic */ UserLevelProgressDto i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ mz1 w;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ int z;

                {
                    this.H = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(805306759);
                    tdw.d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (a) obj, iA, this.H);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(List list, UserLevelProgressDto userLevelProgressDto, boolean z, mz1 mz1Var, final Function1 function1, d dVar, String str, androidx.compose.runtime.a aVar, int i) {
        UserLevelProgressDto userLevelProgressDto2;
        Integer numValueOf;
        char c2;
        int i2;
        b bVarI = aVar.i(-1499841727);
        int i3 = (i & 6) == 0 ? (bVarI.A(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            userLevelProgressDto2 = userLevelProgressDto;
            i3 |= bVarI.M(userLevelProgressDto2) ? 32 : 16;
        } else {
            userLevelProgressDto2 = userLevelProgressDto;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        mz1 mz1Var2 = mz1Var;
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(mz1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.M(dVar) ? 131072 : 65536;
        }
        String str2 = str;
        if ((1572864 & i) == 0) {
            i3 |= bVarI.M(str2) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (bVarI.q(i4 & 1, (i4 & 599187) != 599186)) {
            int level = userLevelProgressDto2.getLevel();
            if (level < 1) {
                level = 1;
            }
            int i5 = level + 1;
            int normalRounds = userLevelProgressDto2.getNormalRounds() - userLevelProgressDto2.getCompletedNormalRounds();
            int i6 = normalRounds < 0 ? 0 : normalRounds;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                numValueOf = Integer.valueOf(((LevelConfigDetailDto) it.next()).getLevel());
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((LevelConfigDetailDto) it.next()).getLevel());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : level;
            boolean z2 = i6 > 0 || level < iIntValue;
            float fA = wdw.a(bVarI) * 5.0f;
            d dVarC = j.c(j.D(dVar, null, 3), 1.0f);
            d160 d160VarA = b160.a(new kw0.i(fA, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            char c3 = '0';
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            List<LevelConfigDetailDto> listH = z ? h(level, iIntValue, list) : list;
            bVarI.N(-1920801527);
            for (final LevelConfigDetailDto levelConfigDetailDto : listH) {
                int level2 = levelConfigDetailDto.getLevel();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (level2 < level) {
                    bVarI.N(-384452365);
                    int level3 = levelConfigDetailDto.getLevel();
                    f8s f8sVar = f8s.a;
                    boolean zM = ((i4 & 57344) == 16384) | bVarI.M(levelConfigDetailDto);
                    Object objY = bVarI.y();
                    if (zM || objY == c0042a) {
                        objY = new Function0() { // from class: kdw
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Integer.valueOf(levelConfigDetailDto.getLevel()));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    c2 = c3;
                    b(level3, f8sVar, mz1Var2, (Function0) objY, null, 0.0f, false, false, bVarI, ((i4 >> 3) & 896) | 48, 496);
                    bVarI.X(false);
                    i2 = i6;
                } else {
                    c2 = c3;
                    if (levelConfigDetailDto.getLevel() == level) {
                        bVarI.N(-384148906);
                        int level4 = levelConfigDetailDto.getLevel();
                        f8s f8sVar2 = f8s.b;
                        boolean zM2 = ((i4 & 57344) == 16384) | bVarI.M(levelConfigDetailDto);
                        Object objY2 = bVarI.y();
                        if (zM2 || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: ldw
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(Integer.valueOf(levelConfigDetailDto.getLevel()));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY2);
                        }
                        b(level4, f8sVar2, mz1Var, (Function0) objY2, null, 0.0f, false, false, bVarI, ((i4 >> 3) & 896) | 48, 496);
                        bVarI.X(false);
                        i2 = i6;
                    } else if (levelConfigDetailDto.getLevel() == i5 && z2) {
                        bVarI.N(-383828924);
                        int level5 = levelConfigDetailDto.getLevel();
                        boolean zM3 = ((i4 & 57344) == 16384) | bVarI.M(levelConfigDetailDto);
                        Object objY3 = bVarI.y();
                        if (zM3 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: mdw
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(Integer.valueOf(levelConfigDetailDto.getLevel()));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY3);
                        }
                        int i7 = i4 >> 3;
                        int i8 = (i7 & 896) | ((i4 << 3) & 7168) | (i7 & 458752);
                        int i9 = i6;
                        level = level;
                        i2 = i9;
                        i5 = i5;
                        a(i2, level5, mz1Var, z, (Function0) objY3, str2, bVarI, i8);
                        bVarI.X(false);
                    } else {
                        int i10 = i6;
                        level = level;
                        i2 = i10;
                        i5 = i5;
                        bVarI.N(-383408874);
                        int level6 = levelConfigDetailDto.getLevel();
                        f8s f8sVar3 = f8s.c;
                        boolean zM4 = bVarI.M(levelConfigDetailDto) | ((i4 & 57344) == 16384);
                        Object objY4 = bVarI.y();
                        if (zM4 || objY4 == c0042a) {
                            objY4 = new Function0() { // from class: ndw
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(Integer.valueOf(levelConfigDetailDto.getLevel()));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY4);
                        }
                        b(level6, f8sVar3, mz1Var, (Function0) objY4, null, 0.0f, false, false, bVarI, ((i4 >> 3) & 896) | 48, 496);
                        bVarI.X(false);
                    }
                    int i11 = level;
                    i6 = i2;
                    level = i11;
                    mz1Var2 = mz1Var;
                    str2 = str;
                    i5 = i5;
                    c3 = c2;
                }
                int i12 = level;
                i6 = i2;
                level = i12;
                mz1Var2 = mz1Var;
                str2 = str;
                i5 = i5;
                c3 = c2;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new a6n(list, userLevelProgressDto, z, mz1Var, function1, dVar, str, i);
        }
    }

    public static final void g(final int i, final int i2, androidx.compose.runtime.a aVar, final d dVar, final String str) {
        int i3;
        b bVar;
        b bVarI = aVar.i(1837896174);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(str) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            long jD = r58.d(2579941062L);
            int i4 = (str != null ? str.length() : 0) > 16 ? 7 : 9;
            nk0.b bVar2 = new nk0.b((Object) null);
            int iL = bVar2.l(new ora0(j58.f, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar2.g(i + " ");
                Unit unit = Unit.a;
                bVar2.i(iL);
                int iL2 = bVar2.l(new ora0(jD, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar2.g(str == null ? "" : str);
                    bVar2.i(iL2);
                    bVar = bVarI;
                    lkf0.c(bVar2.m(), j.y(dVar, 0.0f, wdw.a(bVarI) * 40.0f, 1), 0L, wdw.c(i4, bVarI), new n9i(1), t9i.E, null, 0L, new gdf0(5), d2l.f(10), 0, true, 3, 0, null, null, null, bVar, 196608, 3462, 248260);
                } catch (Throwable th) {
                    bVar2.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar2.i(iL);
                throw th2;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fdw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    tdw.g(i, iA, (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final ArrayList h(int i, int i2, List list) {
        if (i < i2) {
            int i3 = i + 1;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                LevelConfigDetailDto levelConfigDetailDto = (LevelConfigDetailDto) obj;
                if (levelConfigDetailDto.getLevel() == i || levelConfigDetailDto.getLevel() == i3) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        int i4 = i - 2;
        if (i4 < 1) {
            i4 = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            int level = ((LevelConfigDetailDto) obj2).getLevel();
            if (i4 <= level && level <= i) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:279:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:287:0x060b  */
    /* JADX WARN: Code duplicated, block: B:288:0x060f  */
    /* JADX WARN: Code duplicated, block: B:293:0x062a  */
    /* JADX WARN: Code duplicated, block: B:299:0x0657  */
    /* JADX WARN: Code duplicated, block: B:303:0x0694  */
    /* JADX WARN: Code duplicated, block: B:306:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:307:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:312:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:315:0x0787  */
    /* JADX WARN: Code duplicated, block: B:316:0x078b  */
    /* JADX WARN: Code duplicated, block: B:321:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:324:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:326:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:329:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:331:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:337:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:340:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:342:0x0807  */
    /* JADX WARN: Code duplicated, block: B:344:0x0815  */
    /* JADX WARN: Code duplicated, block: B:345:0x0820  */
    /* JADX WARN: Code duplicated, block: B:368:0x097d  */
    /* JADX WARN: Code duplicated, block: B:369:0x0981  */
    /* JADX WARN: Code duplicated, block: B:374:0x099c  */
    /* JADX WARN: Code duplicated, block: B:377:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:380:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:383:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:384:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:396:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:406:0x0a77  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final int i, final int i2, final String str, final List list, final UserLevelProgressDto userLevelProgressDto, final boolean z, final mz1 mz1Var, final Function1 function1, final Function0 function0, String str2, final d dVar, androidx.compose.runtime.a aVar, final int i3) {
        List list2;
        UserLevelProgressDto userLevelProgressDto2;
        b bVar;
        Function1 function2;
        Integer numValueOf;
        int normalRounds;
        Object sdwVar;
        wd0 wd0Var;
        wd0 wd0Var2;
        final wd0 wd0Var3;
        boolean z2;
        ytw ytwVar;
        ytw ytwVar2;
        boolean z3;
        wd0 wd0Var4;
        List listR0;
        float f;
        float f2;
        Iterator it;
        wd0 wd0Var5;
        wd0 wd0Var6;
        int i4;
        n54.b bVar2;
        wd0 wd0Var7;
        int i5;
        b bVar3;
        boolean z4;
        float fA;
        float f3;
        yka.a.c cVar;
        int iHashCode;
        boolean z5;
        boolean z6;
        boolean zM;
        Object objY;
        boolean zA;
        Object objY2;
        int iHashCode2;
        boolean zA2;
        Object objY3;
        float f4;
        wd0 wd0Var8;
        int iHashCode3;
        final wd0 wd0Var9;
        int iHashCode4;
        boolean zA3;
        Object objY4;
        boolean z7;
        boolean zA4;
        Object objY5;
        int iHashCode5;
        int iHashCode6;
        f8s f8sVar;
        boolean z8;
        boolean zM2;
        Object objY6;
        float f5;
        float fFloatValue;
        boolean z9;
        int i6;
        final String str3 = str2;
        b bVarI = aVar.i(-1139262691);
        int i7 = (i3 & 6) == 0 ? (bVarI.d(i) ? 4 : 2) | i3 : i3;
        if ((i3 & 48) == 0) {
            i7 |= bVarI.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            list2 = list;
            i7 |= bVarI.A(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i3 & 24576) == 0) {
            userLevelProgressDto2 = userLevelProgressDto;
            i7 |= bVarI.M(userLevelProgressDto2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            userLevelProgressDto2 = userLevelProgressDto;
        }
        if ((196608 & i3) == 0) {
            i7 |= bVarI.b(z) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 |= bVarI.A(mz1Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= bVarI.A(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i7 |= bVarI.A(function0) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i7 |= bVarI.M(str3) ? 536870912 : 268435456;
        }
        if (bVarI.q(i7 & 1, ((i7 & 306783379) == 306783378 && ((bVarI.M(dVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i8 = i2 >= 2 ? i2 : 2;
            Iterator it2 = list2.iterator();
            int i9 = i7;
            if (it2.hasNext()) {
                numValueOf = Integer.valueOf(((LevelConfigDetailDto) it2.next()).getLevel());
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((LevelConfigDetailDto) it2.next()).getLevel());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : i8;
            boolean z10 = i8 < iIntValue;
            if (!z10 || (normalRounds = userLevelProgressDto2.getNormalRounds() - userLevelProgressDto2.getCompletedNormalRounds()) < 0) {
                normalRounds = 0;
            }
            int i10 = i9 & 14;
            boolean z11 = i10 == 4;
            Object objY7 = bVarI.y();
            float f6 = 0.0f;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z11 || objY7 == c0042a) {
                objY7 = ee0.a(0.0f);
                bVarI.r(objY7);
            }
            wd0 wd0Var10 = (wd0) objY7;
            boolean z12 = i10 == 4;
            Object objY8 = bVarI.y();
            if (z12 || objY8 == c0042a) {
                objY8 = ee0.a(1.0f);
                bVarI.r(objY8);
            }
            wd0 wd0Var11 = (wd0) objY8;
            float f7 = 1.0f;
            boolean z13 = i10 == 4;
            Object objY9 = bVarI.y();
            if (z13 || objY9 == c0042a) {
                objY9 = ee0.a(1.0f);
                bVarI.r(objY9);
            }
            wd0 wd0Var12 = (wd0) objY9;
            boolean z14 = i10 == 4;
            Object objY10 = bVarI.y();
            if (z14 || objY10 == c0042a) {
                objY10 = ee0.a(0.0f);
                bVarI.r(objY10);
            }
            wd0 wd0Var13 = (wd0) objY10;
            boolean z15 = i10 == 4;
            Object objY11 = bVarI.y();
            if (z15 || objY11 == c0042a) {
                objY11 = ee0.a(0.0f);
                bVarI.r(objY11);
            }
            wd0 wd0Var14 = (wd0) objY11;
            boolean z16 = i10 == 4;
            Object objY12 = bVarI.y();
            if (z16 || objY12 == c0042a) {
                objY12 = ee0.a(0.0f);
                bVarI.r(objY12);
            }
            wd0 wd0Var15 = (wd0) objY12;
            int i11 = normalRounds;
            boolean z17 = i10 == 4;
            Object objY13 = bVarI.y();
            if (z17 || objY13 == c0042a) {
                objY13 = m.b(Boolean.FALSE);
                bVarI.r(objY13);
            }
            ytw ytwVar3 = (ytw) objY13;
            boolean z18 = i10 == 4;
            Object objY14 = bVarI.y();
            if (z18 || objY14 == c0042a) {
                objY14 = m.b(Boolean.FALSE);
                bVarI.r(objY14);
            }
            ytw ytwVar4 = (ytw) objY14;
            boolean z19 = i10 == 4;
            Object objY15 = bVarI.y();
            if (z19 || objY15 == c0042a) {
                objY15 = m.b(Boolean.FALSE);
                bVarI.r(objY15);
            }
            ytw ytwVar5 = (ytw) objY15;
            Integer numValueOf3 = Integer.valueOf(i);
            int i12 = iIntValue;
            boolean zA5 = (i10 == 4) | bVarI.A(wd0Var10) | bVarI.A(wd0Var11) | bVarI.A(wd0Var12) | bVarI.A(wd0Var13) | bVarI.A(wd0Var14) | bVarI.A(wd0Var15) | bVarI.M(ytwVar3) | bVarI.M(ytwVar4) | bVarI.M(ytwVar5) | bVarI.b(z10) | ((i9 & 234881024) == 67108864);
            Object objY16 = bVarI.y();
            if (zA5 || objY16 == c0042a) {
                boolean z20 = z10;
                sdwVar = new sdw(i, wd0Var10, wd0Var11, wd0Var12, wd0Var13, wd0Var14, wd0Var15, z20, function0, ytwVar3, ytwVar4, ytwVar5, null);
                wd0Var = wd0Var13;
                wd0Var2 = wd0Var14;
                wd0Var3 = wd0Var15;
                z2 = z20;
                ytwVar = ytwVar3;
                ytwVar2 = ytwVar5;
                bVarI.r(sdwVar);
            } else {
                z2 = z10;
                ytwVar2 = ytwVar5;
                wd0Var = wd0Var13;
                ytwVar = ytwVar3;
                sdwVar = objY16;
                wd0Var2 = wd0Var14;
                wd0Var3 = wd0Var15;
            }
            xvf.e(bVarI, numValueOf3, (Function2) sdwVar);
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    LevelConfigDetailDto levelConfigDetailDto = (LevelConfigDetailDto) obj;
                    boolean z21 = z2;
                    wd0 wd0Var16 = wd0Var10;
                    if (levelConfigDetailDto.getLevel() == i8 - 1 || levelConfigDetailDto.getLevel() == i8) {
                        i6 = i12;
                    } else {
                        if (levelConfigDetailDto.getLevel() == i8 + 1) {
                            i6 = i12;
                            if (i8 < i6) {
                            }
                        } else {
                            i6 = i12;
                        }
                        i12 = i6;
                        wd0Var10 = wd0Var16;
                        z2 = z21;
                    }
                    arrayList.add(obj);
                    i12 = i6;
                    wd0Var10 = wd0Var16;
                    z2 = z21;
                }
                z3 = z2;
                wd0Var4 = wd0Var10;
                listR0 = CollectionsKt.r0(arrayList, new rdw());
            } else {
                z3 = z2;
                wd0Var4 = wd0Var10;
                listR0 = list;
            }
            float fA2 = wdw.a(bVarI) * 6.0f;
            float fA3 = wdw.a(bVarI) * 40.0f;
            ytw ytwVar6 = ytwVar;
            d dVarD = j.D(dVar, null, 3);
            kw0.i iVar = new kw0.i(fA2, true, new hw0());
            n54.b bVar4 = ht.a.k;
            d160 d160VarA = b160.a(iVar, bVar4, bVarI, 48);
            int iHashCode7 = Long.hashCode(bVarI.m());
            int i13 = 48;
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            float f8 = fA3;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, -1793211815, listR0);
            while (itA.hasNext()) {
                final LevelConfigDetailDto levelConfigDetailDto2 = (LevelConfigDetailDto) itA.next();
                int i14 = i8 - 1;
                if (levelConfigDetailDto2.getLevel() < i14) {
                    bVarI.N(-1887881193);
                    int level = levelConfigDetailDto2.getLevel();
                    f8s f8sVar2 = f8s.a;
                    boolean zM3 = ((i9 & 29360128) == 8388608) | bVarI.M(levelConfigDetailDto2);
                    Object objY17 = bVarI.y();
                    if (zM3 || objY17 == c0042a) {
                        objY17 = new Function0() { // from class: odw
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(Integer.valueOf(levelConfigDetailDto2.getLevel()));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY17);
                    }
                    b bVar5 = bVarI;
                    f = f8;
                    b(level, f8sVar2, mz1Var, (Function0) objY17, null, 0.0f, false, false, bVar5, ((i9 >> 12) & 896) | 48, 496);
                    bVar3 = bVar5;
                    z9 = false;
                    bVar3.X(false);
                } else {
                    b bVar6 = bVarI;
                    f = f8;
                    if (levelConfigDetailDto2.getLevel() == i14) {
                        bVar6.N(-1887562761);
                        int level2 = levelConfigDetailDto2.getLevel();
                        f8s f8sVar3 = f8s.a;
                        boolean zM4 = ((i9 & 29360128) == 8388608) | bVar6.M(levelConfigDetailDto2);
                        Object objY18 = bVar6.y();
                        if (zM4 || objY18 == c0042a) {
                            objY18 = new pdw(function1, levelConfigDetailDto2);
                            bVar6.r(objY18);
                        }
                        b(level2, f8sVar3, mz1Var, (Function0) objY18, null, 0.0f, false, false, bVar6, ((i9 >> 12) & 896) | 48, 496);
                        bVar3 = bVar6;
                        z9 = false;
                        bVar3.X(false);
                    } else {
                        int level3 = levelConfigDetailDto2.getLevel();
                        n54 n54Var = ht.a.a;
                        d.a aVar3 = d.a.b;
                        if (level3 == i8) {
                            bVar6.N(-1887084958);
                            float fFloatValue2 = (f7 - ((Number) wd0Var3.d()).floatValue()) * f;
                            it = itA;
                            d dVarB = androidx.compose.foundation.a.b(j.w(aVar3, (wdw.a(bVar6) * 40.0f) + fFloatValue2), r58.b(1291845632), j060.c(wdw.a(bVar6) * 999.0f));
                            float fA4 = wdw.a(bVar6) * 8.0f;
                            if (z) {
                                bVar6.N(354787188);
                                bVar6.X(false);
                                f4 = f6;
                            } else {
                                bVar6.N(354787620);
                                float fA5 = wdw.a(bVar6) * 4.0f;
                                bVar6.X(false);
                                f4 = fA5;
                            }
                            d dVarJ = h.j(dVarB, fA4, 0.0f, f4, 0.0f, 10);
                            i4 = i8;
                            d160 d160VarA2 = b160.a(new kw0.i(wdw.a(bVar6) * 6.0f, true, new hw0()), bVar4, bVar6, i13);
                            int iHashCode8 = Long.hashCode(bVar6.m());
                            ne00 ne00VarS2 = bVar6.S();
                            d dVarC2 = c.c(bVar6, dVarJ);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            bVar6.D();
                            bVar2 = bVar4;
                            if (bVar6.S) {
                                bVar6.F(aVar4);
                            } else {
                                bVar6.p();
                            }
                            yka.a.b bVar7 = yka.a.f;
                            hlh0.a(bVar6, d160VarA2, bVar7);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(bVar6, ne00VarS2, dVar2);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            final wd0 wd0Var17 = wd0Var;
                            if (bVar6.S) {
                                wd0Var8 = wd0Var3;
                            } else {
                                wd0Var8 = wd0Var3;
                                if (!Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode8))) {
                                }
                                yka.a.c cVar2 = yka.a.d;
                                hlh0.a(bVar6, dVarC2, cVar2);
                                d dVarA = j.A(ls7.b(j.w(aVar3, fFloatValue2)), null, 3);
                                aiv aivVarC = g75.c(ht.a.d, false);
                                iHashCode3 = Long.hashCode(bVar6.m());
                                ne00 ne00VarS3 = bVar6.S();
                                d dVarC3 = c.c(bVar6, dVarA);
                                bVar6.D();
                                wd0Var9 = wd0Var2;
                                if (bVar6.S) {
                                    bVar6.F(aVar4);
                                } else {
                                    bVar6.p();
                                }
                                hlh0.a(bVar6, aivVarC, bVar7);
                                hlh0.a(bVar6, ne00VarS3, dVar2);
                                if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode3))) {
                                    n30.a(iHashCode3, bVar6, iHashCode3, c1350a2);
                                }
                                hlh0.a(bVar6, dVarC3, cVar2);
                                fv6.a(384, bVar6, androidx.compose.foundation.layout.d.a.f(aVar3), ((Boolean) ytwVar6.getValue()).booleanValue());
                                d dVarW = j.w(aVar3, f);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                iHashCode4 = Long.hashCode(bVar6.m());
                                ne00 ne00VarS4 = bVar6.S();
                                d dVarC4 = c.c(bVar6, dVarW);
                                bVar6.D();
                                if (bVar6.S) {
                                    bVar6.F(aVar4);
                                } else {
                                    bVar6.p();
                                }
                                hlh0.a(bVar6, aivVarC2, bVar7);
                                hlh0.a(bVar6, ne00VarS4, dVar2);
                                if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode4))) {
                                    n30.a(iHashCode4, bVar6, iHashCode4, c1350a2);
                                }
                                hlh0.a(bVar6, dVarC4, cVar2);
                                d dVarJ2 = h.j(aVar3, 0.0f, 0.0f, wdw.a(bVar6) * 2.0f, 0.0f, 11);
                                zA3 = bVar6.A(wd0Var12);
                                objY4 = bVar6.y();
                                if (!zA3 || objY4 == c0042a) {
                                    z7 = true;
                                    objY4 = new azh(wd0Var12, 1);
                                    bVar6.r(objY4);
                                } else {
                                    z7 = true;
                                }
                                g(0, ((i9 >> 21) & 896) | 6, bVar6, androidx.compose.ui.graphics.a.a(dVarJ2, (Function1) objY4), str2);
                                bVar6.X(z7);
                                wd0Var3 = wd0Var8;
                                zA4 = bVar6.A(wd0Var9) | bVar6.A(wd0Var3) | bVar6.A(wd0Var17);
                                f2 = f;
                                objY5 = bVar6.y();
                                if (zA4 || objY5 == c0042a) {
                                    objY5 = new Function1() { // from class: ucw
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            a7l a7lVar = (a7l) obj2;
                                            a7lVar.getClass();
                                            a7lVar.b((1.0f - ((Number) wd0Var3.d()).floatValue()) * ((Number) wd0Var9.d()).floatValue());
                                            wd0 wd0Var18 = wd0Var17;
                                            a7lVar.k(((Number) wd0Var18.d()).floatValue());
                                            a7lVar.v(((Number) wd0Var18.d()).floatValue());
                                            return Unit.a;
                                        }
                                    };
                                    bVar6.r(objY5);
                                }
                                d dVarA2 = androidx.compose.ui.graphics.a.a(aVar3, (Function1) objY5);
                                wd0Var6 = wd0Var9;
                                wd0Var5 = wd0Var17;
                                i78 i78VarA = g78.a(kw0.c, ht.a.n, bVar6, 48);
                                iHashCode5 = Long.hashCode(bVar6.m());
                                ne00 ne00VarS5 = bVar6.S();
                                d dVarC5 = c.c(bVar6, dVarA2);
                                bVar6.D();
                                wd0Var7 = wd0Var12;
                                if (bVar6.S) {
                                    bVar6.F(aVar4);
                                } else {
                                    bVar6.p();
                                }
                                hlh0.a(bVar6, i78VarA, bVar7);
                                hlh0.a(bVar6, ne00VarS5, dVar2);
                                if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode5))) {
                                    n30.a(iHashCode5, bVar6, iHashCode5, c1350a2);
                                }
                                hlh0.a(bVar6, dVarC5, cVar2);
                                long jC = wdw.c(8, bVar6);
                                n9i n9iVarA = n9i.a();
                                t9i t9iVar = t9i.E;
                                long j = b;
                                lkf0.b(str, null, j, jC, n9iVarA, t9iVar, null, 0L, new gdf0(3), d2l.f(11), 0, false, 0, 0, null, null, bVar6, ((i9 >> 6) & 14) | 196992, 6, 129474);
                                lkf0.b(op5.c(op5.a, DZsoPoBl.LDfXcLPncYdFw, pwo.e(R.string.sporty_cars_level_unlocked_word, bVar6)), null, j, wdw.c(8, bVar6), n9i.a(), t9iVar, null, 0L, new gdf0(3), d2l.f(10), 0, false, 0, 0, null, null, bVar6, 196992, 6, 129474);
                                bVar6.X(true);
                                bVar6.X(true);
                                aiv aivVarC3 = g75.c(n54Var, false);
                                iHashCode6 = Long.hashCode(bVar6.m());
                                ne00 ne00VarS6 = bVar6.S();
                                d dVarC6 = c.c(bVar6, aVar3);
                                bVar6.D();
                                if (bVar6.S) {
                                    bVar6.F(aVar4);
                                } else {
                                    bVar6.p();
                                }
                                hlh0.a(bVar6, aivVarC3, bVar7);
                                hlh0.a(bVar6, ne00VarS6, dVar2);
                                if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode6))) {
                                    n30.a(iHashCode6, bVar6, iHashCode6, c1350a2);
                                }
                                hlh0.a(bVar6, dVarC6, cVar2);
                                int level4 = levelConfigDetailDto2.getLevel();
                                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    f8sVar = f8s.b;
                                } else {
                                    f8sVar = f8s.c;
                                }
                                f8s f8sVar4 = f8sVar;
                                if ((i9 & 29360128) == 8388608) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                zM2 = z8 | bVar6.M(levelConfigDetailDto2);
                                objY6 = bVar6.y();
                                if (zM2 || objY6 == c0042a) {
                                    objY6 = new Function0() { // from class: vcw
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function1.invoke(Integer.valueOf(levelConfigDetailDto2.getLevel()));
                                            return Unit.a;
                                        }
                                    };
                                    bVar6.r(objY6);
                                }
                                Function0 function3 = (Function0) objY6;
                                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    fFloatValue = ((Number) wd0Var11.d()).floatValue();
                                } else {
                                    if (((Number) wd0Var4.d()).floatValue() > f6) {
                                        fFloatValue = ((Number) wd0Var4.d()).floatValue();
                                    } else {
                                        f5 = f7;
                                    }
                                    b(level4, f8sVar4, mz1Var, function3, null, f5, true, ((Boolean) ytwVar4.getValue()).booleanValue(), bVar6, ((i9 >> 12) & 896) | 12582912, 80);
                                    bVar3 = bVar6;
                                    f30.a(bVar3, true, true, false);
                                    i5 = i11;
                                }
                                f5 = fFloatValue;
                                b(level4, f8sVar4, mz1Var, function3, null, f5, true, ((Boolean) ytwVar4.getValue()).booleanValue(), bVar6, ((i9 >> 12) & 896) | 12582912, 80);
                                bVar3 = bVar6;
                                f30.a(bVar3, true, true, false);
                                i5 = i11;
                            }
                            n30.a(iHashCode8, bVar6, iHashCode8, c1350a2);
                            yka.a.c cVar3 = yka.a.d;
                            hlh0.a(bVar6, dVarC2, cVar3);
                            d dVarA3 = j.A(ls7.b(j.w(aVar3, fFloatValue2)), null, 3);
                            aiv aivVarC4 = g75.c(ht.a.d, false);
                            iHashCode3 = Long.hashCode(bVar6.m());
                            ne00 ne00VarS7 = bVar6.S();
                            d dVarC7 = c.c(bVar6, dVarA3);
                            bVar6.D();
                            wd0Var9 = wd0Var2;
                            if (bVar6.S) {
                                bVar6.F(aVar4);
                            } else {
                                bVar6.p();
                            }
                            hlh0.a(bVar6, aivVarC4, bVar7);
                            hlh0.a(bVar6, ne00VarS7, dVar2);
                            if (bVar6.S) {
                                n30.a(iHashCode3, bVar6, iHashCode3, c1350a2);
                            } else {
                                n30.a(iHashCode3, bVar6, iHashCode3, c1350a2);
                            }
                            hlh0.a(bVar6, dVarC7, cVar3);
                            fv6.a(384, bVar6, androidx.compose.foundation.layout.d.a.f(aVar3), ((Boolean) ytwVar6.getValue()).booleanValue());
                            d dVarW2 = j.w(aVar3, f);
                            aiv aivVarC5 = g75.c(n54Var, false);
                            iHashCode4 = Long.hashCode(bVar6.m());
                            ne00 ne00VarS8 = bVar6.S();
                            d dVarC8 = c.c(bVar6, dVarW2);
                            bVar6.D();
                            if (bVar6.S) {
                                bVar6.F(aVar4);
                            } else {
                                bVar6.p();
                            }
                            hlh0.a(bVar6, aivVarC5, bVar7);
                            hlh0.a(bVar6, ne00VarS8, dVar2);
                            if (bVar6.S) {
                                n30.a(iHashCode4, bVar6, iHashCode4, c1350a2);
                            } else {
                                n30.a(iHashCode4, bVar6, iHashCode4, c1350a2);
                            }
                            hlh0.a(bVar6, dVarC8, cVar3);
                            d dVarJ3 = h.j(aVar3, 0.0f, 0.0f, wdw.a(bVar6) * 2.0f, 0.0f, 11);
                            zA3 = bVar6.A(wd0Var12);
                            objY4 = bVar6.y();
                            if (zA3) {
                                z7 = true;
                                objY4 = new azh(wd0Var12, 1);
                                bVar6.r(objY4);
                            } else {
                                z7 = true;
                                objY4 = new azh(wd0Var12, 1);
                                bVar6.r(objY4);
                            }
                            g(0, ((i9 >> 21) & 896) | 6, bVar6, androidx.compose.ui.graphics.a.a(dVarJ3, (Function1) objY4), str2);
                            bVar6.X(z7);
                            wd0Var3 = wd0Var8;
                            zA4 = bVar6.A(wd0Var9) | bVar6.A(wd0Var3) | bVar6.A(wd0Var17);
                            f2 = f;
                            objY5 = bVar6.y();
                            if (zA4) {
                                objY5 = new Function1() { // from class: ucw
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        a7l a7lVar = (a7l) obj2;
                                        a7lVar.getClass();
                                        a7lVar.b((1.0f - ((Number) wd0Var3.d()).floatValue()) * ((Number) wd0Var9.d()).floatValue());
                                        wd0 wd0Var18 = wd0Var17;
                                        a7lVar.k(((Number) wd0Var18.d()).floatValue());
                                        a7lVar.v(((Number) wd0Var18.d()).floatValue());
                                        return Unit.a;
                                    }
                                };
                                bVar6.r(objY5);
                            } else {
                                objY5 = new Function1() { // from class: ucw
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        a7l a7lVar = (a7l) obj2;
                                        a7lVar.getClass();
                                        a7lVar.b((1.0f - ((Number) wd0Var3.d()).floatValue()) * ((Number) wd0Var9.d()).floatValue());
                                        wd0 wd0Var18 = wd0Var17;
                                        a7lVar.k(((Number) wd0Var18.d()).floatValue());
                                        a7lVar.v(((Number) wd0Var18.d()).floatValue());
                                        return Unit.a;
                                    }
                                };
                                bVar6.r(objY5);
                            }
                            d dVarA4 = androidx.compose.ui.graphics.a.a(aVar3, (Function1) objY5);
                            wd0Var6 = wd0Var9;
                            wd0Var5 = wd0Var17;
                            i78 i78VarA2 = g78.a(kw0.c, ht.a.n, bVar6, 48);
                            iHashCode5 = Long.hashCode(bVar6.m());
                            ne00 ne00VarS9 = bVar6.S();
                            d dVarC9 = c.c(bVar6, dVarA4);
                            bVar6.D();
                            wd0Var7 = wd0Var12;
                            if (bVar6.S) {
                                bVar6.F(aVar4);
                            } else {
                                bVar6.p();
                            }
                            hlh0.a(bVar6, i78VarA2, bVar7);
                            hlh0.a(bVar6, ne00VarS9, dVar2);
                            if (bVar6.S) {
                                n30.a(iHashCode5, bVar6, iHashCode5, c1350a2);
                            } else {
                                n30.a(iHashCode5, bVar6, iHashCode5, c1350a2);
                            }
                            hlh0.a(bVar6, dVarC9, cVar3);
                            long jC2 = wdw.c(8, bVar6);
                            n9i n9iVarA2 = n9i.a();
                            t9i t9iVar2 = t9i.E;
                            long j2 = b;
                            lkf0.b(str, null, j2, jC2, n9iVarA2, t9iVar2, null, 0L, new gdf0(3), d2l.f(11), 0, false, 0, 0, null, null, bVar6, ((i9 >> 6) & 14) | 196992, 6, 129474);
                            lkf0.b(op5.c(op5.a, DZsoPoBl.LDfXcLPncYdFw, pwo.e(R.string.sporty_cars_level_unlocked_word, bVar6)), null, j2, wdw.c(8, bVar6), n9i.a(), t9iVar2, null, 0L, new gdf0(3), d2l.f(10), 0, false, 0, 0, null, null, bVar6, 196992, 6, 129474);
                            bVar6.X(true);
                            bVar6.X(true);
                            aiv aivVarC6 = g75.c(n54Var, false);
                            iHashCode6 = Long.hashCode(bVar6.m());
                            ne00 ne00VarS10 = bVar6.S();
                            d dVarC10 = c.c(bVar6, aVar3);
                            bVar6.D();
                            if (bVar6.S) {
                                bVar6.F(aVar4);
                            } else {
                                bVar6.p();
                            }
                            hlh0.a(bVar6, aivVarC6, bVar7);
                            hlh0.a(bVar6, ne00VarS10, dVar2);
                            if (bVar6.S) {
                                n30.a(iHashCode6, bVar6, iHashCode6, c1350a2);
                            } else {
                                n30.a(iHashCode6, bVar6, iHashCode6, c1350a2);
                            }
                            hlh0.a(bVar6, dVarC10, cVar3);
                            int level5 = levelConfigDetailDto2.getLevel();
                            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                                f8sVar = f8s.b;
                            } else {
                                f8sVar = f8s.c;
                            }
                            f8s f8sVar5 = f8sVar;
                            if ((i9 & 29360128) == 8388608) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            zM2 = z8 | bVar6.M(levelConfigDetailDto2);
                            objY6 = bVar6.y();
                            if (zM2) {
                                objY6 = new Function0() { // from class: vcw
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function1.invoke(Integer.valueOf(levelConfigDetailDto2.getLevel()));
                                        return Unit.a;
                                    }
                                };
                                bVar6.r(objY6);
                            } else {
                                objY6 = new Function0() { // from class: vcw
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function1.invoke(Integer.valueOf(levelConfigDetailDto2.getLevel()));
                                        return Unit.a;
                                    }
                                };
                                bVar6.r(objY6);
                            }
                            Function0 function4 = (Function0) objY6;
                            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                                fFloatValue = ((Number) wd0Var11.d()).floatValue();
                            } else {
                                if (((Number) wd0Var4.d()).floatValue() > f6) {
                                    fFloatValue = ((Number) wd0Var4.d()).floatValue();
                                } else {
                                    f5 = f7;
                                }
                                b(level5, f8sVar5, mz1Var, function4, null, f5, true, ((Boolean) ytwVar4.getValue()).booleanValue(), bVar6, ((i9 >> 12) & 896) | 12582912, 80);
                                bVar3 = bVar6;
                                f30.a(bVar3, true, true, false);
                                i5 = i11;
                            }
                            f5 = fFloatValue;
                            b(level5, f8sVar5, mz1Var, function4, null, f5, true, ((Boolean) ytwVar4.getValue()).booleanValue(), bVar6, ((i9 >> 12) & 896) | 12582912, 80);
                            bVar3 = bVar6;
                            f30.a(bVar3, true, true, false);
                            i5 = i11;
                        } else {
                            f2 = f;
                            it = itA;
                            wd0Var5 = wd0Var;
                            wd0Var6 = wd0Var2;
                            i4 = i8;
                            bVar2 = bVar4;
                            wd0Var7 = wd0Var12;
                            if (levelConfigDetailDto2.getLevel() == i4 + 1 && z3) {
                                bVar6.N(-1881599601);
                                float fFloatValue3 = ((Number) wd0Var3.d()).floatValue() * f2;
                                if (z) {
                                    bVar6.N(354946932);
                                    z4 = false;
                                    bVar6.X(false);
                                    fA = f6;
                                } else {
                                    z4 = false;
                                    bVar6.N(354947364);
                                    fA = wdw.a(bVar6) * 4.0f;
                                    bVar6.X(false);
                                }
                                d dVarW3 = j.w(aVar3, (wdw.a(bVar6) * 6.0f) + (wdw.a(bVar6) * 40.0f) + fFloatValue3);
                                aiv aivVarC7 = g75.c(n54Var, z4);
                                int iHashCode9 = Long.hashCode(bVar6.m());
                                ne00 ne00VarS11 = bVar6.S();
                                d dVarC11 = c.c(bVar6, dVarW3);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                bVar6.D();
                                if (bVar6.S) {
                                    bVar6.F(aVar5);
                                } else {
                                    bVar6.p();
                                }
                                yka.a.b bVar8 = yka.a.f;
                                hlh0.a(bVar6, aivVarC7, bVar8);
                                yka.a.d dVar3 = yka.a.e;
                                hlh0.a(bVar6, ne00VarS11, dVar3);
                                yka.a.C1350a c1350a3 = yka.a.g;
                                if (bVar6.S) {
                                    f3 = fA;
                                } else {
                                    f3 = fA;
                                    if (!Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode9))) {
                                    }
                                    cVar = yka.a.d;
                                    hlh0.a(bVar6, dVarC11, cVar);
                                    d dVarJ4 = h.j(androidx.compose.foundation.a.b(j.g(aVar3, f7), j58.c(((Number) wd0Var3.d()).floatValue() * 0.3019608f, r58.b(1291845632)), j060.c(wdw.a(bVar6) * 999.0f)), ((Number) wd0Var3.d()).floatValue() * wdw.a(bVar6) * 8.0f, 0.0f, ((Number) wd0Var3.d()).floatValue() * f3, 0.0f, 10);
                                    d160 d160VarA3 = b160.a(kw0.b, bVar2, bVar6, 54);
                                    iHashCode = Long.hashCode(bVar6.m());
                                    ne00 ne00VarS12 = bVar6.S();
                                    d dVarC12 = c.c(bVar6, dVarJ4);
                                    bVar6.D();
                                    if (bVar6.S) {
                                        bVar6.F(aVar5);
                                    } else {
                                        bVar6.p();
                                    }
                                    hlh0.a(bVar6, d160VarA3, bVar8);
                                    hlh0.a(bVar6, ne00VarS12, dVar3);
                                    if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode))) {
                                        n30.a(iHashCode, bVar6, iHashCode, c1350a3);
                                    }
                                    hlh0.a(bVar6, dVarC12, cVar);
                                    if (Float.compare(fFloatValue3, f6) > 0) {
                                        bVar6.N(439771378);
                                        d dVarW4 = j.w(aVar3, fFloatValue3);
                                        zA = bVar6.A(wd0Var3);
                                        objY2 = bVar6.y();
                                        if (zA || objY2 == c0042a) {
                                            objY2 = new Function1() { // from class: wcw
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    a7l a7lVar = (a7l) obj2;
                                                    a7lVar.getClass();
                                                    a7lVar.b(((Number) wd0Var3.d()).floatValue());
                                                    return Unit.a;
                                                }
                                            };
                                            bVar6.r(objY2);
                                        }
                                        d dVarA5 = androidx.compose.ui.graphics.a.a(dVarW4, (Function1) objY2);
                                        aiv aivVarC8 = g75.c(ht.a.e, false);
                                        iHashCode2 = Long.hashCode(bVar6.m());
                                        ne00 ne00VarS13 = bVar6.S();
                                        d dVarC13 = c.c(bVar6, dVarA5);
                                        bVar6.D();
                                        if (bVar6.S) {
                                            bVar6.F(aVar5);
                                        } else {
                                            bVar6.p();
                                        }
                                        hlh0.a(bVar6, aivVarC8, bVar8);
                                        hlh0.a(bVar6, ne00VarS13, dVar3);
                                        if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode2))) {
                                            n30.a(iHashCode2, bVar6, iHashCode2, c1350a3);
                                        }
                                        hlh0.a(bVar6, dVarC13, cVar);
                                        zA2 = bVar6.A(wd0Var3);
                                        objY3 = bVar6.y();
                                        if (zA2 || objY3 == c0042a) {
                                            objY3 = new xcw(wd0Var3, 0);
                                            bVar6.r(objY3);
                                        }
                                        i5 = i11;
                                        g(i5, (i9 >> 21) & 896, bVar6, androidx.compose.ui.graphics.a.a(aVar3, (Function1) objY3), str2);
                                        bVar6.X(true);
                                        ty0.a(bVar6, j.w(aVar3, wdw.a(bVar6) * 6.0f));
                                        z5 = false;
                                    } else {
                                        i5 = i11;
                                        z5 = false;
                                        bVar6.N(408913575);
                                    }
                                    bVar6.X(z5);
                                    int level6 = levelConfigDetailDto2.getLevel();
                                    f8s f8sVar6 = f8s.c;
                                    if ((i9 & 29360128) == 8388608) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    zM = z6 | bVar6.M(levelConfigDetailDto2);
                                    objY = bVar6.y();
                                    if (zM || objY == c0042a) {
                                        objY = new ycw(0, function1, levelConfigDetailDto2);
                                        bVar6.r(objY);
                                    }
                                    b(level6, f8sVar6, mz1Var, (Function0) objY, null, 0.0f, false, false, bVar6, ((i9 >> 12) & 896) | 48, 496);
                                    bVar3 = bVar6;
                                    f30.a(bVar3, true, true, false);
                                }
                                n30.a(iHashCode9, bVar6, iHashCode9, c1350a3);
                                cVar = yka.a.d;
                                hlh0.a(bVar6, dVarC11, cVar);
                                d dVarJ5 = h.j(androidx.compose.foundation.a.b(j.g(aVar3, f7), j58.c(((Number) wd0Var3.d()).floatValue() * 0.3019608f, r58.b(1291845632)), j060.c(wdw.a(bVar6) * 999.0f)), ((Number) wd0Var3.d()).floatValue() * wdw.a(bVar6) * 8.0f, 0.0f, ((Number) wd0Var3.d()).floatValue() * f3, 0.0f, 10);
                                d160 d160VarA4 = b160.a(kw0.b, bVar2, bVar6, 54);
                                iHashCode = Long.hashCode(bVar6.m());
                                ne00 ne00VarS14 = bVar6.S();
                                d dVarC14 = c.c(bVar6, dVarJ5);
                                bVar6.D();
                                if (bVar6.S) {
                                    bVar6.F(aVar5);
                                } else {
                                    bVar6.p();
                                }
                                hlh0.a(bVar6, d160VarA4, bVar8);
                                hlh0.a(bVar6, ne00VarS14, dVar3);
                                if (bVar6.S) {
                                    n30.a(iHashCode, bVar6, iHashCode, c1350a3);
                                } else {
                                    n30.a(iHashCode, bVar6, iHashCode, c1350a3);
                                }
                                hlh0.a(bVar6, dVarC14, cVar);
                                if (Float.compare(fFloatValue3, f6) > 0) {
                                    bVar6.N(439771378);
                                    d dVarW5 = j.w(aVar3, fFloatValue3);
                                    zA = bVar6.A(wd0Var3);
                                    objY2 = bVar6.y();
                                    if (zA) {
                                        objY2 = new Function1() { // from class: wcw
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                a7l a7lVar = (a7l) obj2;
                                                a7lVar.getClass();
                                                a7lVar.b(((Number) wd0Var3.d()).floatValue());
                                                return Unit.a;
                                            }
                                        };
                                        bVar6.r(objY2);
                                    } else {
                                        objY2 = new Function1() { // from class: wcw
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                a7l a7lVar = (a7l) obj2;
                                                a7lVar.getClass();
                                                a7lVar.b(((Number) wd0Var3.d()).floatValue());
                                                return Unit.a;
                                            }
                                        };
                                        bVar6.r(objY2);
                                    }
                                    d dVarA6 = androidx.compose.ui.graphics.a.a(dVarW5, (Function1) objY2);
                                    aiv aivVarC9 = g75.c(ht.a.e, false);
                                    iHashCode2 = Long.hashCode(bVar6.m());
                                    ne00 ne00VarS15 = bVar6.S();
                                    d dVarC15 = c.c(bVar6, dVarA6);
                                    bVar6.D();
                                    if (bVar6.S) {
                                        bVar6.F(aVar5);
                                    } else {
                                        bVar6.p();
                                    }
                                    hlh0.a(bVar6, aivVarC9, bVar8);
                                    hlh0.a(bVar6, ne00VarS15, dVar3);
                                    if (bVar6.S) {
                                        n30.a(iHashCode2, bVar6, iHashCode2, c1350a3);
                                    } else {
                                        n30.a(iHashCode2, bVar6, iHashCode2, c1350a3);
                                    }
                                    hlh0.a(bVar6, dVarC15, cVar);
                                    zA2 = bVar6.A(wd0Var3);
                                    objY3 = bVar6.y();
                                    if (zA2) {
                                        objY3 = new xcw(wd0Var3, 0);
                                        bVar6.r(objY3);
                                    } else {
                                        objY3 = new xcw(wd0Var3, 0);
                                        bVar6.r(objY3);
                                    }
                                    i5 = i11;
                                    g(i5, (i9 >> 21) & 896, bVar6, androidx.compose.ui.graphics.a.a(aVar3, (Function1) objY3), str2);
                                    bVar6.X(true);
                                    ty0.a(bVar6, j.w(aVar3, wdw.a(bVar6) * 6.0f));
                                    z5 = false;
                                } else {
                                    i5 = i11;
                                    z5 = false;
                                    bVar6.N(408913575);
                                }
                                bVar6.X(z5);
                                int level7 = levelConfigDetailDto2.getLevel();
                                f8s f8sVar7 = f8s.c;
                                if ((i9 & 29360128) == 8388608) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                zM = z6 | bVar6.M(levelConfigDetailDto2);
                                objY = bVar6.y();
                                if (zM) {
                                    objY = new ycw(0, function1, levelConfigDetailDto2);
                                    bVar6.r(objY);
                                } else {
                                    objY = new ycw(0, function1, levelConfigDetailDto2);
                                    bVar6.r(objY);
                                }
                                b(level7, f8sVar7, mz1Var, (Function0) objY, null, 0.0f, false, false, bVar6, ((i9 >> 12) & 896) | 48, 496);
                                bVar3 = bVar6;
                                f30.a(bVar3, true, true, false);
                            } else {
                                i5 = i11;
                                bVar6.N(-1878795558);
                                int level8 = levelConfigDetailDto2.getLevel();
                                f8s f8sVar8 = f8s.c;
                                boolean zM5 = ((i9 & 29360128) == 8388608) | bVar6.M(levelConfigDetailDto2);
                                Object objY19 = bVar6.y();
                                if (zM5 || objY19 == c0042a) {
                                    objY19 = new Function0() { // from class: zcw
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function1.invoke(Integer.valueOf(levelConfigDetailDto2.getLevel()));
                                            return Unit.a;
                                        }
                                    };
                                    bVar6.r(objY19);
                                }
                                i13 = 48;
                                b(level8, f8sVar8, mz1Var, (Function0) objY19, null, 0.0f, false, false, bVar6, ((i9 >> 12) & 896) | 48, 496);
                                bVar3 = bVar6;
                                bVar3.X(false);
                            }
                        }
                        i13 = 48;
                    }
                    i11 = i5;
                    bVarI = bVar3;
                    itA = it;
                    i8 = i4;
                    bVar4 = bVar2;
                    f8 = f2;
                    wd0Var = wd0Var5;
                    wd0Var2 = wd0Var6;
                    wd0Var12 = wd0Var7;
                    f6 = 0.0f;
                    f7 = 1.0f;
                }
                f2 = f;
                it = itA;
                wd0Var5 = wd0Var;
                wd0Var6 = wd0Var2;
                i4 = i8;
                bVar2 = bVar4;
                wd0Var7 = wd0Var12;
                i5 = i11;
                i11 = i5;
                bVarI = bVar3;
                itA = it;
                i8 = i4;
                bVar4 = bVar2;
                f8 = f2;
                wd0Var = wd0Var5;
                wd0Var2 = wd0Var6;
                wd0Var12 = wd0Var7;
                f6 = 0.0f;
                f7 = 1.0f;
            }
            function2 = function1;
            str3 = str2;
            bVar = bVarI;
            bVar.X(false);
            bVar.X(true);
        } else {
            bVar = bVarI;
            function2 = function1;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function1 function5 = function2;
            eVarZ.d = new Function2() { // from class: adw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    tdw.f(i, i2, str, list, userLevelProgressDto, z, mz1Var, function5, function0, str3, dVar, (a) obj2, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
