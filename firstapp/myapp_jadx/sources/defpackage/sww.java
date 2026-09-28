package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.MyFavoriteLeague;
import com.sportybet.plugin.realsports.data.PostSportId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sww extends SimpleResponseWrapper<List<MyFavoriteLeague>> {
    public final /* synthetic */ PostSportId a;
    public final /* synthetic */ uww b;

    public sww(uww uwwVar, PostSportId postSportId) {
        this.b = uwwVar;
        this.a = postSportId;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        super.onFailure(th);
        ArrayList arrayList = new ArrayList();
        uww uwwVar = this.b;
        uwwVar.getClass();
        ap0.b().A(this.a).G(new tww(uwwVar, arrayList));
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(List<MyFavoriteLeague> list) {
        List<MyFavoriteLeague> list2 = list;
        Iterator<MyFavoriteLeague> it = list2.iterator();
        while (it.hasNext()) {
            it.next().isTopLeague = true;
        }
        uww uwwVar = this.b;
        uwwVar.getClass();
        ap0.b().A(this.a).G(new tww(uwwVar, list2));
    }
}
