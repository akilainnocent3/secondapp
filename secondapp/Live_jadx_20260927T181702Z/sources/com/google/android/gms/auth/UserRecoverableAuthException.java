package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepName
public class UserRecoverableAuthException extends GoogleAuthException {

    @Nullable
    private final Intent zza;

    public UserRecoverableAuthException(@Nullable String str, @Nullable Intent intent) {
        super(str);
        this.zza = intent;
    }

    @Nullable
    public Intent getIntent() {
        Intent intent = this.zza;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
