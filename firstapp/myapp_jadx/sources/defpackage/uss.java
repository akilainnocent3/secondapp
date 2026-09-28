package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class uss extends b380 {
    public final String b;
    public final ArrayList c;

    public uss(String str, ArrayList arrayList) {
        super(str);
        this.b = str;
        this.c = arrayList;
    }

    @Override // defpackage.b380
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uss)) {
            return false;
        }
        uss ussVar = (uss) obj;
        return this.b.equals(ussVar.b) && this.c.equals(ussVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "LiveSection(title=" + this.b + ", events=" + this.c + ")";
    }
}
