package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ulm extends uj4 {
    public final boolean a;

    public ulm(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulm) && this.a == ((ulm) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return ruw.a(new StringBuilder("HowToPlay(isNewGame="), this.a, ')');
    }
}
