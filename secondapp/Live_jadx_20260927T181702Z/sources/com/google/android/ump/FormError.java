package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class FormError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52020b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, @RecentlyNonNull String str) {
        this.f52019a = i10;
        this.f52020b = str;
    }

    public int getErrorCode() {
        return this.f52019a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.f52020b;
    }
}
