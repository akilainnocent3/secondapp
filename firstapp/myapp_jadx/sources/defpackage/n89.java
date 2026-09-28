package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n89 implements iaj {
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        t2q.b bVar = (t2q.b) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        bVar.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.M(bVar) ? 32 : 16;
        }
        if (!aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            aVar.G();
        } else if (bVar instanceof t2q.a) {
            aVar.N(-1240105459);
            kyp.b((t2q.a) bVar, aVar, (iIntValue >> 3) & 14);
            aVar.H();
        } else {
            aVar.N(-1240021480);
            g75.a(j.g(d.a.b, 1.0f), aVar, 6);
            aVar.H();
        }
        return Unit.a;
    }
}
