package defpackage;

import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pol extends py1 {
    public boolean a = false;

    public pol() {
        addOnContextAvailableListener(new ool(this));
    }

    @Override // com.sporty.android.common.base.a, defpackage.hrl
    public final void inject() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((qv7) generatedComponent()).c((CodeChatRoomActivity) this);
    }
}
