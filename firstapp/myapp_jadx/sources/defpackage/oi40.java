package defpackage;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class oi40 extends u88 {
    public final List<ri40> c;

    public oi40(List<ri40> list) {
        list.getClass();
        this.c = list;
    }

    @Override // defpackage.u88
    public final int a() {
        return 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi40) && Intrinsics.g(this.c, ((oi40) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return p.a("RecommendCodeComment(recommendCodes=", ")", this.c);
    }

    public oi40() {
        this(m2g.a);
    }
}
