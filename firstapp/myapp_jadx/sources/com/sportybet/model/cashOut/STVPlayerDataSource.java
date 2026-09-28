package com.sportybet.model.cashOut;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.plf;
import defpackage.tvh;
import defpackage.uf80;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/model/cashOut/STVPlayerDataSource;", "", "ratio", "", "getRatio", "()F", "StreamingSource", "WebViewSource", "MultipleWebViewSource", "BetGeniusSource", "Lcom/sportybet/model/cashOut/STVPlayerDataSource$BetGeniusSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource$MultipleWebViewSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource$StreamingSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource$WebViewSource;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface STVPlayerDataSource {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/model/cashOut/STVPlayerDataSource$MultipleWebViewSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource;", "url", "", "", "ratio", "", "<init>", "(Ljava/util/List;F)V", "getUrl", "()Ljava/util/List;", "getRatio", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MultipleWebViewSource implements STVPlayerDataSource {
        public static final int $stable = 8;
        private final float ratio;
        private final List<String> url;

        public MultipleWebViewSource(List<String> list, float f) {
            list.getClass();
            this.url = list;
            this.ratio = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleWebViewSource copy$default(MultipleWebViewSource multipleWebViewSource, List list, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                list = multipleWebViewSource.url;
            }
            if ((i & 2) != 0) {
                f = multipleWebViewSource.ratio;
            }
            return multipleWebViewSource.copy(list, f);
        }

        public final List<String> component1() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getRatio() {
            return this.ratio;
        }

        public final MultipleWebViewSource copy(List<String> url, float ratio) {
            url.getClass();
            return new MultipleWebViewSource(url, ratio);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleWebViewSource)) {
                return false;
            }
            MultipleWebViewSource multipleWebViewSource = (MultipleWebViewSource) other;
            return Intrinsics.g(this.url, multipleWebViewSource.url) && Float.compare(this.ratio, multipleWebViewSource.ratio) == 0;
        }

        @Override // com.sportybet.model.cashOut.STVPlayerDataSource
        public float getRatio() {
            return this.ratio;
        }

        public final List<String> getUrl() {
            return this.url;
        }

        public int hashCode() {
            return Float.hashCode(this.ratio) + (this.url.hashCode() * 31);
        }

        public String toString() {
            return "MultipleWebViewSource(url=" + this.url + ", ratio=" + this.ratio + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/sportybet/model/cashOut/STVPlayerDataSource$StreamingSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource;", "url", "", "ratio", "", "isSportyTV", "", "isPlayInDotCom", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "<init>", "(Ljava/lang/String;FZZLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getRatio", "()F", "()Z", "getEventId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class StreamingSource implements STVPlayerDataSource {
        public static final int $stable = 0;
        private final String eventId;
        private final boolean isPlayInDotCom;
        private final boolean isSportyTV;
        private final float ratio;
        private final String url;

        public /* synthetic */ StreamingSource(String str, float f, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str2);
        }

        public static /* synthetic */ StreamingSource copy$default(StreamingSource streamingSource, String str, float f, boolean z, boolean z2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = streamingSource.url;
            }
            if ((i & 2) != 0) {
                f = streamingSource.ratio;
            }
            if ((i & 4) != 0) {
                z = streamingSource.isSportyTV;
            }
            if ((i & 8) != 0) {
                z2 = streamingSource.isPlayInDotCom;
            }
            if ((i & 16) != 0) {
                str2 = streamingSource.eventId;
            }
            String str3 = str2;
            boolean z3 = z;
            return streamingSource.copy(str, f, z3, z2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getRatio() {
            return this.ratio;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsSportyTV() {
            return this.isSportyTV;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsPlayInDotCom() {
            return this.isPlayInDotCom;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        public final StreamingSource copy(String url, float ratio, boolean isSportyTV, boolean isPlayInDotCom, String eventId) {
            url.getClass();
            return new StreamingSource(url, ratio, isSportyTV, isPlayInDotCom, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamingSource)) {
                return false;
            }
            StreamingSource streamingSource = (StreamingSource) other;
            return Intrinsics.g(this.url, streamingSource.url) && Float.compare(this.ratio, streamingSource.ratio) == 0 && this.isSportyTV == streamingSource.isSportyTV && this.isPlayInDotCom == streamingSource.isPlayInDotCom && Intrinsics.g(this.eventId, streamingSource.eventId);
        }

        public final String getEventId() {
            return this.eventId;
        }

        @Override // com.sportybet.model.cashOut.STVPlayerDataSource
        public float getRatio() {
            return this.ratio;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iA = mtg0.a(mtg0.a(tvh.a(this.ratio, this.url.hashCode() * 31, 31), 31, this.isSportyTV), 31, this.isPlayInDotCom);
            String str = this.eventId;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final boolean isPlayInDotCom() {
            return this.isPlayInDotCom;
        }

        public final boolean isSportyTV() {
            return this.isSportyTV;
        }

        public String toString() {
            String str = this.url;
            float f = this.ratio;
            boolean z = this.isSportyTV;
            boolean z2 = this.isPlayInDotCom;
            String str2 = this.eventId;
            StringBuilder sb = new StringBuilder("StreamingSource(url=");
            sb.append(str);
            sb.append(", ratio=");
            sb.append(f);
            sb.append(", isSportyTV=");
            nng.a(LhMGMAwwhzjwfz.LNPjZWVFQErLY, ", eventId=", sb, z, z2);
            return uf80.a(sb, str2, ")");
        }

        public StreamingSource(String str, float f, boolean z, boolean z2, String str2) {
            str.getClass();
            this.url = str;
            this.ratio = f;
            this.isSportyTV = z;
            this.isPlayInDotCom = z2;
            this.eventId = str2;
        }
    }

    float getRatio();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/model/cashOut/STVPlayerDataSource$WebViewSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource;", "url", "", "ratio", "", "htmlData", "Lcom/sporty/android/common_ui/uitext/UiText;", "<init>", "(Ljava/lang/String;FLcom/sporty/android/common_ui/uitext/UiText;)V", "getUrl", "()Ljava/lang/String;", "getRatio", "()F", "getHtmlData", "()Lcom/sporty/android/common_ui/uitext/UiText;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class WebViewSource implements STVPlayerDataSource {
        public static final int $stable = 0;
        private final UiText htmlData;
        private final float ratio;
        private final String url;

        public WebViewSource(String str, float f, UiText uiText) {
            this.url = str;
            this.ratio = f;
            this.htmlData = uiText;
        }

        public static /* synthetic */ WebViewSource copy$default(WebViewSource webViewSource, String str, float f, UiText uiText, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewSource.url;
            }
            if ((i & 2) != 0) {
                f = webViewSource.ratio;
            }
            if ((i & 4) != 0) {
                uiText = webViewSource.htmlData;
            }
            return webViewSource.copy(str, f, uiText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getRatio() {
            return this.ratio;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final UiText getHtmlData() {
            return this.htmlData;
        }

        public final WebViewSource copy(String url, float ratio, UiText htmlData) {
            return new WebViewSource(url, ratio, htmlData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewSource)) {
                return false;
            }
            WebViewSource webViewSource = (WebViewSource) other;
            return Intrinsics.g(this.url, webViewSource.url) && Float.compare(this.ratio, webViewSource.ratio) == 0 && Intrinsics.g(this.htmlData, webViewSource.htmlData);
        }

        public final UiText getHtmlData() {
            return this.htmlData;
        }

        @Override // com.sportybet.model.cashOut.STVPlayerDataSource
        public float getRatio() {
            return this.ratio;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iA = tvh.a(this.ratio, (str == null ? 0 : str.hashCode()) * 31, 31);
            UiText uiText = this.htmlData;
            return iA + (uiText != null ? uiText.hashCode() : 0);
        }

        public String toString() {
            String str = this.url;
            float f = this.ratio;
            UiText uiText = this.htmlData;
            StringBuilder sb = new StringBuilder("WebViewSource(url=");
            sb.append(str);
            sb.append(", ratio=");
            sb.append(f);
            sb.append(", htmlData=");
            return plf.a(sb, uiText, ")");
        }

        public /* synthetic */ WebViewSource(String str, float f, UiText uiText, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, (i & 4) != 0 ? null : uiText);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/sportybet/model/cashOut/STVPlayerDataSource$BetGeniusSource;", "Lcom/sportybet/model/cashOut/STVPlayerDataSource;", "uri", "", "accessToken", "ratio", "", AnalyticsParam.EVENT_STREAM_PROVIDER, "enableScreenProtection", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Z)V", "getUri", "()Ljava/lang/String;", "getAccessToken", "getRatio", "()F", "getProvider", "getEnableScreenProtection", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BetGeniusSource implements STVPlayerDataSource {
        public static final int $stable = 0;
        private final String accessToken;
        private final boolean enableScreenProtection;
        private final String provider;
        private final float ratio;
        private final String uri;

        public BetGeniusSource(String str, String str2, float f, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.uri = str;
            this.accessToken = str2;
            this.ratio = f;
            this.provider = str3;
            this.enableScreenProtection = z;
        }

        public static /* synthetic */ BetGeniusSource copy$default(BetGeniusSource betGeniusSource, String str, String str2, float f, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = betGeniusSource.uri;
            }
            if ((i & 2) != 0) {
                str2 = betGeniusSource.accessToken;
            }
            if ((i & 4) != 0) {
                f = betGeniusSource.ratio;
            }
            if ((i & 8) != 0) {
                str3 = betGeniusSource.provider;
            }
            if ((i & 16) != 0) {
                z = betGeniusSource.enableScreenProtection;
            }
            boolean z2 = z;
            float f2 = f;
            return betGeniusSource.copy(str, str2, f2, str3, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getRatio() {
            return this.ratio;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getProvider() {
            return this.provider;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getEnableScreenProtection() {
            return this.enableScreenProtection;
        }

        public final BetGeniusSource copy(String uri, String accessToken, float ratio, String provider, boolean enableScreenProtection) {
            uri.getClass();
            accessToken.getClass();
            return new BetGeniusSource(uri, accessToken, ratio, provider, enableScreenProtection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BetGeniusSource)) {
                return false;
            }
            BetGeniusSource betGeniusSource = (BetGeniusSource) other;
            return Intrinsics.g(this.uri, betGeniusSource.uri) && Intrinsics.g(this.accessToken, betGeniusSource.accessToken) && Float.compare(this.ratio, betGeniusSource.ratio) == 0 && Intrinsics.g(this.provider, betGeniusSource.provider) && this.enableScreenProtection == betGeniusSource.enableScreenProtection;
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final boolean getEnableScreenProtection() {
            return this.enableScreenProtection;
        }

        public final String getProvider() {
            return this.provider;
        }

        @Override // com.sportybet.model.cashOut.STVPlayerDataSource
        public float getRatio() {
            return this.ratio;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iA = tvh.a(this.ratio, gmf0.a(this.uri.hashCode() * 31, 31, this.accessToken), 31);
            String str = this.provider;
            return Boolean.hashCode(this.enableScreenProtection) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.uri;
            String str2 = this.accessToken;
            float f = this.ratio;
            String str3 = this.provider;
            boolean z = this.enableScreenProtection;
            StringBuilder sbA = ux5.a("BetGeniusSource(uri=", str, ", accessToken=", str2, ", ratio=");
            sbA.append(f);
            sbA.append(", provider=");
            sbA.append(str3);
            sbA.append(", enableScreenProtection=");
            return mq0.a(sbA, z, ")");
        }

        public /* synthetic */ BetGeniusSource(String str, String str2, float f, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, f, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }
    }
}
