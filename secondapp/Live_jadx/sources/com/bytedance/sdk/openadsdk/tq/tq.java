package com.bytedance.sdk.openadsdk.tq;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq extends hww {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f37620sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f37621tq;
    private volatile boolean vy;

    public tq(int i10, int i11) {
        this.f37621tq = 15;
        this.f37620sd = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f37621tq = i10;
        this.f37620sd = i11;
    }

    private void sd(List<File> list) {
        long jTq = tq(list);
        int size = list.size();
        if (hww(jTq, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jTq -= length;
            }
            if (hww(file, jTq, size)) {
                return;
            }
        }
    }

    private void vy(List<File> list) {
        long jTq;
        int size;
        boolean zHww;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zHww = hww((jTq = tq(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zHww) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jTq -= length;
                            }
                            if (hww(file2, jTq, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tq.hww
    public boolean hww(long j10, int i10) {
        return i10 <= this.f37621tq;
    }

    @Override // com.bytedance.sdk.openadsdk.tq.hww
    public boolean hww(File file, long j10, int i10) {
        return i10 <= this.f37620sd;
    }

    @Override // com.bytedance.sdk.openadsdk.tq.hww
    public void hww(List<File> list) {
        if (this.vy) {
            vy(list);
            this.vy = false;
        } else {
            sd(list);
        }
    }

    public tq(int i10, int i11, boolean z10) {
        this.f37621tq = 15;
        this.f37620sd = 3;
        if (i10 > 0) {
            this.f37621tq = i10;
            this.f37620sd = i11;
            this.vy = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
