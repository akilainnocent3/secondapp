package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SharedInstances {

    @l
    public static final SharedInstances INSTANCE = new SharedInstances();

    @l
    private static final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.a
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(Invocation invocation) {
            SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
        }
    };

    @l
    private static final INativeCallbackSubject webViewAppNativeCallbackSubject = new INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        @l
        public NativeCallback getCallback(@l String callbackId) {
            m0.p(callbackId, "callbackId");
            NativeCallback callback = WebViewApp.getCurrentApp().getCallback(callbackId);
            m0.o(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(@l NativeCallback callback) {
            m0.p(callback, "callback");
            WebViewApp.getCurrentApp().removeCallback(callback);
        }
    };

    @l
    private static final IEventSender webViewEventSender = new IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            return WebViewApp.getCurrentApp() != null;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(@l Enum<?> eventCategory, @l Enum<?> eventId, @l Object... params) {
            m0.p(eventCategory, "eventCategory");
            m0.p(eventId, "eventId");
            m0.p(params, "params");
            WebViewApp currentApp = WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(eventCategory, eventId, Arrays.copyOf(params, params.length));
            }
            return false;
        }
    };

    @l
    private static final IWebViewBridge webViewBridge = new IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(@m String str, @m String str2, @m Object[] objArr) throws Exception {
            WebViewBridge.getInstance().handleCallback(str, str2, objArr);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(@m String str, @m String str2, @m Object[] objArr, @m WebViewCallback webViewCallback) throws Exception {
            WebViewBridge.getInstance().handleInvocation(str, str2, objArr, webViewCallback);
        }
    };

    private SharedInstances() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(Invocation it) {
        m0.p(it, "it");
        WebViewApp.getCurrentApp().invokeCallback(it);
    }

    @l
    public final IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    @l
    public final INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    @l
    public final IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }

    @l
    public final IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }
}
