package com.applovin.shadow.okhttp3.internal.io;

import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Okio__JvmOkioKt;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import cs.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface FileSystem {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @g
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class SystemFileSystem implements FileSystem {
            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            @l
            public Sink appendingSink(@l File file) throws FileNotFoundException {
                m0.p(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void delete(@l File file) throws IOException {
                m0.p(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void deleteContents(@l File directory) throws IOException {
                m0.p(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        m0.o(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public boolean exists(@l File file) {
                m0.p(file, "file");
                return file.exists();
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public void rename(@l File from, @l File to2) throws IOException {
                m0.p(from, "from");
                m0.p(to2, "to");
                delete(to2);
                if (from.renameTo(to2)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to2);
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            @l
            public Sink sink(@l File file) throws FileNotFoundException {
                m0.p(file, "file");
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            public long size(@l File file) {
                m0.p(file, "file");
                return file.length();
            }

            @Override // com.applovin.shadow.okhttp3.internal.io.FileSystem
            @l
            public Source source(@l File file) throws FileNotFoundException {
                m0.p(file, "file");
                return Okio.source(file);
            }

            @l
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    @l
    Sink appendingSink(@l File file) throws FileNotFoundException;

    void delete(@l File file) throws IOException;

    void deleteContents(@l File file) throws IOException;

    boolean exists(@l File file);

    void rename(@l File file, @l File file2) throws IOException;

    @l
    Sink sink(@l File file) throws FileNotFoundException;

    long size(@l File file);

    @l
    Source source(@l File file) throws FileNotFoundException;
}
