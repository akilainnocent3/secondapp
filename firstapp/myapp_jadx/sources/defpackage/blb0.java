package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class blb0 {
    public final imf0 a;
    public final imf0 b;
    public final imf0 c;
    public final imf0 d;

    public blb0(int i) {
        imf0 imf0Var = new imf0(0L, 0L, t9i.B, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        imf0 imf0Var2 = new imf0(0L, 0L, t9i.C, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        imf0 imf0Var3 = new imf0(0L, 0L, t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        imf0 imf0Var4 = new imf0(0L, 0L, t9i.G, null, null, 0L, null, null, 0, 0L, null, null, 16777211);
        this.a = imf0Var;
        this.b = imf0Var2;
        this.c = imf0Var3;
        this.d = imf0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blb0)) {
            return false;
        }
        blb0 blb0Var = (blb0) obj;
        return Intrinsics.g(this.a, blb0Var.a) && Intrinsics.g(this.b, blb0Var.b) && Intrinsics.g(this.c, blb0Var.c) && Intrinsics.g(this.d, blb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gg8.b(gg8.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SportyCampaignTypography(regular=" + this.a + ", medium=" + this.b + ", bold=" + this.c + ", extraBold=" + this.d + ")";
    }
}
