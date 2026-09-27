package com.yandex.div.internal.util;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.InternalApi;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public final class IOUtils {
    private static final int BUFFER_SIZE = 2048;

    private IOUtils() {
    }

    public static void closeCursorSilently(@Nullable Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void closeSilently(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void flushSilently(@Nullable OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException unused) {
            }
        }
    }

    @Nullable
    public static byte[] toByteArray(@Nullable InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    @NonNull
    public static String toString(@NonNull InputStream inputStream) throws IOException {
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder(inputStream.available());
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, i10);
        }
    }

    @NonNull
    public static String toString(@NonNull InputStream inputStream, @NonNull Charset charset) throws IOException {
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
        StringBuilder sb2 = new StringBuilder(inputStream.available());
        while (true) {
            int i10 = bufferedReader.read(cArr);
            if (i10 != -1) {
                sb2.append(cArr, 0, i10);
            } else {
                return sb2.toString();
            }
        }
    }
}
