package com.sportygames.chat.remote.models;

import com.appsflyer.internal.p;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.tx5;
import defpackage.uf80;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sportygames/chat/remote/models/GifListResponse;", "", "data", "", "Lcom/sportygames/chat/remote/models/GifListResponse$GifList;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GifList", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GifListResponse {
    public static final int $stable = 8;
    private final List<GifList> data;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/sportygames/chat/remote/models/GifListResponse$GifList;", "", "type", "", AnalyticsParam.EVENT_PARAM_ID, "images", "Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Images;", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Images;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getId", "getImages", "()Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Images;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Images", "Downsized", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GifList {
        public static final int $stable = 0;
        private final String id;
        private final Images images;
        private final String type;
        private final String url;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Downsized;", "", "url", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Downsized {
            public static final int $stable = 0;
            private final String text;
            private final String url;

            public Downsized(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.url = str;
                this.text = str2;
            }

            public static /* synthetic */ Downsized copy$default(Downsized downsized, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = downsized.url;
                }
                if ((i & 2) != 0) {
                    str2 = downsized.text;
                }
                return downsized.copy(str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final Downsized copy(String url, String text) {
                url.getClass();
                text.getClass();
                return new Downsized(url, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Downsized)) {
                    return false;
                }
                Downsized downsized = (Downsized) other;
                return Intrinsics.g(this.url, downsized.url) && Intrinsics.g(this.text, downsized.text);
            }

            public final String getText() {
                return this.text;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.url.hashCode() * 31);
            }

            public String toString() {
                return tx5.a("Downsized(url=", this.url, ", text=", this.text, ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Images;", "", "fixed_width_downsampled", "Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Downsized;", "nickname", "", "country", "<init>", "(Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Downsized;Ljava/lang/String;Ljava/lang/String;)V", "getFixed_width_downsampled", "()Lcom/sportygames/chat/remote/models/GifListResponse$GifList$Downsized;", "getNickname", "()Ljava/lang/String;", "getCountry", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Images {
            public static final int $stable = 0;
            private final String country;
            private final Downsized fixed_width_downsampled;
            private final String nickname;

            public Images(Downsized downsized, String str, String str2) {
                downsized.getClass();
                str.getClass();
                str2.getClass();
                this.fixed_width_downsampled = downsized;
                this.nickname = str;
                this.country = str2;
            }

            public static /* synthetic */ Images copy$default(Images images, Downsized downsized, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    downsized = images.fixed_width_downsampled;
                }
                if ((i & 2) != 0) {
                    str = images.nickname;
                }
                if ((i & 4) != 0) {
                    str2 = images.country;
                }
                return images.copy(downsized, str, str2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Downsized getFixed_width_downsampled() {
                return this.fixed_width_downsampled;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getNickname() {
                return this.nickname;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            public final Images copy(Downsized fixed_width_downsampled, String nickname, String country) {
                fixed_width_downsampled.getClass();
                nickname.getClass();
                country.getClass();
                return new Images(fixed_width_downsampled, nickname, country);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Images)) {
                    return false;
                }
                Images images = (Images) other;
                return Intrinsics.g(this.fixed_width_downsampled, images.fixed_width_downsampled) && Intrinsics.g(this.nickname, images.nickname) && Intrinsics.g(this.country, images.country);
            }

            public final String getCountry() {
                return this.country;
            }

            public final Downsized getFixed_width_downsampled() {
                return this.fixed_width_downsampled;
            }

            public final String getNickname() {
                return this.nickname;
            }

            public int hashCode() {
                return this.country.hashCode() + gmf0.a(this.fixed_width_downsampled.hashCode() * 31, 31, this.nickname);
            }

            public String toString() {
                Downsized downsized = this.fixed_width_downsampled;
                String str = this.nickname;
                String str2 = this.country;
                StringBuilder sb = new StringBuilder("Images(fixed_width_downsampled=");
                sb.append(downsized);
                sb.append(", nickname=");
                sb.append(str);
                sb.append(", country=");
                return uf80.a(sb, str2, ")");
            }
        }

        public GifList(String str, String str2, Images images, String str3) {
            str.getClass();
            str2.getClass();
            images.getClass();
            str3.getClass();
            this.type = str;
            this.id = str2;
            this.images = images;
            this.url = str3;
        }

        public static /* synthetic */ GifList copy$default(GifList gifList, String str, String str2, Images images, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gifList.type;
            }
            if ((i & 2) != 0) {
                str2 = gifList.id;
            }
            if ((i & 4) != 0) {
                images = gifList.images;
            }
            if ((i & 8) != 0) {
                str3 = gifList.url;
            }
            return gifList.copy(str, str2, images, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Images getImages() {
            return this.images;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final GifList copy(String type, String id, Images images, String url) {
            type.getClass();
            id.getClass();
            images.getClass();
            url.getClass();
            return new GifList(type, id, images, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GifList)) {
                return false;
            }
            GifList gifList = (GifList) other;
            return Intrinsics.g(this.type, gifList.type) && Intrinsics.g(this.id, gifList.id) && Intrinsics.g(this.images, gifList.images) && Intrinsics.g(this.url, gifList.url);
        }

        public final String getId() {
            return this.id;
        }

        public final Images getImages() {
            return this.images;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + ((this.images.hashCode() + gmf0.a(this.type.hashCode() * 31, 31, this.id)) * 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.id;
            Images images = this.images;
            String str3 = this.url;
            StringBuilder sbA = ux5.a("GifList(type=", str, ", id=", str2, ", images=");
            sbA.append(images);
            sbA.append(", url=");
            sbA.append(str3);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public GifListResponse(List<GifList> list) {
        list.getClass();
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GifListResponse copy$default(GifListResponse gifListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gifListResponse.data;
        }
        return gifListResponse.copy(list);
    }

    public final List<GifList> component1() {
        return this.data;
    }

    public final GifListResponse copy(List<GifList> data) {
        data.getClass();
        return new GifListResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GifListResponse) && Intrinsics.g(this.data, ((GifListResponse) other).data);
    }

    public final List<GifList> getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return p.a("GifListResponse(data=", ")", this.data);
    }
}
