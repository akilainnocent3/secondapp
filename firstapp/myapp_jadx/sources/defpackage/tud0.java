package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.DetailResponse;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.StakeSelectorWrapperComponentKt$StakeSelectorWrapperComponent$3$1$1$1$7$1", f = "StakeSelectorWrapperComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class tud0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ytw<String> c;
    public final /* synthetic */ DetailResponse d;
    public final /* synthetic */ fsw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tud0(int i, v1b v1bVar, fsw fswVar, ytw ytwVar, DetailResponse detailResponse, boolean z) {
        super(2, v1bVar);
        this.a = z;
        this.b = i;
        this.c = ytwVar;
        this.d = detailResponse;
        this.e = fswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        DetailResponse detailResponse = this.d;
        return new tud0(this.b, v1bVar, this.e, this.c, detailResponse, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tud0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        double dDoubleValue;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = this.a && this.b == 2;
        ytw<String> ytwVar = this.c;
        Double dH = b.h(ytwVar.getValue());
        DetailResponse detailResponse = this.d;
        boolean z2 = dH == null || dH.doubleValue() < detailResponse.getMinAmount() || dH.doubleValue() > detailResponse.getMaxAmount();
        if (!z) {
            if (z2) {
                dDoubleValue = dH != null ? f.c(dH.doubleValue(), detailResponse.getMinAmount(), detailResponse.getMaxAmount()) : detailResponse.getMinAmount();
            } else {
                dDoubleValue = dH.doubleValue();
            }
            this.e.t(dDoubleValue);
            ytwVar.setValue(String.format(SportyGamesManager.locale, "%.2f", Arrays.copyOf(new Object[]{new Double(dDoubleValue)}, 1)));
        }
        return Unit.a;
    }
}
