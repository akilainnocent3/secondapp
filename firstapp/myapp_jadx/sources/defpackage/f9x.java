package defpackage;

import android.content.Context;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.newcms.d;
import com.sportygames.nightnday.data.dto.NNDAvailableDTO;
import com.sportygames.nightnday.data.dto.NNDDetailDTO;
import com.sportygames.nightnday.data.dto.NNDUserInfoDTO;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class f9x implements e9x {
    public final k5b a;
    public final k5b b;
    public final ltx c;
    public final d d;
    public final hbx e;
    public final Context f;
    public final vmy g;
    public final b5 h;
    public final pp5 i;

    public static final class a implements lyh<d9x> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ f9x b;
        public final /* synthetic */ dm8 c;
        public final /* synthetic */ dm8 d;
        public final /* synthetic */ dm8 e;
        public final /* synthetic */ dm8 f;

        /* JADX INFO: renamed from: f9x$a$a, reason: collision with other inner class name */
        public static final class C0551a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ f9x b;
            public final /* synthetic */ dm8 c;
            public final /* synthetic */ dm8 d;
            public final /* synthetic */ dm8 e;
            public final /* synthetic */ dm8 f;

            /* JADX INFO: renamed from: f9x$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$$inlined$map$1$2", f = "NNDFetchUseCaseImpl.kt", l = {53, 54, 55, 56, 50}, m = "emit", v = 1)
            public static final class C0552a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;
                public f9x e;
                public com.sportygames.newcms.b f;
                public NNDDetailDTO i;
                public gbx v;
                public int w;
                public int y;

                public C0552a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0551a.this.emit(null, this);
                }
            }

            public C0551a(myh myhVar, f9x f9xVar, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4) {
                this.a = myhVar;
                this.b = f9xVar;
                this.c = dm8Var;
                this.d = dm8Var2;
                this.e = dm8Var3;
                this.f = dm8Var4;
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:39:0x0103  */
            /* JADX WARN: Code duplicated, block: B:42:0x012d  */
            /* JADX WARN: Code duplicated, block: B:45:0x0134  */
            /* JADX WARN: Code duplicated, block: B:47:0x0137  */
            /* JADX WARN: Code duplicated, block: B:51:0x0148  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
            
                if (r12.emit(r11, r2) == r3) goto L65;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r24, defpackage.v1b r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 420
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: f9x.a.C0551a.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public a(yzh yzhVar, f9x f9xVar, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4) {
            this.a = yzhVar;
            this.b = f9xVar;
            this.c = dm8Var;
            this.d = dm8Var2;
            this.e = dm8Var3;
            this.f = dm8Var4;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super d9x> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0551a(myhVar, this.b, this.c, this.d, this.e, this.f), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1", f = "NNDFetchUseCaseImpl.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function1<v1b<? super List<? extends kzs<?>>>, Object> {
        public kzs[] a;
        public kzs[] b;
        public int c;
        public int d;
        public final /* synthetic */ dm8 f;
        public final /* synthetic */ dm8 i;
        public final /* synthetic */ dm8 v;
        public final /* synthetic */ dm8 w;

        @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$2", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(2, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
                return ((a) create(unit, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: f9x$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$4", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0553b extends tje0 implements Function2<NNDDetailDTO, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ dm8 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0553b(dm8 dm8Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = dm8Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0553b c0553b = new C0553b(this.b, v1bVar);
                c0553b.a = obj;
                return c0553b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(NNDDetailDTO nNDDetailDTO, v1b<? super Unit> v1bVar) {
                return ((C0553b) create(nNDDetailDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                NNDDetailDTO nNDDetailDTO = (NNDDetailDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(nNDDetailDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$5", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends tje0 implements Function2<gbx, v1b<? super Unit>, Object> {
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
            public final Object invoke(gbx gbxVar, v1b<? super Unit> v1bVar) {
                return ((c) create(gbxVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                gbx gbxVar = (gbx) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(gbxVar);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$6", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class d extends tje0 implements Function2<NNDUserInfoDTO, v1b<? super Unit>, Object> {
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
            public final Object invoke(NNDUserInfoDTO nNDUserInfoDTO, v1b<? super Unit> v1bVar) {
                return ((d) create(nNDUserInfoDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                NNDUserInfoDTO nNDUserInfoDTO = (NNDUserInfoDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(nNDUserInfoDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$7", f = "NNDFetchUseCaseImpl.kt", l = {83}, m = "invokeSuspend", v = 1)
        public static final class e extends tje0 implements Function2<List<? extends File>, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ f9x c;

            @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$7$1", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ f9x a;
                public final /* synthetic */ List<File> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(f9x f9xVar, List<? extends File> list, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.a = f9xVar;
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
                    this.a.i.a(this.b);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(f9x f9xVar, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.c = f9xVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                e eVar = new e(this.c, v1bVar);
                eVar.b = obj;
                return eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends File> list, v1b<? super Unit> v1bVar) {
                return ((e) create(list, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    f9x f9xVar = this.c;
                    k5b k5bVar = f9xVar.b;
                    a aVar = new a(f9xVar, list, null);
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

        @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$9", f = "NNDFetchUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class f extends tje0 implements Function2<com.sportygames.newcms.b, v1b<? super Unit>, Object> {
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
            public final Object invoke(com.sportygames.newcms.b bVar, v1b<? super Unit> v1bVar) {
                return ((f) create(bVar, v1bVar)).invokeSuspend(Unit.a);
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

        public static final class g implements lyh<Unit> {
            public final /* synthetic */ lyh a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: f9x$b$g$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$invokeSuspend$$inlined$map$1$2", f = "NNDFetchUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C0554a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0554a(v1b v1bVar) {
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
                public final Object emit(Object obj, v1b v1bVar) throws a9x.a {
                    C0554a c0554a;
                    if (v1bVar instanceof C0554a) {
                        c0554a = (C0554a) v1bVar;
                        int i = c0554a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0554a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0554a = new C0554a(v1bVar);
                        }
                    } else {
                        c0554a = new C0554a(v1bVar);
                    }
                    Object obj2 = c0554a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0554a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (!((NNDAvailableDTO) em50.b((HTTPResponse) obj)).isAvailable()) {
                            throw a9x.a.a;
                        }
                        Unit unit = Unit.a;
                        c0554a.b = 1;
                        if (this.a.emit(unit, c0554a) == y5bVar) {
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

            public g(lyh lyhVar) {
                this.a = lyhVar;
            }

            @Override // defpackage.lyh
            public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        public static final class h implements lyh<NNDDetailDTO> {
            public final /* synthetic */ lyh a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: f9x$b$h$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$1$invokeSuspend$$inlined$map$2$2", f = "NNDFetchUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C0555a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0555a(v1b v1bVar) {
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
                    C0555a c0555a;
                    if (v1bVar instanceof C0555a) {
                        c0555a = (C0555a) v1bVar;
                        int i = c0555a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0555a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0555a = new C0555a(v1bVar);
                        }
                    } else {
                        c0555a = new C0555a(v1bVar);
                    }
                    Object obj2 = c0555a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0555a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        Object objB = em50.b((HTTPResponse) obj);
                        c0555a.b = 1;
                        if (this.a.emit(objB, c0555a) == y5bVar) {
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
            public final Object collect(myh<? super NNDDetailDTO> myhVar, v1b v1bVar) {
                Object objCollect = this.a.collect(new a(myhVar), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4, v1b v1bVar) {
            super(1, v1bVar);
            this.f = dm8Var;
            this.i = dm8Var2;
            this.v = dm8Var3;
            this.w = dm8Var4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return f9x.this.new b(this.f, this.i, this.v, this.w, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super List<? extends kzs<?>>> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            kzs[] kzsVarArr;
            int i;
            kzs[] kzsVarArr2;
            f9x f9xVar = f9x.this;
            ltx ltxVar = f9xVar.c;
            y5b y5bVar = y5b.a;
            int i2 = this.d;
            if (i2 == 0) {
                uj50.b(obj);
                kzs[] kzsVarArr3 = new kzs[6];
                kzsVarArr3[0] = kee.b(new g(ltxVar.a()), new a(2, null));
                kzsVarArr3[1] = kee.b(new h(ltxVar.f()), new C0553b(this.f, null));
                kzsVarArr3[2] = kee.b(f9xVar.e.a(), new c(this.i, null));
                kzsVarArr3[3] = kee.b(new g1i(new k9x(ltxVar.c()), new l9x(f9xVar, null)), new d(this.v, null));
                this.a = kzsVarArr3;
                this.b = kzsVarArr3;
                this.c = 4;
                this.d = 1;
                Object objB = f9xVar.b(new String[]{"sg_common_dialog_message", "sg_fbg_dialog"}, this);
                if (objB == y5bVar) {
                    return y5bVar;
                }
                kzsVarArr = kzsVarArr3;
                obj = objB;
                i = 4;
                kzsVarArr2 = kzsVarArr;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.c;
                kzsVarArr = this.b;
                kzsVarArr2 = this.a;
                uj50.b(obj);
            }
            kzsVarArr[i] = kee.b((lyh) obj, new e(f9xVar, null));
            kzsVarArr2[5] = f9xVar.d.a(new g9x(0), new f(this.w, null));
            return kotlin.collections.b.k(kzsVarArr2);
        }
    }

    @c0d(c = "com.sportygames.nightnday.domain.usecase.NNDFetchUseCaseImpl$fetch$3", f = "NNDFetchUseCaseImpl.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements gaj<myh<? super d9x>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super d9x> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
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
                d9x.a aVar = new d9x.a(th);
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

    public f9x(k5b k5bVar, k5b k5bVar2, ltx ltxVar, d dVar, hbx hbxVar, Context context, vmy vmyVar, b5 b5Var, pp5 pp5Var) {
        k5bVar.getClass();
        k5bVar2.getClass();
        ltxVar.getClass();
        dVar.getClass();
        hbxVar.getClass();
        context.getClass();
        vmyVar.getClass();
        b5Var.getClass();
        pp5Var.getClass();
        this.a = k5bVar;
        this.b = k5bVar2;
        this.c = ltxVar;
        this.d = dVar;
        this.e = hbxVar;
        this.f = context;
        this.g = vmyVar;
        this.h = b5Var;
        this.i = pp5Var;
    }

    @Override // defpackage.e9x
    public final lyh<d9x> a() {
        dm8 dm8VarA = em8.a();
        dm8 dm8VarA2 = em8.a();
        dm8 dm8VarA3 = em8.a();
        dm8 dm8VarA4 = em8.a();
        return ozh.c(new f1i(new yzh(new a(zm8.a(kee.a(new b(dm8VarA2, dm8VarA3, dm8VarA4, dm8VarA, null))), this, dm8VarA, dm8VarA2, dm8VarA3, dm8VarA4), new c(3, null))), this.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String[] strArr, x1b x1bVar) {
        h9x h9xVar;
        if (x1bVar instanceof h9x) {
            h9xVar = (h9x) x1bVar;
            int i = h9xVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h9xVar.d = i - Integer.MIN_VALUE;
            } else {
                h9xVar = new h9x(this, x1bVar);
            }
        } else {
            h9xVar = new h9x(this, x1bVar);
        }
        Object obj = h9xVar.b;
        y5b y5bVar = y5b.a;
        int i2 = h9xVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            i9x i9xVar = new i9x(this, null);
            h9xVar.a = strArr;
            h9xVar.d = 1;
            if (ej5.d(wclVar, i9xVar, h9xVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strArr = h9xVar.a;
            uj50.b(obj);
        }
        or60 or60Var = new or60(new j9x(this, strArr, null));
        pfd pfdVar2 = fse.a;
        return ozh.c(or60Var, odd.b);
    }
}
