package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final /* synthetic */ int a = 0;

    public static final int a(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        d.a(c, "Unexpected hex digit: ");
        return 0;
    }
}
