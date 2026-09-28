package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class giv extends q3<b> {
    public static final /* synthetic */ int e = 0;
    public final sd0 b;
    public final ArrayList c;
    public final List<i430> d;

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static giv a(sd0 sd0Var, p060 p060Var) {
            List listC;
            p060Var.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<ubh> list = p060Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ubh ubhVar = list.get(i);
                int size2 = ubhVar.a.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if ((ubhVar instanceof ubh.a) && i2 == ubhVar.a.size() / 2) {
                        arrayList2.add(new Pair(ubhVar, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(ubhVar.a.get(i2));
                }
            }
            Float fValueOf = Float.valueOf(0.0f);
            int iR = l48.r(arrayList, 9);
            if (iR == 0) {
                listC = kotlin.collections.a.c(fValueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(iR + 1);
                arrayList3.add(fValueOf);
                int size3 = arrayList.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    float fFloatValue = fValueOf.floatValue();
                    float fA = sd0Var.a((e4c) obj);
                    if (fA < 0.0f) {
                        hb5.a("Measured cubic is expected to be greater or equal to zero");
                        return null;
                    }
                    Unit unit = Unit.a;
                    fValueOf = Float.valueOf(fFloatValue + fA);
                    arrayList3.add(fValueOf);
                }
                listC = arrayList3;
            }
            float fFloatValue2 = ((Number) CollectionsKt.b0(listC)).floatValue();
            gsw gswVar = new gsw(listC.size());
            int size4 = listC.size();
            for (int i4 = 0; i4 < size4; i4++) {
                gswVar.a(((Number) listC.get(i4)).floatValue() / fFloatValue2);
            }
            ngs ngsVarB = kotlin.collections.a.b();
            int size5 = arrayList2.size();
            for (int i5 = 0; i5 < size5; i5++) {
                int iIntValue = ((Number) ((Pair) arrayList2.get(i5)).b).intValue();
                ngsVarB.add(new i430((gswVar.b(iIntValue + 1) + gswVar.b(iIntValue)) / 2.0f, (ubh) ((Pair) arrayList2.get(i5)).a));
            }
            return new giv(sd0Var, kotlin.collections.a.a(ngsVarB), arrayList, gswVar);
        }
    }

    public final class b {
        public final e4c a;
        public final float b;
        public float c;
        public float d;
        public final /* synthetic */ giv e;

        public b(giv givVar, e4c e4cVar, float f, float f2) {
            e4cVar.getClass();
            this.e = givVar;
            this.a = e4cVar;
            if (f2 < f) {
                hb5.a("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
                throw null;
            }
            this.b = givVar.b.a(e4cVar);
            this.c = f;
            this.d = f2;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [rd0] */
        public final Pair<b, b> a(float f) {
            float fD = f.d(f, this.c, this.d);
            float f2 = this.d;
            float f3 = this.c;
            float f4 = (fD - f3) / (f2 - f3);
            giv givVar = this.e;
            final sd0 sd0Var = givVar.b;
            final float f5 = f4 * this.b;
            sd0Var.getClass();
            final e4c e4cVar = this.a;
            e4cVar.getClass();
            float[] fArr = e4cVar.a;
            final float fA = csh0.a(fArr[0] - sd0Var.a, fArr[1] - sd0Var.b);
            ?? r5 = new Object() { // from class: rd0
                public final float a(float f6) {
                    e4c e4cVar2 = e4cVar;
                    e4cVar2.getClass();
                    long jC = e4cVar2.c(f6);
                    float fD2 = a020.d(jC);
                    sd0 sd0Var2 = sd0Var;
                    return Math.abs(csh0.d(csh0.a(fD2 - sd0Var2.a, a020.e(jC) - sd0Var2.b) - fA, csh0.c) - f5);
                }
            };
            float f6 = 0.0f;
            float f7 = 1.0f;
            while (f7 - f6 > 1.0E-5f) {
                float f8 = ((2.0f * f6) + f7) / 3.0f;
                float f9 = ((2.0f * f7) + f6) / 3.0f;
                if (r5.a(f8) < r5.a(f9)) {
                    f7 = f9;
                } else {
                    f6 = f8;
                }
            }
            float f10 = (f6 + f7) / 2.0f;
            if (0.0f > f10 || f10 > 1.0f) {
                hb5.a("Cubic cut point is expected to be between 0 and 1");
                return null;
            }
            Pair<e4c, e4c> pairD = e4cVar.d(f10);
            return new Pair<>(new b(givVar, pairD.a, this.c, fD), new b(givVar, pairD.b, fD, this.d));
        }

        public final String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
        }
    }

    public giv(sd0 sd0Var, ngs ngsVar, ArrayList arrayList, gsw gswVar) {
        if (gswVar.b != arrayList.size() + 1) {
            hb5.a("Outline progress size is expected to be the cubics size + 1");
            throw null;
        }
        int i = gswVar.b;
        if (i == 0) {
            ibh0.a("FloatList is empty.");
            throw null;
        }
        float[] fArr = gswVar.a;
        int i2 = 0;
        float fB = 0.0f;
        if (fArr[0] != 0.0f) {
            hb5.a("First outline progress value is expected to be zero");
            throw null;
        }
        if (i == 0) {
            ibh0.a("FloatList is empty.");
            throw null;
        }
        if (fArr[i - 1] != 1.0f) {
            hb5.a("Last outline progress value is expected to be one");
            throw null;
        }
        this.b = sd0Var;
        this.d = ngsVar;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i2 < size) {
            int i3 = i2 + 1;
            if (gswVar.b(i3) - gswVar.b(i2) > 1.0E-4f) {
                arrayList2.add(new b(this, (e4c) arrayList.get(i2), fB, gswVar.b(i3)));
                fB = gswVar.b(i3);
            }
            i2 = i3;
        }
        b bVar = (b) rh6.a(1, arrayList2);
        float f = bVar.c;
        if (1.0f < f) {
            hb5.a("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            throw null;
        }
        bVar.c = f;
        bVar.d = 1.0f;
        this.c = arrayList2;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return super.contains((b) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (b) this.c.get(i);
    }

    @Override // defpackage.q3, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof b) {
            return super.indexOf((b) obj);
        }
        return -1;
    }

    @Override // defpackage.q3, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof b) {
            return super.lastIndexOf((b) obj);
        }
        return -1;
    }
}
