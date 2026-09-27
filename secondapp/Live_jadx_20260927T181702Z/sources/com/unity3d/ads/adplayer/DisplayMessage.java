package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DisplayMessage {

    @l
    private final String opportunityId;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(@l String opportunityId) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DisplayError extends DisplayMessage {

        @l
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(@l String opportunityId, @l String reason) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            m0.p(reason, "reason");
            this.reason = reason;
        }

        @l
        public final String getReason() {
            return this.reason;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(@l String opportunityId) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DisplayReady extends DisplayMessage {

        @m
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(@l String opportunityId, @m Map<String, ? extends Object> map) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        @m
        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i10, x xVar) {
            this(str, (i10 & 2) != 0 ? null : map);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(@l String opportunityId, boolean z10) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            this.isFocused = z10;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class OpenUrl extends DisplayMessage {

        @l
        private final Intent intent;
        private final boolean useActivityForResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(@l String opportunityId, @l Intent intent, boolean z10) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            m0.p(intent, "intent");
            this.intent = intent;
            this.useActivityForResult = z10;
        }

        @l
        public final Intent getIntent() {
            return this.intent;
        }

        public final boolean getUseActivityForResult() {
            return this.useActivityForResult;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class OpenUrlResult extends DisplayMessage {
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrlResult(@l String opportunityId, boolean z10) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            this.success = z10;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(@l String opportunityId, int i10) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            this.orientation = i10;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(@l String opportunityId, boolean z10) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            this.isVisible = z10;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(@l String opportunityId) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class WebViewInstanceResponse extends DisplayMessage {

        @l
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(@l String opportunityId, @l WebView webView) {
            super(opportunityId, null);
            m0.p(opportunityId, "opportunityId");
            m0.p(webView, "webView");
            this.webView = webView;
        }

        @l
        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, x xVar) {
        this(str);
    }

    @l
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}
