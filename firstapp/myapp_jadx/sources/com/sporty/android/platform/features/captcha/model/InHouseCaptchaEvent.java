package com.sporty.android.platform.features.captcha.model;

import defpackage.ijf0;
import defpackage.vwz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent;", "", "UpdateImage", "Verify", "FinishActivity", "UpdateAnswer", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$FinishActivity;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$UpdateAnswer;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$UpdateImage;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$Verify;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface InHouseCaptchaEvent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$FinishActivity;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FinishActivity implements InHouseCaptchaEvent {
        public static final int $stable = 0;
        public static final FinishActivity INSTANCE = new FinishActivity();

        private FinishActivity() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FinishActivity);
        }

        public int hashCode() {
            return -1441525025;
        }

        public String toString() {
            return "FinishActivity";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$UpdateAnswer;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent;", "Lijf0;", "textFieldValue", "<init>", "(Lijf0;)V", "component1", "()Lijf0;", "copy", "(Lijf0;)Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$UpdateAnswer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lijf0;", "getTextFieldValue", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UpdateAnswer implements InHouseCaptchaEvent {
        public static final int $stable = 0;
        private final ijf0 textFieldValue;

        public UpdateAnswer(ijf0 ijf0Var) {
            ijf0Var.getClass();
            this.textFieldValue = ijf0Var;
        }

        public static /* synthetic */ UpdateAnswer copy$default(UpdateAnswer updateAnswer, ijf0 ijf0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                ijf0Var = updateAnswer.textFieldValue;
            }
            return updateAnswer.copy(ijf0Var);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ijf0 getTextFieldValue() {
            return this.textFieldValue;
        }

        public final UpdateAnswer copy(ijf0 textFieldValue) {
            textFieldValue.getClass();
            return new UpdateAnswer(textFieldValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateAnswer) && Intrinsics.g(this.textFieldValue, ((UpdateAnswer) other).textFieldValue);
        }

        public final ijf0 getTextFieldValue() {
            return this.textFieldValue;
        }

        public int hashCode() {
            return this.textFieldValue.hashCode();
        }

        public String toString() {
            return vwz.a("UpdateAnswer(textFieldValue=", this.textFieldValue, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$UpdateImage;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UpdateImage implements InHouseCaptchaEvent {
        public static final int $stable = 0;
        public static final UpdateImage INSTANCE = new UpdateImage();

        private UpdateImage() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdateImage);
        }

        public int hashCode() {
            return 1721082133;
        }

        public String toString() {
            return "UpdateImage";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent$Verify;", "Lcom/sporty/android/platform/features/captcha/model/InHouseCaptchaEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Verify implements InHouseCaptchaEvent {
        public static final int $stable = 0;
        public static final Verify INSTANCE = new Verify();

        private Verify() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Verify);
        }

        public int hashCode() {
            return -694982762;
        }

        public String toString() {
            return "Verify";
        }
    }
}
