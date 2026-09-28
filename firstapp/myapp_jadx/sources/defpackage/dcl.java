package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class dcl {
    public static final void a(final long j, final float f, final float f2, final boolean z, final String str, final String str2, a aVar, final int i) {
        b bVarI = aVar.i(1605175879);
        int i2 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.c(f2) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str2) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            float f3 = z ? 1.3f * f : f;
            float f4 = z ? 1.5f * f2 : f2;
            float f5 = f3 * 2.4f;
            float f6 = 2.4f * f4;
            final long j2 = (((long) (((int) (j >> 32)) - ((int) ((f5 - f3) / 2.0f)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) ((f6 - f4) / 2.0f)))) & 4294967295L);
            float fA = c4o.a(Float.valueOf(f5), bVarI);
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.w(aVar2, fA), c4o.a(Float.valueOf(f6), bVarI));
            boolean zE = bVarI.e(j2);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                objY = new Function1() { // from class: xbl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        return new iwo(j2);
                    }
                };
                bVarI.r(objY);
            }
            d dVarB = g.b(dVarI, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i3 = i2 >> 12;
            brj.c((i3 & 112) | (i3 & 14) | 384, bVarI, j.e(aVar2, 1.0f), str, str2);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, f, f2, z, str, str2, i) { // from class: ybl
                public final /* synthetic */ long a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dcl.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:110:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x019c  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01de  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:136:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:143:0x0204  */
    /* JADX WARN: Code duplicated, block: B:157:0x02be  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x0307  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x015f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x016e  */
    public static final void b(final long j, final d dVar, final ap20 ap20Var, final List<tp10> list, final Map<Long, pr50> map, final Map<Long, Boolean> map2, final Map<Long, String> map3, final Map<Long, ibl> map4, Map<Long, Long> map5, Map<Long, Long> map6, Set<Long> set, Function2<? super Long, ? super gly, Unit> function2, final boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, a aVar, final int i, final int i2, final int i3) {
        Map<Long, Long> map7;
        Map<Long, Long> map8;
        int i4;
        int i5;
        Set<Long> set2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
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
        boolean z5;
        final Function2<? super Long, ? super gly, Unit> function3;
        final boolean z6;
        final boolean z7;
        final String str3;
        final String str4;
        final Map<Long, Long> map9;
        b bVar;
        final Map<Long, Long> map10;
        final Set<Long> set3;
        final boolean z8;
        e eVarZ;
        int i25;
        final Map<Long, Long> map11;
        Map<Long, Long> map12;
        Set<Long> set4;
        int i26;
        final Function2<? super Long, ? super gly, Unit> function4;
        boolean z9;
        final boolean z10;
        final boolean z11;
        final String str5;
        final String str6;
        int i27;
        final String str7;
        final Map<Long, Long> map13;
        final boolean z12;
        final Set<Long> set5;
        e eVarZ2;
        int i28;
        Object objY;
        dVar.getClass();
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        b bVarI = aVar.i(1009974405);
        int i29 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16) | (bVarI.d(ap20Var.ordinal()) ? 256 : 128) | (bVarI.A(list) ? 2048 : 1024) | (bVarI.A(map4) ? 8388608 : 4194304);
        int i30 = i3 & 256;
        if (i30 != 0) {
            i29 |= 100663296;
            map7 = map5;
        } else {
            map7 = map5;
            if ((i & 100663296) == 0) {
                i29 |= bVarI.A(map7) ? 67108864 : 33554432;
            }
        }
        int i31 = i3 & 512;
        if (i31 == 0) {
            map8 = map6;
            if ((i & 805306368) == 0) {
                i4 = 32;
                i29 |= bVarI.A(map8) ? 536870912 : 268435456;
            }
            i5 = i3 & 1024;
            if (i5 != 0) {
                i7 = i2 | 6;
                set2 = set;
            } else {
                set2 = set;
                if (bVarI.A(set2)) {
                    i6 = 4;
                } else {
                    i6 = 2;
                }
                i7 = i2 | i6;
            }
            i8 = i3 & 2048;
            if (i8 != 0) {
                i10 = i7 | 48;
            } else {
                if (bVarI.A(function2)) {
                    i9 = i4;
                } else {
                    i9 = 16;
                }
                i10 = i7 | i9;
            }
            i11 = i3 & 8192;
            if (i11 != 0) {
                i13 = i10 | 3072;
            } else {
                int i32 = i10;
                if (bVarI.b(z2)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i13 = i32 | i12;
            }
            i14 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
            if (i14 != 0) {
                i15 = i13;
                if ((i2 & 24576) == 0) {
                    if (bVarI.b(z3)) {
                        i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i16 = 8192;
                    }
                    i15 |= i16;
                }
                i17 = i3 & 32768;
                if (i17 != 0) {
                    i19 = i15 | 196608;
                } else {
                    if (bVarI.b(z4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i19 = i15 | i18;
                }
                i20 = i3 & 65536;
                if (i20 != 0) {
                    i22 = i19 | 1572864;
                } else {
                    if (bVarI.M(str)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i22 = i19 | i21;
                }
                i23 = i3 & 131072;
                if (i23 != 0) {
                    i24 = i22 | 12582912;
                } else {
                    i24 = i22 | (bVarI.M(str2) ? 8388608 : 4194304);
                }
                if ((i29 & 306783379) == 306783378 || (i24 & 4793491) != 4793490) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i29 & 1, z5)) {
                    if (i30 != 0) {
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        int i33 = i4;
                        map11 = o2gVar;
                        i25 = i33;
                    } else {
                        i25 = i4;
                        map11 = map7;
                    }
                    if (i31 != 0) {
                        o2g o2gVar2 = o2g.a;
                        o2gVar2.getClass();
                        map12 = o2gVar2;
                    } else {
                        map12 = map8;
                    }
                    if (i5 != 0) {
                        set4 = t3g.a;
                    } else {
                        set4 = set2;
                    }
                    if (i8 != 0) {
                        objY = bVarI.y();
                        if (objY == a.C0041a.a) {
                            objY = new zbl();
                            bVarI.r(objY);
                        }
                        function4 = (Function2) objY;
                        i26 = i17;
                    } else {
                        i26 = i17;
                        function4 = function2;
                    }
                    if (i11 != 0) {
                        z9 = true;
                    } else {
                        z9 = z2;
                    }
                    if (i14 != 0) {
                        z10 = false;
                    } else {
                        z10 = z3;
                    }
                    if (i26 != 0) {
                        z11 = false;
                    } else {
                        z11 = z4;
                    }
                    if (i20 != 0) {
                        str5 = null;
                    } else {
                        str5 = str;
                    }
                    if (i23 != 0) {
                        str6 = null;
                    } else {
                        str6 = str2;
                    }
                    i27 = (int) (j >> i25);
                    if (i27 != 0 || (i28 = (int) (j & 4294967295L)) == 0 || list.isEmpty()) {
                        str7 = str6;
                        map13 = map12;
                        z12 = z9;
                        set5 = set4;
                        eVarZ2 = bVarI.Z();
                        if (eVarZ2 != null) {
                            final Function2<? super Long, ? super gly, Unit> function5 = function4;
                            final Map<Long, Long> map14 = map11;
                            eVarZ2.d = new Function2() { // from class: acl
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iA = qj40.a(i | 1);
                                    int iA2 = qj40.a(i2);
                                    dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map14, map13, set5, function5, z, z12, z10, z11, str5, str7, (a) obj, iA, iA2, i3);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    ap20 ap20Var2 = ap20.b;
                    float f = ap20Var != ap20Var2 ? 36.0f : 0.0f;
                    float f2 = ap20Var == ap20Var2 ? 16.0f : 0.0f;
                    final float f3 = i27 * 0.15f;
                    final float f4 = i28 * 0.06f;
                    final float fA = c4o.a(Float.valueOf(f3), bVarI);
                    final float fA2 = c4o.a(Float.valueOf(f4), bVarI);
                    d dVarJ = h.j(j.c(j.g(dVar, 1.0f), 0.4f), 0.0f, f, f2, 0.0f, 9);
                    final boolean z13 = z11;
                    bVar = bVarI;
                    final Map<Long, Long> map15 = map12;
                    final boolean z14 = z9;
                    final boolean z15 = z10;
                    final String str8 = str5;
                    final Set<Long> set6 = set4;
                    z6 = z15;
                    z7 = z13;
                    str3 = str8;
                    str4 = str6;
                    q75.a(dVarJ, null, false, pp8.b(2026020207, new gaj() { // from class: bcl
                        /* JADX WARN: Code duplicated, block: B:55:0x01d5  */
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            r75 r75Var;
                            boolean z16;
                            a.C0041a.C0042a c0042a;
                            List list2;
                            r75 r75Var2 = (r75) obj;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            r75Var2.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar2.M(r75Var2) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                List list3 = list;
                                boolean zD = aVar2.d(list3.size()) | aVar2.e(j);
                                Object objY2 = aVar2.y();
                                float f5 = f3;
                                float f6 = f4;
                                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                if (zD || objY2 == c0042a2) {
                                    int size = list3.size();
                                    float fI = kxa.i(r75Var2.c());
                                    float fH = kxa.h(r75Var2.c());
                                    float f7 = 0.5f * fI;
                                    float f8 = 0.66f * fH;
                                    float f9 = fI / 2.0f;
                                    float f10 = fH / 2.0f;
                                    float fSqrt = ((((float) Math.sqrt(((float) Math.pow(f5, 2.0d)) + ((float) Math.pow(f6, 2.0d)))) / 2.0f) / 8.0f) + (((float) Math.sqrt(((float) Math.pow(f7, 2.0d)) + ((float) Math.pow(f8, 2.0d)))) / 2.0f);
                                    float f11 = 6.2831855f / size;
                                    ArrayList arrayList = new ArrayList(size);
                                    int i34 = 0;
                                    while (i34 < size) {
                                        double d = i34 * f11;
                                        r75 r75Var3 = r75Var2;
                                        arrayList.add(new iwo((((long) ((int) (((((float) Math.sin(d)) * fSqrt) + f10) - (f6 / 2.0f)))) & 4294967295L) | (((long) ((int) (((((float) Math.cos(d)) * fSqrt) + f9) - (f5 / 2.0f)))) << 32)));
                                        i34++;
                                        size = size;
                                        r75Var2 = r75Var3;
                                    }
                                    r75Var = r75Var2;
                                    aVar2.r(arrayList);
                                    objY2 = arrayList;
                                } else {
                                    r75Var = r75Var2;
                                }
                                Iterator it = ((List) objY2).iterator();
                                int i35 = 0;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    int i36 = i35 + 1;
                                    if (i35 < 0) {
                                        kotlin.collections.b.q();
                                        throw null;
                                    }
                                    long j2 = ((iwo) next).a;
                                    final tp10 tp10Var = (tp10) list3.get(i35);
                                    boolean z17 = z15;
                                    boolean z18 = z13;
                                    String str9 = str8;
                                    String str10 = str6;
                                    if (z17) {
                                        aVar2.N(1656588413);
                                        if (!tp10Var.d || !z18 || str9 == null || str10 == null) {
                                            aVar2.N(1652757464);
                                        } else {
                                            aVar2.N(1656826090);
                                            aVar2.C(1300372656, "spawn-smoke-" + tp10Var.c);
                                            dcl.a(j2, f5, f6, tp10Var.b, str9, str10, aVar2, 0);
                                            aVar2.K();
                                        }
                                        aVar2.H();
                                        aVar2.H();
                                    } else {
                                        f5 = f5;
                                        f6 = f6;
                                        aVar2.N(1652757464);
                                        aVar2.H();
                                        if (z14) {
                                            long j3 = tp10Var.c;
                                            boolean z19 = tp10Var.b;
                                            boolean zG = Intrinsics.g(map2.get(Long.valueOf(j3)), Boolean.TRUE);
                                            pr50 pr50Var = (pr50) map.get(Long.valueOf(j3));
                                            if (z19 || zG) {
                                                z16 = true;
                                            } else {
                                                if ((pr50Var != null ? pr50Var.e : null) != qr50.b) {
                                                    if (set6.contains(Long.valueOf(j3))) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                } else {
                                                    z16 = true;
                                                }
                                            }
                                            boolean z20 = z;
                                            if ((!z20 || z16) && (z20 || !z16)) {
                                                if (tp10Var.d) {
                                                    aVar2.N(1658147217);
                                                    aVar2.C(1300415153, Long.valueOf(j3));
                                                    Long lValueOf = Long.valueOf(j3);
                                                    Map map16 = map4;
                                                    Object obj4 = map16.get(lValueOf);
                                                    float f12 = fA;
                                                    float f13 = fA2;
                                                    if (obj4 == null) {
                                                        f4c f4cVar = tbl.a;
                                                        ibl iblVar = new ibl(z19 ? 1.3f * f12 : f12, z19 ? 1.5f * f13 : f13, j2);
                                                        map16.put(lValueOf, iblVar);
                                                        obj4 = iblVar;
                                                    } else {
                                                        it = it;
                                                    }
                                                    ibl iblVar2 = (ibl) obj4;
                                                    boolean z21 = ((int) (j2 >> 32)) < kxa.i(r75Var.c()) / 2;
                                                    long jH = (((long) (kxa.h(r75Var.c()) / 2)) & 4294967295L) | (((long) (kxa.i(r75Var.c()) / 2)) << 32);
                                                    long jI = (((long) ((int) (((double) kxa.i(r75Var.c())) * 0.7d))) << 32) | (((long) (-((int) (((double) kxa.h(r75Var.c())) * 0.25d)))) & 4294967295L);
                                                    String str11 = (String) map3.get(Long.valueOf(j3));
                                                    Long l = (Long) map11.get(Long.valueOf(j3));
                                                    Long l2 = (Long) map15.get(Long.valueOf(j3));
                                                    final Function2 function6 = function4;
                                                    boolean zM = aVar2.M(function6) | aVar2.M(tp10Var);
                                                    Object objY3 = aVar2.y();
                                                    if (zM || objY3 == c0042a2) {
                                                        objY3 = new Function1() { // from class: wbl
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj5) {
                                                                Long lValueOf2 = Long.valueOf(tp10Var.c);
                                                                function6.invoke(lValueOf2, (gly) obj5);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar2.r(objY3);
                                                    }
                                                    Function1 function1 = (Function1) objY3;
                                                    a aVar3 = aVar2;
                                                    c0042a = c0042a2;
                                                    list2 = list3;
                                                    tbl.b(ap20Var, z21, f12, f13, j2, jH, jI, tp10Var, pr50Var, str11, zG, iblVar2, l, l2, function1, z18, str9, str10, aVar3, 0);
                                                    aVar2 = aVar3;
                                                    aVar2.K();
                                                } else {
                                                    it = it;
                                                    c0042a = c0042a2;
                                                    list2 = list3;
                                                    aVar2.N(1652757464);
                                                }
                                                aVar2.H();
                                            }
                                        }
                                        list3 = list2;
                                        i35 = i36;
                                        f5 = f5;
                                        f6 = f6;
                                        c0042a2 = c0042a;
                                        it = it;
                                    }
                                    it = it;
                                    c0042a = c0042a2;
                                    list2 = list3;
                                    list3 = list2;
                                    i35 = i36;
                                    f5 = f5;
                                    f6 = f6;
                                    c0042a2 = c0042a;
                                    it = it;
                                }
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVar), bVar, 3072, 6);
                    set3 = set6;
                    map9 = map11;
                    map10 = map15;
                    function3 = function4;
                    z8 = z14;
                } else {
                    bVarI.G();
                    function3 = function2;
                    z6 = z3;
                    z7 = z4;
                    str3 = str;
                    str4 = str2;
                    map9 = map7;
                    bVar = bVarI;
                    map10 = map8;
                    set3 = set2;
                    z8 = z2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ccl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map9, map10, set3, function3, z, z8, z6, z7, str3, str4, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i15 = i13 | 24576;
            i17 = i3 & 32768;
            if (i17 != 0) {
                i19 = i15 | 196608;
            } else {
                if (bVarI.b(z4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i19 = i15 | i18;
            }
            i20 = i3 & 65536;
            if (i20 != 0) {
                i22 = i19 | 1572864;
            } else {
                if (bVarI.M(str)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i22 = i19 | i21;
            }
            i23 = i3 & 131072;
            if (i23 != 0) {
                i24 = i22 | 12582912;
            } else {
                i24 = i22 | (bVarI.M(str2) ? 8388608 : 4194304);
            }
            if ((i29 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bVarI.q(i29 & 1, z5)) {
                if (i30 != 0) {
                    o2g o2gVar3 = o2g.a;
                    o2gVar3.getClass();
                    int i34 = i4;
                    map11 = o2gVar3;
                    i25 = i34;
                } else {
                    i25 = i4;
                    map11 = map7;
                }
                if (i31 != 0) {
                    o2g o2gVar4 = o2g.a;
                    o2gVar4.getClass();
                    map12 = o2gVar4;
                } else {
                    map12 = map8;
                }
                if (i5 != 0) {
                    set4 = t3g.a;
                } else {
                    set4 = set2;
                }
                if (i8 != 0) {
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new zbl();
                        bVarI.r(objY);
                    }
                    function4 = (Function2) objY;
                    i26 = i17;
                } else {
                    i26 = i17;
                    function4 = function2;
                }
                if (i11 != 0) {
                    z9 = true;
                } else {
                    z9 = z2;
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if (i26 != 0) {
                    z11 = false;
                } else {
                    z11 = z4;
                }
                if (i20 != 0) {
                    str5 = null;
                } else {
                    str5 = str;
                }
                if (i23 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                i27 = (int) (j >> i25);
                if (i27 != 0) {
                }
                str7 = str6;
                map13 = map12;
                z12 = z9;
                set5 = set4;
                eVarZ2 = bVarI.Z();
                if (eVarZ2 != null) {
                    final Function2 function6 = function4;
                    final Map map16 = map11;
                    eVarZ2.d = new Function2() { // from class: acl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map16, map13, set5, function6, z, z12, z10, z11, str5, str7, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            bVarI.G();
            function3 = function2;
            z6 = z3;
            z7 = z4;
            str3 = str;
            str4 = str2;
            map9 = map7;
            bVar = bVarI;
            map10 = map8;
            set3 = set2;
            z8 = z2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ccl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map9, map10, set3, function3, z, z8, z6, z7, str3, str4, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i29 |= 805306368;
        map8 = map6;
        i4 = 32;
        i5 = i3 & 1024;
        if (i5 != 0) {
            i7 = i2 | 6;
            set2 = set;
        } else {
            set2 = set;
            if (bVarI.A(set2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i7 = i2 | i6;
        }
        i8 = i3 & 2048;
        if (i8 != 0) {
            i10 = i7 | 48;
        } else {
            if (bVarI.A(function2)) {
                i9 = i4;
            } else {
                i9 = 16;
            }
            i10 = i7 | i9;
        }
        i11 = i3 & 8192;
        if (i11 != 0) {
            i13 = i10 | 3072;
        } else {
            int i35 = i10;
            if (bVarI.b(z2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i13 = i35 | i12;
        }
        i14 = i3 & Http2.INITIAL_MAX_FRAME_SIZE;
        if (i14 != 0) {
            i15 = i13;
            if ((i2 & 24576) == 0) {
                if (bVarI.b(z3)) {
                    i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i16 = 8192;
                }
                i15 |= i16;
            }
            i17 = i3 & 32768;
            if (i17 != 0) {
                i19 = i15 | 196608;
            } else {
                if (bVarI.b(z4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i19 = i15 | i18;
            }
            i20 = i3 & 65536;
            if (i20 != 0) {
                i22 = i19 | 1572864;
            } else {
                if (bVarI.M(str)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i22 = i19 | i21;
            }
            i23 = i3 & 131072;
            if (i23 != 0) {
                i24 = i22 | 12582912;
            } else {
                i24 = i22 | (bVarI.M(str2) ? 8388608 : 4194304);
            }
            if ((i29 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bVarI.q(i29 & 1, z5)) {
                if (i30 != 0) {
                    o2g o2gVar5 = o2g.a;
                    o2gVar5.getClass();
                    int i36 = i4;
                    map11 = o2gVar5;
                    i25 = i36;
                } else {
                    i25 = i4;
                    map11 = map7;
                }
                if (i31 != 0) {
                    o2g o2gVar6 = o2g.a;
                    o2gVar6.getClass();
                    map12 = o2gVar6;
                } else {
                    map12 = map8;
                }
                if (i5 != 0) {
                    set4 = t3g.a;
                } else {
                    set4 = set2;
                }
                if (i8 != 0) {
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new zbl();
                        bVarI.r(objY);
                    }
                    function4 = (Function2) objY;
                    i26 = i17;
                } else {
                    i26 = i17;
                    function4 = function2;
                }
                if (i11 != 0) {
                    z9 = true;
                } else {
                    z9 = z2;
                }
                if (i14 != 0) {
                    z10 = false;
                } else {
                    z10 = z3;
                }
                if (i26 != 0) {
                    z11 = false;
                } else {
                    z11 = z4;
                }
                if (i20 != 0) {
                    str5 = null;
                } else {
                    str5 = str;
                }
                if (i23 != 0) {
                    str6 = null;
                } else {
                    str6 = str2;
                }
                i27 = (int) (j >> i25);
                if (i27 != 0) {
                }
                str7 = str6;
                map13 = map12;
                z12 = z9;
                set5 = set4;
                eVarZ2 = bVarI.Z();
                if (eVarZ2 != null) {
                    final Function2 function7 = function4;
                    final Map map17 = map11;
                    eVarZ2.d = new Function2() { // from class: acl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            int iA2 = qj40.a(i2);
                            dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map17, map13, set5, function7, z, z12, z10, z11, str5, str7, (a) obj, iA, iA2, i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            bVarI.G();
            function3 = function2;
            z6 = z3;
            z7 = z4;
            str3 = str;
            str4 = str2;
            map9 = map7;
            bVar = bVarI;
            map10 = map8;
            set3 = set2;
            z8 = z2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ccl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map9, map10, set3, function3, z, z8, z6, z7, str3, str4, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
            }
        }
        i15 = i13 | 24576;
        i17 = i3 & 32768;
        if (i17 != 0) {
            i19 = i15 | 196608;
        } else {
            if (bVarI.b(z4)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i19 = i15 | i18;
        }
        i20 = i3 & 65536;
        if (i20 != 0) {
            i22 = i19 | 1572864;
        } else {
            if (bVarI.M(str)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i22 = i19 | i21;
        }
        i23 = i3 & 131072;
        if (i23 != 0) {
            i24 = i22 | 12582912;
        } else {
            i24 = i22 | (bVarI.M(str2) ? 8388608 : 4194304);
        }
        if ((i29 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bVarI.q(i29 & 1, z5)) {
            if (i30 != 0) {
                o2g o2gVar7 = o2g.a;
                o2gVar7.getClass();
                int i37 = i4;
                map11 = o2gVar7;
                i25 = i37;
            } else {
                i25 = i4;
                map11 = map7;
            }
            if (i31 != 0) {
                o2g o2gVar8 = o2g.a;
                o2gVar8.getClass();
                map12 = o2gVar8;
            } else {
                map12 = map8;
            }
            if (i5 != 0) {
                set4 = t3g.a;
            } else {
                set4 = set2;
            }
            if (i8 != 0) {
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new zbl();
                    bVarI.r(objY);
                }
                function4 = (Function2) objY;
                i26 = i17;
            } else {
                i26 = i17;
                function4 = function2;
            }
            if (i11 != 0) {
                z9 = true;
            } else {
                z9 = z2;
            }
            if (i14 != 0) {
                z10 = false;
            } else {
                z10 = z3;
            }
            if (i26 != 0) {
                z11 = false;
            } else {
                z11 = z4;
            }
            if (i20 != 0) {
                str5 = null;
            } else {
                str5 = str;
            }
            if (i23 != 0) {
                str6 = null;
            } else {
                str6 = str2;
            }
            i27 = (int) (j >> i25);
            if (i27 != 0) {
            }
            str7 = str6;
            map13 = map12;
            z12 = z9;
            set5 = set4;
            eVarZ2 = bVarI.Z();
            if (eVarZ2 != null) {
                final Function2 function8 = function4;
                final Map map18 = map11;
                eVarZ2.d = new Function2() { // from class: acl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        int iA2 = qj40.a(i2);
                        dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map18, map13, set5, function8, z, z12, z10, z11, str5, str7, (a) obj, iA, iA2, i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        bVarI.G();
        function3 = function2;
        z6 = z3;
        z7 = z4;
        str3 = str;
        str4 = str2;
        map9 = map7;
        bVar = bVarI;
        map10 = map8;
        set3 = set2;
        z8 = z2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ccl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    dcl.b(j, dVar, ap20Var, list, map, map2, map3, map4, map9, map10, set3, function3, z, z8, z6, z7, str3, str4, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }
}
