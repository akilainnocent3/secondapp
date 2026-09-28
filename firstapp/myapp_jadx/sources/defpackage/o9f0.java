package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo9f0;", "Lj8i0;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o9f0 extends j8i0 {
    public final nfk a;
    public final ivs b;
    public final String c;
    public final int d;
    public final wwd0 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamStandingsViewModel$uiState$1", f = "TeamStandingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<uf00<? extends a4g0>, String, v1b<? super m9f0>, Object> {
        public /* synthetic */ uf00 a;
        public /* synthetic */ String b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(uf00<? extends a4g0> uf00Var, String str, v1b<? super m9f0> v1bVar) {
            a aVar = o9f0.this.new a(v1bVar);
            aVar.a = uf00Var;
            aVar.b = str;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            uf00 uf00Var = this.a;
            String str = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (uf00Var == null) {
                return m9f0.c.a;
            }
            o9f0 o9f0Var = o9f0.this;
            uf00 uf00Var2 = (uf00) o9f0Var.e.getValue();
            String str2 = null;
            if (uf00Var2 != null) {
                Iterator<E> it = uf00Var2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((a4g0) next).a, str));
                a4g0 a4g0Var = (a4g0) next;
                if (a4g0Var != null) {
                    str2 = a4g0Var.b;
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            return new m9f0.a(uf00Var, str, o9f0Var.b.b(o9f0Var.d, str2));
        }
    }

    public o9f0(vu60 vu60Var, nfk nfkVar, ivs ivsVar) {
        vu60Var.getClass();
        this.a = nfkVar;
        this.b = ivsVar;
        String str = (String) vu60Var.b("team_id");
        str = str == null ? "" : str;
        this.c = str;
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.m0(str, ":", str));
        this.d = intOrNull != null ? intOrNull.intValue() : 0;
        wwd0 wwd0VarA = xwd0.a(null);
        this.e = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a("");
        this.f = wwd0VarA2;
        this.i = e1i.e(new n1i(wwd0VarA, wwd0VarA2, new a(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), m9f0.c.a);
        ej5.c(o8i0.d(this), null, null, new n9f0(this, null), 3);
    }
}
