package defpackage;

import com.appsflyer.internal.u;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class erj implements mtm {
    public final ktm a;
    public final jtm b;
    public final ltm c;
    public final fzm d;
    public final ezm e;
    public final b390 f;
    public long g;
    public final e77 h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lerj$a;", "", "", "a", "J", "getRoundId", "()J", "roundId", "", "b", "Ljava/lang/String;", "getEmoji", "()Ljava/lang/String;", "emoji", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("roundId")
        private final long roundId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("emoji")
        private final String emoji;

        public a(long j, String str) {
            this.roundId = j;
            this.emoji = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.roundId == aVar.roundId && Intrinsics.g(this.emoji, aVar.emoji);
        }

        public final int hashCode() {
            return this.emoji.hashCode() + (Long.hashCode(this.roundId) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GameplayEmojiPayload(roundId=");
            sb.append(this.roundId);
            sb.append(", emoji=");
            return j26.a(sb, this.emoji, ')');
        }
    }

    @c0d(c = "com.sportygames.piggybash.domain.usecase.gameplay.GameplayUseCase$gameplayEvents$1", f = "GameplayUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<pye, v1b<? super lyh<? extends lpj>>, Object> {
        public /* synthetic */ Object a;

        @c0d(c = "com.sportygames.piggybash.domain.usecase.gameplay.GameplayUseCase$gameplayEvents$1$1", f = "GameplayUseCase.kt", l = {48, 49, 56, 58}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<myh<? super lpj>, v1b<? super Unit>, Object> {
            public erj a;
            public Iterator b;
            public lpj c;
            public int d;
            public int e;
            public int f;
            public /* synthetic */ Object i;
            public final /* synthetic */ erj v;
            public final /* synthetic */ pye w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(erj erjVar, pye pyeVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.v = erjVar;
                this.w = pyeVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.v, this.w, v1bVar);
                aVar.i = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(myh<? super lpj> myhVar, v1b<? super Unit> v1bVar) {
                return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0079  */
            /* JADX WARN: Code duplicated, block: B:23:0x0096  */
            /* JADX WARN: Code duplicated, block: B:26:0x009f  */
            /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
            /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[PHI: r3 r4 r8 r11 r13
              0x00d2: PHI (r3v6 int) = (r3v9 int), (r3v9 int), (r3v9 int), (r3v15 int) binds: [B:25:0x009d, B:32:0x00bb, B:34:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
              0x00d2: PHI (r4v1 int) = (r4v5 int), (r4v5 int), (r4v5 int), (r4v10 int) binds: [B:25:0x009d, B:32:0x00bb, B:34:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
              0x00d2: PHI (r8v3 lpj) = (r8v5 lpj), (r8v5 lpj), (r8v5 lpj), (r8v10 lpj) binds: [B:25:0x009d, B:32:0x00bb, B:34:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
              0x00d2: PHI (r11v0 java.util.Iterator) = (r11v1 java.util.Iterator), (r11v1 java.util.Iterator), (r11v1 java.util.Iterator), (r11v7 java.util.Iterator) binds: [B:25:0x009d, B:32:0x00bb, B:34:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
              0x00d2: PHI (r13v0 erj) = (r13v1 erj), (r13v1 erj), (r13v1 erj), (r13v4 erj) binds: [B:25:0x009d, B:32:0x00bb, B:34:0x00cf, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ed -> B:40:0x00f0). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: erj.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = erj.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(pye pyeVar, v1b<? super lyh<? extends lpj>> v1bVar) {
            return ((b) create(pyeVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            pye pyeVar = (pye) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new or60(new a(erj.this, pyeVar, null));
        }
    }

    public erj(ktm ktmVar, jtm jtmVar, ltm ltmVar, fzm fzmVar, ezm ezmVar) {
        ktmVar.getClass();
        jtmVar.getClass();
        ltmVar.getClass();
        fzmVar.getClass();
        ezmVar.getClass();
        this.a = ktmVar;
        this.b = jtmVar;
        this.c = ltmVar;
        this.d = fzmVar;
        this.e = ezmVar;
        b390 b390VarB = d390.b(0, 10, null, 5);
        this.f = b390VarB;
        this.h = r0i.e(b390VarB, r0i.b(ktmVar.d(), new b(null)));
    }

    @Override // defpackage.mtm
    public final Object a(String str, ky00 ky00Var) {
        Long lE = this.a.e();
        if (lE != null) {
            a aVar = new a(lE.longValue(), str);
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            Object objD = this.d.d("/app/round.emoji", aVar, o2gVar, ky00Var);
            if (objD == y5b.a) {
                return objD;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.mtm
    public final void b() {
        this.b.reset();
        this.c.reset();
        this.d.a();
        this.a.b();
    }

    @Override // defpackage.mtm
    public final Object c(iy00 iy00Var) {
        Long lE = this.a.e();
        if (lE != null) {
            long jLongValue = lE.longValue();
            Object objD = this.d.d(String.format("/app/round.%s.leave", Arrays.copyOf(new Object[]{new Long(jLongValue)}, 1)), null, u.a("round-id", String.valueOf(jLongValue)), iy00Var);
            if (objD == y5b.a) {
                return objD;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (r8.d(r13, null, r2, r0) == r1) goto L36;
     */
    @Override // defpackage.mtm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.x1b r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.hrj
            if (r0 == 0) goto L13
            r0 = r13
            hrj r0 = (defpackage.hrj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hrj r0 = new hrj
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            java.lang.String r4 = "round-id"
            r5 = 4
            r6 = 3
            r7 = 2
            fzm r8 = r12.d
            r9 = 1
            if (r2 == 0) goto L4c
            if (r2 == r9) goto L48
            if (r2 == r7) goto L44
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L36
            defpackage.uj50.b(r13)
            goto Lbd
        L36:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r3
        L3c:
            int r12 = r0.b
            long r6 = r0.a
            defpackage.uj50.b(r13)
            goto L95
        L44:
            defpackage.uj50.b(r13)
            goto L6b
        L48:
            defpackage.uj50.b(r13)
            goto L58
        L4c:
            defpackage.uj50.b(r13)
            r0.e = r9
            java.lang.Object r13 = r8.e(r0)
            if (r13 != r1) goto L58
            goto Lbc
        L58:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L6b
            r0.e = r7
            ezm r13 = r12.e
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto L6b
            goto Lbc
        L6b:
            ktm r12 = r12.a
            java.lang.Long r13 = r12.e()
            if (r13 == 0) goto Lbd
            long r10 = r13.longValue()
            java.util.ArrayList r12 = r12.g()
            iee0 r13 = defpackage.iee0.b
            java.lang.String r2 = java.lang.String.valueOf(r10)
            java.util.Map r2 = com.appsflyer.internal.u.a(r4, r2)
            r0.a = r10
            r7 = 0
            r0.b = r7
            r0.e = r6
            java.lang.Object r12 = r8.c(r12, r13, r2, r0)
            if (r12 != r1) goto L93
            goto Lbc
        L93:
            r12 = r7
            r6 = r10
        L95:
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r6)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r9)
            java.lang.String r2 = "/app/round.%s.join"
            java.lang.String r13 = java.lang.String.format(r2, r13)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.util.Map r2 = com.appsflyer.internal.u.a(r4, r2)
            r0.a = r6
            r0.b = r12
            r0.e = r5
            java.lang.Object r12 = r8.d(r13, r3, r2, r0)
            if (r12 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erj.d(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mtm
    public final Object e(x1b x1bVar) {
        frj frjVar;
        if (x1bVar instanceof frj) {
            frjVar = (frj) x1bVar;
            int i = frjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                frjVar.c = i - Integer.MIN_VALUE;
            } else {
                frjVar = new frj(this, x1bVar);
            }
        } else {
            frjVar = new frj(this, x1bVar);
        }
        Object objH = frjVar.a;
        Object obj = y5b.a;
        int i2 = frjVar.c;
        if (i2 == 0) {
            uj50.b(objH);
            frjVar.c = 1;
            objH = this.a.h();
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objH);
        }
        mpj mpjVar = (mpj) objH;
        return mpjVar == null ? new mpj(0) : mpjVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
    
        if (r10.emit(r1, r2) == r3) goto L50;
     */
    @Override // defpackage.mtm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.x1b r21) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erj.f(x1b):java.lang.Object");
    }

    @Override // defpackage.mtm
    public final e77 g() {
        return this.h;
    }
}
