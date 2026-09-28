package defpackage;

import androidx.emoji2.text.h;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class t9h0 {
    public static final ThreadLocal<bpv> d = new ThreadLocal<>();
    public final int a;
    public final h b;
    public volatile int c = 0;

    public t9h0(h hVar, int i) {
        this.b = hVar;
        this.a = i;
    }

    public final int a(int i) {
        bpv bpvVarB = b();
        int iA = bpvVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = bpvVarB.b;
        int i2 = iA + bpvVarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final bpv b() {
        ThreadLocal<bpv> threadLocal = d;
        bpv bpvVar = threadLocal.get();
        if (bpvVar == null) {
            bpvVar = new bpv();
            threadLocal.set(bpvVar);
        }
        cpv cpvVar = this.b.a;
        int iA = cpvVar.a(6);
        if (iA != 0) {
            int i = iA + cpvVar.a;
            int i2 = (this.a * 4) + cpvVar.b.getInt(i) + i + 4;
            int i3 = cpvVar.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = cpvVar.b;
            bpvVar.b = byteBuffer;
            if (byteBuffer != null) {
                bpvVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                bpvVar.c = i4;
                bpvVar.d = bpvVar.b.getShort(i4);
                return bpvVar;
            }
            bpvVar.a = 0;
            bpvVar.c = 0;
            bpvVar.d = 0;
        }
        return bpvVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        bpv bpvVarB = b();
        int iA = bpvVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? bpvVarB.b.getInt(iA + bpvVarB.a) : 0));
        sb.append(", codepoints:");
        bpv bpvVarB2 = b();
        int iA2 = bpvVarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + bpvVarB2.a;
            i = bpvVarB2.b.getInt(bpvVarB2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
