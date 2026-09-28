package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dun {
    public final cxn a;
    public final g3o b;
    public final List<rtn> c;

    public dun(cxn cxnVar, g3o g3oVar, List<rtn> list) {
        list.getClass();
        this.a = cxnVar;
        this.b = g3oVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dun)) {
            return false;
        }
        dun dunVar = (dun) obj;
        return this.a.equals(dunVar.a) && this.b.equals(dunVar.b) && Intrinsics.g(this.c, dunVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantRacingEventInfo(marketInfo=");
        sb.append(this.a);
        sb.append(", roundInfo=");
        sb.append(this.b);
        sb.append(", events=");
        return ng1.a(sb, this.c, ")");
    }
}
