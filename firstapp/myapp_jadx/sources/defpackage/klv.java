package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class klv {
    public final int a;
    public final int b;
    public final llv c;
    public final String d;

    public klv(int i, int i2, llv llvVar, String str) {
        llvVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = llvVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klv)) {
            return false;
        }
        klv klvVar = (klv) obj;
        return this.a == klvVar.a && this.b == klvVar.b && Intrinsics.g(this.c, klvVar.c) && this.d.equals(klvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("MeetingMatchesRecord(backgroundColorResId=", this.a, this.b, ", textColorResId=", ", result=");
        sbA.append(this.c);
        sbA.append(", fullTimeScoreText=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
