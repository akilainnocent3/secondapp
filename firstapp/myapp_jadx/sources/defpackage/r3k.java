package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common_ui.uitext.UiText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {RuntimeVersion.MINOR, 28, 71}, m = "invokeSuspend", v = 2)
public final class r3k extends tje0 implements Function2<myh<? super lk50<? extends w14>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ t3k c;

    @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1$result$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, 38, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 40, 50}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends w14>>, Object> {
        public pjd a;
        public ojd b;
        public ojd c;
        public ojd d;
        public lk50 e;
        public lk50 f;
        public lk50 i;
        public List v;
        public int w;
        public /* synthetic */ Object y;
        public final /* synthetic */ t3k z;

        /* JADX INFO: renamed from: r3k$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1$result$1$achievementDeferred$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {32}, m = "invokeSuspend", v = 2)
        public static final class C1033a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends h04>>, Object> {
            public int a;
            public final /* synthetic */ t3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1033a(t3k t3kVar, v1b<? super C1033a> v1bVar) {
                super(2, v1bVar);
                this.b = t3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1033a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends h04>> v1bVar) {
                return ((C1033a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objE = c34Var.e(this);
                return objE == y5bVar ? y5bVar : objE;
            }
        }

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1$result$1$calendarDeferred$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super lk50<? extends r04>>, Object> {
            public int a;
            public final /* synthetic */ t3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t3k t3kVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = t3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends r04>> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objH = c34Var.h(this);
                return objH == y5bVar ? y5bVar : objH;
            }
        }

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1$result$1$levelConfigsDeferred$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super lk50<? extends List<? extends u14>>>, Object> {
            public int a;
            public final /* synthetic */ t3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(t3k t3kVar, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = t3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends List<? extends u14>>> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objI = c34Var.i(this);
                return objI == y5bVar ? y5bVar : objI;
            }
        }

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1$result$1$metricDeferred$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
        public static final class d extends tje0 implements Function2<v5b, v1b<? super lk50<? extends a24>>, Object> {
            public int a;
            public final /* synthetic */ t3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(t3k t3kVar, v1b<? super d> v1bVar) {
                super(2, v1bVar);
                this.b = t3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new d(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends a24>> v1bVar) {
                return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objC = c34Var.c(this);
                return objC == y5bVar ? y5bVar : objC;
            }
        }

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakLobbyDataUseCase$invoke$1$result$1$missionsDeferred$1", f = "GetBettingStreakLobbyDataUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
        public static final class e extends tje0 implements Function2<v5b, v1b<? super lk50<? extends List<? extends b24>>>, Object> {
            public int a;
            public final /* synthetic */ t3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(t3k t3kVar, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.b = t3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new e(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends List<? extends b24>>> v1bVar) {
                return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objJ = c34Var.j(this);
                return objJ == y5bVar ? y5bVar : objJ;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t3k t3kVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.z = t3kVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.z, v1bVar);
            aVar.y = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends w14>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0110  */
        /* JADX WARN: Code duplicated, block: B:31:0x013a  */
        /* JADX WARN: Code duplicated, block: B:34:0x0145  */
        /* JADX WARN: Code duplicated, block: B:35:0x0148  */
        /* JADX WARN: Code duplicated, block: B:37:0x014b  */
        /* JADX WARN: Code duplicated, block: B:38:0x0150  */
        /* JADX WARN: Code duplicated, block: B:40:0x0153  */
        /* JADX WARN: Code duplicated, block: B:43:0x0159  */
        /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:77:0x0216  */
        /* JADX WARN: Code duplicated, block: B:78:0x0222  */
        /* JADX WARN: Code duplicated, block: B:80:0x0226  */
        /* JADX WARN: Code duplicated, block: B:81:0x0232  */
        /* JADX WARN: Code duplicated, block: B:83:0x0236  */
        /* JADX WARN: Code duplicated, block: B:84:0x0242  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            pjd pjdVarA;
            ojd ojdVarA;
            ojd ojdVarA2;
            Object objQ;
            ojd ojdVar;
            Object objAwait;
            ojd ojdVar2;
            lk50 lk50Var;
            lk50 lk50Var2;
            Object objAwait2;
            lk50 lk50Var3;
            lk50 lk50Var4;
            ojd ojdVar3;
            lk50 lk50Var5;
            Object objAwait3;
            lk50 lk50Var6;
            lk50 lk50Var7;
            lk50 lk50Var8;
            lk50.c cVar;
            List list;
            Pair pair;
            Object objAwait4;
            lk50 lk50Var9;
            List list2;
            List<Integer> list3;
            List list4;
            List<Integer> listQ0;
            v5b v5bVar = (v5b) this.y;
            y5b y5bVar = y5b.a;
            int i = this.w;
            t3k t3kVar = this.z;
            if (i == 0) {
                uj50.b(obj);
                pjd pjdVarA2 = ej5.a(v5bVar, null, new d(t3kVar, null), 3);
                pjdVarA = ej5.a(v5bVar, null, new b(t3kVar, null), 3);
                pjd pjdVarA3 = ej5.a(v5bVar, null, new C1033a(t3kVar, null), 3);
                ojdVarA = ej5.a(v5bVar, null, new e(t3kVar, null), 3);
                ojdVarA2 = ej5.a(v5bVar, null, new c(t3kVar, null), 3);
                this.y = null;
                this.a = pjdVarA;
                this.b = pjdVarA3;
                this.c = ojdVarA;
                this.d = ojdVarA2;
                this.w = 1;
                objQ = pjdVarA2.q(this);
                if (objQ != y5bVar) {
                    ojdVar = pjdVarA3;
                }
                return y5bVar;
            }
            if (i == 1) {
                ojdVarA2 = this.d;
                ojd ojdVar4 = this.c;
                ojdVar = this.b;
                pjdVarA = this.a;
                uj50.b(obj);
                ojdVarA = ojdVar4;
                objQ = obj;
            } else {
                if (i == 2) {
                    lk50Var = this.e;
                    ojdVar2 = this.d;
                    ojd ojdVar5 = this.c;
                    ojdVar = this.b;
                    uj50.b(obj);
                    ojdVarA = ojdVar5;
                    objAwait = obj;
                    lk50Var2 = (lk50) objAwait;
                    this.y = null;
                    this.a = null;
                    this.b = null;
                    this.c = ojdVarA;
                    this.d = ojdVar2;
                    this.e = lk50Var;
                    this.f = lk50Var2;
                    this.w = 3;
                    objAwait2 = ojdVar.await(this);
                    if (objAwait2 != y5bVar) {
                        ojd ojdVar6 = ojdVar2;
                        lk50Var3 = lk50Var;
                        lk50Var4 = lk50Var2;
                        ojdVar3 = ojdVar6;
                        lk50Var5 = (lk50) objAwait2;
                        this.y = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = ojdVar3;
                        this.e = lk50Var3;
                        this.f = lk50Var4;
                        this.i = lk50Var5;
                        this.w = 4;
                        objAwait3 = ojdVarA.await(this);
                        if (objAwait3 != y5bVar) {
                            lk50Var6 = lk50Var4;
                            lk50Var7 = lk50Var5;
                            lk50Var8 = (lk50) objAwait3;
                            if (lk50Var8 instanceof lk50.c) {
                                cVar = (lk50.c) lk50Var8;
                            } else {
                                cVar = null;
                            }
                            if (cVar != null) {
                                list = (List) cVar.a;
                            } else {
                                list = null;
                            }
                            if (list == null) {
                                list = m2g.a;
                            }
                            if (lk50Var3 instanceof lk50.c) {
                            }
                            t3kVar.getClass();
                            if (lk50Var3 instanceof lk50.a) {
                                lk50.a aVar = (lk50.a) lk50Var3;
                                pair = new Pair(aVar.a, aVar.b);
                            } else if (lk50Var7 instanceof lk50.a) {
                                lk50.a aVar2 = (lk50.a) lk50Var7;
                                pair = new Pair(aVar2.a, aVar2.b);
                            } else if (lk50Var6 instanceof lk50.a) {
                                lk50.a aVar3 = (lk50.a) lk50Var6;
                                pair = new Pair(aVar3.a, aVar3.b);
                            } else {
                                pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                            }
                            return new lk50.a((Throwable) pair.a, (UiText) pair.b);
                        }
                    }
                    return y5bVar;
                }
                if (i == 3) {
                    lk50Var4 = this.f;
                    lk50Var3 = this.e;
                    ojd ojdVar7 = this.d;
                    ojd ojdVar8 = this.c;
                    uj50.b(obj);
                    ojdVarA = ojdVar8;
                    ojdVar3 = ojdVar7;
                    objAwait2 = obj;
                    lk50Var5 = (lk50) objAwait2;
                    this.y = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = ojdVar3;
                    this.e = lk50Var3;
                    this.f = lk50Var4;
                    this.i = lk50Var5;
                    this.w = 4;
                    objAwait3 = ojdVarA.await(this);
                    if (objAwait3 != y5bVar) {
                        lk50Var6 = lk50Var4;
                        lk50Var7 = lk50Var5;
                        lk50Var8 = (lk50) objAwait3;
                        if (lk50Var8 instanceof lk50.c) {
                            cVar = (lk50.c) lk50Var8;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            list = (List) cVar.a;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = m2g.a;
                        }
                        if (lk50Var3 instanceof lk50.c) {
                        }
                        t3kVar.getClass();
                        if (lk50Var3 instanceof lk50.a) {
                            lk50.a aVar4 = (lk50.a) lk50Var3;
                            pair = new Pair(aVar4.a, aVar4.b);
                        } else if (lk50Var7 instanceof lk50.a) {
                            lk50.a aVar5 = (lk50.a) lk50Var7;
                            pair = new Pair(aVar5.a, aVar5.b);
                        } else if (lk50Var6 instanceof lk50.a) {
                            lk50.a aVar6 = (lk50.a) lk50Var6;
                            pair = new Pair(aVar6.a, aVar6.b);
                        } else {
                            pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                        }
                        return new lk50.a((Throwable) pair.a, (UiText) pair.b);
                    }
                    return y5bVar;
                }
                if (i == 4) {
                    lk50Var7 = this.i;
                    lk50 lk50Var10 = this.f;
                    lk50 lk50Var11 = this.e;
                    ojd ojdVar9 = this.d;
                    uj50.b(obj);
                    ojdVar3 = ojdVar9;
                    lk50Var6 = lk50Var10;
                    lk50Var3 = lk50Var11;
                    objAwait3 = obj;
                    lk50Var8 = (lk50) objAwait3;
                    if (lk50Var8 instanceof lk50.c) {
                        cVar = (lk50.c) lk50Var8;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        list = (List) cVar.a;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = m2g.a;
                    }
                    if ((lk50Var3 instanceof lk50.c) || !(lk50Var6 instanceof lk50.c) || !(lk50Var7 instanceof lk50.c)) {
                        t3kVar.getClass();
                        if (lk50Var3 instanceof lk50.a) {
                            lk50.a aVar7 = (lk50.a) lk50Var3;
                            pair = new Pair(aVar7.a, aVar7.b);
                        } else if (lk50Var7 instanceof lk50.a) {
                            lk50.a aVar8 = (lk50.a) lk50Var7;
                            pair = new Pair(aVar8.a, aVar8.b);
                        } else if (lk50Var6 instanceof lk50.a) {
                            lk50.a aVar9 = (lk50.a) lk50Var6;
                            pair = new Pair(aVar9.a, aVar9.b);
                        } else {
                            pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                        }
                        return new lk50.a((Throwable) pair.a, (UiText) pair.b);
                    }
                    this.y = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = lk50Var3;
                    this.f = lk50Var6;
                    this.i = lk50Var7;
                    this.v = list;
                    this.w = 5;
                    objAwait4 = ojdVar3.await(this);
                    if (objAwait4 != y5bVar) {
                        lk50Var9 = lk50Var7;
                        list2 = list;
                    }
                    return y5bVar;
                }
                if (i != 5) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list5 = this.v;
                lk50Var9 = this.i;
                lk50 lk50Var12 = this.f;
                lk50 lk50Var13 = this.e;
                uj50.b(obj);
                list2 = list5;
                lk50Var6 = lk50Var12;
                lk50Var3 = lk50Var13;
                objAwait4 = obj;
            }
            lk50 lk50Var14 = (lk50) objAwait4;
            lk50.c cVar2 = lk50Var14 instanceof lk50.c ? (lk50.c) lk50Var14 : null;
            if (cVar2 == null || (list4 = (List) cVar2.a) == null) {
                list3 = w14.l;
            } else {
                ArrayList arrayList = new ArrayList(l48.r(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    bki0.a(((u14) it.next()).b, arrayList);
                }
                List listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList));
                if (listA0 == null || (listQ0 = CollectionsKt.q0(listA0)) == null) {
                    list3 = w14.l;
                } else {
                    list3 = listQ0.isEmpty() ? null : listQ0;
                    if (list3 == null) {
                        list3 = w14.l;
                    }
                }
            }
            List<Integer> list6 = list3;
            a24 a24Var = (a24) ((lk50.c) lk50Var3).a;
            r04 r04Var = (r04) ((lk50.c) lk50Var6).a;
            h04 h04Var = (h04) ((lk50.c) lk50Var9).a;
            t3kVar.getClass();
            return new lk50.c(new w14(a24Var.a, a24Var.b, a24Var.c, a24Var.d, a24Var.e, a24Var.f, list2, r04Var.a, a24Var.g, h04Var.b, list6));
            lk50 lk50Var15 = (lk50) objQ;
            this.y = null;
            this.a = null;
            this.b = ojdVar;
            this.c = ojdVarA;
            this.d = ojdVarA2;
            this.e = lk50Var15;
            this.w = 2;
            objAwait = pjdVarA.await(this);
            if (objAwait != y5bVar) {
                ojdVar2 = ojdVarA2;
                lk50Var = lk50Var15;
                lk50Var2 = (lk50) objAwait;
                this.y = null;
                this.a = null;
                this.b = null;
                this.c = ojdVarA;
                this.d = ojdVar2;
                this.e = lk50Var;
                this.f = lk50Var2;
                this.w = 3;
                objAwait2 = ojdVar.await(this);
                if (objAwait2 != y5bVar) {
                    ojd ojdVar10 = ojdVar2;
                    lk50Var3 = lk50Var;
                    lk50Var4 = lk50Var2;
                    ojdVar3 = ojdVar10;
                    lk50Var5 = (lk50) objAwait2;
                    this.y = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = ojdVar3;
                    this.e = lk50Var3;
                    this.f = lk50Var4;
                    this.i = lk50Var5;
                    this.w = 4;
                    objAwait3 = ojdVarA.await(this);
                    if (objAwait3 != y5bVar) {
                        lk50Var6 = lk50Var4;
                        lk50Var7 = lk50Var5;
                        lk50Var8 = (lk50) objAwait3;
                        if (lk50Var8 instanceof lk50.c) {
                            cVar = (lk50.c) lk50Var8;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            list = (List) cVar.a;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = m2g.a;
                        }
                        if (lk50Var3 instanceof lk50.c) {
                        }
                        t3kVar.getClass();
                        if (lk50Var3 instanceof lk50.a) {
                            lk50.a aVar10 = (lk50.a) lk50Var3;
                            pair = new Pair(aVar10.a, aVar10.b);
                        } else if (lk50Var7 instanceof lk50.a) {
                            lk50.a aVar11 = (lk50.a) lk50Var7;
                            pair = new Pair(aVar11.a, aVar11.b);
                        } else if (lk50Var6 instanceof lk50.a) {
                            lk50.a aVar12 = (lk50.a) lk50Var6;
                            pair = new Pair(aVar12.a, aVar12.b);
                        } else {
                            pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                        }
                        return new lk50.a((Throwable) pair.a, (UiText) pair.b);
                    }
                }
            }
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3k(t3k t3kVar, v1b<? super r3k> v1bVar) {
        super(2, v1bVar);
        this.c = t3kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        r3k r3kVar = new r3k(this.c, v1bVar);
        r3kVar.b = obj;
        return r3kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends w14>> myhVar, v1b<? super Unit> v1bVar) {
        return ((r3k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0.emit((defpackage.lk50) r8, r7) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L18
            defpackage.uj50.b(r8)
            goto L55
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L1e:
            defpackage.uj50.b(r8)
            goto L48
        L22:
            defpackage.uj50.b(r8)
            goto L36
        L26:
            defpackage.uj50.b(r8)
            lk50$b r8 = lk50.b.a
            r7.b = r0
            r7.a = r5
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L36
            goto L54
        L36:
            r3k$a r8 = new r3k$a
            t3k r2 = r7.c
            r8.<init>(r2, r6)
            r7.b = r0
            r7.a = r4
            java.lang.Object r8 = defpackage.w5b.d(r8, r7)
            if (r8 != r1) goto L48
            goto L54
        L48:
            lk50 r8 = (defpackage.lk50) r8
            r7.b = r6
            r7.a = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r3k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
