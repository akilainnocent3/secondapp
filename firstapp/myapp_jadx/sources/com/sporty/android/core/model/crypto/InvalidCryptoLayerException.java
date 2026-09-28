package com.sporty.android.core.model.crypto;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sporty/android/core/model/crypto/InvalidCryptoLayerException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "validationResult", "Lcom/sporty/android/core/model/crypto/ValidationResult;", "<init>", "(Lcom/sporty/android/core/model/crypto/ValidationResult;)V", "isKeyPermanentlyInvalidated", "", "()Z", "isKeyInitFailed", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InvalidCryptoLayerException extends Exception {
    private final boolean isKeyInitFailed;
    private final boolean isKeyPermanentlyInvalidated;

    public InvalidCryptoLayerException(ValidationResult validationResult) {
        validationResult.getClass();
        this.isKeyPermanentlyInvalidated = validationResult == ValidationResult.KeyPermanentlyInvalidate;
        this.isKeyInitFailed = validationResult == ValidationResult.KeyInitFail;
    }

    /* JADX INFO: renamed from: isKeyInitFailed, reason: from getter */
    public final boolean getIsKeyInitFailed() {
        return this.isKeyInitFailed;
    }

    /* JADX INFO: renamed from: isKeyPermanentlyInvalidated, reason: from getter */
    public final boolean getIsKeyPermanentlyInvalidated() {
        return this.isKeyPermanentlyInvalidated;
    }
}
