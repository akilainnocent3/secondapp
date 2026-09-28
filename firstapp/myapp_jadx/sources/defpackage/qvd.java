package defpackage;

import android.content.Intent;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.kyc.nin.NINReVerifyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qvd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qvd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                vvd vvdVar = (vvd) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    String strA = cb40.a(R.string.page_payment__ensure_payment_with_same_sporty_bet_cpf, new Object[0], aVar);
                    d.a aVar2 = d.a.b;
                    lkf0.d(strA, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_primary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar), aVar, 48, 0, 131064);
                    uvd.a(48, aVar, h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), vvdVar.c);
                } else {
                    aVar.G();
                }
                break;
            default:
                final NINReVerifyActivity nINReVerifyActivity = (NINReVerifyActivity) obj3;
                a aVar3 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = NINReVerifyActivity.d;
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zA = aVar3.A(nINReVerifyActivity);
                    Object objY = aVar3.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new Function0() { // from class: r4x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                NINReVerifyActivity nINReVerifyActivity2 = nINReVerifyActivity;
                                Intent intent = nINReVerifyActivity2.c;
                                if (intent == null) {
                                    Intrinsics.n("profileIntent");
                                    throw null;
                                }
                                nINReVerifyActivity2.startActivity(intent);
                                nINReVerifyActivity2.finish();
                                return Unit.a;
                            }
                        };
                        aVar3.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar3.A(nINReVerifyActivity);
                    Object objY2 = aVar3.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new o0o(nINReVerifyActivity, 1);
                        aVar3.r(objY2);
                    }
                    f6x.b(function0, (Function0) objY2, aVar3, 0);
                } else {
                    aVar3.G();
                }
                break;
        }
        return Unit.a;
    }
}
