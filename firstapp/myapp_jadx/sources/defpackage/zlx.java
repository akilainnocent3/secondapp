package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zlx implements dtm, bym {
    public final v5b a;
    public final b390 b;

    @c0d(c = "com.sportygames.bonuscup.data.repository.error.NetworkCallsHandler$onLifecycleError$1", f = "NetworkCallsHandler.kt", l = {85}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Throwable c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = th;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zlx.this.new a(this.c, v1bVar);
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
                b390 b390Var = zlx.this.b;
                yj4.b bVar = new yj4.b(kja0.b, this.c);
                this.a = 1;
                if (b390Var.emit(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.bonuscup.data.repository.error.NetworkCallsHandler$onMessageSendError$1", f = "NetworkCallsHandler.kt", l = {96}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Throwable th, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = th;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zlx.this.new b(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = zlx.this.b;
                yj4.b bVar = new yj4.b(new kc80(this.c), this.d);
                this.a = 1;
                if (b390Var.emit(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.bonuscup.data.repository.error.NetworkCallsHandler$onSubscriptionError$1", f = "NetworkCallsHandler.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ Throwable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Throwable th, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = th;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zlx.this.new c(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = zlx.this.b;
                yj4.b bVar = new yj4.b(new fee0(this.c), this.d);
                this.a = 1;
                if (b390Var.emit(bVar, this) == y5bVar) {
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

    public zlx(v5b v5bVar) {
        v5bVar.getClass();
        this.a = v5bVar;
        this.b = d390.b(0, 0, null, 7);
    }

    public static jm4 g(hox hoxVar) {
        switch (hoxVar.ordinal()) {
            case 0:
                return jm4.USER_VALIDATION;
            case 1:
                return jm4.AVAILABLE;
            case 2:
                return jm4.START;
            case 3:
                return jm4.GET_STATUS;
            case 4:
                return jm4.CLAIM;
            case 5:
                return jm4.CAMPAIGN;
            case 6:
                return jm4.SEARCH;
            default:
                uhc.a();
                return null;
        }
    }

    @Override // defpackage.dtm
    public final b390 a() {
        return this.b;
    }

    @Override // defpackage.bym
    public final void b(Throwable th) {
        ej5.c(this.a, null, null, new a(th, null), 3);
    }

    @Override // defpackage.bym
    public final void c(String str, Throwable th) {
        str.getClass();
        ej5.c(this.a, null, null, new b(str, th, null), 3);
    }

    @Override // defpackage.bym
    public final void d(String str, Throwable th) {
        str.getClass();
        th.getClass();
        ej5.c(this.a, null, null, new c(str, th, null), 3);
    }

    @Override // defpackage.bym
    public final void e(Exception exc) {
        ej5.c(this.a, null, null, new cmx(this, exc, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.bym
    public final Object f(hox hoxVar, Function1 function1, x1b x1bVar) {
        fmx fmxVar;
        Integer bizCode;
        if (x1bVar instanceof fmx) {
            fmxVar = (fmx) x1bVar;
            int i = fmxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fmxVar.d = i - Integer.MIN_VALUE;
            } else {
                fmxVar = new fmx(this, x1bVar);
            }
        } else {
            fmxVar = new fmx(this, x1bVar);
        }
        Object objInvoke = fmxVar.b;
        y5b y5bVar = y5b.a;
        int i2 = fmxVar.d;
        b390 b390Var = this.b;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                fmxVar.a = hoxVar;
                fmxVar.d = 1;
                objInvoke = function1.invoke(fmxVar);
                if (objInvoke == y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hox hoxVar2 = fmxVar.a;
                    uj50.b(objInvoke);
                    return null;
                }
                if (i2 == 3) {
                    uj50.b(objInvoke);
                    return null;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hoxVar = fmxVar.a;
            uj50.b(objInvoke);
            HTTPResponse hTTPResponse = (HTTPResponse) objInvoke;
            if (!Intrinsics.g(hTTPResponse.getError(), Boolean.TRUE) && (bizCode = hTTPResponse.getBizCode()) != null && bizCode.intValue() == 10000) {
                return hTTPResponse.getData();
            }
            yj4.a aVar = new yj4.a(g(hoxVar), hTTPResponse.getBizCode(), null);
            fmxVar.a = hoxVar;
            fmxVar.d = 2;
            if (b390Var.emit(aVar, fmxVar) == y5bVar) {
                return y5bVar;
            }
            return null;
        } catch (Exception e) {
            yj4.a aVar2 = new yj4.a(g(hoxVar), null, e);
            fmxVar.a = null;
            fmxVar.d = 3;
            if (b390Var.emit(aVar2, fmxVar) == y5bVar) {
                return y5bVar;
            }
        }
    }
}
