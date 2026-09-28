package defpackage;

import android.view.View;
import com.sportygames.commons.SportyGamesManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ssg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ssg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() + ":" + ((ko70) entry.getValue()).a;
            default:
                ((View) obj).getClass();
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                return Unit.a;
        }
    }
}
