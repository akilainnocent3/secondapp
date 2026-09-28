package defpackage;

import java.util.regex.Pattern;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class qfp {

    /* JADX INFO: Fake field, exist only in values array */
    qfp EF5;
    public static final /* synthetic */ qfp[] d = {new qfp("json", 0), new qfp("javascript", 1), new qfp("minimal", 2)};
    public static final Pattern a = Pattern.compile("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
    public static final Pattern b = Pattern.compile("^[^\":,}/ ][^:]*$");
    public static final Pattern c = Pattern.compile("^[^\":,{\\[\\]/ ][^}\\],]*$");

    public qfp() {
        throw null;
    }

    public static qfp valueOf(String str) {
        return (qfp) Enum.valueOf(qfp.class, str);
    }

    public static qfp[] values() {
        return (qfp[]) d.clone();
    }
}
