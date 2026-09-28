package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class viy {
    public final sgy a;
    public final liy b;
    public final boolean c;

    public viy(sgy sgyVar, liy liyVar, boolean z) {
        sgyVar.getClass();
        this.a = sgyVar;
        this.b = liyVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viy)) {
            return false;
        }
        viy viyVar = (viy) obj;
        return Intrinsics.g(this.a, viyVar.a) && this.b.equals(viyVar.b) && this.c == viyVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OddsFilterState(buttonState=");
        sb.append(this.a);
        sb.append(", panelState=");
        sb.append(this.b);
        sb.append(", panelVisible=");
        return mq0.a(sb, this.c, ")");
    }
}
