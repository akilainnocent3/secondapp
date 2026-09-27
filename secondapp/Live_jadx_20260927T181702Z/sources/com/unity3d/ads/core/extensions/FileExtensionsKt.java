package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(@l File file) {
        File[] fileArrListFiles;
        m0.p(file, "<this>");
        long length = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null && fileArrListFiles.length != 0) {
                for (File child : fileArrListFiles) {
                    if (child.isDirectory()) {
                        m0.o(child, "child");
                        linkedList.add(child);
                    } else {
                        length += child.length();
                    }
                }
            }
        }
        return length;
    }
}
