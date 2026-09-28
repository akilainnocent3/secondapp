package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lber;", "Lj8i0;", "b", "a", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ber extends j8i0 {
    public final wwd0 A;
    public final ku90<cdr> B;
    public final v340 C;
    public final olh0 a;
    public final rdd0 b;
    public final File c;
    public final odd d;
    public final String e;
    public final b f;
    public final b i;
    public final eer v;
    public final lcr w;
    public final v340 y;
    public final pjd z;

    public static final class a {
        public final y8r a;
        public final b b;

        public a(y8r y8rVar, b bVar) {
            y8rVar.getClass();
            this.a = y8rVar;
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FSMDataGroup(fsm=" + this.a + ", data=" + this.b + ")";
        }
    }

    public final class b {
        public final ResourceUiText a;
        public final String b;
        public final String c;
        public final dm8 d;
        public final wwd0 e;

        public b(ber berVar, String str, ResourceUiText resourceUiText, String str2) {
            this.a = resourceUiText;
            this.b = str2;
            String absolutePath = qlh.l(qlh.l(berVar.c, "lucky_number_show_off"), str).getAbsolutePath();
            absolutePath.getClass();
            this.c = absolutePath;
            this.d = em8.a();
            this.e = xwd0.a(y8r.b.a);
        }
    }

    public ber(vu60 vu60Var, c7k c7kVar, olh0 olh0Var, bnh0 bnh0Var, rdd0 rdd0Var, File file, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        bnh0Var.getClass();
        rdd0Var.getClass();
        file.getClass();
        this.a = olh0Var;
        this.b = rdd0Var;
        this.c = file;
        this.d = oddVar;
        wae.a aVar = wae.b;
        this.e = bnh0Var.h("/applink/lucky_numbers");
        String strA = d020.a(System.currentTimeMillis(), "simple_", ".jpeg");
        StringUiText stringUiText = vch0.a;
        b bVar = new b(this, strA, new ResourceUiText(R.string.common_functions__won_pop_up), "won_popup");
        this.f = bVar;
        b bVar2 = new b(this, d020.a(System.currentTimeMillis(), "detail_", ".jpeg"), new ResourceUiText(R.string.common_functions__ticket_snap), "ticket_snap");
        this.i = bVar2;
        List<b> listK = kotlin.collections.b.k(bVar, bVar2);
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        for (b bVar3 : listK) {
            arrayList.add(new der(bVar3.e, bVar3));
        }
        this.v = new eer((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0]));
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        lcr lcrVar = (lcr) fnf.a(vu60Var, jq40.a(lcr.class), o2gVar);
        this.w = lcrVar;
        yzh yzhVarA = c7kVar.a(lcrVar.b);
        lk50.b bVar4 = lk50.b.a;
        lyh lyhVarC = ozh.c(yzhVarA, this.d);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarC, et7VarD, kwd0Var, bVar4);
        this.y = v340VarE;
        this.z = ej5.a(o8i0.d(this), this.d, new cer(this, null), 2);
        wwd0 wwd0VarA = xwd0.a("");
        this.A = wwd0VarA;
        this.B = new ku90<>();
        l1i l1iVarB = r1i.b(this.f.e, this.i.e, new zl50(v340VarE), wwd0VarA, new fer(this, null));
        this.C = e1i.e(ozh.c(l1iVarB, this.d), o8i0.d(this), kwd0Var, new idr.a(null, null));
        ej5.c(o8i0.d(this), this.d, null, new ydr(this, null), 2);
        ej5.c(o8i0.d(this), this.d, null, new zdr(this, null), 2);
        ej5.c(o8i0.d(this), this.d, null, new aer(this, null), 2);
    }

    public final Object x1(b bVar, tje0 tje0Var) {
        String str = this.w.b;
        String str2 = bVar.c;
        String str3 = bVar.b;
        olh0 olh0Var = this.a;
        olh0Var.getClass();
        str.getClass();
        str2.getClass();
        return bm50.q(bm50.a(new mlh0(new or60(new nlh0(str2, olh0Var, str, str3, null)))), tje0Var);
    }
}
