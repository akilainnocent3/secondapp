package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements c {
        final /* synthetic */ ByteString val$input;

        public a(final ByteString val$input) {
            this.val$input = val$input;
        }

        @Override // com.google.protobuf.f1.c
        public byte byteAt(int offset) {
            return this.val$input.byteAt(offset);
        }

        @Override // com.google.protobuf.f1.c
        public int size() {
            return this.val$input.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements c {
        final /* synthetic */ byte[] val$input;

        public b(final byte[] val$input) {
            this.val$input = val$input;
        }

        @Override // com.google.protobuf.f1.c
        public byte byteAt(int offset) {
            return this.val$input[offset];
        }

        @Override // com.google.protobuf.f1.c
        public int size() {
            return this.val$input.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        byte byteAt(int offset);

        int size();
    }

    private f1() {
    }

    public static String escapeBytes(c input) {
        StringBuilder sb2 = new StringBuilder(input.size());
        for (int i10 = 0; i10 < input.size(); i10++) {
            byte bByteAt = input.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String input) {
        return input.replace(ce.a.f23003h, "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String input) {
        return escapeBytes(ByteString.copyFromUtf8(input));
    }

    public static String escapeBytes(final ByteString input) {
        return escapeBytes(new a(input));
    }

    public static String escapeBytes(final byte[] input) {
        return escapeBytes(new b(input));
    }
}
