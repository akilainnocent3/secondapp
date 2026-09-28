package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nk0 implements CharSequence {
    public static final /* synthetic */ int e = 0;
    public final List<d<? extends a>> a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public interface a {
    }

    public static final class c {
    }

    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((d) t).b).compareTo(Integer.valueOf(((d) t2).b));
        }
    }

    static {
        uv60 uv60Var = kx60.a;
    }

    public nk0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nk0(List<? extends d<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                d dVar = (d) list.get(i);
                T t = dVar.a;
                if (t instanceof ora0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(dVar);
                } else if (t instanceof qrz) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(dVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List listR0 = arrayList2 != null ? CollectionsKt.r0(arrayList2, new e()) : null;
        if (listR0 == null || listR0.isEmpty()) {
            return;
        }
        int i2 = ((d) CollectionsKt.T(listR0)).c;
        lsw lswVar = bwo.a;
        lsw lswVar2 = new lsw(1);
        lswVar2.a(i2);
        int size2 = listR0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            d dVar2 = (d) listR0.get(i3);
            while (lswVar2.b != 0) {
                int iD = lswVar2.d();
                int i4 = dVar2.b;
                int i5 = dVar2.c;
                if (i4 < iD) {
                    if (i5 > iD) {
                        xkn.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iD);
                        break;
                    }
                    break;
                }
                lswVar2.e(lswVar2.b - 1);
            }
            lswVar2.a(dVar2.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final List a(int i) {
        ?? arrayList;
        List<d<? extends a>> list = this.a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                d<? extends a> dVar = list.get(i2);
                d<? extends a> dVar2 = dVar;
                if ((dVar2.a instanceof rfs) && qk0.b(0, i, dVar2.b, dVar2.c)) {
                    arrayList.add(dVar);
                }
            }
        } else {
            arrayList = m2g.a;
        }
        arrayList.getClass();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List b(int i, int i2, String str) {
        List<d<? extends a>> list = this.a;
        if (list == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            d<? extends a> dVar = list.get(i3);
            if ((dVar.a instanceof e9e0) && Intrinsics.g(str, dVar.d) && qk0.b(i, i2, dVar.b, dVar.c)) {
                T t = dVar.a;
                t.getClass();
                arrayList.add(new d(((e9e0) t).a, dVar.d, dVar.b, dVar.c));
            }
        }
        return arrayList;
    }

    public final nk0 c(Function1<? super d<? extends a>, ? extends d<? extends a>> function1) {
        b bVar = new b(this);
        ArrayList arrayList = bVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d<? extends a> dVarInvoke = function1.invoke(((b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new b.a(dVarInvoke.a, dVarInvoke.d, dVarInvoke.b, dVarInvoke.c));
        }
        return bVar.m();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final nk0 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            xkn.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        nk0 nk0Var = qk0.a;
        if (i > i2) {
            xkn.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List<d<? extends a>> list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                d<? extends a> dVar = list.get(i3);
                int i4 = dVar.b;
                int i5 = dVar.c;
                if (qk0.b(i, i2, i4, i5)) {
                    arrayList2.add(new d(dVar.a, dVar.d, Math.max(i, dVar.b) - i, Math.min(i2, i5) - i));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new nk0(arrayList, strSubstring);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk0)) {
            return false;
        }
        nk0 nk0Var = (nk0) obj;
        return Intrinsics.g(this.b, nk0Var.b) && Intrinsics.g(this.a, nk0Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        List<d<? extends a>> list = this.a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public static final class d<T> {
        public final T a;
        public final int b;
        public final int c;
        public final String d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, String str, int i, int i2) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            xkn.a("Reversed range is not supported");
        }

        public static d a(d dVar, a aVar, int i, int i2) {
            if ((i2 & 1) != 0) {
                aVar = dVar.a;
            }
            int i3 = dVar.b;
            if ((i2 & 4) != 0) {
                i = dVar.c;
            }
            return new d(aVar, dVar.d, i3, i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && Intrinsics.g(this.d, dVar.d);
        }

        public final int hashCode() {
            T t = this.a;
            return this.d.hashCode() + gpp.a(this.c, gpp.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return j26.a(sb, this.d, ')');
        }

        public d(int i, int i2, Object obj) {
            this(obj, "", i, i2);
        }
    }

    public static final class b implements Appendable {
        public final StringBuilder a;
        public final ArrayList b;
        public final ArrayList c;

        public static final class a<T> {
            public final T a;
            public final int b;
            public int c;
            public final String d;

            public /* synthetic */ a(String str, int i, int i2, int i3, Object obj) {
                this(obj, (i3 & 8) != 0 ? "" : str, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2);
            }

            public final d<T> a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (!(i != Integer.MIN_VALUE)) {
                    xkn.c("Item.end should be set first");
                }
                return new d<>(this.a, this.d, this.b, i);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
            }

            public final int hashCode() {
                T t = this.a;
                return this.d.hashCode() + gpp.a(this.c, gpp.a(this.b, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder(LhMGMAwwhzjwfz.nLFaFaxuUFg);
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return j26.a(sb, this.d, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(Object obj, String str, int i, int i2) {
                this.a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }
        }

        public b(int i) {
            this.a = new StringBuilder(i);
            this.b = new ArrayList();
            this.c = new ArrayList();
            new ArrayList();
        }

        public final void a(rfs.a aVar, int i, int i2) {
            this.c.add(new a(null, i, i2, 8, aVar));
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            boolean z = charSequence instanceof nk0;
            StringBuilder sb = this.a;
            if (!z) {
                sb.append(charSequence, i, i2);
                return this;
            }
            nk0 nk0Var = (nk0) charSequence;
            int length = sb.length();
            sb.append((CharSequence) nk0Var.b, i, i2);
            List listA = qk0.a(nk0Var, i, i2, null);
            if (listA != null) {
                int size = listA.size();
                for (int i3 = 0; i3 < size; i3++) {
                    d dVar = (d) listA.get(i3);
                    this.c.add(new a(dVar.a, dVar.d, dVar.b + length, dVar.c + length));
                }
            }
            return this;
        }

        public final void b(rfs.b bVar, int i, int i2) {
            this.c.add(new a(null, i, i2, 8, bVar));
        }

        public final void c(int i, int i2, String str, String str2) {
            this.c.add(new a(new e9e0(str2), str, i, i2));
        }

        public final void d(ora0 ora0Var, int i, int i2) {
            this.c.add(new a(null, i, i2, 8, ora0Var));
        }

        public final void e(nk0 nk0Var) {
            StringBuilder sb = this.a;
            int length = sb.length();
            sb.append(nk0Var.b);
            List<d<? extends a>> list = nk0Var.a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    d<? extends a> dVar = list.get(i);
                    this.c.add(new a(dVar.a, dVar.d, dVar.b + length, dVar.c + length));
                }
            }
        }

        public final void f(CharSequence charSequence) {
            if (charSequence instanceof nk0) {
                e((nk0) charSequence);
            } else {
                this.a.append(charSequence);
            }
        }

        public final void g(String str) {
            this.a.append(str);
        }

        public final void h() {
            ArrayList arrayList = this.b;
            if (arrayList.isEmpty()) {
                xkn.c("Nothing to pop.");
            }
            ((a) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
        }

        public final void i(int i) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                xkn.c(i + " should be less than " + arrayList.size());
            }
            while (arrayList.size() - 1 >= i) {
                h();
            }
        }

        public final int j(rfs rfsVar) {
            a aVar = new a(null, this.a.length(), 0, 12, rfsVar);
            ArrayList arrayList = this.b;
            arrayList.add(aVar);
            this.c.add(aVar);
            return arrayList.size() - 1;
        }

        public final void k(String str, String str2) {
            a aVar = new a(str, this.a.length(), 0, 4, new e9e0(str2));
            ArrayList arrayList = this.b;
            arrayList.add(aVar);
            this.c.add(aVar);
            arrayList.size();
        }

        public final int l(ora0 ora0Var) {
            a aVar = new a(null, this.a.length(), 0, 12, ora0Var);
            ArrayList arrayList = this.b;
            arrayList.add(aVar);
            this.c.add(aVar);
            return arrayList.size() - 1;
        }

        public final nk0 m() {
            StringBuilder sb = this.a;
            String string = sb.toString();
            ArrayList arrayList = this.c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((a) arrayList.get(i)).a(sb.length()));
            }
            return new nk0(string, arrayList2);
        }

        public b() {
            this((Object) null);
        }

        public /* synthetic */ b(Object obj) {
            this(16);
        }

        public b(nk0 nk0Var) {
            this((Object) null);
            e(nk0Var);
        }

        @Override // java.lang.Appendable
        public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
            f(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            this.a.append(c);
            return this;
        }
    }

    public nk0(String str) {
        this(str, m2g.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk0(String str, List list, int i) {
        m2g m2gVar = m2g.a;
        nk0 nk0Var = qk0.a;
        if (list.isEmpty()) {
            m2gVar.getClass();
            list = null;
        } else {
            m2gVar.getClass();
        }
        this((List<? extends d<? extends a>>) list, str);
    }

    public nk0(String str, List<? extends d<? extends a>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
