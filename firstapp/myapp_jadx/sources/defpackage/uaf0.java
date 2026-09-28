package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class uaf0 implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ vaf0 b;

    @c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$unbindTelegramAccount$$inlined$handleApiUnitResult$default$1", f = "TelegramBindingViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return uaf0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ vaf0 b;

        @c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$unbindTelegramAccount$$inlined$handleApiUnitResult$default$1$2", f = "TelegramBindingViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, vaf0 vaf0Var) {
            this.a = myhVar;
            this.b = vaf0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object value;
            Object value2;
            Object value3;
            Object value4;
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
                lk50 lk50Var = (lk50) obj;
                boolean z = lk50Var instanceof lk50.c;
                vaf0 vaf0Var = this.b;
                if (z) {
                    wwd0 wwd0Var = vaf0Var.i;
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, qaf0.a((qaf0) value3, null, false, 1)));
                    wwd0 wwd0Var2 = vaf0Var.w;
                    do {
                        value4 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value4, null));
                } else if (lk50Var instanceof lk50.a) {
                    lk50.a aVar2 = (lk50.a) lk50Var;
                    wwd0 wwd0Var3 = vaf0Var.w;
                    do {
                        value2 = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value2, new oaf0.a(aVar2.b)));
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var4 = vaf0Var.w;
                    do {
                        value = wwd0Var4.getValue();
                    } while (!wwd0Var4.g(value, oaf0.b.a));
                }
                Unit unit = Unit.a;
                aVar.b = 1;
                if (this.a.emit(unit, aVar) == y5bVar) {
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

    public uaf0(yzh yzhVar, vaf0 vaf0Var) {
        this.a = yzhVar;
        this.b = vaf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b);
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
