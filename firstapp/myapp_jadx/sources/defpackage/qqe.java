package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class qqe {
    public static final qqe a;
    public static final qqe b;
    public static final qqe c;
    public static final qqe d;
    public static final List<qqe> e;
    public static final List<qqe> f;
    public static final List<qqe> i;
    public static final /* synthetic */ qqe[] v;

    static {
        qqe qqeVar = new qqe("Left", 0);
        a = qqeVar;
        qqe qqeVar2 = new qqe("Right", 1);
        b = qqeVar2;
        qqe qqeVar3 = new qqe("Top", 2);
        c = qqeVar3;
        qqe qqeVar4 = new qqe("Bottom", 3);
        d = qqeVar4;
        v = new qqe[]{qqeVar, qqeVar2, qqeVar3, qqeVar4};
        e = Arrays.asList(qqeVar, qqeVar2);
        f = Arrays.asList(qqeVar3, qqeVar4);
        i = Arrays.asList(values());
    }

    public qqe() {
        throw null;
    }

    public static qqe valueOf(String str) {
        return (qqe) Enum.valueOf(qqe.class, str);
    }

    public static qqe[] values() {
        return (qqe[]) v.clone();
    }
}
