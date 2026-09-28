package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class wqz<Key, Value> {
    public final h0p<Function0<Unit>> a = new h0p<>(c.a, null);

    public static abstract class a<Key> {
        public final int a;
        public final boolean b;

        /* JADX INFO: renamed from: wqz$a$a, reason: collision with other inner class name */
        public static final class C1262a<Key> extends a<Key> {
            public final Key c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1262a(int i, Object obj, boolean z) {
                super(i, z);
                obj.getClass();
                this.c = obj;
            }

            @Override // wqz.a
            public final Key a() {
                return this.c;
            }
        }

        public static final class b<Key> extends a<Key> {
            public final Key c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(int i, Object obj, boolean z) {
                super(i, z);
                obj.getClass();
                this.c = obj;
            }

            @Override // wqz.a
            public final Key a() {
                return this.c;
            }
        }

        public static final class c<Key> extends a<Key> {
            public final Key c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(int i, Object obj, boolean z) {
                super(i, z);
                this.c = obj;
            }

            @Override // wqz.a
            public final Key a() {
                return this.c;
            }
        }

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public abstract Key a();
    }

    public static final class c extends qlr implements Function1<Function0<? extends Unit>, Unit> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> function1 = function0;
            function1.getClass();
            function1.invoke();
            return Unit.a;
        }
    }

    public abstract Key b(xqz<Key, Value> xqzVar);

    public final void c() {
        if (this.a.a()) {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                Log.d("Paging", "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object d(a aVar, x1b x1bVar);

    public static abstract class b<Key, Value> {

        public static final class a<Key, Value> extends b<Key, Value> {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return qae0.d("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
            }
        }

        /* JADX INFO: renamed from: wqz$b$b, reason: collision with other inner class name */
        public static final class C1263b<Key, Value> extends b<Key, Value> {
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        public static final class c<Key, Value> extends b<Key, Value> implements Iterable<Value>, dhp {
            public static final c f = new c(m2g.a, null, null, 0, 0);
            public final List<Value> a;
            public final Key b;
            public final Key c;
            public final int d;
            public final int e;

            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                list.getClass();
                this.a = list;
                this.b = key;
                this.c = key2;
                this.d = i;
                this.e = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    hb5.a("itemsBefore cannot be negative");
                    throw null;
                }
                if (i2 == Integer.MIN_VALUE || i2 >= 0) {
                    return;
                }
                hb5.a("itemsAfter cannot be negative");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
            }

            public final int hashCode() {
                int iHashCode = this.a.hashCode() * 31;
                Key key = this.b;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.c;
                return Integer.hashCode(this.e) + gpp.a(this.d, (iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator<Value> iterator() {
                return this.a.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List<Value> list = this.a;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(CollectionsKt.firstOrNull(list));
                sb.append("\n                    |   last Item: ");
                sb.append(CollectionsKt.d0(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.c);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.b);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.d);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.e);
                sb.append("\n                    |) ");
                return qae0.d(sb.toString());
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public c(List list, Integer num, Integer num2) {
                this(list, num, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                list.getClass();
            }
        }
    }
}
