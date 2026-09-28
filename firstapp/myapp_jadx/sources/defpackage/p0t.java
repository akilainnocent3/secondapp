package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.LobbyEntranceEligibilityChecks", f = "LobbyEntranceEligibilityChecks.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "isAvailableUserTypeCompatible", v = 2)
public final class p0t extends x1b {
    public q0t a;
    public String b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ q0t e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0t(q0t q0tVar, x1b x1bVar) {
        super(x1bVar);
        this.e = q0tVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
