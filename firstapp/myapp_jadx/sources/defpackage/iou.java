package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class iou<K, V> extends onp<K, V, Map.Entry<? extends K, ? extends V>> {
    public final sd80 c;

    public static final class a<K, V> implements Map.Entry<K, V>, dhp {
        public final K a;
        public final V b;

        public a(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.a;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.b;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MapEntry(key=");
            sb.append(this.a);
            sb.append(", value=");
            return ekw.a(sb, this.b, ')');
        }
    }

    public iou(final php<K> phpVar, final php<V> phpVar2) {
        super(phpVar, phpVar2);
        this.c = vd80.b("kotlin.collections.Map.Entry", ebe0.c.a, new pd80[0], new Function1() { // from class: hou
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                eq7 eq7Var = (eq7) obj;
                eq7Var.getClass();
                eq7.a(eq7Var, "key", phpVar.getDescriptor());
                eq7.a(eq7Var, "value", phpVar2.getDescriptor());
                return Unit.a;
            }
        });
    }

    @Override // defpackage.onp
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getKey();
    }

    @Override // defpackage.onp
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return entry.getValue();
    }

    @Override // defpackage.onp
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.c;
    }
}
