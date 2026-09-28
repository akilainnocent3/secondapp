package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class hkh {
    public final String a;
    public FileChannel b;

    public hkh(String str) {
        str.getClass();
        this.a = yk10.a(str, ".lck");
    }

    public final void a() throws IOException {
        String str = this.a;
        if (this.b != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.b = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = this.b;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.b = null;
            rzk.b(tug.a("Unable to lock file: '", str, "'."), th);
        }
    }
}
