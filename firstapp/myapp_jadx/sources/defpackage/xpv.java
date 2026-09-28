package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xpv extends upv {
    public static final xpv c = new xpv(12, 13);

    @Override // defpackage.upv
    public final void a(vfe0 vfe0Var) {
        vfe0Var.getClass();
        vfe0Var.z("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        vfe0Var.z("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
