package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sci implements cfi {
    public final List<gci> a;

    public sci(List<gci> list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sci) && Intrinsics.g(this.a, ((sci) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p.a("FootballFamilySettlementMyEventsTabContentState(eventStates=", ")", this.a);
    }
}
