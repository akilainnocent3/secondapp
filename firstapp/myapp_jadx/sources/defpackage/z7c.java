package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.payday.presentation.PaydayGiftBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z7c implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z7c(d dVar, int i) {
        this.a = 1;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d.a aVar2 = d.a.b;
                    d dVarG = j.g(aVar2, 1.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar, 48);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = c.c(aVar, dVarG);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    lkf0.d(str, h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.brand_secondary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, aVar), aVar, 48, 0, 130040);
                    lkf0.d(cb40.a(R.string.page_custom_codes__confirm_delete_alias_name_message, new Object[0], aVar), h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(21.0f, aVar), 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 48, 0, 127992);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                xav.b((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                PaydayGiftBottomSheetActivity paydayGiftBottomSheetActivity = (PaydayGiftBottomSheetActivity) obj3;
                a aVar4 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = PaydayGiftBottomSheetActivity.c;
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zA = aVar4.A(paydayGiftBottomSheetActivity);
                    Object objY = aVar4.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new v400(paydayGiftBottomSheetActivity, 0);
                        aVar4.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar4.A(paydayGiftBottomSheetActivity);
                    Object objY2 = aVar4.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new PaydayGiftBottomSheetActivity.a(0, paydayGiftBottomSheetActivity, PaydayGiftBottomSheetActivity.class, "finish", "finish()V", 0);
                        aVar4.r(objY2);
                    }
                    g500.b(null, function0, (Function0) ((chp) objY2), aVar4, 0);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ z7c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
