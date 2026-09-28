package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes8.dex */
public final class t2z extends q3<rl5> implements RandomAccess {
    public static final /* synthetic */ int d = 0;
    public final rl5[] b;
    public final int[] c;

    public static final class a {
        public static void a(long j, lb5 lb5Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                hb5.a("Failed requirement.");
                return;
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((rl5) arrayList4.get(i8)).d() < i7) {
                    hb5.a("Failed requirement.");
                    return;
                }
            }
            rl5 rl5Var = (rl5) arrayList.get(i2);
            rl5 rl5Var2 = (rl5) arrayList4.get(i3 - 1);
            if (i7 == rl5Var.d()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                rl5 rl5Var3 = (rl5) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                rl5Var = rl5Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (rl5Var.j(i7) == rl5Var2.j(i7)) {
                int iMin = Math.min(rl5Var.d(), rl5Var2.d());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && rl5Var.j(i11) == rl5Var2.j(i11); i11++) {
                    i10++;
                }
                long j3 = (lb5Var.b / 4) + j + 2 + ((long) i10) + 1;
                lb5Var.g0(-i10);
                lb5Var.g0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    lb5Var.g0(rl5Var.j(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 == ((rl5) arrayList4.get(i4)).d()) {
                        lb5Var.g0(((Number) arrayList5.get(i4)).intValue());
                        return;
                    } else {
                        ib5.a("Check failed.");
                        return;
                    }
                }
                lb5 lb5Var2 = new lb5();
                lb5Var.g0(((int) ((lb5Var2.b / 4) + j3)) * (-1));
                a(j3, lb5Var2, i12, arrayList4, i4, i3, arrayList5);
                lb5Var.R0(lb5Var2);
                return;
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((rl5) arrayList4.get(i14 - 1)).j(i7) != ((rl5) arrayList4.get(i14)).j(i7)) {
                    i13++;
                }
            }
            long j4 = (lb5Var.b / 4) + j + 2 + ((long) (i13 * 2));
            lb5Var.g0(i13);
            lb5Var.g0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iJ = ((rl5) arrayList4.get(i15)).j(i7);
                if (i15 == i4 || iJ != ((rl5) arrayList4.get(i15 - 1)).j(i7)) {
                    lb5Var.g0(iJ & 255);
                }
            }
            lb5 lb5Var3 = new lb5();
            int i16 = i4;
            while (i16 < i3) {
                byte bJ = ((rl5) arrayList4.get(i16)).j(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bJ != ((rl5) arrayList4.get(i18)).j(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((rl5) arrayList4.get(i16)).d()) {
                    lb5Var.g0(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                } else {
                    lb5Var.g0(((int) ((lb5Var3.b / 4) + j4)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                    a(j2, lb5Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j4 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            lb5Var.R0(lb5Var3);
        }

        public static t2z b(rl5... rl5VarArr) {
            if (rl5VarArr.length == 0) {
                return new t2z(new rl5[0], new int[]{0, -1});
            }
            ArrayList arrayListU = ay0.U(rl5VarArr);
            o48.u(arrayListU);
            int size = arrayListU.size();
            ArrayList arrayList = new ArrayList(size);
            for (int iA = 0; iA < size; iA = ndv.a(-1, iA, 1, arrayList)) {
            }
            int length = rl5VarArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                arrayList.set(b.g(arrayListU, rl5VarArr[i]), Integer.valueOf(i2));
                i++;
                i2++;
            }
            if (((rl5) arrayListU.get(0)).d() <= 0) {
                hb5.a("the empty byte string is not a supported option");
                return null;
            }
            int i3 = 0;
            while (i3 < arrayListU.size()) {
                rl5 rl5Var = (rl5) arrayListU.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayListU.size()) {
                    rl5 rl5Var2 = (rl5) arrayListU.get(i5);
                    rl5Var2.getClass();
                    rl5Var.getClass();
                    if (!rl5Var2.n(0, rl5Var, rl5Var.d())) {
                        break;
                    }
                    if (rl5Var2.d() == rl5Var.d()) {
                        r2z.a(rl5Var2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList.get(i5)).intValue() > ((Number) arrayList.get(i3)).intValue()) {
                        arrayListU.remove(i5);
                        ((Number) arrayList.remove(i5)).intValue();
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            lb5 lb5Var = new lb5();
            a(0L, lb5Var, 0, arrayListU, 0, arrayListU.size(), arrayList);
            int i6 = (int) (lb5Var.b / 4);
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = lb5Var.readInt();
            }
            return new t2z((rl5[]) Arrays.copyOf(rl5VarArr, rl5VarArr.length), iArr);
        }
    }

    public t2z(rl5[] rl5VarArr, int[] iArr) {
        this.b = rl5VarArr;
        this.c = iArr;
    }

    @Override // defpackage.q2
    public final int b() {
        return this.b.length;
    }

    @Override // defpackage.q2, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof rl5) {
            return super.contains((rl5) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // defpackage.q3, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof rl5) {
            return super.indexOf((rl5) obj);
        }
        return -1;
    }

    @Override // defpackage.q3, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof rl5) {
            return super.lastIndexOf((rl5) obj);
        }
        return -1;
    }
}
