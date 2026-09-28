package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wf9 implements ws7 {
    public static final op8 a = new op8(154438893, new rf9(), false);
    public static final op8 b = new op8(-461260329, new sf9(), false);
    public static final op8 c = new op8(-916900149, new tf9(), false);
    public static final op8 d = new op8(-1185835446, new uf9(0), false);
    public static final op8 e = new op8(-847547896, new vf9(), false);

    public static final List c(l0e0 l0e0Var, int i, int i2, ArrayList arrayList, lsw lswVar, int i3, int i4, int i5, int i6, Function1 function1) {
        int i7;
        l0e0 l0e0Var2 = l0e0Var;
        if (l0e0Var2 == null || arrayList.isEmpty() || lswVar.b == 0) {
            return m2g.a;
        }
        lsw lswVarB = l0e0Var2.b(i, i2, lswVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            int index = ((pxr) obj).getIndex();
            int[] iArr = lswVar.a;
            int i9 = lswVar.b;
            for (int i10 = 0; i10 < i9; i10++) {
                if (iArr[i10] == index) {
                    arrayList3.add(obj);
                    break;
                }
            }
        }
        int[] iArr2 = lswVarB.a;
        int i11 = lswVarB.b;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = iArr2[i12];
            int size2 = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    i14 = -1;
                    break;
                }
                Object obj2 = arrayList.get(i15);
                i15++;
                if (((pxr) obj2).getIndex() == i13) {
                    break;
                }
                i14++;
            }
            pxr pxrVar = i14 == -1 ? (pxr) function1.invoke(Integer.valueOf(i13)) : (pxr) arrayList.remove(i14);
            ArrayList arrayList4 = arrayList3;
            int iJ = pxrVar.j();
            if (i14 == -1) {
                i7 = Integer.MIN_VALUE;
            } else {
                long jM = pxrVar.m(0);
                i7 = (int) (pxrVar.h() ? jM & 4294967295L : jM >> 32);
            }
            int iA = l0e0Var2.a(arrayList4, i13, iJ, i7, i3);
            pxrVar.l();
            pxrVar.d(iA, 0, i5, i6);
            arrayList2.add(pxrVar);
            i12++;
            l0e0Var2 = l0e0Var;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }

    @Override // defpackage.ws7
    public String a(int i, String str) {
        str.getClass();
        int i2 = i / 60;
        int i3 = i % 60;
        if (str.equals("HT")) {
            return "45:00 ".concat(str);
        }
        if (str.equals("To extra")) {
            return "90:00 ".concat(str);
        }
        if (str.equals("Extra time halftime")) {
            return "105:00 ".concat(str);
        }
        if (str.equals("H1") && i2 >= 45) {
            return "45:00+ ".concat(str);
        }
        if (str.equals("H2") && i2 >= 90) {
            return "90:00+ ".concat(str);
        }
        if (str.equals("1st extra") && i2 >= 105) {
            return "105:00+ ".concat(str);
        }
        if (str.equals("2nd extra") && i2 >= 120) {
            return "120:00+ ".concat(str);
        }
        return StringsKt.Z(2, String.valueOf(i2)) + ":" + StringsKt.Z(2, String.valueOf(i3)) + " " + str;
    }

    @Override // defpackage.ws7
    public boolean b(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 / 60;
        if (i != 1) {
            return false;
        }
        if (Intrinsics.g(str, "H1") && i3 < 45) {
            return true;
        }
        if (Intrinsics.g(str, "H2") && i3 < 90) {
            return true;
        }
        if (!Intrinsics.g(str, "1st extra") || i3 >= 105) {
            return Intrinsics.g(str, "2nd extra") && i3 < 120;
        }
        return true;
    }
}
