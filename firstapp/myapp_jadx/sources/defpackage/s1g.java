package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s1g implements ih4 {
    public static final s1g a;
    public static final /* synthetic */ s1g[] b;

    static {
        s1g s1gVar = new s1g("INSTANCE", 0);
        a = s1gVar;
        b = new s1g[]{s1gVar};
    }

    public s1g() {
        throw null;
    }

    public static s1g valueOf(String str) {
        return (s1g) Enum.valueOf(s1g.class, str);
    }

    public static s1g[] values() {
        return (s1g[]) b.clone();
    }

    @Override // defpackage.ih4
    public final String a() {
        return "";
    }

    @Override // defpackage.ih4
    public final ih4.a getType() {
        return ih4.a.a;
    }
}
