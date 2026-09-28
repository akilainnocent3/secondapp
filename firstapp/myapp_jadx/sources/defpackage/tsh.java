package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {110}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
public final class tsh extends x1b {
    public Map a;
    public Iterator b;
    public ch80.a c;
    public tuw d;
    public Map e;
    public Object f;
    public /* synthetic */ Object i;
    public final /* synthetic */ ssh v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsh(ssh sshVar, x1b x1bVar) {
        super(x1bVar);
        this.v = sshVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
