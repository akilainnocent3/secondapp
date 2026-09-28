package defpackage;

import androidx.recyclerview.widget.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iox {
    public final int a;
    public final long b;
    public final long c;
    public final anx d;
    public final iqa0 e;
    public final Object f;

    public /* synthetic */ iox(int i, long j, long j2, anx anxVar, int i2) {
        this((i2 & 1) != 0 ? r.d.DEFAULT_DRAG_ANIMATION_DURATION : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? anx.b : anxVar, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iox)) {
            return false;
        }
        iox ioxVar = (iox) obj;
        return this.a == ioxVar.a && this.b == ioxVar.b && this.c == ioxVar.c && Intrinsics.g(this.d, ioxVar.d) && Intrinsics.g(this.e, ioxVar.e) && Intrinsics.g(this.f, ioxVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.a.hashCode() + f87.a(f87.a(this.a * 31, this.b, 31), this.c, 31)) * 31;
        iqa0 iqa0Var = this.e;
        int iHashCode2 = (iHashCode + (iqa0Var == null ? 0 : iqa0Var.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        sb.append(", responseMillis=");
        sb.append(this.c);
        sb.append(", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        return ekw.a(sb, this.f, ')');
    }

    public iox(int i, long j, long j2, anx anxVar, iqa0 iqa0Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = anxVar;
        this.e = iqa0Var;
        this.f = obj;
    }

    public iox() {
        this(0, 0L, 0L, null, 63);
    }
}
