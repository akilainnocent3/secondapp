package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vdw {
    public static final vdw b = new vdw(1.0f);
    public final float a;

    public vdw(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdw) && Float.compare(this.a, ((vdw) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "MultiLevelRoundBarScale(factor=" + this.a + ")";
    }
}
