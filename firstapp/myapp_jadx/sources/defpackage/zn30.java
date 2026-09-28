package defpackage;

import android.content.Context;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.newcms.d;
import com.sportygames.refscall.data.dto.RCAvailableDTO;
import com.sportygames.refscall.data.dto.RCDetailDTO;
import com.sportygames.refscall.data.dto.RCUserInfoDTO;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zn30 implements vn30 {
    public final k5b a;
    public final k5b b;
    public final qr40 c;
    public final d d;
    public final do30 e;
    public final Context f;
    public final vmy g;
    public final b5 h;
    public final pp5 i;

    public static final class a implements lyh<yo30> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ zn30 b;
        public final /* synthetic */ dm8 c;
        public final /* synthetic */ dm8 d;
        public final /* synthetic */ dm8 e;
        public final /* synthetic */ dm8 f;

        /* JADX INFO: renamed from: zn30$a$a, reason: collision with other inner class name */
        public static final class C1401a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ zn30 b;
            public final /* synthetic */ dm8 c;
            public final /* synthetic */ dm8 d;
            public final /* synthetic */ dm8 e;
            public final /* synthetic */ dm8 f;

            /* JADX INFO: renamed from: zn30$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$$inlined$map$1$2", f = "RCFetchInitDataUseCaseImpl.kt", l = {53, 54, 55, 56, 50}, m = "emit", v = 1)
            public static final class C1402a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;
                public zn30 e;
                public com.sportygames.newcms.b f;
                public RCDetailDTO i;
                public uq30 v;
                public int w;
                public int y;

                public C1402a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1401a.this.emit(null, this);
                }
            }

            public C1401a(myh myhVar, zn30 zn30Var, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4) {
                this.a = myhVar;
                this.b = zn30Var;
                this.c = dm8Var;
                this.d = dm8Var2;
                this.e = dm8Var3;
                this.f = dm8Var4;
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
            /* JADX WARN: Code duplicated, block: B:39:0x0105  */
            /* JADX WARN: Code duplicated, block: B:42:0x014c A[LOOP:0: B:41:0x014a->B:42:0x014c, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:45:0x0173  */
            /* JADX WARN: Code duplicated, block: B:48:0x017a  */
            /* JADX WARN: Code duplicated, block: B:50:0x017d  */
            /* JADX WARN: Code duplicated, block: B:53:0x018f  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x01df, code lost:
            
                if (r12.emit(r0, r2) == r3) goto L66;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r23, defpackage.v1b r24) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 489
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zn30.a.C1401a.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public a(yzh yzhVar, zn30 zn30Var, dm8 dm8Var, dm8 dm8Var2, dm8 dm8Var3, dm8 dm8Var4) {
            this.a = yzhVar;
            this.b = zn30Var;
            this.c = dm8Var;
            this.d = dm8Var2;
            this.e = dm8Var3;
            this.f = dm8Var4;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super yo30> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C1401a(myhVar, this.b, this.c, this.d, this.e, this.f), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1", f = "RCFetchInitDataUseCaseImpl.kt", l = {80}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function1<v1b<? super List<? extends kzs<?>>>, Object> {
        public kzs[] a;
        public kzs[] b;
        public int c;
        public int d;
        public final /* synthetic */ dm8 f;
        public final /* synthetic */ dm8 i;
        public final /* synthetic */ dm8 v;
        public final /* synthetic */ dm8 w;

        @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$2", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
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

        /* JADX INFO: renamed from: zn30$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$4", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C1403b extends tje0 implements Function2<RCDetailDTO, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ dm8 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1403b(dm8 dm8Var, v1b v1bVar) {
                super(2, v1bVar);
                this.b = dm8Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1403b c1403b = new C1403b(this.b, v1bVar);
                c1403b.a = obj;
                return c1403b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RCDetailDTO rCDetailDTO, v1b<? super Unit> v1bVar) {
                return ((C1403b) create(rCDetailDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                RCDetailDTO rCDetailDTO = (RCDetailDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(rCDetailDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$5", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends tje0 implements Function2<uq30, v1b<? super Unit>, Object> {
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
            public final Object invoke(uq30 uq30Var, v1b<? super Unit> v1bVar) {
                return ((c) create(uq30Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                uq30 uq30Var = (uq30) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(uq30Var);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$6", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class d extends tje0 implements Function2<RCUserInfoDTO, v1b<? super Unit>, Object> {
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
            public final Object invoke(RCUserInfoDTO rCUserInfoDTO, v1b<? super Unit> v1bVar) {
                return ((d) create(rCUserInfoDTO, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                RCUserInfoDTO rCUserInfoDTO = (RCUserInfoDTO) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.b.R(rCUserInfoDTO);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$7", f = "RCFetchInitDataUseCaseImpl.kt", l = {84}, m = "invokeSuspend", v = 1)
        public static final class e extends tje0 implements Function2<List<? extends File>, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ zn30 c;

            @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$7$1", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public final /* synthetic */ zn30 a;
                public final /* synthetic */ List<File> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(zn30 zn30Var, List<? extends File> list, v1b<? super a> v1bVar) {
                    super(2, v1bVar);
                    this.a = zn30Var;
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
            public e(zn30 zn30Var, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.c = zn30Var;
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
                    zn30 zn30Var = this.c;
                    k5b k5bVar = zn30Var.b;
                    a aVar = new a(zn30Var, list, null);
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

        @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$9", f = "RCFetchInitDataUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
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

                /* JADX INFO: renamed from: zn30$b$g$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$invokeSuspend$$inlined$map$1$2", f = "RCFetchInitDataUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C1404a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1404a(v1b v1bVar) {
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
                public final Object emit(Object obj, v1b v1bVar) throws sn30.a {
                    C1404a c1404a;
                    if (v1bVar instanceof C1404a) {
                        c1404a = (C1404a) v1bVar;
                        int i = c1404a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1404a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1404a = new C1404a(v1bVar);
                        }
                    } else {
                        c1404a = new C1404a(v1bVar);
                    }
                    Object obj2 = c1404a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1404a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (!((RCAvailableDTO) em50.b((HTTPResponse) obj)).isAvailable()) {
                            throw sn30.a.a;
                        }
                        Unit unit = Unit.a;
                        c1404a.b = 1;
                        if (this.a.emit(unit, c1404a) == y5bVar) {
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

        public static final class h implements lyh<RCDetailDTO> {
            public final /* synthetic */ lyh a;

            public static final class a<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: zn30$b$h$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$1$invokeSuspend$$inlined$map$2$2", f = "RCFetchInitDataUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
                public static final class C1405a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C1405a(v1b v1bVar) {
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
                    C1405a c1405a;
                    if (v1bVar instanceof C1405a) {
                        c1405a = (C1405a) v1bVar;
                        int i = c1405a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c1405a.b = i - Integer.MIN_VALUE;
                        } else {
                            c1405a = new C1405a(v1bVar);
                        }
                    } else {
                        c1405a = new C1405a(v1bVar);
                    }
                    Object obj2 = c1405a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c1405a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        Object objB = em50.b((HTTPResponse) obj);
                        c1405a.b = 1;
                        if (this.a.emit(objB, c1405a) == y5bVar) {
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
            public final Object collect(myh<? super RCDetailDTO> myhVar, v1b v1bVar) {
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
            return zn30.this.new b(this.f, this.i, this.v, this.w, v1bVar);
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
            zn30 zn30Var = zn30.this;
            qr40 qr40Var = zn30Var.c;
            y5b y5bVar = y5b.a;
            int i2 = this.d;
            if (i2 == 0) {
                uj50.b(obj);
                kzs[] kzsVarArr3 = new kzs[6];
                kzsVarArr3[0] = kee.b(new g(qr40Var.a()), new a(2, null));
                kzsVarArr3[1] = kee.b(new h(qr40Var.f()), new C1403b(this.f, null));
                kzsVarArr3[2] = kee.b(zn30Var.e.invoke(), new c(this.i, null));
                kzsVarArr3[3] = kee.b(new g1i(new bo30(qr40Var.c()), new co30(zn30Var, null)), new d(this.v, null));
                this.a = kzsVarArr3;
                this.b = kzsVarArr3;
                this.c = 4;
                this.d = 1;
                Object objA = zn30Var.a(new String[]{"sg_common_dialog_message", "sg_fbg_dialog"}, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                kzsVarArr = kzsVarArr3;
                obj = objA;
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
            kzsVarArr[i] = kee.b((lyh) obj, new e(zn30Var, null));
            kzsVarArr2[5] = zn30Var.d.a(new ao30(), new f(this.w, null));
            return kotlin.collections.b.k(kzsVarArr2);
        }
    }

    @c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$invoke$3", f = "RCFetchInitDataUseCaseImpl.kt", l = {108}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements gaj<myh<? super yo30>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super yo30> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
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
                yo30.a aVar = new yo30.a(th);
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

    public zn30(k5b k5bVar, k5b k5bVar2, qr40 qr40Var, d dVar, do30 do30Var, Context context, vmy vmyVar, b5 b5Var, pp5 pp5Var) {
        k5bVar.getClass();
        k5bVar2.getClass();
        qr40Var.getClass();
        dVar.getClass();
        do30Var.getClass();
        context.getClass();
        vmyVar.getClass();
        b5Var.getClass();
        pp5Var.getClass();
        this.a = k5bVar;
        this.b = k5bVar2;
        this.c = qr40Var;
        this.d = dVar;
        this.e = do30Var;
        this.f = context;
        this.g = vmyVar;
        this.h = b5Var;
        this.i = pp5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String[] strArr, x1b x1bVar) {
        wn30 wn30Var;
        if (x1bVar instanceof wn30) {
            wn30Var = (wn30) x1bVar;
            int i = wn30Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wn30Var.d = i - Integer.MIN_VALUE;
            } else {
                wn30Var = new wn30(this, x1bVar);
            }
        } else {
            wn30Var = new wn30(this, x1bVar);
        }
        Object obj = wn30Var.b;
        y5b y5bVar = y5b.a;
        int i2 = wn30Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            xn30 xn30Var = new xn30(this, null);
            wn30Var.a = strArr;
            wn30Var.d = 1;
            if (ej5.d(wclVar, xn30Var, wn30Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strArr = wn30Var.a;
            uj50.b(obj);
        }
        or60 or60Var = new or60(new yn30(this, strArr, null));
        pfd pfdVar2 = fse.a;
        return ozh.c(or60Var, odd.b);
    }

    @Override // defpackage.vn30
    public final lyh<yo30> b(String str) {
        str.getClass();
        dm8 dm8VarA = em8.a();
        dm8 dm8VarA2 = em8.a();
        dm8 dm8VarA3 = em8.a();
        dm8 dm8VarA4 = em8.a();
        return ozh.c(new f1i(new yzh(new a(zm8.a(kee.a(new b(dm8VarA2, dm8VarA3, dm8VarA4, dm8VarA, null))), this, dm8VarA, dm8VarA2, dm8VarA3, dm8VarA4), new c(3, null))), this.a);
    }
}
