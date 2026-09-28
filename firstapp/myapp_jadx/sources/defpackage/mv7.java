package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.tasks.OnFailureListener;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mv7 implements tit, OnFailureListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ mv7(c6l c6lVar, au90.a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        au90.a aVar = (au90.a) this.a;
        exc.getClass();
        c6l.e("recaptcha_ent_token_failed_android", exc);
        iu90.b(aVar, new CaptchaError.CaptchaNeedRetry(null, 1, null));
    }

    @Override // defpackage.tit
    public void w(Account account, boolean z) {
        CodeChatRoomActivity codeChatRoomActivity = (CodeChatRoomActivity) this.a;
        int i = CodeChatRoomActivity.f;
        if (account != null) {
            codeChatRoomActivity.saveDataBeforeRecreate();
            Intent intent = new Intent(codeChatRoomActivity, (Class<?>) ChooseBetActivity.class);
            intent.putExtra("key_come_from", 1);
            codeChatRoomActivity.startActivityForResult(intent, 1);
        }
    }

    public /* synthetic */ mv7(CodeChatRoomActivity codeChatRoomActivity) {
        this.a = codeChatRoomActivity;
    }
}
