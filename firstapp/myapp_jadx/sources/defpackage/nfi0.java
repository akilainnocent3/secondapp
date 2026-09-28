package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import com.sporty.android.core.model.instantwin.NetworkVirtualInHouseGamePromotionBanner;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl$getVirtualInHouseGamePromotionBanner$2$1$cmsValues$1", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class nfi0 extends tje0 implements Function2<v5b, v1b<? super List<? extends CMSResponse>>, Object> {
    public int a;
    public final /* synthetic */ ofi0 b;
    public final /* synthetic */ NetworkVirtualInHouseGamePromotionBanner c;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl$getVirtualInHouseGamePromotionBanner$2$1$cmsValues$1$2", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<List<? extends CMSResponse>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ NetworkVirtualInHouseGamePromotionBanner b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = networkVirtualInHouseGamePromotionBanner;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends CMSResponse> list, v1b<? super Boolean> v1bVar) {
            return ((a) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String key = ((CMSResponse) it.next()).getKey();
                    NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner = this.b;
                    if (Intrinsics.g(key, networkVirtualInHouseGamePromotionBanner.getBodyText())) {
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.g(((CMSResponse) it2.next()).getKey(), networkVirtualInHouseGamePromotionBanner.getButtonText())) {
                                    z = true;
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class b implements lyh<Object> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl$getVirtualInHouseGamePromotionBanner$2$1$cmsValues$1$invokeSuspend$$inlined$filterIsInstance$1", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: nfi0$b$b, reason: collision with other inner class name */
        public static final class C0897b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: nfi0$b$b$a */
            @c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl$getVirtualInHouseGamePromotionBanner$2$1$cmsValues$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {50}, m = "emit", v = 2)
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
                    return C0897b.this.emit(null, this);
                }
            }

            public C0897b(myh myhVar) {
                this.a = myhVar;
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
                    if (obj instanceof lk50.c) {
                        aVar.b = 1;
                        if (this.a.emit(obj, aVar) == y5bVar) {
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
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
                C0897b c0897b = new C0897b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0897b, aVar) == y5bVar) {
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

    public static final class c implements lyh<List<? extends CMSResponse>> {
        public final /* synthetic */ b a;

        @c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl$getVirtualInHouseGamePromotionBanner$2$1$cmsValues$1$invokeSuspend$$inlined$map$1", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {109}, m = "collect", v = 2)
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

            @c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl$getVirtualInHouseGamePromotionBanner$2$1$cmsValues$1$invokeSuspend$$inlined$map$1$2", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {50}, m = "emit", v = 2)
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
                    T t = ((lk50.c) obj).a;
                    aVar.b = 1;
                    if (this.a.emit(t, aVar) == y5bVar) {
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

        public c(b bVar) {
            this.a = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super List<? extends CMSResponse>> myhVar, v1b v1bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfi0(ofi0 ofi0Var, NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner, v1b<? super nfi0> v1bVar) {
        super(2, v1bVar);
        this.b = ofi0Var;
        this.c = networkVirtualInHouseGamePromotionBanner;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nfi0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super List<? extends CMSResponse>> v1bVar) {
        return ((nfi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ofi0 ofi0Var = this.b;
        wo5 wo5Var = ofi0Var.b;
        NetworkVirtualInHouseGamePromotionBanner networkVirtualInHouseGamePromotionBanner = this.c;
        String cmsPage = networkVirtualInHouseGamePromotionBanner.getCmsPage();
        if (cmsPage == null) {
            cmsPage = "";
        }
        c cVar = new c(new b(wo5.b(wo5Var, cmsPage, ofi0Var.c.getLanguageCode(null), 2)));
        a aVar = new a(networkVirtualInHouseGamePromotionBanner, null);
        this.a = 1;
        Object objB = s0i.b(cVar, aVar, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
