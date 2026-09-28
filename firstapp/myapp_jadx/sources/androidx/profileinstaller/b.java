package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import defpackage.lie;
import defpackage.o130;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Executor a;
    public final c.InterfaceC0068c b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public lie[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0068c interfaceC0068c, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = interfaceC0068c;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    bArr = o130.e;
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    bArr = o130.d;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    bArr = o130.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = o130.b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = o130.a;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.a();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: she
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.b(i, serializable);
            }
        });
    }
}
