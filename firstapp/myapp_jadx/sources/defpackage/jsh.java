package defpackage;

import android.util.Log;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.redblack.remote.models.ChatRoomResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jsh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jsh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppCompatImageView chat;
        String chatRoomId;
        AppCompatImageView chat2;
        AppCompatImageView chat3;
        List list;
        ChatRoomResponse chatRoomResponse;
        String botUserId;
        List list2;
        ChatRoomResponse chatRoomResponse2;
        List list3;
        AppCompatImageView chat4;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j6b j6bVar = (j6b) obj;
                j6bVar.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", j6bVar);
                return new bg80(((cg80) obj2).a.a(null), null, null);
            case 1:
                ts00 ts00Var = (ts00) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ts00Var.b = OtpData.PhoneMigration.a((OtpData.PhoneMigration) ts00Var.B1(), oTPResult);
                return Unit.a;
            case 2:
                nn40 nn40Var = (nn40) obj2;
                LoadingState loadingState = (LoadingState) obj;
                boolean z = true;
                if (nn40.a.a[loadingState.getStatus().ordinal()] == 1) {
                    xo40 xo40Var = (xo40) nn40Var.b;
                    boolean z2 = (xo40Var == null || (chat4 = xo40Var.D.getChat()) == null || chat4.getVisibility() != 0) ? false : true;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (((hTTPResponse == null || (list3 = (List) hTTPResponse.getData()) == null) ? 0 : list3.size()) > 0) {
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        String str = "";
                        if (hTTPResponse2 == null || (list2 = (List) hTTPResponse2.getData()) == null || (chatRoomResponse2 = (ChatRoomResponse) list2.get(0)) == null || (chatRoomId = chatRoomResponse2.getChatRoomId()) == null) {
                            chatRoomId = "";
                        }
                        nn40Var.i = chatRoomId;
                        HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse3 != null && (list = (List) hTTPResponse3.getData()) != null && (chatRoomResponse = (ChatRoomResponse) list.get(0)) != null && (botUserId = chatRoomResponse.getBotUserId()) != null) {
                            str = botUserId;
                        }
                        nn40Var.w = str;
                        xo40 xo40Var2 = (xo40) nn40Var.b;
                        if (xo40Var2 != null && (chat3 = xo40Var2.D.getChat()) != null) {
                            chat3.setVisibility(0);
                        }
                        xo40 xo40Var3 = (xo40) nn40Var.b;
                        if (xo40Var3 != null && (chat2 = xo40Var3.D.getChat()) != null) {
                            chat2.setImageDrawable(nn40Var.requireContext().getDrawable(R.drawable.chat_rb));
                        }
                    } else {
                        xo40 xo40Var4 = (xo40) nn40Var.b;
                        if (xo40Var4 != null && (chat = xo40Var4.D.getChat()) != null) {
                            chat.setVisibility(8);
                        }
                        z = false;
                    }
                    if (z2 != z) {
                        xo40 xo40Var5 = (xo40) nn40Var.b;
                        FrameLayout frameLayout = xo40Var5 != null ? xo40Var5.P : null;
                        FragmentManager childFragmentManager = nn40Var.getChildFragmentManager();
                        childFragmentManager.getClass();
                        if (frameLayout != null && frameLayout.getVisibility() == 0 && childFragmentManager.G(R.id.onboarding_images) != null) {
                            if (yju.a("br")) {
                                nle nleVar = nn40Var.q0;
                                if (nleVar != null && !nleVar.isShowing()) {
                                    nn40Var.H0();
                                }
                            } else {
                                nn40Var.H0();
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                enc0 enc0Var = (enc0) obj;
                enc0Var.getClass();
                ((Function1) obj2).invoke(new b.u.c(enc0Var));
                return Unit.a;
        }
    }
}
