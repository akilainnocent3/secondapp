package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h3o {
    public final rtn a;
    public final fun b;
    public final gun c;

    public h3o(rtn rtnVar, fun funVar, gun gunVar) {
        rtnVar.getClass();
        funVar.getClass();
        this.a = rtnVar;
        this.b = funVar;
        this.c = gunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3o)) {
            return false;
        }
        h3o h3oVar = (h3o) obj;
        return Intrinsics.g(this.a, h3oVar.a) && Intrinsics.g(this.b, h3oVar.b) && this.c.equals(h3oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InstantRacingSelection(event=" + this.a + ", market=" + this.b + ", outcome=" + this.c + ")";
    }
}
