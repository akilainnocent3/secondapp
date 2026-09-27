package hu;

import fr.h0;
import fr.r0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1855#2,2:262\n1726#2,3:264\n288#2,2:267\n1603#2,9:269\n1855#2:278\n1856#2:280\n1612#2:281\n1603#2,9:286\n1855#2:295\n1856#2:297\n1612#2:298\n766#2:303\n857#2,2:304\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:279\n1#3:296\n1#3:316\n210#4:282\n210#4:299\n3792#5:283\n4307#5,2:284\n3792#5:300\n4307#5,2:301\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n*L\n98#1:262,2\n103#1:264,3\n129#1:267,2\n131#1:269,9\n131#1:278\n131#1:280\n131#1:281\n197#1:286,9\n197#1:295\n197#1:297\n197#1:298\n203#1:303\n203#1:304,2\n204#1:306,9\n204#1:315\n204#1:317\n204#1:318\n131#1:279\n197#1:296\n204#1:316\n196#1:282\n202#1:299\n196#1:283\n196#1:284,2\n202#1:300\n202#1:301,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f88507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f88508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f88512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f88513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f88514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f88515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f88516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f88517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f88518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88520p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88521q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88523s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88524t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88525u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final d f88528x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @oy.l
    public static final List<a.C0886a> f88529y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @oy.l
    public static final List<a.C0886a> f88530z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final List<c> f88531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88532b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1#2:262\n3792#3:263\n4307#3,2:264\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n*L\n210#1:263\n210#1:264,2\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: hu.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0886a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f88533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.l
            public final String f88534b;

            public C0886a(int i10, @oy.l String name) {
                m0.p(name, "name");
                this.f88533a = i10;
                this.f88534b = name;
            }

            public final int a() {
                return this.f88533a;
            }

            @oy.l
            public final String b() {
                return this.f88534b;
            }
        }

        public /* synthetic */ a(x xVar) {
            this();
        }

        public final int b() {
            return d.f88515k;
        }

        public final int c() {
            return d.f88516l;
        }

        public final int d() {
            return d.f88513i;
        }

        public final int e() {
            return d.f88509e;
        }

        public final int f() {
            return d.f88512h;
        }

        public final int g() {
            return d.f88510f;
        }

        public final int h() {
            return d.f88511g;
        }

        public final int i() {
            return d.f88514j;
        }

        public final int j() {
            int i10 = d.f88508d;
            a aVar = d.f88507c;
            d.f88508d <<= 1;
            return i10;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.C0886a c0886a;
        a.C0886a c0886a2;
        a aVar = new a(null);
        f88507c = aVar;
        f88508d = 1;
        int iJ = aVar.j();
        f88509e = iJ;
        int iJ2 = aVar.j();
        f88510f = iJ2;
        int iJ3 = aVar.j();
        f88511g = iJ3;
        int iJ4 = aVar.j();
        f88512h = iJ4;
        int iJ5 = aVar.j();
        f88513i = iJ5;
        int iJ6 = aVar.j();
        f88514j = iJ6;
        int iJ7 = aVar.j() - 1;
        f88515k = iJ7;
        int i10 = iJ | iJ2 | iJ3;
        f88516l = i10;
        int i11 = iJ2 | iJ5 | iJ6;
        f88517m = i11;
        int i12 = iJ5 | iJ6;
        f88518n = i12;
        int i13 = 2;
        f88519o = new d(iJ7, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88520p = new d(i12, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88521q = new d(iJ, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88522r = new d(iJ2, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88523s = new d(iJ3, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88524t = new d(i10, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88525u = new d(iJ4, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88526v = new d(iJ5, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88527w = new d(iJ6, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        f88528x = new d(i11, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0);
        Field[] fields = d.class.getFields();
        m0.o(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i14 = dVar.f88532b;
                String name = field2.getName();
                m0.o(name, "field.name");
                c0886a2 = new a.C0886a(i14, name);
            } else {
                c0886a2 = null;
            }
            if (c0886a2 != null) {
                arrayList2.add(c0886a2);
            }
        }
        f88529y = arrayList2;
        Field[] fields2 = d.class.getFields();
        m0.o(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (m0.g(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            m0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                m0.o(name2, "field.name");
                c0886a = new a.C0886a(iIntValue, name2);
            } else {
                c0886a = null;
            }
            if (c0886a != null) {
                arrayList5.add(c0886a);
            }
        }
        f88530z = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, @oy.l List<? extends c> excludes) {
        m0.p(excludes, "excludes");
        this.f88531a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((c) it.next()).a();
        }
        this.f88532b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f88532b) != 0;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return m0.g(this.f88531a, dVar.f88531a) && this.f88532b == dVar.f88532b;
    }

    public int hashCode() {
        return (this.f88531a.hashCode() * 31) + this.f88532b;
    }

    @oy.l
    public final List<c> l() {
        return this.f88531a;
    }

    public final int m() {
        return this.f88532b;
    }

    @oy.m
    public final d n(int i10) {
        int i11 = i10 & this.f88532b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f88531a);
    }

    @oy.l
    public String toString() {
        Object next;
        Iterator<T> it = f88529y.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a.C0886a) next).a() != this.f88532b);
        a.C0886a c0886a = (a.C0886a) next;
        String strB = c0886a != null ? c0886a.b() : null;
        if (strB == null) {
            List<a.C0886a> list = f88530z;
            ArrayList arrayList = new ArrayList();
            for (a.C0886a c0886a2 : list) {
                String strB2 = a(c0886a2.a()) ? c0886a2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = r0.r3(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.f88531a + ')';
    }

    public /* synthetic */ d(int i10, List list, int i11, x xVar) {
        this(i10, (i11 & 2) != 0 ? h0.J() : list);
    }
}
