package b9;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final String f20897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public FileChannel f20898b;

    public f(@l String filename) {
        m0.p(filename, "filename");
        this.f20897a = filename + ".lck";
    }

    public final void a() throws IOException {
        if (this.f20898b != null) {
            return;
        }
        try {
            File file = new File(this.f20897a);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f20898b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = this.f20898b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f20898b = null;
            throw new IllegalStateException("Unable to lock file: '" + this.f20897a + "'.", th2);
        }
    }

    public final void b() {
        FileChannel fileChannel = this.f20898b;
        if (fileChannel == null) {
            return;
        }
        try {
            fileChannel.close();
        } finally {
            this.f20898b = null;
        }
    }
}
