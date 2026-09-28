package defpackage;

import com.appsflyer.internal.b0;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class iz6 {
    public final long a;
    public final String b;
    public final UiText c;
    public final Long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final UiText j;
    public final UiText k;
    public final ChallengeCardStatus l;
    public final ChallengeType m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final uz6 q;
    public final int r;
    public final boolean s;

    public iz6(long j, String str, UiText uiText, Long l, long j2, String str2, String str3, int i, int i2, UiText uiText2, UiText uiText3, ChallengeCardStatus challengeCardStatus, ChallengeType challengeType, boolean z, String str4, uz6 uz6Var, int i3, int i4) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? vch0.a : uiText, (i4 & 8) != 0 ? null : l, (i4 & 16) != 0 ? 0L : j2, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? 0 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? vch0.a : uiText2, (i4 & 1024) != 0 ? vch0.a : uiText3, (i4 & 2048) != 0 ? ChallengeCardStatus.Available : challengeCardStatus, (i4 & 4096) != 0 ? ChallengeType.UNKNOWN : challengeType, false, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z, (32768 & i4) != 0 ? null : str4, (65536 & i4) != 0 ? null : uz6Var, (i4 & 131072) != 0 ? 0 : i3, true);
    }

    public static iz6 a(iz6 iz6Var, StringUiText stringUiText, StringUiText stringUiText2, ChallengeCardStatus challengeCardStatus, boolean z, boolean z2, int i) {
        long j = iz6Var.a;
        String str = iz6Var.b;
        UiText uiText = (i & 4) != 0 ? iz6Var.c : stringUiText;
        Long l = iz6Var.d;
        long j2 = iz6Var.e;
        String str2 = iz6Var.f;
        String str3 = iz6Var.g;
        int i2 = iz6Var.h;
        int i3 = iz6Var.i;
        UiText uiText2 = (i & 512) != 0 ? iz6Var.j : stringUiText2;
        UiText uiText3 = iz6Var.k;
        ChallengeCardStatus challengeCardStatus2 = (i & 2048) != 0 ? iz6Var.l : challengeCardStatus;
        ChallengeType challengeType = iz6Var.m;
        boolean z3 = (i & 8192) != 0 ? iz6Var.n : z;
        boolean z4 = iz6Var.o;
        String str4 = (i & 32768) != 0 ? iz6Var.p : "https://sportybet.com/bet";
        uz6 uz6Var = iz6Var.q;
        int i4 = iz6Var.r;
        boolean z5 = (i & 262144) != 0 ? iz6Var.s : z2;
        iz6Var.getClass();
        str.getClass();
        uiText.getClass();
        str2.getClass();
        str3.getClass();
        uiText2.getClass();
        uiText3.getClass();
        challengeCardStatus2.getClass();
        challengeType.getClass();
        return new iz6(j, str, uiText, l, j2, str2, str3, i2, i3, uiText2, uiText3, challengeCardStatus2, challengeType, z3, z4, str4, uz6Var, i4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz6)) {
            return false;
        }
        iz6 iz6Var = (iz6) obj;
        return this.a == iz6Var.a && Intrinsics.g(this.b, iz6Var.b) && Intrinsics.g(this.c, iz6Var.c) && Intrinsics.g(this.d, iz6Var.d) && this.e == iz6Var.e && Intrinsics.g(this.f, iz6Var.f) && Intrinsics.g(this.g, iz6Var.g) && this.h == iz6Var.h && this.i == iz6Var.i && Intrinsics.g(this.j, iz6Var.j) && Intrinsics.g(this.k, iz6Var.k) && this.l == iz6Var.l && this.m == iz6Var.m && this.n == iz6Var.n && this.o == iz6Var.o && Intrinsics.g(this.p, iz6Var.p) && Intrinsics.g(this.q, iz6Var.q) && this.r == iz6Var.r && this.s == iz6Var.s;
    }

    public final int hashCode() {
        int iA = yvf.a(gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iA2 = mtg0.a(mtg0.a((this.m.hashCode() + ((this.l.hashCode() + yvf.a(yvf.a(gpp.a(this.i, gpp.a(this.h, gmf0.a(gmf0.a(f87.a((iA + (l == null ? 0 : l.hashCode())) * 31, this.e, 31), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k)) * 31)) * 31, 31, this.n), 31, this.o);
        String str = this.p;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        uz6 uz6Var = this.q;
        return Boolean.hashCode(this.s) + gpp.a(this.r, (iHashCode + (uz6Var != null ? uz6Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "ChallengeCardUiModel(id=", ", headerBgUrl=", this.b);
        sbA.append(", endTimeLabel=");
        sbA.append(this.c);
        sbA.append(", expireTime=");
        sbA.append(this.d);
        g41.a(this.e, ", unpublishedTime=", ", prizeAmount=", sbA);
        hxa.c(sbA, this.f, ", cardTitle=", this.g, ", topRankLimit=");
        d5d.a(sbA, this.h, ", participantCount=", this.i, ", participantCountText=");
        vh8.a(sbA, this.j, ", lastAcceptanceTime=", this.k, ", cardStatus=");
        sbA.append(this.l);
        sbA.append(", challengeType=");
        sbA.append(this.m);
        sbA.append(", isDetailsExpanded=");
        nng.a(", isLeaderboardUnlocked=", ", betUrl=", sbA, this.n, this.o);
        sbA.append(this.p);
        sbA.append(", detail=");
        sbA.append(this.q);
        sbA.append(", leaderboardTierTitleResId=");
        sbA.append(this.r);
        sbA.append(", isLoggedIn=");
        sbA.append(this.s);
        sbA.append(")");
        return sbA.toString();
    }

    public iz6() {
        this(0L, null, null, null, 0L, null, null, 0, 0, null, null, null, null, false, null, null, 0, 524287);
    }

    public iz6(long j, String str, UiText uiText, Long l, long j2, String str2, String str3, int i, int i2, UiText uiText2, UiText uiText3, ChallengeCardStatus challengeCardStatus, ChallengeType challengeType, boolean z, boolean z2, String str4, uz6 uz6Var, int i3, boolean z3) {
        str.getClass();
        uiText.getClass();
        str2.getClass();
        str3.getClass();
        uiText2.getClass();
        uiText3.getClass();
        challengeCardStatus.getClass();
        challengeType.getClass();
        this.a = j;
        this.b = str;
        this.c = uiText;
        this.d = l;
        this.e = j2;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = i2;
        this.j = uiText2;
        this.k = uiText3;
        this.l = challengeCardStatus;
        this.m = challengeType;
        this.n = z;
        this.o = z2;
        this.p = str4;
        this.q = uz6Var;
        this.r = i3;
        this.s = z3;
    }
}
