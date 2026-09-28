package defpackage;

import com.sportygames.commons.views.MainActivity;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cku implements bn80.a {
    public final /* synthetic */ MainActivity a;

    public cku(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // bn80.a
    public final void a(xc xcVar) {
        MainActivity mainActivity = this.a;
        ttr ttrVar = mainActivity.c;
        xcVar.getClass();
        if (xcVar.equals(xc.b.a)) {
            List<String> list = MainActivity.R;
            ((l1z) ttrVar.getValue()).e(mainActivity.f, mainActivity.i);
        } else if (!xcVar.equals(xc.a.a)) {
            uhc.a();
        } else {
            List<String> list2 = MainActivity.R;
            ((l1z) ttrVar.getValue()).d(mainActivity.f, mainActivity.i);
        }
    }
}
