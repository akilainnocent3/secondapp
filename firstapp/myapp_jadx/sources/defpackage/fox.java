package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class fox {
    public static final fox a;
    public static final fox b;
    public static final fox c;
    public static final fox d;
    public static final fox e;
    public static final fox f;
    public static final /* synthetic */ fox[] i;

    static {
        fox foxVar = new fox("ROOMS", 0);
        a = foxVar;
        fox foxVar2 = new fox("JOIN_ROOM", 1);
        b = foxVar2;
        fox foxVar3 = new fox("WALLET_INFO", 2);
        c = foxVar3;
        fox foxVar4 = new fox("STATUS", 3);
        d = foxVar4;
        fox foxVar5 = new fox("AVAILABLE", 4);
        e = foxVar5;
        fox foxVar6 = new fox("VALIDATE", 5);
        f = foxVar6;
        i = new fox[]{foxVar, foxVar2, foxVar3, foxVar4, foxVar5, foxVar6, new fox("CHAT_ROOM", 6)};
    }

    public fox() {
        throw null;
    }

    public static fox valueOf(String str) {
        return (fox) Enum.valueOf(fox.class, str);
    }

    public static fox[] values() {
        return (fox[]) i.clone();
    }
}
