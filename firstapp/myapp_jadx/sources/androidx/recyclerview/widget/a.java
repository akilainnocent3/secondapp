package androidx.recyclerview.widget;

import defpackage.c220;
import defpackage.hb5;
import defpackage.z9l;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final f0 d;
    public final c220 a = new c220(30);
    public final ArrayList<C0069a> b = new ArrayList<>();
    public final ArrayList<C0069a> c = new ArrayList<>();
    public int f = 0;
    public final z e = new z(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0069a {
        public int a;
        public int b;
        public Object c;
        public int d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0069a)) {
                    return false;
                }
                C0069a c0069a = (C0069a) obj;
                int i = this.a;
                if (i != c0069a.a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != c0069a.b || this.b != c0069a.d) {
                    if (this.d != c0069a.d || this.b != c0069a.b) {
                        return false;
                    }
                    Object obj2 = this.c;
                    Object obj3 = c0069a.c;
                    if (obj2 != null) {
                        if (!obj2.equals(obj3)) {
                            return false;
                        }
                    } else if (obj3 != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(f0 f0Var) {
        this.d = f0Var;
    }

    public final boolean a(int i) {
        ArrayList<C0069a> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0069a c0069a = arrayList.get(i2);
            int i3 = c0069a.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0069a.b;
                    int i5 = c0069a.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0069a.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0069a> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a(arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0069a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0069a c0069a = arrayList.get(i);
            int i2 = c0069a.a;
            f0 f0Var = this.d;
            if (i2 == 1) {
                f0Var.a(c0069a);
                f0Var.d(c0069a.b, c0069a.d);
            } else if (i2 == 2) {
                f0Var.a(c0069a);
                int i3 = c0069a.b;
                int i4 = c0069a.d;
                RecyclerView recyclerView = f0Var.a;
                recyclerView.Y(i3, i4, true);
                recyclerView.A0 = true;
                recyclerView.x0.c += i4;
            } else if (i2 == 4) {
                f0Var.a(c0069a);
                f0Var.c(c0069a.b, c0069a.d, c0069a.c);
            } else if (i2 == 8) {
                f0Var.a(c0069a);
                f0Var.e(c0069a.b, c0069a.d);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(C0069a c0069a) {
        int i;
        c220 c220Var;
        int i2 = c0069a.a;
        if (i2 == 1 || i2 == 8) {
            hb5.a("should not dispatch add or move for pre layout");
            return;
        }
        int iL = l(c0069a.b, i2);
        int i3 = c0069a.b;
        int i4 = c0069a.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                z9l.a(c0069a, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0069a.d;
            c220Var = this.a;
            if (i5 >= i7) {
                break;
            }
            int iL2 = l((i * i5) + c0069a.b, c0069a.a);
            int i8 = c0069a.a;
            if (i8 == 2 ? iL2 != iL : !(i8 == 4 && iL2 == iL + 1)) {
                C0069a c0069aH = h(c0069a.c, i8, iL, i6);
                e(c0069aH, i3);
                c0069aH.c = null;
                c220Var.a(c0069aH);
                if (c0069a.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iL = iL2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c0069a.c;
        c0069a.c = null;
        c220Var.a(c0069a);
        if (i6 > 0) {
            C0069a c0069aH2 = h(obj, c0069a.a, iL, i6);
            e(c0069aH2, i3);
            c0069aH2.c = null;
            c220Var.a(c0069aH2);
        }
    }

    public final void e(C0069a c0069a, int i) {
        f0 f0Var = this.d;
        f0Var.a(c0069a);
        int i2 = c0069a.a;
        if (i2 != 2) {
            if (i2 == 4) {
                f0Var.c(i, c0069a.d, c0069a.c);
                return;
            } else {
                hb5.a("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = c0069a.d;
        RecyclerView recyclerView = f0Var.a;
        recyclerView.Y(i, i3, true);
        recyclerView.A0 = true;
        recyclerView.x0.c += i3;
    }

    public final int f(int i, int i2) {
        ArrayList<C0069a> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            C0069a c0069a = arrayList.get(i2);
            int i3 = c0069a.a;
            int i4 = c0069a.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c0069a.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0069a.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c0069a.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c0069a.d;
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final C0069a h(Object obj, int i, int i2, int i3) {
        C0069a c0069a = (C0069a) this.a.b();
        if (c0069a != null) {
            c0069a.a = i;
            c0069a.b = i2;
            c0069a.d = i3;
            c0069a.c = obj;
            return c0069a;
        }
        C0069a c0069a2 = new C0069a();
        c0069a2.a = i;
        c0069a2.b = i2;
        c0069a2.d = i3;
        c0069a2.c = obj;
        return c0069a2;
    }

    public final void i(C0069a c0069a) {
        this.c.add(c0069a);
        int i = c0069a.a;
        f0 f0Var = this.d;
        if (i == 1) {
            f0Var.d(c0069a.b, c0069a.d);
            return;
        }
        if (i == 2) {
            int i2 = c0069a.b;
            int i3 = c0069a.d;
            RecyclerView recyclerView = f0Var.a;
            recyclerView.Y(i2, i3, false);
            recyclerView.A0 = true;
            return;
        }
        if (i == 4) {
            f0Var.c(c0069a.b, c0069a.d, c0069a.c);
        } else if (i == 8) {
            f0Var.e(c0069a.b, c0069a.d);
        } else {
            z9l.a(c0069a, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:103:0x0185  */
    /* JADX WARN: Code duplicated, block: B:184:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:74:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:80:0x012e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:93:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168  */
    /* JADX WARN: Code duplicated, block: B:99:0x0173  */
    public final void j() {
        ArrayList<C0069a> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0069a c0069aH;
        int i6;
        int i7;
        int i8;
        C0069a c0069aH2;
        boolean z;
        boolean z2;
        Object obj;
        C0069a c0069a;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        while (true) {
            arrayList = this.b;
            i = 1;
            int size = arrayList.size() - 1;
            boolean z3 = false;
            while (true) {
                i2 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).a != 8) {
                    z3 = true;
                } else if (z3) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i17 = size + 1;
            a aVar = this.e.a;
            c220 c220Var = aVar.a;
            C0069a c0069a2 = arrayList.get(size);
            C0069a c0069a3 = arrayList.get(i17);
            int i18 = c0069a3.a;
            if (i18 == 1) {
                int i19 = c0069a2.d;
                int i20 = c0069a3.b;
                int i21 = i19 < i20 ? -1 : 0;
                int i22 = c0069a2.b;
                if (i22 < i20) {
                    i21++;
                }
                if (i20 <= i22) {
                    c0069a2.b = i22 + c0069a3.d;
                }
                int i23 = c0069a3.b;
                if (i23 <= i19) {
                    c0069a2.d = i19 + c0069a3.d;
                }
                c0069a3.b = i23 + i21;
                arrayList.set(size, c0069a3);
                arrayList.set(i17, c0069a2);
            } else if (i18 == 2) {
                int i24 = c0069a2.b;
                int i25 = c0069a2.d;
                int i26 = c0069a3.b;
                if (i24 < i25) {
                    z2 = i26 == i24 && c0069a3.d == i25 - i24;
                    z = false;
                } else if (i26 == i25 + 1 && c0069a3.d == i24 - i25) {
                    z2 = true;
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (i25 < i26) {
                    i26--;
                    c0069a3.b = i26;
                } else {
                    int i27 = c0069a3.d;
                    if (i25 < i26 + i27) {
                        c0069a3.d = i27 - 1;
                        c0069a2.a = 2;
                        c0069a2.d = 1;
                        if (c0069a3.d == 0) {
                            arrayList.remove(i17);
                            c0069a3.c = null;
                            c220Var.a(c0069a3);
                        }
                    }
                }
                int i28 = c0069a2.b;
                if (i28 <= i26) {
                    c0069a3.b = i26 + 1;
                } else {
                    int i29 = i26 + c0069a3.d;
                    if (i28 < i29) {
                        obj = null;
                        C0069a c0069aH3 = aVar.h(null, 2, i28 + 1, i29 - i28);
                        c0069a3.d = c0069a2.b - c0069a3.b;
                        c0069a = c0069aH3;
                    }
                    if (z2) {
                        arrayList.set(size, c0069a3);
                        arrayList.remove(i17);
                        c0069a2.c = obj;
                        c220Var.a(c0069a2);
                    } else {
                        if (z) {
                            if (c0069a != null) {
                                i15 = c0069a2.b;
                                if (i15 > c0069a.b) {
                                    c0069a2.b = i15 - c0069a.d;
                                }
                                i16 = c0069a2.d;
                                if (i16 > c0069a.b) {
                                    c0069a2.d = i16 - c0069a.d;
                                }
                            }
                            i13 = c0069a2.b;
                            if (i13 > c0069a3.b) {
                                c0069a2.b = i13 - c0069a3.d;
                            }
                            i14 = c0069a2.d;
                            if (i14 > c0069a3.b) {
                                c0069a2.d = i14 - c0069a3.d;
                            }
                        } else {
                            if (c0069a != null) {
                                i11 = c0069a2.b;
                                if (i11 >= c0069a.b) {
                                    c0069a2.b = i11 - c0069a.d;
                                }
                                i12 = c0069a2.d;
                                if (i12 >= c0069a.b) {
                                    c0069a2.d = i12 - c0069a.d;
                                }
                            }
                            i9 = c0069a2.b;
                            if (i9 >= c0069a3.b) {
                                c0069a2.b = i9 - c0069a3.d;
                            }
                            i10 = c0069a2.d;
                            if (i10 >= c0069a3.b) {
                                c0069a2.d = i10 - c0069a3.d;
                            }
                        }
                        arrayList.set(size, c0069a3);
                        if (c0069a2.b != c0069a2.d) {
                            arrayList.set(i17, c0069a2);
                        } else {
                            arrayList.remove(i17);
                        }
                        if (c0069a != null) {
                            arrayList.add(size, c0069a);
                        }
                    }
                }
                obj = null;
                c0069a = null;
                if (z2) {
                    arrayList.set(size, c0069a3);
                    arrayList.remove(i17);
                    c0069a2.c = obj;
                    c220Var.a(c0069a2);
                } else {
                    if (z) {
                        if (c0069a != null) {
                            i15 = c0069a2.b;
                            if (i15 > c0069a.b) {
                                c0069a2.b = i15 - c0069a.d;
                            }
                            i16 = c0069a2.d;
                            if (i16 > c0069a.b) {
                                c0069a2.d = i16 - c0069a.d;
                            }
                        }
                        i13 = c0069a2.b;
                        if (i13 > c0069a3.b) {
                            c0069a2.b = i13 - c0069a3.d;
                        }
                        i14 = c0069a2.d;
                        if (i14 > c0069a3.b) {
                            c0069a2.d = i14 - c0069a3.d;
                        }
                    } else {
                        if (c0069a != null) {
                            i11 = c0069a2.b;
                            if (i11 >= c0069a.b) {
                                c0069a2.b = i11 - c0069a.d;
                            }
                            i12 = c0069a2.d;
                            if (i12 >= c0069a.b) {
                                c0069a2.d = i12 - c0069a.d;
                            }
                        }
                        i9 = c0069a2.b;
                        if (i9 >= c0069a3.b) {
                            c0069a2.b = i9 - c0069a3.d;
                        }
                        i10 = c0069a2.d;
                        if (i10 >= c0069a3.b) {
                            c0069a2.d = i10 - c0069a3.d;
                        }
                    }
                    arrayList.set(size, c0069a3);
                    if (c0069a2.b != c0069a2.d) {
                        arrayList.set(i17, c0069a2);
                    } else {
                        arrayList.remove(i17);
                    }
                    if (c0069a != null) {
                        arrayList.add(size, c0069a);
                    }
                }
            } else if (i18 == 4) {
                int i30 = c0069a2.d;
                int i31 = c0069a3.b;
                if (i30 < i31) {
                    c0069a3.b = i31 - 1;
                } else {
                    int i32 = c0069a3.d;
                    if (i30 < i31 + i32) {
                        c0069a3.d = i32 - 1;
                        c0069aH = aVar.h(c0069a3.c, 4, c0069a2.b, 1);
                    }
                    i6 = c0069a2.b;
                    i7 = c0069a3.b;
                    if (i6 <= i7) {
                        c0069a3.b = i7 + 1;
                    } else {
                        i8 = i7 + c0069a3.d;
                        if (i6 < i8) {
                            int i33 = i8 - i6;
                            c0069aH2 = aVar.h(c0069a3.c, 4, i6 + 1, i33);
                            c0069a3.d -= i33;
                        }
                        arrayList.set(i17, c0069a2);
                        if (c0069a3.d > 0) {
                            arrayList.set(size, c0069a3);
                        } else {
                            arrayList.remove(size);
                            c0069a3.c = null;
                            c220Var.a(c0069a3);
                        }
                        if (c0069aH != null) {
                            arrayList.add(size, c0069aH);
                        }
                        if (c0069aH2 != null) {
                            arrayList.add(size, c0069aH2);
                        }
                    }
                    c0069aH2 = null;
                    arrayList.set(i17, c0069a2);
                    if (c0069a3.d > 0) {
                        arrayList.set(size, c0069a3);
                    } else {
                        arrayList.remove(size);
                        c0069a3.c = null;
                        c220Var.a(c0069a3);
                    }
                    if (c0069aH != null) {
                        arrayList.add(size, c0069aH);
                    }
                    if (c0069aH2 != null) {
                        arrayList.add(size, c0069aH2);
                    }
                }
                c0069aH = null;
                i6 = c0069a2.b;
                i7 = c0069a3.b;
                if (i6 <= i7) {
                    c0069a3.b = i7 + 1;
                } else {
                    i8 = i7 + c0069a3.d;
                    if (i6 < i8) {
                        int i34 = i8 - i6;
                        c0069aH2 = aVar.h(c0069a3.c, 4, i6 + 1, i34);
                        c0069a3.d -= i34;
                    }
                    arrayList.set(i17, c0069a2);
                    if (c0069a3.d > 0) {
                        arrayList.set(size, c0069a3);
                    } else {
                        arrayList.remove(size);
                        c0069a3.c = null;
                        c220Var.a(c0069a3);
                    }
                    if (c0069aH != null) {
                        arrayList.add(size, c0069aH);
                    }
                    if (c0069aH2 != null) {
                        arrayList.add(size, c0069aH2);
                    }
                }
                c0069aH2 = null;
                arrayList.set(i17, c0069a2);
                if (c0069a3.d > 0) {
                    arrayList.set(size, c0069a3);
                } else {
                    arrayList.remove(size);
                    c0069a3.c = null;
                    c220Var.a(c0069a3);
                }
                if (c0069aH != null) {
                    arrayList.add(size, c0069aH);
                }
                if (c0069aH2 != null) {
                    arrayList.add(size, c0069aH2);
                }
            }
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            C0069a c0069aH4 = arrayList.get(i35);
            int i36 = c0069aH4.a;
            if (i36 != i) {
                c220 c220Var2 = this.a;
                f0 f0Var = this.d;
                if (i36 != 2) {
                    if (i36 == 4) {
                        int i37 = c0069aH4.b;
                        int i38 = c0069aH4.d + i37;
                        int i39 = -1;
                        int i40 = i37;
                        int i41 = 0;
                        while (i37 < i38) {
                            if (f0Var.b(i37) != null || a(i37)) {
                                if (i39 == 0) {
                                    d(h(c0069aH4.c, 4, i40, i41));
                                    i40 = i37;
                                    i41 = 0;
                                }
                                i39 = i;
                            } else {
                                if (i39 == i) {
                                    i(h(c0069aH4.c, 4, i40, i41));
                                    i40 = i37;
                                    i41 = 0;
                                }
                                i39 = 0;
                            }
                            i41 += i;
                            i37++;
                        }
                        if (i41 != c0069aH4.d) {
                            Object obj2 = c0069aH4.c;
                            c0069aH4.c = null;
                            c220Var2.a(c0069aH4);
                            c0069aH4 = h(obj2, 4, i40, i41);
                        }
                        if (i39 == 0) {
                            d(c0069aH4);
                        } else {
                            i(c0069aH4);
                        }
                    } else if (i36 == i2) {
                        i(c0069aH4);
                    }
                    i3 = i;
                } else {
                    int i42 = c0069aH4.b;
                    int i43 = c0069aH4.d + i42;
                    int i44 = i42;
                    int i45 = -1;
                    int i46 = 0;
                    while (i44 < i43) {
                        if (f0Var.b(i44) != null || a(i44)) {
                            i4 = i;
                            if (i45 == 0) {
                                d(h(null, 2, i42, i46));
                                i5 = i4;
                            } else {
                                i5 = 0;
                            }
                            i45 = i4;
                        } else {
                            i4 = i;
                            if (i45 == i) {
                                i(h(null, 2, i42, i46));
                                i5 = i4;
                            } else {
                                i5 = 0;
                            }
                            i45 = 0;
                        }
                        if (i5 != 0) {
                            i44 -= i46;
                            i43 -= i46;
                            i46 = i4;
                        } else {
                            i46++;
                        }
                        i44++;
                        i = i4;
                    }
                    i3 = i;
                    if (i46 != c0069aH4.d) {
                        c0069aH4.c = null;
                        c220Var2.a(c0069aH4);
                        c0069aH4 = h(null, 2, i42, i46);
                    }
                    if (i45 == 0) {
                        d(c0069aH4);
                    } else {
                        i(c0069aH4);
                    }
                }
            } else {
                i3 = i;
                i(c0069aH4);
            }
            i35++;
            i = i3;
            i2 = 8;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0069a c0069a = (C0069a) arrayList.get(i);
            c0069a.c = null;
            this.a.a(c0069a);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0069a> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0069a c0069a = arrayList.get(size);
            int i5 = c0069a.a;
            int i6 = c0069a.b;
            if (i5 == 8) {
                int i7 = c0069a.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0069a.b = i6 + 1;
                            c0069a.d = i7 + 1;
                        } else if (i2 == 2) {
                            c0069a.b = i6 - 1;
                            c0069a.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c0069a.d = i7 + 1;
                    } else if (i2 == 2) {
                        c0069a.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0069a.b = i6 + 1;
                    } else if (i2 == 2) {
                        c0069a.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c0069a.d;
                } else if (i5 == 2) {
                    i += c0069a.d;
                }
            } else if (i2 == 1) {
                c0069a.b = i6 + 1;
            } else if (i2 == 2) {
                c0069a.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0069a c0069a2 = arrayList.get(size2);
            int i8 = c0069a2.a;
            int i9 = c0069a2.d;
            c220 c220Var = this.a;
            if (i8 == 8) {
                if (i9 == c0069a2.b || i9 < 0) {
                    arrayList.remove(size2);
                    c0069a2.c = null;
                    c220Var.a(c0069a2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                c0069a2.c = null;
                c220Var.a(c0069a2);
            }
        }
        return i;
    }
}
