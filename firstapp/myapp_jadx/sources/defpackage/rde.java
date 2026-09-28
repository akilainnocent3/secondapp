package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rde {
    public static final a a;
    public static final rde b;
    public static final rde c;
    public static final rde d;
    public static final rde e;
    public static final rde f;
    public static final rde i;
    public static final /* synthetic */ rde[] v;
    public static final /* synthetic */ uag w;

    public static final class a {
    }

    static {
        rde rdeVar = new rde("ALLOWED", 0);
        b = rdeVar;
        rde rdeVar2 = new rde("BLOCKED_PERMANENTLY", 1);
        c = rdeVar2;
        rde rdeVar3 = new rde("BLOCKED_TEMPORARILY", 2);
        d = rdeVar3;
        rde rdeVar4 = new rde("ERROR_VERIFYING", 3);
        e = rdeVar4;
        rde rdeVar5 = new rde("API_DISABLED", 4);
        f = rdeVar5;
        rde rdeVar6 = new rde("NOT_VERIFIED", 5);
        i = rdeVar6;
        rde[] rdeVarArr = {rdeVar, rdeVar2, rdeVar3, rdeVar4, rdeVar5, rdeVar6};
        v = rdeVarArr;
        w = new uag(rdeVarArr);
        a = new a();
    }

    public rde() {
        throw null;
    }

    public static rde valueOf(String str) {
        return (rde) Enum.valueOf(rde.class, str);
    }

    public static rde[] values() {
        return (rde[]) v.clone();
    }
}
