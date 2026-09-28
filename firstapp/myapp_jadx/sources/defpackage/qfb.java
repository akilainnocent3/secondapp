package defpackage;

import android.graphics.drawable.Icon;
import androidx.compose.runtime.a;
import com.sportygames.commons.models.enums.PagingFetchType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qfb implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qfb(fgb fgbVar, String str) {
        this.b = fgbVar;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ((fgb) obj4).T0().x1(iIntValue, iIntValue2, PagingFetchType.VIEW_MORE, (String) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                ((hef0) obj4).b((Icon) obj3, (a) obj, qj40.a(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qfb(hef0 hef0Var, Icon icon, int i) {
        this.b = hef0Var;
        this.c = icon;
    }
}
