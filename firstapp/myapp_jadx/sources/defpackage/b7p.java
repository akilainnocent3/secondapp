package defpackage;

import android.view.View;
import com.sportygames.commons.components.SGHamburgerMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b7p implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7p(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c7p c7pVar = (c7p) obj2;
                ayk aykVar = (ayk) obj;
                int i2 = aykVar.c.isEmpty() ? 8 : 0;
                c7pVar.Y.setVisibility(i2);
                c7pVar.Z.setVisibility(i2);
                c7pVar.Y.setChecked(aykVar.b);
                break;
            case 1:
                SGHamburgerMenu.b bVar = (SGHamburgerMenu.b) obj2;
                int i3 = SGHamburgerMenu.M;
                ((View) obj).getClass();
                wz.a("AddMoneyClicked", bVar.h, new String[0]);
                bVar.g.invoke();
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((a1b0) obj2).t0(str);
                break;
        }
        return Unit.a;
    }
}
