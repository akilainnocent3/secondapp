package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a0r implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0r(hsq hsqVar, twd0 twd0Var, Function0 function0, int i) {
        this.b = hsqVar;
        this.c = twd0Var;
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
                ((Integer) obj2).getClass();
                f0r.g((hsq) obj5, (twd0) obj4, (Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final hl80 hl80Var = (hl80) obj5;
                final Uri uri = (Uri) obj4;
                final Bundle bundle = (Bundle) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = hl80.N;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1913345334, new Function2() { // from class: vk80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            a aVar2 = (a) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            ohp<Object>[] ohpVarArr2 = hl80.N;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final hl80 hl80Var2 = hl80Var;
                                boolean zA = aVar2.A(hl80Var2);
                                final Uri uri2 = uri;
                                boolean zA2 = zA | aVar2.A(uri2);
                                final Bundle bundle2 = bundle;
                                boolean zA3 = zA2 | aVar2.A(bundle2);
                                Object objY = aVar2.y();
                                if (zA3 || objY == a.C0041a.a) {
                                    objY = new Function0() { // from class: xk80
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            azm azmVar = hl80Var2.B;
                                            if (azmVar != null) {
                                                azmVar.l(uri2, bundle2);
                                                return Unit.a;
                                            }
                                            Intrinsics.n("router");
                                            throw null;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                ck80.a(0, aVar2, null, (Function0) objY);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a0r(hl80 hl80Var, Uri uri, Bundle bundle) {
        this.b = hl80Var;
        this.c = uri;
        this.d = bundle;
    }
}
