package com.sporty.android.core.model.bo.images;

import com.appsflyer.internal.w;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.kox;
import defpackage.om2;
import defpackage.tag;
import defpackage.tug;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes;", "", "<init>", "()V", "PAGE_SPORTYBET_BO_ASSETS", "", "PAGE_MAIN_FOOTER", "Image", "ImageResource", "ImageResult", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ImageBOTypes {
    public static final ImageBOTypes INSTANCE = new ImageBOTypes();
    private static final String PAGE_MAIN_FOOTER = "main_footer";
    private static final String PAGE_SPORTYBET_BO_ASSETS = "sportybet_bo_assets";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$Image;", "", "key", "", AnalyticsParam.MINI_GAMES_PAGE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getPage", "MAIN_FOOTER__PARTNERSHIP", "ON_BOARDING__PARTNERSHIP_1", "ON_BOARDING__PARTNERSHIP_2", "ON_BOARDING__PARTNERSHIP_3", "SPORTY_SOCCER__MAIN_BG", "MAIN_FOOTER__ENDORSEMENT", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Image {
        MAIN_FOOTER__PARTNERSHIP("main_footer__partnership", ImageBOTypes.PAGE_SPORTYBET_BO_ASSETS),
        ON_BOARDING__PARTNERSHIP_1("on_boarding__partnership_1", ImageBOTypes.PAGE_SPORTYBET_BO_ASSETS),
        ON_BOARDING__PARTNERSHIP_2("on_boarding__partnership_2", ImageBOTypes.PAGE_SPORTYBET_BO_ASSETS),
        ON_BOARDING__PARTNERSHIP_3("on_boarding__partnership_3", ImageBOTypes.PAGE_SPORTYBET_BO_ASSETS),
        SPORTY_SOCCER__MAIN_BG("sporty_soccer__main_bg", ImageBOTypes.PAGE_SPORTYBET_BO_ASSETS),
        MAIN_FOOTER__ENDORSEMENT("mourinho_img", ImageBOTypes.PAGE_MAIN_FOOTER);

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());
        private final String key;
        private final String page;

        Image(String str, String str2) {
            this.key = str;
            this.page = str2;
        }

        public static tag<Image> getEntries() {
            return $ENTRIES;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getPage() {
            return this.page;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource;", "", "<init>", "()V", "Data", "Error", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource$Data;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource$Error;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class ImageResource {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource$Data;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource;", "data", "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Data extends ImageResource {
            private final String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Data(String str) {
                super(null);
                str.getClass();
                this.data = str;
            }

            public static /* synthetic */ Data copy$default(Data data, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = data.data;
                }
                return data.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getData() {
                return this.data;
            }

            public final Data copy(String data) {
                data.getClass();
                return new Data(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Data) && Intrinsics.g(this.data, ((Data) other).data);
            }

            public final String getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return tug.a("Data(data=", this.data, ")");
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource$Error;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResource;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Error extends ImageResource {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable th) {
                super(null);
                th.getClass();
                this.throwable = th;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                throwable.getClass();
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.g(this.throwable, ((Error) other).throwable);
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return kox.a("Error(throwable=", ")", this.throwable);
            }
        }

        public /* synthetic */ ImageResource(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ImageResource() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult;", "", "<init>", "()V", "ImageMap", "Empty", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult$Empty;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult$ImageMap;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class ImageResult {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult$Empty;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult;", "<init>", "()V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Empty extends ImageResult {
            public static final Empty INSTANCE = new Empty();

            private Empty() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult$ImageMap;", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$ImageResult;", "map", "", "Lcom/sporty/android/core/model/bo/images/ImageBOTypes$Image;", "", "updateTime", "", "isFromApi", "", "<init>", "(Ljava/util/Map;JZ)V", "getMap", "()Ljava/util/Map;", "getUpdateTime", "()J", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class ImageMap extends ImageResult {
            private final boolean isFromApi;
            private final Map<Image, String> map;
            private final long updateTime;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageMap(Map<Image, String> map, long j, boolean z) {
                super(null);
                map.getClass();
                this.map = map;
                this.updateTime = j;
                this.isFromApi = z;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ImageMap copy$default(ImageMap imageMap, Map map, long j, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = imageMap.map;
                }
                if ((i & 2) != 0) {
                    j = imageMap.updateTime;
                }
                if ((i & 4) != 0) {
                    z = imageMap.isFromApi;
                }
                return imageMap.copy(map, j, z);
            }

            public final Map<Image, String> component1() {
                return this.map;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final long getUpdateTime() {
                return this.updateTime;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getIsFromApi() {
                return this.isFromApi;
            }

            public final ImageMap copy(Map<Image, String> map, long updateTime, boolean isFromApi) {
                map.getClass();
                return new ImageMap(map, updateTime, isFromApi);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageMap)) {
                    return false;
                }
                ImageMap imageMap = (ImageMap) other;
                return Intrinsics.g(this.map, imageMap.map) && this.updateTime == imageMap.updateTime && this.isFromApi == imageMap.isFromApi;
            }

            public final Map<Image, String> getMap() {
                return this.map;
            }

            public final long getUpdateTime() {
                return this.updateTime;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFromApi) + f87.a(this.map.hashCode() * 31, this.updateTime, 31);
            }

            public final boolean isFromApi() {
                return this.isFromApi;
            }

            public String toString() {
                Map<Image, String> map = this.map;
                long j = this.updateTime;
                boolean z = this.isFromApi;
                StringBuilder sb = new StringBuilder("ImageMap(map=");
                sb.append(map);
                sb.append(", updateTime=");
                sb.append(j);
                return w.a(sb, ", isFromApi=", z, ")");
            }
        }

        public /* synthetic */ ImageResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ImageResult() {
        }
    }

    private ImageBOTypes() {
    }
}
