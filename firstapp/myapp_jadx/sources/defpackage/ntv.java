package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.loyalty.MissionV2Data;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class ntv implements mtv {
    public static final Type g = new a().getType();
    public final k5b a;
    public final x430 b;
    public final ea90 c;
    public final BetSlipDataStore d;
    public final JsonSerializeService e;
    public final k650 f;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"ntv$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sporty/android/core/model/loyalty/MissionV2Data;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends MissionV2Data>> {
    }

    @c0d(c = "com.sportybet.plugin.realsports.mission.data.MissionRepositoryImpl$getProcessingMission$1", f = "MissionRepositoryImpl.kt", l = {38, 40, 43, 48, 51}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super List<? extends da90>>, v1b<? super Unit>, Object> {
        public List a;
        public int b;
        public /* synthetic */ Object c;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = ntv.this.new b(v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super List<? extends da90>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0079  */
        /* JADX WARN: Code duplicated, block: B:34:0x0088 A[PHI: r2
          0x0088: PHI (r2v3 java.util.List) = (r2v2 java.util.List), (r2v2 java.util.List), (r2v5 java.util.List) binds: [B:30:0x0077, B:32:0x0085, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x0097  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:56:0x00b9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0091 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L50;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ntv.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ntv(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, x430 x430Var, ea90 ea90Var, BetSlipDataStore betSlipDataStore, JsonSerializeService jsonSerializeService, k650 k650Var, qqe0 qqe0Var) {
        x430Var.getClass();
        betSlipDataStore.getClass();
        jsonSerializeService.getClass();
        k650Var.getClass();
        this.a = k5bVar;
        this.b = x430Var;
        this.c = ea90Var;
        this.d = betSlipDataStore;
        this.e = jsonSerializeService;
        this.f = k650Var;
    }

    @Override // defpackage.mtv
    public final lyh<lk50<List<da90>>> a() {
        return ozh.c(bm50.a(new or60(new b(null))), this.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #1 {all -> 0x00c9, blocks: (B:30:0x0085, B:31:0x009d, B:33:0x00a3, B:38:0x00bb, B:41:0x00c1, B:43:0x00c5, B:37:0x00b3, B:34:0x00a9), top: B:54:0x0085, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [zi50$b] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Serializable] */
    public final Serializable b(x1b x1bVar) {
        otv otvVar;
        String str;
        ?? bVar;
        Object bVar2;
        da90 da90Var;
        if (x1bVar instanceof otv) {
            otvVar = (otv) x1bVar;
            int i = otvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                otvVar.d = i - Integer.MIN_VALUE;
            } else {
                otvVar = new otv(this, x1bVar);
            }
        } else {
            otvVar = new otv(this, x1bVar);
        }
        Object objF = otvVar.b;
        y5b y5bVar = y5b.a;
        int i2 = otvVar.d;
        BetSlipDataStore betSlipDataStore = this.d;
        if (i2 == 0) {
            uj50.b(objF);
            wm20<String> betSlipMissionJsonString = betSlipDataStore.getBetSlipMissionJsonString();
            otvVar.d = 1;
            objF = betSlipMissionJsonString.f(otvVar);
            if (objF != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objF);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = otvVar.a;
            uj50.b(objF);
        }
        if (System.currentTimeMillis() - ((Number) objF).longValue() <= this.f.c("betslip_mission_cache_time")) {
            return null;
        }
        try {
            zi50.a aVar = zi50.b;
            Object objFromJson = this.e.fromJson(str, g);
            objFromJson.getClass();
            bVar = new ArrayList();
            for (MissionV2Data missionV2Data : (List) objFromJson) {
                try {
                    zi50.a aVar2 = zi50.b;
                    bVar2 = this.c.a(missionV2Data);
                } catch (Throwable th) {
                    zi50.a aVar3 = zi50.b;
                    bVar2 = new zi50.b(th);
                }
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                da90Var = (da90) bVar2;
                if (da90Var != null) {
                    bVar.add(da90Var);
                }
            }
        } catch (Throwable th2) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th2);
        }
        zi50.a aVar5 = zi50.b;
        if (bVar instanceof zi50.b) {
            return null;
        }
        return bVar;
        String str2 = (String) objF;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        wm20<Long> betSlipMissionTimestamp = betSlipDataStore.getBetSlipMissionTimestamp();
        Long l = new Long(0L);
        otvVar.a = str2;
        otvVar.d = 2;
        Object objE = betSlipMissionTimestamp.e(otvVar, l);
        if (objE != y5bVar) {
            str = str2;
            objF = objE;
            if (System.currentTimeMillis() - ((Number) objF).longValue() <= this.f.c("betslip_mission_cache_time")) {
                return null;
            }
            zi50.a aVar6 = zi50.b;
            Object objFromJson2 = this.e.fromJson(str, g);
            objFromJson2.getClass();
            bVar = new ArrayList();
            while (r11.hasNext()) {
                zi50.a aVar7 = zi50.b;
                bVar2 = this.c.a(missionV2Data);
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                da90Var = (da90) bVar2;
                if (da90Var != null) {
                    bVar.add(da90Var);
                }
            }
            zi50.a aVar8 = zi50.b;
            if (bVar instanceof zi50.b) {
                return null;
            }
            return bVar;
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r6.g(r0, r2) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r7, defpackage.x1b r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ptv
            if (r0 == 0) goto L13
            r0 = r8
            ptv r0 = (defpackage.ptv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ptv r0 = new ptv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L75
            goto L70
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L31:
            ntv r6 = r0.a
            defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L75
            goto L56
        L37:
            defpackage.uj50.b(r8)
            zi50$a r8 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L75
            com.sporty.android.core.model.json.JsonSerializeService r8 = r6.e     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = r8.toJson(r7)     // Catch: java.lang.Throwable -> L75
            com.sportybet.plugin.realsports.data.local.BetSlipDataStore r8 = r6.d     // Catch: java.lang.Throwable -> L75
            wm20 r8 = r8.getBetSlipMissionJsonString()     // Catch: java.lang.Throwable -> L75
            r7.getClass()     // Catch: java.lang.Throwable -> L75
            r0.a = r6     // Catch: java.lang.Throwable -> L75
            r0.d = r4     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r8.g(r0, r7)     // Catch: java.lang.Throwable -> L75
            if (r7 != r1) goto L56
            goto L6f
        L56:
            com.sportybet.plugin.realsports.data.local.BetSlipDataStore r6 = r6.d     // Catch: java.lang.Throwable -> L75
            wm20 r6 = r6.getBetSlipMissionTimestamp()     // Catch: java.lang.Throwable -> L75
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L75
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L75
            r0.a = r5     // Catch: java.lang.Throwable -> L75
            r0.d = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r6.g(r0, r2)     // Catch: java.lang.Throwable -> L75
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L75
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            zi50$a r6 = defpackage.zi50.b
        L77:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntv.c(java.util.List, x1b):java.lang.Object");
    }
}
