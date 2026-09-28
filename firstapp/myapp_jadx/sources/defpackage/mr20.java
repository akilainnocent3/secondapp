package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mr20 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mr20(d dVar, WithdrawConfirmation withdrawConfirmation, Function0 function0, int i) {
        this.b = dVar;
        this.c = withdrawConfirmation;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                final PrimaryPhoneConfig primaryPhoneConfig = (PrimaryPhoneConfig) obj5;
                ComposeView composeView = (ComposeView) obj4;
                final or20 or20Var = (or20) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yfx yfxVarA = kjx.a(composeView);
                    boolean zA = aVar.A(yfxVarA);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        or20.a aVar2 = new or20.a(0, yfxVarA, yfx.class, "popBackStack", "popBackStack()Z", 8);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(or20Var) | aVar.A(primaryPhoneConfig);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: nr20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                String str = (String) obj6;
                                str.getClass();
                                JsonSerializeService jsonSerializeServiceB = sh8.b();
                                PrimaryPhoneConfig primaryPhoneConfig2 = primaryPhoneConfig;
                                String json = jsonSerializeServiceB.toJson(primaryPhoneConfig2);
                                boolean authenticationEnabled = primaryPhoneConfig2.getAuthenticationEnabled();
                                or20 or20Var2 = or20Var;
                                if (authenticationEnabled) {
                                    yfx yfxVarA2 = NavHostFragment.a.a(or20Var2);
                                    json.getClass();
                                    zix zixVarA = bjx.a(new r8a(1, new kkx()));
                                    yfxVarA2.getClass();
                                    yfx.i(yfxVarA2, lx5.a("primary_phone_verify_identity_route/", str, "/", json), zixVarA, 4);
                                } else {
                                    yfx yfxVarA3 = NavHostFragment.a.a(or20Var2);
                                    json.getClass();
                                    bs20.b(yfxVarA3, json, null);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    xr20.a(primaryPhoneConfig, function0, (Function1) objY2, null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                wlj0.c((d) obj5, (WithdrawConfirmation) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mr20(PrimaryPhoneConfig primaryPhoneConfig, ComposeView composeView, or20 or20Var) {
        this.b = primaryPhoneConfig;
        this.c = composeView;
        this.d = or20Var;
    }
}
