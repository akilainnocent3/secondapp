package defpackage;

import com.google.protobuf.Reader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class nlt extends c87 {
    public final HashMap b;
    public final BitSet c;
    public final int d;
    public final int e;

    public nlt(Map<CharSequence, CharSequence> map) {
        Objects.requireNonNull(map, "lookupMap");
        this.b = new HashMap();
        this.c = new BitSet();
        int i = Reader.READ_DONE;
        int i2 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.b.put(entry.getKey().toString(), entry.getValue().toString());
            this.c.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) throws IOException {
        if (this.c.get(str.charAt(i))) {
            int length = this.e;
            if (i + length > str.length()) {
                length = str.length() - i;
            }
            while (length >= this.d) {
                CharSequence charSequenceSubSequence = str.subSequence(i, i + length);
                String str2 = (String) this.b.get(charSequenceSubSequence.toString());
                if (str2 != null) {
                    stringWriter.write(str2);
                    return Character.codePointCount(charSequenceSubSequence, 0, charSequenceSubSequence.length());
                }
                length--;
            }
        }
        return 0;
    }
}
