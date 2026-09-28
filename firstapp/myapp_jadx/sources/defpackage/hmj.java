package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hmj extends uj4 {
    public final String a;
    public final double b;
    public final String c;

    public hmj(double d, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = d;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmj)) {
            return false;
        }
        hmj hmjVar = (hmj) obj;
        return Intrinsics.g(this.a, hmjVar.a) && Double.compare(this.b, hmjVar.b) == 0 && Intrinsics.g(this.c, hmjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nrg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameOverWithRewards(gameName=");
        sb.append(this.a);
        sb.append(", rewardValue=");
        sb.append(this.b);
        sb.append(", currency=");
        return j26.a(sb, this.c, ')');
    }
}
