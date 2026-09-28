package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class drr {
    public final List<a0b> a;
    public final xmt b;
    public final String c;
    public final long d;
    public final a e;
    public final long f;
    public final String g;
    public final List<stu> h;
    public final qe0 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final le0 q;
    public final me0 r;
    public final be0 s;
    public final List<cpp<Float>> t;
    public final b u;
    public final boolean v;
    public final gg4 w;
    public final tef x;
    public final zup y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("PRE_COMP", 0);
            a = aVar;
            a aVar2 = new a("SOLID", 1);
            a aVar3 = new a("IMAGE", 2);
            b = aVar3;
            a aVar4 = new a("NULL", 3);
            a aVar5 = new a("SHAPE", 4);
            a aVar6 = new a("TEXT", 5);
            a aVar7 = new a("UNKNOWN", 6);
            c = aVar7;
            d = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final /* synthetic */ b[] c;

        static {
            b bVar = new b("NONE", 0);
            a = bVar;
            b bVar2 = new b("ADD", 1);
            b bVar3 = new b("INVERT", 2);
            b = bVar3;
            c = new b[]{bVar, bVar2, bVar3, new b("LUMA", 3), new b("LUMA_INVERTED", 4), new b("UNKNOWN", 5)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public drr(List<a0b> list, xmt xmtVar, String str, long j, a aVar, long j2, String str2, List<stu> list2, qe0 qe0Var, int i, int i2, int i3, float f, float f2, float f3, float f4, le0 le0Var, me0 me0Var, List<cpp<Float>> list3, b bVar, be0 be0Var, boolean z, gg4 gg4Var, tef tefVar, zup zupVar) {
        this.a = list;
        this.b = xmtVar;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = qe0Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = le0Var;
        this.r = me0Var;
        this.t = list3;
        this.u = bVar;
        this.s = be0Var;
        this.v = z;
        this.w = gg4Var;
        this.x = tefVar;
        this.y = zupVar;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        xmt xmtVar = this.b;
        drr drrVarB = xmtVar.i.b(j);
        if (drrVarB != null) {
            sb.append("\t\tParents: ");
            sb.append(drrVarB.c);
            for (drr drrVarB2 = xmtVar.i.b(drrVarB.f); drrVarB2 != null; drrVarB2 = xmtVar.i.b(drrVarB2.f)) {
                sb.append("->");
                sb.append(drrVarB2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List<stu> list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List<a0b> list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (a0b a0bVar : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(a0bVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
