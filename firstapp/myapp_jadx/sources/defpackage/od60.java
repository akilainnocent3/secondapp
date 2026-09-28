package defpackage;

import android.content.Context;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.newcms.d;
import com.sportygames.speedybingo.data.dto.SBAvailableDTO;
import com.sportygames.speedybingo.data.dto.SBBetConfigDTO;
import com.sportygames.speedybingo.data.dto.SBPayTableDTO;
import com.sportygames.speedybingo.data.dto.SBUserInfoDTO;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class od60 implements kd60 {
    public final Context a;
    public final iua0 b;
    public final d c;
    public final wd60 d;
    public final vmy e;
    public final b5 f;
    public final pp5 g;
    public final String h;
    public final k5b i;
    public final k5b j;

    public static final class a implements lyh<qe60> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ od60 b;
        public final /* synthetic */ dm8 c;
        public final /* synthetic */ dm8 d;
        public final /* synthetic */ dm8 e;
        public final /* synthetic */ dm8 f;
        public final /* synthetic */ dm8 i;

        /* JADX INFO: renamed from: od60$a$a, reason: collision with other inner class name */
        public static final class C0934a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ od60 b;
            public final /* synthetic */ dm8 c;
            public final /* synthetic */ dm8 d;
            public final /* synthetic */ dm8 e;
            public final /* synthetic */ dm8 f;
            public final /* synthetic */ dm8 i;

            /* JADX INFO: renamed from: od60$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$$inlined$map$1$2", f = "SBFetchDataUseCaseImpl.kt", l = {56, 57, 58, 59, 60, 50}, m = "emit", v = 1)
            public static final class C0935a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;
                public od60 e;
                public com.sportygames.newcms.b f;
                public SBBetConfigDTO i;
                public SBPayTableDTO v;
                public hg60 w;
                public int y;
                public int z;

                public C0935a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0934a.this.emit(null, this);
                }
            }

            public C0934a(myh myhVar, od60 od60Var, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4, dm8 dm8Var5) {
                this.a = myhVar;
                this.b = od60Var;
                this.c = dm8Var;
                this.d = dm8Var2;
                this.e = dm8Var3;
                this.f = dm8Var4;
                this.i = dm8Var5;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
            /* JADX WARN: Code duplicated, block: B:41:0x011c A[PHI: r1 r4 r7 r8 r9 r10 r11
              0x011c: PHI (r1v24 java.lang.Object) = (r1v23 java.lang.Object), (r1v1 java.lang.Object) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
              0x011c: PHI (r4v11 int) = (r4v9 int), (r4v12 int) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
              0x011c: PHI (r7v5 int) = (r7v3 int), (r7v6 int) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
              0x011c: PHI (r8v6 com.sportygames.speedybingo.data.dto.SBBetConfigDTO) = (r8v4 com.sportygames.speedybingo.data.dto.SBBetConfigDTO), (r8v8 com.sportygames.speedybingo.data.dto.SBBetConfigDTO) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
              0x011c: PHI (r9v7 com.sportygames.newcms.b) = (r9v4 com.sportygames.newcms.b), (r9v9 com.sportygames.newcms.b) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
              0x011c: PHI (r10v7 od60) = (r10v4 od60), (r10v9 od60) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]
              0x011c: PHI (r11v3 myh) = (r11v20 myh), (r11v21 myh) binds: [B:39:0x0118, B:15:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:44:0x0139  */
            /* JADX WARN: Code duplicated, block: B:48:0x0161  */
            /* JADX WARN: Code duplicated, block: B:52:0x01b9 A[LOOP:0: B:50:0x01b3->B:52:0x01b9, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:56:0x0215 A[LOOP:1: B:54:0x020f->B:56:0x0215, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:59:0x023d  */
            /* JADX WARN: Code duplicated, block: B:62:0x0244  */
            /* JADX WARN: Code duplicated, block: B:64:0x0247  */
            /* JADX WARN: Code duplicated, block: B:67:0x0259  */
            /* JADX WARN: Code duplicated, block: B:69:0x0267  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x028f, code lost:
            
                if (r9.emit(r0, r2) == r3) goto L73;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v30, types: [com.sportygames.newcms.b, com.sportygames.speedybingo.data.dto.SBBetConfigDTO, com.sportygames.speedybingo.data.dto.SBPayTableDTO, hg60, myh, od60] */
            /* JADX WARN: Type inference failed for: r1v37 */
            /* JADX WARN: Type inference failed for: r1v9 */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r24, defpackage.v1b r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 684
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: od60.a.C0934a.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public a(yzh yzhVar, od60 od60Var, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4, dm8 dm8Var5) {
            this.a = yzhVar;
            this.b = od60Var;
            this.c = dm8Var;
            this.d = dm8Var2;
            this.e = dm8Var3;
            this.f = dm8Var4;
            this.i = dm8Var5;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super qe60> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0934a(myhVar, this.b, this.c, this.d, this.e, this.f, this.i), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1", f = "SBFetchDataUseCaseImpl.kt", l = {87}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function1<v1b<? super List<? extends kzs<?>>>, Object> {
        public kzs[] a;
        public kzs[] b;
        public int c;
        public int d;
        public final /* synthetic */ dm8 f;
        public final /* synthetic */ dm8 i;
        public final /* synthetic */ dm8 v;
        public final /* synthetic */ dm8 w;
        public final /* synthetic */ dm8 y;

        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$11", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<com.sportygames.newcms.b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ dm8 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(dm8 dm8Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = dm8Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(com.sportygames.newcms.b bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(bVar, v1bVar)).invokeSuspend(Unit.a);
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

        /* JADX INFO: renamed from: od60$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$2", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0936b extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0936b(2, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
                return ((C0936b) create(unit, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$4", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends tje0 implements Function2<SBBetConfigDTO, v1b<? super Unit>, Object> {
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
            public final Object invoke(SBBetConfigDTO sBBetConfigDTO, v1b<? super Unit> v1bVar) {
                return ((c) create(sBBetConfigDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                SBBetConfigDTO sBBetConfigDTO = (SBBetConfigDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(sBBetConfigDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$6", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class d extends tje0 implements Function2<SBPayTableDTO, v1b<? super Unit>, Object> {
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
            public final Object invoke(SBPayTableDTO sBPayTableDTO, v1b<? super Unit> v1bVar) {
                return ((d) create(sBPayTableDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                SBPayTableDTO sBPayTableDTO = (SBPayTableDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(sBPayTableDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$7", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class e extends tje0 implements Function2<SBUserInfoDTO, v1b<? super Unit>, Object> {
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
            public final Object invoke(SBUserInfoDTO sBUserInfoDTO, v1b<? super Unit> v1bVar) {
                return ((e) create(sBUserInfoDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                SBUserInfoDTO sBUserInfoDTO = (SBUserInfoDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(sBUserInfoDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$8", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class f extends tje0 implements Function2<hg60, v1b<? super Unit>, Object> {
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
            public final Object invoke(hg60 hg60Var, v1b<? super Unit> v1bVar) {
                return ((f) create(hg60Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                hg60 hg60Var = (hg60) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(hg60Var);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$9", f = "SBFetchDataUseCaseImpl.kt", l = {91}, m = "invokeSuspend", v = 1)
        public static final class g extends tje0 implements Function2<List<? extends File>, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ od60 c;

            @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$9$1", f = "SBFetchDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ od60 a;
                public final /* synthetic */ List<File> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(od60 od60Var, List<? extends File> list, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.a = od60Var;
                    this.b = list;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new a(this.a, this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    this.a.g.a(this.b);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(od60 od60Var, v1b<? super g> v1bVar) {
                super(2, v1bVar);
                this.c = od60Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                g gVar = new g(this.c, v1bVar);
                gVar.b = obj;
                return gVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends File> list, v1b<? super Unit> v1bVar) {
                return ((g) create(list, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    od60 od60Var = this.c;
                    k5b k5bVar = od60Var.j;
                    a aVar = new a(od60Var, list, null);
                    this.b = null;
                    this.a = 1;
                    if (ej5.d(k5bVar, aVar, this) == y5bVar) {
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

        public static final class h implements lyh<Unit> {
            public final /* synthetic */ lyh a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: od60$b$h$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$invokeSuspend$$inlined$map$1$2", f = "SBFetchDataUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C0937a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0937a(v1b v1bVar) {
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
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) throws wc60.a {
                    C0937a c0937a;
                    if (v1bVar instanceof C0937a) {
                        c0937a = (C0937a) v1bVar;
                        int i = c0937a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0937a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0937a = new C0937a(v1bVar);
                        }
                    } else {
                        c0937a = new C0937a(v1bVar);
                    }
                    Object obj2 = c0937a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0937a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (!((SBAvailableDTO) em50.b((HTTPResponse) obj)).getAvailable()) {
                            throw wc60.a.a;
                        }
                        Unit unit = Unit.a;
                        c0937a.b = 1;
                        if (this.a.emit(unit, c0937a) == y5bVar) {
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
            public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public static final class i implements lyh<SBBetConfigDTO> {
            public final /* synthetic */ lyh a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: od60$b$i$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$invokeSuspend$$inlined$map$2$2", f = "SBFetchDataUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C0938a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0938a(v1b v1bVar) {
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
                    C0938a c0938a;
                    if (v1bVar instanceof C0938a) {
                        c0938a = (C0938a) v1bVar;
                        int i = c0938a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0938a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0938a = new C0938a(v1bVar);
                        }
                    } else {
                        c0938a = new C0938a(v1bVar);
                    }
                    Object obj2 = c0938a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0938a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        Object objB = em50.b((HTTPResponse) obj);
                        c0938a.b = 1;
                        if (this.a.emit(objB, c0938a) == y5bVar) {
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
            public final Object collect(myh<? super SBBetConfigDTO> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public static final class j implements lyh<SBPayTableDTO> {
            public final /* synthetic */ lyh a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: od60$b$j$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$1$invokeSuspend$$inlined$map$3$2", f = "SBFetchDataUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C0939a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0939a(v1b v1bVar) {
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
                    C0939a c0939a;
                    if (v1bVar instanceof C0939a) {
                        c0939a = (C0939a) v1bVar;
                        int i = c0939a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0939a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0939a = new C0939a(v1bVar);
                        }
                    } else {
                        c0939a = new C0939a(v1bVar);
                    }
                    Object obj2 = c0939a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0939a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        Object objB = em50.b((HTTPResponse) obj);
                        c0939a.b = 1;
                        if (this.a.emit(objB, c0939a) == y5bVar) {
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
            public final Object collect(myh<? super SBPayTableDTO> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4, dm8 dm8Var5, v1b v1bVar) {
            super(1, v1bVar);
            this.f = dm8Var;
            this.i = dm8Var2;
            this.v = dm8Var3;
            this.w = dm8Var4;
            this.y = dm8Var5;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return od60.this.new b(this.f, this.i, this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super List<? extends kzs<?>>> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kzs[] kzsVarArr;
            int i2;
            kzs[] kzsVarArr2;
            od60 od60Var = od60.this;
            iua0 iua0Var = od60Var.b;
            y5b y5bVar = y5b.a;
            int i3 = this.d;
            if (i3 == 0) {
                uj50.b(obj);
                kzs[] kzsVarArr3 = new kzs[7];
                kzsVarArr3[0] = kee.b(new h(iua0Var.a()), new C0936b(2, null));
                kzsVarArr3[1] = kee.b(new i(iua0Var.g()), new c(this.f, null));
                kzsVarArr3[2] = kee.b(new j(iua0Var.f()), new d(this.i, null));
                kzsVarArr3[3] = kee.b(new g1i(new qd60(iua0Var.d()), new rd60(od60Var, null)), new e(this.v, null));
                kzsVarArr3[4] = kee.b(od60Var.d.invoke(), new f(this.w, null));
                this.a = kzsVarArr3;
                this.b = kzsVarArr3;
                this.c = 5;
                this.d = 1;
                Object objA = od60Var.a(new String[]{"sg_common_dialog_message", "sg_fbg_dialog"}, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                kzsVarArr = kzsVarArr3;
                obj = objA;
                i2 = 5;
                kzsVarArr2 = kzsVarArr;
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
            kzsVarArr[i2] = kee.b((lyh) obj, new g(od60Var, null));
            kzsVarArr2[6] = od60Var.c.a(new pd60(0), new a(this.y, null));
            return kotlin.collections.b.k(kzsVarArr2);
        }
    }

    @c0d(c = "com.sportygames.speedybingo.domain.usecase.SBFetchDataUseCaseImpl$invoke$3", f = "SBFetchDataUseCaseImpl.kt", l = {115}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements gaj<myh<? super qe60>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super qe60> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            cVar.c = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            Throwable th = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                qe60.a aVar = new qe60.a(th);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(aVar, this) == y5bVar) {
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

    public od60(Context context, iua0 iua0Var, d dVar, wd60 wd60Var, vmy vmyVar, b5 b5Var, pp5 pp5Var, String str, k5b k5bVar, k5b k5bVar2) {
        context.getClass();
        iua0Var.getClass();
        dVar.getClass();
        wd60Var.getClass();
        vmyVar.getClass();
        b5Var.getClass();
        pp5Var.getClass();
        str.getClass();
        k5bVar.getClass();
        k5bVar2.getClass();
        this.a = context;
        this.b = iua0Var;
        this.c = dVar;
        this.d = wd60Var;
        this.e = vmyVar;
        this.f = b5Var;
        this.g = pp5Var;
        this.h = str;
        this.i = k5bVar;
        this.j = k5bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String[] strArr, x1b x1bVar) {
        ld60 ld60Var;
        if (x1bVar instanceof ld60) {
            ld60Var = (ld60) x1bVar;
            int i = ld60Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld60Var.d = i - Integer.MIN_VALUE;
            } else {
                ld60Var = new ld60(this, x1bVar);
            }
        } else {
            ld60Var = new ld60(this, x1bVar);
        }
        Object obj = ld60Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ld60Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            md60 md60Var = new md60(this, null);
            ld60Var.a = strArr;
            ld60Var.d = 1;
            if (ej5.d(wclVar, md60Var, ld60Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strArr = ld60Var.a;
            uj50.b(obj);
        }
        or60 or60Var = new or60(new nd60(this, strArr, null));
        pfd pfdVar2 = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.kd60
    public final lyh<qe60> b(String str) {
        str.getClass();
        dm8 dm8VarA = em8.a();
        dm8 dm8VarA2 = em8.a();
        dm8 dm8VarA3 = em8.a();
        dm8 dm8VarA4 = em8.a();
        dm8 dm8VarA5 = em8.a();
        return ozh.c(new f1i(new yzh(new a(zm8.a(kee.a(new b(dm8VarA, dm8VarA2, dm8VarA4, dm8VarA3, dm8VarA5, null))), this, dm8VarA5, dm8VarA, dm8VarA2, dm8VarA3, dm8VarA4), new c(3, null))), this.i);
    }
}
