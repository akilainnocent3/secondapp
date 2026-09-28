package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh2j0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h2j0 extends j8i0 {
    public final w1j0 a;
    public final JsonSerializeService b;
    public final wwd0 c;
    public final v340 d;

    @c0d(c = "com.sportybet.feature.debugscreen.impl.welcomereward.WelcomeRewardDebugViewModel$1", f = "WelcomeRewardDebugViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public JsonSerializeService a;
        public int b;

        /* JADX INFO: renamed from: h2j0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"h2j0$a$a", "Lcom/google/gson/reflect/TypeToken;", "Lcom/sporty/android/core/model/welcomereward/WelcomeRewardTimingConfig;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class C0618a extends TypeToken<WelcomeRewardTimingConfig> {
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return h2j0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            JsonSerializeService jsonSerializeService;
            y5b y5bVar = y5b.a;
            int i = this.b;
            h2j0 h2j0Var = h2j0.this;
            if (i == 0) {
                uj50.b(obj);
                JsonSerializeService jsonSerializeService2 = h2j0Var.b;
                w1j0 w1j0Var = h2j0Var.a;
                wm20 wm20VarA = w1j0Var.d.a(w1j0Var, w1j0.i[2]);
                this.a = jsonSerializeService2;
                this.b = 1;
                Object objE = wm20VarA.e(this, "");
                if (objE == y5bVar) {
                    return y5bVar;
                }
                obj = objE;
                jsonSerializeService = jsonSerializeService2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jsonSerializeService = this.a;
                uj50.b(obj);
            }
            WelcomeRewardTimingConfig welcomeRewardTimingConfig = (WelcomeRewardTimingConfig) jsonSerializeService.fromJson((String) obj, new C0618a().getType());
            if (welcomeRewardTimingConfig == null) {
                welcomeRewardTimingConfig = new WelcomeRewardTimingConfig(0, 0, 0, 7, (DefaultConstructorMarker) null);
            }
            wwd0 wwd0Var = h2j0Var.c;
            wwd0Var.getClass();
            wwd0Var.k(null, welcomeRewardTimingConfig);
            return Unit.a;
        }
    }

    public h2j0(w1j0 w1j0Var, JsonSerializeService jsonSerializeService) {
        w1j0Var.getClass();
        jsonSerializeService.getClass();
        this.a = w1j0Var;
        this.b = jsonSerializeService;
        wwd0 wwd0VarA = xwd0.a(new WelcomeRewardTimingConfig(0, 0, 0, 7, (DefaultConstructorMarker) null));
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public static void x1(h2j0 h2j0Var, Integer num, Integer num2, Integer num3, int i) {
        Object value;
        WelcomeRewardTimingConfig welcomeRewardTimingConfig;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        wwd0 wwd0Var = h2j0Var.c;
        do {
            value = wwd0Var.getValue();
            welcomeRewardTimingConfig = (WelcomeRewardTimingConfig) value;
        } while (!wwd0Var.g(value, welcomeRewardTimingConfig.copy(num != null ? num.intValue() : welcomeRewardTimingConfig.getAutoOpenMinutes(), num2 != null ? num2.intValue() : welcomeRewardTimingConfig.getHideAfterClickMinutes(), num3 != null ? num3.intValue() : welcomeRewardTimingConfig.getHideWithoutClickMinutes())));
    }
}
