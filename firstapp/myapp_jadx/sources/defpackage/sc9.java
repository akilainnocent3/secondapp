package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc9 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_action_bar_back, 0, aVar), dLRYz.CYEkazUXvfHqO, null, c68.a(R.color.text_type2_primary, aVar), aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                y3d.b bVar = (y3d.b) obj;
                y3d.b.a aVar2 = (y3d.b.a) obj2;
                bVar.getClass();
                aVar2.getClass();
                return y3d.b.a(bVar, aVar2, null, 2);
        }
    }
}
