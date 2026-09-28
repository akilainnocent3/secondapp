package defpackage;

import android.view.View;
import com.sportygames.commons.components.SGHamburgerMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class etj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ etj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fuj fujVar = (fuj) obj2;
                bbs bbsVar = (bbs) obj;
                bbsVar.getClass();
                bbs.a aVar = bbsVar.a;
                fujVar.A = aVar == bbs.a.a;
                ssw<bbs.a> sswVar = fujVar.e;
                int i2 = fuj.a.a[aVar.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                    sswVar.j(aVar);
                } else {
                    sswVar.j(bbs.a.c);
                }
                break;
            case 1:
                ca20.b bVar = (ca20.b) obj;
                bVar.getClass();
                ((ca20) obj2).e = bVar;
                break;
            default:
                int i3 = SGHamburgerMenu.M;
                ((View) obj).getClass();
                Function0<Unit> function0 = ((SGHamburgerMenu.b) obj2).i;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
