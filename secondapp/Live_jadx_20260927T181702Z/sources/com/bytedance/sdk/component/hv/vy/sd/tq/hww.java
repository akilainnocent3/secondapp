package com.bytedance.sdk.component.hv.vy.sd.tq;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.hv.vy.sd.hu;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.component.utils.vgm;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.hv.vy.sd.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0325hww {
        void hww();

        void hww(Drawable drawable);

        void hww(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq(byte[] bArr, hu huVar, InterfaceC0325hww interfaceC0325hww) {
        FileOutputStream fileOutputStream = null;
        try {
            boolean zVgm = huVar.vgm();
            File fileHww = vgm.hww(huVar.hww(), zVgm, zVgm ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileHww);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0325hww != null) {
                        interfaceC0325hww.hww(bArr);
                    }
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileHww));
                if (interfaceC0325hww != null) {
                    interfaceC0325hww.hww(drawableDecodeDrawable);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    omn.hww("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0325hww != null) {
                        interfaceC0325hww.hww();
                    }
                } catch (Throwable th3) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void hww(byte[] bArr, hu huVar, InterfaceC0325hww interfaceC0325hww) {
        if (Build.VERSION.SDK_INT <= 30) {
            hww(bArr, interfaceC0325hww, huVar);
        } else {
            hww(bArr, interfaceC0325hww);
        }
    }

    public void hww(byte[] bArr, InterfaceC0325hww interfaceC0325hww) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0325hww != null) {
                interfaceC0325hww.hww(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0325hww != null) {
                interfaceC0325hww.hww(drawableDecodeDrawable);
            }
        } catch (Throwable th2) {
            omn.sd("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0325hww != null) {
                interfaceC0325hww.hww();
            }
        }
    }

    private void hww(final byte[] bArr, final InterfaceC0325hww interfaceC0325hww, final hu huVar) {
        try {
            huVar.ok().submit(new Runnable() { // from class: com.bytedance.sdk.component.hv.vy.sd.tq.hww.1
                @Override // java.lang.Runnable
                public void run() {
                    hww.this.tq(bArr, huVar, interfaceC0325hww);
                }
            });
        } catch (Throwable th2) {
            omn.sd("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0325hww != null) {
                interfaceC0325hww.hww();
            }
        }
    }
}
