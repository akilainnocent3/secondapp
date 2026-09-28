package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spin2win.model.response.ChatRoomResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z71 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z71(Object obj, int i) {
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
                ((ytw) obj2).setValue(Integer.valueOf((int) (((jxo) obj).a & 4294967295L)));
                return Unit.a;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = a1b0.a.a[loadingState.getStatus().ordinal()];
                String chatRoomId = null;
                boolean z = false;
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    List<ChatRoomResponse> list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                    a1b0Var.Q = list;
                    if (list != null && !list.isEmpty()) {
                        List<ChatRoomResponse> list2 = a1b0Var.Q;
                        if (list2 != null && (chatRoomResponse = list2.get(0)) != null) {
                            chatRoomId = chatRoomResponse.getChatRoomId();
                        }
                        if (chatRoomId != null && chatRoomId.length() != 0) {
                            z = true;
                        }
                    }
                    a1b0Var.F = z;
                    a1b0Var.R0();
                    FragmentManager parentFragmentManager = a1b0Var.getParentFragmentManager();
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
                    a1b0Var.F = false;
                    a1b0Var.R0();
                }
                return Unit.a;
        }
    }
}
