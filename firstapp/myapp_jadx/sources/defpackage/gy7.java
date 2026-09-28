package defpackage;

import com.appsflyer.internal.w;
import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gy7 {
    public final String a;
    public final long b;
    public boolean c;

    public gy7(String str, long j, boolean z) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy7)) {
            return false;
        }
        gy7 gy7Var = (gy7) obj;
        return Intrinsics.g(this.a, gy7Var.a) && this.b == gy7Var.b && this.c == gy7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return w.a(x.a(this.b, "CodeHubFilterTimeUiOptionHolder(label=", this.a, ", time="), ", tick=", this.c, ")");
    }
}
