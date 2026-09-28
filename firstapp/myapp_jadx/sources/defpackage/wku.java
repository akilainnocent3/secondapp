package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$getSportyBetConfigs$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wku extends tje0 implements Function2<BOConfigValueBundle, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ oku b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wku(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.b = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wku wkuVar = new wku(v1bVar, this.b);
        wkuVar.a = obj;
        return wkuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BOConfigValueBundle bOConfigValueBundle, v1b<? super Unit> v1bVar) {
        return ((wku) create(bOConfigValueBundle, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        for (BOConfigValueWrapper bOConfigValueWrapper : bOConfigValueBundle.getBoConfigValueWrappers()) {
            String configKey = bOConfigValueWrapper.getConfigKey();
            if (Intrinsics.g(configKey, BOConfigParam.GoogleAnalyticsEventFireByBackend.getConfigKey())) {
                vn20.g("sportybet", "google_analytics.event.fire_by_backend", bOConfigValueWrapper.configValueAsBool(false), true);
            } else if (Intrinsics.g(configKey, BOConfigParam.BetBuilderSupportedBetTypes.getConfigKey())) {
                Object configValue = bOConfigValueWrapper.getConfigValue();
                if (configValue != null) {
                    String[] strArr = (String[]) (configValue instanceof String[] ? configValue : null);
                    if (strArr != null) {
                        vn20.i("sportybet", "bet_builder_supported_bet_types", ay0.G(strArr, ",", null, null, null, 62), true);
                    }
                }
            } else if (Intrinsics.g(configKey, BOConfigParam.EarlyPayoutConfig.getConfigKey())) {
                Object configValue2 = bOConfigValueWrapper.getConfigValue();
                this.b.H.f((EarlyPayoutConfigModel) (configValue2 instanceof EarlyPayoutConfigModel ? configValue2 : null));
            }
        }
        return Unit.a;
    }
}
