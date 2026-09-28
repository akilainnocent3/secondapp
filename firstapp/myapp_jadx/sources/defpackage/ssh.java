package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ssh {
    public static final ssh a = new ssh();
    public static final Map<ch80.a, a> b = Collections.synchronizedMap(new LinkedHashMap());

    public static final class a {
        public final tuw a;
        public wrb b = null;

        public a(tuw tuwVar) {
            this.a = tuwVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && Intrinsics.g(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            wrb wrbVar = this.b;
            return iHashCode + (wrbVar == null ? 0 : wrbVar.hashCode());
        }

        public final String toString() {
            return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
        }
    }

    public static a a(ch80.a aVar) {
        Map<ch80.a, a> map = b;
        map.getClass();
        a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        lx5.b(aVar, "Cannot get dependency ", ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008f -> B:30:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.x1b r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.tsh
            if (r0 == 0) goto L13
            r0 = r10
            tsh r0 = (defpackage.tsh) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            tsh r0 = new tsh
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r9 = r0.i
            y5b r10 = defpackage.y5b.a
            int r1 = r0.w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r1 = r0.f
            java.util.Map r4 = r0.e
            tuw r5 = r0.d
            ch80$a r6 = r0.c
            java.util.Iterator r7 = r0.b
            java.util.Map r8 = r0.a
            defpackage.uj50.b(r9)
            goto L90
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L3a:
            defpackage.uj50.b(r9)
            java.util.Map<ch80$a, ssh$a> r9 = defpackage.ssh.b
            r9.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = defpackage.jpu.a(r4)
            r1.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
            r4 = r1
        L5b:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lc1
            java.lang.Object r9 = r7.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            r6 = r5
            ch80$a r6 = (ch80.a) r6
            java.lang.Object r9 = r9.getValue()
            ssh$a r9 = (ssh.a) r9
            tuw r5 = r9.a
            r0.a = r4
            r0.b = r7
            r0.c = r6
            r0.d = r5
            r0.e = r4
            r0.f = r1
            r0.w = r2
            java.lang.Object r9 = r5.d(r0)
            if (r9 != r10) goto L8f
            return r10
        L8f:
            r8 = r4
        L90:
            r6.getClass()     // Catch: java.lang.Throwable -> Lbc
            ssh$a r9 = a(r6)     // Catch: java.lang.Throwable -> Lbc
            wrb r9 = r9.b     // Catch: java.lang.Throwable -> Lbc
            if (r9 == 0) goto La3
            r5.f(r3)
            r4.put(r1, r9)
            r4 = r8
            goto L5b
        La3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = "Subscriber "
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lbc
            r10.append(r6)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = " has not been registered."
            r10.append(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lbc
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lbc
            throw r9     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r9 = move-exception
            r5.f(r3)
            throw r9
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssh.b(x1b):java.lang.Object");
    }
}
