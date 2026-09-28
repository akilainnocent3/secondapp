package defpackage;

import android.view.KeyEvent;
import android.widget.EditText;
import com.sportybet.android.instantwin.presentation.ticket.round.RoundTicketsDetailAdapter;
import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ov7 implements hsx.c, RoundTicketsDetailAdapter.a {
    public final /* synthetic */ KeyEvent.Callback a;

    public /* synthetic */ ov7(KeyEvent.Callback callback) {
        this.a = callback;
    }

    @Override // hsx.c
    public void onDismiss() {
        EditText editText;
        final CodeChatRoomActivity codeChatRoomActivity = (CodeChatRoomActivity) this.a;
        int i = CodeChatRoomActivity.f;
        codeChatRoomActivity.B1();
        hsx hsxVar = codeChatRoomActivity.c;
        if (hsxVar == null || (editText = hsxVar.i) == null) {
            return;
        }
        editText.postDelayed(new Runnable() { // from class: pv7
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText2;
                hsx hsxVar2 = codeChatRoomActivity.c;
                if (hsxVar2 == null || (editText2 = hsxVar2.i) == null) {
                    return;
                }
                lop.b(editText2, Boolean.FALSE);
            }
        }, 50L);
    }
}
