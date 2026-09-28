package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vh1 extends ktb.e.d.f {
    public final List<ktb.e.d.AbstractC0793e> a;

    public vh1(List<ktb.e.d.AbstractC0793e> list) {
        this.a = list;
    }

    @Override // ktb.e.d.f
    public final List<ktb.e.d.AbstractC0793e> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktb.e.d.f) {
            return this.a.equals(((ktb.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ng1.a(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
