package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class qqz<T> {

    public static final class a<T> extends qqz<T> {
        public final int a;
        public final ArrayList b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + this.b.hashCode() + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
            ArrayList arrayList = this.b;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   startIndex: ");
            sb.append(this.a);
            sb.append("\n                    |   first item: ");
            sb.append(CollectionsKt.firstOrNull(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.d0(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return qae0.d(sb.toString());
        }
    }

    public static final class b<T> extends qqz<T> {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
            int i = this.b;
            sb.append(i);
            sb.append(" items (\n                    |   startIndex: ");
            d5d.a(sb, this.a, "\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.d);
            sb.append("\n                    |)\n                    |");
            return qae0.d(sb.toString());
        }
    }

    public static final class c<T> extends qqz<T> {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
            int i = this.a;
            d5d.a(sb, i, " items (\n                    |   dropCount: ", i, "\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return qae0.d(sb.toString());
        }
    }

    public static final class d<T> extends qqz<T> {
        public final ArrayList a;
        public final int b;
        public final int c;

        public d(ArrayList arrayList, int i, int i2) {
            this.a = arrayList;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + Integer.hashCode(this.b) + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
            ArrayList arrayList = this.a;
            sb.append(arrayList.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.firstOrNull(arrayList));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.d0(arrayList));
            sb.append("\n                    |   newPlaceholdersBefore: ");
            sb.append(this.b);
            sb.append("\n                    |   oldPlaceholdersBefore: ");
            sb.append(this.c);
            sb.append("\n                    |)\n                    |");
            return qae0.d(sb.toString());
        }
    }

    public static final class e<T> extends qqz<T> {
        public final ynz a;
        public final mi10<T> b;

        public e(ynz ynzVar, mi10 mi10Var) {
            mi10Var.getClass();
            this.a = ynzVar;
            this.b = mi10Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            ynz ynzVar = this.a;
            int i = ynzVar.c;
            e eVar = (e) obj;
            mi10<T> mi10Var = eVar.b;
            ynz ynzVar2 = eVar.a;
            if (i != ynzVar2.c || ynzVar.d != ynzVar2.d || ynzVar.a() != ynzVar2.a() || ynzVar.b != ynzVar2.b) {
                return false;
            }
            mi10<T> mi10Var2 = this.b;
            return mi10Var2.d() == mi10Var.d() && mi10Var2.f() == mi10Var.f() && mi10Var2.a() == mi10Var.a() && mi10Var2.b() == mi10Var.b();
        }

        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: ");
            ynz ynzVar = this.a;
            sb.append(ynzVar.c);
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(ynzVar.d);
            sb.append("\n                    |       size: ");
            sb.append(ynzVar.a());
            sb.append("\n                    |       dataCount: ");
            sb.append(ynzVar.b);
            sb.append("\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: ");
            mi10<T> mi10Var = this.b;
            sb.append(mi10Var.d());
            sb.append("\n                    |       placeholdersAfter: ");
            sb.append(mi10Var.f());
            sb.append("\n                    |       size: ");
            sb.append(mi10Var.a());
            sb.append("\n                    |       dataCount: ");
            sb.append(mi10Var.b());
            sb.append("\n                    |   )\n                    |");
            return qae0.d(sb.toString());
        }
    }
}
