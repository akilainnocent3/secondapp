package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class kkh {
    public final boolean a;
    public final boolean b;
    public final cxz c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map<ygp<?>, Object> h;

    public kkh(boolean z, boolean z2, cxz cxzVar, Long l, Long l2, Long l3, Long l4, Map<ygp<?>, ? extends Object> map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = cxzVar;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = kpu.l(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map<ygp<?>, Object> map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt.a0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kkh(boolean z, boolean z2, cxz cxzVar, Long l, Long l2, Long l3, Long l4) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this(z, z2, cxzVar, l, l2, l3, l4, o2gVar);
    }
}
