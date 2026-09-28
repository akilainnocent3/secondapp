package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z450 {
    public final List<f450> a;

    public z450(List<f450> list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z450) && Intrinsics.g(this.a, ((z450) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p.a("RemixBetUiState(pages=", ")", this.a);
    }
}
