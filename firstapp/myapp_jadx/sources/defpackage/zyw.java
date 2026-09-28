package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zyw extends SimpleResponseWrapper<List<MyFavoriteTeam>> {
    public final /* synthetic */ azw a;

    public zyw(azw azwVar) {
        this.a = azwVar;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        super.onFailure(th);
        this.a.a.m(new kqc());
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(List<MyFavoriteTeam> list) {
        this.a.a.m(new nqc(list));
    }
}
