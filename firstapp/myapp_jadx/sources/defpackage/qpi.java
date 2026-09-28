package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qpi {
    public final uxs a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ qpi(int i, boolean z) {
        this(uxs.DISABLE, (i & 2) != 0 ? false : z, false);
    }

    public static qpi a(qpi qpiVar, uxs uxsVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            uxsVar = qpiVar.a;
        }
        if ((i & 2) != 0) {
            z = qpiVar.b;
        }
        if ((i & 4) != 0) {
            z2 = qpiVar.c;
        }
        qpiVar.getClass();
        uxsVar.getClass();
        return new qpi(uxsVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpi)) {
            return false;
        }
        qpi qpiVar = (qpi) obj;
        return this.a == qpiVar.a && this.b == qpiVar.b && this.c == qpiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FooterState(proceedButtonStatus=");
        sb.append(this.a);
        sb.append(", isBankLinkingChecked=");
        sb.append(this.b);
        sb.append(", isPendingDepositsButtonsVisible=");
        return mq0.a(sb, this.c, ")");
    }

    public qpi(uxs uxsVar, boolean z, boolean z2) {
        this.a = uxsVar;
        this.b = z;
        this.c = z2;
    }

    public qpi() {
        this(7, false);
    }
}
