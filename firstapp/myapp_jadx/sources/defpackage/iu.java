package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liu;", "Lj8i0;", "dedicated-team-page"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iu extends j8i0 {
    public final lfk a;
    public final zgh b;
    public final String c;
    public final wwd0 d;
    public final wwd0 e;
    public final v340 f;

    @c0d(c = "com.sportybet.feature.dedicatedteampage.article.presentation.viewmodel.AllNewsViewModel$uiState$1", f = "AllNewsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<eu, Boolean, v1b<? super fu>, Object> {
        public /* synthetic */ eu a;
        public /* synthetic */ boolean b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(eu euVar, Boolean bool, v1b<? super fu> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = iu.this.new a(v1bVar);
            aVar.a = euVar;
            aVar.b = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            eu euVar = this.a;
            boolean z = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z) {
                return fu.c.a;
            }
            String str = euVar.a;
            grx grxVar = euVar.c;
            if (str != null) {
                return new fu.b(str);
            }
            zgh zghVar = iu.this.b;
            List<wgh> list = grxVar.a;
            zghVar.getClass();
            return new fu.a(zgh.a(list), euVar.b, grxVar.c);
        }
    }

    public iu(vu60 vu60Var, lfk lfkVar, zgh zghVar) {
        vu60Var.getClass();
        this.a = lfkVar;
        this.b = zghVar;
        String str = (String) vu60Var.b("team_id");
        this.c = str == null ? "" : str;
        wwd0 wwd0VarA = xwd0.a(Boolean.TRUE);
        this.d = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new eu(0));
        this.e = wwd0VarA2;
        this.f = e1i.e(new n1i(wwd0VarA2, wwd0VarA, new a(null)), o8i0.d(this), q490.a.a, fu.c.a);
        ej5.c(o8i0.d(this), null, null, new gu(this, null), 3);
    }
}
