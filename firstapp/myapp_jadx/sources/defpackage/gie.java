package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gie {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;

    public gie(int i, int i2, int i3, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gie)) {
            return false;
        }
        gie gieVar = (gie) obj;
        return this.a.equals(gieVar.a) && this.b == gieVar.b && this.c == gieVar.c && this.d == gieVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DevicesList(devices=");
        sb.append(this.a);
        sb.append(", pageNo=");
        sb.append(this.b);
        sb.append(", totalPages=");
        return b7f.a(sb, this.c, ", totalNum=", this.d, ")");
    }
}
