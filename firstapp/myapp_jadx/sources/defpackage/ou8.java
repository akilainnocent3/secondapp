package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ou8 implements gaj {
    public final /* synthetic */ int a;

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    y27.b(48, aVar, j.g(d.a.b, 1.0f), cb40.a(R.string.page_loyalty__challenge_terms_content, new Object[0], aVar));
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                d dVar = (d) obj;
                a aVar2 = (a) obj2;
                e3w.a((Integer) obj3, dVar, aVar2, -361235460);
                d dVarJ = h.j(dVar, 0.0f, 0.0f, ((cjb0) aVar2.O(ejb0.a)).f, 0.0f, 11);
                aVar2.H();
                return dVarJ;
        }
    }
}
