package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class taz implements oaz.a {
    public final Object a;

    public taz(Object obj) {
        this.a = obj;
    }

    @Override // oaz.a
    public void b(Surface surface) {
        if (i() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!j()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof taz)) {
            return false;
        }
        return this.a.equals(((taz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public Surface i() {
        throw null;
    }

    public boolean j() {
        throw null;
    }

    @Override // oaz.a
    public void a(long j) {
    }

    @Override // oaz.a
    public void g(int i) {
    }
}
