package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jtw extends zn20 {
    public final LinkedHashMap a;
    public final q11 b;

    public static final class a extends qlr implements Function1<Map.Entry<zn20.a<?>, Object>, CharSequence> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<zn20.a<?>, Object> entry) {
            String strValueOf;
            Map.Entry<zn20.a<?>, Object> entry2 = entry;
            entry2.getClass();
            Object value = entry2.getValue();
            if (value instanceof byte[]) {
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "[");
                int i = 0;
                for (byte b : (byte[]) value) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append((CharSequence) String.valueOf((int) b));
                }
                sb.append((CharSequence) "]");
                strValueOf = sb.toString();
            } else {
                strValueOf = String.valueOf(entry2.getValue());
            }
            return pr0.a(new StringBuilder("  "), entry2.getKey().a, " = ", strValueOf);
        }
    }

    public /* synthetic */ jtw(int i, boolean z) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    @Override // defpackage.zn20
    public final Map<zn20.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iA = jpu.a(l48.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.a, pair.b);
        }
        Map<zn20.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    @Override // defpackage.zn20
    public final <T> boolean b(zn20.a<T> aVar) {
        aVar.getClass();
        return this.a.containsKey(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zn20
    public final <T> T c(zn20.a<T> aVar) {
        aVar.getClass();
        T t = (T) this.a.get(aVar);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        return (T) Arrays.copyOf(bArr, bArr.length);
    }

    public final void e() {
        if (this.b.a.get()) {
            ib5.a("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zG;
        if (obj instanceof jtw) {
            LinkedHashMap linkedHashMap = ((jtw) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zG = Intrinsics.g(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zG = true;
                                } else {
                                    zG = false;
                                }
                            } else {
                                zG = false;
                            }
                            if (!zG) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void f(zn20.a aVar) {
        aVar.getClass();
        e();
        this.a.remove(aVar);
    }

    public final <T> void g(zn20.a<T> aVar, T t) {
        aVar.getClass();
        h(aVar, t);
    }

    public final void h(zn20.a<?> aVar, Object obj) {
        aVar.getClass();
        e();
        if (obj == null) {
            f(aVar);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.E0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(aVar, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(aVar, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(aVar, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.a0(this.a.entrySet(), ",\n", "{\n", "\n}", a.a, 24);
    }

    public jtw() {
        this(3, false);
    }

    public jtw(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new q11(z);
    }
}
