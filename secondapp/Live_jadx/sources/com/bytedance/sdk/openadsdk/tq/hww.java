package com.bytedance.sdk.openadsdk.tq;

import com.bytedance.sdk.component.utils.vgm;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hww {
    protected boolean hww = false;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final ExecutorService f37618tq = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class CallableC0388hww implements Callable<Void> {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final File f37619tq;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            hww.this.tq(this.f37619tq);
            return null;
        }

        private CallableC0388hww(File file) {
            this.f37619tq = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq(File file) throws IOException {
        if (!this.hww) {
            try {
                vgm.tq(file);
            } catch (Throwable unused) {
            }
            hww(vgm.hww(file.getParentFile()));
        } else {
            List<File> listHww = vgm.hww(file);
            listHww.toString();
            hww(listHww);
        }
    }

    public abstract void hww(List<File> list);

    public abstract boolean hww(long j10, int i10);

    public abstract boolean hww(File file, long j10, int i10);

    public void hww(File file) throws IOException {
        this.f37618tq.submit(new CallableC0388hww(file));
    }

    public long tq(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
