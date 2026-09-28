package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mi1 extends ril {
    public final String a;
    public final ArrayList b;

    public mi1(String str, ArrayList arrayList) {
        if (str == null) {
            bmy.a("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.ril
    public final List<String> a() {
        return this.b;
    }

    @Override // defpackage.ril
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ril)) {
            return false;
        }
        ril rilVar = (ril) obj;
        return this.a.equals(rilVar.b()) && this.b.equals(rilVar.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
