package pj;

import dj.h;
import dj.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@a
@yi.b
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f120891a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f120892b = 31;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f120893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f120894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f120895e;

    static {
        i.b bVarA = i.a();
        bVarA.d((char) 0, (char) 65533);
        bVarA.e("�");
        for (char c10 = 0; c10 <= 31; c10 = (char) (c10 + 1)) {
            if (c10 != '\t' && c10 != '\n' && c10 != '\r') {
                bVarA.b(c10, "�");
            }
        }
        bVarA.b('&', "&amp;");
        bVarA.b('<', "&lt;");
        bVarA.b('>', "&gt;");
        f120894d = bVarA.c();
        bVarA.b('\'', "&apos;");
        bVarA.b('\"', "&quot;");
        f120893c = bVarA.c();
        bVarA.b('\t', "&#x9;");
        bVarA.b('\n', "&#xA;");
        bVarA.b('\r', "&#xD;");
        f120895e = bVarA.c();
    }

    public static h a() {
        return f120895e;
    }

    public static h b() {
        return f120894d;
    }
}
