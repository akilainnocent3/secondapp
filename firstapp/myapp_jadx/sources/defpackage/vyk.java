package defpackage;

import com.sporty.android.core.model.gift.GiftCountResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vyk implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ yyk b;

    @c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$getGiftCount$$inlined$handleApiResult$default$1", f = "GiftViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return vyk.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ yyk b;

        @c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$getGiftCount$$inlined$handleApiResult$default$1$2", f = "GiftViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, yyk yykVar) {
            this.a = myhVar;
            this.b = yykVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object value;
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
                if (lk50Var instanceof lk50.c) {
                    int totalNum = ((GiftCountResponse) ((lk50.c) lk50Var).a).getTotalNum();
                    yyk yykVar = this.b;
                    wwd0 wwd0Var = yykVar.S;
                    do {
                        value = wwd0Var.getValue();
                        ((Number) value).intValue();
                    } while (!wwd0Var.g(value, Integer.valueOf(yykVar.d.b() ? totalNum : 0)));
                } else if (lk50Var instanceof lk50.a) {
                    itf0.a.d("Error getting gift count: " + ((lk50.a) lk50Var), new Object[0]);
                } else if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
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

    public vyk(yzh yzhVar, yyk yykVar) {
        this.a = yzhVar;
        this.b = yykVar;
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
