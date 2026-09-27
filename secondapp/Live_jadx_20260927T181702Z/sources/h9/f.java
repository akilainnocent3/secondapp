package h9;

import android.annotation.SuppressLint;
import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "FileUtil")
@s1({"SMAP\nFileUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtil.android.kt\nandroidx/room/util/FileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class f {
    @SuppressLint({"LambdaLast"})
    public static final void a(@oy.l ReadableByteChannel input, @oy.l FileChannel output) throws Throwable {
        ReadableByteChannel readableByteChannel;
        FileChannel fileChannel;
        m0.p(input, "input");
        m0.p(output, "output");
        try {
            try {
                if (Build.VERSION.SDK_INT <= 23) {
                    readableByteChannel = input;
                    fileChannel = output;
                    InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                    OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStreamNewInputStream.read(bArr);
                        if (i10 <= 0) {
                            break;
                        } else {
                            outputStreamNewOutputStream.write(bArr, 0, i10);
                        }
                    }
                } else {
                    readableByteChannel = input;
                    fileChannel = output;
                    fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
                }
                fileChannel.force(false);
                readableByteChannel.close();
                fileChannel.close();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                readableByteChannel.close();
                fileChannel.close();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            readableByteChannel = input;
            fileChannel = output;
        }
    }
}
