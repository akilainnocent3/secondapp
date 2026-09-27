package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class FileObserverC5038f6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f97320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f97321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4939ba f97322c;

    public FileObserverC5038f6(File file, C5090h6 c5090h6, C4939ba c4939ba) {
        super(file.getAbsolutePath(), 8);
        this.f97320a = c5090h6;
        this.f97321b = file;
        this.f97322c = c4939ba;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (i10 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f97320a;
        C4939ba c4939ba = this.f97322c;
        File file = this.f97321b;
        c4939ba.getClass();
        consumer.consume(new File(file, str));
    }
}
