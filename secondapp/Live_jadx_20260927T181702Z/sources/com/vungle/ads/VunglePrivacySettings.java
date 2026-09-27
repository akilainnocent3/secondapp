package com.vungle.ads;

import com.ironsource.Ib;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import cs.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VunglePrivacySettings {

    @l
    public static final VunglePrivacySettings INSTANCE = new VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    @l
    @o
    public static final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    @l
    @o
    public static final String getCOPPAStatus() {
        return PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    @l
    @o
    public static final String getGDPRMessageVersion() {
        return PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    @l
    @o
    public static final String getGDPRSource() {
        return PrivacyManager.INSTANCE.getConsentSource();
    }

    @l
    @o
    public static final String getGDPRStatus() {
        return PrivacyManager.INSTANCE.getConsentStatus();
    }

    @o
    public static final long getGDPRTimestamp() {
        return PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    @o
    public static final void setCCPAStatus(boolean z10) {
        PrivacyManager.INSTANCE.updateCcpaConsent(z10 ? PrivacyConsent.OPT_IN : PrivacyConsent.OPT_OUT);
    }

    @o
    public static final void setCOPPAStatus(boolean z10) {
        PrivacyManager.INSTANCE.updateCoppaConsent(z10);
    }

    @o
    public static final void setGDPRStatus(boolean z10, @m String str) {
        PrivacyManager.INSTANCE.updateGdprConsent(z10 ? PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), Ib.f59280b, str);
    }
}
