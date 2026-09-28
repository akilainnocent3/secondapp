package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l3o {
    public final d4o a;
    public final cxn b;
    public final g3o c;
    public final List<rtn> d;

    public l3o(d4o d4oVar, cxn cxnVar, g3o g3oVar, List<rtn> list) {
        d4oVar.getClass();
        list.getClass();
        this.a = d4oVar;
        this.b = cxnVar;
        this.c = g3oVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3o)) {
            return false;
        }
        l3o l3oVar = (l3o) obj;
        return Intrinsics.g(this.a, l3oVar.a) && this.b.equals(l3oVar.b) && this.c.equals(l3oVar.c) && Intrinsics.g(this.d, l3oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InstantRacingSessionData(sportConfig=" + this.a + ", marketInfo=" + this.b + ", roundInfo=" + this.c + ", events=" + this.d + ")";
    }
}
