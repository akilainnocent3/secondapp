package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class muo {
    public final b390 a;

    @c0d(c = "com.sportybet.plugin.usecase.InsureAnalyticsReportUseCase$1", f = "InsureAnalyticsReportUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Pair<? extends String, ? extends Map<String, ? extends Object>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends String, ? extends Map<String, ? extends Object>> pair, v1b<? super Unit> v1bVar) {
            return ((a) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            B b = pair.b;
            A a = pair.a;
            if (((Map) b).isEmpty()) {
                f00 f00Var = vgb0.a;
                vgb0.a((String) a);
            } else {
                f00 f00Var2 = vgb0.a;
                vgb0.c((String) a, (Map) pair.b, false);
            }
            return Unit.a;
        }
    }

    public muo() {
        b390 b390VarB = d390.b(0, 100, pb5.b, 1);
        this.a = b390VarB;
        g1i g1iVar = new g1i(b390VarB, new a(2, null));
        zu7.a aVar = zu7.a;
        kzh.d(g1iVar, zu7.a());
    }

    public final void a(String str, Map map) {
        map.getClass();
        this.a.a(new Pair(str, map));
    }
}
