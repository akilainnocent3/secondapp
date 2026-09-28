package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupDict;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xi30 implements lyh<lk50<? extends List<? extends MarketGroupData>>> {
    public final /* synthetic */ lyh a;

    @c0d(c = "com.sportybet.plugin.realsports.quickmarket.QuickMarketViewModel$getQuickMarketData$$inlined$map$1", f = "QuickMarketViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return xi30.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.plugin.realsports.quickmarket.QuickMarketViewModel$getQuickMarketData$$inlined$map$1$2", f = "QuickMarketViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                T t = ((BaseResponse) obj).data;
                t.getClass();
                ArrayList arrayList = new ArrayList();
                for (MarketGroupData marketGroupData : (Iterable) t) {
                    List<MarketGroupDict> marketGroupDicts = marketGroupData.getMarketGroupDicts();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : marketGroupDicts) {
                        if (Intrinsics.g(((MarketGroupDict) t2).isDisplay(), Boolean.TRUE)) {
                            arrayList2.add(t2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList2.get(i3);
                        i3++;
                        arrayList3.add(new MarketGroupData(1, null, null, null, (MarketGroupDict) obj3, 14, null));
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    arrayList4.add(0, new MarketGroupData(0, null, marketGroupData.getGroupName(), null, null, 26, null));
                    p48.w(arrayList4, arrayList);
                }
                lk50.c cVar = new lk50.c(arrayList);
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

    public xi30(lyh lyhVar) {
        this.a = lyhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lk50<? extends List<? extends MarketGroupData>>> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar);
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
