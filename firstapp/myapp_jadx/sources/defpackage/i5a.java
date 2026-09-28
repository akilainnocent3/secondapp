package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i5a implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i5a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                op8 op8Var = (op8) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((m75) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    op8Var.invoke(aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                r060 r060Var = (r060) obj4;
                int iIntValue2 = ((Integer) obj).intValue();
                String str = (String) obj2;
                djx djxVar = (djx) obj3;
                str.getClass();
                djxVar.getClass();
                int iOrdinal = (((djxVar instanceof c48) || r060Var.a.getDescriptor().i(iIntValue2)) ? r060.a.b : r060.a.a).ordinal();
                if (iOrdinal == 0) {
                    r060Var.c += '/' + zdf0.a('}', "{", str);
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    r060Var.a(str, "{" + str + '}');
                }
                return Unit.a;
        }
    }
}
