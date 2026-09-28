package defpackage;

import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class yxk0 extends h0l0 {
    public final /* synthetic */ zzdf e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ p1l0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxk0(p1l0 p1l0Var, zzdf zzdfVar, String str, String str2) {
        super(p1l0Var, true);
        this.e = zzdfVar;
        this.f = str;
        this.i = str2;
        Objects.requireNonNull(p1l0Var);
        this.v = p1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.v.f;
        hm20.h(vvk0Var);
        vvk0Var.setCurrentScreenByScionActivityInfo(this.e, this.f, this.i, this.a);
    }
}
