package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a2v {
    public static final a2v a;
    public static final a2v b;
    public static final a2v c;
    public static final a2v d;
    public static final /* synthetic */ a2v[] e;

    static {
        a2v a2vVar = new a2v("NONE", 0);
        a = a2vVar;
        a2v a2vVar2 = new a2v(AnalyticsEvent.LOGIN, 1);
        b = a2vVar2;
        a2v a2vVar3 = new a2v("NEXT_ROUND", 2);
        c = a2vVar3;
        a2v a2vVar4 = new a2v("RESET_PAGE", 3);
        d = a2vVar4;
        e = new a2v[]{a2vVar, a2vVar2, a2vVar3, a2vVar4};
    }

    public a2v() {
        throw null;
    }

    public static a2v valueOf(String str) {
        return (a2v) Enum.valueOf(a2v.class, str);
    }

    public static a2v[] values() {
        return (a2v[]) e.clone();
    }
}
