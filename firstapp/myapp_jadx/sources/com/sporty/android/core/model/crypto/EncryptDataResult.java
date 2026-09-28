package com.sporty.android.core.model.crypto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/crypto/EncryptDataResult;", "", "ciphertext", "", "initializationVector", "<init>", "([B[B)V", "getCiphertext", "()[B", "getInitializationVector", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EncryptDataResult {
    private final byte[] ciphertext;
    private final byte[] initializationVector;

    public EncryptDataResult(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        this.ciphertext = bArr;
        this.initializationVector = bArr2;
    }

    public final byte[] getCiphertext() {
        return this.ciphertext;
    }

    public final byte[] getInitializationVector() {
        return this.initializationVector;
    }

    public /* synthetic */ EncryptDataResult(byte[] bArr, byte[] bArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i & 2) != 0 ? null : bArr2);
    }
}
