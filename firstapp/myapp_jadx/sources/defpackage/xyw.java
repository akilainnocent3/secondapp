package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xyw extends SimpleResponseWrapper<List<MyFavoriteTeam>> {
    public final /* synthetic */ yyw a;

    public xyw(yyw yywVar) {
        this.a = yywVar;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        super.onFailure(th);
        this.a.b.m(new kqc());
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(List<MyFavoriteTeam> list) {
        this.a.b.m(new nqc(list));
    }
}
