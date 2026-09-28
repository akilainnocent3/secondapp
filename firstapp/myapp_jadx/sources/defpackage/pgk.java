package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Iterator;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class pgk {
    public final psm a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public pgk(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public final UiText a(ChannelAsset.Channel channel) {
        jah0.b bVar;
        String strB;
        Object next;
        String lowerCase;
        jck0.b bVarD;
        channel.getClass();
        int i = a.a[this.a.getCountryCode().ordinal()];
        if (i == 1) {
            ihk.b bVarC = w3w.c(channel, channel.getPayBillProvider());
            if (bVarC != null) {
                return bVarC.c;
            }
        } else if (i == 2) {
            String channelSendName = channel.getChannelSendName();
            if (channelSendName == null || (strB = w3w.b(channelSendName)) == null) {
                bVar = null;
            } else {
                Iterator<T> it = jah0.b.i.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    lowerCase = ((jah0.b) next).a.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (StringsKt.M(strB, lowerCase, false)) {
                        break;
                    }
                } while (!StringsKt.M(lowerCase, strB, false));
                bVar = (jah0.b) next;
            }
            if (bVar != null) {
                return bVar.d;
            }
        } else if (i == 3 && (bVarD = w3w.d(channel)) != null) {
            return bVarD.b;
        }
        return null;
    }
}
