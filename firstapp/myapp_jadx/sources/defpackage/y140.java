package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y140 {
    public final List<c140> a;

    /* JADX WARN: Multi-variable type inference failed */
    public y140(List<? extends c140> list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y140) && Intrinsics.g(this.a, ((y140) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p.a("ReachedLimitsUiState(reachedLimits=", ")", this.a);
    }

    public y140() {
        this(0);
    }

    public y140(int i) {
        this(m2g.a);
    }
}
