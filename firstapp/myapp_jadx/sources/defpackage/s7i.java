package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s7i implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccountInfo accountInfo = (AccountInfo) obj;
        accountInfo.getClass();
        return new s7a0(accountInfo.getNickname(), true, accountInfo.getNicknameVerified());
    }
}
