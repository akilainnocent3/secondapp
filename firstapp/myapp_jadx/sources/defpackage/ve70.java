package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ve70 {
    public static final ve70 a;
    public static final /* synthetic */ ve70[] b;
    public static final /* synthetic */ uag c;

    static {
        ve70 ve70Var = new ve70("LEAGUE_STANDINGS", 0);
        a = ve70Var;
        ve70[] ve70VarArr = {ve70Var, new ve70("MATCH_RESULTS", 1)};
        b = ve70VarArr;
        c = new uag(ve70VarArr);
    }

    public ve70() {
        throw null;
    }

    public static ve70 valueOf(String str) {
        return (ve70) Enum.valueOf(ve70.class, str);
    }

    public static ve70[] values() {
        return (ve70[]) b.clone();
    }
}
