package com.sportygames.compose.chat.data.api;

import com.sportygames.compose.chat.data.model.HTTPResponse;
import com.sportygames.compose.chat.data.model.NickNameResponse;
import defpackage.db30;
import defpackage.gmz;
import defpackage.v1b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportygames/compose/chat/data/api/NickNameInterface;", "", "", "value", "Lcom/sportygames/compose/chat/data/model/HTTPResponse;", "Lcom/sportygames/compose/chat/data/model/NickNameResponse;", "setNickName", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NickNameInterface {
    @gmz("patron/account/info/nickname")
    Object setNickName(@db30("value") String str, v1b<? super HTTPResponse<NickNameResponse>> v1bVar);
}
