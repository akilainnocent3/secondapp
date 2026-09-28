package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface yka {
    public static final a k = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final tsr.a b = tsr.h0;
        public static final e c = e.a;
        public static final c d = c.a;
        public static final d e = d.a;
        public static final b f = b.a;
        public static final C1350a g = C1350a.a;

        /* JADX INFO: renamed from: yka$a$a, reason: collision with other inner class name */
        public static final class C1350a extends qlr implements Function2<yka, Integer, Unit> {
            public static final C1350a a = new C1350a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(yka ykaVar, Integer num) {
                num.intValue();
                ykaVar.getClass();
                return Unit.a;
            }
        }

        public static final class b extends qlr implements Function2<yka, aiv, Unit> {
            public static final b a = new b(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(yka ykaVar, aiv aivVar) {
                ykaVar.j(aivVar);
                return Unit.a;
            }
        }

        public static final class c extends qlr implements Function2<yka, androidx.compose.ui.d, Unit> {
            public static final c a = new c(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(yka ykaVar, androidx.compose.ui.d dVar) {
                ykaVar.k(dVar);
                return Unit.a;
            }
        }

        public static final class d extends qlr implements Function2<yka, ina, Unit> {
            public static final d a = new d(2);

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(yka ykaVar, ina inaVar) {
                ykaVar.p(inaVar);
                return Unit.a;
            }
        }

        public static final class e extends qlr implements Function0<tsr> {
            public static final e a = new e(0);

            @Override // kotlin.jvm.functions.Function0
            public final tsr invoke() {
                return new tsr(2);
            }
        }
    }

    void j(aiv aivVar);

    void k(d dVar);

    void p(ina inaVar);
}
