package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class xlx implements btm, zxm {
    public final v5b a;
    public final b390 b;

    @c0d(c = "com.sportygames.piggybash.data.repository.error.NetworkCallsHandler$onLifecycleError$1", f = "NetworkCallsHandler.kt", l = {63}, m = "invokeSuspend", v = 1)
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
            return xlx.this.new a(this.c, v1bVar);
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
                b390 b390Var = xlx.this.b;
                ou00.b bVar = new ou00.b(ija0.b, this.c);
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

    @c0d(c = "com.sportygames.piggybash.data.repository.error.NetworkCallsHandler$onMessageSendError$1", f = "NetworkCallsHandler.kt", l = {74}, m = "invokeSuspend", v = 1)
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
            return xlx.this.new b(this.c, this.d, v1bVar);
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
                b390 b390Var = xlx.this.b;
                ou00.b bVar = new ou00.b(new ic80(this.c), this.d);
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

    @c0d(c = "com.sportygames.piggybash.data.repository.error.NetworkCallsHandler$onSubscriptionError$1", f = "NetworkCallsHandler.kt", l = {85}, m = "invokeSuspend", v = 1)
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
            return xlx.this.new c(this.c, this.d, v1bVar);
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
                b390 b390Var = xlx.this.b;
                ou00.b bVar = new ou00.b(new dee0(this.c), this.d);
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

    public xlx(v5b v5bVar) {
        v5bVar.getClass();
        this.a = v5bVar;
        this.b = d390.b(0, 0, null, 7);
    }

    public static vu00 h(fox foxVar) {
        switch (foxVar.ordinal()) {
            case 0:
                return vu00.ROOMS;
            case 1:
                return vu00.JOIN_ROOM;
            case 2:
                return vu00.WALLET_INFO;
            case 3:
                return vu00.STATUS;
            case 4:
                return vu00.AVAILABLE;
            case 5:
                return vu00.VALIDATE;
            case 6:
                return vu00.CHAT_ROOM;
            default:
                uhc.a();
                return null;
        }
    }

    @Override // defpackage.btm
    public final b390 a() {
        return this.b;
    }

    @Override // defpackage.zxm
    public final void b(Throwable th) {
        ej5.c(this.a, null, null, new a(th, null), 3);
    }

    @Override // defpackage.zxm
    public final void c(String str, Throwable th) {
        ej5.c(this.a, null, null, new b(str, th, null), 3);
    }

    @Override // defpackage.zxm
    public final void d(String str, Throwable th) {
        str.getClass();
        th.getClass();
        ej5.c(this.a, null, null, new c(str, th, null), 3);
    }

    @Override // defpackage.zxm
    public final void e(Exception exc) {
        ej5.c(this.a, null, null, new amx(this, exc, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zxm
    public final Object f(fox foxVar, Function1 function1, x1b x1bVar) {
        dmx dmxVar;
        if (x1bVar instanceof dmx) {
            dmxVar = (dmx) x1bVar;
            int i = dmxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmxVar.e = i - Integer.MIN_VALUE;
            } else {
                dmxVar = new dmx(this, x1bVar);
            }
        } else {
            dmxVar = new dmx(this, x1bVar);
        }
        Object objG = dmxVar.c;
        Object obj = y5b.a;
        int i2 = dmxVar.e;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(objG);
            dmxVar.a = foxVar;
            dmxVar.e = 1;
            objG = g(foxVar, function1, dmxVar);
            if (objG != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = dmxVar.b;
            uj50.b(objG);
            return obj2;
        }
        foxVar = dmxVar.a;
        uj50.b(objG);
        HTTPResponse hTTPResponse = (HTTPResponse) objG;
        if (hTTPResponse == null) {
            return null;
        }
        Object data = hTTPResponse.getData();
        if (data == null) {
            Integer bizCode = hTTPResponse.getBizCode();
            vu00 vu00VarH = h(foxVar);
            if ((bizCode == null || bizCode.intValue() != 8001) && (bizCode == null || bizCode.intValue() != 8002)) {
                z = false;
            }
            ou00.a aVar = new ou00.a(vu00VarH, bizCode, null, z);
            dmxVar.a = null;
            dmxVar.b = data;
            dmxVar.e = 2;
            if (this.b.emit(aVar, dmxVar) == obj) {
                return obj;
            }
        }
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zxm
    public final Object g(fox foxVar, Function1 function1, x1b x1bVar) {
        gmx gmxVar;
        if (x1bVar instanceof gmx) {
            gmxVar = (gmx) x1bVar;
            int i = gmxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmxVar.d = i - Integer.MIN_VALUE;
            } else {
                gmxVar = new gmx(this, x1bVar);
            }
        } else {
            gmxVar = new gmx(this, x1bVar);
        }
        Object objInvoke = gmxVar.b;
        y5b y5bVar = y5b.a;
        int i2 = gmxVar.d;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                gmxVar.a = foxVar;
                gmxVar.d = 1;
                objInvoke = function1.invoke(gmxVar);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        uj50.b(objInvoke);
                        return null;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                foxVar = gmxVar.a;
                uj50.b(objInvoke);
            }
            return (HTTPResponse) objInvoke;
        } catch (Exception e) {
            ou00.a aVar = new ou00.a(h(foxVar), null, e, false);
            gmxVar.a = null;
            gmxVar.d = 2;
            if (this.b.emit(aVar, gmxVar) != y5bVar) {
                return null;
            }
        }
    }
}
