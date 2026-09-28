package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rt9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ rt9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, st9.b, aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                kl00 kl00Var = (kl00) obj;
                bv7 bv7Var = (bv7) obj2;
                kl00Var.getClass();
                bv7Var.getClass();
                return kl00.a(kl00Var, null, null, null, bv7Var, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        }
    }
}
