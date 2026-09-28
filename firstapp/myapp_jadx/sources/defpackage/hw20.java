package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
public final class hw20<P> {
    public final ConcurrentMap<c, List<b<P>>> a;
    public final b<P> b;
    public final e4w c;

    public static class a<P> {
        public final Class<P> a;
        public b<P> c;
        public ConcurrentHashMap b = new ConcurrentHashMap();
        public e4w d = e4w.b;

        public a(Class<P> cls) {
            this.a = cls;
        }

        public final void a(Object obj, Object obj2, mpp.b bVar, boolean z) throws GeneralSecurityException {
            byte[] bArrArray;
            if (this.b == null) {
                ib5.a("addPrimitive cannot be called after build");
                return;
            }
            if (obj == null && obj2 == null) {
                opp.a("at least one of the `fullPrimitive` or `primitive` must be set");
                return;
            }
            if (bVar.z() != zmp.ENABLED) {
                opp.a("only ENABLED key is allowed");
                return;
            }
            ConcurrentHashMap concurrentHashMap = this.b;
            Integer numValueOf = Integer.valueOf(bVar.x());
            if (bVar.y() == uaz.RAW) {
                numValueOf = null;
            }
            b3 b3VarA = ttw.b.a(n630.a(bVar.w().y(), bVar.w().z(), bVar.w().x(), bVar.y(), numValueOf));
            int iOrdinal = bVar.y().ordinal();
            if (iOrdinal == 1) {
                bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(bVar.x()).array();
            } else if (iOrdinal == 2) {
                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.x()).array();
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    opp.a("unknown output prefix type");
                    return;
                }
                bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(bVar.x()).array();
            } else {
                bArrArray = u3c.a;
            }
            b<P> bVar2 = new b<>(obj, obj2, bArrArray, bVar.z(), bVar.y(), bVar.x(), bVar.w().y(), b3VarA);
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar2);
            byte[] bArr = bVar2.c;
            c cVar = new c(Arrays.copyOf(bArr, bArr.length));
            List list = (List) concurrentHashMap.put(cVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(bVar2);
                concurrentHashMap.put(cVar, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.c == null) {
                    this.c = bVar2;
                } else {
                    ib5.a("you cannot set two primary primitives");
                }
            }
        }
    }

    public static final class b<P> {
        public final P a;
        public final P b;
        public final byte[] c;
        public final zmp d;
        public final uaz e;
        public final int f;
        public final String g;
        public final b3 h;

        public b(P p, P p2, byte[] bArr, zmp zmpVar, uaz uazVar, int i, String str, b3 b3Var) {
            this.a = p;
            this.b = p2;
            this.c = Arrays.copyOf(bArr, bArr.length);
            this.d = zmpVar;
            this.e = uazVar;
            this.f = i;
            this.g = str;
            this.h = b3Var;
        }
    }

    public static class c implements Comparable<c> {
        public final byte[] a;

        public c(byte[] bArr) {
            this.a = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            byte[] bArr = this.a;
            int length = bArr.length;
            byte[] bArr2 = cVar2.a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                byte b2 = cVar2.a[i];
                if (b != b2) {
                    return b - b2;
                }
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.a);
        }

        public final String toString() {
            return hjl.b(this.a);
        }
    }

    public hw20(ConcurrentMap<c, List<b<P>>> concurrentMap, b<P> bVar, e4w e4wVar, Class<P> cls) {
        this.a = concurrentMap;
        this.b = bVar;
        this.c = e4wVar;
    }

    public final List<b<P>> a(byte[] bArr) {
        List<b<P>> list = this.a.get(new c(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
