package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nmw {
    public static final nmw g = new nmw(m2g.a, "");
    public final List<cz2> a;
    public final String b;
    public final LinkedHashMap c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[EDGE_INSN: B:26:0x0073->B:27:0x0074 BREAK  A[LOOP:1: B:21:0x005f->B:48:?]] */
    public nmw(List<cz2> list, String str) {
        boolean z;
        list.getClass();
        str.getClass();
        this.a = list;
        this.b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str2 = ((cz2) obj).a;
            Object objA = linkedHashMap.get(str2);
            if (objA == null) {
                objA = r9i.a(str2, linkedHashMap);
            }
            ((List) objA).add(obj);
        }
        this.c = linkedHashMap;
        boolean z2 = false;
        boolean z3 = linkedHashMap.size() >= 2;
        this.d = z3;
        if (!z3) {
            z = false;
            break;
        }
        Collection collectionValues = linkedHashMap.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((List) it.next()).size() > 1) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        this.e = z;
        if (this.d) {
            Collection collectionValues2 = this.c.values();
            if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                z2 = true;
            } else {
                Iterator it2 = collectionValues2.iterator();
                while (it2.hasNext()) {
                    if (((List) it2.next()).size() == 1) {
                    }
                }
                z2 = true;
            }
        }
        this.f = z2;
    }

    public static nmw a(nmw nmwVar, String str) {
        List<cz2> list = nmwVar.a;
        nmwVar.getClass();
        list.getClass();
        str.getClass();
        return new nmw(list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmw)) {
            return false;
        }
        nmw nmwVar = (nmw) obj;
        return Intrinsics.g(this.a, nmwVar.a) && Intrinsics.g(this.b, nmwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MultipleBetData(betSelections=" + this.a + ", stakePerBet=" + this.b + ")";
    }
}
