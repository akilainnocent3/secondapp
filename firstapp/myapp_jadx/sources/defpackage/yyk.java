package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.gift.GiftCountBody;
import com.sporty.android.core.model.gift.GiftCountResponse;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyyk;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yyk extends j8i0 {
    public final JsonSerializeService A;
    public final BetSlipDataStore B;
    public final qqe0 C;
    public final long D;
    public final tuw E;
    public final wwd0 F;
    public final r5b G;
    public final vu90<vjk> H;
    public final vu90<vjk> I;
    public final wwd0 J;
    public final r5b K;
    public final wwd0 L;
    public final r5b M;
    public final b390 N;
    public final r5b O;
    public final b390 P;
    public final b390 Q;
    public final b390 R;
    public final wwd0 S;
    public final v340 T;
    public final odd a;
    public final h530 b;
    public final lq1 c;
    public final h53 d;
    public final vp3 e;
    public final ou90 f;
    public final vmw i;
    public final tcd v;
    public final oc30 w;
    public final zik y;
    public final kj7 z;

    @c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$onChangeGiftAndFooter$1", f = "GiftViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ yyk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, yyk yykVar) {
            super(2, v1bVar);
            this.b = yykVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = this.b.R;
                Unit unit = Unit.a;
                this.a = 1;
                if (b390Var.emit(unit, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$parseGiftDataAndGetFirst$1", f = "GiftViewModel.kt", l = {204}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yyk.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = yyk.this.P;
                Boolean boolValueOf = Boolean.valueOf(this.c);
                this.a = 1;
                if (b390Var.emit(boolValueOf, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$showGiftDialogByType$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ vjk b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vjk vjkVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = vjkVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return yyk.this.new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yyk.this.H.m(this.b);
            return Unit.a;
        }
    }

    public yyk(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, h530 h530Var, lq1 lq1Var, h53 h53Var, vp3 vp3Var, ou90 ou90Var, vmw vmwVar, tcd tcdVar, oc30 oc30Var, zik zikVar, kj7 kj7Var, JsonSerializeService jsonSerializeService, BetSlipDataStore betSlipDataStore, qqe0 qqe0Var) {
        h530Var.getClass();
        lq1Var.getClass();
        h53Var.getClass();
        vp3Var.getClass();
        jsonSerializeService.getClass();
        betSlipDataStore.getClass();
        this.a = oddVar;
        this.b = h530Var;
        this.c = lq1Var;
        this.d = h53Var;
        this.e = vp3Var;
        this.f = ou90Var;
        this.i = vmwVar;
        this.v = tcdVar;
        this.w = oc30Var;
        this.y = zikVar;
        this.z = kj7Var;
        this.A = jsonSerializeService;
        this.B = betSlipDataStore;
        this.C = qqe0Var;
        this.D = 300000L;
        this.E = uuw.a();
        wwd0 wwd0VarA = xwd0.a(m2g.a);
        this.F = wwd0VarA;
        this.G = i2i.c(wwd0VarA, null, 3);
        vu90<vjk> vu90Var = new vu90<>();
        this.H = vu90Var;
        this.I = vu90Var;
        wwd0 wwd0VarA2 = xwd0.a(n780.e.a);
        this.J = wwd0VarA2;
        this.K = i2i.c(wwd0VarA2, null, 3);
        wwd0 wwd0VarA3 = xwd0.a(k990.b.a);
        this.L = wwd0VarA3;
        this.M = i2i.c(wwd0VarA3, null, 3);
        b390 b390VarB = d390.b(0, 0, null, 6);
        this.N = b390VarB;
        this.O = i2i.c(b390VarB, null, 3);
        b390 b390VarB2 = d390.b(0, 0, null, 6);
        this.P = b390VarB2;
        b390 b390VarB3 = d390.b(0, 0, null, 6);
        this.Q = b390VarB3;
        b390 b390VarB4 = d390.b(0, 0, null, 6);
        this.R = b390VarB4;
        wwd0 wwd0VarA4 = xwd0.a(0);
        this.S = wwd0VarA4;
        this.T = e1i.b(wwd0VarA4);
        kzh.d(r0i.f(b390VarB2, new ezk(null, this)), o8i0.d(this));
        kzh.d(r0i.f(b390VarB3, new fzk(null, this)), o8i0.d(this));
        kzh.d(r0i.f(b390VarB4, new gzk(null, this)), o8i0.d(this));
    }

    public static void A1(yyk yykVar) {
        lyh<BaseResponse<GiftCountResponse>> lyhVarX = yykVar.b.x(new GiftCountBody(2, 1, null, 1, null, 20, null));
        StringUiText stringUiText = vch0.a;
        kzh.d(new vyk(bm50.b(lyhVarX, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), yykVar), o8i0.d(yykVar));
    }

    public static boolean D1(GiftDetails giftDetails, List list) {
        giftDetails.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.g(((GiftDetails) it.next()).getGiftId(), giftDetails.getGiftId())) {
                return true;
            }
        }
        return false;
    }

    public final List<GiftGroup> B1() {
        return (List) this.F.getValue();
    }

    public final boolean C1() {
        return qq1.a(this.c, BOConfigParam.GiftReminderEnabledAddToStake, false);
    }

    public final void E1() {
        ej5.c(o8i0.d(this), null, null, new a(null, this), 3);
    }

    public final void F1(boolean z) {
        ej5.c(o8i0.d(this), null, null, new b(z, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00da A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:16:0x0036, B:64:0x011a, B:66:0x011e, B:79:0x018a, B:80:0x018d, B:23:0x0048, B:70:0x014b, B:72:0x014f, B:26:0x0051, B:76:0x017c, B:78:0x0180, B:29:0x005a, B:52:0x00d6, B:54:0x00da, B:55:0x00e4, B:36:0x007f, B:38:0x0089, B:41:0x008f, B:43:0x0099, B:45:0x00a3, B:49:0x00b3, B:58:0x00ed, B:61:0x00f9, B:67:0x0129, B:73:0x015a), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x011e A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:16:0x0036, B:64:0x011a, B:66:0x011e, B:79:0x018a, B:80:0x018d, B:23:0x0048, B:70:0x014b, B:72:0x014f, B:26:0x0051, B:76:0x017c, B:78:0x0180, B:29:0x005a, B:52:0x00d6, B:54:0x00da, B:55:0x00e4, B:36:0x007f, B:38:0x0089, B:41:0x008f, B:43:0x0099, B:45:0x00a3, B:49:0x00b3, B:58:0x00ed, B:61:0x00f9, B:67:0x0129, B:73:0x015a), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014f A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:16:0x0036, B:64:0x011a, B:66:0x011e, B:79:0x018a, B:80:0x018d, B:23:0x0048, B:70:0x014b, B:72:0x014f, B:26:0x0051, B:76:0x017c, B:78:0x0180, B:29:0x005a, B:52:0x00d6, B:54:0x00da, B:55:0x00e4, B:36:0x007f, B:38:0x0089, B:41:0x008f, B:43:0x0099, B:45:0x00a3, B:49:0x00b3, B:58:0x00ed, B:61:0x00f9, B:67:0x0129, B:73:0x015a), top: B:85:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
    
        if (r14 == r2) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G1(boolean r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyk.G1(boolean, x1b):java.lang.Object");
    }

    public final void H1() {
        if (this.d.b()) {
            return;
        }
        this.f.a.k(null, new n780.a(1));
        this.w.a.k(null, new n780.a(1));
        L1(m2g.a);
        M1(new n780.a(null));
    }

    public final void I1(GiftDetails giftDetails, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        giftDetails.getClass();
        int typeName = this.e.e.getTypeName();
        if (typeName == 1) {
            ou90 ou90Var = this.f;
            ou90Var.getClass();
            wwd0 wwd0Var = ou90Var.a;
            wwd0Var.k(null, new n780.c(giftDetails, str, str2, bool, bool2, bool3));
            M1((n780) wwd0Var.getValue());
            return;
        }
        if (typeName != 2) {
            M1((n780) this.v.a.getValue());
            return;
        }
        vmw vmwVar = this.i;
        vmwVar.getClass();
        wwd0 wwd0Var2 = vmwVar.a;
        wwd0Var2.k(null, new n780.c(giftDetails, str, str2, bool, bool2, bool3));
        M1((n780) wwd0Var2.getValue());
    }

    public final void J1(GiftDetails giftDetails, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        giftDetails.getClass();
        oc30 oc30Var = this.w;
        oc30Var.getClass();
        wwd0 wwd0Var = oc30Var.a;
        wwd0Var.k(null, new n780.c(giftDetails, str, str2, bool, bool2, bool3));
        M1((n780) wwd0Var.getValue());
    }

    public final void K1(vjk vjkVar) {
        vjkVar.getClass();
        ej5.c(o8i0.d(this), null, null, new c(vjkVar, null), 3);
    }

    public final void L1(List<GiftGroup> list) {
        wwd0 wwd0Var;
        Object value;
        list.getClass();
        do {
            wwd0Var = this.F;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, this.d.b() ? list : m2g.a));
    }

    public final void M1(n780 n780Var) {
        wwd0 wwd0Var;
        Object value;
        n780Var.getClass();
        do {
            wwd0Var = this.J;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, n780Var));
    }

    public final jj7 x1(JSONObject jSONObject) {
        this.z.getClass();
        return kj7.a(jSONObject);
    }

    public final void y1(Integer num, boolean z) {
        kzh.d(new yzh(new n1i(new or60(new uyk(null, this)), ozh.c(this.b.m(1, num), this.a), new qyk(this, z, num, null)), new ryk(3, null)), o8i0.d(this));
    }

    public final void z1(int i) {
        kzh.d(new yzh(new g1i(ozh.c(this.b.m(i, 0), this.a), new syk(null, this)), new tyk(3, null)), o8i0.d(this));
    }
}
