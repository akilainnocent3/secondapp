package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cfy {
    public static final p8q.b a(p8q p8qVar, q7q.b bVar) {
        if (p8qVar instanceof p8q.b) {
            p8q.b bVar2 = (p8q.b) p8qVar;
            if (bVar == null) {
                bVar = bVar2.a;
            }
            return p8q.b.a(bVar2, bVar, null, true, 10);
        }
        if (Intrinsics.g(p8qVar, p8q.c.a) || Intrinsics.g(p8qVar, p8q.a.a)) {
            return new p8q.b(bVar, null, true, 0L);
        }
        uhc.a();
        return null;
    }

    public static final p8q b(p8q p8qVar, q7q.b bVar) {
        if (p8qVar instanceof p8q.b) {
            return p8q.b.a((p8q.b) p8qVar, bVar, null, false, 14);
        }
        if (Intrinsics.g(p8qVar, p8q.c.a) || Intrinsics.g(p8qVar, p8q.a.a)) {
            return p8qVar;
        }
        uhc.a();
        return null;
    }

    public static final p8q c(p8q p8qVar) {
        if (p8qVar instanceof p8q.b) {
            return p8q.b.a((p8q.b) p8qVar, null, null, false, 9);
        }
        if (Intrinsics.g(p8qVar, p8q.c.a) || Intrinsics.g(p8qVar, p8q.a.a)) {
            return p8qVar;
        }
        uhc.a();
        return null;
    }
}
