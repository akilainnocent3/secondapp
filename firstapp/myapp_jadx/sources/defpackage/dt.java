package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.remote.entity.AliasCodeCreation;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import com.sportybet.android.social.data.remote.entity.AliasCodeRemoveRequest;
import com.sportybet.android.social.data.remote.entity.AliasCodeRenameRequest;
import com.sportybet.android.social.data.remote.entity.AliasRootCode;
import com.sportybet.android.social.data.remote.entity.AliasRootCodeReplaceRequest;
import com.sportybet.android.social.data.remote.entity.AliasRootCodeResetRequest;
import com.twilio.voice.Constants;
import com.twilio.voice.VoiceURLConnection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Ldt;", "", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/social/data/remote/entity/AliasCodeList;", "g", "(Lv1b;)Ljava/lang/Object;", "Let;", "h", "", "aliasName", "Lcom/sportybet/android/social/data/remote/entity/AliasRootCode;", "a", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/social/data/remote/entity/AliasCodeCreation;", "d", "Lcom/sportybet/android/social/data/remote/entity/AliasCodeRenameRequest;", "request", "Ljava/lang/Void;", "e", "(Lcom/sportybet/android/social/data/remote/entity/AliasCodeRenameRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/social/data/remote/entity/AliasCodeRemoveRequest;", "b", "(Lcom/sportybet/android/social/data/remote/entity/AliasCodeRemoveRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/social/data/remote/entity/AliasRootCodeReplaceRequest;", "f", "(Lcom/sportybet/android/social/data/remote/entity/AliasRootCodeReplaceRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/social/data/remote/entity/AliasRootCodeResetRequest;", "c", "(Lcom/sportybet/android/social/data/remote/entity/AliasRootCodeResetRequest;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface dt {
    @sbj("orders/aliascode")
    Object a(@db30("aliasName") String str, v1b<? super BaseResponse<AliasRootCode>> v1bVar);

    @fbl(hasBody = Constants.dev, method = VoiceURLConnection.METHOD_TYPE_DELETE, path = "orders/aliascode/my")
    Object b(@jh4 AliasCodeRemoveRequest aliasCodeRemoveRequest, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("orders/aliascode/my/reset")
    Object c(@jh4 AliasRootCodeResetRequest aliasRootCodeResetRequest, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("orders/aliascode/my")
    Object d(@db30("aliasName") String str, v1b<? super BaseResponse<AliasCodeCreation>> v1bVar);

    @gmz("orders/aliascode/my")
    Object e(@jh4 AliasCodeRenameRequest aliasCodeRenameRequest, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("orders/aliascode/my/replace")
    Object f(@jh4 AliasRootCodeReplaceRequest aliasRootCodeReplaceRequest, v1b<? super BaseResponse<Object>> v1bVar);

    @sbj("orders/aliascode/my/list")
    Object g(v1b<? super BaseResponse<AliasCodeList>> v1bVar);

    @sbj("orders/aliascode/my/state")
    Object h(v1b<? super BaseResponse<et>> v1bVar);
}
