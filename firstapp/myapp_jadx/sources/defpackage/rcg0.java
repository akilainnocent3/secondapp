package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
public final class rcg0 {
    public static final rcg0 a = new rcg0();

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                try {
                    int i = gZIPInputStream.read(bArr2);
                    if (i <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                } catch (Throwable th) {
                    try {
                        zi50.a aVar = zi50.b;
                        byteArrayOutputStream.close();
                        Unit unit = Unit.a;
                    } catch (Throwable unused) {
                        zi50.a aVar2 = zi50.b;
                    }
                    try {
                        gZIPInputStream.close();
                        Unit unit2 = Unit.a;
                    } catch (Throwable unused2) {
                        zi50.a aVar3 = zi50.b;
                    }
                    try {
                        byteArrayInputStream.close();
                        Unit unit3 = Unit.a;
                        throw th;
                    } catch (Throwable unused3) {
                        zi50.a aVar4 = zi50.b;
                        throw th;
                    }
                }
                return null;
            }
            String string = byteArrayOutputStream.toString(Charsets.UTF_8.name());
            try {
                zi50.a aVar5 = zi50.b;
                byteArrayOutputStream.close();
                Unit unit4 = Unit.a;
            } catch (Throwable unused4) {
                zi50.a aVar6 = zi50.b;
            }
            try {
                gZIPInputStream.close();
                Unit unit5 = Unit.a;
            } catch (Throwable unused5) {
                zi50.a aVar7 = zi50.b;
            }
            try {
                byteArrayInputStream.close();
                Unit unit6 = Unit.a;
            } catch (Throwable unused6) {
                zi50.a aVar8 = zi50.b;
            }
            return string;
        } catch (Exception unused7) {
            return null;
        }
    }
}
