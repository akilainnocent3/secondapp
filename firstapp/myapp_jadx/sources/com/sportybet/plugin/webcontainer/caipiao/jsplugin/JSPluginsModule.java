package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import com.sportybet.plugin.webcontainer.JSPluginServiceImpl;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0011H'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0013H'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0015H'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0017H'b\u0002\b\u0006b\u0002\b\u0007J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0019H'b\u0002\b\u0006b\u0002\b\u0007J\u0014\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001cH'b\u0002\b\u0006Ê\u0001\u0002\b\u001eÊ\u0001\u0010\b\u001f\u0012\f\b \u0012\b\b\fJ\u0004\b\t0!¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JSPluginsModule;", "", "bindJsPluginCommon", "Lcom/sportybet/plugin/webcontainer/jsbridge/LDJSPlugin;", "impl", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPluginCommon;", "Ldagger/Binds;", "Ldagger/multibindings/IntoSet;", "bindJsPluginAccountActivation", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugAccountActivation;", "bindJsPluginAccount", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPluginAccount;", "bindJsPluginIdentity", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPluginIdentity;", "bindJSPluginWebViewTitleControl", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JSPluginWebViewTitleControl;", "bindJSPluginShare", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JSPluginShare;", "bindJsPlugStreaming", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugStreaming;", "bindJsPlugMatchTracker", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugMatchTracker;", "bindJsPlugRegistrationKYC", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugRegistrationKYC;", "bindJsPlugSeon", "Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugSeon;", "bindJSPluginService", "Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;", "Lcom/sportybet/plugin/webcontainer/JSPluginServiceImpl;", "africa-bet-android", "Ldagger/Module;", "Ldagger/hilt/InstallIn;", "value", "Ldagger/hilt/components/SingletonComponent;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface JSPluginsModule {
    JSPluginService bindJSPluginService(JSPluginServiceImpl impl);

    LDJSPlugin bindJSPluginShare(JSPluginShare impl);

    LDJSPlugin bindJSPluginWebViewTitleControl(JSPluginWebViewTitleControl impl);

    LDJSPlugin bindJsPlugMatchTracker(JsPlugMatchTracker impl);

    LDJSPlugin bindJsPlugRegistrationKYC(JsPlugRegistrationKYC impl);

    LDJSPlugin bindJsPlugSeon(JsPlugSeon impl);

    LDJSPlugin bindJsPlugStreaming(JsPlugStreaming impl);

    LDJSPlugin bindJsPluginAccount(JsPluginAccount impl);

    LDJSPlugin bindJsPluginAccountActivation(JsPlugAccountActivation impl);

    LDJSPlugin bindJsPluginCommon(JsPluginCommon impl);

    LDJSPlugin bindJsPluginIdentity(JsPluginIdentity impl);
}
