package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$state$1", f = "LNShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fer extends tje0 implements jaj<y8r, y8r, f0q, String, v1b<? super idr>, Object> {
    public /* synthetic */ y8r a;
    public /* synthetic */ y8r b;
    public /* synthetic */ f0q c;
    public /* synthetic */ String d;
    public final /* synthetic */ ber e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fer(ber berVar, v1b<? super fer> v1bVar) {
        super(5, v1bVar);
        this.e = berVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ResourceUiText resourceUiText;
        a9r.b bVar;
        a9r.b bVar2;
        String str;
        y8r y8rVar = this.a;
        y8r y8rVar2 = this.b;
        f0q f0qVar = this.c;
        String str2 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ber berVar = this.e;
        ber.b bVar3 = berVar.f;
        ber.b bVar4 = berVar.i;
        lcr lcrVar = berVar.w;
        String str3 = lcrVar.c;
        String str4 = lcrVar.a;
        String str5 = berVar.e;
        str5.getClass();
        y8rVar.getClass();
        y8rVar2.getClass();
        str2.getClass();
        bVar3.getClass();
        String str6 = bVar3.c;
        bVar4.getClass();
        String str7 = bVar4.c;
        str4.getClass();
        d5q d5qVar = null;
        Object obj2 = null;
        d5qVar = null;
        y8r.a aVar = y8rVar instanceof y8r.a ? (y8r.a) y8rVar : null;
        y8r.a aVar2 = y8rVar2 instanceof y8r.a ? (y8r.a) y8rVar2 : null;
        int i = 1;
        if (aVar != null && aVar2 != null) {
            a9r a9rVar = aVar.a;
            a9r.a aVar3 = a9r.a.a;
            if (Intrinsics.g(a9rVar, aVar3)) {
                bVar = null;
            } else {
                if (!(a9rVar instanceof a9r.b)) {
                    uhc.a();
                    return null;
                }
                bVar = (a9r.b) a9rVar;
            }
            x8r x8rVarA = bVar != null ? z8r.a(bVar, str6, str2, bVar3.a) : null;
            a9r a9rVar2 = aVar2.a;
            if (Intrinsics.g(a9rVar2, aVar3)) {
                bVar2 = null;
            } else {
                if (!(a9rVar2 instanceof a9r.b)) {
                    uhc.a();
                    return null;
                }
                bVar2 = (a9r.b) a9rVar2;
            }
            uf00 uf00VarF = a4h.f(ay0.v(new x8r[]{x8rVarA, bVar2 != null ? z8r.a(bVar2, str7, str2, bVar4.a) : null}));
            for (Object obj3 : uf00VarF) {
                if (((x8r) obj3).d) {
                    obj2 = obj3;
                    break;
                }
            }
            x8r x8rVar = (x8r) obj2;
            if (x8rVar != null && (str = x8rVar.c) != null) {
                str5 = str;
            }
            return new idr.b(uf00VarF, str5, uf00VarF.size() > 1);
        }
        y8r.d dVar = y8r.d.a;
        her herVar = y8rVar.equals(dVar) ? new her(str3, str4, str6) : null;
        if (f0qVar != null) {
            if (!y8rVar2.equals(dVar)) {
                f0qVar = null;
            }
            if (f0qVar != null) {
                str7.getClass();
                Date date = new Date(f0qVar.k);
                Locale locale = Locale.US;
                locale.getClass();
                String strL = bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0);
                String strA = ukd0.a(2, f0qVar.e, true, true);
                String strA2 = ukd0.a(2, f0qVar.g, true, true);
                qcn<v2q> qcnVar = f0qVar.m;
                ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                for (v2q v2qVar : qcnVar) {
                    String str8 = v2qVar.d;
                    String str9 = v2qVar.f;
                    Date date2 = new Date(v2qVar.l);
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    String strL2 = bwf0.l(date2, "dd-MM-yyyy HH:mm", locale2, 2, 0);
                    i = 1;
                    arrayList.add(new kcr(v2qVar.k.b, str8, str9, strL2, ukd0.a(2, v2qVar.i, true, true).concat("x")));
                    qcnVar = qcnVar;
                }
                uf00 uf00VarF2 = a4h.f(arrayList);
                if (qcnVar.size() > i) {
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.bet_history__multiple);
                } else {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.bet_history__single);
                }
                d5qVar = new d5q(strL, resourceUiText, f0qVar.b, strA, strA2, f0qVar.c, uf00VarF2, str7);
            }
        }
        return new idr.a(herVar, d5qVar);
    }

    @Override // defpackage.jaj
    public final Object l(y8r y8rVar, y8r y8rVar2, f0q f0qVar, String str, v1b<? super idr> v1bVar) {
        fer ferVar = new fer(this.e, v1bVar);
        ferVar.a = y8rVar;
        ferVar.b = y8rVar2;
        ferVar.c = f0qVar;
        ferVar.d = str;
        return ferVar.invokeSuspend(Unit.a);
    }
}
