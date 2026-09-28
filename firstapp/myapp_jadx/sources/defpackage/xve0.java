package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.goldmine.data.dto.TGAvailableDTO;
import com.sportygames.goldmine.data.dto.TGBetAmountConfigDTO;
import com.sportygames.goldmine.data.dto.TGPayTableDTO;
import com.sportygames.goldmine.data.dto.TGUserInfoDTO;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1", f = "TGInitDataFlowUseCase.kt", l = {94}, m = "invokeSuspend", v = 1)
public final class xve0 extends tje0 implements Function1<v1b<? super List<? extends kzs<?>>>, Object> {
    public kzs[] a;
    public kzs[] b;
    public int c;
    public int d;
    public final /* synthetic */ zve0 e;
    public final /* synthetic */ dm8 f;
    public final /* synthetic */ dm8 i;
    public final /* synthetic */ dm8 v;
    public final /* synthetic */ dm8 w;
    public final /* synthetic */ dm8 y;
    public final /* synthetic */ dm8 z;

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$10", f = "TGInitDataFlowUseCase.kt", l = {98}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<List<? extends File>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ zve0 c;

        /* JADX INFO: renamed from: xve0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$10$1", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C1309a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ zve0 a;
            public final /* synthetic */ List<File> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1309a(zve0 zve0Var, List<? extends File> list, v1b<? super C1309a> v1bVar) {
                super(2, v1bVar);
                this.a = zve0Var;
                this.b = list;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1309a(this.a, this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1309a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.h.a(this.b);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zve0 zve0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = zve0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends File> list, v1b<? super Unit> v1bVar) {
            return ((a) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                pfd pfdVar = fse.a;
                wcl wclVar = gku.a;
                C1309a c1309a = new C1309a(this.c, list, null);
                this.b = null;
                this.a = 1;
                if (ej5.d(wclVar, c1309a, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$12", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<com.sportygames.newcms.b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dm8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dm8 dm8Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = dm8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sportygames.newcms.b bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.R(bVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$2", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<TGAvailableDTO, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dm8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(dm8 dm8Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = dm8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TGAvailableDTO tGAvailableDTO, v1b<? super Unit> v1bVar) {
            return ((c) create(tGAvailableDTO, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            TGAvailableDTO tGAvailableDTO = (TGAvailableDTO) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.R(Boolean.valueOf(tGAvailableDTO.getAvailable()));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$4", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<TGBetAmountConfigDTO, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dm8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(dm8 dm8Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = dm8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.b, v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TGBetAmountConfigDTO tGBetAmountConfigDTO, v1b<? super Unit> v1bVar) {
            return ((d) create(tGBetAmountConfigDTO, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            TGBetAmountConfigDTO tGBetAmountConfigDTO = (TGBetAmountConfigDTO) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.R(tGBetAmountConfigDTO);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$6", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<TGUserInfoDTO, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dm8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dm8 dm8Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = dm8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.b, v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TGUserInfoDTO tGUserInfoDTO, v1b<? super Unit> v1bVar) {
            return ((e) create(tGUserInfoDTO, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            TGUserInfoDTO tGUserInfoDTO = (TGUserInfoDTO) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.R(tGUserInfoDTO);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$8", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<TGPayTableDTO, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dm8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dm8 dm8Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = dm8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = new f(this.b, v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TGPayTableDTO tGPayTableDTO, v1b<? super Unit> v1bVar) {
            return ((f) create(tGPayTableDTO, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            TGPayTableDTO tGPayTableDTO = (TGPayTableDTO) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.R(tGPayTableDTO);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$9", f = "TGInitDataFlowUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<p0f0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dm8 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(dm8 dm8Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = dm8Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = new g(this.b, v1bVar);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0f0 p0f0Var, v1b<? super Unit> v1bVar) {
            return ((g) create(p0f0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            p0f0 p0f0Var = (p0f0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.R(p0f0Var);
            return Unit.a;
        }
    }

    public static final class h implements lyh<TGAvailableDTO> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: xve0$h$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$invokeSuspend$$inlined$map$1$2", f = "TGInitDataFlowUseCase.kt", l = {50}, m = "emit", v = 1)
            public static final class C1310a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1310a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws wjd0, rve0.a {
                C1310a c1310a;
                if (v1bVar instanceof C1310a) {
                    c1310a = (C1310a) v1bVar;
                    int i = c1310a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1310a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1310a = new C1310a(v1bVar);
                    }
                } else {
                    c1310a = new C1310a(v1bVar);
                }
                Object obj2 = c1310a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1310a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = em50.b((HTTPResponse) obj);
                    if (!((TGAvailableDTO) objB).getAvailable()) {
                        throw rve0.a.a;
                    }
                    c1310a.b = 1;
                    if (this.a.emit(objB, c1310a) == y5bVar) {
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

        public h(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super TGAvailableDTO> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class i implements lyh<TGBetAmountConfigDTO> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: xve0$i$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$invokeSuspend$$inlined$map$2$2", f = "TGInitDataFlowUseCase.kt", l = {50}, m = "emit", v = 1)
            public static final class C1311a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1311a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws wjd0 {
                C1311a c1311a;
                if (v1bVar instanceof C1311a) {
                    c1311a = (C1311a) v1bVar;
                    int i = c1311a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1311a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1311a = new C1311a(v1bVar);
                    }
                } else {
                    c1311a = new C1311a(v1bVar);
                }
                Object obj2 = c1311a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1311a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = em50.b((HTTPResponse) obj);
                    c1311a.b = 1;
                    if (this.a.emit(objB, c1311a) == y5bVar) {
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

        public i(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super TGBetAmountConfigDTO> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class j implements lyh<TGUserInfoDTO> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: xve0$j$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$invokeSuspend$$inlined$map$3$2", f = "TGInitDataFlowUseCase.kt", l = {50}, m = "emit", v = 1)
            public static final class C1312a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1312a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws wjd0 {
                C1312a c1312a;
                if (v1bVar instanceof C1312a) {
                    c1312a = (C1312a) v1bVar;
                    int i = c1312a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1312a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1312a = new C1312a(v1bVar);
                    }
                } else {
                    c1312a = new C1312a(v1bVar);
                }
                Object obj2 = c1312a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1312a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = em50.b((HTTPResponse) obj);
                    c1312a.b = 1;
                    if (this.a.emit(objB, c1312a) == y5bVar) {
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

        public j(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super TGUserInfoDTO> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class k implements lyh<TGPayTableDTO> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: xve0$k$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.usecase.TGFetchDataFlowUseCase$invoke$1$invokeSuspend$$inlined$map$4$2", f = "TGInitDataFlowUseCase.kt", l = {50}, m = "emit", v = 1)
            public static final class C1313a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1313a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws wjd0 {
                C1313a c1313a;
                if (v1bVar instanceof C1313a) {
                    c1313a = (C1313a) v1bVar;
                    int i = c1313a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1313a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1313a = new C1313a(v1bVar);
                    }
                } else {
                    c1313a = new C1313a(v1bVar);
                }
                Object obj2 = c1313a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1313a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = em50.b((HTTPResponse) obj);
                    c1313a.b = 1;
                    if (this.a.emit(objB, c1313a) == y5bVar) {
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

        public k(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super TGPayTableDTO> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xve0(zve0 zve0Var, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4, dm8 dm8Var5, dm8 dm8Var6, v1b v1bVar) {
        super(1, v1bVar);
        this.e = zve0Var;
        this.f = dm8Var;
        this.i = dm8Var2;
        this.v = dm8Var3;
        this.w = dm8Var4;
        this.y = dm8Var5;
        this.z = dm8Var6;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new xve0(this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super List<? extends kzs<?>>> v1bVar) {
        return ((xve0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kzs[] kzsVarArr;
        kzs[] kzsVarArr2;
        int i2;
        y5b y5bVar = y5b.a;
        int i3 = this.d;
        zve0 zve0Var = this.e;
        if (i3 == 0) {
            uj50.b(obj);
            kzsVarArr = new kzs[7];
            t4l t4lVar = zve0Var.a;
            t4l t4lVar2 = zve0Var.a;
            kzsVarArr[0] = kee.b(new h(t4lVar.a()), new c(this.f, null));
            kzsVarArr[1] = kee.b(new i(t4lVar2.g()), new d(this.i, null));
            kzsVarArr[2] = kee.b(new j(t4lVar2.d()), new e(this.v, null));
            kzsVarArr[3] = kee.b(new k(t4lVar2.f()), new f(this.w, null));
            kzsVarArr[4] = kee.b(zve0Var.c.a(), new g(this.y, null));
            this.a = kzsVarArr;
            this.b = kzsVarArr;
            this.c = 5;
            this.d = 1;
            obj = zve0Var.a(new String[]{"sg_common_dialog_message", "sg_fbg_dialog"}, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            kzsVarArr2 = kzsVarArr;
            i2 = 5;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.c;
            kzsVarArr = this.b;
            kzsVarArr2 = this.a;
            uj50.b(obj);
        }
        kzsVarArr[i2] = kee.b((lyh) obj, new a(zve0Var, null));
        kzsVarArr2[6] = zve0Var.b.a(new wve0(), new b(this.z, null));
        return kotlin.collections.b.k(kzsVarArr2);
    }
}
