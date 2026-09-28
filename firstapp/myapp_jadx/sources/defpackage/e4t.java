package defpackage;

import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e4t implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4t(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                iaj iajVar = (iaj) obj2;
                LobbyV2HomeItemModel lobbyV2HomeItemModel = (LobbyV2HomeItemModel) obj;
                if (iajVar != null) {
                    iajVar.d(Integer.valueOf(lobbyV2HomeItemModel.getSectionId()), lobbyV2HomeItemModel.getSectionName(), lobbyV2HomeItemModel.getKey(), Integer.valueOf(lobbyV2HomeItemModel.getCategoryId()));
                }
                break;
            default:
                zy10 zy10Var = (zy10) obj2;
                cgb.a(zy10Var.Y0(), zy10Var.A, "placeBet", (String) obj);
                break;
        }
        return Unit.a;
    }
}
