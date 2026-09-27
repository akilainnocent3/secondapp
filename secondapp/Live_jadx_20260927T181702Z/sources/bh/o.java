package bh;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21445a = "custom_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f21446b = "exo_redir";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21447c = "exo_len";

    boolean contains(String str);

    long get(String str, long j10);

    @Nullable
    String get(String str, @Nullable String str2);

    @Nullable
    byte[] get(String str, @Nullable byte[] bArr);
}
