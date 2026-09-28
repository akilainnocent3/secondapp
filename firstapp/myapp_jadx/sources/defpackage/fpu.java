package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.a;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.l;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class fpu extends tjg0 {

    public static final class a {
        public final int a;
        public final int[] b;
        public final ljg0[] c;
        public final int[] d;
        public final int[][][] e;
        public final ljg0 f;

        public a(int[] iArr, ljg0[] ljg0VarArr, int[] iArr2, int[][][] iArr3, ljg0 ljg0Var) {
            this.b = iArr;
            this.c = ljg0VarArr;
            this.e = iArr3;
            this.d = iArr2;
            this.f = ljg0Var;
            this.a = iArr.length;
        }
    }

    @Override // defpackage.tjg0
    public final void c(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0341  */
    /* JADX WARN: Code duplicated, block: B:275:0x0591  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.tjg0
    public final ujg0 e(l[] lVarArr, ljg0 ljg0Var, ekv.b bVar, qxf0 qxf0Var) {
        final pid.d dVar;
        int i;
        final boolean z;
        final String str;
        final String languageTag;
        fw1 fw1Var;
        c150 c150VarG;
        boolean z2;
        c150 c150VarN;
        int i2;
        int[] iArr;
        Object obj;
        oyg.a aVar;
        int i3;
        int[] iArr2;
        int i4;
        int[] iArr3;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr4;
        ljg0 ljg0Var2 = ljg0Var;
        int i5 = 1;
        int[] iArr5 = new int[lVarArr.length + 1];
        int length = lVarArr.length + 1;
        jjg0[][] jjg0VarArr = new jjg0[length][];
        int[][][] iArr6 = new int[lVarArr.length + 1][][];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = ljg0Var2.a;
            jjg0VarArr[i6] = new jjg0[i7];
            iArr6[i6] = new int[i7][];
        }
        int length2 = lVarArr.length;
        final int[] iArr7 = new int[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            iArr7[i8] = lVarArr[i8].x();
        }
        int i9 = 0;
        while (i9 < ljg0Var2.a) {
            jjg0 jjg0VarA = ljg0Var2.a(i9);
            int i10 = jjg0VarA.c == 5 ? i5 : 0;
            int length3 = lVarArr.length;
            int i11 = i5;
            int i12 = 0;
            int i13 = 0;
            while (i12 < lVarArr.length) {
                l lVar = lVarArr[i12];
                int i14 = i5;
                int iMax = 0;
                for (int i15 = 0; i15 < jjg0VarA.a; i15++) {
                    iMax = Math.max(iMax, lVar.d(jjg0VarA.d[i15]) & 7);
                }
                int i16 = iArr5[i12] == 0 ? i14 : 0;
                if (iMax > i13 || (iMax == i13 && i10 != 0 && i11 == 0 && i16 != 0)) {
                    i11 = i16;
                    i13 = iMax;
                    length3 = i12;
                }
                i12++;
                i5 = i14;
            }
            int i17 = i5;
            if (length3 == lVarArr.length) {
                iArr4 = new int[jjg0VarA.a];
            } else {
                l lVar2 = lVarArr[length3];
                int[] iArr8 = new int[jjg0VarA.a];
                for (int i18 = 0; i18 < jjg0VarA.a; i18++) {
                    iArr8[i18] = lVar2.d(jjg0VarA.d[i18]);
                }
                iArr4 = iArr8;
            }
            int i19 = iArr5[length3];
            jjg0VarArr[length3][i19] = jjg0VarA;
            iArr6[length3][i19] = iArr4;
            iArr5[length3] = i19 + 1;
            i9++;
            ljg0Var2 = ljg0Var;
            i5 = i17;
        }
        int i20 = i5;
        int i21 = 0;
        ljg0[] ljg0VarArr = new ljg0[lVarArr.length];
        String[] strArr = new String[lVarArr.length];
        int[] iArr9 = new int[lVarArr.length];
        for (int i22 = 0; i22 < lVarArr.length; i22++) {
            int i23 = iArr5[i22];
            ljg0VarArr[i22] = new ljg0((jjg0[]) jrh0.Q(i23, jjg0VarArr[i22]));
            iArr6[i22] = (int[][]) jrh0.Q(i23, iArr6[i22]);
            strArr[i22] = lVarArr[i22].getName();
            iArr9[i22] = ((b) lVarArr[i22]).b;
        }
        a aVar2 = new a(iArr9, ljg0VarArr, iArr7, iArr6, new ljg0((jjg0[]) jrh0.Q(iArr5[lVarArr.length], jjg0VarArr[lVarArr.length])));
        final pid pidVar = (pid) this;
        synchronized (pidVar.c) {
            pidVar.g = Thread.currentThread();
            dVar = pidVar.f;
        }
        Boolean boolValueOf = pidVar.j;
        if (boolValueOf == null && (context = pidVar.d) != null) {
            boolValueOf = Boolean.valueOf(jrh0.N(context));
            pidVar.j = boolValueOf;
        }
        if (dVar.A && Build.VERSION.SDK_INT >= 32 && pidVar.h == null) {
            pidVar.h = new pid.f(pidVar.d, pidVar, boolValueOf);
        }
        int i24 = aVar2.a;
        Context context2 = pidVar.d;
        oyg.a[] aVarArr = new oyg.a[i24];
        int i25 = 0;
        while (true) {
            i = 2;
            if (i25 >= aVar2.a) {
                z = 0;
                break;
            }
            if (2 == iArr9[i25] && ljg0VarArr[i25].a > 0) {
                z = i20;
                break;
            }
            i25++;
        }
        Pair pairL = pid.l(i20, aVar2, iArr6, new pid.h.a() { // from class: kid
            @Override // pid.h.a
            public final c150 a(int i26, jjg0 jjg0Var, int[] iArr10) {
                pid pidVar2 = pidVar;
                pid.d dVar2 = dVar;
                oid oidVar = new oid(pidVar2, dVar2);
                int i27 = iArr7[i26];
                pcn.b bVar2 = pcn.b;
                pcn.a aVar3 = new pcn.a();
                for (int i28 = 0; i28 < jjg0Var.a; i28++) {
                    aVar3.c(new pid.a(i26, jjg0Var, i28, dVar2, iArr10[i28], z, oidVar, i27));
                }
                return aVar3.g();
            }
        }, new lid());
        if (pairL != null) {
            aVarArr[((Integer) pairL.second).intValue()] = (oyg.a) pairL.first;
        }
        if (pairL == null) {
            str = null;
        } else {
            oyg.a aVar3 = (oyg.a) pairL.first;
            str = aVar3.a.d[aVar3.b[0]].d;
        }
        dVar.o.getClass();
        final Point pointW = (!dVar.g || context2 == null) ? null : jrh0.w(context2);
        Pair pairL2 = pid.l(2, aVar2, iArr6, new pid.h.a() { // from class: iid
            /* JADX WARN: Code duplicated, block: B:28:0x0048  */
            @Override // pid.h.a
            public final c150 a(int i26, jjg0 jjg0Var, int[] iArr10) {
                int i27;
                int i28;
                int i29;
                int i30;
                jjg0 jjg0Var2 = jjg0Var;
                int i31 = iArr7[i26];
                pid.d dVar2 = dVar;
                Point point = pointW;
                int i32 = point != null ? point.x : dVar2.e;
                int i33 = point != null ? point.y : dVar2.f;
                boolean z3 = dVar2.h;
                if (i32 == Integer.MAX_VALUE || i33 == Integer.MAX_VALUE) {
                    i27 = Reader.READ_DONE;
                } else {
                    int i34 = Integer.MAX_VALUE;
                    for (int i35 = 0; i35 < jjg0Var2.a; i35++) {
                        a aVar4 = jjg0Var2.d[i35];
                        int i36 = aVar4.u;
                        int i37 = aVar4.v;
                        if (i36 > 0 && i37 > 0) {
                            if (!z3) {
                                i29 = i33;
                                i30 = i32;
                            } else if ((i36 > i37) != (i32 > i33)) {
                                i30 = i33;
                                i29 = i32;
                            } else {
                                i29 = i33;
                                i30 = i32;
                            }
                            int i38 = i36 * i29;
                            int i39 = i37 * i30;
                            Point point2 = i38 >= i39 ? new Point(i30, jrh0.f(i39, i36)) : new Point(jrh0.f(i38, i37), i29);
                            int i40 = aVar4.u;
                            int i41 = i40 * i37;
                            if (i40 >= ((int) (point2.x * 0.98f)) && i37 >= ((int) (point2.y * 0.98f)) && i41 < i34) {
                                i34 = i41;
                            }
                        }
                    }
                    i27 = i34;
                }
                pcn.a aVar5 = new pcn.a();
                int i42 = 0;
                while (i42 < jjg0Var2.a) {
                    a aVar6 = jjg0Var2.d[i42];
                    int i43 = aVar6.u;
                    int i44 = (i43 == -1 || (i28 = aVar6.v) == -1) ? -1 : i43 * i28;
                    aVar5.c(new pid.i(i26, jjg0Var2, i42, dVar2, iArr10[i42], str, i31, i27 == Integer.MAX_VALUE || (i44 != -1 && i44 <= i27)));
                    i42++;
                    jjg0Var2 = jjg0Var;
                }
                return aVar5.g();
            }
        }, new jid());
        int i26 = 4;
        Pair pairL3 = pairL2 == null ? pid.l(4, aVar2, iArr6, new pid.h.a() { // from class: gid
            @Override // pid.h.a
            public final c150 a(int i27, jjg0 jjg0Var, int[] iArr10) {
                pcn.b bVar2 = pcn.b;
                pcn.a aVar4 = new pcn.a();
                for (int i28 = 0; i28 < jjg0Var.a; i28++) {
                    aVar4.c(new pid.b(i27, jjg0Var, i28, dVar, iArr10[i28]));
                }
                return aVar4.g();
            }
        }, new hid()) : null;
        if (pairL3 != null) {
            aVarArr[((Integer) pairL3.second).intValue()] = (oyg.a) pairL3.first;
        } else if (pairL2 != null) {
            aVarArr[((Integer) pairL2.second).intValue()] = (oyg.a) pairL2.first;
        }
        if (!dVar.q || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = jrh0.a;
            languageTag = locale.toLanguageTag();
        }
        int i27 = 3;
        Pair pairL4 = pid.l(3, aVar2, iArr6, new pid.h.a() { // from class: mid
            @Override // pid.h.a
            public final c150 a(int i28, jjg0 jjg0Var, int[] iArr10) {
                pcn.b bVar2 = pcn.b;
                pcn.a aVar4 = new pcn.a();
                for (int i29 = 0; i29 < jjg0Var.a; i29++) {
                    aVar4.c(new pid.g(i28, jjg0Var, i29, dVar, iArr10[i29], str, languageTag));
                }
                return aVar4.g();
            }
        }, new nid());
        if (pairL4 != null) {
            aVarArr[((Integer) pairL4.second).intValue()] = (oyg.a) pairL4.first;
        }
        int i28 = 0;
        while (i28 < i24) {
            int i29 = iArr9[i28];
            if (i29 == i || i29 == 1 || i29 == i27 || i29 == i26) {
                i3 = i28;
                iArr2 = iArr9;
            } else {
                ljg0 ljg0Var3 = ljg0VarArr[i28];
                int[][] iArr10 = iArr6[i28];
                int i30 = i21;
                int i31 = i30;
                jjg0 jjg0Var = null;
                pid.c cVar = null;
                while (i30 < ljg0Var3.a) {
                    jjg0 jjg0VarA2 = ljg0Var3.a(i30);
                    int[] iArr11 = iArr10[i30];
                    pid.c cVar2 = cVar;
                    int i32 = i31;
                    jjg0 jjg0Var2 = jjg0Var;
                    int i33 = i21;
                    while (i33 < jjg0VarA2.a) {
                        int i34 = i28;
                        if (l.g(iArr11[i33], dVar.B)) {
                            i4 = i33;
                            pid.c cVar3 = new pid.c(jjg0VarA2.d[i33], iArr11[i4]);
                            if (cVar2 != null) {
                                iArr3 = iArr9;
                                if (rl8.a.c(cVar3.b, cVar2.b).c(cVar3.a, cVar2.a).e() > 0) {
                                }
                            } else {
                                iArr3 = iArr9;
                            }
                            cVar2 = cVar3;
                            jjg0Var2 = jjg0VarA2;
                            i32 = i4;
                        } else {
                            i4 = i33;
                            iArr3 = iArr9;
                        }
                        i33 = i4 + 1;
                        i28 = i34;
                        iArr9 = iArr3;
                    }
                    i30++;
                    jjg0Var = jjg0Var2;
                    i31 = i32;
                    cVar = cVar2;
                }
                i3 = i28;
                iArr2 = iArr9;
                aVarArr[i3] = jjg0Var == null ? null : new oyg.a(i21, jjg0Var, new int[]{i31});
            }
            i28 = i3 + 1;
            iArr9 = iArr2;
            i21 = 0;
            i27 = 3;
            i = 2;
            i26 = 4;
        }
        Object obj2 = null;
        int i35 = aVar2.a;
        ljg0[] ljg0VarArr2 = aVar2.c;
        HashMap map = new HashMap();
        for (int i36 = 0; i36 < i35; i36++) {
            pid.h(ljg0VarArr2[i36], dVar, map);
        }
        pid.h(aVar2.f, dVar, map);
        for (int i37 = 0; i37 < i35; i37++) {
            qjg0 qjg0Var = (qjg0) map.get(Integer.valueOf(aVar2.b[i37]));
            if (qjg0Var != null) {
                jjg0 jjg0Var3 = qjg0Var.a;
                pcn<Integer> pcnVar = qjg0Var.b;
                if (pcnVar.isEmpty()) {
                    aVar = null;
                } else {
                    int iIndexOf = ljg0VarArr2[i37].b.indexOf(jjg0Var3);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        aVar = new oyg.a(0, jjg0Var3, c0p.t(pcnVar));
                    } else {
                        aVar = null;
                    }
                }
                aVarArr[i37] = aVar;
            }
        }
        int i38 = aVar2.a;
        for (int i39 = 0; i39 < i38; i39++) {
            ljg0 ljg0Var4 = aVar2.c[i39];
            Map<ljg0, pid.e> map2 = dVar.D.get(i39);
            if (map2 != null && map2.containsKey(ljg0Var4)) {
                Map<ljg0, pid.e> map3 = dVar.D.get(i39);
                if ((map3 != null ? map3.get(ljg0Var4) : null) != null) {
                    throw null;
                }
                aVarArr[i39] = null;
            }
        }
        for (int i40 = 0; i40 < i24; i40++) {
            int i41 = aVar2.b[i40];
            if (dVar.E.get(i40) || dVar.u.contains(Integer.valueOf(i41))) {
                aVarArr[i40] = null;
            }
        }
        zf.b bVar2 = pidVar.e;
        fw1 fw1Var2 = pidVar.b;
        ly0.g(fw1Var2);
        bVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i42 = 0;
        while (i42 < aVarArr.length) {
            oyg.a aVar4 = aVarArr[i42];
            if (aVar4 == null || aVar4.b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                pcn.b bVar3 = pcn.b;
                pcn.a aVar5 = new pcn.a();
                aVar5.c(new zf.a(0L, 0L));
                arrayList.add(aVar5);
                obj = obj2;
            }
            i42++;
            obj2 = obj;
        }
        int length4 = aVarArr.length;
        long[][] jArr = new long[length4][];
        for (int i43 = 0; i43 < aVarArr.length; i43++) {
            oyg.a aVar6 = aVarArr[i43];
            if (aVar6 == null) {
                jArr[i43] = new long[0];
            } else {
                int[] iArr12 = aVar6.b;
                jArr[i43] = new long[iArr12.length];
                int i44 = 0;
                while (i44 < iArr12.length) {
                    int[] iArr13 = iArr12;
                    long j = aVar6.a.d[iArr12[i44]].j;
                    long[] jArr2 = jArr[i43];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i44] = j;
                    i44++;
                    iArr12 = iArr13;
                }
                Arrays.sort(jArr[i43]);
            }
        }
        int[] iArr14 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i45 = 0; i45 < length4; i45++) {
            long[] jArr4 = jArr[i45];
            jArr3[i45] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zf.u(arrayList, jArr3);
        zex zexVar = zex.a;
        zexVar.getClass();
        s38.b(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(zexVar);
        hmw hmwVar = new hmw();
        s38.b(2, "expectedValuesPerKey");
        imw imwVar = new imw(treeMap);
        imwVar.f = hmwVar;
        int i46 = 0;
        loop19: while (true) {
            if (i46 >= length4) {
                fw1Var = fw1Var2;
                int[] iArr15 = iArr14;
                Collection aVar7 = imwVar.b;
                if (aVar7 == null) {
                    aVar7 = new e4.a(imwVar);
                    imwVar.b = aVar7;
                }
                pcn pcnVarJ = pcn.j(aVar7);
                for (int i47 = 0; i47 < pcnVarJ.size(); i47++) {
                    int iIntValue = ((Integer) pcnVarJ.get(i47)).intValue();
                    int i48 = iArr15[iIntValue] + 1;
                    iArr15[iIntValue] = i48;
                    jArr3[iIntValue] = jArr[iIntValue][i48];
                    zf.u(arrayList, jArr3);
                }
                for (int i49 = 0; i49 < aVarArr.length; i49++) {
                    if (arrayList.get(i49) != null) {
                        jArr3[i49] = jArr3[i49] * 2;
                    }
                }
                zf.u(arrayList, jArr3);
                pcn.a aVar8 = new pcn.a();
                for (int i50 = 0; i50 < arrayList.size(); i50++) {
                    pcn.a aVar9 = (pcn.a) arrayList.get(i50);
                    aVar8.c(aVar9 == null ? c150.e : aVar9.g());
                }
                c150VarG = aVar8.g();
                break;
            }
            long[] jArr5 = jArr[i46];
            if (jArr5.length <= 1) {
                fw1Var = fw1Var2;
                i2 = length4;
                iArr = iArr14;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                fw1Var = fw1Var2;
                int i51 = 0;
                while (true) {
                    long[] jArr6 = jArr[i46];
                    i2 = length4;
                    double dLog = 0.0d;
                    if (i51 >= jArr6.length) {
                        break;
                    }
                    int[] iArr16 = iArr14;
                    long j2 = jArr6[i51];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i51] = dLog;
                    i51++;
                    length4 = i2;
                    iArr14 = iArr16;
                }
                iArr = iArr14;
                int i52 = length5 - 1;
                double d = dArr[i52] - dArr[0];
                int i53 = 0;
                while (i53 < i52) {
                    double d2 = dArr[i53];
                    int i54 = i53 + 1;
                    Object objValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i54]) * 0.5d) - dArr[0]) / d);
                    Integer numValueOf = Integer.valueOf(i46);
                    double d3 = d;
                    Map<K, Collection<V>> map4 = imwVar.d;
                    Collection collection = (Collection) map4.get(objValueOf);
                    if (collection == null) {
                        Collection<V> collectionD = imwVar.d();
                        if (!collectionD.add(numValueOf)) {
                            jb5.a("New Collection violated the Collection spec");
                            c150VarG = null;
                            break loop19;
                        }
                        imwVar.e++;
                        map4.put((K) objValueOf, collectionD);
                    } else if (collection.add(numValueOf)) {
                        imwVar.e++;
                    }
                    i53 = i54;
                    d = d3;
                }
            }
            i46++;
            length4 = i2;
            iArr14 = iArr;
            fw1Var2 = fw1Var;
        }
        oyg[] oygVarArr = new oyg[aVarArr.length];
        int i55 = 0;
        while (i55 < aVarArr.length) {
            oyg.a aVar10 = aVarArr[i55];
            if (aVar10 != null) {
                int[] iArr17 = aVar10.b;
                if (iArr17.length == 0) {
                    c150VarG = c150VarG;
                } else {
                    int length6 = iArr17.length;
                    jjg0 jjg0Var4 = aVar10.a;
                    oygVarArr[i55] = length6 == 1 ? new xth(jjg0Var4, new int[]{iArr17[0]}) : new zf(jjg0Var4, iArr17, fw1Var, bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e, 0.7f, 0.75f, (pcn) c150VarG.get(i55), bVar2.f);
                }
            } else {
                c150VarG = c150VarG;
            }
            i55++;
            c150VarG = c150VarG;
        }
        d850[] d850VarArr = new d850[i24];
        for (int i56 = 0; i56 < i24; i56++) {
            d850VarArr[i56] = (dVar.E.get(i56) || dVar.u.contains(Integer.valueOf(aVar2.b[i56])) || (aVar2.b[i56] != -2 && oygVarArr[i56] == null)) ? null : d850.c;
        }
        dVar.o.getClass();
        Pair pairCreate = Pair.create(d850VarArr, oygVarArr);
        pjg0[] pjg0VarArr = (pjg0[]) pairCreate.second;
        List[] listArr = new List[pjg0VarArr.length];
        for (int i57 = 0; i57 < pjg0VarArr.length; i57++) {
            pjg0 pjg0Var = pjg0VarArr[i57];
            if (pjg0Var != null) {
                c150VarN = pcn.n(pjg0Var);
            } else {
                pcn.b bVar4 = pcn.b;
                c150VarN = c150.e;
            }
            listArr[i57] = c150VarN;
        }
        pcn.a aVar11 = new pcn.a();
        int i58 = 0;
        while (true) {
            int i59 = aVar2.a;
            ljg0[] ljg0VarArr3 = aVar2.c;
            if (i58 >= i59) {
                break;
            }
            ljg0 ljg0Var5 = ljg0VarArr3[i58];
            List list = listArr[i58];
            int i60 = 0;
            while (i60 < ljg0Var5.a) {
                jjg0 jjg0VarA3 = ljg0Var5.a(i60);
                int i61 = ljg0VarArr3[i58].a(i60).a;
                int[] iArr18 = new int[i61];
                int i62 = 0;
                for (int i63 = 0; i63 < i61; i63++) {
                    if ((aVar2.e[i58][i60][i63] & 7) == 4) {
                        iArr18[i62] = i63;
                        i62++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr18, i62);
                List[] listArr2 = listArr;
                int iMin = 16;
                int i64 = 0;
                boolean z3 = false;
                int i65 = 0;
                String str3 = null;
                while (i64 < iArrCopyOf.length) {
                    String str4 = ljg0VarArr3[i58].a(i60).d[iArrCopyOf[i64]].n;
                    int i66 = i65 + 1;
                    if (i65 == 0) {
                        str3 = str4;
                    } else {
                        z3 = (!Objects.equals(str3, str4)) | z3;
                    }
                    iMin = Math.min(iMin, aVar2.e[i58][i60][i64] & 24);
                    i64++;
                    i65 = i66;
                }
                if (z3) {
                    iMin = Math.min(iMin, aVar2.d[i58]);
                }
                boolean z4 = iMin != 0;
                int i67 = jjg0VarA3.a;
                int[] iArr19 = new int[i67];
                boolean[] zArr = new boolean[i67];
                for (int i68 = 0; i68 < jjg0VarA3.a; i68++) {
                    iArr19[i68] = aVar2.e[i58][i60][i68] & 7;
                    int i69 = 0;
                    while (true) {
                        if (i69 >= list.size()) {
                            z2 = false;
                            break;
                        }
                        pjg0 pjg0Var2 = (pjg0) list.get(i69);
                        if (pjg0Var2.m().equals(jjg0VarA3) && pjg0Var2.k(i68) != -1) {
                            z2 = true;
                            break;
                        }
                        i69++;
                    }
                    zArr[i68] = z2;
                }
                aVar11.c(new bkg0.a(jjg0VarA3, z4, iArr19, zArr));
                i60++;
                listArr = listArr2;
            }
            i58++;
        }
        ljg0 ljg0Var6 = aVar2.f;
        for (int i70 = 0; i70 < ljg0Var6.a; i70++) {
            jjg0 jjg0VarA4 = ljg0Var6.a(i70);
            int[] iArr20 = new int[jjg0VarA4.a];
            Arrays.fill(iArr20, 0);
            aVar11.c(new bkg0.a(jjg0VarA4, false, iArr20, new boolean[jjg0VarA4.a]));
        }
        return new ujg0((d850[]) pairCreate.first, (oyg[]) pairCreate.second, new bkg0(aVar11.g()), aVar2);
    }
}
