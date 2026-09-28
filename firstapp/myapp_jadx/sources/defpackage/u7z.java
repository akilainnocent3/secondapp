package defpackage;

import com.sportybet.plugin.realsports.data.BoreDrawConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class u7z {
    public final t7z a;
    public final BoreDrawConfig b;

    public u7z(t7z t7zVar, BoreDrawConfig boreDrawConfig) {
        this.a = t7zVar;
        this.b = boreDrawConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7z)) {
            return false;
        }
        u7z u7zVar = (u7z) obj;
        return this.a.equals(u7zVar.a) && this.b.equals(u7zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OutComeDataWithBoreDrawConfig(outComeData=" + this.a + ", boreDrawConfig=" + this.b + ")";
    }
}
