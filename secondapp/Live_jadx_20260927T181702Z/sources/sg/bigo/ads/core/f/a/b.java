package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f134814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f134815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f134817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f134818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f134819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f134820g;

    public b(int i10, int i11, int i12, int i13, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f134814a = i10;
        this.f134815b = i11;
        this.f134820g = i13;
        this.f134816c = str;
        this.f134819f = i12;
        this.f134817d = str2;
        this.f134818e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.f134817d, "application/javascript");
    }
}
