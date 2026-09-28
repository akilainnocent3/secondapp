package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class p4v {
    public static final void a(ComposeView composeView, final String str, final lyh<? extends qcn<? extends Outcome>> lyhVar, final ihy ihyVar, final ajy ajyVar, final Function1<? super a5o, Unit> function1) {
        str.getClass();
        lyhVar.getClass();
        ihyVar.getClass();
        ajyVar.getClass();
        composeView.setContent(new op8(573807171, new Function2() { // from class: n4v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final lyh lyhVar2 = lyhVar;
                    final String str2 = str;
                    final ihy ihyVar2 = ihyVar;
                    final ajy ajyVar2 = ajyVar;
                    final Function1 function2 = function1;
                    o0z.a(null, null, null, null, null, pp8.b(-2084581966, new Function2() { // from class: o4v
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                rho.a(str2, (qcn) n95.a(lyhVar2, n1a0.c, null, aVar2, 48, 2).getValue(), ihyVar2, ajyVar2, null, function2, aVar2, 4096);
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
    }
}
