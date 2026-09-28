package defpackage;

import com.sporty.android.book.domain.entity.MarketingServiceType;

/* JADX INFO: loaded from: classes7.dex */
public final class isu {
    public final MarketingServiceType a;
    public final jsu b;

    public isu(MarketingServiceType marketingServiceType, jsu jsuVar) {
        marketingServiceType.getClass();
        this.a = marketingServiceType;
        this.b = jsuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isu)) {
            return false;
        }
        isu isuVar = (isu) obj;
        return this.a == isuVar.a && this.b == isuVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarketingServiceValidationResult(type=" + this.a + ", state=" + this.b + ")";
    }
}
