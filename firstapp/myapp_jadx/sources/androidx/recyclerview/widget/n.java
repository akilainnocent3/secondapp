package androidx.recyclerview.widget;

import defpackage.mae0;
import defpackage.nis;
import defpackage.od2;
import defpackage.whs;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final a a = new a();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static class d {
        public final ArrayList a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
            int i;
            int i2;
            this.a = arrayList;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f = newListSize;
            this.g = z;
            c cVar = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar == null || cVar.a != 0 || cVar.b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(oldListSize, newListSize, 0));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                c cVar2 = (c) obj;
                for (int i4 = 0; i4 < cVar2.c; i4++) {
                    int i5 = cVar2.a + i4;
                    int i6 = cVar2.b + i4;
                    int i7 = bVar.areContentsTheSame(i5, i6) ? 1 : 2;
                    iArr[i5] = (i6 << 4) | i7;
                    iArr2[i6] = (i5 << 4) | i7;
                }
            }
            if (this.g) {
                int size2 = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    c cVar3 = (c) obj2;
                    while (true) {
                        i = cVar3.a;
                        if (i8 < i) {
                            if (iArr[i8] == 0) {
                                int size3 = arrayList.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size3; i11++) {
                                    c cVar4 = (c) arrayList.get(i11);
                                    while (true) {
                                        i2 = cVar4.b;
                                        if (i10 < i2) {
                                            if (iArr2[i10] == 0 && bVar.areItemsTheSame(i8, i10)) {
                                                int i12 = bVar.areContentsTheSame(i8, i10) ? 8 : 4;
                                                iArr[i8] = (i10 << 4) | i12;
                                                iArr2[i10] = i12 | (i8 << 4);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    i10 = cVar4.c + i2;
                                }
                            }
                            i8++;
                        }
                    }
                    i8 = cVar3.c + i;
                }
            }
        }

        public static f c(ArrayDeque arrayDeque, int i, boolean z) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.a == i && fVar.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z) {
                    fVar2.b--;
                } else {
                    fVar2.b++;
                }
            }
            return fVar;
        }

        public final int a(int i) {
            int i2 = this.e;
            if (i < 0 || i >= i2) {
                mae0.a(whs.b(i, i2, "Index out of bounds - passed position = ", ", old list size = "));
                return 0;
            }
            int i3 = this.b[i];
            if ((i3 & 15) == 0) {
                return -1;
            }
            return i3 >> 4;
        }

        public final void b(nis nisVar) {
            int[] iArr;
            b bVar;
            int i;
            int i2;
            ArrayList arrayList;
            d dVar = this;
            od2 od2Var = nisVar instanceof od2 ? (od2) nisVar : new od2(nisVar);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = dVar.a;
            boolean z = true;
            int size = arrayList2.size() - 1;
            int i3 = dVar.e;
            int i4 = dVar.f;
            int i5 = i3;
            while (size >= 0) {
                c cVar = (c) arrayList2.get(size);
                int i6 = cVar.a;
                int i7 = cVar.c;
                int i8 = i6 + i7;
                int i9 = cVar.b;
                int i10 = i9 + i7;
                while (true) {
                    iArr = dVar.b;
                    bVar = dVar.d;
                    boolean z2 = z;
                    i = 0;
                    if (i5 <= i8) {
                        break;
                    }
                    i5--;
                    int i11 = iArr[i5];
                    if ((i11 & 12) != 0) {
                        arrayList = arrayList2;
                        int i12 = i11 >> 4;
                        f fVarC = c(arrayDeque, i12, false);
                        if (fVarC != null) {
                            int i13 = (i3 - fVarC.b) - 1;
                            od2Var.onMoved(i5, i13);
                            if ((i11 & 4) != 0) {
                                od2Var.onChanged(i13, z2 ? 1 : 0, bVar.getChangePayload(i5, i12));
                            }
                        } else {
                            arrayDeque.add(new f(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                        }
                    } else {
                        arrayList = arrayList2;
                        od2Var.onRemoved(i5, z2 ? 1 : 0);
                        i3--;
                    }
                    arrayList2 = arrayList;
                    z = true;
                }
                ArrayList arrayList3 = arrayList2;
                while (i4 > i10) {
                    i4--;
                    int i14 = dVar.c[i4];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        f fVarC2 = c(arrayDeque, i15, true);
                        if (fVarC2 == null) {
                            arrayDeque.add(new f(i4, i3 - i5, false));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            od2Var.onMoved((i3 - fVarC2.b) - 1, i5);
                            if ((i14 & 4) != 0) {
                                od2Var.onChanged(i5, 1, bVar.getChangePayload(i15, i4));
                            }
                        }
                    } else {
                        i2 = i;
                        od2Var.onInserted(i5, 1);
                        i3++;
                    }
                    dVar = this;
                    i = i2;
                }
                int i16 = i9;
                int i17 = i6;
                while (i < i7) {
                    if ((iArr[i17] & 15) == 2) {
                        od2Var.onChanged(i17, 1, bVar.getChangePayload(i17, i16));
                    }
                    i17++;
                    i16++;
                    i++;
                }
                size--;
                dVar = this;
                z = true;
                i4 = i9;
                i5 = i6;
                arrayList2 = arrayList3;
            }
            od2Var.a();
        }
    }

    public static abstract class e<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    public static class f {
        public final int a;
        public int b;
        public final boolean c;

        public f(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static class g {
        public int a;
        public int b;
        public int c;
        public int d;

        public final int a() {
            return this.d - this.c;
        }

        public final int b() {
            return this.b - this.a;
        }
    }

    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }

    public static d a(b bVar, boolean z) {
        int[] iArr;
        int[] iArr2;
        int i;
        h hVar;
        int i2;
        g gVar;
        c cVar;
        int i3;
        h hVar2;
        h hVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g gVar2 = new g();
        int i11 = 0;
        gVar2.a = 0;
        gVar2.b = oldListSize;
        gVar2.c = 0;
        gVar2.d = newListSize;
        arrayList2.add(gVar2);
        int i12 = oldListSize + newListSize;
        int i13 = 1;
        int i14 = (((i12 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i14];
        int i15 = i14 / 2;
        int[] iArr4 = new int[i14];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar3 = (g) arrayList2.remove(arrayList2.size() - i13);
            if (gVar3.b() >= i13 && gVar3.a() >= i13) {
                int iA = ((gVar3.a() + gVar3.b()) + i13) / 2;
                int i16 = i13 + i15;
                iArr3[i16] = gVar3.a;
                iArr4[i16] = gVar3.b;
                int i17 = i11;
                while (true) {
                    if (i17 >= iA) {
                        iArr = iArr4;
                        iArr2 = iArr3;
                        i = i15;
                        hVar = null;
                        break;
                    }
                    int i18 = Math.abs(gVar3.b() - gVar3.a()) % 2 == i13 ? i13 : i11;
                    int iB = gVar3.b() - gVar3.a();
                    int i19 = -i17;
                    int i20 = i19;
                    while (true) {
                        if (i20 > i17) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i3 = i11;
                            i = i15;
                            hVar2 = null;
                            break;
                        }
                        if (i20 == i19 || (i20 != i17 && iArr3[i20 + 1 + i15] > iArr3[(i20 - 1) + i15])) {
                            i8 = iArr3[i20 + 1 + i15];
                            i9 = i8;
                        } else {
                            i8 = iArr3[(i20 - 1) + i15];
                            i9 = i8 + 1;
                        }
                        iArr = iArr4;
                        int i21 = ((i9 - gVar3.a) + gVar3.c) - i20;
                        if (i17 != 0 && i9 == i8) {
                            i21--;
                        }
                        iArr2 = iArr3;
                        int i22 = i9;
                        int i23 = i21;
                        i = i15;
                        while (i22 < gVar3.b && i23 < gVar3.d && bVar.areItemsTheSame(i22, i23)) {
                            i22++;
                            i23++;
                        }
                        iArr2[i20 + i] = i22;
                        if (i18 != 0) {
                            int i24 = iB - i20;
                            i10 = i20;
                            if (i24 >= i19 + 1 && i24 <= i17 - 1 && iArr[i24 + i] <= i22) {
                                hVar2 = new h();
                                hVar2.a = i8;
                                hVar2.b = i21;
                                hVar2.c = i22;
                                hVar2.d = i23;
                                i3 = 0;
                                hVar2.e = false;
                                break;
                            }
                        } else {
                            i10 = i20;
                        }
                        i20 = i10 + 2;
                        i11 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i15 = i;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        break;
                    }
                    int i25 = (gVar3.b() - gVar3.a()) % 2 == 0 ? 1 : i3;
                    int iB2 = gVar3.b() - gVar3.a();
                    int i26 = i19;
                    while (true) {
                        if (i26 > i17) {
                            hVar3 = null;
                            break;
                        }
                        if (i26 == i19 || (i26 != i17 && iArr[i26 + 1 + i] < iArr[(i26 - 1) + i])) {
                            i4 = iArr[i26 + 1 + i];
                            i5 = i4;
                        } else {
                            i4 = iArr[(i26 - 1) + i];
                            i5 = i4 - 1;
                        }
                        int i27 = gVar3.d - ((gVar3.b - i5) - i26);
                        int i28 = (i17 == 0 || i5 != i4) ? i27 : i27 + 1;
                        while (true) {
                            if (i5 > gVar3.a && i27 > gVar3.c) {
                                i6 = i25;
                                if (!bVar.areItemsTheSame(i5 - 1, i27 - 1)) {
                                    break;
                                }
                                i5--;
                                i27--;
                                i25 = i6;
                            } else {
                                i6 = i25;
                                break;
                            }
                        }
                        iArr[i26 + i] = i5;
                        if (i6 != 0 && (i7 = iB2 - i26) >= i19 && i7 <= i17 && iArr2[i7 + i] >= i5) {
                            hVar3 = new h();
                            hVar3.a = i5;
                            hVar3.b = i27;
                            hVar3.c = i4;
                            hVar3.d = i28;
                            hVar3.e = true;
                            break;
                        }
                        i26 += 2;
                        i25 = i6;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i17++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i15 = i;
                    i13 = 1;
                    i11 = 0;
                }
            } else {
                iArr = iArr4;
                iArr2 = iArr3;
                i = i15;
                hVar = null;
                break;
            }
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i29 = hVar.d;
                    int i30 = hVar.b;
                    int i31 = i29 - i30;
                    int i32 = hVar.c;
                    int i33 = hVar.a;
                    int i34 = i32 - i33;
                    if (i31 == i34) {
                        cVar = new c(i33, i30, i34);
                    } else if (hVar.e) {
                        cVar = new c(i33, i30, hVar.a());
                    } else {
                        cVar = i31 > i34 ? new c(i33, i30 + 1, hVar.a()) : new c(i33 + 1, i30, hVar.a());
                    }
                    arrayList.add(cVar);
                }
                if (arrayList3.isEmpty()) {
                    gVar = new g();
                    i2 = 1;
                } else {
                    i2 = 1;
                    gVar = (g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.a = gVar3.a;
                gVar.c = gVar3.c;
                gVar.b = hVar.a;
                gVar.d = hVar.b;
                arrayList2.add(gVar);
                gVar3.b = gVar3.b;
                gVar3.d = gVar3.d;
                gVar3.a = hVar.c;
                gVar3.c = hVar.d;
                arrayList2.add(gVar3);
            } else {
                i2 = 1;
                arrayList3.add(gVar3);
            }
            iArr4 = iArr;
            i13 = i2;
            iArr3 = iArr2;
            i15 = i;
            i11 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, a);
        return new d(bVar, arrayList, iArr3, iArr5, z);
    }
}
