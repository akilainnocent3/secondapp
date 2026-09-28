package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexq;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class exq extends j8i0 {
    public final ku90<pvq> A;
    public final bmd a;
    public final r9k b;
    public final rdd0 c;
    public final odd d;
    public final g1r e;
    public final String f;
    public final wwd0 i;
    public final v340 v;
    public final wwd0 w;
    public final wwd0 y;
    public final v340 z;

    public exq(vu60 vu60Var, i6u i6uVar, bmd bmdVar, r9k r9kVar, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        Object bVar;
        vu60Var.getClass();
        i6uVar.getClass();
        rdd0Var.getClass();
        this.a = bmdVar;
        this.b = r9kVar;
        this.c = rdd0Var;
        this.d = oddVar;
        try {
            zi50.a aVar = zi50.b;
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            bVar = (g1r) fnf.a(vu60Var, jq40.a(g1r.class), o2gVar);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            String str = (String) vu60Var.b("lotteryId");
            str = str == null ? "" : str;
            Boolean bool = (Boolean) vu60Var.b("needCheckWhenApply");
            bVar = new g1r(str, bool != null ? bool.booleanValue() : false);
        }
        g1r g1rVar = (g1r) bVar;
        this.e = g1rVar;
        this.f = g1rVar.a;
        this.i = xwd0.a(null);
        lyh lyhVarC = ozh.c(new cxq(i6uVar.k.d, this), this.d);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        this.v = e1i.e(lyhVarC, et7VarD, kwd0Var, "");
        v340 v340VarE = e1i.e(ozh.c(new bxq(i6uVar.f.d), this.d), o8i0.d(this), kwd0Var, 0);
        wwd0 wwd0VarA = xwd0.a(null);
        this.w = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.y = wwd0VarA2;
        this.z = e1i.e(ozh.c(r1i.a(v340VarE, wwd0VarA2, wwd0VarA, new dxq(4, null)), this.d), o8i0.d(this), kwd0Var, wwq.b.a);
        this.A = new ku90<>();
        ej5.c(o8i0.d(this), this.d, null, new ywq(this, null), 2);
    }

    public final void x1(evq evqVar) {
        boolean z = evqVar instanceof evq.j;
        odd oddVar = this.d;
        wwd0 wwd0Var = this.y;
        if (z) {
            dvq dvqVar = ((evq.j) evqVar).a;
            if (dvqVar instanceof dvq.a) {
                ej5.c(o8i0.d(this), oddVar, null, new axq(this, null), 2);
                return;
            } else {
                wwd0Var.getClass();
                wwd0Var.k(null, dvqVar);
                return;
            }
        }
        boolean zEquals = evqVar.equals(evq.a.a);
        rdd0 rdd0Var = this.c;
        ku90<pvq> ku90Var = this.A;
        if (zEquals) {
            djr.a(rdd0Var, cjr.u.a);
            ku90Var.a(new pvq.a(new nvp.c(new x0r(this.f, null, fvq.a((dvq) wwd0Var.getValue(), (String) this.v.a.getValue()), m2g.a, true))));
            return;
        }
        if (evqVar instanceof evq.i) {
            qxp qxpVar = (qxp) bm50.i(((evq.i) evqVar).a);
            if (qxpVar != null) {
                wwd0 wwd0Var2 = this.i;
                wwd0Var2.getClass();
                wwd0Var2.k(null, qxpVar);
                return;
            }
            return;
        }
        if (evqVar.equals(evq.g.a)) {
            ku90Var.a(new pvq.a(new nvp.f(3, (uf00) null)));
            return;
        }
        boolean z2 = evqVar instanceof evq.e;
        wwd0 wwd0Var3 = this.w;
        if (z2) {
            wwd0Var3.setValue(null);
            return;
        }
        if (evqVar instanceof evq.b) {
            evq.b bVar = (evq.b) evqVar;
            if (bVar.b || !this.e.b) {
                ku90Var.a(new pvq.a(new nvp.f(a4h.a(new Pair("key_apply_number", CollectionsKt.a0(bVar.a, ",", null, null, null, 62))), jq40.a(q8r.class))));
                return;
            }
            djr.a(rdd0Var, cjr.v.a);
            StringUiText stringUiText = vch0.a;
            ovq ovqVar = new ovq(new ResourceUiText(R.string.page_lucky_numbers__replace_selection), new ResourceUiText(R.string.page_lucky_numbers__replace_selection_with_my_numbers_confirm_message), new ColoredUiText(new ResourceUiText(R.string.page_lucky_numbers__replace), Integer.valueOf(R.color.text_brand_sub_primary_d_base), null), false, new evq.b(bVar.a, true), evq.e.a);
            wwd0Var3.getClass();
            wwd0Var3.k(null, ovqVar);
            return;
        }
        if (evqVar instanceof evq.f) {
            evq.f fVar = (evq.f) evqVar;
            ku90Var.a(new pvq.a(new nvp.c(new x0r(this.f, Integer.valueOf(fVar.a), fVar.b, fVar.c, false))));
            return;
        }
        if (!(evqVar instanceof evq.d)) {
            if (evqVar instanceof evq.c) {
                ku90Var.a(new pvq.a(new nvp.c(i1r.INSTANCE)));
                return;
            } else if (evqVar instanceof evq.h) {
                ej5.c(o8i0.d(this), oddVar, null, new axq(this, null), 2);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        evq.d dVar = (evq.d) evqVar;
        int i = dVar.a;
        if (dVar.b) {
            ej5.c(o8i0.d(this), oddVar, null, new zwq(this, i, null), 2);
            return;
        }
        StringUiText stringUiText2 = vch0.a;
        ovq ovqVar2 = new ovq(new ResourceUiText(R.string.page_lucky_numbers__remove_confirm), new ResourceUiText(R.string.page_lucky_numbers__remove_my_numbers_confirm_message), new ColoredUiText(new ResourceUiText(R.string.common_functions__remove), Integer.valueOf(R.color.text_danger), null), false, new evq.d(i, true), evq.e.a);
        wwd0Var3.getClass();
        wwd0Var3.k(null, ovqVar2);
    }
}
