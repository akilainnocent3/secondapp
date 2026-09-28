package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sb9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.b(erz.a(R.drawable.ic_delete_bucket, 0, aVar), cb40.a(R.string.component_assign_custom_code__delete_custom_code, new Object[0], aVar), j.r(d.a.b, 20.0f), c68.a(R.color.text_primary, aVar), aVar, 384, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
