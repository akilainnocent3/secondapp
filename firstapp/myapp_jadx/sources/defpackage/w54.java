package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public final class w54 {
    public static final /* synthetic */ int a = 0;

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                try {
                    int i = gZIPInputStream.read(bArr2);
                    if (i <= 0) {
                        String string = byteArrayOutputStream.toString("UTF-8");
                        try {
                            byteArrayOutputStream.close();
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return string;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return string;
                        }
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    throw th;
                }
            }
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
            return null;
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            return null;
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
