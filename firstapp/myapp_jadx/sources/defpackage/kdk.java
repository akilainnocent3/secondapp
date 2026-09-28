package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNResultDrawDTO;
import com.sportybet.feature.luckynumber.lobby.data.dto.LNResultResponseDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1", f = "GetSearchLotteryResultMapUseCase.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
public final class kdk extends tje0 implements Function2<ez20<? super wf00<String, ? extends lk50<? extends qcn<? extends mk90>>>>, v1b<? super Unit>, Object> {
    public tuw a;
    public LinkedHashMap b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ k1i e;
    public final /* synthetic */ mdk f;
    public final /* synthetic */ ku90 i;

    @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$1", f = "GetSearchLotteryResultMapUseCase.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ k1i b;
        public final /* synthetic */ quw c;
        public final /* synthetic */ ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> d;
        public final /* synthetic */ Map<String, lk50<qcn<mk90>>> e;
        public final /* synthetic */ mdk f;

        /* JADX INFO: renamed from: kdk$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$1$1", f = "GetSearchLotteryResultMapUseCase.kt", l = {107}, m = "invokeSuspend", v = 2)
        public static final class C0758a extends tje0 implements Function2<List<? extends String>, v1b<? super Unit>, Object> {
            public quw a;
            public ez20 b;
            public Map c;
            public mdk d;
            public Iterator e;
            public int f;
            public /* synthetic */ Object i;
            public final /* synthetic */ quw v;
            public final /* synthetic */ ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> w;
            public final /* synthetic */ Map<String, lk50<qcn<mk90>>> y;
            public final /* synthetic */ mdk z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0758a(quw quwVar, ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var, Map<String, lk50<qcn<mk90>>> map, mdk mdkVar, v1b<? super C0758a> v1bVar) {
                super(2, v1bVar);
                this.v = quwVar;
                this.w = ez20Var;
                this.y = map;
                this.z = mdkVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0758a c0758a = new C0758a(this.v, this.w, this.y, this.z, v1bVar);
                c0758a.i = obj;
                return c0758a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends String> list, v1b<? super Unit> v1bVar) {
                return ((C0758a) create(list, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0041  */
            /* JADX WARN: Code duplicated, block: B:13:0x005e A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005c -> B:14:0x005f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = r12.i
                    java.util.List r0 = (java.util.List) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r12.f
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L27
                    if (r2 != r3) goto L21
                    java.util.Iterator r0 = r12.e
                    mdk r2 = r12.d
                    java.util.Map r5 = r12.c
                    ez20 r6 = r12.b
                    quw r7 = r12.a
                    defpackage.uj50.b(r13)
                    r8 = r7
                    r7 = r5
                    r5 = r8
                    r11 = r12
                    r8 = r2
                    goto L5f
                L21:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r12)
                    return r4
                L27:
                    defpackage.uj50.b(r13)
                    java.util.Iterator r13 = r0.iterator()
                    quw r0 = r12.v
                    ez20<wf00<java.lang.String, ? extends lk50<? extends qcn<mk90>>>> r2 = r12.w
                    java.util.Map<java.lang.String, lk50<qcn<mk90>>> r5 = r12.y
                    mdk r6 = r12.z
                    r7 = r5
                    r8 = r6
                    r5 = r0
                    r6 = r2
                    r0 = r13
                L3b:
                    boolean r13 = r0.hasNext()
                    if (r13 == 0) goto L61
                    java.lang.Object r13 = r0.next()
                    r9 = r13
                    java.lang.String r9 = (java.lang.String) r9
                    r12.i = r4
                    r12.a = r5
                    r12.b = r6
                    r12.c = r7
                    r12.d = r8
                    r12.e = r0
                    r12.f = r3
                    r10 = 0
                    r11 = r12
                    java.lang.Object r12 = defpackage.kdk.k(r5, r6, r7, r8, r9, r10, r11)
                    if (r12 != r1) goto L5f
                    return r1
                L5f:
                    r12 = r11
                    goto L3b
                L61:
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: kdk.a.C0758a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k1i k1iVar, quw quwVar, ez20 ez20Var, Map map, mdk mdkVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = k1iVar;
            this.c = quwVar;
            this.d = ez20Var;
            this.e = map;
            this.f = mdkVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0758a c0758a = new C0758a(this.c, this.d, this.e, this.f, null);
                this.a = 1;
                if (kzh.b(this.b, c0758a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$2", f = "GetSearchLotteryResultMapUseCase.kt", l = {113}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ku90 b;
        public final /* synthetic */ quw c;
        public final /* synthetic */ ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> d;
        public final /* synthetic */ Map<String, lk50<qcn<mk90>>> e;
        public final /* synthetic */ mdk f;

        public static final class a<T> implements myh {
            public final /* synthetic */ quw a;
            public final /* synthetic */ ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> b;
            public final /* synthetic */ Map<String, lk50<qcn<mk90>>> c;
            public final /* synthetic */ mdk d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(quw quwVar, ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var, Map<String, lk50<qcn<mk90>>> map, mdk mdkVar) {
                this.a = quwVar;
                this.b = ez20Var;
                this.c = map;
                this.d = mdkVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                mdk mdkVar = this.d;
                return kdk.k(this.a, this.b, this.c, mdkVar, (String) obj, true, v1bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ku90 ku90Var, quw quwVar, ez20 ez20Var, Map map, mdk mdkVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = ku90Var;
            this.c = quwVar;
            this.d = ez20Var;
            this.e = map;
            this.f = mdkVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            a aVar = new a(this.c, this.d, this.e, this.f);
            this.a = 1;
            this.b.collect(aVar, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1", f = "GetSearchLotteryResultMapUseCase.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 80}, m = "invokeSuspend$startFetching", v = 2)
    public static final class c extends x1b {
        public quw a;
        public ez20 b;
        public Map c;
        public mdk d;
        public String e;
        public quw f;
        public boolean i;
        public int v;
        public /* synthetic */ Object w;
        public int y;

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return kdk.k(null, null, null, null, null, false, this);
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$startFetching$2", f = "GetSearchLotteryResultMapUseCase.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ mdk b;
        public final /* synthetic */ String c;
        public final /* synthetic */ quw d;
        public final /* synthetic */ Map<String, lk50<qcn<mk90>>> e;
        public final /* synthetic */ ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> f;

        public static final class a<T> implements myh {
            public final /* synthetic */ quw a;
            public final /* synthetic */ Map<String, lk50<qcn<mk90>>> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> d;

            /* JADX INFO: renamed from: kdk$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$startFetching$2$2", f = "GetSearchLotteryResultMapUseCase.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 97}, m = "emit", v = 2)
            public static final class C0759a extends x1b {
                public lk50 a;
                public quw b;
                public Map c;
                public String d;
                public ez20 e;
                public /* synthetic */ Object f;
                public final /* synthetic */ a<T> i;
                public int v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0759a(a<? super T> aVar, v1b<? super C0759a> v1bVar) {
                    super(v1bVar);
                    this.i = aVar;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.f = obj;
                    this.v |= Integer.MIN_VALUE;
                    return this.i.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(quw quwVar, Map<String, lk50<qcn<mk90>>> map, String str, ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var) {
                this.a = quwVar;
                this.b = map;
                this.c = str;
                this.d = ez20Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(lk50<? extends uf00<mk90>> lk50Var, v1b<? super Unit> v1bVar) throws Throwable {
                C0759a c0759a;
                quw quwVar;
                Map map;
                ez20<wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var;
                lk50<? extends uf00<mk90>> lk50Var2;
                String str;
                quw quwVar2;
                if (v1bVar instanceof C0759a) {
                    c0759a = (C0759a) v1bVar;
                    int i = c0759a.v;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0759a.v = i - Integer.MIN_VALUE;
                    } else {
                        c0759a = new C0759a(this, v1bVar);
                    }
                } else {
                    c0759a = new C0759a(this, v1bVar);
                }
                Object obj = c0759a.f;
                y5b y5bVar = y5b.a;
                int i2 = c0759a.v;
                try {
                    if (i2 == 0) {
                        uj50.b(obj);
                        c0759a.a = lk50Var;
                        quwVar = this.a;
                        c0759a.b = quwVar;
                        map = this.b;
                        c0759a.c = map;
                        String str2 = this.c;
                        c0759a.d = str2;
                        ez20Var = this.d;
                        c0759a.e = ez20Var;
                        c0759a.v = 1;
                        if (quwVar.d(c0759a) != y5bVar) {
                            lk50Var2 = lk50Var;
                            str = str2;
                        }
                        return y5bVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        quwVar2 = c0759a.b;
                        lk50 lk50Var3 = c0759a.a;
                        try {
                            uj50.b(obj);
                            Unit unit = Unit.a;
                            quwVar2.f(null);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            quwVar2.f(null);
                            throw th;
                        }
                    }
                    ez20Var = c0759a.e;
                    str = c0759a.d;
                    map = c0759a.c;
                    quw quwVar3 = c0759a.b;
                    lk50Var2 = c0759a.a;
                    uj50.b(obj);
                    quwVar = quwVar3;
                    map.put(str, lk50Var2);
                    wf00 wf00VarG = a4h.g(map);
                    c0759a.a = null;
                    c0759a.b = quwVar;
                    c0759a.c = null;
                    c0759a.d = null;
                    c0759a.e = null;
                    c0759a.v = 2;
                    if (ez20Var.j(c0759a, wf00VarG) != y5bVar) {
                        quwVar2 = quwVar;
                        Unit unit2 = Unit.a;
                        quwVar2.f(null);
                        return Unit.a;
                    }
                    return y5bVar;
                } catch (Throwable th2) {
                    th = th2;
                    quwVar2 = quwVar;
                    quwVar2.f(null);
                    throw th;
                }
            }
        }

        public static final class b implements lyh<uf00<? extends mk90>> {
            public final /* synthetic */ or60 a;

            @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$startFetching$2$invokeSuspend$$inlined$map$1", f = "GetSearchLotteryResultMapUseCase.kt", l = {109}, m = "collect", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: kdk$d$b$b, reason: collision with other inner class name */
            public static final class C0760b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: kdk$d$b$b$a */
                @c0d(c = "com.sportybet.feature.luckynumber.search.domain.usecase.GetSearchLotteryResultMapUseCase$invoke$1$startFetching$2$invokeSuspend$$inlined$map$1$2", f = "GetSearchLotteryResultMapUseCase.kt", l = {50}, m = "emit", v = 2)
                public static final class a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0760b.this.emit(null, this);
                    }
                }

                public C0760b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    a aVar;
                    if (v1bVar instanceof a) {
                        aVar = (a) v1bVar;
                        int i = aVar.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            aVar.b = i - Integer.MIN_VALUE;
                        } else {
                            aVar = new a(v1bVar);
                        }
                    } else {
                        aVar = new a(v1bVar);
                    }
                    Object obj2 = aVar.a;
                    y5b y5bVar = y5b.a;
                    int i2 = aVar.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        List<LNResultDrawDTO> draws = ((LNResultResponseDTO) n52.b((BaseResponse) obj)).getDraws();
                        ArrayList arrayList = new ArrayList(l48.r(draws, 10));
                        Iterator<T> it = draws.iterator();
                        while (it.hasNext()) {
                            arrayList.add(nk90.a((LNResultDrawDTO) it.next()));
                        }
                        uf00 uf00VarF = a4h.f(arrayList);
                        aVar.b = 1;
                        if (this.a.emit(uf00VarF, aVar) == y5bVar) {
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

            public b(or60 or60Var) {
                this.a = or60Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super uf00<? extends mk90>> myhVar, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0760b c0760b = new C0760b(myhVar);
                    aVar.b = 1;
                    if (this.a.collect(c0760b, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(mdk mdkVar, String str, quw quwVar, Map<String, lk50<qcn<mk90>>> map, ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = mdkVar;
            this.c = str;
            this.d = quwVar;
            this.e = map;
            this.f = ez20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                i6u i6uVar = this.b.a;
                i6uVar.getClass();
                String str = this.c;
                yzh yzhVarA = bm50.a(new b(i6uVar.c(new o6u(i6uVar, 4, null, str, null))));
                a aVar = new a(this.d, this.e, str, this.f);
                this.a = 1;
                if (yzhVarA.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(k1i k1iVar, mdk mdkVar, ku90 ku90Var, v1b v1bVar) {
        super(2, v1bVar);
        this.e = k1iVar;
        this.f = mdkVar;
        this.i = ku90Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object k(quw quwVar, ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var, Map<String, lk50<qcn<mk90>>> map, mdk mdkVar, String str, boolean z, v1b<? super Unit> v1bVar) throws Throwable {
        c cVar;
        mdk mdkVar2;
        String str2;
        quw quwVar2;
        ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var2;
        boolean z2;
        Map<String, lk50<qcn<mk90>>> map2;
        quw quwVar3;
        quw quwVar4;
        int i;
        int i2;
        mdk mdkVar3;
        String str3;
        Map<String, lk50<qcn<mk90>>> map3;
        ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var3;
        quw quwVar5;
        boolean z3;
        if (v1bVar instanceof c) {
            cVar = (c) v1bVar;
            int i3 = cVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.y = i3 - Integer.MIN_VALUE;
            } else {
                cVar = new c(v1bVar);
            }
        } else {
            cVar = new c(v1bVar);
        }
        Object obj = cVar.w;
        y5b y5bVar = y5b.a;
        int i4 = cVar.y;
        try {
            if (i4 == 0) {
                uj50.b(obj);
                cVar.a = quwVar;
                cVar.b = ez20Var;
                cVar.c = map;
                mdkVar2 = mdkVar;
                cVar.d = mdkVar2;
                str2 = str;
                cVar.e = str2;
                cVar.f = quwVar;
                cVar.i = z;
                cVar.y = 1;
                if (quwVar.d(cVar) != y5bVar) {
                    quwVar2 = quwVar;
                    ez20Var2 = ez20Var;
                    z2 = z;
                    map2 = map;
                    quwVar3 = quwVar2;
                }
                return y5bVar;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = cVar.v;
                quwVar4 = cVar.f;
                str3 = cVar.e;
                mdkVar3 = cVar.d;
                map3 = cVar.c;
                ez20Var3 = cVar.b;
                quwVar5 = cVar.a;
                try {
                    uj50.b(obj);
                    i = i2;
                    quwVar2 = quwVar5;
                    map2 = map3;
                    ez20Var2 = ez20Var3;
                    str2 = str3;
                    mdkVar2 = mdkVar3;
                    quwVar3 = quwVar4;
                    z3 = i != 0;
                    quwVar3.f(null);
                    if (z3) {
                        ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var4 = ez20Var2;
                        ej5.c(ez20Var4, null, null, new d(mdkVar2, str2, quwVar2, map2, ez20Var4, null), 3);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    th = th;
                    quwVar4.f(null);
                    throw th;
                }
            }
            z2 = cVar.i;
            quwVar3 = cVar.f;
            String str4 = cVar.e;
            mdk mdkVar4 = cVar.d;
            map2 = cVar.c;
            ez20Var2 = cVar.b;
            quwVar2 = cVar.a;
            uj50.b(obj);
            str2 = str4;
            mdkVar2 = mdkVar4;
            lk50<qcn<mk90>> lk50Var = map2.get(str2);
            i = (lk50Var != null && (!z2 || (lk50Var instanceof lk50.b))) ? 0 : 1;
            if (i != 0) {
                map2.put(str2, lk50.b.a);
                wf00 wf00VarG = a4h.g(map2);
                cVar.a = quwVar2;
                cVar.b = ez20Var2;
                cVar.c = map2;
                cVar.d = mdkVar2;
                cVar.e = str2;
                cVar.f = quwVar3;
                cVar.i = z2;
                cVar.v = i;
                cVar.y = 2;
                if (ez20Var2.j(cVar, wf00VarG) != y5bVar) {
                    i2 = i;
                    quwVar4 = quwVar3;
                    mdkVar3 = mdkVar2;
                    str3 = str2;
                    map3 = map2;
                    ez20Var3 = ez20Var2;
                    quwVar5 = quwVar2;
                    i = i2;
                    quwVar2 = quwVar5;
                    map2 = map3;
                    ez20Var2 = ez20Var3;
                    str2 = str3;
                    mdkVar2 = mdkVar3;
                    quwVar3 = quwVar4;
                }
                return y5bVar;
            }
            if (i != 0) {
            }
            quwVar3.f(null);
            if (z3) {
                ez20<? super wf00<String, ? extends lk50<? extends qcn<mk90>>>> ez20Var5 = ez20Var2;
                ej5.c(ez20Var5, null, null, new d(mdkVar2, str2, quwVar2, map2, ez20Var5, null), 3);
            }
            return Unit.a;
        } catch (Throwable th2) {
            th = th2;
            quwVar4 = quwVar3;
            quwVar4.f(null);
            throw th;
        }
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kdk kdkVar = new kdk(this.e, this.f, this.i, v1bVar);
        kdkVar.d = obj;
        return kdkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super wf00<String, ? extends lk50<? extends qcn<? extends mk90>>>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((kdk) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tuw tuwVarA;
        LinkedHashMap linkedHashMap;
        ez20 ez20Var = (ez20) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            tuwVarA = uuw.a();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            xf00 xf00Var = xf00.i;
            xf00Var.getClass();
            this.d = ez20Var;
            this.a = tuwVarA;
            this.b = linkedHashMap2;
            this.c = 1;
            if (ez20Var.j(this, xf00Var) == y5bVar) {
                return y5bVar;
            }
            linkedHashMap = linkedHashMap2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            LinkedHashMap linkedHashMap3 = this.b;
            tuwVarA = this.a;
            uj50.b(obj);
            linkedHashMap = linkedHashMap3;
        }
        tuw tuwVar = tuwVarA;
        k1i k1iVar = this.e;
        mdk mdkVar = this.f;
        ej5.c(ez20Var, null, null, new a(k1iVar, tuwVar, ez20Var, linkedHashMap, mdkVar, null), 3);
        ej5.c(ez20Var, null, null, new b(this.i, tuwVar, ez20Var, linkedHashMap, mdkVar, null), 3);
        return Unit.a;
    }
}
