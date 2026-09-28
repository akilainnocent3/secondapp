package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class et8 {
    public static final op8 a = new op8(819106789, new bt8(), false);
    public static final op8 b = new op8(-408278997, new ct8(), false);

    public static final class a implements Function0<w7g> {
        public final /* synthetic */ dtg0 a;

        public a(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w7g] */
        @Override // kotlin.jvm.functions.Function0
        public final w7g invoke() {
            return ((x5a0) this.a.d).getValue();
        }
    }

    public static final class b implements Function0<dtg0.b<w7g>> {
        public final /* synthetic */ dtg0 a;

        public b(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dtg0.b<w7g> invoke() {
            return this.a.f();
        }
    }
}
