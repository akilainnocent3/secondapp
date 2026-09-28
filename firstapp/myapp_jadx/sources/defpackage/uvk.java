package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uvk {
    public static final uvk a;
    public static final uvk b;
    public static final /* synthetic */ uvk[] c;

    static {
        uvk uvkVar = new uvk("Valid", 0);
        a = uvkVar;
        uvk uvkVar2 = new uvk("UsedExpired", 1);
        b = uvkVar2;
        c = new uvk[]{uvkVar, uvkVar2};
    }

    public uvk() {
        throw null;
    }

    public static uvk valueOf(String str) {
        return (uvk) Enum.valueOf(uvk.class, str);
    }

    public static uvk[] values() {
        return (uvk[]) c.clone();
    }
}
