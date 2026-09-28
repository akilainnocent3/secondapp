package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zq8 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ zq8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_share_svg, 0, aVar), null, null, c68.a(R.color.brand_tertiary, aVar), aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                tsq tsqVar = (tsq) obj;
                tsq tsqVar2 = (tsq) obj2;
                tsqVar.getClass();
                tsqVar2.getClass();
                return Boolean.valueOf(Intrinsics.g(tsqVar.a, tsqVar2.a));
        }
    }
}
