package com.sporty.android.core.model.appupdate;

import com.sporty.android.core.model.config.VersionData;
import defpackage.pe4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "", "NotStarted", "OpenGooglePlayStore", "OpenHuaweiAppGallery", "OpenPalmStore", "DownloadApkPermissionCheck", "ApkDownloadStarted", "ApkDownloading", "ApkDownloadSuccess", "ApkDownloadFailure", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloadFailure;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloadStarted;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloadSuccess;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloading;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$DownloadApkPermissionCheck;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$NotStarted;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$OpenGooglePlayStore;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$OpenHuaweiAppGallery;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction$OpenPalmStore;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AppDownloadAction {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloadFailure;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "<init>", "()V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ApkDownloadFailure implements AppDownloadAction {
        public static final ApkDownloadFailure INSTANCE = new ApkDownloadFailure();

        private ApkDownloadFailure() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloadStarted;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "<init>", "()V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ApkDownloadStarted implements AppDownloadAction {
        public static final ApkDownloadStarted INSTANCE = new ApkDownloadStarted();

        private ApkDownloadStarted() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloadSuccess;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "<init>", "()V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ApkDownloadSuccess implements AppDownloadAction {
        public static final ApkDownloadSuccess INSTANCE = new ApkDownloadSuccess();

        private ApkDownloadSuccess() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$ApkDownloading;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "percentage", "", "<init>", "(I)V", "getPercentage", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ApkDownloading implements AppDownloadAction {
        private final int percentage;

        public ApkDownloading(int i) {
            this.percentage = i;
        }

        public static /* synthetic */ ApkDownloading copy$default(ApkDownloading apkDownloading, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = apkDownloading.percentage;
            }
            return apkDownloading.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPercentage() {
            return this.percentage;
        }

        public final ApkDownloading copy(int percentage) {
            return new ApkDownloading(percentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApkDownloading) && this.percentage == ((ApkDownloading) other).percentage;
        }

        public final int getPercentage() {
            return this.percentage;
        }

        public int hashCode() {
            return Integer.hashCode(this.percentage);
        }

        public String toString() {
            return pe4.b(this.percentage, "ApkDownloading(percentage=", ")");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$DownloadApkPermissionCheck;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "data", "Lcom/sporty/android/core/model/config/VersionData;", "isManualDownload", "", "<init>", "(Lcom/sporty/android/core/model/config/VersionData;Z)V", "getData", "()Lcom/sporty/android/core/model/config/VersionData;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DownloadApkPermissionCheck implements AppDownloadAction {
        private final VersionData data;
        private final boolean isManualDownload;

        public DownloadApkPermissionCheck(VersionData versionData, boolean z) {
            versionData.getClass();
            this.data = versionData;
            this.isManualDownload = z;
        }

        public static /* synthetic */ DownloadApkPermissionCheck copy$default(DownloadApkPermissionCheck downloadApkPermissionCheck, VersionData versionData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                versionData = downloadApkPermissionCheck.data;
            }
            if ((i & 2) != 0) {
                z = downloadApkPermissionCheck.isManualDownload;
            }
            return downloadApkPermissionCheck.copy(versionData, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VersionData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsManualDownload() {
            return this.isManualDownload;
        }

        public final DownloadApkPermissionCheck copy(VersionData data, boolean isManualDownload) {
            data.getClass();
            return new DownloadApkPermissionCheck(data, isManualDownload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadApkPermissionCheck)) {
                return false;
            }
            DownloadApkPermissionCheck downloadApkPermissionCheck = (DownloadApkPermissionCheck) other;
            return Intrinsics.g(this.data, downloadApkPermissionCheck.data) && this.isManualDownload == downloadApkPermissionCheck.isManualDownload;
        }

        public final VersionData getData() {
            return this.data;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isManualDownload) + (this.data.hashCode() * 31);
        }

        public final boolean isManualDownload() {
            return this.isManualDownload;
        }

        public String toString() {
            return "DownloadApkPermissionCheck(data=" + this.data + ", isManualDownload=" + this.isManualDownload + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$NotStarted;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NotStarted implements AppDownloadAction {
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NotStarted);
        }

        public int hashCode() {
            return 706232282;
        }

        public String toString() {
            return "NotStarted";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$OpenHuaweiAppGallery;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "data", "Lcom/sporty/android/core/model/config/VersionData;", "<init>", "(Lcom/sporty/android/core/model/config/VersionData;)V", "getData", "()Lcom/sporty/android/core/model/config/VersionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OpenHuaweiAppGallery implements AppDownloadAction {
        private final VersionData data;

        public OpenHuaweiAppGallery(VersionData versionData) {
            versionData.getClass();
            this.data = versionData;
        }

        public static /* synthetic */ OpenHuaweiAppGallery copy$default(OpenHuaweiAppGallery openHuaweiAppGallery, VersionData versionData, int i, Object obj) {
            if ((i & 1) != 0) {
                versionData = openHuaweiAppGallery.data;
            }
            return openHuaweiAppGallery.copy(versionData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VersionData getData() {
            return this.data;
        }

        public final OpenHuaweiAppGallery copy(VersionData data) {
            data.getClass();
            return new OpenHuaweiAppGallery(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenHuaweiAppGallery) && Intrinsics.g(this.data, ((OpenHuaweiAppGallery) other).data);
        }

        public final VersionData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "OpenHuaweiAppGallery(data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$OpenPalmStore;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "data", "Lcom/sporty/android/core/model/config/VersionData;", "url", "", "<init>", "(Lcom/sporty/android/core/model/config/VersionData;Ljava/lang/String;)V", "getData", "()Lcom/sporty/android/core/model/config/VersionData;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OpenPalmStore implements AppDownloadAction {
        private final VersionData data;
        private final String url;

        public OpenPalmStore(VersionData versionData, String str) {
            versionData.getClass();
            this.data = versionData;
            this.url = str;
        }

        public static /* synthetic */ OpenPalmStore copy$default(OpenPalmStore openPalmStore, VersionData versionData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                versionData = openPalmStore.data;
            }
            if ((i & 2) != 0) {
                str = openPalmStore.url;
            }
            return openPalmStore.copy(versionData, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VersionData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final OpenPalmStore copy(VersionData data, String url) {
            data.getClass();
            return new OpenPalmStore(data, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenPalmStore)) {
                return false;
            }
            OpenPalmStore openPalmStore = (OpenPalmStore) other;
            return Intrinsics.g(this.data, openPalmStore.data) && Intrinsics.g(this.url, openPalmStore.url);
        }

        public final VersionData getData() {
            return this.data;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            String str = this.url;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenPalmStore(data=" + this.data + ", url=" + this.url + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/appupdate/AppDownloadAction$OpenGooglePlayStore;", "Lcom/sporty/android/core/model/appupdate/AppDownloadAction;", "data", "Lcom/sporty/android/core/model/config/VersionData;", "url", "", "<init>", "(Lcom/sporty/android/core/model/config/VersionData;Ljava/lang/String;)V", "getData", "()Lcom/sporty/android/core/model/config/VersionData;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OpenGooglePlayStore implements AppDownloadAction {
        private final VersionData data;
        private final String url;

        public OpenGooglePlayStore(VersionData versionData, String str) {
            versionData.getClass();
            this.data = versionData;
            this.url = str;
        }

        public static /* synthetic */ OpenGooglePlayStore copy$default(OpenGooglePlayStore openGooglePlayStore, VersionData versionData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                versionData = openGooglePlayStore.data;
            }
            if ((i & 2) != 0) {
                str = openGooglePlayStore.url;
            }
            return openGooglePlayStore.copy(versionData, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VersionData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final OpenGooglePlayStore copy(VersionData data, String url) {
            data.getClass();
            return new OpenGooglePlayStore(data, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenGooglePlayStore)) {
                return false;
            }
            OpenGooglePlayStore openGooglePlayStore = (OpenGooglePlayStore) other;
            return Intrinsics.g(this.data, openGooglePlayStore.data) && Intrinsics.g(this.url, openGooglePlayStore.url);
        }

        public final VersionData getData() {
            return this.data;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            String str = this.url;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenGooglePlayStore(data=" + this.data + ", url=" + this.url + ")";
        }

        public /* synthetic */ OpenGooglePlayStore(VersionData versionData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(versionData, (i & 2) != 0 ? null : str);
        }
    }
}
