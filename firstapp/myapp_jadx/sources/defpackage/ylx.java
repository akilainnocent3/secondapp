package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class ylx implements ctm, aym {
    public final v5b a;
    public final b390 b;

    @c0d(c = "com.sportygames.stacker.data.repository.error.NetworkCallsHandler$onLifecycleError$1", f = "NetworkCallsHandler.kt", l = {52}, m = "invokeSuspend", v = 1)
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
            return ylx.this.new a(this.c, v1bVar);
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
                b390 b390Var = ylx.this.b;
                lmd0.b bVar = new lmd0.b(jja0.c, this.c);
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

    @c0d(c = "com.sportygames.stacker.data.repository.error.NetworkCallsHandler$onMessageSendError$1", f = "NetworkCallsHandler.kt", l = {63}, m = "invokeSuspend", v = 1)
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
            return ylx.this.new b(this.c, this.d, v1bVar);
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
                b390 b390Var = ylx.this.b;
                lmd0.b bVar = new lmd0.b(new jc80(this.c), this.d);
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

    @c0d(c = "com.sportygames.stacker.data.repository.error.NetworkCallsHandler$onSubscriptionError$1", f = "NetworkCallsHandler.kt", l = {74}, m = "invokeSuspend", v = 1)
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
            return ylx.this.new c(this.c, this.d, v1bVar);
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
                b390 b390Var = ylx.this.b;
                lmd0.b bVar = new lmd0.b(new eee0(this.c), this.d);
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

    public ylx(v5b v5bVar) {
        v5bVar.getClass();
        this.a = v5bVar;
        this.b = d390.b(0, 0, null, 7);
    }

    public static jnd0 g(gox goxVar) {
        switch (goxVar.ordinal()) {
            case 0:
                return jnd0.IS_AVAILABLE;
            case 1:
                return jnd0.USER_VALIDATION;
            case 2:
                return jnd0.START;
            case 3:
                return jnd0.RESUME;
            case 4:
                return jnd0.CLAIM;
            case 5:
                return jnd0.FINISH;
            case 6:
                return jnd0.CAMPAIGN;
            case 7:
                return jnd0.SEARCH;
            default:
                uhc.a();
                return null;
        }
    }

    @Override // defpackage.ctm
    public final b390 a() {
        return this.b;
    }

    @Override // defpackage.aym
    public final void b(Throwable th) {
        ej5.c(this.a, null, null, new a(th, null), 3);
    }

    @Override // defpackage.aym
    public final void c(String str, Throwable th) {
        str.getClass();
        ej5.c(this.a, null, null, new b(str, th, null), 3);
    }

    @Override // defpackage.aym
    public final void d(String str, Throwable th) {
        str.getClass();
        th.getClass();
        ej5.c(this.a, null, null, new c(str, th, null), 3);
    }

    @Override // defpackage.aym
    public final void e(NumberFormatException numberFormatException) {
        ej5.c(this.a, null, null, new bmx(this, numberFormatException, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aym
    public final Object f(gox goxVar, Function1 function1, x1b x1bVar) {
        emx emxVar;
        gox goxVar2;
        Exception e;
        if (x1bVar instanceof emx) {
            emxVar = (emx) x1bVar;
            int i = emxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                emxVar.e = i - Integer.MIN_VALUE;
            } else {
                emxVar = new emx(this, x1bVar);
            }
        } else {
            emxVar = new emx(this, x1bVar);
        }
        Object objInvoke = emxVar.c;
        y5b y5bVar = y5b.a;
        int i2 = emxVar.e;
        b390 b390Var = this.b;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                emxVar.a = goxVar;
                emxVar.e = 1;
                objInvoke = function1.invoke(emxVar);
                if (objInvoke == y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        uj50.b(objInvoke);
                        return null;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj = emxVar.b;
                goxVar2 = emxVar.a;
                try {
                    uj50.b(objInvoke);
                    return obj;
                } catch (Exception e2) {
                    e = e2;
                    lmd0.a aVar = new lmd0.a(g(goxVar2), null, e);
                    emxVar.a = null;
                    emxVar.b = null;
                    emxVar.e = 3;
                    if (b390Var.emit(aVar, emxVar) == y5bVar) {
                        return y5bVar;
                    }
                    return null;
                }
            }
            goxVar = emxVar.a;
            uj50.b(objInvoke);
            HTTPResponse hTTPResponse = (HTTPResponse) objInvoke;
            Object data = hTTPResponse.getData();
            if (data == null) {
                lmd0.a aVar2 = new lmd0.a(g(goxVar), hTTPResponse.getBizCode(), null);
                emxVar.a = goxVar;
                emxVar.b = data;
                emxVar.e = 2;
                if (b390Var.emit(aVar2, emxVar) == y5bVar) {
                    return y5bVar;
                }
            }
            return data;
        } catch (Exception e3) {
            goxVar2 = goxVar;
            e = e3;
        }
    }
}
