package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.book.presentation.sportsmenu.time.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vw9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            b.a(0, aVar);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
