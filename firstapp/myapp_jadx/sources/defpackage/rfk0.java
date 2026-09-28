package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class rfk0 implements kd00.a {
    public final /* synthetic */ vkk0 a;
    public final /* synthetic */ tfk0 b;

    public rfk0(tfk0 tfk0Var, vkk0 vkk0Var) {
        this.b = tfk0Var;
        this.a = vkk0Var;
    }

    @Override // kd00.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
