package defpackage;

import com.sporty.android.core.model.PaydayPromoModalVariantDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d500 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j500 j500Var = (j500) this.receiver;
        t400 t400Var = j500Var.a;
        PaydayPromoModalVariantDomain variant = j500Var.d.getVariant();
        t400Var.getClass();
        variant.getClass();
        t400Var.a.a("payday_modal_cta_click");
        t400Var.b.a(new p500.c(variant.getValue()), k00.d);
        j500Var.x1(h500.a.a);
        return Unit.a;
    }
}
