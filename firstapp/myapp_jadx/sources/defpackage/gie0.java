package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gie0 {
    public final HashMap a;
    public final HashMap b;
    public final int c;

    public gie0(HashMap map, HashMap map2, int i) {
        this.a = map;
        this.b = map2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gie0)) {
            return false;
        }
        gie0 gie0Var = (gie0) obj;
        return this.a.equals(gie0Var.a) && this.b.equals(gie0Var.b) && this.c == gie0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return rr1.b(sb, this.c, ')');
    }
}
