package com.sportybet.android.globalpay.pixBtg.deposit;

import defpackage.c0d;
import defpackage.ib5;
import defpackage.lyh;
import defpackage.myh;
import defpackage.s0i;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.ztw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositUIStateKt$updateLoadedState$1", f = "PixBtgDepositUIState.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ztw<f> b;
    public final /* synthetic */ Function1<f.c, f.c> c;

    public static final class a implements lyh<Object> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.deposit.d$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositUIStateKt$updateLoadedState$1$invokeSuspend$$inlined$filterIsInstance$1", f = "PixBtgDepositUIState.kt", l = {109}, m = "collect", v = 2)
        public static final class C0234a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0234a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.deposit.d$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositUIStateKt$updateLoadedState$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "PixBtgDepositUIState.kt", l = {50}, m = "emit", v = 2)
            public static final class C0235a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0235a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0235a c0235a;
                if (v1bVar instanceof C0235a) {
                    c0235a = (C0235a) v1bVar;
                    int i = c0235a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0235a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0235a = new C0235a(v1bVar);
                    }
                } else {
                    c0235a = new C0235a(v1bVar);
                }
                Object obj2 = c0235a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0235a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (obj instanceof f.c) {
                        c0235a.b = 1;
                        if (this.a.emit(obj, c0235a) == y5bVar) {
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

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
            C0234a c0234a;
            if (v1bVar instanceof C0234a) {
                c0234a = (C0234a) v1bVar;
                int i = c0234a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0234a.b = i - Integer.MIN_VALUE;
                } else {
                    c0234a = new C0234a(v1bVar);
                }
            } else {
                c0234a = new C0234a(v1bVar);
            }
            Object obj = c0234a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0234a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0234a.b = 1;
                if (this.a.collect(bVar, c0234a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(ztw<f> ztwVar, Function1<? super f.c, f.c> function1, v1b<? super d> v1bVar) {
        super(2, v1bVar);
        this.b = ztwVar;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        f value;
        f.c cVarInvoke;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ztw<f> ztwVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(ztwVar);
            this.a = 1;
            if (s0i.c(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        do {
            value = ztwVar.getValue();
            cVarInvoke = value;
            if (cVarInvoke instanceof f.c) {
                cVarInvoke = this.c.invoke((f.c) cVarInvoke);
            }
        } while (!ztwVar.g(value, cVarInvoke));
        return Unit.a;
    }
}
