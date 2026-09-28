package defpackage;

import com.twilio.voice.VoiceURLConnection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n88 {
    public static final n88 a;
    public static final n88 b;
    public static final n88 c;
    public static final /* synthetic */ n88[] d;

    static {
        n88 n88Var = new n88("REPLY", 0);
        a = n88Var;
        n88 n88Var2 = new n88("COPY", 1);
        b = n88Var2;
        n88 n88Var3 = new n88(VoiceURLConnection.METHOD_TYPE_DELETE, 2);
        c = n88Var3;
        d = new n88[]{n88Var, n88Var2, n88Var3};
    }

    public n88() {
        throw null;
    }

    public static n88 valueOf(String str) {
        return (n88) Enum.valueOf(n88.class, str);
    }

    public static n88[] values() {
        return (n88[]) d.clone();
    }
}
