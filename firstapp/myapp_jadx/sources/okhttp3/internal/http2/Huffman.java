package okhttp3.internal.http2;

import androidx.recyclerview.widget.r;
import defpackage.bc5;
import defpackage.cc5;
import defpackage.rl5;
import java.util.Arrays;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "<init>", "()V", "Lrl5;", "source", "Lbc5;", "sink", "", "encode", "(Lrl5;Lbc5;)V", "bytes", "", "encodedLength", "(Lrl5;)I", "Lcc5;", "", "byteCount", "decode", "(Lcc5;JLbc5;)V", "Node", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Huffman {
    public static final Huffman INSTANCE = new Huffman();
    public static final int[] a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, HttpStatusCodesKt.HTTP_PROCESSING, HttpStatusCodesKt.HTTP_EARLY_HINTS, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    public static final byte[] b = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    public static final Node c = new Node();

    static {
        for (int i = 0; i < 256; i++) {
            Huffman huffman = INSTANCE;
            int i2 = a[i];
            int i3 = b[i];
            huffman.getClass();
            Node node = new Node(i, i3);
            Node node2 = c;
            while (i3 > 8) {
                i3 -= 8;
                int i4 = (i2 >>> i3) & 255;
                Node[] children = node2.getChildren();
                children.getClass();
                Node node3 = children[i4];
                if (node3 == null) {
                    node3 = new Node();
                    children[i4] = node3;
                }
                node2 = node3;
            }
            int i5 = 8 - i3;
            int i6 = (i2 << i5) & 255;
            Node[] children2 = node2.getChildren();
            children2.getClass();
            Arrays.fill(children2, i6, (1 << i5) + i6, node);
        }
    }

    private Huffman() {
    }

    public final void decode(cc5 source, long byteCount, bc5 sink) {
        source.getClass();
        sink.getClass();
        Node node = c;
        int iAnd = 0;
        Node node2 = node;
        int terminalBitCount = 0;
        for (long j = 0; j < byteCount; j++) {
            iAnd = (iAnd << 8) | _UtilCommonKt.and(source.readByte(), 255);
            terminalBitCount += 8;
            while (terminalBitCount >= 8) {
                Node[] children = node2.getChildren();
                children.getClass();
                node2 = children[(iAnd >>> (terminalBitCount - 8)) & 255];
                node2.getClass();
                if (node2.getChildren() == null) {
                    sink.writeByte(node2.getSymbol());
                    terminalBitCount -= node2.getTerminalBitCount();
                    node2 = node;
                } else {
                    terminalBitCount -= 8;
                }
            }
        }
        while (terminalBitCount > 0) {
            Node[] children2 = node2.getChildren();
            children2.getClass();
            Node node3 = children2[(iAnd << (8 - terminalBitCount)) & 255];
            node3.getClass();
            if (node3.getChildren() != null || node3.getTerminalBitCount() > terminalBitCount) {
                return;
            }
            sink.writeByte(node3.getSymbol());
            terminalBitCount -= node3.getTerminalBitCount();
            node2 = node;
        }
    }

    public final void encode(rl5 source, bc5 sink) {
        source.getClass();
        sink.getClass();
        int iD = source.d();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            int iAnd = _UtilCommonKt.and(source.j(i2), 255);
            int i3 = a[iAnd];
            byte b2 = b[iAnd];
            j = (j << b2) | ((long) i3);
            i += b2;
            while (i >= 8) {
                i -= 8;
                sink.writeByte((int) (j >> i));
            }
        }
        if (i > 0) {
            sink.writeByte((int) ((j << (8 - i)) | (255 >>> i)));
        }
    }

    public final int encodedLength(rl5 bytes) {
        bytes.getClass();
        int iD = bytes.d();
        long j = 0;
        for (int i = 0; i < iD; i++) {
            j += (long) b[_UtilCommonKt.and(bytes.j(i), 255)];
        }
        return (int) ((j + 7) >> 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "<init>", "()V", "", "symbol", "bits", "(II)V", "", "a", "[Lokhttp3/internal/http2/Huffman$Node;", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "children", "b", "I", "getSymbol", "()I", "c", "getTerminalBitCount", "terminalBitCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Node {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Node[] children;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int symbol;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int terminalBitCount;

        public Node(int i, int i2) {
            this.children = null;
            this.symbol = i;
            int i3 = i2 & 7;
            this.terminalBitCount = i3 == 0 ? 8 : i3;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }
    }
}
