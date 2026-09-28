package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.MyFavoriteLeague;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tww extends SimpleResponseWrapper<List<MyFavoriteLeague>> {
    public final /* synthetic */ List a;
    public final /* synthetic */ uww b;

    public tww(uww uwwVar, List list) {
        this.b = uwwVar;
        this.a = list;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        super.onFailure(th);
        this.b.a.m(new kqc());
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(List<MyFavoriteLeague> list) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.addAll(list);
        this.b.a.m(new nqc(arrayList));
    }
}
