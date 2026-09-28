package defpackage;

import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionStatus;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qlw {
    public final long a;
    public final MissionPublishState b;
    public final String c;
    public final Long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final ArrayList i;
    public final boolean j;
    public final MissionStatus k;
    public final qrv l;
    public final ArrayList m;
    public final String n;

    public qlw(long j, MissionPublishState missionPublishState, String str, Long l, long j2, long j3, long j4, String str2, ArrayList arrayList, boolean z, MissionStatus missionStatus, qrv qrvVar, ArrayList arrayList2, String str3) {
        missionPublishState.getClass();
        str.getClass();
        str2.getClass();
        qrvVar.getClass();
        str3.getClass();
        this.a = j;
        this.b = missionPublishState;
        this.c = str;
        this.d = l;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = str2;
        this.i = arrayList;
        this.j = z;
        this.k = missionStatus;
        this.l = qrvVar;
        this.m = arrayList2;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlw)) {
            return false;
        }
        qlw qlwVar = (qlw) obj;
        return this.a == qlwVar.a && this.b == qlwVar.b && Intrinsics.g(this.c, qlwVar.c) && Intrinsics.g(this.d, qlwVar.d) && this.e == qlwVar.e && this.f == qlwVar.f && this.g == qlwVar.g && Intrinsics.g(this.h, qlwVar.h) && this.i.equals(qlwVar.i) && this.j == qlwVar.j && this.k == qlwVar.k && Intrinsics.g(this.l, qlwVar.l) && this.m.equals(qlwVar.m) && Intrinsics.g(this.n, qlwVar.n);
    }

    public final int hashCode() {
        int iA = gmf0.a((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c);
        Long l = this.d;
        int iA2 = mtg0.a(vt5.a(this.i, gmf0.a(f87.a(f87.a(f87.a((iA + (l == null ? 0 : l.hashCode())) * 31, this.e, 31), this.f, 31), this.g, 31), 31, this.h), 31), 31, this.j);
        MissionStatus missionStatus = this.k;
        return this.n.hashCode() + vt5.a(this.m, (this.l.hashCode() + ((iA2 + (missionStatus != null ? missionStatus.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTaskMissionDomainData(missionId=");
        sb.append(this.a);
        sb.append(", missionPublishState=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", durationDays=");
        sb.append(this.d);
        g41.a(this.e, ", endTime=", ", publishedTime=", sb);
        sb.append(this.f);
        g41.a(this.g, ", lastParticipationTime=", ", currency=", sb);
        sb.append(this.h);
        sb.append(", rewardList=");
        sb.append(this.i);
        sb.append(", canParticipate=");
        sb.append(this.j);
        sb.append(", overallStatus=");
        sb.append(this.k);
        sb.append(", cancelState=");
        sb.append(this.l);
        sb.append(", tasks=");
        sb.append(this.m);
        sb.append(", configType=");
        return uf80.a(sb, this.n, ")");
    }
}
