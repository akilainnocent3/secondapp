package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.GiftGrabButtonStatus;
import com.sportybet.plugin.realsports.data.GiftGrabData;
import com.sportybet.plugin.realsports.data.GiftGrabGiftValue;
import com.sportybet.plugin.realsports.data.GiftGrabPersonalInfo;
import com.sportybet.plugin.realsports.data.GiftGrabProgressInfo;
import com.sportybet.plugin.realsports.data.GiftGrabUIState;
import com.sportybet.plugin.realsports.data.GiftGrabUserGrabAvailable;
import com.sportybet.plugin.realsports.data.GiftGrabViewState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhmk;", "Lihb0;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hmk extends ihb0 {
    public final vu90<GiftGrabGiftValue> A;
    public final vu90 B;
    public final vu90<Boolean> C;
    public final vu90 D;
    public final ssw<Integer> E;
    public final ssw F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final r5b K;
    public final r5b L;
    public a M;
    public a N;
    public final nlk d;
    public final uqm e;
    public final JsonSerializeService f;
    public final alk i;
    public String v;
    public String w;
    public final vu90<UiText> y;
    public final vu90 z;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a {
        public final Topic a;
        public final Subscriber b;

        public a(Topic topic, Subscriber subscriber) {
            this.a = topic;
            this.b = subscriber;
        }
    }

    public static final class b implements lyh<GiftGrabUserGrabAvailable> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$getUserGrabAvailable$$inlined$map$1", f = "GiftGrabViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: hmk$b$b, reason: collision with other inner class name */
        public static final class C0646b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: hmk$b$b$a */
            @c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$getUserGrabAvailable$$inlined$map$1$2", f = "GiftGrabViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0646b.this.emit(null, this);
                }
            }

            public C0646b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
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
                    Object objB = n52.b((BaseResponse) obj);
                    aVar.b = 1;
                    if (this.a.emit(objB, aVar) == y5bVar) {
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super GiftGrabUserGrabAvailable> myhVar, v1b v1bVar) {
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
                C0646b c0646b = new C0646b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0646b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$getUserGrabAvailable$2", f = "GiftGrabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<lk50<? extends GiftGrabUserGrabAvailable>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = hmk.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends GiftGrabUserGrabAvailable> lk50Var, v1b<? super Unit> v1bVar) {
            return ((c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hmk hmkVar = hmk.this;
            wwd0 wwd0Var = hmkVar.J;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lk50Var instanceof lk50.b) {
                Unit unit = Unit.a;
            } else if (lk50Var instanceof lk50.c) {
                wwd0 wwd0Var2 = hmkVar.H;
                GiftGrabUserGrabAvailable giftGrabUserGrabAvailable = (GiftGrabUserGrabAvailable) ((lk50.c) lk50Var).a;
                Boolean boolValueOf = Boolean.valueOf(giftGrabUserGrabAvailable.getHasGrabbedGift());
                wwd0Var2.getClass();
                wwd0Var2.k(null, boolValueOf);
                GiftGrabData.Data data = new GiftGrabData.Data(new GiftGrabPersonalInfo.Success(giftGrabUserGrabAvailable.getGrabAvailable(), giftGrabUserGrabAvailable.getRemainingCashBetThreshold()));
                wwd0Var.getClass();
                wwd0Var.k(null, data);
            } else {
                if (!(lk50Var instanceof lk50.a)) {
                    uhc.a();
                    return null;
                }
                GiftGrabData.Data data2 = new GiftGrabData.Data(GiftGrabPersonalInfo.Failed.INSTANCE);
                wwd0Var.getClass();
                wwd0Var.k(null, data2);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$initComplete$1", f = "GiftGrabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<GiftGrabData<? extends GiftGrabProgressInfo>, GiftGrabData<? extends GiftGrabPersonalInfo>, v1b<? super Boolean>, Object> {
        public /* synthetic */ GiftGrabData a;
        public /* synthetic */ GiftGrabData b;

        @Override // defpackage.gaj
        public final Object invoke(GiftGrabData<? extends GiftGrabProgressInfo> giftGrabData, GiftGrabData<? extends GiftGrabPersonalInfo> giftGrabData2, v1b<? super Boolean> v1bVar) {
            d dVar = new d(3, v1bVar);
            dVar.a = giftGrabData;
            dVar.b = giftGrabData2;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            GiftGrabData giftGrabData = this.a;
            GiftGrabData giftGrabData2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf((giftGrabData instanceof GiftGrabData.Data) && (giftGrabData2 instanceof GiftGrabData.Data));
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.GiftGrabViewModel$uiState$1", f = "GiftGrabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements jaj<GiftGrabPersonalInfo, Boolean, GiftGrabProgressInfo, Boolean, v1b<? super GiftGrabUIState.Data>, Object> {
        public /* synthetic */ GiftGrabPersonalInfo a;
        public /* synthetic */ boolean b;
        public /* synthetic */ GiftGrabProgressInfo c;
        public /* synthetic */ boolean d;

        public e(v1b<? super e> v1bVar) {
            super(5, v1bVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00df  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair;
            GiftGrabViewState running;
            GiftGrabPersonalInfo giftGrabPersonalInfo = this.a;
            boolean z = this.b;
            GiftGrabProgressInfo giftGrabProgressInfo = this.c;
            boolean z2 = this.d;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            GiftGrabButtonStatus loaded = z2 ? GiftGrabButtonStatus.Loading.INSTANCE : null;
            if (giftGrabProgressInfo.getGiftGrabActivityEnded()) {
                StringUiText stringUiText = vch0.a;
                running = new GiftGrabViewState.Idle(new ResourceUiText(R.string.page_gift_grab__gift_grab_complete_try_another_match));
            } else if (z) {
                StringUiText stringUiText2 = vch0.a;
                running = new GiftGrabViewState.Idle(new ResourceUiText(R.string.page_gift_grab__congratulations_on_your_gift));
            } else {
                if (giftGrabPersonalInfo instanceof GiftGrabPersonalInfo.Success) {
                    GiftGrabPersonalInfo.Success success = (GiftGrabPersonalInfo.Success) giftGrabPersonalInfo;
                    if (success.getGrabAvailable()) {
                        if (giftGrabProgressInfo.getGrabAvailable()) {
                            StringUiText stringUiText3 = vch0.a;
                            pair = new Pair(new ResourceUiText(R.string.page_gift_grab__grab_the_gift_now), Boolean.TRUE);
                        } else {
                            StringUiText stringUiText4 = vch0.a;
                            pair = new Pair(new ResourceUiText(R.string.page_gift_grab__grab_gift_once_the_power_bar_is_fully_charged), Boolean.FALSE);
                        }
                    } else if (success.getRemainingCashBetThreshold() != 0) {
                        String strD = a8b.d();
                        strD.getClass();
                        Object[] objArr = {inm.a("^", StringsKt.t0(strD).toString()), bjb0.U(success.getRemainingCashBetThreshold(), Locale.US).concat("^")};
                        StringUiText stringUiText5 = vch0.a;
                        pair = new Pair(new ResourceUiText(R.string.page_gift_grab__bet_an_additional_to_grab_gift, ay0.S(objArr)), Boolean.FALSE);
                    }
                    Object obj2 = pair.first;
                    obj2.getClass();
                    UiText uiText = (UiText) obj2;
                    if (loaded == null) {
                        Object obj3 = pair.second;
                        obj3.getClass();
                        loaded = new GiftGrabButtonStatus.Loaded(((Boolean) obj3).booleanValue());
                    }
                    running = new GiftGrabViewState.Running(uiText, loaded);
                } else if (!(giftGrabPersonalInfo instanceof GiftGrabPersonalInfo.Failed)) {
                    uhc.a();
                    return null;
                }
                StringUiText stringUiText6 = vch0.a;
                pair = new Pair(new ResourceUiText(R.string.page_gift_grab__placing_live_bets_to_grab_gift), Boolean.FALSE);
                Object obj4 = pair.first;
                obj4.getClass();
                UiText uiText2 = (UiText) obj4;
                if (loaded == null) {
                    Object obj5 = pair.second;
                    obj5.getClass();
                    loaded = new GiftGrabButtonStatus.Loaded(((Boolean) obj5).booleanValue());
                }
                running = new GiftGrabViewState.Running(uiText2, loaded);
            }
            return new GiftGrabUIState.Data(running);
        }

        @Override // defpackage.jaj
        public final Object l(GiftGrabPersonalInfo giftGrabPersonalInfo, Boolean bool, GiftGrabProgressInfo giftGrabProgressInfo, Boolean bool2, v1b<? super GiftGrabUIState.Data> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            e eVar = hmk.this.new e(v1bVar);
            eVar.a = giftGrabPersonalInfo;
            eVar.b = zBooleanValue;
            eVar.c = giftGrabProgressInfo;
            eVar.d = zBooleanValue2;
            return eVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmk(nlk nlkVar, uqm uqmVar, JsonSerializeService jsonSerializeService, alk alkVar) {
        super(0);
        nlkVar.getClass();
        uqmVar.getClass();
        jsonSerializeService.getClass();
        this.d = nlkVar;
        this.e = uqmVar;
        this.f = jsonSerializeService;
        this.i = alkVar;
        this.v = "";
        this.w = "";
        vu90<UiText> vu90Var = new vu90<>();
        this.y = vu90Var;
        this.z = vu90Var;
        vu90<GiftGrabGiftValue> vu90Var2 = new vu90<>();
        this.A = vu90Var2;
        this.B = vu90Var2;
        vu90<Boolean> vu90Var3 = new vu90<>();
        this.C = vu90Var3;
        this.D = vu90Var3;
        ssw<Integer> sswVar = new ssw<>();
        this.E = sswVar;
        this.F = sswVar;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.G = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.H = wwd0VarA2;
        GiftGrabData.Empty empty = GiftGrabData.Empty.INSTANCE;
        wwd0 wwd0VarA3 = xwd0.a(empty);
        this.I = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(empty);
        this.J = wwd0VarA4;
        this.K = i2i.c(new n1i(wwd0VarA3, wwd0VarA4, new d(3, null)), null, 3);
        this.L = i2i.c(r1i.b(new jmk(new imk(wwd0VarA4)), wwd0VarA2, new jmk(new imk(wwd0VarA3)), wwd0VarA, new e(null)), null, 3);
    }

    public final void z1() {
        kzh.d(new g1i(bm50.a(new b(this.d.c(this.v, this.w))), new c(null)), o8i0.d(this));
    }
}
