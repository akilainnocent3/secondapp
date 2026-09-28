package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.rush.model.response.ChatRoomResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qp0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChatRoomResponse chatRoomResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((a7l) obj).b(((Number) ((Function0) obj2).invoke()).floatValue());
                return Unit.a;
            default:
                l560 l560Var = (l560) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = l560.b.a[loadingState.getStatus().ordinal()];
                String chatRoomId = null;
                boolean z = false;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    List<ChatRoomResponse> list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                    l560Var.V = list;
                    if (list == null || !list.isEmpty()) {
                        List<ChatRoomResponse> list2 = l560Var.V;
                        if (list2 != null && (chatRoomResponse = list2.get(0)) != null) {
                            chatRoomId = chatRoomResponse.getChatRoomId();
                        }
                        if (chatRoomId != null && chatRoomId.length() != 0) {
                            z = true;
                        }
                    }
                    l560Var.D = z;
                    l560Var.j1();
                    FragmentManager parentFragmentManager = l560Var.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    Fragment fragmentH = parentFragmentManager.H("Chat");
                    if (fragmentH != null) {
                        a aVar = new a(parentFragmentManager);
                        aVar.p(fragmentH);
                        aVar.d();
                    }
                } else {
                    if (i2 != 2 && i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    l560Var.D = false;
                    l560Var.j1();
                }
                return Unit.a;
        }
    }
}
