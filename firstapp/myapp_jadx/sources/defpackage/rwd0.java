package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class rwd0 {
    public ax5 a;
    public boolean b = true;
    public final HashMap<Object, eq40> c;
    public final HashMap<Object, wil> d;
    public final HashMap<String, ArrayList<String>> e;
    public final rwa f;
    public int g;
    public final ArrayList<Object> h;
    public final ArrayList<ixa> i;
    public boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final HashMap d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("SPREAD", 0);
            a = aVar;
            a aVar2 = new a("SPREAD_INSIDE", 1);
            b = aVar2;
            a aVar3 = new a("PACKED", 2);
            c = aVar3;
            e = new a[]{aVar, aVar2, aVar3};
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            d = map2;
            map.put("packed", aVar3);
            map.put("spread_inside", aVar2);
            map.put("spread", aVar);
            pwd0.a(2, map2, "packed", 1, "spread_inside");
            map2.put("spread", 0);
        }

        public a() {
            throw null;
        }

        public static int a(String str) {
            HashMap map = d;
            if (map.containsKey(str)) {
                return ((Integer) map.get(str)).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b A;
        public static final b B;
        public static final b C;
        public static final b D;
        public static final b E;
        public static final b F;
        public static final b G;
        public static final /* synthetic */ b[] H;
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b i;
        public static final b v;
        public static final b w;
        public static final b y;
        public static final b z;

        static {
            b bVar = new b("LEFT_TO_LEFT", 0);
            a = bVar;
            b bVar2 = new b("LEFT_TO_RIGHT", 1);
            b = bVar2;
            b bVar3 = new b("RIGHT_TO_LEFT", 2);
            c = bVar3;
            b bVar4 = new b("RIGHT_TO_RIGHT", 3);
            d = bVar4;
            b bVar5 = new b("START_TO_START", 4);
            e = bVar5;
            b bVar6 = new b("START_TO_END", 5);
            f = bVar6;
            b bVar7 = new b("END_TO_START", 6);
            i = bVar7;
            b bVar8 = new b("END_TO_END", 7);
            v = bVar8;
            b bVar9 = new b("TOP_TO_TOP", 8);
            w = bVar9;
            b bVar10 = new b("TOP_TO_BOTTOM", 9);
            y = bVar10;
            b bVar11 = new b("TOP_TO_BASELINE", 10);
            z = bVar11;
            b bVar12 = new b("BOTTOM_TO_TOP", 11);
            A = bVar12;
            b bVar13 = new b("BOTTOM_TO_BOTTOM", 12);
            B = bVar13;
            b bVar14 = new b("BOTTOM_TO_BASELINE", 13);
            C = bVar14;
            b bVar15 = new b("BASELINE_TO_BASELINE", 14);
            D = bVar15;
            b bVar16 = new b("BASELINE_TO_TOP", 15);
            E = bVar16;
            b bVar17 = new b("BASELINE_TO_BOTTOM", 16);
            F = bVar17;
            b bVar18 = new b("CENTER_HORIZONTALLY", 17);
            b bVar19 = new b("CENTER_VERTICALLY", 18);
            b bVar20 = new b("CIRCULAR_CONSTRAINT", 19);
            G = bVar20;
            H = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) H.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final /* synthetic */ c[] f;

        static {
            c cVar = new c("LEFT", 0);
            a = cVar;
            c cVar2 = new c("RIGHT", 1);
            b = cVar2;
            c cVar3 = new c("START", 2);
            c cVar4 = new c("END", 3);
            c = cVar4;
            c cVar5 = new c("TOP", 4);
            d = cVar5;
            c cVar6 = new c("BOTTOM", 5);
            e = cVar6;
            f = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final d i;
        public static final d v;
        public static final d w;
        public static final /* synthetic */ d[] y;

        static {
            d dVar = new d("HORIZONTAL_CHAIN", 0);
            a = dVar;
            d dVar2 = new d("VERTICAL_CHAIN", 1);
            b = dVar2;
            d dVar3 = new d("ALIGN_HORIZONTALLY", 2);
            d dVar4 = new d("ALIGN_VERTICALLY", 3);
            c = dVar4;
            d dVar5 = new d("BARRIER", 4);
            d = dVar5;
            d dVar6 = new d("LAYER", 5);
            d dVar7 = new d("HORIZONTAL_FLOW", 6);
            e = dVar7;
            d dVar8 = new d("VERTICAL_FLOW", 7);
            f = dVar8;
            d dVar9 = new d("GRID", 8);
            i = dVar9;
            d dVar10 = new d("ROW", 9);
            v = dVar10;
            d dVar11 = new d("COLUMN", 10);
            w = dVar11;
            y = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, new d("FLOW", 11)};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) y.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final HashMap a;
        public static final /* synthetic */ e[] b;

        /* JADX INFO: Fake field, exist only in values array */
        e EF0;

        static {
            e eVar = new e("NONE", 0);
            e eVar2 = new e("CHAIN", 1);
            e eVar3 = new e("ALIGNED", 2);
            b = new e[]{eVar, eVar2, eVar3};
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            a = map2;
            map.put("none", eVar);
            map.put("chain", eVar2);
            map.put("aligned", eVar3);
            pwd0.a(0, map2, "none", 3, "chain");
            map2.put("aligned", 2);
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) b.clone();
        }
    }

    public rwd0() {
        HashMap<Object, eq40> map = new HashMap<>();
        this.c = map;
        this.d = new HashMap<>();
        this.e = new HashMap<>();
        rwa rwaVar = new rwa(this);
        this.f = rwaVar;
        this.g = 0;
        this.h = new ArrayList<>();
        this.i = new ArrayList<>();
        this.j = true;
        rwaVar.a = 0;
        map.put(0, rwaVar);
    }

    public final void a(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public final rwa b(Object obj) {
        HashMap<Object, eq40> map = this.c;
        eq40 eq40Var = map.get(obj);
        Object obj2 = eq40Var;
        if (eq40Var == null) {
            rwa rwaVar = new rwa(this);
            map.put(obj, rwaVar);
            rwaVar.a = obj;
            obj2 = rwaVar;
        }
        if (obj2 instanceof rwa) {
            return (rwa) obj2;
        }
        return null;
    }

    public int c(Float f) {
        return Math.round(f.floatValue());
    }

    public final sal d(int i, String str) {
        rwa rwaVarB = b(str);
        e6h e6hVar = rwaVarB.c;
        if (e6hVar == null || !(e6hVar instanceof sal)) {
            sal salVar = new sal(this);
            salVar.b = i;
            salVar.g = str;
            rwaVarB.c = salVar;
            rwaVarB.b(salVar.a());
        }
        return (sal) rwaVarB.c;
    }

    public final wil e(d dVar) {
        wil ojmVar;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i = this.g;
        this.g = i + 1;
        String strA = zk1.a(i, "__", sb);
        HashMap<Object, wil> map = this.d;
        wil wilVar = map.get(strA);
        wil wilVar2 = wilVar;
        if (wilVar == null) {
            int iOrdinal = dVar.ordinal();
            d dVar2 = d.c;
            switch (iOrdinal) {
                case 0:
                    ojmVar = new ojm(this, d.a);
                    break;
                case 1:
                    ojmVar = new v2i0(this, d.b);
                    break;
                case 2:
                    ft ftVar = new ft(this, dVar2);
                    ftVar.n0 = 0.5f;
                    ojmVar = ftVar;
                    break;
                case 3:
                    gt gtVar = new gt(this, dVar2);
                    gtVar.n0 = 0.5f;
                    ojmVar = gtVar;
                    break;
                case 4:
                    ojmVar = new wx1(this);
                    break;
                case 5:
                default:
                    ojmVar = new wil(this, dVar);
                    break;
                case 6:
                case 7:
                    ojmVar = new m2i(this, dVar);
                    break;
                case 8:
                case 9:
                case 10:
                    ojmVar = new u7l(this, dVar);
                    break;
            }
            ojmVar.a = strA;
            map.put(strA, ojmVar);
            wilVar2 = ojmVar;
        }
        return wilVar2;
    }
}
