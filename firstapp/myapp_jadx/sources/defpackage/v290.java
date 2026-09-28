package defpackage;

import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.ads.AdsConfig;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class v290 implements u290 {
    public final wl a;
    public final j1b b;
    public final ConcurrentHashMap<String, uwd0<String>> c;
    public final uwd0<String> d;

    public static final class a implements lyh<String> {
        public final /* synthetic */ vl50 a;

        /* JADX INFO: renamed from: v290$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.SharedDepositAdsManagerImpl$getOrCreateContentFlow$lambda$0$$inlined$map$1", f = "SharedDepositAdsManager.kt", l = {109}, m = "collect", v = 2)
        public static final class C1199a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1199a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: v290$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.SharedDepositAdsManagerImpl$getOrCreateContentFlow$lambda$0$$inlined$map$1$2", f = "SharedDepositAdsManager.kt", l = {50}, m = "emit", v = 2)
            public static final class C1200a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1200a(v1b v1bVar) {
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
                C1200a c1200a;
                if (v1bVar instanceof C1200a) {
                    c1200a = (C1200a) v1bVar;
                    int i = c1200a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1200a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1200a = new C1200a(v1bVar);
                    }
                } else {
                    c1200a = new C1200a(v1bVar);
                }
                Object obj2 = c1200a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1200a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Ads ads = (Ads) obj;
                    String text = ads != null ? ads.getText() : null;
                    if (text == null) {
                        text = "";
                    }
                    c1200a.b = 1;
                    if (this.a.emit(text, c1200a) == y5bVar) {
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

        public a(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
            C1199a c1199a;
            if (v1bVar instanceof C1199a) {
                c1199a = (C1199a) v1bVar;
                int i = c1199a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1199a.b = i - Integer.MIN_VALUE;
                } else {
                    c1199a = new C1199a(v1bVar);
                }
            } else {
                c1199a = new C1199a(v1bVar);
            }
            Object obj = c1199a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1199a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1199a.b = 1;
                if (this.a.collect(bVar, c1199a) == y5bVar) {
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

    public v290(wl wlVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, List<String> list) {
        wlVar.getClass();
        this.a = wlVar;
        this.b = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), k5bVar));
        this.c = new ConcurrentHashMap<>();
        for (String str : list) {
            if (!StringsKt.U(str)) {
                a(str);
            }
        }
        this.d = a(AdsConfig.DepositBanner.getId());
    }

    public final uwd0<String> a(String str) {
        ConcurrentHashMap<String, uwd0<String>> concurrentHashMap = this.c;
        uwd0<String> uwd0Var = concurrentHashMap.get(str);
        if (uwd0Var == null) {
            v340 v340VarE = e1i.e(new a(bm50.f(bm50.a(this.a.b(AdsConfig.DepositBanner)))), this.b, q490.a.a, "");
            uwd0<String> uwd0VarPutIfAbsent = concurrentHashMap.putIfAbsent(str, v340VarE);
            uwd0Var = uwd0VarPutIfAbsent == null ? v340VarE : uwd0VarPutIfAbsent;
        }
        return uwd0Var;
    }

    @Override // defpackage.u290
    public final uwd0<String> x0() {
        return this.d;
    }
}
