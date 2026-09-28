package defpackage;

import com.appsflyer.internal.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class urt {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final yrt h;
    public final boolean i;

    public urt(long j, String str, String str2, String str3, String str4, long j2, long j3, yrt yrtVar, boolean z) {
        wd7.a(str, str2, str3, str4);
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = j3;
        this.h = yrtVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urt)) {
            return false;
        }
        urt urtVar = (urt) obj;
        return this.a == urtVar.a && Intrinsics.g(this.b, urtVar.b) && Intrinsics.g(this.c, urtVar.c) && Intrinsics.g(this.d, urtVar.d) && Intrinsics.g(this.e, urtVar.e) && this.f == urtVar.f && this.g == urtVar.g && this.h.equals(urtVar.h) && this.i == urtVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + f87.a(f87.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "LoyaltyChallenge(id=", ", type=", this.b);
        hxa.c(sbA, ", status=", this.c, ", title=", this.d);
        u4.a(sbA, ", typeDisplay=", this.e, ", publishedTime=");
        sbA.append(this.f);
        g41.a(this.g, ", unpublishedTime=", ", parameters=", sbA);
        sbA.append(this.h);
        sbA.append(", canParticipate=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
