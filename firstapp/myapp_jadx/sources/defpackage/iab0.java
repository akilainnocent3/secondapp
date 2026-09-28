package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spinmatch.model.response.ChatRoomResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iab0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iab0(Object obj, int i) {
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
                kab0 kab0Var = (kab0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = kab0.a.a[loadingState.getStatus().ordinal()];
                String chatRoomId = null;
                boolean z = false;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    List<ChatRoomResponse> list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                    kab0Var.W = list;
                    if (list != null && !list.isEmpty()) {
                        List<ChatRoomResponse> list2 = kab0Var.W;
                        if (list2 != null && (chatRoomResponse = list2.get(0)) != null) {
                            chatRoomId = chatRoomResponse.getChatRoomId();
                        }
                        if (chatRoomId != null && chatRoomId.length() != 0) {
                            z = true;
                        }
                    }
                    kab0Var.X = z;
                    kab0Var.L0();
                    FragmentManager parentFragmentManager = kab0Var.getParentFragmentManager();
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
                    kab0Var.X = false;
                    kab0Var.L0();
                }
                return Unit.a;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((mjj0) obj2).Q1(ijf0Var);
                return Unit.a;
        }
    }
}
