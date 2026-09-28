package com.sporty.android.core.model.security.biometric;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\t\n\u000bB\u001d\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/CryptoException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", EventKeys.ERROR_MESSAGE, "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "KeyGenerationException", "InvalidKeyException", "CipherOperationException", "Lcom/sporty/android/core/model/security/biometric/CryptoException$CipherOperationException;", "Lcom/sporty/android/core/model/security/biometric/CryptoException$InvalidKeyException;", "Lcom/sporty/android/core/model/security/biometric/CryptoException$KeyGenerationException;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CryptoException extends Exception {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/CryptoException$CipherOperationException;", "Lcom/sporty/android/core/model/security/biometric/CryptoException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CipherOperationException extends CryptoException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CipherOperationException(Throwable th) {
            super("Cipher operation failed", th, null);
            th.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/CryptoException$InvalidKeyException;", "Lcom/sporty/android/core/model/security/biometric/CryptoException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class InvalidKeyException extends CryptoException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidKeyException(Throwable th) {
            super("Key is permanently invalidated", th, null);
            th.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/CryptoException$KeyGenerationException;", "Lcom/sporty/android/core/model/security/biometric/CryptoException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class KeyGenerationException extends CryptoException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeyGenerationException(Throwable th) {
            super("Failed to generate cryptographic key", th, null);
            th.getClass();
        }
    }

    public /* synthetic */ CryptoException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    private CryptoException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ CryptoException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
