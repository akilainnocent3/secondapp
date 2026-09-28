package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class bm80 {
    public final boolean a;
    public final boolean b;

    public bm80(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm80)) {
            return false;
        }
        bm80 bm80Var = (bm80) obj;
        return this.a == bm80Var.a && this.b == bm80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SettingsState(deviceManagementEnabled=" + this.a + ", shouldShowDeviceManagementHint=" + this.b + ")";
    }

    public bm80() {
        this(false, false);
    }
}
