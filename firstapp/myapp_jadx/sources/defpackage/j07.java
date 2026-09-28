package defpackage;

import com.appsflyer.internal.b0;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class j07 {
    public static final b Companion = new b();
    public static final ttr<php<Object>>[] j;
    public final long a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final ChallengeCardStatus g;
    public final ChallengeType h;
    public final int i;

    @fae
    public static final /* synthetic */ class a implements o1k<j07> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.loyalty.impl.challenge.presentation.navigation.ChallengeLeaderboard", aVar, 9);
            kr10Var.j("challengeId", false);
            kr10Var.j("cardTitle", false);
            kr10Var.j("tierTitleResId", false);
            kr10Var.j("expireTime", false);
            kr10Var.j("unpublishedTime", false);
            kr10Var.j("topRankLimit", false);
            kr10Var.j("cardStatus", false);
            kr10Var.j("challengeType", false);
            kr10Var.j("participantCount", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            ttr<php<Object>>[] ttrVarArr = j07.j;
            okt oktVar = okt.a;
            hxo hxoVar = hxo.a;
            return new php[]{oktVar, gae0.a, hxoVar, oktVar, oktVar, hxoVar, ttrVarArr[6].getValue(), ttrVarArr[7].getValue(), hxoVar};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = j07.j;
            Object obj = null;
            long jR = 0;
            long jR2 = 0;
            long jR3 = 0;
            ChallengeCardStatus challengeCardStatus = null;
            ChallengeType challengeType = null;
            String strJ = null;
            int i = 0;
            int iM = 0;
            int iM2 = 0;
            int iM3 = 0;
            boolean z = true;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                switch (iV) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        jR = dmaVarC.r(pd80Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        strJ = dmaVarC.j(pd80Var, 1);
                        i |= 2;
                        break;
                    case 2:
                        iM = dmaVarC.m(pd80Var, 2);
                        i |= 4;
                        break;
                    case 3:
                        jR2 = dmaVarC.r(pd80Var, 3);
                        i |= 8;
                        break;
                    case 4:
                        jR3 = dmaVarC.r(pd80Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        iM2 = dmaVarC.m(pd80Var, 5);
                        i |= 32;
                        break;
                    case 6:
                        challengeCardStatus = (ChallengeCardStatus) dmaVarC.y(pd80Var, 6, ttrVarArr[6].getValue(), challengeCardStatus);
                        i |= 64;
                        break;
                    case 7:
                        challengeType = (ChallengeType) dmaVarC.y(pd80Var, 7, ttrVarArr[7].getValue(), challengeType);
                        i |= 128;
                        break;
                    case 8:
                        iM3 = dmaVarC.m(pd80Var, 8);
                        i |= 256;
                        break;
                    default:
                        jtf0.a(iV);
                        return obj;
                }
                obj = null;
            }
            dmaVarC.b(pd80Var);
            return new j07(i, jR, strJ, iM, jR2, jR3, iM2, challengeCardStatus, challengeType, iM3);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            j07 j07Var = (j07) obj;
            j07Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = j07.j;
            fmaVarC.f(pd80Var, 0, j07Var.a);
            fmaVarC.o(pd80Var, 1, j07Var.b);
            fmaVarC.A(2, j07Var.c, pd80Var);
            fmaVarC.f(pd80Var, 3, j07Var.d);
            fmaVarC.f(pd80Var, 4, j07Var.e);
            fmaVarC.A(5, j07Var.f, pd80Var);
            fmaVarC.q(pd80Var, 6, ttrVarArr[6].getValue(), j07Var.g);
            fmaVarC.q(pd80Var, 7, ttrVarArr[7].getValue(), j07Var.h);
            fmaVarC.A(8, j07Var.i, pd80Var);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<j07> serializer() {
            return a.a;
        }
    }

    static {
        a1s a1sVar = a1s.b;
        j = new ttr[]{null, null, null, null, null, null, hwr.a(a1sVar, new h07()), hwr.a(a1sVar, new i07(0)), null};
    }

    public /* synthetic */ j07(int i, long j2, String str, int i2, long j3, long j4, int i3, ChallengeCardStatus challengeCardStatus, ChallengeType challengeType, int i4) {
        if (511 != (i & 511)) {
            cgo.a(i, 511, a.a.getDescriptor());
            throw null;
        }
        this.a = j2;
        this.b = str;
        this.c = i2;
        this.d = j3;
        this.e = j4;
        this.f = i3;
        this.g = challengeCardStatus;
        this.h = challengeType;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j07)) {
            return false;
        }
        j07 j07Var = (j07) obj;
        return this.a == j07Var.a && Intrinsics.g(this.b, j07Var.b) && this.c == j07Var.c && this.d == j07Var.d && this.e == j07Var.e && this.f == j07Var.f && this.g == j07Var.g && this.h == j07Var.h && this.i == j07Var.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + gpp.a(this.f, f87.a(f87.a(gpp.a(this.c, gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31), this.d, 31), this.e, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "ChallengeLeaderboard(challengeId=", ", cardTitle=", this.b);
        sbA.append(", tierTitleResId=");
        sbA.append(this.c);
        sbA.append(", expireTime=");
        sbA.append(this.d);
        g41.a(this.e, ", unpublishedTime=", ", topRankLimit=", sbA);
        sbA.append(this.f);
        sbA.append(", cardStatus=");
        sbA.append(this.g);
        sbA.append(", challengeType=");
        sbA.append(this.h);
        sbA.append(", participantCount=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }

    public j07(long j2, String str, int i, long j3, long j4, int i2, ChallengeCardStatus challengeCardStatus, ChallengeType challengeType, int i3) {
        this.a = j2;
        this.b = str;
        this.c = i;
        this.d = j3;
        this.e = j4;
        this.f = i2;
        this.g = challengeCardStatus;
        this.h = challengeType;
        this.i = i3;
    }
}
