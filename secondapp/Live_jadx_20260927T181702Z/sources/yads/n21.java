package yads;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n21 extends dz2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f152848c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f152849a = bu.f147344c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f152850b = bu.f147343b.newDecoder();

    @Override // yads.dz2
    public final ts1 a(ws1 ws1Var, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f152849a.decode(byteBuffer).toString();
            this.f152849a.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            this.f152849a.reset();
            byteBuffer.rewind();
            try {
                string = this.f152850b.decode(byteBuffer).toString();
                this.f152850b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f152850b.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                this.f152850b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f152849a.reset();
            byteBuffer.rewind();
            throw th3;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new ts1(new r21(bArr, null, null));
        }
        Matcher matcher = f152848c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strA = ki.a(strGroup);
                strA.getClass();
                if (strA.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strA.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new ts1(new r21(bArr, str, str2));
    }
}
