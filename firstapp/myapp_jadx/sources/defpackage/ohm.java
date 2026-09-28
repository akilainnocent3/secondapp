package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.AdSpots;
import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.ads.AdsData;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lohm;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ohm extends j8i0 {
    public final psm a;
    public final h530 b;
    public final l790 c;
    public final rdd0 d;
    public final odd e;
    public final wwd0 f;
    public final wwd0 i;
    public jvd0 v;
    public final v340 w;

    public static final class a implements lyh<uf00<? extends x690>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ ohm b;

        /* JADX INFO: renamed from: ohm$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$fetchData$$inlined$map$1", f = "HomeShortcutViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0942a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0942a(v1b v1bVar) {
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
            public final /* synthetic */ ohm b;

            /* JADX INFO: renamed from: ohm$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$fetchData$$inlined$map$1$2", f = "HomeShortcutViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0943a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0943a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, ohm ohmVar) {
                this.a = myhVar;
                this.b = ohmVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0943a c0943a;
                Object next;
                ArrayList arrayList;
                T next2;
                if (v1bVar instanceof C0943a) {
                    c0943a = (C0943a) v1bVar;
                    int i = c0943a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0943a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0943a = new C0943a(v1bVar);
                    }
                } else {
                    c0943a = new C0943a(v1bVar);
                }
                Object obj2 = c0943a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0943a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    List<AdSpots> adSpots = ((AdsData) n52.b((BaseResponse) obj)).getAdSpots();
                    adSpots.getClass();
                    Iterator<T> it = adSpots.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(((AdSpots) next).getSpotId(), "sportsBanner2"));
                    next.getClass();
                    List<Ads> ads = ((AdSpots) next).getAds();
                    ArrayList arrayListA = kw5.a(ads);
                    for (T t : ads) {
                        Ads ads2 = (Ads) t;
                        if (ads2.getImgUrl() != null && ads2.getImgUrlDark() != null && ads2.getText() != null && ads2.getLinkUrl() != null) {
                            arrayListA.add(t);
                        }
                    }
                    int i3 = 0;
                    if (this.b.a.F()) {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayListA.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayListA.get(i4);
                            i4++;
                            Ads ads3 = (Ads) obj3;
                            if (!Intrinsics.g(ads3.getId(), "1d939269465540e08d5623b0d4a85762") && !Intrinsics.g(ads3.getId(), "2a6cd098a6cd4a158ed4fd411b29b511")) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayListA = arrayList2;
                    }
                    ArrayList arrayList3 = new ArrayList(l48.r(arrayListA, 10));
                    int size2 = arrayListA.size();
                    while (i3 < size2) {
                        Object obj4 = arrayListA.get(i3);
                        i3++;
                        Ads ads4 = (Ads) obj4;
                        String id = ads4.getId();
                        String imgUrl = ads4.getImgUrl();
                        if (imgUrl == null) {
                            imgUrl = "";
                        }
                        String imgUrlDark = ads4.getImgUrlDark();
                        if (imgUrlDark == null) {
                            imgUrlDark = "";
                        }
                        String text = ads4.getText();
                        if (text == null) {
                            text = "";
                        }
                        String linkUrl = ads4.getLinkUrl();
                        if (linkUrl == null) {
                            linkUrl = "";
                        }
                        Boolean boolIsNew = ads4.isNew();
                        Boolean bool = Boolean.TRUE;
                        i790 i790Var = Intrinsics.g(boolIsNew, bool) ? i790.b : Intrinsics.g(ads4.isHot(), bool) ? i790.a : i790.c;
                        String group = ads4.getGroup();
                        String str = group != null ? group : "";
                        Iterator<T> it2 = v690.e.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                arrayList = arrayListA;
                                next2 = (T) null;
                                break;
                            }
                            next2 = it2.next();
                            arrayList = arrayListA;
                            if (((v690) next2).a.equals(str)) {
                                break;
                            }
                            arrayListA = arrayList;
                        }
                        v690 v690Var = next2;
                        if (v690Var == null) {
                            v690Var = v690.Others;
                        }
                        arrayList3.add(new x690(id, imgUrl, imgUrlDark, text, linkUrl, i790Var, v690Var, t690.c, false));
                        arrayListA = arrayList;
                    }
                    uf00 uf00VarF = a4h.f(arrayList3);
                    c0943a.b = 1;
                    if (this.a.emit(uf00VarF, c0943a) == y5bVar) {
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

        public a(lyh lyhVar, ohm ohmVar) {
            this.a = lyhVar;
            this.b = ohmVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends x690>> myhVar, v1b v1bVar) {
            C0942a c0942a;
            if (v1bVar instanceof C0942a) {
                c0942a = (C0942a) v1bVar;
                int i = c0942a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0942a.b = i - Integer.MIN_VALUE;
                } else {
                    c0942a = new C0942a(v1bVar);
                }
            } else {
                c0942a = new C0942a(v1bVar);
            }
            Object obj = c0942a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0942a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0942a.b = 1;
                if (this.a.collect(bVar, c0942a) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$fetchData$2", f = "HomeShortcutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends uf00<? extends x690>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = ohm.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends uf00<? extends x690>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ohm.this.i.setValue(lk50Var);
            return Unit.a;
        }
    }

    public ohm(psm psmVar, h530 h530Var, l790 l790Var, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        psmVar.getClass();
        h530Var.getClass();
        l790Var.getClass();
        rdd0Var.getClass();
        this.a = psmVar;
        this.b = h530Var;
        this.c = l790Var;
        this.d = rdd0Var;
        this.e = oddVar;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.f = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(lk50.b.a);
        this.i = wwd0VarA2;
        this.w = e1i.e(r0i.f(new n1i(wwd0VarA2, wwd0VarA, new qhm(this, null)), new phm(3, null)), o8i0.d(this), q490.a.a, nhm.b.a);
    }

    public final void x1() {
        jvd0 jvd0Var = this.v;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            this.v = kzh.d(ozh.c(new g1i(bm50.a(new a(this.b.z(), this)), new b(null)), this.e), o8i0.d(this));
        }
    }

    public final void y1(zgm zgmVar) {
        zgmVar.getClass();
        if (zgmVar instanceof zgm.e) {
            osa0.a(((zgm.e) zgmVar).a, this.f, null);
            return;
        }
        if (zgmVar instanceof zgm.a) {
            x690 x690Var = ((zgm.a) zgmVar).a;
            l790 l790Var = this.c;
            l790Var.getClass();
            zu7.a aVar = zu7.a;
            k5b k5bVar = l790Var.b;
            ej5.c(zu7.b(k5bVar), null, null, new q790(l790Var, x690Var, null), 3);
            return;
        }
        if (zgmVar.equals(zgm.c.a)) {
            x1();
            return;
        }
        if (zgmVar instanceof zgm.b) {
            throw null;
        }
        if (!(zgmVar instanceof zgm.d)) {
            uhc.a();
            return;
        }
        zgm.d dVar = (zgm.d) zgmVar;
        thm thmVar = dVar.a;
        k00[] k00VarArr = (k00[]) dVar.b.toArray(new k00[0]);
        this.d.a(thmVar, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
    }
}
