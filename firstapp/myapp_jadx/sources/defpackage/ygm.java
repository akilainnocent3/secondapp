package defpackage;

import com.appsflyer.internal.w;
import com.appsflyer.internal.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ygm {
    public final String a;
    public final long b;
    public final boolean c;

    public ygm(String str, long j, boolean z) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygm)) {
            return false;
        }
        ygm ygmVar = (ygm) obj;
        return Intrinsics.g(this.a, ygmVar.a) && this.b == ygmVar.b && this.c == ygmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return w.a(x.a(this.b, "HomeShortcutEntity(shortcutId=", this.a, ", createdAt="), ", asDefault=", this.c, ")");
    }

    public /* synthetic */ ygm(String str, boolean z) {
        this(str, System.nanoTime(), z);
    }
}
