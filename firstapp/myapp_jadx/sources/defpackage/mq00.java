package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class mq00 {
    public final h530 a;
    public final xq00 b;
    public final m2l c;
    public final k5b d;
    public final k5b e;
    public final JsonSerializeService f;
    public final j1b g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;

    @c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase$1", f = "PersonalSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<b, c, v1b<? super Object>, Object> {
        public /* synthetic */ b a;
        public /* synthetic */ c b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(b bVar, c cVar, v1b<? super Object> v1bVar) {
            a aVar = mq00.this.new a(v1bVar);
            aVar.a = bVar;
            aVar.b = cVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            mq00 mq00Var = mq00.this;
            wwd0 wwd0Var = mq00Var.j;
            b bVar = this.a;
            c cVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q("PersonalSocketUseCase");
            aVar.a("combine account " + bVar + "   socket  " + cVar + "  " + Thread.currentThread().getName(), new Object[0]);
            if (bVar instanceof b.C0875b) {
                return Unit.a;
            }
            if (!(bVar instanceof b.a) && !(bVar instanceof b.c)) {
                uhc.a();
                return null;
            }
            if (cVar instanceof c.b) {
                return Unit.a;
            }
            if (!(cVar instanceof c.a)) {
                uhc.a();
                return null;
            }
            ej5.c(mq00Var.g, mq00Var.d, null, new rq00(mq00Var, !((Boolean) wwd0Var.getValue()).booleanValue(), null), 2);
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return Boolean.TRUE;
        }
    }

    public interface b {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -585706880;
            }

            public final String toString() {
                return "Login";
            }
        }

        /* JADX INFO: renamed from: mq00$b$b, reason: collision with other inner class name */
        public static final class C0875b implements b {
            public static final C0875b a = new C0875b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0875b);
            }

            public final int hashCode() {
                return 1526651775;
            }

            public final String toString() {
                return "NoLogin";
            }
        }

        public static final class c implements b {
            public final long a = Calendar.getInstance().getTimeInMillis();

            public c(int i) {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return d020.a(this.a, "RefreshToken(timestamp=", ")");
            }
        }
    }

    public interface c {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -189152967;
            }

            public final String toString() {
                return "Subscribe";
            }
        }

        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 515182948;
            }

            public final String toString() {
                return "Unsubscribed";
            }
        }
    }

    public mq00(h530 h530Var, xq00 xq00Var, m2l m2lVar, uqm uqmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, @Dispatcher(sportyDispatcher = SportyDispatchers.Main) k5b k5bVar2, JsonSerializeService jsonSerializeService) {
        h530Var.getClass();
        xq00Var.getClass();
        m2lVar.getClass();
        uqmVar.getClass();
        k5bVar2.getClass();
        jsonSerializeService.getClass();
        this.a = h530Var;
        this.b = xq00Var;
        this.c = m2lVar;
        this.d = k5bVar;
        this.e = k5bVar2;
        this.f = jsonSerializeService;
        j1b j1bVarA = w5b.a(k5bVar);
        this.g = j1bVarA;
        wwd0 wwd0VarA = xwd0.a(uqmVar.isLogin() ? b.a.a : b.C0875b.a);
        this.h = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(c.b.a);
        this.i = wwd0VarA2;
        this.j = xwd0.a(Boolean.FALSE);
        itf0.a aVar = itf0.a;
        aVar.q("PersonalSocketUseCase");
        aVar.a(wga.a(wwd0VarA.getValue(), "init isLogin "), new Object[0]);
        kzh.d(new n1i(wwd0VarA, wwd0VarA2, new a(null)), j1bVarA);
    }

    public static void b(Function0 function0) {
        zu7.a aVar = zu7.a;
        ej5.c(zu7.a(), null, null, new pq00(function0, null), 3);
    }

    public final void a(String str, Function1 function1) {
        zu7.a aVar = zu7.a;
        ej5.c(zu7.a(), null, null, new nq00(this, str, function1, null), 3);
    }

    public final void c(JSONObject jSONObject, Class cls, Function1 function1) {
        zu7.a aVar = zu7.a;
        ej5.c(zu7.a(), null, null, new qq00(this, jSONObject, cls, function1, null), 3);
    }

    public final void d(String str) {
        zu7.a aVar = zu7.a;
        ej5.c(zu7.a(), null, null, new tq00(this, str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(boolean z, x1b x1bVar) {
        vq00 vq00Var;
        Object bVar;
        if (x1bVar instanceof vq00) {
            vq00Var = (vq00) x1bVar;
            int i = vq00Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vq00Var.d = i - Integer.MIN_VALUE;
            } else {
                vq00Var = new vq00(this, x1bVar);
            }
        } else {
            vq00Var = new vq00(this, x1bVar);
        }
        Object string = vq00Var.b;
        y5b y5bVar = y5b.a;
        int i2 = vq00Var.d;
        boolean z2 = true;
        if (i2 == 0) {
            uj50.b(string);
            vq00Var.a = z;
            vq00Var.d = 1;
            string = this.c.a.getString("key_loyalty_unread", "", vq00Var);
            if (string == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = vq00Var.a;
            uj50.b(string);
        }
        String str = (String) string;
        try {
            zi50.a aVar = zi50.b;
            bVar = (LoyaltyAggregateHintData) this.f.fromJson(str, LoyaltyAggregateHintData.class);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        LoyaltyAggregateHintData loyaltyAggregateHintData = (LoyaltyAggregateHintData) (bVar instanceof zi50.b ? null : bVar);
        if (loyaltyAggregateHintData == null || (!z && loyaltyAggregateHintData.getAvailableMissionInfoList().isEmpty())) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
