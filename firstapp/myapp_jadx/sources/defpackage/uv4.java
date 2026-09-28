package defpackage;

import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignInfo;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.common.network.campaign.CampaignTierCriteria;
import com.sportygames.common.network.campaign.CampaignsData;
import com.sportygames.common.network.campaign.CampaignsTierData;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class uv4 implements xrm, wrm {
    public final yrm a;
    public CampaignsData b;
    public Campaign c;
    public long d;
    public final tuw e;
    public final LinkedHashSet f;
    public final b390 g;

    public static final class a {
        public final sp40 a;
        public final long b;

        public a(sp40 sp40Var, long j) {
            sp40Var.getClass();
            this.a = sp40Var;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RedeemReminderCandidate(key=" + this.a + ", firstSeenAt=" + this.b + ")";
        }
    }

    public uv4(yrm yrmVar) {
        yrmVar.getClass();
        this.a = yrmVar;
        this.e = uuw.a();
        this.f = new LinkedHashSet();
        this.g = d390.b(0, 0, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0061 A[SYNTHETIC] */
    public static Pair g(CampaignTier campaignTier) {
        List<CampaignTierCriteria> criteria;
        Iterator<T> it;
        Object next;
        CampaignTierCriteria campaignTierCriteria;
        String str;
        Integer intOrNull;
        String str2;
        Integer intOrNull2;
        Object next2;
        List<CampaignTierCriteria> criteria2 = campaignTier.getCriteria();
        if (criteria2 != null) {
            Iterator<T> it2 = criteria2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                CampaignTierCriteria campaignTierCriteria2 = (CampaignTierCriteria) next2;
                if (campaignTierCriteria2.getValueMap().containsKey("totalBetCount") && campaignTierCriteria2.getValueMap().containsKey("currentBetCount")) {
                    break;
                }
            }
            CampaignTierCriteria campaignTierCriteria3 = (CampaignTierCriteria) next2;
            if (campaignTierCriteria3 == null || (valueMap = campaignTierCriteria3.getValueMap()) == null) {
                criteria = campaignTier.getCriteria();
                if (criteria != null) {
                    it = criteria.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(((CampaignTierCriteria) next).getType(), "BET_COUNT"));
                    campaignTierCriteria = (CampaignTierCriteria) next;
                    if (campaignTierCriteria != null) {
                        HashMap<String, String> valueMap = campaignTierCriteria.getValueMap();
                        str = valueMap.get("currentBetCount");
                        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null && (str2 = valueMap.get("totalBetCount")) != null && (intOrNull2 = StringsKt.toIntOrNull(str2)) != null) {
                            return new Pair(intOrNull, intOrNull2);
                        }
                    }
                }
            } else {
                str = valueMap.get("currentBetCount");
                if (str != null) {
                    return new Pair(intOrNull, intOrNull2);
                }
            }
        } else {
            criteria = campaignTier.getCriteria();
            if (criteria != null) {
                it = criteria.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((CampaignTierCriteria) next).getType(), "BET_COUNT"));
                campaignTierCriteria = (CampaignTierCriteria) next;
                if (campaignTierCriteria != null) {
                    HashMap<String, String> valueMap2 = campaignTierCriteria.getValueMap();
                    str = valueMap2.get("currentBetCount");
                    if (str != null) {
                        return new Pair(intOrNull, intOrNull2);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer s(CampaignInfo campaignInfo) {
        String upperCase = campaignInfo.getTimeUnit().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -2020697580:
                if (!upperCase.equals("MINUTE")) {
                    return null;
                }
                return Integer.valueOf(campaignInfo.getRemainingTime() / 60);
            case 67452:
                if (!upperCase.equals("DAY")) {
                    return null;
                }
                return Integer.valueOf(campaignInfo.getRemainingTime() * 24);
            case 2091095:
                if (!upperCase.equals("DAYS")) {
                    return null;
                }
                return Integer.valueOf(campaignInfo.getRemainingTime() * 24);
            case 2223588:
                if (!upperCase.equals("HOUR")) {
                    return null;
                }
                return Integer.valueOf(campaignInfo.getRemainingTime());
            case 68931311:
                if (!upperCase.equals("HOURS")) {
                    return null;
                }
                return Integer.valueOf(campaignInfo.getRemainingTime());
            case 1782884543:
                if (!upperCase.equals("MINUTES")) {
                    return null;
                }
                return Integer.valueOf(campaignInfo.getRemainingTime() / 60);
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r11.a(r0) == r1) goto L55;
     */
    @Override // defpackage.xrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.sportygames.common.network.campaign.CampaignsData r12, defpackage.x1b r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv4.a(com.sportygames.common.network.campaign.CampaignsData, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wrm
    public final Object b(x1b x1bVar) throws Throwable {
        wv4 wv4Var;
        quw quwVar;
        int i;
        Throwable th;
        quw quwVar2;
        if (x1bVar instanceof wv4) {
            wv4Var = (wv4) x1bVar;
            int i2 = wv4Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wv4Var.e = i2 - Integer.MIN_VALUE;
            } else {
                wv4Var = new wv4(this, x1bVar);
            }
        } else {
            wv4Var = new wv4(this, x1bVar);
        }
        Object obj = wv4Var.c;
        y5b y5bVar = y5b.a;
        int i3 = wv4Var.e;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                quwVar = this.e;
                wv4Var.a = quwVar;
                i = 0;
                wv4Var.b = 0;
                wv4Var.e = 1;
                if (quwVar.d(wv4Var) != y5bVar) {
                }
                return y5bVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quwVar2 = wv4Var.a;
                try {
                    uj50.b(obj);
                    Unit unit = Unit.a;
                    quwVar2.f(null);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    quwVar2.f(null);
                    throw th;
                }
            }
            i = wv4Var.b;
            quw quwVar3 = wv4Var.a;
            uj50.b(obj);
            quwVar = quwVar3;
            b390 b390Var = this.g;
            nw4.c cVar = nw4.c.a;
            wv4Var.a = quwVar;
            wv4Var.b = i;
            wv4Var.e = 2;
            if (b390Var.emit(cVar, wv4Var) != y5bVar) {
                quwVar2 = quwVar;
                Unit unit2 = Unit.a;
                quwVar2.f(null);
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th3) {
            quw quwVar4 = quwVar;
            th = th3;
            quwVar2 = quwVar4;
            quwVar2.f(null);
            throw th;
        }
    }

    @Override // defpackage.wrm
    public final b390 c() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bb A[Catch: all -> 0x00b8, PHI: r2 r6 r10 r11 r12
      0x00bb: PHI (r2v5 int) = (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:31:0x007a, B:36:0x0084, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r6v1 int) = (r6v0 int), (r6v0 int), (r6v2 int) binds: [B:31:0x007a, B:36:0x0084, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r10v4 int) = (r10v1 int), (r10v1 int), (r10v6 int) binds: [B:31:0x007a, B:36:0x0084, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v6 int) binds: [B:31:0x007a, B:36:0x0084, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r12v5 quw) = (r12v3 quw), (r12v3 quw), (r12v7 quw) binds: [B:31:0x007a, B:36:0x0084, B:41:0x00b2] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:44:0x00bb, B:30:0x0078, B:32:0x007c, B:37:0x0086), top: B:55:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wrm
    public final Object d(int i, int i2, x1b x1bVar) throws Throwable {
        xv4 xv4Var;
        quw quwVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        quw quwVar2;
        quw quwVar3;
        b390 b390Var;
        nw4.c cVar;
        if (x1bVar instanceof xv4) {
            xv4Var = (xv4) x1bVar;
            int i8 = xv4Var.v;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                xv4Var.v = i8 - Integer.MIN_VALUE;
            } else {
                xv4Var = new xv4(this, x1bVar);
            }
        } else {
            xv4Var = new xv4(this, x1bVar);
        }
        Object obj = xv4Var.f;
        y5b y5bVar = y5b.a;
        int i9 = xv4Var.v;
        int i10 = 0;
        try {
            if (i9 == 0) {
                uj50.b(obj);
                quwVar = this.e;
                xv4Var.e = quwVar;
                xv4Var.a = i;
                xv4Var.b = i2;
                xv4Var.c = 0;
                xv4Var.v = 1;
                if (quwVar.d(xv4Var) != y5bVar) {
                    i3 = i2;
                    i4 = 0;
                }
                return y5bVar;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    quwVar3 = xv4Var.e;
                    try {
                        uj50.b(obj);
                        Unit unit = Unit.a;
                        quwVar3.f(null);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        quwVar3.f(null);
                        throw th;
                    }
                }
                i10 = xv4Var.d;
                i6 = xv4Var.c;
                i7 = xv4Var.b;
                i5 = xv4Var.a;
                quwVar2 = xv4Var.e;
                try {
                    uj50.b(obj);
                    int i11 = i7;
                    i4 = i6;
                    i = i5;
                    i3 = i11;
                    quwVar = quwVar2;
                    b390Var = this.g;
                    cVar = nw4.c.a;
                    xv4Var.e = quwVar;
                    xv4Var.a = i;
                    xv4Var.b = i3;
                    xv4Var.c = i4;
                    xv4Var.d = i10;
                    xv4Var.v = 3;
                    if (b390Var.emit(cVar, xv4Var) != y5bVar) {
                        quwVar3 = quwVar;
                        Unit unit2 = Unit.a;
                        quwVar3.f(null);
                        return Unit.a;
                    }
                    return y5bVar;
                } catch (Throwable th2) {
                    th = th2;
                    quwVar3 = quwVar2;
                    quwVar3.f(null);
                    throw th;
                }
            }
            int i12 = xv4Var.c;
            int i13 = xv4Var.b;
            int i14 = xv4Var.a;
            quw quwVar4 = xv4Var.e;
            uj50.b(obj);
            i4 = i12;
            i = i14;
            i3 = i13;
            quwVar = quwVar4;
            CampaignsData campaignsData = this.b;
            if (campaignsData == null) {
                b390Var = this.g;
                cVar = nw4.c.a;
                xv4Var.e = quwVar;
                xv4Var.a = i;
                xv4Var.b = i3;
                xv4Var.c = i4;
                xv4Var.d = i10;
                xv4Var.v = 3;
                if (b390Var.emit(cVar, xv4Var) != y5bVar) {
                    quwVar3 = quwVar;
                    Unit unit3 = Unit.a;
                    quwVar3.f(null);
                    return Unit.a;
                }
            } else {
                if (campaignsData.getActiveOrPausedCampaignId() != i) {
                    campaignsData = null;
                }
                if (campaignsData != null) {
                    sp40 sp40Var = new sp40(campaignsData.getUser().getId(), i, i3);
                    this.f.add(sp40Var);
                    yrm yrmVar = this.a;
                    xv4Var.e = quwVar;
                    xv4Var.a = i;
                    xv4Var.b = i3;
                    xv4Var.c = i4;
                    xv4Var.d = 0;
                    xv4Var.v = 2;
                    if (yrmVar.g(sp40Var, xv4Var) != y5bVar) {
                        int i15 = i3;
                        i5 = i;
                        i6 = i4;
                        i7 = i15;
                        quwVar2 = quwVar;
                        int i16 = i7;
                        i4 = i6;
                        i = i5;
                        i3 = i16;
                        quwVar = quwVar2;
                        b390Var = this.g;
                        cVar = nw4.c.a;
                        xv4Var.e = quwVar;
                        xv4Var.a = i;
                        xv4Var.b = i3;
                        xv4Var.c = i4;
                        xv4Var.d = i10;
                        xv4Var.v = 3;
                        if (b390Var.emit(cVar, xv4Var) != y5bVar) {
                            quwVar3 = quwVar;
                            Unit unit4 = Unit.a;
                            quwVar3.f(null);
                            return Unit.a;
                        }
                    }
                } else {
                    b390Var = this.g;
                    cVar = nw4.c.a;
                    xv4Var.e = quwVar;
                    xv4Var.a = i;
                    xv4Var.b = i3;
                    xv4Var.c = i4;
                    xv4Var.d = i10;
                    xv4Var.v = 3;
                    if (b390Var.emit(cVar, xv4Var) != y5bVar) {
                        quwVar3 = quwVar;
                        Unit unit5 = Unit.a;
                        quwVar3.f(null);
                        return Unit.a;
                    }
                }
            }
            return y5bVar;
        } catch (Throwable th3) {
            th = th3;
            quwVar3 = quwVar;
            quwVar3.f(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (h((defpackage.nw4) r1, r7) == r8) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [uv4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.xrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.sportygames.compose.campaign.models.CampaignTopicResponse r18, long r19, defpackage.x1b r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv4.e(com.sportygames.compose.campaign.models.CampaignTopicResponse, long, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[Catch: all -> 0x006b, TRY_LEAVE, TryCatch #2 {all -> 0x006b, blocks: (B:28:0x0064, B:42:0x00b5, B:44:0x00bd), top: B:63:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ec, code lost:
    
        if (h((defpackage.nw4) r1, r7) == r8) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [uv4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.xrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.sportygames.common.network.campaign.Campaign r18, long r19, defpackage.x1b r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv4.f(com.sportygames.common.network.campaign.Campaign, long, x1b):java.lang.Object");
    }

    public final Object h(nw4 nw4Var, x1b x1bVar) {
        Object objEmit;
        return (nw4Var == null || (objEmit = this.g.emit(nw4Var, x1bVar)) != y5b.a) ? Unit.a : objEmit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(sp40 sp40Var, long j, x1b x1bVar) {
        vv4 vv4Var;
        long jLongValue;
        sp40 sp40Var2;
        long j2;
        if (x1bVar instanceof vv4) {
            vv4Var = (vv4) x1bVar;
            int i = vv4Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vv4Var.e = i - Integer.MIN_VALUE;
            } else {
                vv4Var = new vv4(this, x1bVar);
            }
        } else {
            vv4Var = new vv4(this, x1bVar);
        }
        Object objC = vv4Var.c;
        y5b y5bVar = y5b.a;
        int i2 = vv4Var.e;
        yrm yrmVar = this.a;
        if (i2 == 0) {
            uj50.b(objC);
            vv4Var.a = sp40Var;
            vv4Var.b = j;
            vv4Var.e = 1;
            objC = yrmVar.c(sp40Var, vv4Var);
            if (objC != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            j = vv4Var.b;
            sp40Var = vv4Var.a;
            uj50.b(objC);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = vv4Var.b;
            sp40Var2 = vv4Var.a;
            uj50.b(objC);
        }
        jLongValue = j2;
        sp40Var = sp40Var2;
        return new a(sp40Var, jLongValue);
        jLongValue = ((Number) objC).longValue();
        if (jLongValue == 0) {
            vv4Var.a = sp40Var;
            vv4Var.b = j;
            vv4Var.e = 2;
            if (yrmVar.h(sp40Var, j, vv4Var) != y5bVar) {
                long j3 = j;
                sp40Var2 = sp40Var;
                j2 = j3;
                jLongValue = j2;
                sp40Var = sp40Var2;
            }
            return y5bVar;
        }
        return new a(sp40Var, jLongValue);
    }

    public final boolean j(long j) {
        long j2 = this.d;
        return j2 != 0 && j - j2 < 10000;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[PHI: r0 r7 r8 r9 r10
      0x004c: PHI (r0v16 java.lang.Object) = (r0v15 java.lang.Object), (r0v3 java.lang.Object) binds: [B:46:0x00e9, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r7v11 uv4) = (r7v9 uv4), (r7v12 uv4) binds: [B:46:0x00e9, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r8v18 uv4$a) = (r8v16 uv4$a), (r8v19 uv4$a) binds: [B:46:0x00e9, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r9v9 com.sportygames.common.network.campaign.Campaign) = (r9v7 com.sportygames.common.network.campaign.Campaign), (r9v11 com.sportygames.common.network.campaign.Campaign) binds: [B:46:0x00e9, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r10v8 long) = (r10v6 long), (r10v9 long) binds: [B:46:0x00e9, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6 A[PHI: r0 r7 r8 r9 r10
      0x00d6: PHI (r0v13 java.lang.Object) = (r0v11 java.lang.Object), (r0v3 java.lang.Object) binds: [B:41:0x00d2, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r7v9 uv4) = (r7v6 uv4), (r7v10 uv4) binds: [B:41:0x00d2, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r8v16 uv4$a) = (r8v13 uv4$a), (r8v17 uv4$a) binds: [B:41:0x00d2, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r9v7 com.sportygames.common.network.campaign.Campaign) = (r9v4 com.sportygames.common.network.campaign.Campaign), (r9v8 com.sportygames.common.network.campaign.Campaign) binds: [B:41:0x00d2, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r10v6 long) = (r10v3 long), (r10v7 long) binds: [B:41:0x00d2, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106 A[PHI: r0 r7 r9 r10
      0x0106: PHI (r0v19 nw4) = (r0v7 nw4), (r0v12 nw4), (r0v17 nw4), (r0v21 nw4) binds: [B:33:0x00a7, B:55:0x0108, B:49:0x00ef, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r7v14 uv4) = (r7v3 uv4), (r7v8 uv4), (r7v11 uv4), (r7v15 uv4) binds: [B:33:0x00a7, B:55:0x0108, B:49:0x00ef, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r9v14 uv4$a) = (r9v1 uv4$a), (r9v6 uv4$a), (r9v10 uv4$a), (r9v15 uv4$a) binds: [B:33:0x00a7, B:55:0x0108, B:49:0x00ef, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r10v11 long) = (r10v1 long), (r10v5 long), (r10v8 long), (r10v12 long) binds: [B:33:0x00a7, B:55:0x0108, B:49:0x00ef, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0108 A[PHI: r0 r7 r8 r10
      0x0108: PHI (r0v12 nw4) = (r0v10 nw4), (r0v14 nw4) binds: [B:39:0x00c1, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r7v8 uv4) = (r7v6 uv4), (r7v9 uv4) binds: [B:39:0x00c1, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r8v15 uv4$a) = (r8v13 uv4$a), (r8v16 uv4$a) binds: [B:39:0x00c1, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x0108: PHI (r10v5 long) = (r10v3 long), (r10v6 long) binds: [B:39:0x00c1, B:44:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0165  */
    /* JADX WARN: Code duplicated, block: B:94:0x016c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r0 == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        if (r5 == r1) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.sportygames.common.network.campaign.CampaignsData r6, com.sportygames.common.network.campaign.Campaign r7, com.sportygames.compose.campaign.models.CampaignTopicResponse r8, uv4.a r9, long r10, defpackage.x1b r12) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv4.k(com.sportygames.common.network.campaign.CampaignsData, com.sportygames.common.network.campaign.Campaign, com.sportygames.compose.campaign.models.CampaignTopicResponse, uv4$a, long, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(CampaignsData campaignsData, Campaign campaign, x1b x1bVar) {
        aw4 aw4Var;
        Integer numS;
        int iIntValue;
        if (x1bVar instanceof aw4) {
            aw4Var = (aw4) x1bVar;
            int i = aw4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aw4Var.d = i - Integer.MIN_VALUE;
            } else {
                aw4Var = new aw4(this, x1bVar);
            }
        } else {
            aw4Var = new aw4(this, x1bVar);
        }
        Object objB = aw4Var.b;
        y5b y5bVar = y5b.a;
        int i2 = aw4Var.d;
        if (i2 == 0) {
            uj50.b(objB);
            if (campaignsData != null && campaign != null && !Intrinsics.g(campaignsData.getCampaignStatus(), "COMPLETED")) {
                aw4Var.a = campaign;
                aw4Var.d = 1;
                objB = this.a.b(aw4Var);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        campaign = aw4Var.a;
        uj50.b(objB);
        if (!((Boolean) objB).booleanValue() && (numS = s(campaign.getCampaign())) != null && (iIntValue = numS.intValue()) < 24) {
            return new nw4.a.C0907a(iIntValue);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object m(Campaign campaign, long j, x1b x1bVar) {
        dw4 dw4Var;
        CampaignTier campaignTier;
        Pair pairG;
        if (x1bVar instanceof dw4) {
            dw4Var = (dw4) x1bVar;
            int i = dw4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw4Var.d = i - Integer.MIN_VALUE;
            } else {
                dw4Var = new dw4(this, x1bVar);
            }
        } else {
            dw4Var = new dw4(this, x1bVar);
        }
        Object objK = dw4Var.b;
        y5b y5bVar = y5b.a;
        int i2 = dw4Var.d;
        if (i2 == 0) {
            uj50.b(objK);
            if (campaign != null && campaign.getCurrentTierLevel() == 1 && (campaignTier = (CampaignTier) CollectionsKt.firstOrNull(campaign.getTiers())) != null && Intrinsics.g(campaignTier.getStatus(), "REGISTERED") && (pairG = g(campaignTier)) != null && ((Number) pairG.a).intValue() == 0) {
                dw4Var.a = j;
                dw4Var.d = 1;
                objK = this.a.k(dw4Var);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = dw4Var.a;
        uj50.b(objK);
        long jLongValue = ((Number) objK).longValue();
        if (jLongValue == 0 || j - jLongValue >= 172800000) {
            return nw4.a.b.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object n(Campaign campaign, long j, x1b x1bVar) {
        ew4 ew4Var;
        Object next;
        if (x1bVar instanceof ew4) {
            ew4Var = (ew4) x1bVar;
            int i = ew4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ew4Var.d = i - Integer.MIN_VALUE;
            } else {
                ew4Var = new ew4(this, x1bVar);
            }
        } else {
            ew4Var = new ew4(this, x1bVar);
        }
        Object objM = ew4Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ew4Var.d;
        if (i2 == 0) {
            uj50.b(objM);
            if (campaign != null) {
                Iterator<T> it = campaign.getTiers().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((CampaignTier) next).getTierLevel() != campaign.getCurrentTierLevel());
                CampaignTier campaignTier = (CampaignTier) next;
                Pair pairG = campaignTier != null ? g(campaignTier) : null;
                if (pairG != null) {
                    if (((Number) pairG.b).intValue() - ((Number) pairG.a).intValue() == 1) {
                        ew4Var.a = j;
                        ew4Var.d = 1;
                        objM = this.a.m(ew4Var);
                        if (objM == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = ew4Var.a;
        uj50.b(objM);
        long jLongValue = ((Number) objM).longValue();
        if (jLongValue == 0 || j - jLongValue >= 86400000) {
            return nw4.b.C0908b.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object o(Campaign campaign, long j, x1b x1bVar) {
        fw4 fw4Var;
        CampaignTier campaignTier;
        Pair pairG;
        int i;
        int i2;
        if (x1bVar instanceof fw4) {
            fw4Var = (fw4) x1bVar;
            int i3 = fw4Var.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fw4Var.f = i3 - Integer.MIN_VALUE;
            } else {
                fw4Var = new fw4(this, x1bVar);
            }
        } else {
            fw4Var = new fw4(this, x1bVar);
        }
        Object obj = fw4Var.d;
        y5b y5bVar = y5b.a;
        int i4 = fw4Var.f;
        if (i4 == 0) {
            uj50.b(obj);
            if (campaign != null && campaign.getCurrentTierLevel() == 1 && (campaignTier = (CampaignTier) CollectionsKt.firstOrNull(campaign.getTiers())) != null && Intrinsics.g(campaignTier.getStatus(), "REGISTERED") && (pairG = g(campaignTier)) != null) {
                int iIntValue = ((Number) pairG.a).intValue();
                int iIntValue2 = ((Number) pairG.b).intValue();
                if (1 <= iIntValue && iIntValue < iIntValue2) {
                    fw4Var.a = j;
                    fw4Var.b = iIntValue;
                    fw4Var.c = iIntValue2;
                    fw4Var.f = 1;
                    Object objI = this.a.i(fw4Var);
                    if (objI == y5bVar) {
                        return y5bVar;
                    }
                    obj = objI;
                    i = iIntValue2;
                    i2 = iIntValue;
                }
            }
            return null;
        }
        if (i4 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = fw4Var.c;
        i2 = fw4Var.b;
        j = fw4Var.a;
        uj50.b(obj);
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0 || j - jLongValue >= 172800000) {
            return new nw4.a.c(i - i2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Campaign campaign, a aVar, long j, x1b x1bVar) {
        gw4 gw4Var;
        Integer numS;
        if (x1bVar instanceof gw4) {
            gw4Var = (gw4) x1bVar;
            int i = gw4Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gw4Var.e = i - Integer.MIN_VALUE;
            } else {
                gw4Var = new gw4(this, x1bVar);
            }
        } else {
            gw4Var = new gw4(this, x1bVar);
        }
        Object objJ = gw4Var.c;
        y5b y5bVar = y5b.a;
        int i2 = gw4Var.e;
        if (i2 == 0) {
            uj50.b(objJ);
            if (campaign != null && aVar != null && j - aVar.b >= 10800000) {
                sp40 sp40Var = aVar.a;
                gw4Var.a = campaign;
                gw4Var.b = j;
                gw4Var.e = 1;
                objJ = this.a.j(sp40Var, gw4Var);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = gw4Var.b;
        campaign = gw4Var.a;
        uj50.b(objJ);
        long jLongValue = ((Number) objJ).longValue();
        if ((jLongValue == 0 || j - jLongValue >= 86400000) && (numS = s(campaign.getCampaign())) != null) {
            int iIntValue = numS.intValue();
            return iIntValue >= 48 ? nw4.d.a.a : new nw4.a.d(iIntValue);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[PHI: r7
      0x00b9: PHI (r7v4 com.sportygames.common.network.campaign.CampaignTier) = 
      (r7v3 com.sportygames.common.network.campaign.CampaignTier)
      (r7v8 com.sportygames.common.network.campaign.CampaignTier)
     binds: [B:43:0x0091, B:52:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(CampaignsData campaignsData, Campaign campaign, long j, x1b x1bVar) {
        hw4 hw4Var;
        Object next;
        Integer campaignTierId;
        int id;
        sp40 sp40Var;
        boolean zContains;
        yrm yrmVar;
        String selectedGame;
        Object objI;
        Object next2;
        if (x1bVar instanceof hw4) {
            hw4Var = (hw4) x1bVar;
            int i = hw4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw4Var.c = i - Integer.MIN_VALUE;
            } else {
                hw4Var = new hw4(this, x1bVar);
            }
        } else {
            hw4Var = new hw4(this, x1bVar);
        }
        Object obj = hw4Var.a;
        Object obj2 = y5b.a;
        int i2 = hw4Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return null;
            }
            if (i2 == 2) {
                uj50.b(obj);
                return null;
            }
            if (i2 == 3) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        if (campaignsData != null && campaign != null && Intrinsics.g(campaignsData.getRewardType(), "BONUS_VAULT") && Intrinsics.g(campaignsData.getCampaignStatus(), "ACTIVE")) {
            CampaignsTierData activeOrPausedCampaignTier = campaignsData.getActiveOrPausedCampaignTier();
            Iterator<T> it = campaign.getTiers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer campaignTierId2 = ((CampaignTier) next).getCampaignTierId();
                int id2 = activeOrPausedCampaignTier.getId();
                if (campaignTierId2 != null && campaignTierId2.intValue() == id2) {
                    break;
                }
            }
            CampaignTier campaignTier = (CampaignTier) next;
            if (campaignTier == null) {
                Iterator<T> it2 = campaign.getTiers().iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((CampaignTier) next2).getTierLevel() != campaign.getCurrentTierLevel());
                campaignTier = (CampaignTier) next2;
                if (campaignTier != null) {
                    campaignTierId = campaignTier.getCampaignTierId();
                    if (campaignTierId != null) {
                        id = campaignTierId.intValue();
                    } else {
                        id = activeOrPausedCampaignTier.getId();
                    }
                    sp40Var = new sp40(campaignsData.getUser().getId(), campaignsData.getActiveOrPausedCampaignId(), id);
                    LinkedHashSet linkedHashSet = this.f;
                    zContains = linkedHashSet.contains(sp40Var);
                    yrmVar = this.a;
                    if (zContains) {
                        hw4Var.c = 1;
                        if (yrmVar.g(sp40Var, hw4Var) == obj2) {
                            return obj2;
                        }
                    } else {
                        selectedGame = campaignTier.getSelectedGame();
                        if (selectedGame == null && !StringsKt.U(selectedGame)) {
                            linkedHashSet.add(sp40Var);
                            hw4Var.c = 2;
                            if (yrmVar.g(sp40Var, hw4Var) == obj2) {
                                return obj2;
                            }
                        } else if (Intrinsics.g(campaignTier.getStatus(), "READY_TO_CLAIM")) {
                            hw4Var.c = 3;
                            objI = i(sp40Var, j, hw4Var);
                            if (objI == obj2) {
                                return obj2;
                            }
                            return objI;
                        }
                    }
                }
            } else {
                campaignTierId = campaignTier.getCampaignTierId();
                if (campaignTierId != null) {
                    id = campaignTierId.intValue();
                } else {
                    id = activeOrPausedCampaignTier.getId();
                }
                sp40Var = new sp40(campaignsData.getUser().getId(), campaignsData.getActiveOrPausedCampaignId(), id);
                LinkedHashSet linkedHashSet2 = this.f;
                zContains = linkedHashSet2.contains(sp40Var);
                yrmVar = this.a;
                if (zContains) {
                    hw4Var.c = 1;
                    if (yrmVar.g(sp40Var, hw4Var) == obj2) {
                        return obj2;
                    }
                } else {
                    selectedGame = campaignTier.getSelectedGame();
                    if (selectedGame == null) {
                    }
                    if (Intrinsics.g(campaignTier.getStatus(), "READY_TO_CLAIM")) {
                        hw4Var.c = 3;
                        objI = i(sp40Var, j, hw4Var);
                        if (objI == obj2) {
                            return obj2;
                        }
                        return objI;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(CampaignTopicResponse campaignTopicResponse, long j, x1b x1bVar) {
        iw4 iw4Var;
        if (x1bVar instanceof iw4) {
            iw4Var = (iw4) x1bVar;
            int i = iw4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iw4Var.c = i - Integer.MIN_VALUE;
            } else {
                iw4Var = new iw4(this, x1bVar);
            }
        } else {
            iw4Var = new iw4(this, x1bVar);
        }
        Object obj = iw4Var.a;
        Object obj2 = y5b.a;
        int i2 = iw4Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return null;
            }
            if (i2 == 2) {
                uj50.b(obj);
                return null;
            }
            if (i2 == 3) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        CampaignsData campaignsData = this.b;
        if (campaignsData != null && Intrinsics.g(campaignsData.getRewardType(), "BONUS_VAULT") && Intrinsics.g(campaignsData.getCampaignStatus(), "ACTIVE") && campaignsData.getUser().getId() == campaignTopicResponse.getUserId() && campaignsData.getActiveOrPausedCampaignId() == campaignTopicResponse.getCampaignId()) {
            sp40 sp40Var = new sp40(campaignTopicResponse.getUserId(), campaignTopicResponse.getCampaignId(), campaignTopicResponse.getCampaignTierId());
            boolean zContains = this.f.contains(sp40Var);
            yrm yrmVar = this.a;
            if (!zContains) {
                if (Intrinsics.g(campaignTopicResponse.getUserActivityStatus(), "READY_TO_CLAIM")) {
                    iw4Var.c = 3;
                    Object objI = i(sp40Var, j, iw4Var);
                    if (objI != obj2) {
                        return objI;
                    }
                } else {
                    iw4Var.c = 2;
                    if (yrmVar.g(sp40Var, iw4Var) == obj2) {
                    }
                }
                return obj2;
            }
            iw4Var.c = 1;
            if (yrmVar.g(sp40Var, iw4Var) == obj2) {
                return obj2;
            }
        }
        return null;
    }
}
