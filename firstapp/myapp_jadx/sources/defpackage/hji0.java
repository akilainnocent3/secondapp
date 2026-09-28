package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.getstarted.NetworkVirtualLobbyGetStarted;
import com.sportybet.android.instantwin.newtork.model.response.getstarted.NetworkVirtualLobbyGetStartedBottomCta;
import com.sportybet.android.instantwin.newtork.model.response.getstarted.NetworkVirtualLobbyGetStartedCmsContent;
import com.sportybet.android.instantwin.newtork.model.response.getstarted.NetworkVirtualLobbyGetStartedCtaContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class hji0 {
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    public static final bii0 a(NetworkVirtualLobbyGetStarted networkVirtualLobbyGetStarted) {
        String redirectUrl;
        Object next;
        uii0 uii0Var;
        vii0 vii0Var;
        String redirectUrl2;
        networkVirtualLobbyGetStarted.getClass();
        String sportName = networkVirtualLobbyGetStarted.getSportName();
        cii0 cii0Var = null;
        if (sportName == null || StringsKt.U(sportName)) {
            return null;
        }
        String sportName2 = networkVirtualLobbyGetStarted.getSportName();
        String tabKey = networkVirtualLobbyGetStarted.getTabKey();
        if (tabKey == null) {
            tabKey = "";
        }
        List<NetworkVirtualLobbyGetStartedCmsContent> cmsContents = networkVirtualLobbyGetStarted.getCmsContents();
        if (cmsContents == null) {
            cmsContents = m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkVirtualLobbyGetStartedCmsContent networkVirtualLobbyGetStartedCmsContent : cmsContents) {
            gji0.a aVar = gji0.b;
            String type = networkVirtualLobbyGetStartedCmsContent.getType();
            aVar.getClass();
            Iterator<T> it = gji0.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((gji0) next).a.equalsIgnoreCase(type));
            gji0 gji0Var = (gji0) next;
            if (gji0Var != null) {
                NetworkVirtualLobbyGetStartedCtaContext ctaContext = networkVirtualLobbyGetStartedCmsContent.getCtaContext();
                if (ctaContext == null || (redirectUrl2 = ctaContext.getRedirectUrl()) == null) {
                    uii0Var = null;
                } else {
                    if (StringsKt.U(redirectUrl2)) {
                        redirectUrl2 = null;
                    }
                    if (redirectUrl2 == null) {
                        uii0Var = null;
                    } else {
                        String updateRequiredAppVersion = ctaContext.getUpdateRequiredAppVersion();
                        if (updateRequiredAppVersion == null) {
                            updateRequiredAppVersion = "";
                        }
                        uii0Var = new uii0(redirectUrl2, updateRequiredAppVersion);
                    }
                }
                if (gji0Var == gji0.REDIRECT_BUTTON && uii0Var == null) {
                    vii0Var = null;
                } else {
                    String cmsValue = networkVirtualLobbyGetStartedCmsContent.getCmsValue();
                    if (cmsValue == null) {
                        cmsValue = "";
                    }
                    vii0Var = new vii0(gji0Var, cmsValue, uii0Var);
                }
            } else {
                vii0Var = null;
            }
            if (vii0Var != null) {
                arrayList.add(vii0Var);
            }
        }
        NetworkVirtualLobbyGetStartedBottomCta bottomCta = networkVirtualLobbyGetStarted.getBottomCta();
        if (bottomCta != null && (redirectUrl = bottomCta.getRedirectUrl()) != null) {
            if (StringsKt.U(redirectUrl)) {
                redirectUrl = null;
            }
            if (redirectUrl != null) {
                String cmsValue2 = bottomCta.getCmsValue();
                if (cmsValue2 == null) {
                    cmsValue2 = "";
                }
                String updateRequiredAppVersion2 = bottomCta.getUpdateRequiredAppVersion();
                cii0Var = new cii0(cmsValue2, redirectUrl, updateRequiredAppVersion2 != null ? updateRequiredAppVersion2 : "");
            }
        }
        return new bii0(sportName2, tabKey, arrayList, cii0Var);
    }
}
