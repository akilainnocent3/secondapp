package defpackage;

import com.sporty.android.core.model.PaydayPromoModalVariantDomain;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e500 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j500 j500Var = (j500) this.receiver;
        j500Var.e = true;
        t400 t400Var = j500Var.a;
        PaydayPromoModalVariantDomain variant = j500Var.d.getVariant();
        t400Var.getClass();
        variant.getClass();
        t400Var.b.a(new p500.b(variant.getValue()), k00.d);
        return Unit.a;
    }
}
