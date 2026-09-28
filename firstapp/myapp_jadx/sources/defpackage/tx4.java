package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tx4 {
    public final List<sx4> a;

    public tx4(Object obj) {
        List<sx4> listK = b.k(new sx4(px4.c.a, rx4.a), new sx4(px4.a.a, rx4.b), new sx4(px4.b.a, rx4.c));
        listK.getClass();
        this.a = listK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx4) && Intrinsics.g(this.a, ((tx4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p.a("BookingCodeEmptyUiState(guides=", ")", this.a);
    }

    public tx4() {
        this(null);
    }
}
