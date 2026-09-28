package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$RCPointerView$5$1", f = "RCPointerView.kt", l = {164}, m = "invokeSuspend", v = 1)
public final class yp30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k5b b;
    public final /* synthetic */ twd0<Float> c;
    public final /* synthetic */ en20 d;
    public final /* synthetic */ com.sportygames.newcms.b e;

    @c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$RCPointerView$5$1$3", f = "RCPointerView.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v37<Float>, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ en20 b;
        public final /* synthetic */ com.sportygames.newcms.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(en20 en20Var, com.sportygames.newcms.b bVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = en20Var;
            this.c = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v37<Float> v37Var, v1b<? super Unit> v1bVar) {
            return ((a) create(v37Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                obj = this.b.b("key-Refs-call-sound", true, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                this.c.c(jn30.c0.a0);
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<v37<Float>> {
        public final /* synthetic */ zp30 a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: yp30$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$RCPointerView$5$1$invokeSuspend$$inlined$filter$1$2", f = "RCPointerView.kt", l = {50}, m = "emit", v = 1)
            public static final class C1358a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1358a(v1b v1bVar) {
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
            public final Object emit(Object obj, v1b v1bVar) {
                C1358a c1358a;
                if (v1bVar instanceof C1358a) {
                    c1358a = (C1358a) v1bVar;
                    int i = c1358a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1358a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1358a = new C1358a(v1bVar);
                    }
                } else {
                    c1358a = new C1358a(v1bVar);
                }
                Object obj2 = c1358a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1358a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    v37 v37Var = (v37) obj;
                    if (v37Var.a != v37Var.b) {
                        c1358a.b = 1;
                        if (this.a.emit(obj, c1358a) == y5bVar) {
                            return y5bVar;
                        }
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

        public b(zp30 zp30Var) {
            this.a = zp30Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super v37<Float>> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp30(k5b k5bVar, twd0<Float> twd0Var, en20 en20Var, com.sportygames.newcms.b bVar, v1b<? super yp30> v1bVar) {
        super(2, v1bVar);
        this.b = k5bVar;
        this.c = twd0Var;
        this.d = en20Var;
        this.e = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yp30(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yp30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh lyhVarC = ozh.c(new g1i(new b(new zp30(new h1i(new u5(null, 7), n95.c(new va8(this.c, 1)), new aq30(3, null)))), new a(this.d, this.e, null)), this.b);
            this.a = 1;
            if (kzh.a(lyhVarC, this) == y5bVar) {
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
