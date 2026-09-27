package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import wb.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f31409a = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f31410b;

        ImageType(boolean z10) {
            this.f31410b = z10;
        }

        public boolean hasAlpha() {
            return this.f31410b;
        }

        public boolean isWebp() {
            int i10 = a.f31411a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31411a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f31411a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31411a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31411a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    ImageType a(@NonNull InputStream inputStream) throws IOException;

    int b(@NonNull ByteBuffer byteBuffer, @NonNull b bVar) throws IOException;

    @NonNull
    ImageType c(@NonNull ByteBuffer byteBuffer) throws IOException;

    int d(@NonNull InputStream inputStream, @NonNull b bVar) throws IOException;
}
