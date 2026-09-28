package com.sporty.android.core.model.appupdate;

import com.sporty.android.core.model.config.VersionData;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import defpackage.kox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "", "Failure", "UpdateRequired", "UpdateAvailable", "NoUpdate", "Loading", "Downloading", "NotRequested", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$Downloading;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$Failure;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$Loading;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$NoUpdate;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$NotRequested;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$UpdateAvailable;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults$UpdateRequired;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface VersionCheckResults {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$Downloading;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Downloading implements VersionCheckResults {
        public static final Downloading INSTANCE = new Downloading();

        private Downloading() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Downloading);
        }

        public int hashCode() {
            return 2039359573;
        }

        public String toString() {
            return "Downloading";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$Failure;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Failure implements VersionCheckResults {
        private final Throwable throwable;

        public Failure(Throwable th) {
            th.getClass();
            this.throwable = th;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            throwable.getClass();
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.g(this.throwable, ((Failure) other).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return kox.a("Failure(throwable=", ")", this.throwable);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$Loading;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Loading implements VersionCheckResults {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1696621385;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$NoUpdate;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NoUpdate implements VersionCheckResults {
        public static final NoUpdate INSTANCE = new NoUpdate();

        private NoUpdate() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NoUpdate);
        }

        public int hashCode() {
            return 2097336783;
        }

        public String toString() {
            return "NoUpdate";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$NotRequested;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NotRequested implements VersionCheckResults {
        public static final NotRequested INSTANCE = new NotRequested();

        private NotRequested() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NotRequested);
        }

        public int hashCode() {
            return -1515797696;
        }

        public String toString() {
            return "NotRequested";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$UpdateAvailable;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "data", "Lcom/sporty/android/core/model/config/VersionData;", "<init>", "(Lcom/sporty/android/core/model/config/VersionData;)V", "getData", "()Lcom/sporty/android/core/model/config/VersionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UpdateAvailable implements VersionCheckResults {
        private final VersionData data;

        public UpdateAvailable(VersionData versionData) {
            versionData.getClass();
            this.data = versionData;
        }

        public static /* synthetic */ UpdateAvailable copy$default(UpdateAvailable updateAvailable, VersionData versionData, int i, Object obj) {
            if ((i & 1) != 0) {
                versionData = updateAvailable.data;
            }
            return updateAvailable.copy(versionData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VersionData getData() {
            return this.data;
        }

        public final UpdateAvailable copy(VersionData data) {
            data.getClass();
            return new UpdateAvailable(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateAvailable) && Intrinsics.g(this.data, ((UpdateAvailable) other).data);
        }

        public final VersionData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UpdateAvailable(data=" + this.data + jbkEboCkTqmGf.DLUfs;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/appupdate/VersionCheckResults$UpdateRequired;", "Lcom/sporty/android/core/model/appupdate/VersionCheckResults;", "data", "Lcom/sporty/android/core/model/config/VersionData;", "<init>", "(Lcom/sporty/android/core/model/config/VersionData;)V", "getData", "()Lcom/sporty/android/core/model/config/VersionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UpdateRequired implements VersionCheckResults {
        private final VersionData data;

        public UpdateRequired(VersionData versionData) {
            versionData.getClass();
            this.data = versionData;
        }

        public static /* synthetic */ UpdateRequired copy$default(UpdateRequired updateRequired, VersionData versionData, int i, Object obj) {
            if ((i & 1) != 0) {
                versionData = updateRequired.data;
            }
            return updateRequired.copy(versionData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final VersionData getData() {
            return this.data;
        }

        public final UpdateRequired copy(VersionData data) {
            data.getClass();
            return new UpdateRequired(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateRequired) && Intrinsics.g(this.data, ((UpdateRequired) other).data);
        }

        public final VersionData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "UpdateRequired(data=" + this.data + ")";
        }
    }
}
