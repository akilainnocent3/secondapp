package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.business.CommonLobbyMetaInfo;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ok4 {
    public static final nk4 a(CommonGameDetails commonGameDetails) {
        commonGameDetails.getClass();
        Integer id = commonGameDetails.getId();
        String name = commonGameDetails.getName();
        String countryCode = commonGameDetails.getCountryCode();
        String displayName = commonGameDetails.getDisplayName();
        String nativeSupportVersion = commonGameDetails.getNativeSupportVersion();
        String launchUrl = commonGameDetails.getLaunchUrl();
        Boolean forceUseWebView = commonGameDetails.getForceUseWebView();
        String launchTrigger = commonGameDetails.getLaunchTrigger();
        String imageUrl = commonGameDetails.getImageUrl();
        List<String> tags = commonGameDetails.getTags();
        if (tags == null) {
            tags = m2g.a;
        }
        Integer position = commonGameDetails.getPosition();
        Integer launchRate = commonGameDetails.getLaunchRate();
        String releasedAt = commonGameDetails.getReleasedAt();
        CommonLobbyMetaInfo metaInfo = commonGameDetails.getMetaInfo();
        Long minimumSdkVersion = metaInfo != null ? metaInfo.getMinimumSdkVersion() : null;
        CommonLobbyMetaInfo metaInfo2 = commonGameDetails.getMetaInfo();
        Long minimumAppVersionSupported = metaInfo2 != null ? metaInfo2.getMinimumAppVersionSupported() : null;
        CommonLobbyMetaInfo metaInfo3 = commonGameDetails.getMetaInfo();
        String webviewVersion = metaInfo3 != null ? metaInfo3.getWebviewVersion() : null;
        CommonLobbyMetaInfo metaInfo4 = commonGameDetails.getMetaInfo();
        Long minimumCMSVersionSupported = metaInfo4 != null ? metaInfo4.getMinimumCMSVersionSupported() : null;
        CommonLobbyMetaInfo metaInfo5 = commonGameDetails.getMetaInfo();
        String gameUrl = metaInfo5 != null ? metaInfo5.getGameUrl() : null;
        CommonLobbyMetaInfo metaInfo6 = commonGameDetails.getMetaInfo();
        return new nk4(id, name, countryCode, displayName, nativeSupportVersion, launchUrl, forceUseWebView, launchTrigger, imageUrl, tags, position, launchRate, releasedAt, minimumSdkVersion, minimumAppVersionSupported, webviewVersion, minimumCMSVersionSupported, gameUrl, metaInfo6 != null ? metaInfo6.getDeepLinkCode() : null);
    }
}
