package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p060 {
    public final List<ubh> a;
    public final float b;
    public final float c;
    public final ngs d;

    public static final class a {
    }

    public p060(AbstractList abstractList, float f, float f2) {
        ArrayList arrayListL;
        ArrayList arrayListL2;
        char c;
        char c2;
        char c3;
        e4c e4cVar;
        e4c e4cVar2;
        List<e4c> list;
        abstractList.getClass();
        this.a = abstractList;
        this.b = f;
        this.c = f2;
        ngs ngsVarB = kotlin.collections.a.b();
        char c4 = 3;
        char c5 = 2;
        char c6 = 1;
        if (abstractList.size() <= 0 || ((ubh) abstractList.get(0)).a.size() != 3) {
            arrayListL = null;
            arrayListL2 = null;
        } else {
            Pair<e4c, e4c> pairD = ((ubh) abstractList.get(0)).a.get(1).d(0.5f);
            e4c e4cVar3 = pairD.a;
            e4c e4cVar4 = pairD.b;
            arrayListL2 = b.l(((ubh) abstractList.get(0)).a.get(0), e4cVar3);
            arrayListL = b.l(e4cVar4, ((ubh) abstractList.get(0)).a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            e4cVar = null;
            e4cVar2 = null;
            while (true) {
                if (i == 0 && arrayListL != null) {
                    list = arrayListL;
                } else if (i != this.a.size()) {
                    list = this.a.get(i).a;
                } else {
                    if (arrayListL2 == null) {
                        c = c4;
                        c2 = c5;
                        c3 = c6;
                        break;
                    }
                    list = arrayListL2;
                }
                int size2 = list.size();
                c = c4;
                int i2 = 0;
                while (i2 < size2) {
                    char c7 = c5;
                    e4c e4cVar5 = list.get(i2);
                    char c8 = c6;
                    float[] fArr = e4cVar5.a;
                    if (((Math.abs(fArr[0] - e4cVar5.a()) >= 1.0E-4f || Math.abs(fArr[c8] - e4cVar5.b()) >= 1.0E-4f) ? (char) 0 : c8) == 0) {
                        if (e4cVar2 != null) {
                            ngsVarB.add(e4cVar2);
                        }
                        if (e4cVar == null) {
                            e4cVar = e4cVar5;
                            e4cVar2 = e4cVar;
                        } else {
                            e4cVar2 = e4cVar5;
                        }
                    } else if (e4cVar2 != null) {
                        float[] fArr2 = e4cVar2.a;
                        fArr2[6] = e4cVar5.a();
                        fArr2[7] = e4cVar5.b();
                    }
                    i2++;
                    c5 = c7;
                    c6 = c8;
                }
                c2 = c5;
                c3 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c4 = c;
                c5 = c2;
                c6 = c3;
            }
        } else {
            c = 3;
            c2 = 2;
            c3 = 1;
            e4cVar = null;
            e4cVar2 = null;
        }
        if (e4cVar2 != null && e4cVar != null) {
            float[] fArr3 = e4cVar2.a;
            float f3 = fArr3[0];
            float f4 = fArr3[c3];
            float f5 = fArr3[c2];
            float f6 = fArr3[c];
            float f7 = fArr3[4];
            float f8 = fArr3[5];
            float[] fArr4 = e4cVar.a;
            ngsVarB.add(i4c.a(f3, f4, f5, f6, f7, f8, fArr4[0], fArr4[c3]));
        }
        ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
        this.d = ngsVarA;
        Object obj = ngsVarA.get(ngsVarA.getB() - 1);
        int b = ngsVarA.getB();
        int i3 = 0;
        while (i3 < b) {
            e4c e4cVar6 = (e4c) this.d.get(i3);
            e4c e4cVar7 = (e4c) obj;
            if (Math.abs(e4cVar6.a[0] - e4cVar7.a()) > 1.0E-4f || Math.abs(e4cVar6.a[c3] - e4cVar7.b()) > 1.0E-4f) {
                hb5.a("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = e4cVar6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p060)) {
            return false;
        }
        return Intrinsics.g(this.a, ((p060) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(CollectionsKt.a0(this.d, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(CollectionsKt.a0(this.a, null, null, null, null, 63));
        sb.append(" || Center = (");
        sb.append(this.b);
        sb.append(", ");
        return wi1.a(this.c, ")]", sb);
    }
}
