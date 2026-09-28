package defpackage;

import com.google.protobuf.Reader;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l2i implements z8w, e2i {
    public final kw0.e a;
    public final kw0.l b;
    public final float c;
    public final c3c.f d;
    public final float e;
    public final int f;
    public final int g;
    public final c2i h;

    public l2i(kw0.e eVar, kw0.l lVar, float f, c3c.f fVar, float f2, int i, int i2, c2i c2iVar) {
        this.a = eVar;
        this.b = lVar;
        this.c = f;
        this.d = fVar;
        this.e = f2;
        this.f = i;
        this.g = i2;
        this.h = c2iVar;
    }

    @Override // defpackage.z8w
    public final int a(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        List list2 = (List) CollectionsKt.V(1, list);
        mzo mzoVar = list2 != null ? (mzo) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.V(2, list);
        this.h.a(mzoVar, list3 != null ? (mzo) CollectionsKt.firstOrNull(list3) : null, oxa.b(0, 0, i, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = m2g.a;
        }
        int iY0 = nzoVar.y0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iB0 = ((mzo) list4.get(i2)).b0(i) + iY0;
            int i5 = i2 + 1;
            if (i5 - i3 == this.f || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iB0) - iY0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iB0;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0153  */
    /* JADX WARN: Code duplicated, block: B:52:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:59:0x018a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x01eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [T, androidx.compose.ui.layout.y] */
    /* JADX WARN: Type inference failed for: r2v52, types: [T, androidx.compose.ui.layout.y] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:71:0x022b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // defpackage.z8w
    public final defpackage.biv c(androidx.compose.ui.layout.t r66, java.util.List<? extends java.util.List<? extends defpackage.vhv>> r67, long r68) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2i.c(androidx.compose.ui.layout.t, java.util.List, long):biv");
    }

    @Override // defpackage.z8w
    public final int e(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        c2i c2iVar;
        List list2;
        long jA;
        int i5 = i;
        List list3 = (List) CollectionsKt.V(1, list);
        mzo mzoVar = list3 != null ? (mzo) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.V(2, list);
        int i6 = 0;
        this.h.a(mzoVar, list4 != null ? (mzo) CollectionsKt.firstOrNull(list4) : null, oxa.b(0, 0, i5, 7));
        List list5 = (List) CollectionsKt.firstOrNull(list);
        if (list5 == null) {
            list5 = m2g.a;
        }
        int iY0 = nzoVar.y0(this.c);
        int iY1 = nzoVar.y0(this.e);
        long jA2 = yvo.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i7 = 0; i7 < size3; i7++) {
            mzo mzoVar2 = (mzo) list5.get(i7);
            int iA0 = mzoVar2.a0(i5);
            iArr2[i7] = iA0;
            iArr3[i7] = mzoVar2.R(iA0);
        }
        int i8 = this.g;
        int[] iArr4 = iArr3;
        int i9 = this.f;
        int i10 = (i8 == Integer.MAX_VALUE || i9 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i9 * i8;
        int size4 = list5.size();
        c2i c2iVar2 = this.h;
        if (i10 < size4) {
            c2iVar2.getClass();
            z1i.a aVar = z1i.a.a;
            z1i.a aVar2 = z1i.a.a;
            z1i.a aVar3 = z1i.a.a;
        }
        if (i10 >= list5.size()) {
            c2iVar2.getClass();
            if (i8 >= 0) {
                z1i.a aVar4 = z1i.a.a;
                z1i.a aVar5 = z1i.a.a;
            }
        }
        int iMin = Math.min(i10, list5.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr2[i12];
        }
        int size5 = ((list5.size() - 1) * iY0) + i11;
        if (size2 != 0) {
            int i13 = iArr4[0];
            int i14 = size2 - 1;
            if (1 <= i14) {
                int i15 = 1;
                i2 = 1;
                int i16 = i13;
                while (true) {
                    int i17 = iArr4[i15];
                    if (i16 < i17) {
                        i16 = i17;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
                i13 = i16;
            } else {
                i2 = 1;
            }
            if (size != 0) {
                int i18 = iArr2[i6];
                int i19 = size - 1;
                if (i2 <= i19) {
                    int i20 = 1;
                    while (true) {
                        int i21 = iArr2[i20];
                        if (i18 < i21) {
                            i18 = i21;
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                }
                int i22 = size5;
                int i23 = i13;
                while (i18 <= i22 && i23 != i5) {
                    size5 = (i18 + i22) / 2;
                    int i24 = y1i.a;
                    if (list5.isEmpty()) {
                        list2 = list5;
                        i3 = i18;
                        iArr2 = iArr2;
                        i4 = i8;
                        jA = jA2;
                        iArr = iArr4;
                        c2iVar = c2iVar2;
                    } else {
                        int i25 = i6;
                        i3 = i18;
                        i4 = i8;
                        iArr = iArr4;
                        c2iVar = c2iVar2;
                        s1i s1iVar = new s1i(i9, c2iVar, oxa.a(i25, size5, i25, Reader.READ_DONE), i4, iY0, iY1);
                        mzo mzoVar3 = (mzo) CollectionsKt.V(i25, list5);
                        int i26 = mzoVar3 != null ? iArr[i25] : i25;
                        int i27 = mzoVar3 != null ? iArr2[i25] : i25;
                        int[] iArr5 = iArr2;
                        int i28 = 0;
                        int i29 = 0;
                        if (s1iVar.b(list5.size() > 1, 0, yvo.a(size5, Reader.READ_DONE), mzoVar3 == null ? null : new yvo(yvo.a(i27, i26)), 0, 0, 0, false, false).b) {
                            c2iVar.getClass();
                            z1i.a aVar6 = z1i.a.a;
                            iArr2 = iArr5;
                            list2 = list5;
                            jA = jA2;
                        } else {
                            int size6 = list5.size();
                            iArr2 = iArr5;
                            int i30 = size5;
                            int i31 = i27;
                            int i32 = 0;
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = i26;
                            int i36 = 0;
                            while (true) {
                                if (i34 >= size6) {
                                    list2 = list5;
                                    break;
                                }
                                int i37 = i30 - i31;
                                int i38 = size6;
                                int i39 = i34 + 1;
                                int iMax = Math.max(i32, i35);
                                mzo mzoVar4 = (mzo) CollectionsKt.V(i39, list5);
                                i35 = mzoVar4 != null ? iArr[i39] : 0;
                                int i40 = mzoVar4 != null ? iArr2[i39] + iY0 : 0;
                                list2 = list5;
                                int i41 = i39 - i33;
                                s1i.b bVarB = s1iVar.b(i34 + 2 < list2.size(), i41, yvo.a(i37, Reader.READ_DONE), mzoVar4 == 0 ? null : new yvo(yvo.a(i40, i35)), i28, i29, iMax, false, false);
                                if (bVarB.a) {
                                    int i42 = iMax + iY1 + i29;
                                    int i43 = i28;
                                    s1iVar.a(bVarB, mzoVar4 != null, i43, i42, i37, i41);
                                    int i44 = i40 - iY0;
                                    i28 = i43 + 1;
                                    if (bVarB.b) {
                                        i36 = i39;
                                        i29 = i42;
                                        break;
                                    }
                                    i31 = i44;
                                    i33 = i39;
                                    i30 = size5;
                                    i29 = i42;
                                    i32 = 0;
                                } else {
                                    i31 = i40;
                                    i30 = i37;
                                    i32 = iMax;
                                }
                                i34 = i39;
                                i36 = i34;
                                size6 = i38;
                                list5 = list2;
                            }
                            jA = yvo.a(i29 - iY1, i36);
                        }
                    }
                    int i45 = (int) (jA >> 32);
                    int i46 = (int) (jA & 4294967295L);
                    i5 = i;
                    if (i45 > i5 || i46 < iMin) {
                        i18 = size5 + 1;
                        if (i18 > i22) {
                            return i18;
                        }
                    } else {
                        if (i45 >= i5) {
                            return size5;
                        }
                        i22 = size5 - 1;
                        i18 = i3;
                    }
                    list5 = list2;
                    i6 = 0;
                    i23 = i45;
                    c2iVar2 = c2iVar;
                    iArr4 = iArr;
                    i8 = i4;
                }
                return size5;
            }
            lrh0.a();
        } else {
            lrh0.a();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2i)) {
            return false;
        }
        l2i l2iVar = (l2i) obj;
        return this.a.equals(l2iVar.a) && this.b.equals(l2iVar.b) && g7f.b(this.c, l2iVar.c) && this.d.equals(l2iVar.d) && g7f.b(this.e, l2iVar.e) && this.f == l2iVar.f && this.g == l2iVar.g && Intrinsics.g(this.h, l2iVar.h);
    }

    @Override // defpackage.z8w
    public final int g(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        List list2 = (List) CollectionsKt.V(1, list);
        mzo mzoVar = list2 != null ? (mzo) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.V(2, list);
        this.h.a(mzoVar, list3 != null ? (mzo) CollectionsKt.firstOrNull(list3) : null, oxa.b(0, i, 0, 13));
        List<? extends mzo> list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = m2g.a;
        }
        return o(list4, i, nzoVar.y0(this.c), nzoVar.y0(this.e), this.f, this.g, this.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + gpp.a(this.g, gpp.a(this.f, tvh.a(this.e, (this.d.b.hashCode() + tvh.a(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.z8w
    public final int i(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        List list2 = (List) CollectionsKt.V(1, list);
        mzo mzoVar = list2 != null ? (mzo) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.V(2, list);
        this.h.a(mzoVar, list3 != null ? (mzo) CollectionsKt.firstOrNull(list3) : null, oxa.b(0, i, 0, 13));
        List<? extends mzo> list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = m2g.a;
        }
        return o(list4, i, nzoVar.y0(this.c), nzoVar.y0(this.e), this.f, this.g, this.h);
    }

    @Override // defpackage.e2i
    public final c3c k() {
        return this.d;
    }

    @Override // defpackage.e2i
    public final boolean l() {
        return true;
    }

    @Override // defpackage.e2i
    public final kw0.e m() {
        return this.a;
    }

    @Override // defpackage.e2i
    public final kw0.l n() {
        return this.b;
    }

    public final int o(List<? extends mzo> list, int i, int i2, int i3, int i4, int i5, c2i c2iVar) {
        long jA = yvo.a(0, 0);
        if (!list.isEmpty()) {
            int i6 = Reader.READ_DONE;
            s1i s1iVar = new s1i(i4, c2iVar, oxa.a(0, i, 0, Reader.READ_DONE), i5, i2, i3);
            mzo mzoVar = (mzo) CollectionsKt.V(0, list);
            int iR = mzoVar != null ? mzoVar.R(i) : 0;
            int iA0 = mzoVar != null ? mzoVar.a0(iR) : 0;
            int i7 = 0;
            if (s1iVar.b(list.size() > 1, 0, yvo.a(i, Reader.READ_DONE), mzoVar == null ? null : new yvo(yvo.a(iA0, iR)), 0, 0, 0, false, false).b) {
                c2iVar.getClass();
                z1i.a aVar = z1i.a.a;
                jA = jA;
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < size) {
                    int i14 = i8 - iA0;
                    int i15 = i11 + 1;
                    int iMax = Math.max(i10, iR);
                    mzo mzoVar2 = (mzo) CollectionsKt.V(i15, list);
                    iR = mzoVar2 != null ? mzoVar2.R(i) : 0;
                    int iA1 = mzoVar2 != null ? mzoVar2.a0(iR) + i2 : 0;
                    boolean z = i11 + 2 < list.size();
                    int i16 = i15 - i13;
                    int i17 = i9;
                    long jA2 = yvo.a(i14, i6);
                    yvo yvoVar = mzoVar2 == null ? null : new yvo(yvo.a(iA1, iR));
                    int i18 = iA1;
                    boolean z2 = z;
                    int i19 = i18;
                    s1i.b bVarB = s1iVar.b(z2, i16, jA2, yvoVar, i17, i7, iMax, false, false);
                    if (bVarB.a) {
                        int i20 = iMax + i3 + i7;
                        s1iVar.a(bVarB, mzoVar2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i9 = i17 + 1;
                        if (bVarB.b) {
                            i12 = i15;
                            i7 = i20;
                            break;
                        }
                        i8 = i;
                        i19 = i21;
                        i13 = i15;
                        i7 = i20;
                        i10 = 0;
                    } else {
                        i8 = i14;
                        i9 = i17;
                        i10 = iMax;
                    }
                    i12 = i15;
                    i6 = Reader.READ_DONE;
                    iA0 = i19;
                    i11 = i12;
                }
                jA = yvo.a(i7 - i3, i12);
            }
        }
        return (int) (jA >> 32);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.a);
        sb.append(", verticalArrangement=");
        sb.append(this.b);
        sb.append(", mainAxisSpacing=");
        k35.a(this.c, ", crossAxisAlignment=", sb);
        sb.append(this.d);
        sb.append(", crossAxisArrangementSpacing=");
        k35.a(this.e, ", maxItemsInMainAxis=", sb);
        sb.append(this.f);
        sb.append(", maxLines=");
        sb.append(this.g);
        sb.append(", overflow=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
