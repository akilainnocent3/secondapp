package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class jqh extends pd00 {
    public static final p80 c = p80.d();
    public final wu0 b;

    public jqh(wu0 wu0Var) {
        this.b = wu0Var;
    }

    @Override // defpackage.pd00
    public final boolean a() {
        p80 p80Var = c;
        wu0 wu0Var = this.b;
        if (wu0Var == null) {
            p80Var.f("ApplicationInfo is null");
        } else if (!wu0Var.m()) {
            p80Var.f("GoogleAppId is null");
        } else if (!wu0Var.k()) {
            p80Var.f("AppInstanceId is null");
        } else if (!wu0Var.l()) {
            p80Var.f("ApplicationProcessState is null");
        } else {
            if (!wu0Var.j()) {
                return true;
            }
            if (!wu0Var.h().i()) {
                p80Var.f("AndroidAppInfo.packageName is null");
            } else {
                if (wu0Var.h().j()) {
                    return true;
                }
                p80Var.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        p80Var.f("ApplicationInfo is invalid");
        return false;
    }
}
