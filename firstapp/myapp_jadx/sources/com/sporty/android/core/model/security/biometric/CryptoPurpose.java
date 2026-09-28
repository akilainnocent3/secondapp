package com.sporty.android.core.model.security.biometric;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/CryptoPurpose;", "", "<init>", "(Ljava/lang/String;I)V", "Encryption", "Decryption", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum CryptoPurpose {
    Encryption,
    Decryption;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<CryptoPurpose> getEntries() {
        return $ENTRIES;
    }
}
