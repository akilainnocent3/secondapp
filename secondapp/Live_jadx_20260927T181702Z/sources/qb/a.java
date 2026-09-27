package qb;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f122078a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f122079b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f122080c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f122081d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f122082e = 0;

    /* JADX INFO: renamed from: qb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC1180a {
        @NonNull
        byte[] a(int i10);

        @NonNull
        Bitmap b(int i10, int i11, @NonNull Bitmap.Config config);

        void c(@NonNull Bitmap bitmap);

        @NonNull
        int[] d(int i10);

        void e(@NonNull byte[] bArr);

        void f(@NonNull int[] iArr);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a(@Nullable InputStream inputStream, int i10);

    void b(@NonNull Bitmap.Config config);

    @Deprecated
    int c();

    void clear();

    void d();

    int e();

    void f(@NonNull c cVar, @NonNull byte[] bArr);

    int g();

    @NonNull
    ByteBuffer getData();

    int getHeight();

    int getStatus();

    int getWidth();

    @Nullable
    Bitmap h();

    void i();

    int j();

    int k(int i10);

    int l();

    int m();

    void n(@NonNull c cVar, @NonNull ByteBuffer byteBuffer);

    void o(@NonNull c cVar, @NonNull ByteBuffer byteBuffer, int i10);

    int p();

    int read(@Nullable byte[] bArr);
}
