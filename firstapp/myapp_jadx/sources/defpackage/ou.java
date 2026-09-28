package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lou;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ou extends vll {
    public azm f;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Serializable serializable;
        layoutInflater.getClass();
        Bundle bundleRequireArguments = requireArguments();
        bundleRequireArguments.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            serializable = rj5.a.c(bundleRequireArguments);
        } else {
            serializable = bundleRequireArguments.getSerializable("payment_type");
            if (!ga00.class.isInstance(serializable)) {
                serializable = null;
            }
        }
        serializable.getClass();
        final ga00 ga00Var = (ga00) serializable;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(93360943, new Function2() { // from class: lu
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ga00 ga00Var2 = ga00Var;
                    final ou ouVar = this;
                    o0z.a(null, null, null, null, null, pp8.b(-1075448480, new Function2() { // from class: mu
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final ou ouVar2 = ouVar;
                                boolean zA = aVar2.A(ouVar2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new Function0() { // from class: nu
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            azm azmVar = ouVar2.f;
                                            if (azmVar != null) {
                                                azmVar.d(wae.VERIFY_PHONE_NUMBER_TO_CLAIM_BONUS);
                                                return Unit.a;
                                            }
                                            Intrinsics.n("router");
                                            throw null;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                kv.b(null, ga00Var2, (Function0) objY, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
