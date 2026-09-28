package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class onz<Key, Value> {
    public final iqz a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final tb5 i;
    public final tb5 j;
    public final LinkedHashMap k;
    public final tsw l;

    public static final class a<Key, Value> {
        public final tuw a = uuw.a();
        public final onz<Key, Value> b;

        public a(iqz iqzVar) {
            this.b = new onz<>(iqzVar);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kxs.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public onz(iqz iqzVar) {
        this.a = iqzVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.i = d77.b(-1, 6, null);
        this.j = d77.b(-1, 6, null);
        this.k = new LinkedHashMap();
        tsw tswVar = new tsw();
        tswVar.c(kxs.a, hxs.b.b);
        this.l = tswVar;
    }

    public final xqz<Key, Value> a(qai0.a aVar) {
        Integer numValueOf;
        iqz iqzVar = this.a;
        int i = iqzVar.a;
        ArrayList arrayList = this.c;
        List listA0 = CollectionsKt.A0(arrayList);
        if (aVar != null) {
            int i2 = aVar.e;
            int iD = d();
            int i3 = -this.d;
            int size = (arrayList.size() - 1) - this.d;
            int i4 = i3;
            while (i4 < i2) {
                iD += i4 > size ? i : ((wqz.b.c) arrayList.get(this.d + i4)).a.size();
                i4++;
            }
            int i5 = iD + aVar.f;
            if (i2 < i3) {
                i5 -= i;
            }
            numValueOf = Integer.valueOf(i5);
        } else {
            numValueOf = null;
        }
        return new xqz<>(listA0, numValueOf, iqzVar, d());
    }

    public final void b(xmz.a<Value> aVar) {
        int iC = aVar.c();
        int i = aVar.d;
        kxs kxsVar = aVar.a;
        ArrayList arrayList = this.c;
        if (iC > arrayList.size()) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + aVar.c()).toString());
        }
        this.k.remove(kxsVar);
        this.l.c(kxsVar, hxs.c.c);
        int iOrdinal = kxsVar.ordinal();
        ArrayList arrayList2 = this.b;
        if (iOrdinal == 1) {
            int iC2 = aVar.c();
            for (int i2 = 0; i2 < iC2; i2++) {
                arrayList2.remove(0);
            }
            this.d -= aVar.c();
            if (i == Integer.MIN_VALUE) {
                i = 0;
            }
            this.e = i;
            int i3 = this.g + 1;
            this.g = i3;
            this.i.c(Integer.valueOf(i3));
            return;
        }
        if (iOrdinal != 2) {
            z9l.a(kxsVar, "cannot drop ");
            return;
        }
        int iC3 = aVar.c();
        for (int i4 = 0; i4 < iC3; i4++) {
            arrayList2.remove(arrayList.size() - 1);
        }
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f = i;
        int i5 = this.h + 1;
        this.h = i5;
        this.j.c(Integer.valueOf(i5));
    }

    public final xmz.a<Value> c(kxs kxsVar, qai0 qai0Var) {
        kxsVar.getClass();
        qai0Var.getClass();
        iqz iqzVar = this.a;
        int i = iqzVar.e;
        if (i != Integer.MAX_VALUE) {
            ArrayList arrayList = this.c;
            if (arrayList.size() > 2) {
                int size = arrayList.size();
                int iD = 0;
                int size2 = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    size2 += ((wqz.b.c) obj).a.size();
                }
                if (size2 > i) {
                    if (kxsVar == kxs.a) {
                        r2z.a(kxsVar, "Drop LoadType must be PREPEND or APPEND, but got ");
                        return null;
                    }
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < arrayList.size()) {
                        int size3 = arrayList.size();
                        int size4 = 0;
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            size4 += ((wqz.b.c) obj2).a.size();
                        }
                        if (size4 - i4 <= i) {
                            break;
                        }
                        int[] iArr = b.a;
                        int size5 = iArr[kxsVar.ordinal()] == 2 ? ((wqz.b.c) arrayList.get(i3)).a.size() : ((wqz.b.c) arrayList.get((arrayList.size() - 1) - i3)).a.size();
                        if (((iArr[kxsVar.ordinal()] == 2 ? qai0Var.a : qai0Var.b) - i4) - size5 < iqzVar.b) {
                            break;
                        }
                        i4 += size5;
                        i3++;
                    }
                    if (i3 != 0) {
                        int[] iArr2 = b.a;
                        int size6 = iArr2[kxsVar.ordinal()] == 2 ? -this.d : ((arrayList.size() - 1) - this.d) - (i3 - 1);
                        int size7 = iArr2[kxsVar.ordinal()] == 2 ? (i3 - 1) - this.d : (arrayList.size() - 1) - this.d;
                        if (iqzVar.c) {
                            if (kxsVar == kxs.b) {
                                iD = d() + i4;
                            } else {
                                iD = (iqzVar.c ? this.f : 0) + i4;
                            }
                        }
                        return new xmz.a<>(kxsVar, size6, size7, iD);
                    }
                }
            }
        }
        return null;
    }

    public final int d() {
        if (this.a.c) {
            return this.e;
        }
        return 0;
    }

    public final boolean e(int i, kxs kxsVar, wqz.b.c<Key, Value> cVar) {
        kxsVar.getClass();
        cVar.getClass();
        int i2 = cVar.d;
        List<Value> list = cVar.a;
        int i3 = cVar.e;
        int iOrdinal = kxsVar.ordinal();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                ib5.a("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                ib5.a("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(cVar);
            this.d = 0;
            if (i3 == Integer.MIN_VALUE) {
                i3 = 0;
            }
            this.f = i3;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            this.e = i2;
            return true;
        }
        LinkedHashMap linkedHashMap = this.k;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return true;
            }
            if (arrayList2.isEmpty()) {
                ib5.a("should've received an init before append");
                return false;
            }
            if (i == this.h) {
                arrayList.add(cVar);
                if (i3 == Integer.MIN_VALUE) {
                    int size = (this.a.c ? this.f : 0) - list.size();
                    i3 = size < 0 ? 0 : size;
                }
                this.f = i3 != Integer.MIN_VALUE ? i3 : 0;
                linkedHashMap.remove(kxs.c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                ib5.a("should've received an init before prepend");
                return false;
            }
            if (i == this.g) {
                arrayList.add(0, cVar);
                this.d++;
                if (i2 == Integer.MIN_VALUE) {
                    int iD = d() - list.size();
                    i2 = iD < 0 ? 0 : iD;
                }
                this.e = i2 != Integer.MIN_VALUE ? i2 : 0;
                linkedHashMap.remove(kxs.b);
                return true;
            }
        }
        return false;
    }

    public final xmz.b f(kxs kxsVar, wqz.b.c cVar) {
        int size;
        cVar.getClass();
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = 0 - this.d;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            size = (this.c.size() - this.d) - 1;
        }
        List listC = kotlin.collections.a.c(new msg0(size, cVar.a));
        int iOrdinal2 = kxsVar.ordinal();
        iqz iqzVar = this.a;
        tsw tswVar = this.l;
        if (iOrdinal2 == 0) {
            xmz.b<Object> bVar = xmz.b.g;
            return xmz.b.a.a(listC, d(), iqzVar.c ? this.f : 0, tswVar.d(), null);
        }
        if (iOrdinal2 == 1) {
            xmz.b<Object> bVar2 = xmz.b.g;
            int iD = d();
            jxs jxsVarD = tswVar.d();
            listC.getClass();
            return new xmz.b(kxs.b, listC, iD, -1, jxsVarD, null);
        }
        if (iOrdinal2 != 2) {
            uhc.a();
            return null;
        }
        xmz.b<Object> bVar3 = xmz.b.g;
        int i = iqzVar.c ? this.f : 0;
        jxs jxsVarD2 = tswVar.d();
        listC.getClass();
        return new xmz.b(kxs.c, listC, -1, i, jxsVarD2, null);
    }
}
