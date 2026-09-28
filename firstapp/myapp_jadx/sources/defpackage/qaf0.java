package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class qaf0 {
    public final uxs a;
    public final boolean b;

    public qaf0(uxs uxsVar, boolean z) {
        this.a = uxsVar;
        this.b = z;
    }

    public static qaf0 a(qaf0 qaf0Var, uxs uxsVar, boolean z, int i) {
        if ((i & 1) != 0) {
            uxsVar = qaf0Var.a;
        }
        if ((i & 2) != 0) {
            z = qaf0Var.b;
        }
        qaf0Var.getClass();
        uxsVar.getClass();
        return new qaf0(uxsVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaf0)) {
            return false;
        }
        qaf0 qaf0Var = (qaf0) obj;
        return this.a == qaf0Var.a && this.b == qaf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TelegramBindingUiState(buttonStatus=" + this.a + ", isBound=" + this.b + ")";
    }

    public qaf0() {
        this(0);
    }

    public /* synthetic */ qaf0(int i) {
        this(uxs.ENABLE, false);
    }
}
