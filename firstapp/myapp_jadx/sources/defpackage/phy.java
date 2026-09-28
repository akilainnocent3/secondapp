package defpackage;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spindabottle.remote.models.ChatRoomResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class phy implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ phy(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppCompatImageView chat;
        String chatRoomId;
        AppCompatImageView chat2;
        List list;
        ChatRoomResponse chatRoomResponse;
        String botUserId;
        List list2;
        ChatRoomResponse chatRoomResponse2;
        List list3;
        AppCompatImageView chat3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                IntRange intRange = (IntRange) obj;
                intRange.getClass();
                ((ytw) obj2).setValue(intRange);
                break;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                LoadingState loadingState = (LoadingState) obj;
                boolean z = true;
                if (b8b0.a.a[loadingState.getStatus().ordinal()] == 1) {
                    dcb0 dcb0Var = (dcb0) b8b0Var.b;
                    boolean z2 = (dcb0Var == null || (chat3 = dcb0Var.C.getChat()) == null || chat3.getVisibility() != 0) ? false : true;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (((hTTPResponse == null || (list3 = (List) hTTPResponse.getData()) == null) ? 0 : list3.size()) > 0) {
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        String str = "";
                        if (hTTPResponse2 == null || (list2 = (List) hTTPResponse2.getData()) == null || (chatRoomResponse2 = (ChatRoomResponse) list2.get(0)) == null || (chatRoomId = chatRoomResponse2.getChatRoomId()) == null) {
                            chatRoomId = "";
                        }
                        b8b0Var.i = chatRoomId;
                        HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse3 != null && (list = (List) hTTPResponse3.getData()) != null && (chatRoomResponse = (ChatRoomResponse) list.get(0)) != null && (botUserId = chatRoomResponse.getBotUserId()) != null) {
                            str = botUserId;
                        }
                        b8b0Var.v = str;
                        dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                        if (dcb0Var2 != null && (chat2 = dcb0Var2.C.getChat()) != null) {
                            chat2.setVisibility(0);
                        }
                        FragmentManager parentFragmentManager = b8b0Var.getParentFragmentManager();
                        parentFragmentManager.getClass();
                        Fragment fragmentH = parentFragmentManager.H("Chat");
                        if (fragmentH != null) {
                            a aVar = new a(parentFragmentManager);
                            aVar.p(fragmentH);
                            aVar.d();
                        }
                    } else {
                        dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
                        if (dcb0Var3 != null && (chat = dcb0Var3.C.getChat()) != null) {
                            chat.setVisibility(8);
                        }
                        z = false;
                    }
                    if (z2 != z) {
                        dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                        FrameLayout frameLayout = dcb0Var4 != null ? dcb0Var4.J : null;
                        FragmentManager childFragmentManager = b8b0Var.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (frameLayout != null && frameLayout.getVisibility() == 0 && childFragmentManager.G(R.id.onboarding_images) != null) {
                            if (yju.a("br")) {
                                nle nleVar = b8b0Var.u0;
                                if (nleVar != null && !nleVar.isShowing()) {
                                    b8b0Var.D0();
                                }
                            } else {
                                b8b0Var.D0();
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
