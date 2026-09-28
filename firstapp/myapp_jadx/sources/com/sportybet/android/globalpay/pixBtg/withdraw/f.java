package com.sportybet.android.globalpay.pixBtg.withdraw;

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
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawUiStateKt$updateLoadedState$1", f = "PixBtgWithdrawUiState.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ztw<e> b;
    public final /* synthetic */ Function1<e.c, e.c> c;

    public static final class a implements lyh<Object> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.withdraw.f$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawUiStateKt$updateLoadedState$1$invokeSuspend$$inlined$filterIsInstance$1", f = "PixBtgWithdrawUiState.kt", l = {109}, m = "collect", v = 2)
        public static final class C0242a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0242a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: com.sportybet.android.globalpay.pixBtg.withdraw.f$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawUiStateKt$updateLoadedState$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "PixBtgWithdrawUiState.kt", l = {50}, m = "emit", v = 2)
            public static final class C0243a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0243a(v1b v1bVar) {
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
                C0243a c0243a;
                if (v1bVar instanceof C0243a) {
                    c0243a = (C0243a) v1bVar;
                    int i = c0243a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0243a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0243a = new C0243a(v1bVar);
                    }
                } else {
                    c0243a = new C0243a(v1bVar);
                }
                Object obj2 = c0243a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0243a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (obj instanceof e.c) {
                        c0243a.b = 1;
                        if (this.a.emit(obj, c0243a) == y5bVar) {
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
            C0242a c0242a;
            if (v1bVar instanceof C0242a) {
                c0242a = (C0242a) v1bVar;
                int i = c0242a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0242a.b = i - Integer.MIN_VALUE;
                } else {
                    c0242a = new C0242a(v1bVar);
                }
            } else {
                c0242a = new C0242a(v1bVar);
            }
            Object obj = c0242a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0242a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0242a.b = 1;
                if (this.a.collect(bVar, c0242a) == y5bVar) {
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
    public f(ztw<e> ztwVar, Function1<? super e.c, e.c> function1, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.b = ztwVar;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e value;
        e.c cVarInvoke;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ztw<e> ztwVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a(ztwVar);
            this.a = 1;
            obj = s0i.c(aVar, this);
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
        if (((e.c) obj) == null) {
            return Unit.a;
        }
        do {
            value = ztwVar.getValue();
            cVarInvoke = value;
            if (cVarInvoke instanceof e.c) {
                cVarInvoke = this.c.invoke((e.c) cVarInvoke);
            }
        } while (!ztwVar.g(value, cVarInvoke));
        return Unit.a;
    }
}
