package defpackage;

import android.graphics.Color;
import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.common.ui.model.PromotionGiftsResponse;
import com.sportygames.wheelanddeal.model.WDAmountConfigModel;
import com.sportygames.wheelanddeal.model.WDAvailable;
import com.sportygames.wheelanddeal.model.WDPayTableModel;
import com.sportygames.wheelanddeal.model.WDPayoutsModel;
import com.sportygames.wheelanddeal.model.WDRiskAmountModel;
import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import com.sportygames.wheelanddeal.model.WDUserModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1", f = "WDViewModel.kt", l = {673}, m = "invokeSuspend", v = 1)
public final class hvi0 extends tje0 implements Function1<v1b<? super List<? extends kzs<?>>>, Object> {
    public kzs[] a;
    public kzs[] b;
    public int c;
    public int d;
    public final /* synthetic */ yui0 e;

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$10", f = "WDViewModel.kt", l = {666}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<uf00<? extends wsi0>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yui0 yui0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uf00<? extends wsi0> uf00Var, v1b<? super Unit> v1bVar) {
            return ((a) create(uf00Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uf00 uf00Var = (uf00) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.K;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(uf00Var);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$12", f = "WDViewModel.kt", l = {671}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<PromotionGiftsResponse, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yui0 yui0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PromotionGiftsResponse promotionGiftsResponse, v1b<? super Unit> v1bVar) {
            return ((b) create(promotionGiftsResponse, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            PromotionGiftsResponse promotionGiftsResponse = (PromotionGiftsResponse) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.B;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(promotionGiftsResponse);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$13", f = "WDViewModel.kt", l = {677}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<List<? extends File>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$13$1", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ yui0 a;
            public final /* synthetic */ List<File> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(yui0 yui0Var, List<? extends File> list, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.a = yui0Var;
                this.b = list;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.a, this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.i.a(this.b);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yui0 yui0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.c, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends File> list, v1b<? super Unit> v1bVar) {
            return ((c) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                pfd pfdVar = fse.a;
                wcl wclVar = gku.a;
                a aVar = new a(this.c, list, null);
                this.b = null;
                this.a = 1;
                if (ej5.d(wclVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$15", f = "WDViewModel.kt", l = {684}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<com.sportygames.newcms.b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yui0 yui0Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.c, v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sportygames.newcms.b bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.D;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(bVar);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$2", f = "WDViewModel.kt", l = {644}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<WDUserInfoModel, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(yui0 yui0Var, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.c, v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WDUserInfoModel wDUserInfoModel, v1b<? super Unit> v1bVar) {
            return ((e) create(wDUserInfoModel, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            WDUserInfoModel wDUserInfoModel = (WDUserInfoModel) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.I;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(wDUserInfoModel);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$4", f = "WDViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(2, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((f) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$6", f = "WDViewModel.kt", l = {656}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<qqi0, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(yui0 yui0Var, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = new g(this.c, v1bVar);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qqi0 qqi0Var, v1b<? super Unit> v1bVar) {
            return ((g) create(qqi0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qqi0 qqi0Var = (qqi0) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.O;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(qqi0Var);
                if (Unit.a == y5bVar) {
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

    @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$8", f = "WDViewModel.kt", l = {661}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<uui0, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ yui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(yui0 yui0Var, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.c = yui0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = new h(this.c, v1bVar);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uui0 uui0Var, v1b<? super Unit> v1bVar) {
            return ((h) create(uui0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uui0 uui0Var = (uui0) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wwd0 wwd0Var = this.c.N;
                this.b = null;
                this.a = 1;
                wwd0Var.setValue(uui0Var);
                if (Unit.a == y5bVar) {
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

    public static final class i implements lyh<WDUserInfoModel> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hvi0$i$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$invokeSuspend$$inlined$map$1$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0658a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0658a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws wjd0 {
                C0658a c0658a;
                if (v1bVar instanceof C0658a) {
                    c0658a = (C0658a) v1bVar;
                    int i = c0658a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0658a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0658a = new C0658a(v1bVar);
                    }
                } else {
                    c0658a = new C0658a(v1bVar);
                }
                Object obj2 = c0658a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0658a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = em50.b((HTTPResponse) obj);
                    c0658a.b = 1;
                    if (this.a.emit(objB, c0658a) == y5bVar) {
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

        public i(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super WDUserInfoModel> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class j implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hvi0$j$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$invokeSuspend$$inlined$map$2$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0659a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0659a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws cri0 {
                C0659a c0659a;
                if (v1bVar instanceof C0659a) {
                    c0659a = (C0659a) v1bVar;
                    int i = c0659a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0659a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0659a = new C0659a(v1bVar);
                    }
                } else {
                    c0659a = new C0659a(v1bVar);
                }
                Object obj2 = c0659a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0659a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    boolean available = ((WDAvailable) em50.b((HTTPResponse) obj)).getAvailable();
                    Boolean boolValueOf = Boolean.valueOf(available);
                    if (!available) {
                        throw new cri0("Game Unavailable");
                    }
                    c0659a.b = 1;
                    if (this.a.emit(boolValueOf, c0659a) == y5bVar) {
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

        public j(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class k implements lyh<qqi0> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ yui0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ yui0 b;

            /* JADX INFO: renamed from: hvi0$k$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$invokeSuspend$$inlined$map$3$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0660a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0660a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, yui0 yui0Var) {
                this.a = myhVar;
                this.b = yui0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0660a c0660a;
                T next;
                Pair pair;
                if (v1bVar instanceof C0660a) {
                    c0660a = (C0660a) v1bVar;
                    int i = c0660a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0660a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0660a = new C0660a(v1bVar);
                    }
                } else {
                    c0660a = new C0660a(v1bVar);
                }
                Object obj2 = c0660a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0660a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WDAmountConfigModel wDAmountConfigModel = (WDAmountConfigModel) em50.b((HTTPResponse) obj);
                    Set<String> setKeySet = wDAmountConfigModel.getBetAmount().a.keySet();
                    ArrayList arrayList = new ArrayList(l48.r(setKeySet, 10));
                    Iterator it = ((hgs.c) setKeySet).iterator();
                    while (((hgs.d) it).hasNext()) {
                        String str = (String) ((hgs.c.a) it).a().f;
                        Iterator<T> it2 = oti0.f.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it2.next();
                        } while (!((oti0) next).a.equals(str));
                        oti0 oti0Var = next;
                        if (oti0Var == null) {
                            pair = null;
                        } else {
                            pair = new Pair(oti0Var, this.b.y.e(wDAmountConfigModel.getBetAmount().j(str).d().toString(), WDRiskAmountModel.class));
                        }
                        arrayList.add(pair);
                    }
                    ArrayList arrayListR = CollectionsKt.R(arrayList);
                    int iA = jpu.a(l48.r(arrayListR, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    int size = arrayListR.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayListR.get(i3);
                        i3++;
                        Pair pair2 = (Pair) obj3;
                        linkedHashMap.put(pair2.a, pair2.b);
                    }
                    qqi0 qqi0Var = new qqi0(a4h.d(linkedHashMap), wDAmountConfigModel.getAutoSpin());
                    c0660a.b = 1;
                    if (this.a.emit(qqi0Var, c0660a) == y5bVar) {
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

        public k(lyh lyhVar, yui0 yui0Var) {
            this.a = lyhVar;
            this.b = yui0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super qqi0> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class l implements lyh<uui0> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ yui0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hvi0$l$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$invokeSuspend$$inlined$map$4$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0661a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0661a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, yui0 yui0Var) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws vui0 {
                C0661a c0661a;
                if (v1bVar instanceof C0661a) {
                    c0661a = (C0661a) v1bVar;
                    int i = c0661a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0661a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0661a = new C0661a(v1bVar);
                    }
                } else {
                    c0661a = new C0661a(v1bVar);
                }
                Object obj2 = c0661a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0661a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WDUserModel wDUserModel = (WDUserModel) em50.b((HTTPResponse) obj);
                    if (!wDUserModel.getAvailable()) {
                        throw new vui0("The user is not available");
                    }
                    uui0 uui0Var = new uui0(wDUserModel.getCurrency(), wDUserModel.getBalance());
                    c0661a.b = 1;
                    if (this.a.emit(uui0Var, c0661a) == y5bVar) {
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

        public l(lyh lyhVar, yui0 yui0Var) {
            this.a = lyhVar;
            this.b = yui0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uui0> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class m implements lyh<uf00<? extends wsi0>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ yui0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hvi0$m$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$invokeSuspend$$inlined$map$5$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0662a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0662a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, yui0 yui0Var) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws Throwable {
                C0662a c0662a;
                Object next;
                if (v1bVar instanceof C0662a) {
                    c0662a = (C0662a) v1bVar;
                    int i = c0662a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0662a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0662a = new C0662a(v1bVar);
                    }
                } else {
                    c0662a = new C0662a(v1bVar);
                }
                Object obj2 = c0662a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0662a.b;
                Throwable th = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    WDPayTableModel wDPayTableModel = (WDPayTableModel) em50.b((HTTPResponse) obj);
                    List<WDPayoutsModel> payouts = wDPayTableModel.getPayouts();
                    ArrayList arrayList = new ArrayList(l48.r(payouts, 10));
                    for (WDPayoutsModel wDPayoutsModel : payouts) {
                        Iterator<T> it = oti0.f.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = th;
                                break;
                            }
                            next = it.next();
                        } while (!((oti0) next).a.equals(wDPayoutsModel.getRisk()));
                        next.getClass();
                        oti0 oti0Var = (oti0) next;
                        List<Float> multiplier = wDPayoutsModel.getMultiplier();
                        ArrayList arrayList2 = new ArrayList(l48.r(multiplier, 10));
                        int i3 = 0;
                        int i4 = 0;
                        for (T t : multiplier) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                Throwable th2 = th;
                                kotlin.collections.b.q();
                                throw th2;
                            }
                            arrayList2.add(new gsi0(((Number) t).floatValue(), i4, r58.b(Color.parseColor(wDPayoutsModel.getColor().get(i4))), false));
                            th = th;
                            i4 = i5;
                        }
                        Throwable th3 = th;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int size = arrayList2.size();
                        while (i3 < size) {
                            Object obj3 = arrayList2.get(i3);
                            i3++;
                            Integer numValueOf = Integer.valueOf(((gsi0) obj3).a);
                            Object obj4 = linkedHashMap.get(numValueOf);
                            if (obj4 == null) {
                                ArrayList arrayList3 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList3);
                                obj4 = arrayList3;
                            }
                            ((List) obj4).add(obj3);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(entry.getKey(), (gsi0) CollectionsKt.T((List) entry.getValue()));
                        }
                        List<Integer> arrangement = wDPayoutsModel.getArrangement();
                        ArrayList arrayList4 = new ArrayList(l48.r(arrangement, 10));
                        Iterator<T> it2 = arrangement.iterator();
                        while (it2.hasNext()) {
                            Object obj5 = linkedHashMap2.get(Integer.valueOf(((Number) it2.next()).intValue()));
                            obj5.getClass();
                            arrayList4.add((gsi0) obj5);
                        }
                        arrayList.add(new wsi0(oti0Var, a4h.f(arrayList4), wDPayTableModel.getLastModifiedTimestamp()));
                        th = th3;
                    }
                    uf00 uf00VarF = a4h.f(arrayList);
                    c0662a.b = 1;
                    if (this.a.emit(uf00VarF, c0662a) == y5bVar) {
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

        public m(lyh lyhVar, yui0 yui0Var) {
            this.a = lyhVar;
            this.b = yui0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends wsi0>> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class n implements lyh<PromotionGiftsResponse> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hvi0$n$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$1$invokeSuspend$$inlined$map$6$2", f = "WDViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0663a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0663a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws wjd0 {
                C0663a c0663a;
                if (v1bVar instanceof C0663a) {
                    c0663a = (C0663a) v1bVar;
                    int i = c0663a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0663a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0663a = new C0663a(v1bVar);
                    }
                } else {
                    c0663a = new C0663a(v1bVar);
                }
                Object obj2 = c0663a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0663a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = em50.b((HTTPResponse) obj);
                    c0663a.b = 1;
                    if (this.a.emit(objB, c0663a) == y5bVar) {
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

        public n(lyh lyhVar) {
            this.a = lyhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super PromotionGiftsResponse> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvi0(yui0 yui0Var, v1b<? super hvi0> v1bVar) {
        super(1, v1bVar);
        this.e = yui0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new hvi0(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super List<? extends kzs<?>>> v1bVar) {
        return ((hvi0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        kzs[] kzsVarArr;
        int i2;
        kzs[] kzsVarArr2;
        yui0 yui0Var = this.e;
        kti0 kti0Var = yui0Var.e;
        y5b y5bVar = y5b.a;
        int i3 = this.d;
        if (i3 == 0) {
            uj50.b(obj);
            kzs[] kzsVarArr3 = new kzs[8];
            kzsVarArr3[0] = kee.b(new i(kti0Var.d()), new e(yui0Var, null));
            kzsVarArr3[1] = kee.b(new j(kti0Var.available()), new f(2, null));
            kzsVarArr3[2] = kee.b(new k(kti0Var.g(), yui0Var), new g(yui0Var, null));
            kzsVarArr3[3] = kee.b(new l(kti0Var.e(), yui0Var), new h(yui0Var, null));
            kzsVarArr3[4] = kee.b(new m(kti0Var.b(), yui0Var), new a(yui0Var, null));
            kzsVarArr3[5] = kee.b(new n(kti0Var.f()), new b(yui0Var, null));
            this.a = kzsVarArr3;
            this.b = kzsVarArr3;
            this.c = 6;
            this.d = 1;
            Object objG1 = yui0Var.G1(new String[]{"sg_common_dialog_message", "sg_fbg_dialog"}, this);
            if (objG1 == y5bVar) {
                return y5bVar;
            }
            kzsVarArr = kzsVarArr3;
            i2 = 6;
            obj = objG1;
            kzsVarArr2 = kzsVarArr;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.c;
            kzsVarArr = this.b;
            kzsVarArr2 = this.a;
            uj50.b(obj);
        }
        kzsVarArr[i2] = kee.b((lyh) obj, new c(yui0Var, null));
        kzsVarArr2[7] = yui0Var.b.a(new pg60(1), new d(yui0Var, null));
        return kotlin.collections.b.k(kzsVarArr2);
    }
}
