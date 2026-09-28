package com.sporty.android.platform.features.captcha.model;

import android.graphics.Bitmap;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.xh8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage;", "", "Empty", "Image", "Error", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage$Empty;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage$Error;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage$Image;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface InHouseCaptchaImage {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage$Empty;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage;", "<init>", "()V", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Empty implements InHouseCaptchaImage {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage$Error;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage;", "errorMsg", "Lcom/sporty/android/common_ui/uitext/UiText;", "<init>", "(Lcom/sporty/android/common_ui/uitext/UiText;)V", "getErrorMsg", "()Lcom/sporty/android/common_ui/uitext/UiText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Error implements InHouseCaptchaImage {
        public static final int $stable = 0;
        private final UiText errorMsg;

        public Error(UiText uiText) {
            uiText.getClass();
            this.errorMsg = uiText;
        }

        public static /* synthetic */ Error copy$default(Error error, UiText uiText, int i, Object obj) {
            if ((i & 1) != 0) {
                uiText = error.errorMsg;
            }
            return error.copy(uiText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiText getErrorMsg() {
            return this.errorMsg;
        }

        public final Error copy(UiText errorMsg) {
            errorMsg.getClass();
            return new Error(errorMsg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.g(this.errorMsg, ((Error) other).errorMsg);
        }

        public final UiText getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return this.errorMsg.hashCode();
        }

        public String toString() {
            return xh8.a(this.errorMsg, "Error(errorMsg=", ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage$Image;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaImage;", "bitmap", "Landroid/graphics/Bitmap;", "imageKey", "", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getImageKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Image implements InHouseCaptchaImage {
        public static final int $stable = 8;
        private final Bitmap bitmap;
        private final String imageKey;

        public Image(Bitmap bitmap, String str) {
            bitmap.getClass();
            str.getClass();
            this.bitmap = bitmap;
            this.imageKey = str;
        }

        public static /* synthetic */ Image copy$default(Image image, Bitmap bitmap, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = image.bitmap;
            }
            if ((i & 2) != 0) {
                str = image.imageKey;
            }
            return image.copy(bitmap, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getImageKey() {
            return this.imageKey;
        }

        public final Image copy(Bitmap bitmap, String imageKey) {
            bitmap.getClass();
            imageKey.getClass();
            return new Image(bitmap, imageKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.g(this.bitmap, image.bitmap) && Intrinsics.g(this.imageKey, image.imageKey);
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final String getImageKey() {
            return this.imageKey;
        }

        public int hashCode() {
            return this.imageKey.hashCode() + (this.bitmap.hashCode() * 31);
        }

        public String toString() {
            return "Image(bitmap=" + this.bitmap + ", imageKey=" + this.imageKey + ")";
        }
    }
}
