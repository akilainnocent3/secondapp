package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.feature.gift.gift.presentation.i;
import com.sportybet.feature.gift.gift.presentation.k;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$observeAssetsInfo$1", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xyk extends tje0 implements Function2<AssetsInfo, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyk(k kVar, v1b<? super xyk> v1bVar) {
        super(2, v1bVar);
        this.b = kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xyk xykVar = new xyk(this.b, v1bVar);
        xykVar.a = obj;
        return xykVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetsInfo assetsInfo, v1b<? super Unit> v1bVar) {
        return ((xyk) create(assetsInfo, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        AssetsInfo assetsInfo = (AssetsInfo) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.H;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, i.a((i) value, null, null, null, null, null, null, null, null, 0, bjb0.U(assetsInfo.validGiftAmount, Locale.US), assetsInfo.validGiftAmount > 0, false, 2559)));
        return Unit.a;
    }
}
