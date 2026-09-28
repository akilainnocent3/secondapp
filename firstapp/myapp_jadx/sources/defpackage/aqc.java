package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class aqc<Key, Value> {
    public final f a;
    public final h0p<e> b = new h0p<>(a.a, new b(this));

    public static final class a extends qlr implements Function1<e, Unit> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(e eVar) {
            e eVar2 = eVar;
            eVar2.getClass();
            eVar2.a();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<Boolean> {
        public final /* synthetic */ aqc<Key, Value> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(aqc<Key, Value> aqcVar) {
            super(0);
            this.a = aqcVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.a.b.e);
        }
    }

    public static final class c<Value> {
        public final List<Value> a;
        public final Object b;
        public final Object c;
        public final int d;
        public final int e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Value> list, Object obj, Object obj2, int i, int i2) {
            list.getClass();
            this.a = list;
            this.b = obj;
            this.c = obj2;
            this.d = i;
            this.e = i2;
            if (i < 0 && i != Integer.MIN_VALUE) {
                hb5.a("Position must be non-negative");
                throw null;
            }
            if (list.isEmpty() && (i > 0 || i2 > 0)) {
                hb5.a("Initial result cannot be empty if items are present in data set.");
                throw null;
            }
            if (i2 >= 0 || i2 == Integer.MIN_VALUE) {
                return;
            }
            hb5.a("List size + position too large, last item in list beyond totalCount.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e;
        }
    }

    public static abstract class d<Key, Value> {
        public abstract aqc<Key, Value> a();
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final /* synthetic */ f[] c;

        static {
            f fVar = new f("POSITIONAL", 0);
            a = fVar;
            f fVar2 = new f("PAGE_KEYED", 1);
            b = fVar2;
            c = new f[]{fVar, fVar2, new f("ITEM_KEYED", 2)};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) c.clone();
        }
    }

    public static final class g<K> {
        public final kxs a;
        public final K b;
        public final int c;
        public final boolean d;
        public final int e;

        public g(kxs kxsVar, K k, int i, boolean z, int i2) {
            this.a = kxsVar;
            this.b = k;
            this.c = i;
            this.d = z;
            this.e = i2;
            if (kxsVar == kxs.a || k != null) {
                return;
            }
            hb5.a("Key must be non-null for prepend/append");
            throw null;
        }
    }

    public aqc(f fVar) {
        this.a = fVar;
    }

    public abstract Key a(Value value);

    public abstract Object b(g gVar, w5s w5sVar);
}
