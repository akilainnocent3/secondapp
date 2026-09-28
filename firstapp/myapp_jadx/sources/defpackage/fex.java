package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fex {
    public final zsp a;
    public final m7l b;

    public fex(zsp zspVar, m7l m7lVar) {
        zspVar.getClass();
        m7lVar.getClass();
        this.a = zspVar;
        this.b = m7lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fex)) {
            return false;
        }
        fex fexVar = (fex) obj;
        return Intrinsics.g(this.a, fexVar.a) && Intrinsics.g(this.b, fexVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NameUpdateUiState(kycHintState=" + this.a + ", grayListUiState=" + this.b + ")";
    }

    public fex() {
        this(0);
    }

    public /* synthetic */ fex(int i) {
        this(new zsp(null, 7), m7l.c.a);
    }
}
