package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class kmj {
    public final boolean a;
    public final long b;
    public final String c;

    public kmj(boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = n380.a().nextBoolean() ? "lightning" : "ufo";
    }

    public final long a() {
        return this.b + 1200;
    }

    public final long b() {
        return this.b + 300;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameParameters{canWin=");
        sb.append(this.a);
        sb.append(", defenseStrategy='");
        String str = this.c;
        sb.append(str);
        sb.append("', timestampFlingStart=");
        em5.a(this.b, ", durationFling=300, durationDrop=900, defenseStrategy=", str, sb);
        sb.append('}');
        return sb.toString();
    }
}
