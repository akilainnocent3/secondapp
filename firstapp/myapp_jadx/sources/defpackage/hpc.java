package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class hpc extends DataInputStream {
    public final int d(boolean z) throws IOException {
        byte b = readByte();
        int i = b & 127;
        if ((b & 128) != 0) {
            byte b2 = readByte();
            i |= (b2 & 127) << 7;
            if ((b2 & 128) != 0) {
                byte b3 = readByte();
                i |= (b3 & 127) << 14;
                if ((b3 & 128) != 0) {
                    byte b4 = readByte();
                    i |= (b4 & 127) << 21;
                    if ((b4 & 128) != 0) {
                        i |= (readByte() & 127) << 28;
                    }
                }
            }
        }
        return z ? i : (i >>> 1) ^ (-(i & 1));
    }
}
