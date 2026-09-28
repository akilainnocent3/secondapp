package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hvw {
    public final List<fof0> a;

    public hvw(List<fof0> list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvw) && Intrinsics.g(this.a, ((hvw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p.a("MyBetslipThemesUiModel(categories=", ")", this.a);
    }
}
