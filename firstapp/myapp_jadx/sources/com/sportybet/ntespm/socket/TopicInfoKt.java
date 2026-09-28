package com.sportybet.ntespm.socket;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hp0;
import defpackage.i3g0;
import defpackage.oxc;
import defpackage.uqm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportybet/ntespm/socket/TopicType;", "type", "Lkotlin/Function1;", "Lcom/sportybet/ntespm/socket/TopicInfo;", "", "setup", "", "generateTopicString", "(Lcom/sportybet/ntespm/socket/TopicType;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "topic", "languageSocketSuffix", "applyMultilingualSuffix", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "africa-bet-android"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class TopicInfoKt {
    private static final String applyMultilingualSuffix(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return (StringsKt.M(str, "odds", true) || StringsKt.M(str, AnalyticsParam.EVENT_STATUS, true)) ? oxc.a(str, "^", str2) : str;
    }

    public static final String generateTopicString(TopicType topicType, Function1<? super TopicInfo, Unit> function1) {
        uqm uqmVar;
        topicType.getClass();
        function1.getClass();
        TopicInfo topicInfo = new TopicInfo(null, null, null, null, null, null, null, 127, null);
        function1.invoke(topicInfo);
        String strGenTopic = topicInfo.genTopic(topicType);
        hp0 hp0Var = hp0.A;
        return applyMultilingualSuffix(strGenTopic, (hp0Var == null || (uqmVar = hp0Var.b) == null) ? null : uqmVar.getLanguageSocketSuffix());
    }

    public static /* synthetic */ String generateTopicString$default(TopicType topicType, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new i3g0();
        }
        return generateTopicString(topicType, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateTopicString$lambda$0(TopicInfo topicInfo) {
        topicInfo.getClass();
        return Unit.a;
    }
}
