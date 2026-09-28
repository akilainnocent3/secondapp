package defpackage;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;

/* JADX INFO: loaded from: classes4.dex */
public final class hj1 extends o9s {
    public final String a;
    public final String b;

    public hj1(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            bmy.a("Null version");
            throw null;
        }
    }

    @Override // defpackage.o9s
    public final String a() {
        return this.a;
    }

    @Override // defpackage.o9s
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o9s)) {
            return false;
        }
        o9s o9sVar = (o9s) obj;
        return this.a.equals(o9sVar.a()) && this.b.equals(o9sVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return uf80.a(sb, this.b, dLRYz.oSpAHA);
    }
}
