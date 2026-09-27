package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k4 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f10076a;

        public a(final u val$input) {
            this.f10076a = val$input;
        }

        @Override // androidx.datastore.preferences.protobuf.k4.c
        public byte byteAt(int offset) {
            return this.f10076a.i(offset);
        }

        @Override // androidx.datastore.preferences.protobuf.k4.c
        public int size() {
            return this.f10076a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f10077a;

        public b(final byte[] val$input) {
            this.f10077a = val$input;
        }

        @Override // androidx.datastore.preferences.protobuf.k4.c
        public byte byteAt(int offset) {
            return this.f10077a[offset];
        }

        @Override // androidx.datastore.preferences.protobuf.k4.c
        public int size() {
            return this.f10077a.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        byte byteAt(int offset);

        int size();
    }

    public static String a(final u input) {
        return b(new a(input));
    }

    public static String b(c input) {
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

    public static String c(final byte[] input) {
        return b(new b(input));
    }

    public static String d(String input) {
        return input.replace(ce.a.f23003h, "\\\\").replace("\"", "\\\"");
    }

    public static String e(String input) {
        return a(u.u(input));
    }
}
