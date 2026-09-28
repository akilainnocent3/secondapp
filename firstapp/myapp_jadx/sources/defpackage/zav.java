package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zav implements sum {
    public final b5 a;
    public final mum b;
    public final ktm c;
    public final fzm d;
    public final ezm e;
    public int f;
    public final d g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lzav$a;", "", "", "a", "J", "getRoomConfigId", "()J", "roomConfigId", "", "b", "Ljava/lang/String;", "getEmoji", "()Ljava/lang/String;", "emoji", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("roomConfigId")
        private final long roomConfigId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @SerializedName("emoji")
        private final String emoji;

        public a(long j, String str) {
            this.roomConfigId = j;
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
            return this.roomConfigId == aVar.roomConfigId && Intrinsics.g(this.emoji, aVar.emoji);
        }

        public final int hashCode() {
            return this.emoji.hashCode() + (Long.hashCode(this.roomConfigId) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmojiPayload(roomConfigId=");
            sb.append(this.roomConfigId);
            sb.append(", emoji=");
            return j26.a(sb, this.emoji, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzav$b;", "", "", "a", "J", "getJoinKey", "()J", "joinKey", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @SerializedName("joinKey")
        private final long joinKey;

        public b(long j) {
            this.joinKey = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.joinKey == ((b) obj).joinKey;
        }

        public final int hashCode() {
            return Long.hashCode(this.joinKey);
        }

        public final String toString() {
            return uvh.a(new StringBuilder("SyncPayload(joinKey="), this.joinKey, ')');
        }
    }

    @c0d(c = "com.sportygames.piggybash.domain.usecase.matchmaking.MatchmakingUseCase$events$1", f = "MatchmakingUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<qye, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = zav.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qye qyeVar, v1b<? super Unit> v1bVar) {
            return ((c) create(qyeVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qye qyeVar = (qye) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = qyeVar instanceof qye.e;
            zav zavVar = zav.this;
            if (z) {
                ktm ktmVar = zavVar.c;
                qye.e eVar = (qye.e) qyeVar;
                long j = eVar.a;
                List<String> list = eVar.b;
                String countryCurrency = zavVar.a.getCountryCurrency();
                if (countryCurrency == null) {
                    countryCurrency = "";
                }
                String str = countryCurrency;
                double d = eVar.f;
                int i = eVar.g;
                int i2 = eVar.e;
                ArrayList arrayList = eVar.c;
                int iA = jpu.a(l48.r(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    int i4 = i3 + 1;
                    rye ryeVar = (rye) obj2;
                    ArrayList arrayList2 = arrayList;
                    double d2 = d;
                    int i5 = size;
                    linkedHashMap.put(Long.valueOf(ryeVar.a), new up10(ryeVar.b, ryeVar.a == eVar.d));
                    i3 = i4;
                    size = i5;
                    arrayList = arrayList2;
                    d = d2;
                }
                ktmVar.f(j, list, new mpj(d, str, i, i2, linkedHashMap));
            } else if (qyeVar instanceof qye.b) {
                int i6 = zavVar.f;
                zavVar.f = i6 + 1;
                s75.a(i6);
            }
            return Unit.a;
        }
    }

    public static final class d implements lyh<jav> {
        public final /* synthetic */ g1i a;
        public final /* synthetic */ zav b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ zav b;

            /* JADX INFO: renamed from: zav$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.piggybash.domain.usecase.matchmaking.MatchmakingUseCase$special$$inlined$map$1$2", f = "MatchmakingUseCase.kt", l = {50}, m = "emit", v = 1)
            public static final class C1385a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1385a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, zav zavVar) {
                this.a = myhVar;
                this.b = zavVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1385a c1385a;
                Object aVar;
                if (v1bVar instanceof C1385a) {
                    c1385a = (C1385a) v1bVar;
                    int i = c1385a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1385a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1385a = new C1385a(v1bVar);
                    }
                } else {
                    c1385a = new C1385a(v1bVar);
                }
                Object obj2 = c1385a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1385a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    qye qyeVar = (qye) obj;
                    zav zavVar = this.b;
                    String countryCurrency = zavVar.a.getCountryCurrency();
                    if (countryCurrency == null) {
                        countryCurrency = "";
                    }
                    String str = countryCurrency;
                    int i3 = zavVar.f;
                    qyeVar.getClass();
                    if (qyeVar instanceof qye.b) {
                        qye.b bVar = (qye.b) qyeVar;
                        aVar = new jav.b.c(i3, bVar.b, bVar.c);
                    } else if (qyeVar instanceof qye.a) {
                        aVar = new jav.a.b(str, ((qye.a) qyeVar).a);
                    } else if (qyeVar instanceof qye.c) {
                        qye.c cVar = (qye.c) qyeVar;
                        int i4 = cVar.a;
                        aVar = new jav.b.C0714b(i4, cVar.b + i4);
                    } else if (qyeVar instanceof qye.d) {
                        qye.d dVar = (qye.d) qyeVar;
                        aVar = new jav.b.a(dVar.a, dVar.b, dVar.d, str);
                    } else {
                        if (!(qyeVar instanceof qye.e)) {
                            uhc.a();
                            return null;
                        }
                        aVar = jav.a.C0713a.a;
                    }
                    c1385a.b = 1;
                    if (this.a.emit(aVar, c1385a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public d(g1i g1iVar, zav zavVar) {
            this.a = g1iVar;
            this.b = zavVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super jav> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public zav(b5 b5Var, mum mumVar, rum rumVar, ktm ktmVar, fzm fzmVar, ezm ezmVar) {
        b5Var.getClass();
        mumVar.getClass();
        rumVar.getClass();
        ktmVar.getClass();
        fzmVar.getClass();
        ezmVar.getClass();
        this.a = b5Var;
        this.b = mumVar;
        this.c = ktmVar;
        this.d = fzmVar;
        this.e = ezmVar;
        this.f = -1;
        this.g = new d(new g1i(rumVar.e(), new c(null)), this);
    }

    @Override // defpackage.sum
    public final Object a(String str, ky00 ky00Var) {
        Long lI = this.b.i();
        if (lI != null) {
            a aVar = new a(lI.longValue(), str);
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            Object objD = this.d.d("/app/matchmaking.emoji", aVar, o2gVar, ky00Var);
            if (objD == y5b.a) {
                return objD;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.sum
    public final d e() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r13.e.a(r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r10.d(r2, r4, r13, r0) == r1) goto L33;
     */
    @Override // defpackage.sum
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.x1b r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.abv
            if (r0 == 0) goto L13
            r0 = r14
            abv r0 = (defpackage.abv) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            abv r0 = new abv
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            mum r5 = r13.b
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            defpackage.uj50.b(r14)
            goto Lc0
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r13)
            return r8
        L38:
            int r2 = r0.b
            java.util.Iterator r9 = r0.a
            defpackage.uj50.b(r14)
            goto L5c
        L40:
            defpackage.uj50.b(r14)
            goto L52
        L44:
            defpackage.uj50.b(r14)
            r0.e = r6
            ezm r14 = r13.e
            java.lang.Object r14 = r14.a(r0)
            if (r14 != r1) goto L52
            goto Lbf
        L52:
            java.util.ArrayList r14 = r5.e()
            java.util.Iterator r14 = r14.iterator()
            r9 = r14
            r2 = r7
        L5c:
            boolean r14 = r9.hasNext()
            fzm r10 = r13.d
            if (r14 == 0) goto L82
            java.lang.Object r14 = r9.next()
            java.lang.String r14 = (java.lang.String) r14
            java.util.List r14 = kotlin.collections.a.c(r14)
            iee0 r11 = defpackage.iee0.a
            o2g r12 = defpackage.o2g.a
            r12.getClass()
            r0.a = r9
            r0.b = r2
            r0.e = r4
            java.lang.Object r14 = r10.c(r14, r11, r12, r0)
            if (r14 != r1) goto L5c
            goto Lbf
        L82:
            java.lang.Long r13 = r5.c()
            if (r13 == 0) goto Lc0
            long r13 = r13.longValue()
            java.lang.Long r2 = r5.i()
            if (r2 == 0) goto Lc0
            long r4 = r2.longValue()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            java.lang.String r4 = "/app/matchmaking.%s.sync"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            zav$b r4 = new zav$b
            r4.<init>(r13)
            r0.a = r8
            r0.b = r7
            r0.e = r3
            o2g r13 = defpackage.o2g.a
            r13.getClass()
            java.lang.Object r13 = r10.d(r2, r4, r13, r0)
            if (r13 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zav.f(x1b):java.lang.Object");
    }

    @Override // defpackage.sum
    public final void g() {
        this.f = -1;
        this.b.f();
    }
}
