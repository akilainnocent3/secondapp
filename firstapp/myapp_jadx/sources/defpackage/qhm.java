package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$uiState$1", f = "HomeShortcutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qhm extends tje0 implements gaj<lk50<? extends uf00<? extends x690>>, Boolean, v1b<? super lyh<? extends nhm>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ ohm c;

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$uiState$1$1", f = "HomeShortcutViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super nhm>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super nhm> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                nhm.b bVar = nhm.b.a;
                this.b = null;
                this.a = 1;
                if (myhVar.emit(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$uiState$1$2", f = "HomeShortcutViewModel.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super nhm>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(2, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super nhm> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = (myh) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                nhm.a aVar = nhm.a.a;
                this.b = null;
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

    public static final class c implements lyh<nhm.c> {
        public final /* synthetic */ m790 a;
        public final /* synthetic */ lk50 b;
        public final /* synthetic */ boolean c;

        @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$uiState$1$invokeSuspend$$inlined$map$1", f = "HomeShortcutViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ lk50 b;
            public final /* synthetic */ boolean c;

            @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$uiState$1$invokeSuspend$$inlined$map$1$2", f = "HomeShortcutViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, lk50 lk50Var, boolean z) {
                this.a = myhVar;
                this.b = lk50Var;
                this.c = z;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    nhm.c cVar = new nhm.c((uf00) ((lk50.c) this.b).a, (uf00) obj, this.c);
                    aVar.b = 1;
                    if (this.a.emit(cVar, aVar) == y5bVar) {
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

        public c(m790 m790Var, lk50 lk50Var, boolean z) {
            this.a = m790Var;
            this.b = lk50Var;
            this.c = z;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super nhm.c> myhVar, v1b v1bVar) {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b, this.c);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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
    public qhm(ohm ohmVar, v1b<? super qhm> v1bVar) {
        super(3, v1bVar);
        this.c = ohmVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends uf00<? extends x690>> lk50Var, Boolean bool, v1b<? super lyh<? extends nhm>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        qhm qhmVar = new qhm(this.c, v1bVar);
        qhmVar.a = lk50Var;
        qhmVar.b = zBooleanValue;
        return qhmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.b) {
            return new or60(new a(2, null));
        }
        if (lk50Var instanceof lk50.a) {
            return new or60(new b(2, null));
        }
        if (!(lk50Var instanceof lk50.c)) {
            uhc.a();
            return null;
        }
        l790 l790Var = this.c.c;
        List list = (List) ((lk50.c) lk50Var).a;
        l790Var.getClass();
        list.getClass();
        return new c(new m790(new or60(new n790(null, l790Var, list)), z, list, l790Var), lk50Var, z);
    }
}
