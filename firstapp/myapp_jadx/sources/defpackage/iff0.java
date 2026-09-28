package defpackage;

import java.util.regex.Pattern;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes.dex */
public final class iff0 {
    public static final Pattern d = Pattern.compile("\\s+");
    public static final tcn<String> e = tcn.j(2, StompClient.DEFAULT_ACK, "none");
    public static final tcn<String> f = tcn.j(3, "dot", "sesame", "circle");
    public static final tcn<String> g = tcn.j(2, "filled", "open");
    public static final tcn<String> h = tcn.j(3, "after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    public iff0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
