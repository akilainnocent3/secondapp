package de;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u> f78941a;

    public d(List<u> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f78941a = list;
    }

    @Override // de.n
    @NonNull
    @uk.a.InterfaceC1443a(name = "logRequest")
    public List<u> c() {
        return this.f78941a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f78941a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f78941a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f78941a + "}";
    }
}
