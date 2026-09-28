package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class w3w {
    public static final ChannelAsset.Channel a(String str, List list) {
        String strB;
        Object obj = null;
        if (str == null || (strB = b(str)) == null) {
            return null;
        }
        for (Object obj2 : list) {
            String channelSendName = ((ChannelAsset.Channel) obj2).getChannelSendName();
            if (channelSendName != null) {
                String lowerCase = channelSendName.toLowerCase(hj10.a.a().b().a);
                lowerCase.getClass();
                if (StringsKt.M(lowerCase, strB, false)) {
                    obj = obj2;
                    break;
                }
            }
        }
        return (ChannelAsset.Channel) obj;
    }

    public static final String b(String str) {
        List listH;
        String str2;
        if (str == null || (listH = new Regex("[_-]").h(str)) == null || (str2 = (String) CollectionsKt.firstOrNull(listH)) == null) {
            return null;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final ihk.b c(ChannelAsset.Channel channel, String str) {
        String str2;
        channel.getClass();
        String channelSendName = channel.getChannelSendName();
        Object obj = null;
        if (channelSendName == null) {
            return null;
        }
        uag uagVar = ihk.b.f;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            Object next = bVarA.next();
            ihk.b bVar = (ihk.b) next;
            if (bVar.a.equals(channelSendName) && ((str2 = bVar.b) == null || str2.equals(str))) {
                obj = next;
                break;
            }
        }
        return (ihk.b) obj;
    }

    public static final jck0.b d(ChannelAsset.Channel channel) {
        String strB;
        channel.getClass();
        String channelSendName = channel.getChannelSendName();
        Object obj = null;
        if (channelSendName == null || (strB = b(channelSendName)) == null) {
            return null;
        }
        uag uagVar = jck0.b.d;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            Object next = bVarA.next();
            ((jck0.b) next).getClass();
            String lowerCase = "Airtel Money".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.M(strB, lowerCase, false) || StringsKt.M(lowerCase, strB, false)) {
                obj = next;
                break;
            }
        }
        return (jck0.b) obj;
    }

    public static final boolean e(ChannelAsset.Channel channel) {
        channel.getClass();
        return (channel.getSupportAction() == 1 || channel.getSupportAction() == 0) && channel.isActive() == 1;
    }
}
