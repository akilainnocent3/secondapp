package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls57;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s57 extends j8i0 {
    public final r57 a;
    public final oge0 b;
    public final psm c;
    public final wwd0 d;

    @c0d(c = "com.sportybet.feature.country.ChangeRegionViewModel$1", f = "ChangeRegionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return s57.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            s57 s57Var = s57.this;
            s57Var.d.setValue(s57Var.b.a(s57Var.c.getCountryCode()));
            return Unit.a;
        }
    }

    public s57(r57 r57Var, oge0 oge0Var, psm psmVar) {
        psmVar.getClass();
        this.a = r57Var;
        this.b = oge0Var;
        this.c = psmVar;
        this.d = xwd0.a(null);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }
}
