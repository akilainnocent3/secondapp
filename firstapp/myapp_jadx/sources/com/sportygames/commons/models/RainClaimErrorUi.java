package com.sportygames.commons.models;

import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import defpackage.d830;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/sportygames/commons/models/RainClaimErrorUi;", "", "<init>", "()V", "Toast", "LiveDataToast", "Lcom/sportygames/commons/models/RainClaimErrorUi$LiveDataToast;", "Lcom/sportygames/commons/models/RainClaimErrorUi$Toast;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RainClaimErrorUi {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/sportygames/commons/models/RainClaimErrorUi$LiveDataToast;", "Lcom/sportygames/commons/models/RainClaimErrorUi;", EventKeys.ERROR_MESSAGE, "", "title", "errorType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getTitle", "getErrorType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LiveDataToast extends RainClaimErrorUi {
        public static final int $stable = 0;
        private final int errorType;
        private final String message;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveDataToast(String str, String str2, int i) {
            super(null);
            str.getClass();
            str2.getClass();
            this.message = str;
            this.title = str2;
            this.errorType = i;
        }

        public static /* synthetic */ LiveDataToast copy$default(LiveDataToast liveDataToast, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = liveDataToast.message;
            }
            if ((i2 & 2) != 0) {
                str2 = liveDataToast.title;
            }
            if ((i2 & 4) != 0) {
                i = liveDataToast.errorType;
            }
            return liveDataToast.copy(str, str2, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getErrorType() {
            return this.errorType;
        }

        public final LiveDataToast copy(String message, String title, int errorType) {
            message.getClass();
            title.getClass();
            return new LiveDataToast(message, title, errorType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiveDataToast)) {
                return false;
            }
            LiveDataToast liveDataToast = (LiveDataToast) other;
            return Intrinsics.g(this.message, liveDataToast.message) && Intrinsics.g(this.title, liveDataToast.title) && this.errorType == liveDataToast.errorType;
        }

        public final int getErrorType() {
            return this.errorType;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorType) + gmf0.a(this.message.hashCode() * 31, 31, this.title);
        }

        public String toString() {
            return zk1.a(this.errorType, ")", ux5.a("LiveDataToast(message=", this.message, ", title=", this.title, ", errorType="));
        }
    }

    public /* synthetic */ RainClaimErrorUi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RainClaimErrorUi() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sportygames/commons/models/RainClaimErrorUi$Toast;", "Lcom/sportygames/commons/models/RainClaimErrorUi;", "text", "", "colorRes", "", "<init>", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "getColorRes", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Toast extends RainClaimErrorUi {
        public static final int $stable = 0;
        private final int colorRes;
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toast(String str, int i) {
            super(null);
            str.getClass();
            this.text = str;
            this.colorRes = i;
        }

        public static /* synthetic */ Toast copy$default(Toast toast, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = toast.text;
            }
            if ((i2 & 2) != 0) {
                i = toast.colorRes;
            }
            return toast.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getColorRes() {
            return this.colorRes;
        }

        public final Toast copy(String text, int colorRes) {
            text.getClass();
            return new Toast(text, colorRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toast)) {
                return false;
            }
            Toast toast = (Toast) other;
            return Intrinsics.g(this.text, toast.text) && this.colorRes == toast.colorRes;
        }

        public final int getColorRes() {
            return this.colorRes;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Integer.hashCode(this.colorRes) + (this.text.hashCode() * 31);
        }

        public String toString() {
            return d830.a(this.colorRes, "Toast(text=", this.text, ", colorRes=", ")");
        }

        public /* synthetic */ Toast(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? R.color.error_toast : i);
        }
    }
}
