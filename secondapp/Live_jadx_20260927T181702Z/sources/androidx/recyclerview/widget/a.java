package androidx.recyclerview.widget;

import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements y.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18634i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18635j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f18636k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f18637l = "AHT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e2.w.a<b> f18638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f18639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f18640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0147a f18641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f18642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f18644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18645h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0147a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        RecyclerView.f0 d(int i10);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f18646e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f18647f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f18648g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f18649h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f18650i = 30;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f18653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18654d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f18651a = i10;
            this.f18652b = i11;
            this.f18654d = i12;
            this.f18653c = obj;
        }

        public String a() {
            int i10 = this.f18651a;
            if (i10 == 1) {
                return "add";
            }
            if (i10 == 2) {
                return "rm";
            }
            if (i10 != 4) {
                return i10 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f18651a;
            if (i10 != bVar.f18651a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f18654d - this.f18652b) == 1 && this.f18654d == bVar.f18652b && this.f18652b == bVar.f18654d) {
                return true;
            }
            if (this.f18654d != bVar.f18654d || this.f18652b != bVar.f18652b) {
                return false;
            }
            Object obj2 = this.f18653c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f18653c)) {
                    return false;
                }
            } else if (bVar.f18653c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f18651a * 31) + this.f18652b) * 31) + this.f18654d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + C4235d4.j.f61460d + a() + ",s:" + this.f18652b + "c:" + this.f18654d + ",p:" + this.f18653c + C4235d4.j.f61462e;
        }
    }

    public a(InterfaceC0147a interfaceC0147a) {
        this(interfaceC0147a, false);
    }

    public final int A(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f18640c.size() - 1; size >= 0; size--) {
            b bVar = this.f18640c.get(size);
            int i14 = bVar.f18651a;
            if (i14 == 8) {
                int i15 = bVar.f18652b;
                int i16 = bVar.f18654d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f18652b = i15 + 1;
                            bVar.f18654d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f18652b = i15 - 1;
                            bVar.f18654d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f18654d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f18654d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f18652b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f18652b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f18652b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f18654d;
                    } else if (i14 == 2) {
                        i10 += bVar.f18654d;
                    }
                } else if (i11 == 1) {
                    bVar.f18652b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f18652b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f18640c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f18640c.get(size2);
            if (bVar2.f18651a == 8) {
                int i18 = bVar2.f18654d;
                if (i18 == bVar2.f18652b || i18 < 0) {
                    this.f18640c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f18654d <= 0) {
                this.f18640c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.y.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVarA = this.f18638a.a();
        if (bVarA == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarA.f18651a = i10;
        bVarA.f18652b = i11;
        bVarA.f18654d = i12;
        bVarA.f18653c = obj;
        return bVarA;
    }

    @Override // androidx.recyclerview.widget.y.a
    public void b(b bVar) {
        if (this.f18643f) {
            return;
        }
        bVar.f18653c = null;
        this.f18638a.b(bVar);
    }

    public a c(b... bVarArr) {
        Collections.addAll(this.f18639b, bVarArr);
        return this;
    }

    public final void d(b bVar) {
        w(bVar);
    }

    public final void e(b bVar) {
        w(bVar);
    }

    public int f(int i10) {
        int size = this.f18639b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f18639b.get(i11);
            int i12 = bVar.f18651a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f18652b;
                    if (i13 <= i10) {
                        int i14 = bVar.f18654d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f18652b;
                    if (i15 == i10) {
                        i10 = bVar.f18654d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f18654d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f18652b <= i10) {
                i10 += bVar.f18654d;
            }
        }
        return i10;
    }

    public final void g(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f18652b;
        int i11 = bVar.f18654d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f18641d.d(i12) != null || i(i12)) {
                if (b11 == 0) {
                    l(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    w(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f18654d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final void h(b bVar) {
        int i10 = bVar.f18652b;
        int i11 = bVar.f18654d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f18641d.d(i10) != null || i(i10)) {
                if (b10 == 0) {
                    l(a(4, i13, i12, bVar.f18653c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    w(a(4, i13, i12, bVar.f18653c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f18654d) {
            Object obj = bVar.f18653c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final boolean i(int i10) {
        int size = this.f18640c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f18640c.get(i11);
            int i12 = bVar.f18651a;
            if (i12 == 8) {
                if (o(bVar.f18654d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f18652b;
                int i14 = bVar.f18654d + i13;
                while (i13 < i14) {
                    if (o(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void j() {
        int size = this.f18640c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18641d.c(this.f18640c.get(i10));
        }
        y(this.f18640c);
        this.f18645h = 0;
    }

    public void k() {
        j();
        int size = this.f18639b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f18639b.get(i10);
            int i11 = bVar.f18651a;
            if (i11 == 1) {
                this.f18641d.c(bVar);
                this.f18641d.e(bVar.f18652b, bVar.f18654d);
            } else if (i11 == 2) {
                this.f18641d.c(bVar);
                this.f18641d.f(bVar.f18652b, bVar.f18654d);
            } else if (i11 == 4) {
                this.f18641d.c(bVar);
                this.f18641d.h(bVar.f18652b, bVar.f18654d, bVar.f18653c);
            } else if (i11 == 8) {
                this.f18641d.c(bVar);
                this.f18641d.a(bVar.f18652b, bVar.f18654d);
            }
            Runnable runnable = this.f18642e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f18639b);
        this.f18645h = 0;
    }

    public final void l(b bVar) {
        int i10;
        int i11 = bVar.f18651a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iA = A(bVar.f18652b, i11);
        int i12 = bVar.f18652b;
        int i13 = bVar.f18651a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f18654d; i15++) {
            int iA2 = A(bVar.f18652b + (i10 * i15), bVar.f18651a);
            int i16 = bVar.f18651a;
            if (i16 == 2 ? iA2 != iA : !(i16 == 4 && iA2 == iA + 1)) {
                b bVarA = a(i16, iA, i14, bVar.f18653c);
                m(bVarA, i12);
                b(bVarA);
                if (bVar.f18651a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iA = iA2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f18653c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f18651a, iA, i14, obj);
            m(bVarA2, i12);
            b(bVarA2);
        }
    }

    public void m(b bVar, int i10) {
        this.f18641d.b(bVar);
        int i11 = bVar.f18651a;
        if (i11 == 2) {
            this.f18641d.f(i10, bVar.f18654d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f18641d.h(i10, bVar.f18654d, bVar.f18653c);
        }
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = this.f18640c.size();
        while (i11 < size) {
            b bVar = this.f18640c.get(i11);
            int i12 = bVar.f18651a;
            if (i12 == 8) {
                int i13 = bVar.f18652b;
                if (i13 == i10) {
                    i10 = bVar.f18654d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f18654d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f18652b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f18654d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f18654d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean p(int i10) {
        return (i10 & this.f18645h) != 0;
    }

    public boolean q() {
        return this.f18639b.size() > 0;
    }

    public boolean r() {
        return (this.f18640c.isEmpty() || this.f18639b.isEmpty()) ? false : true;
    }

    public boolean s(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f18639b.add(a(4, i10, i11, obj));
        this.f18645h |= 4;
        return this.f18639b.size() == 1;
    }

    public boolean t(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f18639b.add(a(1, i10, i11, null));
        this.f18645h |= 1;
        return this.f18639b.size() == 1;
    }

    public boolean u(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f18639b.add(a(8, i10, i11, null));
        this.f18645h |= 8;
        return this.f18639b.size() == 1;
    }

    public boolean v(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f18639b.add(a(2, i10, i11, null));
        this.f18645h |= 2;
        return this.f18639b.size() == 1;
    }

    public final void w(b bVar) {
        this.f18640c.add(bVar);
        int i10 = bVar.f18651a;
        if (i10 == 1) {
            this.f18641d.e(bVar.f18652b, bVar.f18654d);
            return;
        }
        if (i10 == 2) {
            this.f18641d.g(bVar.f18652b, bVar.f18654d);
            return;
        }
        if (i10 == 4) {
            this.f18641d.h(bVar.f18652b, bVar.f18654d, bVar.f18653c);
        } else {
            if (i10 == 8) {
                this.f18641d.a(bVar.f18652b, bVar.f18654d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void x() {
        this.f18644g.b(this.f18639b);
        int size = this.f18639b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f18639b.get(i10);
            int i11 = bVar.f18651a;
            if (i11 == 1) {
                d(bVar);
            } else if (i11 == 2) {
                g(bVar);
            } else if (i11 == 4) {
                h(bVar);
            } else if (i11 == 8) {
                e(bVar);
            }
            Runnable runnable = this.f18642e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f18639b.clear();
    }

    public void y(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    public void z() {
        y(this.f18639b);
        y(this.f18640c);
        this.f18645h = 0;
    }

    public a(InterfaceC0147a interfaceC0147a, boolean z10) {
        this.f18638a = new e2.w.b(30);
        this.f18639b = new ArrayList<>();
        this.f18640c = new ArrayList<>();
        this.f18645h = 0;
        this.f18641d = interfaceC0147a;
        this.f18643f = z10;
        this.f18644g = new y(this);
    }
}
