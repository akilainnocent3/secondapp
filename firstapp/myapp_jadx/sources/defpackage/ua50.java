package defpackage;

import okhttp3.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ua50 implements llf0<Request.Builder> {
    public static final ua50 a;
    public static final /* synthetic */ ua50[] b;

    static {
        ua50 ua50Var = new ua50("INSTANCE", 0);
        a = ua50Var;
        b = new ua50[]{ua50Var};
    }

    public ua50() {
        throw null;
    }

    public static ua50 valueOf(String str) {
        return (ua50) Enum.valueOf(ua50.class, str);
    }

    public static ua50[] values() {
        return (ua50[]) b.clone();
    }

    @Override // defpackage.llf0
    public final void a(Request.Builder builder, String str, String str2) {
        Request.Builder builder2 = builder;
        if (builder2 == null) {
            return;
        }
        builder2.header(str, str2);
    }
}
