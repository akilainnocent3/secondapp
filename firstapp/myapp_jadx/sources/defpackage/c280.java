package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.realsports.data.SearchHistoryPreference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class c280 implements lyh<lk50<? extends SearchHistoryPreference>> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ n280 b;

    @c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getSearchHistory$$inlined$map$1", f = "SearchViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return c280.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ n280 b;

        @c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getSearchHistory$$inlined$map$1$2", f = "SearchViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, n280 n280Var) {
            this.a = myhVar;
            this.b = n280Var;
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
                n280 n280Var = this.b;
                SearchHistoryPreference searchHistoryPreference = (SearchHistoryPreference) ((JsonSerializeService) n280Var.i.getValue()).fromJson((String) obj, (Class) SearchHistoryPreference.class);
                if (searchHistoryPreference != null) {
                    n280Var.y = searchHistoryPreference;
                }
                lk50.c cVar = new lk50.c(n280Var.y);
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

    public c280(lyh lyhVar, n280 n280Var) {
        this.a = lyhVar;
        this.b = n280Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lk50<? extends SearchHistoryPreference>> myhVar, v1b v1bVar) {
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
