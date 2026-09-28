package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gdi implements hdi {
    public final String a;
    public final String b;

    public gdi(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.hdi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.hdi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdi)) {
            return false;
        }
        gdi gdiVar = (gdi) obj;
        return Intrinsics.g(this.a, gdiVar.a) && Intrinsics.g(this.b, gdiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("Running(homeTeamScoreText=", this.a, ", awayTeamScoreText=", this.b, ")");
    }
}
