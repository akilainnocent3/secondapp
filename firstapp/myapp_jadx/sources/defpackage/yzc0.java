package defpackage;

import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyEvent;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyOverallConfig;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyRoundInfo;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySettleRound;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySportConfig;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyStats;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyStatsTeamInfo;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyUserRound;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class yzc0 {
    public static final InstantWinBizTypeTag d = new InstantWinBizTypeTag(153);
    public final s8o a;
    public final zuc0 b;
    public final mgb0 c;

    public yzc0(s8o s8oVar, zuc0 zuc0Var, mgb0 mgb0Var) {
        this.a = s8oVar;
        this.b = zuc0Var;
        this.c = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource, x1b x1bVar) {
        rzc0 rzc0Var;
        if (x1bVar instanceof rzc0) {
            rzc0Var = (rzc0) x1bVar;
            int i = rzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                rzc0Var = new rzc0(this, x1bVar);
            }
        } else {
            rzc0Var = new rzc0(this, x1bVar);
        }
        Object objA = rzc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = rzc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                zuc0 zuc0Var = this.b;
                InstantWinApiTracking.PlaceBet placeBet = new InstantWinApiTracking.PlaceBet(instantWinBetSource, new Integer(153));
                rzc0Var.c = 1;
                objA = zuc0Var.a(ticketParameter, placeBet, rzc0Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            r1d0 r1d0VarA = s1d0.a((NetworkSportyPenaltySettleRound) objA);
            zi50.a aVar2 = zi50.b;
            return r1d0VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0157 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:82:0x0113, B:85:0x0118, B:89:0x0120, B:91:0x0125, B:92:0x0134, B:94:0x013a, B:97:0x014b, B:99:0x014f, B:101:0x0157, B:103:0x015d, B:105:0x0163, B:106:0x0167, B:107:0x016b, B:81:0x010c, B:25:0x0050, B:41:0x0094, B:42:0x0096, B:44:0x009c, B:46:0x00a2, B:48:0x00a8, B:51:0x00b0, B:53:0x00b8, B:28:0x005a, B:37:0x007f, B:31:0x0061, B:34:0x006d, B:38:0x0082), top: B:112:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x015c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0163 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:82:0x0113, B:85:0x0118, B:89:0x0120, B:91:0x0125, B:92:0x0134, B:94:0x013a, B:97:0x014b, B:99:0x014f, B:101:0x0157, B:103:0x015d, B:105:0x0163, B:106:0x0167, B:107:0x016b, B:81:0x010c, B:25:0x0050, B:41:0x0094, B:42:0x0096, B:44:0x009c, B:46:0x00a2, B:48:0x00a8, B:51:0x00b0, B:53:0x00b8, B:28:0x005a, B:37:0x007f, B:31:0x0061, B:34:0x006d, B:38:0x0082), top: B:112:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x011f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125 A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:82:0x0113, B:85:0x0118, B:89:0x0120, B:91:0x0125, B:92:0x0134, B:94:0x013a, B:97:0x014b, B:99:0x014f, B:101:0x0157, B:103:0x015d, B:105:0x0163, B:106:0x0167, B:107:0x016b, B:81:0x010c, B:25:0x0050, B:41:0x0094, B:42:0x0096, B:44:0x009c, B:46:0x00a2, B:48:0x00a8, B:51:0x00b0, B:53:0x00b8, B:28:0x005a, B:37:0x007f, B:31:0x0061, B:34:0x006d, B:38:0x0082), top: B:112:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x013a A[Catch: all -> 0x0171, LOOP:0: B:92:0x0134->B:94:0x013a, LOOP_END, TryCatch #0 {all -> 0x0171, blocks: (B:82:0x0113, B:85:0x0118, B:89:0x0120, B:91:0x0125, B:92:0x0134, B:94:0x013a, B:97:0x014b, B:99:0x014f, B:101:0x0157, B:103:0x015d, B:105:0x0163, B:106:0x0167, B:107:0x016b, B:81:0x010c, B:25:0x0050, B:41:0x0094, B:42:0x0096, B:44:0x009c, B:46:0x00a2, B:48:0x00a8, B:51:0x00b0, B:53:0x00b8, B:28:0x005a, B:37:0x007f, B:31:0x0061, B:34:0x006d, B:38:0x0082), top: B:112:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0148  */
    /* JADX WARN: Code duplicated, block: B:97:0x014b A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:82:0x0113, B:85:0x0118, B:89:0x0120, B:91:0x0125, B:92:0x0134, B:94:0x013a, B:97:0x014b, B:99:0x014f, B:101:0x0157, B:103:0x015d, B:105:0x0163, B:106:0x0167, B:107:0x016b, B:81:0x010c, B:25:0x0050, B:41:0x0094, B:42:0x0096, B:44:0x009c, B:46:0x00a2, B:48:0x00a8, B:51:0x00b0, B:53:0x00b8, B:28:0x005a, B:37:0x007f, B:31:0x0061, B:34:0x006d, B:38:0x0082), top: B:112:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x014f A[Catch: all -> 0x0171, TryCatch #0 {all -> 0x0171, blocks: (B:82:0x0113, B:85:0x0118, B:89:0x0120, B:91:0x0125, B:92:0x0134, B:94:0x013a, B:97:0x014b, B:99:0x014f, B:101:0x0157, B:103:0x015d, B:105:0x0163, B:106:0x0167, B:107:0x016b, B:81:0x010c, B:25:0x0050, B:41:0x0094, B:42:0x0096, B:44:0x009c, B:46:0x00a2, B:48:0x00a8, B:51:0x00b0, B:53:0x00b8, B:28:0x005a, B:37:0x007f, B:31:0x0061, B:34:0x006d, B:38:0x0082), top: B:112:0x0025 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [yzc0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [yzc0] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [zuc0] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [m2g] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object b(String str, boolean z, x1b x1bVar) {
        szc0 szc0Var;
        Object bVar;
        ?? r10;
        ?? r9;
        boolean z2;
        Object obj;
        NetworkSportyPenaltyStats networkSportyPenaltyStats;
        ?? r3;
        ?? arrayList;
        NetworkSportyPenaltyStatsTeamInfo homeTeam;
        g5d0 g5d0VarA;
        Iterator it;
        ?? r11;
        ?? r12;
        NetworkSportyPenaltyUserRound networkSportyPenaltyUserRound;
        ?? r13;
        ?? r14;
        String roundId;
        List<NetworkSportyPenaltyEvent> events;
        String eventId;
        boolean zIsLogin;
        ?? r15;
        List<NetworkSportyPenaltyEvent> list;
        String str2;
        List<NetworkSportyPenaltyEvent> list2;
        String str3;
        NetworkSportyPenaltyEvent networkSportyPenaltyEvent;
        ?? r16;
        ?? r17;
        NetworkSportyPenaltyStats networkSportyPenaltyStats2;
        if (x1bVar instanceof szc0) {
            szc0Var = (szc0) x1bVar;
            int i = szc0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                szc0Var.v = i - Integer.MIN_VALUE;
            } else {
                szc0Var = new szc0(this, x1bVar);
            }
        } else {
            szc0Var = new szc0(this, x1bVar);
        }
        Object objG = szc0Var.f;
        y5b y5bVar = y5b.a;
        int i2 = szc0Var.v;
        String str4 = "";
        l4d0 l4d0Var = null;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            uj50.b(objG);
                            zi50.a aVar = zi50.b;
                            boolean zIsLogin2 = this.c.isLogin();
                            zuc0 zuc0Var = this.b;
                            if (zIsLogin2) {
                                szc0Var.a = str;
                                szc0Var.b = this;
                                szc0Var.e = z;
                                szc0Var.v = 1;
                                objG = zuc0Var.f(str, z, avc0.a, szc0Var);
                                if (objG == y5bVar) {
                                    this = this;
                                    r11 = str;
                                } else {
                                    this = this;
                                    r11 = str;
                                    networkSportyPenaltyUserRound = (NetworkSportyPenaltyUserRound) objG;
                                    r14 = r12;
                                    r13 = r11;
                                }
                            } else {
                                szc0Var.a = str;
                                szc0Var.b = this;
                                szc0Var.e = z;
                                szc0Var.v = 2;
                                objG = zuc0Var.g(str, avc0.a, szc0Var);
                                if (objG == y5bVar) {
                                    this = this;
                                    r16 = str;
                                } else {
                                    this = this;
                                    r16 = str;
                                    networkSportyPenaltyUserRound = (NetworkSportyPenaltyUserRound) objG;
                                    r14 = r17;
                                    r13 = r16;
                                }
                            }
                            return y5bVar;
                        }
                        if (i2 == 1) {
                            z = szc0Var.e;
                            yzc0 yzc0Var = szc0Var.b;
                            String str5 = szc0Var.a;
                            uj50.b(objG);
                            r12 = yzc0Var;
                            r11 = str5;
                            this = this;
                            r11 = str;
                            networkSportyPenaltyUserRound = (NetworkSportyPenaltyUserRound) objG;
                            r14 = r12;
                            r13 = r11;
                        } else {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    String str6 = szc0Var.d;
                                    List<NetworkSportyPenaltyEvent> list3 = szc0Var.c;
                                    uj50.b(objG);
                                    str3 = str6;
                                    list2 = list3;
                                    this = str3;
                                    str = list2;
                                    networkSportyPenaltyStats2 = (NetworkSportyPenaltyStats) objG;
                                    zi50.a aVar2 = zi50.b;
                                    r9 = this;
                                    r10 = str;
                                    bVar = networkSportyPenaltyStats2;
                                    z2 = bVar instanceof zi50.b;
                                    obj = bVar;
                                    if (z2) {
                                        obj = null;
                                    }
                                    networkSportyPenaltyStats = (NetworkSportyPenaltyStats) obj;
                                    if (r9 == 0) {
                                        r3 = str4;
                                    } else {
                                        r3 = r9;
                                    }
                                    a0d0 a0d0Var = new a0d0(r3);
                                    if (r10 != 0) {
                                        arrayList = new ArrayList(l48.r(r10, 10));
                                        it = r10.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(mwc0.a((NetworkSportyPenaltyEvent) it.next()));
                                        }
                                    } else {
                                        arrayList = 0;
                                    }
                                    if (arrayList == 0) {
                                        arrayList = m2g.a;
                                    }
                                    if (networkSportyPenaltyStats != null) {
                                        homeTeam = networkSportyPenaltyStats.getHomeTeam();
                                        if (homeTeam != null) {
                                            g5d0VarA = b5d0.a(homeTeam);
                                        } else {
                                            g5d0VarA = null;
                                        }
                                        NetworkSportyPenaltyStatsTeamInfo awayTeam = networkSportyPenaltyStats.getAwayTeam();
                                        l4d0Var = new l4d0(g5d0VarA, awayTeam != null ? b5d0.a(awayTeam) : null);
                                    }
                                    return new kwc0(a0d0Var, arrayList, l4d0Var);
                                }
                                if (i2 != 4) {
                                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                String str7 = szc0Var.d;
                                List<NetworkSportyPenaltyEvent> list4 = szc0Var.c;
                                uj50.b(objG);
                                str2 = str7;
                                list = list4;
                                this = str2;
                                str = list;
                                networkSportyPenaltyStats2 = (NetworkSportyPenaltyStats) objG;
                                zi50.a aVar3 = zi50.b;
                                r9 = this;
                                r10 = str;
                                bVar = networkSportyPenaltyStats2;
                                z2 = bVar instanceof zi50.b;
                                obj = bVar;
                                if (z2) {
                                    obj = null;
                                }
                                networkSportyPenaltyStats = (NetworkSportyPenaltyStats) obj;
                                if (r9 == 0) {
                                    r3 = str4;
                                } else {
                                    r3 = r9;
                                }
                                a0d0 a0d0Var2 = new a0d0(r3);
                                if (r10 != 0) {
                                    arrayList = new ArrayList(l48.r(r10, 10));
                                    it = r10.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(mwc0.a((NetworkSportyPenaltyEvent) it.next()));
                                    }
                                } else {
                                    arrayList = 0;
                                }
                                if (arrayList == 0) {
                                    arrayList = m2g.a;
                                }
                                if (networkSportyPenaltyStats != null) {
                                    homeTeam = networkSportyPenaltyStats.getHomeTeam();
                                    if (homeTeam != null) {
                                        g5d0VarA = b5d0.a(homeTeam);
                                    } else {
                                        g5d0VarA = null;
                                    }
                                    NetworkSportyPenaltyStatsTeamInfo awayTeam2 = networkSportyPenaltyStats.getAwayTeam();
                                    l4d0Var = new l4d0(g5d0VarA, awayTeam2 != null ? b5d0.a(awayTeam2) : null);
                                }
                                return new kwc0(a0d0Var2, arrayList, l4d0Var);
                            }
                            z = szc0Var.e;
                            yzc0 yzc0Var2 = szc0Var.b;
                            String str8 = szc0Var.a;
                            uj50.b(objG);
                            r17 = yzc0Var2;
                            r16 = str8;
                            this = this;
                            r16 = str;
                            networkSportyPenaltyUserRound = (NetworkSportyPenaltyUserRound) objG;
                            r14 = r17;
                            r13 = r16;
                        }
                        if (zIsLogin) {
                            szc0Var.a = null;
                            szc0Var.b = null;
                            szc0Var.c = events;
                            szc0Var.d = roundId;
                            szc0Var.e = z;
                            szc0Var.v = 3;
                            Object objE = r15.e(r13, eventId, avc0.a, szc0Var);
                            if (objE != y5bVar) {
                                list2 = events;
                                objG = objE;
                                str3 = roundId;
                                this = str3;
                                str = list2;
                                networkSportyPenaltyStats2 = (NetworkSportyPenaltyStats) objG;
                                zi50.a aVar4 = zi50.b;
                                r9 = this;
                                r10 = str;
                                bVar = networkSportyPenaltyStats2;
                                z2 = bVar instanceof zi50.b;
                                obj = bVar;
                                if (z2) {
                                    obj = null;
                                }
                                networkSportyPenaltyStats = (NetworkSportyPenaltyStats) obj;
                                if (r9 == 0) {
                                    r3 = str4;
                                } else {
                                    r3 = r9;
                                }
                                a0d0 a0d0Var3 = new a0d0(r3);
                                if (r10 != 0) {
                                    arrayList = new ArrayList(l48.r(r10, 10));
                                    it = r10.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(mwc0.a((NetworkSportyPenaltyEvent) it.next()));
                                    }
                                } else {
                                    arrayList = 0;
                                }
                                if (arrayList == 0) {
                                    arrayList = m2g.a;
                                }
                                if (networkSportyPenaltyStats != null) {
                                    homeTeam = networkSportyPenaltyStats.getHomeTeam();
                                    if (homeTeam != null) {
                                        g5d0VarA = b5d0.a(homeTeam);
                                    } else {
                                        g5d0VarA = null;
                                    }
                                    NetworkSportyPenaltyStatsTeamInfo awayTeam3 = networkSportyPenaltyStats.getAwayTeam();
                                    l4d0Var = new l4d0(g5d0VarA, awayTeam3 != null ? b5d0.a(awayTeam3) : null);
                                }
                                return new kwc0(a0d0Var3, arrayList, l4d0Var);
                            }
                        } else {
                            szc0Var.a = null;
                            szc0Var.b = null;
                            szc0Var.c = events;
                            szc0Var.d = roundId;
                            szc0Var.e = z;
                            szc0Var.v = 4;
                            Object objH = r15.h(r13, eventId, avc0.a, szc0Var);
                            if (objH != y5bVar) {
                                list = events;
                                objG = objH;
                                str2 = roundId;
                                this = str2;
                                str = list;
                                networkSportyPenaltyStats2 = (NetworkSportyPenaltyStats) objG;
                                zi50.a aVar5 = zi50.b;
                                r9 = this;
                                r10 = str;
                                bVar = networkSportyPenaltyStats2;
                                z2 = bVar instanceof zi50.b;
                                obj = bVar;
                                if (z2) {
                                    obj = null;
                                }
                                networkSportyPenaltyStats = (NetworkSportyPenaltyStats) obj;
                                if (r9 == 0) {
                                    r3 = str4;
                                } else {
                                    r3 = r9;
                                }
                                a0d0 a0d0Var4 = new a0d0(r3);
                                if (r10 != 0) {
                                    arrayList = new ArrayList(l48.r(r10, 10));
                                    it = r10.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(mwc0.a((NetworkSportyPenaltyEvent) it.next()));
                                    }
                                } else {
                                    arrayList = 0;
                                }
                                if (arrayList == 0) {
                                    arrayList = m2g.a;
                                }
                                if (networkSportyPenaltyStats != null) {
                                    homeTeam = networkSportyPenaltyStats.getHomeTeam();
                                    if (homeTeam != null) {
                                        g5d0VarA = b5d0.a(homeTeam);
                                    } else {
                                        g5d0VarA = null;
                                    }
                                    NetworkSportyPenaltyStatsTeamInfo awayTeam4 = networkSportyPenaltyStats.getAwayTeam();
                                    l4d0Var = new l4d0(g5d0VarA, awayTeam4 != null ? b5d0.a(awayTeam4) : null);
                                }
                                return new kwc0(a0d0Var4, arrayList, l4d0Var);
                            }
                        }
                        return y5bVar;
                    } catch (Throwable th) {
                        th = th;
                        str = events;
                        this = roundId;
                        zi50.a aVar6 = zi50.b;
                        r9 = this;
                        r10 = str;
                        bVar = new zi50.b(th);
                    }
                    zi50.a aVar7 = zi50.b;
                    zIsLogin = r14.c.isLogin();
                    r15 = r14.b;
                } catch (Throwable th2) {
                    th = th2;
                }
                NetworkSportyPenaltyRoundInfo roundInfo = networkSportyPenaltyUserRound.getRoundInfo();
                roundId = roundInfo != null ? roundInfo.getRoundId() : null;
                NetworkSportyPenaltyRoundInfo roundInfo2 = networkSportyPenaltyUserRound.getRoundInfo();
                events = roundInfo2 != null ? roundInfo2.getEvents() : null;
                eventId = (events == null || (networkSportyPenaltyEvent = (NetworkSportyPenaltyEvent) CollectionsKt.firstOrNull(events)) == null) ? null : networkSportyPenaltyEvent.getEventId();
                if (eventId == null) {
                    eventId = "";
                }
            } catch (Throwable th3) {
                zi50.a aVar8 = zi50.b;
                return new zi50.b(th3);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        tzc0 tzc0Var;
        if (x1bVar instanceof tzc0) {
            tzc0Var = (tzc0) x1bVar;
            int i = tzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                tzc0Var = new tzc0(this, x1bVar);
            }
        } else {
            tzc0Var = new tzc0(this, x1bVar);
        }
        Object objC = tzc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tzc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objC);
                zi50.a aVar = zi50.b;
                zuc0 zuc0Var = this.b;
                tzc0Var.c = 1;
                objC = zuc0Var.c(avc0.a, tzc0Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objC);
            }
            izc0 izc0Var = new izc0(((NetworkSportyPenaltyOverallConfig) objC).getActive());
            zi50.a aVar2 = zi50.b;
            return izc0Var;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, x1b x1bVar) {
        uzc0 uzc0Var;
        if (x1bVar instanceof uzc0) {
            uzc0Var = (uzc0) x1bVar;
            int i = uzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                uzc0Var = new uzc0(this, x1bVar);
            }
        } else {
            uzc0Var = new uzc0(this, x1bVar);
        }
        Object objD = uzc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = uzc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                zuc0 zuc0Var = this.b;
                uzc0Var.c = 1;
                objD = zuc0Var.d(str, avc0.a, uzc0Var);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objD);
            }
            k4d0 k4d0VarA = x3s.a((NetworkSportyPenaltySportConfig) objD);
            zi50.a aVar2 = zi50.b;
            return k4d0VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, x1b x1bVar) {
        vzc0 vzc0Var;
        if (x1bVar instanceof vzc0) {
            vzc0Var = (vzc0) x1bVar;
            int i = vzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                vzc0Var = new vzc0(this, x1bVar);
            }
        } else {
            vzc0Var = new vzc0(this, x1bVar);
        }
        Object objQ = vzc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = vzc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                InstantWinBizTypeTag instantWinBizTypeTag = d;
                vzc0Var.c = 1;
                objQ = s8oVar.q(str, instantWinBizTypeTag, vzc0Var);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objQ);
            }
            n5d0 n5d0VarA = ak9.a((Ticket) objQ);
            zi50.a aVar2 = zi50.b;
            return n5d0VarA;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(String str, int i, boolean z, long j, long j2, String str2, x1b x1bVar) {
        wzc0 wzc0Var;
        if (x1bVar instanceof wzc0) {
            wzc0Var = (wzc0) x1bVar;
            int i2 = wzc0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzc0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                wzc0Var = new wzc0(this, x1bVar);
            }
        } else {
            wzc0Var = new wzc0(this, x1bVar);
        }
        wzc0 wzc0Var2 = wzc0Var;
        Object objK = wzc0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = wzc0Var2.c;
        try {
            if (i3 == 0) {
                uj50.b(objK);
                zi50.a aVar = zi50.b;
                s8o s8oVar = this.a;
                String lowerCase = "SETTLED".toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                InstantWinBizTypeTag instantWinBizTypeTag = d;
                Integer num = new Integer(i);
                Boolean boolValueOf = Boolean.valueOf(z);
                Long l = new Long(j);
                Long l2 = new Long(j2);
                wzc0Var2.c = 1;
                objK = s8oVar.k(str, str2, num, lowerCase, boolValueOf, l, l2, instantWinBizTypeTag, wzc0Var2);
                if (objK == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objK);
            }
            PageData pageData = (PageData) objK;
            PageData pageData2 = new PageData();
            pageData2.lastId = pageData.lastId;
            pageData2.pageSize = pageData.pageSize;
            Collection<Ticket> collection = pageData.data;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (Ticket ticket : collection) {
                ticket.getClass();
                arrayList.add(ak9.a(ticket));
            }
            pageData2.data = arrayList;
            zi50.a aVar2 = zi50.b;
            return pageData2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, x1b x1bVar) {
        xzc0 xzc0Var;
        if (x1bVar instanceof xzc0) {
            xzc0Var = (xzc0) x1bVar;
            int i = xzc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xzc0Var.c = i - Integer.MIN_VALUE;
            } else {
                xzc0Var = new xzc0(this, x1bVar);
            }
        } else {
            xzc0Var = new xzc0(this, x1bVar);
        }
        Object obj = xzc0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xzc0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                zuc0 zuc0Var = this.b;
                xzc0Var.c = 1;
                if (zuc0Var.b(str, avc0.a, xzc0Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Unit unit = Unit.a;
            zi50.a aVar2 = zi50.b;
            return unit;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
