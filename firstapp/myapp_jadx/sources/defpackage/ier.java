package defpackage;

import androidx.media3.exoplayer.d;

/* JADX INFO: loaded from: classes6.dex */
public final class ier {
    public final d a;

    public ier(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ier) && this.a == ((ier) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LNStablePlayer(player=" + this.a + ")";
    }
}
