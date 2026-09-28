package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class lws {
    public static final lws a;
    public static final lws b;
    public static final lws c;
    public static final /* synthetic */ lws[] d;

    static {
        lws lwsVar = new lws("APPEND", 0);
        a = lwsVar;
        lws lwsVar2 = new lws("REPLACE", 1);
        b = lwsVar2;
        lws lwsVar3 = new lws("REPLACE_WITHOUT_CONFIRM", 2);
        c = lwsVar3;
        d = new lws[]{lwsVar, lwsVar2, lwsVar3};
    }

    public lws() {
        throw null;
    }

    public static lws valueOf(String str) {
        return (lws) Enum.valueOf(lws.class, str);
    }

    public static lws[] values() {
        return (lws[]) d.clone();
    }
}
