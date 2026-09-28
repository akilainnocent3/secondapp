package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.webview.LobbyWebView;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tb6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tb6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String string = ((UUID) obj).toString();
                string.getClass();
                bbe0.b((svj0) obj2, string);
                break;
            default:
                LobbyV2HomeItemModel lobbyV2HomeItemModel = (LobbyV2HomeItemModel) obj;
                ikx ikxVar = ((LobbyWebView) obj2).navigationRouteChanged;
                if (ikxVar != null) {
                    ikxVar.a(Integer.valueOf(lobbyV2HomeItemModel.getSectionId()), lobbyV2HomeItemModel.getSectionName(), lobbyV2HomeItemModel.getKey());
                }
                break;
        }
    }
}
