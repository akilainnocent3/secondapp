package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liv20;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lj9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iv20 extends t0m implements k9j, j9j {

    public static final /* synthetic */ class a extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((yfx) this.a).k();
            return Unit.a;
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getF() {
        return iv20.class.getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final String value;
        final PrimaryPhoneConfig primaryPhoneConfig;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments == null || (value = arguments.getString("withdraw_pin_status")) == null) {
            value = SportyPinStatus.Disabled.getValue();
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (primaryPhoneConfig = (PrimaryPhoneConfig) ((Parcelable) rj5.a(arguments2, "config", PrimaryPhoneConfig.class))) == null) {
            primaryPhoneConfig = new PrimaryPhoneConfig(false, false, false, 0, false, 0, false, 0, null, 0, 1023, null);
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(25645361, new Function2() { // from class: fv20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final String str = value;
                    final ComposeView composeView2 = composeView;
                    final PrimaryPhoneConfig primaryPhoneConfig2 = primaryPhoneConfig;
                    or0.a(null, false, false, null, pp8.b(-1693665912, new Function2() { // from class: gv20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final ComposeView composeView3 = composeView2;
                                yfx yfxVarA = kjx.a(composeView3);
                                boolean zA = aVar2.A(yfxVarA);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    iv20.a aVar3 = new iv20.a(0, yfxVarA, yfx.class, "popBackStack", "popBackStack()Z", 8);
                                    aVar2.r(aVar3);
                                    objY = aVar3;
                                }
                                Function0 function0 = (Function0) objY;
                                final PrimaryPhoneConfig primaryPhoneConfig3 = primaryPhoneConfig2;
                                boolean zA2 = aVar2.A(primaryPhoneConfig3) | aVar2.A(composeView3);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function1() { // from class: hv20
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            String str2 = (String) obj5;
                                            str2.getClass();
                                            String json = sh8.b().toJson(primaryPhoneConfig3);
                                            yfx yfxVarA2 = kjx.a(composeView3);
                                            json.getClass();
                                            bs20.b(yfxVarA2, json, str2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                rv20.a(str, function0, (Function1) objY2, null, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
