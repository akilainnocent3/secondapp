package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.net.URL;
import k.r0;
import k.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface h<T> {
    @CheckResult
    @Deprecated
    T a(@Nullable URL url);

    @NonNull
    @CheckResult
    T b(@Nullable File file);

    @NonNull
    @CheckResult
    T c(@Nullable Drawable drawable);

    @NonNull
    @CheckResult
    T i(@Nullable Uri uri);

    @NonNull
    @CheckResult
    T j(@Nullable byte[] bArr);

    @NonNull
    @CheckResult
    T load(@Nullable Object obj);

    @NonNull
    @CheckResult
    T load(@Nullable String str);

    @NonNull
    @CheckResult
    T m(@Nullable Bitmap bitmap);

    @NonNull
    @CheckResult
    T o(@Nullable @r0 @u Integer num);
}
