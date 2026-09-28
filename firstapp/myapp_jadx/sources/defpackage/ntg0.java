package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ntg0 {
    public final o8h a;
    public final xy90 b;
    public final x57 c;
    public final wy60 d;
    public final boolean e;
    public final Map<Object, Object> f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ntg0(o8h o8hVar, xy90 xy90Var, x57 x57Var, wy60 wy60Var, LinkedHashMap linkedHashMap, int i) {
        o8hVar = (i & 1) != 0 ? null : o8hVar;
        xy90Var = (i & 2) != 0 ? null : xy90Var;
        x57Var = (i & 4) != 0 ? null : x57Var;
        wy60Var = (i & 8) != 0 ? null : wy60Var;
        boolean z = (i & 16) == 0;
        Map map = linkedHashMap;
        if ((i & 32) != 0) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            map = o2gVar;
        }
        this(o8hVar, xy90Var, x57Var, wy60Var, z, (Map<Object, Object>) map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntg0)) {
            return false;
        }
        ntg0 ntg0Var = (ntg0) obj;
        return Intrinsics.g(this.a, ntg0Var.a) && Intrinsics.g(this.b, ntg0Var.b) && Intrinsics.g(this.c, ntg0Var.c) && Intrinsics.g(this.d, ntg0Var.d) && this.e == ntg0Var.e && Intrinsics.g(this.f, ntg0Var.f);
    }

    public final int hashCode() {
        o8h o8hVar = this.a;
        int iHashCode = (o8hVar == null ? 0 : o8hVar.hashCode()) * 31;
        xy90 xy90Var = this.b;
        int iHashCode2 = (iHashCode + (xy90Var == null ? 0 : xy90Var.hashCode())) * 31;
        x57 x57Var = this.c;
        int iHashCode3 = (iHashCode2 + (x57Var == null ? 0 : x57Var.hashCode())) * 31;
        wy60 wy60Var = this.d;
        return this.f.hashCode() + mtg0.a((iHashCode3 + (wy60Var != null ? wy60Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public ntg0(o8h o8hVar, xy90 xy90Var, x57 x57Var, wy60 wy60Var, boolean z, Map<Object, Object> map) {
        this.a = o8hVar;
        this.b = xy90Var;
        this.c = x57Var;
        this.d = wy60Var;
        this.e = z;
        this.f = map;
    }
}
