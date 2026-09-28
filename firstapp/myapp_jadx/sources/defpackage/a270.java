package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a270 {
    public final tuw a = uuw.a();
    public final wwd0 b;
    public final b390 c;
    public final tuw d;
    public final wwd0 e;
    public final b390 f;
    public final wwd0 g;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f970.values().length];
            try {
                f970 f970Var = f970.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f970 f970Var2 = f970.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f970 f970Var3 = f970.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f970 f970Var4 = f970.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public a270() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.b = xwd0.a(o2gVar);
        pb5 pb5Var = pb5.b;
        this.c = d390.b(0, 1, pb5Var, 1);
        this.d = uuw.a();
        this.e = xwd0.a(o2gVar);
        this.f = d390.b(0, 1, pb5Var, 1);
        this.g = xwd0.a(null);
    }

    public static f970 a(f970 f970Var) {
        int i = f970Var == null ? -1 : a.a[f970Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return f970.b;
            }
            if (i == 2) {
                return f970.a;
            }
            if (i == 3) {
                return f970.d;
            }
            if (i != 4) {
                uhc.a();
                return null;
            }
        }
        return f970.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ni70 ni70Var, long j, x1b x1bVar) {
        q270 q270Var;
        tuw tuwVar;
        Object value;
        LinkedHashMap linkedHashMap;
        if (x1bVar instanceof q270) {
            q270Var = (q270) x1bVar;
            int i = q270Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                q270Var.f = i - Integer.MIN_VALUE;
            } else {
                q270Var = new q270(this, x1bVar);
            }
        } else {
            q270Var = new q270(this, x1bVar);
        }
        Object obj = q270Var.d;
        y5b y5bVar = y5b.a;
        int i2 = q270Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            q270Var.a = ni70Var;
            tuwVar = this.d;
            q270Var.b = tuwVar;
            q270Var.c = j;
            q270Var.f = 1;
            if (tuwVar.d(q270Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = q270Var.c;
            tuw tuwVar2 = q270Var.b;
            ni70 ni70Var2 = q270Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            ni70Var = ni70Var2;
        }
        try {
            wwd0 wwd0Var = this.e;
            do {
                value = wwd0Var.getValue();
                Map map = (Map) value;
                List<l770> list = ni70Var.c;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    p48.w(((l770) it.next()).d, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    if (((e970) obj2).b(j)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    arrayList3.add(((e970) obj3).a);
                }
                Set setE0 = CollectionsKt.E0(arrayList3);
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (setE0.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } while (!wwd0Var.g(value, linkedHashMap));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        r270 r270Var;
        tuw tuwVar;
        Object value;
        Map map;
        if (x1bVar instanceof r270) {
            r270Var = (r270) x1bVar;
            int i = r270Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                r270Var.e = i - Integer.MIN_VALUE;
            } else {
                r270Var = new r270(this, x1bVar);
            }
        } else {
            r270Var = new r270(this, x1bVar);
        }
        Object obj = r270Var.c;
        y5b y5bVar = y5b.a;
        int i2 = r270Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            r270Var.a = str;
            tuwVar = this.d;
            r270Var.b = tuwVar;
            r270Var.e = 1;
            if (tuwVar.d(r270Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = r270Var.b;
            String str2 = r270Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            str = str2;
        }
        try {
            wwd0 wwd0Var = this.e;
            do {
                value = wwd0Var.getValue();
                map = (Map) value;
            } while (!wwd0Var.g(value, kpu.i(map, new Pair(str, a((f970) map.get(str))))));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Set set, x1b x1bVar) {
        s270 s270Var;
        tuw tuwVar;
        Object value;
        Map map;
        LinkedHashMap linkedHashMap;
        if (x1bVar instanceof s270) {
            s270Var = (s270) x1bVar;
            int i = s270Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                s270Var.e = i - Integer.MIN_VALUE;
            } else {
                s270Var = new s270(this, x1bVar);
            }
        } else {
            s270Var = new s270(this, x1bVar);
        }
        Object obj = s270Var.c;
        y5b y5bVar = y5b.a;
        int i2 = s270Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            s270Var.a = set;
            tuwVar = this.d;
            s270Var.b = tuwVar;
            s270Var.e = 1;
            if (tuwVar.d(s270Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = s270Var.b;
            Set set2 = s270Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            set = set2;
        }
        try {
            wwd0 wwd0Var = this.e;
            do {
                value = wwd0Var.getValue();
                map = (Map) value;
                Set set3 = set;
                int iA = jpu.a(l48.r(set3, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : set3) {
                    linkedHashMap.put(obj2, f970.a);
                }
            } while (!wwd0Var.g(value, kpu.h(map, linkedHashMap)));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ni70 ni70Var, long j, x1b x1bVar) {
        t270 t270Var;
        tuw tuwVar;
        Object value;
        LinkedHashMap linkedHashMap;
        if (x1bVar instanceof t270) {
            t270Var = (t270) x1bVar;
            int i = t270Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                t270Var.f = i - Integer.MIN_VALUE;
            } else {
                t270Var = new t270(this, x1bVar);
            }
        } else {
            t270Var = new t270(this, x1bVar);
        }
        Object obj = t270Var.d;
        y5b y5bVar = y5b.a;
        int i2 = t270Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            t270Var.a = ni70Var;
            tuwVar = this.a;
            t270Var.b = tuwVar;
            t270Var.c = j;
            t270Var.f = 1;
            if (tuwVar.d(t270Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = t270Var.c;
            tuw tuwVar2 = t270Var.b;
            ni70 ni70Var2 = t270Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            ni70Var = ni70Var2;
        }
        try {
            wwd0 wwd0Var = this.b;
            do {
                value = wwd0Var.getValue();
                Map map = (Map) value;
                List<l770> list = ni70Var.c;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    p48.w(((l770) it.next()).d, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    if (!((e970) obj2).b(j)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    arrayList3.add(((e970) obj3).a);
                }
                Set setE0 = CollectionsKt.E0(arrayList3);
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (setE0.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } while (!wwd0Var.g(value, linkedHashMap));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, x1b x1bVar) {
        u270 u270Var;
        tuw tuwVar;
        Object value;
        Map map;
        if (x1bVar instanceof u270) {
            u270Var = (u270) x1bVar;
            int i = u270Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                u270Var.e = i - Integer.MIN_VALUE;
            } else {
                u270Var = new u270(this, x1bVar);
            }
        } else {
            u270Var = new u270(this, x1bVar);
        }
        Object obj = u270Var.c;
        y5b y5bVar = y5b.a;
        int i2 = u270Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            u270Var.a = str;
            tuwVar = this.a;
            u270Var.b = tuwVar;
            u270Var.e = 1;
            if (tuwVar.d(u270Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = u270Var.b;
            String str2 = u270Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            str = str2;
        }
        try {
            wwd0 wwd0Var = this.b;
            do {
                value = wwd0Var.getValue();
                map = (Map) value;
            } while (!wwd0Var.g(value, kpu.i(map, new Pair(str, a((f970) map.get(str))))));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Set set, x1b x1bVar) {
        v270 v270Var;
        tuw tuwVar;
        Object value;
        Map map;
        LinkedHashMap linkedHashMap;
        if (x1bVar instanceof v270) {
            v270Var = (v270) x1bVar;
            int i = v270Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v270Var.e = i - Integer.MIN_VALUE;
            } else {
                v270Var = new v270(this, x1bVar);
            }
        } else {
            v270Var = new v270(this, x1bVar);
        }
        Object obj = v270Var.c;
        y5b y5bVar = y5b.a;
        int i2 = v270Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            v270Var.a = set;
            tuwVar = this.a;
            v270Var.b = tuwVar;
            v270Var.e = 1;
            if (tuwVar.d(v270Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuw tuwVar2 = v270Var.b;
            Set set2 = v270Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            set = set2;
        }
        try {
            wwd0 wwd0Var = this.b;
            do {
                value = wwd0Var.getValue();
                map = (Map) value;
                Set set3 = set;
                int iA = jpu.a(l48.r(set3, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : set3) {
                    linkedHashMap.put(obj2, f970.a);
                }
            } while (!wwd0Var.g(value, kpu.h(map, linkedHashMap)));
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }
}
