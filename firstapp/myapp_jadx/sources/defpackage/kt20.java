package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkt20;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lj9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kt20 extends r0m implements k9j, j9j {

    public static final /* synthetic */ class a extends pf implements Function2<String, String, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            yfx yfxVar = (yfx) this.a;
            zix zixVarA = bjx.a(new r8a(1, new kkx()));
            yfxVar.getClass();
            yfx.i(yfxVar, lx5.a("primary_phone_new_phone_verification_route/", str3, "/", str4), zixVarA, 4);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends pf implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            bs20.a((yfx) this.a);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function2<String, Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Boolean bool) {
            String str2 = str;
            Boolean bool2 = bool;
            kt20 kt20Var = (kt20) this.receiver;
            kt20Var.getClass();
            if (str2 == null || bool2 == null) {
                NavHostFragment.a.a(kt20Var).k();
            } else {
                yfx.m(NavHostFragment.a.a(kt20Var), str2, bool2.booleanValue());
            }
            return Unit.a;
        }
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName */
    public final String getP() {
        return kt20.class.getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final PrimaryPhoneConfig primaryPhoneConfig;
        String string;
        List listSplit$default;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        final String strA0 = (arguments == null || (string = arguments.getString("verify_identity_token", "")) == null || (listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{","}, false, 0, 6, null)) == null) ? null : CollectionsKt.a0(listSplit$default, "/", null, null, null, 62);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (primaryPhoneConfig = (PrimaryPhoneConfig) ((Parcelable) rj5.a(arguments2, "config", PrimaryPhoneConfig.class))) == null) {
            primaryPhoneConfig = new PrimaryPhoneConfig(false, false, false, 0, false, 0, false, 0, null, 0, 1023, null);
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(-1723724716, new Function2() { // from class: it20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final kt20 kt20Var = this.a;
                    final PrimaryPhoneConfig primaryPhoneConfig2 = primaryPhoneConfig;
                    final String str = strA0;
                    or0.a(null, false, false, null, pp8.b(-1702716963, new Function2() { // from class: jt20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                kt20 kt20Var2 = kt20Var;
                                yfx yfxVarA = NavHostFragment.a.a(kt20Var2);
                                boolean zA = aVar2.A(yfxVarA);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    kt20.a aVar3 = new kt20.a(2, yfxVarA, bs20.class, "navigateToPrimaryPhoneNewPhoneVerificationScreen", "navigateToPrimaryPhoneNewPhoneVerificationScreen(Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavOptions;)V", 1);
                                    aVar2.r(aVar3);
                                    objY = aVar3;
                                }
                                Function2 function2 = (Function2) objY;
                                yfx yfxVarA2 = NavHostFragment.a.a(kt20Var2);
                                boolean zA2 = aVar2.A(yfxVarA2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    kt20.b bVar = new kt20.b(0, yfxVarA2, bs20.class, "navigateToPrimaryPhoneUpdatedSuccessfullyScreen", "navigateToPrimaryPhoneUpdatedSuccessfullyScreen(Landroidx/navigation/NavController;Landroidx/navigation/NavOptions;)V", 1);
                                    aVar2.r(bVar);
                                    objY2 = bVar;
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA3 = aVar2.A(kt20Var2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    kt20.c cVar = new kt20.c(2, kt20Var2, kt20.class, "onBack", "onBack(Ljava/lang/String;Ljava/lang/Boolean;)V", 0);
                                    aVar2.r(cVar);
                                    objY3 = cVar;
                                }
                                bu20.a(primaryPhoneConfig2, str, (Function2) ((chp) objY3), function2, function0, null, aVar2, 0);
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
