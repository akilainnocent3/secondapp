package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ig90 {
    public static final Integer a(zzr zzrVar, osw oswVar) {
        Object next;
        Iterator<T> it = zzrVar.j().k().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((zyr) next).getKey(), "tab"));
        zyr zyrVar = (zyr) next;
        if (zyrVar != null) {
            int iA = zyrVar.a();
            oswVar.k(iA);
            return Integer.valueOf(iA);
        }
        int iD = oswVar.D();
        Integer numValueOf = Integer.valueOf(iD);
        if (iD >= 0) {
            return numValueOf;
        }
        return null;
    }
}
