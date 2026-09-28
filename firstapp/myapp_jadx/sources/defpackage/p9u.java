package defpackage;

import com.sporty.android.core.model.luckywheel.LuckyWheelColor;

/* JADX INFO: loaded from: classes5.dex */
public final class p9u {
    public final LuckyWheelColor a;
    public final int b;
    public final float c;

    public p9u(LuckyWheelColor luckyWheelColor, int i, float f) {
        luckyWheelColor.getClass();
        this.a = luckyWheelColor;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9u)) {
            return false;
        }
        p9u p9uVar = (p9u) obj;
        return this.a == p9uVar.a && this.b == p9uVar.b && Float.compare(this.c, p9uVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LuckyWheelPrizeData(color=");
        sb.append(this.a);
        sb.append(", prizeAmount=");
        sb.append(this.b);
        sb.append(", degree=");
        return wi1.a(this.c, ")", sb);
    }
}
