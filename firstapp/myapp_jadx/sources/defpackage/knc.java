package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class knc {
    public final boolean a;
    public final long b;
    public final long c;

    public knc(boolean z, long j, long j2) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knc)) {
            return false;
        }
        knc kncVar = (knc) obj;
        return this.a == kncVar.a && this.b == kncVar.b && this.c == kncVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + f87.a(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyRewardRecord(isAccumulate=");
        sb.append(this.a);
        sb.append(", dailyRewardStartDate=");
        sb.append(this.b);
        return zug.a(this.c, ", dailyRewardEndDate=", ")", sb);
    }
}
