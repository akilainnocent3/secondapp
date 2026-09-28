package defpackage;

import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llu40;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lu40 extends j8i0 {
    public final nm5 a;
    public final RegisterRevampConfig b;

    public lu40(vu60 vu60Var, nm5 nm5Var, rdd0 rdd0Var) {
        vu60Var.getClass();
        nm5Var.getClass();
        rdd0Var.getClass();
        this.a = nm5Var;
        RegisterRevampConfig registerRevampConfig = (RegisterRevampConfig) vu60Var.b("key_register_revamp_config");
        this.b = registerRevampConfig == null ? RegisterRevampConfig.Default.a : registerRevampConfig;
        rdd0Var.a(new ts40.e0(0), k00.c);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        this.a.a = null;
        super.onCleared();
    }
}
