package bh;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q implements o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f21450f = new q(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, byte[]> f21452e;

    public q() {
        this(Collections.EMPTY_MAP);
    }

    public static void a(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), e(entry.getValue()));
        }
    }

    public static Map<String, byte[]> b(Map<String, byte[]> map, p pVar) {
        HashMap map2 = new HashMap(map);
        g(map2, pVar.c());
        a(map2, pVar.b());
        return map2;
    }

    public static byte[] e(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(zi.f.f161720c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean f(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void g(HashMap<String, byte[]> map, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.remove(list.get(i10));
        }
    }

    public q c(p pVar) {
        Map<String, byte[]> mapB = b(this.f21452e, pVar);
        return f(this.f21452e, mapB) ? this : new q(mapB);
    }

    @Override // bh.o
    public final boolean contains(String str) {
        return this.f21452e.containsKey(str);
    }

    public Set<Map.Entry<String, byte[]>> d() {
        return this.f21452e.entrySet();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return f(this.f21452e, ((q) obj).f21452e);
    }

    @Override // bh.o
    @Nullable
    public final byte[] get(String str, @Nullable byte[] bArr) {
        byte[] bArr2 = this.f21452e.get(str);
        return bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : bArr;
    }

    public int hashCode() {
        if (this.f21451d == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f21452e.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f21451d = iHashCode;
        }
        return this.f21451d;
    }

    public q(Map<String, byte[]> map) {
        this.f21452e = Collections.unmodifiableMap(map);
    }

    @Override // bh.o
    @Nullable
    public final String get(String str, @Nullable String str2) {
        byte[] bArr = this.f21452e.get(str);
        return bArr != null ? new String(bArr, zi.f.f161720c) : str2;
    }

    @Override // bh.o
    public final long get(String str, long j10) {
        byte[] bArr = this.f21452e.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }
}
