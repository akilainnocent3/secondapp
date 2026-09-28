package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class ui20 extends b380 {
    public final String b;
    public final ArrayList c;

    public ui20(String str, ArrayList arrayList) {
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
        if (!(obj instanceof ui20)) {
            return false;
        }
        ui20 ui20Var = (ui20) obj;
        return this.b.equals(ui20Var.b) && this.c.equals(ui20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PreMatchSection(title=" + this.b + ", events=" + this.c + ")";
    }
}
