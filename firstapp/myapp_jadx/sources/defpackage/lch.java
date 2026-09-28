package defpackage;

import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes5.dex */
public final class lch {
    public final ysm a;

    public lch(ysm ysmVar) {
        this.a = ysmVar;
    }

    public final boolean a(String str) {
        int i = vn20.a("features").getInt(inm.a("pref_key_feature_prefix_", str), 0);
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, MyLog.TAG_COMMON, "feature ", str, " - launchRate = ");
        sbA.append(i);
        aVar.a(sbA.toString(), new Object[0]);
        return i > 0 && (i >= 100 || Math.abs(this.a.a().a.hashCode()) % 100 < i);
    }
}
