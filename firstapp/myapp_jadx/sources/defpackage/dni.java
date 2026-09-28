package defpackage;

import android.net.Uri;
import androidx.compose.runtime.m;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import com.sporty.android.core.model.loyalty.RewardShowOffData;
import com.sporty.android.core.model.loyalty.RewardShowOffUploadResult;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.platform.features.loyalty.footballgame.FootballData;
import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MultipartBody;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldni;", "Lj8i0;", "Lw0u;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dni extends j8i0 implements w0u {
    public final t340 A;
    public FootballData B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final ytw J;
    public h5b K;
    public final v340 L;
    public final mpe0 M;
    public final h530 a;
    public final psm b;
    public final odd c;
    public final JsonSerializeService d;
    public final bnh0 e;
    public final mgb0 f;
    public final rdd0 i;
    public long v;
    public final ku90<y9i> w;
    public final t340 y;
    public final ku90<List<LoyaltyActivityData>> z;

    public static final class a implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: dni$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$preClaim$$inlined$map$1", f = "FootballViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0491a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0491a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: dni$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$preClaim$$inlined$map$1$2", f = "FootballViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0492a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0492a(v1b v1bVar) {
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
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
                C0492a c0492a;
                if (v1bVar instanceof C0492a) {
                    c0492a = (C0492a) v1bVar;
                    int i = c0492a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0492a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0492a = new C0492a(v1bVar);
                    }
                } else {
                    c0492a = new C0492a(v1bVar);
                }
                Object obj2 = c0492a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0492a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0492a.b = 1;
                    if (this.a.emit(objB, c0492a) == y5bVar) {
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

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            C0491a c0491a;
            if (v1bVar instanceof C0491a) {
                c0491a = (C0491a) v1bVar;
                int i = c0491a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0491a.b = i - Integer.MIN_VALUE;
                } else {
                    c0491a = new C0491a(v1bVar);
                }
            } else {
                c0491a = new C0491a(v1bVar);
            }
            Object obj = c0491a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0491a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0491a.b = 1;
                if (this.a.collect(bVar, c0491a) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$preClaim$2", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ dni b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, dni dniVar) {
            super(2, v1bVar);
            this.b = dniVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.b);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = lk50Var instanceof lk50.a;
            dni dniVar = this.b;
            if (z) {
                wwd0 wwd0Var = dniVar.C;
                dbi.a aVar = new dbi.a(((lk50.a) lk50Var).b);
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            } else if (Intrinsics.g(lk50Var, lk50.b.a)) {
                Unit unit = Unit.a;
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var2 = dniVar.F;
                Boolean bool = Boolean.TRUE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool);
            }
            return Unit.a;
        }
    }

    public dni(vu60 vu60Var, h530 h530Var, psm psmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, JsonSerializeService jsonSerializeService, bnh0 bnh0Var, mgb0 mgb0Var, rdd0 rdd0Var) {
        vu60Var.getClass();
        h530Var.getClass();
        psmVar.getClass();
        jsonSerializeService.getClass();
        bnh0Var.getClass();
        mgb0Var.getClass();
        rdd0Var.getClass();
        this.a = h530Var;
        this.b = psmVar;
        this.c = oddVar;
        this.d = jsonSerializeService;
        this.e = bnh0Var;
        this.f = mgb0Var;
        this.i = rdd0Var;
        ku90<y9i> ku90Var = new ku90<>();
        this.w = ku90Var;
        this.y = e1i.a(ku90Var);
        ku90<List<LoyaltyActivityData>> ku90Var2 = new ku90<>();
        this.z = ku90Var2;
        this.A = e1i.a(ku90Var2);
        FootballData footballData = (FootballData) vu60Var.b("key-football-data");
        this.B = footballData == null ? new FootballData(0) : footballData;
        wwd0 wwd0VarA = xwd0.a(new dbi.b(null));
        this.C = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new smi.b(psmVar.getCountryCode(), this.B.d, null, null));
        this.D = wwd0VarA2;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA3 = xwd0.a(bool);
        this.E = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(bool);
        this.F = wwd0VarA4;
        py90 py90Var = py90.a;
        wwd0 wwd0VarA5 = xwd0.a(py90Var);
        this.G = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(bool);
        this.H = wwd0VarA6;
        this.I = xwd0.a(plh0.d.a);
        this.J = m.b(es50.a.a);
        this.L = e1i.e(r1i.b(wwd0VarA2, wwd0VarA, wwd0VarA3, wwd0VarA5, new jni(null, this)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new wmi(true, py90Var, new dbi.b(null), new smi.b(psmVar.getCountryCode(), this.B.d, null, null)));
        this.M = hwr.b(new xmi(this, 0));
        kzh.d(new g1i(bm50.a(r0i.f(new fni(r1i.b(wwd0VarA6, wwd0VarA4, wwd0VarA3, wwd0VarA5, new ymi(5, null))), new gni(null, this))), new ani(null, this)), o8i0.d(this));
    }

    public final void A1() {
        smi smiVar = (smi) this.D.getValue();
        if (!(smiVar instanceof smi.c)) {
            itf0.a.d("Unexpected state: " + smiVar, new Object[0]);
            z1();
            return;
        }
        RewardShowOffData rewardShowOffData = ((smi.c) smiVar).b;
        String url = rewardShowOffData.getUrl();
        if (url == null || StringsKt.U(url)) {
            return;
        }
        String string = Uri.parse(url).buildUpon().clearQuery().appendQueryParameter(EventKeys.ERROR_CODE, rewardShowOffData.getRedirectCode()).appendQueryParameter("activity", "loyalty-reward").build().toString();
        string.getClass();
        this.w.a(new y9i.b(string, rewardShowOffData.getPlatforms(), rewardShowOffData.getText(), rewardShowOffData.getHashtags()));
    }

    public final void B1() {
        kzh.d(new g1i(bm50.a(new a(this.a.q(this.B.c))), new b(null, this)), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C1(String str, MultipartBody.Part part, x1b x1bVar) {
        lni lniVar;
        String str2;
        h530 h530Var;
        if (x1bVar instanceof lni) {
            lniVar = (lni) x1bVar;
            int i = lniVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lniVar.f = i - Integer.MIN_VALUE;
            } else {
                lniVar = new lni(this, x1bVar);
            }
        } else {
            lniVar = new lni(this, x1bVar);
        }
        Object obj = lniVar.d;
        y5b y5bVar = y5b.a;
        int i2 = lniVar.f;
        if (i2 == 0) {
            uj50.b(obj);
            lniVar.a = str;
            lniVar.b = part;
            h530 h530Var2 = this.a;
            lniVar.c = h530Var2;
            lniVar.f = 1;
            Object userId = this.f.getUserId(lniVar);
            if (userId != y5bVar) {
                str2 = str;
                h530Var = h530Var2;
                obj = userId;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        h530Var = lniVar.c;
        part = lniVar.b;
        str2 = lniVar.a;
        uj50.b(obj);
        lyh<BaseResponse<RewardShowOffUploadResult>> lyhVarO = h530Var.o((String) obj, str2, part);
        StringUiText stringUiText = vch0.a;
        kni kniVar = new kni(bm50.b(lyhVarO, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), this);
        lniVar.a = null;
        lniVar.b = null;
        lniVar.c = null;
        lniVar.f = 2;
        Object objA = kzh.a(kniVar, lniVar);
        return objA == y5bVar ? y5bVar : objA;
    }

    public final void x1() {
        h5b h5bVar = this.K;
        if (h5bVar != null) {
            h5bVar.a();
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LOYALTY_REWARD);
        aVar.a("FootballViewModel: cancel timer", new Object[0]);
    }

    public final void y1(ebi ebiVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        ebi.c cVar;
        Object value7;
        Object value8;
        FootballData footballData;
        ebiVar.getClass();
        boolean zEquals = ebiVar.equals(ebi.f.a);
        wwd0 wwd0Var = this.H;
        psm psmVar = this.b;
        wwd0 wwd0Var2 = this.D;
        if (zEquals) {
            do {
                value7 = wwd0Var.getValue();
                ((Boolean) value7).getClass();
            } while (!wwd0Var.g(value7, Boolean.TRUE));
            if (this.B.d) {
                return;
            }
            do {
                value8 = wwd0Var2.getValue();
                footballData = this.B;
            } while (!wwd0Var2.g(value8, new smi.a(footballData.b, footballData.a, null, psmVar.getCountryCode(), null)));
            return;
        }
        boolean zEquals2 = ebiVar.equals(ebi.b.a);
        wwd0 wwd0Var3 = this.C;
        if (zEquals2) {
            dbi.b bVar = new dbi.b(ebi.a.a);
            wwd0Var3.getClass();
            wwd0Var3.k(null, bVar);
            return;
        }
        if (ebiVar.equals(ebi.a.a)) {
            this.w.a(y9i.a.a);
            return;
        }
        if (ebiVar.equals(ebi.k.a)) {
            StringUiText stringUiText = vch0.a;
            dbi.a aVar = new dbi.a(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
            wwd0Var3.getClass();
            wwd0Var3.k(null, aVar);
            return;
        }
        if (ebiVar.equals(ebi.i.a)) {
            B1();
            return;
        }
        boolean zEquals3 = ebiVar.equals(ebi.e.a);
        wwd0 wwd0Var4 = this.E;
        if (zEquals3) {
            Boolean bool = Boolean.TRUE;
            wwd0Var4.getClass();
            wwd0Var4.k(null, bool);
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.CLAIM_REWARD_BY_BALL_FLICKING);
            return;
        }
        if (ebiVar instanceof ebi.c) {
            do {
                value6 = wwd0Var2.getValue();
                cVar = (ebi.c) ebiVar;
            } while (!wwd0Var2.g(value6, new smi.c(cVar.a, cVar.b, uxs.ENABLE)));
            return;
        }
        boolean z = ebiVar instanceof ebi.g;
        wwd0 wwd0Var5 = this.G;
        if (z) {
            Boolean bool2 = Boolean.FALSE;
            wwd0Var4.getClass();
            wwd0Var4.k(null, bool2);
            wwd0 wwd0Var6 = this.F;
            wwd0Var6.getClass();
            wwd0Var6.k(null, bool2);
            do {
                value2 = wwd0Var5.getValue();
            } while (!wwd0Var5.g(value2, py90.a));
            this.I.setValue(plh0.d.a);
            FootballData footballData2 = ((ebi.g) ebiVar).a;
            this.B = footballData2;
            if (!footballData2.d) {
                do {
                    value3 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value3, new smi.a(footballData2.b, footballData2.a, null, psmVar.getCountryCode(), null)));
                return;
            } else {
                do {
                    value4 = wwd0Var.getValue();
                    ((Boolean) value4).getClass();
                } while (!wwd0Var.g(value4, Boolean.FALSE));
                do {
                    value5 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value5, new smi.b(psmVar.getCountryCode(), true, null, null)));
                return;
            }
        }
        if (ebiVar.equals(ebi.l.a)) {
            this.v = System.currentTimeMillis();
            ej5.c(o8i0.d(this), null, null, new mni(null, this), 3);
            return;
        }
        if (ebiVar instanceof ebi.j) {
            ((x5a0) this.J).setValue(es50.a.a);
            ej5.c(o8i0.d(this), null, null, new eni(this, ((ebi.j) ebiVar).a, null), 3);
            return;
        }
        if (ebiVar.equals(ebi.h.a)) {
            B1();
            do {
                value = wwd0Var5.getValue();
            } while (!wwd0Var5.g(value, py90.b));
            f00 f00Var2 = vgb0.a;
            vgb0.a(AnalyticsEvent.CLAIM_REWARD_BY_SKIP_BALL_FLICKING);
            return;
        }
        if (!(ebiVar instanceof ebi.d)) {
            uhc.a();
            return;
        }
        ebi.d dVar = (ebi.d) ebiVar;
        this.i.a(new eqt(dVar.a, dVar.b), k00.d);
    }

    public final void z1() {
        StringUiText stringUiText = vch0.a;
        dbi.a aVar = new dbi.a(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
        wwd0 wwd0Var = this.C;
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
    }
}
