package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class lwd0 implements q490 {

    @c0d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<myh<? super o490>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ uwd0<Integer> c;

        /* JADX INFO: renamed from: lwd0$a$a, reason: collision with other inner class name */
        public static final class C0840a<T> implements myh {
            public final /* synthetic */ yp40 a;
            public final /* synthetic */ myh<o490> b;

            /* JADX INFO: renamed from: lwd0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            public static final class C0841a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ C0840a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0841a(C0840a<? super T> c0840a, v1b<? super C0841a> v1bVar) {
                    super(v1bVar);
                    this.b = c0840a;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.c(0, this);
                }
            }

            public C0840a(myh myhVar, yp40 yp40Var) {
                this.a = yp40Var;
                this.b = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object c(int i, v1b<? super Unit> v1bVar) {
                C0841a c0841a;
                if (v1bVar instanceof C0841a) {
                    c0841a = (C0841a) v1bVar;
                    int i2 = c0841a.c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0841a.c = i2 - Integer.MIN_VALUE;
                    } else {
                        c0841a = new C0841a(this, v1bVar);
                    }
                } else {
                    c0841a = new C0841a(this, v1bVar);
                }
                Object obj = c0841a.a;
                y5b y5bVar = y5b.a;
                int i3 = c0841a.c;
                if (i3 == 0) {
                    uj50.b(obj);
                    if (i > 0) {
                        yp40 yp40Var = this.a;
                        if (!yp40Var.a) {
                            yp40Var.a = true;
                            o490 o490Var = o490.a;
                            c0841a.c = 1;
                            if (this.b.emit(o490Var, c0841a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                return Unit.a;
            }

            @Override // defpackage.myh
            public final /* bridge */ /* synthetic */ Object emit(Object obj, v1b v1bVar) {
                return c(((Number) obj).intValue(), v1bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uwd0<Integer> uwd0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = uwd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super o490> myhVar, v1b<? super Unit> v1bVar) {
            ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0840a c0840a = new C0840a((myh) this.b, new yp40());
                this.a = 1;
                if (this.c.collect(c0840a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    @Override // defpackage.q490
    public final lyh<o490> a(uwd0<Integer> uwd0Var) {
        return new or60(new a(uwd0Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
