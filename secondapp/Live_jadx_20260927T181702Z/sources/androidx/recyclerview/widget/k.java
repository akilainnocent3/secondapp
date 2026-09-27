package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<d> f18847a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f18850a - dVar2.f18850a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i10, int i11);

        public abstract boolean areItemsTheSame(int i10, int i11);

        @Nullable
        public Object getChangePayload(int i10, int i11) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f18848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18849b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f18848a = iArr;
            this.f18849b = iArr.length / 2;
        }

        public int[] a() {
            return this.f18848a;
        }

        public void b(int i10) {
            Arrays.fill(this.f18848a, i10);
        }

        public int c(int i10) {
            return this.f18848a[i10 + this.f18849b];
        }

        public void d(int i10, int i11) {
            this.f18848a[i10 + this.f18849b] = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18852c;

        public d(int i10, int i11, int i12) {
            this.f18850a = i10;
            this.f18851b = i11;
            this.f18852c = i12;
        }

        public int a() {
            return this.f18850a + this.f18852c;
        }

        public int b() {
            return this.f18851b + this.f18852c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f18853h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f18854i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f18855j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f18856k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f18857l = 8;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f18858m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f18859n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f18860o = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f18861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f18862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f18863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f18864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f18865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18866f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f18867g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f18861a = list;
            this.f18862b = iArr;
            this.f18863c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f18864d = bVar;
            this.f18865e = bVar.getOldListSize();
            this.f18866f = bVar.getNewListSize();
            this.f18867g = z10;
            a();
            g();
        }

        @Nullable
        public static g i(Collection<g> collection, int i10, boolean z10) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f18868a == i10 && next.f18870c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z10) {
                    next2.f18869b--;
                } else {
                    next2.f18869b++;
                }
            }
            return next;
        }

        public final void a() {
            d dVar = this.f18861a.isEmpty() ? null : this.f18861a.get(0);
            if (dVar == null || dVar.f18850a != 0 || dVar.f18851b != 0) {
                this.f18861a.add(0, new d(0, 0, 0));
            }
            this.f18861a.add(new d(this.f18865e, this.f18866f, 0));
        }

        public int b(@k.e0(from = 0) int i10) {
            if (i10 >= 0 && i10 < this.f18866f) {
                int i11 = this.f18863c[i10];
                if ((i11 & 15) == 0) {
                    return -1;
                }
                return i11 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", new list size = " + this.f18866f);
        }

        public int c(@k.e0(from = 0) int i10) {
            if (i10 >= 0 && i10 < this.f18865e) {
                int i11 = this.f18862b[i10];
                if ((i11 & 15) == 0) {
                    return -1;
                }
                return i11 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i10 + ", old list size = " + this.f18865e);
        }

        public void d(@NonNull v vVar) {
            int i10;
            androidx.recyclerview.widget.f fVar = vVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) vVar : new androidx.recyclerview.widget.f(vVar);
            int i11 = this.f18865e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f18865e;
            int i13 = this.f18866f;
            for (int size = this.f18861a.size() - 1; size >= 0; size--) {
                d dVar = this.f18861a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f18862b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarI = i(arrayDeque, i15, false);
                        if (gVarI != null) {
                            int i16 = (i11 - gVarI.f18869b) - 1;
                            fVar.onMoved(i12, i16);
                            if ((i14 & 4) != 0) {
                                fVar.onChanged(i16, 1, this.f18864d.getChangePayload(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        fVar.onRemoved(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f18863c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g gVarI2 = i(arrayDeque, i18, true);
                        if (gVarI2 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            fVar.onMoved((i11 - gVarI2.f18869b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                fVar.onChanged(i12, 1, this.f18864d.getChangePayload(i18, i13));
                            }
                        }
                    } else {
                        fVar.onInserted(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f18850a;
                int i20 = dVar.f18851b;
                for (i10 = 0; i10 < dVar.f18852c; i10++) {
                    if ((this.f18862b[i19] & 15) == 2) {
                        fVar.onChanged(i19, 1, this.f18864d.getChangePayload(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f18850a;
                i13 = dVar.f18851b;
            }
            fVar.a();
        }

        public void e(@NonNull RecyclerView.h hVar) {
            d(new androidx.recyclerview.widget.b(hVar));
        }

        public final void f(int i10) {
            int size = this.f18861a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f18861a.get(i11);
                while (iB < dVar.f18851b) {
                    if (this.f18863c[iB] == 0 && this.f18864d.areItemsTheSame(i10, iB)) {
                        int i12 = this.f18864d.areContentsTheSame(i10, iB) ? 8 : 4;
                        this.f18862b[i10] = (iB << 4) | i12;
                        this.f18863c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        public final void g() {
            for (d dVar : this.f18861a) {
                for (int i10 = 0; i10 < dVar.f18852c; i10++) {
                    int i11 = dVar.f18850a + i10;
                    int i12 = dVar.f18851b + i10;
                    int i13 = this.f18864d.areContentsTheSame(i11, i12) ? 1 : 2;
                    this.f18862b[i11] = (i12 << 4) | i13;
                    this.f18863c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f18867g) {
                h();
            }
        }

        public final void h() {
            int iA = 0;
            for (d dVar : this.f18861a) {
                while (iA < dVar.f18850a) {
                    if (this.f18862b[iA] == 0) {
                        f(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(@NonNull T t10, @NonNull T t11);

        public abstract boolean areItemsTheSame(@NonNull T t10, @NonNull T t11);

        @Nullable
        public Object getChangePayload(@NonNull T t10, @NonNull T t11) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18870c;

        public g(int i10, int i11, boolean z10) {
            this.f18868a = i10;
            this.f18869b = i11;
            this.f18870c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18874d;

        public h() {
        }

        public int a() {
            return this.f18874d - this.f18873c;
        }

        public int b() {
            return this.f18872b - this.f18871a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f18871a = i10;
            this.f18872b = i11;
            this.f18873c = i12;
            this.f18874d = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18879e;

        public int a() {
            return Math.min(this.f18877c - this.f18875a, this.f18878d - this.f18876b);
        }

        public boolean b() {
            return this.f18878d - this.f18876b != this.f18877c - this.f18875a;
        }

        public boolean c() {
            return this.f18878d - this.f18876b > this.f18877c - this.f18875a;
        }

        @NonNull
        public d d() {
            if (!b()) {
                int i10 = this.f18875a;
                return new d(i10, this.f18876b, this.f18877c - i10);
            }
            if (this.f18879e) {
                return new d(this.f18875a, this.f18876b, a());
            }
            return c() ? new d(this.f18875a, this.f18876b + 1, a()) : new d(this.f18875a + 1, this.f18876b, a());
        }
    }

    @Nullable
    public static i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iC;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int iB = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.c(i14 + 1) < cVar2.c(i14 - 1))) {
                iC = cVar2.c(i14 + 1);
                i11 = iC;
            } else {
                iC = cVar2.c(i14 - 1);
                i11 = iC - 1;
            }
            int i15 = hVar.f18874d - ((hVar.f18872b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iC) ? i15 : i15 + 1;
            while (i11 > hVar.f18871a && i15 > hVar.f18873c && bVar.areItemsTheSame(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.d(i14, i11);
            if (z10 && (i12 = iB - i14) >= i13 && i12 <= i10 && cVar.c(i12) >= i11) {
                i iVar = new i();
                iVar.f18875a = i11;
                iVar.f18876b = i15;
                iVar.f18877c = iC;
                iVar.f18878d = i16;
                iVar.f18879e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    public static e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static e c(@NonNull b bVar, boolean z10) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, oldListSize, 0, newListSize));
        int i10 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(hVar, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f18871a = hVar.f18871a;
                hVar2.f18873c = hVar.f18873c;
                hVar2.f18872b = iVarE.f18875a;
                hVar2.f18874d = iVarE.f18876b;
                arrayList2.add(hVar2);
                hVar.f18872b = hVar.f18872b;
                hVar.f18874d = hVar.f18874d;
                hVar.f18871a = iVarE.f18877c;
                hVar.f18873c = iVarE.f18878d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f18847a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    @Nullable
    public static i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iC;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int iB = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.c(i14 + 1) > cVar.c(i14 - 1))) {
                iC = cVar.c(i14 + 1);
                i11 = iC;
            } else {
                iC = cVar.c(i14 - 1);
                i11 = iC + 1;
            }
            int i15 = (hVar.f18873c + (i11 - hVar.f18871a)) - i14;
            int i16 = (i10 == 0 || i11 != iC) ? i15 : i15 - 1;
            while (i11 < hVar.f18872b && i15 < hVar.f18874d && bVar.areItemsTheSame(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.d(i14, i11);
            if (z10 && (i12 = iB - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.c(i12) <= i11) {
                i iVar = new i();
                iVar.f18875a = iC;
                iVar.f18876b = i16;
                iVar.f18877c = i11;
                iVar.f18878d = i15;
                iVar.f18879e = false;
                return iVar;
            }
        }
        return null;
    }

    @Nullable
    public static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int iB = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.d(1, hVar.f18871a);
            cVar2.d(1, hVar.f18872b);
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarD = d(hVar, bVar, cVar, cVar2, i10);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(hVar, bVar, cVar, cVar2, i10);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
