package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.SimpleConverterResponseWrapper;
import com.sportybet.plugin.realsports.data.LobbyItem;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class luj extends SimpleConverterResponseWrapper<Object, List<LobbyItem>> {
    public final /* synthetic */ c1.b a;
    public final /* synthetic */ muj b;

    public luj(muj mujVar, c1.b bVar) {
        this.b = mujVar;
        this.a = bVar;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final List<LobbyItem> convert(bcp bcpVar) {
        if (bcpVar != null) {
            try {
                return this.b.a(new JSONArray(dc8.f(0, bcpVar, null)));
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.p(e, "Failed to create lobby items", new Object[0]);
            }
        }
        return null;
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final String getIdentifier() {
        return muj.class.getSimpleName();
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        this.a.a();
    }

    @Override // com.sportybet.android.data.SimpleConverterResponseWrapper
    public final void onSuccessData(List<LobbyItem> list) {
        boolean zContains;
        List<LobbyItem> list2 = list;
        c1.b bVar = this.a;
        if (list2 == null || list2.isEmpty()) {
            bVar.a();
            return;
        }
        c1 c1Var = c1.this;
        String strA = o7d.a(wae.LIVE_GAME);
        strA.getClass();
        HashSet<String> hashSet = c1.F;
        ssw<Boolean> sswVar = c1Var.i;
        try {
            zContains = c1.F.contains(Uri.parse(strA).getHost());
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e, "Failed to check link %s", strA);
            zContains = false;
        }
        if (zContains) {
            String strA2 = o7d.a(wae.LIVE_GAME);
            strA2.getClass();
            try {
                Uri uri = Uri.parse(strA2);
                uri.getClass();
                for (LobbyItem lobbyItem : list2) {
                    try {
                        if (TextUtils.equals(uri.getHost(), Uri.parse(lobbyItem.action).getHost())) {
                        }
                    } catch (Exception e2) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_COMMON);
                        aVar2.p(e2, "Failed to check lobby item %s", lobbyItem);
                    }
                }
            } catch (Exception unused) {
            }
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CONFIG);
            aVar3.a("live games is disable in Games Lobby: %s", o7d.a(wae.LIVE_GAME));
            sswVar.m(Boolean.FALSE);
            return;
        }
        sswVar.m(Boolean.TRUE);
    }
}
